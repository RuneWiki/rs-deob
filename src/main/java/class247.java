import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class247 extends class177 {

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    private int field4516 = -32768;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lhj;")
    public static class69 field4517 = class181.method1318("Angreifen", (byte) -109);

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[I")
    public static int[] field4520 = new int[2];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lej;")
    public static class48 field4521;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()I")
    public final int method211() {
        field4515++;
        return this.field4516;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method1743(boolean arg0) {
        class49.field718.method1709((byte) -111);
        field4519++;
        if (arg0) {
            field4517 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field4520 = null;
        field4521 = null;
        field4517 = null;
        if (arg0 >= -23) {
            method1744(-123);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4522++;
        class92 var11 = class83.method585(this.field4518, -1).method1487(0, 107, (class159) null, this.field4524);
        if (var11 != null) {
            var11.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4516 = var11.method211();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLtk;I)V")
    public static final void method1745(boolean arg0, class50 arg1, int arg2) {
        int var3 = -38 % ((arg2 - 52) / 59);
        int var4 = arg1.field847 == 0 ? arg1.field798 : arg1.field847;
        field4514++;
        int var5 = arg1.field839 == 0 ? arg1.field727 : arg1.field839;
        class171.method1251(arg0, class116.field2222[arg1.field773 >> 16], var5, arg1.field773, (byte) -99, var4);
        if (arg1.field848 != null) {
            class171.method1251(arg0, arg1.field848, var5, arg1.field773, (byte) -120, var4);
        }
        class259 var6 = (class259) class156.field2910.method769(true, (long) arg1.field773);
        if (var6 != null) {
            class136.method1017(arg0, var5, var6.field4640, var4, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method1746(byte arg0) {
        field4523++;
        int var1 = class115.field2204 * 128 + 64;
        int var2 = class217.field3939 * 128 + 64;
        int var3 = class156.method1179(var2, var1, arg0 ^ 0xFFFFFF81, class52.field927) - class100.field1885;
        if (class213.field3868 >= 100) {
            class123.field2291 = class115.field2204 * 128 + 64;
            class127.field2327 = class217.field3939 * 128 + 64;
            class31.field427 = class156.method1179(class127.field2327, class123.field2291, arg0 + 92, class52.field927) - class100.field1885;
        } else {
            if (var1 > class123.field2291) {
                class123.field2291 += (var1 - class123.field2291) * class213.field3868 / 1000 + class230.field4220;
                if (class123.field2291 > var1) {
                    class123.field2291 = var1;
                }
            }
            if (var3 > class31.field427) {
                class31.field427 += (var3 - class31.field427) * class213.field3868 / 1000 + class230.field4220;
                if (class31.field427 > var3) {
                    class31.field427 = var3;
                }
            }
            if (var1 < class123.field2291) {
                class123.field2291 -= (class123.field2291 - var1) * class213.field3868 / 1000 + class230.field4220;
                if (var1 > class123.field2291) {
                    class123.field2291 = var1;
                }
            }
            if (class127.field2327 < var2) {
                class127.field2327 += (var2 - class127.field2327) * class213.field3868 / 1000 + class230.field4220;
                if (var2 < class127.field2327) {
                    class127.field2327 = var2;
                }
            }
            if (class127.field2327 > var2) {
                class127.field2327 -= (class127.field2327 - var2) * class213.field3868 / 1000 + class230.field4220;
                if (class127.field2327 < var2) {
                    class127.field2327 = var2;
                }
            }
            if (var3 < class31.field427) {
                class31.field427 -= (class31.field427 - var3) * class213.field3868 / 1000 + class230.field4220;
                if (var3 > class31.field427) {
                    class31.field427 = var3;
                }
            }
        }
        int var4 = class122.field2274 * 128 + 64;
        int var5 = class129.field2413 * 128 + 64;
        int var6 = class156.method1179(var5, var4, 67, class52.field927) - class148.field2763;
        int var7 = var5 - class127.field2327;
        int var8 = var6 - class31.field427;
        int var9 = var4 - class123.field2291;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class162.field3006;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class148.field2753 < var11) {
            class148.field2753 += (var11 - class148.field2753) * class177.field3222 / 1000 + class110.field2096;
            if (class148.field2753 > var11) {
                class148.field2753 = var11;
            }
        }
        if (var11 < class148.field2753) {
            class148.field2753 -= class110.field2096 + ((class148.field2753 - var11) * class177.field3222 / 1000);
            if (var11 > class148.field2753) {
                class148.field2753 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class162.field3006 += class110.field2096 + (class177.field3222 * var13 / 1000);
            class162.field3006 &= 0x7FF;
        }
        if (var13 < 0) {
            class162.field3006 -= -var13 * class177.field3222 / 1000 + class110.field2096;
            class162.field3006 &= 0x7FF;
        }
        int var14 = var12 - class162.field3006;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (arg0 != -69) {
            method1745(false, (class50) null, -59);
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class162.field3006 = var12;
        }
    }
}
