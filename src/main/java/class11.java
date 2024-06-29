import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class11 extends class114 {

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "[Lbf;")
    public static class108[] field187;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V")
    public static final void method68(byte arg0) {
        class131.field1830.method804(false);
        ++field188;
        int var1 = 34 / ((-52 - arg0) / 52);
        int var2 = class131.field1830.method805(1, (byte) 38);
        if (var2 != 0) {
            int var3 = class131.field1830.method805(2, (byte) 75);
            if (var3 == 0) {
                class211.field3131[class102.field1466++] = 2047;
            } else if (~var3 == -2) {
                int var4 = class131.field1830.method805(3, (byte) -128);
                class250.field3905.method1675(1, var4, true);
                int var5 = class131.field1830.method805(1, (byte) -102);
                if (var5 == 1) {
                    class211.field3131[class102.field1466++] = 2047;
                }
            } else if (~var3 == -3) {
                if (class131.field1830.method805(1, (byte) 75) != 1) {
                    int var6 = class131.field1830.method805(3, (byte) -100);
                    class250.field3905.method1675(0, var6, true);
                } else {
                    int var7 = class131.field1830.method805(3, (byte) -124);
                    class250.field3905.method1675(2, var7, true);
                    int var8 = class131.field1830.method805(3, (byte) 39);
                    class250.field3905.method1675(2, var8, true);
                }
                int var9 = class131.field1830.method805(1, (byte) 94);
                if (var9 == 1) {
                    class211.field3131[class102.field1466++] = 2047;
                }
            } else if (var3 == 3) {
                int var10 = class131.field1830.method805(7, (byte) 79);
                int var11 = class131.field1830.method805(7, (byte) -100);
                int var12 = class131.field1830.method805(1, (byte) 96);
                int var13 = class131.field1830.method805(1, (byte) 60);
                if (var13 == 1) {
                    class211.field3131[class102.field1466++] = 2047;
                }
                class166.field2364 = class131.field1830.method805(2, (byte) -9);
                class250.field3905.method2122(var10, var12 == 1, 0, var11);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)I")
    public static final int method69(byte arg0) {
        ++field181;
        if (arg0 != -70) {
            field186 = -88;
        }
        if (class175.field2471) {
            return 0;
        } else if (!class294.method1973(2)) {
            return 1;
        } else {
            return class281.field4464 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V")
    public static void method70(int arg0) {
        if (arg0 != 0) {
            method71(-101, (byte) -71);
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class11() {
        this(4096);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)I")
    public static final int method71(int arg0, byte arg1) {
        ++field190;
        int var2 = 0;
        if (arg0 < 0 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            ++var2;
            arg0 >>>= 1;
        }
        if (arg1 <= 52) {
            field186 = 76;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        super(0, true);
        this.field185 = 4096;
        this.field185 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field189;
        if (~arg1 == -1) {
            this.field185 = (arg0.method1374((byte) -60) << 12) / 255;
        }
        if (arg2 != 12953) {
            method69((byte) -48);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -119);
        if (super.field1630.field710) {
            class285.method1877(var3, 0, class145.field2009, this.field185);
        }
        if (arg1) {
            field187 = null;
        }
        ++field183;
        return var3;
    }
}
