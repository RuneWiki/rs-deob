import java.awt.Canvas;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class120 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2116;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2124;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[[B")
    public static byte[][] field2113;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public static final void method868(int arg0, int arg1) {
        field2118++;
        if (class25.field537 == arg1) {
            return;
        }
        if (class25.field537 == 0) {
            class175.method1204(81);
        }
        if (arg0 <= 10) {
            field2113 = null;
        }
        if (arg1 == 40) {
            class213.method1416(class245.field4275, class245.field4276, true);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class194.field3222 != null) {
            class194.field3222.method630(2);
            class194.field3222 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class174.field2912 = 1;
            class83.field1543 = 0;
            class68.field1290 = 1;
            class203.field3375 = 0;
            class154.field2692 = 0;
            class204.method1381(80);
        }
        if (arg1 == 5) {
            class10.method63(class24.field530, -33);
        } else {
            class260.method1747(29489);
        }
        boolean var3 = class25.field537 == 5 || class25.field537 == 10 || class25.field537 == 28;
        if (var2 != var3) {
            if (var2) {
                class250.field4347 = class25.field541;
                if (class66.field1260 == 0) {
                    class216.method1433(-1, 2);
                } else {
                    class187.method1262(255, 2, 0, -12557, class56.field1014, false, class25.field541);
                }
                class136.method941(false, 0);
            } else {
                class216.method1433(-1, 2);
                class136.method941(true, 0);
            }
        }
        class25.field537 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Llj;IIIZIII[BI)V")
    public static final void method869(int arg0, class44[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        field2117++;
        int var11 = -1;
        class217 var12 = new class217(arg9);
        if (arg2 != -26) {
            method871(38);
        }
        while (true) {
            int var13 = var12.method1449(0);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1436(-66);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method1487(arg2 + 281);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg8 == var18 && var17 >= arg10 && (arg10 + 8) > var17 && var16 >= arg6 && (arg6 + 8) > var16) {
                    class243 var22 = class53.method426((byte) -90, var11);
                    int var23 = class151.method1053(var16 & 0x7, var20, var22.field4223, arg3, var17 & 0x7, var22.field4235, -3) + arg7;
                    int var24 = arg0 + class237.method1605(123, arg3, var20, var22.field4235, var17 & 0x7, var22.field4223, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class44 var25 = null;
                        if (!arg5) {
                            int var26 = arg4;
                            if ((class210.field3495[1][var23][var24] & 0x2) == 2) {
                                var26 = arg4 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class24.method237(arg4, arg3 + var20 & 0x3, !arg5, arg4, var11, var24, arg2 ^ 0x5, arg5, var23, var21, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lic;")
    public static final class193 method870(int arg0, byte arg1) {
        field2115++;
        class193 var2 = (class193) class93.field1742.method912((long) arg0, (byte) 29);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -111) {
            field2114 = -11;
        }
        byte[] var3 = class121.field2134.method190((byte) -56, arg0, 11);
        class193 var4 = new class193();
        if (var3 != null) {
            var4.method1309(new class217(var3), 0);
        }
        class93.field1742.method913(var4, 109, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method871(int arg0) {
        class213.field3528.method437((byte) 19);
        class8.field115.method1687(-110);
        if (arg0 > 31) {
            class167.field2825.method1687(-103);
            field2123++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method872(int arg0) {
        if (arg0 < 79) {
            method871(102);
        }
        field2113 = null;
        field2116 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method873(boolean arg0) {
        class222.field3733.method763(0);
        class109.field1945.method763(0);
        if (!arg0) {
            method869(-3, (class44[]) null, 122, 25, -10, true, 18, -111, -97, (byte[]) null, -111);
        }
        class5.field62.method763(0);
        field2121++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)V")
    public static final void method874(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        field2122++;
        long var3 = (long) ((arg1 << 16) + arg2);
        class142 var5 = (class142) class232.field3889.method443(var3, (byte) -37);
        if (var5 != null) {
            class254.field4388.method1685(1831570337, var5);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class120() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwd;B[B)V")
    public final void method875(class217 arg0, byte arg1, byte[] arg2) {
        field2120++;
        if (arg1 >= -9) {
            field2114 = 79;
        }
        if (arg0.field3633[arg0.field3581] != 31 || arg0.field3633[arg0.field3581 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2124 == null) {
            this.field2124 = new Inflater(true);
        }
        try {
            this.field2124.setInput(arg0.field3633, arg0.field3581 + 10, -arg0.field3581 - 10 + arg0.field3633.length + -8);
            this.field2124.inflate(arg2);
        } catch (Exception var4) {
            this.field2124.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2124.reset();
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V")
    private class120(int arg0, int arg1, int arg2) {
    }
}
