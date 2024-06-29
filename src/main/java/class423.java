import java.awt.Component;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class423 extends OutputStream {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lgn;")
    public static class475 field6249 = new class475(1, 16);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lak;")
    public static class222 field6254 = new class222(14, 0, 4, 1);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Ltq;")
    public static class426 field6255 = new class426(5, 5);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method2521(boolean arg0) {
        field6255 = null;
        if (arg0) {
            field6249 = null;
            field6254 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -25332) {
            field6254 = null;
        }
        if (arg0 == arg8 && arg5 == arg9 && arg4 == arg6 && arg2 == arg3) {
            class348.method2113(arg9, arg3, arg4, arg0, -93, arg1);
        } else {
            int var10 = arg0;
            int var11 = arg9;
            int var12 = arg0 * 3;
            int var13 = arg9 * 3;
            int var14 = arg8 * 3;
            int var15 = arg5 * 3;
            int var16 = arg6 * 3;
            int var17 = arg2 * 3;
            int var18 = arg4 + var14 - var16 - arg0;
            int var19 = arg3 - (var17 + arg9 - var15);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 - (var15 + var15 - var13);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = arg9 + (var30 + var32 + var28 >> 12);
                class348.method2113(var11, var34, var33, var10, -56, arg1);
                var10 = var33;
                var11 = var34;
            }
        }
        field6248++;
    }

    @OriginalMember(owner = "client!eb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6253++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lqn;ZZLjava/lang/String;Z)V")
    public static final void method2523(class44 arg0, boolean arg1, boolean arg2, String arg3, boolean arg4) {
        field6252++;
        if (arg2) {
            if (class44.field660.startsWith("win") && class44.field670 != 3) {
                String var5 = null;
                if (arg0.field668 != null) {
                    var5 = arg0.field668.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class439 var6 = class410.method2449(82, arg0, 0, arg3);
                    class420.field6207 = arg3;
                    class15.field228 = arg0;
                    class485.field7023 = var6;
                    return;
                }
            }
            if (class44.field660.startsWith("mac")) {
                String var7 = null;
                if (arg0.field668 != null) {
                    var7 = arg0.field668.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class410.method2449(-119, arg0, 1, arg3);
                    return;
                }
            }
            class410.method2449(69, arg0, 2, arg3);
        } else {
            class410.method2449(91, arg0, 3, arg3);
        }
        if (!arg4) {
            method2521(false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILjava/awt/Component;Lqn;)Lwg;")
    public static final class280 method2524(int arg0, int arg1, int arg2, Component arg3, class44 arg4) {
        field6250++;
        if (arg0 != 2541) {
            method2521(true);
        }
        if (class266.field3763 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class280 var5 = (class280) Class.forName("aa").getDeclaredConstructor().newInstance();
                var5.field4006 = arg2;
                var5.field3981 = new int[(class281.field4017 ? 2 : 1) * 256];
                var5.method1147(arg3);
                var5.field3999 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3999 > 16384) {
                    var5.field3999 = 16384;
                }
                var5.method1145(var5.field3999);
                if (class63.field931 > 0 && class399.field5882 == null) {
                    class399.field5882 = new class185();
                    class399.field5882.field2631 = arg4;
                    arg4.method332(class399.field5882, 2, class63.field931);
                }
                if (class399.field5882 != null) {
                    if (class399.field5882.field2628[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class399.field5882.field2628[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class180 var6 = new class180(arg4, arg1);
                    var6.field4006 = arg2;
                    var6.field3981 = new int[(class281.field4017 ? 2 : 1) * 256];
                    var6.method1147(arg3);
                    var6.field3999 = 16384;
                    var6.method1145(var6.field3999);
                    if (class63.field931 > 0 && class399.field5882 == null) {
                        class399.field5882 = new class185();
                        class399.field5882.field2631 = arg4;
                        arg4.method332(class399.field5882, arg0 - 2539, class63.field931);
                    }
                    if (class399.field5882 != null) {
                        if (class399.field5882.field2628[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class399.field5882.field2628[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class280();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[JI[Ljava/lang/Object;B)V")
    public static final void method2525(int arg0, long[] arg1, int arg2, Object[] arg3, byte arg4) {
        field6251++;
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg2; var11++) {
                if (arg1[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method2525(arg0, arg1, var6 - 1, arg3, (byte) -113);
            method2525(var6 + 1, arg1, arg2, arg3, (byte) -17);
        }
        int var15 = 97 % ((arg4 + 67) / 41);
    }
}
