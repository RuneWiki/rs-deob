import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 extends class51 {

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "[Lbb;")
    private class9[] field850 = new class9[8];

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field852 = 16;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lbb;")
    private class9 field851 = new class9();

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    private int field853 = -1;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    private int field854 = 0;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    private int field855 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 8)
    public final synchronized void method245(int arg0) {
        do {
            if (this.field853 < 0) {
                this.method246(arg0);
                return;
            }
            if (this.field854 + arg0 < this.field853) {
                this.field854 += arg0;
                this.method246(arg0);
                return;
            }
            int var2 = this.field853 - this.field854;
            this.method246(var2);
            arg0 -= var2;
            this.field854 += var2;
            this.method247();
            class31 var3 = (class31) this.field851.method57((byte) 86);
            synchronized (var3) {
                int var5 = var3.method235(this);
                if (var5 < 0) {
                    var3.field794 = 0;
                    this.method251(var3);
                } else {
                    var3.field794 = var5;
                    this.method249(var3.field579, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 52)
    private final void method246(int arg0) {
        this.field855 -= arg0;
        if (this.field855 < 0) {
            this.field855 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class9 var3 = this.field850[var2];
            for (class51 var4 = (class51) var3.method57((byte) 86); var4 != null; var4 = (class51) var3.method66(-29860)) {
                var4.method245(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 75)
    private final void method247() {
        if (this.field854 <= 0) {
            return;
        }
        for (class31 var1 = (class31) this.field851.method57((byte) 86); var1 != null; var1 = (class31) this.field851.method66(-29860)) {
            var1.field794 -= this.field854;
        }
        this.field853 -= this.field854;
        this.field854 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)I", line = 94)
    public final synchronized int method248(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field853 < 0) {
                return this.method253(arg0, arg1, arg2);
            }
            if (this.field854 + arg2 < this.field853) {
                this.field854 += arg2;
                return this.method253(arg0, arg1, arg2);
            }
            int var4 = this.field853 - this.field854;
            var5 = this.method253(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field854 += var4;
            this.method247();
            class31 var6 = (class31) this.field851.method57((byte) 86);
            synchronized (var6) {
                int var8 = var6.method235(this);
                if (var8 < 0) {
                    var6.field794 = 0;
                    this.method251(var6);
                } else {
                    var6.field794 = var8;
                    this.method249(var6.field579, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ldc;Lf;)V", line = 136)
    private final void method249(class22 arg0, class31 arg1) {
        while (this.field851.field139 != arg0 && ((class31) arg0).field794 <= arg1.field794) {
            arg0 = arg0.field579;
        }
        this.field851.method65((byte) -122, arg1, arg0);
        this.field853 = ((class31) this.field851.field139.field579).field794;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 329)
    public class36() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field850[var1] = new class9();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lic;)V", line = 150)
    public final synchronized void method250(class51 arg0) {
        class9 var2 = this.field850[method252(arg0)];
        var2.method63(arg0, 1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lf;)V", line = 158)
    private final void method251(class31 arg0) {
        arg0.method187((byte) 39);
        arg0.method234();
        class22 var2 = this.field851.field139.field579;
        if (this.field851.field139 == var2) {
            this.field853 = -1;
        } else {
            this.field853 = ((class31) var2).field794;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Lic;)I", line = 171)
    private static final int method252(class51 arg0) {
        return arg0.method365() >> 5;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([III)I", line = 178)
    private final int method253(int[] arg0, int arg1, int arg2) {
        this.field855 -= arg2;
        if (this.field855 <= 0) {
            this.field855 += class35.field836 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class9 var5 = this.field850[var4];
                for (class51 var6 = (class51) var5.method57((byte) 86); var6 != null; var6 = (class51) var5.method66(-29860)) {
                    int var7 = method252(var6);
                    if (var4 != var7) {
                        this.field850[var7].method63(var6, 1);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class9 var19 = this.field850[var8];
            for (class51 var20 = (class51) var19.method57((byte) 86); var20 != null; var20 = (class51) var19.method66(-29860)) {
                var20.field1201 = false;
                if (var20.field1200 != null) {
                    var20.field1200.field1666 = 0;
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
                    class9 var15 = this.field850[var12];
                    for (class51 var16 = (class51) var15.method57((byte) 86); var16 != null; var16 = (class51) var15.method66(-29860)) {
                        if (!var16.field1201) {
                            class70 var17 = var16.field1200;
                            if (var17 == null || var17.field1666 <= var13) {
                                if (var9 < this.field852) {
                                    int var18 = var16.method248(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1666 += var18;
                                    }
                                } else {
                                    var16.method245(arg2);
                                }
                                var16.field1201 = true;
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
}
