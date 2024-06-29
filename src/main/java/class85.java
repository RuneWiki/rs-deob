import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class85 extends class150 {

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "[F")
    public static float[] field1216 = new float[4];

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Lfd;")
    private class298 field1206;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lfd;")
    private class298 field1209;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "Lfd;")
    private class298 field1210;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "Lfd;")
    private class298 field1211;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "Lfd;")
    public class298 field1212;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "Lfd;")
    private class298 field1214;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)I", line = 3)
    public static final int method596(int arg0) {
        ++field1205;
        int var1 = class712.field9957.method2976((byte) 76);
        if (~var1 > ~(class383.field5501.length + arg0)) {
            class712.field9957 = class383.field5501[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZB)V", line = 17)
    public final void method597(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field1215;
        if (arg3 != -92) {
            this.field1214 = null;
        }
        int var5 = this.field1209.method1963() + arg1;
        int var6 = super.field2073.field7561 + arg1 + -this.field1211.method1963();
        int var7 = arg0 + this.field1214.method1961();
        int var8 = super.field2073.field7550 + (arg0 - this.field1206.method1961());
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = var9 * this.method956(arg3 ^ -29) / 10000;
        int[] var12 = new int[4];
        class129.field1802.method1454(var12);
        class129.field1802.method1544(var5, var7, var5 + var11, var8);
        this.method598(var9, var10, (byte) 62, var5, var7);
        class129.field1802.method1544(var5 + var11, var7, var6, var8);
        this.field1210.method1964(var5, var7, var9, var10);
        class129.field1802.method1544(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)V", line = 52)
    public void method598(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field1212.method1964(arg3, arg4, arg0, arg1);
        ++field1208;
        if (arg2 != 62) {
            this.field1209 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 68)
    public final void method200(int arg0) {
        if (arg0 <= 12) {
            this.field1209 = null;
        }
        super.method200(94);
        ++field1213;
        class504 var2 = (class504) super.field2073;
        this.field1212 = class532.method3159(super.field2074, 0, var2.field7018);
        this.field1210 = class532.method3159(super.field2074, 0, var2.field7017);
        this.field1209 = class532.method3159(super.field2074, 0, var2.field7016);
        this.field1211 = class532.method3159(super.field2074, 0, var2.field7014);
        this.field1214 = class532.method3159(super.field2074, 0, var2.field7009);
        this.field1206 = class532.method3159(super.field2074, 0, var2.field7007);
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 87)
    public static void method599(int arg0) {
        if (arg0 != 1) {
            method596(-82);
        }
        field1216 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Z", line = 98)
    public final boolean method202(byte arg0) {
        ++field1207;
        if (!super.method202((byte) -77)) {
            return false;
        } else {
            class504 var2 = (class504) super.field2073;
            if (!super.field2074.method1578(var2.field7018, (byte) -81)) {
                return false;
            } else if (!super.field2074.method1578(var2.field7017, (byte) -81)) {
                return false;
            } else if (!super.field2074.method1578(var2.field7016, (byte) -81)) {
                return false;
            } else if (arg0 >= -46) {
                return false;
            } else if (!super.field2074.method1578(var2.field7014, (byte) -81)) {
                return false;
            } else if (!super.field2074.method1578(var2.field7009, (byte) -81)) {
                return false;
            } else {
                return super.field2074.method1578(var2.field7007, (byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Luu;Luu;Lria;)V", line = 143)
    public class85(class237 arg0, class237 arg1, class504 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZII)V", line = 147)
    public final void method600(int arg0, boolean arg1, int arg2, int arg3) {
        ++field1203;
        if (arg3 != 0) {
            field1204 = 80;
        }
        if (arg1) {
            int[] var5 = new int[4];
            class129.field1802.method1454(var5);
            class129.field1802.method1544(arg2, arg0, super.field2073.field7561 + arg2, super.field2073.field7550 + arg0);
            int var6 = this.field1209.method1963();
            int var7 = this.field1209.method1961();
            int var8 = this.field1211.method1963();
            int var9 = this.field1211.method1961();
            this.field1209.method1970(arg2, (-var7 + super.field2073.field7550) / 2 + arg0);
            this.field1211.method1970(super.field2073.field7561 + arg2 + -var8, (-var9 + super.field2073.field7550) / 2 + arg0);
            class129.field1802.method1544(arg2, arg0, arg2 - -super.field2073.field7561, this.field1214.method1961() + arg0);
            this.field1214.method1964(arg2 + var6, arg0, -var6 + -var8 + super.field2073.field7561, super.field2073.field7550);
            int var10 = this.field1206.method1961();
            class129.field1802.method1544(arg2, -var10 + arg0 + super.field2073.field7550, super.field2073.field7561 + arg2, super.field2073.field7550 + arg0);
            this.field1206.method1964(arg2 - -var6, arg0 - var10 + super.field2073.field7550, -var6 + super.field2073.field7561 + -var8, super.field2073.field7550);
            class129.field1802.method1544(var5[0], var5[1], var5[2], var5[3]);
        }
    }
}
