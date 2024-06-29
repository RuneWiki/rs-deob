import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class193 {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[I")
    public static int[] field3043 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3039;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "[I")
    public static int[] field3042;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIBI)I", line = 14)
    public static final int method1469(int arg0, int arg1, byte arg2, int arg3) {
        field3044++;
        if (class277.field4290 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class146.field2386[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        if (arg2 != -47) {
            field3045 = 18;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var8) * class277.field4290[var6][var5][var4] + class277.field4290[var6][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class277.field4290[var6][var5][var4 + 1] + class277.field4290[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lug;I[B)V", line = 52)
    public final void method1470(class25 arg0, int arg1, byte[] arg2) {
        field3040++;
        if (arg0.field448[arg0.field397] != 31 || arg0.field448[arg0.field397 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3039 == null) {
            this.field3039 = new Inflater(true);
        }
        try {
            this.field3039.setInput(arg0.field448, arg0.field397 + 10, arg0.field448.length - 10 - (arg0.field397 + 8));
            this.field3039.inflate(arg2);
            if (arg1 > -34) {
                field3045 = -24;
            }
        } catch (Exception var5) {
            this.field3039.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3039.reset();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 80)
    public static final void method1471(byte arg0) {
        field3038++;
        class244.field3791.method656(0);
        if (arg0 >= -19) {
            field3042 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 94)
    public class193() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 99)
    public static void method1472(int arg0) {
        field3043 = null;
        field3042 = null;
        if (arg0 <= 63) {
            method1472(-13);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)Ljava/lang/String;", line = 116)
    public static final String method1473(int arg0) {
        if (arg0 != 0) {
            return (String) null;
        }
        field3037++;
        String var1;
        if (class78.field1136 == 1 && class66.field1006 < 2) {
            var1 = class143.field2350 + class311.field4822 + class352.field5626 + " ->";
        } else if (class210.field3237 && class66.field1006 < 2) {
            var1 = class202.field3130 + class311.field4822 + class83.field1203 + " ->";
        } else if (class208.field3205 && class116.field1774[81] && class66.field1006 > 2) {
            var1 = class78.method720(class66.field1006 - 2, false);
        } else {
            var1 = class78.method720(class66.field1006 - 1, false);
        }
        if (class66.field1006 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class66.field1006 - 2) + class239.field3719;
        }
        return var1;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V", line = 150)
    private class193(int arg0, int arg1, int arg2) {
    }
}
