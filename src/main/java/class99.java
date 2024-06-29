import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class99 extends class261 {

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "J")
    public static volatile long field1919;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Lon;")
    public static class223 field1922;

    static {
        new class309("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field1919 = 0L;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I", line = 5)
    public final int method880(byte arg0) {
        field1915++;
        if (arg0 != 99) {
            this.method880((byte) -62);
        }
        return (this.field1911 & 0x1C9E38) >> 18;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 19)
    public final int method881(int arg0) {
        field1916++;
        return arg0 == 20740 ? class341.method2153(this.field1911, (byte) 9) : 104;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lph;II)Lfj;", line = 30)
    public static final class470 method882(class459 arg0, int arg1, int arg2) {
        field1913++;
        byte[] var3 = arg0.method2760((byte) 109, arg1);
        int var4 = -72 / ((-arg2 - 76) / 40);
        return var3 == null ? null : new class470(var3);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z", line = 47)
    public final boolean method883(int arg0) {
        field1917++;
        if (arg0 < 25) {
            return true;
        } else {
            return (this.field1911 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 58)
    public static void method884(int arg0) {
        if (arg0 == -3813) {
            field1922 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z", line = 68)
    public final boolean method885(int arg0) {
        field1921++;
        if (arg0 == 0) {
            return (this.field1911 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjava/lang/String;)V", line = 88)
    public static final void method886(int arg0, int arg1, String arg2) {
        field1914++;
        int var3 = class229.field3560;
        int[] var4 = class316.field4782;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class366 var7 = class73.field1444[var4[var6]];
            if (var7 != null && class15.field266 != var7 && var7.field5381 != null && var7.field5381.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    class246.field3795++;
                    class459.method2765(class456.field6762, (byte) 87);
                    class335.field5062.method1820(false, 0);
                    class335.field5062.method1875((byte) 101, var4[var6]);
                } else if (arg1 == 4) {
                    class459.method2765(class284.field4279, (byte) 87);
                    class405.field6104++;
                    class335.field5062.method1875((byte) 105, var4[var6]);
                    class335.field5062.method1830((byte) -47, 0);
                } else if (arg1 == 5) {
                    class25.field355++;
                    class459.method2765(class318.field4837, (byte) 87);
                    class335.field5062.method1820(false, 0);
                    class335.field5062.method1875((byte) -115, var4[var6]);
                } else if (arg1 == 6) {
                    class459.method2765(class41.field573, (byte) 87);
                    class359.field5281++;
                    class335.field5062.method1875((byte) 27, var4[var6]);
                    class335.field5062.method1874(0, 128);
                } else if (arg1 == 7) {
                    class459.method2765(class329.field4995, (byte) 87);
                    class308.field4677++;
                    class335.field5062.method1875((byte) 53, var4[var6]);
                    class335.field5062.method1874(0, 128);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class475.method2843((byte) -98, class456.field6770.method1977(class146.field2452, arg0 - 44) + arg2);
        }
        if (arg0 != -8) {
            method886(-89, -21, null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(II)V", line = 166)
    public class99(int arg0, int arg1) {
        this.field1911 = arg0;
        this.field1918 = arg1;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Z", line = 175)
    public final boolean method887(int arg0, int arg1) {
        if (arg1 >= -83) {
            this.method888(-119);
        }
        field1912++;
        return (this.field1911 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)Z", line = 186)
    public final boolean method888(int arg0) {
        field1920++;
        int var2 = -29 % ((arg0 - 52) / 35);
        return (this.field1911 >> 21 & 0x1) != 0;
    }
}
