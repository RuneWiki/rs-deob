import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class367 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljj;")
    private class156 field5219 = new class156(256);

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Ljj;")
    private class156 field5231 = new class156(256);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ldp;")
    private class174 field5217;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ldp;")
    private class174 field5216;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Z")
    public static boolean field5221 = false;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lqo;")
    public static class127[] field5225 = new class127[2048];

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field5224 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5223 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([III)Lhk;", line = 5)
    public final class201 method2336(int[] arg0, int arg1, int arg2) {
        field5220++;
        if (this.field5217.method1325(-125) == 1) {
            return this.method2340(arg0, 0, (byte) 86, arg2);
        } else if (this.field5217.method1333(arg1, arg2) == 1) {
            return this.method2340(arg0, arg2, (byte) 86, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILip;)V", line = 22)
    public static final void method2337(int arg0, int arg1, int arg2, class49 arg3) {
        if (class443.field6447[arg0][arg1][arg2] == null) {
            class253.method1833(arg0, arg1, arg2);
        }
        class443.field6447[arg0][arg1][arg2].field2501 = arg3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V", line = 29)
    public static final void method2338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5227++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = -96 % ((74 - arg1) / 51);
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg0 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg0 - 1) * var15;
        if (class308.field4507 <= arg4 && class383.field5497 >= arg4) {
            int var22 = class102.method843(arg2 + arg3, class278.field4184, class185.field2727, 0);
            int var23 = class102.method843(arg2 - arg3, class278.field4184, class185.field2727, 0);
            class47.method379(var22, (byte) 89, arg5, class286.field4283[arg4], var23);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var18;
                    var20 += var17;
                    var18 += var17;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var20;
                var13 += var18;
                var6++;
                var18 += var17;
                var20 += var17;
            }
            var13 += -var21;
            var14 += -var19;
            var7--;
            var19 -= var15;
            var21 -= var15;
            int var24 = arg4 - var7;
            int var25 = arg4 + var7;
            if (var25 >= class308.field4507 && var24 <= class383.field5497) {
                int var26 = class102.method843(arg2 + var6, class278.field4184, class185.field2727, 0);
                int var27 = class102.method843(arg2 - var6, class278.field4184, class185.field2727, 0);
                if (class308.field4507 <= var24) {
                    class47.method379(var26, (byte) 118, arg5, class286.field4283[var24], var27);
                }
                if (var25 <= class383.field5497) {
                    class47.method379(var26, (byte) 100, arg5, class286.field4283[var25], var27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 131)
    public static void method2339(int arg0) {
        if (arg0 != -723209630) {
            field5230 = -60;
        }
        field5224 = null;
        field5223 = null;
        field5225 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIBI)Lhk;", line = 147)
    private final class201 method2340(int[] arg0, int arg1, byte arg2, int arg3) {
        field5226++;
        int var5 = arg3 ^ (arg1 >>> 12 | (arg1 & 0xE0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        if (arg2 != 86) {
            this.method2341(57, (int[]) null, (byte) 5);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class201 var9 = (class201) this.field5231.method1219(var7, -123);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class357 var10 = (class357) this.field5219.method1219(var7, arg2 - 180);
            if (var10 == null) {
                var10 = class357.method2289(this.field5217, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field5219.method1217(1, var7, var10);
            }
            class201 var11 = var10.method2285(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method251(26);
                this.field5231.method1217(arg2 - 85, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IB)Lhk;", line = 195)
    public final class201 method2341(int arg0, int[] arg1, byte arg2) {
        if (arg2 != 41) {
            method2337(-91, -38, -62, (class49) null);
        }
        field5228++;
        if (this.field5216.method1325(arg2 - 101) == 1) {
            return this.method2343(arg0, arg1, arg2 ^ 0xFFFFFFC2, 0);
        } else if (this.field5216.method1333(0, arg0) == 1) {
            return this.method2343(0, arg1, -28, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIIIIBIII)Z", line = 224)
    public static final boolean method2342(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field5229++;
        int var11 = class446.method2790(arg10, arg2, class86.field1394.method1070((byte) -50), arg1, class322.field4646[field5213], arg9, arg3, arg0, arg4, 22, arg5, class156.field2367, class83.field1361, arg8, arg6);
        if (var11 < 1) {
            return false;
        }
        class161.field2434 = class156.field2367[var11 - 1];
        class11.field136 = class83.field1361[var11 - 1];
        class420.field6129 = false;
        int var12 = 11 / (arg7 / 63);
        class200.method1520(-277309434);
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[III)Lhk;", line = 254)
    private final class201 method2343(int arg0, int[] arg1, int arg2, int arg3) {
        field5222++;
        if (arg2 >= -15) {
            this.method2336((int[]) null, -78, 75);
        }
        int var5 = (arg3 << 4 & 0xFFF3 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class201 var9 = (class201) this.field5231.method1219(var7, -94);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class116 var10 = class116.method986(this.field5216, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class201 var11 = var10.method987();
            this.field5231.method1217(1, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field2936.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 290)
    public static final void method2344(byte arg0) {
        field5218++;
        if (class177.field2636 != 3) {
            class419.field6108 = -1;
        }
        if (arg0 != -110) {
            method2345((byte) 126);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ldp;Ldp;)V", line = 334)
    public class367(class174 arg0, class174 arg1) {
        this.field5217 = arg1;
        this.field5216 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 322)
    public static final void method2345(byte arg0) {
        if (arg0 != 99) {
            field5221 = false;
        }
        field5214++;
        class18 var1 = class439.field6386;
        synchronized (class439.field6386) {
            class439.field6386.method112(0);
        }
    }
}
