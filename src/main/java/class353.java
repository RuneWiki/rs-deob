import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class353 extends class398 implements class240 {

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lqa;")
    private class131 field5430;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lna;")
    private class253 field5431;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[Lng;")
    public class165[] field5429;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[Ldh;")
    public class254[] field5428;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILc;)V", line = 8)
    public final void method2134(int arg0, class511 arg1) {
        int var3 = arg0;
        if (this.field5429 != null) {
            for (int var4 = 0; var4 < this.field5429.length; var4++) {
                class165 var5 = this.field5429[var4];
                var5.field2461 = class131.field1938[var3++];
                var5.field2458 = class131.field1938[var3++];
                var5.field2464 = class131.field1938[var3++];
                var5.field2460 = class131.field1938[var3++];
                var5.field2455 = class131.field1938[var3++];
                var5.field2449 = class131.field1938[var3++];
                var5.field2447 = class131.field1938[var3++];
                var5.field2462 = class131.field1938[var3++];
                var5.field2463 = class131.field1938[var3++];
            }
        }
        if (this.field5428 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5428.length; var6++) {
            class254 var7 = this.field5428[var6];
            class254 var8 = var7;
            if (var7.field3440 != null) {
                var8 = var7.field3440;
            }
            if (var7.field3445 == null) {
                var7.field3445 = arg1.method1301();
            } else {
                var7.field3445.method1304(arg1);
            }
            var8.field3442 = class131.field1938[var3++];
            var8.field3447 = class131.field1938[var3++];
            var8.field3449 = class131.field1938[var3++];
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;Z)Z", line = 63)
    public final boolean method655(int arg0, int arg1, class511 arg2, boolean arg3) {
        return this.field5430.method966().method2349(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lng;", line = 71)
    public final class165[] method606() {
        return this.field5429;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lqb;I)V", line = 80)
    public final void method640(class511 arg0, class518 arg1, int arg2) {
        if (arg1 == null) {
            this.field5430.method966().method2356(this, arg0, null, arg2);
            return;
        }
        class131.field1940[5] = 0;
        this.field5430.method966().method2356(this, arg0, class131.field1940, arg2);
        arg1.field7597 = class131.field1940[0];
        arg1.field7601 = class131.field1940[1];
        arg1.field7596 = class131.field1940[2];
        arg1.field7599 = class131.field1940[3];
        arg1.field7598 = class131.field1940[4];
        arg1.field7600 = class131.field1940[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lt;IIIZ)V", line = 98)
    public final void method604(class398 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5430.method966().method2359(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z", line = 114)
    public final boolean method644() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lqb;II)V", line = 117)
    public final void method598(class511 arg0, class518 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field5430.method966().method2357(this, arg0, null, arg2, arg3);
            return;
        }
        class131.field1940[5] = 0;
        this.field5430.method966().method2357(this, arg0, class131.field1940, arg2, arg3);
        arg1.field7597 = class131.field1940[0];
        arg1.field7601 = class131.field1940[1];
        arg1.field7596 = class131.field1940[2];
        arg1.field7599 = class131.field1940[3];
        arg1.field7598 = class131.field1940[4];
        arg1.field7600 = class131.field1940[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lt;", line = 135)
    public final class398 method610(byte arg0, int arg1, boolean arg2) {
        return this.field5430.method966().method2346(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V", line = 142)
    public final void method624() {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Ldh;", line = 145)
    public final class254[] method616() {
        return this.field5428;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 149)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;Lna;Lio;IIII)V", line = 155)
    public class353(class131 arg0, class253 arg1, class118 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5430 = arg0;
        this.field5431 = arg1;
        this.field5429 = arg2.field1817;
        this.field5428 = arg2.field1782;
        int var8 = arg2.field1817 == null ? 0 : arg2.field1817.length;
        int var9 = arg2.field1782 == null ? 0 : arg2.field1782.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field5429[var12].field2456;
            var11[var10++] = this.field5429[var12].field2452;
            var11[var10++] = this.field5429[var12].field2454;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field5428[var13].field3452;
        }
        int var14 = arg2.field1785 == null ? 0 : arg2.field1785.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class103 var20 = arg2.field1785[var17];
            class29 var21 = class486.method2903(0, var20.field1551);
            var15[var16++] = var20.field1548;
            var15[var16++] = var21.field416;
            var15[var16++] = var21.field418;
            var15[var16++] = var21.field423;
            var15[var16++] = var21.field415;
            var15[var16++] = var21.field413;
            var15[var16++] = var21.field410 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class103 var19 = arg2.field1785[var18];
            var15[var16++] = var19.field1547;
        }
        this.method2136(this.field5430, this.field5431, arg2.field1807, arg2.field1796, arg2.field1764, arg2.field1805, arg2.field1803, arg2.field1801, arg2.field1778, arg2.field1779, arg2.field1789, arg2.field1765, arg2.field1794, arg2.field1802, arg2.field1816, arg2.field1787, arg2.field1772, arg2.field1806, arg2.field1800, arg2.field1771, arg2.field1808, arg2.field1792, arg2.field1810, arg2.field1815, arg2.field1814, arg2.field1812, arg2.field1809, arg2.field1766, arg2.field1795, arg2.field1777, arg2.field1783, arg2.field1799, arg2.field1784, arg2.field1813, arg2.field1775, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;)V", line = 226)
    public class353(class131 arg0) {
        this.field5430 = arg0;
        this.field5431 = null;
        this.method2137(arg0);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIII)V", line = 232)
    public final void method608(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method611();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
    public final native void method620(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
    public final native void method615(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
    public final native void method649(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IILta;Lta;III)V")
    public final native void method630(int arg0, int arg1, class337 arg2, class337 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final native void method607();

    @OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
    public final native void method600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
    public final native void method636(int arg0);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
    public final native int method647();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
    public final native void method595(int arg0);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
    public final native void method601(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final native boolean method641();

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lda;Lda;IZZ)V")
    public final native void method2135(class353 arg0, class353 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
    public final native void method650(int arg0);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final native void method605(int arg0);

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
    public final native void method657(int arg0);

    @OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
    public final native int method625();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
    public final native int method635();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lba;)Lba;")
    public final native class502 method623(class502 arg0);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
    public final native int method613();

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
    public final native void method654(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(Lqa;Lna;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2136(class131 arg0, class253 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
    public final native void method603();

    @OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
    public final native void method632(int arg0);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
    public final native int method651();

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
    public final native void method638(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public final native int method612();

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
    public final native int method639();

    @OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public final native int method621();

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lqa;)V")
    private final native void method2137(class131 arg0);

    @OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
    public final native void method602(int arg0);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
    public final native int method626();
}
