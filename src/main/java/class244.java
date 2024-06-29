import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class244 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Loa;")
    private static class99 field4205 = class221.method1463(2844, "Connected to update server");

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Loa;")
    public static class99 field4204 = field4205;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
    public static boolean field4209 = false;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Loa;")
    private static class99 field4216 = class221.method1463(2844, "M");

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Loa;")
    private static class99 field4206 = class221.method1463(2844, "Allocated memory");

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Loa;")
    public static class99 field4213 = field4206;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Loa;")
    public static class99 field4211 = field4216;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Loa;")
    public static class99 field4214 = field4216;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field4217 = 10;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lge;")
    public static class70 field4208;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method1578(int arg0, int arg1) {
        if (arg0 != 28462) {
            field4213 = null;
        }
        field4215++;
        class65 var2 = class152.method1010(arg1, 6, (byte) -119);
        var2.method426((byte) 92);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method1579(int arg0, int arg1) {
        field4210++;
        if (arg0 == 100 && class138.field2438 > 0) {
            byte[] var2 = class133.field2330[--class138.field2438];
            class133.field2330[class138.field2438] = null;
            return var2;
        } else if (arg0 == 5000 && class9.field81 > 0) {
            byte[] var3 = class236.field4071[--class9.field81];
            class236.field4071[class9.field81] = null;
            return var3;
        } else if (arg0 == arg1 && class92.field1553 > 0) {
            byte[] var4 = class111.field1994[--class92.field1553];
            class111.field1994[class92.field1553] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1580(int arg0) {
        field4208 = null;
        field4213 = null;
        field4211 = null;
        field4205 = null;
        if (arg0 == -18945) {
            field4216 = null;
            field4204 = null;
            field4206 = null;
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
