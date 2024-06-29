import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lo;")
    public static class84 field695 = class15.method124("Public chat", 255);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lo;")
    public static class84 field692 = class15.method124("cyan:", 255);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Leb;")
    public static class27 field693;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lhc;")
    public static class45 field699;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lp;")
    public static class89 field691;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lp;")
    public static class89 field696;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[Lvb;")
    public static class121[] field702;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 4)
    public static void method326(int arg0) {
        field691 = null;
        int var1 = 36 / ((arg0 - 27) / 40);
        field702 = null;
        field696 = null;
        field693 = null;
        field692 = null;
        field699 = null;
        field695 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 20)
    public static final void method327(int arg0) {
        class39.field772.method742(4);
        if (arg0 < 79) {
            field693 = null;
        }
        class109.field2374.method742(4);
        field698++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method328(boolean arg0) {
        field701++;
        int var1 = class16.field291.method313(class86.field1967);
        if (arg0) {
            field696 = null;
        }
        for (int var2 = 0; var2 < class40.field805; var2++) {
            int var10 = class16.field291.method321(class21.field385[var2]);
            if (var10 > var1) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class40.field805 * 15 + 21;
        if (class128.field2820 > 4 && class109.field2367 > 4 && class128.field2820 < 516 && class109.field2367 < 338) {
            class1.field24 = 0;
            class118.field2628 = class40.field805 * 15 + 22;
            class17.field301 = var1;
            int var4 = class128.field2820 - var1 / 2 - 4;
            class116.field2529 = true;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            int var5 = class109.field2367 - 4;
            if (var5 + var3 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class128.field2816 = var5;
            class57.field1170 = var4;
        }
        if (class128.field2820 > 553 && class109.field2367 > 205 && class128.field2820 < 743 && class109.field2367 < 466) {
            class116.field2529 = true;
            class17.field301 = var1;
            class118.field2628 = class40.field805 * 15 + 22;
            int var6 = class109.field2367 - 205;
            if (var6 < 0) {
                var6 = 0;
            } else if (var3 + var6 > 261) {
                var6 = 261 - var3;
            }
            int var7 = class128.field2820 - var1 / 2 - 553;
            class128.field2816 = var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var1 > 190) {
                var7 = 190 - var1;
            }
            class1.field24 = 1;
            class57.field1170 = var7;
        }
        if (class128.field2820 <= 17 || class109.field2367 <= 357 || class128.field2820 >= 496 || class109.field2367 >= 453) {
            return;
        }
        class118.field2628 = class40.field805 * 15 + 22;
        class17.field301 = var1;
        int var8 = class128.field2820 - var1 / 2 - 17;
        class116.field2529 = true;
        class1.field24 = 2;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 + var1 > 479) {
            var8 = 479 - var1;
        }
        class57.field1170 = var8;
        int var9 = class109.field2367 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class128.field2816 = var9;
    }
}
