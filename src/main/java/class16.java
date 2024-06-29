import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field228 = 0;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field236 = 0;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lvh;")
    private class328 field238 = new class328(64);

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lqe;")
    private class430 field240 = null;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lpj;")
    private class132 field233;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lpj;")
    private class132 field231;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field227 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field239;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field241;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method83(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILen;[IZ[I)Lap;", line = 4)
    public static final class438 method76(int arg0, int arg1, class289 arg2, int[] arg3, boolean arg4, int[] arg5) {
        field234++;
        byte[] var6 = new byte[arg0 * arg1];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg0 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg4) {
            field227 = null;
        }
        return new class438(arg2, arg0, arg1, var6);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lpg;", line = 34)
    public final class672 method77(int arg0, int arg1) {
        field230++;
        class672 var3 = (class672) this.field238.method1986((byte) -99, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field233.method940(1, arg0 & 0x7FFF, 0);
        } else {
            var4 = this.field231.method940(1, arg0, 0);
        }
        class672 var5 = new class672();
        var5.field9467 = this;
        if (var4 != null) {
            var5.method3718(-128, new class96(var4));
        }
        if (arg0 >= 32768) {
            var5.method3713((byte) 52);
        }
        this.field238.method1985(var5, (long) arg0, (byte) -102);
        return arg1 == 13529 ? var5 : null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(ILpj;Lpj;Lqe;)V", line = 199)
    public class16(int arg0, class132 arg1, class132 arg2, class430 arg3) {
        this.field233 = arg2;
        this.field240 = arg3;
        this.field231 = arg1;
        if (this.field231 != null) {
            this.field236 = this.field231.method936(1, -122);
        }
        if (this.field233 != null) {
            this.field228 = this.field233.method936(1, -121);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 82)
    public static void method78(boolean arg0) {
        if (arg0) {
            method80(87);
        }
        field227 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Llaa;[IJB)Ljava/lang/String;", line = 98)
    public final String method79(class106 arg0, int[] arg1, long arg2, byte arg3) {
        field232++;
        if (this.field240 != null) {
            String var6 = this.field240.method1196(arg1, (byte) -116, arg2, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 != -39) {
            method81(3, -54, 10, 8, -27, -90);
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 119)
    public static final void method80(int arg0) {
        field237++;
        if (arg0 != 0) {
            return;
        }
        try {
            Method var1 = (field241 == null ? (field241 = method83("java.lang.Runtime")) : field241).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class398.field5528 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V", line = 148)
    public static final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field239++;
        int var6 = class355.method2104(class631.field8829, arg0, -116, class92.field1219);
        int var7 = class355.method2104(class631.field8829, arg4, 116, class92.field1219);
        if (arg5 != 1) {
            field235 = -96;
        }
        int var8 = class355.method2104(class144.field2148, arg3, 117, class482.field6703);
        int var9 = class355.method2104(class144.field2148, arg1, -101, class482.field6703);
        for (int var10 = var6; var10 <= var7; var10++) {
            class548.method3012(var9, (byte) 23, arg2, var8, class476.field6655[var10]);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLjr;)Lhh;", line = 176)
    public static final class115 method82(boolean arg0, class96 arg1) {
        field229++;
        class115 var2 = new class115();
        var2.field1540 = arg1.method743((byte) -19);
        if (arg0) {
            field235 = -66;
        }
        var2.field1541 = class609.field8469.method77(var2.field1540, 13529);
        return var2;
    }
}
