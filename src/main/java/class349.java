import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class349 {

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field5082;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Lub;")
    public static class15 field5079 = new class15(16);

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method2284(byte arg0, int arg1) {
        int var3 = 99 / ((arg0 - 41) / 47);
        field5078++;
        return this.field5082[arg1];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lvj;B)V")
    public static final void method2285(class256[] arg0, byte arg1) {
        class216.field3122 = arg0.length;
        field5081++;
        class376.field5361 = new int[class216.field3122 + 10];
        class110.field1426 = new class256[class216.field3122 + 10];
        class271.method1852(arg0, 0, class110.field1426, 0, class216.field3122);
        for (int var2 = 0; var2 < class216.field3122; var2++) {
            class376.field5361[var2] = class110.field1426[var2].method75();
        }
        if (arg1 <= 88) {
            method2285((class256[]) null, (byte) -123);
        }
        for (int var3 = class216.field3122; var3 < class110.field1426.length; var3++) {
            class376.field5361[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([II[Ljava/lang/Object;IB)V")
    public static final void method2286(int[] arg0, int arg1, Object[] arg2, int arg3, byte arg4) {
        field5074++;
        if (arg4 <= 15) {
            method2289((byte) 110);
        }
        if (arg1 >= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var8;
        for (int var9 = arg1; var9 < arg3; var9++) {
            if (arg0[var9] < (var9 & 0x1) + var7) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                Object var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var8;
        method2286(arg0, arg1, arg2, var6 - 1, (byte) 22);
        method2286(arg0, var6 + 1, arg2, arg3, (byte) 22);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class349(String arg0, String arg1, String arg2, String arg3) {
        this.field5082 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5075++;
        if (arg6 != 19864) {
            return;
        }
        if (class408.field5789 <= arg9 && class231.field3415 >= arg9 && arg5 >= class408.field5789 && class231.field3415 >= arg5 && class408.field5789 <= arg8 && arg8 <= class231.field3415 && class408.field5789 <= arg3 && arg3 <= class231.field3415 && arg1 >= class245.field3659 && class240.field3547 >= arg1 && class245.field3659 <= arg7 && arg7 <= class240.field3547 && arg2 >= class245.field3659 && class240.field3547 >= arg2 && class245.field3659 <= arg4 && arg4 <= class240.field3547) {
            class110.method670(arg7, arg0, arg8, arg2, (byte) 125, arg5, arg4, arg1, arg9, arg3);
        } else {
            class187.method1346(arg1, arg9, arg8, arg7, (byte) 125, arg2, arg0, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIILjl;)V")
    public static final void method2288(int arg0, int arg1, int arg2, int arg3, class147 arg4) {
        arg4.field2201 = (arg1 << 7) + 64;
        arg4.field2196 = arg3;
        arg4.field2190 = (arg2 << 7) + 64;
        class74 var5 = class385.field5449[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class353 var7 = var5.field970; var7 != null; var7 = var7.field5127) {
                if (var7.field5125.field4469) {
                    int var8 = var7.field5125.method775(3);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field2196 += var6;
                arg4.field2192 = true;
            }
        }
        if (class385.field5449[arg0][arg1][arg2] == null) {
            class197.method1400(arg0, arg1, arg2);
        }
        class385.field5449[arg0][arg1][arg2].field968 = arg4;
    }

    @OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5080++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static final void method2289(byte arg0) {
        class226.field3375 = true;
        field5076++;
        if (arg0 != -80) {
            field5079 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static void method2290(int arg0) {
        if (arg0 <= 41) {
            field5084 = -49;
        }
        field5079 = null;
    }
}
