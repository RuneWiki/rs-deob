import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class53 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Ljb;")
    private class256 field1089 = new class256();

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Loe;")
    private class139 field1094 = new class139();

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lmg;")
    private class252 field1093;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[Ldb;")
    public static class17[] field1084 = new class17[27];

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljd;")
    public static class86 field1087 = class122.method868("RuneScape wird geladen )2 bitte warten)3)3)3", true);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "S")
    public static short field1088 = 32767;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method393(int arg0) {
        field1087 = null;
        field1084 = null;
        field1085 = null;
        if (arg0 != 1) {
            field1087 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method394(int arg0) {
        field1086++;
        this.field1094.method994(arg0 ^ 0x7FF7);
        if (arg0 != 32767) {
            method396(-87);
        }
        this.field1093.method1705(-47);
        this.field1089 = new class256();
        this.field1091 = this.field1090;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JB)Ljb;")
    public final class256 method395(long arg0, byte arg1) {
        field1092++;
        if (arg1 < 96) {
            this.method395(-111L, (byte) 52);
        }
        class256 var4 = (class256) this.field1093.method1698(arg0, (byte) 105);
        if (var4 != null) {
            this.field1094.method991(var4, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static final void method396(int arg0) {
        if (arg0 != 90) {
            return;
        }
        if (class108.field2079 != null) {
            class118 var1 = class108.field2079;
            synchronized (class108.field2079) {
                class108.field2079 = null;
            }
        }
        field1080++;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Lce;")
    public final class207 method397(int arg0) {
        if (arg0 <= 111) {
            return null;
        } else {
            field1082++;
            return this.field1093.method1709(-111);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JBLjb;)V")
    public final void method398(long arg0, byte arg1, class256 arg2) {
        field1083++;
        if (this.field1091 == 0) {
            class256 var5 = this.field1094.method990(arg1 ^ 0x74);
            var5.method1477(1);
            var5.method1728(1000);
            if (this.field1089 == var5) {
                class256 var6 = this.field1094.method990(0);
                var6.method1477(1);
                var6.method1728(arg1 ^ 0x39C);
            }
        } else {
            this.field1091--;
        }
        this.field1093.method1699(arg1 ^ 0xFFFF917D, arg2, arg0);
        this.field1094.method991(arg2, true);
        if (arg1 != 116) {
            this.method399((byte) -107);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lce;")
    public final class207 method399(byte arg0) {
        field1081++;
        int var2 = 13 % ((49 - arg0) / 56);
        return this.field1093.method1704(-100);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    public class53(int arg0) {
        this.field1090 = arg0;
        this.field1091 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1093 = new class252(var2);
    }
}
