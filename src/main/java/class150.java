import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class150 extends class68 {

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
    public static int[] field2078 = new int[1000];

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "[I")
    public static int[] field2074 = new int[100];

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Lnj;")
    public static class144 field2068 = new class144();

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
    private class150(int arg0) {
        super(0, false);
        this.method1010((byte) -125, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2074 = null;
        int var1 = -95 / ((arg0 - -30) / 59);
        field2078 = null;
        field2068 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class150() {
        this(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = -111 / ((63 - arg1) / 61);
        ++field2072;
        if (super.field920.field374) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class89.field1248 < ~var8; ++var8) {
                var5[var8] = this.field2076;
                var6[var8] = this.field2069;
                var7[var8] = this.field2075;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lql;II)Ljava/lang/String;")
    public static final String method1008(class224 arg0, int arg1, int arg2) {
        ++field2073;
        int var3 = -16 / ((arg2 - -63) / 62);
        try {
            int var4 = arg0.method1461(true);
            if (~var4 < ~arg1) {
                var4 = arg1;
            }
            byte[] var5 = new byte[var4];
            arg0.field3402 += class119.field1673.method52(arg0.field3402, var5, -7143, 0, arg0.field3336, var4);
            return class122.method801(114, var5, var4, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.method1010((byte) 3, arg0.method1454(116));
        }
        if (!arg2) {
            method1008((class224) null, 74, -26);
        }
        ++field2070;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Lo;")
    public static final class254 method1009(int arg0, int arg1, int arg2) {
        ++field2071;
        if (arg2 != -1290441076) {
            method1009(-72, -56, 115);
        }
        for (class254 var3 = (class254) class229.field3473.method21((byte) 67); var3 != null; var3 = (class254) class229.field3473.method22(true)) {
            if (var3.field3888 && var3.method1704(-80, arg1, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
    private final void method1010(byte arg0, int arg1) {
        this.field2075 = (255 & arg1) << 4;
        ++field2077;
        this.field2069 = (arg1 & 65280) >> 4;
        this.field2076 = (arg1 & 16711680) >> 12;
        int var3 = 74 % ((arg0 - -73) / 48);
    }
}
