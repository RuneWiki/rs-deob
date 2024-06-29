import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class390 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public int field5683 = 0;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public int field5684 = 0;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public int field5689 = 2048;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public int field5693 = 2048;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field5688 = 0;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Lnj;")
    public static class487 field5692 = new class487("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)I")
    public static final int method2353(boolean arg0, int arg1) {
        field5690++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0) {
                method2359(-30);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lps;BI)V")
    private final void method2354(class428 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field5683 = arg0.method2561((byte) 126);
        } else if (arg2 == 2) {
            this.field5693 = arg0.method2620(70);
        } else if (arg2 == 3) {
            this.field5689 = arg0.method2620(126);
        } else if (arg2 == 4) {
            this.field5684 = arg0.method2622((byte) 123);
        }
        if (arg1 != 121) {
            field5688 = 38;
        }
        field5687++;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Llba;Z)Z")
    public static final boolean method2355(class237 arg0, boolean arg1) {
        boolean var2 = class287.field4219 == class235.field3455;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method504((byte) -126);
        if (arg0.field3469 < 0 || arg0.field3472 < 0 || arg0.field3459 >= class331.field4909 || arg0.field3462 >= class366.field5271) {
            return false;
        }
        for (int var6 = arg0.field3469; var6 <= arg0.field3459; var6++) {
            for (int var9 = arg0.field3472; var9 <= arg0.field3462; var9++) {
                class415 var10 = class240.method1542(arg0.field3457, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field3469) {
                        var11++;
                    }
                    if (var6 < arg0.field3459) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field3472) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field3462) {
                        var11 += 2;
                    }
                    class639 var12 = class228.method1488(arg0, -17917, var11);
                    class639 var13 = var10.field5981;
                    if (var13 == null) {
                        var10.field5981 = var12;
                    } else {
                        while (var13.field9291 != null) {
                            var13 = var13.field9291;
                        }
                        var13.field9291 = var12;
                    }
                    var10.field5992 = (byte) (var10.field5992 | var11);
                    if (var2 && (class206.field3077[var6][var9] & 0xFF000000) != 0) {
                        var3 = class206.field3077[var6][var9];
                        var4 = class143.field1861[var6][var9];
                        var5 = class642.field9324[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field3469; var7 <= arg0.field3459; var7++) {
                for (int var8 = arg0.field3472; var8 <= arg0.field3462; var8++) {
                    if ((class206.field3077[var7][var8] & 0xFF000000) == 0) {
                        class206.field3077[var7][var8] = var3;
                        class143.field1861[var7][var8] = var4;
                        class642.field9324[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class135.field1788[class516.field7651++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static final void method2356(byte arg0) {
        field5691++;
        if (class644.field9345 != null) {
            return;
        }
        if (arg0 != 115) {
            method2357(26);
        }
        int var1 = class124.field1632;
        int var2 = class467.field6748;
        int var3 = class507.field7548 - class522.field7735 - var1;
        int var4 = class564.field8356 - class337.field4944 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class248.field3628 == null) {
                var5 = class328.field4850.field5129;
            } else {
                var5 = class248.field3628;
            }
            int var6 = 0;
            int var7 = 0;
            if (class248.field3628 == var5) {
                Insets var8 = class248.field3628.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class564.field8356);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class507.field7548, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class507.field7548 - var3, var7, var3, class564.field8356);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class564.field8356 + var7 - var4, class507.field7548, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method2357(int arg0) {
        if (arg0 == 3641) {
            field5692 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lps;B)V")
    public final void method2358(class428 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2561((byte) -35);
            if (var3 == 0) {
                if (arg1 <= 74) {
                    method2355(null, false);
                }
                field5685++;
                return;
            }
            this.method2354(arg0, (byte) 121, var3);
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
    public static final boolean method2359(int arg0) {
        field5686++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class646.field9380.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class646.field9380.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class646.field9380.keys();
                if (arg0 != 14306) {
                    field5688 = 114;
                }
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class110.field1399.get(var9);
                        Class var11 = (Class) class646.field9380.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class646.field9380 = var1;
        return class646.field9380.isEmpty();
    }
}
