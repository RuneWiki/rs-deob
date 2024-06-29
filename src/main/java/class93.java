import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class93 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lir;")
    public static class185 field1269;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lir;")
    public static class185 field1275;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 14)
    public static final void method747(int arg0) {
        field1270++;
        class51 var1 = class159.field2043;
        synchronized (class159.field2043) {
            if (arg0 != 100) {
                method751((class28) null, true, (byte) 104, false);
            }
            class159.field2043.method372(125);
        }
        class51 var2 = class379.field5550;
        synchronized (class379.field5550) {
            class379.field5550.method372(116);
        }
        class51 var3 = class289.field4328;
        synchronized (class289.field4328) {
            class289.field4328.method372(127);
        }
        class51 var4 = class192.field2677;
        synchronized (class192.field2677) {
            class192.field2677.method372(122);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 37)
    public static final void method748(int arg0) {
        if (class289.method1966(3032)) {
            if (class222.field3064 == null) {
                class264.method1765(arg0 ^ 0x1BA7);
            }
            class441.field6391 = new int[100];
            class255.field3719 = 0;
            class273.field4011 = new int[100];
            class280.field4130 = true;
            class157.field1985 = new boolean[100];
            class342.field5121 = new int[100];
            for (int var1 = 0; var1 < 100; var1++) {
                class273.field4011[var1] = (int) (Math.random() * (double) class357.field5298);
                class441.field6391[var1] = (int) (Math.random() * 350.0D);
                class342.field5121[var1] = (int) (Math.random() * 102.0D);
                class157.field1985[var1] = Math.random() < 0.5D;
            }
            try {
                class174.field2366 = class195.field2701.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0 != -7065) {
            field1267 = 71;
        }
        field1273++;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 78)
    public static void method749(int arg0) {
        if (arg0 <= 26) {
            field1267 = -103;
        }
        field1275 = null;
        field1269 = null;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 89)
    public static final void method750(int arg0) {
        field1266++;
        class238.field3346.method366(84);
        if (arg0 != 0) {
            field1274 = 49;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lnn;ZBZ)V", line = 101)
    public static final void method751(class28 arg0, boolean arg1, byte arg2, boolean arg3) {
        field1272++;
        int var4 = arg0.field482;
        int var5 = (int) arg0.field6091;
        arg0.method2632(true);
        if (arg1) {
            class188.method1251(var4, 0);
        }
        class441.method2760(var4, 2937);
        class248 var6 = class27.method224(65535, var5);
        if (var6 != null) {
            class92.method744(20491, var6);
        }
        class194.method1292(62);
        if (!arg3 && class233.field3246 != -1) {
            class276.method1817((byte) 58, class233.field3246, 1);
        }
        if (arg2 >= -48) {
            method747(-64);
        }
        class6 var7 = new class6(class242.field3402);
        for (class28 var8 = (class28) var7.method29(false); var8 != null; var8 = (class28) var7.method32(-1)) {
            if (!var8.method2633(true)) {
                var8 = (class28) var7.method29(false);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field483 == 3) {
                int var9 = (int) var8.field6091;
                if (var9 >>> 16 == var4) {
                    method751(var8, true, (byte) -110, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lrb;", line = 157)
    public static final class244 method752(byte arg0, int arg1) {
        field1271++;
        class244 var2 = (class244) class126.field1640.method2348(112, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 22) {
            byte[] var3 = class453.field6587.method1235(class341.method2235(-11788, arg1), false, class322.method2122(arg1, 122));
            class244 var4 = new class244();
            if (var3 != null) {
                var4.method1585(new class341(var3), -124);
            }
            class126.field1640.method2350(var4, (long) arg1, 21);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V", line = 185)
    public static final void method753(int arg0) {
        field1276++;
        if (arg0 == 1) {
            class415.field6013.method372(122);
        }
    }
}
