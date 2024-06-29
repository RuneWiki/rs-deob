import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class318 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lid;")
    public static class412 field4510 = new class412(0);

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[[I")
    public static int[][] field4515 = new int[6][];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZBII)Ljava/lang/String;", line = 4)
    public static final String method1981(boolean arg0, byte arg1, int arg2, int arg3) {
        field4511++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - arg2 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            if (arg1 != -70) {
                method1981(true, (byte) -62, 95, -120);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field4509++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I", line = 68)
    public final int method1982(int arg0) {
        field4512++;
        if (arg0 != 2) {
            field4513 = 47;
        }
        return this.field4508;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(II)V", line = 84)
    public class318(int arg0, int arg1) {
        this.field4508 = arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIZBIFI)[[I", line = 95)
    public static final int[][] method1983(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, float arg7, int arg8) {
        if (arg5 >= -79) {
            field4510 = null;
        }
        field4506++;
        int[][] var9 = new int[arg6][arg1];
        class424 var10 = new class424();
        var10.field6258 = (int) (arg7 * 4096.0F);
        var10.field6264 = arg4;
        var10.field6250 = arg8;
        var10.field6263 = arg2;
        var10.field6251 = arg3;
        var10.method269(false);
        class258.method1662(arg6, 9188, arg1);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method2592(var9[var11], (byte) 122, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 126)
    public static void method1984(byte arg0) {
        int var1 = -24 % ((56 - arg0) / 50);
        field4515 = null;
        field4510 = null;
    }
}
