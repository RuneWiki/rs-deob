import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class168 extends class401 {

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field2159;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "Lhd;")
    public static class523 field2162;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "Ll;")
    public static class16 field2161;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2160;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V")
    public static final void method1080(int arg0, int arg1, long[] arg2, int arg3, Object[] arg4) {
        if (arg1 < arg0) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if (arg2[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method1080(var6 - 1, arg1, arg2, 0, arg4);
            method1080(arg0, var6 + 1, arg2, 0, arg4);
        }
        field2157++;
        if (arg3 != 0) {
            method1082(true);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIII)V")
    public static final void method1081(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method1081(-2, false, 109, 61, -51);
        }
        field2155++;
        if (arg2 > arg4) {
            class184.method1160(class387.field5088[arg3], -7, arg0, arg2, arg4);
        } else {
            class184.method1160(class387.field5088[arg3], -7, arg0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class168(Object arg0, int arg1) {
        super(arg1);
        this.field2159 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Z")
    public final boolean method645(byte arg0) {
        field2156++;
        if (arg0 != 6) {
            field2160 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Z)V")
    public static void method1082(boolean arg0) {
        field2161 = null;
        field2160 = null;
        if (arg0) {
            method1080(83, -101, null, -95, null);
        }
        field2162 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method646(int arg0) {
        field2158++;
        if (arg0 != -17718) {
            method1082(false);
        }
        return this.field2159;
    }

    static {
        new class335("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field2162 = null;
    }
}
