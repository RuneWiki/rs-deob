import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class363 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4806 = 0;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public static int[] field4808 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lfha;")
    public static class382 field4805 = new class382(9, 7);

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[Ljea;")
    public static class452[] field4809 = new class452[14];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILbi;)Z")
    public static final boolean method2076(int arg0, int arg1, class481 arg2) {
        field4803++;
        int var3 = arg2.method2702((byte) -86, 2);
        if (var3 == 0) {
            if (arg2.method2702((byte) -110, 1) != 0) {
                method2076(-2, arg1, arg2);
            }
            int var4 = arg2.method2702((byte) -119, 6);
            int var5 = arg2.method2702((byte) -53, 6);
            boolean var6 = arg2.method2702((byte) -15, 1) == 1;
            if (var6) {
                class488.field6689[class729.field10172++] = arg1;
            }
            if (class361.field4793[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class169 var7 = class635.field8830[arg1];
            class83 var8 = class361.field4793[arg1] = new class83();
            var8.field817 = arg1;
            if (class420.field5891[arg1] != null) {
                var8.method614(class420.field5891[arg1], (byte) 73);
            }
            var8.method556(var7.field2108, true, 61);
            var8.field809 = var7.field2113;
            int var9 = var7.field2112;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFE75) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class99.field1313;
            var8.field1142 = var7.field2111;
            int var14 = (var12 << 6) + var5 - class133.field1704;
            var8.field904[0] = class422.field5906[arg1];
            var8.field2175 = var8.field2167 = (byte) var10;
            if (class669.method3767(var14, (byte) -104, var13)) {
                var8.field2167++;
            }
            var8.method612(var14, var13, 1470);
            var8.field1139 = false;
            class635.field8830[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method2702((byte) -17, 2);
            int var16 = class635.field8830[arg1].field2112;
            class635.field8830[arg1].field2112 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method2702((byte) -75, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class635.field8830[arg1].field2112;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class635.field8830[arg1].field2112 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method2702((byte) -63, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFFE5) >> 8;
            int var27 = var24 & 0xFF;
            if (arg0 != -2) {
                field4806 = 29;
            }
            int var28 = class635.field8830[arg1].field2112;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class635.field8830[arg1].field2112 = (var30 << 14) + (var29 << 28) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3) {
        field4802++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class244.method1464(var4, false, true, (byte) 117);
        int var5 = 67 / ((-arg3 - 9) / 38);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
    public static final boolean method2078(int arg0) {
        field4804++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class289.field3833.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class289.field3833.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                int var8 = -73 % ((arg0 + 50) / 35);
                Enumeration var9 = class289.field3833.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class6.field45.get(var10);
                        Class var12 = (Class) class289.field3833.get(var10);
                        Vector var13 = (Vector) var6.get(var12.getClassLoader());
                        for (int var14 = 0; var14 < var13.size(); var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var7.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var18, Boolean.TRUE);
                                        var7.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var1.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var7.invoke(var19, Boolean.FALSE);
                                        var7.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var7.invoke(var16, Boolean.FALSE);
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
        class289.field3833 = var1;
        return class289.field3833.isEmpty();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method2079(byte arg0) {
        field4808 = null;
        field4805 = null;
        field4809 = null;
        if (arg0 != -47) {
            field4808 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public static final void method2080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4807++;
        if (arg1 != -8) {
            method2077(76, 117, 69, 21);
        }
        for (int var5 = 0; var5 < class497.field6763; var5++) {
            Rectangle var6 = class733.field10219[var5];
            if (arg2 < (var6.x + var6.width) && arg2 + arg3 > var6.x && arg4 < (var6.y + var6.height) && arg0 + arg4 > var6.y) {
                class12.field78[var5] = true;
            }
        }
        class207.method1157(arg0 + arg4, arg4, false, arg2, arg2 + arg3);
    }
}
