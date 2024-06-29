import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class171 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[B")
    private byte[] field2770;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Lct;")
    public static class479 field2763 = new class479();

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Lis;")
    public static class101 field2778;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Lla;")
    public static class395 field2775;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Lwg;")
    public class518 field2777;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
    public int[] field2757;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[I")
    public int[] field2760;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "[I")
    public int[] field2761;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[I")
    public int[] field2762;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "[I")
    public static int[] field2768;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
    public int[] field2772;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "[I")
    public int[] field2774;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[Lwg;")
    public class518[] field2773;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "[[B")
    public byte[][] field2769;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[[I")
    public int[][] field2765;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "[[I")
    public int[][] field2767;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 7)
    public static void method1267(int arg0) {
        field2775 = null;
        field2768 = null;
        field2778 = null;
        if (arg0 != 0) {
            field2778 = null;
        }
        field2763 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I", line = 23)
    public static final int method1268(int arg0, int arg1) {
        field2766++;
        return arg0 == 0 ? arg1 >>> 8 : -77;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([BI)V", line = 35)
    private final void method1269(byte[] arg0, int arg1) {
        field2776++;
        class465 var3 = new class465(class447.method2607(arg0, (byte) 78));
        int var4 = var3.method2705(arg1 - 27233);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        } else if (arg1 == 27209) {
            if (var4 >= 6) {
                this.field2764 = var3.method2691((byte) -67);
            } else {
                this.field2764 = 0;
            }
            int var5 = var3.method2705(arg1 - 27274);
            boolean var6 = (var5 & 0x1) != 0;
            this.field2771 = var3.method2755((byte) -127);
            boolean var7 = (var5 & 0x2) != 0;
            int var8 = 0;
            this.field2761 = new int[this.field2771];
            int var9 = -1;
            for (int var10 = 0; var10 < this.field2771; var10++) {
                this.field2761[var10] = var8 += var3.method2755((byte) -42);
                if (var9 < this.field2761[var10]) {
                    var9 = this.field2761[var10];
                }
            }
            this.field2759 = var9 + 1;
            this.field2762 = new int[this.field2759];
            this.field2757 = new int[this.field2759];
            this.field2772 = new int[this.field2759];
            if (var7) {
                this.field2769 = new byte[this.field2759][];
            }
            this.field2765 = new int[this.field2759][];
            this.field2774 = new int[this.field2759];
            if (var6) {
                this.field2760 = new int[this.field2759];
                for (int var11 = 0; var11 < this.field2759; var11++) {
                    this.field2760[var11] = -1;
                }
                for (int var12 = 0; var12 < this.field2771; var12++) {
                    this.field2760[this.field2761[var12]] = var3.method2691((byte) -67);
                }
                this.field2777 = new class518(this.field2760);
            }
            for (int var13 = 0; var13 < this.field2771; var13++) {
                this.field2762[this.field2761[var13]] = var3.method2691((byte) -67);
            }
            if (var7) {
                for (int var14 = 0; var14 < this.field2771; var14++) {
                    byte[] var15 = new byte[64];
                    var3.method2750(var15, arg1 - 27336, 64, 0);
                    this.field2769[this.field2761[var14]] = var15;
                }
            }
            for (int var16 = 0; var16 < this.field2771; var16++) {
                this.field2774[this.field2761[var16]] = var3.method2691((byte) -67);
            }
            for (int var17 = 0; var17 < this.field2771; var17++) {
                this.field2772[this.field2761[var17]] = var3.method2755((byte) -120);
            }
            for (int var18 = 0; var18 < this.field2771; var18++) {
                int var25 = this.field2761[var18];
                int var26 = 0;
                int var27 = this.field2772[var25];
                this.field2765[var25] = new int[var27];
                int var28 = -1;
                for (int var29 = 0; var29 < var27; var29++) {
                    int var30 = this.field2765[var25][var29] = var26 += var3.method2755((byte) -44);
                    if (var30 > var28) {
                        var28 = var30;
                    }
                }
                this.field2757[var25] = var28 + 1;
                if (var28 + 1 == var27) {
                    this.field2765[var25] = null;
                }
            }
            if (var6) {
                this.field2767 = new int[var9 + 1][];
                this.field2773 = new class518[var9 + 1];
                for (int var19 = 0; var19 < this.field2771; var19++) {
                    int var20 = this.field2761[var19];
                    int var21 = this.field2772[var20];
                    this.field2767[var20] = new int[this.field2757[var20]];
                    for (int var22 = 0; var22 < this.field2757[var20]; var22++) {
                        this.field2767[var20][var22] = -1;
                    }
                    for (int var23 = 0; var23 < var21; var23++) {
                        int var24;
                        if (this.field2765[var20] == null) {
                            var24 = var23;
                        } else {
                            var24 = this.field2765[var20][var23];
                        }
                        this.field2767[var20][var24] = var3.method2691((byte) -67);
                    }
                    this.field2773[var20] = new class518(this.field2767[var20]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "([BI[B)V", line = 249)
    public class171(byte[] arg0, int arg1, byte[] arg2) {
        this.field2758 = class304.method1858(arg0.length, -12498, arg0);
        if (this.field2758 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field2770 = class77.method607(arg0.length, 63, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field2770[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1269(arg0, 27209);
    }
}
