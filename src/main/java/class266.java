import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class266 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4783 = 0;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4785 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lgf;")
    public static class7 field4777;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        if (arg0 != 35) {
            method1769((byte) -39);
        }
        field4777 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILbc;)V")
    public static final void method1770(int arg0, class100 arg1) {
        field4779++;
        for (int var2 = 0; var2 < class63.field1197.length; var2++) {
            class63.field1197[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class63.field1197[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class228.field4135[var15] = (class63.field1197[var15 - 1] - (-class63.field1197[var15 + 1] - (class63.field1197[var15 + 128] + class63.field1197[var15 - 128]))) / 4;
                }
            }
            int[] var13 = class63.field1197;
            class63.field1197 = class228.field4135;
            class228.field4135 = var13;
        }
        if (arg0 >= -70) {
            field4785 = 3;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3936; var7++) {
            for (int var8 = 0; var8 < arg1.field3940; var8++) {
                if (arg1.field1788[var6++] != 0) {
                    int var9 = arg1.field3937 + var7 + 16;
                    int var10 = var8 + arg1.field3941 + 16;
                    int var11 = (var9 << 7) + var10;
                    class63.field1197[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method1771(int arg0) {
        field4780++;
        class1.field13.method823(true);
        if (arg0 != 0) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lfj;IIIIILdl;Li;)V")
    public static final void method1772(class209 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class32 arg6, class187 arg7) {
        field4786++;
        class124 var8 = new class124();
        var8.field2162 = arg2 * 128;
        var8.field2176 = arg4;
        var8.field2180 = arg3 * arg5;
        if (arg0 != null) {
            var8.field2166 = arg0.field3880 * 128;
            var8.field2179 = arg0.field3858;
            var8.field2177 = arg0.field3864;
            var8.field2174 = arg0;
            int var10 = arg0.field3836;
            int var11 = arg0.field3877;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg0.field3877;
                var11 = arg0.field3836;
            }
            var8.field2172 = arg0.field3878;
            var8.field2169 = (arg3 + var11) * 128;
            var8.field2163 = (arg2 + var10) * 128;
            var8.field2175 = arg0.field3873;
            if (arg0.field3868 != null) {
                var8.field2167 = true;
                var8.method749(103);
            }
            if (var8.field2179 != null) {
                var8.field2182 = (int) ((double) (var8.field2177 - var8.field2172) * Math.random()) + var8.field2172;
            }
            class57.field1103.method1290((byte) -44, var8);
        } else if (arg7 != null) {
            var8.field2164 = arg7;
            class85 var9 = arg7.field3384;
            if (var9.field1538 != null) {
                var8.field2167 = true;
                var9 = var9.method489(-23677);
            }
            if (var9 != null) {
                var8.field2163 = (var9.field1531 + arg2) * 128;
                var8.field2169 = (arg3 + var9.field1531) * 128;
                var8.field2175 = class145.method921(-1, arg7);
                var8.field2166 = var9.field1532 * 128;
            }
            class285.field5001.method1290((byte) -44, var8);
        } else if (arg6 != null) {
            var8.field2181 = arg6;
            var8.field2169 = (arg6.method218((byte) 111) + arg3) * 128;
            var8.field2163 = (arg6.method218((byte) -127) + arg2) * 128;
            var8.field2175 = class272.method1799(arg6, 29875);
            var8.field2166 = arg6.field543 * 128;
            class254.field4565.method1825(var8, (byte) 64, arg6.field518.method874(7));
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)Lrg;")
    public static final class80 method1773(int arg0, byte arg1, int arg2) {
        field4781++;
        for (class80 var3 = (class80) class268.field4799.method1294(false); var3 != null; var3 = (class80) class268.field4799.method1292((byte) 82)) {
            if (var3.field1452 && var3.method450(arg2, arg0, (byte) 106)) {
                return var3;
            }
        }
        if (arg1 >= -28) {
            method1770(67, (class100) null);
        }
        return null;
    }
}
