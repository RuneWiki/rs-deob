import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 extends class124 {

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Lpj;")
    public static class237 field3045 = class33.method353("<col=ffff00>", 78);

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "Lpj;")
    private static class237 field3053 = class33.method353("Select", 88);

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Lpj;")
    public static class237 field3044 = field3053;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Lak;")
    public static class135 field3043 = new class135(5);

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
    public static int[] field3056 = new int[2];

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "Lpj;")
    private static class237 field3057 = class33.method353("Connection lost)3", 81);

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "Lpj;")
    public static class237 field3058 = field3057;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "B")
    public byte field3049;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lie;")
    public class32 field3050;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3042;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "[I")
    public static int[] field3060;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLie;)V")
    public static final void method1204(byte arg0, class32 arg1) {
        ++field3047;
        if (arg0 == 37) {
            while (true) {
                while (arg1.field644.length > arg1.field647) {
                    boolean var2 = false;
                    int var3 = 0;
                    int var4 = 0;
                    if (~arg1.method316((byte) -86) == -2) {
                        var2 = true;
                        var3 = arg1.method316((byte) 123);
                        var4 = arg1.method316((byte) 97);
                    }
                    int var5 = arg1.method316((byte) -116);
                    int var6 = arg1.method316((byte) 120);
                    int var7 = -(var6 * 64) - -class17.field296 + class115.field2017 + -1;
                    int var8 = var5 * 64 + -class202.field3466;
                    if (var8 >= 0 && ~(var7 - 63) <= -1 && var8 + 63 < class148.field2629 && var7 < class115.field2017) {
                        int var9 = var8 >> 6;
                        int var10 = var7 >> 6;
                        for (int var11 = 0; var11 < 64; ++var11) {
                            for (int var12 = 0; var12 < 64; ++var12) {
                                if (!var2 || ~(var3 * 8) >= ~var11 && ~var11 > ~(var3 * 8 + 8) && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                    byte var13 = arg1.method325(arg0 + 71);
                                    if (var13 != 0) {
                                        if (class149.field2647[var9][var10] == null) {
                                            class149.field2647[var9][var10] = new byte[4096];
                                        }
                                        class149.field2647[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                        byte var14 = arg1.method325(arg0 + -161);
                                        if (class79.field1479[var9][var10] == null) {
                                            class79.field1479[var9][var10] = new byte[4096];
                                        }
                                        class79.field1479[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var15 = 0; ~(var2 ? 64 : 4096) < ~var15; ++var15) {
                            byte var16 = arg1.method325(-117);
                            if (~var16 != -1) {
                                ++arg1.field647;
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)[B")
    public final byte[] method885(int arg0) {
        if (arg0 != 1) {
            method1207((byte) 36);
        }
        ++field3052;
        if (!super.field2175 && ~this.field3050.field647 <= ~(this.field3050.field644.length + -this.field3049)) {
            return this.field3050.field644;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
    public static final void method1205(byte arg0, int arg1) {
        --class271.field4664;
        ++field3041;
        if (arg0 != 25) {
            field3058 = null;
        }
        if (~class271.field4664 != ~arg1) {
            class171.method1183(class180.field3168, arg1 + 1, class180.field3168, arg1, -arg1 + class271.field4664);
            class171.method1183(class215.field3747, arg1 + 1, class215.field3747, arg1, -arg1 + class271.field4664);
            class171.method1184(class235.field4090, arg1 - -1, class235.field4090, arg1, -arg1 + class271.field4664);
            class171.method1181(class35.field760, arg1 + 1, class35.field760, arg1, -arg1 + class271.field4664);
            class171.method1185(class119.field2089, arg1 + 1, class119.field2089, arg1, -arg1 + class271.field4664);
            class171.method1185(class135.field2358, arg1 + 1, class135.field2358, arg1, -arg1 + class271.field4664);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lie;I)Lqb;")
    public static final class57 method1206(class32 arg0, int arg1) {
        if (arg1 != -1395) {
            field3056 = null;
        }
        ++field3046;
        return new class57(arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(arg1 + -489705525), arg0.method313((byte) -80), arg0.method316((byte) 116));
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
    public static void method1207(byte arg0) {
        field3044 = null;
        field3058 = null;
        field3045 = null;
        field3053 = null;
        if (arg0 != 83) {
            field3053 = null;
        }
        field3043 = null;
        field3060 = null;
        field3057 = null;
        field3042 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
    public final int method889(byte arg0) {
        ++field3048;
        if (arg0 != -30) {
            field3053 = null;
        }
        return this.field3050 == null ? 0 : this.field3050.field647 * 100 / (this.field3050.field644.length - this.field3049);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILie;)V")
    public static final void method1208(int arg0, class32 arg1) {
        if (class100.field1781 != null) {
            try {
                class100.field1781.method627(0L, 15294);
                class100.field1781.method624(true, 24, arg1.field647, arg1.field644);
            } catch (Exception var2) {
            }
        }
        ++field3051;
        arg1.field647 += 24;
        if (arg0 <= 7) {
            field3058 = null;
        }
    }
}
