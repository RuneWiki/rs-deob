import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class276 extends class297 {

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lma;")
    private static class5 field4699 = class12.method119("Connecting to update server", (byte) 68);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lma;")
    private static class5 field4700 = class12.method119(" is already on your ignore list)3", (byte) 56);

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field4706 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lma;")
    public static class5 field4704 = field4699;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field4709 = 0;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field4712 = -1;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Lma;")
    public static class5 field4708 = field4700;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lqh;")
    public static class30 field4710;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[[[B")
    public static byte[][][] field4707;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lma;ILma;BLma;)V", line = 17)
    public static final void method1874(class5 arg0, int arg1, class5 arg2, byte arg3, class5 arg4) {
        field4711++;
        if (arg3 == -85) {
            class238.method1682(-1, arg2, arg4, (byte) -122, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJII)Z", line = 28)
    public static final boolean method1875(int arg0, long arg1, int arg2, int arg3) {
        field4705++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & arg2) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class185 var8 = class77.method536(var7, 119);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field2859;
                var9 = var8.field2840;
            } else {
                var9 = var8.field2859;
                var10 = var8.field2840;
            }
            int var11 = var8.field2897;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class149.method939(0, 0, arg3, var9, var10, var11, 127, 2, arg0, true, class151.field2183.field186[0], class151.field2183.field175[0]);
        } else {
            class149.method939(var5 + 1, var6, arg3, 0, 0, 0, 126, 2, arg0, true, class151.field2183.field186[0], class151.field2183.field175[0]);
        }
        class98.field1474 = 0;
        class48.field738 = 2;
        class213.field3385 = class104.field1545;
        class33.field507 = class289.field4915;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V", line = 74)
    public static void method1876(boolean arg0) {
        field4710 = null;
        field4700 = null;
        field4704 = null;
        field4708 = null;
        if (!arg0) {
            field4699 = null;
            field4707 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)I", line = 90)
    public static final int method1877(int arg0, byte arg1) {
        field4702++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 != -62) {
            field4712 = -61;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 133)
    public class276() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 166)
    public class276(int arg0) {
        this.field4703 = arg0;
    }
}
