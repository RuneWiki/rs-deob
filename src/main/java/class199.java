import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class199 extends class129 {

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lrd;")
    public static class173 field3864 = class133.method843("settings", 55);

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Laf;")
    public static class7 field3865 = new class7(64);

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Z")
    public static boolean field3879 = false;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lrd;")
    public static class173 field3881 = class133.method843("; Max)2Age=", -95);

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[[I")
    public static int[][] field3877 = new int[104][104];

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    public int[] field3867;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[I")
    public int[] field3870;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
    public int[] field3872;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[Lwg;")
    public class222[] field3866;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "[Lwg;")
    public class222[] field3873;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "[[[B")
    public byte[][][] field3878;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
    public static final int method1317(boolean arg0) {
        field3875++;
        if (arg0) {
            method1319(false);
        }
        return 6;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1318(byte arg0) {
        class165.field3175.method1023(71, -21822);
        class165.field3175.method756(0L, 60);
        field3869++;
        if (arg0 == 113) {
            class111.field2050++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Ldg;")
    public static final class38 method1319(boolean arg0) {
        field3871++;
        try {
            if (!arg0) {
                field3880 = -1;
            }
            return (class38) Class.forName("jf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class47();
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static final void method1320(int arg0) {
        field3874++;
        class103.field1918.method283((byte) 13);
        for (int var1 = arg0; var1 < 32; var1++) {
            class9.field168[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class46.field955[var2] = 0L;
        }
        class8.field147 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static void method1321(int arg0) {
        field3877 = null;
        field3881 = null;
        field3864 = null;
        if (arg0 != -16860) {
            field3879 = true;
        }
        field3865 = null;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        if (arg0 != 0) {
            field3880 = 75;
        }
        field3868++;
        class217.field4200 = false;
        class107.field2003 = false;
    }
}
