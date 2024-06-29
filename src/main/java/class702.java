import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class702 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field9785 = 1;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field9791 = 2;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
    public boolean field9793 = false;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field9792 = 64;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
    public boolean field9790 = false;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field9794 = 64;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field9787 = -1;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[I")
    public static int[] field9795 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lmia;")
    public static class63 field9789 = new class63(62, 8);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lmb;")
    public static class264 field9796 = new class264();

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method3993(int arg0) {
        field9795 = null;
        field9789 = null;
        field9796 = null;
        if (arg0 != -5226) {
            field9795 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lrg;II)V")
    public final void method3994(class645 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            this.field9791 = 37;
        }
        field9786++;
        while (true) {
            int var4 = arg0.method3745(arg1 ^ 0xFFFFE752);
            if (var4 == 0) {
                return;
            }
            this.method3995(var4, arg1 ^ 0xFFFFFF8D, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILrg;I)V")
    private final void method3995(int arg0, int arg1, class645 arg2, int arg3) {
        if (arg0 == 1) {
            this.field9787 = arg2.method3712((byte) 118);
            if (this.field9787 == 65535) {
                this.field9787 = -1;
            }
        } else if (arg0 == 2) {
            this.field9794 = arg2.method3712((byte) 1) + 1;
            this.field9792 = arg2.method3712((byte) -124) + 1;
        } else if (arg0 == 3) {
            arg2.method3743(true);
        } else if (arg0 == 4) {
            this.field9791 = arg2.method3745(-6314);
        } else if (arg0 == 5) {
            this.field9785 = arg2.method3745(-6314);
        } else if (arg0 == 6) {
            this.field9793 = true;
        } else if (arg0 == 7) {
            this.field9790 = true;
        }
        field9788++;
        int var5 = 18 % ((arg1 + 6) / 43);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3996(int arg0, int arg1, int arg2, Class arg3) {
        class186 var4 = class80.field1136[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class754 var5 = var4.field2830; var5 != null; var5 = var5.field10537) {
            class119 var6 = var5.field10542;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1628 == arg1 && var6.field1626 == arg2) {
                class738.method4137(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static final void method3997(boolean arg0) {
        class236.field3433.method1010(0);
        field9784++;
        class739.method4142((byte) -69);
        class523.field7482 = 0;
        class469.field6851.field9084 = 0;
        class677.field9415 = 0;
        class394.field5924 = null;
        class242.field3522 = null;
        class128.field1730 = null;
        class114.method845((byte) -118);
        class230.field3379 = 0;
        class470.field6856 = null;
        class377.field5712 = 0;
        if (arg0) {
            field9796 = null;
        }
        class467.field6838 = null;
        class690.field9544 = 0;
    }
}
