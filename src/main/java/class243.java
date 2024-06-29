import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class243 extends class264 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[I")
    public int[] field3599 = new int[] { -1 };

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
    public int[] field3607 = new int[1];

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljn;")
    public static class409 field3598 = new class409("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Ljava/util/Random;")
    public static Random field3609 = new Random();

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lvq;")
    public static class24 field3610 = new class24(36, 6);

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lct;")
    public static class104 field3602;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([I[IBZI)J", line = 5)
    private final long method1626(int[] arg0, int[] arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 != 24) {
            return 80L;
        }
        field3601++;
        long[] var6 = class186.field2606;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 57)
    public static void method1627(int arg0) {
        field3609 = null;
        field3598 = null;
        field3602 = null;
        if (arg0 <= 112) {
            method1627(63);
        }
        field3610 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZIILtq;Ltp;IIILfp;)Lbi;", line = 76)
    public final class143 method1628(int arg0, boolean arg1, int arg2, int arg3, class259 arg4, class196 arg5, int arg6, int arg7, int arg8, class9 arg9) {
        field3600++;
        class143 var11 = null;
        int var12 = arg3;
        class446 var13 = null;
        if (arg0 != -1) {
            var13 = class286.method1923((byte) 59, arg0);
        }
        int[] var14 = this.field3599;
        if (var13 != null && var13.field6523 != null) {
            var14 = new int[var13.field6523.length];
            for (int var15 = 0; var15 < var13.field6523.length; var15++) {
                int var16 = var13.field6523[var15];
                if (var16 >= 0 && var16 < this.field3599.length) {
                    var14[var15] = this.field3599[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 92 % ((-arg2 - 78) / 44);
        int var23 = 0;
        class213 var24 = null;
        class213 var25 = null;
        if (arg5 != null) {
            var12 = arg3 | 0x20;
            int var26 = arg5.field2784[arg8];
            int var27 = var26 >>> 16;
            var20 = var26 & 0xFFFF;
            var24 = class191.method1335(45, var27);
            if (var24 != null) {
                var18 |= var24.method1458(var20, 60);
                var17 |= var24.method1461(3, var20);
                var19 |= arg5.field2779;
            }
            if ((arg5.field2758 || class47.field616) && arg7 != -1 && arg7 < arg5.field2784.length) {
                int var28 = arg5.field2784[arg7];
                var23 = arg5.field2763[arg8];
                int var29 = var28 >>> 16;
                var21 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class191.method1335(27, var21 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method1458(var21, 99);
                    var17 |= var25.method1461(3, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var30 = this.method1626(var14, arg4 == null ? null : arg4.field3831, (byte) 24, arg1, arg0);
        if (class109.field1482 != null) {
            var11 = (class143) class109.field1482.method2310((byte) -125, var30);
        }
        if (var11 == null || arg9.method85(var11.method961(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method139(var12, var11.method961());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class157.field2119.method176((byte) -126, var14[var34]).method2621(0, arg1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class100[] var35 = new class100[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class157.field2119.method176((byte) -50, var14[var36]).method2634(arg1, -5398);
                }
            }
            if (var13 != null && var13.field6534 != null) {
                for (int var37 = 0; var37 < var13.field6534.length; var37++) {
                    if (var13.field6534[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6534[var37][0];
                        int var39 = var13.field6534[var37][1];
                        int var40 = var13.field6534[var37][2];
                        int var41 = var13.field6534[var37][3];
                        int var42 = var13.field6534[var37][4];
                        int var43 = var13.field6534[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method671(-1, var43, var42, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method668(var40, var39, 0, var38);
                        }
                    }
                }
            }
            if (arg4 != null) {
                var32 = var12 | 0x2000;
            }
            class100 var44 = new class100(var35, var35.length);
            var11 = arg9.method163(var44, var32, class267.field3968, 64, 850);
            if (arg4 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg4.field3831[var45] < class286.field4203[var45].length) {
                        var11.method965(class265.field3925[var45], class286.field4203[var45][arg4.field3831[var45]]);
                    }
                    if (class180.field2550[var45].length > arg4.field3831[var45]) {
                        var11.method965(class52.field658[var45], class180.field2550[var45][arg4.field3831[var45]]);
                    }
                }
            }
            if (class109.field1482 != null) {
                var11.method975(var12);
                class109.field1482.method2299(true, var11, var30);
            }
        }
        if (arg5 == null || var24 == null) {
            return var11;
        } else {
            class143 var46 = var11.method966((byte) 1, var12, true);
            var46.method984(var20, var24, var21, 27867, arg6 - 1, arg5.field2779, 0, var23, var25);
            return var46;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BZ)V", line = 318)
    public static final void method1629(byte arg0, boolean arg1) {
        field3606++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class215.field3066;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class24.field336;
        }
        int var4 = var2.length;
        if (arg0 <= 3) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class356.field5174[var5] >> 8;
            int var14 = class356.field5174[var5] & 0xFF;
            int var15 = var13 * 64 - class28.field399;
            int var16 = var14 * 64 - class134.field1846;
            if (var12 != null) {
                class60.method457(14597);
                var11 = class195.method1352(var16, class382.field5610, class74.field942, var12, arg1, var15, class134.field1846, var3, class28.field399, true);
            }
            if (!arg1 && class92.field1147 / 8 == var13 && (class135.field1854 / 8) == var14) {
                if (var11 == null) {
                    class187.field2613 = null;
                } else {
                    class187.field2613 = class308.method2054(var11[3], false, var11[1], var11[2], var11[0]);
                    class240.field3568 = var11[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class356.field5174[var6] >> 8) * 64 - class28.field399;
            int var8 = (class356.field5174[var6] & 0xFF) * 64 - class134.field1846;
            byte[] var9 = var2[var6];
            if (var9 == null && class135.field1854 < 800) {
                class60.method457(14597);
                for (int var10 = 0; var10 < var3; var10++) {
                    class26.method272(var7, (byte) -68, 64, var10, var8, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IJ)V", line = 410)
    public static final void method1630(int arg0, long arg1) {
        field3604++;
        if (class178.field2530 != null) {
            if (class28.field402 == 1 || class28.field402 == 5) {
                class369.method2349(arg1, true);
            } else if (class28.field402 == 4) {
                class32.method312(arg1, 85);
            }
        }
        class103.method693(arg0 ^ arg0, (long) class388.field5665, class74.field942);
        if (class318.field4672 != -1) {
            class381.method2420((byte) 38, class318.field4672);
        }
        for (int var3 = 0; var3 < class147.field1996; var3++) {
            if (class344.field5053[var3]) {
                class67.field895[var3] = true;
            }
            class115.field1569[var3] = class344.field5053[var3];
            class344.field5053[var3] = false;
        }
        class343.field5043 = class388.field5665;
        if (class74.field942.method109()) {
            class72.field941 = true;
        }
        if (class318.field4672 != -1) {
            class147.field1996 = 0;
            class435.method2669(-16777216);
        }
        class74.field942.method162();
        class354.method2265(-32461, class74.field942);
        int var4 = class408.method2538((byte) 102);
        if (var4 == -1) {
            var4 = class458.field6762;
        }
        class330.method2157(var4, -1);
        class276.method1883(26969, class187.field2619.field4951, class286.field4180, class187.field2619.field4954, class187.field2619.field4960);
        class286.field4180 = 0;
    }
}
