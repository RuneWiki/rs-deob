import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class288 extends class175 {

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    private int field4834 = -32768;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "J")
    public static long field4833 = 0L;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lhi;")
    private static class82 field4839 = class95.method664((byte) -78, "Continue");

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Z")
    public static boolean field4841 = false;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lhi;")
    public static class82 field4836 = class95.method664((byte) -55, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
    public static boolean field4838 = false;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Lhi;")
    public static class82 field4845 = class95.method664((byte) -123, "www");

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lhi;")
    public static class82 field4846 = field4839;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIILrm;Lrm;IIIIJ)V", line = 4)
    public static final void method1993(int arg0, int arg1, int arg2, int arg3, class175 arg4, class175 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class182 var12 = new class182();
        var12.field3106 = arg10;
        var12.field3119 = arg1 * 128 + 64;
        var12.field3109 = arg2 * 128 + 64;
        var12.field3102 = arg3;
        var12.field3103 = arg4;
        var12.field3107 = arg5;
        var12.field3111 = arg6;
        var12.field3105 = arg7;
        var12.field3116 = arg8;
        var12.field3118 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class15.field120[var13][arg1][arg2] == null) {
                class15.field120[var13][arg1][arg2] = new class16(var13, arg1, arg2);
            }
        }
        class15.field120[arg0][arg1][arg2].field172 = var12;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 34)
    public static void method1994(byte arg0) {
        field4839 = null;
        field4846 = null;
        field4836 = null;
        if (arg0 != -88) {
            field4836 = (class82) null;
        }
        field4845 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()I", line = 48)
    public final int method238() {
        field4832++;
        return this.field4834;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lth;", line = 58)
    public static final class260 method1995(boolean arg0, int arg1) {
        field4837++;
        class260 var2 = (class260) class260.field4458.method2175((long) arg1, 3008);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method1993(80, -66, 93, 41, (class175) null, (class175) null, -121, -93, -75, -19, -11L);
        }
        byte[] var3 = class242.field4207.method1577(3, arg1, -29569);
        class260 var4 = new class260();
        if (var3 != null) {
            var4.method1862(-1, new class153(var3));
        }
        class260.field4458.method2169(var4, (long) arg1, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V", line = 87)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4843++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 108)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        class155 var13 = class273.method1912(this.field4840, -128).method2148(0, this.field4844, (class35) null, -42);
        field4842++;
        if (var13 != null) {
            var13.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4834 = var13.method238();
        }
    }
}
