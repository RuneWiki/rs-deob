import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class445 extends class371 {

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    private int field6484;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    private int field6485;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
    private int field6493;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "Llh;")
    public static class125 field6487;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "[Lha;")
    public static class116[] field6486;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V", line = 3)
    public class445() {
        this(0);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V", line = 6)
    private class445(int arg0) {
        super(0, false);
        this.method2707((byte) 87, arg0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)[[I", line = 16)
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            return null;
        } else {
            ++field6483;
            int[][] var3 = super.field5364.method3064(1, arg1);
            if (super.field5364.field7632) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class41.field455; ++var7) {
                    var4[var7] = this.field6493;
                    var5[var7] = this.field6484;
                    var6[var7] = this.field6485;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 56)
    public static final void method2703(int arg0) {
        class356.method2183(false);
        if (arg0 == 24236) {
            ++field6491;
            class212.method1374(class94.field1158.field300, (byte) -1, 2, 22050);
            class94.field1170 = class292.method1819(class328.field4850, 0, class110.field1401, 22050, arg0 ^ 24492);
            class94.field1170.method1656(112, class648.field9399);
            class178.field2704 = class292.method1819(class328.field4850, 1, class110.field1401, 2048, arg0 ^ 24492);
            class178.field2704.method1656(59, class105.field1321);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII)V", line = 73)
    public static final void method2704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class402.field5767 = arg2;
        ++field6492;
        int var6 = 35 / ((61 - arg3) / 41);
        class529.field7853 = arg1;
        class261.field3842 = arg4;
        class133.field1770 = arg0;
        class32.field343 = arg5;
        if (class402.field5767 >= 100) {
            int var7 = class32.field343 * 128 + 64;
            int var8 = class529.field7853 * 128 + 64;
            int var9 = class226.method1477(class355.field5157, true, var7, var8) - class133.field1770;
            int var10 = -class358.field5200 + var7;
            int var11 = -class111.field1412 + var9;
            int var12 = -class367.field5319 + var8;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class151.field1935 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 16383;
            class543.field8120 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D);
            if (class151.field1935 < 1024) {
                class151.field1935 = 1024;
            }
            class495.field7464 = 0;
            if (~class151.field1935 < -3073) {
                class151.field1935 = 3072;
            }
        }
        class287.field4232 = 2;
    }

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)V", line = 119)
    public static void method2705(int arg0) {
        field6487 = null;
        if (arg0 == 16383) {
            field6486 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lps;I)Lrf;", line = 130)
    public static final class109 method2706(class428 arg0, int arg1) {
        if (arg1 != -19907) {
            return null;
        } else {
            ++field6490;
            return new class109(arg0.method2622((byte) 124), arg0.method2622((byte) 123), arg0.method2622((byte) 125), arg0.method2622((byte) 124), arg0.method2601(arg1 ^ -19881), arg0.method2601(70), arg0.method2561((byte) -96));
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBLps;)V", line = 148)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field6488;
        int var4 = -102 / ((-15 - arg1) / 39);
        if (~arg0 == -1) {
            this.method2707((byte) 87, arg2.method2601(71));
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(BI)V", line = 173)
    private final void method2707(byte arg0, int arg1) {
        this.field6493 = 4080 & arg1 >> 12;
        this.field6484 = (65280 & arg1) >> 4;
        ++field6489;
        this.field6485 = 4080 & arg1 << 4;
        if (arg0 != 87) {
            method2706((class428) null, -37);
        }
    }
}
