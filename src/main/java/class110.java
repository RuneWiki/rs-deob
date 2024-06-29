import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 extends class183 {

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Ljf;")
    public static class229 field1944 = class212.method1457((byte) 70, "<col=ff9040>");

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "[I")
    public static int[] field1943;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "[Laf;")
    private class180[] field1942;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)[I", line = 8)
    public final int[] method10(int arg0, int arg1) {
        field1933++;
        if (arg1 != -1) {
            method783((byte) 101);
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            this.method784(this.field3161.method666(arg1 + 23124), 119);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JB)V", line = 38)
    public static final void method780(long arg0, byte arg1) {
        class84.field1608.field195 = 0;
        class84.field1608.method140(230, (byte) 75);
        field1936++;
        class84.field1608.method118(arg0, (byte) -126);
        class161.field2732 = 0;
        class16.field242 = 0;
        class252.field4409 = 1;
        class169.field2893 = -3;
        if (arg1 != -31) {
            field1943 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)Z", line = 55)
    public static final boolean method781(byte arg0) {
        field1939++;
        if (class108.field1900) {
            return true;
        } else if (arg0 <= 125) {
            return false;
        } else {
            return class130.field2307;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 84)
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V", line = 88)
    public static final void method782(boolean arg0, int arg1) {
        field1935++;
        byte[][] var2;
        if (class108.field1900 && arg0) {
            var2 = class203.field3553;
        } else {
            var2 = class270.field4638;
        }
        int var3 = class117.field2089.length;
        int var4 = 0;
        if (arg1 != 255) {
            field1943 = (int[]) null;
        }
        while (var4 < var3) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class29.field511[var4] & 0xFF) * 64 - class213.field3649;
                int var7 = (class29.field511[var4] >> 8) * 64 - class258.field4503;
                class18.method179((byte) 101);
                class311.method2107(var7, -1, var5, arg0, class80.field1460, var6);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[[I", line = 128)
    public final int[][] method12(int arg0, int arg1) {
        field1938++;
        int var3 = -44 % ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int var5 = class22.field393;
            int var6 = class144.field2508;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field3160.method1055(0);
            this.method784(var7, 121);
            for (int var9 = 0; var9 < class144.field2508; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class22.field393; var15++) {
                    int var16 = var10[var15];
                    var14[var15] = class305.method2086(255, var16) << 4;
                    var13[var15] = class305.method2086(4080, var16 >> 4);
                    var12[var15] = class305.method2086(var16, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(B)V", line = 190)
    public static void method783(byte arg0) {
        field1944 = null;
        if (arg0 <= -25) {
            field1943 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([[II)V", line = 203)
    private final void method784(int[][] arg0, int arg1) {
        int var3 = class22.field393;
        field1941++;
        int var4 = class144.field2508;
        class104.method700((byte) -38, arg0);
        if (arg1 < 113) {
            method781((byte) 56);
        }
        class314.method2134(0, -1, class252.field4405, class52.field913, 0);
        if (this.field1942 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1942.length; var5++) {
            class180 var6 = this.field1942[var5];
            int var7 = var6.field3122;
            int var8 = var6.field3121;
            if (var8 >= 0) {
                if (var7 >= 0) {
                    var6.method787(-81, var3, var4);
                } else {
                    var6.method786(var4, 84, var3);
                }
            } else if (var7 >= 0) {
                var6.method789(-1, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILkh;I)V", line = 253)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field1937++;
        if (arg0 > -43) {
            method780(112L, (byte) -12);
        }
        if (arg2 == 0) {
            this.field1942 = new class180[arg1.method93(false)];
            for (int var4 = 0; var4 < this.field1942.length; var4++) {
                int var5 = arg1.method93(false);
                if (var5 == 0) {
                    this.field1942[var4] = class257.method1836(arg1, (byte) -38);
                } else if (var5 == 1) {
                    this.field1942[var4] = class109.method776((byte) -25, arg1);
                } else if (var5 == 2) {
                    this.field1942[var4] = class236.method1684(arg1, 2);
                } else if (var5 == 3) {
                    this.field1942[var4] = class80.method568(arg1, (byte) -128);
                }
            }
        } else if (arg2 == 1) {
            this.field3166 = arg1.method93(false) == 1;
        }
    }
}
