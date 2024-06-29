import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class315 extends class520 implements class439 {

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "La;")
    private class329 field4725;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lc;")
    private class618 field4726;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[Lmm;")
    public class26[] field4728;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[Lkv;")
    public class200[] field4727;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method1945(int arg0, int arg1, class543 arg2, class543 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()Z")
    public final boolean method1946() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method1947(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method1948();

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public final void method1949(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method1950();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;")
    public final class520 method369(byte arg0, int arg1, boolean arg2) {
        return this.field4725.method2059().method3259(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method1951(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method1952(class520 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4725.method2059().method3261(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1953(class329 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method1954();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V")
    public final void method1955(int arg0, class105 arg1) {
        int var3 = arg0;
        if (this.field4728 != null) {
            for (int var4 = 0; var4 < this.field4728.length; var4++) {
                class26 var5 = this.field4728[var4];
                var5.field243 = class329.field4864[var3++];
                var5.field249 = class329.field4864[var3++];
                var5.field247 = class329.field4864[var3++];
                var5.field250 = class329.field4864[var3++];
                var5.field238 = class329.field4864[var3++];
                var5.field237 = class329.field4864[var3++];
                var5.field242 = class329.field4864[var3++];
                var5.field239 = class329.field4864[var3++];
                var5.field235 = class329.field4864[var3++];
            }
        }
        if (this.field4727 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4727.length; var6++) {
            class200 var7 = this.field4727[var6];
            class200 var8 = var7;
            if (var7.field2999 != null) {
                var8 = var7.field2999;
            }
            if (var7.field2989 == null) {
                var7.field2989 = arg1.method609();
            } else {
                var7.field2989.method618(arg1);
            }
            var8.field3002 = class329.field4864[var3++];
            var8.field3000 = class329.field4864[var3++];
            var8.field2994 = class329.field4864[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method1956(class329 arg0);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method1957(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method1958();

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method1959();

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class88 method1960(class88 arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method1961() {
    }

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method1962();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method1963(int arg0, int arg1, class105 arg2, boolean arg3) {
        return this.field4725.method2059().method3247(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lmm;")
    public final class26[] method1964() {
        return this.field4728;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lgr;I)V")
    public final void method1965(class105 arg0, class525 arg1, int arg2) {
        if (arg1 == null) {
            this.field4725.method2059().method3252(this, arg0, null, arg2);
            return;
        }
        class329.field4865[5] = 0;
        this.field4725.method2059().method3252(this, arg0, class329.field4865, arg2);
        arg1.field7767 = class329.field4865[0];
        arg1.field7769 = class329.field4865[1];
        arg1.field7768 = class329.field4865[2];
        arg1.field7770 = class329.field4865[3];
        arg1.field7766 = class329.field4865[4];
        arg1.field7771 = class329.field4865[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method1966(int arg0);

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method1967(class315 arg0, class315 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method1968();

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method1969();

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Lkv;")
    public final class200[] method1970() {
        return this.field4727;
    }

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method1971();

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method1972(int arg0);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method1973(int arg0);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method1974(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lgr;II)V")
    public final void method1975(class105 arg0, class525 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field4725.method2059().method3251(this, arg0, null, arg2, arg3);
            return;
        }
        class329.field4865[5] = 0;
        this.field4725.method2059().method3251(this, arg0, class329.field4865, arg2, arg3);
        arg1.field7767 = class329.field4865[0];
        arg1.field7769 = class329.field4865[1];
        arg1.field7768 = class329.field4865[2];
        arg1.field7770 = class329.field4865[3];
        arg1.field7766 = class329.field4865[4];
        arg1.field7771 = class329.field4865[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method1976(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method1977(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method1978(int arg0);

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method1979(int arg0);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method1980(int arg0);

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method1981();

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method1982();

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method1983(int arg0);

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method1984(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method1985();

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method1986();

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lbt;IIII)V")
    public class315(class329 arg0, class618 arg1, class114 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4725 = arg0;
        this.field4726 = arg1;
        this.field4728 = arg2.field1507;
        this.field4727 = arg2.field1475;
        int var8 = arg2.field1507 == null ? 0 : arg2.field1507.length;
        int var9 = arg2.field1475 == null ? 0 : arg2.field1475.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field4728[var12].field236;
            var11[var10++] = this.field4728[var12].field244;
            var11[var10++] = this.field4728[var12].field248;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field4727[var13].field2991;
        }
        int var14 = arg2.field1499 == null ? 0 : arg2.field1499.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class85 var20 = arg2.field1499[var17];
            class163 var21 = class157.method906((byte) 75, var20.field986);
            var15[var16++] = var20.field987;
            var15[var16++] = var21.field2173;
            var15[var16++] = var21.field2177;
            var15[var16++] = var21.field2168;
            var15[var16++] = var21.field2171;
            var15[var16++] = var21.field2167;
            var15[var16++] = var21.field2172 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class85 var19 = arg2.field1499[var18];
            var15[var16++] = var19.field985;
        }
        this.method1953(this.field4725, this.field4726, arg2.field1508, arg2.field1491, arg2.field1463, arg2.field1496, arg2.field1498, arg2.field1484, arg2.field1458, arg2.field1477, arg2.field1489, arg2.field1464, arg2.field1470, arg2.field1457, arg2.field1505, arg2.field1500, arg2.field1480, arg2.field1481, arg2.field1494, arg2.field1465, arg2.field1462, arg2.field1482, arg2.field1466, arg2.field1472, arg2.field1488, arg2.field1479, arg2.field1493, arg2.field1460, arg2.field1492, arg2.field1502, arg2.field1485, arg2.field1469, arg2.field1471, arg2.field1486, arg2.field1504, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V")
    public class315(class329 arg0) {
        this.field4725 = arg0;
        this.field4726 = null;
        this.method1956(arg0);
    }
}
