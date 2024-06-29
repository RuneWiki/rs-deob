import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class311 extends class86 {

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Lgn;")
    public static class475 field4522 = new class475(9, 8);

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "[I")
    public static int[] field4529 = new int[1];

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4528 = null;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "[Log;")
    public static class441[] field4527;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)V")
    public static void method1861(byte arg0) {
        int var1 = 10 % ((arg0 + 23) / 47);
        field4528 = null;
        field4522 = null;
        field4527 = null;
        field4529 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1862(int arg0, int arg1, byte[] arg2, int arg3) {
        field4521++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = arg3; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class409.field6005[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)[Lpj;")
    public static final class94[] method1863(int arg0) {
        if (arg0 <= 23) {
            return null;
        } else {
            field4523++;
            return new class94[] { class186.field2640, class324.field4738, class443.field6473 };
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)Z")
    public static final boolean method1864(int arg0, int arg1, int arg2) {
        field4524++;
        if (arg2 > -113) {
            return true;
        } else {
            return (arg1 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lis;IIIII)V")
    public static final void method1865(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4795 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field4791[var6] != null) {
                arg0.field4795++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4795; var7++) {
            long var8 = class310.field4512[arg1][arg2][arg3];
            while (var8 != 0L) {
                class373 var14 = class76.field1084[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field4791[var7] == var14.field5595) {
                    continue label50;
                }
            }
            long var10 = class310.field4512[arg1][arg4][arg5];
            while (var10 != 0L) {
                class373 var13 = class76.field1084[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field4791[var7] == var13.field5595) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field4795 - 1; var12++) {
                arg0.field4791[var12] = arg0.field4791[var12 + 1];
            }
            arg0.field4795--;
        }
    }
}
