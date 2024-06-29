import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class92 extends class555 {

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Ldr;")
    public static class675 field1183 = new class675(95, -1);

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "B")
    public static byte field1181;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[B")
    private byte[] field1182;

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 7)
    public class92() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V", line = 11)
    public static void method678(int arg0) {
        field1183 = null;
        if (arg0 != 255) {
            method678(-105);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBII)[B", line = 22)
    public final byte[] method679(int arg0, byte arg1, int arg2, int arg3) {
        field1184++;
        this.field1182 = new byte[arg0 * arg3 * arg2 * 2];
        if (arg1 == -69) {
            this.method751(arg3, arg0, false, arg2);
            return this.field1182;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method680(int arg0, int arg1, int arg2) {
        field1180++;
        if (arg2 <= 2) {
            return false;
        } else {
            return (arg1 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BILrr;I)V", line = 48)
    public static final void method681(byte arg0, int arg1, class337 arg2, int arg3) {
        if (class37.field542) {
            class362 var4 = class696.field9644 == -1 ? null : class46.field617.method1403(class696.field9644, 64);
            if (client.method1693(arg2).method2038(false) && (class458.field5709 & 0x20) != 0 && (var4 == null || arg2.method1928(-29535, class696.field9644, var4.field4635) != var4.field4635)) {
                class527.field6652++;
                class688.method3802(false, true, arg2.field4252, 60, 0, class467.field5794, 0L, class351.field4540 + " -> " + arg2.field4272, arg2.field4172, class7.field74, arg2.field4310);
            }
        }
        field1178++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class16.method89(-198102932, arg2, var5);
            if (var9 != null) {
                class688.method3802(false, true, arg2.field4252, 1002, 0, var9, (long) (var5 + 1), arg2.field4272, arg2.field4172, class189.method1124(var5, arg2, 26), arg2.field4310);
                class130.field1581++;
            }
        }
        String var6 = class687.method3798(arg2, 0);
        if (arg0 > -82) {
            field1183 = null;
        }
        if (var6 != null) {
            class688.method3802(false, true, arg2.field4252, 3, 0, var6, 0L, arg2.field4272, arg2.field4172, arg2.field4263, arg2.field4310);
            class457.field5703++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class16.method89(-198102932, arg2, var7);
            if (var8 != null) {
                class688.method3802(false, true, arg2.field4252, 22, 0, var8, (long) (var7 + 1), arg2.field4272, arg2.field4172, class189.method1124(var7, arg2, -88), arg2.field4310);
                class130.field1581++;
            }
        }
        if (!client.method1693(arg2).method2044(121)) {
            return;
        }
        if (arg2.field4166 == null) {
            class688.method3802(false, true, arg2.field4252, 44, 0, class671.field9123.method3726((byte) 110, class71.field912), 0L, "", arg2.field4172, -1, arg2.field4310);
        } else {
            class688.method3802(false, true, arg2.field4252, 44, 0, arg2.field4166, 0L, "", arg2.field4172, -1, arg2.field4310);
        }
        class318.field3979++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 123)
    public static final int method682(int arg0, int arg1) {
        if (arg1 < 94) {
            field1181 = -85;
        }
        field1179++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIB)V", line = 139)
    public final void method683(boolean arg0, int arg1, byte arg2) {
        field1185++;
        int var4 = arg1 * 2;
        if (!arg0) {
            method680(34, -46, 9);
        }
        int var5 = arg2 & 0xFF;
        this.field1182[var4++] = -1;
        this.field1182[var4] = (byte) (var5 * 3 >> 5);
    }
}
