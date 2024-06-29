import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 extends class295 {

    @OriginalMember(owner = "client!is", name = "F", descriptor = "Z")
    public static boolean field590 = false;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!is", name = "V", descriptor = "I")
    public static int field605 = -1;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!is", name = "U", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "Lk;")
    public static class293 field592;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "Ljava/lang/String;")
    public String field599;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "[C")
    public char[] field593;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "[C")
    public char[] field597;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "[I")
    public int[] field589;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "[I")
    public int[] field594;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "[[[I")
    public static int[][][] field602;

    @OriginalMember(owner = "client!is", name = "S", descriptor = "[[[I")
    public static int[][][] field603;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        field586++;
        if (arg0 < 12) {
            this.method384(-12, (class289) null, (byte) -117);
        }
        if (this.field594 != null) {
            for (int var2 = 0; var2 < this.field594.length; var2++) {
                this.field594[var2] = class260.method1678(this.field594[var2], 32768);
            }
        }
        if (this.field589 != null) {
            for (int var3 = 0; var3 < this.field589.length; var3++) {
                this.field589[var3] = class260.method1678(this.field589[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZC)I")
    public final int method381(boolean arg0, char arg1) {
        field587++;
        if (this.field589 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field589.length; var3++) {
            if (this.field593[var3] == arg1) {
                return this.field589[var3];
            }
        }
        return arg0 ? -33 : -1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZLap;)V")
    public final void method382(boolean arg0, class289 arg1) {
        field588++;
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                if (arg0) {
                    this.field589 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method384(var3, arg1, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(CI)I")
    public final int method383(char arg0, int arg1) {
        field598++;
        if (this.field594 == null) {
            return -1;
        } else if (arg1 == -1) {
            for (int var3 = 0; var3 < this.field594.length; var3++) {
                if (this.field597[var3] == arg0) {
                    return this.field594[var3];
                }
            }
            return -1;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILap;B)V")
    private final void method384(int arg0, class289 arg1, byte arg2) {
        field604++;
        if (arg0 == 1) {
            this.field599 = arg1.method1871(-1);
        } else if (arg0 == 2) {
            int var7 = arg1.method1861((byte) -72);
            this.field593 = new char[var7];
            this.field589 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field589[var8] = arg1.method1853(120);
                byte var9 = arg1.method1868((byte) -124);
                this.field593[var8] = var9 == 0 ? 0 : class393.method2421(var9, 20483);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1861((byte) -72);
            this.field597 = new char[var4];
            this.field594 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field594[var5] = arg1.method1853(class331.method2109(arg2, 47));
                byte var6 = arg1.method1868((byte) -127);
                this.field597[var5] = var6 == 0 ? 0 : class393.method2421(var6, 20483);
            }
        }
        if (arg2 != -9) {
            method386(31);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method385(int arg0, String arg1) {
        field600++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class239.method1590(arg1.charAt(var2), (byte) 110)) {
            var2++;
        }
        while (var2 < var3 && class239.method1590(arg1.charAt(var3 - 1), (byte) 125)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class340.method2156(var7, -1)) {
                char var8 = class162.method1212(var7, (byte) -81);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (~var5.length() == arg0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
    public static void method386(int arg0) {
        int var1 = 62 / ((arg0 + 86) / 38);
        field602 = null;
        field603 = null;
        field592 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
    public static final void method387(byte arg0, int arg1, int arg2) {
        field601++;
        class450 var3 = class59.method540(14, arg1, 1000);
        int var4 = -43 % ((-arg0 - 47) / 36);
        var3.method2800(256);
        var3.field6498 = arg2;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lrk;I)V")
    public static final void method388(class427 arg0, int arg1) {
        if (arg1 != 0) {
            method388((class427) null, 59);
        }
        field596++;
        class235.field3252 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
    public static final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field591++;
        int var7 = arg2 - arg0;
        int var8 = arg0 + arg1;
        for (int var9 = arg1; var9 < var8; var9++) {
            class396.method2436(-1070, arg5, arg4, class186.field2697[var9], arg6);
        }
        int var10 = arg4 + arg0;
        int var11 = arg2;
        if (arg3 > -124) {
            return;
        }
        while (var11 > var7) {
            class396.method2436(-1070, arg5, arg4, class186.field2697[var11], arg6);
            var11--;
        }
        int var12 = arg6 - arg0;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class186.field2697[var13];
            class396.method2436(-1070, arg5, arg4, var14, var10);
            class396.method2436(-1070, arg5, var12, var14, arg6);
        }
    }
}
