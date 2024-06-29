import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class7 {

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field78 = new String[] { method55(method54("FQ7|\u0016")), method55(method54("E\\oW\u0010C\\wQ\u0010lQxEMcRxR[]")), method55(method54("E\\oW\u0010C\\wQ\u0010]X\u007fZ[LI7w]LXjEWMQ|y\\EXzB")), method55(method54("\\Xmw]LXjEWMQ|")), method55(method54("A\\m_HJqpTLNOpSM")), method55(method54("G\\wRRJ")), method55(method54("ITwWRFG|")), method55(method54("FQ7~\u0016")), method55(method54("A\\tS")), method55(method54("FQ7\u007f\u0016")), method55(method54("FQ7q\u0016")), method55(method54("FQ7p\u0016")) };

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Lue;")
    public static class244[] field74 = new class244[6];

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field76 = 16777215;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)J")
    public abstract long method45(int arg0);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public abstract void method46(boolean arg0);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)I")
    public final int method47(int arg0, long arg1) {
        try {
            field75++;
            long var4 = this.method49(-9305);
            if (arg0 != 0) {
                field74 = null;
            }
            if (var4 > 0L) {
                class151.method1269(false, var4);
            }
            return this.method52(false, arg1);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field78[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
    public static final boolean method48(int arg0) {
        try {
            field73++;
            Hashtable var1 = new Hashtable();
            Enumeration var2 = class343.field5324.keys();
            while (var2.hasMoreElements()) {
                Object var3 = var2.nextElement();
                var1.put(var3, class343.field5324.get(var3));
            }
            try {
                Class var4 = Class.forName(field78[2]);
                if (arg0 != 0) {
                    return true;
                }
                Class var5 = Class.forName(field78[1]);
                Field var6 = var5.getDeclaredField(field78[4]);
                Method var7 = var4.getDeclaredMethod(field78[3], Boolean.TYPE);
                var7.invoke(var6, Boolean.TRUE);
                try {
                    Enumeration var8 = class343.field5324.keys();
                    while (var8.hasMoreElements()) {
                        String var9 = (String) var8.nextElement();
                        try {
                            File var10 = (File) class275.field4152.get(var9);
                            Class var11 = (Class) class343.field5324.get(var9);
                            Vector var12 = (Vector) var6.get(var11.getClassLoader());
                            for (int var13 = 0; var13 < var12.size(); var13++) {
                                try {
                                    Object var14 = var12.elementAt(var13);
                                    Field var15 = var14.getClass().getDeclaredField(field78[8]);
                                    var7.invoke(var15, Boolean.TRUE);
                                    try {
                                        String var16 = (String) var15.get(var14);
                                        if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                            Field var17 = var14.getClass().getDeclaredField(field78[5]);
                                            Method var18 = var14.getClass().getDeclaredMethod(field78[6]);
                                            var7.invoke(var17, Boolean.TRUE);
                                            var7.invoke(var18, Boolean.TRUE);
                                            try {
                                                var18.invoke(var14);
                                                var17.set(var14, Integer.valueOf(0));
                                                var1.remove(var9);
                                            } catch (Throwable var20) {
                                            }
                                            var7.invoke(var18, Boolean.FALSE);
                                            var7.invoke(var17, Boolean.FALSE);
                                        }
                                    } catch (Throwable var21) {
                                    }
                                    var7.invoke(var15, Boolean.FALSE);
                                } catch (Throwable var22) {
                                }
                            }
                        } catch (Throwable var23) {
                        }
                    }
                } catch (Throwable var24) {
                }
                var7.invoke(var6, Boolean.FALSE);
            } catch (Throwable var25) {
            }
            class343.field5324 = var1;
            return class343.field5324.isEmpty();
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field78[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)J")
    public abstract long method49(int arg0);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
    public static final void method50(int arg0, byte arg1) {
        try {
            if (arg1 >= 44) {
                field72++;
                if (class20.field232 == null || arg0 > class20.field232.length) {
                    class20.field232 = new int[arg0];
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field78[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)J")
    public static final long method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field77++;
            int var7 = 105 % ((arg2 - 32) / 53);
            class555.field8262.clear();
            class555.field8262.set(arg6, arg4, arg5, arg1, arg3, arg0);
            return class555.field8262.getTime().getTime();
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field78[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZJ)I")
    public abstract int method52(boolean arg0, long arg1);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method53(byte arg0) {
        try {
            field74 = null;
            if (arg0 > -110) {
                method51(51, -78, 106, 107, 119, 21, 70);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field78[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method54(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!il", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method55(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
