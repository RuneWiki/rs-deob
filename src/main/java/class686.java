import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class686 extends class513 {

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public int field9537 = 0;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
    public static boolean field9536 = false;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Lfja;")
    public static class783 field9538 = new class783(119, 12);

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "[I")
    public static int[] field9544 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "Leaa;")
    public static class528 field9543 = new class528();

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "[[[Z")
    public static boolean[][][] field9545;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lfca;II)V", line = 3)
    private final void method3858(class93 arg0, int arg1, int arg2) {
        field9535++;
        if (arg1 == 2) {
            this.field9537 = arg0.method763(-87);
        }
        if (arg2 != 36096) {
            field9536 = true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V", line = 31)
    public static final void method3859(int arg0, int arg1) {
        field9539++;
        class663.field9208.method265(arg0, -109);
        if (arg1 != 0) {
            field9544 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILfca;)V", line = 43)
    public final void method3860(int arg0, class93 arg1) {
        if (arg0 != -24495) {
            field9545 = null;
        }
        field9542++;
        while (true) {
            int var3 = arg1.method793((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method3858(arg1, var3, 36096);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method3861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9540++;
        if (class278.field3847 != 1) {
            return;
        }
        int var5 = arg0 / class658.field9108;
        int var6 = arg1 / class658.field9108;
        if (arg2 != 22738) {
            return;
        }
        int var7 = arg3 / class471.field6394;
        int var8 = arg4 / class471.field6394;
        if (var5 >= class262.field3681 || var6 < 0 || class317.field4324 <= var7 || var8 < 0) {
            return;
        }
        if (class317.field4324 <= var8) {
            var8 = class317.field4324 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class262.field3681 <= var6) {
            var6 = class262.field3681 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class361.method2217(38348543, class567.field8014 + var9, class317.field4324) * class262.field3681;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class361.method2217(38348543, class615.field8571 + var11, class262.field3681);
                class449.field6157[var12] = class599.field8386;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 125)
    public static void method3862(int arg0) {
        field9544 = null;
        if (arg0 > -63) {
            field9538 = null;
        }
        field9543 = null;
        field9538 = null;
        field9545 = null;
    }
}
