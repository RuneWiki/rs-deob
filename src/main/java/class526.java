import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class526 extends class4 {

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    private int field7304;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field7303 = 0;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "Lbaa;")
    public static class130 field7306 = new class130(16);

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "[Lmp;")
    public class317[] field7300;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "[[B")
    private byte[][] field7301;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Z")
    public final boolean method3123(boolean arg0) {
        field7307++;
        if (this.field7300 != null) {
            return true;
        }
        if (this.field7301 == null) {
            class237 var2 = class240.field3595;
            synchronized (class240.field3595) {
                if (!class240.field3595.method1586((byte) -95, this.field7304)) {
                    return false;
                }
                int[] var4 = class240.field3595.method1585(this.field7304, false);
                this.field7301 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field7301[var5] = class240.field3595.method1572(this.field7304, 0, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field7301.length; var7++) {
            byte[] var8 = this.field7301[var7];
            class63 var9 = new class63(var8);
            var9.field956 = 1;
            int var10 = var9.method482(-772591672);
            class237 var11 = class254.field3718;
            synchronized (class254.field3718) {
                var6 &= class254.field3718.method1578(var10, (byte) -81);
            }
        }
        if (!var6) {
            return false;
        }
        class646 var12 = new class646();
        class237 var13 = class240.field3595;
        int[] var15;
        synchronized (class240.field3595) {
            int var14 = class240.field3595.method1597(this.field7304, 0);
            this.field7300 = new class317[var14];
            var15 = class240.field3595.method1585(this.field7304, arg0);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field7301[var16];
            class63 var18 = new class63(var17);
            var18.field956 = 1;
            int var19 = var18.method482(-772591672);
            class454 var20 = null;
            for (class454 var21 = (class454) var12.method3618(-112); var21 != null; var21 = (class454) var12.method3619(0)) {
                if (var21.field6291 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class237 var22 = class254.field3718;
                synchronized (class254.field3718) {
                    var20 = new class454(var19, class254.field3718.method1583(var19, -106));
                }
                var12.method3610(9289, var20);
            }
            this.field7300[var15[var16]] = new class317(var17, var20);
        }
        this.field7301 = null;
        return true;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Z")
    public static final boolean method3124(int arg0, int arg1, int arg2) {
        if (arg2 != 65536) {
            field7303 = 15;
        }
        field7305++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method3125(int arg0) {
        field7306 = null;
        if (arg0 != -1240060948) {
            method3129(true, -95);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
    public class526(int arg0) {
        this.field7304 = arg0;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)Z")
    public final boolean method3126(int arg0, boolean arg1) {
        field7310++;
        if (!arg1) {
            this.field7300 = null;
        }
        return this.field7300[arg0].field4392;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
    public final boolean method3127(int arg0, int arg1) {
        if (arg1 >= -56) {
            this.method3123(true);
        }
        field7309++;
        return this.field7300[arg0].field4394;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
    public static final void method3128(int arg0) {
        field7302++;
        for (class6 var1 = (class6) class755.field10409.method3618(arg0 + 98); var1 != null; var1 = (class6) class755.field10409.method3619(arg0 ^ 0x1)) {
            if (var1.field56) {
                var1.method549(6410);
            } else {
                var1.field42 = true;
                if (var1.field53 >= 0 && var1.field41 >= 0 && var1.field53 < class277.field4036 && var1.field41 < class667.field9202) {
                    class449.method2732(-1389, var1);
                }
            }
        }
        if (arg0 != 1) {
            field7303 = 12;
        }
        for (class6 var2 = (class6) class159.field2226.method3618(arg0 + 118); var2 != null; var2 = (class6) class159.field2226.method3619(arg0 ^ 0x1)) {
            if (var2.field56) {
                var2.method549(arg0 ^ 0x190B);
            } else {
                var2.field42 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)I")
    public static final int method3129(boolean arg0, int arg1) {
        field7311++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (!arg0) {
            field7306 = null;
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z")
    public final boolean method3130(int arg0, int arg1) {
        if (arg1 != -1) {
            method3128(-1);
        }
        field7308++;
        return this.field7300[arg0].field4395;
    }
}
