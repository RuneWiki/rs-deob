import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class287 extends class135 {

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Z")
    public static boolean field4546 = false;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4551;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Ljava/lang/String;")
    public String field4554;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
    public final int method1911(int arg0) {
        ++field4552;
        return arg0 != 255 ? 30 : (int) (super.field1750 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public final void method1912(byte arg0) {
        super.field1958 = Long.MIN_VALUE & super.field1958 | 500L + class260.method1785((byte) -97);
        int var2 = 60 / ((arg0 - 10) / 32);
        ++field4555;
        class175.field2738.method1466(this, 109);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static final void method1913(byte arg0) {
        ++field4543;
        class37.field497 = null;
        class200.method1379(0, false, 0, -1, class242.field3880, 0, 0, class98.field1510, class135.field1960);
        if (arg0 != -47) {
            field4546 = true;
        }
        if (class37.field497 != null) {
            class192.method1342(class98.field1510, class50.field699, class135.field1960, arg0 + 173, class105.field1622.field3389, -1412584499, class37.field497, 0, 0, class92.field1405);
            class37.field497 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public final void method1914(byte arg0) {
        if (arg0 == 46) {
            ++field4557;
            super.field1958 |= Long.MIN_VALUE;
            if (~this.method1920(-118) == -1L) {
                class225.field3641.method1466(this, arg0 ^ 84);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1915(String arg0, String arg1, String arg2, byte arg3) {
        ++field4544;
        int var4 = 16 / ((-56 - arg3) / 59);
        for (int var5 = arg0.indexOf(arg1); ~var5 != 0; var5 = arg0.indexOf(arg1, arg2.length() + var5)) {
            arg0 = arg0.substring(0, var5) + arg2 + arg0.substring(var5 + arg1.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
    public static final void method1916(int arg0, int arg1) {
        ++field4548;
        if (arg1 != -1) {
            if (class74.method509(arg1, 0)) {
                if (arg0 != 16173) {
                    method1916(-48, -126);
                }
                class214[] var2 = class104.field1608[arg1];
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    class214 var4 = var2[var3];
                    if (var4.field3356 != null) {
                        class142 var5 = new class142();
                        var5.field2086 = var4.field3356;
                        var5.field2079 = var4;
                        class145.method967(var5, 2000000, arg0 + -16171);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(SI)Z")
    public static final boolean method1917(short arg0, int arg1) {
        ++field4553;
        if (~arg0 != -49 && arg0 != 5 && ~arg0 != -22 && ~arg0 != -5 && arg0 != 43 && ~arg0 != -12 && arg0 != 46 && ~arg0 != -19) {
            if (arg1 != 31) {
                return true;
            } else if (~arg0 != -26 && ~arg0 != -60 && arg0 != 1007 && ~arg0 != -1007) {
                if (~arg0 != -33 && arg0 != 40 && ~arg0 != -14 && ~arg0 != -10 && ~arg0 != -58) {
                    return arg0 == 34 || ~arg0 == -16 || ~arg0 == -51 || arg0 == 8 || arg0 == 31 || ~arg0 == -31;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method1918(int arg0) {
        field4551 = null;
        if (arg0 < 58) {
            field4546 = true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)I")
    public final int method1919(byte arg0) {
        ++field4556;
        return arg0 < 118 ? 107 : (int) super.field1750;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)J")
    public final long method1920(int arg0) {
        if (arg0 >= -84) {
            field4546 = true;
        }
        ++field4545;
        return Long.MAX_VALUE & super.field1958;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class287(int arg0, int arg1) {
        super.field1750 = (long) arg1 | (long) arg0 << 32;
    }
}
