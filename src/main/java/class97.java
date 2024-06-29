import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class97 extends class136 {

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field1846 = -32768;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field1850 = 0;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
    public boolean field1853 = false;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    private int field1852 = 0;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Lwb;")
    private class236 field1865;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lmb;")
    public static class132 field1847 = class166.method1092("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 121);

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Lmb;")
    private static class132 field1856 = class166.method1092("RuneScape has been updated(Q", 124);

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Lmb;")
    public static class132 field1858 = field1856;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "[[Lii;")
    public static class96[][] field1866;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "[[Z")
    public static boolean[][] field1859;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lug;")
    private final class221 method609(int arg0) {
        field1857++;
        if (arg0 != 1) {
            return null;
        }
        class217 var2 = class108.method689(this.field1861, arg0);
        class221 var3;
        if (this.field1853) {
            var3 = var2.method1353((byte) 117, -1);
        } else {
            var3 = var2.method1353((byte) 76, this.field1850);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public final void method610(int arg0, int arg1) {
        field1845++;
        if (this.field1853) {
            return;
        }
        if (arg1 != 24) {
            this.field1843 = -81;
        }
        this.field1852 += arg0;
        while (this.field1865.field4253[this.field1850] < this.field1852) {
            this.field1852 -= this.field1865.field4253[this.field1850];
            this.field1850++;
            if (this.field1865.field4274.length <= this.field1850) {
                this.field1853 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1847 = null;
        field1859 = null;
        field1858 = null;
        field1866 = null;
        if (arg0 != 120) {
            method615(21, null);
        }
        field1856 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIBII)V")
    public static final void method612(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1844++;
        class23.method153(arg0, class61.field1033[arg1], true, arg4 - arg2, arg4 - -arg2);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = arg5 << 1;
        int var11 = var8 << 1;
        if (arg3 > -104) {
            method614(111, (byte) 70, -109, -31, 85);
        }
        int var12 = var9 << 2;
        int var13 = var8 << 2;
        int var14 = var9 - (var10 - 1) * var11;
        int var15 = var9 << 1;
        int var16 = ((var6 << 1) + 3) * var15;
        int var17 = (1 - var10) * var8 + var15;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var12;
        int var20 = (arg5 - 1) * var13;
        while (var7 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var6++;
                    var17 += var16;
                    var16 += var12;
                    var14 += var19;
                    var19 += var12;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var19 += var12;
                var17 += var16;
                var16 += var12;
                var6++;
            }
            var7--;
            var14 += -var18;
            int var21 = arg1 - var7;
            var18 -= var13;
            int var22 = arg1 + var7;
            var17 += -var20;
            int var23 = arg4 + var6;
            var20 -= var13;
            int var24 = arg4 - var6;
            class23.method153(arg0, class61.field1033[var21], true, var24, var23);
            class23.method153(arg0, class61.field1033[var22], true, var24, var23);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLpb;I)[Lrd;")
    public static final class188[] method613(int arg0, boolean arg1, class165 arg2, int arg3) {
        field1860++;
        return class172.method1122(arg0, arg2, arg3, arg1) ? class102.method628(128) : null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIII)V")
    public static final void method614(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class169.field3161 = arg4;
        class17.field254 = arg2;
        class168.field3083 = arg3;
        field1854++;
        class135.field2542 = arg0;
        if (arg1 > -44) {
            method615(-88, null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1849++;
        class221 var11 = this.method609(1);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1846 = var11.method55();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILkd;)V")
    public static final void method615(int arg0, class112 arg1) {
        field1868++;
        if (class169.field3130 != null) {
            try {
                class169.field3130.method68(arg0 ^ 0x18, 0L);
                class169.field3130.method75(24, arg1.field2133, 1, arg1.field2157);
            } catch (Exception var2) {
            }
        }
        arg1.field2133 += arg0;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIII)V")
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1843 = arg3;
        this.field1864 = arg4;
        this.field1855 = arg1;
        this.field1851 = arg5 + arg6;
        this.field1861 = arg0;
        this.field1867 = arg2;
        int var8 = class108.method689(this.field1861, 1).field3979;
        if (var8 == -1) {
            this.field1853 = true;
        } else {
            this.field1853 = false;
            this.field1865 = class99.method619(var8, 4);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()I")
    public final int method55() {
        field1848++;
        return this.field1846;
    }
}
