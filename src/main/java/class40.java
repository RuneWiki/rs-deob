import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 extends class46 {

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field647 = 0;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
    public boolean field645 = true;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field650 = -1;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public int field659 = -1;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Z")
    public static boolean field648 = false;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lmb;")
    public static class132 field654 = class166.method1092("Verbinde mit Server)3)3)3", 120);

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Lmb;")
    public static class132 field657 = class166.method1092("m-Ochte mit Ihnen handeln)3", 113);

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lmb;")
    public static class132 field644 = class166.method1092("scrollen:", 121);

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Lmb;")
    private static class132 field656 = class166.method1092("Please enter your password)3", 114);

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Lmb;")
    public static class132 field653 = field656;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "[[I")
    public static int[][] field658 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILkd;I)V")
    private final void method278(int arg0, int arg1, class112 arg2, int arg3) {
        field646++;
        if (arg3 == 1) {
            this.field647 = class74.method448(1048575, arg2.method718(false));
        } else if (arg3 == 2) {
            this.field650 = arg2.method716(-1308);
        } else if (arg3 == 3) {
            this.field650 = arg2.method739(-125);
            if (this.field650 == 65535) {
                this.field650 = -1;
            }
        } else if (arg3 == 5) {
            this.field645 = false;
        } else if (arg3 == 7) {
            this.field659 = class74.method448(1048575, arg2.method718(false));
        } else if (arg3 == 8) {
            class45.field775 = arg0;
        } else if (arg3 == 9) {
            arg2.method739(arg1 ^ 0xFFFFFF82);
        }
        if (arg1 != 0) {
            this.method278(-60, 36, null, -35);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BILkd;)V")
    public final void method279(byte arg0, int arg1, class112 arg2) {
        int var4 = 34 / ((-arg0 - 40) / 50);
        field651++;
        while (true) {
            int var5 = arg2.method716(-1308);
            if (var5 == 0) {
                return;
            }
            this.method278(arg1, 0, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V")
    public static void method280(byte arg0) {
        field658 = null;
        field654 = null;
        if (arg0 < -9) {
            field656 = null;
            field653 = null;
            field644 = null;
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIZ)I")
    public static final int method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg1 & 0x3;
        if (!arg6) {
            field648 = false;
        }
        field652++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 1 + 7 - arg2 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg4 - arg3;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIIII)V")
    public static final void method282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field649++;
        if (class135.field2542 <= arg3 && class168.field3083 >= arg3) {
            int var5 = class159.method1034(arg4, (byte) 83, class169.field3161, class17.field254);
            int var6 = class159.method1034(arg1, (byte) 22, class169.field3161, class17.field254);
            class178.method1154(arg0, var5, 95, var6, arg3);
        }
        if (arg2 <= 85) {
            field653 = null;
        }
    }
}
