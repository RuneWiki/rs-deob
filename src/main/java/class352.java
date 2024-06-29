import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class352 extends class377 implements class130 {

    @OriginalMember(owner = "client!xa", name = "t", descriptor = "Lw;")
    private class199 field5059;

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "Lg;")
    private class109 field5057;

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "[Lck;")
    public class462[] field5056;

    @OriginalMember(owner = "client!xa", name = "s", descriptor = "[Lsd;")
    public class63[] field5058;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method1599(int arg0);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method1584();

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()Z")
    public final boolean method1619() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lsd;")
    public final class63[] method1579() {
        return this.field5058;
    }

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method1582(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2086(class199 arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method1580(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method1606(int arg0);

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2087(class352 arg0, class352 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method1585();

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method1592(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method1591(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method1617();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V")
    public final void method2088(int arg0, class125 arg1) {
        int var3 = arg0;
        if (this.field5056 != null) {
            for (int var4 = 0; var4 < this.field5056.length; var4++) {
                class462 var5 = this.field5056[var4];
                var5.field6454 = class199.field2829[var3++];
                var5.field6467 = class199.field2829[var3++];
                var5.field6453 = class199.field2829[var3++];
                var5.field6463 = class199.field2829[var3++];
                var5.field6455 = class199.field2829[var3++];
                var5.field6469 = class199.field2829[var3++];
                var5.field6456 = class199.field2829[var3++];
                var5.field6459 = class199.field2829[var3++];
                var5.field6466 = class199.field2829[var3++];
            }
        }
        if (this.field5058 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5058.length; var6++) {
            class63 var7 = this.field5058[var6];
            class63 var8 = var7;
            if (var7.field794 != null) {
                var8 = var7.field794;
            }
            if (var7.field800 == null) {
                var7.field800 = arg1.method827();
            } else {
                var7.field800.method828(arg1);
            }
            var8.field798 = class199.field2829[var3++];
            var8.field787 = class199.field2829[var3++];
            var8.field785 = class199.field2829[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method1612(int arg0);

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2089(class199 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()V")
    public final void method1587() {
    }

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method1618(int arg0);

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method1570(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method1594(int arg0);

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method1610(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method1562(class377 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5059.method1263().method2398(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method1604();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method1616(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lwp;II)V")
    public final void method1598(class125 arg0, class122 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field5059.method1263().method2389(this, arg0, null, arg2, arg3);
            return;
        }
        class199.field2830[5] = 0;
        this.field5059.method1263().method2389(this, arg0, class199.field2830, arg2, arg3);
        arg1.field1675 = class199.field2830[0];
        arg1.field1671 = class199.field2830[1];
        arg1.field1673 = class199.field2830[2];
        arg1.field1674 = class199.field2830[3];
        arg1.field1676 = class199.field2830[4];
        arg1.field1672 = class199.field2830[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method1586(int arg0, int arg1, class125 arg2, boolean arg3) {
        return this.field5059.method1263().method2397(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method1607();

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method1568();

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method1605();

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method1596();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method1613();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;")
    public final class377 method1590(byte arg0, int arg1, boolean arg2) {
        return this.field5059.method1263().method2391(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method1597();

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method1573();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lwp;I)V")
    public final void method1566(class125 arg0, class122 arg1, int arg2) {
        if (arg1 == null) {
            this.field5059.method1263().method2390(this, arg0, null, arg2);
            return;
        }
        class199.field2830[5] = 0;
        this.field5059.method1263().method2390(this, arg0, class199.field2830, arg2);
        arg1.field1675 = class199.field2830[0];
        arg1.field1671 = class199.field2830[1];
        arg1.field1673 = class199.field2830[2];
        arg1.field1674 = class199.field2830[3];
        arg1.field1676 = class199.field2830[4];
        arg1.field1672 = class199.field2830[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method1600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class31 method1614(class31 arg0);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-118, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method1576();

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method1583();

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method1595(int arg0);

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method1581(int arg0);

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lck;")
    public final class462[] method1593() {
        return this.field5056;
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lld;IIII)V")
    public class352(class199 arg0, class109 arg1, class117 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5059 = arg0;
        this.field5057 = arg1;
        this.field5056 = arg2.field1612;
        this.field5058 = arg2.field1614;
        int var8 = arg2.field1612 == null ? 0 : arg2.field1612.length;
        int var9 = arg2.field1614 == null ? 0 : arg2.field1614.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field5056[var12].field6462;
            var11[var10++] = this.field5056[var12].field6460;
            var11[var10++] = this.field5056[var12].field6449;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field5058[var13].field797;
        }
        int var14 = arg2.field1632 == null ? 0 : arg2.field1632.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class492 var20 = arg2.field1632[var17];
            class29 var21 = class454.method2652((byte) -73, var20.field6963);
            var15[var16++] = var20.field6962;
            var15[var16++] = var21.field350;
            var15[var16++] = var21.field348;
            var15[var16++] = var21.field355;
            var15[var16++] = var21.field346;
            var15[var16++] = var21.field354;
            var15[var16++] = var21.field343 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class492 var19 = arg2.field1632[var18];
            var15[var16++] = var19.field6957;
        }
        this.method2089(this.field5059, this.field5057, arg2.field1596, arg2.field1609, arg2.field1627, arg2.field1598, arg2.field1595, arg2.field1626, arg2.field1590, arg2.field1615, arg2.field1610, arg2.field1591, arg2.field1621, arg2.field1597, arg2.field1607, arg2.field1616, arg2.field1586, arg2.field1623, arg2.field1606, arg2.field1630, arg2.field1613, arg2.field1604, arg2.field1579, arg2.field1582, arg2.field1592, arg2.field1625, arg2.field1624, arg2.field1628, arg2.field1620, arg2.field1588, arg2.field1593, arg2.field1601, arg2.field1599, arg2.field1589, arg2.field1583, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V")
    public class352(class199 arg0) {
        this.field5059 = arg0;
        this.field5057 = null;
        this.method2086(arg0);
    }
}
