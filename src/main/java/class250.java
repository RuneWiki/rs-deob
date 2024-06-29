import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class250 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
    public static int[] field3999 = new int[2];

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lnf;")
    public static class162 field4009 = new class162(100);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lub;I)Z")
    public static final boolean method1698(class92 arg0, int arg1) {
        if (arg1 != 2) {
            method1704(20, (class92) null);
        }
        field4012++;
        return arg0.method697(arg1 ^ 0x6F, class134.field2005);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)I")
    public static final int method1699(int arg0, boolean arg1) {
        field4002++;
        if (arg1) {
            field4013 = -123;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Lpk;")
    public static final class103 method1700(int arg0, int arg1) {
        class103 var2 = (class103) class290.field4508.method1173((long) arg0, true);
        field4006++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1469.method721((byte) -117, class121.method914(arg0, (byte) 55), class156.method1126(arg0, (byte) -74));
        if (arg1 > -9) {
            return null;
        }
        class103 var4 = new class103();
        var4.field1598 = arg0;
        if (var3 != null) {
            var4.method786(new class31(var3), 31546);
        }
        var4.method782(16);
        class290.field4508.method1167((byte) 119, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLha;)V")
    public final void method1701(byte arg0, class31 arg1) {
        field4003++;
        if (arg0 >= -109) {
            method1704(70, (class92) null);
        }
        while (true) {
            int var3 = arg1.method265(-102);
            if (var3 == 0) {
                return;
            }
            this.method1703(70, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field4009 = null;
        if (arg0 != 2) {
            field4009 = null;
        }
        field3999 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILha;)V")
    private final void method1703(int arg0, int arg1, class31 arg2) {
        int var4 = 56 / ((arg0 + 4) / 51);
        if (arg1 == 1) {
            this.field4004 = arg2.method260((byte) -67);
            this.field4001 = arg2.method265(-105);
            this.field4005 = arg2.method265(-111);
        }
        field4010++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILub;)V")
    public static final void method1704(int arg0, class92 arg1) {
        class54.field861 = arg1;
        field4000++;
        if (arg0 != 5969) {
            method1702(-39);
        }
    }
}
