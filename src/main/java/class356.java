import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class356 {

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    private int field4664 = 0;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    private int field4666 = 128;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    private int field4665 = 128;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    private int field4672 = 0;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    private int field4674 = -1;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public int field4667 = -1;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
    public boolean field4657 = false;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "B")
    public byte field4677 = 0;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    private int field4668 = 0;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Lrg;")
    public static class548 field4661 = new class548(5, 7);

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Lcea;")
    public static class180 field4675 = new class180("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "Lcea;")
    public static class180 field4682 = new class180("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field4683 = new String[100];

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "Lnba;")
    public class247 field4669;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "[S")
    private short[] field4660;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[S")
    private short[] field4662;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "[S")
    private short[] field4678;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "[S")
    private short[] field4681;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILos;I)V", line = 6)
    private final void method2001(int arg0, class374 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4673 = arg1.method2136(false);
        } else if (arg0 == 2) {
            this.field4667 = arg1.method2136(false);
        } else if (arg0 == 4) {
            this.field4665 = arg1.method2136(false);
        } else if (arg0 == 5) {
            this.field4666 = arg1.method2136(false);
        } else if (arg0 == 6) {
            this.field4672 = arg1.method2136(false);
        } else if (arg0 == 7) {
            this.field4664 = arg1.method2129(-92);
        } else if (arg0 == 8) {
            this.field4668 = arg1.method2129(-85);
        } else if (arg0 == 9) {
            this.field4674 = 8224;
            this.field4677 = 3;
        } else if (arg0 == 10) {
            this.field4657 = true;
        } else if (arg0 == 11) {
            this.field4677 = 1;
        } else if (arg0 == 12) {
            this.field4677 = 4;
        } else if (arg0 == 13) {
            this.field4677 = 5;
        } else if (arg0 == 14) {
            this.field4677 = 2;
            this.field4674 = arg1.method2129(-114) * 256;
        } else if (arg0 == 15) {
            this.field4677 = 3;
            this.field4674 = arg1.method2136(false);
        } else if (arg0 == 16) {
            this.field4677 = 3;
            this.field4674 = arg1.method2123(false);
        } else if (arg0 == 40) {
            int var4 = arg1.method2129(-110);
            this.field4678 = new short[var4];
            this.field4660 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4660[var5] = (short) arg1.method2136(false);
                this.field4678[var5] = (short) arg1.method2136(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method2129(arg2 ^ 0xFFFFB216);
            this.field4662 = new short[var6];
            this.field4681 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4662[var7] = (short) arg1.method2136(false);
                this.field4681[var7] = (short) arg1.method2136(false);
            }
        }
        if (arg2 != 19883) {
            method2006((byte) -52);
        }
        field4676++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lqa;I)V", line = 128)
    public static final void method2002(class206 arg0, int arg1) {
        if (class473.field6634) {
            class614.method3530(arg0, (byte) -108);
        } else {
            class398.method2283((byte) -113, arg0);
        }
        field4658++;
        if (arg1 != 17276) {
            field4682 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjh;IBLqa;ILsa;IIIIBZLsa;)Lr;", line = 151)
    private final class157 method2003(int arg0, class138 arg1, int arg2, byte arg3, class206 arg4, int arg5, class174 arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, boolean arg12, class174 arg13) {
        field4679++;
        int var15 = arg0;
        class502 var16 = this.field4667 == -1 || arg9 == -1 ? null : arg1.method770(this.field4667, -113);
        boolean var17 = arg12 & this.field4677 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method2896(false, (byte) 8, arg5, arg9);
        }
        if (var17) {
            var15 |= this.field4677 == 3 ? 7 : 2;
        }
        if (this.field4666 != 128) {
            var15 |= 0x2;
        }
        if (this.field4665 != 128 || this.field4672 != 0) {
            var15 |= 0x5;
        }
        class641 var18 = this.field4669.field3171;
        class157 var19;
        synchronized (this.field4669.field3171) {
            var19 = (class157) this.field4669.field3171.method3682(0, (long) (this.field4659 |= arg4.field2475 << 29));
        }
        if (var19 == null || arg4.method1128(var19.method77(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method1145(var15, var19.method77());
            }
            int var20 = var15;
            if (this.field4660 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4662 != null) {
                var20 |= 0x8000;
            }
            class152 var21 = class447.method2618(this.field4673, this.field4669.field3165, 3317, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field1812 < 13) {
                var21.method825(-2, 0);
            }
            var19 = arg4.method277(var21, var20, this.field4669.field3172, this.field4664 + 64, this.field4668 - -850);
            if (this.field4660 != null) {
                for (int var22 = 0; var22 < this.field4660.length; var22++) {
                    var19.method70(this.field4660[var22], this.field4678[var22]);
                }
            }
            if (this.field4662 != null) {
                for (int var23 = 0; var23 < this.field4662.length; var23++) {
                    var19.method93(this.field4662[var23], this.field4681[var23]);
                }
            }
            var19.method72(var15);
            class641 var24 = this.field4669.field3171;
            synchronized (this.field4669.field3171) {
                this.field4669.field3171.method3684(var19, 0, (long) (this.field4659 |= arg4.field2475 << 29));
            }
        }
        class157 var25 = var16 == null ? var19.method64(arg3, var15, true) : var16.method2900(arg3, arg5, var15, var19, 0, arg9, arg2, (byte) -49);
        if (this.field4665 != 128 || this.field4666 != 128) {
            var25.method100(this.field4665, this.field4666, this.field4665);
        }
        if (this.field4672 != 0) {
            if (this.field4672 == 90) {
                var25.method92(4096);
            }
            if (this.field4672 == 180) {
                var25.method92(8192);
            }
            if (this.field4672 == 270) {
                var25.method92(12288);
            }
        }
        if (var17) {
            var25.method87(this.field4677, this.field4674, arg13, arg6, arg10, arg7, arg8);
        }
        var25.method72(arg0);
        return arg11 < 61 ? null : var25;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z", line = 269)
    public static final boolean method2004(int arg0) {
        field4656++;
        int var1 = -78 / ((arg0 + 63) / 48);
        Hashtable var2 = new Hashtable();
        Enumeration var3 = class344.field4457.keys();
        while (var3.hasMoreElements()) {
            Object var4 = var3.nextElement();
            var2.put(var4, class344.field4457.get(var4));
        }
        try {
            Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var6 = Class.forName("java.lang.ClassLoader");
            Field var7 = var6.getDeclaredField("nativeLibraries");
            Method var8 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var8.invoke(var7, Boolean.TRUE);
            try {
                Enumeration var9 = class344.field4457.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class416.field5399.get(var10);
                        Class var12 = (Class) class344.field4457.get(var10);
                        Vector var13 = (Vector) var7.get(var12.getClassLoader());
                        for (int var14 = 0; var13.size() > var14; var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var8.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var8.invoke(var18, Boolean.TRUE);
                                        var8.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var2.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var8.invoke(var19, Boolean.FALSE);
                                        var8.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var8.invoke(var16, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var8.invoke(var7, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class344.field4457 = var2;
        return class344.field4457.isEmpty();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIILqa;Ljh;I)Lr;", line = 366)
    public final class157 method2005(int arg0, int arg1, int arg2, int arg3, class206 arg4, class138 arg5, int arg6) {
        if (arg0 == -21838) {
            field4671++;
            return this.method2003(arg3, arg5, arg1, (byte) 2, arg4, arg2, null, 0, 0, arg6, 0, (byte) 75, false, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 394)
    public static final void method2006(byte arg0) {
        field4670++;
        class528.field7388.method3687(1402);
        class307.field3899.method3687(1402);
        if (arg0 > 6) {
            class209.field2523.method3687(1402);
            class216.field2638.method3687(1402);
            class370.field4880.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjh;ILqa;II)Lr;", line = 409)
    public final class157 method2007(int arg0, int arg1, class138 arg2, int arg3, class206 arg4, int arg5, int arg6) {
        int var8 = 28 % ((-arg3 - 50) / 34);
        field4663++;
        return this.method2003(arg1, arg2, arg0, (byte) 5, arg4, arg5, null, 0, 0, arg6, 0, (byte) 105, false, null);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 419)
    public static void method2008(int arg0) {
        field4675 = null;
        field4661 = null;
        if (arg0 < 16) {
            field4661 = null;
        }
        field4682 = null;
        field4683 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILqa;ILjh;IIILsa;IZLsa;I)Lr;", line = 441)
    public final class157 method2009(int arg0, int arg1, class206 arg2, int arg3, class138 arg4, int arg5, int arg6, int arg7, class174 arg8, int arg9, boolean arg10, class174 arg11, int arg12) {
        field4680++;
        return arg1 >= -109 ? null : this.method2003(arg5, arg4, arg0, (byte) 2, arg2, arg7, arg11, arg3, arg9, arg12, arg6, (byte) 108, arg10, arg8);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Los;I)V", line = 463)
    public final void method2010(class374 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2129(arg1 - 66);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method2001(-119, null, -110);
                }
                field4655++;
                return;
            }
            this.method2001(var3, arg0, 19883);
        }
    }
}
