import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class23 {

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Z")
    private boolean field319;

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Z")
    private boolean field316;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Ln;")
    public static class26 field324 = class9.method82(255, "Bank");

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Ln;")
    public static class26 field326 = class9.method82(255, "50(U");

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "Ln;")
    public static class26 field330 = class9.method82(255, "b12_full");

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "Ln;")
    public static class26 field328 = class9.method82(255, "overlay)3dat");

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "mapview!la", name = "v", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "Loa;")
    private class29 field332;

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "[B")
    public static byte[] field313;

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "[I")
    private int[] field318;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "[I")
    private int[] field322;

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "[I")
    public int[] field325;

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "[I")
    private int[] field327;

    @OriginalMember(owner = "mapview!la", name = "w", descriptor = "[I")
    private int[] field334;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "[Loa;")
    private class29[] field315;

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "[Ld;")
    public static class7[] field321;

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "[[B")
    public byte[][] field317;

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "[[I")
    private int[][] field329;

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "[[I")
    private int[][] field331;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "[[[B")
    private byte[][][] field312;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(BI)V", line = 5)
    private final void method158(byte arg0, int arg1) {
        if (arg0 >= -73) {
            field330 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(BLn;)I", line = 19)
    public final int method159(byte arg0, class26 arg1) {
        int var3 = 78 % ((arg0 + 14) / 53);
        class26 var4 = arg1.method192(-34);
        return this.field332.method207(var4.method195((byte) 93), 28425);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILn;I)I", line = 32)
    public final int method160(int arg0, class26 arg1, int arg2) {
        if (arg2 == -12935) {
            class26 var4 = arg1.method192(-34);
            return this.field315[arg0].method207(var4.method195((byte) 69), 28425);
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II[B)I", line = 61)
    private static final int method161(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 0) {
            method162(106);
        }
        return class18.method139(arg2, arg0, false, 0);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 71)
    public static void method162(int arg0) {
        field330 = null;
        field326 = null;
        field313 = null;
        field321 = null;
        if (arg0 != 2) {
            method169((byte) 64);
        }
        field328 = null;
        field324 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 105)
    public static final void method163(Component arg0, byte arg1) {
        Method var2 = class2.field87;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class35.field419);
        arg0.addFocusListener(class35.field419);
        if (arg1 != -94) {
            method169((byte) 55);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([BZ)V", line = 126)
    public final void method164(byte[] arg0, boolean arg1) {
        this.field314 = method161(arg0.length, 0, arg0);
        class17 var3 = new class17(class1.method24((byte) -106, arg0));
        int var4 = var3.method130(arg1);
        if (var4 != 5) {
            return;
        }
        int var5 = var3.method130(false);
        int var6 = 0;
        this.field333 = var3.method134((byte) 60);
        int var7 = -1;
        this.field325 = new int[this.field333];
        for (int var8 = 0; var8 < this.field333; var8++) {
            this.field325[var8] = var6 += var3.method134((byte) 124);
            if (var7 < this.field325[var8]) {
                var7 = this.field325[var8];
            }
        }
        this.field318 = new int[var7 + 1];
        this.field329 = new int[var7 + 1][];
        this.field322 = new int[var7 + 1];
        this.field312 = new byte[var7 + 1][][];
        this.field334 = new int[var7 + 1];
        this.field317 = new byte[var7 + 1][];
        if (var5 != 0) {
            this.field327 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field333; var9++) {
                this.field327[this.field325[var9]] = var3.method127(255);
            }
            this.field332 = new class29(this.field327);
        }
        for (int var10 = 0; var10 < this.field333; var10++) {
            this.field318[this.field325[var10]] = var3.method127(255);
        }
        for (int var11 = 0; var11 < this.field333; var11++) {
            this.field334[this.field325[var11]] = var3.method127(255);
        }
        for (int var12 = 0; var12 < this.field333; var12++) {
            this.field322[this.field325[var12]] = var3.method134((byte) 40);
        }
        for (int var13 = 0; var13 < this.field333; var13++) {
            int var14 = 0;
            int var15 = this.field325[var13];
            int var16 = this.field322[var15];
            this.field329[var15] = new int[var16];
            int var17 = -1;
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field329[var15][var18] = var14 += var3.method134((byte) 80);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field312[var15] = new byte[var17 + 1][];
        }
        if (var5 == 0) {
            return;
        }
        this.field315 = new class29[var7 + 1];
        this.field331 = new int[var7 + 1][];
        for (int var20 = 0; var20 < this.field333; var20++) {
            int var21 = this.field325[var20];
            int var22 = this.field322[var21];
            this.field331[var21] = new int[this.field312[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field331[var21][this.field329[var21][var23]] = var3.method127(255);
            }
            this.field315[var21] = new class29(this.field331[var21]);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(III)[B", line = 264)
    public final byte[] method165(int arg0, int arg1, int arg2) {
        return arg0 >= -47 ? (byte[]) null : this.method166(125, null, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I[III)[B", line = 278)
    private final byte[] method166(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 < 0 || arg3 >= this.field312.length || this.field312[arg3] == null || arg2 < 0 || this.field312[arg3].length <= arg2) {
            return null;
        }
        if (this.field312[arg3][arg2] == null) {
            boolean var5 = this.method168(arg3, (byte) 127, arg1);
            if (!var5) {
                this.method158((byte) -102, arg3);
                boolean var6 = this.method168(arg3, (byte) 15, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg0 <= 121) {
            this.field315 = null;
        }
        byte[] var7 = this.field312[arg3][arg2];
        if (this.field316) {
            this.field312[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ln;Ln;I)[B", line = 316)
    public final byte[] method167(class26 arg0, class26 arg1, int arg2) {
        class26 var4 = arg1.method192(-34);
        class26 var5 = arg0.method192(-34);
        int var6 = this.field332.method207(var4.method195((byte) 85), 28425);
        if (arg2 >= -123) {
            this.field312 = null;
        }
        int var7 = this.field315[var6].method207(var5.method195((byte) 96), 28425);
        return this.method165(-84, var7, var6);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IB[I)Z", line = 332)
    private final boolean method168(int arg0, byte arg1, int[] arg2) {
        if (this.field317[arg0] == null) {
            return false;
        }
        int var4 = -27 % ((-arg1 - 66) / 57);
        int var5 = this.field322[arg0];
        int[] var6 = this.field329[arg0];
        boolean var7 = true;
        byte[][] var8 = this.field312[arg0];
        for (int var9 = 0; var9 < var5; var9++) {
            if (var8[var6[var9]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var10;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var10 = this.field317[arg0];
        } else {
            var10 = new byte[this.field317[arg0].length];
            class37.method243(this.field317[arg0], 0, var10, 0, var10.length);
            class17 var11 = new class17(var10);
            var11.method120((byte) 121, 5, arg2, var11.field252.length);
        }
        byte[] var12;
        try {
            var12 = class1.method24((byte) -43, var10);
        } catch (RuntimeException var27) {
            throw class1.method29(var27, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + method161(var10.length, 0, var10) + "," + method161(var10.length - 2, 0, var10) + "," + this.field318[arg0] + "," + this.field314);
        }
        if (this.field319) {
            this.field317[arg0] = null;
        }
        if (var5 > 1) {
            int var14 = var12.length;
            int[] var15 = new int[var5];
            int var28 = var14 - 1;
            int var16 = var12[var28] & 0xFF;
            int var17 = var28 - var5 * 4 * var16;
            class17 var18 = new class17(var12);
            var18.field251 = var17;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var5; var21++) {
                    var20 += var18.method127(255);
                    var15[var21] += var20;
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (var8[var6[var22]] == null) {
                    var8[var6[var22]] = new byte[var15[var22]];
                }
                var15[var22] = 0;
            }
            int var23 = 0;
            var18.field251 = var17;
            for (int var24 = 0; var24 < var16; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var5; var26++) {
                    var25 += var18.method127(255);
                    class37.method243(var12, var23, var8[var6[var26]], var15[var26], var25);
                    var15[var26] += var25;
                    var23 += var25;
                }
            }
        } else {
            var8[var6[0]] = var12;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)B", line = 489)
    public static final byte method169(byte arg0) {
        int var1 = 3 % ((arg0 + 24) / 52);
        return class11.field202 == null ? 0 : class11.field202[class18.field262];
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "(ZZ)V", line = 500)
    public class23(boolean arg0, boolean arg1) {
        this.field319 = arg0;
        this.field316 = arg1;
    }
}
