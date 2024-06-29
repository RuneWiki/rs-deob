import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class151 {

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "[I")
    public int[] field2206 = new int[4];

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "B")
    public byte field2197;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "[I")
    public int[] field2207;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "B")
    public byte field2199;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "[I")
    public int[] field2203;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "S")
    public short field2200;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "S")
    public short field2202;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "S")
    public short field2205;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "S")
    public short field2208;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "[S")
    public short[] field2209;

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "[S")
    public short[] field2204;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "[S")
    public short[] field2196;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "Lla;")
    public static class423 field2210;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field2211;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1096(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 11)
    public static void method1093(int arg0) {
        if (arg0 == 1) {
            field2210 = null;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 21)
    public static final int method1094(Random arg0, int arg1, int arg2) {
        field2201++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class211.method1496(arg1 - 4, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            if (arg1 != 4) {
                method1095(null, 53);
            }
            return class316.method1941(66, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 57)
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2197 = (byte) arg0;
        this.field2207 = new int[4];
        this.field2199 = (byte) arg1;
        this.field2203 = new int[4];
        this.field2206[2] = arg4;
        this.field2206[1] = arg3;
        this.field2206[3] = arg5;
        this.field2206[0] = arg2;
        this.field2207[3] = arg9;
        this.field2207[0] = arg6;
        this.field2207[1] = arg7;
        this.field2207[2] = arg8;
        this.field2200 = (short) (arg2 >> class639.field9095);
        this.field2203[1] = arg11;
        this.field2203[2] = arg12;
        this.field2203[0] = arg10;
        this.field2203[3] = arg13;
        this.field2202 = (short) (arg4 >> class639.field9095);
        this.field2205 = (short) (arg10 >> class639.field9095);
        this.field2208 = (short) (arg12 >> class639.field9095);
        this.field2209 = new short[4];
        this.field2204 = new short[4];
        this.field2196 = new short[4];
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 89)
    public static final boolean method1095(String arg0, int arg1) {
        field2198++;
        if (arg1 != 3) {
            method1094(null, -98, -29);
        }
        return class522.method3179(arg0, 9, field2211 == null ? (field2211 = method1096("jca")) : field2211);
    }
}
