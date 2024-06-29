import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class252 {

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    private int field4491 = 0;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "[Lce;")
    public class207[] field4486;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljd;")
    public static class86 field4472 = class122.method868(")2", true);

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Ljd;")
    public static class86 field4477 = class122.method868("(Udns", true);

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Ljd;")
    public static class86 field4489 = class122.method868("mem=", true);

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    public static boolean field4488 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "J")
    private long field4484;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lbj;")
    public static class151 field4478;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lbj;")
    public static class151 field4485;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lce;")
    private class207 field4474;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lce;")
    private class207 field4490;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JB)Lce;")
    public final class207 method1698(long arg0, byte arg1) {
        this.field4484 = arg0;
        class207 var4 = this.field4486[(int) ((long) (this.field4473 - 1) & arg0)];
        this.field4474 = var4.field3765;
        field4471++;
        while (this.field4474 != var4) {
            if (this.field4474.field3759 == arg0) {
                class207 var6 = this.field4474;
                this.field4474 = this.field4474.field3765;
                return var6;
            }
            this.field4474 = this.field4474.field3765;
        }
        this.field4474 = null;
        int var5 = -7 % ((68 - arg1) / 34);
        return null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILce;J)V")
    public final void method1699(int arg0, class207 arg1, long arg2) {
        if (arg1.field3762 != null) {
            arg1.method1477(1);
        }
        field4470++;
        if (arg0 != -28407) {
            return;
        }
        class207 var5 = this.field4486[(int) ((long) (this.field4473 - 1) & arg2)];
        arg1.field3759 = arg2;
        arg1.field3762 = var5.field3762;
        arg1.field3765 = var5;
        arg1.field3762.field3765 = arg1;
        arg1.field3765.field3762 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public final int method1700(byte arg0) {
        field4468++;
        if (arg0 > -107) {
            this.method1705(121);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4473; var3++) {
            class207 var4 = this.field4486[var3];
            for (class207 var5 = var4.field3765; var5 != var4; var5 = var5.field3765) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method1701(int arg0) {
        field4469++;
        if (class139.field2641 < 128) {
            class139.field2641 = 128;
        }
        class86.field1664 &= 0x7FF;
        if (class139.field2641 > 383) {
            class139.field2641 = 383;
        }
        int var1 = class204.field3692 >> 7;
        int var2 = 0;
        int var3 = class141.field2678 >> 7;
        int var4 = class30.method198(31482, class141.field2678, class204.field3692, class180.field3244);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= var3 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class180.field3244;
                    if (var7 < 3 && (class86.field1693[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class35.field796[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        if (arg0 != 128) {
            method1703(29);
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class68.field1328 < var9) {
            class68.field1328 += (var9 - class68.field1328) / 24;
        } else if (var9 < class68.field1328) {
            class68.field1328 += (var9 - class68.field1328) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method1702(byte arg0) {
        field4478 = null;
        field4485 = null;
        field4489 = null;
        field4472 = null;
        if (arg0 != -13) {
            method1703(64);
        }
        field4477 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method1703(int arg0) {
        field4493++;
        class140.field2665.method703((byte) 122);
        int var1 = -79 / ((-arg0 - 29) / 59);
        class233.field4212.method703((byte) 122);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lce;")
    public final class207 method1704(int arg0) {
        if (arg0 >= -72) {
            this.field4484 = 103L;
        }
        field4475++;
        if (this.field4491 > 0 && this.field4486[this.field4491 - 1] != this.field4490) {
            class207 var2 = this.field4490;
            this.field4490 = var2.field3765;
            return var2;
        }
        while (this.field4491 < this.field4473) {
            class207 var3 = this.field4486[this.field4491++].field3765;
            if (this.field4486[this.field4491 - 1] != var3) {
                this.field4490 = var3.field3765;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method1705(int arg0) {
        int var2 = -124 / ((arg0 - 75) / 42);
        for (int var3 = 0; var3 < this.field4473; var3++) {
            class207 var4 = this.field4486[var3];
            while (true) {
                class207 var5 = var4.field3765;
                if (var4 == var5) {
                    break;
                }
                var5.method1477(1);
            }
        }
        this.field4490 = null;
        field4492++;
        this.field4474 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I")
    public static final int method1706(byte arg0) {
        field4476++;
        if (arg0 != 57) {
            field4481 = 24;
        }
        return ((class139.field2646 == 0 ? 0 : 1) << 21) + ((class83.field1621 ? 1 : 0) << 16) + (class133.field2513 & 0x3 << 11) + ((class272.field4769 ? 1 : 0) << 10) + ((class4.field63 ? 1 : 0) << 8) + ((class116.field2224 ? 1 : 0) << 5) + ((class239.field4304 ? 1 : 0) << 3) + ((class21.field547 & 0x7) - -((class79.field1555 ? 1 : 0) << 4)) + (((class202.field3655 ? 1 : 0) << 6) - -((class42.field936 ? 1 : 0) << 7)) + ((class107.field2061 ? 1 : 0) << 9) + ((class168.field3114 ? 1 : 0) << 13) + ((class161.field3029 ? 1 : 0) << 15) - (-(class64.field1257 & 0x3 << 17) + -((class31.field647 ? 1 : 0) << 19) - (((class264.field4672 == 0 ? 0 : 1) << 20) + ((class152.field2879 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I")
    public final int method1707(int arg0) {
        field4483++;
        return arg0 == 98048 ? this.field4473 : -30;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    public class252(int arg0) {
        this.field4486 = new class207[arg0];
        this.field4473 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field4486[var2] = new class207();
            var3.field3762 = var3;
            var3.field3765 = var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)Lce;")
    public final class207 method1708(byte arg0) {
        field4482++;
        if (this.field4474 == null) {
            return null;
        }
        class207 var2 = this.field4486[(int) (this.field4484 & (long) (this.field4473 - 1))];
        while (this.field4474 != var2) {
            if (this.field4474.field3759 == this.field4484) {
                class207 var3 = this.field4474;
                this.field4474 = this.field4474.field3765;
                return var3;
            }
            this.field4474 = this.field4474.field3765;
        }
        if (arg0 > -14) {
            return null;
        } else {
            this.field4474 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)Lce;")
    public final class207 method1709(int arg0) {
        this.field4491 = 0;
        if (arg0 >= -10) {
            method1702((byte) -45);
        }
        field4479++;
        return this.method1704(-104);
    }
}
