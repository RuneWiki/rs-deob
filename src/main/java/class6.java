import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 {

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Z")
    public boolean field78 = false;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static volatile int field73 = 0;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
    public static boolean field75 = false;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[I")
    public static int[] field80 = new int[1000];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lne;")
    public static class78 field69;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field70++;
        class23 var5 = class91.method694(arg0, 8, 110);
        if (arg3 == -1) {
            var5.method190(0);
            var5.field349 = arg1;
            var5.field346 = arg4;
            var5.field361 = arg2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BZI)I")
    public static final int method28(byte[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            method28((byte[]) null, true, -95);
        }
        field71++;
        return class34.method290(-2598, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZB)Lcj;")
    public final class74 method29(int arg0, boolean arg1, byte arg2) {
        field83++;
        class74 var4 = (class74) class152.field2489.method1155((long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.field77), true);
        int var5 = 94 % ((1 - arg2) / 50);
        if (var4 != null) {
            return var4;
        }
        class3.field33.method899(this.field77, -98);
        class74 var6 = class102.method760(0, this.field77, class3.field33, -122);
        if (var6 != null) {
            var6.method594(class266.field4254, class209.field3360, class22.field345);
            var6.field2444 = var6.field2447;
            var6.field2439 = var6.field2440;
            if (arg1) {
                var6.method587();
            }
            for (int var7 = 0; var7 < arg0; var7++) {
                var6.method585();
            }
            class152.field2489.method1161(var6, (byte) -113, (long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.field77));
        }
        return var6;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILig;II)V")
    private final void method30(int arg0, class136 arg1, int arg2, int arg3) {
        field84++;
        if (arg0 != 26535) {
            this.method29(112, true, (byte) 61);
        }
        if (arg3 == 1) {
            this.field77 = arg1.method996(65280);
        } else if (arg3 == 2) {
            this.field76 = arg1.method1009(114);
        } else if (arg3 == 3) {
            this.field78 = true;
        } else if (arg3 == 4) {
            this.field77 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILig;I)V")
    public final void method31(int arg0, class136 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1012(4);
            if (var4 == 0) {
                if (arg0 != -30789) {
                    return;
                }
                field79++;
                return;
            }
            this.method30(26535, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lti;Z)V")
    public static final void method32(class139 arg0, boolean arg1) {
        field81++;
        if (arg1) {
            method34((Object) null, 79, true);
        }
        for (class132 var2 = (class132) class238.field3755.method1807(-92); var2 != null; var2 = (class132) class238.field3755.method1808((byte) 108)) {
            if (var2.field2208 == arg0) {
                if (var2.field2205 != null) {
                    class145.field2394.method1242(var2.field2205);
                    var2.field2205 = null;
                }
                var2.method1074((byte) 90);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method33(byte arg0) {
        field80 = null;
        if (arg0 >= -55) {
            field80 = null;
        }
        field69 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method34(Object arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            method27(-100, 72, -47, -88, -4);
        }
        field82++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class164.method1183(var3, -843) : var3;
        } else if (arg0 instanceof class235) {
            class235 var4 = (class235) arg0;
            return var4.method704(91);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
