import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 extends class45 {

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lar;")
    public class47 field533 = new class47();

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field532 = "Examine";

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 5)
    public static final String method274(String[] arg0, int arg1, int arg2, int arg3) {
        field535++;
        if (~arg1 == arg2) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BB)[B", line = 69)
    public static final byte[] method275(byte[] arg0, byte arg1) {
        field536++;
        class228 var2 = new class228(arg0);
        int var3 = var2.method1348(-87);
        if (arg1 != -8) {
            field532 = null;
        }
        int var4 = var2.method1344((byte) 117);
        if (var4 < 0 || class272.field3941 != 0 && class272.field3941 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1358(0, arg1 ^ 0xFFFFFF78, var7, var4);
            return var7;
        } else {
            int var5 = var2.method1344((byte) 105);
            if (var5 < 0 || !(class272.field3941 == 0 || class272.field3941 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class289.method1974(var6, var5, arg0, var4, 9);
            } else {
                class139.field1912.method65(var6, 15049, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 123)
    public static void method276(byte arg0) {
        if (arg0 >= 98) {
            field532 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lps;IZIII)V", line = 138)
    public static final void method277(class394[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class394 var7 = arg0[var6];
            if (var7 != null && var7.field5639 == arg1) {
                class267.method1823(arg2, 2, arg4, var7, arg5);
                class428.method2719((byte) 112, arg4, arg5, var7);
                if (var7.field5742 > var7.field5657 - var7.field5773) {
                    var7.field5742 = var7.field5657 - var7.field5773;
                }
                if (var7.field5771 - var7.field5672 < var7.field5764) {
                    var7.field5764 = var7.field5771 - var7.field5672;
                }
                if (var7.field5742 < 0) {
                    var7.field5742 = 0;
                }
                if (var7.field5764 < 0) {
                    var7.field5764 = 0;
                }
                if (var7.field5671 == 0) {
                    class235.method1409(var7, arg2, (byte) -110);
                }
            }
        }
        field538++;
        if (arg3 != 10743) {
            method274((String[]) null, 41, -93, 83);
        }
    }
}
