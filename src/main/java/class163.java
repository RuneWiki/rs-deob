import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class163 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
    private String field2455 = "null";

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[[I")
    public static int[][] field2467 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!s", name = "e", descriptor = "C")
    public char field2459;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "C")
    public char field2461;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lvg;")
    private class56 field2460;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lvg;")
    public class56 field2466;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 3)
    public static void method1161(byte arg0) {
        int var1 = -49 / ((arg0 - 61) / 53);
        field2467 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 12)
    private final void method1162(int arg0) {
        field2470++;
        this.field2460 = new class56(this.field2466.method363(-23686));
        if (arg0 == 0) {
            for (class109 var2 = (class109) this.field2466.method359(true); var2 != null; var2 = (class109) this.field2466.method365(-128)) {
                class246 var3 = new class246(var2.field1640, (int) var2.field1932);
                this.field2460.method357(var3, arg0 ^ 0x1, class64.method435(false, var2.field1640));
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfh;I)V", line = 38)
    public final void method1163(class194 arg0, int arg1) {
        if (arg1 != -1) {
            this.field2455 = null;
        }
        field2456++;
        while (true) {
            int var3 = arg0.method1337((byte) -120);
            if (var3 == 0) {
                return;
            }
            this.method1170(arg0, -25, var3);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 60)
    public final boolean method1164(String arg0, int arg1) {
        field2471++;
        if (this.field2466 == null) {
            return false;
        }
        if (this.field2460 == null) {
            this.method1162(0);
        }
        class246 var3 = (class246) this.field2460.method358((byte) 43, class64.method435(false, arg0));
        if (arg1 != 0) {
            this.field2459 = (char) 65430;
        }
        while (var3 != null) {
            if (var3.field3691.equals(arg0)) {
                return true;
            }
            var3 = (class246) this.field2460.method366(109);
        }
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)I", line = 97)
    public final int method1165(int arg0, byte arg1) {
        field2463++;
        if (this.field2466 == null) {
            return this.field2465;
        }
        class50 var3 = (class50) this.field2466.method358((byte) -128, (long) arg0);
        if (var3 == null) {
            return this.field2465;
        } else {
            if (arg1 <= 51) {
                this.method1167(98, 85);
            }
            return var3.field771;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 116)
    private final void method1166(int arg0) {
        field2458++;
        this.field2460 = new class56(this.field2466.method363(-23686));
        if (arg0 <= -115) {
            for (class50 var2 = (class50) this.field2466.method359(true); var2 != null; var2 = (class50) this.field2466.method365(-70)) {
                class50 var3 = new class50((int) var2.field1932);
                this.field2460.method357(var3, 1, (long) var2.field771);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z", line = 139)
    public final boolean method1167(int arg0, int arg1) {
        field2464++;
        if (this.field2466 == null) {
            return false;
        }
        if (this.field2460 == null) {
            this.method1166(-116);
        }
        class50 var3 = (class50) this.field2460.method358((byte) 17, (long) arg1);
        if (var3 == null) {
            return false;
        } else if (arg0 == -21616) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I", line = 162)
    public static final int method1168(int arg0, int arg1, int arg2, int arg3) {
        field2457++;
        if (class307.field4698 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class362.field5350;
        int var7 = arg2 - class362.field5345;
        class53 var8 = (class53) class362.field5333.method295((byte) 117);
        if (arg1 > -80) {
            field2467 = null;
        }
        while (var8 != null) {
            if (var8.field824 == arg0) {
                int var9 = var8.field816;
                int var10 = var8.field809;
                int var11 = class362.field5345 + var10 | var9 - -class362.field5350 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
            var8 = (class53) class362.field5333.method296(true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Ljava/lang/String;", line = 217)
    public final String method1169(int arg0, int arg1) {
        field2462++;
        if (this.field2466 == null) {
            return this.field2455;
        }
        if (arg0 != -20642) {
            this.method1164(null, -95);
        }
        class109 var3 = (class109) this.field2466.method358((byte) 88, (long) arg1);
        return var3 == null ? this.field2455 : var3.field1640;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lfh;II)V", line = 238)
    private final void method1170(class194 arg0, int arg1, int arg2) {
        int var4 = 3 % ((arg1 + 74) / 41);
        if (arg2 == 1) {
            this.field2461 = class515.method3052((byte) -89, arg0.method1398(70));
        } else if (arg2 == 2) {
            this.field2459 = class515.method3052((byte) -94, arg0.method1398(24));
        } else if (arg2 == 3) {
            this.field2455 = arg0.method1347(-107);
        } else if (arg2 == 4) {
            this.field2465 = arg0.method1401(-79);
        } else if (arg2 == 5 || arg2 == 6) {
            int var5 = arg0.method1396(110);
            this.field2466 = new class56(class46.method307((byte) -38, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method1401(124);
                class130 var8;
                if (arg2 == 5) {
                    var8 = new class109(arg0.method1347(-98));
                } else {
                    var8 = new class50(arg0.method1401(-99));
                }
                this.field2466.method357(var8, 1, (long) var7);
            }
        }
        field2468++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[II[IB)V", line = 292)
    public static final void method1171(int arg0, int[] arg1, int arg2, int[] arg3, byte arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (arg3[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1171(arg0, arg1, var6 - 1, arg3, (byte) -128);
            method1171(var6 + 1, arg1, arg2, arg3, (byte) 101);
        }
        int var13 = 37 / ((arg4 + 56) / 62);
        field2469++;
    }
}
