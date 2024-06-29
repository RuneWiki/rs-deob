import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class234 extends class128 {

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lkd;")
    public class86 field3875;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "[Lwl;")
    public static class100[] field3871 = new class100[14];

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(Z)V", line = 13)
    public static void method1674(boolean arg0) {
        field3871 = null;
        if (!arg0) {
            method1675(-109, -6, (class205) null, 49);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILqe;I)V", line = 29)
    public static final void method1675(int arg0, int arg1, class205 arg2, int arg3) {
        field3882++;
        if ((arg3 & 0x4) != 0) {
            int var4 = class276.field4398.method2314((byte) 93);
            int var5 = class276.field4398.method2355(18113);
            arg2.method977(var5, var4, class181.field3045, 70);
            arg2.field1981 = class181.field3045 + 300;
            arg2.field1977 = class276.field4398.method2355(18113);
        }
        if ((arg3 & 0x10) != 0) {
            int var6 = class276.field4398.method2363(121);
            byte[] var7 = new byte[var6];
            class336 var8 = new class336(var7);
            class276.field4398.method2352(0, var7, (byte) -100, var6);
            class56.field868[arg1] = var8;
            arg2.method1537(var8, 64);
        }
        if ((arg3 & 0x400) != 0) {
            int var9 = class276.field4398.method2314((byte) 94);
            int var10 = class276.field4398.method2348(255);
            arg2.method977(var10, var9, class181.field3045, 70);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1992 = class276.field4398.method2362(94);
            arg2.field2017 = class276.field4398.method2350(false);
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field2032 = class276.field4398.method2355(18113);
            arg2.field1942 = class276.field4398.method2355(18113);
            arg2.field1973 = class276.field4398.method2364(-9069);
            arg2.field1958 = class276.field4398.method2364(-9069);
            arg2.field1972 = class276.field4398.method2328((byte) 118) + class181.field3045;
            arg2.field1950 = class276.field4398.method2339((byte) -46) + class181.field3045;
            arg2.field1971 = class276.field4398.method2364(-9069);
            arg2.field1957 = 1;
            arg2.field2013 = 0;
        }
        if (arg0 <= 106) {
            return;
        }
        if ((arg3 & 0x8) != 0) {
            int var11 = class276.field4398.method2339((byte) -46);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class276.field4398.method2348(255);
            class277.method1905(arg2, 0, var12, var11);
        }
        if ((arg3 & 0x2) != 0) {
            int var13 = class276.field4398.method2339((byte) -46);
            boolean var14 = (var13 & 0x8000) != 0;
            int var15 = class276.field4398.method2363(78);
            int var16 = class276.field4398.method2355(18113);
            int var17 = class276.field4398.field5353;
            if (arg2.field3491 != null && arg2.field3477 != null) {
                long var18 = class142.method1151(arg2.field3491, -95);
                boolean var20 = false;
                if (var15 <= 1) {
                    if (var14 || (!class37.field537 || class331.field5268) && !class330.field5256) {
                        for (int var21 = 0; var21 < class200.field3424; var21++) {
                            if (class20.field305[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    } else {
                        var20 = true;
                    }
                }
                if (!var20 && class134.field2348 == 0) {
                    class313.field4953.field5353 = 0;
                    class276.field4398.method2358(var16, 0, 22365, class313.field4953.field5342);
                    class313.field4953.field5353 = 0;
                    int var22 = -1;
                    String var24;
                    if (var14) {
                        var13 &= 0x7FFF;
                        class94 var23 = class38.method327(0, class313.field4953);
                        var22 = var23.field1475;
                        var24 = var23.field1469.method665(0, class313.field4953);
                    } else {
                        var24 = class323.method2229(class30.method280(class170.method1343(32767, class313.field4953), -23587));
                    }
                    arg2.field1986 = var24.trim();
                    arg2.field1996 = var13 >> 8;
                    arg2.field1930 = var13 & 0xFF;
                    arg2.field1937 = 150;
                    if (var15 == 2) {
                        class263.method1815("<img=1>" + arg2.method1534(-125), var24, true, (String) null, var22, var14 ? 17 : 1);
                    } else if (var15 == 1) {
                        class263.method1815("<img=0>" + arg2.method1534(-103), var24, true, (String) null, var22, var14 ? 17 : 1);
                    } else {
                        class263.method1815(arg2.method1534(-116), var24, true, (String) null, var22, var14 ? 17 : 2);
                    }
                }
            }
            class276.field4398.field5353 = var16 + var17;
        }
        if ((arg3 & 0x200) != 0) {
            int var25 = class276.field4398.method2355(18113);
            int[] var26 = new int[var25];
            int[] var27 = new int[var25];
            int[] var28 = new int[var25];
            for (int var29 = 0; var29 < var25; var29++) {
                int var30 = class276.field4398.method2362(109);
                if (var30 == 65535) {
                    var30 = -1;
                }
                var26[var29] = var30;
                var27[var29] = class276.field4398.method2364(-9069);
                var28[var29] = class276.field4398.method2350(false);
            }
            class11.method109(var28, var27, (byte) 87, var26, arg2);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1941 = class276.field4398.method2350(false);
            if (arg2.field1941 == 65535) {
                arg2.field1941 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1986 = class276.field4398.method2365(126);
            if (arg2.field1986.charAt(0) == '~') {
                arg2.field1986 = arg2.field1986.substring(1);
                class170.method1339(2, arg2.field1986, arg2.method1534(-84), (byte) -98);
            } else if (class218.field3632 == arg2) {
                class170.method1339(2, arg2.field1986, arg2.method1534(-126), (byte) -98);
            }
            arg2.field1937 = 150;
            arg2.field1996 = 0;
            arg2.field1930 = 0;
        }
        if ((arg3 & 0x100) == 0) {
            return;
        }
        int var31 = class276.field4398.method2362(119);
        boolean var32 = true;
        if (var31 == 65535) {
            var31 = -1;
        }
        int var33 = class276.field4398.method2340(2);
        if (var31 != -1 && arg2.field1980 != -1 && class346.method2428(class271.method1851(var31, 0).field2793, (byte) -24).field4517 < class346.method2428(class271.method1851(arg2.field1980, 0).field2793, (byte) -24).field4517) {
            var32 = false;
        }
        if (!var32) {
            return;
        }
        arg2.field1997 = var33 >> 16;
        arg2.field1967 = 1;
        arg2.field2024 = (var33 & 0xFFFF) + class181.field3045;
        arg2.field1968 = 0;
        arg2.field1980 = var31;
        arg2.field1966 = 0;
        if (class181.field3045 < arg2.field2024) {
            arg2.field1966 = -1;
        }
        if (arg2.field1980 == -1 || class181.field3045 != arg2.field2024) {
            return;
        }
        int var34 = class271.method1851(arg2.field1980, 0).field2793;
        if (var34 != -1) {
            class285 var35 = class346.method2428(var34, (byte) -24);
            if (var35 != null && var35.field4531 != null) {
                class20.method199(class218.field3632 == arg2, arg2.field1985, var35, arg2.field2036, 0, true);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIII)V", line = 312)
    public final void method1676(int arg0, int arg1, int arg2, int arg3) {
        this.field3876 = arg2;
        this.field3881 = arg3;
        this.field3874 = arg0;
        field3878++;
        if (arg1 <= 67) {
            this.field3880 = 30;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lkd;Lil;)V", line = 323)
    public class234(class86 arg0, class65 arg1) {
        this.field3875 = arg0;
    }
}
