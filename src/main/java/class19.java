import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 {

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Z")
    public static boolean field253 = false;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Lpm;")
    public static class349 field252 = new class349("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field258 = 0;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lub;")
    public static class15 field256 = new class15(64);

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "F")
    public static float field257;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static final void method108(int arg0) {
        field250++;
        class16.field247.method1756(4096);
        class270.field3949.method533(3);
        if (class207.field2976 != null) {
            class207.field2976.method53(class117.field1588, -72);
        }
        class296.field4282.method2566(arg0 + 65534);
        class117.field1588.setBackground(Color.black);
        class51.field665 = -1;
        if (arg0 != 1) {
            return;
        }
        class16.field247 = class240.method1640(false, class117.field1588);
        class270.field3949 = class305.method2063(class117.field1588, (byte) -127, true);
        if (class207.field2976 != null) {
            class207.field2976.method50((byte) 124, class117.field1588);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpl;IIIII)V")
    public static final void method109(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5481 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field5487[var6] != null) {
                arg0.field5481++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field5481; var7++) {
            int var8 = class115.field1487[arg1][arg2][arg3];
            while (var8 != 0) {
                class78 var12 = class282.field4039[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field5487[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class115.field1487[arg1][arg4][arg5];
            while (var9 != 0) {
                class78 var11 = class282.field4039[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field5487[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field5481 - 1; var10++) {
                arg0.field5487[var10] = arg0.field5487[var10 + 1];
            }
            arg0.field5481--;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public static void method110(int arg0) {
        if (arg0 == 0) {
            field252 = null;
            field256 = null;
        }
    }
}
