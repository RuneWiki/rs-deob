import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class532 {

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
    public int[] field7392;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[[F")
    public float[][] field7391;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    public int[] field7386;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public int[] field7387;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field7388 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field7384 = new int[8];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7393 = new String[100];

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field7394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field7395;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lum;")
    public static class131[] field7385;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3162(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 7)
    public static void method3158(int arg0) {
        field7393 = null;
        int var1 = -113 / ((arg0 - 80) / 34);
        field7384 = null;
        field7385 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Luu;II)Lfd;", line = 19)
    public static final class298 method3159(class237 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return null;
        }
        field7394++;
        class298 var3 = (class298) class54.field780.method3898((byte) -42, (long) arg2);
        if (var3 == null) {
            if (class31.field373) {
                var3 = class129.field1802.method1496(class52.method382(arg0, arg2), true);
            } else {
                var3 = class10.method49(arg0.method1583(arg2, -86), 0);
            }
            class54.field780.method3899(arg1 ^ 0xFFFFFFBA, var3, (long) arg2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 43)
    public static final void method3160(byte arg0) {
        if (arg0 != 49) {
            method3161(28, -5, 121, -42, 103, 110, -31);
        }
        if (class159.field2227.field1929) {
            class152.field2091 = 96;
        } else {
            try {
                Method var1 = (field7395 == null ? (field7395 = method3162("java.lang.Runtime")) : field7395).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class152.field2091 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field7390++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([I[I[I[[F)V", line = 87)
    public class532(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field7392 = arg0;
        this.field7391 = arg3;
        this.field7386 = arg1;
        this.field7387 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V", line = 98)
    public static final void method3161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7389++;
        class274.method1837(arg3, -2);
        int var7 = arg0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class291.field4181 <= arg4 && class262.field3848 >= arg4) {
            int[] var15 = class538.field7454[arg4];
            int var16 = class41.method223(true, class726.field10064, class607.field8185, arg6 - arg3);
            int var17 = class41.method223(true, class726.field10064, class607.field8185, arg3 + arg6);
            int var18 = class41.method223(true, class726.field10064, class607.field8185, arg6 - var8);
            int var19 = class41.method223(true, class726.field10064, class607.field8185, arg6 + var8);
            class102.method675(arg1, -82, var16, var18, var15);
            class102.method675(arg2, -53, var18, var19, var15);
            class102.method675(arg1, arg0 ^ 0xFFFFFFD8, var19, var17, var15);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class618.field8298[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (var21 >= class291.field4181 && class262.field3848 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class41.method223(true, class726.field10064, class607.field8185, arg6 + var7);
                        int var23 = class41.method223(true, class726.field10064, class607.field8185, arg6 - var7);
                        if (var21 <= class262.field3848) {
                            class102.method675(arg1, -46, var23, var22, class538.field7454[var21]);
                        }
                        if (class291.field4181 <= var20) {
                            class102.method675(arg1, 101, var23, var22, class538.field7454[var20]);
                        }
                    } else {
                        int var24 = class618.field8298[var9];
                        int var25 = class41.method223(true, class726.field10064, class607.field8185, arg6 + var7);
                        int var26 = class41.method223(true, class726.field10064, class607.field8185, arg6 - var7);
                        int var27 = class41.method223(true, class726.field10064, class607.field8185, arg6 + var24);
                        int var28 = class41.method223(true, class726.field10064, class607.field8185, arg6 - var24);
                        if (var21 <= class262.field3848) {
                            int[] var29 = class538.field7454[var21];
                            class102.method675(arg1, arg0 ^ 0xFFFFFFA8, var26, var28, var29);
                            class102.method675(arg2, -113, var28, var27, var29);
                            class102.method675(arg1, arg0 + 58, var27, var25, var29);
                        }
                        if (var20 >= class291.field4181) {
                            int[] var30 = class538.field7454[var20];
                            class102.method675(arg1, arg0 + 58, var26, var28, var30);
                            class102.method675(arg2, arg0 - 113, var28, var27, var30);
                            class102.method675(arg1, -97, var27, var25, var30);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class291.field4181 && var31 <= class262.field3848) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class607.field8185 <= var33 && var34 <= class726.field10064) {
                    int var35 = class41.method223(true, class726.field10064, class607.field8185, var33);
                    int var36 = class41.method223(true, class726.field10064, class607.field8185, var34);
                    if (var7 >= var8) {
                        if (var32 <= class262.field3848) {
                            class102.method675(arg1, -64, var36, var35, class538.field7454[var32]);
                        }
                        if (class291.field4181 <= var31) {
                            class102.method675(arg1, 79, var36, var35, class538.field7454[var31]);
                        }
                    } else {
                        int var37 = var7 > var11 ? class618.field8298[var7] : var11;
                        int var38 = class41.method223(true, class726.field10064, class607.field8185, arg6 + var37);
                        int var39 = class41.method223(true, class726.field10064, class607.field8185, arg6 - var37);
                        if (var32 <= class262.field3848) {
                            int[] var40 = class538.field7454[var32];
                            class102.method675(arg1, 94, var36, var39, var40);
                            class102.method675(arg2, arg0 ^ 0x4E, var39, var38, var40);
                            class102.method675(arg1, 74, var38, var35, var40);
                        }
                        if (class291.field4181 <= var31) {
                            int[] var41 = class538.field7454[var31];
                            class102.method675(arg1, 45, var36, var39, var41);
                            class102.method675(arg2, 116, var39, var38, var41);
                            class102.method675(arg1, -108, var38, var35, var41);
                        }
                    }
                }
            }
        }
    }
}
