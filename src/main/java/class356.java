import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class356 implements class108 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ljj;")
    public static class156 field5056 = new class156(16);

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static volatile int field5062 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lvq;")
    public static class22 field5064;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lci;")
    public static class387 field5061;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field5060;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
    public static int[] field5063;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2280(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < arg4) {
            for (int var5 = arg0; var5 < arg4; var5++) {
                class286.field4283[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg0; var6++) {
                class286.field4283[var6][arg3] = arg1;
            }
        }
        if (arg2 != -10605) {
            method2282(26L, false);
        }
        field5055++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z[IIJ)Ljava/lang/String;", line = 40)
    public final String method953(boolean arg0, int[] arg1, int arg2, long arg3) {
        if (!arg0) {
            field5061 = null;
        }
        field5059++;
        if (arg2 == 0) {
            class269 var6 = class443.method2771(2048, arg1[0]);
            return var6.method1924((int) arg3, 6);
        } else if (arg2 == 1 || arg2 == 10) {
            class124 var7 = class206.method1561(80, (int) arg3);
            return var7.field1999;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class443.method2771(2048, arg1[0]).method1924((int) arg3, 6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 75)
    public static void method2281(int arg0) {
        field5061 = null;
        field5064 = null;
        field5060 = null;
        field5063 = null;
        if (arg0 >= -20) {
            method2282(85L, false);
        }
        field5056 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 95)
    public static final String method2282(long arg0, boolean arg1) {
        field5057++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class144.field2250[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            if (!arg1) {
                method2281(-106);
            }
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
