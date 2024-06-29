import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class509 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    private int field7277 = -1;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    private int field7286 = 0;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lbg;")
    private class464 field7282 = new class464();

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Z")
    public boolean field7292 = false;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    private int field7289;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[[[I")
    private int[][][] field7278;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[Lrga;")
    private class238[] field7290;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field7281 = 1;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7280 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Lg;")
    public static class153 field7293 = new class153(0, 1);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 5)
    public static void method3005(int arg0) {
        field7293 = null;
        field7280 = null;
        if (arg0 <= 52) {
            field7293 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLha;)V", line = 16)
    public static final void method3006(byte arg0, class58 arg1) {
        field7283++;
        if (!(class25.field341 >= 2 || class124.field1491) || class643.field8813 != null) {
            return;
        }
        String var2;
        if (class124.field1491 && class25.field341 < 2) {
            var2 = class291.field4101 + class71.field928.method588((byte) 112, class549.field7669) + class701.field9774 + " ->";
        } else if (class713.field9914 && class589.field8306.method1517(0, 81) && class25.field341 > 2) {
            var2 = class725.method4078(class231.field3108, -122);
        } else {
            class37 var3 = class231.field3108;
            if (var3 == null) {
                return;
            }
            var2 = class725.method4078(var3, -119);
            int[] var4 = null;
            if (class727.method4086(-46, var3.field463)) {
                var4 = class682.field9361.method3424((int) var3.field474, false).field7686;
            } else if (var3.field462 != -1) {
                var4 = class682.field9361.method3424(var3.field462, false).field7686;
            } else if (class71.method592(var3.field463, (byte) -94)) {
                class740 var5 = (class740) class373.field5230.method1180((byte) 26, (long) ((int) var3.field474));
                if (var5 != null) {
                    class468 var6 = var5.field10289;
                    class353 var7 = var6.field6632;
                    if (var7.field5026 != null) {
                        var7 = var7.method2273((byte) 29, class101.field1201);
                    }
                    if (var7 != null) {
                        var4 = var7.field5001;
                    }
                }
            } else if (class636.method3537(8071, var3.field463)) {
                Object var8 = null;
                class10 var9;
                if (var3.field463 == 1004) {
                    var9 = class612.field8588.method558((byte) 2, (int) var3.field474);
                } else {
                    var9 = class612.field8588.method558((byte) -22, (int) (var3.field474 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field226 != null) {
                    var9 = var9.method67(class101.field1201, 0);
                }
                if (var9 != null) {
                    var4 = var9.field219;
                }
            }
            if (var4 != null) {
                var2 = var2 + class473.method2831(var4, (byte) 101);
            }
        }
        if (class25.field341 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class25.field341 - 2) + class71.field921.method588((byte) 95, class549.field7669);
        }
        if (class481.field6799 != null) {
            class59 var11 = class481.field6799.method2942(arg1, 0);
            if (var11 == null) {
                var11 = class505.field7241;
            }
            var11.method505(class481.field6799.field7095, var2, class481.field6799.field7039, class481.field6799.field7031, class756.field10515, class623.field8673, class417.field5894, class481.field6799.field7092, class748.field10391, class481.field6799.field7062, class220.field2866, 0, class470.field6669, class759.field10549, class481.field6799.field7074);
            class721.method4050(class756.field10515[2], class756.field10515[3], -17012, class756.field10515[1], class756.field10515[0]);
        } else if (class515.field7339 != null && class633.field8733 == class556.field7800) {
            int var10 = class505.field7241.method502(class470.field6669, class220.field2866, class124.field1500 + 4, var2, class405.field5736 + 16, 0, 16777215, (byte) -28, class417.field5894, class748.field10391);
            class721.method4050(class119.field1441.method992(var2, (byte) -121) + var10, 16, -17012, class405.field5736, class124.field1500 + 4);
        }
        if (arg0 >= -87) {
            field7281 = 70;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Z", line = 130)
    public static final boolean method3007(int arg0) {
        field7284++;
        if (arg0 != -15377) {
            return true;
        }
        try {
            class97 var1 = new class97();
            byte[] var2 = var1.method712(class694.field9574, (byte) -73);
            class86.method649(var2, arg0 + 15486);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(III)V", line = 380)
    public class509(int arg0, int arg1, int arg2) {
        this.field7289 = arg1;
        this.field7288 = arg0;
        this.field7278 = new int[this.field7288][3][arg2];
        this.field7290 = new class238[this.field7289];
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)[[[I", line = 162)
    public final int[][][] method3008(int arg0) {
        if (arg0 != 1) {
            method3013(17, -35, 86);
        }
        field7275++;
        if (this.field7289 != this.field7288) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7288; var2++) {
            this.field7290[var2] = class397.field5600;
        }
        return this.field7278;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[[I", line = 185)
    public final int[][] method3009(int arg0, int arg1) {
        field7291++;
        if (arg0 != 0) {
            this.field7282 = null;
        }
        if (this.field7289 == this.field7288) {
            this.field7292 = this.field7290[arg1] == null;
            this.field7290[arg1] = class397.field5600;
            return this.field7278[arg1];
        } else if (this.field7288 == 1) {
            this.field7292 = this.field7277 != arg1;
            this.field7277 = arg1;
            return this.field7278[0];
        } else {
            class238 var3 = this.field7290[arg1];
            if (var3 == null) {
                this.field7292 = true;
                if (this.field7286 < this.field7288) {
                    var3 = new class238(arg1, this.field7286);
                    this.field7286++;
                } else {
                    class238 var4 = (class238) this.field7282.method2763(110);
                    var3 = new class238(arg1, var4.field3183);
                    this.field7290[var4.field3184] = null;
                    var4.method1185(-92);
                }
                this.field7290[arg1] = var3;
            } else {
                this.field7292 = false;
            }
            this.field7282.method2769(var3, -39);
            return this.field7278[var3.field3183];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/lang/String;IZ[SI)V", line = 254)
    public static final void method3010(String[] arg0, int arg1, boolean arg2, short[] arg3, int arg4) {
        if (!arg2) {
            return;
        }
        field7285++;
        if (arg1 <= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg4;
        String var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg4; var9 < arg1; var9++) {
            if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var8;
        method3010(arg0, var6 - 1, true, arg3, arg4);
        method3010(arg0, arg1, true, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lem;B)Lem;", line = 310)
    public static final class223 method3011(class223 arg0, byte arg1) {
        field7276++;
        class223 var2 = arg0 == null ? new class223() : new class223(arg0);
        var2.method1366(arg1 ^ 0xFFFFFFF6, 128, 9);
        if (arg1 != 9) {
            field7280 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 324)
    public final void method3012(int arg0) {
        field7279++;
        for (int var2 = 0; var2 < this.field7288; var2++) {
            this.field7278[var2][0] = null;
            this.field7278[var2][1] = null;
            this.field7278[var2][2] = null;
            this.field7278[var2] = null;
        }
        this.field7290 = null;
        this.field7278 = null;
        if (arg0 == -12665) {
            this.field7282.method2767((byte) -19);
            this.field7282 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V", line = 355)
    public static final void method3013(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        if (var3 != null) {
            class461.method2739(var3.field2266);
            if (var3.field2266 != null) {
                var3.field2266 = null;
            }
        }
    }
}
