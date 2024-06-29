import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class511 extends class156 {

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "B")
    public byte field7286;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "Lud;")
    public class35 field7288;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)I")
    public static final int method3055(byte arg0, int arg1) {
        int var2 = 102 / ((-43 - arg0) / 55);
        ++field7285;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)I")
    public final int method1185(boolean arg0) {
        ++field7290;
        if (this.field7288 == null) {
            return 0;
        } else {
            if (arg0) {
                method3058((String) null, 4);
            }
            return this.field7288.field469 * 100 / (this.field7288.field483.length + -this.field7286);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)[B")
    public final byte[] method1187(byte arg0) {
        ++field7283;
        if (!super.field2336 && this.field7288.field483.length + -this.field7286 <= this.field7288.field469) {
            return arg0 >= -15 ? null : this.field7288.field483;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "(I)V")
    public static final void method3056(int arg0) {
        class570.field8115 = arg0;
        class719.field10073 = new class710[50];
        ++field7291;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILha;III)Lka;")
    public static final class469 method3057(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6) {
        ++field7287;
        long var7 = (long) arg2;
        class469 var9 = (class469) class583.field8235.method3054((byte) -122, var7);
        short var10 = 2055;
        if (var9 == null) {
            class729 var11 = class337.method2148(-14907, arg2, class423.field5926, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field10196 < 13) {
                var11.method4058(2, 0);
            }
            var9 = arg3.method646(var11, var10, class93.field1633, 64, 768);
            class583.field8235.method3047(false, var9, var7);
        }
        class469 var12 = var9.method325((byte) 2, var10, true);
        if (~arg0 != -1) {
            var12.method360(arg0);
        }
        if (arg1 != 0) {
            var12.method344(arg1);
        }
        if (~arg5 != -1) {
            var12.method310(arg5);
        }
        if (arg4 != arg6) {
            var12.method349(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3058(String arg0, int arg1) {
        ++field7284;
        if (arg1 != 768) {
            method3057(-15, -43, 106, (class58) null, -74, 49, 5);
        }
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class726.method4041(-1, arg0);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class425.field5945; ++var3) {
                    String var4 = class583.field8236[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class726.method4041(-1, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class425.field5945;
                        for (int var6 = var3; class425.field5945 > var6; ++var6) {
                            class583.field8236[var6] = class583.field8236[var6 + 1];
                            class111.field1800[var6] = class111.field1800[var6 + 1];
                            class170.field2486[var6] = class170.field2486[var6 + 1];
                            class301.field4237[var6] = class301.field4237[var6 + 1];
                            class159.field2371[var6] = class159.field2371[var6 + 1];
                            class425.field5947[var6] = class425.field5947[var6 - -1];
                        }
                        ++class731.field10232;
                        class688.field9702 = class374.field5247;
                        class135 var7 = class273.method1801(class459.field6629, class671.field9401, 2);
                        var7.field2109.method263((byte) -103, class552.method3233((byte) 118, arg0));
                        var7.field2109.method287((byte) 0, arg0);
                        class539.method3178(var7, -18925);
                        return;
                    }
                }
            }
        }
    }
}
