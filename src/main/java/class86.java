import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class86 extends class223 {

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    private int field1278 = 4096;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    private int field1287 = 0;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Z")
    public static boolean field1276 = false;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "[I")
    public static int[] field1281 = new int[100];

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[S")
    public static short[] field1282 = new short[500];

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "[Lsj;")
    public static class50[] field1283 = new class50[14];

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Lac;")
    public static class139 field1279;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "[I")
    public static int[] field1277;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field1280;
        if (arg2 != 102) {
            field1276 = false;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1278 = arg0.method260((byte) -67);
            }
        } else {
            this.field1287 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field1286;
        if (arg0 < 14) {
            method654(-19, 7);
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, arg1, -77);
            for (int var5 = 0; ~class250.field4008 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1287 <= var6 && ~var6 >= ~this.field1278 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, true);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    public static void method653(byte arg0) {
        field1277 = null;
        field1279 = null;
        field1283 = null;
        field1282 = null;
        field1281 = null;
        if (arg0 <= 6) {
            method653((byte) -33);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Lmc;")
    public static final class206 method654(int arg0, int arg1) {
        ++field1285;
        if (arg1 <= 91) {
            return null;
        } else {
            class206 var2 = (class206) class166.field2509.method1173((long) arg0, true);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class170.field2578.method721((byte) -117, class88.method670(arg0, -128), class254.method1720(arg0, -26));
                class206 var4 = new class206();
                var4.field3158 = arg0;
                if (var3 != null) {
                    var4.method1444(-115, new class31(var3));
                }
                class166.field2509.method1167((byte) 121, var4, (long) arg0);
                return var4;
            }
        }
    }
}
