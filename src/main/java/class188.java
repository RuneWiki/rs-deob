import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class188 extends class83 {

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    private int field2372 = 4;

    @OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
    private int field2375 = 4;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field2366 = 0;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "S")
    public static short field2369 = 32767;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!tp", name = "T", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!tp", name = "V", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!tp", name = "W", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!tp", name = "X", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!tp", name = "Y", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "[S")
    public static short[] field2368;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBLtq;)V", line = 8)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2372 = arg2.method1350(31351);
            }
        } else {
            this.field2375 = arg2.method1350(31351);
        }
        int var5 = 44 / ((arg1 - -27) / 50);
        ++field2376;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method37(int arg0, int arg1) {
        ++field2377;
        int[] var3 = super.field916.method1813(arg1, (byte) -111);
        if (arg0 != 2) {
            field2371 = 70;
        }
        if (super.field916.field4174) {
            int var4 = class420.field6139 / this.field2375;
            int var5 = class91.field1047 / this.field2372;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method451(0, 74, class91.field1047 * var6 / var5);
            } else {
                var7 = this.method451(0, 77, 0);
            }
            for (int var8 = 0; var8 < class420.field6139; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class420.field6139 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILtq;I)V", line = 98)
    public static final void method1011(int arg0, class250 arg1, int arg2) {
        if (class435.field6364 != null) {
            try {
                class435.field6364.method2381(23397, 0L);
                class435.field6364.method2377(24, arg1.field3406, arg2, (byte) -67);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 0) {
            method1014(-25);
        }
        ++field2378;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 118)
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(ZI)Z", line = 121)
    public static final boolean method1012(boolean arg0, int arg1) {
        ++field2379;
        if (arg1 != -1) {
            method1012(true, -128);
        }
        boolean var2 = class88.field1003.method1636();
        if (!arg0 == var2) {
            if (arg0) {
                if (!class88.field1003.method1598()) {
                    arg0 = false;
                }
            } else {
                class88.field1003.method1609();
            }
            if (!arg0 != var2) {
                return false;
            } else {
                class225.field3041 = arg0;
                class340.method1982(6288, class159.field2055);
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V", line = 164)
    public static void method1013(int arg0) {
        field2368 = null;
        if (arg0 != 7000) {
            field2371 = -14;
        }
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V", line = 174)
    public static final void method1014(int arg0) {
        class14.field130.method613(true);
        if (arg0 < 115) {
            field2367 = 84;
        }
        ++field2374;
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(II)Z", line = 185)
    public static final boolean method1015(int arg0, int arg1) {
        ++field2370;
        class156 var2 = class131.method700((byte) -105, arg1);
        if (var2 == null) {
            return false;
        } else if (class450.field6549 != 3) {
            class420.field6136 = var2.field1983;
            class281.field3854 = var2.field1975;
            if (class429.field6292 != 0) {
                class73.field813 = class281.field3854 + 50000;
                class359.field5077 = class281.field3854 + 40000;
                class379.field5353 = class359.field5077;
            }
            return true;
        } else {
            String var3 = "";
            if (class429.field6292 != 0) {
                var3 = ":" + (var2.field1975 + 7000);
            }
            String var4 = "";
            if (class435.field6351 != null) {
                var4 = "/p=" + class435.field6351;
            }
            if (arg0 != -26378) {
                field2366 = -86;
            }
            String var5 = "http://" + var2.field1983 + var3 + "/l=" + class85.field953 + "/a=" + class156.field1980 + var4 + "/j" + (!class32.field310 ? "0" : "1") + ",o" + (class167.field2113 ? "1" : "0") + ",a2";
            try {
                class267.field3646.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)[[I", line = 234)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field2373;
        int[][] var3 = super.field927.method1774((byte) 125, arg1);
        if (super.field927.field4104) {
            int var4 = class420.field6139 / this.field2375;
            int var5 = class91.field1047 / this.field2372;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method449(0, arg0, class91.field1047 * var6 / var5);
            } else {
                var7 = this.method449(0, true, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class420.field6139 < ~var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class420.field6139 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        if (!arg0) {
            field2369 = 3;
        }
        return var3;
    }
}
