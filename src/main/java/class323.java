import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class323 extends class695 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "F")
    private float field4189 = 0.0F;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lbl;")
    private class350 field4186;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lra;")
    public static class361 field4182 = new class361(63, 8);

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Lnj;")
    public static class415 field4194 = new class415(51, 8);

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Ltc;")
    public static class477 field4197 = null;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field4195 = 0;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lra;")
    public static class361 field4196 = new class361(114, 4);

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnm;ZI)V", line = 4)
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        ++field4190;
        super.field9493.method3091(true, arg0);
        if (arg1) {
            field4196 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z", line = 19)
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            method1869(75, (byte) 125, -91);
        }
        ++field4191;
        return this.field4186.method2010(-17);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V", line = 33)
    public final void method498(boolean arg0, byte arg1) {
        ++field4181;
        if (arg1 > -82) {
            this.method498(true, (byte) -3);
        }
        super.field9493.method3088((byte) 91, 1);
        super.field9493.method3105(class510.field6687, true, class600.field8091);
        super.field9493.method206(false, class61.field833, true, 0, 23798);
        super.field9493.method3143(4, class243.field3260, 0);
        super.field9493.method210(0, 0);
        super.field9493.method3088((byte) 91, 0);
        super.field9493.method3142(-16777216, 38);
        super.field9493.method3143(4, class425.field5511, 0);
        this.method496(-117);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 52)
    public final void method491(int arg0) {
        ++field4184;
        super.field9493.method3088((byte) 91, 1);
        super.field9493.method3105(class219.field2875, true, class219.field2875);
        super.field9493.method3115(0, 0, class61.field833);
        super.field9493.method3143(4, class61.field833, 0);
        super.field9493.method210(1, 0);
        super.field9493.method3091(true, (class391) null);
        super.field9493.method3088((byte) 91, 0);
        if (arg0 < 38) {
            this.method498(false, (byte) -106);
        }
        super.field9493.method3143(4, class61.field833, 0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V", line = 71)
    public final void method489(int arg0, int arg1, int arg2) {
        super.field9493.method3088((byte) 91, 1);
        ++field4192;
        if (~(arg0 & 128) == -1) {
            if (~(arg1 & 1) == -2) {
                if (this.field4186.field4482) {
                    this.field4189 = (float) (super.field9493.field7708 % 4000) / 4000.0F;
                    super.field9493.method3091(true, this.field4186.field4478);
                } else {
                    int var4 = super.field9493.field7708 % 4000 * 16 / 4000;
                    super.field9493.method3091(true, this.field4186.field4483[var4]);
                }
            } else if (this.field4186.field4482) {
                super.field9493.method3091(true, this.field4186.field4478);
            } else {
                super.field9493.method3091(true, this.field4186.field4483[0]);
            }
        } else {
            super.field9493.method3091(true, (class391) null);
        }
        if (arg2 >= 69) {
            super.field9493.method3088((byte) 91, 0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V", line = 115)
    public final void method495(int arg0, boolean arg1) {
        super.field9493.method3105(class510.field6687, true, class219.field2875);
        if (arg0 != 1) {
            method1870(-15);
        }
        ++field4188;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V", line = 127)
    public static final void method1867(byte arg0) {
        ++field4183;
        if (!class260.field3509.method1571(class364.field4697, -23572) && ~class517.field6768 != ~class390.field4991) {
            class512.method2759(11, class677.field9340, class649.field9048, (byte) 94, false);
        } else if (arg0 <= -122) {
            class198.method1306(-22, class520.field6799);
            if (~class659.field9184 != ~class390.field4991) {
                class540.method2867(3);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(B)Z", line = 150)
    public static final boolean method1868(byte arg0) {
        ++field4193;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class94.field1242.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class94.field1242.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class94.field1242.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class305.field4010.get(var9);
                        Class var11 = (Class) class94.field1242.get(var9);
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
                if (arg0 != 2) {
                    method1868((byte) 38);
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class94.field1242 = var1;
        return class94.field1242.isEmpty();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)I", line = 249)
    public static final int method1869(int arg0, byte arg1, int arg2) {
        ++field4185;
        int var3 = class89.method673(arg0 + 91923, false, 4, arg2 + 45365) - 128 + (-128 + class89.method673(arg0 + 37821, false, 2, arg2 + 10294) >> 1) + (-128 + class89.method673(arg0, false, 1, arg2) >> 2);
        if (arg1 < 23) {
            return -30;
        } else {
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (~var4 > -11) {
                var4 = 10;
            } else if (var4 > 60) {
                var4 = 60;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lfc;Lbl;)V", line = 271)
    public class323(class575 arg0, class350 arg1) {
        super(arg0);
        this.field4186 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 279)
    public static void method1870(int arg0) {
        if (arg0 != 60) {
            method1870(-21);
        }
        field4196 = null;
        field4182 = null;
        field4197 = null;
        field4194 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 298)
    public final void method496(int arg0) {
        if (~super.field9493.method3068(Integer.MAX_VALUE) == -1) {
            class131 var2 = super.field9493.method3128(0);
            super.field9493.method3088((byte) 91, 1);
            class131 var3 = super.field9493.method3125((byte) 110);
            var3.method133(var2);
            var3.method951(0.125F, 1.0F, (byte) 78, 0.125F);
            var3.method942(0.0F, this.field4189, 0.0F, -3);
            super.field9493.method3140(30604, class54.field744);
            super.field9493.method3088((byte) 91, 0);
        }
        if (arg0 >= -39) {
            method1868((byte) 106);
        }
        ++field4187;
    }
}
