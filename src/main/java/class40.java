import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class40 {

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lhf;")
    private class139 field572 = new class139();

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lef;")
    private class221 field574 = new class221();

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lnj;")
    private class144 field576;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
    public static int[] field564 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field567 = "wishes to trade with you.";

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field569 = -1;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method305(int arg0) {
        if (arg0 != 1) {
            method305(-94);
        }
        field567 = null;
        field564 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public static final void method306(int arg0, int arg1) {
        if (arg1 != 0) {
            method313(6, 17, 32, 57);
        }
        if (class196.field3178 == null || arg0 > class196.field3178.length) {
            class196.field3178 = new int[arg0];
        }
        field560++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
    public static final void method307(int arg0, boolean arg1) {
        field571++;
        class126.method908(122);
        if (class38.field533 != 30 && class38.field533 != 25) {
            return;
        }
        class53.field769++;
        if (class53.field769 < 50 && !arg1) {
            return;
        }
        if (arg0 >= -96) {
            method307(-122, false);
        }
        class53.field769 = 0;
        if (!class151.field2454 && class180.field2901 != null) {
            class220.field3532.method557(251, 8);
            try {
                class180.field2901.method726(0, class220.field3532.field2511, 29023, class220.field3532.field2523);
                class220.field3532.field2511 = 0;
            } catch (IOException var2) {
                class151.field2454 = true;
            }
            class141.field2265++;
        }
        class126.method908(-18);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method308(byte arg0) {
        field563++;
        this.field574.method1585((byte) -2);
        this.field576.method1035(84);
        this.field572 = new class139();
        this.field573 = this.field575;
        if (arg0 > -89) {
            this.field574 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class187.field3007 = arg3;
        class61.field849 = arg1;
        class46.field666 = arg4;
        if (arg5) {
            return;
        }
        field570++;
        class241.field3839 = arg0;
        class293.field4651 = arg2;
        if (class241.field3839 >= 100) {
            int var6 = class46.field666 * 128 + 64;
            int var7 = class293.field4651 * 128 + 64;
            int var8 = class129.method930(var7, var6, 122, class58.field826) - class61.field849;
            int var9 = var6 - class50.field736;
            int var10 = var8 - class185.field2986;
            int var11 = var7 - class196.field3177;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class67.field988 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class218.field3485 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class67.field988 < 128) {
                class67.field988 = 128;
            }
            if (class67.field988 > 383) {
                class67.field988 = 383;
            }
        }
        class176.field2853 = 2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)Lhf;")
    public final class139 method310(int arg0, long arg1) {
        field561++;
        if (arg0 != -24190) {
            method313(68, -33, 4, 126);
        }
        class139 var4 = (class139) this.field576.method1034(arg1, (byte) 21);
        if (var4 != null) {
            this.field574.method1584(var4, (byte) 122);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)Ltj;")
    public final class280 method311(int arg0) {
        field562++;
        int var2 = -32 / ((arg0 + 18) / 62);
        return this.field576.method1031((byte) -7);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JLhf;B)V")
    public final void method312(long arg0, class139 arg1, byte arg2) {
        if (this.field573 == 0) {
            class139 var5 = this.field574.method1581(109);
            var5.method1922(-1);
            var5.method986(0);
            if (this.field572 == var5) {
                class139 var6 = this.field574.method1581(85);
                var6.method1922(-1);
                var6.method986(0);
            }
        } else {
            this.field573--;
        }
        this.field576.method1032(false, arg1, arg0);
        this.field574.method1584(arg1, (byte) 119);
        field566++;
        int var7 = -53 % ((49 - arg2) / 56);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)I")
    public static final int method313(int arg0, int arg1, int arg2, int arg3) {
        field565++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg0 >= -115) {
                field564 = null;
            }
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Ltj;")
    public final class280 method314(int arg0) {
        field568++;
        int var2 = -81 % ((79 - arg0) / 34);
        return this.field576.method1033(-9843);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
    public class40(int arg0) {
        this.field573 = arg0;
        int var2 = 1;
        this.field575 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field576 = new class144(var2);
    }
}
