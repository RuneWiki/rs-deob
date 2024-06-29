import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class52 {

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "F")
    public float field781 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "F")
    public float field782 = 0.25F;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "F")
    public float field786 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "F")
    public float field794;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "F")
    public float field790;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
    public float field791;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lqh;")
    public class35 field783;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lsi;")
    public static class264 field788 = null;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
    public static boolean field795 = false;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "Lio;")
    public static class202 field797 = new class202();

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Ljava/lang/String;")
    public static String field798 = "wave:";

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Z")
    public static boolean field799 = true;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 468)
    public class52() {
        this.field779 = class234.field3724;
        this.field785 = 0;
        this.field794 = 0.69921875F;
        this.field793 = class234.field3730;
        this.field790 = 1.1523438F;
        this.field774 = -50;
        this.field791 = 1.2F;
        this.field777 = -50;
        this.field787 = -60;
        if (class322.field5297 != null) {
            this.field783 = class35.method291(class322.field5297[0], class322.field5297[1], class322.field5297[2], class322.field5297[3], class322.field5297[4], class322.field5297[5]);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lfh;)V", line = 529)
    public class52(class313 arg0) {
        int var2 = arg0.method2224(-123);
        if ((var2 & 0x1) == 0) {
            this.field793 = class234.field3730;
        } else {
            this.field793 = arg0.method2231((byte) -128);
        }
        if ((var2 & 0x2) == 0) {
            this.field790 = 1.1523438F;
        } else {
            this.field790 = (float) arg0.method2250(-1613178296) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field794 = 0.69921875F;
        } else {
            this.field794 = (float) arg0.method2250(-1613178296) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field791 = 1.2F;
        } else {
            this.field791 = (float) arg0.method2250(-1613178296) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field787 = -60;
            this.field774 = -50;
            this.field777 = -50;
        } else {
            this.field777 = arg0.method2214(0);
            this.field787 = arg0.method2214(0);
            this.field774 = arg0.method2214(0);
        }
        if ((var2 & 0x20) == 0) {
            this.field779 = class234.field3724;
        } else {
            this.field779 = arg0.method2231((byte) -127);
        }
        if ((var2 & 0x40) == 0) {
            this.field785 = 0;
        } else {
            this.field785 = arg0.method2250(-1613178296);
        }
        if ((var2 & 0x80) != 0) {
            this.field783 = class35.method291(arg0.method2250(-1613178296), arg0.method2250(-1613178296), arg0.method2250(-1613178296), arg0.method2250(-1613178296), arg0.method2250(-1613178296), arg0.method2250(-1613178296));
        } else if (class322.field5297 != null) {
            this.field783 = class35.method291(class322.field5297[0], class322.field5297[1], class322.field5297[2], class322.field5297[3], class322.field5297[4], class322.field5297[5]);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZII)V", line = 18)
    public static final void method377(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field776++;
        for (int var6 = arg4; var6 <= (arg2 + arg4); var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg1; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class180.field2806[arg5][var7][var6] = 127;
                }
            }
        }
        if (!arg3) {
            field788 = (class264) null;
        }
        for (int var8 = arg4; var8 < (arg4 + arg2); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class101.field1457[arg5][var9][var8] = arg5 > 0 ? class101.field1457[arg5 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg4 + 1; var10 < arg2 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class101.field1457[arg5][arg0][var10] = class101.field1457[arg5][arg0 - 1][var10];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg1; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class101.field1457[arg5][var11][arg4] = class101.field1457[arg5][var11][arg4 - 1];
                }
            }
        }
        if (arg0 < 0 || arg4 < 0 || arg0 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 > 0 && class101.field1457[arg5][arg0 - 1][arg4] != 0) {
                class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0 - 1][arg4];
            } else if (arg4 > 0 && class101.field1457[arg5][arg0][arg4 - 1] != 0) {
                class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0][arg4 - 1];
            } else if (arg0 > 0 && arg4 > 0 && class101.field1457[arg5][arg0 - 1][arg4 - 1] != 0) {
                class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0 - 1][arg4 - 1];
            }
        } else if (arg0 > 0 && class101.field1457[arg5][arg0 - 1][arg4] != class101.field1457[arg5 - 1][arg0 - 1][arg4]) {
            class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0 - 1][arg4];
        } else if (arg4 > 0 && class101.field1457[arg5 - 1][arg0][arg4 - 1] != class101.field1457[arg5][arg0][arg4 - 1]) {
            class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0][arg4 - 1];
        } else if (arg0 > 0 && arg4 > 0 && class101.field1457[arg5 - 1][arg0 - 1][arg4 - 1] != class101.field1457[arg5][arg0 - 1][arg4 - 1]) {
            class101.field1457[arg5][arg0][arg4] = class101.field1457[arg5][arg0 - 1][arg4 - 1];
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lfh;I)V", line = 137)
    public final void method378(class313 arg0, int arg1) {
        field778++;
        this.field781 = (float) (arg0.method2224(-124) * 8) / 255.0F;
        this.field782 = (float) (arg0.method2224(-121) * 8) / 255.0F;
        this.field786 = (float) (arg0.method2224(-128) * 8) / 255.0F;
        if (arg1 < 93) {
            method383(true, 117, false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 151)
    public static final void method379(int arg0, int arg1) {
        if (arg1 != 2) {
            method377(20, 5, 99, true, 27, 3);
        }
        field780++;
        if (class77.field1147 == 0) {
            class228.field3583.method1564(arg0, arg1 + 46);
        } else {
            class4.field56 = arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZIZI)V", line = 168)
    public static final void method380(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field792++;
        if (arg3) {
            class245.method1718();
        }
        if (class296.field4907 != null && (arg4 != 3 || class251.field4012 != arg0 || class72.field1105 != arg6)) {
            class219.method1479(class96.field1382, class296.field4907, 102);
            class296.field4907 = null;
        }
        if (arg4 == 3 && class296.field4907 == null) {
            class296.field4907 = class74.method509(arg6, 0, class96.field1382, (byte) 33, 0, arg0);
            if (class296.field4907 != null) {
                class251.field4012 = arg0;
                class72.field1105 = arg6;
                class292.method2064(true, class96.field1382);
            }
        }
        if (arg4 == 3 && class296.field4907 == null) {
            method380(-1, arg1, 50, true, class295.field4901, true, -1);
            return;
        }
        Container var7;
        if (class296.field4907 != null) {
            var7 = class296.field4907;
        } else if (class217.field3350 == null) {
            var7 = class96.field1382.field4515;
        } else {
            var7 = class217.field3350;
        }
        class107.field1535 = var7.getSize().width;
        class182.field2829 = var7.getSize().height;
        if (class217.field3350 == var7) {
            Insets var8 = class217.field3350.getInsets();
            class182.field2829 -= var8.top + var8.bottom;
            class107.field1535 -= var8.right + var8.left;
        }
        if (arg4 < 2) {
            class223.field3455 = 0;
            class243.field3838 = 503;
            class233.field3712 = 765;
            class198.field3042 = (class107.field1535 - 765) / 2;
        } else {
            class198.field3042 = 0;
            class243.field3838 = class182.field2829;
            class233.field3712 = class107.field1535;
            class223.field3455 = 0;
        }
        if (arg2 <= 9) {
            field798 = (String) null;
        }
        if (arg5) {
            class355.method2476(class235.field3731, -117);
            class192.method1323(true, class235.field3731);
            if (class140.field2264 != null) {
                class140.field2264.method1014(class235.field3731, true);
            }
            class96.field1394.method90(2);
            class121.method785(-282, class235.field3731);
            class244.method1702(class235.field3731, 17084);
            if (class140.field2264 != null) {
                class140.field2264.method1015(class235.field3731, true);
            }
        } else {
            if (class245.field3886) {
                class245.method1739(class233.field3712, class243.field3838);
            }
            class235.field3731.setSize(class233.field3712, class243.field3838);
            if (class217.field3350 == var7) {
                Insets var9 = class217.field3350.getInsets();
                class235.field3731.setLocation(class198.field3042 + var9.left, class223.field3455 + var9.top);
            } else {
                class235.field3731.setLocation(class198.field3042, class223.field3455);
            }
        }
        if (arg4 == 0 && arg1 > 0) {
            class245.method1746(class235.field3731);
        }
        if (arg3 && arg4 > 0) {
            class235.field3731.setIgnoreRepaint(true);
            if (!class291.field4831) {
                class171.method1179();
                class92.field1331 = null;
                class92.field1331 = class204.method1393(30663, class243.field3838, class235.field3731, class233.field3712);
                class317.method2283();
                if (class346.field5553 == 5) {
                    class248.method1768(class31.field471, (byte) 123, true);
                } else {
                    class243.method1696(false, (byte) 121, class157.field2525);
                }
                try {
                    Graphics var10 = class235.field3731.getGraphics();
                    class92.field1331.method1166(false, 0, 0, var10);
                } catch (Exception var14) {
                }
                class191.method1319((byte) -86);
                if (arg1 == 0) {
                    class92.field1331 = class204.method1393(30663, 503, class235.field3731, 765);
                } else {
                    class92.field1331 = null;
                }
                class158 var12 = class96.field1382.method1958((byte) -74, class96.field1394.getClass());
                while (var12.field2542 == 0) {
                    class177.method1246(100L, -32644);
                }
                if (var12.field2542 == 1) {
                    class291.field4831 = true;
                }
            }
            if (class291.field4831) {
                class245.method1730(class235.field3731, class306.field4997 * 2);
            }
        }
        if (!class245.field3886 && arg4 > 0) {
            method380(-1, arg1, 123, true, 0, true, -1);
            return;
        }
        if (arg4 > 0 && arg1 == 0) {
            class96.field1395.setPriority(5);
            class92.field1331 = null;
            class67.method465();
            ((class55) class272.field4467).method398((byte) 60, 200);
            if (class322.field5287) {
                class272.method1931(0.7F);
            }
            if (class236.field3742 == null) {
                class236.field3742 = new class52[13][13];
            }
            class254.method1811(4, 104, 104);
            class149.method1070(104, 104);
            class289.method2051(27953);
        } else if (arg4 == 0 && arg1 > 0) {
            class96.field1395.setPriority(1);
            class92.field1331 = class204.method1393(30663, 503, class235.field3731, 765);
            class67.method463();
            class145.method1031();
            ((class55) class272.field4467).method398((byte) 85, 20);
            if (class322.field5287) {
                if (class75.field1138 == 1) {
                    class272.method1931(0.9F);
                }
                if (class75.field1138 == 2) {
                    class272.method1931(0.8F);
                }
                if (class75.field1138 == 3) {
                    class272.method1931(0.7F);
                }
                if (class75.field1138 == 4) {
                    class272.method1931(0.6F);
                }
            }
            class226.method1535();
            class289.method2051(27953);
        }
        class51.field769 = !class261.method1836(0);
        class145.method1016(class233.field3712, class243.field3838);
        if (arg3) {
            class191.method1318(-31);
        }
        if (arg4 >= 2) {
            class129.field1968 = true;
        } else {
            class129.field1968 = false;
        }
        if (class345.field5538 != -1) {
            class157.method1123((byte) 120, true);
        }
        if (class346.field5545 != null && (class346.field5553 == 30 || class346.field5553 == 25)) {
            class53.method385(80);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class116.field1694[var13] = true;
        }
        class143.field2304 = true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 414)
    public static final void method381(byte arg0) {
        if (arg0 <= -24) {
            class141.field2271.method644((byte) -71);
            field784++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)Lwm;", line = 446)
    public static final class266 method382(int arg0, int arg1) {
        field796++;
        class266 var2 = (class266) class153.field2480.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -91) {
            method379(19, -81);
        }
        byte[] var3 = class76.field1145.method1504(arg1, true, 4);
        class266 var4 = new class266();
        if (var3 != null) {
            var4.method1873(new class313(var3), 25034, arg1);
        }
        class153.field2480.method642(var4, (long) arg1, -88);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)Ljava/lang/String;", line = 493)
    public static final String method383(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            field775++;
            return arg0 && arg1 >= 0 ? class242.method1691(arg1, 10, (byte) -75, arg0) : Integer.toString(arg1);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 512)
    public static void method384(boolean arg0) {
        field788 = null;
        if (arg0) {
            field797 = (class202) null;
        }
        field797 = null;
        field798 = null;
    }
}
