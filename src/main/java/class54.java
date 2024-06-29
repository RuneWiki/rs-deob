import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class54 {

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Ljda;")
    private class239 field769 = new class239(64);

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "Ljda;")
    public class239 field773 = new class239(64);

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Laj;")
    private class333 field763;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "Laj;")
    public class333 field771;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
    public static boolean field772 = false;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
    public final void method390(byte arg0, int arg1) {
        class239 var3 = this.field769;
        synchronized (this.field769) {
            this.field769.method1546(arg1, (byte) -8);
        }
        field766++;
        if (arg0 == 92) {
            class239 var4 = this.field773;
            synchronized (this.field773) {
                this.field773.method1546(arg1, (byte) -8);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    public final void method391(byte arg0) {
        class239 var2 = this.field769;
        synchronized (this.field769) {
            this.field769.method1552(arg0 ^ 0x17);
        }
        field770++;
        class239 var3 = this.field773;
        synchronized (this.field773) {
            this.field773.method1552(arg0 - 142);
            if (arg0 != 24) {
                field772 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZII)V")
    public final void method392(boolean arg0, int arg1, int arg2) {
        this.field769 = new class239(arg2);
        if (arg0) {
            field767++;
            this.field773 = new class239(arg1);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        field762++;
        class239 var2 = this.field769;
        synchronized (this.field769) {
            this.field769.method1555((byte) -3);
        }
        if (arg0) {
            class239 var3 = this.field773;
            synchronized (this.field773) {
                this.field773.method1555((byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)Z")
    public static final boolean method394(byte arg0) {
        field764++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class139.field2027.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class139.field2027.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class139.field2027.keys();
                if (arg0 != -28) {
                    method394((byte) -103);
                }
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class587.field7824.get(var9);
                        Class var11 = (Class) class139.field2027.get(var9);
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
        class139.field2027 = var1;
        return class139.field2027.isEmpty();
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method395(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class192.field2582 = arg0;
        class695.field9751 = arg1;
        class238.field3214 = class695.field9751 > 1 && class192.field2582.method522();
        class26.field388 = arg2;
        class48.field722 = 0x1 << class26.field388;
        class30.field464 = class48.field722 >> 1;
        Math.sqrt((double) (class30.field464 * class30.field464 + class30.field464 * class30.field464));
        class315.field4541 = arg3;
        class405.field5875 = arg4;
        class710.field9947 = arg5;
        class174.field2337 = arg6;
        class754.field10482 = class592.method3300(false);
        class784.method4340(68);
        class513.field7033 = new class243[arg3][class405.field5875][class710.field9947];
        class412.field5933 = new class296[arg3];
        if (arg7) {
            class176.field2351 = new int[class405.field5875][class710.field9947];
            class261.field3883 = new byte[class405.field5875][class710.field9947];
            class767.field10581 = new short[class405.field5875][class710.field9947];
            class747.field10304 = new class243[1][class405.field5875][class710.field9947];
            class538.field7317 = new class296[1];
        } else {
            class176.field2351 = null;
            class261.field3883 = null;
            class767.field10581 = null;
            class747.field10304 = null;
            class538.field7317 = null;
        }
        if (arg8) {
            class608.field8264 = new long[arg3][arg4][arg5];
            class369.field5356 = new class700[65535];
            class321.field4618 = new boolean[65535];
            class490.field6806 = 0;
        } else {
            class608.field8264 = null;
            class369.field5356 = null;
            class321.field4618 = null;
            class490.field6806 = 0;
        }
        class302.method1911(false);
        class308.field4450 = new class167[2];
        class563.field7549 = new class167[2];
        class503.field6961 = new class167[2];
        class78.field1117 = new class167[10000];
        class16.field235 = 0;
        class122.field1784 = new class167[5000];
        class455.field6321 = 0;
        class200.field2657 = new class319[5000];
        class186.field2480 = 0;
        class79.field1122 = new boolean[class174.field2337 + class174.field2337 + 1][class174.field2337 + class174.field2337 + 1];
        class245.field3316 = new boolean[class174.field2337 + class174.field2337 + 2][class174.field2337 + class174.field2337 + 2];
        class214.field2822 = new int[class174.field2337 + class174.field2337 + 2];
        class201.field2670 = class201.field2666;
        if (class238.field3214) {
            class603.field8203 = new boolean[arg3][class174.field2337 + class174.field2337 + 1][class174.field2337 + class174.field2337 + 1];
            class34.field560 = new boolean[arg3][][];
            if (class665.field9187 != null) {
                class664.method3677();
            }
            class665.field9187 = new class211[class695.field9751];
            class192.field2582.method554(class665.field9187.length + 1);
            class192.field2582.method469(0);
            for (int var9 = 0; var9 < class665.field9187.length; var9++) {
                class665.field9187[var9] = new class211(var9 + 1, class192.field2582);
                (new Thread(class665.field9187[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class695.field9751 == 2) {
                var10 = 4;
                class458.field6353 = 2;
            } else if (class695.field9751 == 3) {
                var10 = 6;
                class458.field6353 = 3;
            } else {
                var10 = 8;
                class458.field6353 = 4;
            }
            class398.field5838 = new class556[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class398.field5838[var11] = new class556(class101.field1407[class695.field9751 - 2][var11]);
            }
        } else {
            class458.field6353 = 1;
        }
        class418.field5999 = new int[class458.field6353 - 1];
        class370.field5371 = new int[class458.field6353 - 1];
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)Lko;")
    public final class532 method396(int arg0, byte arg1) {
        field765++;
        class239 var3 = this.field769;
        class532 var4;
        synchronized (this.field769) {
            var4 = (class532) this.field769.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field763;
        byte[] var6;
        synchronized (this.field763) {
            if (arg1 != -104) {
                this.method392(false, -71, -5);
            }
            var6 = this.field763.method2095(arg0, 34, 1);
        }
        class532 var7 = new class532();
        var7.field7251 = this;
        if (var6 != null) {
            var7.method3050((byte) -19, new class376(var6));
        }
        class239 var8 = this.field769;
        synchronized (this.field769) {
            this.field769.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V")
    public class54(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field763 = arg2;
        this.field771 = arg3;
        this.field763.method2090(34, false);
    }
}
