import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class313 extends class123 {

    @OriginalMember(owner = "client!ib", name = "gc", descriptor = "Z")
    public static boolean field4848 = false;

    @OriginalMember(owner = "client!ib", name = "sc", descriptor = "I")
    public static int field4860 = 0;

    @OriginalMember(owner = "client!ib", name = "qc", descriptor = "I")
    public static int field4858 = 0;

    @OriginalMember(owner = "client!ib", name = "xc", descriptor = "I")
    public static int field4865 = 0;

    @OriginalMember(owner = "client!ib", name = "fc", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ib", name = "hc", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ib", name = "ic", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!ib", name = "jc", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ib", name = "kc", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ib", name = "lc", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ib", name = "mc", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ib", name = "nc", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ib", name = "oc", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ib", name = "pc", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ib", name = "tc", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ib", name = "uc", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ib", name = "vc", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ib", name = "wc", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ib", name = "yc", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ib", name = "rc", descriptor = "Lhi;")
    public class206 field4859;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIII)V", line = 7)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != 0) {
            return;
        }
        field4861++;
        class241 var10 = null;
        for (class241 var11 = (class241) class273.field4229.method636(-1); var11 != null; var11 = (class241) class273.field4229.method638(53)) {
            if (var11.field3851 == arg5 && var11.field3859 == arg6 && var11.field3843 == arg0 && var11.field3844 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class241();
            var10.field3859 = arg6;
            var10.field3844 = arg3;
            var10.field3851 = arg5;
            var10.field3843 = arg0;
            class35.method291(0, var10);
            class273.field4229.method632(arg4 ^ 0xFFFFFFCE, var10);
        }
        var10.field3850 = arg9;
        var10.field3863 = arg8;
        var10.field3855 = arg2;
        var10.field3860 = arg1;
        var10.field3847 = arg7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[B", line = 49)
    public static final byte[] method2122(int arg0, byte arg1) {
        class30 var2 = (class30) class289.field4506.method443(-2, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class85.method615(var4, var7, true);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class30(var3);
            class289.field4506.method439(var2, (long) arg0, (byte) 18);
        }
        if (arg1 == 87) {
            field4864++;
            return var2.field433;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 98)
    public static final void method2123(int arg0) {
        field4866++;
        if (class298.field4599) {
            return;
        }
        class232.field3672 = true;
        class298.field4599 = true;
        if (class139.field2170) {
            class259.field4063 = (float) ((int) class259.field4063 + 191 & 0xFFFFFF80);
        } else {
            class193.field2888 += (24.0F - class193.field2888) / 2.0F;
        }
        if (arg0 != -11146) {
            method2122(-43, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lwb;III)V", line = 121)
    public static final void method2124(class253 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class50.field817) {
            class142 var4 = class256.field4013[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2196 != null && var4.field2196.field4297.method162()) {
                arg0.method184(var4.field2196.field4297, 128, 0, 0, true);
            }
        }
        if (arg3 < class50.field817) {
            class142 var5 = class256.field4013[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2196 != null && var5.field2196.field4297.method162()) {
                arg0.method184(var5.field2196.field4297, 0, 0, 128, true);
            }
        }
        if (arg2 < class50.field817 && arg3 < class267.field4171) {
            class142 var6 = class256.field4013[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2196 != null && var6.field2196.field4297.method162()) {
                arg0.method184(var6.field2196.field4297, 128, 0, 128, true);
            }
        }
        if (arg2 < class50.field817 && arg3 > 0) {
            class142 var7 = class256.field4013[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2196 != null && var7.field2196.field4297.method162()) {
                arg0.method184(var7.field2196.field4297, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V", line = 170)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4855++;
        if (this.field4859 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I", line = 184)
    public final int method76() {
        field4852++;
        return this.field1927;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I", line = 202)
    public final int method279(byte arg0) {
        if (arg0 != 26) {
            this.field4859 = (class206) null;
        }
        field4847++;
        if (class288.field4491 != 0 && this.field4859.field3120 != null) {
            class206 var2 = this.field4859.method1465(51);
            if (var2 != null && var2.field3138 != -1) {
                return var2.field3138;
            }
        }
        return this.field1883;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 228)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field4854++;
        if (this.field4859 == null) {
            return;
        }
        class281 var13 = this.field1912 != -1 && this.field1881 == 0 ? class133.method948(this.field1912, (byte) 33) : null;
        class281 var14 = this.field1872 == -1 || this.field1872 == this.method888(0).field5206 && var13 != null ? null : class133.method948(this.field1872, (byte) 33);
        class221 var15 = this.field4859.method1461(this.field1911, this.field1952, true, this.field1873, this.field1880, this.field1926, this.field1954, var13, var14, this.field1908);
        if (var15 == null) {
            return;
        }
        this.field1927 = var15.method76();
        class206 var16 = this.field4859;
        if (var16.field3120 != null) {
            var16 = var16.method1465(63);
        }
        if (class217.field3303 && var16.field3113) {
            class221 var17 = class40.method328(true, this.field1909, this.field4859.field3112, var15, this.field1868, this.field4859.field3155, this.field1919, this.field4859.field3105, this.field1905, this.field4859.field3152, var14 == null ? this.field1952 : this.field1873, this.field4859.field3118, var14 == null ? var13 : var14, arg0);
            if (class94.field1516) {
                float var18 = class94.method694();
                float var19 = class94.method672();
                class94.method674();
                class94.method680(var18, var19 - 150.0F);
                var17.method75(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1876);
                class94.method683();
                class94.method680(var18, var19);
            } else {
                var17.method75(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1876);
            }
        }
        this.method892(var15, 64);
        class221 var20 = null;
        this.method890(0, var15, arg0);
        if (this.field1951 != -1 && this.field1885 != -1) {
            class265 var21 = class112.method831(this.field1951, true);
            var20 = var21.method1809(this.field1866, 2, this.field1904, this.field1885);
            if (var20 != null) {
                var20.method160(0, -this.field1934, 0);
                if (var21.field4125) {
                    if (class88.field1419 != 0) {
                        var20.method204(class88.field1419);
                    }
                    if (class97.field1554 != 0) {
                        var20.method168(class97.field1554);
                    }
                    if (class247.field3919 != 0) {
                        var20.method160(0, class247.field3919, 0);
                    }
                }
            }
        }
        if (!class94.field1516) {
            if (var20 != null) {
                var15 = ((class66) var15).method498(var20);
            }
            if (this.field4859.field3118 == 1) {
                var15.field3534 = true;
            }
            var15.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
            return;
        }
        if (this.field4859.field3118 == 1) {
            var15.field3534 = true;
        }
        var15.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
        if (var20 != null) {
            if (this.field4859.field3118 == 1) {
                var20.field3534 = true;
            }
            var20.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Lgm;", line = 344)
    public static final class249 method2125(int arg0) {
        field4856++;
        if (arg0 != -11032) {
            return (class249) null;
        }
        int var1 = class75.field1215[0] * class73.field1201[0];
        byte[] var2 = class306.field4757[0];
        class249 var5;
        if (class270.field4200[0]) {
            byte[] var6 = class292.field4537[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class222.method1577(class63.field1002[class270.method1860(var2[var8], 255)], class270.method1860(-16777216, var6[var8] << 24));
            }
            var5 = new class262(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class63.field1002[class270.method1860(var2[var4], 255)];
            }
            var5 = new class249(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], var3);
        }
        class7.method56((byte) 59);
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lhi;I)V", line = 391)
    public final void method2126(class206 arg0, int arg1) {
        this.field4859 = arg0;
        if (arg1 == 18570) {
            field4849++;
            if (this.field1876 != null) {
                this.field1876.method491();
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V", line = 415)
    protected final void finalize() {
        field4857++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Z", line = 426)
    public final boolean method278(int arg0) {
        if (arg0 == -5324) {
            field4862++;
            return this.field4859 != null;
        } else {
            return false;
        }
    }
}
