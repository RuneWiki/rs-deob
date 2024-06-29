import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class115 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[Lui;")
    public static class293[] field1598 = new class293[14];

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public static boolean field1602 = false;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 5)
    public static final void method743(byte arg0) {
        class300.field4687 = (byte[][][]) null;
        class72.field893 = null;
        class84.field1093 = null;
        class168.field2578 = (byte[][][]) null;
        class174.field2629 = null;
        field1601++;
        if (arg0 < 62) {
            field1598 = (class293[]) null;
        }
        class111.field1554 = (byte[][][]) null;
        class28.field337 = (int[][][]) null;
        class300.field4685 = null;
        class110.field1519 = (byte[][][]) null;
        class42.field474 = null;
        class254.field4026 = null;
        class254.field4018 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BC)Z", line = 29)
    public static final boolean method744(byte arg0, char arg1) {
        field1600++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        } else if (arg0 == 20) {
            if (arg1 != '\u0000') {
                char[] var2 = class293.field4609;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 70)
    public static final void method746(int arg0) {
        int var1 = (class11.field113.field3767 >> 7) + class322.field4999;
        int var2 = (class11.field113.field3763 >> 7) + class16.field160;
        class123.field1706 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class123.field1706 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class123.field1706 = 1;
        }
        field1595++;
        if (class123.field1706 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class123.field1706 = 0;
        }
        if (arg0 >= -46) {
            field1598 = (class293[]) null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 97)
    public static void method747(int arg0) {
        field1598 = null;
        if (arg0 > -58) {
            method747(-91);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V", line = 111)
    public static final void method748(int arg0, byte arg1) {
        if (arg1 >= -89) {
            field1599 = -57;
        }
        client.field4423.method387(arg0, false);
        class148.field2356.method387(arg0, false);
        field1603++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLhi;I)Ljava/lang/String;", line = 124)
    public static final String method749(boolean arg0, class323 arg1, int arg2) {
        if (!arg0) {
            return (String) null;
        }
        field1596++;
        if (!client.method2013(arg1).method483(arg2, -4150) && arg1.field5137 == null) {
            return null;
        } else if (arg1.field5117 == null || arg2 >= arg1.field5117.length || arg1.field5117[arg2] == null || arg1.field5117[arg2].trim().length() == 0) {
            return class214.field3244 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field5117[arg2];
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 152)
    public static final void method750(int arg0) {
        field1597++;
        for (int var1 = 0; var1 < 5; var1++) {
            class231.field3497[var1] = false;
        }
        class233.field3525 = 0;
        class130.field1879 = -1;
        class30.field355 = -1;
        if (arg0 <= -126) {
            class140.field2159 = 0;
            class120.field1667 = 5;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;Llf;I)I", line = 186)
    public static final int method751(String arg0, class143 arg1, int arg2) {
        field1604++;
        int var3 = arg1.field2295;
        byte[] var4 = class301.method2124(8364, arg0);
        arg1.method1024(var4.length, 11727);
        arg1.field2295 += class99.field1343.method776(arg1.field2260, arg2, var4, var4.length, arg1.field2295, 0);
        return arg1.field2295 - var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B[B)V")
    public abstract void method742(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method745(boolean arg0);
}
