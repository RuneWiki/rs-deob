import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 {

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "I")
    public static int field178 = -1;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Lh;")
    public static class15 field182 = class18.method153("sprites", 1);

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Lh;")
    public static class15 field181 = class18.method153("Overview", 1);

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    public static int field180 = -1;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[I")
    public static int[] field176 = new int[128];

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Z")
    public static boolean field183 = false;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "[B")
    public static byte[] field179;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[I")
    public static int[] field175;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 35)
    public static final void method96(int arg0) {
        if (arg0 >= -73) {
            method96(-23);
        }
        class14.field215 = null;
        class21.field294 = null;
        class13.field192 = null;
        class10.field136 = null;
        class14.field208 = null;
        class9.field118 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)V", line = 69)
    public static void method97(int arg0) {
        field175 = null;
        field181 = null;
        field179 = null;
        field176 = null;
        if (arg0 >= -89) {
            method97(62);
        }
        field182 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZZII)Lh;", line = 100)
    public static final class15 method98(boolean arg0, boolean arg1, int arg2, int arg3) {
        int var4 = 1;
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var5 = arg3 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg2;
            arg3 /= arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class15 var10 = new class15();
        if (arg1) {
            return (class15) null;
        } else {
            var10.field219 = var7;
            var10.field229 = var6;
            return var10;
        }
    }
}
