import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class164 extends class108 {

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "[I")
    public int[] field2084 = new int[] { -1 };

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "[I")
    public int[] field2086 = new int[1];

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Lvt;")
    public static class344 field2077 = new class344("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[I")
    public static int[] field2083 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "[Lhr;")
    public static class556[] field2085 = new class556[14];

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field2082 = 503;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lba;")
    public static class607 field2081 = new class607(16);

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[IZ[I)J")
    private final long method888(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        field2078++;
        long[] var6 = class81.field1100;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg1) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
        return arg0 >= -26 ? 5L : var15;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILna;IIILqa;Lnl;IZI)Lr;")
    public final class521 method889(int arg0, class320 arg1, int arg2, int arg3, int arg4, class167 arg5, class534 arg6, int arg7, boolean arg8, int arg9) {
        field2079++;
        class521 var11 = null;
        int var12 = arg7;
        class362 var13 = null;
        if (arg9 != -1) {
            var13 = class217.field2772.method1473(arg9, -58);
        }
        if (arg3 != 850) {
            return null;
        }
        int[] var14 = this.field2084;
        if (var13 != null && var13.field5073 != null) {
            var14 = new int[var13.field5073.length];
            for (int var15 = 0; var15 < var13.field5073.length; var15++) {
                int var16 = var13.field5073[var15];
                if (var16 >= 0 && var16 < this.field2084.length) {
                    var14[var15] = this.field2084[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class556 var24 = null;
        class556 var25 = null;
        if (arg1 != null) {
            var12 = arg7 | 0x20;
            int var26 = arg1.field4431[arg0];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class609.field8754.method536(var27, (byte) -46);
            if (var24 != null) {
                var18 |= var24.method3113(var21, arg3 ^ 0x6621);
                var17 |= var24.method3114(var21, 0);
                var20 |= var24.method3116(arg3 - 29474, var21);
                var19 |= arg1.field4422;
            }
            if ((arg1.field4410 || class551.field7667) && arg4 != -1 && arg1.field4431.length > arg4) {
                var23 = arg1.field4432[arg0];
                int var28 = arg1.field4431[arg4];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class609.field8754.method536(var22 >>> 16, (byte) -46);
                }
                if (var25 != null) {
                    var18 |= var25.method3113(var22, 25971);
                    var17 |= var25.method3114(var22, arg3 ^ 0x352);
                    var20 |= var25.method3116(-28624, var22);
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
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method888(-30, arg9, arg6 == null ? null : arg6.field7450, arg8, var14);
        if (class251.field3138 != null) {
            var11 = (class521) class251.field3138.method323(var30, -19814);
        }
        if (var11 == null || arg5.method921(var11.method1601(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method938(var12, var11.method1601());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class98.field1307.method3391(0, var14[var34]).method2650(arg8, (byte) 55)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class528[] var35 = new class528[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class98.field1307.method3391(0, var14[var36]).method2643(false, arg8);
                }
            }
            if (var13 != null && var13.field5061 != null) {
                for (int var37 = 0; var37 < var13.field5061.length; var37++) {
                    if (var13.field5061[var37] != null && var35[var37] != null) {
                        int var38 = var13.field5061[var37][0];
                        int var39 = var13.field5061[var37][1];
                        int var40 = var13.field5061[var37][2];
                        int var41 = var13.field5061[var37][3];
                        int var42 = var13.field5061[var37][4];
                        int var43 = var13.field5061[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2939(var42, var43, 0, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2935(var38, var40, arg3 ^ 0xFFFFB2B4, var39);
                        }
                    }
                }
            }
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            class528 var44 = new class528(var35, var35.length);
            var11 = arg5.method197(var44, var32, class272.field3459, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg6.field7450[var45] < class384.field5358[var45].length) {
                        var11.method1587(class18.field203[var45], class384.field5358[var45][arg6.field7450[var45]]);
                    }
                    if (class227.field2910[var45].length > arg6.field7450[var45]) {
                        var11.method1587(class20.field290[var45], class227.field2910[var45][arg6.field7450[var45]]);
                    }
                }
            }
            if (class251.field3138 != null) {
                var11.method1583(var12);
                class251.field3138.method316(var30, (byte) -112, var11);
            }
        }
        if (arg1 == null || var24 == null) {
            return var11;
        } else {
            class521 var46 = var11.method1607((byte) 1, var12, true);
            var46.method2910(var24, var23, arg2 - 1, var25, var22, 0, 2, var21, arg1.field4422);
            return var46;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B[Lha;)V")
    public static final void method890(byte arg0, class116[] arg1) {
        field2080++;
        class233.field2981 = arg1.length;
        class106.field1370 = new class116[class233.field2981 + 10];
        class134.field1639 = new int[class233.field2981 + 10];
        class205.method1313(arg1, 0, class106.field1370, 0, class233.field2981);
        for (int var2 = 0; var2 < class233.field2981; var2++) {
            class134.field1639[var2] = class106.field1370[var2].method631();
        }
        int var3 = 52 / ((arg0 + 92) / 34);
        for (int var4 = class233.field2981; var4 < class106.field1370.length; var4++) {
            class134.field1639[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JJ)J")
    public static long method891(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2083 = null;
        if (arg0 < 123) {
            field2083 = null;
        }
        field2085 = null;
        field2081 = null;
        field2077 = null;
    }
}
