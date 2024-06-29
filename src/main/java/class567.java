import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class567 extends class514 {

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    public int field8286;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public int field8291;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
    public int field8284;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public int field8293;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public int field8288;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public int field8287;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    public static int field8285 = 0;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V", line = 3)
    public static final void method3321(byte arg0) {
        field8292++;
        class534.field7800.method1499((byte) -105);
        class176.field2178.method2183((byte) 104);
        class616.field8848.method3439(0);
        class37.field703.method813((byte) 103);
        class206.field2477.method1952(113);
        class65.field1021.method182((byte) -123);
        class195.field2367.method3269(true);
        class276.field3774.method135(false);
        class342.field4519.method2682(64);
        class193.field2350.method689(1);
        class332.field4418.method728((byte) 116);
        class308.field4085.method562(-1812);
        class455.field6408.method3819((byte) 82);
        class496.field6935.method1782((byte) 124);
        class582.field8483.method2537((byte) -110);
        class415.field5873.method2753((byte) -56);
        class32.field653.method2507(true);
        class39.field731.method1391(31);
        if (arg0 >= -45) {
            method3321((byte) -53);
        }
        class404.field5708.method2761((byte) -75);
        class468.field6543.method1823(26125);
        class255.method1557(-38);
        class656.method3713(95);
        class65.method615((byte) 122);
        class22.method346((byte) -115);
        class148.method953(-3);
        class89.field1252.method2778((byte) 108);
        class72.field1088.method2778((byte) 127);
        class48.field814.method2778((byte) 112);
        class514.field7541.method2778((byte) 126);
        class545.field7926.method2778((byte) 111);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lwd;IIILjava/awt/Component;)Lkv;", line = 48)
    public static final class245 method3322(class248 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field8295++;
        if (class73.field1105 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class245 var5 = (class245) Class.forName("eda").getDeclaredConstructor().newInstance();
                var5.field3373 = arg1;
                var5.field3363 = new int[(class658.field9343 ? 2 : 1) * 256];
                var5.method678(arg4);
                var5.field3374 = (arg2 & arg1) + 1024;
                if (var5.field3374 > 16384) {
                    var5.field3374 = 16384;
                }
                var5.method680(var5.field3374);
                if (class382.field5100 > 0 && class97.field1317 == null) {
                    class97.field1317 = new class7();
                    class97.field1317.field65 = arg0;
                    arg0.method1521(class97.field1317, class382.field5100, 44);
                }
                if (class97.field1317 != null) {
                    if (class97.field1317.field68[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class97.field1317.field68[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class313 var6 = new class313(arg0, arg3);
                    var6.field3363 = new int[(class658.field9343 ? 2 : 1) * 256];
                    var6.field3373 = arg1;
                    var6.method678(arg4);
                    var6.field3374 = 16384;
                    var6.method680(var6.field3374);
                    if (class382.field5100 > 0 && class97.field1317 == null) {
                        class97.field1317 = new class7();
                        class97.field1317.field65 = arg0;
                        arg0.method1521(class97.field1317, class382.field5100, 106);
                    }
                    if (class97.field1317 != null) {
                        if (class97.field1317.field68[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class97.field1317.field68[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class245();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(JJ)J", line = 132)
    public static long method3323(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLjava/lang/String;JI)V", line = 139)
    public static final void method3324(boolean arg0, String arg1, long arg2, int arg3) {
        field8294++;
        if (arg0) {
            class496.method2890((byte) -109);
            if (class682.field9753.equals("")) {
                class696.field9865 = 39;
                return;
            }
        }
        class389 var5 = new class389(576);
        var5.method2281((byte) 58, arg3);
        var5.method2261((byte) 40, (int) (Math.random() * 65535.0D));
        var5.method2230((byte) 23, arg2);
        var5.method2261((byte) 59, arg0 ? class642.field9172 : class171.field2092);
        var5.method2269(arg1, -52);
        var5.method2230((byte) 23, arg0 ? class683.field9763 : class163.field1995);
        if (arg0) {
            var5.method2230((byte) 23, class78.method653(class682.field9753, -3328));
            try {
                var5.method2230((byte) 23, Long.parseLong(class14.field240));
            } catch (Exception var9) {
                class696.field9865 = 39;
                return;
            }
        } else {
            var5.method2233((byte) -51, (int) (Math.random() * 9.9999999E7D));
            var5.method2233((byte) 125, (int) (Math.random() * 9.9999999E7D));
            var5.method2233((byte) -124, (int) (Math.random() * 9.9999999E7D));
            var5.method2233((byte) -122, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method2233((byte) 62, (int) (Math.random() * 9.9999999E7D));
        var5.method2263(class27.field605, (byte) -89, class475.field6653);
        class543 var6 = class215.method1314((byte) -111);
        var6.field7872.method2281((byte) 58, arg0 ? class238.field3286.field7714 : class238.field3283.field7714);
        int var7 = 1;
        if (class12.field203 != null) {
            var7 += class12.field203.length() + 1;
        }
        var6.field7872.method2261((byte) 63, var5.field5195 + var7 + 28);
        var6.field7872.method2261((byte) 63, 623);
        var6.field7872.method2281((byte) 58, class370.field4980);
        var6.field7872.method2281((byte) 58, class588.field8518.field1256);
        class638.method3638(var6.field7872, -16638);
        String var8 = arg0 ? class17.field475 : class12.field203;
        var6.field7872.method2281((byte) 58, var8 == null ? 0 : 1);
        if (var8 != null) {
            var6.field7872.method2269(var8, -29);
        }
        var6.field7872.method2253(var5.field5205, (byte) -23, var5.field5195, 0);
        class511.method3028(7482, var6);
        class696.field9865 = -3;
        class88.field1237 = 0;
        class184.field2257 = 0;
        class382.field5103 = 1;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Lsq;", line = 216)
    public class161 method448(byte arg0) {
        field8289++;
        if (arg0 != 25) {
            method3321((byte) 71);
        }
        return class141.field1770;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILjava/lang/String;Lkga;)Lqb;", line = 227)
    public static final class204 method3325(int arg0, int arg1, String arg2, class506 arg3) {
        field8290++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class122.field1571, 0);
        if (class122.field1571[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
        if (arg1 != -8962) {
            field8285 = 12;
        }
        OpenGL.glBindProgramARB(arg0, 0);
        return new class204(arg3, arg0, var4);
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lpe;Lop;IIIIIIIIIIIII)V", line = 260)
    public class567(class564 arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8286 = arg11;
        this.field8291 = arg12;
        this.field8284 = arg14;
        this.field8293 = arg13;
        this.field8288 = arg10;
        this.field8287 = arg9;
    }
}
