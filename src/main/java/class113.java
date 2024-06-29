import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class113 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lst;")
    private class366 field1731 = new class366();

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ldea;")
    private class205 field1732;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Ldv;")
    public static class566 field1737 = new class566(72, 1);

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1745;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        if (arg0 != 1) {
            return;
        }
        for (class509 var2 = (class509) this.field1731.method2197(0); var2 != null; var2 = (class509) this.field1731.method2200(-1)) {
            if (var2.method997(2000)) {
                var2.method1117(0);
                var2.method896(0);
                this.field1738 += var2.field7107;
            }
        }
        field1730++;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
    public final int method784(int arg0) {
        field1743++;
        if (arg0 != 0) {
            method795(null, null, 59, -83, -35);
        }
        return this.field1738;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z")
    public static final boolean method785(int arg0) {
        field1736++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class91.field1424.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class91.field1424.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            if (arg0 != 0) {
                field1745 = null;
            }
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class91.field1424.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class469.field6604.get(var9);
                        Class var11 = (Class) class91.field1424.get(var9);
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
        class91.field1424 = var1;
        return class91.field1424.isEmpty();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
    public static final boolean method786(boolean arg0) {
        field1741++;
        return class336.method2038(arg0, "jaclib") ? class336.method2038(arg0, "hw3d") : false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfw;B)V")
    private final void method787(class50 arg0, byte arg1) {
        if (arg1 <= 25) {
            method793(14, 29, (byte) 18);
        }
        field1746++;
        long var3 = arg0.method481(4095);
        for (class509 var5 = (class509) this.field1732.method1242(0, var3); var5 != null; var5 = (class509) this.field1732.method1243(-1)) {
            if (var5.field7102.method482((byte) -34, arg0)) {
                this.method796(-116, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method788(int arg0) {
        this.field1731.method2201(arg0 ^ 0x3EE7);
        field1739++;
        this.field1732.method1247(arg0 + 16015);
        this.field1738 = this.field1744;
        if (arg0 != -16015) {
            this.method787(null, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public final void method789(int arg0, int arg1) {
        field1734++;
        if (class282.field3898 != null) {
            for (class509 var3 = (class509) this.field1731.method2197(0); var3 != null; var3 = (class509) this.field1731.method2200(-1)) {
                if (var3.method997(2000)) {
                    if (var3.method991(arg0 + 15706) == null) {
                        var3.method1117(0);
                        var3.method896(0);
                        this.field1738 += var3.field7107;
                    }
                } else if ((long) arg1 < ++var3.field2110) {
                    class509 var4 = class282.field3898.method2823(false, var3);
                    this.field1732.method1241(var4, var3.field2524, -125);
                    class47.method471(999999, var4, var3);
                    var3.method1117(0);
                    var3.method896(0);
                }
            }
        }
        if (arg0 != -15598) {
            this.method796(-58, null);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfw;IILjava/lang/Object;)V")
    private final void method790(class50 arg0, int arg1, int arg2, Object arg3) {
        if (arg1 != 5887) {
            this.method787(null, (byte) -43);
        }
        field1729++;
        if (this.field1744 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method787(arg0, (byte) 55);
        this.field1738 -= arg2;
        while (this.field1738 < 0) {
            class509 var6 = (class509) this.field1731.method2193(-11636);
            this.method796(-122, var6);
        }
        class152 var5 = new class152(arg0, arg3, arg2);
        this.field1732.method1241(var5, arg0.method481(4095), -114);
        this.field1731.method2199(arg1 - 29638, var5);
        var5.field2110 = 0L;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfw;ILjava/lang/Object;)V")
    public final void method791(class50 arg0, int arg1, Object arg2) {
        field1748++;
        this.method790(arg0, arg1 ^ 0x7709, 1, arg2);
        if (arg1 != 25078) {
            method794(86, (byte) -42, 114, false, null, null, true);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfw;I)Ljava/lang/Object;")
    public final Object method792(class50 arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        field1735++;
        long var3 = arg0.method481(4095);
        for (class509 var5 = (class509) this.field1732.method1242(0, var3); var5 != null; var5 = (class509) this.field1732.method1243(-1)) {
            if (var5.field7102.method482((byte) -34, arg0)) {
                Object var6 = var5.method991(arg1 + 61);
                if (var6 != null) {
                    if (var5.method997(arg1 + 1999)) {
                        class152 var7 = new class152(arg0, var6, var5.field7107);
                        this.field1732.method1241(var7, var5.field2524, -106);
                        this.field1731.method2199(-23751, var7);
                        var7.field2110 = 0L;
                        var5.method1117(0);
                        var5.method896(0);
                    } else {
                        this.field1731.method2199(-23751, var5);
                        var5.field2110 = 0L;
                    }
                    return var6;
                }
                var5.method1117(arg1 - 1);
                var5.method896(arg1 - 1);
                this.field1738 += var5.field7107;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method793(int arg0, int arg1, byte arg2) {
        if (arg2 == 57) {
            field1733++;
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBIZLkf;Lkf;Z)I")
    public static final int method794(int arg0, byte arg1, int arg2, boolean arg3, class212 arg4, class212 arg5, boolean arg6) {
        field1747++;
        int var7 = class180.method1133(arg4, arg5, arg2, arg3, 0);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            if (arg1 != 110) {
                method794(-31, (byte) 44, -47, false, null, null, true);
            }
            int var8 = class180.method1133(arg4, arg5, arg0, arg6, 0);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqa;Ljt;III)V")
    public static final void method795(class207 arg0, class87 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class332.field4447) {
            class622 var5 = class356.field4807[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field8979 != null && var5.field8979.method264(1)) {
                arg1.method258(0, true, 112, 0, var5.field8979, class41.field808, arg0);
            }
        }
        if (arg4 < class332.field4447) {
            class622 var6 = class356.field4807[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field8979 != null && var6.field8979.method264(1)) {
                arg1.method258(class41.field808, true, 113, 0, var6.field8979, 0, arg0);
            }
        }
        if (arg3 < class332.field4447 && arg4 < class34.field624) {
            class622 var7 = class356.field4807[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field8979 != null && var7.field8979.method264(1)) {
                arg1.method258(class41.field808, true, 102, 0, var7.field8979, class41.field808, arg0);
            }
        }
        if (arg3 < class332.field4447 && arg4 > 0) {
            class622 var8 = class356.field4807[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field8979 != null && var8.field8979.method264(1)) {
                arg1.method258(-class41.field808, true, 103, 0, var8.field8979, class41.field808, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILnu;)V")
    private final void method796(int arg0, class509 arg1) {
        if (arg0 >= -64) {
            this.method792(null, 28);
        }
        field1742++;
        if (arg1 != null) {
            arg1.method1117(0);
            arg1.method896(0);
            this.field1738 += arg1.field7107;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public static void method797(int arg0) {
        if (arg0 < 90) {
            field1745 = null;
        }
        field1745 = null;
        field1737 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        this.field1738 = arg0;
        this.field1744 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1732 = new class205(var2);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
    public final int method798(byte arg0) {
        field1740++;
        int var2 = -42 / ((arg0 - 33) / 56);
        return this.field1744;
    }

    static {
        new class104("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field1745 = null;
    }
}
