import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class118 extends class264 {

    @OriginalMember(owner = "client!ca", name = "hb", descriptor = "[I")
    public static int[] field1785 = new int[2048];

    @OriginalMember(owner = "client!ca", name = "ib", descriptor = "[Lma;")
    public static class5[] field1786 = new class5[500];

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ca", name = "jb", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ca", name = "kb", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ca", name = "mb", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ca", name = "nb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ca", name = "pb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ca", name = "ob", descriptor = "Lvg;")
    public static class23 field1792;

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "Loi;")
    public static class32 field1784;

    @OriginalMember(owner = "client!ca", name = "lb", descriptor = "[Lla;")
    public static class178[] field1789;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V", line = 5)
    public static final void method791(int arg0) {
        field1791++;
        class200.field3184.method1392(-3564);
        int var1 = class200.field3184.method1387(true, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class200.field3184.method1387(true, 2);
        if (arg0 >= -25) {
            field1789 = (class178[]) null;
        }
        if (var2 == 0) {
            class156.field2320[class287.field4838++] = 2047;
        } else if (var2 == 1) {
            int var3 = class200.field3184.method1387(true, 3);
            class151.field2183.method120(-1, false, var3);
            int var4 = class200.field3184.method1387(true, 1);
            if (var4 == 1) {
                class156.field2320[class287.field4838++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class200.field3184.method1387(true, 3);
            class151.field2183.method120(-1, true, var9);
            int var10 = class200.field3184.method1387(true, 3);
            class151.field2183.method120(-1, true, var10);
            int var11 = class200.field3184.method1387(true, 1);
            if (var11 == 1) {
                class156.field2320[class287.field4838++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class200.field3184.method1387(true, 7);
            class276.field4701 = class200.field3184.method1387(true, 2);
            int var6 = class200.field3184.method1387(true, 1);
            int var7 = class200.field3184.method1387(true, 1);
            if (var7 == 1) {
                class156.field2320[class287.field4838++] = 2047;
            }
            int var8 = class200.field3184.method1387(true, 7);
            class151.field2183.method121(var8, var6 == 1, -22763, var5);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 78)
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[I", line = 102)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 > -58) {
            field1785 = (int[]) null;
        }
        field1783++;
        int[] var3 = this.field4501.method1176(arg1, 124);
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1];
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                var3[var5] = this.method794(var4, false, class251.field4159[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lni;Lni;Lni;B)V", line = 129)
    public static final void method792(class202 arg0, class202 arg1, class202 arg2, byte arg3) {
        class248.field4113 = arg2;
        field1790++;
        class206.field3286 = arg1;
        class294.field4964 = arg0;
        if (arg3 != 95) {
            field1786 = (class5[]) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V", line = 143)
    public static void method793(int arg0) {
        if (arg0 != 0) {
            field1786 = (class5[]) null;
        }
        field1785 = null;
        field1792 = null;
        field1789 = null;
        field1784 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZI)I", line = 159)
    private final int method794(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1792 = (class23) null;
        }
        int var4 = arg2 + (arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        field1787++;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)V", line = 178)
    public static final void method795(int arg0, int arg1) {
        field1788++;
        class286.field4819 = 50;
        class155.field2303 = arg1;
        if (arg0 != 0) {
            method795(-20, 17);
        }
    }
}
