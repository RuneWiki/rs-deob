import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class78 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[Lok;")
    public static class41[] field1147 = new class41[200];

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lok;")
    public static class41 field1151 = class137.method956("Lade Wordpack )2 ", 45);

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lok;")
    public static class41 field1153 = class137.method956("<col=ffffff> )4 ", 45);

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static volatile int field1154 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lok;")
    public static class41 field1155 = class137.method956("<col=ff9040>", 45);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 19)
    public static final int method560(int arg0, int arg1) {
        field1149++;
        if (arg1 != 0) {
            method562((byte) -83);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
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

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 88)
    public static void method561(boolean arg0) {
        field1147 = null;
        field1155 = null;
        field1151 = null;
        if (!arg0) {
            field1154 = 90;
        }
        field1153 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 126)
    public static final void method562(byte arg0) {
        field1152++;
        if (arg0 < 71) {
            return;
        }
        class189 var1 = class248.field3960;
        synchronized (class248.field3960) {
            class144.field2198++;
            class308.field5188 = class285.field4623;
            if (class308.field5190 >= 0) {
                while (class308.field5190 != class195.field3143) {
                    int var2 = class230.field3645[class195.field3143];
                    class195.field3143 = class195.field3143 + 1 & 0x7F;
                    if (var2 < 0) {
                        class85.field1225[~var2] = false;
                    } else {
                        class85.field1225[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class85.field1225[var3] = false;
                }
                class308.field5190 = class195.field3143;
            }
            class285.field4623 = class18.field236;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Llb;I)V", line = 171)
    public static final void method563(class112 arg0, int arg1) {
        label86: while (true) {
            if (arg0.field1607.length > arg0.field1640) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method792(2) == 1) {
                    var2 = true;
                    var3 = arg0.method792(2);
                    var4 = arg0.method792(2);
                }
                int var5 = arg0.method792(2);
                int var6 = arg0.method792(2);
                int var7 = var5 * 64 - class120.field1773;
                int var8 = class177.field2876 + class212.field3414 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class66.field1004 && var8 < class212.field3414) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label86;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var3 * 8 + 8 > var11 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg0.method785((byte) -111);
                                if (var13 != 0) {
                                    if (class226.field3618[var9][var10] == null) {
                                        class226.field3618[var9][var10] = new byte[4096];
                                    }
                                    class226.field3618[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method785((byte) -124);
                                    if (class85.field1231[var9][var10] == null) {
                                        class85.field1231[var9][var10] = new byte[4096];
                                    }
                                    class85.field1231[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var15 = 0;
                while (true) {
                    if ((var2 ? 64 : 4096) <= var15) {
                        continue label86;
                    }
                    byte var16 = arg0.method785((byte) -116);
                    if (var16 != 0) {
                        arg0.field1640++;
                    }
                    var15++;
                }
            }
            field1148++;
            int var17 = -111 / ((29 - arg1) / 60);
            return;
        }
    }
}
