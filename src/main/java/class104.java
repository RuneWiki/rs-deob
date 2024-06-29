import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class104 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field1214 = new int[14];

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    public static int[] field1220 = new int[256];

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    public static boolean field1224 = false;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lcq;")
    public static class72 field1225 = new class72("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    public static int[] field1231 = new int[2500];

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    public static int[] field1228 = new int[14];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lpe;")
    public class107 field1218;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lc;")
    public static class436 field1221;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    public int[] field1222;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[Lbn;")
    public static class264[] field1223;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field1227;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[[[Lsq;")
    public static class316[][][] field1216;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lti;")
    public static final class208 method619(int arg0, byte arg1) {
        field1226++;
        class208 var2 = (class208) class301.field4028.method2295((long) arg0, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class446.field6254.method1794(5860, 1, arg0);
        class208 var4 = new class208();
        int var5 = -34 / ((arg1 + 21) / 45);
        var4.field2517 = arg0;
        if (var3 != null) {
            var4.method1278(-112, new class242(var3));
        }
        var4.method1270(-698831708);
        if (var4.field2520 == 2 && class347.field4714.method2218(1, (long) arg0) == null) {
            class347.field4714.method2227(new class369(class264.field3403), -8218, (long) arg0);
            class98.field1148[class264.field3403++] = var4;
        }
        class301.field4028.method2294(var4, (byte) 73, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)I")
    public static final int method620(byte arg0, int arg1, int arg2) {
        int var3 = 18 / ((-arg0 - 31) / 53);
        field1219++;
        int var4 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1221 = null;
        field1216 = null;
        field1231 = null;
        field1223 = null;
        field1228 = null;
        field1220 = null;
        if (arg0 != 1) {
            method622((byte) 31, -31);
        }
        field1214 = null;
        field1225 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)Lu;")
    public static final class299 method622(byte arg0, int arg1) {
        field1215++;
        class299 var2 = (class299) class33.field369.method2295((long) arg1, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class429.field5866.method1794(5860, 30, arg1);
        class299 var4 = new class299();
        if (arg0 != 104) {
            return null;
        }
        if (var3 != null) {
            var4.method1898(new class242(var3), -1, arg1);
        }
        class33.field369.method2294(var4, (byte) 74, (long) arg1);
        return var4;
    }
}
