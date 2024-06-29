import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class549 extends class508 {

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lwp;")
    public static class453 field7637 = new class453(16, 6);

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lfh;")
    public static class266 field7640 = new class266(8, 6);

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Lrga;")
    public static class280 field7641 = new class280(31, -1);

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "Lwp;")
    public static class453 field7642 = new class453(49, -2);

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
    public static int[] field7643 = new int[13];

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lil;")
    private class68 field7634;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 4)
    public static void method3028(byte arg0) {
        field7637 = null;
        field7641 = null;
        field7643 = null;
        if (arg0 > 102) {
            field7640 = null;
            field7642 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I", line = 21)
    public final int method3029(int arg0, int arg1, int arg2) {
        field7638++;
        if (this.field7634 == null) {
            return arg0;
        }
        class262 var4 = (class262) this.field7634.method399(-32748, (long) arg1);
        if (arg2 == -1) {
            return var4 == null ? arg0 : var4.field3229;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIB)I", line = 41)
    public static final int method3030(int arg0, int arg1, int arg2, byte arg3) {
        field7639++;
        int var4 = arg2 / arg1;
        if (arg3 >= -78) {
            field7641 = null;
        }
        int var5 = arg2 & arg1 - 1;
        int var6 = arg0 / arg1;
        int var7 = arg1 - 1 & arg0;
        int var8 = class531.method2881((byte) 105, var4, var6);
        int var9 = class531.method2881((byte) 105, var4 + 1, var6);
        int var10 = class531.method2881((byte) 105, var4, var6 + 1);
        int var11 = class531.method2881((byte) 105, var4 + 1, var6 - -1);
        int var12 = class56.method355(arg1, var5, var8, var9, (byte) -99);
        int var13 = class56.method355(arg1, var5, var10, var11, (byte) -78);
        return class56.method355(arg1, var7, var12, var13, (byte) -128);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Les;II)V", line = 72)
    private final void method3031(class630 arg0, int arg1, int arg2) {
        field7636++;
        if (arg1 != 14146) {
            field7642 = null;
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg0.method3501(-9268);
        if (this.field7634 == null) {
            int var5 = class391.method2101(var4, arg1 ^ 0x37C2);
            this.field7634 = new class68(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method3501(-9268) == 1;
            int var8 = arg0.method3517(arg1 ^ 0xFFFFC8BD);
            class329 var9;
            if (var7) {
                var9 = new class103(arg0.method3500((byte) 118));
            } else {
                var9 = new class262(arg0.method3483(62));
            }
            this.field7634.method402(var9, (byte) -54, (long) var8);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILjava/lang/String;)Ljava/lang/String;", line = 120)
    public final String method3032(boolean arg0, int arg1, String arg2) {
        field7635++;
        if (this.field7634 == null) {
            return arg2;
        } else if (arg0) {
            return null;
        } else {
            class103 var4 = (class103) this.field7634.method399(-32748, (long) arg1);
            return var4 == null ? arg2 : var4.field1388;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Les;I)V", line = 140)
    public final void method3033(class630 arg0, int arg1) {
        field7633++;
        if (arg1 != 13) {
            method3028((byte) 41);
        }
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method3031(arg0, arg1 + 14133, var3);
        }
    }
}
