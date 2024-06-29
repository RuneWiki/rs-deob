import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class422 extends class27 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5904 = -1;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5908 = " is already on your friend list.";

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    public static boolean field5905 = false;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field5903 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lof;")
    public class422 field5906;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lof;")
    public class422 field5911;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[[[B")
    public static byte[][][] field5901;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIIIII)I")
    public static final int method2598(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -23) {
            field5908 = null;
        }
        field5902++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            return 7 - arg6 - (arg1 + -1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lhq;Ljava/lang/String;IZ)V")
    public static final void method2599(class175 arg0, String arg1, int arg2, boolean arg3) {
        field5910++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class442.field6362.method2055(arg1, (byte) -97, (class80[]) null, 250);
        int var8 = class442.field6362.method2050(arg1, (byte) -116, 250, (class80[]) null) * 13;
        class249.field3415.method95(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 - -var4, -16777216, 0);
        class249.field3415.method167(var5 - var4, var6 - var4, var4 + var4 + var7, var8 - -var4 - -var4, -1, 0);
        arg0.method1315(0, -1, var5, 1, (int[]) null, (byte) -112, var8, 1, 0, (class179) null, -1, var7, var6, (class80[]) null, arg1, 0);
        class215.method1471(0, var6 - var4, -var4 + var5, var4 + var7 + var4, var4 + var8 + var4);
        if (arg3) {
            class249.field3415.method246();
        }
        int var9 = 62 % ((arg2 + 35) / 54);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method2600(int arg0) {
        if (arg0 != 20236) {
            field5904 = 8;
        }
        field5908 = null;
        field5901 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public final void method2601(int arg0) {
        field5907++;
        if (this.field5906 == null) {
            return;
        }
        this.field5906.field5911 = this.field5911;
        this.field5911.field5906 = this.field5906;
        this.field5906 = null;
        this.field5911 = null;
        if (arg0 != 7) {
            this.method2601(76);
        }
    }
}
