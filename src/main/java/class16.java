import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class16 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field286 = new String[100];

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Z")
    public static boolean field288 = false;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[Z")
    public static boolean[] field287 = new boolean[8];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lsk;")
    public class202 field289;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[[[B")
    public static byte[][][] field284;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method111(int arg0) {
        field287 = null;
        field286 = null;
        field284 = null;
        if (arg0 != 632487200) {
            method114(-113, -109);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIII)Lo;")
    public static final class214 method112(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field291++;
        long var5 = ((long) arg3 & 0xFFFFL) << 32 | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 16 | (long) arg4 & 0xFFFFL;
        class214 var7 = (class214) class70.field1020.method950(var5, (byte) -45);
        if (var7 != null) {
            return var7;
        }
        class290 var8 = class240.method1581((byte) 49, arg4);
        class41[] var9 = null;
        if (var8.field4624 != null) {
            var9 = new class41[var8.field4624.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class80 var11 = class36.method241(arg1 ^ 0xFFFFF5D0, var8.field4624[var10]);
                var9[var10] = new class41(var11.field1104, var11.field1097, var11.field1099, var11.field1108, var11.field1110, var11.field1109, var11.field1111, var11.field1102);
            }
        }
        class214 var12 = new class214(var8.field4623, var9, var8.field4632, arg0, arg3, arg2);
        if (arg1 != 120) {
            field287 = null;
        }
        class70.field1020.method942(var5, (byte) 70, var12);
        return var12;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLrl;)V")
    public static final void method113(byte arg0, class310 arg1) {
        field290++;
        if (arg0 != 95) {
            field288 = true;
        }
        for (class309 var2 = (class309) class75.field1056.method369((byte) -115); var2 != null; var2 = (class309) class75.field1056.method362(false)) {
            if (var2.field4966 == arg1) {
                if (var2.field4979 != null) {
                    class116.field1671.method910(var2.field4979);
                    var2.field4979 = null;
                }
                var2.method962(128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method114(int arg0, int arg1) {
        if (arg1 != 1522296816) {
            method113((byte) 102, (class310) null);
        }
        field285++;
        class103.field1475.method943(arg0, true);
        class105.field1509.method943(arg0, true);
    }
}
