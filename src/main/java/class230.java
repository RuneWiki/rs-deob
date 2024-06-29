import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class230 {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    private int field3768 = -1;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    private int field3778 = -1;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Z")
    private boolean field3780 = true;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
    private boolean field3767;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field3761;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    private int field3763;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private static int field3769 = -1;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private static int field3781 = -1;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[I")
    private static int[] field3783 = new int[4];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    private int field3775;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lsc;")
    private class288 field3762;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Ltc;")
    private static class48 field3766;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3772;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3782;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[B")
    private static byte[] field3764;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 6)
    private final void method1592() {
        int var1 = this.field3776;
        int var2 = this.field3776;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class270.field4406 - var1;
        if (var2 > class270.field4399) {
            var2 -= var2 - class270.field4399;
        }
        if (class270.field4407 > 0) {
            int var9 = class270.field4407;
            var2 -= var9;
            var7 += class270.field4406 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class270.field4405) {
            int var10 = var1 - class270.field4405;
            var1 -= var10;
            var8 += var10;
        }
        if (class270.field4400 > 0) {
            int var11 = class270.field4400;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1596(class270.field4403, this.field3761, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 54)
    private static final void method1593() {
        method1604();
        if (field3769 == -1 || class239.field3974 != field3781) {
            field3769 = class62.method507(class62.field1204, 128, 128, field3764);
            field3781 = class239.field3974;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 63)
    private static final void method1594() {
        if (field3772 != null) {
            return;
        }
        class146 var0 = new class146(1088);
        class146 var1 = new class146(5140);
        if (class241.field4007) {
            var1.method1006((byte) 107, 0.0F);
            var1.method1006((byte) 106, 1.0F);
            var1.method1006((byte) 116, 0.0F);
            var1.method1006((byte) 115, 0.5F);
            var1.method1006((byte) 115, 1.0F);
            var1.method1006((byte) 120, 0.0F);
            var1.method1006((byte) 114, -1.0F);
            var1.method1006((byte) 110, 0.0F);
            var1.method1006((byte) 113, 0.5F);
            var1.method1006((byte) 111, 0.0F);
        } else {
            var1.method1001(-73, 0.0F);
            var1.method1001(-12, 1.0F);
            var1.method1001(-55, 0.0F);
            var1.method1001(-96, 0.5F);
            var1.method1001(-55, 1.0F);
            var1.method1001(-13, 0.0F);
            var1.method1001(-113, -1.0F);
            var1.method1001(-29, 0.0F);
            var1.method1001(-74, 0.5F);
            var1.method1001(-25, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class305.field4959[var5] / 65535.0F;
            float var7 = (float) class305.field4957[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class305.field4957[var9] / 65535.0F;
                float var11 = (float) class305.field4959[var9] * var6 / 65535.0F;
                float var12 = (float) class305.field4959[var9] * var7 / 65535.0F;
                if (class241.field4007) {
                    var1.method1006((byte) 120, var12);
                    var1.method1006((byte) 115, var10);
                    var1.method1006((byte) 117, var11);
                    var1.method1006((byte) 106, var2);
                    var1.method1006((byte) 122, var3);
                } else {
                    var1.method1001(-97, var12);
                    var1.method1001(-126, var10);
                    var1.method1001(-99, var11);
                    var1.method1001(-23, var2);
                    var1.method1001(-13, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class241.field4007) {
                    var0.method1002((byte) -85, 0);
                    var0.method1002((byte) -121, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1002((byte) -121, var14++);
                        var0.method1002((byte) -115, var13++);
                    }
                    var0.method1002((byte) -110, 1);
                    var0.method1002((byte) -124, 1);
                } else {
                    var0.method1008((byte) -98, 0);
                    var0.method1008((byte) -89, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1008((byte) -116, var14++);
                        var0.method1008((byte) -98, var13++);
                    }
                    var0.method1008((byte) -94, 1);
                    var0.method1008((byte) -125, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field3772 = ByteBuffer.allocateDirect(var1.field2435);
        field3772.put(var1.field2496, 0, var1.field2435);
        field3772.flip();
        field3782 = ByteBuffer.allocateDirect(var0.field2435);
        field3782.put(var0.field2496, 0, var0.field2435);
        field3782.flip();
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()V", line = 214)
    private final void method1595() {
        if (this.field3778 != -1) {
            class239.method1671(this.field3778, 0, this.field3768);
        }
        this.field3780 = true;
        this.field3778 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIIIIIIIII)V", line = 227)
    private final void method1596(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field3764[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lah;)V", line = 261)
    private final void method1597(class230 arg0) {
        method1602();
        method1604();
        this.field3762 = new class183(this.field3776, this.field3776);
        class270.method1899(field3783);
        this.field3762.method2053();
        class305.method2226();
        class270.method1894(0, 0, this.field3776, this.field3776, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field3767) {
                var2 = -arg0.field3774;
                var3 = -arg0.field3779;
                var4 = -arg0.field3760;
            } else {
                var2 = this.field3774 - arg0.field3774;
                var3 = this.field3779 - arg0.field3779;
                var4 = this.field3760 - arg0.field3760;
            }
        }
        if (this.field3775 != 0) {
            int var5 = class305.field4959[this.field3775];
            int var6 = class305.field4957[this.field3775];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field3770 != 0) {
            int var8 = this.field3770 - 1024 & 0x7FF;
            int var9 = class305.field4959[var8];
            int var10 = class305.field4957[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class89.method687(field3766.field973, 0, field3766.field1000, (short) class305.field4968.method85(this.field3771, (byte) -82));
        class95 var12 = field3766.method414(64, 512, -var2, -var3, -var4);
        int var13 = var12.method339() - var12.method356();
        int var14 = var12.method325() - var12.method340();
        if (var13 > var14) {
            int var15 = this.field3761 == 0 ? (var13 << 9) / this.field3776 : (var13 * 16 << 9) / (this.field3776 * 13);
            var12.method722(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field3761 == 0 ? (var14 << 9) / this.field3776 : (var14 * 16 << 9) / (this.field3776 * 13);
            var12.method722(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field3761 == 0) {
            for (int var17 = 0; var17 < class270.field4403.length; var17++) {
                if (class270.field4403[var17] != 0) {
                    class270.field4403[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1609();
            this.method1592();
        }
        class285.field4666.method612(-54);
        class270.method1887(field3783);
        class305.method2226();
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "()V", line = 362)
    public static final void method1598() {
        if (field3769 != -1) {
            class239.method1671(field3769, 0, field3781);
        }
        field3769 = -1;
        field3781 = -1;
        field3772 = null;
        field3782 = null;
        field3766 = null;
        field3764 = null;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "()V", line = 373)
    public static void method1599() {
        field3772 = null;
        field3782 = null;
        field3766 = null;
        field3764 = null;
        field3783 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIILah;)V", line = 381)
    public final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class230 arg6) {
        int var8 = this.field3775 - arg4 & 0x7FF;
        int var9 = this.field3770 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field3777) / 2 + var10;
        int var13 = (arg2 - this.field3777) / 2 + var11;
        if (var12 < arg3 && this.field3777 + var12 > 0 && var13 < arg2 && this.field3777 + var13 > 0 && this.method1610(arg6)) {
            this.field3762.method569(arg0 + var13, arg1 + var12, this.field3777, this.field3777);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 409)
    private final void method1601(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field3764[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V", line = 452)
    protected final void finalize() throws Throwable {
        this.method1595();
        super.finalize();
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "()V", line = 456)
    private static final void method1602() {
        if (field3766 != null) {
            return;
        }
        class48 var0 = field3766 = new class48(260, 480, 0);
        int[] var1 = var0.field1002;
        int[] var2 = var0.field983;
        int[] var3 = var0.field989;
        int[] var4 = var0.field1006;
        int[] var5 = var0.field1003;
        int[] var6 = var0.field1001;
        var0.field961 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class305.field4959[var8] >> 1;
            int var10 = class305.field4957[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class305.field4957[var12] >> 9;
                int var14 = (class305.field4959[var12] >> 1) * var9 >> 23;
                int var15 = (class305.field4959[var12] >> 1) * var10 >> 23;
                var1[var0.field961] = var15;
                var2[var0.field961] = var13;
                var3[var0.field961] = -var14;
                var0.field961++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field1000] = 0;
                var5[var0.field1000] = var17;
                var6[var0.field1000] = var16;
                var0.field1000++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field1000] = var17;
                    var5[var0.field1000] = var19;
                    var6[var0.field1000] = var16;
                    var0.field1000++;
                    var4[var0.field1000] = var19;
                    var5[var0.field1000] = var20;
                    var6[var0.field1000] = var16;
                    var0.field1000++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field1000] = var16;
                var5[var0.field1000] = var17;
                var6[var0.field1000] = 1;
                var0.field1000++;
            }
        }
        var0.field993 = var0.field961;
        var0.field959 = null;
        var0.field984 = null;
        var0.field1008 = null;
        var0.field1007 = null;
        var0.field991 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z", line = 576)
    public final boolean method1603(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3767) {
            this.field3765 = 1073741823;
            var8 = this.field3774;
            var9 = this.field3779;
            var10 = this.field3760;
        } else {
            int var5 = this.field3774 - arg0;
            int var6 = this.field3779 - arg1;
            int var7 = this.field3760 - arg2;
            this.field3765 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3765 == 0) {
                this.field3765 = 1;
            }
            var8 = (var5 << 8) / this.field3765;
            var9 = (var6 << 8) / this.field3765;
            var10 = (var7 << 8) / this.field3765;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3777 = this.field3763 * arg3 / (this.field3767 ? 1024 : this.field3765);
        } else {
            this.field3777 = 0;
        }
        if (this.field3777 < 8) {
            this.method1595();
            this.field3762 = null;
            return false;
        }
        int var12 = class298.method2132((byte) 120, this.field3777);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3776 != var12) {
            this.field3776 = var12;
        }
        this.field3775 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field3770 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field3780 = true;
        this.field3762 = null;
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "()V", line = 636)
    private static final void method1604() {
        if (field3764 != null) {
            return;
        }
        field3764 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field3764[var4 + var6] = field3764[var4 + var9] = field3764[var5 + var6] = field3764[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V", line = 690)
    public final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field3775 - arg4 & 0x7FF;
        int var8 = this.field3770 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field3777) / 2 + var9;
        int var12 = (arg2 - this.field3777) / 2 + var10;
        if (var11 >= arg3 || this.field3777 + var11 <= 0 || var12 >= arg2 || this.field3777 + var12 <= 0) {
            return;
        }
        if (this.field3773 == 0) {
            class305.field4968.method68(this.field3771, 255, this.field3776);
        } else if (this.field3778 == -1) {
            return;
        } else {
            class241.method1687(this.field3778);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field3777 + var14;
        int var16 = this.field3777 + var13;
        GL var17 = class241.field4012;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lah;)V", line = 741)
    private final void method1606(class230 arg0) {
        class48 var2 = class48.method401(class17.field480, this.field3771, 0);
        if (var2 == null) {
            return;
        }
        this.field3762 = new class288(this.field3776, this.field3776);
        class270.method1899(field3783);
        this.field3762.method2053();
        class305.method2226();
        class270.method1894(0, 0, this.field3776, this.field3776, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3767) {
                var3 = -arg0.field3774;
                var4 = -arg0.field3779;
                var5 = -arg0.field3760;
            } else {
                var3 = this.field3774 - arg0.field3774;
                var4 = this.field3779 - arg0.field3779;
                var5 = this.field3760 - arg0.field3760;
            }
        }
        if (this.field3775 != 0) {
            int var6 = class305.field4959[this.field3775];
            int var7 = class305.field4957[this.field3775];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3770 != 0) {
            int var9 = this.field3770 - 1024 & 0x7FF;
            int var10 = class305.field4959[var9];
            int var11 = class305.field4957[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class95 var13 = var2.method414(64, 768, -var3, -var4, -var5);
        int var14 = var13.method339() - var13.method356();
        int var15 = var13.method325() - var13.method340();
        int var16 = var13.method356() + var14 / 2;
        int var17 = var13.method340() + var15 / 2;
        if (var14 > var15) {
            var13.method722(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field3776);
        } else {
            var13.method722(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field3776);
        }
        class285.field4666.method612(-49);
        class270.method1887(field3783);
        class305.method2226();
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lah;)Z", line = 824)
    private final boolean method1607(class230 arg0) {
        class48 var2 = class48.method401(class17.field480, this.field3771, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class241.field4012;
        class337.method2379(field3783);
        class337.method2374();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field3767) {
                var4 = -arg0.field3774;
                var5 = -arg0.field3779;
                var6 = -arg0.field3760;
            } else {
                var4 = this.field3774 - arg0.field3774;
                var5 = this.field3779 - arg0.field3779;
                var6 = this.field3760 - arg0.field3760;
            }
        }
        var2.method417();
        class42 var7 = var2.method424(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method339() - var7.method356()) / 2;
        int var9 = (var7.method325() - var7.method340()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class247.method1742((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field3776, this.field3776);
        if (this.field3775 != 0) {
            int var11 = class305.field4959[this.field3775];
            int var12 = class305.field4957[this.field3775];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field3770 != 0) {
            int var14 = this.field3770 - 1024 & 0x7FF;
            int var15 = class305.field4959[var14];
            int var16 = class305.field4957[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class259.method1814((float) (-var4), (float) var5, (float) (-var6));
        class259.method1821(16777215, 0.5F, 0.5F, 0.5F);
        class259.method1822();
        class241.method1700();
        class241.method1705(true);
        class241.method1716(true);
        var7.method326(0, 0, 0, 0, -var8 - var7.method356(), -var9 - var7.method340(), 0, -1L);
        class241.method1716(false);
        class241.method1705(false);
        class241.method1689();
        class247.method1746();
        class241.method1687(this.field3778);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3776, this.field3776, 0);
        class337.method2375(field3783);
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lah;)V", line = 916)
    private final void method1608(class230 arg0) {
        method1594();
        method1593();
        GL var2 = class241.field4012;
        class337.method2379(field3783);
        class337.method2374();
        var2.glClearColor((float) ((this.field3761 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field3761 & 0xFF00) >> 8) / 255.0F, (float) (this.field3761 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field3767) {
                var3 = -arg0.field3774;
                var4 = -arg0.field3779;
                var5 = -arg0.field3760;
            } else {
                var3 = this.field3774 - arg0.field3774;
                var4 = this.field3779 - arg0.field3779;
                var5 = this.field3760 - arg0.field3760;
            }
        }
        class247.method1747(-1.0F, 1.0F, -1.0F, 1.0F, this.field3776, this.field3776);
        if (this.field3775 != 0) {
            int var6 = class305.field4959[this.field3775];
            int var7 = class305.field4957[this.field3775];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field3770 != 0) {
            int var9 = this.field3770 - 1024 & 0x7FF;
            int var10 = class305.field4959[var9];
            int var11 = class305.field4957[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class259.method1814((float) (-var3), (float) (-var4), (float) var5);
        class259.method1821(16777215, 0.5F, 0.5F, 1.0F);
        class259.method1822();
        if (this.field3761 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class305.field4968.method68(this.field3771, 255, this.field3776);
        class241.method1716(true);
        if (class241.field4020) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field3772.position(0));
        var2.glVertexPointer(2, 5126, 20, field3772.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field3772.position(12));
        var2.glDrawElements(5, field3782.limit() / 2, 5123, field3782.position(0));
        var2.glEnableClientState(32886);
        class241.method1716(false);
        if (this.field3761 != 0) {
            class109.method815(-124, 0, 0);
            class241.method1719(1);
            class241.method1718(0);
            class241.method1687(field3769);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3761 >> 16), (byte) (this.field3761 >> 8), (byte) this.field3761, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field3761 >> 16), (byte) (this.field3761 >> 8), (byte) this.field3761, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class247.method1746();
        class241.method1687(this.field3778);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field3776, this.field3776, 0);
        class337.method2375(field3783);
    }

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "()V", line = 1042)
    private final void method1609() {
        int var1 = this.field3776 * 3 / 32;
        int var3 = this.field3776 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class270.field4406 * var1 + var1;
        int var8 = class270.field4406 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class270.field4399) {
            var4 = var3 - (var1 + var3 - class270.field4399);
        }
        if (var1 < class270.field4407) {
            int var11 = class270.field4407 - var1;
            var4 -= var11;
            var7 += class270.field4406 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class270.field4405) {
            int var12 = var1 + var3 - class270.field4405;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class270.field4400) {
            int var13 = class270.field4400 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1601(class270.field4403, 0, this.field3761, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(Lah;)Z", line = 1097)
    private final boolean method1610(class230 arg0) {
        if (this.field3762 == null) {
            if (this.field3773 == 0) {
                this.field3762 = class305.field4968.method62((byte) -57, this.field3776, this.field3771, class305.field4961, true);
            } else if (this.field3773 == 2) {
                this.method1606(arg0);
            } else if (this.field3773 == 1) {
                this.method1597(arg0);
            }
        }
        return this.field3762 != null;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(Lah;)V", line = 1125)
    public final void method1611(class230 arg0) {
        if (this.field3773 == 0) {
            return;
        }
        boolean var2 = this.field3778 == -1 || class239.field3974 != this.field3768;
        if (!this.field3780 && !var2) {
            return;
        }
        if (var2) {
            this.field3768 = class239.field3974;
            this.field3778 = class62.method503(class62.field1198, this.field3776, this.field3776);
        } else {
            class241.method1687(this.field3778);
            class62.method502(class62.field1198, this.field3776, this.field3776);
        }
        if (this.field3773 == 1) {
            this.method1608(arg0);
            this.field3780 = false;
        } else if (this.field3773 == 2) {
            this.field3780 = !this.method1607(arg0);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3774 = arg2;
        this.field3779 = arg3;
        this.field3760 = arg4;
        this.field3767 = arg7;
        this.field3771 = arg1;
        this.field3761 = arg6;
        this.field3763 = arg5;
        this.field3773 = arg0;
    }
}
