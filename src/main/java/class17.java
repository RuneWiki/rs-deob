import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 {

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "[I")
    public static int[] field186 = new int[128];

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lr;")
    public static class33 field192 = class29.method192("37(U", (byte) 126);

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lr;")
    public static class33 field191 = class29.method192("codeversion", (byte) 126);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Z")
    public static boolean field185 = false;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Lr;")
    public static class33 field189 = class29.method192("Transportation", (byte) 126);

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lb;")
    public static class3 field187;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field188;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 19)
    public static final byte[] method102(int arg0, Object arg1, boolean arg2) {
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg2 ? class32.method207(-119, var4) : var4;
        } else if (arg1 instanceof class30) {
            class30 var3 = (class30) arg1;
            return var3.method196(false);
        } else if (arg0 == 0) {
            throw new IllegalArgumentException();
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BIZI)Lr;", line = 53)
    public static final class33 method103(byte arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg1;
            arg3 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class33 var10 = new class33();
        var10.field465 = var7;
        var10.field470 = var6;
        if (arg0 == 43) {
            return var10;
        } else {
            return (class33) null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)Lr;", line = 116)
    public static final class33 method104(int arg0, int arg1) {
        class33 var2 = new class33();
        var2.field465 = new byte[arg1];
        var2.field470 = 0;
        if (arg0 > -29) {
            field186 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Z)V", line = 138)
    public static void method105(boolean arg0) {
        field192 = null;
        field186 = null;
        if (!arg0) {
            method107(27, null, -95, 26);
        }
        field191 = null;
        field189 = null;
        field188 = null;
        field187 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lc;III)Ld;", line = 166)
    public static final class7 method106(class5 arg0, int arg1, int arg2, int arg3) {
        if (class37.method252(arg3, -2, arg0, arg1)) {
            return arg2 >= -90 ? (class7) null : class22.method139(110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I[BII)Lr;", line = 184)
    public static final class33 method107(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -24344) {
            return (class33) null;
        }
        class33 var4 = new class33();
        var4.field470 = 0;
        var4.field465 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field465[var4.field470++] = arg1[var5];
            }
        }
        return var4;
    }
}
