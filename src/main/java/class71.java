import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class71 extends class82 {

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Ljava/lang/String;")
    public String field1124;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Z")
    public static boolean field1125 = false;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lik;")
    public static class267 field1127 = new class267(5);

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1130 = new String[100];

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    public static boolean field1131 = false;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1136 = "Checking for updates - ";

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
    public static int[] field1135 = new int[500];

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[Ldi;")
    public static class179[] field1132;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method478(boolean arg0) {
        field1136 = null;
        field1135 = null;
        if (!arg0) {
            field1133 = 120;
        }
        field1132 = null;
        field1130 = null;
        field1127 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILrf;)Z")
    public static final boolean method479(int arg0, class289 arg1) {
        if (arg0 >= -7) {
            return false;
        }
        field1123++;
        if (arg1.field4496 == 205) {
            class149.field2161 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/lang/String;BII[S)V")
    public static final void method480(String[] arg0, byte arg1, int arg2, int arg3, short[] arg4) {
        if (arg1 != -94) {
            return;
        }
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method480(arg0, (byte) -94, arg2, var6 - 1, arg4);
            method480(arg0, (byte) -94, var6 + 1, arg3, arg4);
        }
        field1126++;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLpf;Lpf;ILhg;)V")
    public static final void method481(boolean arg0, class294 arg1, class294 arg2, int arg3, class181 arg4) {
        class107.field1669 = arg0;
        class123.field1861 = arg2;
        class126.field1901 = arg1;
        int var5 = class126.field1901.method1962(true) - 1;
        class62.field977 = class126.field1901.method1976(1, var5) + var5 * 256;
        class137.field2002 = new String[] { null, null, null, null, class212.field3180 };
        if (arg3 <= -123) {
            class206.field3085 = arg4;
            class236.field3564 = new String[] { null, null, class253.field3839, null, null };
            field1129++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class71(String arg0, int arg1) {
        this.field1124 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZII)V")
    public static final void method482(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class106.field1614 = 0L;
        int var5 = class13.method75(0);
        if (arg1 == arg3 || var5 == 3) {
            arg2 = true;
        }
        if (class12.field155.startsWith("mac") && arg3 > 0) {
            arg2 = true;
        }
        boolean var6 = false;
        field1128++;
        if (arg3 <= 0 != var5 <= 0) {
            var6 = true;
        }
        if (arg2 && arg3 > 0) {
            var6 = true;
        }
        class15.method113(var6, -99, var5, arg3, arg0, arg2, arg4);
    }
}
