import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class66 {

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field1042 = -1;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
    public static int[] field1039 = new int[50];

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Ltc;")
    public static class196 field1035 = new class196();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lcl;")
    public static class145 field1040;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lvf;")
    public class84 field1036;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
    public int[] field1041;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field1034;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
    public static final void method450(int arg0, int arg1, int arg2) {
        class35.field545 = arg2 - class42.field650;
        class165.field2359 = arg1 - class42.field641;
        field1037++;
        if (arg0 != 1023) {
            method453((byte) -98);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
    public static final int method451(int arg0, int arg1) {
        field1032++;
        if (arg1 != 1023) {
            field1040 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLqj;Lqj;Lqj;)V")
    public static final void method452(byte arg0, class296 arg1, class296 arg2, class296 arg3) {
        field1038++;
        class433.field6226 = arg2;
        if (arg0 < 68) {
            field1035 = null;
        }
        class43.method310(arg1, -81, arg3);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method453(byte arg0) {
        field1040 = null;
        if (arg0 > -67) {
            method453((byte) -10);
        }
        field1039 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[II)V")
    public static final void method454(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field1033++;
        if (arg0 != -20333) {
            field1040 = null;
        }
        if (arg4 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg4; var9 < arg1; var9++) {
            if (arg2[var9] < (var9 & 0x1) + var7) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var8;
        method454(-20333, var6 - 1, arg2, arg3, arg4);
        method454(arg0, arg1, arg2, arg3, var6 + 1);
    }
}
