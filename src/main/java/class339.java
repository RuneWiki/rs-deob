import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class339 {

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5288 = new String[] { method2826(method2825("r-3kG")), method2826(method2825("x0qE")), method2826(method2825("mk3\u0007\u0012")), method2826(method2825("r-3mG")), method2826(method2825("r-3jG")), method2826(method2825("r-3hG")) };

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
    public static int[] field5282 = new int[1];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
    public static boolean field5281 = false;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[I")
    public static int[] field5287 = new int[200];

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[B")
    public byte[] field5284;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[S")
    public short[] field5277;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[S")
    public short[] field5278;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[S")
    public short[] field5279;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 8)
    public static final void method2821(int arg0, int arg1) {
        try {
            class429.field6309 = arg0;
            field5286++;
            class591.field8684 = arg1;
            String var2 = null;
            if (class752.field10946 != null) {
                class163 var3 = new class163(class752.field10946);
                var2 = class762.method5520(false, var3.method1435(124));
                class422.field6215 = var3.method1435(75);
            }
            if (var2 == null) {
                class20.method134(false, 35);
            } else {
                class28.method193(false, true, 1, "", var2);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5288[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z", line = 38)
    public static final boolean method2822(int arg0, int arg1, int arg2) {
        try {
            field5280++;
            if (arg2 != 2) {
                method2821(-50, -80);
            }
            return (arg1 & 0x10000) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5288[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ltu;Lha;BI)V", line = 51)
    public static final void method2823(class367 arg0, class66 arg1, byte arg2, int arg3) {
        try {
            field5285++;
            if (class564.field8371 != null && arg0.field5612 >= arg3) {
                for (int var4 = 0; var4 < class564.field8371.length; var4++) {
                    if (class564.field8371[var4] != -1000000 && (arg0.field5621[0] <= class564.field8371[var4] || class564.field8371[var4] >= arg0.field5621[1] || arg0.field5621[2] <= class564.field8371[var4] || class564.field8371[var4] >= arg0.field5621[3]) && (class81.field922[var4] >= arg0.field5614[0] || arg0.field5614[1] <= class81.field922[var4] || class81.field922[var4] >= arg0.field5614[2] || arg0.field5614[3] <= class81.field922[var4]) && (class48.field550[var4] <= arg0.field5614[0] || class48.field550[var4] <= arg0.field5614[1] || class48.field550[var4] <= arg0.field5614[2] || class48.field550[var4] <= arg0.field5614[3]) && (arg0.field5610[0] <= class233.field3509[var4] || class233.field3509[var4] >= arg0.field5610[1] || class233.field3509[var4] >= arg0.field5610[2] || class233.field3509[var4] >= arg0.field5610[3]) && (class196.field2632[var4] <= arg0.field5610[0] || arg0.field5610[1] >= class196.field2632[var4] || arg0.field5610[2] >= class196.field2632[var4] || arg0.field5610[3] >= class196.field2632[var4])) {
                        return;
                    }
                }
            }
            if (arg0.field5617 == 1) {
                int var5 = arg0.field5620 + class396.field5921 - class247.field3811;
                if (var5 >= 0 && var5 <= (class396.field5921 + class396.field5921)) {
                    int var6 = arg0.field5625 + class396.field5921 - class5.field52;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if ((class396.field5921 + class396.field5921) < var6) {
                        return;
                    }
                    int var7 = arg0.field5624 + class396.field5921 - class5.field52;
                    if (var7 > class396.field5921 + class396.field5921) {
                        var7 = class396.field5921 + class396.field5921;
                    } else if (var7 < 0) {
                        return;
                    }
                    boolean var8 = false;
                    while (var7 >= var6) {
                        if (class91.field1038[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (class595.field8733 - arg0.field5614[0]);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!(var9 < (float) class399.field5960) && class340.method2827(0, arg2 ^ 0x4965, arg0) && class340.method2827(1, 18747, arg0) && class340.method2827(2, 18747, arg0) && class340.method2827(3, 18747, arg0)) {
                            class247.field3848[class655.field9468++] = arg0;
                        }
                    }
                }
            } else {
                if (arg2 != 94) {
                    method2822(34, -2, 24);
                }
                if (arg0.field5617 == 2) {
                    int var10 = arg0.field5625 + class396.field5921 - class5.field52;
                    if (var10 >= 0 && class396.field5921 + class396.field5921 >= var10) {
                        int var11 = class396.field5921 + arg0.field5620 - class247.field3811;
                        if (var11 < 0) {
                            var11 = 0;
                        } else if ((class396.field5921 + class396.field5921) < var11) {
                            return;
                        }
                        int var12 = class396.field5921 + arg0.field5611 - class247.field3811;
                        if (var12 > (class396.field5921 + class396.field5921)) {
                            var12 = class396.field5921 + class396.field5921;
                        } else if (var12 < 0) {
                            return;
                        }
                        boolean var13 = false;
                        while (var11 <= var12) {
                            if (class91.field1038[var11++][var10]) {
                                var13 = true;
                                break;
                            }
                        }
                        if (var13) {
                            float var14 = (float) (class317.field5029 - arg0.field5610[0]);
                            if (var14 < 0.0F) {
                                var14 *= -1.0F;
                            }
                            if (!((float) class399.field5960 > var14) && class340.method2827(0, 18747, arg0) && class340.method2827(1, 18747, arg0) && class340.method2827(2, 18747, arg0) && class340.method2827(3, arg2 + 18653, arg0)) {
                                class247.field3848[class655.field9468++] = arg0;
                            }
                        }
                    }
                } else if (arg0.field5617 == 16 || arg0.field5617 == 8) {
                    int var15 = arg0.field5620 + class396.field5921 - class247.field3811;
                    if (var15 >= 0 && var15 <= (class396.field5921 + class396.field5921)) {
                        int var16 = arg0.field5625 + class396.field5921 - class5.field52;
                        if (var16 >= 0 && var16 <= class396.field5921 + class396.field5921 && class91.field1038[var15][var16]) {
                            float var17 = (float) (class595.field8733 - arg0.field5614[0]);
                            if (var17 < 0.0F) {
                                var17 *= -1.0F;
                            }
                            float var18 = (float) (class317.field5029 - arg0.field5610[0]);
                            if (var18 < 0.0F) {
                                var18 *= -1.0F;
                            }
                            if (!(var17 < (float) class399.field5960) || !(var18 < (float) class399.field5960) && class340.method2827(0, 18747, arg0) && class340.method2827(1, 18747, arg0) && class340.method2827(2, 18747, arg0) && class340.method2827(3, 18747, arg0)) {
                                class247.field3848[class655.field9468++] = arg0;
                            }
                        }
                    }
                } else if (arg0.field5617 == 4) {
                    float var19 = (float) (arg0.field5621[0] - class192.field2594);
                    if (!(var19 <= (float) class317.field5024)) {
                        int var20 = class396.field5921 + arg0.field5625 - class5.field52;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (class396.field5921 + class396.field5921 < var20) {
                            return;
                        }
                        int var21 = arg0.field5624 + class396.field5921 - class5.field52;
                        if (var21 > class396.field5921 + class396.field5921) {
                            var21 = class396.field5921 + class396.field5921;
                        } else if (var21 < 0) {
                            return;
                        }
                        int var22 = arg0.field5620 + class396.field5921 - class247.field3811;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 > (class396.field5921 + class396.field5921)) {
                            return;
                        }
                        int var23 = arg0.field5611 + class396.field5921 - class247.field3811;
                        if (class396.field5921 + class396.field5921 < var23) {
                            var23 = class396.field5921 + class396.field5921;
                        } else if (var23 < 0) {
                            return;
                        }
                        boolean var24 = false;
                        label344: for (int var25 = var22; var25 <= var23; var25++) {
                            for (int var26 = var20; var26 <= var21; var26++) {
                                if (class91.field1038[var25][var26]) {
                                    var24 = true;
                                    break label344;
                                }
                            }
                        }
                        if (var24 && class340.method2827(0, arg2 + 18653, arg0) && class340.method2827(1, 18747, arg0) && class340.method2827(2, arg2 ^ 0x4965, arg0) && class340.method2827(3, 18747, arg0)) {
                            class247.field3848[class655.field9468++] = arg0;
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field5288[3] + (arg0 == null ? field5288[1] : field5288[2]) + ',' + (arg1 == null ? field5288[1] : field5288[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 380)
    public static void method2824(int arg0) {
        try {
            field5287 = null;
            if (arg0 == 3) {
                field5282 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5288[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2825(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2826(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
