import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class140 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2113 = -2;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2116 = -1;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2114 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[I")
    public static int[] field2120 = new int[5];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lmg;")
    public static class61 field2115;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[[S")
    public static short[][] field2118;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1007(boolean arg0) {
        field2120 = null;
        field2114 = null;
        field2115 = null;
        if (!arg0) {
            field2118 = (short[][]) ((short[][]) null);
        }
        field2118 = (short[][]) null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ[BI[Lla;)V", line = 22)
    public static final void method1008(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, class191[] arg5) {
        field2117++;
        int var6 = -1;
        class263 var7 = new class263(arg3);
        while (true) {
            int var8 = var7.method1846((byte) -54);
            if (var8 == 0) {
                if (arg4 >= -46) {
                    field2118 = (short[][]) ((short[][]) null);
                }
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method1832(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 & 0x3F;
                int var13 = var7.method1787(false);
                int var14 = var13 >> 2;
                int var15 = var9 >> 6 & 0x3F;
                int var16 = var13 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg1 + var15;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class191 var19 = null;
                    if (!arg2) {
                        int var20 = var11;
                        if ((class179.field2645[1][var18][var17] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class241.method1635(var6, var16, var11, 31325, var18, var19, arg2, !arg2, var14, var17, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 104)
    public static int method1009(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILgl;Ljava/awt/Component;II)Lad;", line = 122)
    public static final class179 method1010(int arg0, class262 arg1, Component arg2, int arg3, int arg4) {
        field2112++;
        if (class248.field3696 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class179 var5 = (class179) Class.forName("uk").getDeclaredConstructor().newInstance();
                var5.field2678 = arg3;
                var5.field2659 = new int[(class242.field3627 ? 2 : 1) * 256];
                var5.method245(arg2);
                var5.field2677 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2677 > 16384) {
                    var5.field2677 = 16384;
                }
                var5.method239(var5.field2677);
                if (class230.field3480 > 0 && class307.field4685 == null) {
                    class307.field4685 = new class249();
                    class307.field4685.field3710 = arg1;
                    arg1.method1770((byte) 117, class230.field3480, class307.field4685);
                }
                if (arg0 != 2) {
                    field2114 = (BigInteger) null;
                }
                if (class307.field4685 != null) {
                    if (class307.field4685.field3713[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class307.field4685.field3713[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class34 var7 = new class34(arg1, arg4);
                    var7.field2678 = arg3;
                    var7.field2659 = new int[(class242.field3627 ? 2 : 1) * 256];
                    var7.method245(arg2);
                    var7.field2677 = 16384;
                    var7.method239(var7.field2677);
                    if (class230.field3480 > 0 && class307.field4685 == null) {
                        class307.field4685 = new class249();
                        class307.field4685.field3710 = arg1;
                        arg1.method1770((byte) 87, class230.field3480, class307.field4685);
                    }
                    if (class307.field4685 != null) {
                        if (class307.field4685.field3713[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class307.field4685.field3713[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class179();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
