import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class2 {

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Z")
    public boolean field13 = true;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    private int field30 = -1;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "Ltt;")
    private class249 field22;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "Lhm;")
    private class383 field24;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "Lcd;")
    private class65 field33;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "Lfp;")
    private class440 field20;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Las;")
    private class18 field12;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "Z")
    public static boolean field17 = false;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "[[B")
    public static byte[][] field14 = new byte[50][];

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "[Lkw;")
    public static class138[] field23;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public final void method5(byte arg0) {
        field25++;
        if (arg0 < 51) {
            method6(true);
        }
        this.method8((byte) -83, this.field20, this.field21);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static final void method6(boolean arg0) {
        if (arg0) {
            class348.field5192 = class360.field5317;
            class407.field6024 = class288.field4475;
        } else {
            class348.field5192 = class470.field6902;
            class407.field6024 = class274.field4306;
        }
        class183.field2802 = class348.field5192.length;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[BI)V")
    public final void method7(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 0) {
            this.field13 = false;
        }
        field26++;
        this.field12.method114(arg2, 110, arg3, this.field22.method1786(arg3, 23697) * arg0);
        this.method8((byte) -106, this.field12, arg0);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLfp;I)V")
    private final void method8(byte arg0, class440 arg1, int arg2) {
        field29++;
        if (arg0 > -52) {
            field17 = true;
        }
        if (arg2 != 0) {
            this.method9(0);
            this.field22.method1749(25752, this.field33);
            this.field22.method1762(0, arg1, (byte) 126, 4, arg2);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    private final void method9(int arg0) {
        field32++;
        if (!this.field13) {
            return;
        }
        this.field13 = false;
        byte[] var2 = this.field24.field5630;
        byte[] var3 = this.field22.field4071;
        int var4 = arg0;
        int var5 = this.field24.field5637;
        int var6 = this.field24.field5637 * this.field27 + this.field18;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field33 != null && this.field30 == var4) {
            this.field13 = false;
            return;
        }
        this.field30 = var4;
        int var8 = this.field27 * var5 + this.field18;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field24.field5637 - 128;
        }
        if (this.field33 == null) {
            this.field33 = new class65(this.field22, 3553, 6406, 128, 128, false, this.field22.field4071, 6406, false);
            this.field33.method437(false, (byte) -124, false);
            this.field33.method1210((byte) -81, true);
        } else {
            this.field33.method442(0, 0, 128, 0, 0, this.field22.field4071, 6406, 128, false, 3314);
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public static void method10(byte arg0) {
        field14 = null;
        field23 = null;
        if (arg0 != 60) {
            method10((byte) -76);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII[BI)Z")
    public static final boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field31++;
        int var7 = arg1 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg6 + arg4 - 1) / arg6);
        int var10 = -((arg1 + arg6 - 1) / arg6);
        if (arg3 != 0) {
            field16 = -109;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg2] == 0) {
                    return true;
                }
                arg2 += arg6;
            }
            int var13 = arg2 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
    public static final boolean method12(int arg0, int arg1, int arg2) {
        if (arg1 != 7963) {
            field17 = true;
        }
        field15++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ltt;Lhm;Ljk;IIIII)V")
    public class2(class249 arg0, class383 arg1, class134 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field22 = arg0;
        this.field27 = arg7;
        this.field24 = arg1;
        this.field18 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field124 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field1971[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field21 = var10;
        if (var10 <= 0) {
            this.field33 = null;
        } else {
            class194 var14 = new class194(var10 * 2);
            if (this.field22.field3990) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field124 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field1971[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1364(var18[var19] & 0xFFFF, true);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field124 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field1971[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1366(true, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field20 = this.field22.method1761(var14.field2982, false, 5123, (byte) -105, var14.field2973);
            this.field12 = new class18(this.field22, 5123, null, 1);
        }
    }
}
