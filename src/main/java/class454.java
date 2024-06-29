import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class454 extends class13 {

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
    public boolean field6397 = true;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field6412 = 0;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "[I")
    public static int[] field6407 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lwh;")
    public static class149 field6406;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Laha;")
    public class382 field6402;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "[I")
    public int[] field6401;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[I")
    private int[] field6409;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field6399;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[[I")
    private int[][] field6400;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    public final void method2700(boolean arg0) {
        if (arg0) {
            field6412 = 26;
        }
        field6398++;
        if (this.field6401 != null) {
            for (int var2 = 0; var2 < this.field6401.length; var2++) {
                this.field6401[var2] = class418.method2577(this.field6401[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B[ILcea;)V")
    public final void method2701(byte arg0, int[] arg1, class215 arg2) {
        field6395++;
        int var4 = -107 / ((-arg0 - 71) / 50);
        if (this.field6409 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field6409.length; var5++) {
            if (arg1.length <= var5) {
                return;
            }
            int var6 = this.method2703(0, var5).field4062;
            if (var6 > 0) {
                arg2.method1505(var6, (long) arg1[var5], (byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
    public static final void method2702(byte arg0) {
        class334.field4684.method2221(true);
        field6404++;
        class480.method2814(0);
        class591.field8069 = 0;
        class517.field7204 = null;
        class568.field7816 = 0;
        class212.field3013 = null;
        class149.field2477.field3109 = 0;
        int var1 = -122 % ((arg0 - 13) / 45);
        class433.field6189 = null;
        class458.method2720(-99);
        class443.field6289 = 0;
        class578.field7935 = null;
        class237.field3446 = 0;
        class166.field2601 = null;
        class323.field4488 = 0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)Loaa;")
    public final class290 method2703(int arg0, int arg1) {
        field6396++;
        if (arg0 != 0) {
            field6407 = null;
        }
        return this.field6409 == null || arg1 < 0 || this.field6409.length < arg1 ? null : class25.method379(this.field6409[arg1], 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)I")
    public final int method2704(int arg0, int arg1, boolean arg2) {
        field6411++;
        if (!arg2) {
            this.method2704(41, 104, true);
        }
        if (this.field6409 == null || arg1 < 0 || this.field6409.length < arg1) {
            return -1;
        } else if (this.field6400[arg1] == null || arg0 < 0 || this.field6400[arg1].length < arg0) {
            return -1;
        } else {
            return this.field6400[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILcea;I)V")
    private final void method2705(int arg0, class215 arg1, int arg2) {
        if (arg2 != 60) {
            return;
        }
        if (arg0 == 1) {
            this.field6399 = class728.method4031('<', true, arg1.method1525((byte) -82));
        } else if (arg0 == 2) {
            int var4 = arg1.method1535(255);
            this.field6401 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6401[var5] = arg1.method1478(arg2 + 842397884);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1535(arg2 + 195);
            this.field6400 = new int[var6][];
            this.field6409 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1478(842397944);
                class290 var9 = class25.method379(var8, arg2 - 60);
                if (var9 != null) {
                    this.field6409[var7] = var8;
                    this.field6400[var7] = new int[var9.field4061];
                    for (int var10 = 0; var10 < var9.field4061; var10++) {
                        this.field6400[var7][var10] = arg1.method1478(arg2 + 842397884);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field6397 = false;
        }
        field6410++;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(B)I")
    public final int method2706(byte arg0) {
        field6405++;
        if (arg0 > -32) {
            this.field6401 = null;
        }
        return this.field6409 == null ? 0 : this.field6409.length;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lcea;B)Ljava/lang/String;")
    public final String method2707(class215 arg0, byte arg1) {
        field6413++;
        if (arg1 < 33) {
            this.method2710(-91);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6409 != null) {
            for (int var4 = 0; var4 < this.field6409.length; var4++) {
                var3.append(this.field6399[var4]);
                var3.append(this.field6402.method2412(arg0.method1516(class25.method379(this.field6409[var4], 0).field4060, 3060), this.field6400[var4], -1, this.method2703(0, var4)));
            }
        }
        var3.append(this.field6399[this.field6399.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(B)V")
    public static void method2708(byte arg0) {
        if (arg0 != 61) {
            method2702((byte) -95);
        }
        field6406 = null;
        field6407 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lcea;I)V")
    public final void method2709(class215 arg0, int arg1) {
        field6403++;
        while (true) {
            int var3 = arg0.method1535(arg1 ^ 0xFF);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method2708((byte) -66);
                    return;
                }
            }
            this.method2705(var3, arg0, 60);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method2710(int arg0) {
        field6408++;
        if (arg0 < 66) {
            this.field6399 = null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field6399 == null) {
            return "";
        }
        var2.append(this.field6399[0]);
        for (int var3 = 1; var3 < this.field6399.length; var3++) {
            var2.append("...");
            var2.append(this.field6399[var3]);
        }
        return var2.toString();
    }
}
