import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class213 extends class312 {

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Lkn;")
    public static class52 field3367 = new class52(16);

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Ljava/lang/String;")
    public String field3372;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "Z")
    public static boolean field3378;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[C")
    public char[] field3368;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "[C")
    public char[] field3374;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "[I")
    public int[] field3373;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "[I")
    public int[] field3377;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILgn;I)V", line = 7)
    private final void method1422(int arg0, class303 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3372 = arg1.method2027(0);
        } else if (arg0 == 2) {
            int var4 = arg1.method2043((byte) -113);
            this.field3374 = new char[var4];
            this.field3373 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3373[var5] = arg1.method1994(false);
                byte var6 = arg1.method2001(arg2 - 3);
                this.field3374[var5] = var6 == 0 ? 0 : class152.method1064(class146.method1012(arg2, 0), var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method2043((byte) -104);
            this.field3377 = new int[var7];
            this.field3368 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3377[var8] = arg1.method1994(false);
                byte var9 = arg1.method2001(-3);
                this.field3368[var8] = var9 == 0 ? 0 : class152.method1064(0, var9);
            }
        } else if (arg0 == 4) {
        }
        field3369++;
        if (arg2 != 0) {
            this.method1423('\u0019', -27);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(CI)I", line = 71)
    public final int method1423(char arg0, int arg1) {
        field3375++;
        if (this.field3377 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3377.length; var3++) {
            if (this.field3368[var3] == arg0) {
                return this.field3377[var3];
            }
        }
        if (arg1 != 16) {
            this.method1426(65);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(CZ)I", line = 97)
    public final int method1424(char arg0, boolean arg1) {
        field3376++;
        if (this.field3373 == null) {
            return -1;
        }
        if (arg1) {
            method1427((byte) 7);
        }
        for (int var3 = 0; var3 < this.field3373.length; var3++) {
            if (this.field3374[var3] == arg0) {
                return this.field3373[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lgn;B)V", line = 142)
    public final void method1425(class303 arg0, byte arg1) {
        if (arg1 != -6) {
            this.method1426(-73);
        }
        while (true) {
            int var3 = arg0.method2043((byte) -113);
            if (var3 == 0) {
                field3371++;
                return;
            }
            this.method1422(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 170)
    public final void method1426(int arg0) {
        field3370++;
        if (arg0 != 0) {
            method1427((byte) -4);
        }
        if (this.field3377 != null) {
            for (int var2 = 0; var2 < this.field3377.length; var2++) {
                this.field3377[var2] = class276.method1810(this.field3377[var2], 32768);
            }
        }
        if (this.field3373 != null) {
            for (int var3 = 0; var3 < this.field3373.length; var3++) {
                this.field3373[var3] = class276.method1810(this.field3373[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 206)
    public static void method1427(byte arg0) {
        field3367 = null;
        if (arg0 != -25) {
            field3378 = false;
        }
    }
}
