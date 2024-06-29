import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class497 implements class558 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Loa;")
    private class721 field513;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lya;")
    private class59 field516;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Ljk;")
    public class659[] field515;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lhja;")
    public class426[] field514;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqq;ZI)Z", line = 3)
    public final boolean method297(int arg0, int arg1, class501 arg2, boolean arg3, int arg4) {
        return this.field513.method5256().method4745(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 9)
    public final void method300(class497 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field513.method5256().method4730(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 13)
    public final void method303(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqq;IZ)V", line = 17)
    public final void method304(class501 arg0, int arg1, boolean arg2) {
        this.method318(((class292) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqq;ZII)Z", line = 32)
    public final boolean method314(int arg0, int arg1, class501 arg2, boolean arg3, int arg4, int arg5) {
        return this.field513.method5256().method4743(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 35)
    public final void method315() {
        if (this.field513.field10453 > 1) {
            synchronized (this) {
                super.field7195 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 45)
    public final void method316() {
        if (this.field513.field10453 > 1) {
            synchronized (this) {
                while (super.field7195) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field7195 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILqq;)V", line = 63)
    private final void method317(int[] arg0, class501 arg1) {
        this.field513.method5256().method4720(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 69)
    public final void method320(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method346(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 74)
    public final void method322() {
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 77)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -125, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqq;Lng;II)V", line = 82)
    public final void method323(class501 arg0, class359 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field513.method5256().method4723(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class721.field10439[5] = 0;
            this.field513.method5256().method4723(this, arg0, class721.field10439, arg2, arg3);
            arg1.field5494 = class721.field10439[0];
            arg1.field5493 = class721.field10439[1];
            arg1.field5496 = class721.field10439[2];
            arg1.field5497 = class721.field10439[3];
            arg1.field5495 = class721.field10439[4];
            arg1.field5492 = class721.field10439[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Ljk;", line = 98)
    public final class659[] method324() {
        return this.field515;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 109)
    public final class497 method332(byte arg0, int arg1, boolean arg2) {
        return this.field513.method5256().method4729(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqq;Lng;I)V", line = 112)
    public final void method333(class501 arg0, class359 arg1, int arg2) {
        if (arg1 == null) {
            this.field513.method5256().method4733(this, arg0, (int[]) null, arg2);
        } else {
            class721.field10439[5] = 0;
            this.field513.method5256().method4733(this, arg0, class721.field10439, arg2);
            arg1.field5494 = class721.field10439[0];
            arg1.field5493 = class721.field10439[1];
            arg1.field5496 = class721.field10439[2];
            arg1.field5497 = class721.field10439[3];
            arg1.field5495 = class721.field10439[4];
            arg1.field5492 = class721.field10439[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()Z", line = 138)
    public final boolean method343() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lhja;", line = 144)
    public final class426[] method345() {
        return this.field514;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lju;IIII)V", line = 147)
    public class44(class721 arg0, class59 arg1, class137 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field513 = arg0;
        this.field516 = arg1;
        this.field515 = arg2.field1614;
        this.field514 = arg2.field1601;
        int var8 = arg2.field1614 == null ? 0 : arg2.field1614.length;
        int var9 = arg2.field1601 == null ? 0 : arg2.field1601.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field515[var12].field9511;
            var11[var10++] = this.field515[var12].field9501;
            var11[var10++] = this.field515[var12].field9521;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field514[var13].field6279;
        }
        int var14 = arg2.field1581 == null ? 0 : arg2.field1581.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class254 var20 = arg2.field1581[var17];
            class577 var21 = class138.method1182(var20.field3937, -108);
            var15[var16++] = var20.field3938;
            var15[var16++] = var21.field8566;
            var15[var16++] = var21.field8561;
            var15[var16++] = var21.field8559;
            var15[var16++] = var21.field8557;
            var15[var16++] = var21.field8560;
            var15[var16++] = var21.field8563 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class254 var19 = arg2.field1581[var18];
            var15[var16++] = var19.field3945;
        }
        this.method308(this.field513, this.field516, arg2.field1619, arg2.field1600, arg2.field1592, arg2.field1595, arg2.field1597, arg2.field1586, arg2.field1632, arg2.field1624, arg2.field1605, arg2.field1628, arg2.field1589, arg2.field1617, arg2.field1621, arg2.field1591, arg2.field1620, arg2.field1625, arg2.field1618, arg2.field1610, arg2.field1587, arg2.field1593, arg2.field1616, arg2.field1633, arg2.field1622, arg2.field1590, arg2.field1607, arg2.field1594, arg2.field1603, arg2.field1588, arg2.field1606, arg2.field1608, arg2.field1612, arg2.field1599, arg2.field1629, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 218)
    public class44(class721 arg0) {
        this.field513 = arg0;
        this.field516 = null;
        this.method328(arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqq;)V", line = 226)
    public final void method349(class501 arg0) {
        this.method317(class721.field10443, arg0);
        int var2 = 0;
        if (this.field515 != null) {
            for (int var3 = 0; var3 < this.field515.length; ++var3) {
                class659 var4 = this.field515[var3];
                var4.field9514 = class721.field10443[var2++];
                var4.field9499 = class721.field10443[var2++];
                var4.field9519 = class721.field10443[var2++];
                var4.field9516 = class721.field10443[var2++];
                var4.field9520 = class721.field10443[var2++];
                var4.field9507 = class721.field10443[var2++];
                var4.field9515 = class721.field10443[var2++];
                var4.field9505 = class721.field10443[var2++];
                var4.field9518 = class721.field10443[var2++];
            }
        }
        if (this.field514 != null) {
            for (int var5 = 0; var5 < this.field514.length; ++var5) {
                class426 var6 = this.field514[var5];
                class426 var7 = var6;
                if (var6.field6284 != null) {
                    var7 = var6.field6284;
                }
                if (var6.field6276 != null) {
                    var6.field6276.method2377(arg0);
                } else {
                    var6.field6276 = arg0.method2379();
                }
                var7.field6280 = class721.field10443[var2++];
                var7.field6272 = class721.field10443[var2++];
                var7.field6277 = class721.field10443[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method298(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method299(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class194 method301(class194 arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method302(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method307();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method308(class721 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method310();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method311(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method312(int arg0);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method313();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method130(boolean arg0);

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method318(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method319(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method321();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method325(int arg0);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method326();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method327();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method328(class721 arg0);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method329(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method330();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method331(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method334();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method335();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method336();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method337();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method338(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method339(int arg0);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method340();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method341();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method342();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method344(int arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method346(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method347(int arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method348(int arg0);
}
