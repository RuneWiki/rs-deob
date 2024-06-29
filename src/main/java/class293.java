import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class293 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4876 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[I")
    public static int[] field4880;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[[B")
    public static byte[][] field4877;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V", line = 4)
    public void method1415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -10270) {
            this.method1415(-18, -43, 9, -107, -50);
        }
        field4874++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1947(boolean arg0, int arg1) {
        if (arg0) {
            field4883++;
            class254.field4085.method491(109, arg1);
            class91.field1416.method491(-50, arg1);
            class277.field4550.method491(-112, arg1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;IIIZ)V", line = 40)
    public void method1481(class293 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4881++;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZI)Z", line = 49)
    public static final boolean method1948(boolean arg0, int arg1) {
        field4875++;
        if (arg1 < 0) {
            return false;
        }
        if (!arg0) {
            method1951((byte) -37);
        }
        int var2 = class88.field1355[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIII)Z", line = 80)
    public static final boolean method1949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class54.field862 * arg0 + class297.field4988 * arg3 >> 16;
        int var6 = class54.field862 * arg3 - class297.field4988 * arg0 >> 16;
        int var7 = class36.field519 * var6 + class191.field3006 * arg1 >> 16;
        int var8 = class36.field519 * arg1 - class191.field3006 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class36.field519 * var6 + class191.field3006 * arg2 >> 16;
        int var12 = class36.field519 * arg2 - class191.field3006 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class120.field1892 && var13 < class120.field1892) {
            return false;
        } else if (var9 > class85.field1276 && var13 > class85.field1276) {
            return false;
        } else if (var10 < class124.field1904 && var14 < class124.field1904) {
            return false;
        } else {
            return var10 <= class118.field1782 || var14 <= class118.field1782;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lub;", line = 130)
    public static final class261 method1950(int arg0, byte arg1) {
        int var2 = 61 / ((arg1 + 32) / 61);
        field4879++;
        class261 var3 = (class261) class204.field3237.method487(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class142.field2276.method261(-1, 3, arg0);
        class261 var5 = new class261();
        if (var4 != null) {
            var5.method1681((byte) -127, new class3(var4));
        }
        class204.field3237.method488(var5, (byte) 35, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Lvc;", line = 153)
    public class293 method1453(int arg0, int arg1, int arg2) {
        field4878++;
        return this;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 163)
    public static void method1951(byte arg0) {
        field4880 = null;
        field4876 = null;
        field4877 = (byte[][]) null;
        if (arg0 >= -122) {
            field4877 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()Z", line = 175)
    public boolean method1465() {
        field4882++;
        return false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
    public abstract int method214();
}
