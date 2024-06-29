import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class124 extends class13 {

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[Lab;")
    private class3[] field3034 = new class3[8];

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field3035 = 16;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lab;")
    private class3 field3036 = new class3();

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field3038 = -1;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lke;Lhb;)V", line = 3)
    private final void method1003(class65 arg0, class44 arg1) {
        while (this.field3036.field27 != arg0 && ((class44) arg0).field1009 <= arg1.field1009) {
            arg0 = arg0.field1449;
        }
        this.field3036.method37(0, arg1, arg0);
        this.field3038 = ((class44) this.field3036.field27.field1449).field1009;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lc;)V", line = 11)
    public final synchronized void method1004(class13 arg0) {
        class3 var2 = this.field3034[method1007(arg0)];
        var2.method29(arg0, true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([III)I", line = 18)
    public final synchronized int method154(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field3038 < 0) {
                return this.method1006(arg0, arg1, arg2);
            }
            if (this.field3039 + arg2 < this.field3038) {
                this.field3039 += arg2;
                return this.method1006(arg0, arg1, arg2);
            }
            int var4 = this.field3038 - this.field3039;
            var5 = this.method1006(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3039 += var4;
            this.method1008();
            class44 var6 = (class44) this.field3036.method31(1280);
            synchronized (var6) {
                int var8 = var6.method377(this);
                if (var8 < 0) {
                    var6.field1009 = 0;
                    this.method1010(var6);
                } else {
                    var6.field1009 = var8;
                    this.method1003(var6.field1449, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 59)
    private final void method1005(int arg0) {
        this.field3037 -= arg0;
        if (this.field3037 < 0) {
            this.field3037 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class3 var3 = this.field3034[var2];
            for (class13 var4 = (class13) var3.method31(1280); var4 != null; var4 = (class13) var3.method26((byte) 108)) {
                var4.method155(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([III)I", line = 83)
    private final int method1006(int[] arg0, int arg1, int arg2) {
        this.field3037 -= arg2;
        if (this.field3037 <= 0) {
            this.field3037 += class76.field1698 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class3 var5 = this.field3034[var4];
                for (class13 var6 = (class13) var5.method31(1280); var6 != null; var6 = (class13) var5.method26((byte) 108)) {
                    int var7 = method1007(var6);
                    if (var4 != var7) {
                        this.field3034[var7].method29(var6, true);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class3 var19 = this.field3034[var8];
            for (class13 var20 = (class13) var19.method31(1280); var20 != null; var20 = (class13) var19.method26((byte) 108)) {
                var20.field254 = false;
                if (var20.field255 != null) {
                    var20.field255.field1088 = 0;
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
                    class3 var15 = this.field3034[var12];
                    for (class13 var16 = (class13) var15.method31(1280); var16 != null; var16 = (class13) var15.method26((byte) 108)) {
                        if (!var16.field254) {
                            class54 var17 = var16.field255;
                            if (var17 == null || var17.field1088 <= var13) {
                                if (var9 < this.field3035) {
                                    int var18 = var16.method154(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1088 += var18;
                                    }
                                } else {
                                    var16.method155(arg2);
                                }
                                var16.field254 = true;
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

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lc;)I", line = 217)
    private static final int method1007(class13 arg0) {
        return arg0.method153() >> 5;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 331)
    public class124() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field3034[var1] = new class3();
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()V", line = 225)
    private final void method1008() {
        if (this.field3039 <= 0) {
            return;
        }
        for (class44 var1 = (class44) this.field3036.method31(1280); var1 != null; var1 = (class44) this.field3036.method26((byte) 108)) {
            var1.field1009 -= this.field3039;
        }
        this.field3038 -= this.field3039;
        this.field3039 = 0;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(Lc;)V", line = 246)
    public final synchronized void method1009(class13 arg0) {
        arg0.method551(98);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 255)
    public final synchronized void method155(int arg0) {
        do {
            if (this.field3038 < 0) {
                this.method1005(arg0);
                return;
            }
            if (this.field3039 + arg0 < this.field3038) {
                this.field3039 += arg0;
                this.method1005(arg0);
                return;
            }
            int var2 = this.field3038 - this.field3039;
            this.method1005(var2);
            arg0 -= var2;
            this.field3039 += var2;
            this.method1008();
            class44 var3 = (class44) this.field3036.method31(1280);
            synchronized (var3) {
                int var5 = var3.method377(this);
                if (var5 < 0) {
                    var3.field1009 = 0;
                    this.method1010(var3);
                } else {
                    var3.field1009 = var5;
                    this.method1003(var3.field1449, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lhb;)V", line = 308)
    private final void method1010(class44 arg0) {
        arg0.method551(-87);
        arg0.method378();
        class65 var2 = this.field3036.field27.field1449;
        if (this.field3036.field27 == var2) {
            this.field3038 = -1;
        } else {
            this.field3038 = ((class44) var2).field1009;
        }
    }
}
