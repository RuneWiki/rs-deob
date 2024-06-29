import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class211 extends class21 {

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field3394 = "glow2:";

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3393 = "Unable to find ";

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field3397 = 0;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "Z")
    public static boolean field3400 = false;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lbm;")
    public static class307 field3398;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 5)
    public static final void method1425(int arg0, int arg1) {
        int var2 = 43 / ((-arg0 - 31) / 39);
        field3395++;
        class141 var3 = class95.field1710;
        synchronized (class95.field1710) {
            class298.field4530 = arg1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(B)V", line = 16)
    public static void method1426(byte arg0) {
        field3393 = null;
        field3394 = null;
        field3398 = null;
        if (arg0 != -12) {
            method1428(71, (String) null, (char) 65502);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIJ)Z", line = 36)
    public static final boolean method1427(int arg0, int arg1, int arg2, long arg3) {
        class47 var5 = class326.field4975[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field965 != null && var5.field965.field795 == arg3) {
            return true;
        } else if (var5.field975 != null && var5.field975.field228 == arg3) {
            return true;
        } else if (var5.field967 != null && var5.field967.field4446 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field969; var6++) {
                if (var5.field974[var6].field4191 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method177(int arg0, int arg1) {
        int var3 = 98 % ((33 - arg0) / 36);
        field3399++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            class129.method854(var4, 0, class294.field4489, class330.field5058[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 91)
    public static final String[] method1428(int arg0, String arg1, char arg2) {
        int var3 = class307.method2047((byte) -60, arg2, arg1);
        field3401++;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = new String[arg0 + var3];
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg1.charAt(var8) != arg2; var8++) {
            }
            var6[var4++] = arg1.substring(var5, var8);
            var5 = var8 + 1;
        }
        var6[var3] = arg1.substring(var5);
        return var6;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 127)
    public class211() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 136)
    public static final void method1429(int arg0) {
        field3396++;
        if (class53.field1075 == 0) {
            return;
        }
        try {
            if ((++class341.field5296) > 2000) {
                if (class177.field2860 != null) {
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                }
                if (class196.field3157 >= 1) {
                    class40.field775 = -5;
                    class53.field1075 = 0;
                    return;
                }
                if (class329.field5049 == class205.field3347) {
                    class205.field3347 = class313.field4760;
                } else {
                    class205.field3347 = class329.field5049;
                }
                class196.field3157++;
                class53.field1075 = 1;
                class341.field5296 = 0;
            }
            if (class53.field1075 == 1) {
                class28.field541 = class177.field2849.method806(class245.field3808, class205.field3347, -27289);
                class53.field1075 = 2;
            }
            if (class53.field1075 == 2) {
                if (class28.field541.field1852 == 2) {
                    throw new IOException();
                }
                if (class28.field541.field1852 != 1) {
                    return;
                }
                class177.field2860 = new class87((Socket) class28.field541.field1853, class177.field2849);
                class28.field541 = null;
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                if (class41.field797 != null) {
                    class41.field797.method1497(46);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(115);
                }
                int var1 = class177.field2860.method616((byte) -104);
                if (class41.field797 != null) {
                    class41.field797.method1497(-90);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(97);
                }
                if (var1 != 21) {
                    class40.field775 = var1;
                    class53.field1075 = 0;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                class53.field1075 = 3;
            }
            if (class53.field1075 == 3) {
                if (class177.field2860.method608(-88) < 1) {
                    return;
                }
                class112.field1975 = new String[class177.field2860.method616((byte) -35)];
                class53.field1075 = 4;
            }
            if (arg0 >= -71) {
                return;
            }
            if (class53.field1075 == 4) {
                if (class177.field2860.method608(-99) < class112.field1975.length * 8) {
                    return;
                }
                class190.field3082.field3249 = 0;
                class177.field2860.method605((byte) -87, 0, class190.field3082.field3273, class112.field1975.length * 8);
                for (int var2 = 0; var2 < class112.field1975.length; var2++) {
                    class112.field1975[var2] = class72.method552(class190.field3082.method1297(false), 37);
                }
                class40.field775 = 21;
                class53.field1075 = 0;
                class177.field2860.method607((byte) -76);
                class177.field2860 = null;
                return;
            }
        } catch (IOException var4) {
            if (class177.field2860 != null) {
                class177.field2860.method607((byte) -76);
                class177.field2860 = null;
            }
            if (class196.field3157 < 1) {
                class196.field3157++;
                class53.field1075 = 1;
                class341.field5296 = 0;
                if (class329.field5049 == class205.field3347) {
                    class205.field3347 = class313.field4760;
                } else {
                    class205.field3347 = class329.field5049;
                }
            } else {
                class40.field775 = -4;
                class53.field1075 = 0;
            }
        }
    }
}
