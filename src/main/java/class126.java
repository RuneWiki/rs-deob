import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 extends class12 {

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lpe;")
    public static class109 field2785 = class141.method1120("Bitte wenden Sie sich an den Kundendienst)3", 0);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Lpe;")
    private static class109 field2800 = class141.method1120(" has logged out)3", 0);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field2797 = 127;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Lpe;")
    public static class109 field2795 = field2800;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lpe;")
    public static class109 field2803 = class141.method1120("<col=ffffff>", 0);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lbc;")
    public static class11 field2782 = new class11(200);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Lpe;")
    private static class109 field2806 = class141.method1120("Prepared visibility map", 0);

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field2807 = 20;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lpe;")
    public static class109 field2808 = field2806;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lvb;")
    public class148 field2783;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Lea;")
    public class30 field2801;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Lea;")
    public class30 field2802;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
    public int[] field2798;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "[[[B")
    public static byte[][][] field2796;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
    public static final int method1017(int arg0) {
        if (arg0 == 6) {
            field2794++;
            return 6;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)[Le;")
    public static final class29[] method1018(boolean arg0) {
        field2778++;
        if (!arg0) {
            return null;
        }
        class29[] var1 = new class29[class88.field1870];
        for (int var2 = 0; var2 < class88.field1870; var2++) {
            class29 var3 = var1[var2] = new class29();
            var3.field662 = client.field519;
            var3.field665 = class61.field1225;
            var3.field661 = class107.field2246[var2];
            var3.field660 = class152.field3342[var2];
            var3.field663 = class57.field1142[var2];
            var3.field664 = class120.field2668[var2];
            int var4 = var3.field664 * var3.field663;
            byte[] var5 = class92.field1970[var2];
            var3.field659 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field659[var6] = class131.field2879[class4.method34(255, var5[var6])];
            }
        }
        class46.method413(-18078);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
    public static final int method1019(int arg0, int arg1, int arg2, int arg3) {
        field2793++;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = arg3;
        if (arg3 < 3 && (class107.field2249[1][var4][var5] & 0x2) == 2) {
            var8 = arg3 + 1;
        }
        int var9 = (128 - var7) * class83.field1775[var8][var4][var5 + 1] + class83.field1775[var8][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class83.field1775[var8][var4][var5] + class83.field1775[var8][arg2 + var4][var5] * var7 >> 7;
        return (128 - var6) * var10 + var6 * var9 >> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII)I")
    public static final int method1020(boolean arg0, int arg1, int arg2) {
        field2777++;
        if (arg0) {
            field2800 = null;
        }
        long var3 = (long) ((arg2 << 16) + arg1);
        return class46.field968 != null && class46.field968.field267 == var3 ? class3.field65.field309 * 99 / (class3.field65.field279.length - class46.field968.field3340) + 1 : 0;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field2803 = null;
        if (arg0 != 24) {
            field2807 = 14;
        }
        field2808 = null;
        field2782 = null;
        field2795 = null;
        field2806 = null;
        field2800 = null;
        field2796 = null;
        field2785 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjf;Z)V")
    public static final void method1022(int arg0, class68 arg1, boolean arg2) {
        field2786++;
        if (!arg2) {
            field2806 = null;
        }
        while (true) {
            class147 var3 = (class147) class18.field448.method195((byte) 122);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3197; var5++) {
                if (var3.field3205[var5] != null) {
                    if (var3.field3205[var5].field513 == 2) {
                        var3.field3199[var5] = -5;
                    }
                    if (var3.field3205[var5].field513 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3196[var5] != null) {
                    if (var3.field3196[var5].field513 == 2) {
                        var3.field3199[var5] = -6;
                    }
                    if (var3.field3196[var5].field513 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method535(arg0, -25013);
            arg1.method135(0, (byte) -50);
            int var6 = arg1.field309;
            arg1.method123(var3.field3206, 1375221240);
            for (int var7 = 0; var7 < var3.field3197; var7++) {
                if (var3.field3199[var7] == 0) {
                    try {
                        int var8 = var3.field3202[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3205[var7].field514;
                            int var13 = var12.getInt(null);
                            arg1.method135(0, (byte) -50);
                            arg1.method123(var13, 1375221240);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3205[var7].field514;
                            var9.setInt(null, var3.field3198[var7]);
                            arg1.method135(0, (byte) -50);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3205[var7].field514;
                            int var11 = var10.getModifiers();
                            arg1.method135(0, (byte) -50);
                            arg1.method123(var11, 1375221240);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3196[var7].field514;
                            byte[][] var15 = var3.field3200[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method135(0, (byte) -50);
                            } else if (var19 instanceof Number) {
                                arg1.method135(1, (byte) -50);
                                arg1.method157((byte) 60, ((Number) var19).longValue());
                            } else if (var19 instanceof class109) {
                                arg1.method135(2, (byte) -50);
                                arg1.method152(9166, (class109) var19);
                            } else {
                                arg1.method135(4, (byte) -50);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3196[var7].field514;
                            int var21 = var20.getModifiers();
                            arg1.method135(0, (byte) -50);
                            arg1.method123(var21, 1375221240);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method135(-10, (byte) -50);
                    } catch (InvalidClassException var23) {
                        arg1.method135(-11, (byte) -50);
                    } catch (StreamCorruptedException var24) {
                        arg1.method135(-12, (byte) -50);
                    } catch (OptionalDataException var25) {
                        arg1.method135(-13, (byte) -50);
                    } catch (IllegalAccessException var26) {
                        arg1.method135(-14, (byte) -50);
                    } catch (IllegalArgumentException var27) {
                        arg1.method135(-15, (byte) -50);
                    } catch (InvocationTargetException var28) {
                        arg1.method135(-16, (byte) -50);
                    } catch (SecurityException var29) {
                        arg1.method135(-17, (byte) -50);
                    } catch (IOException var30) {
                        arg1.method135(-18, (byte) -50);
                    } catch (NullPointerException var31) {
                        arg1.method135(-19, (byte) -50);
                    } catch (Exception var32) {
                        arg1.method135(-20, (byte) -50);
                    } catch (Throwable var33) {
                        arg1.method135(-21, (byte) -50);
                    }
                } else {
                    arg1.method135(var3.field3199[var7], (byte) -50);
                }
            }
            arg1.method122(40597959, var6);
            arg1.method154(-1, arg1.field309 - var6);
            var3.method101((byte) 96);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method1023(int arg0) {
        field2799++;
        int var2 = this.field2805;
        class148 var3 = this.field2783.method1157(true);
        if (var3 == null) {
            this.field2798 = null;
            this.field2780 = 0;
            this.field2788 = 0;
            this.field2776 = 0;
            this.field2805 = -1;
        } else {
            this.field2780 = var3.field3231;
            this.field2805 = var3.field3279;
            this.field2776 = var3.field3232;
            this.field2798 = var3.field3270;
            this.field2788 = var3.field3264 * 128;
        }
        if (this.field2805 != var2 && this.field2801 != null) {
            class124.field2746.method1054(this.field2801);
            this.field2801 = null;
        }
        if (arg0 != -1) {
            method1024(true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static final void method1024(boolean arg0) {
        boolean var1 = arg0;
        field2787++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class63.field1302 - 1; var2++) {
                if (class149.field3285[var2] < 1000 && class149.field3285[var2 + 1] > 1000) {
                    var1 = false;
                    class109 var3 = class101.field2135[var2];
                    class101.field2135[var2] = class101.field2135[var2 + 1];
                    class101.field2135[var2 + 1] = var3;
                    class109 var4 = class101.field2116[var2];
                    class101.field2116[var2] = class101.field2116[var2 + 1];
                    class101.field2116[var2 + 1] = var4;
                    int var5 = class149.field3285[var2];
                    class149.field3285[var2] = class149.field3285[var2 + 1];
                    class149.field3285[var2 + 1] = var5;
                    int var6 = class102.field2148[var2];
                    class102.field2148[var2] = class102.field2148[var2 + 1];
                    class102.field2148[var2 + 1] = var6;
                    int var7 = class135.field2947[var2];
                    class135.field2947[var2] = class135.field2947[var2 + 1];
                    class135.field2947[var2 + 1] = var7;
                    int var8 = class57.field1149[var2];
                    class57.field1149[var2] = class57.field1149[var2 + 1];
                    class57.field1149[var2 + 1] = var8;
                }
            }
        }
    }
}
