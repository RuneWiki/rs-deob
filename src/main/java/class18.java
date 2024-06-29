import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class18 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ldf;")
    private class28 field402 = new class28();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lba;")
    private class8 field420 = new class8();

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Ljf;")
    private class68 field418;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lja;")
    public static class62 field404 = class30.method243(43, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static volatile int field412 = 0;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[Z")
    public static boolean[] field414 = new boolean[5];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    private static int field408 = 2301979;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[Z")
    public static boolean[] field416 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lja;")
    private static class62 field417 = class30.method243(43, "Select a world");

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lja;")
    public static class62 field413 = field417;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lu;")
    public static class141 field406;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
    public static int[] field411;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[Lq;")
    public static class114[] field415;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V")
    public final void method123(long arg0, int arg1) {
        field400++;
        class28 var4 = (class28) this.field418.method537(-1, arg0);
        if (var4 != null) {
            var4.method1176((byte) -127);
            var4.method228((byte) 126);
            this.field421++;
        }
        if (arg1 != -7895) {
            this.field420 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field405++;
        class67.field1674[0].method932(arg4, arg0);
        class67.field1674[1].method932(arg4, arg0 + arg2 - 16);
        class19.method143(arg4, arg0 + 16, 16, arg2 - 32, field408);
        int var6 = (arg2 - 32) * arg2 / arg3;
        if (!arg5) {
            return;
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg1 / (arg3 - arg2);
        class19.method143(arg4, arg0 + var7 + 16, 16, var6, class28.field680);
        class19.method134(arg4, arg0 + var7 + 16, var6, class4.field38);
        class19.method134(arg4 + 1, arg0 + 16 + var7, var6, class4.field38);
        class19.method130(arg4, var7 + arg0 + 16, 16, class4.field38);
        class19.method130(arg4, arg0 + var7 + 17, 16, class4.field38);
        class19.method134(arg4 + 15, arg0 - (-16 - var7), var6, class84.field2015);
        class19.method134(arg4 + 14, var7 + 17 + arg0, var6 - 1, class84.field2015);
        class19.method130(arg4, arg0 + var6 + var7 + 15, 16, class84.field2015);
        class19.method130(arg4 + 1, var6 + var7 + arg0 + 14, 15, class84.field2015);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method125(int arg0) {
        field407++;
        Object var1 = class40.field925;
        synchronized (class40.field925) {
            if (class130.field2976 == arg0) {
                class148.field3481.method310(new class24(), 5, (byte) -1);
            }
            class130.field2976 = 600;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method126(int arg0) {
        field404 = null;
        field411 = null;
        field414 = null;
        field406 = null;
        field413 = null;
        if (arg0 != 1) {
            method125(26);
        }
        field415 = null;
        field416 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (arg0 > -112) {
            field414 = null;
        }
        while (true) {
            class28 var2 = this.field420.method69(23771);
            if (var2 == null) {
                this.field421 = this.field419;
                field410++;
                return;
            }
            var2.method1176((byte) -119);
            var2.method228((byte) 125);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLdf;J)V")
    public final void method128(byte arg0, class28 arg1, long arg2) {
        if (this.field421 == 0) {
            class28 var5 = this.field420.method69(23771);
            var5.method1176((byte) 34);
            var5.method228((byte) 119);
            if (this.field402 == var5) {
                class28 var6 = this.field420.method69(23771);
                var6.method1176((byte) -125);
                var6.method228((byte) 125);
            }
        } else {
            this.field421--;
        }
        this.field418.method538(arg1, (byte) -27, arg2);
        field409++;
        if (arg0 <= -62) {
            this.field420.method70(-4652, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(JI)Ldf;")
    public final class28 method129(long arg0, int arg1) {
        field403++;
        class28 var4 = (class28) this.field418.method537(-1, arg0);
        if (arg1 == 24838) {
            if (var4 != null) {
                this.field420.method70(-4652, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        this.field421 = arg0;
        this.field419 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field418 = new class68(var2);
    }
}
