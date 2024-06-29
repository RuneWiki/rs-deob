import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class288 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Len;")
    private class3 field4164;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lja;")
    private class112 field4160;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lul;")
    private class172 field4166;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    public static int[] field4157 = new int[2048];

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field4174 = 0;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    public static int[] field4162 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4177 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "B")
    public static byte field4176;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lkk;")
    public static class295 field4163;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lfd;")
    private class299 field4165;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field4173;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[Lwb;")
    private class236[] field4169;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1971(boolean arg0) {
        field4175++;
        if (this.field4169 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4169.length; var2++) {
            if (this.field4169[var2] != null) {
                this.field4169[var2].method1681(false);
            }
        }
        if (!arg0) {
            field4178 = 20;
        }
        for (int var3 = 0; var3 < this.field4169.length; var3++) {
            if (this.field4169[var3] != null) {
                this.field4169[var3].method1688(-2);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method1972(byte arg0) {
        field4158++;
        if (arg0 != 70) {
            method1973(true, -26);
        }
        if (this.field4165 != null) {
            return true;
        }
        if (this.field4166 == null) {
            if (this.field4164.method12(arg0 ^ 0x46)) {
                return false;
            }
            this.field4166 = this.field4164.method17((byte) 0, 255, true, -24559, 255);
        }
        if (this.field4166.field1109) {
            return false;
        } else {
            this.field4165 = new class299(this.field4166.method636((byte) -90));
            this.field4169 = new class236[(this.field4165.field4350.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V", line = 76)
    public static final void method1973(boolean arg0, int arg1) {
        field4168++;
        byte var2;
        byte[][] var3;
        if (class47.field623 && arg0) {
            var2 = 1;
            var3 = class264.field3838;
        } else {
            var3 = class48.field649;
            var2 = 4;
        }
        if (arg1 != 13371) {
            method1978(80);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class323.method2235(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class305.field4460[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x39FF11B) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0x3FFF) >> 3;
                            int var11 = (var7 & 0xFFD503) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class305.field4457.length; var13++) {
                                if (class305.field4457[var13] == var12 && var3[var13] != null) {
                                    class343.method2385(var4, var5 * 8, class231.field3312, var3[var13], var9, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var8, arg0, 1, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 163)
    public static void method1974(byte arg0) {
        int var1 = -104 / ((arg0 - 64) / 58);
        field4157 = null;
        field4163 = null;
        field4173 = null;
        field4177 = null;
        field4162 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V", line = 181)
    public static final void method1975(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -30073) {
            method1975(102, 57, 60, -123);
        }
        field4170++;
        class20 var4 = class237.method1689(arg0, arg1, arg3, 933634440);
        if (var4 == null) {
            return;
        }
        class359.field5615 = new int[var4.field230];
        class340.field5311 = new String[var4.field228];
        if (var4.field218 == 15 || var4.field218 == 17 || var4.field218 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class23.field260 != null) {
                var5 = class23.field260.field5188;
                var6 = class23.field260.field5045;
            }
            class359.field5615[1] = class80.field1028 - var6;
            class359.field5615[0] = class105.field1361 - var5;
        }
        class196.method1415(200000, 1006199388, var4);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lfh;I)V", line = 217)
    public static final void method1976(class140 arg0, int arg1) {
        field4167++;
        class255.field3724 = arg0.method1079(false, "runes");
        if (arg1 != 0) {
            method1978(-96);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lfm;BLfm;ZI)Lwb;", line = 234)
    private final class236 method1977(class179 arg0, byte arg1, class179 arg2, boolean arg3, int arg4) {
        field4171++;
        if (this.field4165 == null) {
            throw new RuntimeException();
        }
        this.field4165.field4351 = arg4 * 8 + 5;
        if (this.field4165.field4350.length <= this.field4165.field4351) {
            throw new RuntimeException();
        } else if (this.field4169[arg4] == null) {
            int var6 = this.field4165.method2062(-25795);
            int var7 = this.field4165.method2062(arg1 ^ 0x6488);
            if (arg1 != -75) {
                method1976((class140) null, 48);
            }
            class236 var8 = new class236(arg4, arg2, arg0, this.field4164, this.field4160, var6, var7, arg3);
            this.field4169[arg4] = var8;
            return var8;
        } else {
            return this.field4169[arg4];
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lfg;", line = 278)
    public static final class352 method1978(int arg0) {
        field4159++;
        if (class38.field457 == null) {
            return null;
        }
        if (arg0 != 2048) {
            method1976((class140) null, 18);
        }
        for (class352 var1 = (class352) class271.field3887.method1123(20389); var1 != null; var1 = (class352) class271.field3887.method1123(20389)) {
            class287 var2 = class282.method1924(true, var1.field5493);
            if (var2 != null && var2.field4149 && var2.method1968(arg0 ^ 0xFFFFF7FF)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lfm;Lfm;IB)Lwb;", line = 312)
    public final class236 method1979(class179 arg0, class179 arg1, int arg2, byte arg3) {
        if (arg3 > -15) {
            return (class236) null;
        } else {
            field4161++;
            return this.method1977(arg0, (byte) -75, arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Len;Lja;)V", line = 321)
    public class288(class3 arg0, class112 arg1) {
        this.field4164 = arg0;
        this.field4160 = arg1;
        if (!this.field4164.method12(0)) {
            this.field4166 = this.field4164.method17((byte) 0, 255, true, -24559, 255);
        }
    }
}
