import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class271 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4636 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lma;")
    public static class5 field4642 = class12.method119("<)4col>", (byte) 95);

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lma;")
    public static class5 field4643 = class12.method119("_", (byte) 84);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lma;")
    public static class5 field4641 = class12.method119("m-Ochte mit Ihnen handeln)3", (byte) 109);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lvd;")
    public static class19 field4637 = class107.method677((byte) 126);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lni;Lni;ZLjf;I)V", line = 16)
    public static final void method1854(class202 arg0, class202 arg1, boolean arg2, class82 arg3, int arg4) {
        class27.field432 = arg0;
        field4639++;
        class238.field3939 = arg1;
        class237.field3924 = arg2;
        if (arg4 <= 60) {
            field4636 = 44;
        }
        int var5 = class238.field3939.method1332((byte) 125) - 1;
        class100.field1495 = var5 * 256 + class238.field3939.method1326((byte) -107, var5);
        class223.field3662 = arg3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I", line = 40)
    public static final int method1855(int arg0) {
        if (arg0 != 256) {
            method1857((byte) -18);
        }
        field4638++;
        return 16;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1856(int arg0) {
        int var1 = -95 % ((-arg0 - 27) / 62);
        field4644++;
        if (class98.field1473 < class168.field2557) {
            class98.field1473 = (float) ((double) class98.field1473 / 30.0D + (double) class98.field1473);
            if (class98.field1473 > class168.field2557) {
                class98.field1473 = class168.field2557;
            }
            class113.method747((byte) -72);
        } else if (class98.field1473 > class168.field2557) {
            class98.field1473 = (float) ((double) class98.field1473 - (double) class98.field1473 / 30.0D);
            if (class168.field2557 > class98.field1473) {
                class98.field1473 = class168.field2557;
            }
            class113.method747((byte) -115);
        }
        if (class153.field2240 == -1 || class171.field2634 == -1) {
            return;
        }
        int var2 = class153.field2240 - class284.field4811;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        int var3 = class171.field2634 - class14.field269;
        if (var3 < 2 || var3 > 2) {
            var3 >>= 0x4;
        }
        if (var2 == 0 && var3 == 0) {
            class153.field2240 = -1;
            class171.field2634 = -1;
        }
        class14.field269 += var3;
        class284.field4811 += var2;
        class113.method747((byte) -101);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 114)
    public static void method1857(byte arg0) {
        field4642 = null;
        field4637 = null;
        if (arg0 != -69) {
            field4636 = 18;
        }
        field4643 = null;
        field4641 = null;
    }
}
