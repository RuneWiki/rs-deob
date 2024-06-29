import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class229 implements class762 {

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "Laia;")
    private class241 field3120;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "Z")
    public static boolean field3117 = false;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "Ltm;")
    public static class412 field3116 = new class412();

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "D")
    public static double field3123 = -1.0D;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "J")
    public static long field3119;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        if (arg0 != 20662) {
            this.method16(103);
        }
        field3115++;
        return true;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "()V")
    public static final void method1497() {
        for (int var0 = class564.field7562; var0 < class315.field4541; var0++) {
            for (int var1 = 0; var1 < class405.field5875; var1++) {
                for (int var2 = 0; var2 < class710.field9947; var2++) {
                    class243 var3 = class626.field8501[var0][var1][var2];
                    if (var3 != null) {
                        class516 var4 = var3.field3270;
                        class516 var5 = var3.field3269;
                        if (var4 != null && var4.method59(-1)) {
                            class94.method751(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method59(-1)) {
                                class94.method751(var5, var0, var1, var2, 1, 1);
                                var5.method60(class192.field2582, var4, false, -95, 0, 0, 0);
                                var5.method66(-13514);
                            }
                            var4.method66(-13514);
                        }
                        for (class48 var6 = var3.field3272; var6 != null; var6 = var6.field726) {
                            class319 var8 = var6.field725;
                            if (var8 != null && var8.method59(-1)) {
                                class94.method751(var8, var0, var1, var2, var8.field4595 + 1 - var8.field4600, var8.field4585 - var8.field4590 + 1);
                                var8.method66(-13514);
                            }
                        }
                        class6 var7 = var3.field3280;
                        if (var7 != null && var7.method59(-1)) {
                            class394.method2487(var7, var0, var1, var2);
                            var7.method66(-13514);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method1498(byte[] arg0, boolean arg1, int arg2) {
        field3122++;
        if (arg0 == null) {
            return null;
        }
        if (~arg0.length < arg2 && !class432.field6131) {
            try {
                class168 var3 = (class168) Class.forName("in").getDeclaredConstructor().newInstance();
                var3.method764(13, arg0);
                return var3;
            } catch (Throwable var4) {
                class432.field6131 = true;
            }
        }
        return arg1 ? class487.method2830((byte) 100, arg0) : arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        int var1 = 76 / ((arg0 + 79) / 34);
        field3116 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V")
    public final void method1500(int arg0, boolean arg1) {
        if (arg1) {
            class379.field5542.method563(0, 0, class593.field8019, class140.field2048, this.field3120.field3244, 0);
        }
        field3113++;
        if (arg0 > -93) {
            field3116 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
    public static final void method1501(int arg0, int arg1) {
        field3114++;
        class16 var2 = class94.method753(arg0, 13175, (long) arg1);
        var2.method118(arg0 ^ 0x22E06FFB);
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Laia;)V")
    public class229(class241 arg0) {
        this.field3120 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V")
    public static final void method1502(int arg0) {
        field3118++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class627.field8773[var1] = true;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        field3112++;
        if (arg0 <= 36) {
            method1497();
        }
    }
}
