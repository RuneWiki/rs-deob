import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Z")
    public boolean field878 = true;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Ljava/lang/Object;")
    public Object field893 = new Object();

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field894 = 0;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[I")
    public int[] field895 = new int[500];

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "[I")
    public int[] field896 = new int[500];

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lpd;")
    public static class94 field876 = class28.method249(24, "headicons_prayer");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lpd;")
    private static class94 field885 = class28.method249(-93, "Select");

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lpd;")
    public static class94 field888 = class28.method249(96, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lpd;")
    public static class94 field889 = field885;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field897 = 127;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "J")
    public static long field886;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lad;")
    public static class5 field879;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lo;")
    public static class87 field881;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public static boolean field892;

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        while (this.field878) {
            Object var1 = this.field893;
            synchronized (this.field893) {
                if (this.field894 < 500) {
                    this.field895[this.field894] = class94.field2411;
                    this.field896[this.field894] = class84.field2121;
                    this.field894++;
                }
            }
            class127.method1004(50L, -93);
        }
        field883++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lme;ILpd;)Lpd;", line = 31)
    public static final class94 method263(class77 arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            method263(null, -23, null);
        }
        if (arg2.method711(-34, class89.field2284) != -1) {
            label62: while (true) {
                int var3 = arg2.method711(-34, class62.field1520);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method711(-34, class87.field2212);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method711(-34, class29.field846);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method711(-34, class122.field3075);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method711(-34, class94.field2428);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method711(-34, class120.field3007);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class94 var9 = class8.field230;
                                                        if (class12.field309 != null) {
                                                            var9 = class112.method830(class12.field309.field2945, true);
                                                            try {
                                                                if (class12.field309.field2946 != null) {
                                                                    byte[] var10 = ((String) class12.field309.field2946).getBytes("ISO-8859-1");
                                                                    var9 = class72.method537(var10.length, var10, 256, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class4.method20(new class94[] { arg2.method706(var8, (byte) 116, 0), var9, arg2.method687(var8 + 4, arg1 + -123) }, true);
                                                    }
                                                }
                                                arg2 = class4.method20(new class94[] { arg2.method706(var7, (byte) 116, 0), class45.method333((byte) -92, class111.method819(false, arg0, 4)), arg2.method687(var7 + 2, -123) }, true);
                                            }
                                        }
                                        arg2 = class4.method20(new class94[] { arg2.method706(var6, (byte) 116, 0), class45.method333((byte) -92, class111.method819(false, arg0, 3)), arg2.method687(var6 + 2, -123) }, true);
                                    }
                                }
                                arg2 = class4.method20(new class94[] { arg2.method706(var5, (byte) 116, 0), class45.method333((byte) -92, class111.method819(false, arg0, 2)), arg2.method687(var5 + 2, -123) }, true);
                            }
                        }
                        arg2 = class4.method20(new class94[] { arg2.method706(var4, (byte) 116, 0), class45.method333((byte) -92, class111.method819(false, arg0, 1)), arg2.method687(var4 + 2, -123) }, true);
                    }
                }
                arg2 = class4.method20(new class94[] { arg2.method706(var3, (byte) 116, 0), class45.method333((byte) -92, class111.method819(false, arg0, 0)), arg2.method687(var3 + 2, -123) }, true);
            }
        }
        field877++;
        return arg2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILs;)[B", line = 130)
    public static final byte[] method264(int arg0, int arg1, int arg2, int arg3, class111 arg4) {
        if (arg1 <= 66) {
            field888 = null;
        }
        field880++;
        long var5 = ((long) arg3 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF) + (long) (arg2 << 16);
        if (class90.field2350 != null) {
            class36 var7 = (class36) class90.field2350.method1007(var5, (byte) -40);
            if (var7 != null) {
                return var7.field938;
            }
        }
        byte[] var8 = arg4.method808((byte) 113, arg2, arg0);
        if (var8 == null) {
            return null;
        } else {
            if (class90.field2350 != null) {
                class90.field2350.method1012(50, new class36(var8), var5);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 175)
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -4) {
            method264(14, -119, -112, -103, null);
        }
        field890++;
        int var6 = (arg1 - 32) * arg1 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        class30.field849[0].method33(arg3, arg5);
        class30.field849[1].method33(arg3, arg1 + arg5 - 16);
        class130.method1028(arg3, arg5 + 16, 16, arg1 - 32, class43.field1085);
        int var7 = (arg1 - var6 - 32) * arg2 / (arg0 - arg1);
        class130.method1028(arg3, arg5 + var7 + 16, 16, var6, class51.field1289);
        class130.method1033(arg3, arg5 + var7 + 16, var6, class54.field1334);
        class130.method1033(arg3 + 1, var7 + 16 + arg5, var6, class54.field1334);
        class130.method1020(arg3, arg5 + var7 + 16, 16, class54.field1334);
        class130.method1020(arg3, arg5 + var7 + 17, 16, class54.field1334);
        class130.method1033(arg3 + 15, arg5 + 16 + var7, var6, class134.field3300);
        class130.method1033(arg3 + 14, arg5 + var7 + 17, var6 - 1, class134.field3300);
        class130.method1020(arg3, arg5 + var7 + var6 + 15, 16, class134.field3300);
        class130.method1020(arg3 + 1, arg5 + 14 + var6 + var7, 15, class134.field3300);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 217)
    public static void method266(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field879 = null;
        field888 = null;
        field876 = null;
        field881 = null;
        field885 = null;
        field889 = null;
    }
}
