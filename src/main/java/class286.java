import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class286 extends class312 {

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Loa;")
    public class13 field4378;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field4385 = 0;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "[I")
    public static int[] field4382 = new int[2000];

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
    public static int[] field4387 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lbk;")
    public static class180 field4380;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4381++;
        int var7 = arg5 - arg1;
        int var8 = arg1 + arg2;
        if (arg3 != 6) {
            return;
        }
        for (int var9 = arg2; var9 < var8; var9++) {
            class253.method1704(arg6, arg4, arg0, class175.field2675[var9], 7);
        }
        int var10 = arg1 + arg6;
        for (int var11 = arg5; var11 > var7; var11--) {
            class253.method1704(arg6, arg4, arg0, class175.field2675[var11], 7);
        }
        int var12 = arg4 - arg1;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class175.field2675[var13];
            class253.method1704(arg6, var10, arg0, var14, 7);
            class253.method1704(var12, arg4, arg0, var14, 7);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Loa;)V", line = 47)
    public class286(class13 arg0) {
        this.field4378 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 61)
    public static void method1869(int arg0) {
        field4380 = null;
        if (arg0 > -93) {
            field4380 = (class180) null;
        }
        field4382 = null;
        field4387 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BD)V", line = 75)
    public static final void method1870(byte arg0, double arg1) {
        if (arg0 >= -14) {
            method1869(58);
        }
        field4379++;
        if (class29.field367 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class150.field2362[var3] = var4 > 255 ? 255 : var4;
        }
        class29.field367 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)Lfm;", line = 103)
    public static final class200 method1871(int arg0, byte arg1, int arg2) {
        field4383++;
        if (arg1 > -20) {
            field4385 = -43;
        }
        for (class200 var3 = (class200) class207.field3164.method1549((byte) -43); var3 != null; var3 = (class200) class207.field3164.method1546(-1)) {
            if (var3.field3015 && var3.method1351(arg2, arg0, (byte) -86)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V", line = 126)
    public static final void method1872(int arg0) {
        field4386++;
        if (arg0 != 6) {
            field4385 = 108;
        }
        for (class229 var1 = (class229) class240.field3812.method10((byte) 102); var1 != null; var1 = (class229) class240.field3812.method13((byte) -32)) {
            if (var1.field3676) {
                var1.method1574(false);
            }
        }
        for (class229 var2 = (class229) class203.field3066.method10((byte) 127); var2 != null; var2 = (class229) class203.field3066.method13((byte) -32)) {
            if (var2.field3676) {
                var2.method1574(false);
            }
        }
    }
}
