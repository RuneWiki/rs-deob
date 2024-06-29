import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class220 extends class211 {

    @OriginalMember(owner = "client!uga", name = "D", descriptor = "I")
    private int field3398 = 585;

    @OriginalMember(owner = "client!uga", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field3402 = new String[] { method1923(method1922("\f<D\u0015{Q")), method1923(method1922("\u00154B\\_\u001d4PO")), method1923(method1922("\f<D\u0015yQ")), method1923(method1922("\u0017.IW")), method1923(method1922("\u0002u\u000b\u0015G")), method1923(method1922("\f<D\u0015xQ")), method1923(method1922("\f<D\u0015~Q")), method1923(method1922("\f<D\u0015\u007fQ")) };

    @OriginalMember(owner = "client!uga", name = "E", descriptor = "Lel;")
    public static class573 field3397 = new class573(96, 5);

    @OriginalMember(owner = "client!uga", name = "G", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!uga", name = "C", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!uga", name = "H", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!uga", name = "I", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)V", line = 7)
    public static final void method1919(byte arg0) {
        try {
            if (arg0 < 28) {
                method1920(-79, true);
            }
            ++field3401;
            int var1 = 0;
            for (int var2 = 0; ~class648.field9378 < ~var2; ++var2) {
                for (int var3 = 0; ~class659.field9506 < ~var3; ++var3) {
                    if (class653.method4790(class734.field10683, var3, true, 1, var1, var2)) {
                        ++var1;
                    }
                    if (var1 >= 512) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3402[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V", line = 42)
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZ)V", line = 46)
    public static final void method1920(int arg0, boolean arg1) {
        try {
            if (class629.field9198 != null) {
                class629.field9198.method2700((byte) 93);
                class629.field9198 = null;
            }
            ++field3399;
            class225.method1949(-62);
            class344.method2848(arg0 ^ -6177);
            class299.method2523();
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class429.field6298[var2].method2755((byte) -113);
            }
            class123.method1069(false, false);
            System.gc();
            class31.method208(2, arg0);
            class96.field1077 = -1;
            class719.field10416 = false;
            class297.method2506(255);
            class497.method3763(true, (byte) -101);
            class687.field9973 = 0;
            class281.field4219 = 0;
            class247.field3771 = 0;
            class494.field7101 = 0;
            class104.field1209 = 0;
            class490.field7035 = 0;
            for (int var3 = arg0; var3 < class708.field10260.length; ++var3) {
                class708.field10260[var3] = null;
            }
            class196.method1667(0);
            for (int var4 = 0; var4 < 2048; ++var4) {
                class197.field2685[var4] = null;
            }
            class6.field60 = 0;
            class207.field3184.method970(arg0 ^ -104);
            class750.field10912 = 0;
            class29.field357.method970(arg0 + -100);
            class324.method2745((byte) 78);
            class544.field8130 = 0;
            class276.field4168.method5129(0);
            class245.method2083(arg0);
            class541.method4080(false);
            class66.field684 = null;
            class778.field11310 = 0L;
            class638.field9268 = null;
            class785.field11442 = null;
            class89.field1009 = null;
            class751.field10922 = null;
            if (!arg1) {
                class86.method728(3, (byte) -96);
                try {
                    class600.method4461(class629.field9206, field3402[1], (byte) 121);
                } catch (Throwable var6) {
                }
            } else {
                class86.method728(12, (byte) -96);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3402[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BILib;)V", line = 128)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field3396;
            if (~arg1 == -1) {
                this.field3398 = arg2.method1445((byte) 101);
            }
            if (arg0 < 67) {
                method1921(true);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3402[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3402[4] : field3402[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Z)V", line = 154)
    public static void method1921(boolean arg0) {
        try {
            if (arg0) {
                field3397 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3402[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)[I", line = 165)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field3400;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                method1919((byte) 115);
            }
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1];
                for (int var5 = 0; class343.field5332 > var5; ++var5) {
                    int var6 = class88.field997[var5];
                    if (~this.field3398 > ~var6 && ~(4096 - this.field3398) < ~var6 && -this.field3398 + 2048 < var4 && ~var4 > ~(this.field3398 + 2048)) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field3398 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(2048 - this.field3398) && this.field3398 + 2048 > var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field3398;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field3398 + 2048);
                    } else if (~var4 <= ~this.field3398 && ~(4096 - this.field3398) <= ~var4) {
                        if (~var6 <= ~this.field3398 && ~var6 >= ~(-this.field3398 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var19 = -var4 + 2048;
                            int var20 = var19 < 0 ? -var19 : var19;
                            int var21 = var20 << 12;
                            int var22 = var21 / (-this.field3398 + 2048);
                            var3[var5] = -var22 + 4096;
                        }
                    } else {
                        int var15 = var6 + -2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 - this.field3398;
                        int var18 = var17 << 12;
                        var3[var5] = var18 / (-this.field3398 + 2048);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field3402[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1922(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1923(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
