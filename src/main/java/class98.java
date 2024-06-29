import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class98 extends class288 {

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field1567 = 1;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field1562 = 0;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1569 = "flash1:";

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "Lie;")
    public static class271 field1560;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Lqh;")
    public static class33 field1566;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "[I")
    public static int[] field1559;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "[Lqb;")
    public static class26[] field1563;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "[[Lbk;")
    public static class51[][] field1568;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIIII)V", line = 6)
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1556++;
        if (arg2 != 2180) {
            field1568 = (class51[][]) ((class51[][]) null);
        }
        int var7 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg4);
        int var8 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg5);
        int var9 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg6);
        int var10 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1);
        int var11 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg0 + arg4);
        int var12 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg5 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class272.method1876(class34.field525[var13], var10, var9, arg3, (byte) -74);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class272.method1876(class34.field525[var14], var10, var9, arg3, (byte) -114);
        }
        int var15 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + arg6);
        int var16 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class34.field525[var17];
            class272.method1876(var18, var15, var9, arg3, (byte) -111);
            class272.method1876(var18, var10, var16, arg3, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 66)
    public static final void method724(boolean arg0) {
        field1561++;
        if (arg0) {
            field1559 = (int[]) null;
        }
        class181.field2731.method2176((byte) 122);
        class326.field5081.method2176((byte) 121);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIII)V", line = 78)
    public static final void method725(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1570++;
        class106.field1642.field2532 = 0;
        class106.field1642.method1132((byte) 29, 20);
        class106.field1642.method1132((byte) 29, arg3);
        class106.field1642.method1132((byte) 29, arg4);
        class106.field1642.method1150(arg1, -628562744);
        class106.field1642.method1150(arg2, -628562744);
        class233.field3705 = 1;
        class186.field2779 = 0;
        class202.field3033 = -3;
        if (arg0 < -30) {
            class37.field558 = 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 103)
    public static final void method726(int arg0) {
        field1557++;
        if (class55.field919 == 0) {
            return;
        }
        try {
            if ((++class213.field3250) > 1500) {
                if (class295.field4568 != null) {
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                }
                if (class133.field2124 >= 1) {
                    class55.field919 = 0;
                    class239.field3798 = -5;
                    return;
                }
                class213.field3250 = 0;
                class55.field919 = 1;
                class133.field2124++;
                if (class50.field813 == class106.field1648) {
                    class106.field1648 = class258.field4045;
                } else {
                    class106.field1648 = class50.field813;
                }
            }
            if (arg0 > -58) {
                return;
            }
            if (class55.field919 == 1) {
                class341.field5324 = class32.field471.method1286(class106.field1648, class315.field4910, -128);
                class55.field919 = 2;
            }
            if (class55.field919 == 2) {
                if (class341.field5324.field2956 == 2) {
                    throw new IOException();
                }
                if (class341.field5324.field2956 != 1) {
                    return;
                }
                class295.field4568 = new class43((Socket) class341.field5324.field2959, class32.field471);
                class341.field5324 = null;
                class295.field4568.method370(1, class106.field1642.field2500, 0, class106.field1642.field2532);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                int var1 = class295.field4568.method373(-74);
                if (class315.field4917 != null) {
                    class315.field4917.method220(1);
                }
                if (class17.field243 != null) {
                    class17.field243.method220(1);
                }
                if (var1 != 101) {
                    class239.field3798 = var1;
                    class55.field919 = 0;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    return;
                }
                class55.field919 = 3;
            }
            if (class55.field919 == 3) {
                if (class295.field4568.method366(80) < 2) {
                    return;
                }
                int var2 = class295.field4568.method373(-114) << 8 | class295.field4568.method373(-86);
                class194.method1378((byte) 123, var2);
                if (class219.field3328 != -1) {
                    class55.field919 = 0;
                    class295.field4568.method365(1);
                    class295.field4568 = null;
                    class37.method310(1);
                    return;
                }
                class55.field919 = 0;
                class239.field3798 = 6;
                class295.field4568.method365(1);
                class295.field4568 = null;
                return;
            }
        } catch (IOException var4) {
            if (class295.field4568 != null) {
                class295.field4568.method365(1);
                class295.field4568 = null;
            }
            if (class133.field2124 >= 1) {
                class239.field3798 = -4;
                class55.field919 = 0;
            } else {
                class133.field2124++;
                class213.field3250 = 0;
                class55.field919 = 1;
                if (class50.field813 == class106.field1648) {
                    class106.field1648 = class258.field4045;
                } else {
                    class106.field1648 = class50.field813;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBILjava/awt/Component;)Lfd;", line = 264)
    public static final class207 method727(int arg0, byte arg1, int arg2, Component arg3) {
        field1558++;
        try {
            Class var4 = Class.forName("w");
            class207 var5 = (class207) var4.getDeclaredConstructor().newInstance();
            var5.method869(arg3, arg2, arg0, (byte) -112);
            if (arg1 > -69) {
                field1562 = -110;
            }
            return var5;
        } catch (Throwable var8) {
            class118 var7 = new class118();
            var7.method869(arg3, arg2, arg0, (byte) 111);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 290)
    public static void method728(int arg0) {
        if (arg0 != -23629) {
            method728(54);
        }
        field1568 = (class51[][]) null;
        field1560 = null;
        field1563 = null;
        field1569 = null;
        field1566 = null;
        field1559 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 307)
    public static final void method729(byte arg0) {
        int var1 = class258.method1769(65);
        if (arg0 != 19) {
            return;
        }
        if (var1 == 0) {
            class294.field4555 = (byte[][][]) null;
            class231.method1631((byte) 70, 0);
        } else if (var1 == 1) {
            class333.method2319(119, (byte) 0);
            class231.method1631((byte) 70, 512);
            if (class92.field1468 != null) {
                class150.method1036(-105);
            }
        } else {
            class333.method2319(93, (byte) (class294.field4556 - 4 & 0xFF));
            class231.method1631((byte) 70, 2);
        }
        field1564++;
    }
}
