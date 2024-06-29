import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class65 {

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lgf;")
    public class155 field1099 = new class155();

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1100 = "green:";

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lpf;")
    public static class17 field1091 = new class17(30);

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[[[I")
    public static int[][][] field1104 = new int[2][][];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lgf;")
    private class155 field1105;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
    public static boolean field1095;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)I")
    public static final int method445(byte arg0, int arg1) {
        field1093++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        if (arg0 != -80) {
            field1095 = false;
        }
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static final void method446(boolean arg0) {
        if (arg0) {
            class90.field1498 = class184.field2943;
            class245.field4123 = class183.field2929;
        } else {
            class90.field1498 = class215.field3637;
            class245.field4123 = class207.field3401;
        }
        class107.field1759 = class90.field1498.length;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method447(byte arg0) {
        if (arg0 != -61) {
            method447((byte) -14);
        }
        field1097++;
        for (class253 var1 = (class253) class209.field3536.method309(0); var1 != null; var1 = (class253) class209.field3536.method312((byte) -122)) {
            if (var1.field4277) {
                var1.method1836(arg0 - 66);
            }
        }
        for (class253 var2 = (class253) class237.field3995.method309(arg0 + 61); var2 != null; var2 = (class253) class237.field3995.method312((byte) -96)) {
            if (var2.field4277) {
                var2.method1836(-124);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lgf;")
    public final class155 method448(int arg0) {
        if (arg0 != 631244930) {
            field1104 = null;
        }
        field1096++;
        class155 var2 = this.field1105;
        if (this.field1099 == var2) {
            this.field1105 = null;
            return null;
        } else {
            this.field1105 = var2.field2569;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLgf;)V")
    public final void method449(byte arg0, class155 arg1) {
        if (arg1.field2568 != null) {
            arg1.method1174(-25741);
        }
        arg1.field2568 = this.field1099.field2568;
        field1101++;
        arg1.field2569 = this.field1099;
        arg1.field2568.field2569 = arg1;
        arg1.field2569.field2568 = arg1;
        if (arg0 != -64) {
            this.field1099 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)I")
    public final int method450(int arg0) {
        if (arg0 > -119) {
            return 18;
        }
        field1098++;
        int var2 = 0;
        for (class155 var3 = this.field1099.field2569; var3 != this.field1099; var3 = var3.field2569) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lgf;")
    public final class155 method451(int arg0) {
        field1094++;
        int var2 = -3 / ((24 - arg0) / 61);
        class155 var3 = this.field1099.field2569;
        if (this.field1099 == var3) {
            return null;
        } else {
            var3.method1174(-25741);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lgf;")
    public final class155 method452(int arg0) {
        if (arg0 != 1576) {
            field1095 = true;
        }
        field1103++;
        class155 var2 = this.field1099.field2569;
        if (this.field1099 == var2) {
            this.field1105 = null;
            return null;
        } else {
            this.field1105 = var2.field2569;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I")
    public static final int method453(int arg0, boolean arg1) {
        if (arg1) {
            return -96;
        } else {
            field1090++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field1100 = null;
        if (arg0 != -74) {
            method453(-126, false);
        }
        field1091 = null;
        field1104 = null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public final void method455(int arg0) {
        field1092++;
        while (true) {
            class155 var2 = this.field1099.field2569;
            if (this.field1099 == var2) {
                this.field1105 = null;
                if (arg0 == -22178) {
                    return;
                } else {
                    field1091 = null;
                    return;
                }
            }
            var2.method1174(arg0 - 3563);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class65() {
        this.field1099.field2569 = this.field1099;
        this.field1099.field2568 = this.field1099;
    }
}
