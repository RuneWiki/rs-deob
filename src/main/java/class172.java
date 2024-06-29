import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class172 extends class101 {

    @OriginalMember(owner = "client!we", name = "x", descriptor = "J")
    public long field2587;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field2582 = 2;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field2577 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[Lof;")
    public static class272[] field2581 = new class272[14];

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    public static int[] field2580 = new int[32];

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field2588 = 500;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2579;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[Ljf;)V", line = 4)
    public static final void method1196(int arg0, class86[] arg1) {
        class145.field2199[arg0] = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIJ)Z", line = 14)
    public static final boolean method1197(int arg0, int arg1, int arg2, long arg3) {
        class221 var5 = class158.field2367[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3370 != null && var5.field3370.field2448 == arg3) {
            return true;
        } else if (var5.field3368 != null && var5.field3368.field3440 == arg3) {
            return true;
        } else if (var5.field3364 != null && var5.field3364.field2787 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3374; var6++) {
                if (var5.field3354[var6].field4720 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI[B)Z", line = 46)
    public static final boolean method1198(int arg0, byte arg1, int arg2, byte[] arg3) {
        field2576++;
        class263 var4 = new class263(arg3);
        boolean var5 = true;
        if (arg1 <= 96) {
            return true;
        }
        int var6 = -1;
        label74: while (true) {
            int var7 = var4.method1846((byte) -56);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var11;
                class22 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var4.method1832(-32768);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var4.method1787(false);
                                    }
                                    int var10 = var4.method1832(-32768);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var9 += var10 - 1;
                                    var11 = var4.method1787(false) >> 2;
                                    int var12 = var9 & 0x3F;
                                    int var13 = (var9 & 0xFC7) >> 6;
                                    var14 = arg0 + var12;
                                    var15 = arg2 + var13;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class284.method1980(var6, (byte) 100);
                } while (var11 == 22 && !class170.field2549 && var16.field323 == 0 && var16.field332 != 1 && !var16.field324);
                var8 = true;
                if (!var16.method151(false)) {
                    var5 = false;
                    class271.field4154++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLlm;Llm;)V", line = 135)
    public static final void method1199(byte arg0, class210 arg1, class210 arg2) {
        field2585++;
        class81.field1149 = arg2;
        class291.field4437 = arg1;
        if (arg0 != 102) {
            field2581 = (class272[]) null;
        }
        class301.field4605 = class81.field1149.method1464((byte) 46, 3);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)Ldl;", line = 148)
    public static final class29 method1200(int arg0) {
        field2586++;
        try {
            if (arg0 != 0) {
                field2588 = 8;
            }
            return (class29) Class.forName("bb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 174)
    public class172() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(J)V", line = 176)
    public class172(long arg0) {
        this.field2587 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 189)
    public static void method1201(byte arg0) {
        field2579 = null;
        if (arg0 != -17) {
            field2588 = -100;
        }
        field2581 = null;
        field2580 = null;
    }
}
