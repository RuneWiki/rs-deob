import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class140 {

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Loc;")
    public class136 field2015 = new class136();

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2003 = null;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2009 = "flash1:";

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field2016 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lvl;")
    public static class73 field2002;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[[I")
    public static int[][] field2014;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILmd;Ljava/lang/Object;)V")
    public static final void method880(int arg0, class239 arg1, Object arg2) {
        if (arg0 != 512) {
            field2010 = -41;
        }
        field2017++;
        if (arg1.field3836 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field3836.peekEvent() != null; var3++) {
            class7.method43(-79, 1L);
        }
        if (arg2 != null) {
            arg1.field3836.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method881(int arg0) {
        field2003 = null;
        field2009 = null;
        if (arg0 != -1) {
            field2006 = 57;
        }
        field2014 = null;
        field2002 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjava/awt/Component;)Llk;")
    public static final class264 method882(int arg0, int arg1, int arg2, Component arg3) {
        field2005++;
        try {
            Class var4 = Class.forName("ef");
            class264 var5 = (class264) var4.getDeclaredConstructor().newInstance();
            if (arg2 == 28594) {
                var5.method65(arg1, arg0, false, arg3);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class11 var6 = new class11();
            var6.method65(arg1, arg0, false, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z")
    public static final boolean method883(int arg0, byte arg1) {
        byte var2 = 0;
        field2004++;
        byte var3 = 0;
        if (class43.field526 == null) {
            if (class162.field2487 == null) {
                class43.field526 = new class48(512, 512);
            } else {
                class43.field526 = (class48) class162.field2487;
            }
            int[] var4 = class43.field526.field602;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var23 = (var3 + 103 - var7) * 2048 + 24628;
                for (int var24 = var2 + 1; var24 < 104 - var2 - 1; var24++) {
                    if ((class74.field1121[arg0][var24][var7] & 0x18) == 0) {
                        class108.method722(var4, var23, 512, arg0, var24, var7);
                    }
                    if (arg0 < 3 && (class74.field1121[arg0 + 1][var24][var7] & 0x8) != 0) {
                        class108.method722(var4, var23, 512, arg0 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class231.field3702 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class33.method173(arg0, var2 + var8, var3 + var9);
                    if (var10 == 0L) {
                        var10 = class55.method362(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class78.method531(arg0, var2 + var8, var9 - -var3);
                    }
                    if (var10 == 0L) {
                        var10 = class211.method1460(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 != 0L) {
                        class191 var12 = class128.method822(Integer.MAX_VALUE & (int) (var10 >>> 32), (byte) -101);
                        if (!var12.field2977 || class147.field2191) {
                            int var13 = var12.field2970;
                            if (var12.field2963 != null) {
                                for (int var14 = 0; var14 < var12.field2963.length; var14++) {
                                    if (var12.field2963[var14] != -1) {
                                        class191 var15 = class128.method822(var12.field2963[var14], (byte) 111);
                                        if (var15.field2970 >= 0) {
                                            var13 = var15.field2970;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                class152 var16 = class136.method863(var13, 0);
                                boolean var17 = false;
                                int var18 = var2 + var8;
                                if (var16 != null && var16.field2250) {
                                    var17 = true;
                                }
                                int var19 = var3 + var9;
                                if (var17) {
                                    int[][] var20 = class312.field4997[arg0].field1493;
                                    for (int var21 = 0; var21 < 10; var21++) {
                                        int var22 = (int) (Math.random() * 4.0D);
                                        if (var22 == 0 && var18 > 0 && var8 - 3 < var18 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                            var18--;
                                        }
                                        if (var22 == 1 && var18 < 103 && (var8 + 3) > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                            var18++;
                                        }
                                        if (var22 == 2 && var19 > 0 && var19 > (var9 - 3) && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                            var19--;
                                        }
                                        if (var22 == 3 && var19 < 103 && var19 < var9 + 3 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                            var19++;
                                        }
                                    }
                                }
                                class105.field1532[class231.field3702] = var12.field3019;
                                class293.field4703[class231.field3702] = var18 - var2;
                                class299.field4765[class231.field3702] = var19 - var3;
                                class231.field3702++;
                            }
                        }
                    }
                }
            }
        }
        class43.field526.method290();
        int var25 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var26 = (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (238 - (-((int) (Math.random() * 20.0D)) + 10));
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class74.field1121[arg0][var2 + var28][var3 + var27] & 0x18) == 0 && !class282.method1940(var27, var26, var3, arg0, var28, var25, var2, -82)) {
                    class187.field2935.method1849(false);
                    return false;
                }
                if (arg0 < 3 && (class74.field1121[arg0 + 1][var2 + var28][var27 + var3] & 0x8) != 0 && !class282.method1940(var27, var26, var3, arg0 + 1, var28, var25, var2, -96)) {
                    class187.field2935.method1849(false);
                    return false;
                }
            }
        }
        class162.field2487 = class43.field526;
        if (arg1 <= 49) {
            method883(81, (byte) -107);
        }
        class187.field2935.method1849(false);
        class43.field526 = null;
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method884(byte arg0) {
        field2013++;
        if (arg0 != -116) {
            field2016 = 62;
        }
        while (true) {
            class136 var2 = this.field2015.field1963;
            if (this.field2015 == var2) {
                return;
            }
            var2.method866(-110);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Loc;B)V")
    public final void method885(class136 arg0, byte arg1) {
        if (arg0.field1959 != null) {
            arg0.method866(-98);
        }
        arg0.field1963 = this.field2015;
        if (arg1 != -104) {
            field2016 = 83;
        }
        field2007++;
        arg0.field1959 = this.field2015.field1959;
        arg0.field1959.field1963 = arg0;
        arg0.field1963.field1959 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class140() {
        this.field2015.field1963 = this.field2015;
        this.field2015.field1959 = this.field2015;
    }
}
