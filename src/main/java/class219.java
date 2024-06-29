import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class219 extends class151 {

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    public int[] field3997 = new int[] { -1 };

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[I")
    public int[] field3998 = new int[1];

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3999 = -1;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "J")
    public static volatile long field3995 = 0L;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field4002 = 1;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    public static int[] field4001;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1366(int arg0, byte[] arg1, boolean arg2) {
        field3996++;
        int var3 = 6 % ((73 - arg0) / 40);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class116.field2216) {
            try {
                class92 var4 = (class92) Class.forName("se").getDeclaredConstructor().newInstance();
                var4.method570(arg1, -1222);
                return var4;
            } catch (Throwable var5) {
                class116.field2216 = true;
            }
        }
        return arg2 ? class38.method269(arg1, (byte) -123) : arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpb;IZILpb;)Lud;")
    public static final class218 method1367(class165 arg0, int arg1, boolean arg2, int arg3, class165 arg4) {
        field4000++;
        int[] var5 = arg4.method1074(arg3, (byte) -106);
        boolean var6 = true;
        for (int var7 = arg1; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method1080(var5[var7], (byte) 81, arg3);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method1080(var9, (byte) 81, 0);
                } else {
                    var10 = arg0.method1080(0, (byte) 81, var9);
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
            return new class218(arg4, arg0, arg3, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static int method1368(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field4001 = null;
        if (arg0 >= -126) {
            method1366(126, null, false);
        }
    }
}
