import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class273 extends class308 {

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Lhk;")
    public class45 field4483;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4491 = "Attack";

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Z")
    public static boolean field4486 = false;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "[I")
    public static int[] field4494 = new int[14];

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field4495 = -1;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[[I")
    public static int[][] field4482;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1934(boolean arg0) {
        if (!arg0) {
            field4494 = (int[]) null;
        }
        field4482 = (int[][]) null;
        field4494 = null;
        field4491 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)V", line = 23)
    public static final void method1935(int arg0, byte arg1, int arg2) {
        int var3 = -33 / ((arg1 - 82) / 44);
        field4488++;
        class211 var4 = class17.method115(5, arg0, 4086);
        var4.method1433(true);
        var4.field3210 = arg2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZI)V", line = 36)
    public final void method1936(int arg0, int arg1, boolean arg2, int arg3) {
        this.field4484 = arg3;
        field4490++;
        this.field4487 = arg0;
        if (!arg2) {
            method1935(68, (byte) -5, 40);
        }
        this.field4497 = arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lre;I)V", line = 56)
    public static final void method1937(class287 arg0, int arg1) {
        field4492++;
        int var2 = arg0.field4799 - class58.field875;
        int var3 = arg0.field4769 * 128 + (arg0.method312(-116) * 64);
        int var4 = arg0.field4749 * 128 + (arg0.method312(-110) * 64);
        arg0.field4725 = arg1;
        if (arg0.field4738 == 0) {
            arg0.field4780 = 1024;
        }
        arg0.field4796 += (var3 - arg0.field4796) / var2;
        if (arg0.field4738 == 1) {
            arg0.field4780 = 1536;
        }
        arg0.field4783 += (var4 - arg0.field4783) / var2;
        if (arg0.field4738 == 2) {
            arg0.field4780 = 0;
        }
        if (arg0.field4738 == 3) {
            arg0.field4780 = 512;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lhk;Ldh;)V", line = 112)
    public class273(class45 arg0, class145 arg1) {
        this.field4483 = arg0;
    }
}
