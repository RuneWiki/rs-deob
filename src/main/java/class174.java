import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class174 extends class54 {

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "Llc;")
    public static class143 field3125 = class66.method374("Verbindung abgebrochen)3", -1);

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "Llc;")
    public static class143 field3127 = class66.method374("M", -1);

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Llc;")
    public static class143 field3126 = class129.method780(-256, 160);

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "B")
    public byte field3120;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Lh;")
    public class190 field3128;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "Lne;")
    public static class206 field3121;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
    public static final int method1146(int arg0, int arg1) {
        if (arg1 <= 33) {
            field3127 = null;
        }
        ++field3122;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1147(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != -39) {
            return null;
        } else {
            ++field3119;
            if (arg1.equals("B")) {
                return Byte.TYPE;
            } else if (arg1.equals("I")) {
                return Integer.TYPE;
            } else if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I")
    public final int method330(int arg0) {
        ++field3130;
        int var2 = 119 % ((arg0 - 14) / 59);
        return this.field3128 == null ? 0 : this.field3128.field3487 * 100 / (this.field3128.field3465.length + -this.field3120);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lhh;")
    public static final class182 method1148(int arg0, byte arg1) {
        ++field3124;
        class182 var2 = (class182) class235.field4281.method1168((long) arg0, (byte) 96);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class66.field1244.method41(arg1 + -18428, arg0, 0);
            if (var3 == null) {
                return null;
            } else {
                class182 var4 = new class182();
                class190 var5 = new class190(var3);
                var5.field3487 = var5.field3465.length + -2;
                int var6 = var5.method1275(arg1 + 28);
                int var7 = -var6 + -2 + -12 + var5.field3465.length;
                var5.field3487 = var7;
                if (arg1 != 100) {
                    field3126 = null;
                }
                int var8 = var5.method1269(126);
                var4.field3249 = var5.method1275(128);
                var4.field3246 = var5.method1275(128);
                var4.field3251 = var5.method1275(128);
                var4.field3258 = var5.method1275(128);
                int var9 = var5.method1265(arg1 + 23);
                if (~var9 < -1) {
                    var4.field3250 = new class277[var9];
                    for (int var10 = 0; var10 < var9; ++var10) {
                        int var11 = var5.method1275(128);
                        class277 var12 = new class277(class29.method198(var11, false));
                        var4.field3250[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method1269(arg1 + -46);
                            int var14 = var5.method1269(64);
                            var12.method1825(new class3(var14), (byte) 64, (long) var13);
                        }
                    }
                }
                var5.field3487 = 0;
                int var15 = 0;
                var4.field3254 = var5.method1287(arg1 + 1315);
                var4.field3261 = new int[var8];
                var4.field3247 = new class143[var8];
                var4.field3253 = new int[var8];
                while (var7 > var5.field3487) {
                    int var16 = var5.method1275(128);
                    if (var16 != 3) {
                        if (var16 < 100 && var16 != 21 && ~var16 != -39 && ~var16 != -40) {
                            var4.field3261[var15] = var5.method1269(83);
                        } else {
                            var4.field3261[var15] = var5.method1265(123);
                        }
                    } else {
                        var4.field3247[var15] = var5.method1270((byte) -122);
                    }
                    var4.field3253[var15++] = var16;
                }
                class235.field4281.method1163(var4, (long) arg0, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method1149(byte arg0) {
        int var1 = -82 / ((arg0 - 25) / 37);
        field3121 = null;
        field3126 = null;
        field3127 = null;
        field3125 = null;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)[B")
    public final byte[] method326(int arg0) {
        ++field3129;
        if (arg0 != 0) {
            return null;
        } else if (!super.field1054 && this.field3128.field3487 >= this.field3128.field3465.length + -this.field3120) {
            return this.field3128.field3465;
        } else {
            throw new RuntimeException();
        }
    }
}
