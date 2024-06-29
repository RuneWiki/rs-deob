import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class24 {

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Z")
    private boolean field210;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[I")
    private static int[] field215 = new int[4];

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "Lha;")
    private static class116 field217;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Lha;")
    private class116 field218;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Lha;")
    private static class116 field220;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Lr;")
    private static class520 field214;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "()V")
    public static void method104() {
        field214 = null;
        field217 = null;
        field220 = null;
        field215 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lqa;Lwt;)V")
    private final void method105(class167 arg0, class24 arg1) {
        class114 var3 = class559.method3271(80, 0, this.field208, class311.field4561);
        if (var3 == null) {
            return;
        }
        arg0.method1025(field215);
        arg0.method1022(0, 0, this.field219, this.field219);
        arg0.method980(0, 0, this.field219, this.field219, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field210) {
                var4 = -arg1.field211;
                var5 = -arg1.field216;
                var6 = -arg1.field203;
            } else {
                var4 = this.field211 - arg1.field211;
                var5 = this.field216 - arg1.field216;
                var6 = this.field203 - arg1.field203;
            }
        }
        if (this.field213 != 0) {
            int var7 = -this.field213 & 0x3FFF;
            int var8 = class14.field129[var7];
            int var9 = class14.field130[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field204 != 0) {
            int var11 = -this.field204 & 0x3FFF;
            int var12 = class14.field129[var11];
            int var13 = class14.field130[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method987(1.0F);
        arg0.method1008(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class520 var15 = arg0.method954(var3, 2048, 0, 64, 768);
        int var16 = var15.method1968() - var15.method1982();
        int var17 = var15.method1986() - var15.method1954();
        int var18 = var15.method1982() + var16 / 2;
        int var19 = var15.method1954() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1016(var18, var19, var20, var20);
        arg0.method999(arg0.method1020());
        class105 var21 = arg0.method1038();
        var21.method613(0, 0, arg0.method1018() - var15.method1981());
        var15.method1975(var21, null, arg0.method1018(), 1);
        this.field218 = arg0.method1040(0, 0, this.field219, this.field219, true);
        this.field218.method235(0, 0, 3);
        arg0.method1022(field215[0], field215[1], field215[2], field215[3]);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lqa;Lwt;)Z")
    public final boolean method106(class167 arg0, class24 arg1) {
        return this.field218 != null || this.method112(arg0, arg1);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lqa;)V")
    private static final void method107(class167 arg0) {
        if (field214 != null) {
            return;
        }
        class114 var1 = new class114(580, 1104, 1);
        var1.method702((short) 1024, (short) 1024, (short) 1024, (byte) 0, 0, (short) 0, (short) 0, (byte) 0, (short) 32767, (byte) 0);
        var1.method700((byte) -10, 128, 0, 0);
        var1.method700((byte) -39, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class14.field129[var3];
            int var5 = class14.field130[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class14.field130[var12] >> 8;
                int var14 = class14.field129[var12] * var4 >> 23;
                int var15 = class14.field129[var12] * var5 >> 23;
                var1.method700((byte) -52, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method693(var8, (byte) 0, false, (byte) 0, (short) 127, (short) 0, (byte) 0, var7, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method693(var10, (byte) 0, false, (byte) 0, (short) 127, (short) 0, (byte) 0, var7, var8);
                    var1.method693(var11, (byte) 0, false, (byte) 0, (short) 127, (short) 0, (byte) 0, var7, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method693(var8, (byte) 0, false, (byte) 0, (short) 127, (short) 0, (byte) 0, 1, var7);
            }
        }
        var1.field1491 = var1.field1508;
        var1.field1465 = null;
        var1.field1484 = null;
        var1.field1505 = null;
        field214 = arg0.method954(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "()V")
    public static final void method108() {
        field214 = null;
        field220 = null;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(Lqa;Lwt;)V")
    private final void method109(class167 arg0, class24 arg1) {
        method107(arg0);
        method111(arg0);
        arg0.method1025(field215);
        arg0.method1022(0, 0, this.field219, this.field219);
        arg0.method322();
        arg0.method980(0, 0, this.field219, this.field219, this.field206 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field210) {
                var3 = -arg1.field211;
                var4 = -arg1.field216;
                var5 = -arg1.field203;
            } else {
                var3 = arg1.field211 - this.field211;
                var4 = arg1.field216 - this.field216;
                var5 = arg1.field203 - this.field203;
            }
        }
        if (this.field213 != 0) {
            int var6 = class14.field129[this.field213];
            int var7 = class14.field130[this.field213];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field204 != 0) {
            int var9 = class14.field129[this.field204];
            int var10 = class14.field130[this.field204];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class520 var12 = field214.method369((byte) 0, 51200, true);
        if (arg0.method1012()) {
            var12.method1947((short) 0, (short) this.field208);
        } else {
            var12.method1957((short) 127, class394.field5733.method1762(this.field208, (byte) 45).field963);
            var12.method1947((short) 0, (short) -1);
        }
        arg0.method987(1.0F);
        arg0.method1008(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field219 * 1024 / (var12.method1968() - var12.method1982());
        if (this.field206 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1016(this.field219 / 2, this.field219 / 2, var13, var13);
        arg0.method999(arg0.method1020());
        class105 var14 = arg0.method1020();
        var14.method613(0, 0, arg0.method1018() - var12.method1981());
        var12.method1975(var14, null, 1024, 1);
        int var15 = this.field219 * 13 / 16;
        int var16 = (this.field219 - var15) / 2;
        field217.method234(var16, var16, var15, var15, 0, this.field206 | 0xFF000000, 1);
        this.field218 = arg0.method1040(0, 0, this.field219, this.field219, true);
        arg0.method322();
        arg0.method980(0, 0, this.field219, this.field219, 0, 0);
        field220.method234(0, 0, this.field219, this.field219, 1, 0, 0);
        this.field218.method235(0, 0, 0);
        arg0.method1022(field215[0], field215[1], field215[2], field215[3]);
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "()V")
    public final void method110() {
        this.field218 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lqa;)V")
    private static final void method111(class167 arg0) {
        if (field220 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field220 = arg0.method982(var2, 0, 128, 128, 128);
        field217 = arg0.method982(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(Lqa;Lwt;)Z")
    private final boolean method112(class167 arg0, class24 arg1) {
        if (this.field218 == null) {
            if (this.field209 == 0) {
                if (class394.field5733.method1758((byte) 1, this.field208)) {
                    int[] var3 = class394.field5733.method1764(0.7F, this.field219, this.field208, this.field219, false, 38);
                    this.field218 = arg0.method982(var3, 0, this.field219, this.field219, this.field219);
                }
            } else if (this.field209 == 2) {
                this.method105(arg0, arg1);
            } else if (this.field209 == 1) {
                this.method109(arg0, arg1);
            }
        }
        return this.field218 != null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)Z")
    public final boolean method113(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field210) {
            this.field205 = 1073741823;
            var8 = this.field211;
            var9 = this.field216;
            var10 = this.field203;
        } else {
            int var5 = this.field211 - arg0;
            int var6 = this.field216 - arg1;
            int var7 = this.field203 - arg2;
            this.field205 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field205 == 0) {
                this.field205 = 1;
            }
            var8 = (var5 << 8) / this.field205;
            var9 = (var6 << 8) / this.field205;
            var10 = (var7 << 8) / this.field205;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field212 = this.field207 * arg3 / (this.field210 ? 1024 : this.field205);
        } else {
            this.field212 = 0;
        }
        if (this.field212 < 8) {
            this.field218 = null;
            return false;
        }
        int var12 = class479.method2908((byte) -99, this.field212);
        if (var12 > arg3) {
            var12 = class239.method1537(-24644, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field219 != var12) {
            this.field219 = var12;
        }
        this.field213 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field204 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field218 = null;
        return true;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method114(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field218 == null) {
            return;
        }
        int var8 = this.field213 - arg5 & 0x3FFF;
        int var9 = this.field204 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field212) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field212) / 2;
        if (var10 < arg4 && this.field212 + var10 > 0 && var11 < arg3 && this.field212 + var11 > 0) {
            this.field218.method715(arg1 + var11, arg2 + var10, this.field212, this.field212);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field211 = arg2;
        this.field216 = arg3;
        this.field203 = arg4;
        this.field210 = arg7;
        this.field208 = arg1;
        this.field206 = arg6;
        this.field207 = arg5;
        this.field209 = arg0;
    }
}
