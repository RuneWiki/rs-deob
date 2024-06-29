import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class94 extends class288 {

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[I")
    public int[] field1255 = new int[1];

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field1260 = new int[] { -1 };

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
    public static boolean field1258 = true;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1264 = "Drop";

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
    public static boolean field1265 = false;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lpj;")
    public static class98 field1259 = new class98(5000);

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lwj;")
    public static class130 field1266;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method565(int arg0, int arg1) {
        field1263++;
        if (arg1 != -29642) {
            field1258 = false;
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class220.method1429(3937);
        } else if (arg0 == 2) {
            class251.method1617((byte) -117);
        } else if (arg0 == 3) {
            class36.method222(arg1 ^ 0xFFFF8C47);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Lck;")
    public static final class1 method566(int arg0) {
        field1262++;
        class43 var1 = new class43(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], class277.field4210[arg0], class165.field2367);
        class294.method1965(true);
        return var1;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static final void method567(byte arg0) {
        class260.field3789.method67((byte) -125);
        field1256++;
        class115.field1594.method67((byte) 95);
        if (arg0 >= -89) {
            method568(-32, -6);
        }
        class276.field4201.method67((byte) 62);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)V")
    public static final void method568(int arg0, int arg1) {
        if (arg1 != 0) {
            field1258 = false;
        }
        field1261++;
        class66 var2 = class6.method34(1, true, arg0);
        var2.method410(arg1 + 122);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
    public static void method569(byte arg0) {
        field1266 = null;
        field1264 = null;
        field1259 = null;
        if (arg0 != -117) {
            field1265 = true;
        }
    }
}
