import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class536 extends class55 implements class198 {

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Ll;")
    private class18 field7516;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lm;")
    private class175 field7515;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Llea;")
    public class568[] field7513;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[Lin;")
    public class77[] field7514;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z", line = 11)
    public final boolean method529(int arg0, int arg1, class391 arg2, boolean arg3) {
        return this.field7516.method187().method1465(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V", line = 14)
    public final void method497(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V", line = 19)
    public final void method511() {
        if (this.field7516.field210 > 1) {
            synchronized (this) {
                super.field1072 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V", line = 30)
    public final void method504(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3047(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V", line = 34)
    public final void method539(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7516.method187().method1469(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lkd;II)V", line = 37)
    public final void method495(class391 arg0, class253 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7516.method187().method1467(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class18.field207[5] = 0;
            this.field7516.method187().method1467(this, arg0, class18.field207, arg2, arg3);
            arg1.field3894 = class18.field207[0];
            arg1.field3893 = class18.field207[1];
            arg1.field3897 = class18.field207[2];
            arg1.field3895 = class18.field207[3];
            arg1.field3892 = class18.field207[4];
            arg1.field3896 = class18.field207[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;", line = 61)
    public final class55 method532(byte arg0, int arg1, boolean arg2) {
        return this.field7516.method187().method1460(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lkd;I)V", line = 69)
    public final void method513(class391 arg0, class253 arg1, int arg2) {
        if (arg1 == null) {
            this.field7516.method187().method1464(this, arg0, (int[]) null, arg2);
        } else {
            class18.field207[5] = 0;
            this.field7516.method187().method1464(this, arg0, class18.field207, arg2);
            arg1.field3894 = class18.field207[0];
            arg1.field3893 = class18.field207[1];
            arg1.field3897 = class18.field207[2];
            arg1.field3895 = class18.field207[3];
            arg1.field3892 = class18.field207[4];
            arg1.field3896 = class18.field207[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V", line = 86)
    private final void method3048(int[] arg0, class391 arg1) {
        this.field7516.method187().method1457(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V", line = 91)
    public final void method538(class391 arg0) {
        this.method3048(class18.field209, arg0);
        int var2 = 0;
        if (this.field7513 != null) {
            for (int var3 = 0; var3 < this.field7513.length; ++var3) {
                class568 var4 = this.field7513[var3];
                var4.field7983 = class18.field209[var2++];
                var4.field8002 = class18.field209[var2++];
                var4.field7994 = class18.field209[var2++];
                var4.field7993 = class18.field209[var2++];
                var4.field7991 = class18.field209[var2++];
                var4.field7992 = class18.field209[var2++];
                var4.field8004 = class18.field209[var2++];
                var4.field7996 = class18.field209[var2++];
                var4.field8003 = class18.field209[var2++];
            }
        }
        if (this.field7514 != null) {
            for (int var5 = 0; var5 < this.field7514.length; ++var5) {
                class77 var6 = this.field7514[var5];
                class77 var7 = var6;
                if (var6.field1323 != null) {
                    var7 = var6.field1323;
                }
                if (var6.field1332 != null) {
                    var6.field1332.method274(arg0);
                } else {
                    var6.field1332 = arg0.method251();
                }
                var7.field1327 = class18.field209[var2++];
                var7.field1330 = class18.field209[var2++];
                var7.field1334 = class18.field209[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()[Llea;", line = 151)
    public final class568[] method501() {
        return this.field7513;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z", line = 156)
    public final boolean method492(int arg0, int arg1, class391 arg2, boolean arg3, int arg4) {
        return this.field7516.method187().method1465(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 159)
    public final void method530() {
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()[Lin;", line = 162)
    public final class77[] method487() {
        return this.field7514;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()Z", line = 170)
    public final boolean method509() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V", line = 177)
    public final void method535() {
        if (this.field7516.field210 > 1) {
            synchronized (this) {
                while (super.field1072) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field1072 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Llm;IIII)V", line = 196)
    public class536(class18 arg0, class175 arg1, class461 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7516 = arg0;
        this.field7515 = arg1;
        this.field7513 = arg2.field6616;
        this.field7514 = arg2.field6634;
        int var8 = arg2.field6616 == null ? 0 : arg2.field6616.length;
        int var9 = arg2.field6634 == null ? 0 : arg2.field6634.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field7513[var12].field7999;
            var11[var10++] = this.field7513[var12].field8000;
            var11[var10++] = this.field7513[var12].field8001;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field7514[var13].field1333;
        }
        int var14 = arg2.field6613 == null ? 0 : arg2.field6613.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class692 var20 = arg2.field6613[var17];
            class298 var21 = class252.method1687((byte) -123, var20.field9726);
            var15[var16++] = var20.field9732;
            var15[var16++] = var21.field4457;
            var15[var16++] = var21.field4454;
            var15[var16++] = var21.field4458;
            var15[var16++] = var21.field4459;
            var15[var16++] = var21.field4450;
            var15[var16++] = var21.field4449 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class692 var19 = arg2.field6613[var18];
            var15[var16++] = var19.field9725;
        }
        this.method3046(this.field7516, this.field7515, arg2.field6598, arg2.field6592, arg2.field6617, arg2.field6621, arg2.field6608, arg2.field6619, arg2.field6611, arg2.field6632, arg2.field6627, arg2.field6639, arg2.field6596, arg2.field6593, arg2.field6601, arg2.field6607, arg2.field6594, arg2.field6614, arg2.field6620, arg2.field6625, arg2.field6622, arg2.field6629, arg2.field6600, arg2.field6618, arg2.field6603, arg2.field6636, arg2.field6633, arg2.field6595, arg2.field6606, arg2.field6643, arg2.field6599, arg2.field6631, arg2.field6609, arg2.field6602, arg2.field6630, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V", line = 268)
    public class536(class18 arg0) {
        this.field7516 = arg0;
        this.field7515 = null;
        this.method3050(arg0);
    }

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method540(int arg0);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method531();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method548(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method510();

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method545();

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3046(class18 arg0, class175 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method523(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method525();

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method514();

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method500(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3047(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method533(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method488();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method512();

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method536(int arg0);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method549(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method517();

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method507();

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method506();

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method502();

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method494(int arg0);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3049(class536 arg0, class536 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method522(int arg0);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method546(int arg0);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method544();

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class54 method519(class54 arg0);

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method534();

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method503();

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method527(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3050(class18 arg0);

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method524();

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method496(int arg0);
}
