import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class94 extends class551 {

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "F")
    public static float field1165;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "Lha;")
    public static class116 field1164;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "Lmh;")
    public class145 field1167;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "Llr;")
    public static class261 field1170;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "Len;")
    public static class436 field1158;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "Ljava/lang/String;")
    public String field1163;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "[I")
    public int[] field1159;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "[I")
    public int[] field1162;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "[Lica;")
    public class205[] field1168;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field1156;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BII)Z")
    public static final boolean method537(byte arg0, int arg1, int arg2) {
        field1172++;
        int var3 = 96 / ((-arg0 - 47) / 56);
        return (arg2 & 0x40000) != 0 | class542.method3184(6, arg2, arg1) || class133.method812(arg2, 5, arg1);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static void method538(byte arg0) {
        int var1 = 51 % ((arg0 - 5) / 63);
        field1164 = null;
        field1170 = null;
        field1158 = null;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
    public static final void method539(int arg0) {
        field1160++;
        if (~class540.field8007 == arg0) {
            return;
        }
        int var1 = class350.field5071.method635(arg0 ^ 0xFFFFFF40);
        int var2 = class350.field5071.method633((byte) 29);
        class497 var3 = (class497) class281.field4170.method2496((byte) 67);
        if (var3 != null) {
            var1 = var3.method34(-3797);
            var2 = var3.method31(8);
        }
        class22.method99(class540.field8007, 0, var2, 0, 0, 0, 0, class337.field4944, class522.field7735, var1);
        if (class384.field5622 != null) {
            class544.method3193(var2, arg0, var1);
        }
    }
}
