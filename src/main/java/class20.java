import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class20 {

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "[B")
    private byte[] field347;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field337 = -1;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "[I")
    public static int[] field351 = new int[2048];

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!qia", name = "u", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "Lhp;")
    public class332 field349;

    @OriginalMember(owner = "client!qia", name = "s", descriptor = "Lcv;")
    public static class569 field352;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
    public int[] field338;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "[I")
    public int[] field339;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "[I")
    public int[] field343;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "[I")
    public int[] field344;

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "[I")
    public int[] field346;

    @OriginalMember(owner = "client!qia", name = "t", descriptor = "[I")
    public int[] field353;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "[Lhp;")
    public class332[] field340;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "[Z")
    public static boolean[] field342;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "[[B")
    public byte[][] field334;

    @OriginalMember(owner = "client!qia", name = "v", descriptor = "[[I")
    public int[][] field355;

    @OriginalMember(owner = "client!qia", name = "w", descriptor = "[[I")
    public int[][] field356;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "([BI)V", line = 7)
    private final void method220(byte[] arg0, int arg1) {
        field350++;
        class677 var3 = new class677(class83.method646(arg0, 22047));
        int var4 = var3.method3821((byte) 110);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field335 = var3.method3799(false);
        } else {
            this.field335 = 0;
        }
        int var5 = var3.method3821((byte) 109);
        boolean var6 = (var5 & 0x1) != 0;
        this.field341 = var3.method3807(-1);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field344 = new int[this.field341];
        for (int var10 = 0; var10 < this.field341; var10++) {
            this.field344[var10] = var8 += var3.method3807(-1);
            if (var9 < this.field344[var10]) {
                var9 = this.field344[var10];
            }
        }
        this.field354 = var9 - arg1;
        this.field353 = new int[this.field354];
        this.field356 = new int[this.field354][];
        this.field339 = new int[this.field354];
        this.field343 = new int[this.field354];
        if (var7) {
            this.field334 = new byte[this.field354][];
        }
        this.field338 = new int[this.field354];
        if (var6) {
            this.field346 = new int[this.field354];
            for (int var11 = 0; var11 < this.field354; var11++) {
                this.field346[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field341; var12++) {
                this.field346[this.field344[var12]] = var3.method3799(false);
            }
            this.field349 = new class332(this.field346);
        }
        for (int var13 = 0; var13 < this.field341; var13++) {
            this.field353[this.field344[var13]] = var3.method3799(false);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field341; var14++) {
                byte[] var15 = new byte[64];
                var3.method3801(var15, 0, 64, arg1 + 127);
                this.field334[this.field344[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field341; var16++) {
            this.field338[this.field344[var16]] = var3.method3799(false);
        }
        for (int var17 = 0; var17 < this.field341; var17++) {
            this.field343[this.field344[var17]] = var3.method3807(-1);
        }
        for (int var18 = 0; var18 < this.field341; var18++) {
            int var25 = this.field344[var18];
            int var26 = this.field343[var25];
            int var27 = 0;
            this.field356[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field356[var25][var29] = var27 += var3.method3807(-1);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field339[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field356[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field355 = new int[var9 + 1][];
        this.field340 = new class332[var9 + 1];
        for (int var19 = 0; var19 < this.field341; var19++) {
            int var20 = this.field344[var19];
            int var21 = this.field343[var20];
            this.field355[var20] = new int[this.field339[var20]];
            for (int var22 = 0; var22 < this.field339[var20]; var22++) {
                this.field355[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field356[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field356[var20][var23];
                }
                this.field355[var20][var24] = var3.method3799(false);
            }
            this.field340[var20] = new class332(this.field355[var20]);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIII)V", line = 207)
    public static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class363.field5106 != null) {
            class363.field5106[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class649.field8625 != null) {
            class649.field8625[arg0][arg1] = (short) arg3;
        }
        if (class671.field9152 != null) {
            class671.field9152[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V", line = 224)
    public static void method222(byte arg0) {
        int var1 = 61 / ((45 - arg0) / 38);
        field342 = null;
        field352 = null;
        field351 = null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILha;I)Lhu;", line = 242)
    public static final class133 method223(int arg0, class59 arg1, int arg2) {
        if (arg0 != 0) {
            method221(-82, -59, 107, -24, -119);
        }
        field348++;
        class107 var3 = (class107) class1.field12.method2135((long) arg2, (byte) 31);
        if (var3 != null) {
            class179 var4 = var3.field1452.method1590((byte) -77);
            var3.field1455 = true;
            if (var4 != null) {
                return var4.method1242(arg1, (byte) 107);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILwu;I)Lwo;", line = 277)
    public static final class746 method224(int arg0, class376 arg1, int arg2) {
        field345++;
        byte[] var3 = arg1.method2226(-1, arg0);
        if (arg2 < 63) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return new class746(var3);
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "([BI[B)V", line = 294)
    public class20(byte[] arg0, int arg1, byte[] arg2) {
        this.field336 = class209.method1396(arg0.length, (byte) 103, arg0);
        if (this.field336 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field347 = class468.method2643(0, arg0, arg0.length, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field347[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method220(arg0, -1);
    }
}
