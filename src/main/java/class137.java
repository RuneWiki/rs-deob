import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class137 extends class203 {

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Lng;")
    public class76 field2420 = new class76();

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "Lgk;")
    public class157 field2424 = new class157();

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lec;")
    private class23 field2404;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Ltf;")
    public static class107 field2411 = null;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Loa;")
    public static class99 field2416 = class221.method1463(2844, "0(U");

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field2405 = 1;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "Loa;")
    public static class99 field2418 = class221.method1463(2844, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Loa;")
    public static class99 field2415 = class221.method1463(2844, "_");

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field2414 = 100;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Z")
    public static boolean field2412 = false;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
    public static int[] field2423 = new int[32];

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "J")
    public static long field2417;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Ljd;")
    public static class87 field2408;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLej;I)V")
    private final void method935(byte arg0, class50 arg1, int arg2) {
        if ((this.field2404.field283[arg1.field823] & 0x4) != 0 && arg1.field827 < 0) {
            int var4 = this.field2404.field317[arg1.field823] / class225.field3905;
            int var5 = (var4 + 1048575 - arg1.field816) / var4;
            arg1.field816 = arg2 * var4 + arg1.field816 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2404.field306[arg1.field823] == 0) {
                    arg1.field820 = class286.method1904(arg1.field828, arg1.field820.method1911(), arg1.field820.method1900(), arg1.field820.method1914());
                } else {
                    arg1.field820 = class286.method1904(arg1.field828, arg1.field820.method1911(), 0, arg1.field820.method1914());
                    this.field2404.method169(arg1, 8, arg1.field818.field230[arg1.field807] < 0);
                }
                if (arg1.field818.field230[arg1.field807] < 0) {
                    arg1.field820.method1896(-1);
                }
                arg2 = arg1.field816 / var4;
            }
        }
        field2421++;
        arg1.field820.method177(arg2);
        int var6 = -82 % ((-arg0 - 30) / 53);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
    public final void method159(int[] arg0, int arg1, int arg2) {
        field2419++;
        this.field2424.method159(arg0, arg1, arg2);
        for (class50 var4 = (class50) this.field2420.method529(10); var4 != null; var4 = (class50) this.field2420.method533(-54)) {
            if (!this.field2404.method149(var4, 15383)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field805) {
                        this.method936(true, arg0, var6, var4, var5 + var6, var5);
                        var4.field805 -= var6;
                        break;
                    }
                    this.method936(true, arg0, var4.field805, var4, var5 + var6, var5);
                    var5 += var4.field805;
                    var6 -= var4.field805;
                } while (!this.field2404.method155(var4, arg0, var6, var5, 0));
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z[IILej;II)V")
    private final void method936(boolean arg0, int[] arg1, int arg2, class50 arg3, int arg4, int arg5) {
        if ((this.field2404.field283[arg3.field823] & 0x4) != 0 && arg3.field827 < 0) {
            int var7 = this.field2404.field317[arg3.field823] / class225.field3905;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field816) / var7;
                if (arg2 < var8) {
                    arg3.field816 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg3.field820.method159(arg1, arg5, var8);
                arg5 += var8;
                int var9 = class225.field3905 / 100;
                int var10 = 262144 / var7;
                arg3.field816 += var7 * var8 - 1048576;
                class286 var11 = arg3.field820;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field2404.field306[arg3.field823] == 0) {
                    arg3.field820 = class286.method1904(arg3.field828, var11.method1911(), var11.method1900(), var11.method1914());
                } else {
                    arg3.field820 = class286.method1904(arg3.field828, var11.method1911(), 0, var11.method1914());
                    this.field2404.method169(arg3, 8, arg3.field818.field230[arg3.field807] < 0);
                    arg3.field820.method1894(var9, var11.method1900());
                }
                if (arg3.field818.field230[arg3.field807] < 0) {
                    arg3.field820.method1896(-1);
                }
                var11.method1919(var9);
                var11.method159(arg1, arg5, arg4 - arg5);
                if (var11.method1899()) {
                    this.field2424.method1080(var11);
                }
            }
        }
        field2410++;
        arg3.field820.method159(arg1, arg5, arg2);
        if (!arg0) {
            field2405 = -79;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lel;")
    public final class203 method154() {
        field2413++;
        class50 var1 = (class50) this.field2420.method529(10);
        if (var1 == null) {
            return null;
        } else if (var1.field820 == null) {
            return this.method140();
        } else {
            return var1.field820;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        this.field2424.method177(arg0);
        field2406++;
        for (class50 var2 = (class50) this.field2420.method529(10); var2 != null; var2 = (class50) this.field2420.method533(-124)) {
            if (!this.field2404.method149(var2, 15383)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field805) {
                        this.method935((byte) 110, var2, var3);
                        var2.field805 -= var3;
                        break;
                    }
                    this.method935((byte) 54, var2, var2.field805);
                    var3 -= var2.field805;
                } while (!this.field2404.method155(var2, (int[]) null, var3, 0, 0));
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
    public static void method937(boolean arg0) {
        field2415 = null;
        field2411 = null;
        field2423 = null;
        field2416 = null;
        if (arg0) {
            field2418 = null;
            field2408 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static final void method938(int arg0) {
        if (arg0 <= 46) {
            method938(-77);
        }
        class215 var1 = (class215) class168.field2998.method529(10);
        field2407++;
        while (var1 != null) {
            class263 var2 = var1.field3728;
            if (class255.field4407 != var2.field4647 || var2.field4655) {
                var1.method828((byte) -78);
            } else if (var2.field4645 <= class56.field926) {
                var2.method1760(class224.field3889, 0);
                if (var2.field4655) {
                    var1.method828((byte) 7);
                } else {
                    class1.method7(var2.field4647, var2.field4663, var2.field4643, var2.field4660, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class215) class168.field2998.method533(-104);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIILuk;IJ)Z")
    public static final boolean method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class98 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class210.method1411(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
    public final int method144() {
        field2409++;
        return 0;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "()Lel;")
    public final class203 method140() {
        field2422++;
        class50 var1;
        do {
            var1 = (class50) this.field2420.method533(57);
            if (var1 == null) {
                return null;
            }
        } while (var1.field820 == null);
        return var1.field820;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lec;)V")
    public class137(class23 arg0) {
        this.field2404 = arg0;
    }
}
