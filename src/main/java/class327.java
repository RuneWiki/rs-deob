import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class327 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4920 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[Lea;")
    public static class235[] field4921;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILre;)V", line = 24)
    public static final void method2224(int arg0, int arg1, class263 arg2) {
        if (arg1 != 24) {
            method2227(true, -9);
        }
        if (class224.field3418 != null) {
            try {
                class224.field3418.method1266((byte) 32, 0L);
                class224.field3418.method1256(24, arg0, arg2.field3986, 0);
            } catch (Exception var4) {
            }
        }
        field4915++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 51)
    public static void method2225(byte arg0) {
        if (arg0 != -126) {
            field4920 = (String) null;
        }
        field4921 = null;
        field4920 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)I", line = 104)
    public static final int method2226(byte arg0, String arg1) {
        field4922++;
        int var2 = 0;
        if (arg0 != 111) {
            field4920 = (String) null;
        }
        while (class56.field708.length > var2) {
            if (class56.field708[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V", line = 130)
    public static final void method2227(boolean arg0, int arg1) {
        field4916++;
        if (!arg0) {
            method2228(90, (byte) -11);
        }
        class162.field2445 = new int[arg1];
        class74.field958 = new int[arg1];
        class56.field713 = new int[arg1];
        class210.field3167 = new int[arg1];
        class8.field55 = new int[arg1];
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I", line = 163)
    public static final int method2228(int arg0, byte arg1) {
        field4919++;
        if (arg1 >= -34) {
            field4918 = 104;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIILmd;IZJ)Z", line = 210)
    public static final boolean method2229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class233 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class318.field4797 == class294.field4502;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class311.field4734 || var16 >= class191.field2844) {
                    return false;
                }
                class221 var17 = class158.field2367[arg0][var15][var16];
                if (var17 != null && var17.field3374 >= 5) {
                    return false;
                }
            }
        }
        class311 var18 = new class311();
        var18.field4720 = arg11;
        var18.field4730 = arg0;
        var18.field4723 = arg5;
        var18.field4739 = arg6;
        var18.field4727 = arg7;
        var18.field4728 = arg8;
        var18.field4721 = arg9;
        var18.field4724 = arg1;
        var18.field4735 = arg2;
        var18.field4722 = arg1 + arg3 - 1;
        var18.field4726 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class158.field2367[var22][var19][var20] == null) {
                        class158.field2367[var22][var19][var20] = new class221(var22, var19, var20);
                    }
                }
                class221 var23 = class158.field2367[arg0][var19][var20];
                var23.field3354[var23.field3374] = var18;
                var23.field3361[var23.field3374] = var21;
                var23.field3363 |= var21;
                var23.field3374++;
                if (var13 && class56.field705[var19][var20] != 0) {
                    var14 = class56.field705[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class56.field705[var24][var25] == 0) {
                        class56.field705[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class247.field3686[class130.field2016++] = var18;
        }
        return true;
    }
}
