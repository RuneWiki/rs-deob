import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class54 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public static boolean field556;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILoh;B)Ldba;", line = 6)
    public static final class92 method302(int arg0, int arg1, class404 arg2, byte arg3) {
        field559++;
        class244 var4 = new class244(arg2.method2481(arg0, arg1, (byte) 127));
        class92 var5 = new class92(arg1, var4.method1468(-1468860088), var4.method1468(-1468860088), var4.method1438(109), var4.method1438(arg3 ^ 0xFFFFFF98), var4.method1423(arg3 ^ 0x6) == 1, var4.method1423(-16), var4.method1423(-73));
        int var6 = var4.method1423(-86);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field951.method1721((byte) -60, new class566(var4.method1423(arg3 ^ 0x2C), var4.method1476(102), var4.method1476(arg3 ^ 0x78), var4.method1476(101), var4.method1476(arg3 ^ 0xFFFFFFEA), var4.method1476(116), var4.method1476(90), var4.method1476(57), var4.method1476(-100)));
        }
        var5.method621((byte) -46);
        if (arg3 != -18) {
            method303(null, (byte) 99);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 33)
    public static final boolean method303(String arg0, byte arg1) {
        field558++;
        if (arg1 != -127) {
            field556 = false;
        }
        return class124.field1306.containsKey(arg0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z", line = 47)
    public static final boolean method304(int arg0, int arg1, int arg2) {
        field557++;
        if (arg1 == 0) {
            return (arg2 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZIZIII)V", line = 62)
    public static final void method305(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field554++;
        if (!arg3) {
            field556 = true;
        }
        if ((arg1 ? class654.field9334.field9860.method1500(124) : class654.field9334.field9828.method1500(106)) != 0 && arg2 != 0 && class306.field3815 < 50 && arg5 != -1) {
            class313.field3888[class306.field3815++] = new class590((byte) (arg1 ? 3 : 2), arg5, arg2, arg0, arg6, 0, arg4, null);
        }
    }

    @OriginalMember(owner = "client!mk", name = "toString", descriptor = "()Ljava/lang/String;", line = 79)
    public final String toString() {
        field555++;
        throw new IllegalStateException();
    }
}
