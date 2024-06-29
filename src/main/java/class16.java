import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field206 = "Starting 3d Library";

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "J")
    public static long field205 = 0L;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public static boolean field207 = true;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field204 = "Loading textures - ";

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I", line = 11)
    public static final int method118(byte arg0) {
        int var1 = 34 / ((arg0 + 29) / 47);
        field203++;
        if (class228.field3489 == null) {
            return -1;
        }
        while (class228.field3489.field291 > class338.field5250) {
            if (class228.field3489.method196(class338.field5250, 4915)) {
                return class338.field5250++;
            }
            class338.field5250++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjd;Ljd;II)Ll;", line = 45)
    public static final class10 method119(boolean arg0, class95 arg1, class95 arg2, int arg3, int arg4) {
        int[] var5 = arg1.method688(arg4, 23201);
        field208++;
        boolean var6 = true;
        if (arg3 != -22403) {
            return (class10) null;
        }
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg1.method691(arg4, (byte) 124, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method691(0, (byte) 52, var9);
                } else {
                    var10 = arg2.method691(var9, (byte) 99, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class10(arg1, arg2, arg4, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 103)
    public static void method120(int arg0) {
        field206 = null;
        field204 = null;
        if (arg0 != 0) {
            field206 = (String) null;
        }
    }
}
