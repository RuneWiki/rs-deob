import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class310 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)[Lti;", line = 11)
    public static final class248[] method2254(boolean arg0) {
        if (arg0) {
            field5057 = 105;
        }
        field5054++;
        if (class52.field1049 == null) {
            class248[] var1 = class81.method600(11, class59.field1164);
            class248[] var2 = new class248[var1.length];
            int var3 = 0;
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class248 var5 = var1[var4];
                if ((var5.field4074 <= 0 || var5.field4074 >= 24) && var5.field4070 >= 800 && var5.field4073 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class248 var7 = var2[var6];
                        if (var5.field4070 == var7.field4070 && var5.field4073 == var7.field4073) {
                            if (var7.field4074 < var5.field4074) {
                                var2[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class52.field1049 = new class248[var3];
            class89.method691(var2, 0, class52.field1049, 0, var3);
            int[] var8 = new int[class52.field1049.length];
            for (int var9 = 0; var9 < class52.field1049.length; var9++) {
                class248 var10 = class52.field1049[var9];
                var8[var9] = var10.field4073 * var10.field4070;
            }
            class200.method1370(var8, class52.field1049, 0);
        }
        return class52.field1049;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lml;IIIII)V", line = 91)
    public static final void method2255(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class138.field2345 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class224.field3701) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class280.field4578 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class312 var14 = class353.field5644[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class144.field2427[var11][var12 + 1][var13] + class144.field2427[var11][var12][var13] + class144.field2427[var11][var12][var13 + 1] + class144.field2427[var11][var12 + 1][var13 + 1]) / 4 - (class144.field2427[arg1][arg2 + 1][arg3] + class144.field2427[arg1][arg2][arg3] + class144.field2427[arg1][arg2][arg3 + 1] + class144.field2427[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class16 var16 = var14.field5102;
                                    if (var16 != null) {
                                        if (var16.field473.method418()) {
                                            arg0.method426(var16.field473, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field465 != null && var16.field465.method418()) {
                                            arg0.method426(var16.field465, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field5078; var17++) {
                                        class278 var18 = var14.field5089[var17];
                                        if (var18 != null && var18.field4529.method418() && (var18.field4523 == var12 || var7 == var12) && (var18.field4530 == var13 || var9 == var13)) {
                                            int var19 = var18.field4525 + 1 - var18.field4523;
                                            int var20 = var18.field4544 + 1 - var18.field4530;
                                            arg0.method426(var18.field4529, (var18.field4523 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4530 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 186)
    public static final void method2256(byte arg0) {
        field5055++;
        if (arg0 == 61) {
            class232.field3796 = null;
            class222.field3667 = null;
            class21.field549 = null;
            class148.field2523 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB[Lg;)V", line = 201)
    public static final void method2258(int arg0, byte arg1, class181[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class181 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3098 == 0) {
                    if (var4.field3095 != null) {
                        method2258(arg0, (byte) 73, var4.field3095);
                    }
                    class355 var5 = (class355) class34.field758.method2344(-1, (long) var4.field3103);
                    if (var5 != null) {
                        class222.method1557(arg0, true, var5.field5657);
                    }
                }
                if (arg0 == 0 && var4.field3070 != null) {
                    class47 var6 = new class47();
                    var6.field939 = var4;
                    var6.field936 = var4.field3070;
                    class20.method184(var6, (byte) -120);
                }
                if (arg0 == 1 && var4.field3038 != null) {
                    if (var4.field3023 >= 0) {
                        class181 var7 = class224.method1564(-97, var4.field3103);
                        if (var7 == null || var7.field3095 == null || var7.field3095.length <= var4.field3023 || var7.field3095[var4.field3023] != var4) {
                            continue;
                        }
                    }
                    class47 var8 = new class47();
                    var8.field936 = var4.field3038;
                    var8.field939 = var4;
                    class20.method184(var8, (byte) -55);
                }
            }
        }
        int var9 = -66 % ((-arg1 - 8) / 33);
        field5056++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 277)
    public static final String method2259(String arg0, int arg1) {
        field5058++;
        if (arg0 == null) {
            return null;
        }
        int var2 = arg0.length();
        int var3;
        for (var3 = 0; var2 > var3 && class73.method552(arg0.charAt(var3), 32); var3++) {
        }
        while (var2 > var3 && class73.method552(arg0.charAt(var2 - 1), 32)) {
            var2--;
        }
        if (arg1 >= -5) {
            field5059 = -57;
        }
        int var4 = var2 - var3;
        if (var4 < 1 || var4 > 20) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var3; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (class318.method2294(var7, 56843536)) {
                char var8 = class39.method296(false, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2252(int arg0, Component arg1);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2253(int arg0, Component arg1);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
    public abstract int method2257(byte arg0);
}
