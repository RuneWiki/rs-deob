import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class136 extends class26 {

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field3252 = 32;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lbb;")
    private class10[] field3251 = new class10[8];

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lbb;")
    private class10 field3253 = new class10();

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field3255 = 0;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field3254 = 0;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    private int field3256 = -1;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 3)
    private final void method1054() {
        if (this.field3255 <= 0) {
            return;
        }
        for (class124 var1 = (class124) this.field3253.method83(64); var1 != null; var1 = (class124) this.field3253.method81(-75)) {
            var1.field2907 -= this.field3255;
        }
        this.field3256 -= this.field3255;
        this.field3255 = 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ldd;)V", line = 20)
    public final synchronized void method1055(class26 arg0) {
        arg0.method13(121);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 24)
    private final void method1056(int arg0) {
        this.field3254 -= arg0;
        if (this.field3254 < 0) {
            this.field3254 = 0;
        }
        for (int var2 = 0; var2 < 8; var2++) {
            class10 var3 = this.field3251[var2];
            for (class26 var4 = (class26) var3.method83(64); var4 != null; var4 = (class26) var3.method81(-108)) {
                var4.method198(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Laa;Lu;)V", line = 47)
    private final void method1057(class2 arg0, class124 arg1) {
        while (this.field3253.field212 != arg0 && ((class124) arg0).field2907 <= arg1.field2907) {
            arg0 = arg0.field27;
        }
        this.field3253.method94(arg0, 85, arg1);
        this.field3256 = ((class124) this.field3253.field212.field27).field2907;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lu;)V", line = 54)
    private final void method1058(class124 arg0) {
        arg0.method13(109);
        arg0.method973();
        class2 var2 = this.field3253.field212.field27;
        if (this.field3253.field212 == var2) {
            this.field3256 = -1;
        } else {
            this.field3256 = ((class124) var2).field2907;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ldd;)V", line = 72)
    public final synchronized void method1059(class26 arg0) {
        class10 var2 = this.field3251[method1060(arg0)];
        var2.method96(32, arg0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ldd;)I", line = 84)
    private static final int method1060(class26 arg0) {
        return arg0.method197() >> 5;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 93)
    public final synchronized void method198(int arg0) {
        do {
            if (this.field3256 < 0) {
                this.method1056(arg0);
                return;
            }
            if (this.field3255 + arg0 < this.field3256) {
                this.field3255 += arg0;
                this.method1056(arg0);
                return;
            }
            int var2 = this.field3256 - this.field3255;
            this.method1056(var2);
            arg0 -= var2;
            this.field3255 += var2;
            this.method1054();
            class124 var3 = (class124) this.field3253.method83(64);
            synchronized (var3) {
                int var5 = var3.method972(this);
                if (var5 < 0) {
                    var3.field2907 = 0;
                    this.method1058(var3);
                } else {
                    var3.field2907 = var5;
                    this.method1057(var3.field27, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 337)
    public class136() {
        for (int var1 = 0; var1 < 8; var1++) {
            this.field3251[var1] = new class10();
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([III)I", line = 142)
    private final int method1061(int[] arg0, int arg1, int arg2) {
        this.field3254 -= arg2;
        if (this.field3254 <= 0) {
            this.field3254 += class4.field55 >> 4;
            for (int var4 = 0; var4 < 8; var4++) {
                class10 var5 = this.field3251[var4];
                for (class26 var6 = (class26) var5.method83(64); var6 != null; var6 = (class26) var5.method81(-112)) {
                    int var7 = method1060(var6);
                    if (var4 != var7) {
                        this.field3251[var7].method96(32, var6);
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 8; var8++) {
            class10 var19 = this.field3251[var8];
            for (class26 var20 = (class26) var19.method83(64); var20 != null; var20 = (class26) var19.method81(-115)) {
                var20.field555 = false;
                if (var20.field554 != null) {
                    var20.field554.field1700 = 0;
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
                    class10 var15 = this.field3251[var12];
                    for (class26 var16 = (class26) var15.method83(64); var16 != null; var16 = (class26) var15.method81(-123)) {
                        if (!var16.field555) {
                            class72 var17 = var16.field554;
                            if (var17 == null || var17.field1700 <= var13) {
                                if (var9 < this.field3252) {
                                    int var18 = var16.method196(arg0, arg1, arg2);
                                    var9 += var18;
                                    if (var17 != null) {
                                        var17.field1700 += var18;
                                    }
                                } else {
                                    var16.method198(arg2);
                                }
                                var16.field555 = true;
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

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([III)I", line = 274)
    public final synchronized int method196(int[] arg0, int arg1, int arg2) {
        int var5;
        do {
            if (this.field3256 < 0) {
                return this.method1061(arg0, arg1, arg2);
            }
            if (this.field3255 + arg2 < this.field3256) {
                this.field3255 += arg2;
                return this.method1061(arg0, arg1, arg2);
            }
            int var4 = this.field3256 - this.field3255;
            var5 = this.method1061(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3255 += var4;
            this.method1054();
            class124 var6 = (class124) this.field3253.method83(64);
            synchronized (var6) {
                int var8 = var6.method972(this);
                if (var8 < 0) {
                    var6.field2907 = 0;
                    this.method1058(var6);
                } else {
                    var6.field2907 = var8;
                    this.method1057(var6.field27, var6);
                }
            }
        } while (arg2 != 0);
        return var5;
    }
}
