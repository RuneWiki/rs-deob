import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class182 extends class270 {

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lvq;")
    public static class22 field2688 = new class22();

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "Z")
    public static boolean field2689 = true;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "[I")
    public static int[] field2692 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Ldp;")
    public static class174 field2690;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "[[[B")
    public static byte[][][] field2691;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V", line = 4)
    private class182(int arg0) {
        super(0, false);
        this.method1418(arg0, 2);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILvj;Ljava/lang/String;Z)V", line = 13)
    public static final void method1416(boolean arg0, int arg1, class177 arg2, String arg3, boolean arg4) {
        ++field2682;
        if (!arg4) {
            class435.method2728(arg2, 108, arg3, 3);
        } else {
            if (class177.field2652.startsWith("win") && class177.field2636 != 3) {
                String var5 = null;
                if (arg2.field2639 != null) {
                    var5 = arg2.field2639.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class131 var6 = class435.method2728(arg2, -81, arg3, 0);
                    class121.field1900 = arg2;
                    class55.field893 = arg3;
                    class20.field293 = var6;
                    return;
                }
            }
            if (class177.field2652.startsWith("mac")) {
                String var7 = null;
                if (arg2.field2639 != null) {
                    var7 = arg2.field2639.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg0) {
                    class435.method2728(arg2, -68, arg3, 1);
                    return;
                }
            }
            class435.method2728(arg2, 122, arg3, 2);
        }
        if (arg1 >= -102) {
            method1419(-26, -120, -11, -65);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V", line = 80)
    public static void method1417(byte arg0) {
        field2691 = null;
        field2692 = null;
        field2690 = null;
        field2688 = null;
        if (arg0 >= -82) {
            method1419(-7, 52, -43, 115);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)[[I", line = 95)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2683;
        int[][] var3 = super.field4046.method244(arg1, 122);
        if (super.field4046.field488) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class161.field2445; ++var7) {
                var4[var7] = this.field2686;
                var5[var7] = this.field2685;
                var6[var7] = this.field2684;
            }
        }
        if (!arg0) {
            this.method1418(-54, -69);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V", line = 134)
    private final void method1418(int arg0, int arg1) {
        this.field2684 = 4080 & arg0 << 4;
        this.field2685 = (arg0 & 65280) >> 4;
        if (arg1 != 2) {
            this.field2685 = 109;
        }
        this.field2686 = 4080 & arg0 >> 12;
        ++field2687;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 153)
    public class182() {
        this(0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)Lpe;", line = 156)
    public static final class390 method1419(int arg0, int arg1, int arg2, int arg3) {
        ++field2681;
        class168 var4 = class443.field6447[arg2][arg1][arg3];
        if (var4 == null) {
            return null;
        } else {
            class390 var5 = null;
            int var6 = -1;
            for (class36 var7 = var4.field2488; var7 != null; var7 = var7.field505) {
                class447 var8 = var7.field511;
                if (var8 instanceof class390) {
                    class390 var9 = (class390) var8;
                    int var10 = 64 * (var9.method1070((byte) -50) + -1) - -60;
                    int var11 = -var10 + var9.field6520 >> 7;
                    int var12 = -var10 + var9.field6519 >> 7;
                    int var13 = var9.field6520 + var10 >> 7;
                    int var14 = var9.field6519 + var10 >> 7;
                    if (arg1 >= var11 && ~var12 >= ~arg3 && arg1 <= var13 && arg3 <= var14) {
                        int var15 = (var13 - (arg1 + -1)) * (var14 + 1 - arg3);
                        if (var6 < var15) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            if (arg0 >= -50) {
                return null;
            } else {
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLec;I)V", line = 218)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field2680;
        if (arg2 == 0) {
            this.method1418(arg1.method295(true), 2);
        }
        if (arg0 != 108) {
            method1419(-56, -101, -99, 4);
        }
    }
}
