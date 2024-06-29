import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class310 extends class162 {

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Lc;")
    public class111 field5012;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "[I")
    public static int[] field5013 = new int[100];

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field5016 = 0;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field5018 = -1;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "[C")
    public static char[] field5020 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "Lfa;")
    public static class273 field5014;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "[S")
    public static short[] field5015;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method2109(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method2109(arg0, arg1, var6 - 1, arg3, 122);
            method2109(var6 + 1, arg1, arg2, arg3, 112);
        }
        field5017++;
        if (arg4 <= 107) {
            method2109(-29, (short[]) null, 25, (String[]) null, -44);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lc;)V")
    public class310(class111 arg0) {
        this.field5012 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method2110(byte arg0) {
        field5020 = null;
        field5014 = null;
        if (arg0 != 7) {
            field5015 = null;
        }
        field5013 = null;
        field5015 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
    public static final void method2111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5019++;
        class36 var5 = class161.method1067(10, arg2, (byte) 81);
        var5.method219(-97);
        var5.field458 = arg0;
        var5.field461 = arg3;
        if (arg4 != -11774) {
            method2110((byte) 17);
        }
        var5.field465 = arg1;
    }
}
