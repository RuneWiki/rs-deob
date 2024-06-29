import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class767 extends class231 implements class784 {

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Loa;")
    private class52 field10553;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lya;")
    private class317 field10552;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lfba;")
    public class626[] field10551;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Lmb;")
    public class426[] field10554;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loo;)V", line = 3)
    public final void method1581(class12 arg0) {
        this.method4225(class52.field614, arg0);
        int var2 = 0;
        if (this.field10551 != null) {
            for (int var3 = 0; var3 < this.field10551.length; ++var3) {
                class626 var4 = this.field10551[var3];
                var4.field8777 = class52.field614[var2++];
                var4.field8776 = class52.field614[var2++];
                var4.field8763 = class52.field614[var2++];
                var4.field8767 = class52.field614[var2++];
                var4.field8764 = class52.field614[var2++];
                var4.field8768 = class52.field614[var2++];
                var4.field8762 = class52.field614[var2++];
                var4.field8773 = class52.field614[var2++];
                var4.field8759 = class52.field614[var2++];
            }
        }
        if (this.field10554 != null) {
            for (int var5 = 0; var5 < this.field10554.length; ++var5) {
                class426 var6 = this.field10554[var5];
                class426 var7 = var6;
                if (var6.field5948 != null) {
                    var7 = var6.field5948;
                }
                if (var6.field5946 != null) {
                    var6.field5946.method49(arg0);
                } else {
                    var6.field5946 = arg0.method37();
                }
                var7.field5945 = class52.field614[var2++];
                var7.field5947 = class52.field614[var2++];
                var7.field5943 = class52.field614[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 58)
    public final void method1591() {
        if (this.field10553.field635 > 1) {
            synchronized (this) {
                while (super.field3480) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field3480 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loo;IZ)V", line = 78)
    public final void method1541(class12 arg0, int arg1, boolean arg2) {
        this.method4222(((class667) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z", line = 83)
    public final boolean method1547() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lmb;", line = 86)
    public final class426[] method1543() {
        return this.field10554;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 102)
    public final void method1553() {
        if (this.field10553.field635 > 1) {
            synchronized (this) {
                super.field3480 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 114)
    public final class231 method1584(byte arg0, int arg1, boolean arg2) {
        return this.field10553.method451().method3892(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILoo;)V", line = 121)
    private final void method4225(int[] arg0, class12 arg1) {
        this.field10553.method451().method3882(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILoo;ZII)Z", line = 127)
    public final boolean method1570(int arg0, int arg1, class12 arg2, boolean arg3, int arg4, int arg5) {
        return this.field10553.method451().method3871(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 135)
    public final void method1589() {
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lfba;", line = 138)
    public final class626[] method1579() {
        return this.field10551;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILoo;ZI)Z", line = 149)
    public final boolean method1578(int arg0, int arg1, class12 arg2, boolean arg3, int arg4) {
        return this.field10553.method451().method3887(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loo;Lea;I)V", line = 152)
    public final void method1586(class12 arg0, class21 arg1, int arg2) {
        if (arg1 == null) {
            this.field10553.method451().method3883(this, arg0, (int[]) null, arg2);
        } else {
            class52.field615[5] = 0;
            this.field10553.method451().method3883(this, arg0, class52.field615, arg2);
            arg1.field179 = class52.field615[0];
            arg1.field184 = class52.field615[1];
            arg1.field181 = class52.field615[2];
            arg1.field182 = class52.field615[3];
            arg1.field183 = class52.field615[4];
            arg1.field180 = class52.field615[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 167)
    public final void method1571(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 171)
    public final void method1564(class231 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10553.method451().method3874(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loo;Lea;II)V", line = 181)
    public final void method1580(class12 arg0, class21 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field10553.method451().method3884(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class52.field615[5] = 0;
            this.field10553.method451().method3884(this, arg0, class52.field615, arg2, arg3);
            arg1.field179 = class52.field615[0];
            arg1.field184 = class52.field615[1];
            arg1.field181 = class52.field615[2];
            arg1.field182 = class52.field615[3];
            arg1.field183 = class52.field615[4];
            arg1.field180 = class52.field615[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 199)
    public final void method1562(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4227(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lao;IIII)V", line = 204)
    public class767(class52 arg0, class317 arg1, class534 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10553 = arg0;
        this.field10552 = arg1;
        this.field10551 = arg2.field7350;
        this.field10554 = arg2.field7363;
        int var8 = arg2.field7350 == null ? 0 : arg2.field7350.length;
        int var9 = arg2.field7363 == null ? 0 : arg2.field7363.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field10551[var12].field8771;
            var11[var10++] = this.field10551[var12].field8775;
            var11[var10++] = this.field10551[var12].field8760;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field10554[var13].field5944;
        }
        int var14 = arg2.field7381 == null ? 0 : arg2.field7381.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class444 var20 = arg2.field7381[var17];
            class743 var21 = class625.method3599(var20.field6153, true);
            var15[var16++] = var20.field6145;
            var15[var16++] = var21.field10234;
            var15[var16++] = var21.field10243;
            var15[var16++] = var21.field10235;
            var15[var16++] = var21.field10246;
            var15[var16++] = var21.field10236;
            var15[var16++] = var21.field10247 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class444 var19 = arg2.field7381[var18];
            var15[var16++] = var19.field6147;
        }
        this.method4226(this.field10553, this.field10552, arg2.field7343, arg2.field7354, arg2.field7374, arg2.field7375, arg2.field7395, arg2.field7365, arg2.field7394, arg2.field7359, arg2.field7344, arg2.field7371, arg2.field7385, arg2.field7347, arg2.field7349, arg2.field7361, arg2.field7386, arg2.field7351, arg2.field7342, arg2.field7388, arg2.field7379, arg2.field7382, arg2.field7369, arg2.field7380, arg2.field7341, arg2.field7370, arg2.field7356, arg2.field7346, arg2.field7377, arg2.field7355, arg2.field7368, arg2.field7391, arg2.field7367, arg2.field7384, arg2.field7364, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class767(class52 arg0) {
        this.field10553 = arg0;
        this.field10552 = null;
        this.method4223(arg0);
    }

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1545(int arg0);

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method4222(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1587();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1537();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1542(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method4223(class52 arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1561(int arg0, int arg1, class418 arg2, class418 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1560(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method1566();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1559(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1539();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1573(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method1550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method4224(class767 arg0, class767 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1565(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1548(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method450(boolean arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1567();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method4226(class52 arg0, class317 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method4227(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1582();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1552(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1575();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1569(int arg0);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1540();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1563();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1557(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1544();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method1577();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1549();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1554();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1576();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1556();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1583();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1588(int arg0);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class113 method1574(class113 arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1535(int arg0, int arg1, int arg2, int arg3);
}
