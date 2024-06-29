import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class97 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
    public static int[] field1260 = new int[25];

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1274 = "white:";

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ldh;")
    public static class179 field1267 = new class179(16);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "B")
    public byte field1256;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "B")
    public byte field1258;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "B")
    public byte field1264;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "B")
    public byte field1275;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Llc;")
    public static class175 field1262;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Llc;")
    public static class175 field1270;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "S")
    public short field1272;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public boolean field1257;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Z")
    public boolean field1261;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Z")
    public boolean field1266;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
    public boolean field1268;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
    public boolean field1271;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 17)
    public static final void method586(byte arg0) {
        field1269++;
        if (arg0 < 6) {
            field1267 = (class179) null;
        }
        class301.field4689.method1237((byte) -84);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 29)
    public static final void method587(int arg0, int arg1) {
        field1263++;
        if (class17.field236 == arg1) {
            return;
        }
        if (arg0 != -15525) {
            method586((byte) 117);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class17.field236 == 0) {
            class9.method44(89);
        }
        if (arg1 == 40) {
            class68.method425((byte) 119);
        }
        if (arg1 != 40 && class162.field2237 != null) {
            class162.field2237.method1096((byte) 93);
            class162.field2237 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class263.field4106 = 1;
            class219.field3078 = 0;
            class132.field1818 = 0;
            class161.field2225 = 0;
            class12.field172 = 1;
            class221.method1522(true, -1);
        }
        if (arg1 == 25 || arg1 == 10) {
            class318.method2221((byte) -48);
        }
        if (arg1 == 5) {
            class184.method1280(class164.field2271, arg0 + 16481);
        } else {
            class15.method104(50);
        }
        boolean var3 = class17.field236 == 5 || class17.field236 == 10 || class17.field236 == 28;
        if (var2 != var3) {
            if (var2) {
                class195.field2794 = class177.field2580;
                if (class225.field3192 == 0) {
                    class63.method381(2, -108);
                } else {
                    class137.method915(2, 1, 255, 0, class177.field2580, class318.field4892, false);
                }
                class22.field283.method943(false, -93);
            } else {
                class63.method381(2, -125);
                class22.field283.method943(true, -68);
            }
        }
        if (class250.field3787 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class250.method1796();
        }
        class17.field236 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 119)
    public static final void method588(boolean arg0, String arg1, int arg2) {
        if (arg0) {
            field1259 = 82;
        }
        class96 var3 = class141.method935(arg2, 3, 82);
        field1265++;
        var3.method581((byte) -128);
        var3.field1249 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 134)
    public static void method589(boolean arg0) {
        field1260 = null;
        field1262 = null;
        field1274 = null;
        if (arg0) {
            field1270 = (class175) null;
        }
        field1267 = null;
        field1270 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILlc;)[Ltb;", line = 153)
    public static final class234[] method590(int arg0, int arg1, int arg2, class175 arg3) {
        field1273++;
        if (class304.method2132((byte) -27, arg1, arg2, arg3)) {
            return arg0 >= -16 ? (class234[]) null : class10.method51(68);
        } else {
            return null;
        }
    }
}
