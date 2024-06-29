import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class40 extends class219 {

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lbe;")
    private static class283 field560 = class153.method941(-88, "Use");

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lbe;")
    public static class283 field562 = field560;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lfg;")
    public static class202 field566 = new class202(0, 0);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lbe;")
    public static class283 field569 = class153.method941(126, "M");

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lbe;")
    public static class283 field568 = class153.method941(-40, "document)3cookie=(R");

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
    public static int[] field570 = new int[32];

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "J")
    public static long field571 = 0L;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 8)
    public static final void method248(int arg0) {
        field572++;
        class149 var1 = new class149();
        if (arg0 != -14) {
            method251((int[]) null, 118, false, (int[]) null, 4);
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class197.field3370[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)I", line = 43)
    public static final int method249(int arg0, int arg1, int arg2) {
        field565++;
        class74 var3 = (class74) class170.field2860.method1612((long) arg2, 123);
        if (var3 == null) {
            return 0;
        } else if (arg0 <= arg1 && arg1 < var3.field1288.length) {
            return var3.field1288[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method250(boolean arg0) {
        field561++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class121.field2018[var1] = false;
        }
        class26.field377 = 1;
        class30.field454 = -1;
        class150.field2455 = -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIZ[II)V", line = 87)
    public static final void method251(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        field563++;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (arg0[var9] > var7 + (var9 & 0x1)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method251(arg0, var6 - 1, false, arg3, arg4);
            method251(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg2) {
            method248(122);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 145)
    public static void method252(int arg0) {
        field569 = null;
        field560 = null;
        field562 = null;
        field568 = null;
        field570 = null;
        if (arg0 == 5) {
            field566 = null;
        }
    }
}
