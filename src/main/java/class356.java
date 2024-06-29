import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class356 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
    public static int[] field4980 = new int[1];

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lim;")
    public static class353 field4981 = new class353(78, -2);

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lim;")
    public static class353 field4982 = new class353(81, 12);

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lnc;")
    public static class538 field4983 = new class538(128);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "[Lvw;")
    public static class492[] field4985;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Lbr;")
    public static final class184 method2216(byte arg0) {
        field4979++;
        if (arg0 > -105) {
            method2216((byte) 89);
        }
        try {
            return (class184) Class.forName("bt").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method2217(int arg0) {
        field4983 = null;
        if (arg0 >= -36) {
            method2216((byte) -18);
        }
        field4985 = null;
        field4981 = null;
        field4982 = null;
        field4980 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljq;B)Ljq;")
    public static final class447 method2218(class447 arg0, byte arg1) {
        field4978++;
        if (arg0.field6244 != -1) {
            return class609.method3486(arg0.field6244, arg1 ^ 0x3A97D9C5);
        }
        int var2 = arg0.field6229 >>> 16;
        class430 var3 = new class430(class523.field7289);
        class496 var4 = (class496) var3.method2511(0);
        if (arg1 != 85) {
            return null;
        }
        while (var4 != null) {
            if (var4.field6914 == var2) {
                return class609.method3486((int) var4.field1401, 983030160);
            }
            var4 = (class496) var3.method2514(arg1 - 193);
        }
        return null;
    }
}
