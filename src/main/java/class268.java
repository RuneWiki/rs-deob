import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class268 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "B")
    public byte field4038 = 0;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "B")
    public byte field4039;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "B")
    public byte field4062;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "S")
    public short field4054;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "S")
    public short field4057;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4043 = -1;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lpo;")
    public static class375 field4040 = new class375();

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "B")
    public byte field4041;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "B")
    public byte field4047;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "B")
    public byte field4050;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "B")
    public byte field4058;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Loh;")
    public class268 field4049;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Luf;")
    public class297 field4045;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lii;")
    public class372 field4060;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lsi;")
    public class376 field4042;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lcf;")
    public class412 field4056;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Ljk;")
    public class431 field4051;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Ljk;")
    public class431 field4052;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Lab;")
    public class455 field4059;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "Lab;")
    public class455 field4063;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "S")
    public short field4046;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
    public boolean field4044;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
    public boolean field4048;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
    public boolean field4053;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "[I")
    public static int[] field4064;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 3)
    public static final void method1630(int arg0, String arg1, boolean arg2) {
        field4055++;
        if (arg1 == null) {
            return;
        }
        if (class170.field2651 >= arg0) {
            class499.method3000((byte) -48, class286.field4331.method2473(class406.field5898, -87));
            return;
        }
        String var3 = class290.method1768(arg1, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class170.field2651; var4++) {
            String var8 = class290.method1768(class107.field1868[var4], false);
            if (var8 != null && var8.equals(var3)) {
                class499.method3000((byte) -48, arg1 + class334.field4991.method2473(class406.field5898, arg0 - 187));
                return;
            }
            if (class178.field2791[var4] != null) {
                String var9 = class290.method1768(class178.field2791[var4], false);
                if (var9 != null && var9.equals(var3)) {
                    class499.method3000((byte) -48, arg1 + class334.field4991.method2473(class406.field5898, -82));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class7.field79; var5++) {
            String var6 = class290.method1768(class51.field767[var5], false);
            if (var6 != null && var6.equals(var3)) {
                class499.method3000((byte) -48, class90.field1612.method2473(class406.field5898, -114) + arg1 + class491.field7463.method2473(class406.field5898, -107));
                return;
            }
            if (class472.field7212[var5] != null) {
                String var7 = class290.method1768(class472.field7212[var5], false);
                if (var7 != null && var7.equals(var3)) {
                    class499.method3000((byte) -48, class90.field1612.method2473(class406.field5898, -106) + arg1 + class491.field7463.method2473(class406.field5898, -106));
                    return;
                }
            }
        }
        if (class290.method1768(class286.field4329.field685, false).equals(var3)) {
            class499.method3000((byte) -48, class239.field3610.method2473(class406.field5898, arg0 ^ 0xFFFFFFD7));
            return;
        }
        class400.method2379((byte) -75, class54.field826);
        class225.field3459++;
        class230.field3508.method221(-1, class220.method1343(arg1, (byte) -82) + 1);
        class230.field3508.method240(arg1, 121);
        class230.field3508.method221(arg0 ^ 0xFFFFFF9B, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V", line = 97)
    public class268(int arg0, int arg1, int arg2) {
        this.field4062 = this.field4039 = (byte) arg0;
        this.field4054 = (short) arg2;
        this.field4057 = (short) arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 111)
    public static final void method1631(int arg0, int arg1) {
        class429.method2525(-118);
        field4061++;
        int var2 = class368.field5407.method1052(arg1, 30350).field5368;
        if (arg0 == var2) {
            return;
        }
        int var3 = class273.field4144.field4015[arg1];
        if (var2 == 6) {
            class252.field3851 = var3;
        }
        if (var2 == 5) {
            class343.field5109 = var3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 156)
    public final void method1632(byte arg0) {
        field4037++;
        while (this.field4045 != null) {
            class297 var2 = this.field4045.field4500;
            this.field4045.method1801(-29240);
            this.field4045 = var2;
        }
        if (arg0 > 71) {
            this.field4038 = 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 177)
    public static void method1633(byte arg0) {
        int var1 = 32 % ((58 - arg0) / 42);
        field4064 = null;
        field4040 = null;
    }
}
