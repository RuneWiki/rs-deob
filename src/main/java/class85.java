import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class85 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[B")
    private byte[] field1171;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    public static int[] field1165 = new int[2048];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[Llk;")
    public static class589[] field1175 = new class589[300];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1170 = -1;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[I")
    public static int[] field1180 = new int[2];

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lqj;")
    public class512 field1174;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public int[] field1166;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    public int[] field1177;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public int[] field1179;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "[I")
    public int[] field1182;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    public int[] field1183;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "[I")
    public int[] field1184;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[Lqj;")
    public class512[] field1163;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[[B")
    public byte[][] field1169;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[[I")
    public int[][] field1173;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[[I")
    public int[][] field1176;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lnfa;ILnfa;)V", line = 4)
    public static final void method707(class681 arg0, int arg1, class681 arg2) {
        field1164++;
        if (arg2.field9501 != null) {
            arg2.method3835(0);
        }
        arg2.field9500 = arg0;
        arg2.field9501 = arg0.field9501;
        if (arg1 != 0) {
            method707(null, 81, null);
        }
        arg2.field9501.field9500 = arg2;
        arg2.field9500.field9501 = arg2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BZ)V", line = 24)
    private final void method708(byte[] arg0, boolean arg1) {
        field1168++;
        class461 var3 = new class461(class366.method2113(arg0, (byte) -46));
        if (arg1) {
            field1175 = null;
        }
        int var4 = var3.method2600((byte) -124);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1172 = var3.method2622(-539564808);
        } else {
            this.field1172 = 0;
        }
        int var5 = var3.method2600((byte) -125);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field1178 = var3.method2566(-2);
        int var8 = 0;
        this.field1179 = new int[this.field1178];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field1178; var10++) {
            this.field1179[var10] = var8 += var3.method2566(-2);
            if (this.field1179[var10] > var9) {
                var9 = this.field1179[var10];
            }
        }
        this.field1181 = var9 + 1;
        this.field1177 = new int[this.field1181];
        if (var7) {
            this.field1169 = new byte[this.field1181][];
        }
        this.field1184 = new int[this.field1181];
        this.field1166 = new int[this.field1181];
        this.field1182 = new int[this.field1181];
        this.field1176 = new int[this.field1181][];
        if (var6) {
            this.field1183 = new int[this.field1181];
            for (int var11 = 0; var11 < this.field1181; var11++) {
                this.field1183[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1178; var12++) {
                this.field1183[this.field1179[var12]] = var3.method2622(-539564808);
            }
            this.field1174 = new class512(this.field1183);
        }
        for (int var13 = 0; var13 < this.field1178; var13++) {
            this.field1177[this.field1179[var13]] = var3.method2622(-539564808);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1178; var14++) {
                byte[] var15 = new byte[64];
                var3.method2573(var15, (byte) -77, 64, 0);
                this.field1169[this.field1179[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1178; var16++) {
            this.field1184[this.field1179[var16]] = var3.method2622(-539564808);
        }
        for (int var17 = 0; var17 < this.field1178; var17++) {
            this.field1182[this.field1179[var17]] = var3.method2566(-2);
        }
        for (int var18 = 0; var18 < this.field1178; var18++) {
            int var25 = this.field1179[var18];
            int var26 = this.field1182[var25];
            int var27 = 0;
            int var28 = -1;
            this.field1176[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field1176[var25][var29] = var27 += var3.method2566(-2);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field1166[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field1176[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field1173 = new int[var9 + 1][];
        this.field1163 = new class512[var9 + 1];
        for (int var19 = 0; var19 < this.field1178; var19++) {
            int var20 = this.field1179[var19];
            int var21 = this.field1182[var20];
            this.field1173[var20] = new int[this.field1166[var20]];
            for (int var22 = 0; var22 < this.field1166[var20]; var22++) {
                this.field1173[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field1176[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field1176[var20][var23];
                }
                this.field1173[var20][var24] = var3.method2622(-539564808);
            }
            this.field1163[var20] = new class512(this.field1173[var20]);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 232)
    public static void method709(int arg0) {
        if (arg0 != 22474) {
            method707(null, 126, null);
        }
        field1175 = null;
        field1165 = null;
        field1180 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BI[B)V", line = 261)
    public class85(byte[] arg0, int arg1, byte[] arg2) {
        this.field1167 = class424.method2368(true, arg0.length, arg0);
        if (this.field1167 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1171 = class289.method1732(arg0.length, 0, arg0, false);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1171[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method708(arg0, false);
    }
}
