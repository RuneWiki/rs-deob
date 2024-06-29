import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class743 implements class769 {

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "Ljo;")
    private class353 field10299 = new class353(128);

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "[I")
    private int[] field10305 = new int[class653.field9128.field15];

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "[I")
    public int[] field10294 = new int[class653.field9128.field15];

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "Lbu;")
    public static class21 field10304 = new class21(19, -1);

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "[I")
    public static int[] field10308 = null;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
    public final int method4133(int arg0, int arg1) {
        int var3 = 64 % ((55 - arg1) / 59);
        field10303++;
        return this.field10294[arg0];
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)V")
    public final void method4134(byte arg0, int arg1, int arg2) {
        if (arg0 != 98) {
            field10308 = null;
        }
        field10297++;
        class641 var4 = class95.field1084.method1423((byte) -55, arg1);
        int var5 = var4.field8974;
        int var6 = var4.field8978;
        int var7 = var4.field8979;
        int var8 = class462.field6506[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method4136(var5, -12735, var9 & arg2 << var6 | ~var9 & this.field10305[var5]);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IB)I")
    public final int method4135(int arg0, byte arg1) {
        field10306++;
        class641 var3 = class95.field1084.method1423((byte) -55, arg0);
        int var4 = var3.field8974;
        int var5 = var3.field8978;
        int var6 = var3.field8979;
        int var7 = class462.field6506[var6 - var5];
        int var8 = -94 % ((-arg1 - 81) / 36);
        return var7 & this.field10294[var4] >> var5;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
    public final void method4136(int arg0, int arg1, int arg2) {
        field10301++;
        if (arg1 != -12735) {
            method4140((byte) -100);
        }
        this.field10305[arg0] = arg2;
        class472 var4 = (class472) this.field10299.method2242((long) arg0, -1);
        if (var4 == null) {
            class472 var5 = new class472(4611686018427387905L);
            this.field10299.method2241(-121, (long) arg0, var5);
        } else if (var4.field6626 != 4611686018427387905L) {
            var4.field6626 = class459.method2731(118) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
    public static final boolean method4137(int arg0) {
        field10309++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class45.field572.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class45.field572.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            if (arg0 >= -27) {
                method4140((byte) 66);
            }
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class45.field572.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class123.field1921.get(var9);
                        Class var11 = (Class) class45.field572.get(var9);
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
        class45.field572 = var1;
        return class45.field572.isEmpty();
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
    public final void method4138(int arg0) {
        if (arg0 >= -92) {
            method4137(75);
        }
        field10302++;
        for (int var2 = 0; var2 < class653.field9128.field15; var2++) {
            class699 var3 = class653.field9128.method19((byte) 93, var2);
            if (var3 != null && var3.field9723 == 0) {
                this.field10305[var2] = 0;
                this.field10294[var2] = 0;
            }
        }
        this.field10299 = new class353(128);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZI)V")
    public final void method4139(int arg0, boolean arg1, int arg2) {
        field10298++;
        class641 var4 = class95.field1084.method1423((byte) -55, arg2);
        int var5 = var4.field8974;
        int var6 = var4.field8978;
        int var7 = var4.field8979;
        int var8 = class462.field6506[var7 - var6];
        if (!arg1) {
            return;
        }
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method4141((byte) 113, this.field10294[var5] & ~var9 | arg0 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
    public static void method4140(byte arg0) {
        field10308 = null;
        field10304 = null;
        if (arg0 != 3) {
            field10304 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(BII)V")
    public final void method4141(byte arg0, int arg1, int arg2) {
        if (arg0 <= 92) {
            this.method4136(39, -12, -76);
        }
        field10296++;
        this.field10294[arg2] = arg1;
        class472 var4 = (class472) this.field10299.method2242((long) arg2, -1);
        if (var4 == null) {
            class472 var5 = new class472(class459.method2731(115) + 500L);
            this.field10299.method2241(-55, (long) arg2, var5);
        } else {
            var4.field6626 = class459.method2731(96) + 500L;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILha;IIZ)V")
    public static final void method4142(int arg0, int arg1, class65 arg2, int arg3, int arg4, boolean arg5) {
        class571.field8060 = arg2;
        field10300++;
        class757.field10437 = class571.field8060.method505();
        class416.field5706 = class571.field8060.method505();
        class784.field10773 = class571.field8060.method505();
        class250.field3700 = arg1;
        class641.field8975 = null;
        class537.field7719 = null;
        class470.field6593 = arg0;
        class763.field10520 = 0;
        class368.method2298(arg4, arg3, 0);
        class23.field381 = -1;
        class9.field90 = -1;
        class633.field8891 = -1;
        if (arg5) {
            field10308 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)I")
    public final int method4143(boolean arg0, int arg1) {
        field10295++;
        long var3 = class459.method2731(123);
        for (class472 var5 = arg0 ? (class472) this.field10299.method2243((byte) 100) : (class472) this.field10299.method2248(-15690); var5 != null; var5 = (class472) this.field10299.method2248(-15690)) {
            if (var3 > (var5.field6626 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field6626 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field8133;
                    this.field10294[var6] = this.field10305[var6];
                    var5.method3387((byte) -68);
                    return var6;
                }
                var5.method3387((byte) 126);
            }
        }
        if (arg1 >= -63) {
            this.method4134((byte) -43, 69, -100);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BILmea;I)V")
    public static final void method4144(byte arg0, int arg1, class451 arg2, int arg3) {
        field10307++;
        if (class691.field9660) {
            class645 var4 = class474.field6636 == -1 ? null : class184.field2832.method4117((byte) 49, class474.field6636);
            if (client.method2046(arg2).method266(-84) && (class197.field3008 & 0x20) != 0 && (var4 == null || arg2.method2690(-118, class474.field6636, var4.field9011) != var4.field9011)) {
                class510.field7216++;
                class105.method738(0L, arg2.field6183, true, class714.field9904 + " -> " + arg2.field6211, false, class169.field2646, false, arg2.field6246, (long) (arg2.field6246 << 0 | arg2.field6222), arg2.field6222, (byte) -42, class572.field8070, 6);
            }
        }
        if (arg0 != 24) {
            field10304 = null;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class88.method659(var5, arg2, (byte) 35);
            if (var9 != null) {
                class105.method738((long) (var5 + 1), arg2.field6183, true, arg2.field6211, false, class62.method412(arg2, var5, -1), false, arg2.field6246, (long) (arg2.field6246 << 0 | arg2.field6222), arg2.field6222, (byte) -42, var9, 1004);
                class746.field10341++;
            }
        }
        String var6 = class198.method1365(arg2, arg0 + 6834);
        if (var6 != null) {
            class105.method738(0L, arg2.field6183, true, arg2.field6211, false, arg2.field6308, false, arg2.field6246, (long) (arg2.field6222 | arg2.field6246 << 0), arg2.field6222, (byte) -42, var6, 5);
            class543.field7797++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class88.method659(var7, arg2, (byte) 38);
            if (var8 != null) {
                class746.field10341++;
                class105.method738((long) (var7 + 1), arg2.field6183, true, arg2.field6211, false, class62.method412(arg2, var7, -1), false, arg2.field6246, (long) (arg2.field6246 << 0 | arg2.field6222), arg2.field6222, (byte) -42, var8, 30);
            }
        }
        if (!client.method2046(arg2).method268((byte) 60)) {
            return;
        }
        if (arg2.field6247 == null) {
            class105.method738(0L, arg2.field6183, true, "", false, -1, false, arg2.field6246, (long) (arg2.field6246 << 0 | arg2.field6222), arg2.field6222, (byte) -42, class620.field8671.method3580(class140.field2081, 12), 3);
        } else {
            class105.method738(0L, arg2.field6183, true, "", false, -1, false, arg2.field6246, (long) (arg2.field6246 << 0 | arg2.field6222), arg2.field6222, (byte) -42, arg2.field6247, 3);
        }
        class180.field2799++;
    }
}
