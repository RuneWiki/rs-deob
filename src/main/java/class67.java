import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class67 {

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    public int field808 = 128;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "I")
    public int field814 = 128;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "Lca;")
    public static class285 field803 = new class285();

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "[I")
    public static int[] field816 = new int[1];

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public static int field818 = -1;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lpfa;")
    public static class275 field802;

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "Lpp;")
    public static class365 field815;

    @OriginalMember(owner = "client!naa", name = "r", descriptor = "Lts;")
    public static class501 field817;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lrr;I)Lrr;", line = 3)
    public static final class337 method524(class337 arg0, int arg1) {
        if (arg1 != 4) {
            field817 = null;
        }
        field809++;
        class337 var2 = client.method1704(arg0);
        if (var2 == null) {
            var2 = arg0.field4198;
        }
        return var2;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(FZFFI)F", line = 19)
    public static final float method525(float arg0, boolean arg1, float arg2, float arg3, int arg4) {
        field811++;
        float[] var5 = class116.field1444[arg4];
        if (arg1) {
            method528(97, 109);
        }
        return var5[2] * arg0 + var5[1] * arg3 + var5[0] * arg2;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lnaa;B)V", line = 32)
    public final void method526(class67 arg0, byte arg1) {
        this.field800 = arg0.field800;
        if (arg1 <= 2) {
            field815 = null;
        }
        this.field808 = arg0.field808;
        this.field805 = arg0.field805;
        this.field814 = arg0.field814;
        field806++;
        this.field810 = arg0.field810;
        this.field813 = arg0.field813;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Lnaa;", line = 49)
    public final class67 method527(int arg0) {
        field804++;
        if (arg0 != 0) {
            method530(8);
        }
        return new class67(this.field810, this.field808, this.field814, this.field800, this.field813, this.field805);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V", line = 64)
    public static final void method528(int arg0, int arg1) {
        field812++;
        class243 var2 = class546.method2926(arg0, 16, true);
        var2.method1455(true);
        if (arg1 <= 72) {
            method530(121);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILjava/lang/String;)V", line = 84)
    public static final void method529(int arg0, int arg1, String arg2) {
        field807++;
        int var3 = class149.field1788;
        int[] var4 = class95.field1239;
        boolean var5 = false;
        if (arg1 >= -32) {
            method529(-4, 109, null);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class365 var7 = class132.field1601[var4[var6]];
            if (var7 != null && field815 != var7 && var7.field4673 != null && var7.field4673.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class178.field2080++;
                    class124 var12 = class336.method1924(class684.field9353, class636.field8620, (byte) 5);
                    var12.field1516.method3065(-1, var4[var6]);
                    var12.field1516.method3043(0, 77);
                    class197.method1156((byte) 105, var12);
                } else if (arg0 == 4) {
                    class3.field19++;
                    class124 var11 = class336.method1924(class647.field8752, class636.field8620, (byte) -59);
                    var11.field1516.method3090(0, 3);
                    var11.field1516.method3080((byte) -62, var4[var6]);
                    class197.method1156((byte) 111, var11);
                } else if (arg0 == 5) {
                    class106.field1332++;
                    class124 var10 = class336.method1924(class325.field4052, class636.field8620, (byte) 3);
                    var10.field1516.method3090(0, 3);
                    var10.field1516.method3080((byte) -104, var4[var6]);
                    class197.method1156((byte) 122, var10);
                } else if (arg0 == 6) {
                    class226.field2916++;
                    class124 var9 = class336.method1924(class351.field4539, class636.field8620, (byte) 93);
                    var9.field1516.method3043(0, 62);
                    var9.field1516.method3065(-1, var4[var6]);
                    class197.method1156((byte) 117, var9);
                } else if (arg0 == 7) {
                    class671.field9110++;
                    class124 var8 = class336.method1924(class96.field1250, class636.field8620, (byte) -11);
                    var8.field1516.method3080((byte) -70, var4[var6]);
                    var8.field1516.method3052(true, 0);
                    class197.method1156((byte) 84, var8);
                }
                break;
            }
        }
        if (!var5) {
            class252.method1521(4, class671.field9135.method3726((byte) 33, class71.field912) + arg2, true);
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(I)V", line = 188)
    public class67(int arg0) {
        this.field810 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(IIIIII)V", line = 197)
    private class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field808 = arg1;
        this.field800 = arg3;
        this.field810 = arg0;
        this.field813 = arg4;
        this.field805 = arg5;
        this.field814 = arg2;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V", line = 210)
    public static void method530(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field803 = null;
        field816 = null;
        field802 = null;
        field815 = null;
        field817 = null;
    }
}
