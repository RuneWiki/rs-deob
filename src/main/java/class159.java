import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class159 extends class57 {

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private final int field2682;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private final int field2684;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private final int field2686;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private final int field2676;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private final int field2678;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private final int field2687;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private final int field2685;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private final int field2677;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lhd;")
    public static class117 field2681 = new class117(64);

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lhd;")
    public static class117 field2689 = new class117(500);

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[I")
    public static int[] field2690 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Lok;")
    private static class146 field2693 = class235.method1724(-12908, "rating: ");

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lok;")
    public static class146 field2691 = field2693;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lwi;")
    public static class256 field2692;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
    public static boolean field2694;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 5)
    public final void method259(int arg0, int arg1, int arg2) {
        field2688++;
        int var4 = this.field2687 * arg1 >> 12;
        int var5 = this.field2684 * arg2 >> 12;
        if (arg0 != -27128) {
            return;
        }
        int var6 = this.field2686 * arg1 >> 12;
        int var7 = this.field2677 * arg1 >> 12;
        int var8 = this.field2678 * arg2 >> 12;
        int var9 = this.field2676 * arg2 >> 12;
        int var10 = this.field2685 * arg1 >> 12;
        int var11 = this.field2682 * arg2 >> 12;
        class267.method1941(this.field1002, var7, var6, true, var9, var8, var4, var10, var11, var5);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V", line = 33)
    public final void method258(byte arg0, int arg1, int arg2) {
        if (arg0 != -27) {
            method1247();
        }
        field2679++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 48)
    public static void method1246(int arg0) {
        field2693 = null;
        if (arg0 <= 15) {
            method1246(-45);
        }
        field2690 = null;
        field2692 = null;
        field2691 = null;
        field2681 = null;
        field2689 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 63)
    public static final void method1247() {
        GL var0 = class271.field4641;
        var0.glDisableClientState(32886);
        class271.method1989(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class271.method1960();
        for (int var1 = 0; var1 < class278.field4781[0].length; var1++) {
            class286 var2 = class278.field4781[0][var1];
            if (var2.field4871 >= 0 && class109.field1747.method822(var2.field4871, (byte) 119) == 4) {
                var0.glColor4fv(class37.method264(-128, var2.field4882), 0);
                float var3 = 201.5F - (var2.field4874 ? 1.0F : 0.5F);
                var2.method2056(class203.field3382, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class271.method1981();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class271.method1963();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)V", line = 100)
    public final void method260(int arg0, int arg1, byte arg2) {
        if (arg2 < 53) {
            this.method260(13, -92, (byte) 8);
        }
        field2680++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method1248(boolean arg0) {
        class92.field1464 = -1;
        class101.field1633 = -3;
        class43.field745 = arg0;
        class182.field3053 = 0;
        class13.field248 = 0;
        class264.field4515 = 1;
        class276.field4744 = 0;
        field2683++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V", line = 127)
    public static final void method1249(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class161.field2732; var3++) {
            for (int var4 = 0; var4 < class189.field3124; var4++) {
                for (int var5 = 0; var5 < class192.field3168; var5++) {
                    class11 var6 = class203.field3382[var3][var4][var5];
                    if (var6 != null) {
                        class278 var7 = var6.field212;
                        if (var7 != null && var7.field4779.method947()) {
                            class250.method1827(var7.field4779, var3, var4, var5, 1, 1);
                            if (var7.field4774 != null && var7.field4774.method947()) {
                                class250.method1827(var7.field4774, var3, var4, var5, 1, 1);
                                var7.field4779.method945(var7.field4774, 0, 0, 0, false);
                                var7.field4774 = var7.field4774.method950(arg0, arg1, arg2);
                            }
                            var7.field4779 = var7.field4779.method950(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field218; var8++) {
                            class311 var9 = var6.field217[var8];
                            if (var9 != null && var9.field5300.method947()) {
                                class250.method1827(var9.field5300, var3, var4, var5, var9.field5302 + 1 - var9.field5296, var9.field5299 - var9.field5294 + 1);
                                var9.field5300 = var9.field5300.method950(arg0, arg1, arg2);
                            }
                        }
                        class164 var10 = var6.field205;
                        if (var10 != null && var10.field2785.method947()) {
                            class234.method1713(var10.field2785, var3, var4, var5);
                            var10.field2785 = var10.field2785.method950(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 211)
    public class159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2682 = arg7;
        this.field2684 = arg1;
        this.field2686 = arg0;
        this.field2676 = arg5;
        this.field2678 = arg3;
        this.field2687 = arg2;
        this.field2685 = arg6;
        this.field2677 = arg4;
    }
}
