import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class202 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "J")
    public long field3111 = 0L;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[[B")
    public static byte[][] field3122 = new byte[50][];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
    public static int[] field3113 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lfk;")
    public static class317 field3120 = new class317();

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3130 = null;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "F")
    public static float field3125;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lqf;")
    public class64 field3116;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lqf;")
    public class64 field3121;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1506(int arg0) {
        if (arg0 != -19215) {
            method1513(false);
        }
        field3129++;
        return 2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)V", line = 19)
    public static final void method1507(int arg0, int arg1, byte arg2) {
        int var3 = 90 % ((arg2 + 33) / 36);
        class138 var4 = class149.method1242(arg0, 0, 6);
        var4.method1153((byte) 50);
        var4.field2282 = arg1;
        field3119++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILug;I)Ljava/lang/String;", line = 31)
    public static final String method1508(int arg0, class25 arg1, int arg2) {
        field3123++;
        try {
            int var3 = arg1.method270(false);
            if (arg2 <= 95) {
                return (String) null;
            }
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field397 += class61.field941.method1321(-1, var4, var3, 0, arg1.field448, arg1.field397);
            return class206.method1532(var4, var3, false, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILua;Ljava/lang/Object;)V", line = 64)
    public static final void method1509(int arg0, class323 arg1, Object arg2) {
        field3114++;
        if (arg1.field4976 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4976.peekEvent() != null; var3++) {
            class188.method1443(arg0 - 27939, 1L);
        }
        if (arg2 != null) {
            arg1.field4976.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
        if (arg0 != 27949) {
            field3125 = 0.0151118515F;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[F)[F", line = 89)
    public static final float[] method1510(int arg0, float[] arg1) {
        field3115++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class65.method637(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILug;)V", line = 110)
    public static final void method1511(int arg0, class25 arg1) {
        int var2 = -36 % ((26 - arg0) / 56);
        byte[] var3 = new byte[24];
        field3112++;
        if (class31.field491 != null) {
            try {
                class31.field491.method1165(0L, 0);
                int var4 = 0;
                class31.field491.method1162(var3, 8);
                while (var4 < 24 && var3[var4] == 0) {
                    var4++;
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var6 = 0; var6 < 24; var6++) {
                    var3[var6] = -1;
                }
            }
        }
        arg1.method311(1, 24, 0, var3);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 152)
    public static void method1512(int arg0) {
        field3113 = null;
        field3120 = null;
        field3122 = (byte[][]) null;
        field3130 = null;
        if (arg0 != 24) {
            field3113 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 171)
    public static final void method1513(boolean arg0) {
        field3109++;
        if (!arg0) {
            method1510(-15, (float[]) null);
        }
        for (class176 var1 = (class176) class72.field1075.method2244((byte) -127); var1 != null; var1 = (class176) class72.field1075.method2241(-1)) {
            class337 var2 = var1.field2777;
            if (class119.field1826 != var2.field5175 || var2.field5157 < class360.field5718) {
                var1.method1357(947647010);
            } else if (var2.field5177 <= class360.field5718) {
                if (var2.field5180 > 0) {
                    class244 var3 = class110.field1683[var2.field5180 - 1];
                    if (var3 != null && var3.field1359 >= 0 && var3.field1359 < 13312 && var3.field1286 >= 0 && var3.field1286 < 13312) {
                        var2.method2367(!arg0, class360.field5718, var3.field1359, var3.field1286, class193.method1469(var3.field1286, var3.field1359, (byte) -47, var2.field5175) - var2.field5183);
                    }
                }
                if (var2.field5180 < 0) {
                    int var4 = -var2.field5180 - 1;
                    class171 var5;
                    if (class118.field1813 == var4) {
                        var5 = class173.field2746;
                    } else {
                        var5 = class177.field2795[var4];
                    }
                    if (var5 != null && var5.field1359 >= 0 && var5.field1359 < 13312 && var5.field1286 >= 0 && var5.field1286 < 13312) {
                        var2.method2367(false, class360.field5718, var5.field1359, var5.field1286, class193.method1469(var5.field1286, var5.field1359, (byte) -47, var2.field5175) - var2.field5183);
                    }
                }
                var2.method2364(117, class247.field3840);
                class276.method2028(class119.field1826, (int) var2.field5182, (int) var2.field5167, (int) var2.field5149, 60, var2, var2.field5187, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 239)
    public static final void method1514(byte arg0) {
        class186.field2905.method656(0);
        field3118++;
        if (arg0 != -111) {
            field3130 = (String) null;
        }
    }
}
