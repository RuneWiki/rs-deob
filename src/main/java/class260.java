import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class260 extends class114 {

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    private int field4190 = 4;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    private int field4189 = 4;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field4185 = 0;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4195 = "flash3:";

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Llm;")
    public static class150 field4192 = new class150(5);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Lnh;")
    public static class305 field4187;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "[Ljc;")
    public static class284[] field4196;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        if (arg0 != -112) {
            this.method13((class215) null, -51, 2);
        }
        ++field4191;
        int[][] var3 = super.field1627.method104(arg1, (byte) 114);
        if (super.field1627.field280) {
            int var4 = class263.field4216 / this.field4189;
            int var5 = class145.field2009 / this.field4190;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg1 % var4;
                var7 = this.method727(0, class263.field4216 * var6 / var4, 842);
            } else {
                var7 = this.method727(0, 0, 842);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var3[0];
            int[] var11 = var7[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class145.field2009 > var14; ++var14) {
                int var15;
                if (~var5 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class145.field2009 * var16 / var5;
                }
                var10[var14] = var11[var15];
                var12[var14] = var8[var15];
                var13[var14] = var9[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field4186;
        if (arg1) {
            this.method16(-78, false);
        }
        int[] var3 = super.field1630.method302(arg0, -128);
        if (super.field1630.field710) {
            int var4 = class263.field4216 / this.field4189;
            int var5 = class145.field2009 / this.field4190;
            int[] var6;
            if (~var4 >= -1) {
                var6 = this.method729(0, 0, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method729(class263.field4216 * var7 / var4, 0, 0);
            }
            for (int var8 = 0; ~var8 > ~class145.field2009; ++var8) {
                if (var5 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class145.field2009 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
    public static void method1695(boolean arg0) {
        if (arg0) {
            method1696(117);
        }
        field4187 = null;
        field4195 = null;
        field4192 = null;
        field4196 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class260() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Lfa;")
    public static final class238 method1696(int arg0) {
        if (arg0 != 24910) {
            return null;
        } else {
            ++field4193;
            if (class97.field1398 == null) {
                return null;
            } else {
                for (class238 var1 = (class238) class246.field3865.method311(false); var1 != null; var1 = (class238) class246.field3865.method311(false)) {
                    class149 var2 = class121.method784(-100, var1.field3688);
                    if (var2 != null && var2.field2049 && var2.method937(-53)) {
                        return var1;
                    }
                }
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1697(int arg0, String arg1) throws ClassNotFoundException {
        ++field4188;
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
        } else if (arg0 != 8661) {
            return null;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field4189 = arg0.method1374((byte) -60);
            }
        } else {
            this.field4190 = arg0.method1374((byte) -60);
        }
        if (arg2 != 12953) {
            this.method73((byte) 104, 25);
        }
        ++field4194;
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        ++field4197;
        if (class157.field2167 > 0) {
            class248.method1621(0);
        } else {
            int var1 = 34 / ((41 - arg0) / 46);
            class213.field3213 = class272.field4332;
            class272.field4332 = null;
            class82.method519(-113, 40);
        }
    }
}
