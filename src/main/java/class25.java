import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class25 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Z")
    private boolean field314 = true;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    private int field324 = -1;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
    private boolean field312;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private static int field313 = -1;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    private static int field329 = -1;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
    private static int[] field333 = new int[4];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lvi;")
    private static class114 field326;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Ln;")
    private class178 field325;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field327;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field330;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[B")
    private static byte[] field323;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 7)
    public static final void method185() {
        if (field329 != -1) {
            class301.method1983(field329, 0, field313);
        }
        field329 = -1;
        field313 = -1;
        field330 = null;
        field327 = null;
        field326 = null;
        field323 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Z", line = 22)
    public final boolean method186(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field312) {
            this.field318 = 1073741823;
            var8 = this.field332;
            var9 = this.field328;
            var10 = this.field317;
        } else {
            int var5 = this.field332 - arg0;
            int var6 = this.field328 - arg1;
            int var7 = this.field317 - arg2;
            this.field318 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field318 == 0) {
                this.field318 = 1;
            }
            var8 = (var5 << 8) / this.field318;
            var9 = (var6 << 8) / this.field318;
            var10 = (var7 << 8) / this.field318;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field331 = this.field334 * arg3 / (this.field312 ? 1024 : this.field318);
        } else {
            this.field331 = 0;
        }
        if (this.field331 < 8) {
            this.method198();
            this.field325 = null;
            return false;
        }
        int var12 = class64.method463(this.field331, (byte) -79);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field322 != var12) {
            this.field322 = var12;
        }
        this.field311 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field319 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field314 = true;
        this.field325 = null;
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 78)
    private final void method187() {
        int var1 = this.field322 * 3 / 32;
        int var3 = this.field322 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class57.field798 * var1 + var1;
        int var8 = class57.field798 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class57.field799) {
            var4 = var3 - (var1 + var3 - class57.field799);
        }
        if (var1 < class57.field795) {
            int var11 = class57.field795 - var1;
            var4 -= var11;
            var7 += class57.field798 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class57.field800) {
            int var12 = var1 + var3 - class57.field800;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class57.field801) {
            int var13 = class57.field801 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method188(class57.field797, 0, this.field316, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 137)
    private final void method188(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field323[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()V", line = 176)
    private static final void method189() {
        method200();
        if (field329 == -1 || class301.field4649 != field313) {
            field329 = class32.method243(class32.field403, 128, 128, field323);
            field313 = class301.field4649;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIILcc;)V", line = 190)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class25 arg6) {
        int var8 = this.field311 - arg4 & 0x7FF;
        int var9 = this.field319 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field331) / 2 + var10;
        int var13 = (arg2 - this.field331) / 2 + var11;
        if (var12 < arg3 && this.field331 + var12 > 0 && var13 < arg2 && this.field331 + var13 > 0 && this.method204(arg6)) {
            this.field325.method919(arg0 + var13, arg1 + var12, this.field331, this.field331);
        }
    }

    @OriginalMember(owner = "client!cc", name = "finalize", descriptor = "()V", line = 215)
    protected final void finalize() throws Throwable {
        this.method198();
        super.finalize();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lcc;)V", line = 219)
    public final void method191(class25 arg0) {
        if (this.field315 == 0) {
            return;
        }
        boolean var2 = this.field324 == -1 || class301.field4649 != this.field320;
        if (!this.field314 && !var2) {
            return;
        }
        if (var2) {
            this.field320 = class301.field4649;
            this.field324 = class32.method240(class32.field397, this.field322, this.field322);
        } else {
            class333.method2282(this.field324);
            class32.method242(class32.field397, this.field322, this.field322);
        }
        if (this.field315 == 1) {
            this.method197(arg0);
            this.field314 = false;
        } else if (this.field315 == 2) {
            this.field314 = !this.method199(arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V", line = 261)
    private final void method192() {
        int var1 = this.field322;
        int var2 = this.field322;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class57.field798 - var1;
        if (var2 > class57.field799) {
            var2 -= var2 - class57.field799;
        }
        if (class57.field795 > 0) {
            int var9 = class57.field795;
            var2 -= var9;
            var7 += class57.field798 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class57.field800) {
            int var10 = var1 - class57.field800;
            var1 -= var10;
            var8 += var10;
        }
        if (class57.field801 > 0) {
            int var11 = class57.field801;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method194(class57.field797, this.field316, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lcc;)V", line = 312)
    private final void method193(class25 arg0) {
        method201();
        method200();
        this.field325 = new class135(this.field322, this.field322);
        class57.method379(field333);
        this.field325.method1211();
        class12.method95();
        class57.method375(0, 0, this.field322, this.field322, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field312) {
                var2 = -arg0.field332;
                var3 = -arg0.field328;
                var4 = -arg0.field317;
            } else {
                var2 = this.field332 - arg0.field332;
                var3 = this.field328 - arg0.field328;
                var4 = this.field317 - arg0.field317;
            }
        }
        if (this.field311 != 0) {
            int var5 = class12.field121[this.field311];
            int var6 = class12.field127[this.field311];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field319 != 0) {
            int var8 = this.field319 - 1024 & 0x7FF;
            int var9 = class12.field121[var8];
            int var10 = class12.field127[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class223.method1506(field326.field1746, 0, field326.field1761, (short) class12.field126.method477(7053, this.field321));
        class141 var12 = field326.method779(64, 512, -var2, -var3, -var4);
        int var13 = var12.method980() - var12.method957();
        int var14 = var12.method952() - var12.method112();
        if (var13 > var14) {
            int var15 = this.field316 == 0 ? (var13 << 9) / this.field322 : (var13 * 16 << 9) / (this.field322 * 13);
            var12.method970(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field316 == 0 ? (var14 << 9) / this.field322 : (var14 * 16 << 9) / (this.field322 * 13);
            var12.method970(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field316 == 0) {
            for (int var17 = 0; var17 < class57.field797.length; var17++) {
                if (class57.field797[var17] != 0) {
                    class57.field797[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method187();
            this.method192();
        }
        class42.field594.method27(-10702);
        class57.method381(field333);
        class12.method95();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIIIIIIIIII)V", line = 414)
    private final void method194(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field323[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V", line = 448)
    public final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field311 - arg4 & 0x7FF;
        int var8 = this.field319 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field331) / 2 + var9;
        int var12 = (arg2 - this.field331) / 2 + var10;
        if (var11 >= arg3 || this.field331 + var11 <= 0 || var12 >= arg2 || this.field331 + var12 <= 0) {
            return;
        }
        if (this.field315 == 0) {
            class12.field126.method474(this.field322, (byte) -53, this.field321);
        } else if (this.field324 == -1) {
            return;
        } else {
            class333.method2282(this.field324);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field331 + var14;
        int var16 = this.field331 + var13;
        GL var17 = class333.field5160;
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

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()V", line = 498)
    public static void method196() {
        field330 = null;
        field327 = null;
        field326 = null;
        field323 = null;
        field333 = null;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lcc;)V", line = 507)
    private final void method197(class25 arg0) {
        method202();
        method189();
        GL var2 = class333.field5160;
        class238.method1630(field333);
        class238.method1629();
        var2.glClearColor((float) ((this.field316 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field316 & 0xFF00) >> 8) / 255.0F, (float) (this.field316 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field312) {
                var3 = -arg0.field332;
                var4 = -arg0.field328;
                var5 = -arg0.field317;
            } else {
                var3 = this.field332 - arg0.field332;
                var4 = this.field328 - arg0.field328;
                var5 = this.field317 - arg0.field317;
            }
        }
        class127.method849(-1.0F, 1.0F, -1.0F, 1.0F, this.field322, this.field322);
        if (this.field311 != 0) {
            int var6 = class12.field121[this.field311];
            int var7 = class12.field127[this.field311];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field319 != 0) {
            int var9 = this.field319 - 1024 & 0x7FF;
            int var10 = class12.field121[var9];
            int var11 = class12.field127[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class326.method2212((float) (-var3), (float) (-var4), (float) var5);
        class326.method2218(16777215, 0.5F, 0.5F, 1.0F);
        class326.method2213();
        if (this.field316 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class12.field126.method474(this.field322, (byte) -53, this.field321);
        class333.method2308(true);
        if (class333.field5188) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field330.position(0));
        var2.glVertexPointer(2, 5126, 20, field330.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field330.position(12));
        var2.glDrawElements(5, field327.limit() / 2, 5123, field327.position(0));
        var2.glEnableClientState(32886);
        class333.method2308(false);
        if (this.field316 != 0) {
            class174.method1179(0, 0, (byte) 89);
            class333.method2306(1);
            class333.method2285(0);
            class333.method2282(field329);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field316 >> 16), (byte) (this.field316 >> 8), (byte) this.field316, (byte) 127);
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
            var2.glColor4ub((byte) (this.field316 >> 16), (byte) (this.field316 >> 8), (byte) this.field316, (byte) -1);
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
        class127.method853();
        class333.method2282(this.field324);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field322, this.field322, 0);
        class238.method1620(field333);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()V", line = 632)
    private final void method198() {
        if (this.field324 != -1) {
            class301.method1983(this.field324, 0, this.field320);
        }
        this.field314 = true;
        this.field324 = -1;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(Lcc;)Z", line = 640)
    private final boolean method199(class25 arg0) {
        class114 var2 = class114.method782(class67.field1000, this.field321, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class333.field5160;
        class238.method1630(field333);
        class238.method1629();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field312) {
                var4 = -arg0.field332;
                var5 = -arg0.field328;
                var6 = -arg0.field317;
            } else {
                var4 = this.field332 - arg0.field332;
                var5 = this.field328 - arg0.field328;
                var6 = this.field317 - arg0.field317;
            }
        }
        var2.method787();
        class295 var7 = var2.method769(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method980() - var7.method957()) / 2;
        int var9 = (var7.method952() - var7.method112()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class127.method856((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field322, this.field322);
        if (this.field311 != 0) {
            int var11 = class12.field121[this.field311];
            int var12 = class12.field127[this.field311];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field319 != 0) {
            int var14 = this.field319 - 1024 & 0x7FF;
            int var15 = class12.field121[var14];
            int var16 = class12.field127[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class326.method2212((float) (-var4), (float) var5, (float) (-var6));
        class326.method2218(16777215, 0.5F, 0.5F, 0.5F);
        class326.method2213();
        class333.method2301();
        class333.method2316(true);
        class333.method2308(true);
        var7.method965(0, 0, 0, 0, -var8 - var7.method957(), -var9 - var7.method112(), 0, -1L);
        class333.method2308(false);
        class333.method2316(false);
        class333.method2290();
        class127.method853();
        class333.method2282(this.field324);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field322, this.field322, 0);
        class238.method1620(field333);
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1179)
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field332 = arg2;
        this.field328 = arg3;
        this.field317 = arg4;
        this.field312 = arg7;
        this.field321 = arg1;
        this.field316 = arg6;
        this.field334 = arg5;
        this.field315 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V", line = 730)
    private static final void method200() {
        if (field323 != null) {
            return;
        }
        field323 = new byte[16384];
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
                field323[var4 + var6] = field323[var4 + var9] = field323[var5 + var6] = field323[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "()V", line = 792)
    private static final void method201() {
        if (field326 != null) {
            return;
        }
        class114 var0 = field326 = new class114(260, 480, 0);
        int[] var1 = var0.field1767;
        int[] var2 = var0.field1757;
        int[] var3 = var0.field1754;
        int[] var4 = var0.field1738;
        int[] var5 = var0.field1749;
        int[] var6 = var0.field1777;
        var0.field1782 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class12.field121[var8] >> 1;
            int var10 = class12.field127[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class12.field127[var12] >> 9;
                int var14 = (class12.field121[var12] >> 1) * var9 >> 23;
                int var15 = (class12.field121[var12] >> 1) * var10 >> 23;
                var1[var0.field1782] = var15;
                var2[var0.field1782] = var13;
                var3[var0.field1782] = -var14;
                var0.field1782++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field1761] = 0;
                var5[var0.field1761] = var17;
                var6[var0.field1761] = var16;
                var0.field1761++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field1761] = var17;
                    var5[var0.field1761] = var19;
                    var6[var0.field1761] = var16;
                    var0.field1761++;
                    var4[var0.field1761] = var19;
                    var5[var0.field1761] = var20;
                    var6[var0.field1761] = var16;
                    var0.field1761++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field1761] = var16;
                var5[var0.field1761] = var17;
                var6[var0.field1761] = 1;
                var0.field1761++;
            }
        }
        var0.field1766 = var0.field1782;
        var0.field1758 = null;
        var0.field1755 = null;
        var0.field1747 = null;
        var0.field1776 = null;
        var0.field1769 = null;
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "()V", line = 904)
    private static final void method202() {
        if (field330 != null) {
            return;
        }
        class303 var0 = new class303(1088);
        class303 var1 = new class303(5140);
        if (class333.field5170) {
            var1.method2046(0.0F, 0);
            var1.method2046(1.0F, 0);
            var1.method2046(0.0F, 0);
            var1.method2046(0.5F, 0);
            var1.method2046(1.0F, 0);
            var1.method2046(0.0F, 0);
            var1.method2046(-1.0F, 0);
            var1.method2046(0.0F, 0);
            var1.method2046(0.5F, 0);
            var1.method2046(0.0F, 0);
        } else {
            var1.method2056(104, 0.0F);
            var1.method2056(118, 1.0F);
            var1.method2056(122, 0.0F);
            var1.method2056(126, 0.5F);
            var1.method2056(110, 1.0F);
            var1.method2056(117, 0.0F);
            var1.method2056(123, -1.0F);
            var1.method2056(110, 0.0F);
            var1.method2056(120, 0.5F);
            var1.method2056(107, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class12.field121[var5] / 65535.0F;
            float var7 = (float) class12.field127[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class12.field127[var9] / 65535.0F;
                float var11 = (float) class12.field121[var9] * var6 / 65535.0F;
                float var12 = (float) class12.field121[var9] * var7 / 65535.0F;
                if (class333.field5170) {
                    var1.method2046(var12, 0);
                    var1.method2046(var10, 0);
                    var1.method2046(var11, 0);
                    var1.method2046(var2, 0);
                    var1.method2046(var3, 0);
                } else {
                    var1.method2056(108, var12);
                    var1.method2056(126, var10);
                    var1.method2056(113, var11);
                    var1.method2056(120, var2);
                    var1.method2056(125, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class333.field5170) {
                    var0.method2044(1247686728, 0);
                    var0.method2044(1247686728, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method2044(1247686728, var14++);
                        var0.method2044(1247686728, var13++);
                    }
                    var0.method2044(1247686728, 1);
                    var0.method2044(1247686728, 1);
                } else {
                    var0.method1991(0, -36);
                    var0.method1991(0, -28);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1991(var14++, -69);
                        var0.method1991(var13++, -32);
                    }
                    var0.method1991(1, -113);
                    var0.method1991(1, -79);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field330 = ByteBuffer.allocateDirect(var1.field4679);
        field330.put(var1.field4716, 0, var1.field4679);
        field330.flip();
        field327 = ByteBuffer.allocateDirect(var0.field4679);
        field327.put(var0.field4716, 0, var0.field4679);
        field327.flip();
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(Lcc;)V", line = 1055)
    private final void method203(class25 arg0) {
        class114 var2 = class114.method782(class67.field1000, this.field321, 0);
        if (var2 == null) {
            return;
        }
        this.field325 = new class178(this.field322, this.field322);
        class57.method379(field333);
        this.field325.method1211();
        class12.method95();
        class57.method375(0, 0, this.field322, this.field322, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field312) {
                var3 = -arg0.field332;
                var4 = -arg0.field328;
                var5 = -arg0.field317;
            } else {
                var3 = this.field332 - arg0.field332;
                var4 = this.field328 - arg0.field328;
                var5 = this.field317 - arg0.field317;
            }
        }
        if (this.field311 != 0) {
            int var6 = class12.field121[this.field311];
            int var7 = class12.field127[this.field311];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field319 != 0) {
            int var9 = this.field319 - 1024 & 0x7FF;
            int var10 = class12.field121[var9];
            int var11 = class12.field127[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class141 var13 = var2.method779(64, 768, -var3, -var4, -var5);
        int var14 = var13.method980() - var13.method957();
        int var15 = var13.method952() - var13.method112();
        int var16 = var13.method957() + var14 / 2;
        int var17 = var13.method112() + var15 / 2;
        if (var14 > var15) {
            var13.method970(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field322);
        } else {
            var13.method970(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field322);
        }
        class42.field594.method27(-10702);
        class57.method381(field333);
        class12.method95();
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(Lcc;)Z", line = 1141)
    private final boolean method204(class25 arg0) {
        if (this.field325 == null) {
            if (this.field315 == 0) {
                this.field325 = class12.field126.method473(this.field321, this.field322, 63, true, class12.field114);
            } else if (this.field315 == 2) {
                this.method203(arg0);
            } else if (this.field315 == 1) {
                this.method193(arg0);
            }
        }
        return this.field325 != null;
    }
}
