import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class356 {

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "B")
    public byte field4976;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field4956;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lqm;")
    public class356 field4967;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "F")
    public static float field4959 = 1024.0F;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4972 = 0;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "[B")
    public static byte[] field4961 = new byte[32896];

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[Z")
    public static boolean[] field4978;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[I")
    public static int[] field4979;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field4957;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBZI)V")
    public static final void method2139(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        class332.field4559 = 0L;
        field4960++;
        int var5 = class18.method156((byte) 109);
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (arg2 < 100) {
            method2139(-77, -81, (byte) -86, false, -75);
        }
        if (!class338.field4636.method1085()) {
            arg3 = true;
        }
        class136.method825(var5, arg0, arg4, arg1, (byte) -51, arg3);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lll;I)Z")
    public static final boolean method2140(class248 arg0, int arg1) {
        if (arg1 == 256) {
            field4958++;
            return class319.field4366 == arg0 || class334.field4581 == arg0 || class39.field674 == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILms;)V")
    public static final void method2141(int arg0, class363 arg1) {
        field4962++;
        if (class287.field3913 == arg1.field5136) {
            class127.field1809[arg1.field5202] = true;
        }
        if (arg0 >= -58) {
            method2140((class248) null, 20);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public static void method2142(boolean arg0) {
        field4961 = null;
        field4979 = null;
        if (arg0) {
            method2140((class248) null, -112);
        }
        field4978 = null;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIB)V")
    public class356(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4976 = arg4;
        this.field4956 = arg0;
        this.field4969 = arg3;
        this.field4963 = arg1;
        this.field4965 = arg2;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqm;I)V")
    public class356(class356 arg0, int arg1) {
        this.field4967 = arg0;
        this.field4963 = this.field4967.field4963 + arg1;
        this.field4976 = this.field4967.field4976;
        this.field4969 = this.field4967.field4969 + arg1;
        this.field4956 = this.field4967.field4956;
        this.field4965 = this.field4967.field4965 + arg1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4961[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4977 = 0;
        field4978 = new boolean[200];
        field4979 = new int[14];
    }
}
