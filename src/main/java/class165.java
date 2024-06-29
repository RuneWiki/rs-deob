import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class165 extends class260 {

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "Lln;")
    public static class400 field2224 = new class400();

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Lmga;")
    public static class739 field2227 = new class739(16, 3);

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
    public static int field2233 = 0;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "Lib;")
    public static class164 field2232 = new class164("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "Ljw;")
    public static class581 field2235 = new class581(65, 9);

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lfca;)V", line = 3)
    public class165(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V", line = 8)
    public static void method1191(int arg0) {
        field2227 = null;
        field2232 = null;
        field2235 = null;
        field2224 = null;
        if (arg0 != 0) {
            field2233 = 36;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)I", line = 26)
    public final int method4(int arg0, byte arg1) {
        int var3 = 61 / ((-53 - arg1) / 50);
        ++field2226;
        return ~arg0 != -1 && ~super.field3867.field1301.method2583(70) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)I", line = 40)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            return -9;
        } else {
            ++field2231;
            return 1;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V", line = 52)
    public final void method2(boolean arg0) {
        if (super.field3868 != 0 && super.field3867.field1301.method2583(62) != 1) {
            super.field3868 = 0;
        }
        ++field2225;
        if (arg0) {
            this.method2(false);
        }
        if (~super.field3868 > -1 || super.field3868 > 1) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(IB)V", line = 70)
    public final void method9(int arg0, byte arg1) {
        ++field2234;
        super.field3868 = arg0;
        if (arg1 != -107) {
            field2227 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)I", line = 84)
    public final int method1192(int arg0) {
        ++field2230;
        return arg0 < 3 ? -118 : super.field3868;
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)Z", line = 95)
    public final boolean method1193(int arg0) {
        ++field2228;
        int var2 = 119 / ((56 - arg0) / 53);
        return true;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 105)
    public static final String method1194(String arg0, int arg1) {
        ++field2229;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 <= 56) {
            method1191(103);
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && ~(var4 + 2) > ~var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (~var6 <= -49 && ~var6 >= -58) {
                    var8 = var6 + -48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' + -97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + -65 + 10;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0' + var10;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + -87 + var10;
                } else {
                    if (~var9 > -66 || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + -65 + 10 + var10;
                }
                if (~var11 != -1 && class138.method1071((byte) var11, -1)) {
                    var2.append(class682.method3796((byte) 42, (byte) var11));
                }
                var4 += 2;
            } else if (~var5 != -44) {
                var2.append(var5);
            } else {
                var2.append(' ');
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(ILfca;)V", line = 183)
    public class165(int arg0, class92 arg1) {
        super(arg0, arg1);
    }
}
