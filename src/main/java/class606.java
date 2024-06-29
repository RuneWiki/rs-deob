import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 extends class473 implements class251 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ll;")
    private class172 field8503;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lm;")
    private class109 field8505;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[Low;")
    public class93[] field8506;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[Lqr;")
    public class667[] field8504;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V", line = 3)
    public final void method1891(class490 arg0) {
        this.method3383(class172.field1933, arg0);
        int var2 = 0;
        if (this.field8506 != null) {
            for (int var3 = 0; var3 < this.field8506.length; ++var3) {
                class93 var4 = this.field8506[var3];
                var4.field948 = class172.field1933[var2++];
                var4.field938 = class172.field1933[var2++];
                var4.field942 = class172.field1933[var2++];
                var4.field951 = class172.field1933[var2++];
                var4.field947 = class172.field1933[var2++];
                var4.field956 = class172.field1933[var2++];
                var4.field935 = class172.field1933[var2++];
                var4.field954 = class172.field1933[var2++];
                var4.field957 = class172.field1933[var2++];
            }
        }
        if (this.field8504 != null) {
            for (int var5 = 0; var5 < this.field8504.length; ++var5) {
                class667 var6 = this.field8504[var5];
                class667 var7 = var6;
                if (var6.field9315 != null) {
                    var7 = var6.field9315;
                }
                if (var6.field9313 != null) {
                    var6.field9313.method15(arg0);
                } else {
                    var6.field9313 = arg0.method27();
                }
                var7.field9316 = class172.field1933[var2++];
                var7.field9307 = class172.field1933[var2++];
                var7.field9308 = class172.field1933[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V", line = 59)
    private final void method3383(int[] arg0, class490 arg1) {
        this.field8503.method935().method1072(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V", line = 65)
    public final void method1880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3384(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()[Lqr;", line = 72)
    public final class667[] method1897() {
        return this.field8504;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V", line = 76)
    public final void method1855() {
        if (this.field8503.field1936 > 1) {
            synchronized (this) {
                while (super.field6817) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6817 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 92)
    public final void method1872() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 95)
    public final void method1904() {
        if (this.field8503.field1936 > 1) {
            synchronized (this) {
                super.field6817 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z", line = 106)
    public final boolean method1896(int arg0, int arg1, class490 arg2, boolean arg3, int arg4) {
        return this.field8503.method935().method1081(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;", line = 114)
    public final class473 method1877(byte arg0, int arg1, boolean arg2) {
        return this.field8503.method935().method1071(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 123)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-108, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()Z", line = 128)
    public final boolean method1856() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z", line = 133)
    public final boolean method1867(int arg0, int arg1, class490 arg2, boolean arg3) {
        return this.field8503.method935().method1081(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()[Low;", line = 137)
    public final class93[] method1910() {
        return this.field8506;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lufa;I)V", line = 140)
    public final void method1914(class490 arg0, class374 arg1, int arg2) {
        if (arg1 == null) {
            this.field8503.method935().method1077(this, arg0, (int[]) null, arg2);
        } else {
            class172.field1922[5] = 0;
            this.field8503.method935().method1077(this, arg0, class172.field1922, arg2);
            arg1.field5089 = class172.field1922[0];
            arg1.field5092 = class172.field1922[1];
            arg1.field5088 = class172.field1922[2];
            arg1.field5090 = class172.field1922[3];
            arg1.field5091 = class172.field1922[4];
            arg1.field5087 = class172.field1922[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V", line = 163)
    public final void method1916(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8503.method935().method1078(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lufa;II)V", line = 173)
    public final void method1875(class490 arg0, class374 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field8503.method935().method1076(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class172.field1922[5] = 0;
            this.field8503.method935().method1076(this, arg0, class172.field1922, arg2, arg3);
            arg1.field5089 = class172.field1922[0];
            arg1.field5092 = class172.field1922[1];
            arg1.field5088 = class172.field1922[2];
            arg1.field5090 = class172.field1922[3];
            arg1.field5091 = class172.field1922[4];
            arg1.field5087 = class172.field1922[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V", line = 193)
    public final void method1858(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lef;IIII)V", line = 197)
    public class606(class172 arg0, class109 arg1, class581 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8503 = arg0;
        this.field8505 = arg1;
        this.field8506 = arg2.field8252;
        this.field8504 = arg2.field8255;
        int var8 = arg2.field8252 == null ? 0 : arg2.field8252.length;
        int var9 = arg2.field8255 == null ? 0 : arg2.field8255.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field8506[var12].field936;
            var11[var10++] = this.field8506[var12].field945;
            var11[var10++] = this.field8506[var12].field952;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field8504[var13].field9310;
        }
        int var14 = arg2.field8223 == null ? 0 : arg2.field8223.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class636 var20 = arg2.field8223[var17];
            class247 var21 = class260.method1539(var20.field8954, (byte) 99);
            var15[var16++] = var20.field8951;
            var15[var16++] = var21.field3063;
            var15[var16++] = var21.field3056;
            var15[var16++] = var21.field3064;
            var15[var16++] = var21.field3048;
            var15[var16++] = var21.field3050;
            var15[var16++] = var21.field3055 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class636 var19 = arg2.field8223[var18];
            var15[var16++] = var19.field8958;
        }
        this.method3386(this.field8503, this.field8505, arg2.field8268, arg2.field8250, arg2.field8219, arg2.field8237, arg2.field8253, arg2.field8216, arg2.field8248, arg2.field8251, arg2.field8224, arg2.field8225, arg2.field8259, arg2.field8217, arg2.field8228, arg2.field8244, arg2.field8235, arg2.field8231, arg2.field8221, arg2.field8218, arg2.field8222, arg2.field8238, arg2.field8245, arg2.field8269, arg2.field8270, arg2.field8229, arg2.field8267, arg2.field8262, arg2.field8256, arg2.field8254, arg2.field8243, arg2.field8246, arg2.field8258, arg2.field8227, arg2.field8242, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V", line = 268)
    public class606(class172 arg0) {
        this.field8503 = arg0;
        this.field8505 = null;
        this.method3387(arg0);
    }

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method1915(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method1870();

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method1888();

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3384(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method1861();

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method1884(int arg0);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method1866(int arg0);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method1876(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method1912();

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method1900(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method1886();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method1879(int arg0);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method1883(int arg0);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method1854(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method1869();

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method1913();

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method1903();

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3385(class606 arg0, class606 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method1865();

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method1899();

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method1887();

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method1907(int arg0);

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method1898();

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method1868();

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method1882(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method1911(int arg0, int arg1, class274 arg2, class274 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method1906(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method1853();

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method1857();

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class120 method1874(class120 arg0);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3386(class172 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method1885(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3387(class172 arg0);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method1902(int arg0);
}
