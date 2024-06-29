import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public int field109 = 1;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Z")
    public boolean field111 = false;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public int field114 = 64;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public int field119 = 2;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public int field117 = -1;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public int field121 = 64;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Z")
    public boolean field116 = false;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Z")
    public static boolean field113 = false;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILmd;IB)V", line = 28)
    private final void method22(int arg0, class379 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field117 = arg1.method2212((byte) 83);
            if (this.field117 == 65535) {
                this.field117 = -1;
            }
        } else if (arg0 == 2) {
            this.field121 = arg1.method2212((byte) 83) + 1;
            this.field114 = arg1.method2212((byte) 83) + 1;
        } else if (arg0 == 3) {
            arg1.method2194(-1);
        } else if (arg0 == 4) {
            this.field119 = arg1.method2238(255);
        } else if (arg0 == 5) {
            this.field109 = arg1.method2238(255);
        } else if (arg0 == 6) {
            this.field116 = true;
        } else if (arg0 == 7) {
            this.field111 = true;
        }
        if (arg3 == 119) {
            field112++;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lmd;IZ)V", line = 78)
    public final void method23(class379 arg0, int arg1, boolean arg2) {
        field120++;
        while (true) {
            int var4 = arg0.method2238(255);
            if (var4 == 0) {
                if (arg2) {
                    this.method23(null, -58, false);
                    return;
                } else {
                    return;
                }
            }
            this.method22(var4, arg0, arg1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZLsl;I)Lsj;", line = 103)
    public static final class318 method24(int arg0, boolean arg1, class317 arg2, int arg3) {
        if (!arg1) {
            method24(112, false, null, -98);
        }
        field115++;
        int var4 = arg2.field4156 | arg3 << 8;
        class318 var5 = (class318) class327.field4325.method1515(0, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class48.field752.method2707(class48.field752.method2703(var4, 1587), 0);
        if (var6 == null) {
            int var8 = arg2.field4156 | arg0 + 65536 << 8;
            class318 var9 = (class318) class327.field4325.method1515(0, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class48.field752.method2707(class48.field752.method2703(var8, 1587), 0);
            if (var10 == null) {
                int var12 = arg2.field4156 | 0xFFFF00;
                class318 var13 = (class318) class327.field4325.method1515(0, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class48.field752.method2707(class48.field752.method2703(var12, 1587), 0);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class318 var15 = class515.method3039(true, var14);
                    var15.field4168 = arg2;
                    class327.field4325.method1518(var15, (byte) 123, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class318 var11 = class515.method3039(true, var10);
                var11.field4168 = arg2;
                class327.field4325.method1518(var11, (byte) 123, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class318 var7 = class515.method3039(arg1, var6);
            var7.field4168 = arg2;
            class327.field4325.method1518(var7, (byte) 123, (long) var4 << 16);
            return var7;
        }
    }
}
