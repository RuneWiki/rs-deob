import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class83 {

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lsf;")
    public static class124 field1433 = new class124(64);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "J")
    public static long field1437 = 0L;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1436 = 1;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field1438 = new int[100];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1432;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Z")
    public static boolean field1439;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
    public int[] field1430;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 8)
    public final void method612(int arg0) {
        if (arg0 > -37) {
            field1433 = (class124) null;
        }
        class270.method1907(this.field1430, this.field1428, this.field1431);
        field1429++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 19)
    public static int method613(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILw;ZI)V", line = 31)
    public static final void method614(int arg0, int arg1, int arg2, class302 arg3, boolean arg4, int arg5) {
        field1435++;
        if (arg3.field4904 == -1 && arg3.field4925 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg3.field4924) {
            var6 += arg1 - arg3.field4924;
        } else if (arg3.field4909 > arg1) {
            var6 += arg3.field4909 - arg1;
        }
        if (arg2 > arg3.field4919) {
            var6 += arg2 - arg3.field4919;
        } else if (arg2 < arg3.field4911) {
            var6 += arg3.field4911 - arg2;
        }
        int var7 = class30.field706 * arg3.field4908 >> 8;
        if (arg3.field4914 == 0 || (var6 - 64) > arg3.field4914 || class30.field706 == 0 || arg3.field4915 != arg0) {
            if (arg3.field4921 != null) {
                class56.field1105.method1247(arg3.field4921);
                arg3.field4921 = null;
            }
            if (arg3.field4920 != null) {
                class56.field1105.method1247(arg3.field4920);
                arg3.field4920 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field4914 - var6) * var7 / arg3.field4914;
        if (arg3.field4921 != null) {
            arg3.field4921.method2198(var8);
        } else if (arg3.field4904 >= 0) {
            class283 var9 = class283.method2011(class349.field5582, arg3.field4904, 0);
            if (var9 != null) {
                class236 var10 = var9.method2012().method1637(class8.field276);
                class304 var11 = class304.method2173(var10, 100, var8);
                var11.method2177(-1);
                class56.field1105.method1242(var11);
                arg3.field4921 = var11;
            }
        }
        if (arg3.field4920 != null) {
            arg3.field4920.method2198(var8);
            if (!arg3.field4920.method534(0)) {
                arg3.field4920 = null;
            }
        } else if (arg3.field4925 != null && (arg3.field4917 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field4925.length);
            class283 var13 = class283.method2011(class349.field5582, arg3.field4925[var12], 0);
            if (var13 != null) {
                class236 var14 = var13.method2012().method1637(class8.field276);
                class304 var15 = class304.method2173(var14, 100, var8);
                var15.method2177(0);
                class56.field1105.method1242(var15);
                arg3.field4920 = var15;
                arg3.field4917 = arg3.field4923 + (int) (Math.random() * (double) (arg3.field4922 - arg3.field4923));
            }
        }
        if (!arg4) {
            field1439 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 161)
    public static void method616(boolean arg0) {
        if (!arg0) {
            field1433 = null;
            field1438 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 172)
    public static final void method617(byte arg0) {
        field1434++;
        class52.method459(128, class323.field5231);
        class110.field2019++;
        if (arg0 != 58) {
            return;
        }
        if (class233.field3821 && class132.field2275) {
            int var1 = class26.field662;
            int var2 = class73.field1339;
            int var3 = var2 - class269.field4377;
            if (var3 < class233.field3818) {
                var3 = class233.field3818;
            }
            if (class233.field3818 + class16.field476.field3024 < var3 - -class323.field5231.field3024) {
                var3 = class16.field476.field3024 + class233.field3818 - class323.field5231.field3024;
            }
            int var4 = var3 - class282.field4618;
            int var5 = var1 - class97.field1760;
            int var6 = class323.field5231.field3068;
            if (class79.field1403 > var5) {
                var5 = class79.field1403;
            }
            if (class79.field1403 + class16.field476.field2972 < class323.field5231.field2972 + var5) {
                var5 = class79.field1403 + class16.field476.field2972 - class323.field5231.field2972;
            }
            int var7 = var5 - class349.field5593;
            if (class110.field2019 > class323.field5231.field3013 && (var4 > var6 || (-var6) > var4 || var7 > var6 || -var6 > var7)) {
                class264.field4327 = true;
            }
            int var8 = var3 + class16.field476.field3035 - class233.field3818;
            int var9 = var5 + class16.field476.field2992 - class79.field1403;
            if (class323.field5231.field3081 != null && class264.field4327) {
                class47 var10 = new class47();
                var10.field939 = class323.field5231;
                var10.field936 = class323.field5231.field3081;
                var10.field941 = var9;
                var10.field945 = var8;
                class20.method184(var10, (byte) -70);
            }
            if (class94.field1651 == 0) {
                if (class264.field4327) {
                    if (class323.field5231.field2965 != null) {
                        class47 var11 = new class47();
                        var11.field939 = class323.field5231;
                        var11.field944 = class1.field19;
                        var11.field936 = class323.field5231.field2965;
                        var11.field945 = var8;
                        var11.field941 = var9;
                        class20.method184(var11, (byte) -27);
                    }
                    if (class1.field19 != null && client.method1995(class323.field5231) != null) {
                        class185.field3176++;
                        class51.field1038.method291((byte) 79, 210);
                        class51.field1038.method1002((byte) -106, class323.field5231.field3023);
                        class51.field1038.method1045((byte) 114, class323.field5231.field3103);
                        class51.field1038.method1043((byte) 58, class1.field19.field3103);
                        class51.field1038.method1002((byte) -121, class1.field19.field3023);
                    }
                } else if ((class301.field4895 == 1 || class348.method2492(class137.field2343 - 1, -124)) && class137.field2343 > 2) {
                    class282.method2007((byte) -13);
                } else if (class137.field2343 > 0) {
                    class99.method751((byte) 116);
                }
                class323.field5231 = null;
            }
        } else if (class110.field2019 > 1) {
            class323.field5231 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 305)
    protected class83() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method611(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method618(int arg0, int arg1, int arg2, Component arg3);
}
