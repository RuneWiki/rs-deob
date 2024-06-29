import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 extends class29 {

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field1199 = 16;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[Lh;")
    private class42[] field1201 = new class42[8];

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lh;")
    private class42 field1200 = new class42();

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    private int field1202 = -1;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    private int field1204 = 0;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    private int field1203 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lbc;)V")
    private final void method419(class10 arg0) {
        arg0.method319((byte) 31);
        arg0.method56();
        class40 var2 = this.field1200.field892.field873;
        if (this.field1200.field892 == var2) {
            this.field1202 = -1;
        } else {
            this.field1202 = ((class10) var2).field176;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Led;)V")
    public final synchronized void method420(class29 arg0) {
        class42 var2 = this.field1201[method425(arg0)];
        var2.method324(-71, arg0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    private final void method421() {
        if (this.field1204 <= 0) {
            return;
        }
        for (class10 var1 = (class10) this.field1200.method326(0); var1 != null; var1 = (class10) this.field1200.method325((byte) 123)) {
            var1.field176 -= this.field1204;
        }
        this.field1202 -= this.field1204;
        this.field1204 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public final synchronized void method242(int arg0) {
        do {
            if (this.field1202 < 0) {
                this.method422(arg0);
                return;
            }
            if (this.field1204 + arg0 < this.field1202) {
                this.field1204 += arg0;
                this.method422(arg0);
                return;
            }
            int var2 = this.field1202 - this.field1204;
            this.method422(var2);
            arg0 -= var2;
            this.field1204 += var2;
            this.method421();
            class10 var3 = (class10) this.field1200.method326(0);
            synchronized (var3) {
                int var5 = var3.method57(this);
                if (var5 < 0) {
                    var3.field176 = 0;
                    this.method419(var3);
                } else {
                    var3.field176 = var5;
                    this.method424(var3.field873, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    private final void method422(int arg0) {
        this.field1203 -= arg0;
        if (this.field1203 < 0) {
            this.field1203 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class42 var3 = this.field1201[var2];
            for (class29 var4 = (class29) var3.method326(0); var4 != null; var4 = (class29) var3.method325((byte) 124)) {
                var4.method242(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "([III)I")
    private final int method423(int[] arg0, int arg1, int arg2) {
        this.field1203 -= arg2;
        if (this.field1203 <= 0) {
            this.field1203 += class114.field2442 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class42 var5 = this.field1201[var4];
                for (class29 var6 = (class29) var5.method326(0); var6 != null; var6 = (class29) var5.method325((byte) 118)) {
                    int var7 = method425(var6);
                    if (var4 != var7) {
                        this.field1201[var7].method324(85, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class42 var19 = this.field1201[var8];
            for (class29 var20 = (class29) var19.method326(0); var20 != null; var20 = (class29) var19.method325((byte) 126)) {
                var20.field639 = false;
                if (var20.field638 != null) {
                    var20.field638.field1971 = 0;
                }
            }
        }
        int var9 = 0;
        int var10 = 255;
        int var11 = 7;
        while (var10 != 0) {
            int var12;
            int var13;
            if (var11 < 0) {
                var12 = var11 & 0x3;
                var13 = -(var11 >> 2);
            } else {
                var12 = var11;
                var13 = 0;
            }
            for (int var14 = var10 >>> var12 & 0x11111111; var14 != 0; var14 >>>= 0x4) {
                if ((var14 & 0x1) != 0) {
                    var10 &= ~(0x1 << var12);
                    class42 var15 = this.field1201[var12];
                    for (class29 var16 = (class29) var15.method326(0); var16 != null; var16 = (class29) var15.method325((byte) 118)) {
                        if (!var16.field639) {
                            class89 var17 = var16.field638;
                            if (var17 == null || var17.field1971 <= var13) {
                                if (var9 < this.field1199) {
                                    int var18 = var16.method241(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1971 += var18;
                                    }
                                } else {
                                    var16.method242(arg2);
                                }
                                var16.field639 = true;
                            } else {
                                var10 |= 0x1 << var12;
                            }
                        }
                    }
                }
                var12 += 4;
                var13++;
            }
            var11--;
        }
        return var9;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lgd;Lbc;)V")
    private final void method424(class40 arg0, class10 arg1) {
        while (this.field1200.field892 != arg0 && ((class10) arg0).field176 <= arg1.field176) {
            arg0 = arg0.field873;
        }
        this.field1200.method327(arg1, false, arg0);
        this.field1202 = ((class10) this.field1200.field892.field873).field176;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([III)I")
    public final synchronized int method241(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field1202 < 0) {
                return this.method423(arg0, arg1, arg2);
            }
            if (this.field1204 + arg2 < this.field1202) {
                this.field1204 += arg2;
                return this.method423(arg0, arg1, arg2);
            }
            int var4 = this.field1202 - this.field1204;
            var5 = this.method423(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1204 += var4;
            this.method421();
            class10 var6 = (class10) this.field1200.method326(0);
            synchronized (var6) {
                int var8 = var6.method57(this);
                if (var8 < 0) {
                    var6.field176 = 0;
                    this.method419(var6);
                } else {
                    var6.field176 = var8;
                    this.method424(var6.field873, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Led;)I")
    private static final int method425(class29 arg0) {
        return arg0.method240() >> 5;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class52() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field1201[var1] = new class42();
        }
    }
}
