import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class215 extends class280 {

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
    public static int field3082 = 2;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "[I")
    public static int[] field3084 = new int[25];

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "Lsf;")
    public static class143 field3087 = new class143(8);

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lqj;")
    public static class238 field3080;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "Z")
    public static boolean field3079;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 6)
    public static final void method1350(int arg0) {
        ++field3086;
        class35.method285((byte) -1);
        class24.method208((byte) -122);
        class188.method1169(true);
        class125.method858(0);
        class405.method2639((byte) 117);
        class410.method2666(104);
        class205.method1298(115);
        class107.method747((byte) -92);
        class403.method2613(false);
        class271.method1737((byte) 40);
        class411.method2672((byte) -43);
        class436.method2757(-77);
        class420.method2700(0);
        class205.method1297(0);
        class95.method617(-125);
        class358.method2354((byte) 101);
        class94.method579(-125);
        class394.method2580((byte) 111);
        class409.method2664(100);
        class125.method856(arg0 + -8227);
        class190.method1181(74);
        class77.method490(true);
        if (class24.field427 != 0) {
            for (int var1 = 0; ~class313.field4482.length < ~var1; ++var1) {
                class313.field4482[var1] = null;
            }
            class235.field3306 = 0;
        }
        class416.method2687((byte) 81);
        class204.method1289((byte) 61);
        class293.method1877(26);
        class174.method1063(0);
        class175.method1068(76);
        class365.field5353.method212(-93);
        class35.field574.method2130();
        class318.field4545.method2320(92);
        class327.method2014((byte) 121);
        class185.field2509.method1464(false);
        class411.field6150.method1464(false);
        class180.field2387.method1464(false);
        class159.field2078.method1464(false);
        class258.field3764.method1464(false);
        class285.field4163.method1464(false);
        class328.field4711.method1464(false);
        if (arg0 != 8110) {
            method1350(107);
        }
        class7.field70.method1464(false);
        class247.field3446.method1464(false);
        class252.field3656.method1464(false);
        class10.field94.method1464(false);
        class39.field632.method1464(false);
        class127.field1692.method1464(false);
        class208.field2987.method1464(false);
        class371.field5519.method1464(false);
        class302.field4336.method1464(false);
        class78.field1075.method1464(false);
        class207.field2986.method1464(false);
        class235.field3300.method1464(false);
        field3080.method1464(false);
        class340.field5003.method1464(false);
        class324.field4655.method1464(false);
        class129.field1721.method1464(false);
        class300.field4299.method1464(false);
        class50.field693.method1464(false);
        class355.field5212.method1464(false);
        class446.field6496.method1464(false);
        class327.field4704.method1464(false);
        class51.field758.method1464(false);
        class169.field2232.method212(-87);
        class26.field475.method212(-118);
        class142.field1869.method212(-127);
        class93.field1274.method212(-119);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[[I", line = 96)
    public final int[][] method1(int arg0, int arg1) {
        ++field3081;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087 && this.method1796(arg1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4123 * super.field4123;
            for (int var8 = 0; var8 < class344.field5043; ++var8) {
                int var9 = super.field4117[var8 % super.field4112 + var7];
                var6[var8] = class401.method2606(var9, 255) << 4;
                var5[var8] = class401.method2606(var9 >> 4, 4080);
                var4[var8] = class401.method2606(var9 >> 12, 4080);
            }
        }
        if (arg1 != 0) {
            method1351(43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V", line = 144)
    public static void method1351(int arg0) {
        field3080 = null;
        field3087 = null;
        if (arg0 <= 122) {
            method1353(73, -43);
        }
        field3084 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V", line = 159)
    public static final void method1352(String arg0, int arg1, int arg2, String arg3, int arg4, String arg5) {
        if (arg2 >= -48) {
            method1353(-122, -4);
        }
        ++field3085;
        class316.method1968(arg3, arg0, -23645, arg1, arg5, arg4, (String) null, -1);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V", line = 181)
    public static final void method1353(int arg0, int arg1) {
        ++field3078;
        class256 var2 = class363.method2385(arg0, arg1, (byte) 1);
        var2.method1611(arg0 ^ -78);
    }
}
