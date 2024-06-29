import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class286 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Ljava/lang/String;")
    public String field3631;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
    public static boolean field3630 = false;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3632 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
    public static int[] field3634;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3626;

    @OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3628++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Z", line = 12)
    public static final boolean method1710(byte arg0) {
        field3629++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class682.field9334.keys();
        if (arg0 <= 20) {
            field3632 = null;
        }
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class682.field9334.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class682.field9334.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class368.field5201.get(var9);
                        Class var11 = (Class) class682.field9334.get(var9);
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
        class682.field9334 = var1;
        return class682.field9334.isEmpty();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 111)
    public static final void method1711(byte arg0) {
        if (arg0 > -99) {
            method1712(32);
        }
        class51.method427(class223.field2944.field612.method2953((byte) -123), -10924);
        field3624++;
        int var1 = (class63.field851 >> 3) + (class505.field7134 >> 12);
        class223.field2946 = class339.field4374.field5779 = 0;
        int var2 = (class753.field10509 >> 3) + (class407.field5744 >> 12);
        class339.field4374.method3103(8, 8, (byte) 7);
        byte var3 = 18;
        class248.field3162 = new int[var3];
        class643.field8879 = new int[var3];
        class556.field7797 = new int[var3];
        class324.field4136 = new byte[var3][];
        class688.field9766 = new byte[var3][];
        class556.field7799 = new int[var3][4];
        class239.field3084 = new int[var3];
        class258.field3281 = new int[var3];
        class677.field9198 = new byte[var3][];
        class459.field6460 = new byte[var3][];
        class46.field685 = new int[var3];
        class177.field2291 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class613.field8591 >> 4)) / 8; var5 <= (((class613.field8591 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class1.field3 >> 4)) / 8; var8 <= (var2 + (class1.field3 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class248.field3162[var4] = var9;
                class46.field685[var4] = class541.field7613.method3820("m" + var5 + "_" + var8, -1);
                class556.field7797[var4] = class541.field7613.method3820("l" + var5 + "_" + var8, -1);
                class643.field8879[var4] = class541.field7613.method3820("n" + var5 + "_" + var8, -1);
                class239.field3084[var4] = class541.field7613.method3820("um" + var5 + "_" + var8, -1);
                class258.field3281[var4] = class541.field7613.method3820("ul" + var5 + "_" + var8, -1);
                if (class643.field8879[var4] == -1) {
                    class46.field685[var4] = -1;
                    class556.field7797[var4] = -1;
                    class239.field3084[var4] = -1;
                    class258.field3281[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class643.field8879.length; var6++) {
            class643.field8879[var6] = -1;
            class46.field685[var6] = -1;
            class556.field7797[var6] = -1;
            class239.field3084[var6] = -1;
            class258.field3281[var6] = -1;
        }
        byte var7;
        if (class668.field9150 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class367.method2253(var2, -128, var7, false, var1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 201)
    public static void method1712(int arg0) {
        field3626 = null;
        field3634 = null;
        if (arg0 == -31620) {
            field3632 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 222)
    public class286(String arg0, int arg1) {
        this.field3627 = arg1;
        this.field3631 = arg0;
    }
}
