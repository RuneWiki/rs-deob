import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public abstract class class25 {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Z")
    private boolean field303;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Z")
    private boolean field304;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Lk;")
    public static class21 field306 = class14.method92((byte) 57, "Farming patch");

    @OriginalMember(owner = "mapview!m", name = "o", descriptor = "Lk;")
    public static class21 field314 = class14.method92((byte) 57, "Staff Shop");

    @OriginalMember(owner = "mapview!m", name = "s", descriptor = "[I")
    public static int[] field318 = new int[128];

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "Z")
    public static boolean field311 = false;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "Lk;")
    public static class21 field310 = class14.method92((byte) 57, "POH Portal");

    @OriginalMember(owner = "mapview!m", name = "p", descriptor = "Lk;")
    public static class21 field315 = class14.method92((byte) 57, "Kebab Seller");

    @OriginalMember(owner = "mapview!m", name = "t", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "mapview!m", name = "q", descriptor = "Lk;")
    public static class21 field316 = class14.method92((byte) 57, "b12_full");

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lk;")
    public static class21 field302 = class14.method92((byte) 57, "Stonemason");

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Lb;")
    private class3 field305;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "[I")
    public int[] field307;

    @OriginalMember(owner = "mapview!m", name = "n", descriptor = "[I")
    private int[] field313;

    @OriginalMember(owner = "mapview!m", name = "u", descriptor = "[I")
    private int[] field320;

    @OriginalMember(owner = "mapview!m", name = "v", descriptor = "[I")
    private int[] field321;

    @OriginalMember(owner = "mapview!m", name = "w", descriptor = "[I")
    private int[] field322;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[Lb;")
    private class3[] field301;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "[[B")
    public byte[][] field308;

    @OriginalMember(owner = "mapview!m", name = "m", descriptor = "[[I")
    private int[][] field312;

    @OriginalMember(owner = "mapview!m", name = "r", descriptor = "[[I")
    private int[][] field317;

    @OriginalMember(owner = "mapview!m", name = "x", descriptor = "[[[B")
    private byte[][][] field323;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I[B)V", line = 12)
    public final void method160(int arg0, byte[] arg1) {
        this.field300 = class10.method64(arg1.length, arg1, (byte) 61);
        class11 var3 = new class11(method165(-63, arg1));
        int var4 = var3.method73((byte) -97);
        if (var4 != 5) {
            return;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method73((byte) -97);
        this.field309 = var3.method70(27779);
        this.field307 = new int[this.field309];
        for (int var8 = 0; var8 < this.field309; var8++) {
            this.field307[var8] = var5 += var3.method70(mapview.method16(arg0, 26663));
            if (this.field307[var8] > var6) {
                var6 = this.field307[var8];
            }
        }
        this.field312 = new int[var6 + 1][];
        this.field308 = new byte[var6 + 1][];
        this.field323 = new byte[var6 + 1][][];
        if (arg0 != 1188) {
            this.method170((byte) 123, -118, null);
        }
        this.field322 = new int[var6 + 1];
        this.field321 = new int[var6 + 1];
        this.field313 = new int[var6 + 1];
        if (var7 != 0) {
            this.field320 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field309; var9++) {
                this.field320[this.field307[var9]] = var3.method81(-119);
            }
            this.field305 = new class3(this.field320);
        }
        for (int var10 = 0; var10 < this.field309; var10++) {
            this.field321[this.field307[var10]] = var3.method81(-110);
        }
        for (int var11 = 0; var11 < this.field309; var11++) {
            this.field322[this.field307[var11]] = var3.method81(-109);
        }
        for (int var12 = 0; var12 < this.field309; var12++) {
            this.field313[this.field307[var12]] = var3.method70(27779);
        }
        for (int var13 = 0; var13 < this.field309; var13++) {
            int var14 = this.field307[var13];
            int var15 = 0;
            int var16 = this.field313[var14];
            int var17 = -1;
            this.field312[var14] = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                int var19 = this.field312[var14][var18] = var15 += var3.method70(27779);
                if (var19 > var17) {
                    var17 = var19;
                }
            }
            this.field323[var14] = new byte[var17 + 1][];
        }
        if (var7 == 0) {
            return;
        }
        this.field317 = new int[var6 + 1][];
        this.field301 = new class3[var6 + 1];
        for (int var20 = 0; var20 < this.field309; var20++) {
            int var21 = this.field307[var20];
            int var22 = this.field313[var21];
            this.field317[var21] = new int[this.field323[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field317[var21][this.field312[var21][var23]] = var3.method81(-127);
            }
            this.field301[var21] = new class3(this.field317[var21]);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 159)
    public static void method161(int arg0) {
        field318 = null;
        field302 = null;
        field310 = null;
        field316 = null;
        field315 = null;
        if (arg0 != 27270) {
            field306 = null;
        }
        field306 = null;
        field314 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IZI)[B", line = 185)
    public final byte[] method162(int arg0, boolean arg1, int arg2) {
        return arg1 ? (byte[]) null : this.method164(null, arg2, 0, arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lk;I)I", line = 199)
    public final int method163(class21 arg0, int arg1) {
        if (arg1 == 3346) {
            class21 var3 = arg0.method140((byte) 71);
            return this.field305.method44(true, var3.method135((byte) -94));
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([IIII)[B", line = 218)
    private final byte[] method164(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 0 || arg3 >= this.field323.length || this.field323[arg3] == null || arg1 < 0 || this.field323[arg3].length <= arg1) {
            return null;
        }
        if (this.field323[arg3][arg1] == null) {
            boolean var5 = this.method170((byte) -42, arg3, arg0);
            if (!var5) {
                this.method169(arg3, (byte) 6);
                boolean var6 = this.method170((byte) -42, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 != 0) {
            this.method163(null, 85);
        }
        byte[] var7 = this.field323[arg3][arg1];
        if (this.field304) {
            this.field323[arg3][arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I[B)[B", line = 270)
    private static final byte[] method165(int arg0, byte[] arg1) {
        class11 var2 = new class11(arg1);
        int var3 = var2.method73((byte) -97);
        int var4 = var2.method81(-124);
        if (var4 < 0 || class2.field74 != 0 && var4 > class2.field74) {
            throw new RuntimeException();
        }
        int var5 = 44 / ((arg0 - 15) / 46);
        if (var3 == 0) {
            byte[] var10 = new byte[var4];
            var2.method77(var4, true, var10, 0);
            return var10;
        }
        int var6 = var2.method81(-106);
        if (var6 < 0 || class2.field74 != 0 && class2.field74 < var6) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class34.method208(var7, var6, arg1, var4, 9);
        } else {
            try {
                DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                var8.readFully(var7);
                var8.close();
            } catch (IOException var11) {
            }
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILk;I)I", line = 330)
    public final int method166(int arg0, class21 arg1, int arg2) {
        if (arg0 != 0) {
            this.method169(-75, (byte) 115);
        }
        class21 var4 = arg1.method140((byte) 104);
        return this.field301[arg2].method44(true, var4.method135((byte) 101));
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lk;BLk;)[B", line = 351)
    public final byte[] method167(class21 arg0, byte arg1, class21 arg2) {
        class21 var4 = arg2.method140((byte) 104);
        class21 var5 = arg0.method140((byte) 51);
        int var6 = this.field305.method44(true, var4.method135((byte) -60));
        if (arg1 < 50) {
            return (byte[]) null;
        } else {
            int var7 = this.field301[var6].method44(true, var5.method135((byte) -95));
            return this.method162(var6, false, var7);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(ZZ)V", line = 391)
    public class25(boolean arg0, boolean arg1) {
        this.field303 = arg0;
        this.field304 = arg1;
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)V", line = 401)
    public static final void method168(int arg0) {
        class14 var1 = class28.field341;
        synchronized (class28.field341) {
            class26.field329 = class8.field142;
            class6.field104 = class2.field73;
            class17.field209 = class12.field180;
            class17.field216 = class14.field190;
            class23.field277 = class6.field125;
            class22.field272 = mapview.field40;
            class14.field190 = 0;
        }
        if (arg0 >= -88) {
            field302 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IB)V", line = 421)
    private final void method169(int arg0, byte arg1) {
        if (arg1 != 6) {
            this.method163(null, 74);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BI[I)Z", line = 435)
    private final boolean method170(byte arg0, int arg1, int[] arg2) {
        if (this.field308[arg1] == null) {
            return false;
        } else if (arg0 == -42) {
            int[] var4 = this.field312[arg1];
            byte[][] var5 = this.field323[arg1];
            int var6 = this.field313[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var6; var8++) {
                if (var5[var4[var8]] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var9;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var9 = this.field308[arg1];
            } else {
                var9 = new byte[this.field308[arg1].length];
                class31.method186(this.field308[arg1], 0, var9, 0, var9.length);
                class11 var10 = new class11(var9);
                var10.method76(var10.field173.length, 5, 8, arg2);
            }
            byte[] var11;
            try {
                var11 = method165(-54, var9);
            } catch (RuntimeException var26) {
                throw class28.method177(var26, "T3 - " + (arg2 != null) + "," + arg1 + "," + var9.length + "," + class10.method64(var9.length, var9, (byte) 61) + "," + class10.method64(var9.length - 2, var9, (byte) 61) + "," + this.field321[arg1] + "," + this.field300);
            }
            if (this.field303) {
                this.field308[arg1] = null;
            }
            if (var6 <= 1) {
                var5[var4[0]] = var11;
            } else {
                int var13 = var11.length;
                int var27 = var13 - 1;
                int var14 = var11[var27] & 0xFF;
                class11 var15 = new class11(var11);
                int[] var16 = new int[var6];
                int var17 = var27 - var6 * 4 * var14;
                var15.field169 = var17;
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var6; var20++) {
                        var19 += var15.method81(-108);
                        var16[var20] += var19;
                    }
                }
                for (int var21 = 0; var21 < var6; var21++) {
                    if (var5[var4[var21]] == null) {
                        var5[var4[var21]] = new byte[var16[var21]];
                    }
                    var16[var21] = 0;
                }
                int var22 = 0;
                var15.field169 = var17;
                for (int var23 = 0; var23 < var14; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var6; var25++) {
                        var24 += var15.method81(-117);
                        class31.method186(var11, var22, var5[var4[var25]], var16[var25], var24);
                        var22 += var24;
                        var16[var25] += var24;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
