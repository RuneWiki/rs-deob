import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class481 extends class8 {

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "[[[I")
    public static int[][][] field7159 = new int[2][][];

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field7163 = -1;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field7156;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field7158;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field7160;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Z")
    public boolean field7154;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        if (arg0) {
            this.method22((byte) 1);
        }
        field7155++;
        return false;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2863(String arg0, int arg1) {
        if (arg1 != 0) {
            method2863(null, 24);
        }
        field7165++;
        if (!arg0.equals("")) {
            class28.method321(class77.field1298, -5001);
            class232.field3380++;
            class410.field6141.method1109(false, class217.method1444(arg0, -122));
            class410.field6141.method1089((byte) -89, arg0);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            field7163 = 120;
        }
        field7161++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2864(int arg0) {
        if (arg0 == 3934) {
            field7159 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIZII)V")
    public static final void method2865(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7164++;
        if (arg5 != 0) {
            method2863(null, 29);
        }
        long var6 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
        class328 var8 = (class328) class109.field1831.method171((byte) -112, var6);
        if (var8 == null) {
            var8 = new class328();
            class109.field1831.method166(var8, var6, arg5 ^ 0xFFFFFF85);
        }
        if (var8.field4957.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field4957.length; var11++) {
                var9[var11] = var8.field4957[var11];
                var10[var11] = var8.field4960[var11];
            }
            for (int var12 = var8.field4957.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field4957 = var9;
            var8.field4960 = var10;
        }
        var8.field4957[arg1] = arg2;
        var8.field4960[arg1] = arg4;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        field7162++;
        if (arg0 == -3) {
            throw new IllegalStateException();
        }
    }
}
