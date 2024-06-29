import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class303 extends class30 {

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "Lmw;")
    public static class517 field4249 = new class517(85, 1);

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "Z")
    public static boolean field4255 = false;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "[[B")
    public static byte[][] field4253 = new byte[50][];

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "Z")
    public static boolean field4256 = false;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "Lnaa;")
    public class79 field4250;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "[B")
    public byte[] field4258;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I", line = 3)
    public final int method170(int arg0) {
        if (arg0 > -29) {
            return -94;
        } else {
            ++field4246;
            return super.field295 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1953(boolean arg0, int arg1) {
        if (arg0) {
            if (~class227.field2935 != 0) {
                class445.method2656(class227.field2935, -1);
            }
            for (class73 var2 = (class73) class355.field5178.method1249((byte) -124); var2 != null; var2 = (class73) class355.field5178.method1246(true)) {
                if (!var2.method1104(3)) {
                    var2 = (class73) class355.field5178.method1249((byte) -120);
                    if (var2 == null) {
                        break;
                    }
                }
                class314.method2010(var2, true, 75, false);
            }
            class227.field2935 = -1;
            class355.field5178 = new class184(8);
            class247.method1535(true);
            class227.field2935 = class420.field6053;
            class336.method2157(116, false);
            class166.method1137(false);
            class727.method4007(class227.field2935);
        }
        ++field4251;
        if (arg1 == 50) {
            class300.field4231 = false;
            class669.field8960 = "";
            class115.field1558 = "";
            class149.method1042(false);
            class2.field22 = -1;
            class137.method952(class744.field10055, (byte) -29);
            class625.field8475 = new class758();
            class625.field8475.field2802 = class102.field1467 * 512 / 2;
            class625.field8475.field2810 = class393.field5663 * 512 / 2;
            class625.field8475.field6198[0] = class102.field1467 / 2;
            class625.field8475.field6197[0] = class393.field5663 / 2;
            class223.field2892 = 0;
            class435.field6273 = 0;
            if (class697.field9252 != 2) {
                class397.method2425(false);
            } else {
                class223.field2892 = class278.field4013 << 9;
                class435.field6273 = class342.field4791 << 9;
            }
            class697.method3787(arg1 + -132);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z", line = 84)
    public static final boolean method1954(int arg0, int arg1) {
        if (arg0 != -14916) {
            return true;
        } else {
            ++field4247;
            return ~arg1 <= -5 && ~arg1 >= -9;
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)[B", line = 95)
    public final byte[] method171(byte arg0) {
        if (arg0 != 90) {
            field4254 = -75;
        }
        ++field4252;
        if (super.field295) {
            throw new RuntimeException();
        } else {
            return this.field4258;
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(B)V", line = 124)
    public static void method1955(byte arg0) {
        field4253 = null;
        field4249 = null;
        if (arg0 != -11) {
            method1956((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(B)Z", line = 135)
    public static final boolean method1956(byte arg0) {
        if (arg0 != 81) {
            field4254 = -8;
        }
        ++field4248;
        try {
            class601 var1 = new class601();
            byte[] var2 = var1.method3370(class706.field9662, arg0 ^ 103);
            class138.method960((byte) 78, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)Z", line = 171)
    public static final boolean method1957(int arg0) {
        ++field4257;
        return class780.field10712 >= arg0;
    }
}
