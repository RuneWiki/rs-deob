import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class109 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "[I")
    public static int[] field2042 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    public static boolean field2044 = false;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2045 = -1;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2049 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILub;I)V")
    public static final void method673(int arg0, class227 arg1, int arg2) {
        class171 var3 = class184.method1170(arg2, 2, -198247328);
        field2050++;
        if (arg0 == 8) {
            var3.method1089(94);
            var3.field2863 = arg1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BII)I")
    public static final int method674(byte arg0, int arg1, int arg2) {
        if (arg0 <= 56) {
            return 88;
        } else {
            field2041++;
            int var3 = arg2 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg2 + var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Lof;")
    public static final class119 method675(int arg0, boolean arg1) {
        field2048++;
        if (!arg1) {
            method675(47, true);
        }
        class119 var2 = (class119) class257.field4502.method1735((long) arg0, (byte) -69);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field478.method884(arg0, -71, 4);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method749(new class226(var3), arg0, 27734);
        }
        class257.field4502.method1730(var4, (long) arg0, (byte) 93);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BZ)V")
    public static final void method676(byte arg0, boolean arg1) {
        int var2 = -29 % ((arg0 - 37) / 57);
        field2040++;
        byte[][] var3 = class251.field4343;
        byte var4 = 4;
        for (int var5 = 0; var5 < var4; var5++) {
            class114.method725((byte) -92);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class236.field4098[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3967972) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class177.field2976.length; var14++) {
                                if (class177.field2976[var14] == var13 && var3[var14] != null) {
                                    class21.method101(1716, var5, arg1, class78.field1370, var9, var3[var14], (var11 & 0x7) * 8, (var12 & 0x7) * 8, var6 * 8, var10, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static final void method677(int arg0) {
        for (int var1 = -1; var1 < class146.field2512; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class15.field278[var1];
            }
            class225 var7 = class27.field446[var6];
            if (var7 != null && var7.field71 > 0) {
                var7.field71--;
                if (var7.field71 == 0) {
                    var7.field88 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class71.field1254; var2++) {
            int var4 = class146.field2517[var2];
            class195 var5 = class220.field3715[var4];
            if (var5 != null && var5.field71 > 0) {
                var5.field71--;
                if (var5.field71 == 0) {
                    var5.field88 = null;
                }
            }
        }
        int var3 = -32 % ((-arg0 - 25) / 56);
        field2043++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILfh;JLfh;Lfh;)V")
    public static final void method678(int arg0, int arg1, int arg2, int arg3, class180 arg4, long arg5, class180 arg6, class180 arg7) {
        class260 var9 = new class260();
        var9.field4521 = arg4;
        var9.field4524 = arg1 * 128 + 64;
        var9.field4526 = arg2 * 128 + 64;
        var9.field4529 = arg3;
        var9.field4538 = arg5;
        var9.field4523 = arg6;
        var9.field4531 = arg7;
        int var10 = 0;
        class108 var11 = class261.field4539[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2012; var12++) {
                class230 var13 = var11.field2021[var12];
                if ((var13.field4029 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4021.method88();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4536 = -var10;
        if (class261.field4539[arg0][arg1][arg2] == null) {
            class261.field4539[arg0][arg1][arg2] = new class108(arg0, arg1, arg2);
        }
        class261.field4539[arg0][arg1][arg2].field2019 = var9;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static final void method679(int arg0) {
        Object var1 = class223.field3777;
        synchronized (class223.field3777) {
            if (class245.field4290 != 0) {
                class245.field4290 = 1;
                try {
                    class223.field3777.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 <= 4) {
            method674((byte) 95, 19, 43);
        }
        field2046++;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public static void method680(int arg0) {
        if (arg0 < -42) {
            field2049 = null;
            field2042 = null;
        }
    }
}
