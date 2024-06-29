import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class434 extends class117 {

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[Lul;")
    public static class402[] field6305 = new class402[14];

    @OriginalMember(owner = "client!a", name = "L", descriptor = "F")
    public static float field6315 = 0.0F;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "F")
    public static float field6309;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field6306;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public int field6310;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public int field6314;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Ljava/lang/String;")
    public String field6318;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lj;III[Z)Z", line = 4)
    public static final boolean method2623(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class62.field1063 != class529.field7807) {
            int var6 = class145.field2135[arg1].method273(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class35 var8 = class145.field2135[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method273(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method278(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method276(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)I", line = 39)
    public final int method2624(byte arg0) {
        if (arg0 != 88) {
            this.method2624((byte) 18);
        }
        ++field6304;
        return (int) super.field6399;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V", line = 50)
    public static void method2625(byte arg0) {
        field6305 = null;
        if (arg0 <= 74) {
            method2627((byte) -55);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V", line = 65)
    public static final void method2626(byte arg0) {
        ++field6313;
        class240.method1558(2, class397.field5830.field118, 28, 22050);
        class108.field1681 = new class326();
        class108.field1681.method2128(50, 128, 9);
        class84.field1407 = class21.method176(22050, (byte) -30, class112.field1785, 0, class31.field503);
        class84.field1407.method1150(false, class108.field1681);
        int var1 = 74 % ((arg0 - -67) / 32);
        class504.method2996(class272.field3933, (byte) -67, class380.field5670, class108.field1681, class250.field3600);
        class204.field2944 = class21.method176(2048, (byte) 118, class112.field1785, 1, class31.field503);
        class124.field1920 = new class28();
        class204.field2944.method1150(false, class124.field1920);
        class508.field7428 = new class44(22050, class471.field6941);
        class475.field6994 = class427.field6244.method677(-1, "scape main");
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(B)V", line = 88)
    public static final void method2627(byte arg0) {
        int var1 = 0;
        if (arg0 == -55) {
            while (var1 < class364.field5475.length) {
                for (int var2 = 0; ~var2 > ~class364.field5475[0].length; ++var2) {
                    for (int var3 = 0; class364.field5475[0][0].length > var3; ++var3) {
                        class364.field5475[var1][var2][var3] = 0;
                    }
                }
                ++var1;
            }
            ++field6316;
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 126)
    public final void method2628(int arg0) {
        if (arg0 <= 5) {
            method2627((byte) -63);
        }
        ++field6308;
        super.field1844 = super.field1844 & Long.MIN_VALUE | class464.method2773((byte) 103) - -500L;
        class470.field6917.method819(this, 1431655765);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 144)
    public static final void method2629(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -22849) {
            field6315 = 1.2116165F;
        }
        if (arg3 == 1012) {
            class150.method1083(class25.field445, arg1, arg2);
        } else if (~arg3 != -1004) {
            if (arg3 != 1009) {
                if (arg3 != 1007) {
                    if (~arg3 == -1012) {
                        class150.method1083(class321.field4733, arg1, arg2);
                    }
                } else {
                    class150.method1083(class109.field1729, arg1, arg2);
                }
            } else {
                class150.method1083(class230.field3354, arg1, arg2);
            }
        } else {
            class150.method1083(class445.field6541, arg1, arg2);
        }
        ++field6311;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I", line = 174)
    public final int method2630(boolean arg0) {
        if (arg0) {
            return 60;
        } else {
            ++field6303;
            return (int) (super.field6399 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(B)J", line = 188)
    public final long method2631(byte arg0) {
        ++field6312;
        if (arg0 <= 108) {
            this.method2624((byte) 78);
        }
        return Long.MAX_VALUE & super.field1844;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V", line = 198)
    public class434(int arg0, int arg1) {
        super.field6399 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(B)V", line = 209)
    public final void method2632(byte arg0) {
        ++field6307;
        if (arg0 != 81) {
            this.field6306 = -48;
        }
        super.field1844 |= Long.MIN_VALUE;
        if (this.method2631((byte) 111) == 0L) {
            class178.field2695.method819(this, arg0 + 1431655684);
        }
    }
}
