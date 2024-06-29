import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class641 extends class661 {

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public int field9127;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Llp;")
    public class247 field9126;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "[B")
    public byte[] field9123;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILkw;)V", line = 5)
    public static final void method3701(int arg0, class346 arg1) {
        ++field9125;
        if (class611.field8737 == null) {
            class650 var2 = new class650();
            byte[] var3 = var2.method3747(16, 128, 128, 44);
            class611.field8737 = class452.method2769(var3, false, -74);
        }
        if (class76.field1108 == null) {
            class601 var4 = new class601();
            byte[] var5 = var4.method3505(16, 128, 128, 4095);
            class76.field1108 = class452.method2769(var5, false, -111);
        }
        class294 var6 = arg1.field4974;
        if (var6.method1846(true) && class218.field3261 == null) {
            byte[] var7 = class439.method2689((byte) -46, 4.0F, 128, 0.5F, 0.6F, 4.0F, new class490(419684), 16, 8, 16.0F, 128);
            class218.field3261 = class452.method2769(var7, false, 5);
        }
        int var8 = -106 / ((arg0 - 37) / 46);
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)[B", line = 47)
    public final byte[] method1304(int arg0) {
        if (arg0 <= 98) {
            field9120 = -9;
        }
        ++field9124;
        if (super.field9450) {
            throw new RuntimeException();
        } else {
            return this.field9123;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILha;IIII)V", line = 66)
    public static final void method3702(int arg0, int arg1, int arg2, class543 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9119;
        class301.field4129 = arg3;
        class487.field7023 = class301.field4129.method348();
        class469.field6680 = class301.field4129.method348();
        class710.field10013 = class301.field4129.method348();
        class675.field9607 = null;
        class272.field3855 = arg7;
        field9120 = 0;
        class635.field8963 = arg4;
        class381.field5523 = arg5;
        class270.field3833 = 1;
        if (arg1 != 128) {
            method3701(-64, (class346) null);
        }
        class647.field9322 = 0;
        class519.field7488 = arg2;
        class56.method545(arg0, arg6, 0);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I", line = 91)
    public final int method1306(int arg0) {
        ++field9117;
        if (arg0 != 3344) {
            return 120;
        } else {
            return super.field9450 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Z", line = 106)
    public static final boolean method3703(byte arg0) {
        ++field9121;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class138.field1891.keys();
        if (arg0 <= 16) {
            field9120 = -127;
        }
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class138.field1891.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class138.field1891.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class622.field8851.get(var9);
                        Class var11 = (Class) class138.field1891.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); ++var13) {
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
                                            var17.set(var14, new Integer(0));
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
        class138.field1891 = var1;
        return class138.field1891.isEmpty();
    }
}
