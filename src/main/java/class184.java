import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class184 extends class200 {

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Lmh;")
    public class139 field3200;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3201 = Calendar.getInstance();

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Z")
    public static boolean field3199;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
    public static final void method1153(int arg0, byte arg1) {
        field3202++;
        int[] var2 = class193.field3388.field2691;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var21 = (52736 - var5 * 512) * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class47.field875[arg0][var22][var5] & 0x18) == 0) {
                    class204.method1316(var2, var21, 512, arg0, var22, var5);
                }
                if (arg0 < 3 && (class47.field875[arg0 + 1][var22][var5] & 0x8) != 0) {
                    class204.method1316(var2, var21, 512, arg0 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10);
        class193.field3388.method1018();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class47.field875[arg0][var20][var8] & 0x18) == 0) {
                    class77.method592(var8, var7, arg0, var6, var20, 109);
                }
                if (arg0 < 3 && (class47.field875[arg0 + 1][var20][var8] & 0x8) != 0) {
                    class77.method592(var8, var7, arg0 + 1, var6, var20, arg1 - 5);
                }
            }
        }
        class210.field3748 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class239.method1552(class194.field3403, var9, var10);
                if (var11 != 0L) {
                    class39 var13 = class40.method281(true, (int) (var11 >>> 32) & Integer.MAX_VALUE);
                    int var14 = var13.field696;
                    if (var14 >= 0) {
                        int var15 = var9;
                        int var16 = var10;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class73.field1390[class194.field3403].field3908;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var15 > var9 - 3 && (var17[var15 - 1][var16] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var15 < var9 + 3 && (var17[var15 + 1][var16] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var16 > var10 - 3 && (var17[var15][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var10 + 3 > var16 && (var17[var15][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class62.field1160[class210.field3748] = var13.field733;
                        class73.field1396[class210.field3748] = var15;
                        class175.field3038[class210.field3748] = var16;
                        class210.field3748++;
                    }
                }
            }
        }
        if (arg1 == -42) {
            class28.field493.method96((byte) -110);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method1154(byte arg0) {
        field3201 = null;
        if (arg0 >= -94) {
            field3201 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lmh;)V")
    public class184(class139 arg0) {
        this.field3200 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILvi;Lfj;B)V")
    public static final void method1155(int arg0, class229 arg1, class66 arg2, byte arg3) {
        field3198++;
        class166 var4 = new class166();
        var4.field2859 = arg2.method506(255);
        var4.field2855 = arg2.method528(true);
        var4.field2858 = new class176[var4.field2859];
        var4.field2854 = new int[var4.field2859];
        var4.field2866 = new int[var4.field2859];
        if (arg3 != 75) {
            field3203 = 82;
        }
        var4.field2863 = new int[var4.field2859];
        var4.field2862 = new byte[var4.field2859][][];
        var4.field2857 = new class176[var4.field2859];
        for (int var5 = 0; var5 < var4.field2859; var5++) {
            try {
                int var6 = arg2.method506(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method496(true).method327((byte) 95));
                    String var8 = new String(arg2.method496(true).method327((byte) 92));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method528(true);
                    }
                    var4.field2866[var5] = var6;
                    var4.field2854[var5] = var9;
                    var4.field2857[var5] = arg1.method1505((byte) 10, var8, class9.method92(false, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method496(true).method327((byte) 75));
                    String var11 = new String(arg2.method496(true).method327((byte) 77));
                    int var12 = arg2.method506(255);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method496(true).method327((byte) 93));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method528(true);
                            var15[var16] = new byte[var17];
                            arg2.method515(var17, 0, var15[var16], arg3 - 75);
                        }
                    }
                    var4.field2866[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class9.method92(false, var13[var19]);
                    }
                    var4.field2858[var5] = arg1.method1499(var18, var11, class9.method92(false, var10), false);
                    var4.field2862[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2863[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2863[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2863[var5] = -3;
            } catch (Exception var23) {
                var4.field2863[var5] = -4;
            } catch (Throwable var24) {
                var4.field2863[var5] = -5;
            }
        }
        class135.field2412.method1185(var4, (byte) -110);
    }
}
