import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class470 extends class327 implements class137 {

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lda;")
    private class54 field6967;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "La;")
    private class537 field6964;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "[Lfca;")
    public class75[] field6965;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "[Lgl;")
    public class522[] field6966;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 5)
    public final void method1372() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z", line = 11)
    public final boolean method1381(int arg0, int arg1, class364 arg2, boolean arg3) {
        return this.field6967.method339().method3398(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V", line = 19)
    public final void method1371(class364 arg0) {
        this.method2876(class54.field602, arg0);
        int var2 = 0;
        if (this.field6965 != null) {
            for (int var3 = 0; var3 < this.field6965.length; var3++) {
                class75 var4 = this.field6965[var3];
                var4.field813 = class54.field602[var2++];
                var4.field805 = class54.field602[var2++];
                var4.field801 = class54.field602[var2++];
                var4.field808 = class54.field602[var2++];
                var4.field812 = class54.field602[var2++];
                var4.field802 = class54.field602[var2++];
                var4.field811 = class54.field602[var2++];
                var4.field794 = class54.field602[var2++];
                var4.field795 = class54.field602[var2++];
            }
        }
        if (this.field6966 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field6966.length; var5++) {
            class522 var6 = this.field6966[var5];
            class522 var7 = var6;
            if (var6.field7587 != null) {
                var7 = var6.field7587;
            }
            if (var6.field7590 == null) {
                var6.field7590 = arg0.method2020();
            } else {
                var6.field7590.method2004(arg0);
            }
            var7.field7593 = class54.field602[var2++];
            var7.field7595 = class54.field602[var2++];
            var7.field7594 = class54.field602[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 74)
    public final void method1401(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;", line = 86)
    public final class327 method1382(byte arg0, int arg1, boolean arg2) {
        return this.field6967.method339().method3395(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()[Lgl;", line = 91)
    public final class522[] method1348() {
        return this.field6966;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V", line = 95)
    private final void method2876(int[] arg0, class364 arg1) {
        this.field6967.method339().method3389(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lsda;I)V", line = 98)
    public final void method1380(class364 arg0, class219 arg1, int arg2) {
        if (arg1 == null) {
            this.field6967.method339().method3385(this, arg0, null, arg2);
            return;
        }
        class54.field614[5] = 0;
        this.field6967.method339().method3385(this, arg0, class54.field614, arg2);
        arg1.field3001 = class54.field614[0];
        arg1.field3002 = class54.field614[1];
        arg1.field2998 = class54.field614[2];
        arg1.field3003 = class54.field614[3];
        arg1.field2999 = class54.field614[4];
        arg1.field3000 = class54.field614[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()Z", line = 114)
    public final boolean method1393() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V", line = 119)
    public final void method1361(class327 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6967.method339().method3397(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lfca;", line = 125)
    public final class75[] method1353() {
        return this.field6965;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lsda;II)V", line = 139)
    public final void method1365(class364 arg0, class219 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6967.method339().method3382(this, arg0, null, arg2, arg3);
            return;
        }
        class54.field614[5] = 0;
        this.field6967.method339().method3382(this, arg0, class54.field614, arg2, arg3);
        arg1.field3001 = class54.field614[0];
        arg1.field3002 = class54.field614[1];
        arg1.field2998 = class54.field614[2];
        arg1.field3003 = class54.field614[3];
        arg1.field2999 = class54.field614[4];
        arg1.field3000 = class54.field614[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 156)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -52);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lor;IIII)V", line = 163)
    public class470(class54 arg0, class537 arg1, class557 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6967 = arg0;
        this.field6964 = arg1;
        this.field6965 = arg2.field7907;
        this.field6966 = arg2.field7901;
        int var8 = arg2.field7907 == null ? 0 : arg2.field7907.length;
        int var9 = arg2.field7901 == null ? 0 : arg2.field7901.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6965[var12].field798;
            var11[var10++] = this.field6965[var12].field800;
            var11[var10++] = this.field6965[var12].field809;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6966[var13].field7591;
        }
        int var14 = arg2.field7930 == null ? 0 : arg2.field7930.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class392 var20 = arg2.field7930[var17];
            class195 var21 = class212.method1377(var20.field5998, (byte) 126);
            var15[var16++] = var20.field6003;
            var15[var16++] = var21.field2650;
            var15[var16++] = var21.field2641;
            var15[var16++] = var21.field2638;
            var15[var16++] = var21.field2642;
            var15[var16++] = var21.field2651;
            var15[var16++] = var21.field2643 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class392 var19 = arg2.field7930[var18];
            var15[var16++] = var19.field6002;
        }
        this.method2875(this.field6967, this.field6964, arg2.field7899, arg2.field7942, arg2.field7945, arg2.field7919, arg2.field7911, arg2.field7929, arg2.field7913, arg2.field7951, arg2.field7904, arg2.field7927, arg2.field7920, arg2.field7926, arg2.field7937, arg2.field7902, arg2.field7896, arg2.field7923, arg2.field7950, arg2.field7940, arg2.field7924, arg2.field7947, arg2.field7898, arg2.field7941, arg2.field7944, arg2.field7936, arg2.field7906, arg2.field7908, arg2.field7910, arg2.field7917, arg2.field7916, arg2.field7949, arg2.field7914, arg2.field7932, arg2.field7915, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V", line = 234)
    public class470(class54 arg0) {
        this.field6967 = arg0;
        this.field6964 = null;
        this.method2878(arg0);
    }

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method1399(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method1379();

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method1391(int arg0, int arg1, class132 arg2, class132 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method1360();

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method1369(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method1396(int arg0);

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method1383();

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method1367();

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method1354(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2875(class54 arg0, class537 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method1375();

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method1351(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method1352();

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class252 method1387(class252 arg0);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method1385(int arg0);

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method1363(int arg0);

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method1376(int arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method1355();

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method1373();

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method1349();

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method2877(class470 arg0, class470 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method1364();

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method1389();

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method1402();

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method1350(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method1378(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method1357(int arg0);

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method1394(int arg0);

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method2878(class54 arg0);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method1374();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method1358(int arg0);
}
