import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class790 extends class394 {

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    private int field10839;

    @OriginalMember(owner = "client!wia", name = "u", descriptor = "Lwk;")
    private class151 field10848;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
    private int field10841;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    private int field10840;

    @OriginalMember(owner = "client!wia", name = "w", descriptor = "I")
    private int field10850;

    @OriginalMember(owner = "client!wia", name = "x", descriptor = "I")
    private int field10851;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    private int field10843;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "Z")
    public static boolean field10837 = true;

    @OriginalMember(owner = "client!wia", name = "s", descriptor = "[I")
    public static int[] field10846 = new int[1024];

    @OriginalMember(owner = "client!wia", name = "q", descriptor = "I")
    public static int field10844 = -1;

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "Lke;")
    public static class622 field10842 = new class622(121, 6);

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public static int field10838;

    @OriginalMember(owner = "client!wia", name = "t", descriptor = "I")
    public static int field10847;

    @OriginalMember(owner = "client!wia", name = "v", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!wia", name = "r", descriptor = "Lbv;")
    private class320 field10845;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(I)V")
    public static void method4320(int arg0) {
        field10846 = null;
        field10842 = null;
        if (arg0 != 21915) {
            method4320(-28);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
    public static final void method4321(byte arg0) {
        if (arg0 != -91) {
            method4321((byte) -26);
        }
        class277.field3851 = null;
        class760.field10483 = null;
        field10847++;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)Lbv;")
    public final class320 method2402(int arg0) {
        field10849++;
        if (arg0 != 8) {
            field10837 = false;
        }
        if (this.field10845 == null) {
            class600.field8461[2] = this.field10843;
            class600.field8461[3] = this.field10851;
            class600.field8461[5] = this.field10840;
            class600.field8461[0] = this.field10850;
            class159 var2 = this.field10848.field883;
            class600.field8461[1] = this.field10839;
            class600.field8461[4] = this.field10841;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1262(class600.field8461[var5], (byte) 96)) {
                    return null;
                }
                class181 var7 = var2.method1263(class600.field8461[var5], (byte) 120);
                int var8 = var7.field2742 ? 64 : 128;
                if (var7.field2758 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class391.field5550[var6] = var2.method1261(class600.field8461[var6], var4, class470.method2786(arg0, -13748), false, 1.0F, var4);
            }
            this.field10845 = this.field10848.method1066(class391.field5550, var3 != 0, -104, var4);
        }
        return this.field10845;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lcb;ZLhk;ZIII)V")
    public static final void method4322(class544 arg0, boolean arg1, class110 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class452.method2719(arg0, arg5, arg1, 0, arg6, arg4);
        field10838++;
        if (!arg3) {
            field10837 = true;
        }
        class733.field10242 = arg2;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lwk;IIIIII)V")
    public class790(class151 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10839 = arg2;
        this.field10848 = arg0;
        this.field10841 = arg5;
        this.field10840 = arg6;
        this.field10850 = arg1;
        this.field10851 = arg4;
        this.field10843 = arg3;
    }
}
