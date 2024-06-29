import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class96 extends class44 {

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    private int field1784;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
    public int[] field1785;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "[[I")
    public int[][] field1780;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "[Z")
    private boolean[] field1788;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lkb;")
    public static class93 field1776 = class76.method390("Begeben Sie sich in ein freies Gebiet)1 um", 0);

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lkb;")
    private static class93 field1773 = class76.method390("Prepared visibility map", 0);

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lkb;")
    private static class93 field1782 = class76.method390("Loaded input handler", 0);

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lkb;")
    public static class93 field1772 = field1782;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lkb;")
    public static class93 field1778 = field1773;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lkb;")
    private static class93 field1775 = class76.method390(" is already on your friend list)3", 0);

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lkb;")
    public static class93 field1777 = field1775;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Lkb;")
    public static class93 field1786 = class76.method390("oder ung-Ultiges Passwort)3", 0);

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
    public static boolean field1783 = false;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lkb;")
    public static class93 field1787 = class76.method390(" )2> <col=ff9040>", 0);

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[Lkb;")
    public static class93[] field1779;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLjg;Lkb;Lkb;Ljg;)Lef;")
    public static final class45 method538(boolean arg0, class89 arg1, class93 arg2, class93 arg3, class89 arg4) {
        int var5 = arg1.method454(236, arg2);
        int var6 = arg1.method468(21, arg3, var5);
        field1789++;
        if (arg0) {
            method538(false, null, null, null, null);
        }
        return class116.method642(var6, true, arg1, var5, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method539(byte arg0) {
        field1778 = null;
        field1777 = null;
        field1782 = null;
        field1786 = null;
        field1787 = null;
        field1776 = null;
        field1775 = null;
        field1779 = null;
        if (arg0 < 113) {
            method539((byte) 91);
        }
        field1773 = null;
        field1772 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[B)V")
    public class96(int arg0, byte[] arg1) {
        this.field1781 = arg0;
        class158 var3 = new class158(arg1);
        this.field1784 = var3.method1054(128);
        this.field1785 = new int[this.field1784];
        this.field1780 = new int[this.field1784][];
        this.field1788 = new boolean[this.field1784];
        for (int var4 = 0; var4 < this.field1784; var4++) {
            this.field1785[var4] = var3.method1054(128);
        }
        for (int var5 = 0; var5 < this.field1784; var5++) {
            this.field1788[var5] = var3.method1054(128) == 1;
        }
        for (int var6 = 0; var6 < this.field1784; var6++) {
            this.field1780[var6] = new int[var3.method1054(128)];
        }
        for (int var7 = 0; var7 < this.field1784; var7++) {
            for (int var8 = 0; var8 < this.field1780[var7].length; var8++) {
                this.field1780[var7][var8] = var3.method1054(128);
            }
        }
    }
}
