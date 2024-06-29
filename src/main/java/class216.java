import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class216 extends class578 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
    public static boolean field3132 = true;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
    public static boolean field3134 = false;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lej;")
    public static class124 field3130 = new class124(17, 8);

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[[Z")
    public static boolean[][] field3138 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
    public static boolean field3139 = false;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
    public static boolean field3137 = false;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lbca;")
    public static class661 field3122;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3136;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public final void method399(int arg0, int arg1, int arg2) {
        ++field3133;
        if (arg2 >= -98) {
            field3134 = false;
        }
        int var4 = this.field3127 * arg0 >> 12;
        int var5 = this.field3126 * arg0 >> 12;
        int var6 = this.field3125 * arg1 >> 12;
        int var7 = this.field3135 * arg1 >> 12;
        class319.method2050(10499, var7, var4, super.field7937, super.field7936, super.field7934, var6, var5);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static void method1546(int arg0) {
        if (arg0 != 2) {
            method1546(-52);
        }
        field3122 = null;
        field3138 = null;
        field3136 = null;
        field3130 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3127 = arg0;
        this.field3135 = arg3;
        this.field3126 = arg2;
        this.field3125 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
    public final void method400(int arg0, int arg1, int arg2) {
        ++field3124;
        if (arg2 >= -29) {
            method1546(-42);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
    public final void method402(int arg0, int arg1, int arg2) {
        if (arg0 <= 87) {
            this.field3127 = -17;
        }
        ++field3131;
        int var4 = this.field3127 * arg1 >> 12;
        int var5 = this.field3126 * arg1 >> 12;
        int var6 = this.field3125 * arg2 >> 12;
        int var7 = this.field3135 * arg2 >> 12;
        class59.method615(var6, var7, (byte) -75, super.field7936, var5, var4);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1547(boolean arg0, Object arg1, int arg2) {
        ++field3128;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class745.method4111(var3, 0) : var3;
        } else if (arg2 != 53146732) {
            return null;
        } else if (arg1 instanceof class386) {
            class386 var4 = (class386) arg1;
            return var4.method2438(-3672);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)C")
    public static final char method1548(byte arg0, int arg1) {
        ++field3129;
        int var2 = 255 & arg0;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class211.field3001[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            if (arg1 != -128) {
                method1549((class564) null, false);
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lwm;Z)[I")
    public static final int[] method1549(class564 arg0, boolean arg1) {
        ++field3123;
        class215 var2 = new class215(518);
        int[] var3 = new int[4];
        for (int var4 = 0; ~var4 > -5; ++var4) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method1526(arg1, 10);
        var2.method1539((byte) 114, var3[0]);
        var2.method1539((byte) 97, var3[1]);
        var2.method1539((byte) 109, var3[2]);
        var2.method1539((byte) 105, var3[3]);
        for (int var5 = 0; ~var5 > -11; ++var5) {
            var2.method1539((byte) 120, (int) (9.9999999E7D * Math.random()));
        }
        var2.method1485((byte) 107, (int) (9.9999999E7D * Math.random()));
        var2.method1538(class498.field6964, (byte) -98, class100.field1803);
        arg0.field7778.method1528(var2.field3109, 0, var2.field3066, 80);
        return var3;
    }
}
