import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class313 {

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
    public boolean field4791 = false;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ler;")
    private class157 field4793 = new class157(64);

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Ler;")
    public class157 field4794 = new class157(500);

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Ler;")
    public class157 field4795 = new class157(30);

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Ler;")
    public class157 field4796 = new class157(50);

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lns;")
    private class438 field4790;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
    public boolean field4776;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lns;")
    public class438 field4784;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lui;")
    public static class375 field4775 = new class375("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4781 = "";

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
    public static int[] field4792 = new int[4096];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[Lsu;")
    public static class367[] field4787;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 5)
    public final void method2028(int arg0, int arg1) {
        this.field4797 = arg0;
        field4778++;
        class157 var3 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1015((byte) 115);
        }
        class157 var4 = this.field4795;
        synchronized (this.field4795) {
            this.field4795.method1015((byte) 90);
            if (arg1 != 16383) {
                method2036(60, 34, -110, -38, 40, -3, 32, 10);
            }
        }
        class157 var5 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1015((byte) 88);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V", line = 25)
    public final void method2029(int arg0, boolean arg1) {
        class157 var3 = this.field4793;
        synchronized (this.field4793) {
            this.field4793.method1016(arg0, (byte) 124);
        }
        field4779++;
        class157 var4 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1016(arg0, (byte) 121);
        }
        class157 var5 = this.field4795;
        synchronized (this.field4795) {
            if (arg1) {
                return;
            }
            this.field4795.method1016(arg0, (byte) 127);
        }
        class157 var6 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1016(arg0, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Component;)Lat;", line = 55)
    public static final class106 method2030(int arg0, Component arg1) {
        if (arg0 != 100) {
            field4781 = null;
        }
        field4780++;
        return new class152(arg1);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Leu;", line = 66)
    public final class130 method2031(int arg0, int arg1) {
        field4785++;
        class157 var3 = this.field4793;
        class130 var4;
        synchronized (this.field4793) {
            var4 = (class130) this.field4793.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4790.method2650(class156.method1009(false, arg1), -83, class483.method2881((byte) 81, arg1));
        class130 var6 = new class130();
        var6.field1826 = arg1;
        var6.field1881 = this;
        if (var5 != null) {
            var6.method825(new class91(var5), (byte) 78);
        }
        var6.method835((byte) -84);
        if (var6.field1893) {
            var6.field1869 = false;
            var6.field1897 = 0;
        }
        if (!this.field4776 && var6.field1842) {
            var6.field1870 = null;
            var6.field1883 = null;
        }
        class157 var7 = this.field4793;
        synchronized (this.field4793) {
            int var8 = -100 / ((70 - arg0) / 37);
            this.field4793.method1012(-88, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V", line = 108)
    public final void method2032(int arg0, int arg1) {
        field4783++;
        this.field4793 = new class157(arg1);
        if (arg0 != -32232) {
            method2030(-22, null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 120)
    public static void method2033(int arg0) {
        field4775 = null;
        field4792 = null;
        field4781 = null;
        if (arg0 >= -23) {
            method2033(77);
        }
        field4787 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 133)
    public final void method2034(byte arg0) {
        field4789++;
        class157 var2 = this.field4793;
        synchronized (this.field4793) {
            this.field4793.method1022((byte) -34);
        }
        class157 var3 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1022((byte) -34);
        }
        class157 var4 = this.field4795;
        synchronized (this.field4795) {
            this.field4795.method1022((byte) -34);
            if (arg0 != -11) {
                field4787 = null;
            }
        }
        class157 var5 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V", line = 160)
    public final void method2035(boolean arg0, int arg1) {
        field4786++;
        if (this.field4776 == arg0) {
            return;
        }
        this.field4776 = arg0;
        if (arg1 >= -60) {
            this.method2032(60, -45);
        }
        this.method2038(-88);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V", line = 183)
    public static final void method2036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4777++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class208.field2940 - class462.field6767) * var8 / 100 + class462.field6767;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg3 & arg2;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class525.field7760[var11] * -var10 >> 15;
            var15 = class525.field7763[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class525.field7760[var12] * var15 >> 15;
            var15 = class525.field7763[var12] * var15 >> 15;
        }
        class30.field461 = arg3;
        class301.field4447 = arg1 - var15;
        class522.field7715 = 0;
        class353.field5478 = arg0;
        class154.field2246 = arg7 - var14;
        class34.field539 = arg6 - var13;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZI)V", line = 233)
    public final void method2037(boolean arg0, int arg1) {
        field4788++;
        if (this.field4791 == arg0) {
            return;
        }
        this.field4791 = arg0;
        if (arg1 != -148568433) {
            this.field4791 = false;
        }
        this.method2038(-90);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 252)
    public final void method2038(int arg0) {
        field4782++;
        class157 var2 = this.field4793;
        synchronized (this.field4793) {
            this.field4793.method1015((byte) 111);
        }
        class157 var3 = this.field4794;
        synchronized (this.field4794) {
            this.field4794.method1015((byte) 108);
        }
        class157 var4 = this.field4795;
        synchronized (this.field4795) {
            this.field4795.method1015((byte) 104);
        }
        class157 var5 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1015((byte) 114);
        }
        if (arg0 >= -60) {
            field4792 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lgo;IZLns;Lns;)V", line = 301)
    public class313(class331 arg0, int arg1, boolean arg2, class438 arg3, class438 arg4) {
        this.field4790 = arg3;
        this.field4776 = arg2;
        this.field4784 = arg4;
        if (this.field4790 != null) {
            int var6 = this.field4790.method2649(-67) - 1;
            this.field4790.method2645(1, var6);
        }
    }
}
