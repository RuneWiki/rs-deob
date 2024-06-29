import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class434 extends class40 {

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    private int field6204;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field6200 = new String[100];

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "[C")
    public static char[] field6205;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field6203;

    static {
        new class349("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field6205 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILlf;)V", line = 3)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field6201;
        if (arg0 == 0) {
            this.field6204 = (arg2.method837(true) << 12) / 255;
        }
        if (arg1 <= 79) {
            this.field6204 = -73;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 30)
    public static final void method2708(int arg0) {
        ++field6197;
        if (arg0 <= 68) {
            field6205 = null;
        }
        while (~class352.field5114.method2050((byte) 123, class242.field3572) <= -12) {
            int var1 = class352.field5114.method2053((byte) 0, 11);
            if (~var1 == -2048) {
                break;
            }
            boolean var2 = false;
            if (class243.field3596[var1] == null) {
                class243.field3596[var1] = new class128();
                class243.field3596[var1].field4514 = var1;
                if (class401.field5631[var1] != null) {
                    class243.field3596[var1].method777(32, class401.field5631[var1]);
                }
                var2 = true;
            }
            class26.field323[class334.field4847++] = var1;
            class128 var3 = class243.field3596[var1];
            var3.field4542 = class34.field434;
            int var4 = class352.field5114.method2053((byte) 0, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class352.field5114.method2053((byte) 0, 1);
            int var6 = class352.field5114.method2053((byte) 0, 1);
            if (~var6 == -2) {
                class314.field4623[class349.field5084++] = var1;
            }
            int var7 = class253.field3745[class352.field5114.method2053((byte) 0, 3)];
            int var8 = class352.field5114.method2053((byte) 0, 5);
            if (var2) {
                var3.method2092(var7, 0);
            }
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method779(-3, class158.field2302, class181.field2555.field4601[0] + var8, ~var5 == -2, class181.field2555.field4595[0] - -var4);
        }
        class352.field5114.method2054(8);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)I", line = 98)
    public static final int method2709(int arg0, byte arg1) {
        ++field6196;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        if (arg1 != 105) {
            field6205 = null;
        }
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 117)
    public class434() {
        this(4096);
    }

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "(B)V", line = 120)
    public static void method2710(byte arg0) {
        field6200 = null;
        if (arg0 < -99) {
            field6205 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V", line = 134)
    public class434(int arg0) {
        super(0, true);
        this.field6204 = 4096;
        this.field6204 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)V", line = 143)
    public static final void method2711(int arg0, int arg1) {
        class15 var2 = class449.field6404;
        synchronized (class449.field6404) {
            class449.field6404.method102((byte) -114);
            class449.field6404 = new class15(arg1);
            if (arg0 != 103) {
                field6200 = null;
            }
        }
        ++field6203;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;", line = 157)
    public static final String method2712(int arg0, int arg1, String[] arg2, boolean arg3) {
        ++field6199;
        if (~arg0 == -1) {
            return "";
        } else if (~arg0 == -2) {
            String var4 = arg2[arg1];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            if (!arg3) {
                return null;
            } else {
                for (int var7 = arg1; ~var5 < ~var7; ++var7) {
                    String var11 = arg2[var7];
                    if (var11 != null) {
                        var6 += var11.length();
                    } else {
                        var6 += 4;
                    }
                }
                StringBuffer var8 = new StringBuffer(var6);
                for (int var9 = arg1; var9 < var5; ++var9) {
                    String var10 = arg2[var9];
                    if (var10 != null) {
                        var8.append(var10);
                    } else {
                        var8.append("null");
                    }
                }
                return var8.toString();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIB)I", line = 219)
    public static final int method2713(int arg0, int arg1, int arg2, byte arg3) {
        ++field6198;
        if ((class320.field4692[arg2][arg1][arg0] & 8) != 0) {
            return 0;
        } else if (~arg2 < -1 && (2 & class320.field4692[1][arg1][arg0]) != 0) {
            return arg2 + -1;
        } else {
            if (arg3 > -83) {
                field6205 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[I", line = 253)
    public final int[] method44(byte arg0, int arg1) {
        ++field6202;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            method2710((byte) -69);
        }
        if (super.field551.field441) {
            class271.method1855(var3, 0, class410.field5886, this.field6204);
        }
        return var3;
    }
}
