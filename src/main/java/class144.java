import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class144 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lnj;")
    private class162 field2064 = new class162(64);

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lmg;")
    private class101 field2069;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lmg;")
    public static class101 field2062;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
    public static final boolean method970(int arg0) {
        field2063++;
        try {
            if (arg0 != -257) {
                method973(false);
            }
            if (class88.field1282 == 2) {
                if (class497.field7248 == null) {
                    class497.field7248 = class208.method1288(class12.field183, class3.field19, class216.field3008);
                    if (class497.field7248 == null) {
                        return false;
                    }
                }
                if (class457.field6710 == null) {
                    class457.field6710 = new class271(class50.field604, class149.field2161);
                }
                if (class121.field1817.method553(class23.field310, class457.field6710, 22050, 0, class497.field7248)) {
                    class121.field1817.method519(-116);
                    class121.field1817.method548(class88.field1281, false);
                    class121.field1817.method528(class497.field7248, class385.field5610, -102);
                    class88.field1282 = 0;
                    class457.field6710 = null;
                    class497.field7248 = null;
                    class12.field183 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class121.field1817.method524(117);
            class12.field183 = null;
            class88.field1282 = 0;
            class497.field7248 = null;
            class457.field6710 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method971(byte arg0) {
        if (arg0 != 26) {
            method971((byte) -122);
        }
        field2067++;
        if (class132.field1928 != null && class150.field2284 != null) {
            return;
        }
        class150.field2284 = new int[256];
        class132.field1928 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class132.field1928[var1] = (int) (Math.sin(var2) * 4096.0D);
            class150.field2284[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lob;")
    public final class517 method972(int arg0, byte arg1) {
        field2066++;
        class162 var3 = this.field2064;
        class517 var4;
        synchronized (this.field2064) {
            if (arg1 <= 49) {
                this.field2068 = -49;
            }
            var4 = (class517) this.field2064.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2069.method727(arg0, 19, -83);
        class517 var6 = new class517();
        if (var5 != null) {
            var6.method3077(-5944, new class391(var5));
        }
        class162 var7 = this.field2064;
        synchronized (this.field2064) {
            this.field2064.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method973(boolean arg0) {
        field2062 = null;
        if (!arg0) {
            field2062 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)I")
    public static final int method974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2065++;
        if (arg1 != -10850) {
            field2062 = null;
        }
        int var5 = 65536 - class183.field2678[arg2 * 8192 / arg0] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFLgl;II[BIIIFI)V")
    public static final void method975(float arg0, float arg1, float arg2, float arg3, class425 arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10, float arg11, int arg12) {
        if (arg9 != -473) {
            method974(24, 12, 95, 100, 125);
        }
        for (int var13 = 0; var13 < arg12; var13++) {
            class93.method685(var13, arg9 + 346, arg2, arg7, arg6, arg11, arg4, arg8, arg12, arg10, arg0, arg5, arg3, arg1);
            arg6 += arg5 * arg10;
        }
        field2061++;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class144(class66 arg0, int arg1, class101 arg2) {
        this.field2069 = arg2;
        this.field2068 = this.field2069.method753(19, -112);
    }
}
