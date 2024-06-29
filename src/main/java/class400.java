import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class400 {

    @OriginalMember(owner = "client!af", name = "h", descriptor = "B")
    private byte field5613;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field5615;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field5607;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field5610;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5614 = null;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lfa;")
    public static class212 field5606;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILcu;Lcu;)V", line = 6)
    public static final void method2334(int arg0, int arg1, int arg2, class201 arg3, class201 arg4) {
        class390 var5 = class568.method3255(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5525 = arg3;
        var5.field5529 = arg4;
        int var6 = class52.field606 == class409.field5812 ? 1 : 0;
        if (!arg3.method216(true)) {
            class420.field5921[var6][class466.field6417[var6]++] = arg3;
        } else if (arg3.method209((byte) -64)) {
            class216.field3061[var6][class582.field8197[var6]++] = arg3;
        } else {
            class383.field5425[var6][class89.field1287[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method216(true)) {
            if (arg4.method209((byte) 106)) {
                class216.field3061[var6][class582.field8197[var6]++] = arg4;
                return;
            }
            class383.field5425[var6][class89.field1287[var6]++] = arg4;
            return;
        }
        class420.field5921[var6][class466.field6417[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljba;I)Ljba;", line = 44)
    public static final class364 method2335(class364 arg0, int arg1) {
        field5609++;
        if (arg1 != -9) {
            field5614 = null;
        }
        class364 var2 = arg0 == null ? new class364() : new class364(arg0);
        var2.method2077(9, true, 128);
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I", line = 60)
    public final int method2336(int arg0) {
        field5616++;
        int var2 = -40 % ((17 - arg0) / 45);
        return this.field5613 & 0x7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 72)
    public static void method2337(byte arg0) {
        int var1 = 43 % ((25 - arg0) / 63);
        field5614 = null;
        field5606 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)I", line = 82)
    public final int method2338(byte arg0) {
        field5618++;
        if (arg0 == 24) {
            return (this.field5613 & 0x8) == 8 ? 1 : 0;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 104)
    public class400() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lac;)V", line = 107)
    public class400(class501 arg0) {
        this.field5613 = arg0.method2863(100);
        this.field5615 = arg0.method2845(-1);
        this.field5607 = arg0.method2840(false);
        this.field5617 = arg0.method2840(false);
        this.field5610 = arg0.method2840(false);
        this.field5611 = arg0.method2840(false);
    }
}
