import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class52 extends class393 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[Liu;")
    public static class424[] field706 = new class424[14];

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lbo;")
    public static class179 field715;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lf;")
    public static class404 field716;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Ljava/lang/String;")
    public String field705;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[II[[B[B[[B[I)I", line = 5)
    public static final int method310(int arg0, int arg1, int[] arg2, int arg3, byte[][] arg4, byte[] arg5, byte[][] arg6, int[] arg7) {
        field704++;
        int var8 = arg7[arg0];
        int var9 = arg2[arg0] + var8;
        int var10 = arg7[arg3];
        if (arg1 != 26415) {
            field707 = 75;
        }
        int var11 = arg2[arg3] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg5[arg0] & 0xFF;
        if ((arg5[arg3] & 0xFF) < var14) {
            var14 = arg5[arg3] & 0xFF;
        }
        byte[] var15 = arg4[arg0];
        byte[] var16 = arg6[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 74)
    public static void method311(int arg0) {
        field716 = null;
        field715 = null;
        field706 = null;
        if (arg0 != -22030) {
            field707 = 93;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 89)
    public static final void method312(int arg0, int arg1, int arg2) {
        field713++;
        if (arg1 != -18602) {
            field707 = -27;
        }
        if (class494.field7234 == class10.field134) {
            if (!class411.method2431(1, 0, false, 1, -1, arg0, arg2, 0, -2)) {
                class411.method2431(1, 0, false, 1, -1, arg0, arg2, 0, -3);
            }
        } else if (!class411.method2431(1, 0, false, 1, arg1 ^ 0x48A9, arg0, arg2, 0, -3)) {
            class411.method2431(1, 0, false, 1, -1, arg0, arg2, 0, -2);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 116)
    public static final boolean method313(String arg0, int arg1) {
        field708++;
        if (arg0 == null) {
            return false;
        } else if (arg1 <= 10) {
            return false;
        } else {
            for (int var2 = 0; var2 < class104.field1424; var2++) {
                if (arg0.equalsIgnoreCase(class53.field718[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class246.field3153[var2])) {
                    return true;
                }
            }
            return false;
        }
    }
}
