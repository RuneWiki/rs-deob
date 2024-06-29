import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class722 extends class281 {

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "Z")
    public volatile boolean field10051 = true;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "Ljw;")
    public static class581 field10054 = new class581(1, 2);

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "Ltk;")
    public static class364 field10057;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "Z")
    public boolean field10055;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "Z")
    public boolean field10056;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 5)
    public static void method4025(int arg0) {
        field10057 = null;
        if (arg0 == 909839010) {
            field10054 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([III[BI[[B[I[[B)I", line = 17)
    public static final int method4026(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[][] arg5, int[] arg6, byte[][] arg7) {
        field10053++;
        int var8 = arg6[arg4];
        int var9 = arg0[arg4] + var8;
        int var10 = arg6[arg2];
        int var11 = arg0[arg2] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg3[arg4] & 0xFF;
        if ((arg3[arg2] & 0xFF) < var14) {
            var14 = arg3[arg2] & 0xFF;
        }
        byte[] var15 = arg7[arg4];
        byte[] var16 = arg5[arg2];
        int var17 = var12 - var8;
        if (arg1 != 2) {
            method4026(null, 84, -3, null, -122, null, null, null);
        }
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILqn;)[Lpia;", line = 82)
    public static final class103[] method4027(int arg0, class70 arg1) {
        field10052++;
        if (!arg1.method620((byte) -10)) {
            return new class103[0];
        }
        class615 var2 = arg1.method619(-125);
        while (var2.field8321 == 0) {
            class438.method2636(true, 10L);
        }
        if (var2.field8321 == 2) {
            return new class103[0];
        }
        int[] var3 = (int[]) var2.field8318;
        class103[] var4 = new class103[var3.length >> 2];
        if (arg0 >= -109) {
            method4025(-63);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class103 var6 = new class103();
            var4[var5] = var6;
            var6.field1420 = var3[var5 << 2];
            var6.field1419 = var3[(var5 << 2) + 1];
            var6.field1418 = var3[(var5 << 2) + 2];
            var6.field1427 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)[B")
    public abstract byte[] method1123(byte arg0);

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)I")
    public abstract int method1120(int arg0);
}
