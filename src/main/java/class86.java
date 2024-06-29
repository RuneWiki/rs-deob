import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class86 extends class53 {

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    private int field1413 = 0;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    private int field1423 = 0;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "I")
    private int field1426 = 1;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "[J")
    public static long[] field1417 = new long[500];

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "[I")
    public static int[] field1419 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Z")
    public static boolean field1414 = false;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lwa;")
    public static class75 field1424 = class66.method560("Spieler", false);

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Lwa;")
    private static class75 field1415 = class66.method560("Please remove ", false);

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Lwa;")
    public static class75 field1418 = field1415;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Lwa;")
    public static class75 field1412 = field1415;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[I", line = 8)
    public final int[] method59(int arg0, int arg1) {
        field1422++;
        int[] var3 = this.field878.method1603(arg1, (byte) 108);
        if (this.field878.field3749) {
            int var4 = class50.field814[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class269.field4644; var6++) {
                int var7 = class67.field1178[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field1413 == 0) {
                    var9 = (var7 - var4) * this.field1426;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field1426 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field1423 == 0) {
                    var12 = class108.field1798[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field1423 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != -15196) {
            this.method54(38, (class60) null, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 299)
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 103)
    public final void method56(byte arg0) {
        if (arg0 != -79) {
            method694(-75);
        }
        field1425++;
        class203.method1511(arg0 + 335);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILja;Z)V", line = 114)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field1420++;
        if (!arg2) {
            method693(103);
        }
        if (arg0 == 0) {
            this.field1413 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field1423 = arg1.method501(0);
        } else if (arg0 == 3) {
            this.field1426 = arg1.method501(0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V", line = 161)
    public static final void method693(int arg0) {
        field1421++;
        if (arg0 != 31719) {
            return;
        }
        int var1 = class136.field2328.method92(8, 8);
        if (var1 < class229.field3894) {
            for (int var2 = var1; var2 < class229.field3894; var2++) {
                class83.field1377[class281.field4848++] = class65.field1131[var2];
            }
        }
        if (class229.field3894 < var1) {
            throw new RuntimeException("gppov1");
        }
        class229.field3894 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class65.field1131[var3];
            class96 var5 = class169.field2842[var4];
            int var6 = class136.field2328.method92(1, 8);
            if (var6 == 0) {
                class65.field1131[class229.field3894++] = var4;
                var5.field3271 = class143.field2463;
            } else {
                int var7 = class136.field2328.method92(2, 8);
                if (var7 == 0) {
                    class65.field1131[class229.field3894++] = var4;
                    var5.field3271 = class143.field2463;
                    class72.field1214[class173.field2924++] = var4;
                } else if (var7 == 1) {
                    class65.field1131[class229.field3894++] = var4;
                    var5.field3271 = class143.field2463;
                    int var8 = class136.field2328.method92(3, 8);
                    var5.method1455(false, var8, -96);
                    int var9 = class136.field2328.method92(1, arg0 ^ 0x7BEF);
                    if (var9 == 1) {
                        class72.field1214[class173.field2924++] = var4;
                    }
                } else if (var7 == 2) {
                    class65.field1131[class229.field3894++] = var4;
                    var5.field3271 = class143.field2463;
                    int var10 = class136.field2328.method92(3, 8);
                    var5.method1455(true, var10, -124);
                    int var11 = class136.field2328.method92(3, 8);
                    var5.method1455(true, var11, -106);
                    int var12 = class136.field2328.method92(1, 8);
                    if (var12 == 1) {
                        class72.field1214[class173.field2924++] = var4;
                    }
                } else if (var7 == 3) {
                    class83.field1377[class281.field4848++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)V", line = 273)
    public static void method694(int arg0) {
        field1419 = null;
        field1424 = null;
        if (arg0 != -5530) {
            field1417 = (long[]) null;
        }
        field1418 = null;
        field1417 = null;
        field1415 = null;
        field1412 = null;
    }
}
