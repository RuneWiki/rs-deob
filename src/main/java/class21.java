import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class21 extends class272 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "J")
    public static long field351 = 0L;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lpj;")
    public static class284 field349 = new class284();

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[I")
    public static int[] field357 = new int[32];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Loh;")
    public static class240 field358;

    // $FF: synthetic field
    @OriginalMember(owner = "client!p", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field359;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
    public static int[] field356;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIZZ)Lpk;")
    public static final class237 method143(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field350++;
        class222 var5 = null;
        if (class136.field1982 != null) {
            var5 = new class222(arg2, class136.field1982, class285.field4375[arg2], 1000000);
        }
        class64.field1064[arg2] = class155.field2274.method648(class209.field3129, 6339, var5, arg2);
        if (arg3) {
            class64.field1064[arg2].method509(-1760);
        }
        if (arg1 != 1000000) {
            field349 = null;
        }
        return new class237(class64.field1064[arg2], arg4, arg0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lca;I)V")
    public static final void method144(class54 arg0, int arg1) {
        field348++;
        if (arg1 < 7) {
            return;
        }
        while (true) {
            while (arg0.field887 < arg0.field848.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method407(255) == 1) {
                    var2 = true;
                    var3 = arg0.method407(255);
                    var4 = arg0.method407(255);
                }
                int var5 = arg0.method407(255);
                int var6 = arg0.method407(255);
                int var7 = var5 * 64 - class141.field2029;
                int var8 = class235.field3619 + class67.field1114 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class133.field1956 > var7 + 63 && var8 < class235.field3619) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && (var3 * 8 + 8) > var11 && (var4 * 8) <= var12 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method459(false);
                                if (var13 != 0) {
                                    if (class243.field3765[var9][var10] == null) {
                                        class243.field3765[var9][var10] = new byte[4096];
                                    }
                                    class243.field3765[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method459(false);
                                    if (class164.field2403[var9][var10] == null) {
                                        class164.field2403[var9][var10] = new byte[4096];
                                    }
                                    class164.field2403[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method459(false);
                        if (var16 != 0) {
                            arg0.field887++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field352++;
        class297 var7 = class237.method1617(arg6, (byte) 63, arg4);
        if (var7 != null && var7.field4672 != null) {
            class43 var8 = new class43();
            var8.field767 = var7.field4672;
            var8.field750 = var7;
            class137.method934(200000, var8);
        }
        class207.field3108 = arg5;
        class270.field4218 = arg3;
        class76.field1205 = true;
        class111.field1688 = arg4;
        class54.field858 = arg6;
        class181.field2642 = arg0;
        class146.field2123 = arg1;
        if (arg2 != -15568) {
            field358 = null;
        }
        class297.method1979((byte) -83, var7);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
    public static final void method146(byte arg0, int arg1) {
        class15.field288.method938(arg1, (byte) -123);
        int var2 = 107 % ((arg0 + 34) / 51);
        field354++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method147(int arg0) {
        field349 = null;
        field357 = null;
        field356 = null;
        int var1 = 2 / ((arg0 - 9) / 58);
        field358 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method148(boolean arg0) {
        try {
            Method var1 = (field359 == null ? (field359 = method151("java.lang.Runtime")) : field359).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class155.field2270 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (!arg0) {
            field349 = null;
        }
        field355++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III[I[I)V")
    public static final void method149(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field347++;
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (arg3[var9] > var7 + (var9 & 0x1)) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method149(-109, var6 - 1, arg2, arg3, arg4);
            method149(-115, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 >= -92) {
            method148(true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method150(Component arg0, int arg1) {
        field353++;
        Method var2 = class26.field519;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class156.field2281);
        arg0.addFocusListener(class156.field2281);
        if (arg1 <= 15) {
            method150((Component) null, 94);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method151(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
