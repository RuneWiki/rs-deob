import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class99 extends class249 {

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "[J")
    private long[] field1797 = new long[10];

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    private int field1788 = 256;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private int field1800 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    private int field1790 = 1;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "J")
    private long field1799 = class154.method1114(true);

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lcd;")
    public static class64 field1793 = class44.method335((byte) 71, "Okay");

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Lcd;")
    public static class64 field1795 = class44.method335((byte) 71, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Lcd;")
    public static class64 field1801 = class44.method335((byte) 71, "<)4col>");

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "[Ldb;")
    public static class175[] field1796;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZJ)Lcd;", line = 6)
    public static final class64 method734(boolean arg0, long arg1) {
        field1804++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (!arg0) {
                return (class64) null;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class234.field3955[(int) (var7 - (arg1 * 37L))];
            }
            class64 var9 = new class64();
            var9.field1252 = var6;
            var9.field1274 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V", line = 54)
    public static final void method735(boolean arg0, int arg1) {
        field1803++;
        byte[][] var2;
        if (class123.field2216 && arg0) {
            var2 = class134.field2384;
        } else {
            var2 = class71.field1360;
        }
        int var3 = class13.field268.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class89.field1611[var4] >> 8) * 64 - class190.field3269;
                int var7 = (class89.field1611[var4] & 0xFF) * 64 - class121.field2184;
                class246.method1778(5);
                class193.method1356(class91.field1637, arg0, var6, 30384, var5, var7);
            }
        }
        if (arg1 != -24557) {
            method737((class64) null, -121, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 94)
    public final void method736(byte arg0) {
        field1787++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1797[var2] = 0L;
        }
        if (arg0 != 41) {
            field1791 = 75;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lcd;IB)V", line = 116)
    public static final void method737(class64 arg0, int arg1, byte arg2) {
        field1794++;
        class299 var3 = class158.method1135(arg1, -95, 2);
        var3.method2091(90);
        if (arg2 < 106) {
            field1793 = (class64) null;
        }
        var3.field5159 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIIIIIII)V", line = 137)
    public static final void method738(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1798++;
        if (arg5 < 128 || arg7 < 128 || arg5 > 13056 || arg7 > 13056) {
            class267.field4594 = -1;
            class29.field463 = -1;
            return;
        }
        int var8 = class15.method169(arg7, arg0 ^ 0x339D, class20.field364, arg5) - arg4;
        int var9 = class50.field826[class131.field2336];
        int var10 = class50.field820[class131.field2336];
        int var11 = var8 - class268.field4622;
        int var12 = class50.field826[class181.field3102];
        int var13 = arg5 - field1791;
        int var14 = arg7 - class119.field2156;
        int var15 = class50.field820[class181.field3102];
        int var16 = var12 * var14 + (var13 * var15) >> 16;
        if (arg0 != 84) {
            field1801 = (class64) null;
        }
        int var17 = var14 * var15 - var12 * var13 >> 16;
        int var19 = var10 * var11 - (var9 * var17) >> 16;
        int var20 = var9 * var11 + (var10 * var17) >> 16;
        if (var20 < 50) {
            class29.field463 = -1;
            class267.field4594 = -1;
        } else if (class123.field2216) {
            int var22 = arg2 * 512 >> 8;
            int var23 = arg6 * 512 >> 8;
            class267.field4594 = var19 * var23 / var20 + arg1;
            class29.field463 = var16 * var22 / var20 + arg3;
        } else {
            class29.field463 = (var16 << 9) / var20 + arg3;
            class267.field4594 = (var19 << 9) / var20 + arg1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 215)
    public class99() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1797[var1] = this.field1799;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 247)
    public static void method739(byte arg0) {
        field1801 = null;
        field1795 = null;
        field1793 = null;
        int var1 = 124 / ((34 - arg0) / 60);
        field1796 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)I", line = 260)
    public final int method740(int arg0, byte arg1, int arg2) {
        field1802++;
        int var4 = this.field1788;
        this.field1788 = 300;
        if (arg1 < 86) {
            field1796 = (class175[]) null;
        }
        int var5 = this.field1790;
        this.field1790 = 1;
        this.field1799 = class154.method1114(true);
        if (this.field1797[this.field1789] == 0L) {
            this.field1790 = var5;
            this.field1788 = var4;
        } else if (this.field1797[this.field1789] < this.field1799) {
            this.field1788 = (int) ((long) (arg0 * 2560) / (this.field1799 - this.field1797[this.field1789]));
        }
        if (this.field1788 < 25) {
            this.field1788 = 25;
        }
        if (this.field1788 > 256) {
            this.field1788 = 256;
            this.field1790 = (int) ((long) arg0 - ((this.field1799 - this.field1797[this.field1789]) / 10L));
        }
        if (arg0 < this.field1790) {
            this.field1790 = arg0;
        }
        this.field1797[this.field1789] = this.field1799;
        this.field1789 = (this.field1789 + 1) % 10;
        if (this.field1790 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1797[var6] != 0L) {
                    this.field1797[var6] += (long) this.field1790;
                }
            }
        }
        if (arg2 > this.field1790) {
            this.field1790 = arg2;
        }
        class267.method1871(10, (long) this.field1790);
        int var7 = 0;
        while (this.field1800 < 256) {
            this.field1800 += this.field1788;
            var7++;
        }
        this.field1800 &= 0xFF;
        return var7;
    }
}
