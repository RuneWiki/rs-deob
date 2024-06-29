import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class271 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lvl;")
    public static class13 field3885 = new class13("WTRC", 1);

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "J")
    public static long field3877;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Lkg;")
    public final class271 method1767(int arg0, byte arg1) {
        if (arg1 == 84) {
            field3880++;
            return new class271(this.field3878, arg0, this.field3881, this.field3884);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1768(int arg0) {
        if (arg0 >= 72) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JB)V")
    public static final void method1769(long arg0, byte arg1) {
        field3882++;
        int var3 = class596.field8376 + class660.field9039.field1264;
        int var4 = class739.field10276 + class660.field9039.field1250;
        if (class453.field6403 - var3 < -2000 || class453.field6403 - var3 > 2000 || (class191.field2552 - var4) < -2000 || class191.field2552 - var4 > 2000) {
            class191.field2552 = var4;
            class453.field6403 = var3;
        }
        if (class453.field6403 != var3) {
            int var5 = var3 - class453.field6403;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class453.field6403 += var6;
        }
        if (class191.field2552 != var4) {
            int var7 = var4 - class191.field2552;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class191.field2552 += var8;
        }
        class552.field7773 += (float) arg0 * class720.field9993 / 6.0F;
        class2.field19 += (float) arg0 * class518.field7368 / 6.0F;
        int var9 = -54 % ((arg1 + 40) / 58);
        class401.method2509(102);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1770(String arg0, int arg1) throws ClassNotFoundException {
        field3879++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 < 70) {
            field3877 = -1L;
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIII)V")
    public class271(int arg0, int arg1, int arg2, int arg3) {
        this.field3884 = arg3;
        this.field3876 = arg1;
        this.field3881 = arg2;
        this.field3878 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1771(byte arg0, int arg1) {
        if (arg0 != 69) {
            field3877 = -29L;
        }
        field3883++;
        class136 var2 = (class136) class649.field8919.method3612(-126, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class111.method790(var7, var4, (byte) -119);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class136(var3);
            class649.field8919.method3611(var2, (byte) 36, (long) arg1);
        }
        return var2.field1981;
    }
}
