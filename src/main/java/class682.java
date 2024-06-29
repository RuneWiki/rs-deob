import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class682 {

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public int field9283;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "[B")
    private byte[] field9290;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field9282 = 1401;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Ljava/lang/String;")
    public static String field9294 = "";

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public int field9286;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public int field9293;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public int field9295;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "Lpfa;")
    public static class275 field9284;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "Lrd;")
    public class315 field9292;

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "[I")
    public int[] field9285;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "[I")
    public int[] field9287;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "[I")
    public int[] field9288;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "[I")
    public int[] field9291;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "[I")
    public int[] field9296;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "[I")
    public int[] field9300;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "[Lrd;")
    public class315[] field9289;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "[[B")
    public byte[][] field9299;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "[[I")
    public int[][] field9281;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "[[I")
    public int[][] field9301;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)I", line = 11)
    public static final int method3770(int arg0, int arg1) {
        return class29.field349 == null ? 0 : class29.field349[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I[B)V", line = 22)
    private final void method3771(int arg0, byte[] arg1) {
        field9298++;
        class572 var3 = new class572(class209.method1231(arg1, ~arg0));
        int var4 = var3.method3097((byte) 12);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field9286 = var3.method3064(-2031091464);
        } else {
            this.field9286 = 0;
        }
        int var5 = var3.method3097((byte) 12);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field9295 = var3.method3031(-1);
        int var8 = 0;
        int var9 = -1;
        this.field9296 = new int[this.field9295];
        for (int var10 = arg0; var10 < this.field9295; var10++) {
            this.field9296[var10] = var8 += var3.method3031(class289.method1735(arg0, -1));
            if (var9 < this.field9296[var10]) {
                var9 = this.field9296[var10];
            }
        }
        this.field9293 = var9 + 1;
        this.field9287 = new int[this.field9293];
        if (var7) {
            this.field9299 = new byte[this.field9293][];
        }
        this.field9291 = new int[this.field9293];
        this.field9301 = new int[this.field9293][];
        this.field9285 = new int[this.field9293];
        this.field9288 = new int[this.field9293];
        if (var6) {
            this.field9300 = new int[this.field9293];
            for (int var11 = 0; var11 < this.field9293; var11++) {
                this.field9300[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field9295; var12++) {
                this.field9300[this.field9296[var12]] = var3.method3064(-2031091464);
            }
            this.field9292 = new class315(this.field9300);
        }
        for (int var13 = 0; var13 < this.field9295; var13++) {
            this.field9287[this.field9296[var13]] = var3.method3064(arg0 - 2031091464);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field9295; var14++) {
                byte[] var15 = new byte[64];
                var3.method3081(64, -24643, var15, 0);
                this.field9299[this.field9296[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field9295; var16++) {
            this.field9288[this.field9296[var16]] = var3.method3064(arg0 - 2031091464);
        }
        for (int var17 = 0; var17 < this.field9295; var17++) {
            this.field9291[this.field9296[var17]] = var3.method3031(-1);
        }
        for (int var18 = 0; var18 < this.field9295; var18++) {
            int var25 = this.field9296[var18];
            int var26 = this.field9291[var25];
            int var27 = 0;
            this.field9301[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field9301[var25][var29] = var27 += var3.method3031(-1);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field9285[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field9301[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field9289 = new class315[var9 + 1];
        this.field9281 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field9295; var19++) {
            int var20 = this.field9296[var19];
            int var21 = this.field9291[var20];
            this.field9281[var20] = new int[this.field9285[var20]];
            for (int var22 = 0; var22 < this.field9285[var20]; var22++) {
                this.field9281[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field9301[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field9301[var20][var23];
                }
                this.field9281[var20][var24] = var3.method3064(-2031091464);
            }
            this.field9289[var20] = new class315(this.field9281[var20]);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)[Ltl;", line = 219)
    public static final class580[] method3772(byte arg0) {
        if (arg0 > -55) {
            method3773((byte) -102);
        }
        field9297++;
        return new class580[] { class527.field6656, class286.field3622, class509.field6375 };
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "([BI[B)V", line = 239)
    public class682(byte[] arg0, int arg1, byte[] arg2) {
        this.field9283 = class68.method531(arg0.length, arg0, -108);
        if (this.field9283 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field9290 = class371.method2153(0, arg0.length, (byte) -73, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field9290[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3771(0, arg0);
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)V", line = 285)
    public static void method3773(byte arg0) {
        field9284 = null;
        if (arg0 >= -34) {
            method3772((byte) 109);
        }
        field9294 = null;
    }
}
