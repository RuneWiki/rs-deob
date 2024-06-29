import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class326 extends class123 {

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Z")
    public boolean field5102 = true;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field5090 = 0;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lwf;")
    public static class64[] field5097 = new class64[14];

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "[J")
    public static long[] field5093 = new long[32];

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "F")
    public static float field5091;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
    public int[] field5087;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "[I")
    private int[] field5095;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "[I")
    public static int[] field5105;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[Ljava/lang/String;")
    private String[] field5101;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[[I")
    private int[][] field5086;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Laj;Z)V", line = 13)
    public final void method2289(class1 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field5094++;
        while (true) {
            int var3 = arg0.method15((byte) -50);
            if (var3 == 0) {
                return;
            }
            this.method2294(arg0, 60, var3);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 33)
    public final String method2290(boolean arg0) {
        field5104++;
        if (!arg0) {
            this.method2292(-38);
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5101 == null) {
            return "";
        }
        var2.append(this.field5101[0]);
        for (int var3 = 1; var3 < this.field5101.length; var3++) {
            var2.append("...");
            var2.append(this.field5101[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Laj;I)Ljava/lang/String;", line = 61)
    public final String method2291(class1 arg0, int arg1) {
        field5100++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5095 != null) {
            for (int var4 = 0; var4 < this.field5095.length; var4++) {
                var3.append(this.field5101[var4]);
                var3.append(class104.method844(this.field5086[var4], (byte) -121, this.field5095[var4], arg0.method22(arg1 ^ 0x1, class18.field348[this.field5095[var4]])));
            }
        }
        var3.append(this.field5101[this.field5101.length - arg1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I", line = 86)
    public final int method2292(int arg0) {
        field5088++;
        if (arg0 == 0) {
            return this.field5095 == null ? 0 : this.field5095.length;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I", line = 104)
    public final int method2293(int arg0, int arg1) {
        field5103++;
        if (this.field5095 == null || arg1 < 0 || arg1 > this.field5095.length) {
            return -1;
        } else {
            if (arg0 != 13986) {
                this.method2292(-32);
            }
            return this.field5095[arg1];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Laj;II)V", line = 129)
    private final void method2294(class1 arg0, int arg1, int arg2) {
        if (arg1 != 60) {
            this.field5101 = (String[]) null;
        }
        if (arg2 == 1) {
            this.field5101 = class183.method1334('<', arg0.method53(32), 0);
        } else if (arg2 == 2) {
            int var4 = arg0.method15((byte) 80);
            this.field5087 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5087[var5] = arg0.method56(19612);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method15((byte) 119);
            this.field5086 = new int[var6][];
            this.field5095 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method56(19612);
                this.field5095[var7] = var8;
                this.field5086[var7] = new int[class211.field3310[var8]];
                for (int var9 = 0; var9 < class211.field3310[var8]; var9++) {
                    this.field5086[var7][var9] = arg0.method56(19612);
                }
            }
        } else if (arg2 == 4) {
            this.field5102 = false;
        }
        field5089++;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 194)
    public static void method2295(byte arg0) {
        field5105 = null;
        field5097 = null;
        if (arg0 > -22) {
            field5093 = (long[]) null;
        }
        field5093 = null;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V", line = 206)
    public static final void method2296(byte arg0) {
        field5098++;
        class307.field4873.method2282((byte) -121);
        if (arg0 != -41) {
            field5105 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)I", line = 220)
    public final int method2297(int arg0, int arg1, byte arg2) {
        field5092++;
        if (this.field5095 == null || arg0 < 0 || arg0 > this.field5095.length) {
            return -1;
        } else {
            int var4 = 88 % ((arg2 - 32) / 59);
            return this.field5086[arg0] == null || arg1 < 0 || this.field5086[arg0].length < arg1 ? -1 : this.field5086[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([IZLaj;)V", line = 251)
    public final void method2298(int[] arg0, boolean arg1, class1 arg2) {
        field5099++;
        if (!arg1) {
            this.field5101 = (String[]) null;
        }
        if (this.field5095 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field5095.length && var4 < arg0.length; var4++) {
            int var5 = class314.field4958[this.method2293(13986, var4)];
            if (var5 > 0) {
                arg2.method40(var5, (byte) -61, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 285)
    public final void method2299(int arg0) {
        field5107++;
        if (this.field5087 != null) {
            for (int var2 = 0; var2 < this.field5087.length; var2++) {
                this.field5087[var2] = class251.method1740(this.field5087[var2], 32768);
            }
        }
        if (arg0 != 1) {
            field5097 = (class64[]) null;
        }
    }
}
