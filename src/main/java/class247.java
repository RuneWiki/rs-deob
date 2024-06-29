import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class247 extends class284 implements class2 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loa;")
    private class408 field3640;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lya;")
    private class74 field3643;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lmv;")
    public class44[] field3642;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lnba;")
    public class491[] field3641;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILih;ZII)Z")
    public final boolean method1653(int arg0, int arg1, class744 arg2, boolean arg3, int arg4, int arg5) {
        return this.field3640.method2547().method1056(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1654(class284 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3640.method2547().method1052(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1655();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1656();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1657();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method1658();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class284 method1659(byte arg0, int arg1, boolean arg2) {
        return this.field3640.method2547().method1051(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1660(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lih;)V")
    public final void method1661(class744 arg0) {
        this.method1695(class408.field5811, arg0);
        int var2 = 0;
        if (this.field3642 != null) {
            for (int var3 = 0; var3 < this.field3642.length; ++var3) {
                class44 var4 = this.field3642[var3];
                var4.field534 = class408.field5811[var2++];
                var4.field548 = class408.field5811[var2++];
                var4.field536 = class408.field5811[var2++];
                var4.field541 = class408.field5811[var2++];
                var4.field545 = class408.field5811[var2++];
                var4.field552 = class408.field5811[var2++];
                var4.field544 = class408.field5811[var2++];
                var4.field551 = class408.field5811[var2++];
                var4.field537 = class408.field5811[var2++];
            }
        }
        if (this.field3641 != null) {
            for (int var5 = 0; var5 < this.field3641.length; ++var5) {
                class491 var6 = this.field3641[var5];
                class491 var7 = var6;
                if (var6.field6902 != null) {
                    var7 = var6.field6902;
                }
                if (var6.field6900 != null) {
                    var6.field6900.method900(arg0);
                } else {
                    var6.field6900 = arg0.method906();
                }
                var7.field6898 = class408.field5811[var2++];
                var7.field6894 = class408.field5811[var2++];
                var7.field6896 = class408.field5811[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lmv;")
    public final class44[] method1662() {
        return this.field3642;
    }

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method1663(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
    public final boolean method1664() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1665(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1666();

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method1667() {
        if (this.field3640.field5823 > 1) {
            synchronized (this) {
                super.field4099 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1668();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILih;ZI)Z")
    public final boolean method1669(int arg0, int arg1, class744 arg2, boolean arg3, int arg4) {
        return this.field3640.method2547().method1053(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1670(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1671(class408 arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1672(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1673();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1674();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1675(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1676(class247 arg0, class247 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1677(int arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1678();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public final void method1679() {
        if (this.field3640.field5823 > 1) {
            synchronized (this) {
                while (super.field4099) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field4099 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1675(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1681();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lih;Lkia;II)V")
    public final void method1682(class744 arg0, class574 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3640.method2547().method1047(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class408.field5820[5] = 0;
            this.field3640.method2547().method1047(this, arg0, class408.field5820, arg2, arg3);
            arg1.field7911 = class408.field5820[0];
            arg1.field7909 = class408.field5820[1];
            arg1.field7913 = class408.field5820[2];
            arg1.field7912 = class408.field5820[3];
            arg1.field7914 = class408.field5820[4];
            arg1.field7910 = class408.field5820[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1683();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1684(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1685();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lih;Lkia;I)V")
    public final void method1686(class744 arg0, class574 arg1, int arg2) {
        if (arg1 == null) {
            this.field3640.method2547().method1071(this, arg0, (int[]) null, arg2);
        } else {
            class408.field5820[5] = 0;
            this.field3640.method2547().method1071(this, arg0, class408.field5820, arg2);
            arg1.field7911 = class408.field5820[0];
            arg1.field7909 = class408.field5820[1];
            arg1.field7913 = class408.field5820[2];
            arg1.field7912 = class408.field5820[3];
            arg1.field7914 = class408.field5820[4];
            arg1.field7910 = class408.field5820[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1687(int arg0, int arg1, class341 arg2, class341 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lnba;")
    public final class491[] method1688() {
        return this.field3641;
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1689();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1690(int arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1691(int arg0);

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method1692(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method1693();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1694(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILih;)V")
    private final void method1695(int[] arg0, class744 arg1) {
        this.field3640.method2547().method1049(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1696(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1697();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1698(class408 arg0, class74 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lih;IZ)V")
    public final void method1699(class744 arg0, int arg1, boolean arg2) {
        this.method1692(((class136) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method1700(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class709 method1701(class709 arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1702(int arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1703();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1704(int arg0);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method1705() {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lvo;IIII)V")
    public class247(class408 arg0, class74 arg1, class133 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3640 = arg0;
        this.field3643 = arg1;
        this.field3642 = arg2.field1898;
        this.field3641 = arg2.field1893;
        int var8 = arg2.field1898 == null ? 0 : arg2.field1898.length;
        int var9 = arg2.field1893 == null ? 0 : arg2.field1893.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field3642[var12].field542;
            var11[var10++] = this.field3642[var12].field550;
            var11[var10++] = this.field3642[var12].field535;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field3641[var13].field6901;
        }
        int var14 = arg2.field1904 == null ? 0 : arg2.field1904.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class15 var20 = arg2.field1904[var17];
            class238 var21 = class345.method2202(var20.field142, -25);
            var15[var16++] = var20.field144;
            var15[var16++] = var21.field3552;
            var15[var16++] = var21.field3551;
            var15[var16++] = var21.field3553;
            var15[var16++] = var21.field3541;
            var15[var16++] = var21.field3548;
            var15[var16++] = var21.field3540 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class15 var19 = arg2.field1904[var18];
            var15[var16++] = var19.field139;
        }
        this.method1698(this.field3640, this.field3643, arg2.field1903, arg2.field1852, arg2.field1866, arg2.field1899, arg2.field1878, arg2.field1889, arg2.field1879, arg2.field1865, arg2.field1901, arg2.field1870, arg2.field1871, arg2.field1892, arg2.field1900, arg2.field1855, arg2.field1860, arg2.field1867, arg2.field1896, arg2.field1890, arg2.field1897, arg2.field1884, arg2.field1881, arg2.field1875, arg2.field1894, arg2.field1859, arg2.field1880, arg2.field1864, arg2.field1883, arg2.field1856, arg2.field1872, arg2.field1868, arg2.field1887, arg2.field1873, arg2.field1861, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class247(class408 arg0) {
        this.field3640 = arg0;
        this.field3643 = null;
        this.method1671(arg0);
    }
}
