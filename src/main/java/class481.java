import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class481 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lew;")
    public static class270 field6955 = new class270(16);

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6957 = "";

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ldk;")
    public static class421 field6956;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lvi;")
    public class481 field6950;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lvi;")
    public class481 field6951;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2859(int arg0) {
        field6953++;
        class230.field3223.method269(0);
        class72.field1035.method618(0);
        class244.field3344.method2310((byte) 40);
        class452.field6629.method597(50);
        class233.field3248.method2223(arg0 ^ 0xA05BA4E7);
        class534.field7872.method3090((byte) -113);
        class50.field716.method835(100);
        if (arg0 != 1604598124) {
            field6955 = null;
        }
        class316.field4288.method2654(true);
        class296.field3994.method1318((byte) -122);
        class110.field1782.method1417(112);
        class438.field6318.method2060(64);
        class10.field116.method1498(0);
        class98.field1563.method1650(true);
        class18.field278.method1443(114);
        class365.field5241.method2177(false);
        class90.field1454.method1560(-9816);
        class215.field3058.method2197(-21275);
        class364.field5236.method2465(-4597);
        class485.field6979.method2307(33);
        class32.field485.method1229(127);
        class27.method182(125);
        class76.method593((byte) -1);
        class409.method2395((byte) 99);
        class408.method2392(true);
        class32.field487.method2774((byte) -2);
        class269.field3626.method2774((byte) 124);
        class348.field5002.method2774((byte) -120);
        class115.field1831.method2774((byte) 97);
        class47.field679.method2774((byte) -123);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V", line = 48)
    public static final void method2860(int arg0, byte arg1, int arg2) {
        int var3 = -118 % ((26 - arg1) / 53);
        if (class383.field5502 != arg0) {
            class91.field1463 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class91.field1463[var4] = (var4 << 12) / arg0;
            }
            class120.field1872 = arg0 - 1;
            class383.field5502 = arg0;
            class279.field3800 = arg0 * 32;
        }
        field6952++;
        if (class494.field7150 == arg2) {
            return;
        }
        if (class383.field5502 == arg2) {
            class284.field3856 = class91.field1463;
        } else {
            class284.field3856 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class284.field3856[var5] = (var5 << 12) / arg2;
            }
        }
        class343.field4968 = arg2 - 1;
        class494.field7150 = arg2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 97)
    public final void method2861(byte arg0) {
        field6954++;
        if (this.field6950 == null) {
            return;
        }
        if (arg0 != 47) {
            this.method2861((byte) 74);
        }
        this.field6950.field6951 = this.field6951;
        this.field6951.field6950 = this.field6950;
        this.field6951 = null;
        this.field6950 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 116)
    public static void method2862(byte arg0) {
        field6956 = null;
        field6955 = null;
        int var1 = 81 % ((arg0 - 80) / 45);
        field6957 = null;
    }
}
