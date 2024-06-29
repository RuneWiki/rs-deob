import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class302 extends class133 {

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "Z")
    public boolean field4040 = false;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    private int field4034 = 0;

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
    private int field4050 = 0;

    @OriginalMember(owner = "client!ps", name = "Y", descriptor = "I")
    private int field4052 = -1;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
    private int field4049 = -32768;

    @OriginalMember(owner = "client!ps", name = "bb", descriptor = "I")
    private int field4055;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "Lbo;")
    private class156 field4038;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "Lcq;")
    public static class72 field4043 = new class72("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ps", name = "ab", descriptor = "Lbb;")
    public static class270 field4054 = new class270();

    @OriginalMember(owner = "client!ps", name = "db", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!ps", name = "eb", descriptor = "[B")
    public static byte[] field4058 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ps", name = "gb", descriptor = "[Ljava/lang/String;")
    public static String[] field4060 = new String[200];

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ps", name = "Z", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ps", name = "cb", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ps", name = "fb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "Lkq;")
    private class69 field4051;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)V")
    public final void method1916(int arg0, int arg1) {
        ++field4033;
        if (!this.field4040) {
            this.field4050 += arg1;
            while (~this.field4050 < ~this.field4038.field1817[this.field4034]) {
                this.field4050 -= this.field4038.field1817[this.field4034];
                ++this.field4034;
                if (this.field4038.field1821.length <= this.field4034) {
                    this.field4040 = true;
                    break;
                }
            }
            if (arg0 == 17202) {
                if (!this.field4040) {
                    class325.method2038(super.field1516, super.field1514, false, this.field4038, this.field4034, (byte) -100);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Luo;IIZ)Z")
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1916(-69, -22);
        }
        ++field4045;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)I")
    public final int method246(byte arg0) {
        ++field4053;
        if (arg0 != 110) {
            this.field4042 = -69;
        }
        return this.field4049;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public final void method1917(int arg0) {
        if (this.field4051 != null) {
            this.field4051.method405();
        }
        if (arg0 != 0) {
            this.method130((class118) null, (byte) -40);
        }
        ++field4035;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Luo;B)Lkj;")
    public final class175 method130(class118 arg0, byte arg1) {
        int var3 = -10 / ((11 - arg1) / 37);
        ++field4056;
        class386 var4 = this.method1918(-103, arg0, 1024);
        if (var4 == null) {
            return null;
        } else {
            class450 var5 = arg0.method742();
            var5.method929(super.field1516, super.field1521, super.field1514);
            if (this.field4051 != null) {
                class291 var6 = this.field4051.method404();
                arg0.method729(var4, var6, var5, (class34) null, 0);
            } else {
                var4.method1441(var5, (class34) null, 0);
            }
            this.field4049 = var4.method1458();
            this.method1920(arg0, var4, -1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILuo;I)Lge;")
    private final class386 method1918(int arg0, class118 arg1, int arg2) {
        ++field4048;
        if (arg0 >= -102) {
            this.field4052 = -118;
        }
        class167 var4 = class179.method1124((byte) -42, this.field4055);
        return !this.field4040 ? var4.method1062(this.field4050, 128, arg2, this.field4052, this.field4034, arg1) : var4.method1062(0, 128, arg2, -1, -1, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Lkc;")
    public static final class138 method1919(byte arg0, int arg1) {
        ++field4046;
        int var2 = -52 / ((-29 - arg0) / 40);
        class138 var3 = (class138) class138.field1573.method2295((long) arg1, (byte) 74);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class332.field4522.method1794(5860, 33, arg1);
            class138 var5 = new class138();
            if (var4 != null) {
                var5.method890((byte) 90, arg1, new class242(var4));
            }
            class138.field1573.method2294(var5, (byte) 16, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Luo;Lge;I)V")
    private final void method1920(class118 arg0, class386 arg1, int arg2) {
        ++field4059;
        class103[] var4 = arg1.method1443();
        class345[] var5 = arg1.method1475();
        if ((this.field4051 == null || this.field4051.field828) && (var4 != null || var5 != null)) {
            this.field4051 = new class69(class106.field1273);
        }
        if (arg2 != -1) {
            this.method138((byte) -53, (class118) null);
        }
        if (this.field4051 != null) {
            this.field4051.method396(arg0, (long) class106.field1273, var4, var5, false);
            this.field4051.method406(super.field1528, super.field1512, super.field1510, super.field1518, super.field1517);
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        ++field4047;
        if (arg0 != 3652) {
            this.field4034 = 23;
        }
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field4055 = arg0;
        this.field4042 = arg1 + arg2;
        int var12 = class179.method1124((byte) -42, this.field4055).field1935;
        if (var12 == -1) {
            this.field4040 = true;
        } else {
            this.field4040 = false;
            this.field4038 = class430.method2621((byte) -92, var12);
        }
        if (this.field4042 == arg2) {
            class325.method2038(super.field1516, super.field1514, false, this.field4038, this.field4034, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLla;)Ljava/lang/String;")
    public static final String method1921(boolean arg0, class266 arg1) {
        if (arg0) {
            method1921(false, (class266) null);
        }
        ++field4039;
        return arg1.field3421 != null && arg1.field3421.length() > 0 ? arg1.field3422 + class191.field2236.method434(class373.field5057, -8192) + arg1.field3421 : arg1.field3422;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLuo;)V")
    public final void method138(byte arg0, class118 arg1) {
        ++field4036;
        if (arg0 > 78) {
            class386 var3 = this.method1918(-126, arg1, 0);
            if (var3 != null) {
                this.method1920(arg1, var3, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        if (arg5 >= -115) {
            field4060 = null;
        }
        ++field4037;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field4051 != null) {
            this.field4051.method405();
        }
        ++field4044;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public static void method1922(int arg0) {
        int var1 = 95 / ((arg0 - 36) / 57);
        field4043 = null;
        field4060 = null;
        field4054 = null;
        field4058 = null;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field4041;
        if (arg0 < -24) {
            throw new IllegalStateException();
        }
    }
}
