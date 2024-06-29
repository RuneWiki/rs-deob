import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class297 extends class453 {

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Lup;")
    public static class547 field4312 = new class547();

    @OriginalMember(owner = "client!un", name = "E", descriptor = "Lvb;")
    public static class396 field4320 = new class396(11, 2);

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "J")
    public long field4314;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 5)
    public static void method1867(int arg0) {
        int var1 = 92 % ((arg0 + 3) / 43);
        field4312 = null;
        field4320 = null;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)I", line = 20)
    public final int method1868(byte arg0) {
        field4307++;
        int var2 = 84 % ((17 - arg0) / 40);
        return this.field4310;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I", line = 30)
    public final int method1869(byte arg0) {
        field4315++;
        int var2 = -123 / ((arg0 - 67) / 54);
        return this.field4308;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIII)I", line = 41)
    public static final int method1870(boolean arg0, int arg1, int arg2, int arg3) {
        field4313++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 & 0x7F) * var4 + ((arg2 & 0x7F) * arg3) >> 7;
        if (!arg0) {
            field4319 = -74;
        }
        int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)J", line = 64)
    public final long method1871(byte arg0) {
        field4311++;
        return arg0 == -126 ? this.field4314 : 18L;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(B)I", line = 77)
    public final int method1872(byte arg0) {
        field4318++;
        int var2 = -104 / ((-arg0 - 71) / 41);
        return this.field4309;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I", line = 91)
    public final int method1873(int arg0) {
        field4316++;
        int var2 = 19 % ((-arg0 - 60) / 33);
        return this.field4317;
    }
}
