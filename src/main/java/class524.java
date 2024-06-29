import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class524 {

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public int field6952 = 128;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public int field6951 = 128;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public int field6958;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public int field6950;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "F")
    public static float field6956;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "J")
    public static long field6961;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Laha;")
    public static class385 field6960;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lbaa;", line = 9)
    public final class524 method2897(int arg0) {
        if (arg0 != -1) {
            method2901(6, -91, 4, 82);
        }
        field6959++;
        return new class524(this.field6958, this.field6952, this.field6951, this.field6949, this.field6950, this.field6957);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(I)V", line = 183)
    public class524(int arg0) {
        this.field6958 = arg0;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIIIII)V", line = 190)
    private class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6958 = arg0;
        this.field6957 = arg5;
        this.field6949 = arg3;
        this.field6950 = arg4;
        this.field6951 = arg2;
        this.field6952 = arg1;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)Z", line = 32)
    public static final boolean method2898(int arg0) {
        field6948++;
        try {
            if (class320.field4576 == 2) {
                if (class422.field5819 == null) {
                    class422.field5819 = class234.method1478(class556.field7305, class65.field803, class172.field2631);
                    if (class422.field5819 == null) {
                        return false;
                    }
                }
                if (class574.field7537 == null) {
                    class574.field7537 = new class120(class475.field6520, class635.field8447);
                }
                class3 var1 = class566.field7445;
                if (class577.field7577 != null) {
                    var1 = class577.field7577;
                }
                if (var1.method56(-28410, class422.field5819, class574.field7537, 22050, class470.field6438)) {
                    class566.field7445 = var1;
                    class566.field7445.method52((byte) -91);
                    if (class506.field6765 <= 0) {
                        class320.field4576 = 0;
                        class566.field7445.method34(true, class175.field2641);
                        for (int var2 = 0; var2 < class453.field6189.length; var2++) {
                            class566.field7445.method43((byte) -119, var2, class453.field6189[var2]);
                            class453.field6189[var2] = 255;
                        }
                    } else {
                        class320.field4576 = 3;
                        class566.field7445.method34(true, class175.field2641 >= class506.field6765 ? class506.field6765 : class175.field2641);
                        for (int var3 = 0; var3 < class453.field6189.length; var3++) {
                            class566.field7445.method43((byte) -119, var3, class453.field6189[var3]);
                            class453.field6189[var3] = 255;
                        }
                    }
                    if (class577.field7577 == null) {
                        if (field6961 <= 0L) {
                            class566.field7445.method37(arg0 ^ 0xFFFFB147, class422.field5819, class307.field4417);
                        } else {
                            class566.field7445.method47(class307.field4417, true, class422.field5819, field6961, (byte) 28);
                        }
                    }
                    if (class98.field1220 != null) {
                        class98.field1220.method1796(class566.field7445, 82);
                    }
                    class422.field5819 = null;
                    field6961 = 0L;
                    class577.field7577 = null;
                    class556.field7305 = null;
                    class574.field7537 = null;
                    return true;
                }
            }
            if (arg0 != 28984) {
                field6956 = -1.4794431F;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class566.field7445.method41(2064);
            class422.field5819 = null;
            class320.field4576 = 0;
            class574.field7537 = null;
            class577.field7577 = null;
            class556.field7305 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lbaa;Z)V", line = 138)
    public final void method2899(class524 arg0, boolean arg1) {
        this.field6950 = arg0.field6950;
        field6954++;
        this.field6952 = arg0.field6952;
        this.field6957 = arg0.field6957;
        this.field6951 = arg0.field6951;
        this.field6958 = arg0.field6958;
        this.field6949 = arg0.field6949;
        if (arg1) {
            method2900(-103);
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V", line = 154)
    public static void method2900(int arg0) {
        if (arg0 == 0) {
            field6960 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII)I", line = 164)
    public static final int method2901(int arg0, int arg1, int arg2, int arg3) {
        field6953++;
        if (arg1 == arg3) {
            return arg1;
        }
        int var4 = 128 - arg2;
        int var5 = (arg1 & 0x7F) * var4 + (arg3 & 0x7F) * arg2 >> 7;
        int var6 = (arg1 & 0x380) * var4 + ((arg3 & 0x380) * arg2) >> 7;
        int var7 = (arg0 & arg1) * var4 + ((arg3 & 0xFC00) * arg2) >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }
}
