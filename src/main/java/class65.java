import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    private int[] field1454 = new int[256];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
    private int[] field1437 = new int[256];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
    public static int[] field1441 = new int[2048];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lsc;")
    public static class128 field1432 = class129.method1017(false, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lsc;")
    private static class128 field1433 = class129.method1017(false, "World");

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lsc;")
    public static class128 field1449 = field1433;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lsc;")
    public static class128 field1452 = class129.method1017(false, "leuchten3:");

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lsc;")
    public static class128 field1448 = class129.method1017(false, "scape main");

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lsc;")
    public static class128 field1447 = field1433;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lsc;")
    public static class128 field1456 = class129.method1017(false, "event_opbase");

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lsc;")
    public static class128 field1450 = class129.method1017(false, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lrb;")
    public static class120 field1444 = new class120(50);

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Z")
    public static boolean field1459 = false;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lsf;")
    public static class131 field1455;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lhe;")
    public static class54 field1434;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
    public static int[] field1446;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method485(int arg0) {
        field1436++;
        if (this.field1451-- == 0) {
            this.method486(true);
            this.field1451 = 255;
        }
        return arg0 == 21705 ? this.field1454[this.field1451] : -21;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    private final void method486(boolean arg0) {
        field1458++;
        this.field1431 += ++this.field1442;
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field1437[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1438 ^= this.field1438 << 13;
                } else {
                    this.field1438 ^= this.field1438 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1438 ^= this.field1438 << 2;
            } else {
                this.field1438 ^= this.field1438 >>> 16;
            }
            this.field1438 += this.field1437[var2 + 128 & 0xFF];
            int var4;
            this.field1437[var2] = var4 = this.field1438 + this.field1437[class25.method224(1020, var3) >> 2] + this.field1431;
            this.field1454[var2] = this.field1431 = var3 + this.field1437[class25.method224(var4 >> 8 >> 2, 255)];
            var2++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method487(byte arg0) {
        field1455 = null;
        field1449 = null;
        field1450 = null;
        field1448 = null;
        field1434 = null;
        int var1 = 36 / ((78 - arg0) / 48);
        field1452 = null;
        field1441 = null;
        field1456 = null;
        field1433 = null;
        field1447 = null;
        field1432 = null;
        field1446 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
    public static final boolean method488(byte arg0, int arg1) {
        field1435++;
        if (class64.field1393[arg1]) {
            return true;
        } else if (class153.field3521.method1035((byte) 77, arg1)) {
            int var2 = class153.field3521.method1022(29, arg1);
            if (arg0 != 120) {
                return true;
            } else if (var2 == 0) {
                class64.field1393[arg1] = true;
                return true;
            } else {
                if (class123.field2791[arg1] == null) {
                    class123.field2791[arg1] = new class54[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class123.field2791[arg1][var3] == null) {
                        byte[] var4 = class153.field3521.method1023(var3, arg1, (byte) -35);
                        if (var4 != null) {
                            class123.field2791[arg1][var3] = new class54();
                            class123.field2791[arg1][var3].field1117 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                class123.field2791[arg1][var3].method421((byte) 48, new class86(var4));
                            } else {
                                class123.field2791[arg1][var3].method423((byte) 29, new class86(var4));
                            }
                        }
                    }
                }
                class64.field1393[arg1] = true;
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsc;ZLsc;Lsf;)[Lb;")
    public static final class8[] method489(class128 arg0, boolean arg1, class128 arg2, class131 arg3) {
        field1443++;
        if (!arg1) {
            field1430 = 22;
        }
        int var4 = arg3.method1036(arg0, (byte) -103);
        int var5 = arg3.method1031(var4, arg2, (byte) 84);
        return class89.method695(var5, arg3, true, var4);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    private final void method490(int arg0) {
        field1439++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1454[var11 + 3] + var6;
            int var38 = this.field1454[var11 + 1] + var8;
            int var39 = this.field1454[var11 + 5] + var4;
            int var40 = this.field1454[var11 + 4] + var5;
            int var41 = this.field1454[var11 + 6] + var3;
            int var42 = this.field1454[var11 + 7] + var2;
            int var43 = this.field1454[var11] + var9;
            int var44 = this.field1454[var11 + 2] + var7;
            int var45 = var43 ^ var38 << 11;
            int var46 = var38 + var44;
            int var47 = var46 ^ var44 >>> 2;
            int var48 = var40 + var47;
            int var49 = var37 + var45;
            int var50 = var44 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var39 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var6 + var41;
            int var55 = var48 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var4 + var45;
            int var58 = var5 + var42;
            int var59 = var54 + var58;
            var3 = var59 ^ var58 << 8;
            var8 = var3 + var47;
            int var60 = var57 + var58;
            var2 = var60 ^ var57 >>> 9;
            var9 = var8 + var57;
            var7 = var2 + var51;
            this.field1437[var11] = var9;
            this.field1437[var11 + 1] = var8;
            this.field1437[var11 + 2] = var7;
            this.field1437[var11 + 3] = var6;
            this.field1437[var11 + 4] = var5;
            this.field1437[var11 + 5] = var4;
            this.field1437[var11 + 6] = var3;
            this.field1437[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1437[var12 + 7] + var2;
            int var14 = this.field1437[var12 + 2] + var7;
            int var15 = this.field1437[var12 + 5] + var4;
            int var16 = this.field1437[var12 + 3] + var6;
            int var17 = this.field1437[var12] + var9;
            int var18 = this.field1437[var12 + 4] + var5;
            int var19 = this.field1437[var12 + 1] + var8;
            int var20 = var17 ^ var19 << 11;
            int var21 = this.field1437[var12 + 6] + var3;
            int var22 = var16 + var20;
            int var23 = var14 + var19;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var18 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var15 + var27;
            int var30 = var6 + var21;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var13;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var20;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            this.field1437[var12] = var9;
            this.field1437[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field1437[var12 + 2] = var7;
            this.field1437[var12 + 3] = var6;
            this.field1437[var12 + 4] = var5;
            this.field1437[var12 + 5] = var4;
            this.field1437[var12 + 6] = var3;
            this.field1437[var12 + 7] = var2;
        }
        this.method486(true);
        this.field1451 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lha;II)V")
    public static final void method491(class50 arg0, int arg1, int arg2) {
        if (arg2 == 26720) {
            field1440++;
            class134.method1084(arg0.field975, arg1, arg0.field987, 39);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
    public class65(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1454[var2] = arg0[var2];
        }
        this.method490(256);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method492(int arg0, Component arg1) {
        field1457++;
        arg1.removeMouseListener(class148.field3417);
        arg1.removeMouseMotionListener(class148.field3417);
        arg1.removeFocusListener(class148.field3417);
        class104.field2357 = 0;
        if (arg0 != 18122) {
            method487((byte) 31);
        }
    }
}
