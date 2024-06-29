import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class94 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field1286 = 20;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1289 = " is already on your friend list.";

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1288 = "Loading fonts - ";

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[I")
    public static int[][] field1283 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!of", name = "j", descriptor = "J")
    public static long field1292 = 0L;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lak;")
    public static class172 field1285;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1290;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field1284;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[Loa;")
    public static class153[] field1291;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
    public static short[] field1287;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 5)
    public static void method626(byte arg0) {
        field1291 = null;
        field1289 = null;
        field1283 = (int[][]) null;
        field1290 = null;
        if (arg0 > -122) {
            field1291 = (class153[]) null;
        }
        field1284 = null;
        field1288 = null;
        field1287 = null;
        field1285 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 30)
    public static final boolean method627(String arg0, int arg1, String arg2) {
        field1293++;
        int var3 = arg0.length();
        int var4 = arg2.length();
        if (arg1 != 128) {
            field1289 = (String) null;
        }
        if (var3 < var4) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 69)
    public static final void method628(int arg0) {
        field1295++;
        if (arg0 != 17066) {
            return;
        }
        int var1 = class227.field3617;
        int var2 = class121.field1831;
        int var3 = class315.field4877;
        int var4 = class295.field4671 - 3;
        byte var5 = 20;
        if (class26.field361 == null || class307.field4788 == null) {
            if (class130.field2034.method1276(class333.field5190, -40) && class130.field2034.method1276(class225.field3598, -116)) {
                class26.field361 = class88.method599(0, (byte) -102, class333.field5190, class130.field2034);
                class307.field4788 = class88.method599(0, (byte) -83, class225.field3598, class130.field2034);
                if (class232.field3690) {
                    if ((class26.field361 instanceof class293)) {
                        class26.field361 = new class92((class220) class26.field361);
                    } else {
                        class26.field361 = new class314((class220) class26.field361);
                    }
                    if ((class307.field4788 instanceof class293)) {
                        class307.field4788 = new class92((class220) class307.field4788);
                    } else {
                        class307.field4788 = new class314((class220) class307.field4788);
                    }
                }
            } else if (class232.field3690) {
                class75.method510(var2, var3, var1, var5, class229.field3634, 256 - class193.field3163);
            } else {
                class59.method394(var2, var3, var1, var5, class229.field3634, 256 - class193.field3163);
            }
        }
        if (class26.field361 != null && class307.field4788 != null) {
            int var6 = (var1 - (class307.field4788.field825 * 2)) / class26.field361.field825;
            for (int var7 = 0; var7 < var6; var7++) {
                class26.field361.method375(class26.field361.field825 * var7 + class307.field4788.field825 + var2, var3);
            }
            class307.field4788.method375(var2, var3);
            class307.field4788.method373(var1 + var2 - class307.field4788.field825, var3);
        }
        class282.field4538.method1808(class116.field1762, var2 + 3, var3 + 14, class200.field3245, -1);
        if (class232.field3690) {
            class75.method510(var2, var3 + var5, var1, var4 - var5, class229.field3634, 256 - class193.field3163);
        } else {
            class59.method394(var2, var3 + var5, var1, var4 - var5, class229.field3634, 256 - class193.field3163);
        }
        int var8 = class70.field995;
        int var9 = class233.field3738;
        for (int var10 = 0; var10 < class185.field3070; var10++) {
            int var11 = (class185.field3070 - var10 - 1) * 15 + var3 + var5 + 13;
            if (var2 < var8 && var8 < (var1 + var2) && var9 > (var11 - 13) && var11 + 3 > var9) {
                if (class232.field3690) {
                    class75.method510(var2, var11 - 12, var1, 15, class51.field733, 256 - class14.field166);
                } else {
                    class59.method394(var2, var11 - 12, var1, 15, class51.field733, 256 - class14.field166);
                }
            }
        }
        if ((class14.field161 == null || class60.field847 == null || class14.field162 == null) && class130.field2034.method1276(class229.field3649, arg0 ^ 0xFFFFBD0B) && class130.field2034.method1276(class193.field3159, -85) && class130.field2034.method1276(class119.field1816, -39)) {
            class14.field161 = class88.method599(0, (byte) -84, class229.field3649, class130.field2034);
            class60.field847 = class88.method599(0, (byte) -96, class193.field3159, class130.field2034);
            class14.field162 = class88.method599(0, (byte) -87, class119.field1816, class130.field2034);
            if (class232.field3690) {
                if ((class14.field161 instanceof class293)) {
                    class14.field161 = new class92((class220) class14.field161);
                } else {
                    class14.field161 = new class314((class220) class14.field161);
                }
                if (class60.field847 instanceof class293) {
                    class60.field847 = new class92((class220) class60.field847);
                } else {
                    class60.field847 = new class314((class220) class60.field847);
                }
                if ((class14.field162 instanceof class293)) {
                    class14.field162 = new class92((class220) class14.field162);
                } else {
                    class14.field162 = new class314((class220) class14.field162);
                }
            }
        }
        if (class14.field161 != null && class60.field847 != null && class14.field162 != null) {
            int var12 = (var1 - (class14.field162.field825 * 2)) / class14.field161.field825;
            for (int var13 = 0; var13 < var12; var13++) {
                class14.field161.method375(class14.field162.field825 + (class14.field161.field825 * var13) + var2, var4 - class14.field161.field816 + var3);
            }
            int var14 = (var4 - var5 - class14.field162.field816) / class60.field847.field816;
            for (int var15 = 0; var15 < var14; var15++) {
                class60.field847.method375(var2, class60.field847.field816 * var15 + (var3 + var5));
                class60.field847.method373(var2 + var1 - class60.field847.field825, class60.field847.field816 * var15 + var3 - -var5);
            }
            class14.field162.method375(var2, var4 + var3 - class14.field162.field816);
            class14.field162.method373(var1 + var2 - class14.field162.field825, var3 + var4 + -class14.field162.field816);
        }
        for (int var16 = 0; var16 < class185.field3070; var16++) {
            int var17 = ((class185.field3070 - var16 - 1) * 15) + var3 + var5 + 13;
            int var18 = class200.field3245;
            if (var2 < var8 && var1 + var2 > var8 && (var17 - 13) < var9 && var9 < (var17 + 3)) {
                var18 = class187.field3084;
            }
            class282.field4538.method1808(class129.method935(var16, 2017), var2 + 3, var17, var18, 0);
        }
        class234.method1693(class121.field1831, class295.field4671, class315.field4877, class227.field3617, (byte) -105);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB)I", line = 269)
    public static final int method629(int arg0, int arg1, byte arg2) {
        int var3 = -108 / ((-arg2 - 76) / 44);
        field1294++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var4 = (arg1 & 0x7F) * arg0 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }
}
