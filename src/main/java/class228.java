import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class228 extends class42 {

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Z")
    public boolean field3071 = false;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public int field3078 = -1;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Lff;")
    public static class9 field3079 = new class9(92, 5);

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Z")
    public static boolean field3080 = false;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Lff;")
    public static class9 field3081 = new class9(48, 3);

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3083 = 1403;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "Lwl;")
    public static class280 field3082 = new class280();

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILcr;)Ljava/lang/String;")
    public static final String method1420(int arg0, class403 arg1) {
        field3075++;
        if (client.method1255(arg1).method2046((byte) -99) == 0) {
            return null;
        }
        int var2 = 121 / ((arg0 - 76) / 32);
        if (arg1.field5532 == null || arg1.field5532.trim().length() == 0) {
            return class299.field3964 ? "Hidden-use" : null;
        } else {
            return arg1.field5532;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3068++;
        if (class154.field2244.method1855((byte) 74, class166.field2414) || class455.field6229 == class411.field5656) {
            class323.method1860(arg0 + 118, class370.field4984);
            if (class411.field5656 != class288.field3770) {
                class437.method2510(arg0 ^ 0x8A3A1D22);
            }
        } else {
            class167.method1124(class522.field7715, class176.field2564, false, (byte) 104, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public static final void method1422(int arg0, int arg1, int arg2) {
        field3066++;
        class253 var3 = class332.method1911(arg2, (byte) 99, arg0);
        var3.method1522(0);
        var3.field3356 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIZ)I")
    public static final int method1423(byte arg0, int arg1, boolean arg2) {
        field3076++;
        if (arg2) {
            return 0;
        }
        class32 var3 = class222.method1397(arg2, arg1, false);
        if (var3 == null) {
            return class78.field1169.method2071(5, arg1).field2623;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field527.length; var5++) {
            if (var3.field527[var5] == -1) {
                var4++;
            }
        }
        int var6 = var4 + (class78.field1169.method2071(5, arg1).field2623 - var3.field527.length);
        if (arg0 <= 97) {
            return 18;
        } else {
            return var6;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static final void method1424(int arg0) {
        class59.field921.method176(-1);
        field3074++;
        class320.field4189.method784(109);
        if (arg0 > 125) {
            class283.field3713.method784(94);
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public static void method1425(int arg0) {
        field3081 = null;
        field3079 = null;
        if (arg0 == -5325) {
            field3082 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static final void method1426(byte arg0) {
        field3067++;
        if (arg0 <= 126) {
            field3081 = null;
        }
        if (class454.field6161 == 10) {
            class507.method2898(1, 28);
        }
        if (class454.field6161 == 30) {
            class507.method2898(1, 25);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)Z")
    public static final boolean method1427(int arg0, int arg1, int arg2) {
        field3070++;
        if (arg1 > -120) {
            return true;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I)V")
    public class228(int arg0) {
        this.field3078 = arg0;
    }
}
