import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class138 extends class665 {

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
    public int[] field2009 = new int[] { -1 };

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    public int[] field2008 = new int[1];

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lmf;")
    public static class382 field2010 = new class382(50);

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2013;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field2014;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[Lwl;")
    public static class373[] field2007;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/io/File;ZZ)V")
    public static final void method996(File arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field2010 = null;
        }
        if (class563.field7934 == null) {
            class561.method3203((byte) -15);
        }
        field2005++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field2014 == null ? (field2014 = method1002("java.lang.String")) : field2014, Boolean.TYPE);
            var4.invoke(class563.field7934, arg0.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method997(byte arg0) {
        field2007 = null;
        if (arg0 > -19) {
            field2007 = null;
        }
        field2010 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JZ)V")
    public static final void method998(long arg0, boolean arg1) {
        field2011++;
        if (!arg1) {
            method997((byte) 82);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILr;IBLkga;ILrk;)Lda;")
    public final class55 method999(int arg0, boolean arg1, int arg2, int arg3, class166 arg4, int arg5, byte arg6, class505 arg7, int arg8, class30 arg9) {
        field2006++;
        class55 var11 = null;
        int var12 = arg5;
        class87 var13 = null;
        if (arg8 != -1) {
            var13 = class339.field4991.method648(arg8, 32);
        }
        int[] var14 = this.field2009;
        if (var13 != null && var13.field1431 != null) {
            var14 = new int[var13.field1431.length];
            for (int var15 = 0; var15 < var13.field1431.length; var15++) {
                int var16 = var13.field1431[var15];
                if (var16 >= 0 && this.field2009.length > var16) {
                    var14[var15] = this.field2009[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class98 var24 = null;
        class98 var25 = null;
        if (arg9 != null) {
            var12 = arg5 | 0x20;
            int var26 = arg9.field456[arg2];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class188.field2708.method2135(-72, var27);
            if (var24 != null) {
                var18 |= var24.method800(25595, var21);
                var17 |= var24.method798(var21, (byte) 3);
                var20 |= var24.method805(true, var21);
                var19 |= arg9.field468;
            }
            if ((arg9.field452 || class498.field7060) && arg3 != -1 && arg9.field456.length > arg3) {
                var23 = arg9.field450[arg2];
                int var28 = arg9.field456[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class188.field2708.method2135(-91, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method800(25595, var22);
                    var17 |= var25.method798(var22, (byte) 3);
                    var20 |= var25.method805(true, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1000(arg1, arg8, arg7 == null ? null : arg7.field7135, (byte) 85, var14);
        if (class97.field1524 != null) {
            var11 = (class55) class97.field1524.method2287(1, var30);
        }
        if (var11 == null || arg4.method172(var11.method517(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method160(var12, var11.method517());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class41.field682.method2228(var14[var34], 0).method1256(-52, arg1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class461[] var35 = new class461[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class41.field682.method2228(var14[var36], 0).method1253(true, arg1);
                }
            }
            if (var13 != null && var13.field1450 != null) {
                for (int var37 = 0; var37 < var13.field1450.length; var37++) {
                    if (var13.field1450[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1450[var37][0];
                        int var39 = var13.field1450[var37][1];
                        int var40 = var13.field1450[var37][2];
                        int var41 = var13.field1450[var37][3];
                        int var42 = var13.field1450[var37][4];
                        int var43 = var13.field1450[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2714(var41, var43, var42, -96);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2720(var39, var40, var38, 0);
                        }
                    }
                }
            }
            class461 var44 = new class461(var35, var35.length);
            if (arg7 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method171(var44, var32, class112.field1691, 64, 850);
            if (arg7 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class118.field1796.length; var46++) {
                        if (arg7.field7135[var45] < class118.field1796[var46][var45].length) {
                            var11.method500(class72.field1265[var46][var45], class118.field1796[var46][var45][arg7.field7135[var45]]);
                        }
                    }
                }
            }
            if (class97.field1524 != null) {
                var11.method536(var12);
                class97.field1524.method2291(var11, var30, 1);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else if (arg6 < 17) {
            return null;
        } else {
            class55 var47 = var11.method532((byte) 1, var12, true);
            var47.method595(arg0 - 1, var23, var25, -128, 0, arg9.field468, var21, var22, var24);
            return var47;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI[IB[I)J")
    private final long method1000(boolean arg0, int arg1, int[] arg2, byte arg3, int[] arg4) {
        field2012++;
        long[] var6 = class597.field8433;
        long var7 = -1L;
        if (arg3 != 85) {
            method996(null, false, false);
        }
        long var9 = var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg1 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
    public static final boolean method1001(byte arg0, int arg1, int arg2) {
        field2013++;
        return arg0 < 66 ? true : class104.method834((byte) 126, arg2, arg1) & class547.method3093(arg2, arg1, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1002(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
