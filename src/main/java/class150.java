import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class150 extends class603 {

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lqe;")
    public static class465 field2271 = new class465(12, 4);

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[B")
    private byte[] field2273;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ZII)V", line = 4)
    public static final void method1156(String arg0, boolean arg1, int arg2, int arg3) {
        class53.method484(true);
        field2274++;
        if (arg2 == 0) {
            class359.field5046 = class464.method2824(class567.field8085, class345.field4863, class471.field6781.field6697.method2961(arg3 - 268407787) * 2, class679.field9571, 0, 0);
            if (arg0 != null) {
                class359.field5046.method617(0);
                class323 var11 = class226.method1560(0, 255, class722.field10091, class590.field8281);
                class59 var12 = class359.field5046.method632(var11, class55.method507(class501.field7161, class590.field8281, 0), true);
                class696.method3905(-59);
                class379.method2375(class359.field5046, true, arg0, (byte) 120, var12, var11);
            }
        } else {
            class58 var4 = null;
            if (arg0 != null) {
                var4 = class464.method2824(class567.field8085, class345.field4863, 0, class679.field9571, 0, 0);
                var4.method617(0);
                class323 var5 = class226.method1560(0, arg3 - 268435201, class722.field10091, class590.field8281);
                class59 var6 = var4.method632(var5, class55.method507(class501.field7161, class590.field8281, 0), true);
                class696.method3905(-72);
                class379.method2375(var4, true, arg0, (byte) 123, var6, var5);
            }
            try {
                class359.field5046 = class464.method2824(class567.field8085, class345.field4863, class471.field6781.field6697.method2961(27669) * 2, class679.field9571, arg3 - 268435456, arg2);
                if (arg0 != null) {
                    var4.method617(0);
                    class323 var7 = class226.method1560(0, 255, class722.field10091, class590.field8281);
                    class59 var8 = var4.method632(var7, class55.method507(class501.field7161, class590.field8281, 0), true);
                    class696.method3905(-98);
                    class379.method2375(var4, true, arg0, (byte) 119, var8, var7);
                }
                if (class359.field5046.method589()) {
                    boolean var9 = true;
                    try {
                        var9 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var14) {
                    }
                    class411 var10;
                    if (var9) {
                        var10 = class359.field5046.method568(146800640);
                    } else {
                        var10 = class359.field5046.method568(104857600);
                    }
                    class359.field5046.method578(var10);
                }
            } catch (Throwable var15) {
                class359.field5046 = class464.method2824(class567.field8085, class345.field4863, 0, class679.field9571, 0, 0);
                arg2 = 0;
            }
            if (var4 != null) {
                try {
                    var4.method623(arg3 - 268435457);
                } catch (Throwable var13) {
                }
            }
        }
        class471.field6781.field6684.method1842(!arg1, -125);
        class471.field6781.method2826(arg2, (byte) 99, class471.field6781.field6684);
        class562.method3289(-122);
        class359.field5046.method608(10000);
        class359.field5046.method604(32);
        class57.field1066 = class359.field5046.method558();
        class25.field369 = class359.field5046.method558();
        class416.method2537(5079);
        class359.field5046.method548(class471.field6781.field6710.method788(arg3 ^ 0x10006C15) == 1);
        if (class359.field5046.method634()) {
            class338.method2150(1, class471.field6781.field6676.method1572(arg3 ^ 0x10006C15) == 1);
        }
        class318.method2044(class174.field2540 >> 3, class359.field5046, class716.field9999 >> 3, (byte) 38);
        class246.method1631(false);
        class504.field7203 = null;
        class291.field4095 = true;
        if (arg3 == 268435456) {
            class671.field9412 = false;
            class633.method3638(true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V", line = 118)
    public final void method1157(int arg0, int arg1, byte arg2) {
        field2276++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + arg0);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2273[var10001] = var5;
        this.field2273[var6] = var5;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V", line = 130)
    public static final void method1158(byte arg0) {
        class471.field6781.method2826(1, (byte) 95, class471.field6781.field6719);
        field2270++;
        class471.field6781.method2826(1, (byte) 105, class471.field6781.field6704);
        class471.field6781.method2826(2, (byte) 99, class471.field6781.field6678);
        class471.field6781.method2826(2, (byte) 118, class471.field6781.field6668);
        class471.field6781.method2826(1, (byte) 119, class471.field6781.field6665);
        class471.field6781.method2826(1, (byte) 87, class471.field6781.field6674);
        class471.field6781.method2826(1, (byte) 92, class471.field6781.field6693);
        class471.field6781.method2826(1, (byte) 77, class471.field6781.field6698);
        class471.field6781.method2826(1, (byte) 87, class471.field6781.field6713);
        class471.field6781.method2826(1, (byte) 111, class471.field6781.field6689);
        class471.field6781.method2826(1, (byte) 79, class471.field6781.field6696);
        class471.field6781.method2826(1, (byte) 92, class471.field6781.field6688);
        class471.field6781.method2826(0, (byte) 86, class471.field6781.field6714);
        class471.field6781.method2826(1, (byte) 79, class471.field6781.field6673);
        class471.field6781.method2826(0, (byte) 105, class471.field6781.field6675);
        class471.field6781.method2826(0, (byte) 97, class471.field6781.field6697);
        class471.field6781.method2826(1, (byte) 116, class471.field6781.field6687);
        class471.field6781.method2826(0, (byte) 83, class471.field6781.field6677);
        class471.field6781.method2826(0, (byte) 115, class471.field6781.field6676);
        class56.method514(true);
        class471.field6781.method2826(1, (byte) 81, class471.field6781.field6705);
        class471.field6781.method2826(3, (byte) 106, class471.field6781.field6712);
        class685.method3857(true);
        class246.method1631(false);
        class291.field4095 = true;
        if (arg0 != -105) {
            field2272 = -90;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 167)
    public class150() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V", line = 173)
    public static void method1159(byte arg0) {
        field2271 = null;
        if (arg0 != 113) {
            field2272 = 17;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIBI)[B", line = 192)
    public final byte[] method1160(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -10) {
            return null;
        } else {
            this.field2273 = new byte[arg0 * arg3 * arg1 * 2];
            field2275++;
            this.method2430(arg0, 126, arg1, arg3);
            return this.field2273;
        }
    }
}
