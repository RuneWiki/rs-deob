import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class478 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field6976 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lpi;")
    public static class340 field6974 = new class340(69, 3);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[B")
    public static byte[][][] field6978;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 3)
    public static void method2866(int arg0) {
        field6974 = null;
        if (arg0 != 1) {
            method2867(67);
        }
        field6978 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2867(int arg0) {
        field6975++;
        for (int var1 = 0; var1 < 5; var1++) {
            class102.field1396[var1] = false;
        }
        class289.field3694 = 0;
        class445.field6190 = -1;
        class93.field1304 = 0;
        class174.field2245 = -1;
        class396.field5271 = 1;
        if (arg0 != -27396) {
            field6976 = -97;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ldn;Ldn;Lli;Ldn;I)Z", line = 43)
    public static final boolean method2868(class201 arg0, class201 arg1, class382 arg2, class201 arg3, int arg4) {
        if (arg4 != 21909) {
            return false;
        }
        field6973++;
        class299.field3880 = arg1;
        class117.field1641 = arg2;
        class23.field417 = arg0;
        class474.field6924 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lsc;IIIII)V", line = 61)
    public static final void method2869(class265 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3363 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3359[var6] != null) {
                arg0.field3363++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3363; var7++) {
            long var8 = class83.field1033[arg1][arg2][arg3];
            while (var8 != 0L) {
                class86 var14 = class121.field1683[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3359[var7] == var14.field1155) {
                    continue label50;
                }
            }
            long var10 = class83.field1033[arg1][arg4][arg5];
            while (var10 != 0L) {
                class86 var13 = class121.field1683[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3359[var7] == var13.field1155) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3363 - 1; var12++) {
                arg0.field3359[var12] = arg0.field3359[var12 + 1];
            }
            arg0.field3363--;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Ltg;", line = 116)
    public static final class510 method2870(int arg0, int arg1, int arg2) {
        if (class470.field6877[arg0][arg1][arg2] == null) {
            boolean var3 = class470.field6877[0][arg1][arg2] != null && class470.field6877[0][arg1][arg2].field7483 != null;
            if (var3 && arg0 >= class412.field5495 - 1) {
                return null;
            }
            class234.method1482(arg0, arg1, arg2);
        }
        return class470.field6877[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 130)
    public static final void method2871(int arg0, boolean arg1) {
        class4.field38 = arg0;
        field6977++;
        class212.field2721.method90((byte) -27);
        if (arg1) {
            method2867(86);
        }
    }
}
