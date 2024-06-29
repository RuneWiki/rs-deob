import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class146 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    public int[] field1935;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    public int[] field1942;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lni;")
    public static class367 field1937;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lla;")
    public static class319 field1944;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;Lnj;I)I")
    public static final int method967(String arg0, class164 arg1, int arg2) {
        field1941++;
        int var3 = arg1.field2185;
        byte[] var4 = class331.method2143((byte) 39, arg0);
        arg1.method1101(var4.length, false);
        arg1.field2185 += class278.field3943.method545(arg1.field2185, 0, var4, arg1.field2219, 0, var4.length);
        return arg2 == 35 ? arg1.field2185 - var3 : -116;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
    public static final int method968(byte arg0) {
        field1939++;
        if ((double) class12.field224 == 3.0D) {
            return 37;
        } else if ((double) class12.field224 == 4.0D) {
            return 50;
        } else if (arg0 < 96) {
            return -123;
        } else if ((double) class12.field224 == 6.0D) {
            return 75;
        } else if ((double) class12.field224 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
    public class146(int arg0) {
        this.field1938 = arg0;
        this.field1935 = new int[this.field1938];
        this.field1942 = new int[this.field1938];
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method969(byte arg0) {
        field1944 = null;
        if (arg0 != -27) {
            field1944 = null;
        }
        field1937 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
    public static final int method970(byte arg0, int arg1) {
        if (arg0 >= -113) {
            field1944 = null;
        }
        field1943++;
        return arg1 & 0xFF;
    }

    static {
        new class446("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field1940 = 0;
        field1937 = new class367(35, 2);
        field1944 = new class319(101, -1);
    }
}
