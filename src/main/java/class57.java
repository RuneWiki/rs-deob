import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class57 extends class302 implements class203 {

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
    private boolean field803 = false;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private int field805 = 50;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lug;")
    private class253 field821;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Lug;")
    private class253 field799;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lod;")
    private class223 field800;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Lod;")
    private class223 field797;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Ljava/lang/String;")
    public static String field791 = "M";

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    public static int[] field790 = new int[5];

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field808 = 0;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field804 = 0;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lug;")
    public static class253 field795;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field786;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[I")
    public static int[] field789;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)I", line = 6)
    public final int method444(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method449(-108, true);
        }
        field820++;
        return this.method1806(18160, arg1).field2844 & 0xFF;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IB)[I", line = 18)
    public final int[] method445(int arg0, byte arg1) {
        field813++;
        if (arg1 > -66) {
            this.method461(-42, 121, 70);
        }
        class87 var3 = this.method462(arg0, (byte) -24);
        return var3 == null ? null : var3.method629(this, this.field799, this.field803 || this.method1806(18160, arg0).field2831);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V", line = 39)
    public final void method446(int arg0, int arg1) {
        if (arg0 != 128) {
            this.method456((byte) 13, 2);
        }
        field815++;
        this.method461(this.field803 || this.method1806(18160, arg1).field2831 ? 64 : 128, arg1, 12487);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 50)
    public static void method447(int arg0) {
        field786 = null;
        if (arg0 <= -104) {
            field789 = null;
            field791 = null;
            field790 = null;
            field795 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIFI)Lun;", line = 65)
    public final class190 method448(boolean arg0, int arg1, int arg2, float arg3, int arg4) {
        if (arg4 != 1) {
            field795 = (class253) null;
        }
        field794++;
        class87 var6 = this.method462(arg2, (byte) -24);
        if (var6 != null && var6.method630(this, this.field799)) {
            return arg0 ? var6.field1176.method1443((double) arg3, -20, arg1, false, this.field799, arg1, this) : var6.field1176.method1444(arg4 ^ 0x1, false, (double) arg3, this, this.field799, arg1, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)Z", line = 85)
    public final boolean method449(int arg0, boolean arg1) {
        if (!arg1) {
            field804 = 25;
        }
        field793++;
        return this.field803 || this.method1806(18160, arg0).field2831;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)Z", line = 101)
    public final boolean method450(int arg0, int arg1) {
        field801++;
        return arg0 == 816 ? this.method1806(18160, arg1).field2847 : true;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)Z", line = 113)
    public final boolean method451(int arg0, int arg1) {
        field822++;
        if (arg1 <= 93) {
            this.method464(109, (byte) -71);
        }
        return this.method1806(18160, arg0).field2835;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IFZ)[I", line = 124)
    public final int[] method452(int arg0, float arg1, boolean arg2) {
        field818++;
        class87 var4 = this.method462(arg0, (byte) -24);
        if (var4 == null) {
            return null;
        } else {
            var4.field1187 = arg2;
            return var4.method624(this, this.field799, arg1, this.field803 || this.method1806(18160, arg0).field2831);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)I", line = 138)
    public final int method453(int arg0, int arg1) {
        if (arg0 != 255) {
            method447(30);
        }
        field819++;
        return this.method1806(18160, arg1).field2827 & 0xFF;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IB)I", line = 156)
    public final int method454(int arg0, byte arg1) {
        field788++;
        return arg1 == 88 ? this.method1806(18160, arg0).field2840 & 0xFF : -45;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(IB)Laf;", line = 169)
    public final class195 method455(int arg0, byte arg1) {
        if (arg1 == -55) {
            field809++;
            class87 var3 = this.method462(arg0, (byte) -24);
            return var3 == null ? null : var3.field1176;
        } else {
            return (class195) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I", line = 186)
    public final int method456(byte arg0, int arg1) {
        if (arg0 <= 107) {
            this.method444(-96, 125);
        }
        field816++;
        return this.method1806(18160, arg1).field2845 & 0xFF;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(II)Z", line = 198)
    public final boolean method457(int arg0, int arg1) {
        field810++;
        if (arg1 >= -35) {
            field790 = (int[]) null;
        }
        class87 var3 = this.method462(arg0, (byte) -24);
        return var3 == null ? false : var3.method630(this, this.field799);
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(II)I", line = 214)
    public final int method458(int arg0, int arg1) {
        if (arg0 != 17701) {
            this.method461(48, -79, 103);
        }
        field814++;
        return this.method1806(arg0 ^ 0x3D5, arg1).field2836 & 0xFFFF;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IZ)V", line = 228)
    public final void method459(int arg0, boolean arg1) {
        this.field803 = arg1;
        if (arg0 != 65535) {
            this.method455(78, (byte) -84);
        }
        this.method463(false);
        field807++;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lug;Lug;Lug;IZ)V", line = 421)
    public class57(class253 arg0, class253 arg1, class253 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field821 = arg0;
        this.field799 = arg2;
        this.field803 = arg4;
        this.field805 = arg3;
        this.field800 = new class223(this.field805);
        if (class109.field1458) {
            this.field797 = new class223(this.field805);
        } else {
            this.field797 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "(II)V", line = 250)
    public final void method460(int arg0, int arg1) {
        for (class87 var3 = (class87) this.field800.method1629(false); var3 != null; var3 = (class87) this.field800.method1633((byte) -117)) {
            if (var3.field1187) {
                var3.method625(arg1);
                var3.field1187 = false;
            }
        }
        if (arg0 <= 112) {
            field791 = (String) null;
        }
        field811++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V", line = 276)
    public final void method461(int arg0, int arg1, int arg2) {
        class256.method1855(this.method1806(18160, arg1).field2827 & 0xFF, -125, this.method1806(18160, arg1).field2840 & 0xFF);
        field796++;
        boolean var4 = false;
        class87 var5 = this.method462(arg1, (byte) -24);
        if (var5 != null) {
            var4 = var5.method626(this, this.field799, arg0);
        }
        if (arg2 != 12487) {
            this.method449(-10, true);
        }
        if (!var4) {
            class256 var6 = this.method464(arg1, (byte) 20);
            var6.method1856(100);
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(IB)Lta;", line = 312)
    private final class87 method462(int arg0, byte arg1) {
        field802++;
        if (arg1 != -24) {
            this.method445(-43, (byte) 82);
        }
        class87 var3 = (class87) this.field800.method1628(true, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field821.method1813(0, arg0, true);
        if (var4 == null) {
            return null;
        } else {
            class87 var5 = new class87(new class6(var4));
            this.field800.method1627((byte) 97, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 341)
    public final void method463(boolean arg0) {
        this.field800.method1630(arg0);
        field792++;
        if (this.field797 != null) {
            this.field797.method1630(false);
        }
        if (arg0) {
            this.method458(70, 117);
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(IB)Lkj;", line = 357)
    private final class256 method464(int arg0, byte arg1) {
        field787++;
        class256 var3 = (class256) this.field797.method1628(true, (long) arg0);
        if (var3 == null) {
            class256 var4 = new class256(this.method1806(18160, arg0).field2836 & 0xFFFF);
            this.field797.method1627((byte) 97, var4, (long) arg0);
            int var5 = 99 / ((arg1 + 47) / 42);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Z", line = 376)
    public final boolean method465(boolean arg0, int arg1) {
        if (arg0) {
            field817++;
            return !this.method1806(18160, arg1).field2842;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(BI)V", line = 393)
    public final void method466(byte arg0, int arg1) {
        this.field805 = arg1;
        this.field800 = new class223(this.field805);
        if (class109.field1458) {
            this.field797 = new class223(this.field805);
        } else {
            this.field797 = null;
        }
        field785++;
        if (arg0 < 78) {
            this.method452(-21, 0.1050862F, true);
        }
    }
}
