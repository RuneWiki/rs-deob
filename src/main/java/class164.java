import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class164 implements Runnable {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    public boolean field2767 = true;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field2769 = new Object();

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field2772 = 0;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
    public int[] field2773 = new int[500];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[I")
    public int[] field2776 = new int[500];

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Le;")
    public static class191 field2770 = class54.method368("Suche nach Updates )2 ", 2047);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2768 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Le;")
    public static class191 field2777 = class54.method368(":assistreq:", 2047);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Le;")
    public static class191 field2779 = class54.method368("weiss:", 2047);

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[I")
    public static int[] field2778 = new int[2000];

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Le;")
    public static class191 field2780 = class54.method368("Lade Benutzeroberfl-=che )2 ", 2047);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lng;")
    public static class121 field2781;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1107(boolean arg0, int arg1) {
        if (arg0) {
            method1108(-127);
        }
        field2771++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class188.field3306[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field2768 = null;
        field2777 = null;
        field2770 = null;
        field2780 = null;
        field2778 = null;
        field2779 = null;
        if (arg0 < 59) {
            field2781 = null;
        }
        field2781 = null;
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2767) {
            Object var1 = this.field2769;
            synchronized (this.field2769) {
                if (this.field2772 < 500) {
                    this.field2773[this.field2772] = class189.field3325;
                    this.field2776[this.field2772] = class133.field2229;
                    this.field2772++;
                }
            }
            class18.method142(true, 50L);
        }
        field2766++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILai;BII)V")
    public static final void method1109(int arg0, int arg1, int arg2, class220 arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != -115) {
            return;
        }
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class241.method1687(arg2, arg0, arg6);
        } else if (arg5 == 1) {
            var7 = class65.method429(arg2, arg0, arg6);
        } else if (arg5 == 2) {
            var7 = class197.method1389(arg2, arg0, arg6);
        } else if (arg5 == 3) {
            var7 = class192.method1365(arg2, arg0, arg6);
        }
        field2775++;
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x31C65C) >> 20;
        class102 var14 = class31.method216(var10, (byte) 121);
        if (var14.method634((byte) 52)) {
            class88.method534(var14, arg0, arg6, 2, arg2);
        }
        int var15 = ((int) var7 & 0x7E0BB) >> 14;
        if (var7 == 0L) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                class185.method1255(arg2, arg0, arg6);
                return;
            }
            if (arg5 != 2) {
                if (arg5 == 3) {
                    class67.method444(arg2, arg0, arg6);
                    if (var14.field1679 == 1) {
                        arg3.method1492(arg0, (byte) -24, arg6);
                        return;
                    }
                }
                return;
            }
            class99.method618(arg2, arg0, arg6);
            if (var14.field1679 != 0 && var14.field1652 + arg0 < 104 && (arg6 + var14.field1652) < 104 && (arg0 + var14.field1686) < 104 && (var14.field1686 + arg6) < 104) {
                arg3.method1494(arg0, var14.field1652, arg6, 3, var14.field1641, var14.field1686, var13);
                return;
            }
            return;
        }
        class73.method475(arg2, arg0, arg6);
        if (var14.field1679 != 0) {
            arg3.method1505(arg0, arg6, var13, var15, var14.field1641, 89);
            return;
        }
    }
}
