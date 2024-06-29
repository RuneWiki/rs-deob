import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class260 extends class299 implements class2 {

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Loa;")
    private class426 field3495;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lya;")
    private class79 field3493;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[Lsba;")
    public class581[] field3492;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[Lld;")
    public class49[] field3494;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lsba;", line = 3)
    public final class581[] method1247() {
        return this.field3492;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loha;Lvu;II)V", line = 6)
    public final void method1292(class465 arg0, class706 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3495.method2466().method1100(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class426.field5604[5] = 0;
            this.field3495.method2466().method1100(this, arg0, class426.field5604, arg2, arg3);
            arg1.field9321 = class426.field5604[0];
            arg1.field9323 = class426.field5604[1];
            arg1.field9322 = class426.field5604[2];
            arg1.field9320 = class426.field5604[3];
            arg1.field9325 = class426.field5604[4];
            arg1.field9324 = class426.field5604[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 24)
    public final void method1267() {
        if (this.field3495.field5615 > 1) {
            synchronized (this) {
                super.field3786 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loha;IZ)V", line = 43)
    public final void method1258(class465 arg0, int arg1, boolean arg2) {
        this.method1660(((class142) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 48)
    public final void method1302(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1662(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 51)
    public final void method1285(class299 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3495.method2466().method1107(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 57)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 62)
    public final void method1299() {
        if (this.field3495.field5615 > 1) {
            synchronized (this) {
                while (super.field3786) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field3786 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loha;Lvu;I)V", line = 79)
    public final void method1297(class465 arg0, class706 arg1, int arg2) {
        if (arg1 == null) {
            this.field3495.method2466().method1105(this, arg0, (int[]) null, arg2);
        } else {
            class426.field5604[5] = 0;
            this.field3495.method2466().method1105(this, arg0, class426.field5604, arg2);
            arg1.field9321 = class426.field5604[0];
            arg1.field9323 = class426.field5604[1];
            arg1.field9322 = class426.field5604[2];
            arg1.field9320 = class426.field5604[3];
            arg1.field9325 = class426.field5604[4];
            arg1.field9324 = class426.field5604[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILoha;)V", line = 100)
    private final void method1659(int[] arg0, class465 arg1) {
        this.field3495.method2466().method1106(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 104)
    public final void method1251(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 110)
    public final void method1259() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILoha;ZII)Z", line = 115)
    public final boolean method1233(int arg0, int arg1, class465 arg2, boolean arg3, int arg4, int arg5) {
        return this.field3495.method2466().method1102(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 118)
    public final class299 method1284(byte arg0, int arg1, boolean arg2) {
        return this.field3495.method2466().method1108(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILoha;ZI)Z", line = 121)
    public final boolean method1264(int arg0, int arg1, class465 arg2, boolean arg3, int arg4) {
        return this.field3495.method2466().method1118(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loha;)V", line = 132)
    public final void method1273(class465 arg0) {
        this.method1659(class426.field5605, arg0);
        int var2 = 0;
        if (this.field3492 != null) {
            for (int var3 = 0; var3 < this.field3492.length; ++var3) {
                class581 var4 = this.field3492[var3];
                var4.field7343 = class426.field5605[var2++];
                var4.field7358 = class426.field5605[var2++];
                var4.field7344 = class426.field5605[var2++];
                var4.field7356 = class426.field5605[var2++];
                var4.field7342 = class426.field5605[var2++];
                var4.field7349 = class426.field5605[var2++];
                var4.field7350 = class426.field5605[var2++];
                var4.field7357 = class426.field5605[var2++];
                var4.field7345 = class426.field5605[var2++];
            }
        }
        if (this.field3494 != null) {
            for (int var5 = 0; var5 < this.field3494.length; ++var5) {
                class49 var6 = this.field3494[var5];
                class49 var7 = var6;
                if (var6.field641 != null) {
                    var7 = var6.field641;
                }
                if (var6.field646 != null) {
                    var6.field646.method468(arg0);
                } else {
                    var6.field646 = arg0.method458();
                }
                var7.field643 = class426.field5605[var2++];
                var7.field640 = class426.field5605[var2++];
                var7.field650 = class426.field5605[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lld;", line = 188)
    public final class49[] method1246() {
        return this.field3494;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z", line = 192)
    public final boolean method1230() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lsu;IIII)V", line = 200)
    public class260(class426 arg0, class79 arg1, class615 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3495 = arg0;
        this.field3493 = arg1;
        this.field3492 = arg2.field7773;
        this.field3494 = arg2.field7781;
        int var8 = arg2.field7773 == null ? 0 : arg2.field7773.length;
        int var9 = arg2.field7781 == null ? 0 : arg2.field7781.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field3492[var12].field7346;
            var11[var10++] = this.field3492[var12].field7361;
            var11[var10++] = this.field3492[var12].field7353;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field3494[var13].field645;
        }
        int var14 = arg2.field7764 == null ? 0 : arg2.field7764.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class335 var20 = arg2.field7764[var17];
            class225 var21 = class231.method1484(var20.field4087, 8);
            var15[var16++] = var20.field4081;
            var15[var16++] = var21.field3049;
            var15[var16++] = var21.field3055;
            var15[var16++] = var21.field3045;
            var15[var16++] = var21.field3052;
            var15[var16++] = var21.field3053;
            var15[var16++] = var21.field3051 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class335 var19 = arg2.field7764[var18];
            var15[var16++] = var19.field4083;
        }
        this.method1657(this.field3495, this.field3493, arg2.field7779, arg2.field7752, arg2.field7798, arg2.field7768, arg2.field7786, arg2.field7766, arg2.field7754, arg2.field7762, arg2.field7784, arg2.field7787, arg2.field7771, arg2.field7795, arg2.field7803, arg2.field7772, arg2.field7758, arg2.field7760, arg2.field7791, arg2.field7796, arg2.field7759, arg2.field7776, arg2.field7756, arg2.field7808, arg2.field7790, arg2.field7755, arg2.field7792, arg2.field7778, arg2.field7763, arg2.field7782, arg2.field7794, arg2.field7780, arg2.field7761, arg2.field7753, arg2.field7800, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 274)
    public class260(class426 arg0) {
        this.field3495 = arg0;
        this.field3493 = null;
        this.method1661(arg0);
    }

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1295();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1257();

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1281(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1296();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1256(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1268();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1235();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1657(class426 arg0, class79 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method1282(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1261();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1272();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1231();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1229(int arg0);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1658(class260 arg0, class260 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1289(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1290();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1274();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1228();

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method1660(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1271(int arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1239();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1270(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class736 method1286(class736 arg0);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1265(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1260();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1238(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1252(int arg0);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method1245();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1661(class426 arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1300();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1234(int arg0, int arg1, class358 arg2, class358 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1263(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1662(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1293(int arg0);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method1279();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1253(int arg0);
}
