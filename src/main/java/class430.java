import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class430 extends class416 {

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Z")
    public boolean field5936 = true;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field5934 = -1;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field5922 = 1;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Lji;")
    public class610 field5933;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Z")
    public static boolean field5926;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "[I")
    public int[] field5924;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[I")
    private int[] field5927;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field5920;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "[[I")
    private int[][] field5931;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lee;B)Ljava/lang/String;")
    public final String method2477(class677 arg0, byte arg1) {
        field5923++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5927 != null) {
            for (int var4 = 0; var4 < this.field5927.length; var4++) {
                var3.append(this.field5920[var4]);
                var3.append(this.field5933.method3325(this.method2483(false, var4), arg0.method3775(class302.method1848(-99, this.field5927[var4]).field3826, 255), (byte) -122, this.field5931[var4]));
            }
        }
        var3.append(this.field5920[this.field5920.length - 1]);
        return arg1 < 72 ? null : var3.toString();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public final void method2478(byte arg0) {
        field5925++;
        int var2 = -20 / ((56 - arg0) / 51);
        if (this.field5924 != null) {
            for (int var3 = 0; var3 < this.field5924.length; var3++) {
                this.field5924[var3] = class446.method2556(this.field5924[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lee;B)V")
    public final void method2479(class677 arg0, byte arg1) {
        if (arg1 < 77) {
            return;
        }
        while (true) {
            int var3 = arg0.method3821((byte) 87);
            if (var3 == 0) {
                field5919++;
                return;
            }
            this.method2482(arg0, var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lee;B[I)V")
    public final void method2480(class677 arg0, byte arg1, int[] arg2) {
        field5930++;
        if (this.field5927 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field5927.length && arg2.length > var4; var4++) {
            int var5 = this.method2483(false, var4).field3829;
            if (var5 > 0) {
                arg0.method3774((long) arg2[var4], var5, -81);
            }
        }
        if (arg1 != 77) {
            this.field5933 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)I")
    public final int method2481(int arg0, int arg1, byte arg2) {
        field5935++;
        if (this.field5927 == null || arg0 < 0 || this.field5927.length < arg0) {
            return -1;
        } else if (this.field5931[arg0] == null || arg1 < 0 || arg1 > this.field5931[arg0].length) {
            return -1;
        } else {
            if (arg2 != -107) {
                field5934 = 100;
            }
            return this.field5931[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lee;IB)V")
    private final void method2482(class677 arg0, int arg1, byte arg2) {
        if (arg2 >= -118) {
            field5926 = false;
        }
        if (arg1 == 1) {
            this.field5920 = class323.method1958(-105, arg0.method3793(15598), '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method3821((byte) -104);
            this.field5924 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5924[var5] = arg0.method3807(-1);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method3821((byte) -95);
            this.field5931 = new int[var6][];
            this.field5927 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method3807(-1);
                class275 var9 = class302.method1848(-117, var8);
                if (var9 != null) {
                    this.field5927[var7] = var8;
                    this.field5931[var7] = new int[var9.field3830];
                    for (int var10 = 0; var10 < var9.field3830; var10++) {
                        this.field5931[var7][var10] = arg0.method3807(-1);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field5936 = false;
        }
        field5921++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)Lkg;")
    public final class275 method2483(boolean arg0, int arg1) {
        if (arg0) {
            this.method2480(null, (byte) -51, null);
        }
        field5928++;
        return this.field5927 == null || arg1 < 0 || this.field5927.length < arg1 ? null : class302.method1848(-118, this.field5927[arg1]);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method2484(int arg0) {
        field5929++;
        if (this.field5927 == null) {
            return 0;
        } else if (arg0 == -1) {
            return this.field5927.length;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)Ljava/lang/String;")
    public final String method2485(boolean arg0) {
        field5932++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5920 == null) {
            return "";
        }
        var2.append(this.field5920[0]);
        if (arg0) {
            this.field5933 = null;
        }
        for (int var3 = 1; var3 < this.field5920.length; var3++) {
            var2.append("...");
            var2.append(this.field5920[var3]);
        }
        return var2.toString();
    }
}
