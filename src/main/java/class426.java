import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class426 extends class498 {

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "Lrv;")
    public static class73 field5984 = new class73(2);

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field5985 = 0;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "Leh;")
    public static class246 field5987 = new class246(73, 8);

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "J")
    public static volatile long field5991 = 0L;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lam;")
    public static class455 field5990 = new class455();

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "Lhm;")
    public static class150 field5992 = null;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public int field5986;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "Lht;")
    public static class418 field5989;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vs", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field5993;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
    public int[] field5981;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "[[S")
    public static short[][] field5988;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method495(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
    public static void method2523(boolean arg0) {
        field5989 = null;
        field5984 = null;
        field5992 = null;
        field5987 = null;
        field5990 = null;
        field5988 = null;
        if (arg0) {
            method2525(-68);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
    public static final boolean method2524(int arg0, int arg1, int arg2) {
        if (arg1 <= 36) {
            field5990 = null;
        }
        field5980++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static final void method2525(int arg0) {
        field5982++;
        if (arg0 > -37) {
            return;
        }
        for (class224 var1 = (class224) class117.field1631.method2655(15152); var1 != null; var1 = (class224) class117.field1631.method2660((byte) 67)) {
            if (class268.field3910 == null) {
                var1.method2891(-124);
            } else if (var1.field3226 <= class390.field5481) {
                int var2 = class107.field1452[var1.field3227];
                if (var2 == 0) {
                    class232 var9 = class38.method211(var1.field3220, var1.field3217, var1.field3228);
                    if (var9 instanceof class521) {
                        class234.method1433(var1.field3220, var1.field3217, var1.field3228);
                        class521 var10 = (class521) var9;
                        if (var10.field7659 != null) {
                            class295.method1814(var1.field3220, var1.field3217, var1.field3228, var10.field7659, null);
                        }
                    }
                } else if (var2 == 1) {
                    class362 var7 = class335.method2002(var1.field3220, var1.field3217, var1.field3228);
                    if (var7 instanceof class453) {
                        class75.method581(var1.field3220, var1.field3217, var1.field3228);
                        class453 var8 = (class453) var7;
                        if (var8.field6340 != null) {
                            class481.method2773(var1.field3220, var1.field3217, var1.field3228, var8.field6340, null);
                        }
                    }
                } else if (var2 == 2) {
                    class144 var3 = class248.method1622(var1.field3220, var1.field3217, var1.field3228, field5993 == null ? (field5993 = method2526("nc")) : field5993);
                    if (var3 instanceof class209) {
                        class234.method1435(var1.field3220, var1.field3217, var1.field3228, field5993 == null ? (field5993 = method2526("nc")) : field5993);
                        class209 var4 = (class209) var3;
                        if (var4.field3052 != null) {
                            class120.method806(var4.field3052, false);
                        }
                    }
                } else if (var2 == 3) {
                    class35 var5 = class87.method628(var1.field3220, var1.field3217, var1.field3228);
                    if (var5 instanceof class194) {
                        class56.method467(var1.field3220, var1.field3217, var1.field3228);
                        class194 var6 = (class194) var5;
                        if (var6.field2740 != null) {
                            class222.method1368(var1.field3220, var1.field3217, var1.field3228, var6.field2740);
                        }
                    }
                }
                var1.method2891(119);
            } else if (class390.field5481 == var1.field3225) {
                int var11 = class107.field1452[var1.field3227];
                if (var11 == 0) {
                    class232 var12 = class38.method211(var1.field3220, var1.field3217, var1.field3228);
                    if (var12 instanceof class521) {
                        var1.method2891(-126);
                    } else if (class85.method615(var1.field3220, var1.field3217, var1.field3228) == null) {
                        class521 var13 = new class521(var1.field3227, var1.field3229, var1.field3224, var1.field3223, var1.field3230, var12);
                        class295.method1814(var1.field3220, var1.field3217, var1.field3228, var13, null);
                    } else {
                        var1.method2891(-125);
                    }
                } else if (var11 == 1) {
                    class362 var14 = class335.method2002(var1.field3220, var1.field3217, var1.field3228);
                    if (var14 instanceof class453) {
                        var1.method2891(-126);
                    } else if (class73.method541(var1.field3220, var1.field3217, var1.field3228) == null) {
                        class453 var15 = new class453(var1.field3227, var1.field3229, var1.field3224, var1.field3223, var1.field3230, var14);
                        class481.method2773(var1.field3220, var1.field3217, var1.field3228, var15, null);
                    } else {
                        var1.method2891(-125);
                    }
                } else if (var11 == 2) {
                    class144 var16 = class248.method1622(var1.field3220, var1.field3217, var1.field3228, field5993 == null ? (field5993 = method2526("nc")) : field5993);
                    if (var16 instanceof class209) {
                        var1.method2891(45);
                    } else {
                        class234.method1435(var1.field3220, var1.field3217, var1.field3228, field5993 == null ? (field5993 = method2526("nc")) : field5993);
                        class270 var17 = class377.field5338.method1901(50, var1.field3218);
                        int var18;
                        int var19;
                        if (var1.field3229 == 1 || var1.field3229 == 3) {
                            var18 = var17.field4012;
                            var19 = var17.field3937;
                        } else {
                            var18 = var17.field3937;
                            var19 = var17.field4012;
                        }
                        class209 var20 = new class209(var1.field3227, var1.field3229, var1.field3220, var1.field3224, var1.field3223, var1.field3230, var1.field3217, var1.field3217 - (1 - var18), var1.field3228, var19 + var1.field3228 - 1, var16);
                        class120.method806(var20, false);
                    }
                } else if (var11 == 3) {
                    class35 var21 = class87.method628(var1.field3220, var1.field3217, var1.field3228);
                    if (var21 instanceof class194) {
                        var1.method2891(66);
                    } else {
                        class194 var22 = new class194(var1.field3224, var1.field3223, var1.field3230, var21);
                        class222.method1368(var1.field3220, var1.field3217, var1.field3228, var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method492(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public abstract void method497(Graphics arg0, boolean arg1, int arg2, int arg3);

    // $FF: synthetic method
    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2526(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
