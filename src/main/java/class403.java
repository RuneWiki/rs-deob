import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class403 implements class46 {

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "Lpe;")
    public class564 field5693;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public int field5692;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public int field5682;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lop;")
    public class172 field5688;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/lang/String;")
    public String field5681;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Lkj;", line = 13)
    public static final class524 method2429(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        return var3 == null || var3.field6221 == null ? null : var3.field6221;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 21)
    public static final void method2430(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class298.field4017 = arg0;
        class298.field4019 = arg1;
        class72.field1090 = class298.field4019 > 1 && class298.field4017.method211();
        class295.field3981 = arg2;
        class454.field6392 = 0x1 << class295.field3981;
        class480.field6727 = class454.field6392 >> 1;
        Math.sqrt((double) (class480.field6727 * class480.field6727 + class480.field6727 * class480.field6727));
        class663.field9391 = arg3;
        class455.field6393 = arg4;
        class302.field4057 = arg5;
        class119.field1526 = arg6;
        class604.field8711 = class109.method793((byte) -127);
        class96.method734(84);
        class177.field2183 = new class433[arg3][class455.field6393][class302.field4057];
        class399.field5631 = new class37[arg3];
        if (arg7) {
            class16.field315 = new int[class455.field6393][class302.field4057];
            class206.field2475 = new byte[class455.field6393][class302.field4057];
            class285.field3860 = new short[class455.field6393][class302.field4057];
            class551.field8014 = new class433[1][class455.field6393][class302.field4057];
            class340.field4500 = new class37[1];
        } else {
            class16.field315 = null;
            class206.field2475 = null;
            class285.field3860 = null;
            class551.field8014 = null;
            class340.field4500 = null;
        }
        if (arg8) {
            class321.field4226 = new long[arg3][arg4][arg5];
            class436.field6249 = new class475[65535];
            class638.field9133 = new boolean[65535];
            class100.field1342 = 0;
        } else {
            class321.field4226 = null;
            class436.field6249 = null;
            class638.field9133 = null;
            class100.field1342 = 0;
        }
        class410.method2473(false);
        class549.field7969 = new class20[2][];
        class549.field7969[0] = new class20[class408.field5789[0]];
        class549.field7969[1] = new class20[class408.field5789[1]];
        class196.field2370 = new int[2];
        class516.field7547 = new class20[2][];
        class516.field7547[0] = new class20[class62.field1006[0]];
        class516.field7547[1] = new class20[class62.field1006[1]];
        class596.field8613 = new int[2];
        class67.field1036 = new class20[2][];
        class67.field1036[0] = new class20[class353.field4720[0]];
        class67.field1036[1] = new class20[class353.field4720[1]];
        class571.field8344 = new int[2];
        class177.field2179 = new class20[10000];
        class632.field9091 = 0;
        class227.field2939 = new class20[5000];
        class543.field7873 = 0;
        class172.field2097 = new class43[5000];
        class300.field4041 = 0;
        class616.field8849 = new boolean[class119.field1526 + class119.field1526 + 1][class119.field1526 + class119.field1526 + 1];
        class341.field4502 = new boolean[class119.field1526 + class119.field1526 + 2][class119.field1526 + class119.field1526 + 2];
        if (class72.field1090) {
            class504.field7036 = new boolean[arg3][class119.field1526 + class119.field1526 + 1][class119.field1526 + class119.field1526 + 1];
            class438.field6261 = new boolean[arg3][][];
            if (class271.field3698 != null) {
                class573.method3352();
            }
            class271.field3698 = new class536[class298.field4019];
            class298.field4017.method252(class271.field3698.length + 1);
            class298.field4017.method222(0);
            for (int var9 = 0; var9 < class271.field3698.length; var9++) {
                class271.field3698[var9] = new class536(var9 + 1, class298.field4017);
                (new Thread(class271.field3698[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class298.field4019 == 2) {
                var10 = 4;
                class346.field4551 = 2;
            } else if (class298.field4019 == 3) {
                var10 = 6;
                class346.field4551 = 3;
            } else {
                var10 = 8;
                class346.field4551 = 4;
            }
            class27.field609 = new class45[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class27.field609[var11] = new class45(class681.field9745[class298.field4019 - 2][var11]);
            }
        } else {
            class346.field4551 = 1;
        }
        class91.field1281 = new int[class346.field4551 - 1];
        class271.field3715 = new int[class346.field4551 - 1];
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lsq;", line = 147)
    public final class161 method448(byte arg0) {
        field5683++;
        if (arg0 != 25) {
            this.field5691 = -70;
        }
        return class557.field8055;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Lom;", line = 158)
    public static final class342 method2431(int arg0) {
        field5684++;
        try {
            return arg0 == 1 ? new class347() : null;
        } catch (Throwable var2) {
            try {
                return (class342) Class.forName("ic").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class413();
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ljava/lang/String;Lpe;Lop;IIIIIIIIII)V", line = 188)
    public class403(String arg0, class564 arg1, class172 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5691 = arg8;
        this.field5695 = arg7;
        this.field5685 = arg5;
        this.field5689 = arg6;
        this.field5693 = arg1;
        this.field5686 = arg10;
        this.field5694 = arg3;
        this.field5690 = arg4;
        this.field5692 = arg9;
        this.field5687 = arg11;
        this.field5682 = arg12;
        this.field5688 = arg2;
        this.field5681 = arg0;
    }
}
