import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class185 extends class279 {

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3002 = "Face here";

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field3006 = -1;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Lqf;")
    private class311 field2998;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lvl;B)V", line = 11)
    public final void method1360(class6 arg0, byte arg1) {
        int var3 = -12 / ((27 - arg1) / 57);
        field3005++;
        while (true) {
            int var4 = arg0.method58(-288140008);
            if (var4 == 0) {
                return;
            }
            this.method1365(var4, arg0, -121);
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V", line = 31)
    public static final void method1361(int arg0) {
        field2997++;
        int var1 = (class146.field2310.field4698 >> 7) + class326.field5108;
        int var2 = (class146.field2310.field4731 >> 7) + class198.field3168;
        class231.field3610 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class231.field3610 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class231.field3610 = 1;
        }
        int var3 = -105 % ((arg0 + 60) / 54);
        if (class231.field3610 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class231.field3610 = 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)I", line = 57)
    public final int method1362(int arg0, byte arg1, int arg2) {
        field3003++;
        if (this.field2998 == null) {
            return arg0;
        } else if (arg1 == 42) {
            class233 var4 = (class233) this.field2998.method2168((long) arg2, (byte) -85);
            return var4 == null ? arg0 : var4.field3633;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;", line = 78)
    public final String method1363(String arg0, byte arg1, int arg2) {
        field3000++;
        if (this.field2998 == null) {
            return arg0;
        }
        if (arg1 <= 108) {
            this.method1362(28, (byte) -48, -51);
        }
        class215 var4 = (class215) this.field2998.method2168((long) arg2, (byte) -107);
        return var4 == null ? arg0 : var4.field3386;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V", line = 101)
    public static void method1364(int arg0) {
        field3002 = null;
        if (arg0 != 27649) {
            field3006 = -24;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILvl;I)V", line = 116)
    private final void method1365(int arg0, class6 arg1, int arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method58(-288140008);
            if (this.field2998 == null) {
                int var5 = class215.method1568(479166497, var4);
                this.field2998 = new class311(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method58(-288140008) == 1;
                int var8 = arg1.method31(-22888);
                class287 var9;
                if (var7) {
                    var9 = new class215(arg1.method40(false));
                } else {
                    var9 = new class233(arg1.method73((byte) 19));
                }
                this.field2998.method2161(var9, (long) var8, -1);
            }
        }
        if (arg2 > -72) {
            field3002 = (String) null;
        }
        field3008++;
    }
}
