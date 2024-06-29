import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class740 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public int field10201;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "[B")
    private byte[] field10220;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "Z")
    public static boolean field10206 = false;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public int field10204;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public int field10210;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public int field10214;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "Lbia;")
    public class526 field10208;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "[I")
    public int[] field10203;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "[I")
    public int[] field10205;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "[I")
    public int[] field10207;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "[I")
    public int[] field10216;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "[I")
    public int[] field10217;

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "[I")
    public int[] field10221;

    @OriginalMember(owner = "client!ega", name = "v", descriptor = "[Lbia;")
    public class526[] field10222;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "[[B")
    public byte[][] field10215;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "[[I")
    public int[][] field10202;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "[[I")
    public int[][] field10212;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method4096(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            field10213 = 53;
        }
        field10218++;
        class281 var3 = class54.method395((byte) -53, (long) arg1, 3);
        var3.method1821((byte) 46);
        var3.field3913 = arg0;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIIII)V")
    public static final void method4097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10209++;
        int var6 = class748.method4155(class223.field3260, arg1 ^ 0xFFFFFFE9, arg0, class706.field9700);
        int var7 = class748.method4155(class223.field3260, arg1 ^ 0xFFFFFFE9, arg3, class706.field9700);
        int var8 = class748.method4155(class268.field3766, 16, arg5, class236.field3392);
        int var9 = class748.method4155(class268.field3766, arg1 ^ 0xFFFFFFE9, arg4, class236.field3392);
        for (int var10 = var6; var10 <= var7; var10++) {
            class679.method3826(class298.field4105[var10], var9, 11, var8, arg2);
        }
        if (arg1 != -7) {
            field10213 = 66;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
    public static final void method4098(byte arg0) {
        field10211++;
        if (arg0 < -64) {
            class580.field8216.method1080(90);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([BI)V")
    private final void method4099(byte[] arg0, int arg1) {
        field10219++;
        class93 var3 = new class93(class761.method4211(arg0, (byte) -121));
        int var4 = var3.method793((byte) 78);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field10210 = 0;
        } else {
            this.field10210 = var3.method773(3);
        }
        int var5 = var3.method793((byte) 13);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field10204 = var3.method763(1);
        int var8 = 0;
        this.field10205 = new int[this.field10204];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field10204; var10++) {
            this.field10205[var10] = var8 += var3.method763(108);
            if (this.field10205[var10] > var9) {
                var9 = this.field10205[var10];
            }
        }
        this.field10214 = var9 + 1;
        this.field10202 = new int[this.field10214][];
        this.field10207 = new int[this.field10214];
        if (var7) {
            this.field10215 = new byte[this.field10214][];
        }
        this.field10221 = new int[this.field10214];
        this.field10203 = new int[this.field10214];
        this.field10217 = new int[this.field10214];
        if (var6) {
            this.field10216 = new int[this.field10214];
            for (int var11 = 0; var11 < this.field10214; var11++) {
                this.field10216[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field10204; var12++) {
                this.field10216[this.field10205[var12]] = var3.method773(3);
            }
            this.field10208 = new class526(this.field10216);
        }
        if (arg1 > -46) {
            method4096(null, -103, false);
        }
        for (int var13 = 0; var13 < this.field10204; var13++) {
            this.field10203[this.field10205[var13]] = var3.method773(3);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field10204; var14++) {
                byte[] var15 = new byte[64];
                var3.method737(-32768, var15, 0, 64);
                this.field10215[this.field10205[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field10204; var16++) {
            this.field10221[this.field10205[var16]] = var3.method773(3);
        }
        for (int var17 = 0; var17 < this.field10204; var17++) {
            this.field10217[this.field10205[var17]] = var3.method763(118);
        }
        for (int var18 = 0; var18 < this.field10204; var18++) {
            int var25 = this.field10205[var18];
            int var26 = this.field10217[var25];
            int var27 = 0;
            this.field10202[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field10202[var25][var29] = var27 += var3.method763(107);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field10207[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field10202[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field10222 = new class526[var9 + 1];
        this.field10212 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field10204; var19++) {
            int var20 = this.field10205[var19];
            int var21 = this.field10217[var20];
            this.field10212[var20] = new int[this.field10207[var20]];
            for (int var22 = 0; var22 < this.field10207[var20]; var22++) {
                this.field10212[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field10202[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field10202[var20][var23];
                }
                this.field10212[var20][var24] = var3.method773(3);
            }
            this.field10222[var20] = new class526(this.field10212[var20]);
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([BI[B)V")
    public class740(byte[] arg0, int arg1, byte[] arg2) {
        this.field10201 = class197.method1425(arg0.length, arg0, -128);
        if (this.field10201 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field10220 = class323.method2056((byte) -122, arg0.length, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field10220[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method4099(arg0, -68);
    }
}
