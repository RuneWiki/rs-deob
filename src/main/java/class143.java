import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class143 {

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
    public static int[] field2059 = new int[13];

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Llga;")
    public static class663 field2058 = new class663(8);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lav;")
    public class593 field2060;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Lhb;")
    public static class677 field2063;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lac;I)V", line = 5)
    public final void method1004(class501 arg0, int arg1) {
        if (arg1 < 117) {
            field2058 = null;
        }
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                field2054++;
                return;
            }
            this.method1009(arg0, (byte) -100, var3);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lqga;", line = 28)
    public final synchronized class168 method1005(int arg0) {
        field2061++;
        class168 var2 = (class168) this.field2060.field8307.method3747((byte) -66, (long) this.field2055);
        if (arg0 != 1) {
            this.field2060 = null;
        }
        if (var2 != null) {
            return var2;
        }
        class168 var3 = class168.method1193(this.field2060.field8297, this.field2055, 0);
        if (var3 != null) {
            this.field2060.field8307.method3748((long) this.field2055, var3, 12537);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;", line = 50)
    public static final String method1006(String arg0, String arg1, char arg2, int arg3) {
        field2057++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                if (arg3 != 2) {
                    method1008(-33);
                }
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg0);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)I", line = 117)
    public static final int method1007(byte arg0) {
        field2053++;
        if (arg0 != -57) {
            field2059 = null;
        }
        return class618.field8608.method274(0);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 128)
    public static void method1008(int arg0) {
        field2058 = null;
        if (arg0 <= -23) {
            field2059 = null;
            field2063 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lac;BI)V", line = 141)
    private final void method1009(class501 arg0, byte arg1, int arg2) {
        if (arg1 > -99) {
            method1007((byte) -38);
        }
        if (arg2 == 1) {
            this.field2055 = arg0.method2845(-1);
        } else if (arg2 == 2) {
            this.field2062 = arg0.method2874((byte) -75);
            this.field2052 = arg0.method2874((byte) -75);
        }
        field2056++;
    }
}
