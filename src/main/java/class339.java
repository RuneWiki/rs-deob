import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class339 {

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    private int field5422;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[Lnh;")
    private class128[] field5426;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[J")
    public static long[] field5414 = new long[200];

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
    public static boolean field5419 = false;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lul;")
    public static class51 field5418 = new class51(64);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "J")
    private long field5415;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lnh;")
    private class128 field5423;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lcg;")
    public static class49 field5417;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2388(int arg0) {
        if (arg0 == 256) {
            field5414 = null;
            field5417 = null;
            field5418 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZJ)Lnh;", line = 17)
    public final class128 method2389(boolean arg0, long arg1) {
        field5416++;
        this.field5415 = arg1;
        class128 var4 = this.field5426[(int) ((long) (this.field5422 - 1) & arg1)];
        for (this.field5423 = var4.field2215; this.field5423 != var4; this.field5423 = this.field5423.field2215) {
            if (this.field5423.field2214 == arg1) {
                class128 var5 = this.field5423;
                this.field5423 = this.field5423.field2215;
                return var5;
            }
        }
        if (arg0) {
            field5425 = -126;
        }
        this.field5423 = null;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 50)
    public static final void method2390(int arg0) {
        int var1 = -116 % ((arg0 + 54) / 58);
        for (int var2 = 0; var2 < class119.field2067; var2++) {
            int var3 = class146.field2641[var2];
            class278 var4 = class320.field5071[var3];
            int var5 = class276.field4398.method2364(-9069);
            if ((var5 & 0x8) != 0) {
                var5 += class276.field4398.method2364(-9069) << 8;
            }
            if ((var5 & 0x80) != 0) {
                var4.field1986 = class276.field4398.method2365(115);
                var4.field1937 = 100;
            }
            if ((var5 & 0x200) != 0) {
                var4.field1992 = class276.field4398.method2350(false);
                var4.field2017 = class276.field4398.method2339((byte) -46);
            }
            if ((var5 & 0x100) != 0) {
                int var6 = class276.field4398.method2355(18113);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = class276.field4398.method2339((byte) -46);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    var9[var10] = var11;
                    var8[var10] = class276.field4398.method2364(-9069);
                    var7[var10] = class276.field4398.method2328((byte) 113);
                }
                class227.method1651(var9, 1, var7, var8, var4);
            }
            if ((var5 & 0x4) != 0) {
                int var12 = class276.field4398.method2328((byte) 121);
                int var13 = class276.field4398.method2355(18113);
                if (var12 == 65535) {
                    var12 = -1;
                }
                class124.method1041(var4, 1, var13, var12);
            }
            if ((var5 & 0x10) != 0) {
                int var14 = class276.field4398.method2364(-9069);
                int var15 = class276.field4398.method2363(51);
                var4.method977(var15, var14, class181.field3045, 70);
                var4.field1981 = class181.field3045 + 300;
                var4.field1977 = class276.field4398.method2363(45);
            }
            if ((var5 & 0x2) != 0) {
                int var16 = class276.field4398.method2348(255);
                int var17 = class276.field4398.method2364(-9069);
                var4.method977(var17, var16, class181.field3045, 70);
            }
            if ((var5 & 0x40) != 0) {
                int var18 = class276.field4398.method2328((byte) 117);
                if (var18 == 65535) {
                    var18 = -1;
                }
                boolean var19 = true;
                int var20 = class276.field4398.method2375(4043);
                if (var18 != -1 && var4.field1980 != -1 && class346.method2428(class271.method1851(var18, 0).field2793, (byte) -24).field4517 < class346.method2428(class271.method1851(var4.field1980, 0).field2793, (byte) -24).field4517) {
                    var19 = false;
                }
                if (var19) {
                    var4.field2024 = (var20 & 0xFFFF) + class181.field3045;
                    var4.field1966 = 0;
                    if (class181.field3045 < var4.field2024) {
                        var4.field1966 = -1;
                    }
                    var4.field1997 = var20 >> 16;
                    var4.field1967 = 1;
                    var4.field1980 = var18;
                    var4.field1968 = 0;
                    if (var4.field1980 != -1 && class181.field3045 == var4.field2024) {
                        int var21 = class271.method1851(var4.field1980, 0).field2793;
                        if (var21 != -1) {
                            class285 var22 = class346.method2428(var21, (byte) -24);
                            if (var22 != null && var22.field4531 != null) {
                                class20.method199(false, var4.field1985, var22, var4.field2036, 0, true);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field1941 = class276.field4398.method2362(116);
                if (var4.field1941 == 65535) {
                    var4.field1941 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                if (var4.field4413.method127(0)) {
                    class215.method1588(var4, 16383);
                }
                var4.method1908(class224.method1637(class276.field4398.method2339((byte) -46), (byte) 127), 24717);
                var4.method985(var4.field4413.field202, 6008);
                var4.field1979 = var4.field4413.field178;
                var4.field1962 = var4.field4413.field183;
                if (var4.field4413.method127(0)) {
                    class288.method1962(var4.field1975[0], 18913, var4.field2034[0], 0, (class205) null, class205.field3497, var4, (class97) null);
                }
            }
        }
        field5413++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(JLnh;I)V", line = 243)
    public final void method2391(long arg0, class128 arg1, int arg2) {
        field5421++;
        if (arg2 != -20410) {
            method2393(-88, -36, 59);
        }
        if (arg1.field2213 != null) {
            arg1.method1067(40000);
        }
        class128 var5 = this.field5426[(int) (arg0 & (long) (this.field5422 - 1))];
        arg1.field2214 = arg0;
        arg1.field2213 = var5.field2213;
        arg1.field2215 = var5;
        arg1.field2213.field2215 = arg1;
        arg1.field2215.field2213 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lnh;", line = 271)
    public final class128 method2392(byte arg0) {
        field5420++;
        if (this.field5423 == null) {
            return null;
        }
        class128 var2 = this.field5426[(int) (this.field5415 & (long) (this.field5422 - 1))];
        while (this.field5423 != var2) {
            if (this.field5423.field2214 == this.field5415) {
                class128 var3 = this.field5423;
                this.field5423 = this.field5423.field2215;
                return var3;
            }
            this.field5423 = this.field5423.field2215;
        }
        if (arg0 == -88) {
            this.field5423 = null;
            return null;
        } else {
            return (class128) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Ldl;", line = 314)
    public static final class44 method2393(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class44 var4 = var3.field4152;
            var3.field4152 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V", line = 326)
    public class339(int arg0) {
        this.field5422 = arg0;
        this.field5426 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field5426[var2] = new class128();
            var3.field2213 = var3;
            var3.field2215 = var3;
        }
    }
}
