import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class684 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Loga;")
    private class158 field9647 = new class158();

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    private int field9658;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field9641;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lefa;")
    private class322 field9643;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Z")
    public static boolean field9657 = false;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lcq;")
    public static class273 field9652 = new class273(7, 0, 1, 1);

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[I")
    public static int[] field9660 = new int[5];

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[I")
    public static int[] field9661 = new int[256];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Lrba;")
    public static class102 field9654;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field9644;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/Object;Lpe;)V")
    public final void method3828(byte arg0, Object arg1, class611 arg2) {
        if (arg0 == -36) {
            this.method3838(1, arg1, arg2, (byte) -124);
            field9655++;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILpe;)V")
    private final void method3829(int arg0, class611 arg1) {
        if (arg0 > -73) {
            return;
        }
        field9653++;
        long var3 = arg1.method2670((byte) -91);
        for (class652 var5 = (class652) this.field9643.method2002((byte) -126, var3); var5 != null; var5 = (class652) this.field9643.method1999(-94)) {
            if (var5.field9328.method2671(arg1, (byte) 102)) {
                this.method3830(false, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLnv;)V")
    private final void method3830(boolean arg0, class652 arg1) {
        field9648++;
        if (arg0) {
            field9654 = null;
        }
        if (arg1 != null) {
            arg1.method2360((byte) 66);
            arg1.method1989((byte) 55);
            this.field9641 += arg1.field9327;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
    public final int method3831(byte arg0) {
        if (arg0 < 95) {
            return -67;
        } else {
            field9645++;
            return this.field9641;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method3832(int arg0) {
        field9639++;
        if (class57.field938 == 1 || class57.field938 == 3 || class57.field938 != class458.field6615 && (class57.field938 == 0 || class458.field6615 == 0)) {
            class378.field5678 = 0;
            class155.field2213 = 0;
            class271.field3550.method1995((byte) -123);
        }
        if (arg0 != 0) {
            method3832(-2);
        }
        class458.field6615 = class57.field938;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public final void method3833(int arg0) {
        field9646++;
        if (arg0 != -2626) {
            field9640 = -58;
        }
        for (class652 var2 = (class652) this.field9647.method1126(arg0 + 2739); var2 != null; var2 = (class652) this.field9647.method1128(11)) {
            if (var2.method1255(-7017)) {
                var2.method2360((byte) 66);
                var2.method1989((byte) 124);
                this.field9641 += var2.field9327;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(ILpe;)Ljava/lang/Object;")
    public final Object method3834(int arg0, class611 arg1) {
        field9642++;
        long var3 = arg1.method2670((byte) -84);
        for (class652 var5 = (class652) this.field9643.method2002((byte) -122, var3); var5 != null; var5 = (class652) this.field9643.method1999(-114)) {
            if (var5.field9328.method2671(arg1, (byte) 71)) {
                Object var6 = var5.method1254(0);
                if (var6 != null) {
                    if (var5.method1255(-7017)) {
                        class406 var7 = new class406(arg1, var6, var5.field9327);
                        this.field9643.method2001(-79, var7, var5.field5740);
                        this.field9647.method1134(var7, -1);
                        var7.field4679 = 0L;
                        var5.method2360((byte) 66);
                        var5.method1989((byte) 58);
                    } else {
                        this.field9647.method1134(var5, -1);
                        var5.field4679 = 0L;
                    }
                    return var6;
                }
                var5.method2360((byte) 66);
                var5.method1989((byte) 36);
                this.field9641 += var5.field9327;
            }
        }
        if (arg0 < 78) {
            this.field9658 = 110;
        }
        return null;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static void method3835(int arg0) {
        if (arg0 < 95) {
            method3835(10);
        }
        field9644 = null;
        field9661 = null;
        field9660 = null;
        field9654 = null;
        field9652 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public final void method3836(int arg0, int arg1) {
        if (class541.field8021 != null) {
            for (class652 var3 = (class652) this.field9647.method1126(-124); var3 != null; var3 = (class652) this.field9647.method1128(11)) {
                if (var3.method1255(-7017)) {
                    if (var3.method1254(0) == null) {
                        var3.method2360((byte) 66);
                        var3.method1989((byte) 87);
                        this.field9641 += var3.field9327;
                    }
                } else if (++var3.field4679 > (long) arg1) {
                    class652 var4 = class541.field8021.method2902(false, var3);
                    this.field9643.method2001(85, var4, var3.field5740);
                    class70.method411(var4, (byte) 67, var3);
                    var3.method2360((byte) 66);
                    var3.method1989((byte) 53);
                }
            }
        }
        int var5 = 88 % ((arg0 + 32) / 47);
        field9656++;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public final void method3837(int arg0) {
        this.field9647.method1125(true);
        field9651++;
        this.field9643.method1995((byte) -123);
        if (arg0 != 0) {
            field9640 = 52;
        }
        this.field9641 = this.field9658;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/Object;Lpe;B)V")
    private final void method3838(int arg0, Object arg1, class611 arg2, byte arg3) {
        field9649++;
        if (this.field9658 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method3829(-82, arg2);
        this.field9641 -= arg0;
        while (this.field9641 < 0) {
            class652 var7 = (class652) this.field9647.method1132(-1);
            this.method3830(false, var7);
        }
        int var5 = -128 % ((-arg3 - 60) / 52);
        class406 var6 = new class406(arg2, arg1, arg0);
        this.field9643.method2001(-82, var6, arg2.method2670((byte) -114));
        this.field9647.method1134(var6, -1);
        var6.field4679 = 0L;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)I")
    public final int method3839(byte arg0) {
        field9650++;
        return arg0 == -59 ? this.field9658 : 98;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
    public class684(int arg0) {
        this.field9658 = arg0;
        this.field9641 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field9643 = new class322(var2);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9661[var0] = var1;
        }
    }
}
