import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class80 extends class439 implements class609 {

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "Lfca;")
    public static class74 field1302 = new class74("", 16);

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "[B")
    public static byte[] field1307 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "Ldv;")
    public static class566 field1306 = new class566(33, 4);

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "Z")
    public static boolean field1310 = true;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "Lha;")
    public static class52 field1308;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "[[[B")
    public static byte[][][] field1299;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIII)V")
    public static final void method611(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class491.field6875.field3362 * arg2 >> 8;
        field1300++;
        if (var4 != 0 && arg0 != -1) {
            class360.method2160(arg0, var4, class7.field89, 15325, 0, false);
            class144.field2229 = true;
        }
        if (arg1 < 68) {
            method615(-12);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Z")
    public static final boolean method612(int arg0) {
        field1293++;
        if (class589.field8420) {
            try {
                class54.method508((byte) 56, class500.field6968.field3975, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -40 % ((18 - arg0) / 39);
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method613(boolean arg0, int arg1) {
        if (arg1 == -25838) {
            field1304++;
            return super.method613(arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
    public static final void method614(int arg0, int arg1) {
        field1305++;
        class314 var2 = class483.method2819(11, arg0, 21303);
        var2.method1962((byte) 0);
        if (arg1 < 8) {
            field1307 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)V")
    public static void method615(int arg0) {
        field1299 = null;
        if (arg0 == -1) {
            field1307 = null;
            field1306 = null;
            field1308 = null;
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)Z")
    public final boolean method616(byte arg0) {
        if (arg0 > -65) {
            return true;
        } else {
            field1292++;
            return this.method616((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method617(int arg0, int arg1, int arg2, Source arg3) {
        field1298++;
        int var5 = 63 % ((-arg0 - 1) / 41);
        super.method2592(arg2, arg3, (byte) 69);
        return true;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public final void method618(byte arg0) {
        super.method618((byte) 74);
        field1294++;
        if (arg0 < 11) {
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
    public final boolean method619(int arg0, int arg1, int arg2) {
        int var4 = 29 / ((arg1 + 35) / 47);
        super.method1477(-18855, arg2);
        field1297++;
        return true;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lpi;Z)V")
    public class80(class424 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
    public final int method620(int arg0) {
        field1295++;
        if (arg0 >= -120) {
            this.method618((byte) -20);
        }
        return super.method620(-123);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lld;")
    public static final class145 method621(int arg0, int arg1, boolean arg2) {
        field1303++;
        class145 var3 = new class145();
        var3.field2241 = arg0 + 1 + 5;
        var3.field2251 = arg1 + 5 + 1;
        var3.field2244 = -1;
        var3.field2243 = -1;
        var3.field2253 = new int[var3.field2251][var3.field2241];
        var3.method962(113);
        return arg2 ? null : var3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIB)V")
    public static final void method622(int arg0, int arg1, int arg2, byte arg3) {
        field1301++;
        int var4 = class491.field6875.field3362 * arg1 >> 8;
        if (arg2 == -1 && !class144.field2229) {
            class491.method2848(-26978);
        } else if (arg2 != -1 && (class531.field7446 != arg2 || !class492.method2860(-1)) && var4 != 0 && !class144.field2229) {
            class505.method2924(0, (byte) -98, false, arg0, var4, arg2, class236.field3305);
        }
        if (arg3 > 75) {
            class531.field7446 = arg2;
        }
    }
}
