import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class170 extends class194 {

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Z")
    public boolean field2998;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[Lga;")
    public class170[] field3006;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "Lbb;")
    public static class89 field3014 = class279.method1893(-17);

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lqk;")
    public static class207 field3019 = class24.method212(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field3023 = 64;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Lqk;")
    private static class207 field3024 = class24.method212(255, "Allocating memory");

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "[Lgk;")
    public static class156[] field3025 = new class156[4];

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Lqk;")
    public static class207 field3027 = field3024;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lqk;")
    private static class207 field3026 = class24.method212(255, "flash3:");

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Lqk;")
    public static class207 field3015 = field3026;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Lqk;")
    public static class207 field3020 = field3026;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lhb;")
    public class215 field3001;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lja;")
    public class58 field3002;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lpk;")
    public static class99 field3022;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[I")
    public static int[] field2995;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "[I")
    public static int[] field3017;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "[I")
    public static int[] field3021;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "[[[I")
    public static int[][][] field3018;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)I")
    public int method1155(boolean arg0) {
        field3011++;
        if (!arg0) {
            method1221(105);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[I")
    public int[] method31(byte arg0, int arg1) {
        if (arg0 == -30) {
            field2999++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public void method256(int arg0) {
        field3005++;
        if (arg0 != -27011) {
            field3027 = null;
        }
        if (this.field2998) {
            this.field3001.method1539(-1);
            this.field3001 = null;
        } else {
            this.field3002.method426((byte) 90);
            this.field3002 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public void method50(int arg0) {
        field2994++;
        if (arg0 < 14) {
            this.field2998 = false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)[[I")
    public int[][] method32(int arg0, boolean arg1) {
        field3009++;
        if (arg1) {
            this.field3000 = 25;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIZ[B[Lgi;)V")
    public static final void method1220(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, class155[] arg5) {
        field3003++;
        class149 var6 = new class149(arg4);
        int var7 = arg0;
        while (true) {
            int var8 = var6.method1064((byte) 101);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1067(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFCE) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1045((byte) -29);
                int var15 = var14 & 0x3;
                int var16 = arg2 + var11;
                int var17 = var14 >> 2;
                int var18 = arg1 + var12;
                if (var18 > 0 && var16 > 0 && var18 < 103 && var16 < 103) {
                    class155 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class271.field4791[1][var18][var16] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class110.method787(var18, arg3, !arg3, var7, var15, var17, var13, var13, Integer.MAX_VALUE, var19, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        class2.field38.method1382(31346);
        if (arg0 != 64) {
            method1225(-31);
        }
        field3004++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)V")
    public final void method1222(int arg0, int arg1, byte arg2) {
        field3013++;
        int var4 = this.field3000 == 255 ? arg0 : this.field3000;
        if (this.field2998) {
            this.field3001 = new class215(var4, arg0, arg1);
        } else {
            this.field3002 = new class58(var4, arg0, arg1);
        }
        if (arg2 != 15) {
            this.field3006 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lv;II)V")
    public void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5877) {
            field3010++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[[I")
    public final int[][] method1223(int arg0, int arg1, int arg2) {
        field3012++;
        int var4 = -115 % ((arg1 + 8) / 42);
        if (this.field3006[arg0].field2998) {
            int[] var5 = this.field3006[arg0].method31((byte) -30, arg2);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field3006[arg0].method32(arg2, false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)V")
    public static final void method1224(int arg0, int arg1, boolean arg2) {
        class90 var3 = class221.method1575(5, arg0, 1651481952);
        var3.method648((byte) -126);
        var3.field1621 = arg1;
        if (arg2) {
            field3024 = null;
        }
        field3007++;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field2995 = null;
        field3017 = null;
        field3021 = null;
        field3025 = null;
        field3022 = null;
        field3027 = null;
        field3020 = null;
        field3015 = null;
        field3019 = null;
        field3024 = null;
        field3026 = null;
        if (arg0 != 2) {
            method1224(23, 65, true);
        }
        field3014 = null;
        field3018 = null;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)I")
    public int method255(int arg0) {
        field2997++;
        if (arg0 != -25529) {
            method1224(103, -25, false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IZ)V")
    public class170(int arg0, boolean arg1) {
        this.field2998 = arg1;
        this.field3006 = new class170[arg0];
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)[I")
    public final int[] method1226(int arg0, int arg1, int arg2) {
        field2996++;
        int var4 = 49 % ((arg2 - 32) / 60);
        return this.field3006[arg0].field2998 ? this.field3006[arg0].method31((byte) -30, arg1) : this.field3006[arg0].method32(arg1, false)[0];
    }
}
