import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class158 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "[I")
    private int[] field2543 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field2549 = -1;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    public boolean field2541 = false;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public static int[] field2539 = new int[128];

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[[B")
    public static byte[][] field2548 = new byte[1000][];

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lmh;")
    public static class62 field2545 = class201.method1405(true, "; Expires=");

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
    public static boolean field2547 = true;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lmh;")
    public static class62 field2553 = class201.method1405(true, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lje;")
    public static class111 field2537;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "[I")
    private int[] field2554;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[S")
    public static short[] field2533;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[S")
    private short[] field2535;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[S")
    private short[] field2536;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[S")
    private short[] field2540;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[S")
    private short[] field2550;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZILmi;)V", line = 8)
    private final void method1155(boolean arg0, int arg1, class92 arg2) {
        if (arg0) {
            this.field2549 = 124;
        }
        field2534++;
        if (arg1 == 1) {
            this.field2549 = arg2.method702(-1);
        } else if (arg1 == 2) {
            int var8 = arg2.method702(-1);
            this.field2554 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2554[var9] = arg2.method721(119);
            }
        } else if (arg1 == 3) {
            this.field2541 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method702(-1);
            this.field2550 = new short[var6];
            this.field2535 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2535[var7] = (short) arg2.method721(24);
                this.field2550[var7] = (short) arg2.method721(29);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method702(-1);
            this.field2540 = new short[var4];
            this.field2536 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2536[var5] = (short) arg2.method721(31);
                this.field2540[var5] = (short) arg2.method721(49);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2543[arg1 - 60] = arg2.method721(85);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lqa;", line = 90)
    public final class76 method1156(int arg0) {
        field2544++;
        class76[] var2 = new class76[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field2543[var4] != -1) {
                var2[var3++] = class76.method582(class87.field1397, this.field2543[var4], 0);
            }
        }
        class76 var5 = new class76(var2, var3);
        if (this.field2535 != null) {
            for (int var6 = 0; var6 < this.field2535.length; var6++) {
                var5.method577(this.field2535[var6], this.field2550[var6]);
            }
        }
        if (this.field2536 != null) {
            for (int var7 = 0; var7 < this.field2536.length; var7++) {
                var5.method587(this.field2536[var7], this.field2540[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 144)
    public static void method1157(int arg0) {
        field2545 = null;
        field2537 = null;
        field2533 = null;
        field2539 = null;
        field2553 = null;
        field2548 = (byte[][]) null;
        if (arg0 < 83) {
            field2553 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z", line = 161)
    public final boolean method1158(byte arg0) {
        field2552++;
        if (this.field2554 == null) {
            return true;
        }
        if (arg0 != 28) {
            field2553 = (class62) null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2554.length; var3++) {
            if (!class87.field1397.method152(true, 0, this.field2554[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lqa;", line = 188)
    public final class76 method1159(byte arg0) {
        field2551++;
        if (this.field2554 == null) {
            return null;
        } else if (arg0 == -111) {
            class76[] var2 = new class76[this.field2554.length];
            for (int var3 = 0; var3 < this.field2554.length; var3++) {
                var2[var3] = class76.method582(class87.field1397, this.field2554[var3], 0);
            }
            class76 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class76(var2, var2.length);
            }
            if (this.field2535 != null) {
                for (int var5 = 0; var5 < this.field2535.length; var5++) {
                    var4.method577(this.field2535[var5], this.field2550[var5]);
                }
            }
            if (this.field2536 != null) {
                for (int var6 = 0; var6 < this.field2536.length; var6++) {
                    var4.method587(this.field2536[var6], this.field2540[var6]);
                }
            }
            return var4;
        } else {
            return (class76) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I", line = 248)
    public static final int method1160(int arg0, int arg1) {
        field2538++;
        if (arg0 < 0) {
            return 0;
        }
        class272 var2 = (class272) class222.field3829.method311((byte) 114, (long) arg0);
        if (var2 == null) {
            return class189.method1319(arg0, (byte) -8).field423;
        }
        int var3 = 0;
        if (arg1 < 63) {
            return -109;
        }
        for (int var4 = 0; var4 < var2.field4627.length; var4++) {
            if (var2.field4627[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class189.method1319(arg0, (byte) -8).field423 - var2.field4627.length);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Z", line = 282)
    public final boolean method1161(int arg0) {
        field2555++;
        if (arg0 != -27684) {
            this.field2549 = 111;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2543[var3] != -1 && !class87.field1397.method152(true, 0, this.field2543[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLmi;)V", line = 341)
    public final void method1162(boolean arg0, class92 arg1) {
        if (arg0) {
            method1157(-74);
        }
        while (true) {
            int var3 = arg1.method702(-1);
            if (var3 == 0) {
                field2542++;
                return;
            }
            this.method1155(false, var3, arg1);
        }
    }
}
