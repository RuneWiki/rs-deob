import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class76 extends class240 {

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    private int field1428 = 4;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    private int field1436 = 4;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Lcd;")
    public static class64 field1424 = class44.method335((byte) 71, "mapscene");

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field1433 = -1;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "Lcd;")
    public static class64 field1427 = class44.method335((byte) 71, ")3)3)3");

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "Lcd;")
    private static class64 field1439 = class44.method335((byte) 71, "flash1:");

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "Lcd;")
    public static class64 field1429 = field1439;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "Lcd;")
    public static class64 field1431 = field1439;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "Lig;")
    public static class168 field1432 = new class168(64);

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "Lkg;")
    public static class69 field1437;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILkh;)V", line = 8)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field1426++;
        if (arg1 == 0) {
            this.field1436 = arg2.method152((byte) -96);
        } else if (arg1 == 1) {
            this.field1428 = arg2.method152((byte) -108);
        }
        if (arg0 != 2) {
            method604(-30, (byte[]) null, -124, 51);
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 46)
    public static void method602(int arg0) {
        field1437 = null;
        field1439 = null;
        field1429 = null;
        if (arg0 > -90) {
            method605(true, 4, 118, (byte) 7, 24);
        }
        field1431 = null;
        field1424 = null;
        field1427 = null;
        field1432 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 329)
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[[I", line = 70)
    public final int[][] method286(byte arg0, int arg1) {
        field1434++;
        int[][] var3 = this.field4095.method1797(arg1, -108);
        if (this.field4095.field4355) {
            int var4 = class131.field2320 / this.field1428;
            int var5 = class169.field2936 / this.field1436;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1746(-69, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1746(74, class131.field2320 * var7 / var4, 0);
            }
            int[] var8 = var6[2];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var6[0];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class169.field2936; var14++) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class169.field2936 * var16 / var5;
                }
                var10[var14] = var12[var15];
                var11[var14] = var9[var15];
                var13[var14] = var8[var15];
            }
        }
        if (arg0 < 34) {
            method605(true, 115, 48, (byte) 40, 64);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILfd;BI)V", line = 139)
    public static final void method603(int arg0, class232 arg1, byte arg2, int arg3) {
        if (arg1.field1902 == arg3 && arg3 != -1) {
            class199 var4 = class281.method1944(arg3, 0);
            int var5 = var4.field3403;
            if (var5 == 1) {
                arg1.field1874 = arg0;
                arg1.field1892 = 0;
                arg1.field1885 = 0;
                arg1.field1897 = 0;
                class10.method89(arg1.field1865, arg1.field1859, arg1.field1885, var4, true, false);
            }
            if (var5 == 2) {
                arg1.field1897 = 0;
            }
        } else if (arg3 == -1 || arg1.field1902 == -1 || class281.method1944(arg3, 0).field3388 >= class281.method1944(arg1.field1902, 0).field3388) {
            arg1.field1858 = arg1.field1862;
            arg1.field1874 = arg0;
            arg1.field1885 = 0;
            arg1.field1897 = 0;
            arg1.field1902 = arg3;
            arg1.field1892 = 0;
            if (arg1.field1902 != -1) {
                class10.method89(arg1.field1865, arg1.field1859, arg1.field1885, class281.method1944(arg1.field1902, 0), true, false);
            }
        }
        if (arg2 == -128) {
            field1438++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BII)I", line = 198)
    public static final int method604(int arg0, byte[] arg1, int arg2, int arg3) {
        field1423++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class59.field994[(arg1[var5] ^ var4) & 0xFF];
        }
        if (arg0 != 0) {
            method603(-2, (class232) null, (byte) -44, 96);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIIBI)V", line = 221)
    public static final void method605(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1425++;
        if (arg3 > -96) {
            method602(-48);
        }
        if (class159.method1148(-1, arg1)) {
            class264.method1853(arg4, class272.field4675[arg1], -1, arg2, (byte) 45, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I", line = 247)
    public final int[] method12(int arg0, int arg1) {
        field1435++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = class169.field2936 / this.field1436;
            int var5 = class131.field2320 / this.field1428;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1745(class131.field2320 * var6 / var5, 0, (byte) 110);
            } else {
                var7 = this.method1745(0, 0, (byte) 105);
            }
            for (int var8 = 0; var8 < class169.field2936; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class169.field2936 * var9 / var4];
                }
            }
        }
        if (arg0 != 64) {
            field1427 = (class64) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Z", line = 298)
    public static final boolean method606(int arg0) {
        field1430++;
        return class238.field4072 == arg0 ? class258.field4463.method1732(false) : true;
    }
}
