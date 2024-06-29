import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class355 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[J")
    private long[] field5154 = new long[8];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    private int field5156 = 0;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[J")
    private long[] field5162 = new long[8];

    @OriginalMember(owner = "client!km", name = "k", descriptor = "[J")
    private long[] field5163 = new long[8];

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    private int field5165 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[J")
    private long[] field5153 = new long[8];

    @OriginalMember(owner = "client!km", name = "r", descriptor = "[B")
    private byte[] field5170 = new byte[32];

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[B")
    private byte[] field5169 = new byte[64];

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[J")
    private long[] field5166 = new long[8];

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
    public static int[] field5157 = new int[2];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lqq;")
    public static class477 field5168;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[S")
    public static short[] field5164;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IJ[B)V")
    public final void method2218(int arg0, long arg1, byte[] arg2) {
        field5159++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field5156 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field5170[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field5170[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field5169[this.field5165] = (byte) class625.method3600(this.field5169[this.field5165], var15 >>> var7);
            this.field5165++;
            this.field5156 += 8 - var7;
            if (this.field5156 == 512) {
                this.method2224(-114);
                this.field5156 = this.field5165 = 0;
            }
            this.field5169[this.field5165] = (byte) class493.method2943(255, var15 << 8 - var7);
            this.field5156 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field5169[this.field5165] = (byte) class625.method3600(this.field5169[this.field5165], var12 >>> var7);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field5156 = (int) ((long) this.field5156 + arg1);
        } else {
            this.field5156 += 8 - var7;
            long var13 = arg1 - (long) (8 - var7);
            this.field5165++;
            if (this.field5156 == 512) {
                this.method2224(71);
                this.field5156 = this.field5165 = 0;
            }
            this.field5169[this.field5165] = (byte) class493.method2943(255, var12 << 8 - var7);
            this.field5156 += (int) var13;
        }
        if (arg0 != 255) {
            this.method2221(null, -98, -80);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
    public static final void method2219(int arg0, int arg1, int arg2) {
        field5167++;
        int var3 = class335.field4827.method587(-114, class430.field6394.method2679(class650.field9160, 126));
        int var4 = -7 / ((arg0 - 15) / 55);
        int var6;
        if (class325.field4650) {
            for (class567 var5 = (class567) class673.field9386.method3508(-2); var5 != null; var5 = (class567) class673.field9386.method3507(-63)) {
                int var7;
                if (var5.field8052 == 1) {
                    var7 = class162.method1183((class342) var5.field8055.field8521.field6156, (byte) 106);
                } else {
                    var7 = class611.method3542(-8501, var5);
                }
                if (var7 > var3) {
                    var3 = var7;
                }
            }
            class338.field4919 = (class332.field4768 ? 26 : 22) + class565.field8032 * 16;
            var3 += 8;
            var6 = class565.field8032 * 16 + 21;
        } else {
            for (class342 var8 = (class342) class748.field10459.method1195(0); var8 != null; var8 = (class342) class748.field10459.method1201(2)) {
                int var11 = class162.method1183(var8, (byte) 121);
                if (var3 < var11) {
                    var3 = var11;
                }
            }
            class338.field4919 = class68.field969 * 16 + (class332.field4768 ? 26 : 22);
            var3 += 8;
            var6 = class68.field969 * 16 + 21;
        }
        int var9 = arg1 - (var3 / 2);
        if ((var9 + var3) > class501.field7123) {
            var9 = class501.field7123 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg2;
        if (class510.field7263 < var6 + arg2) {
            var10 = class510.field7263 - var6;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        class642.field9012 = var9;
        class624.field8741 = var3;
        class177.field2747 = var10;
        class483.field6967 = true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method2220(int arg0) {
        field5157 = null;
        field5168 = null;
        if (arg0 >= 103) {
            field5164 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BII)V")
    public final void method2221(byte[] arg0, int arg1, int arg2) {
        field5158++;
        this.field5169[this.field5165] = (byte) class625.method3600(this.field5169[this.field5165], 0x80 >>> class493.method2943(7, this.field5156));
        this.field5165++;
        if (this.field5165 > 32) {
            while (true) {
                if (this.field5165 >= 64) {
                    this.method2224(-94);
                    this.field5165 = 0;
                    break;
                }
                this.field5169[this.field5165++] = 0;
            }
        }
        while (this.field5165 < 32) {
            this.field5169[this.field5165++] = 0;
        }
        class319.method2022(this.field5170, 0, this.field5169, 32, 32);
        this.method2224(112);
        int var4 = arg2;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field5163[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILvd;B)Lpga;")
    public static final class536 method2222(int arg0, class39 arg1, byte arg2) {
        field5155++;
        class536 var3 = (class536) class474.field6896.method803(122, (long) arg0);
        if (arg2 > -46) {
            return null;
        }
        if (var3 == null) {
            if (class410.field6174) {
                var3 = class736.field10316.method422(class129.method911(arg1, arg0), true);
            } else {
                var3 = class338.method2155(arg1.method226(47, arg0), 127);
            }
            class474.field6896.method801(1, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public final void method2223(int arg0) {
        for (int var2 = arg0; var2 < 32; var2++) {
            this.field5170[var2] = 0;
        }
        field5171++;
        this.field5169[0] = 0;
        this.field5156 = this.field5165 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field5163[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    private final void method2224(int arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field5154[var2] = class10.method71(class429.method2671((long) this.field5169[var3 + 7], 255L), class10.method71(class429.method2671((long) this.field5169[var3 + 6] << 8, 0xFFL << 8), class10.method71(class429.method2671((long) this.field5169[var3 + 5], 255L) << 16, class10.method71(class429.method2671(0xFFL << 24, (long) this.field5169[var3 + 4] << 24), class10.method71(class10.method71(class429.method2671((long) this.field5169[var3 + 2] << 40, 0xFFL << 40), class10.method71(class429.method2671(0xFFL << 48, (long) this.field5169[var3 + 1] << 48), (long) this.field5169[var3] << 56)), class429.method2671((long) this.field5169[var3 + 3] << 32, 0xFFL << 32))))));
            var3 += 8;
            var2++;
        }
        field5161++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field5153[var4] = class10.method71(this.field5154[var4], this.field5162[var4] = this.field5163[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field5166[var8] = 0L;
                int var14 = 0;
                int var15 = 56;
                while (var14 < 8) {
                    this.field5166[var8] = class10.method71(this.field5166[var8], class537.field7682[var14][class493.method2943(255, (int) (this.field5162[class493.method2943(var8 - var14, 7)] >>> var15))]);
                    var14++;
                    var15 -= 8;
                }
            }
            for (int var9 = 0; var9 < 8; var9++) {
                this.field5162[var9] = this.field5166[var9];
            }
            this.field5162[0] = class10.method71(this.field5162[0], class537.field7680[var5]);
            for (int var10 = 0; var10 < 8; var10++) {
                this.field5166[var10] = this.field5162[var10];
                int var12 = 0;
                int var13 = 56;
                while (var12 < 8) {
                    this.field5166[var10] = class10.method71(this.field5166[var10], class537.field7682[var12][class493.method2943(255, (int) (this.field5153[class493.method2943(var10 - var12, 7)] >>> var13))]);
                    var13 -= 8;
                    var12++;
                }
            }
            for (int var11 = 0; var11 < 8; var11++) {
                this.field5153[var11] = this.field5166[var11];
            }
        }
        int var6 = 122 / ((arg0 + 54) / 39);
        for (int var7 = 0; var7 < 8; var7++) {
            this.field5163[var7] = class10.method71(this.field5163[var7], class10.method71(this.field5153[var7], this.field5154[var7]));
        }
    }
}
