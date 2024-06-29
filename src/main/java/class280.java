import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class280 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4473 = "Opened title screen";

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[S")
    public static short[] field4477 = new short[256];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4475 = "skill: ";

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field4479;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIILli;Lli;IIJ)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, class197 arg4, class197 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class233 var10 = new class233();
        var10.field3719 = arg8;
        var10.field3712 = arg1 * 128 + 64;
        var10.field3715 = arg2 * 128 + 64;
        var10.field3698 = arg3;
        var10.field3709 = arg4;
        var10.field3716 = arg5;
        var10.field3717 = arg6;
        var10.field3703 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class273.field4415[var11][arg1][arg2] == null) {
                class273.field4415[var11][arg1][arg2] = new class99(var11, arg1, arg2);
            }
        }
        class273.field4415[arg0][arg1][arg2].field1502 = var10;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
    public static final boolean method1870(int arg0, int arg1) {
        field4472++;
        if (class110.field1901[arg1]) {
            return true;
        } else if (class151.field2447.method916(arg1, 3408)) {
            int var2 = class151.field2447.method948((byte) -97, arg1);
            if (var2 == 0) {
                class110.field1901[arg1] = true;
                return true;
            }
            if (class133.field2204[arg1] == null) {
                class133.field2204[arg1] = new class103[var2];
            }
            if (arg0 <= 91) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class133.field2204[arg1][var3] == null) {
                    byte[] var4 = class151.field2447.method940((byte) 94, var3, arg1);
                    if (var4 != null) {
                        class103 var5 = class133.field2204[arg1][var3] = new class103();
                        var5.field1659 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method726(-21213, new class264(var4));
                        } else {
                            var5.method721(new class264(var4), -65536);
                        }
                    }
                }
            }
            class110.field1901[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
    public static final int method1871(byte arg0) {
        field4476++;
        if ((double) class109.field1894 == 3.0D) {
            return 37;
        } else if ((double) class109.field1894 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 126) {
                field4475 = null;
            }
            if ((double) class109.field1894 == 6.0D) {
                return 75;
            } else if ((double) class109.field1894 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method1872(int arg0) {
        if (arg0 != -16) {
            field4473 = null;
        }
        field4474++;
        if (class263.field4160) {
            return;
        }
        class263.field4160 = true;
        if (class107.field1867) {
            client.field3605 = (float) ((int) client.field3605 - 17 & 0xFFFFFFF0);
        } else {
            class130.field2175 += (-class130.field2175 - 12.0F) / 2.0F;
        }
        class196.field3163 = true;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static final void method1873(byte arg0) {
        if (arg0 != -54) {
            field4475 = null;
        }
        if (class147.field2361 != null) {
            class147.field2361.method743(5034);
        }
        if (class226.field3580 != null) {
            class226.field3580.method743(5034);
        }
        field4478++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static void method1874(byte arg0) {
        field4477 = null;
        field4479 = null;
        if (arg0 != 98) {
            field4473 = null;
        }
        field4475 = null;
        field4473 = null;
    }
}
