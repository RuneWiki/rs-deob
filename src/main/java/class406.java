import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class406 {

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "[Lke;")
    private class443[] field6024;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6033 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "Lpp;")
    public static class464 field6035 = new class464(69, 6);

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "J")
    private long field6034;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "Lke;")
    private class443 field6029;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Lod;")
    public static class568 field6026;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
    public static void method2463(int arg0) {
        field6033 = null;
        if (arg0 != 20167) {
            field6026 = null;
        }
        field6035 = null;
        field6026 = null;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)Lke;")
    public final class443 method2464(int arg0) {
        field6028++;
        if (this.field6029 == null) {
            return null;
        }
        class443 var2 = this.field6024[(int) (this.field6034 & (long) (this.field6032 - 1))];
        while (this.field6029 != var2) {
            if (this.field6029.field6471 == this.field6034) {
                class443 var3 = this.field6029;
                this.field6029 = this.field6029.field6478;
                return var3;
            }
            this.field6029 = this.field6029.field6478;
        }
        this.field6029 = null;
        return arg0 == 17663 ? null : null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(JLke;I)V")
    public final void method2465(long arg0, class443 arg1, int arg2) {
        field6031++;
        if (arg1.field6470 != null) {
            arg1.method2619(true);
        }
        class443 var5 = this.field6024[(int) ((long) (this.field6032 - 1) & arg0)];
        if (arg2 != 69) {
            return;
        }
        arg1.field6478 = var5;
        arg1.field6470 = var5.field6470;
        arg1.field6470.field6478 = arg1;
        arg1.field6478.field6470 = arg1;
        arg1.field6471 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIZII)V")
    public static final void method2466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field6027++;
        class127 var10 = null;
        if (arg7) {
            field6033 = null;
        }
        for (class127 var11 = (class127) class207.field2932.method427(true); var11 != null; var11 = (class127) class207.field2932.method420(false)) {
            if (var11.field2078 == arg0 && var11.field2074 == arg9 && var11.field2073 == arg5 && var11.field2071 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class127();
            var10.field2078 = arg0;
            var10.field2073 = arg5;
            var10.field2071 = arg4;
            var10.field2074 = arg9;
            if (arg9 >= 0 && arg5 >= 0 && class146.field2247 > arg9 && class66.field990 > arg5) {
                class477.method2757(-16668, var10);
            }
            class207.field2932.method414(var10, (byte) 102);
        }
        var10.field2075 = arg6;
        var10.field2072 = arg3;
        var10.field2070 = arg8;
        var10.field2082 = arg1;
        var10.field2083 = arg2;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(JI)Lke;")
    public final class443 method2467(long arg0, int arg1) {
        field6025++;
        this.field6034 = arg0;
        if (arg1 <= 68) {
            field6033 = null;
        }
        class443 var4 = this.field6024[(int) ((long) (this.field6032 - 1) & arg0)];
        for (this.field6029 = var4.field6478; this.field6029 != var4; this.field6029 = this.field6029.field6478) {
            if (this.field6029.field6471 == arg0) {
                class443 var5 = this.field6029;
                this.field6029 = this.field6029.field6478;
                return var5;
            }
        }
        this.field6029 = null;
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
    public static final void method2468(byte arg0) {
        int var1 = -23 % ((arg0 - 53) / 37);
        field6030++;
        class21 var2 = class601.method3413(0, 15, (byte) 105);
        var2.method227(true);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
    public class406(int arg0) {
        this.field6024 = new class443[arg0];
        this.field6032 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class443 var3 = this.field6024[var2] = new class443();
            var3.field6478 = var3;
            var3.field6470 = var3;
        }
    }
}
