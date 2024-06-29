import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class197 {

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Ldda;")
    public static class597 field2968;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lej;III)J", line = 7)
    public static final long method1270(class438 arg0, int arg1, int arg2, int arg3) {
        field2967++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class158 var10 = class312.field4690.method2004(false, arg0.method173(60));
        long var11 = (long) (arg2 << 7 | arg1 | arg0.method171(true) << 14 | arg0.method170(-5527) << 20 | arg3);
        if (var10.field2028 == 0) {
            var11 |= var8;
        }
        if (var10.field2060 == 1) {
            var11 |= var4;
        }
        if (var10.field2062) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method173(111) << 32;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V", line = 40)
    public static final void method1271(byte arg0) {
        field2969++;
        class165.method1046(-3466, class626.field9179);
        if (arg0 > -73) {
            field2970 = 46;
        }
        class435.field6389++;
        class221.field3268.method2563(-13021, class608.method3540(124));
        class221.field3268.method2608(class522.field7735, (byte) 119);
        class221.field3268.method2608(class337.field4944, (byte) 57);
        class221.field3268.method2563(-13021, class94.field1158.field285);
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V", line = 58)
    public static final void method1272(byte arg0) {
        field2965++;
        int var1 = 121 % ((arg0 + 61) / 57);
        for (int var2 = 0; var2 < class237.field3473.length; var2++) {
            for (int var3 = 0; var3 < class237.field3473[0].length; var3++) {
                for (int var4 = 0; var4 < class237.field3473[0][0].length; var4++) {
                    class237.field3473[var2][var3][var4] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)V", line = 93)
    public static void method1273(byte arg0) {
        if (arg0 >= -10) {
            field2970 = -74;
        }
        field2968 = null;
    }
}
