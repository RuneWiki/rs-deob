import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class232 {

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Z")
    public static boolean field3333 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method1652(boolean arg0, int arg1) {
        field3326++;
        class268.field3861.method2264((byte) 91, arg1);
        if (!arg0) {
            field3333 = true;
        }
        class357.field5586.method2264((byte) -128, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 25)
    public static final void method1653(int arg0) {
        field3320++;
        if (arg0 != 104) {
            method1655((byte) -31, 48);
        }
        class360.field5630.method1523(21229);
        class194.field2673 = 1;
        class229.field3287 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 57)
    public static final void method1654(int arg0, String arg1, boolean arg2) {
        field3318++;
        if (arg2) {
            if (class47.field623 && class55.field715) {
                try {
                    class200.method1470(new Object[] { (new URL(class16.field196.getCodeBase(), arg1)).toString() }, -1750, class157.field2216.field883, "openjs");
                    return;
                } catch (Throwable var10) {
                }
            }
            try {
                class16.field196.getAppletContext().showDocument(new URL(class16.field196.getCodeBase(), arg1), "_blank");
            } catch (Exception var9) {
            }
        } else {
            try {
                class200.method1469(class157.field2216.field883, -18278, "loggedout");
            } catch (Throwable var8) {
            }
            try {
                class16.field196.getAppletContext().showDocument(new URL(class16.field196.getCodeBase(), arg1), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg0 < 91) {
            method1653(-41);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Z", line = 104)
    public static final boolean method1655(byte arg0, int arg1) {
        if (arg0 < 57) {
            method1656(false);
        }
        class196 var2 = class357.method2478((byte) -24, arg1);
        field3330++;
        if (var2 == null) {
            return false;
        } else if (class69.field871 == 1 || class69.field871 == 2 || class145.field2021 == 2) {
            class167.field2336 = var2.field2709;
            class84.field1085 = var2.field2712;
            if (class145.field2021 != 0) {
                class331.field4941 = class84.field1085 + 50000;
                class170.field2360 = class84.field1085 + 40000;
                class238.field3441 = class170.field2360;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class194.field2690 != null) {
                var4 = "/p=" + class194.field2690;
            }
            if (class145.field2021 != 0) {
                var3 = ":" + (var2.field2712 + 7000);
            }
            String var5 = "http://" + var2.field2709 + var3 + "/l=" + class306.field4473 + "/a=" + class185.field2522 + var4 + "/j" + (class49.field658 ? "1" : "0") + ",o" + (class195.field2698 ? "1" : "0") + ",a2,m" + (class16.field203 ? "1" : "0");
            try {
                class277.field3969.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 159)
    public static final void method1656(boolean arg0) {
        field3336++;
        if (class161.method1228((byte) -82) != 2) {
            return;
        }
        byte var1 = (byte) (class42.field531 - 4 & 0xFF);
        if (arg0) {
            field3333 = false;
        }
        int var2 = class42.field531 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class306.field4480[var3][var2][var4] = var1;
            }
        }
        if (class56.field724 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class48.field646[var5] = -1000000;
            class221.field3181[var5] = 1000000;
            class7.field64[var5] = 0;
            class29.field331[var5] = 1000000;
            class291.field4235[var5] = 0;
        }
        if (client.field1631 != 1) {
            int var6 = class271.method1847(class248.field3606, true, class112.field1453, class56.field724);
            if (var6 - class343.field5332 < 800 && (class9.field101[class56.field724][class112.field1453 >> 7][class248.field3606 >> 7] & 0x4) != 0) {
                class132.method1008(1, class112.field1453 >> 7, false, false, class248.field3606 >> 7, class345.field5367);
            }
            return;
        }
        if ((class9.field101[class56.field724][class359.field5616.field4855 >> 7][class359.field5616.field4893 >> 7] & 0x4) != 0) {
            class132.method1008(0, class359.field5616.field4855 >> 7, arg0, false, class359.field5616.field4893 >> 7, class345.field5367);
        }
        if (class94.field1222 >= 310) {
            return;
        }
        int var7 = class248.field3606 >> 7;
        int var8 = class112.field1453 >> 7;
        int var9 = class359.field5616.field4893 >> 7;
        int var10;
        if (var7 >= var9) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11 = class359.field5616.field4855 >> 7;
        int var12;
        if (var11 > var8) {
            var12 = var11 - var8;
        } else {
            var12 = var8 - var11;
        }
        if (var12 == 0 && var10 == 0 || var12 <= -104 || var12 >= 104 || var10 <= -104 || var10 >= 104) {
            class347.method2409((Throwable) null, 3924, "RC: " + var8 + "," + var7 + " " + var11 + "," + var9 + " " + class331.field4867 + "," + class355.field5556);
            return;
        }
        if (var12 > var10) {
            int var15 = var10 * 65536 / var12;
            int var16 = 32768;
            while (var8 != var11) {
                if (var8 < var11) {
                    var8++;
                } else if (var11 < var8) {
                    var8--;
                }
                if ((class9.field101[class56.field724][var8][var7] & 0x4) != 0) {
                    class132.method1008(1, var8, arg0, false, var7, class345.field5367);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    var16 -= 65536;
                    if ((class9.field101[class56.field724][var8][var7] & 0x4) != 0) {
                        class132.method1008(1, var8, arg0, false, var7, class345.field5367);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = 32768;
        int var14 = var12 * 65536 / var10;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var9 < var7) {
                var7--;
            }
            if ((class9.field101[class56.field724][var8][var7] & 0x4) != 0) {
                class132.method1008(1, var8, false, false, var7, class345.field5367);
                break;
            }
            var13 += var14;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var11 > var8) {
                    var8++;
                } else if (var8 > var11) {
                    var8--;
                }
                if ((class9.field101[class56.field724][var8][var7] & 0x4) != 0) {
                    class132.method1008(1, var8, false, false, var7, class345.field5367);
                    break;
                }
            }
        }
    }
}
