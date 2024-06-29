import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class163 extends class29 {

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field2161;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Lkg;")
    public static class223 field2162;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "[[I")
    public static int[][] field2163;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lae;")
    public static class285[] field2157;

    static {
        new class409("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field2161 = new String[100];
        field2162 = null;
        field2163 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lqh;III[Z)Z", line = 4)
    public static final boolean method1079(class337 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class215.field3069 != class161.field2151) {
            int var6 = class28.field401[arg1].method1427(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class378 var8 = class28.field401[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1427(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1428(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1430(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)V", line = 39)
    public static final void method1080(byte arg0, int arg1) {
        field2158++;
        if (arg0 != 124) {
            return;
        }
        class363 var2 = class303.field4440;
        synchronized (class303.field4440) {
            class303.field4440.method2300(arg1, true);
        }
        class363 var3 = class9.field123;
        synchronized (class9.field123) {
            class9.field123.method2300(arg1, true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Lik;", line = 61)
    public static final class422 method1081(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5332;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)Z", line = 69)
    public static final boolean method1082(byte arg0) {
        field2160++;
        if (arg0 != 95) {
            field2163 = null;
        }
        return class118.field1594 == 0 ? class349.field5124 : true;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 89)
    public static void method1083(int arg0) {
        field2161 = null;
        field2162 = null;
        field2157 = null;
        if (arg0 <= 32) {
            method1083(-40);
        }
        field2163 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V", line = 105)
    public class163(int arg0) {
        this.field2159 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 116)
    public static final int method1084(String arg0, int arg1) {
        field2156++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 < 10) {
            method1079((class337) null, -51, -112, -125, (boolean[]) null);
        }
        for (int var2 = 0; var2 < class373.field5450; var2++) {
            if (arg0.equalsIgnoreCase(class271.field4015[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method808(byte arg0);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)Z")
    public abstract boolean method809(boolean arg0);
}
