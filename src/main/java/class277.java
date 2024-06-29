import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class277 {

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    private int field4906 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field4886;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lje;")
    public class61[] field4890;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lng;")
    public static class139 field4894 = new class139(64);

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static volatile int field4905 = -1;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "J")
    private long field4902;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lje;")
    private class61 field4900;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lje;")
    private class61 field4904;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Lje;")
    public final class61 method1818(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field4898++;
            this.field4906 = 0;
            return this.method1834((byte) 26);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lje;")
    public final class61 method1819(int arg0) {
        field4891++;
        if (this.field4900 == null) {
            return null;
        }
        if (arg0 >= -19) {
            method1831((byte) 98, 0);
        }
        class61 var2 = this.field4890[(int) ((long) (this.field4886 - 1) & this.field4902)];
        while (this.field4900 != var2) {
            if (this.field4900.field1162 == this.field4902) {
                class61 var3 = this.field4900;
                this.field4900 = this.field4900.field1164;
                return var3;
            }
            this.field4900 = this.field4900.field1164;
        }
        this.field4900 = null;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIB)V")
    public static final void method1820(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4887++;
        if (arg4 < 117) {
            field4905 = 125;
        }
        class260.method1738(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class260.method1726(arg0, arg1, arg2, arg3, 0);
        if (class154.field2779 < 100) {
            return;
        }
        if (class231.field4230 == null || class231.field4230.field4201 != arg2 || class231.field4230.field4208 != arg3) {
            class160 var5 = new class160(arg2, arg3);
            class260.method1733(var5.field2894, arg2, arg3);
            class247.method1636(class169.field3009, class25.field426, 0, arg3, 0, 0, (byte) -84, 0, arg2);
            class231.field4230 = var5;
            class35.field608.method923((byte) -120);
        }
        class231.field4230.method1043(arg0, arg1);
        int var6 = class189.field3424 * arg2 / class169.field3009 + arg0;
        int var7 = arg1 + (class115.field2023 * arg3 / class25.field426);
        int var8 = class52.field1020 * arg2 / class169.field3009;
        int var9 = class227.field4100 * arg3 / class25.field426;
        class260.method1728(var6, var7, var8, var9, 16711680, 128);
        class260.method1729(var6, var7, var8, var9, 16711680);
        if (class173.field3112 <= 0 || class173.field3112 % 10 >= 5) {
            return;
        }
        for (class59 var10 = (class59) class176.field3166.method1294(false); var10 != null; var10 = (class59) class176.field3166.method1292((byte) 97)) {
            if (class66.field1261 == var10.field1133) {
                int var11 = var10.field1132 * arg2 / class169.field3009 + arg0;
                int var12 = var10.field1136 * arg3 / class25.field426 + arg1;
                class260.method1726(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1821(int arg0) {
        if (arg0 == -3) {
            field4894 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public static final void method1822(int arg0, int arg1) {
        if (arg1 == 0) {
            class166 var2 = class262.method1746(arg1 - 82, arg0, 8);
            var2.method1098((byte) -111);
            field4903++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
    public final int method1823(byte arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4886; var3++) {
            class61 var4 = this.field4890[var3];
            for (class61 var5 = var4.field1164; var5 != var4; var5 = var5.field1164) {
                var2++;
            }
        }
        if (arg0 <= 96) {
            field4894 = null;
        }
        field4895++;
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(JI)Lje;")
    public final class61 method1824(long arg0, int arg1) {
        field4901++;
        if (arg1 != 0) {
            this.field4900 = null;
        }
        this.field4902 = arg0;
        class61 var4 = this.field4890[(int) (arg0 & (long) (this.field4886 - 1))];
        for (this.field4900 = var4.field1164; this.field4900 != var4; this.field4900 = this.field4900.field1164) {
            if (this.field4900.field1162 == arg0) {
                class61 var5 = this.field4900;
                this.field4900 = this.field4900.field1164;
                return var5;
            }
        }
        this.field4900 = null;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lje;BJ)V")
    public final void method1825(class61 arg0, byte arg1, long arg2) {
        if (arg0.field1158 != null) {
            arg0.method349(0);
        }
        field4889++;
        class61 var5 = this.field4890[(int) ((long) (this.field4886 - 1) & arg2)];
        arg0.field1164 = var5;
        arg0.field1158 = var5.field1158;
        arg0.field1162 = arg2;
        arg0.field1158.field1164 = arg0;
        if (arg1 != 64) {
            method1830(-41, -87, true, -15L);
        }
        arg0.field1164.field1158 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public final void method1826(byte arg0) {
        field4893++;
        if (arg0 != 61) {
            field4894 = null;
        }
        for (int var2 = 0; var2 < this.field4886; var2++) {
            class61 var3 = this.field4890[var2];
            while (true) {
                class61 var4 = var3.field1164;
                if (var3 == var4) {
                    break;
                }
                var4.method349(arg0 ^ 0x3D);
            }
        }
        this.field4904 = null;
        this.field4900 = null;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static final void method1827(int arg0) {
        if (arg0 >= -62) {
            method1820(14, 52, 2, 41, (byte) -85);
        }
        field4899++;
        for (class124 var1 = (class124) class57.field1103.method1294(false); var1 != null; var1 = (class124) class57.field1103.method1292((byte) 51)) {
            if (var1.field2167) {
                var1.method749(105);
            }
        }
        for (class124 var2 = (class124) class285.field5001.method1294(false); var2 != null; var2 = (class124) class285.field5001.method1292((byte) 94)) {
            if (var2.field2167) {
                var2.method749(95);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class36.field621 = arg1;
        class56.field1091 = arg2;
        class208.field3824 = arg3;
        class190.field3491 = new class120[arg0][class36.field621][class56.field1091];
        class273.field4861 = new int[arg0][class36.field621 + 1][class56.field1091 + 1];
        if (arg4) {
            class42.field710 = new class120[1][class36.field621][class56.field1091];
            class185.field3365 = new int[class36.field621][class56.field1091];
            class83.field1503 = new int[1][class36.field621 + 1][class56.field1091 + 1];
        } else {
            class42.field710 = null;
            class185.field3365 = null;
            class83.field1503 = null;
        }
        class169.method1111(false);
        class164.field2944 = new class223[500];
        class136.field2392 = 0;
        class18.field319 = new class223[500];
        class90.field1630 = 0;
        class188.field3410 = new int[arg0][class36.field621 + 1][class56.field1091 + 1];
        class229.field4190 = new class211[5000];
        class182.field3248 = 0;
        class9.field181 = new class211[100];
        class168.field3007 = new boolean[class208.field3824 + class208.field3824 + 1][class208.field3824 + class208.field3824 + 1];
        class79.field1443 = new boolean[class208.field3824 + class208.field3824 + 2][class208.field3824 + class208.field3824 + 2];
        class76.field1406 = new byte[arg0][class36.field621][class56.field1091];
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBLdl;)V")
    public static final void method1829(int arg0, int arg1, byte arg2, class32 arg3) {
        field4896++;
        if ((arg1 & 0x40) != 0) {
            int var4 = class161.field2902.method1250((byte) 113);
            byte[] var5 = new byte[var4];
            class190 var6 = new class190(var5);
            class161.field2902.method1251(29328, var5, 0, var4);
            class157.field2830[arg0] = var6;
            arg3.method220(128, var6);
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field4119 = class161.field2902.method1259(arg2 + 6332);
            int var7 = class161.field2902.method1266(115);
            arg3.field4132 = class146.field2635 + (var7 & 0xFFFF);
            arg3.field4175 = 0;
            if (arg3.field4119 == 65535) {
                arg3.field4119 = -1;
            }
            arg3.field4107 = 0;
            if (class146.field2635 < arg3.field4132) {
                arg3.field4107 = -1;
            }
            arg3.field4152 = var7 >> 16;
            if (arg3.field4119 != -1 && class146.field2635 == arg3.field4132) {
                int var8 = class122.method742(arg2 ^ 0xFFFFFF88, arg3.field4119).field3090;
                if (var8 != -1) {
                    class104 var9 = class164.method1081(var8, -21331);
                    if (var9 != null && var9.field1829 != null) {
                        class274.method1805(var9, 0, arg3.field4108, arg3.field4178, class229.field4195 == arg3, (byte) -66);
                    }
                }
            }
        }
        if ((arg1 & 0x200) != 0) {
            int var10 = class161.field2902.method1257((byte) 72);
            int var11 = class161.field2902.method1260((byte) 122);
            arg3.method1560(class146.field2635, var11, var10, 0);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field4158 = class161.field2902.method1261(2);
            arg3.field4162 = class161.field2902.method1261(2);
        }
        if ((arg1 & 0x1) != 0) {
            int var12 = class161.field2902.method1261(2);
            int var13 = class161.field2902.method1236(25215);
            int var14 = class161.field2902.method1236(25215);
            int var15 = class161.field2902.field3487;
            boolean var16 = (var12 & 0x8000) != 0;
            if (arg3.field518 != null && arg3.field516 != null) {
                boolean var17 = false;
                long var18 = arg3.field518.method874(7);
                if (var13 <= 1) {
                    if (var16 || (!class106.field1875 || class71.field1346) && !class267.field4789) {
                        for (int var20 = 0; var20 < class184.field3338; var20++) {
                            if (class255.field4585[var20] == var18) {
                                var17 = true;
                                break;
                            }
                        }
                    } else {
                        var17 = true;
                    }
                }
                if (!var17 && class126.field2240 == 0) {
                    class184.field3346.field3487 = 0;
                    class161.field2902.method1251(29328, class184.field3346.field3465, 0, var14);
                    int var21 = -1;
                    class184.field3346.field3487 = 0;
                    class143 var22;
                    if (var16) {
                        var12 &= 0x7FFF;
                        class26 var23 = class209.method1457(true, class184.field3346);
                        var21 = var23.field430;
                        var22 = var23.field442.method1399(-125, class184.field3346);
                    } else {
                        var22 = class193.method1310(class179.method1176((byte) 127, class184.field3346).method899((byte) 46));
                    }
                    arg3.field4117 = var22.method890(16277);
                    arg3.field4163 = var12 & 0xFF;
                    arg3.field4106 = var12 >> 8;
                    arg3.field4174 = 150;
                    if (var13 == 2) {
                        class173.method1135(var21, 3, var16 ? 17 : 1, (class143) null, class25.method179(0, new class143[] { class171.field3062, arg3.method212((byte) 47) }), var22);
                    } else if (var13 == 1) {
                        class173.method1135(var21, 3, var16 ? 17 : 1, (class143) null, class25.method179(0, new class143[] { class195.field3620, arg3.method212((byte) 47) }), var22);
                    } else {
                        class173.method1135(var21, 3, var16 ? 17 : 2, (class143) null, arg3.method212((byte) 47), var22);
                    }
                }
            }
            class161.field2902.field3487 = var14 + var15;
        }
        if (arg2 != 53) {
            field4905 = -4;
        }
        if ((arg1 & 0x80) != 0) {
            arg3.field4182 = class161.field2902.method1261(2);
            if (arg3.field4182 == 65535) {
                arg3.field4182 = -1;
            }
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field4180 = class161.field2902.method1236(arg2 ^ 0x624A);
            arg3.field4167 = class161.field2902.method1265(arg2 ^ 0x4E);
            arg3.field4179 = class161.field2902.method1250((byte) 101);
            arg3.field4120 = class161.field2902.method1260((byte) 99);
            arg3.field4139 = class161.field2902.method1235(-29530) + class146.field2635;
            arg3.field4128 = class161.field2902.method1235(-29530) + class146.field2635;
            arg3.field4118 = class161.field2902.method1260((byte) 40);
            arg3.field4145 = 1;
            arg3.field4138 = 0;
        }
        if ((arg1 & 0x8) != 0) {
            int var24 = class161.field2902.method1257((byte) 92);
            int var25 = class161.field2902.method1236(25215);
            arg3.method1560(class146.field2635, var25, var24, 0);
            arg3.field4116 = class146.field2635 + 300;
            arg3.field4143 = class161.field2902.method1260((byte) 15);
        }
        if ((arg1 & 0x20) != 0) {
            int var26 = class161.field2902.method1235(-29530);
            int var27 = class161.field2902.method1260((byte) 14);
            if (var26 == 65535) {
                var26 = -1;
            }
            class176.method1160((byte) -111, var26, arg3, var27);
        }
        if ((arg1 & 0x10) == 0) {
            return;
        }
        arg3.field4117 = class161.field2902.method1270((byte) -112);
        if (arg3.field4117.method897(255, 0) == 126) {
            arg3.field4117 = arg3.field4117.method863(1, -161);
            class170.method1119(arg3.method212((byte) 47), 4096, arg3.field4117, 2);
        } else if (class229.field4195 == arg3) {
            class170.method1119(arg3.method212((byte) 47), 4096, arg3.field4117, 2);
        }
        arg3.field4106 = 0;
        arg3.field4163 = 0;
        arg3.field4174 = 150;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZJ)Llc;")
    public static final class143 method1830(int arg0, int arg1, boolean arg2, long arg3) {
        field4908++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var5 = 1;
        long var6 = arg3 / (long) arg1;
        while (var6 != 0L) {
            var6 /= (long) arg1;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg3 % (long) arg1);
            arg3 /= (long) arg1;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class143 var11 = new class143();
        if (arg0 != 19447) {
            method1831((byte) -54, 45);
        }
        var11.field2503 = var9;
        var11.field2548 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    public static final void method1831(byte arg0, int arg1) {
        field4888++;
        if (!class47.method289((byte) -124, arg1) || arg0 < 48) {
            return;
        }
        class43[] var2 = class223.field4045[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class43 var4 = var2[var3];
            if (var4 != null) {
                var4.field780 = 0;
                var4.field884 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIILfi;I)V")
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4, class228 arg5, int arg6) {
        class214.method1485(-2101, arg3, arg2, arg5.field4178, arg5.field4108, arg6, arg4, arg1);
        if (arg0 == 1) {
            field4892++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)I")
    public final int method1833(byte arg0) {
        if (arg0 <= 21) {
            this.field4890 = null;
        }
        field4897++;
        return this.field4886;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
    public class277(int arg0) {
        this.field4886 = arg0;
        this.field4890 = new class61[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class61 var3 = this.field4890[var2] = new class61();
            var3.field1158 = var3;
            var3.field1164 = var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Lje;")
    public final class61 method1834(byte arg0) {
        field4907++;
        if (this.field4906 > 0 && this.field4890[this.field4906 - 1] != this.field4904) {
            class61 var2 = this.field4904;
            this.field4904 = var2.field1164;
            return var2;
        }
        while (this.field4886 > this.field4906) {
            class61 var4 = this.field4890[this.field4906++].field1164;
            if (this.field4890[this.field4906 - 1] != var4) {
                this.field4904 = var4.field1164;
                return var4;
            }
        }
        int var3 = -121 / ((69 - arg0) / 37);
        return null;
    }
}
