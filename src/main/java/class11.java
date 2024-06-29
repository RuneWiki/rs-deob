import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    private int[] field198;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ldb;")
    public static class21 field201 = new class21(4096);

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
    public static int[] field205 = new int[50];

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Z")
    public static boolean field206 = false;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lhb;")
    private static class44 field210 = class102.method810("Friends", -28606);

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lhb;")
    public static class44 field209 = field210;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[I")
    public static int[] field213 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lhb;")
    private static class44 field207 = class102.method810("Use", -28606);

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lhb;")
    public static class44 field211 = field207;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lhb;")
    public static class44 field218 = class102.method810("Die Verbindung konnte", -28606);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lhb;")
    private static class44 field214 = class102.method810("Login limit exceeded)3", -28606);

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[I")
    public static int[] field217 = new int[128];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lhb;")
    public static class44 field208 = field214;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Ltd;")
    public static class116 field216;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Ltd;")
    public static class116 field219;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lpc;")
    public static class93 field204;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
    public static int[] field212;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "[I")
    public static int[] field215;

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([I)V", line = 10)
    public class11(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field198 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field198[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field198[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field198[var5 + var5] = arg0[var4];
            this.field198[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 57)
    public static final void method74(int arg0) {
        field200++;
        class117.field2868 = true;
        if (arg0 != 1) {
            field216 = null;
        }
        class41.method354(0);
        if (class47.field1152 != -1) {
            boolean var2 = class31.method307(0, 0, -7291, -1, 190, 261, 1, 0, class47.field1152);
            if (!var2) {
                class88.field2251 = true;
            }
        } else if (class107.field2728[class39.field873] != -1) {
            boolean var1 = class31.method307(0, 0, arg0 - 7292, -1, 190, 261, 1, 0, class107.field2728[class39.field873]);
            if (!var1) {
                class88.field2251 = true;
            }
        }
        if (class15.field289 && class25.field584 == 1) {
            if (class36.field869 == 1) {
                class44.method402(true);
            } else {
                class55.method504(-21975);
            }
        }
        class21.method151(true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I", line = 100)
    public static final int method75(boolean arg0) {
        field202++;
        int var1 = class55.method507(class51.field1279, class79.field1993, class130.field3122, -1);
        if (arg0) {
            method74(-12);
        }
        return var1 - class88.field2236 >= 800 || (class104.field2668[class79.field1993][class130.field3122 >> 7][class51.field1279 >> 7] & 0x4) == 0 ? 3 : class79.field1993;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 123)
    public static void method76(byte arg0) {
        field215 = null;
        field216 = null;
        field201 = null;
        field210 = null;
        field219 = null;
        field204 = null;
        field217 = null;
        field213 = null;
        field218 = null;
        field212 = null;
        field208 = null;
        field207 = null;
        field211 = null;
        field205 = null;
        field209 = null;
        field214 = null;
        if (arg0 != 24) {
            field219 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B[Lhb;)[Lhb;", line = 148)
    public static final class44[] method77(byte arg0, class44[] arg1) {
        field196++;
        class44[] var2 = new class44[5];
        int var3 = 100 % ((-arg0 - 61) / 54);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = class117.method903(new class44[] { class116.method893(10, var4), class96.field2433 }, false);
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = class117.method903(new class44[] { var2[var4], arg1[var4] }, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BII)Lhb;", line = 172)
    public static final class44 method78(int arg0, byte[] arg1, int arg2, int arg3) {
        class44 var4 = new class44();
        if (arg0 != -1224) {
            field217 = null;
        }
        field203++;
        var4.field1070 = 0;
        var4.field1074 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field1074[var4.field1070++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)I", line = 199)
    public final int method79(int arg0, byte arg1) {
        field197++;
        int var3 = this.field198.length - 2;
        if (arg1 != -31) {
            method78(100, null, -121, 117);
        }
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field198[var4];
            if (arg0 == var5) {
                return this.field198[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/awt/Component;II)Lpc;", line = 235)
    public static final class93 method80(byte arg0, Component arg1, int arg2, int arg3) {
        field199++;
        try {
            int var4 = 5 / ((12 - arg0) / 51);
            Class var5 = Class.forName("ga");
            class93 var6 = (class93) var5.getDeclaredConstructor().newInstance();
            var6.method142(arg3, arg2, 3651, arg1);
            return var6;
        } catch (Throwable var8) {
            class19 var7 = new class19();
            var7.method142(arg3, arg2, 3651, arg1);
            return var7;
        }
    }
}
