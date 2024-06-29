import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class450 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lcf;")
    private class92 field6402;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lcf;")
    public static class92 field6398 = new class92();

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
    public static boolean field6405 = false;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[Z")
    public static boolean[] field6408;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
    public static int[] field6407;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lnl;")
    public static class435 field6404;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lrs;")
    private class449 field6399;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field6412;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field6413;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field6414;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field6410;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lrs;")
    public final class449 method2717(int arg0) {
        field6400++;
        class449 var2 = this.field6402.field1299.field6385;
        if (this.field6402.field1299 == var2) {
            this.field6399 = null;
            return null;
        }
        if (arg0 != -17927) {
            method2719();
        }
        this.field6399 = var2.field6385;
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLcf;)V")
    public final void method2718(boolean arg0, class92 arg1) {
        if (!arg0) {
            this.field6402 = null;
        }
        this.field6402 = arg1;
        field6401++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
    public static final void method2719() {
        class357.field4936 = 0;
        label191: for (int var0 = 0; var0 < class198.field2924; var0++) {
            class34 var1 = class153.field2126[var0];
            if (class295.field4173 != null) {
                for (int var2 = 0; var2 < class295.field4173.length; var2++) {
                    if (class295.field4173[var2] != -1000000 && (var1.field365 <= class295.field4173[var2] || var1.field353 <= class295.field4173[var2]) && (var1.field351 <= class448.field6380[var2] || var1.field367 <= class448.field6380[var2]) && (var1.field351 >= class112.field1575[var2] || var1.field367 >= class112.field1575[var2]) && (var1.field355 <= class24.field258[var2] || var1.field350 <= class24.field258[var2]) && (var1.field355 >= class95.field1339[var2] || var1.field350 >= class95.field1339[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field354 == 1) {
                int var3 = var1.field359 + class4.field30 - class409.field5607;
                if (var3 >= 0 && var3 <= class4.field30 + class4.field30) {
                    int var4 = var1.field347 + class4.field30 - class54.field811;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field370 + class4.field30 - class54.field811;
                    if (var5 > class4.field30 + class4.field30) {
                        var5 = class4.field30 + class4.field30;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class154.field2129[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class200.field2966 - var1.field351;
                        if (var7 > class47.field715) {
                            var1.field352 = 1;
                        } else {
                            if (var7 >= -class47.field715) {
                                continue;
                            }
                            var1.field352 = 2;
                            var7 = -var7;
                        }
                        var1.field348 = (var1.field355 - class385.field5280 << 8) / var7;
                        var1.field356 = (var1.field350 - class385.field5280 << 8) / var7;
                        var1.field361 = (var1.field365 - class371.field5106 << 8) / var7;
                        var1.field345 = (var1.field353 - class371.field5106 << 8) / var7;
                        class55.field816[class357.field4936++] = var1;
                    }
                }
            } else if (var1.field354 == 2) {
                int var8 = var1.field347 + class4.field30 - class54.field811;
                if (var8 >= 0 && var8 <= class4.field30 + class4.field30) {
                    int var9 = var1.field359 + class4.field30 - class409.field5607;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field364 + class4.field30 - class409.field5607;
                    if (var10 > class4.field30 + class4.field30) {
                        var10 = class4.field30 + class4.field30;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class154.field2129[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class385.field5280 - var1.field355;
                        if (var12 > class47.field715) {
                            var1.field352 = 3;
                        } else {
                            if (var12 >= -class47.field715) {
                                continue;
                            }
                            var1.field352 = 4;
                            var12 = -var12;
                        }
                        var1.field362 = (var1.field351 - class200.field2966 << 8) / var12;
                        var1.field366 = (var1.field367 - class200.field2966 << 8) / var12;
                        var1.field361 = (var1.field365 - class371.field5106 << 8) / var12;
                        var1.field345 = (var1.field353 - class371.field5106 << 8) / var12;
                        class55.field816[class357.field4936++] = var1;
                    }
                }
            } else if (var1.field354 == 4) {
                int var13 = var1.field365 - class371.field5106;
                if (var13 > class47.field714) {
                    int var14 = var1.field347 + class4.field30 - class54.field811;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field370 + class4.field30 - class54.field811;
                    if (var15 > class4.field30 + class4.field30) {
                        var15 = class4.field30 + class4.field30;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field359 + class4.field30 - class409.field5607;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field364 + class4.field30 - class409.field5607;
                        if (var17 > class4.field30 + class4.field30) {
                            var17 = class4.field30 + class4.field30;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class154.field2129[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field352 = 5;
                            var1.field362 = (var1.field351 - class200.field2966 << 8) / var13;
                            var1.field366 = (var1.field367 - class200.field2966 << 8) / var13;
                            var1.field348 = (var1.field355 - class385.field5280 << 8) / var13;
                            var1.field356 = (var1.field350 - class385.field5280 << 8) / var13;
                            class55.field816[class357.field4936++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lrs;")
    public final class449 method2720(int arg0) {
        field6403++;
        class449 var2 = this.field6399;
        if (this.field6402.field1299 == var2) {
            this.field6399 = null;
            return null;
        } else if (arg0 > -27) {
            return null;
        } else {
            this.field6399 = var2.field6385;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class450() {
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method2721(byte arg0) {
        field6408 = null;
        field6404 = null;
        field6410 = null;
        if (arg0 == 29) {
            field6407 = null;
            field6398 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lis;Ljava/awt/Canvas;IILtq;I)Lvc;")
    public static final class89 method2722(class65 arg0, Canvas arg1, int arg2, int arg3, class248 arg4, int arg5) {
        field6406++;
        try {
            if (arg3 <= 57) {
                method2722((class65) null, (Canvas) null, -52, 76, (class248) null, -107);
            }
            Class var6 = Class.forName("fu");
            Constructor var7 = var6.getConstructor(field6412 == null ? (field6412 = method2723("java.awt.Canvas")) : field6412, field6413 == null ? (field6413 = method2723("tq")) : field6413, Integer.TYPE, Integer.TYPE, field6414 == null ? (field6414 = method2723("is")) : field6414);
            return (class89) var7.newInstance(arg1, arg4, Integer.valueOf(arg5), new Integer(arg2), arg0);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lcf;)V")
    public class450(class92 arg0) {
        this.field6402 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field6408 = new boolean[100];
        field6409 = 16777215;
        field6407 = new int[13];
        field6411 = 2;
    }
}
