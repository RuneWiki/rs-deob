import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class157 implements class28 {

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "La;")
    private class526 field88;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lc;")
    private class158 field89;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Ldl;")
    public class55[] field90;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[Lfr;")
    public class348[] field91;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()[Ldl;", line = 5)
    public final class55[] method59() {
        return this.field90;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lcf;II)V", line = 11)
    public final void method63(class163 arg0, class517 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field88.method3001().method2855(this, arg0, null, arg2, arg3);
            return;
        }
        class526.field7364[5] = 0;
        this.field88.method3001().method2855(this, arg0, class526.field7364, arg2, arg3);
        arg1.field7290 = class526.field7364[0];
        arg1.field7292 = class526.field7364[1];
        arg1.field7294 = class526.field7364[2];
        arg1.field7291 = class526.field7364[3];
        arg1.field7293 = class526.field7364[4];
        arg1.field7289 = class526.field7364[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;", line = 27)
    public final class157 method64(byte arg0, int arg1, boolean arg2) {
        return this.field88.method3001().method2850(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V", line = 33)
    public final void method67(class157 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field88.method3001().method2862(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V", line = 37)
    public final void method68(int arg0, class163 arg1) {
        int var3 = arg0;
        if (this.field90 != null) {
            for (int var4 = 0; var4 < this.field90.length; var4++) {
                class55 var5 = this.field90[var4];
                var5.field478 = class526.field7376[var3++];
                var5.field471 = class526.field7376[var3++];
                var5.field464 = class526.field7376[var3++];
                var5.field470 = class526.field7376[var3++];
                var5.field463 = class526.field7376[var3++];
                var5.field475 = class526.field7376[var3++];
                var5.field472 = class526.field7376[var3++];
                var5.field480 = class526.field7376[var3++];
                var5.field466 = class526.field7376[var3++];
            }
        }
        if (this.field91 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field91.length; var6++) {
            class348 var7 = this.field91[var6];
            class348 var8 = var7;
            if (var7.field4485 != null) {
                var8 = var7.field4485;
            }
            if (var7.field4483 == null) {
                var7.field4483 = arg1.method675();
            } else {
                var7.field4483.method676(arg1);
            }
            var8.field4475 = class526.field7376[var3++];
            var8.field4476 = class526.field7376[var3++];
            var8.field4486 = class526.field7376[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lcf;I)V", line = 91)
    public final void method69(class163 arg0, class517 arg1, int arg2) {
        if (arg1 == null) {
            this.field88.method3001().method2858(this, arg0, null, arg2);
            return;
        }
        class526.field7364[5] = 0;
        this.field88.method3001().method2858(this, arg0, class526.field7364, arg2);
        arg1.field7290 = class526.field7364[0];
        arg1.field7292 = class526.field7364[1];
        arg1.field7294 = class526.field7364[2];
        arg1.field7291 = class526.field7364[3];
        arg1.field7293 = class526.field7364[4];
        arg1.field7289 = class526.field7364[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()Z", line = 112)
    public final boolean method75() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V", line = 114)
    public final void method76(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lfr;", line = 119)
    public final class348[] method78() {
        return this.field91;
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 124)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z", line = 145)
    public final boolean method91(int arg0, int arg1, class163 arg2, boolean arg3) {
        return this.field88.method3001().method2864(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 155)
    public final void method97() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lei;IIII)V", line = 158)
    public class12(class526 arg0, class158 arg1, class152 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field88 = arg0;
        this.field89 = arg1;
        this.field90 = arg2.field1840;
        this.field91 = arg2.field1819;
        int var8 = arg2.field1840 == null ? 0 : arg2.field1840.length;
        int var9 = arg2.field1819 == null ? 0 : arg2.field1819.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field90[var12].field462;
            var11[var10++] = this.field90[var12].field476;
            var11[var10++] = this.field90[var12].field469;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field91[var13].field4487;
        }
        int var14 = arg2.field1851 == null ? 0 : arg2.field1851.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class347 var20 = arg2.field1851[var17];
            class620 var21 = class337.method1898(1370, var20.field4473);
            var15[var16++] = var20.field4472;
            var15[var16++] = var21.field8949;
            var15[var16++] = var21.field8950;
            var15[var16++] = var21.field8954;
            var15[var16++] = var21.field8955;
            var15[var16++] = var21.field8958;
            var15[var16++] = var21.field8953 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class347 var19 = arg2.field1851[var18];
            var15[var16++] = var19.field4468;
        }
        this.method88(this.field88, this.field89, arg2.field1854, arg2.field1820, arg2.field1853, arg2.field1810, arg2.field1830, arg2.field1837, arg2.field1845, arg2.field1817, arg2.field1821, arg2.field1847, arg2.field1831, arg2.field1857, arg2.field1856, arg2.field1816, arg2.field1849, arg2.field1833, arg2.field1835, arg2.field1852, arg2.field1811, arg2.field1848, arg2.field1844, arg2.field1826, arg2.field1864, arg2.field1829, arg2.field1850, arg2.field1818, arg2.field1823, arg2.field1834, arg2.field1813, arg2.field1863, arg2.field1825, arg2.field1860, arg2.field1822, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V", line = 229)
    public class12(class526 arg0) {
        this.field88 = arg0;
        this.field89 = null;
        this.method89(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method57(int arg0);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method58(int arg0);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method60();

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method62();

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method65(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method70(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method71();

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method72(int arg0);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method73();

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method74();

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method77();

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method79(int arg0);

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method80(class12 arg0, class12 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class483 method81(class483 arg0);

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method82();

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method83();

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method84(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method85(int arg0);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method86();

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method87(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method88(class526 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method89(class526 arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method90();

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method92(int arg0);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method93(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method94(int arg0);

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method95();

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method96();

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method98(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method100(int arg0, int arg1, int arg2);
}
