import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class444 extends class261 {

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field6602;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    public int[] field6598;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[Z")
    public boolean[] field6601;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
    public int[] field6603;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[[I")
    public int[][] field6599;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lbc;")
    public static class248 field6606;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lph;")
    public static class459 field6595;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;[BII)I", line = 5)
    public static final int method2655(String arg0, byte[] arg1, int arg2, int arg3) {
        field6600++;
        int var4 = arg0.length();
        int var5 = arg3;
        for (int var6 = arg2; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class418.method2558(192, var7 >> 6);
                arg1[var5++] = (byte) class418.method2558(128, class490.method2960(63, var7));
            } else {
                arg1[var5++] = (byte) class418.method2558(224, var7 >> 12);
                arg1[var5++] = (byte) class418.method2558(128, class490.method2960(4036, var7) >> 6);
                arg1[var5++] = (byte) class418.method2558(class490.method2960(var7, 63), 128);
            }
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 46)
    public static void method2656(int arg0) {
        field6606 = null;
        if (arg0 != 29186) {
            field6595 = null;
        }
        field6595 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZILza;III)V", line = 65)
    public static final void method2657(boolean arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5) {
        arg2.method371(arg5, arg3, arg1 + arg5, arg3 - -arg4);
        field6596++;
        arg2.method1809(arg3, arg5, -16777216, arg4, arg1, -7456);
        if (class35.field537 < 100) {
            return;
        }
        float var6 = (float) class319.field4865 / (float) class319.field4880;
        int var7 = arg1;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg1 - var7) / 2 + arg5;
        int var10 = (arg4 - var8) / 2 + arg3;
        if (class416.field6277 == null || arg1 != class416.field6277.method157() || arg4 != class416.field6277.method154()) {
            class319.method2049(class319.field4876, class319.field4869 + class319.field4865, class319.field4880 + class319.field4876, class319.field4869, var9, var10, var7 + var9, var10 - -var8);
            class319.method2042(arg2);
            class416.field6277 = arg2.method332(var9, var10, var7, var8, false);
        }
        class416.field6277.method159(var9, var10);
        int var11 = class528.field7697 * var7 / class319.field4880;
        int var12 = class366.field5382 * var8 / class319.field4865;
        if (!arg0) {
            return;
        }
        int var13 = class526.field7637 * var7 / class319.field4880 + var9;
        int var14 = var10 + var8 - (class62.field1267 * var8 / class319.field4865) - var12;
        int var15 = -1996554240;
        if (class424.field6366 == class209.field3343) {
            var15 = -1996488705;
        }
        arg2.method327(var13, var14, var11, var12, var15, 1);
        arg2.method365(var13, var14, var11, var12, var15, 0);
        if (class420.field6337 <= 0) {
            return;
        }
        int var16;
        if (class25.field383 <= 50) {
            var16 = class25.field383 * 5;
        } else {
            var16 = 500 - (class25.field383 * 5);
        }
        for (class97 var17 = (class97) class319.field4858.method1892(110); var17 != null; var17 = (class97) class319.field4858.method1893((byte) -2)) {
            class25 var18 = class319.field4842.method1247(false, var17.field1890);
            if (class59.method528(var18, (byte) -105)) {
                if (class263.field4026 == var17.field1890) {
                    int var21 = var17.field1897 * var7 / class319.field4880 + var9;
                    int var22 = (class319.field4865 - var17.field1893) * var8 / class319.field4865 + var10;
                    arg2.method1809(var22 - 2, var21 + -2, var16 << 24 | 0xFFFF00, 4, 4, -7456);
                } else if (class310.field4697 != -1 && class310.field4697 == var18.field359) {
                    int var19 = var17.field1897 * var7 / class319.field4880 + var9;
                    int var20 = (class319.field4865 - var17.field1893) * var8 / class319.field4865 + var10;
                    arg2.method1809(var20 - 2, var19 + -2, var16 << 24 | 0xFFFF00, 4, 4, -7456);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)Ljava/lang/String;", line = 164)
    public static final String method2658(int[] arg0, int arg1) {
        field6597++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class21.field320;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class441 var5 = class523.field7610.method1555((byte) -86, arg0[var4]);
            if (var5.field6532 != -1) {
                class24 var6 = (class24) class486.field7162.method2478(1, (long) var5.field6532);
                if (var6 == null) {
                    class340 var7 = class340.method2139(class455.field6758, var5.field6532, 0);
                    if (var7 != null) {
                        var6 = class262.field4006.method374(var7, true);
                        class486.field7162.method2472(127, var6, (long) var5.field6532);
                    }
                }
                if (var6 != null) {
                    class365.field5333[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg1 >= -6) {
            field6595 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[B)V", line = 216)
    public class444(int arg0, byte[] arg1) {
        this.field6605 = arg0;
        class289 var3 = new class289(arg1);
        this.field6602 = var3.method1858(-3256);
        this.field6598 = new int[this.field6602];
        this.field6601 = new boolean[this.field6602];
        this.field6603 = new int[this.field6602];
        this.field6599 = new int[this.field6602][];
        for (int var4 = 0; var4 < this.field6602; var4++) {
            this.field6598[var4] = var3.method1858(-3256);
        }
        for (int var5 = 0; var5 < this.field6602; var5++) {
            this.field6601[var5] = var3.method1858(-3256) == 1;
        }
        for (int var6 = 0; var6 < this.field6602; var6++) {
            this.field6603[var6] = var3.method1841((byte) 11);
        }
        for (int var7 = 0; var7 < this.field6602; var7++) {
            this.field6599[var7] = new int[var3.method1858(-3256)];
        }
        for (int var8 = 0; var8 < this.field6602; var8++) {
            for (int var9 = 0; var9 < this.field6599[var8].length; var9++) {
                this.field6599[var8][var9] = var3.method1858(-3256);
            }
        }
    }
}
