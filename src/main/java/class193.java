import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class193 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    public boolean field3747 = true;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field3745 = new Object();

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
    public int[] field3759 = new int[500];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
    public int[] field3761 = new int[500];

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3760 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lkb;")
    public static class93 field3748 = class76.method390("mapmarker", 0);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lkb;")
    public static class93 field3750 = class76.method390("Ihr Spielkonto wird bereits benutzt)3", 0);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lkb;")
    private static class93 field3751 = class76.method390("FULL", 0);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lkb;")
    public static class93 field3752 = class76.method390(":chalreq:", 0);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3749 = 0;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lkb;")
    public static class93 field3755 = field3751;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILih;IBII)V")
    public static final void method1241(int arg0, class81 arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -99) {
            field3751 = null;
        }
        class110 var6 = new class110();
        field3753++;
        var6.field1995 = arg1.field1496 * 128;
        var6.field1985 = arg1.field1448;
        int var7 = arg1.field1439;
        var6.field1994 = arg1.field1463;
        var6.field1978 = arg1.field1491;
        var6.field1981 = arg1.field1457;
        var6.field1979 = arg5 * 128;
        int var8 = arg1.field1487;
        if (arg0 == 1 || arg0 == 3) {
            var8 = arg1.field1439;
            var7 = arg1.field1487;
        }
        var6.field1990 = (arg2 + var7) * 128;
        var6.field1982 = arg4;
        var6.field1986 = (arg5 + var8) * 128;
        var6.field1992 = arg2 * 128;
        if (arg1.field1482 != null) {
            var6.field1988 = arg1;
            var6.method596(-12585);
        }
        class98.field1834.method691(var6, (byte) 51);
        if (var6.field1985 != null) {
            var6.field1980 = var6.field1981 + (int) ((double) (var6.field1978 - var6.field1981) * Math.random());
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lmc;II)V")
    public static final void method1242(class112 arg0, int arg1, int arg2) {
        int var3 = 105 / ((-arg2 - 3) / 56);
        field3757++;
        if (arg0.field2056 > class21.field338) {
            class106.method581(arg0, 1536);
        } else if (arg0.field2037 < class21.field338) {
            class191.method1232(arg0, 8);
        } else {
            class159.method1092(arg0, 128);
        }
        if (arg0.field2032 < 128 || arg0.field2045 < 128 || arg0.field2032 >= 13184 || arg0.field2045 >= 13184) {
            arg0.field2056 = 0;
            arg0.field2045 = arg0.field2064[0] * 128 + arg0.field2046 * 64;
            arg0.field2077 = -1;
            arg0.field2040 = -1;
            arg0.field2037 = 0;
            arg0.field2032 = arg0.field2038[0] * 128 + arg0.field2046 * 64;
            arg0.method603(127);
        }
        if (class106.field1940 == arg0 && (arg0.field2032 < 1536 || arg0.field2045 < 1536 || arg0.field2032 >= 11776 || arg0.field2045 >= 11776)) {
            arg0.field2040 = -1;
            arg0.field2032 = arg0.field2038[0] * 128 + arg0.field2046 * 64;
            arg0.field2037 = 0;
            arg0.field2045 = arg0.field2064[0] * 128 + arg0.field2046 * 64;
            arg0.field2077 = -1;
            arg0.field2056 = 0;
            arg0.method603(125);
        }
        class192.method1240((byte) 104, arg0);
        class159.method1093(arg0, 120);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        field3748 = null;
        field3755 = null;
        if (arg0 != 35) {
            method1243((byte) -78);
        }
        field3752 = null;
        field3750 = null;
        field3751 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)I")
    public static final int method1244(int arg0, int arg1, byte arg2) {
        field3746++;
        int var3 = class176.method1161(133746609, arg1 - 1, arg0 + -1) + class176.method1161(133746609, arg1 - 1, arg0 + 1) + class176.method1161(133746609, arg1 + 1, arg0 + -1) + class176.method1161(133746609, arg1 + 1, arg0 + 1);
        int var4 = class176.method1161(133746609, arg1, arg0 - 1) + class176.method1161(133746609, arg1, arg0 + 1) + class176.method1161(133746609, arg1 + -1, arg0) + class176.method1161(133746609, arg1 - -1, arg0);
        int var5 = class176.method1161(133746609, arg1, arg0);
        if (arg2 > -63) {
            method1244(2, -104, (byte) 71);
        }
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3747) {
            Object var1 = this.field3745;
            synchronized (this.field3745) {
                if (this.field3760 < 500) {
                    this.field3759[this.field3760] = class97.field1826;
                    this.field3761[this.field3760] = class170.field3380;
                    this.field3760++;
                }
            }
            class39.method212(-1, 50L);
        }
        field3758++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public static final void method1245(int arg0, int arg1) {
        field3754++;
        if (!class67.method352(2, arg0)) {
            return;
        }
        class65[] var2 = class28.field460[arg0];
        int var3 = 0;
        if (arg1 != 18792) {
            method1243((byte) 57);
        }
        while (var2.length > var3) {
            class65 var4 = var2[var3];
            if (var4 != null) {
                var4.field1151 = 0;
                var4.field1043 = 0;
            }
            var3++;
        }
    }
}
