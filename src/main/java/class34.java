import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class34 extends class280 {

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "Lvg;")
    public static class75 field434;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Llc;")
    public static class86 field428;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method257(String arg0, int arg1) {
        field439++;
        String var2 = class241.method1688(37, class193.method1431(arg0, false));
        if (arg1 == 15578) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class172.field2765 = class85.field1245 * arg2 / arg0;
        class112.field1613 = -1;
        field432++;
        class29.field339 = -1;
        if (arg4 < 123) {
            method257((String) null, 58);
        }
        class296.field4682 = class52.field753 * arg1 / arg3;
        class110.method809(true);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Llc;B)V")
    public static final void method259(class86 arg0, byte arg1) {
        class274.field4401 = arg0;
        class101.field1499 = class274.field4401.method617((byte) 28, 4);
        if (arg1 == 51) {
            field430++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public static void method260(int arg0) {
        field428 = null;
        field434 = null;
        if (arg0 > -98) {
            method262((class152) null, -59);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method261(String arg0, int arg1, int arg2) {
        field429++;
        class220.field3532.method557(36, 8);
        class192.field3098++;
        if (arg1 >= 83) {
            class220.field3532.method1077(-30, class193.method1431(arg0, false));
            class220.field3532.method1070(arg2, false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lv;I)V")
    public static final void method262(class152 arg0, int arg1) {
        field433++;
        while (true) {
            while (arg0.field2511 < arg0.field2523.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method1111(255) == 1) {
                    var5 = arg0.method1111(255);
                    var3 = true;
                    var4 = arg0.method1111(255);
                }
                int var6 = arg0.method1111(255);
                int var7 = arg0.method1111(255);
                int var8 = var6 * 64 - class227.field3636;
                int var9 = class52.field753 + class122.field1786 - (var7 * 64) - 1;
                if (var8 >= 0 && (var9 - 63) >= 0 && (var8 + 63) < class85.field1245 && class52.field753 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= var5 * 8 && (var5 * 8 + 8) > var12 && var13 >= var4 * 8 && var4 * 8 + 8 > var13) {
                                byte var14 = arg0.method1092((byte) -62);
                                if (var14 != 0) {
                                    if (class122.field1784[var10][var11] == null) {
                                        class122.field1784[var10][var11] = new byte[4096];
                                    }
                                    class122.field1784[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1092((byte) -62);
                                    if (class253.field4183[var10][var11] == null) {
                                        class253.field4183[var10][var11] = new byte[4096];
                                    }
                                    class253.field4183[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1092((byte) -62);
                        if (var17 != 0) {
                            arg0.field2511++;
                        }
                    }
                }
            }
            int var2 = 44 / ((71 - arg1) / 48);
            return;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V")
    public class34(int arg0, int arg1) {
        this.field435 = arg1;
        this.field438 = arg0;
    }
}
