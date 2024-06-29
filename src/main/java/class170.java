import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class170 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lml;")
    public static class160 field3019 = new class160(5);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lml;")
    public static class160 field3026 = new class160(4);

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lce;")
    public static class126 field3030 = class206.method1445(-7923, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Z")
    public static boolean field3029 = true;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lfg;")
    public static class48 field3028 = new class48(128);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lce;")
    private static class126 field3032 = class206.method1445(-7923, "Loading config )2 ");

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lce;")
    public static class126 field3031 = field3032;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lcc;")
    public static class313 field3027;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)I", line = 4)
    public static final int method1244(boolean arg0) {
        field3023++;
        if (!arg0) {
            field3029 = true;
        }
        return class298.field4955;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lce;Z)V", line = 15)
    public static final void method1245(class126 arg0, boolean arg1) {
        class322.method2236(false, 0);
        if (arg1) {
            class229.method1557((byte) 87, arg0);
            field3020++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JIIZ)Lce;", line = 33)
    public static final class126 method1246(long arg0, int arg1, int arg2, boolean arg3) {
        field3024++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        long var5 = arg0 / (long) arg1;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg1;
            var7++;
        }
        int var8 = var7;
        if (arg0 < 0L || arg3) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < (long) arg2) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var11 = (int) (arg0 % (long) arg1);
            if (var11 < 0) {
                var11 = -var11;
            }
            arg0 /= (long) arg1;
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class126 var12 = new class126();
        var12.field2158 = var9;
        var12.field2140 = var8;
        return var12;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 99)
    public static void method1247(int arg0) {
        field3030 = null;
        field3019 = null;
        field3026 = null;
        field3027 = null;
        field3032 = null;
        field3031 = null;
        int var1 = -101 % ((arg0 - 50) / 58);
        field3028 = null;
    }
}
