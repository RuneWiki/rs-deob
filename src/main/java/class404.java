import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class404 {

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "B")
    private byte field5843;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field5835;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field5848;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field5844;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field5845;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "[S")
    public static short[] field5842 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "D")
    public static double field5851;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Lct;")
    public static class104 field5849;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Lct;")
    public static class104 field5853;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "Lct;")
    public static class104 field5854;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field5852;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V")
    public static final void method2519(byte arg0, int arg1, int arg2) {
        class440.field6409 = new class363(arg2);
        field5846++;
        if (arg0 <= 107) {
            method2525((class336) null, false);
        }
        class347.field5110 = new class363(arg1);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
    public final int method2520(boolean arg0) {
        field5839++;
        if (!arg0) {
            method2521(39);
        }
        return this.field5843 & 0x7;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method2521(int arg0) {
        field5842 = null;
        field5853 = null;
        field5849 = null;
        if (arg0 != -8620) {
            field5850 = 11;
        }
        field5854 = null;
        field5852 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Lwl;")
    public static final class283 method2522(boolean arg0, int arg1) {
        field5840++;
        class363 var2 = class160.field2146;
        class283 var3;
        synchronized (class160.field2146) {
            var3 = (class283) class160.field2146.method2310((byte) -127, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class328.field4891.method715(arg1, (byte) 93, 3);
        class283 var5 = new class283();
        if (var4 != null) {
            var5.method1907(new class256(var4), 0);
        }
        class363 var6 = class160.field2146;
        synchronized (class160.field2146) {
            if (!arg0) {
                field5852 = null;
            }
            class160.field2146.method2299(arg0, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLjava/lang/String;Z)Z")
    public static final boolean method2523(int arg0, boolean arg1, String arg2, boolean arg3) {
        field5838++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = arg3;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
    public static final void method2524(boolean arg0) {
        if (!arg0) {
            field5842 = null;
        }
        class417.field6024.method2307(48);
        field5836++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lbf;Z)Z")
    public static final boolean method2525(class336 arg0, boolean arg1) {
        boolean var2 = class215.field3069 == class161.field2151;
        int var3 = 0;
        arg0.method449((byte) -28);
        if (arg0.field4961 < 0 || arg0.field4959 < 0 || arg0.field4957 >= class329.field4899 || arg0.field4950 >= class380.field5590) {
            return false;
        }
        for (int var4 = arg0.field4961; var4 <= arg0.field4957; var4++) {
            for (int var7 = arg0.field4959; var7 <= arg0.field4950; var7++) {
                class369 var8 = class186.method1275(arg0.field4960, var4, var7);
                if (var8 != null) {
                    int var9 = 0;
                    if (var4 > arg0.field4961) {
                        var9++;
                    }
                    if (var4 < arg0.field4957) {
                        var9 += 4;
                    }
                    if (var7 > arg0.field4959) {
                        var9 += 8;
                    }
                    if (var7 < arg0.field4950) {
                        var9 += 2;
                    }
                    class206 var10 = class91.method618((byte) 119, arg0, var9);
                    class206 var11 = var8.field5345;
                    if (var11 == null) {
                        var8.field5345 = var10;
                    } else {
                        while (var11.field2882 != null) {
                            var11 = var11.field2882;
                        }
                        var11.field2882 = var10;
                    }
                    var8.field5326 = (byte) (var8.field5326 | var9);
                }
                if (var2 && class299.field4360[var4][var7] != 0) {
                    var3 = class299.field4360[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field4961; var5 <= arg0.field4957; var5++) {
                for (int var6 = arg0.field4959; var6 <= arg0.field4950; var6++) {
                    if (class299.field4360[var5][var6] == 0) {
                        class299.field4360[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class93.field1163[class302.field4425++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method2526(int arg0, int arg1) {
        class326.field4793.method2300(arg0, true);
        field5837++;
        if (arg1 != 8) {
            method2525((class336) null, true);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(Z)I")
    public final int method2527(boolean arg0) {
        field5841++;
        if (!arg0) {
            method2519((byte) 0, 90, 9);
        }
        return (this.field5843 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class404() {
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lat;)V")
    public class404(class256 arg0) {
        this.field5843 = arg0.method1728((byte) 101);
        this.field5835 = arg0.method1767(1930493576);
        this.field5848 = arg0.method1746(20972);
        this.field5844 = arg0.method1746(20972);
        this.field5847 = arg0.method1746(20972);
        this.field5845 = arg0.method1746(20972);
    }

    static {
        new class409("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field5851 = -1.0D;
    }
}
