import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class11 {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field144 = 0;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lfd;")
    private class130 field139;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field138 = "Loading textures - ";

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[I")
    public static int[] field140 = new int[4096];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field143 = "glow3:";

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field146 = -1;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field145 = 127;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lec;")
    public static class25 field150 = new class25(4);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lq;")
    private class134 field142;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
    public static int[] field141;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIZ)V")
    public static final void method57(int arg0, int arg1, int arg2, boolean arg3) {
        field148++;
        if (arg2 != -27833) {
            field146 = 84;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class309.field5005 = arg0;
        class131.field2018 = arg1;
        class287.field4787 = arg3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIILjk;Ljk;IIJ)V")
    public static final void method58(int arg0, int arg1, int arg2, int arg3, class276 arg4, class276 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class169 var10 = new class169();
        var10.field2635 = arg8;
        var10.field2645 = arg1 * 128 + 64;
        var10.field2642 = arg2 * 128 + 64;
        var10.field2641 = arg3;
        var10.field2639 = arg4;
        var10.field2634 = arg5;
        var10.field2632 = arg6;
        var10.field2633 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class27.field346[var11][arg1][arg2] == null) {
                class27.field346[var11][arg1][arg2] = new class154(var11, arg1, arg2);
            }
        }
        class27.field346[arg0][arg1][arg2].field2411 = var10;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lma;IB)Ljava/lang/String;")
    public static final String method59(class202 arg0, int arg1, byte arg2) {
        field136++;
        try {
            int var3 = 109 / ((55 - arg2) / 59);
            int var4 = arg0.method1450(-115);
            if (var4 > arg1) {
                var4 = arg1;
            }
            byte[] var5 = new byte[var4];
            arg0.field3272 += class36.field470.method718(0, false, arg0.field3234, var5, arg0.field3272, var4);
            return class223.method1558(var4, 0, var5, false);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method60(int arg0, int arg1) {
        field149++;
        if (arg0 == 0) {
            return class156.field2472[arg1].length() <= 0 ? class178.field2773[arg1] : class178.field2773[arg1] + class106.field1645 + class156.field2472[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Lq;")
    public final class134 method61(int arg0) {
        field147++;
        this.field144 = 0;
        if (arg0 < 26) {
            field140 = null;
        }
        return this.method63((byte) -49);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lfd;)V")
    public class11(class130 arg0) {
        this.field139 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method62(int arg0) {
        field143 = null;
        field138 = null;
        field140 = null;
        field150 = null;
        if (arg0 == 64) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lq;")
    public final class134 method63(byte arg0) {
        field137++;
        if (this.field144 > 0 && this.field139.field1994[this.field144 - 1] != this.field142) {
            class134 var2 = this.field142;
            this.field142 = var2.field2104;
            return var2;
        }
        int var3 = 53 / ((47 - arg0) / 48);
        while (this.field144 < this.field139.field1984) {
            class134 var4 = this.field139.field1994[this.field144++].field2104;
            if (this.field139.field1994[this.field144 - 1] != var4) {
                this.field142 = var4.field2104;
                return var4;
            }
        }
        return null;
    }
}
