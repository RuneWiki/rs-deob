import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class133 extends class116 {

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lda;")
    public static class275 field2368 = class255.method1672(123, "::fpsoff");

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Lda;")
    public static class275 field2372 = class255.method1672(114, "Abbrechen");

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Lda;")
    public static class275 field2379 = class255.method1672(97, "blaugr-Un:");

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lma;")
    public static class105 field2370;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Lda;")
    public class275 field2366;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "[I")
    public int[] field2371;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
    public int[] field2373;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[I")
    public int[] field2374;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public int[] field2377;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I")
    public final int method971(int arg0, int arg1) {
        field2375++;
        if (this.field2374 == null) {
            return -1;
        }
        int var3 = 101 % ((-arg0 - 32) / 48);
        for (int var4 = 0; var4 < this.field2374.length; var4++) {
            if (this.field2371[var4] == arg1) {
                return this.field2374[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lij;I)V")
    public final void method972(class85 arg0, int arg1) {
        field2365++;
        if (arg1 >= -32) {
            this.field2371 = null;
        }
        while (true) {
            int var3 = arg0.method564((byte) 99);
            if (var3 == 0) {
                return;
            }
            this.method976(arg0, var3, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        field2369++;
        if (this.field2377 == null) {
            return -1;
        }
        if (arg1 != -1) {
            field2370 = null;
        }
        for (int var3 = 0; var3 < this.field2377.length; var3++) {
            if (this.field2373[var3] == arg0) {
                return this.field2377[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
    public static void method974(int arg0) {
        field2372 = null;
        field2379 = null;
        field2370 = null;
        if (arg0 == 60) {
            field2368 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public final void method975(int arg0) {
        if (this.field2374 != null) {
            for (int var2 = 0; var2 < this.field2374.length; var2++) {
                this.field2374[var2] = class246.method1612(this.field2374[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            return;
        }
        if (this.field2377 != null) {
            for (int var3 = 0; var3 < this.field2377.length; var3++) {
                this.field2377[var3] = class246.method1612(this.field2377[var3], 32768);
            }
        }
        field2367++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lij;IB)V")
    private final void method976(class85 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2366 = arg0.method599(-1);
        } else if (arg1 == 2) {
            int var7 = arg0.method564((byte) 102);
            this.field2377 = new int[var7];
            this.field2373 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2377[var8] = arg0.method608(17);
                int var9 = arg0.method564((byte) 76);
                if (var9 == 0) {
                    this.field2373[var8] = -1;
                } else {
                    this.field2373[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method564((byte) 50);
            this.field2374 = new int[var4];
            this.field2371 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2374[var5] = arg0.method608(28);
                int var6 = arg0.method564((byte) 78);
                if (var6 == 0) {
                    this.field2371[var5] = -1;
                } else {
                    this.field2371[var5] = var6;
                }
            }
        }
        field2378++;
        if (arg2 <= 19) {
            this.method971(19, -97);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lgd;I)I")
    public static final int method977(class165 arg0, int arg1) {
        if (arg1 != -1) {
            return 123;
        }
        field2376++;
        class23 var2 = arg0.field2873;
        if (var2.field406 != null) {
            var2 = var2.method140(1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field358;
        if (arg0.field1788 == arg0.field1736) {
            var3 = var2.field401;
        } else if (arg0.field1788 == arg0.field1761) {
            var3 = var2.field374;
        }
        return var3;
    }
}
