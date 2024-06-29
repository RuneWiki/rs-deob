import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class404 extends class726 {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
    public boolean field5936 = false;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lmu;")
    public static class303 field5928 = new class303(11, 6);

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "B")
    public byte field5921;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "B")
    public byte field5926;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public int field5925;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public int field5931;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public int field5933;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public int field5934;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lga;")
    public class404 field5924;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Z")
    public boolean field5932;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lha;ILat;)V", line = 20)
    public static final void method2520(class59 arg0, int arg1, class378 arg2) {
        if (arg1 != -2) {
            method2520(null, -63, null);
        }
        field5930++;
        boolean var3 = class721.field9801.method163(arg2.field5348, (byte) -74, arg2.field5488, arg2.field5457, arg2.field5485 | 0xFF000000, arg2.field5354, arg0, arg2.field5396 ? class58.field1147.field8181 : null) == null;
        if (var3) {
            class729.field9868.method1273(new class54(arg2.field5488, arg2.field5457, arg2.field5348, arg2.field5485 | 0xFF000000, arg2.field5354, arg2.field5396), arg1 ^ 0x4ED2);
            class296.method1945(-9343, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lat;ILaa;IIIBILha;)V", line = 43)
    public static final void method2521(class378 arg0, int arg1, class487 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class59 arg8) {
        field5935++;
        class553 var9 = class72.field1322.method2136(arg3, (byte) 98);
        if (arg6 >= -52 || var9 == null || !var9.field7614 || !var9.method3180(class390.field5635, 69)) {
            return;
        }
        if (var9.field7636 != null) {
            int[] var10 = new int[var9.field7636.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var28;
                if (class438.field6252 == 4) {
                    var28 = (int) class451.field6366 & 0x3FFF;
                } else {
                    var28 = (int) class451.field6366 + class28.field748 & 0x3FFF;
                }
                int var29 = class255.field3698[var28];
                int var30 = class255.field3695[var28];
                if (class438.field6252 != 4) {
                    var29 = var29 * 256 / (class548.field7552 + 256);
                    var30 = var30 * 256 / (class548.field7552 + 256);
                }
                var10[var11 * 2] = ((arg4 + (var9.field7636[var11 * 2] * 4)) * var30 + (var9.field7636[var11 * 2 + 1] * 4 + arg7) * var29 >> 14) + (arg5 + (arg0.field5385 / 2));
                var10[var11 * 2 + 1] = arg0.field5465 / 2 + arg1 - ((var9.field7636[var11 * 2 + 1] * 4 + arg7) * var30 - (arg4 + (var9.field7636[var11 * 2] * 4)) * var29 >> 14);
            }
            class402.method2507(arg8, var10, var9.field7627, arg0.field5353, arg0.field5448);
            if (var9.field7629 > 0) {
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[var12 * 2 + 2];
                    int var23 = var10[(var12 + 1) * 2 + 1];
                    if (var20 > var22) {
                        int var25 = var20;
                        var20 = var22;
                        int var26 = var21;
                        var21 = var23;
                        var22 = var25;
                        var23 = var26;
                    } else if (var20 == var22 && var21 > var23) {
                        int var24 = var21;
                        var21 = var23;
                        var23 = var24;
                    }
                    arg8.method266(var20, var21, var22, var23, var9.field7617[var9.field7609[var12] & 0xFF], 1, arg2, arg5, arg1, var9.field7629, var9.field7620, var9.field7646);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var15 < var13) {
                    int var17 = var13;
                    var13 = var15;
                    int var18 = var14;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var14 > var16) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg8.method266(var13, var14, var15, var16, var9.field7617[var9.field7609[var9.field7609.length - 1] & 0xFF], 1, arg2, arg5, arg1, var9.field7629, var9.field7620, var9.field7646);
            } else {
                for (int var27 = 0; var27 < var10.length / 2 - 1; var27++) {
                    arg8.method187(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 3], var9.field7617[var9.field7609[var27] & 0xFF], 1, arg2, arg5, arg1);
                }
                arg8.method187(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7617[var9.field7609[var9.field7609.length - 1] & 0xFF], 1, arg2, arg5, arg1);
            }
        }
        class496 var31 = null;
        if (var9.field7623 != -1) {
            var31 = var9.method3181(false, arg8, (byte) 127);
            if (var31 != null) {
                class256.method1739(arg1, var31, arg5, arg0, arg2, arg7, 2, arg4);
            }
        }
        if (var9.field7642 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1619();
        }
        class60 var33 = class214.field3046;
        class597 var34 = class635.field8727;
        if (var9.field7621 == 1) {
            var33 = class355.field5007;
            var34 = class308.field4276;
        }
        if (var9.field7621 == 2) {
            var34 = class140.field2316;
            var33 = class168.field2634;
        }
        class511.method2994(var34, var9.field7625, arg2, arg7, arg5, var9.field7642, arg1, var33, var32, arg0, arg4, 100);
        return;
    }

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "(I)V", line = 224)
    public static void method2522(int arg0) {
        field5928 = null;
        if (arg0 != 1) {
            field5928 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lab;III)I", line = 235)
    public final int method2523(class669[] arg0, int arg1, int arg2, int arg3) {
        field5929++;
        if (arg2 != -2) {
            this.field5921 = 33;
        }
        long var5 = class582.field7967[this.field5926][arg1][arg3];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg0[var9++] = class394.field5788[var10 - 1].field18;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "(I)I", line = 285)
    public int method54(int arg0) {
        if (arg0 >= -109) {
            method2521(null, 23, null, -94, -53, 18, (byte) -3, 35, null);
        }
        field5923++;
        return 0;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)Z")
    public abstract boolean method45(int arg0);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Z")
    public abstract boolean method49(byte arg0);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)Z")
    public abstract boolean method939(int arg0);

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)I")
    public abstract int method37(int arg0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public abstract void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lha;I)Lhw;")
    public abstract class132 method40(class59 arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
    public abstract boolean method937(byte arg0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lab;I)I")
    public abstract int method935(class669[] arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILha;)Ljda;")
    public abstract class228 method41(int arg0, class59 arg1);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Lha;I)V")
    public abstract void method31(class59 arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "(I)Z")
    public abstract boolean method35(int arg0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lha;III)Z")
    public abstract boolean method42(class59 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public abstract void method44(boolean arg0);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)I")
    public abstract int method38(boolean arg0);
}
