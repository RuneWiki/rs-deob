import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class223 extends class617 {

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    public volatile boolean field2767 = true;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lcq;")
    public static class110 field2773 = null;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lko;")
    public static class259 field2771 = new class259("WIP", 2);

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Lsb;")
    public static class305 field2774 = new class305(54, -1);

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2772;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Z")
    public boolean field2768;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Z")
    public boolean field2770;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILwn;IIB)V", line = 5)
    public static final void method1347(int arg0, class236 arg1, int arg2, int arg3, byte arg4) {
        field2769++;
        int var5 = arg1.field9517[0];
        int var6 = arg1.field9513[0];
        if (var5 < 0 || var5 >= class142.field1574 || var6 < 0 || var6 >= class140.field1550 || arg3 < 0 || arg3 >= class142.field1574 || arg0 < 0 || class140.field1550 <= arg0) {
            return;
        }
        int var7 = class20.method94(arg0, class68.field682, 0, 0, class220.field2623, true, -4, class282.field3534[arg1.field5166], arg1.method1414(arg2 - 31789), var5, var6, (byte) -111, arg3, 0, arg2);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg1.method1410(class220.field2623[var8], arg4, class68.field682[var8], arg2 ^ 0xFFFFFFF6);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 42)
    public static void method1348(int arg0) {
        field2771 = null;
        field2772 = null;
        field2773 = null;
        field2774 = null;
        if (arg0 < 38) {
            field2774 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[BIIIII[BI)V", line = 56)
    public static final void method1350(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field2766++;
        int var9 = -(arg0 >> 2);
        if (arg2 > -62) {
            method1348(-88);
        }
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg1[var10001] += arg7[arg3++];
                int var14 = arg4++;
                arg1[var14] += arg7[arg3++];
                int var15 = arg4++;
                arg1[var15] += arg7[arg3++];
                int var16 = arg4++;
                arg1[var16] += arg7[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg1[var10001] += arg7[arg3++];
            }
            arg3 += arg5;
            arg4 += arg8;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)[B")
    public abstract byte[] method1349(int arg0);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
    public abstract int method1351(byte arg0);
}
