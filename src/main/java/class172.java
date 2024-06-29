import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class172 extends class196 {

    @OriginalMember(owner = "client!ma", name = "Cb", descriptor = "[[B")
    public byte[][] field2872 = new byte[256][];

    @OriginalMember(owner = "client!ma", name = "Ib", descriptor = "Lub;")
    private static class227 field2878 = class257.method1749("Started 3d library", 17263);

    @OriginalMember(owner = "client!ma", name = "Lb", descriptor = "Lub;")
    public static class227 field2881 = field2878;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ma", name = "Bb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ma", name = "Eb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ma", name = "Gb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ma", name = "Hb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ma", name = "Jb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ma", name = "Kb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ma", name = "Fb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2875;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static final void method1096(int arg0) {
        field2873++;
        class184.method1176(1);
        System.gc();
        class12.method60(arg0, -109);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
    public static final void method1097(int arg0, int arg1) {
        if (arg0 != 65535) {
            method1098(52);
        }
        for (class216 var2 = (class216) class184.field3133.method1299((byte) -127); var2 != null; var2 = (class216) class184.field3133.method1295((byte) 31)) {
            if (((long) arg1) == (var2.field1113 >> 48 & 0xFFFFL)) {
                var2.method369(125);
            }
        }
        field2880++;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field2881 = null;
        field2878 = null;
        if (arg0 != 383) {
            method1096(-29);
        }
        field2875 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
    public class172(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIII)V")
    public final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2877++;
        int var7 = class111.field2066 * arg2 + arg1;
        int var8 = class111.field2066 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class111.field2063) {
            int var11 = class111.field2063 - arg2;
            var10 += arg3 * var11;
            var7 += class111.field2066 * var11;
            arg4 -= var11;
            arg2 = class111.field2063;
        }
        if ((arg2 + arg4) > class111.field2065) {
            arg4 -= arg2 + arg4 - class111.field2065;
        }
        if (arg1 < class111.field2067) {
            int var12 = class111.field2067 - arg1;
            arg1 = class111.field2067;
            var8 += var12;
            var7 += var12;
            var10 += var12;
            arg3 -= var12;
            var9 += var12;
        }
        if (class111.field2068 < arg1 + arg3) {
            int var13 = arg1 + arg3 - class111.field2068;
            arg3 -= var13;
            var8 += var13;
            var9 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class85.method511(var8, this.field2872[arg0], arg4, (byte) 120, class111.field2069, var10, arg5, arg3, var9, var7);
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        field2876++;
        int var1 = class208.field3531 * 128 + 64;
        int var2 = class199.field3416 * 128 + 64;
        int var3 = class193.method1227(var1, true, class64.field1171, var2) - class59.field1096;
        if (class235.field4066 < 100) {
            if (var3 > class25.field422) {
                class25.field422 += (var3 - class25.field422) * class235.field4066 / 1000 + class245.field4273;
                if (class25.field422 > var3) {
                    class25.field422 = var3;
                }
            }
            if (class25.field422 > var3) {
                class25.field422 -= (class25.field422 - var3) * class235.field4066 / 1000 + class245.field4273;
                if (class25.field422 < var3) {
                    class25.field422 = var3;
                }
            }
            if (class184.field3135 < var1) {
                class184.field3135 += class245.field4273 + ((var1 - class184.field3135) * class235.field4066 / 1000);
                if (var1 < class184.field3135) {
                    class184.field3135 = var1;
                }
            }
            if (class88.field1527 < var2) {
                class88.field1527 += (var2 - class88.field1527) * class235.field4066 / 1000 + class245.field4273;
                if (class88.field1527 > var2) {
                    class88.field1527 = var2;
                }
            }
            if (class88.field1527 > var2) {
                class88.field1527 -= (class88.field1527 - var2) * class235.field4066 / 1000 + class245.field4273;
                if (var2 > class88.field1527) {
                    class88.field1527 = var2;
                }
            }
            if (var1 < class184.field3135) {
                class184.field3135 -= (class184.field3135 - var1) * class235.field4066 / 1000 + class245.field4273;
                if (class184.field3135 < var1) {
                    class184.field3135 = var1;
                }
            }
        } else {
            class88.field1527 = class199.field3416 * 128 + 64;
            class184.field3135 = class208.field3531 * 128 + 64;
            class25.field422 = class193.method1227(class184.field3135, true, class64.field1171, class88.field1527) - class59.field1096;
        }
        int var4 = class176.field2939 * 128 + 64;
        int var5 = class134.field2342 * 128 + 64;
        int var6 = class193.method1227(var5, true, class64.field1171, var4) - class173.field2900;
        int var7 = var4 - class88.field1527;
        int var8 = var6 - class25.field422;
        int var9 = var5 - class184.field3135;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var7) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class161.field2724;
        if (class103.field1812 < var11) {
            class103.field1812 += (var11 - class103.field1812) * class252.field4370 / 1000 + class250.field4339;
            if (var11 < class103.field1812) {
                class103.field1812 = var11;
            }
        }
        if (class103.field1812 > var11) {
            class103.field1812 -= (class103.field1812 - var11) * class252.field4370 / 1000 + class250.field4339;
            if (class103.field1812 < var11) {
                class103.field1812 = var11;
            }
        }
        if (arg0 > ~var13) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class161.field2724 += class250.field4339 + (class252.field4370 * var13 / 1000);
            class161.field2724 &= 0x7FF;
        }
        if (var13 < 0) {
            class161.field2724 -= -var13 * class252.field4370 / 1000 + class250.field4339;
            class161.field2724 &= 0x7FF;
        }
        int var14 = var12 - class161.field2724;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class161.field2724 = var12;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2870++;
        int var8 = class111.field2066 - arg3;
        int var9 = 0;
        int var10 = class111.field2066 * arg2 + arg1;
        if (arg2 < class111.field2063) {
            int var11 = class111.field2063 - arg2;
            var10 += class111.field2066 * var11;
            arg4 -= var11;
            var9 += arg3 * var11;
            arg2 = class111.field2063;
        }
        int var12 = 0;
        if (class111.field2067 > arg1) {
            int var13 = class111.field2067 - arg1;
            var8 += var13;
            var12 += var13;
            arg3 -= var13;
            var9 += var13;
            var10 += var13;
            arg1 = class111.field2067;
        }
        if (arg2 + arg4 > class111.field2065) {
            arg4 -= arg2 + arg4 - class111.field2065;
        }
        if (class111.field2068 < (arg1 + arg3)) {
            int var14 = arg1 + arg3 - class111.field2068;
            arg3 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class95.method584(false, var12, var9, arg5, var10, var8, arg6, arg4, this.field2872[arg0], arg3, class111.field2069);
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static final void method1102(byte arg0) {
        field2874++;
        class257.field4502.method1723(-4173);
        int var1 = -110 % ((-arg0 - 45) / 46);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class172(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2872 = arg5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIZ)I")
    public static final int method1103(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return -42;
        }
        field2879++;
        if ((class40.field654[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (class40.field654[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }
}
