import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class114 {

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
    public short[] field2160;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
    public short[] field2157;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[B")
    public byte[] field2164;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[Lr;")
    public class66[] field2161;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lr;")
    public static class66 field2167 = class93.method641(43, "scrollbar");

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lqc;")
    public static class245 field2162 = new class245(64);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lr;")
    public static class66 field2168 = class93.method641(43, "Texturen geladen)3");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
    public static final int method759(int arg0, boolean arg1) {
        if (arg1) {
            field2168 = null;
        }
        field2169++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE6) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Z")
    public final boolean method760(byte arg0, int arg1) {
        field2156++;
        int var3 = 38 % ((arg0 + 11) / 51);
        return (this.field2164[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        if (arg0 > -52) {
            field2168 = null;
        }
        field2167 = null;
        field2162 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILha;)V")
    public static final void method762(int arg0, int arg1, int arg2, class63 arg3) {
        field2158++;
        if (class241.field4187 != null || class115.field2177 || arg3 == null || class32.method185(arg3, (byte) 3) == null) {
            return;
        }
        if (arg2 != -4798) {
            method763(-50, (class63) null);
        }
        class241.field4187 = arg3;
        class135.field2502 = class32.method185(arg3, (byte) 3);
        class254.field4466 = 0;
        class183.field3199 = arg1;
        class164.field2934 = arg0;
        class109.field2115 = false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILha;)V")
    public static final void method763(int arg0, class63 arg1) {
        if (arg0 != 30341) {
            method759(-53, true);
        }
        int var2 = arg1.field1131;
        field2159++;
        if (var2 == 324) {
            if (class206.field3544 == -1) {
                class206.field3544 = arg1.field1163;
                class180.field3158 = arg1.field1156;
            }
            if (class120.field2270.field1978) {
                arg1.field1163 = class206.field3544;
            } else {
                arg1.field1163 = class180.field3158;
            }
        } else if (var2 == 325) {
            if (class206.field3544 == -1) {
                class206.field3544 = arg1.field1163;
                class180.field3158 = arg1.field1156;
            }
            if (class120.field2270.field1978) {
                arg1.field1163 = class180.field3158;
            } else {
                arg1.field1163 = class206.field3544;
            }
        } else if (var2 == 327) {
            arg1.field1187 = 150;
            arg1.field1137 = (int) (Math.sin((double) class75.field1501 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1126 = -1;
            arg1.field1188 = 5;
        } else if (var2 == 328) {
            if (class207.field3595.field815 == null) {
                arg1.field1126 = 0;
            } else {
                arg1.field1187 = 150;
                arg1.field1137 = (int) (Math.sin((double) class75.field1501 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1188 = 5;
                arg1.field1126 = ((int) class207.field3595.field815.method479(10908) << 11) + 2047;
                arg1.field1154 = class207.field3595.field2040;
                arg1.field1079 = class207.field3595.field2071;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public final int method764(int arg0, int arg1) {
        int var3 = 20 / ((29 - arg0) / 48);
        field2165++;
        return this.field2164[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class114(int arg0) {
        this.field2163 = arg0;
        this.field2160 = new short[this.field2163];
        this.field2157 = new short[this.field2163];
        this.field2166 = new int[this.field2163];
        this.field2164 = new byte[this.field2163];
        this.field2161 = new class66[this.field2163];
    }
}
