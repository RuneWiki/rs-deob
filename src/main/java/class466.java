import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class466 extends class530 {

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Lrs;")
    public static class169 field6364;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(II)V", line = 5)
    public final void method70(int arg0, int arg1) {
        ++field6369;
        if (arg1 > -38) {
            field6364 = null;
        }
        super.field7419 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 17)
    public static void method2777(int arg0) {
        field6364 = null;
        if (arg0 != 0) {
            method2780();
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)I", line = 27)
    public final int method75(int arg0, int arg1) {
        ++field6366;
        if (super.field7418.method2253(114)) {
            return 3;
        } else {
            int var3 = -104 % ((63 - arg1) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)Z", line = 43)
    public final boolean method2778(boolean arg0) {
        ++field6362;
        if (!arg0) {
            field6364 = null;
        }
        return !super.field7418.method2253(-45);
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(Z)Z", line = 59)
    public static final boolean method2779(boolean arg0) {
        ++field6365;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class46.field672.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class46.field672.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class46.field672.keys();
                if (arg0) {
                    field6364 = null;
                }
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class408.field5664.get(var9);
                        Class var11 = (Class) class46.field672.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var13 > ~var12.size(); ++var13) {
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
        class46.field672 = var1;
        return class46.field672.isEmpty();
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I", line = 159)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            return -25;
        } else {
            ++field6367;
            return 1;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "()V", line = 172)
    public static final void method2780() {
        if (class569.field8071 != null) {
            for (int var0 = 0; var0 < class569.field8071.length; ++var0) {
                for (int var1 = 0; var1 < class485.field6556; ++var1) {
                    for (int var2 = 0; var2 < class314.field4059; ++var2) {
                        if (class569.field8071[var0][var1][var2] != null) {
                            class569.field8071[var0][var1][var2].method263((byte) 125);
                        }
                        class569.field8071[var0][var1][var2] = null;
                    }
                }
            }
        }
        class569.field8071 = null;
        class155.field2126 = null;
        if (class192.field2787 != null) {
            for (int var3 = 0; var3 < class192.field2787.length; ++var3) {
                for (int var4 = 0; var4 < class485.field6556; ++var4) {
                    for (int var5 = 0; var5 < class314.field4059; ++var5) {
                        if (class192.field2787[var3][var4][var5] != null) {
                            class192.field2787[var3][var4][var5].method263((byte) 124);
                        }
                        class192.field2787[var3][var4][var5] = null;
                    }
                }
            }
        }
        class192.field2787 = null;
        class435.field5969 = null;
        class352.field4549 = null;
        class52.field741 = null;
        class359.field4594 = null;
        class419.field5809 = null;
        class48.field704 = null;
        class534.field7490 = null;
        class35.field502 = null;
        class736.method4084(true);
        if (class707.field9873 != null) {
            for (int var6 = 0; var6 < class354.field4557; ++var6) {
                class707.field9873[var6] = null;
            }
            class354.field4557 = 0;
        }
        if (class261.field3566 != null) {
            for (int var7 = 0; var7 < class269.field3635[0]; ++var7) {
                class261.field3566[0][var7] = null;
            }
            for (int var8 = 0; var8 < class269.field3635[1]; ++var8) {
                class261.field3566[1][var8] = null;
            }
            class269.field3635 = new int[2];
        }
        if (class160.field2206 != null) {
            for (int var9 = 0; var9 < class352.field4548[0]; ++var9) {
                class160.field2206[0][var9] = null;
            }
            for (int var10 = 0; var10 < class352.field4548[1]; ++var10) {
                class160.field2206[1][var10] = null;
            }
            class352.field4548 = new int[2];
        }
        if (class140.field1931 != null) {
            for (int var11 = 0; var11 < class609.field8671[0]; ++var11) {
                class140.field1931[0][var11] = null;
            }
            for (int var12 = 0; var12 < class609.field8671[1]; ++var12) {
                class140.field1931[1][var12] = null;
            }
            class609.field8671 = new int[2];
        }
        if (class603.field8622 != null) {
            for (int var13 = 0; var13 < class603.field8622.length; ++var13) {
                class603.field8622[var13] = null;
            }
            class556.field7850 = 0;
        }
        if (class232.field3220 != null) {
            for (int var14 = 0; var14 < class232.field3220.length; ++var14) {
                class232.field3220[var14] = null;
            }
            class706.field9853 = 0;
        }
        if (class146.field2026 != null) {
            for (int var15 = 0; var15 < class442.field6068; ++var15) {
                class146.field2026[var15] = null;
            }
            for (int var16 = 0; var16 < class214.field3021; ++var16) {
                for (int var17 = 0; var17 < class485.field6556; ++var17) {
                    for (int var18 = 0; var18 < class314.field4059; ++var18) {
                        class706.field9852[var16][var17][var18] = 0L;
                    }
                }
            }
            class442.field6068 = 0;
        }
        class404.method2455((byte) 97);
        class365.field4690 = class365.field4688;
        class365.field4690.method1876(-55);
        class111.field1590 = null;
        class589.field8454 = null;
        class326.field4198 = null;
        if (class523.field7347 != null) {
            class492.method2907();
            class646.field9160.method2147(1);
            class646.field9160.method2071(0);
        }
        if (class66.field912 != null) {
            class66.field912 = null;
        }
        class646.field9160 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V", line = 399)
    public final void method73(boolean arg0) {
        if (arg0) {
            ++field6363;
            if (super.field7418.method2253(125)) {
                super.field7419 = 0;
            }
            if (~super.field7419 != -2 && super.field7419 != 0) {
                super.field7419 = this.method74(0);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lah;)V", line = 418)
    public class466(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(ILah;)V", line = 421)
    public class466(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I", line = 424)
    public final int method2781(int arg0) {
        ++field6368;
        return arg0 != 0 ? 96 : super.field7419;
    }
}
