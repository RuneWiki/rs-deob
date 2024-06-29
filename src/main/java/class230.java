import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class230 extends class28 {

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "Z")
    public boolean field3058 = true;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    public int field3065 = 12800;

    @OriginalMember(owner = "client!dga", name = "L", descriptor = "I")
    public int field3074 = 12800;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "I")
    public int field3060 = 0;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public int field3066 = -1;

    @OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
    public int field3071 = 0;

    @OriginalMember(owner = "client!dga", name = "O", descriptor = "I")
    public int field3077 = -1;

    @OriginalMember(owner = "client!dga", name = "M", descriptor = "Ljava/lang/String;")
    public String field3075;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Ljava/lang/String;")
    public String field3068;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "Lki;")
    public class364 field3059;

    @OriginalMember(owner = "client!dga", name = "G", descriptor = "Lcda;")
    public static class534 field3069 = new class534(7500);

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!dga", name = "H", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!dga", name = "J", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!dga", name = "K", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!dga", name = "N", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!dga", name = "P", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!dga", name = "Q", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!dga", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field3080;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI[II)Z")
    public final boolean method1445(boolean arg0, int arg1, int[] arg2, int arg3) {
        field3067++;
        for (class235 var5 = (class235) this.field3059.method2090(arg0); var5 != null; var5 = (class235) this.field3059.method2088(-152)) {
            if (var5.method1486((byte) 121, arg3, arg1)) {
                var5.method1489((byte) -125, arg2, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([IIBII)Z")
    public final boolean method1446(int[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3076++;
        if (arg2 >= -78) {
            return false;
        }
        for (class235 var6 = (class235) this.field3059.method2090(true); var6 != null; var6 = (class235) this.field3059.method2088(-152)) {
            if (var6.method1492((byte) -79, arg1, arg4, arg3)) {
                var6.method1489((byte) -123, arg0, arg4, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        class195.field2541.method3658(arg0 - 55);
        field3057++;
        if (arg0 != 55) {
            field3078 = -128;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([IBII)Z")
    public final boolean method1448(int[] arg0, byte arg1, int arg2, int arg3) {
        field3072++;
        for (class235 var5 = (class235) this.field3059.method2090(true); var5 != null; var5 = (class235) this.field3059.method2088(-152)) {
            if (var5.method1488(arg2, false, arg3)) {
                var5.method1487(arg3, arg2, 8, arg0);
                return true;
            }
        }
        if (arg1 != 47) {
            this.method1446(null, 37, (byte) -89, -50, 52);
        }
        return false;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V")
    public static final void method1449(boolean arg0) {
        class346.field4418.method3656((byte) 0);
        if (!arg0) {
            field3069 = null;
        }
        field3063++;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)Z")
    public final boolean method1450(int arg0, int arg1, int arg2) {
        field3061++;
        class235 var4 = (class235) this.field3059.method2090(true);
        int var5 = -14 / ((30 - arg0) / 53);
        while (var4 != null) {
            if (var4.method1486((byte) 121, arg2, arg1)) {
                return true;
            }
            var4 = (class235) this.field3059.method2088(-152);
        }
        return false;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(BII)Z")
    public static final boolean method1451(byte arg0, int arg1, int arg2) {
        field3073++;
        int var3 = -65 / ((9 - arg0) / 55);
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
    public final void method1452(byte arg0) {
        field3079++;
        this.field3060 = 0;
        int var2 = 81 % ((arg0 - 42) / 42);
        this.field3074 = 12800;
        this.field3065 = 12800;
        this.field3071 = 0;
        for (class235 var3 = (class235) this.field3059.method2090(true); var3 != null; var3 = (class235) this.field3059.method2088(-152)) {
            if (var3.field3138 < this.field3065) {
                this.field3065 = var3.field3138;
            }
            if (this.field3074 > var3.field3151) {
                this.field3074 = var3.field3151;
            }
            if (this.field3060 < var3.field3148) {
                this.field3060 = var3.field3148;
            }
            if (this.field3071 < var3.field3150) {
                this.field3071 = var3.field3150;
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)V")
    public static void method1453(byte arg0) {
        field3080 = null;
        if (arg0 != 110) {
            field3080 = null;
        }
        field3069 = null;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class230(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3075 = arg1;
        this.field3064 = arg0;
        this.field3066 = arg6;
        this.field3077 = arg4;
        this.field3062 = arg3;
        this.field3058 = arg5;
        this.field3068 = arg2;
        if (this.field3066 == 255) {
            this.field3066 = 0;
        }
        this.field3059 = new class364();
    }
}
