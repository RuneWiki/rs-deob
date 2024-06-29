import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class729 extends class601 {

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[I")
    private int[] field10208 = new int[this.field8130];

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field10219 = 50;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "[I")
    public static int[] field10222 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field10215 = new String[field10219];

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "[I")
    public static int[] field10213 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "[I")
    public static int[] field10225 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[I")
    public static int[] field10217 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "[I")
    public static int[] field10218 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
    public static int[] field10212 = new int[field10219];

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Lhj;")
    public static class596 field10223 = new class596(44, 17);

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "D")
    public static double field10224;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    private int field10211;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    private int field10226;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[B")
    private byte[] field10214;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
    public class729(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field8130; ++var7) {
            this.field10208[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V", line = 31)
    public void method792(int arg0, byte arg1, int arg2) {
        this.field10214[this.field10211++] = (byte) (127 + class296.method1733(arg1 >> 1, 127));
        ++field10216;
        int var4 = -102 % ((arg0 - -7) / 36);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IC)Z", line = 41)
    public static final boolean method4119(int arg0, char arg1) {
        if (arg0 != 127) {
            field10215 = null;
        }
        ++field10220;
        return ~arg1 <= -49 && ~arg1 >= -58 || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 56)
    public static final void method4120(int arg0) {
        class121.method943(class118.field1503.field10658.method1368(arg0 ^ 8), 22);
        ++field10209;
        int var1 = (class632.field8626 >> 3) + (class599.field8107 >> 12);
        int var2 = (class620.field8435 >> 3) + (class350.field4366 >> 12);
        class581.field7921 = class300.field3596.field808 = 0;
        class300.field3596.method3125(8, -127, 8);
        byte var3 = 18;
        class233.field2781 = new int[var3][4];
        class722.field10134 = new int[var3];
        class610.field8194 = new int[var3];
        class253.field2955 = new int[var3];
        class786.field10842 = new byte[var3][];
        class266.field3146 = new byte[var3][];
        class152.field1904 = new int[var3];
        class471.field6569 = new int[var3];
        class204.field2445 = new byte[var3][];
        class449.field6220 = new byte[var3][];
        class704.field9907 = new int[var3];
        class229.field2709 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (-(class596.field8090 >> 4) + var1) / arg0; ~((var1 - -(class596.field8090 >> 4)) / 8) <= ~var5; ++var5) {
            for (int var8 = (-(class107.field1350 >> 4) + var2) / 8; var8 <= (var2 - -(class107.field1350 >> 4)) / 8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class471.field6569[var4] = var9;
                class610.field8194[var4] = class340.field4208.method450((byte) 94, "m" + var5 + "_" + var8);
                class152.field1904[var4] = class340.field4208.method450((byte) 116, "l" + var5 + "_" + var8);
                class704.field9907[var4] = class340.field4208.method450((byte) 94, "n" + var5 + "_" + var8);
                class253.field2955[var4] = class340.field4208.method450((byte) 76, "um" + var5 + "_" + var8);
                class722.field10134[var4] = class340.field4208.method450((byte) 121, "ul" + var5 + "_" + var8);
                if (~class704.field9907[var4] == 0) {
                    class610.field8194[var4] = -1;
                    class152.field1904[var4] = -1;
                    class253.field2955[var4] = -1;
                    class722.field10134[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; var6 < class704.field9907.length; ++var6) {
            class704.field9907[var6] = -1;
            class610.field8194[var6] = -1;
            class152.field1904[var6] = -1;
            class253.field2955[var6] = -1;
            class722.field10134[var6] = -1;
        }
        byte var7;
        if (~class289.field3493 == -4) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class224.method1375(var7, (byte) 64, false, var1, var2);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 139)
    public final void method1753(byte arg0) {
        this.field10226 = 0;
        this.field10211 = 0;
        int var2 = -36 / ((69 - arg0) / 36);
        ++field10206;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 153)
    public final void method1751(int arg0, int arg1, int arg2) {
        ++field10210;
        this.field10226 += this.field10208[arg1] * arg2 >> 12;
        if (arg0 != 345741388) {
            method4121(36);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)Z", line = 165)
    public static final boolean method4121(int arg0) {
        ++field10207;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class670.field9189.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class670.field9189.get(var3));
        }
        if (arg0 != -10020) {
            method4119(112, (char) 65432);
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class670.field9189.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class664.field9124.get(var9);
                        Class var11 = (Class) class670.field9189.get(var9);
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
        class670.field9189 = var1;
        return class670.field9189.isEmpty();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 266)
    public final void method1752(byte arg0) {
        if (arg0 > -70) {
            this.method1753((byte) -31);
        }
        ++field10221;
        this.field10226 = Math.abs(this.field10226);
        if (~this.field10226 <= -4097) {
            this.field10226 = 4095;
        }
        this.method792(124, (byte) (this.field10226 >> 4), this.field10211++);
        this.field10226 = 0;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 286)
    public static void method4122(byte arg0) {
        field10212 = null;
        if (arg0 != -105) {
            method4122((byte) -32);
        }
        field10225 = null;
        field10217 = null;
        field10222 = null;
        field10215 = null;
        field10218 = null;
        field10223 = null;
        field10213 = null;
    }
}
