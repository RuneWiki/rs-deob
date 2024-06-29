import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class228 extends class266 {

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lma;")
    public static class5 field3776 = class12.method119("0(U", (byte) 114);

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Lma;")
    private static class5 field3783 = class12.method119("", (byte) 73);

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field3777 = 0;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "Lma;")
    public static class5 field3775 = field3783;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "[I")
    public static int[] field3789 = new int[64];

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lni;")
    public static class202 field3788;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Lbf;")
    private class209 field3781;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V", line = 12)
    public static void method1610(byte arg0) {
        field3788 = null;
        field3775 = null;
        int var1 = -115 / ((arg0 + 60) / 51);
        field3776 = null;
        field3789 = null;
        field3783 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIII)V", line = 26)
    public static final void method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3782++;
        int var9 = arg4 - arg3;
        int var10 = arg7 - arg1;
        if (arg0 != -14784) {
            field3777 = 31;
        }
        int var11 = (arg6 - arg5 << 16) / var9;
        int var12 = (arg8 - arg2 << 16) / var10;
        class195.method1276(arg7, var12, var11, arg2, arg3, arg5, 0, arg4, arg1, 0, (byte) 101);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILsi;)V", line = 47)
    public static final void method1612(int arg0, class223 arg1) {
        int var2 = -14 / ((arg0 - 26) / 60);
        class16.method141(-17473);
        field3787++;
        if (class164.field2511 != null) {
            return;
        }
        if (!class23.field402) {
            class50.method381(1);
        } else if (class139.field2059 == 1) {
            int var3 = class60.field934 / 5;
            int var4 = class176.field2685 + var3 + 140;
            if (class104.field1545 >= var4 && class104.field1545 <= var4 + 14 && class289.field4915 >= class198.field3150 + 4 && class198.field3150 + 18 >= class289.field4915) {
                class268.method1846(2, 0, 0);
                return;
            }
            if (class104.field1545 >= var4 + 15 && var4 + 80 >= class104.field1545 && class198.field3150 + 4 <= class289.field4915 && (class198.field3150 + 18) >= class289.field4915) {
                class268.method1846(2, 1, 0);
                return;
            }
            int var5 = class176.field2685 + var3 + 250;
            if (class104.field1545 >= var5 && class104.field1545 <= var5 + 14 && class198.field3150 + 4 <= class289.field4915 && class289.field4915 <= class198.field3150 + 18) {
                class268.method1846(2, 0, 1);
                return;
            }
            if (class104.field1545 >= (var5 + 15) && (var5 + 80) >= class104.field1545 && class198.field3150 + 4 <= class289.field4915 && class289.field4915 <= class198.field3150 + 18) {
                class268.method1846(2, 1, 1);
                return;
            }
            int var6 = class176.field2685 + var3 + 360;
            if (class104.field1545 >= var6 && var6 + 14 >= class104.field1545 && (class198.field3150 + 4) <= class289.field4915 && class289.field4915 <= class198.field3150 + 18) {
                class268.method1846(2, 0, 2);
                return;
            }
            if (var6 + 15 <= class104.field1545 && (var6 + 80) >= class104.field1545 && class289.field4915 >= (class198.field3150 + 4) && class198.field3150 + 18 >= class289.field4915) {
                class268.method1846(2, 1, 2);
                return;
            }
            int var7 = class176.field2685 + var3 + 470;
            if (var7 <= class104.field1545 && var7 + 14 >= class104.field1545 && class289.field4915 >= class198.field3150 + 4 && class289.field4915 <= (class198.field3150 + 18)) {
                class268.method1846(2, 0, 3);
                return;
            }
            if (class104.field1545 >= (var7 + 15) && class104.field1545 <= var7 + 80 && (class198.field3150 + 4) <= class289.field4915 && class289.field4915 <= (class198.field3150 + 18)) {
                class268.method1846(2, 1, 3);
                return;
            }
            if (class211.field3363 != -1) {
                class303 var8 = class266.field4549[class211.field3363];
                if (class90.field1349 == var8.field5117) {
                    byte[] var9 = class288.method1940((byte) 111, new class5[] { var8.field5105, class275.field4692 }).method67(106);
                    class176.field2687 = new String(var9, 0, var9.length);
                    class239.field3967 = var8.field5100;
                    if (class90.field1350 != 0) {
                        class14.field266 = class239.field3967 + 40000;
                        class145.field2103 = class239.field3967 + 50000;
                        class219.field3543 = class14.field266;
                    }
                    if (class260.field4434 != null) {
                        class260.field4434.field4269 = true;
                        class29.method205(class260.field4434, (byte) 112);
                    }
                    return;
                }
                class5 var10 = class283.field4800;
                if (class90.field1350 != 0) {
                    var10 = class288.method1940((byte) 77, new class5[] { class256.field4385, class175.method1148(var8.field5100 + 7000, false) });
                }
                class5 var11 = class288.method1940((byte) 122, new class5[] { class55.field854, var8.field5105, class275.field4692, var10, class77.field1209, class175.method1148(class211.field3361, false), class260.field4444, class175.method1148(class249.field4119, false), class261.field4447, class175.method1148(1, false), class136.field2014, class175.method1148(class21.field366, false), class19.field329, class175.method1148(class76.field1191, false) });
                try {
                    arg1.getAppletContext().showDocument(var11.method53(0), "_self");
                } catch (Exception var13) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lii;II)V", line = 176)
    private final void method1613(class221 arg0, int arg1, int arg2) {
        field3790++;
        if (arg2 == 249) {
            int var4 = arg0.method1509(true);
            if (this.field3781 == null) {
                int var5 = class275.method1871(var4, 1110164296);
                this.field3781 = new class209(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1509(true) == 1;
                int var8 = arg0.method1497(3610);
                class297 var9;
                if (var7) {
                    var9 = new class127(arg0.method1501((byte) -56));
                } else {
                    var9 = new class276(arg0.method1517((byte) -122));
                }
                this.field3781.method1376((long) var8, -1, var9);
            }
        }
        if (arg1 != -80) {
            field3777 = 101;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILma;I)Lma;", line = 221)
    public final class5 method1614(int arg0, class5 arg1, int arg2) {
        field3778++;
        if (this.field3781 == null) {
            return arg1;
        }
        class127 var4 = (class127) this.field3781.method1372(false, (long) arg0);
        if (arg2 > -102) {
            this.method1617(-88, -56, 44);
        }
        return var4 == null ? arg1 : var4.field1901;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 245)
    public static final void method1615(int arg0) {
        if (arg0 != 60) {
            field3776 = (class5) null;
        }
        field3786++;
        for (class145 var1 = (class145) class110.field1629.method1475(arg0 - 46); var1 != null; var1 = (class145) class110.field1629.method1486(38)) {
            class92 var2 = var1.field2100;
            if (class276.field4701 != var2.field1389 || var2.field1400) {
                var1.method1997(arg0 ^ 0xFFFF9537);
            } else if (class50.field784 >= var2.field1407) {
                var2.method608(class282.field4788, true);
                if (var2.field1400) {
                    var1.method1997(-27381);
                } else {
                    class11.method114(var2.field1389, var2.field1391, var2.field1409, var2.field1397, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLii;)V", line = 304)
    public final void method1616(boolean arg0, class221 arg1) {
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                if (arg0) {
                    this.method1617(120, 91, -117);
                }
                field3784++;
                return;
            }
            this.method1613(arg1, -80, var3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)I", line = 321)
    public final int method1617(int arg0, int arg1, int arg2) {
        field3785++;
        if (this.field3781 == null) {
            return arg2;
        } else {
            int var4 = -101 / ((arg1 + 53) / 53);
            class276 var5 = (class276) this.field3781.method1372(false, (long) arg0);
            return var5 == null ? arg2 : var5.field4703;
        }
    }
}
