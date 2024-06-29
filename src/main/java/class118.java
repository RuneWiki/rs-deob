import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class118 extends class508 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Ljava/lang/String;")
    public String field1644;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1647 = 104;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lpi;")
    public static class340 field1645 = new class340(39, -1);

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1650 = null;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Loi;")
    public static class169 field1649 = new class169("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field1650 = null;
        if (arg0 != -1501926136) {
            method756(-39);
        }
        field1645 = null;
        field1649 = null;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static final void method757(byte arg0) {
        field1646++;
        if (class78.field999 >= 0) {
            long var1 = class173.method1134(true);
            class78.field999 = (int) ((long) class78.field999 - (var1 - class432.field5958));
            if (class78.field999 <= 0) {
                class166.field2153 = class352.field4506.field275;
                class21.field406 = class352.field4506.field285;
                class475.field6948 = class352.field4506.field274;
                class94.field1314 = class352.field4506.field281;
                class131.field1785 = class352.field4506.field284;
                class78.field999 = -1;
                class8.field86 = class352.field4506.field277;
                class248.field3169 = class352.field4506.field283;
                class63.field810 = class352.field4506.field286;
                class234.field3055 = class352.field4506.field288;
                class286.field3660 = class352.field4506.field276;
            } else {
                int var3 = (class78.field999 << 8) / class254.field3209;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class131.field1785 = ((class127.field1745 & 0xFF00FF) * var3 + (class352.field4506.field284 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class127.field1745 & 0xFF00) * var3 + (class352.field4506.field284 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class8.field86 = (class352.field4506.field277 - class177.field2260) * var6 + class177.field2260;
                class166.field2153 = ((class228.field2936 & 0xFF00) * var3 + (class352.field4506.field275 & 0xFF00) * var4 & 0xFF0000) + ((class228.field2936 & 0xFF00FF) * var3 + (class352.field4506.field275 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class248.field3169 = class93.field1301 * var3 + class352.field4506.field283 * var4 >> 8;
                class475.field6948 = (class352.field4506.field274 - class356.field4574) * var6 + class356.field4574;
                class21.field406 = (class352.field4506.field285 - class473.field6922) * var6 + class473.field6922;
                class234.field3055 = (class352.field4506.field288 - class112.field1547) * var6 + class112.field1547;
                class94.field1314 = (class352.field4506.field281 - class471.field6892) * var6 + class471.field6892;
                class286.field3660 = (class352.field4506.field276 - class333.field4263) * var6 + class333.field4263;
                if (class243.field3126 != class352.field4506.field286) {
                    class63.field810 = class91.field1263.method860(class243.field3126, class352.field4506.field286, var6, class63.field810);
                }
            }
            class432.field5958 = var1;
        }
        if (arg0 <= 82) {
            field1650 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class118(String arg0, int arg1) {
        this.field1644 = arg0;
    }
}
