import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class161 extends class5 {

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Z")
    public volatile boolean field2983 = true;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "Lhj;")
    public static class69 field2991 = class181.method1318("<img=1>", (byte) -114);

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Lhj;")
    private static class69 field2994 = class181.method1318("Take", (byte) -108);

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Lhj;")
    public static class69 field2990 = field2994;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "Lhj;")
    public static class69 field2996 = class181.method1318(" GMT", (byte) -112);

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "Lhj;")
    public static class69 field2993 = class181.method1318("::noclip", (byte) -109);

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lvc;")
    public static class185 field2982;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "Lvc;")
    public static class185 field2984;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Z")
    public boolean field2987;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Z")
    public boolean field2992;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I")
    public abstract int method576(boolean arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lhj;B)Lhj;")
    public static final class69 method1204(class69 arg0, byte arg1) {
        int var2 = 112 % ((27 - arg1) / 52);
        field2988++;
        int var3 = class3.method8(arg0, -1);
        return var3 == -1 ? class17.field232 : class61.field1117.field1729[var3].method438(class216.field3909, class232.field4238, -125);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)[B")
    public abstract byte[] method579(int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V")
    public static final void method1205(int arg0, boolean arg1) {
        field2985++;
        byte[][] var2 = class230.field4204;
        byte var3 = 4;
        if (arg0 != -5074) {
            field2993 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class17.method105(-125);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class17.field223[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x329B7E2) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var7 & 0xFFED56) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class245.field4486.length; var14++) {
                                if (class245.field4486[var14] == var13 && var2[var14] != null) {
                                    class46.method261((var11 & 0x7) * 8, var2[var14], var4, 1, var9, class79.field1518, arg1, var6 * 8, var5 * 8, (var12 & 0x7) * 8, var10);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class246.method1737(8, false, var6 * 8, var4, var5 * 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2990 = null;
        field2984 = null;
        field2993 = null;
        field2994 = null;
        field2991 = null;
        field2982 = null;
        if (arg0 == 0) {
            field2996 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(Z)Lf;")
    public static final class35 method1207(boolean arg0) {
        field2989++;
        try {
            if (arg0) {
                field2990 = null;
            }
            return (class35) Class.forName("wg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILok;)V")
    public static final void method1208(int arg0, int arg1, int arg2, class38 arg3) {
        if (arg3.field4010 == arg2 && arg2 != -1) {
            class159 var4 = class211.method1521(-112, arg2);
            int var5 = var4.field2963;
            if (var5 == 1) {
                arg3.field3995 = 0;
                arg3.field4022 = 0;
                arg3.field3993 = 0;
                arg3.field4006 = arg0;
                class248.method1748(arg3.field4005, arg3.field3985, var4, -95, arg3.field4022, false);
            }
            if (var5 == 2) {
                arg3.field3995 = 0;
            }
        } else if (arg2 == -1 || arg3.field4010 == -1 || class211.method1521(-63, arg2).field2954 >= class211.method1521(-107, arg3.field4010).field2954) {
            arg3.field4006 = arg0;
            arg3.field4009 = arg3.field4021;
            arg3.field4022 = 0;
            arg3.field3993 = 0;
            arg3.field3995 = 0;
            arg3.field4010 = arg2;
            if (arg3.field4010 != -1) {
                class248.method1748(arg3.field4005, arg3.field3985, class211.method1521(-67, arg3.field4010), 110, arg3.field4022, false);
            }
        }
        field2986++;
        int var6 = 87 % ((arg1 + 1) / 44);
    }
}
