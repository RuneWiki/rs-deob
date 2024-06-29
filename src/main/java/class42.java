import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 extends class504 {

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "F")
    public static float field602 = 0.0F;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
    public int field620;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sca", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field621;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method308(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 17)
    public static final void method304(int arg0) {
        field606++;
        class398.field5290 = 0;
        class480.field6411.method3255((byte) -112);
        int var1 = -46 / ((-arg0 - 12) / 33);
        class388.field5142 = false;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIII)V", line = 37)
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 834) {
            field602 = -0.002265851F;
        }
        field607++;
        if (arg1 == arg2) {
            class364.method2151(true, arg1, arg0, arg4, arg3);
        } else if (class600.field7959 <= arg0 - arg1 && class366.field4956 >= arg0 + arg1 && class310.field4279 <= (arg4 - arg2) && class442.field6058 >= (arg4 + arg2)) {
            class224.method1404(arg2, arg4, arg1, arg5 - 950, arg3, arg0);
        } else {
            class679.method3789(arg5 - 2566, arg3, arg1, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Z", line = 61)
    public static final boolean method306(byte arg0) {
        field601++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class91.field1382.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class91.field1382.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            if (arg0 < 95) {
                method305(-123, 120, -88, 38, -66, -62);
            }
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class91.field1382.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class400.field5311.get(var9);
                        Class var11 = (Class) class91.field1382.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
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
        class91.field1382 = var1;
        return class91.field1382.isEmpty();
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Loa;II)Lba;", line = 160)
    public final class358 method307(class651 arg0, int arg1, int arg2) {
        field612++;
        int var4 = class216.field3088[this.field605];
        class358 var5 = null;
        if (arg2 != 0) {
            method305(8, -10, 14, 125, -79, -118);
        }
        if (var4 == 0) {
            class477 var12 = class219.method1390(this.field617, this.field615, this.field620);
            if (var12 instanceof class436) {
                class436 var13 = (class436) var12;
                if (var13.field5972 != null) {
                    var5 = ((class532) var13.field5972).method137(arg0, (byte) -47, arg1);
                }
            }
        } else if (var4 == 1) {
            class18 var6 = class74.method581(this.field617, this.field615, this.field620);
            if (var6 instanceof class562) {
                class562 var7 = (class562) var6;
                if (var7.field7454 != null) {
                    var5 = ((class532) var7.field7454).method137(arg0, (byte) -47, arg1);
                }
            }
        } else if (var4 == 2) {
            class641 var10 = class503.method2793(this.field617, this.field615, this.field620, field621 == null ? (field621 = method308("qi")) : field621);
            if (var10 instanceof class92) {
                class92 var11 = (class92) var10;
                if (var11.field1389 != null) {
                    var5 = ((class532) var11.field1389).method137(arg0, (byte) -47, arg1);
                }
            }
        } else if (var4 == 3) {
            class618 var8 = class34.method269(this.field617, this.field615, this.field620);
            if (var8 instanceof class13) {
                class13 var9 = (class13) var8;
                if (var9.field216 != null) {
                    var5 = ((class532) var9.field216).method137(arg0, (byte) -47, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method1519((byte) 0, arg1, true);
    }
}
