import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class298 extends class362 {

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    private int field4788;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    private int field4786;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "[I")
    public static int[] field4777 = new int[2];

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4781 = "Loaded input handler";

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field4775 = 0;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field4787 = 0;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4789 = " has logged in.";

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V", line = 4)
    public static void method2131(int arg0) {
        if (arg0 == -15353) {
            field4781 = null;
            field4789 = null;
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method2132(boolean arg0) {
        if (arg0) {
            class129.field2184 = class51.field799;
            class101.field1656 = class27.field332;
            class329.field5237 = class90.field1545;
        } else {
            class129.field2184 = class159.field2532;
            class101.field1656 = class208.field3270;
            class329.field5237 = class307.field4899;
        }
        class56.field942 = class129.field2184.length;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)V", line = 39)
    public final void method643(int arg0, boolean arg1, int arg2) {
        field4790++;
        if (!arg1) {
            this.field4791 = 120;
        }
        int var4 = this.field4788 * arg0 >> 12;
        int var5 = this.field4791 * arg0 >> 12;
        int var6 = this.field4782 * arg2 >> 12;
        int var7 = this.field4786 * arg2 >> 12;
        class326.method2292(var7, this.field5738, var4, var5, var6, -1);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIBILo;II)Lo;", line = 59)
    public static final class96 method2133(int arg0, int arg1, byte arg2, int arg3, class96 arg4, int arg5, int arg6) {
        field4776++;
        long var7 = (long) arg3;
        class96 var9 = (class96) class292.field4729.method2329((byte) 107, var7);
        if (var9 == null) {
            class114 var10 = class114.method887(class22.field251, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method880(64, 768, -50, -10, -50);
            class292.field4729.method2333(var7, 0, var9);
        }
        int var11 = arg4.method540();
        int var12 = arg4.method547();
        int var13 = arg4.method542();
        int var14 = arg4.method520();
        class96 var15 = var9.method532(true, true, true);
        if (arg6 != 0) {
            var15.method544(arg6);
        }
        if (class42.field607) {
            class337 var18 = (class337) var15;
            if (arg5 != class271.method2034(-1, arg0 + var13, arg1 + var11, class186.field2991) || class271.method2034(-1, arg0 + var14, arg1 + var12, class186.field2991) != arg5) {
                for (int var19 = 0; var19 < var18.field5325; var19++) {
                    var18.field5365[var19] += class271.method2034(-1, var18.field5332[var19] + arg0, var18.field5344[var19] - -arg1, class186.field2991) - arg5;
                }
                var18.field5362.field4288 = false;
                var18.field5330.field4634 = false;
            }
        } else {
            class62 var16 = (class62) var15;
            if (arg5 != class271.method2034(-1, arg0 + var13, arg1 + var11, class186.field2991) || class271.method2034(-1, arg0 + var14, arg1 - -var12, class186.field2991) != arg5) {
                for (int var17 = 0; var17 < var16.field1040; var17++) {
                    var16.field1042[var17] += class271.method2034(-1, var16.field1062[var17] + arg0, var16.field1044[var17] - -arg1, class186.field2991) - arg5;
                }
                var16.field1037 = false;
            }
        }
        if (arg2 <= 108) {
            field4781 = (String) null;
        }
        return var15;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIII)V", line = 145)
    public class298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4788 = arg0;
        this.field4786 = arg1;
        this.field4791 = arg2;
        this.field4782 = arg3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V", line = 157)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4783++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        if (arg1 != 50) {
            field4789 = (String) null;
        }
        int var8 = -1;
        int var9 = class315.method2235(class355.field5640, arg2 + arg3, class74.field1269, 114);
        int var10 = class315.method2235(class355.field5640, arg3 - arg2, class74.field1269, arg1 ^ 0x4F);
        class161.method1253(var9, class353.field5599[arg4], arg1 ^ 0xFFFFFFCD, arg0, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class296.field4758 <= var12 && class273.field4522 >= var11) {
                    int var13 = class315.method2235(class355.field5640, arg3 + var5, class74.field1269, arg1 ^ 0x48);
                    int var14 = class315.method2235(class355.field5640, arg3 - var5, class74.field1269, 127);
                    if (var12 <= class273.field4522) {
                        class161.method1253(var13, class353.field5599[var12], arg1 - 51, arg0, var14);
                    }
                    if (class296.field4758 <= var11) {
                        class161.method1253(var13, class353.field5599[var11], -1, arg0, var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class296.field4758 && var15 <= class273.field4522) {
                int var17 = class315.method2235(class355.field5640, arg3 + var6, class74.field1269, 127);
                int var18 = class315.method2235(class355.field5640, arg3 - var6, class74.field1269, 124);
                if (class273.field4522 >= var16) {
                    class161.method1253(var17, class353.field5599[var16], -1, arg0, var18);
                }
                if (var15 >= class296.field4758) {
                    class161.method1253(var17, class353.field5599[var15], -1, arg0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 243)
    public static final void method2135(int arg0) {
        field4778++;
        if (class4.field42 == 0 || class4.field42 == 5) {
            return;
        }
        try {
            if (++class13.field146 > 2000) {
                if (class342.field5449 != null) {
                    class342.field5449.method916((byte) 83);
                    class342.field5449 = null;
                }
                if (class143.field2332 >= 1) {
                    class46.field736 = -5;
                    class4.field42 = 0;
                    return;
                }
                class143.field2332++;
                class13.field146 = 0;
                class4.field42 = 1;
                if (class254.field4280 == class223.field3697) {
                    class223.field3697 = class76.field1324;
                } else {
                    class223.field3697 = class254.field4280;
                }
            }
            if (class4.field42 == 1) {
                class206.field3258 = class128.field2163.method1124(class194.field3096, 122, class223.field3697);
                class4.field42 = 2;
            }
            if (class4.field42 == 2) {
                if (class206.field3258.field3064 == 2) {
                    throw new IOException();
                }
                if (class206.field3258.field3064 != 1) {
                    return;
                }
                class342.field5449 = new class117((Socket) class206.field3258.field3066, class128.field2163);
                class206.field3258 = null;
                long var1 = class323.field5151 = class134.method1024(-25963, class253.field4276);
                class36.field520.field3760 = 0;
                class36.field520.method1712(14, -112);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class36.field520.method1712(var3, -103);
                class342.field5449.method924(0, class36.field520.field3793, 2, 84);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 123);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 122);
                }
                int var4 = class342.field5449.method918(0);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 125);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 125);
                }
                if (var4 != 0) {
                    class4.field42 = 0;
                    class46.field736 = var4;
                    class342.field5449.method916((byte) 108);
                    class342.field5449 = null;
                    return;
                }
                class4.field42 = 3;
            }
            if (class4.field42 == 3) {
                if (class342.field5449.method926(0) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class342.field5449.method919(class29.field383.field3793, 0, 8, true);
                class29.field383.field3760 = 0;
                class87.field1485 = class29.field383.method1734((byte) -97);
                var5[3] = (int) class87.field1485;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class87.field1485 >> 32);
                class36.field520.field3760 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class36.field520.method1712(10, -98);
                class36.field520.method1757(var5[0], -126);
                class36.field520.method1757(var5[1], -100);
                class36.field520.method1757(var5[2], -124);
                class36.field520.method1757(var5[3], -105);
                class36.field520.method1714(0, class134.method1024(-25963, class253.field4276));
                class36.field520.method1709(class133.field2239, (byte) -69);
                class36.field520.method1752(class3.field19, class128.field2165, 0);
                class90.field1514.field3760 = 0;
                if (class259.field4362 == 40) {
                    class90.field1514.method1712(18, -103);
                } else {
                    class90.field1514.method1712(16, -92);
                }
                class90.field1514.method1729(class36.field520.field3760 + class163.method1261(1, class14.field155) + 163, 206);
                class90.field1514.method1757(551, -118);
                class90.field1514.method1712(class323.field5153, -127);
                class90.field1514.method1712(class125.field2133 ? 1 : 0, -56);
                class90.field1514.method1712(1, -87);
                class90.field1514.method1712(class275.method2052((byte) -115), -125);
                class90.field1514.method1729(field4779, 206);
                class90.field1514.method1729(class252.field4266, 206);
                class90.field1514.method1712(class267.field4482, -111);
                class206.method1570(class90.field1514, 1);
                class90.field1514.method1709(class14.field155, (byte) 96);
                class90.field1514.method1757(class240.field3973, -114);
                class90.field1514.method1757(class251.method1947(-298939596), -118);
                class302.field4861 = true;
                class90.field1514.method1729(class215.field3442, 206);
                class90.field1514.method1757(class70.field1217.method478(false), -126);
                class90.field1514.method1757(class327.field5203.method478(false), -126);
                class90.field1514.method1757(class222.field3677.method478(false), -121);
                class90.field1514.method1757(class45.field703.method478(false), -119);
                class90.field1514.method1757(class220.field3557.method478(false), -106);
                class90.field1514.method1757(class340.field5425.method478(false), -115);
                class90.field1514.method1757(class355.field5641.method478(false), -127);
                class90.field1514.method1757(class22.field251.method478(false), -125);
                class90.field1514.method1757(class76.field1305.method478(false), -112);
                class90.field1514.method1757(class3.field17.method478(false), -118);
                class90.field1514.method1757(class156.field2474.method478(false), -105);
                class90.field1514.method1757(class84.field1429.method478(false), -120);
                class90.field1514.method1757(class131.field2224.method478(false), -123);
                class90.field1514.method1757(class44.field694.method478(false), -102);
                class90.field1514.method1757(class274.field4538.method478(false), -117);
                class90.field1514.method1757(class2.field9.method478(false), -121);
                class90.field1514.method1757(class300.field4840.method478(false), -114);
                class90.field1514.method1757(class223.field3696.method478(false), -119);
                class90.field1514.method1757(class90.field1546.method478(false), -100);
                class90.field1514.method1757(class279.field4598.method478(false), -128);
                class90.field1514.method1757(class222.field3670.method478(false), -99);
                class90.field1514.method1757(class36.field522.method478(false), -111);
                class90.field1514.method1757(class235.field3901.method478(false), -113);
                class90.field1514.method1757(class241.field3992.method478(false), -120);
                class90.field1514.method1757(class112.field1828.method478(false), -127);
                class90.field1514.method1757(class360.field5704.method478(false), -113);
                class90.field1514.method1757(class330.field5255.method478(false), -99);
                class90.field1514.method1757(class248.field4050.method478(false), -113);
                class90.field1514.method1757(class273.field4528.method478(false), -116);
                class90.field1514.method1722(-2097152, class36.field520.field3760, 0, class36.field520.field3793);
                class342.field5449.method924(0, class90.field1514.field3793, class90.field1514.field3760, 103);
                class36.field520.method2234(var5, -103);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class29.field383.method2234(var5, -37);
                class4.field42 = 4;
            }
            if (class4.field42 == 4) {
                if (class342.field5449.method926(0) < 1) {
                    return;
                }
                int var7 = class342.field5449.method918(0);
                if (var7 == 21) {
                    class4.field42 = 7;
                } else if (var7 == 29) {
                    class4.field42 = 10;
                } else if (var7 == 1) {
                    class4.field42 = 5;
                    class46.field736 = var7;
                    return;
                } else if (var7 == 2) {
                    class4.field42 = 8;
                } else if (var7 == 15) {
                    class46.field736 = var7;
                    class4.field42 = 0;
                    return;
                } else if (var7 == 23 && class143.field2332 < 1) {
                    class4.field42 = 1;
                    class143.field2332++;
                    class13.field146 = 0;
                    class342.field5449.method916((byte) 112);
                    class342.field5449 = null;
                    return;
                } else {
                    class4.field42 = 0;
                    class46.field736 = var7;
                    class342.field5449.method916((byte) 81);
                    class342.field5449 = null;
                    return;
                }
            }
            if (class4.field42 == 6) {
                class36.field520.field3760 = 0;
                class36.field520.method2228(17, 16547);
                class342.field5449.method924(0, class36.field520.field3793, class36.field520.field3760, 123);
                class4.field42 = 4;
                return;
            }
            if (class4.field42 == 7) {
                if (class342.field5449.method926(0) >= 1) {
                    class23.field281 = class342.field5449.method918(0) * 60 + 180;
                    class46.field736 = 21;
                    class4.field42 = 0;
                    class342.field5449.method916((byte) 117);
                    class342.field5449 = null;
                    return;
                }
                return;
            }
            if (arg0 >= -24) {
                return;
            }
            if (class4.field42 == 10) {
                if (class342.field5449.method926(0) >= 1) {
                    class253.field4270 = class342.field5449.method918(0);
                    class46.field736 = 29;
                    class4.field42 = 0;
                    class342.field5449.method916((byte) 95);
                    class342.field5449 = null;
                    return;
                }
                return;
            }
            if (class4.field42 == 8) {
                if (class342.field5449.method926(0) < 14) {
                    return;
                }
                class342.field5449.method919(class29.field383.field3793, 0, 14, true);
                class29.field383.field3760 = 0;
                class162.field2572 = class29.field383.method1720((byte) -31);
                class254.field4287 = class29.field383.method1720((byte) -119);
                class322.field5124 = class29.field383.method1720((byte) -81) == 1;
                class93.field1568 = class29.field383.method1720((byte) -52) == 1;
                class40.field584 = class29.field383.method1720((byte) -104) == 1;
                class314.field4991 = class29.field383.method1720((byte) -37) == 1;
                class170.field2697 = class29.field383.method1720((byte) -61) == 1;
                class261.field4399 = class29.field383.method1765(true);
                class134.field2256 = class29.field383.method1720((byte) -28) == 1;
                class286.field4661 = class29.field383.method1720((byte) -90) == 1;
                class1.method2(class286.field4661, (byte) -127);
                class222.method1652(class286.field4661, (byte) 119);
                class354.method2508(28844, class286.field4661);
                if (!class125.field2133) {
                    if ((!class322.field5124 || class40.field584) && !class134.field2256) {
                        try {
                            class88.method702(class128.field2163.field2350, "unzap", (byte) 72);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class88.method702(class128.field2163.field2350, "zap", (byte) 127);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class88.method702(class128.field2163.field2350, "loggedin", (byte) 111);
                } catch (Throwable var12) {
                }
                class220.field3497 = class29.field383.method2237(255);
                class223.field3706 = class29.field383.method1765(true);
                class4.field42 = 9;
            }
            if (class4.field42 == 9) {
                if (class342.field5449.method926(0) >= class223.field3706) {
                    class29.field383.field3760 = 0;
                    class342.field5449.method919(class29.field383.field3793, 0, class223.field3706, true);
                    class4.field42 = 0;
                    class46.field736 = 2;
                    class54.method427(0);
                    class316.field5050 = -1;
                    class296.method2125((byte) -105, false);
                    class220.field3497 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class342.field5449 != null) {
                class342.field5449.method916((byte) 100);
                class342.field5449 = null;
            }
            if (class143.field2332 >= 1) {
                class4.field42 = 0;
                class46.field736 = -4;
            } else {
                class13.field146 = 0;
                class4.field42 = 1;
                class143.field2332++;
                if (class254.field4280 == class223.field3697) {
                    class223.field3697 = class76.field1324;
                } else {
                    class223.field3697 = class254.field4280;
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZII)V", line = 627)
    public final void method644(boolean arg0, int arg1, int arg2) {
        field4785++;
        int var4 = this.field4788 * arg2 >> 12;
        int var5 = this.field4786 * arg1 >> 12;
        int var6 = this.field4791 * arg2 >> 12;
        int var7 = this.field4782 * arg1 >> 12;
        if (arg0) {
            class2.method5(var6, var4, var7, this.field5737, var5, 117, this.field5744);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V", line = 653)
    public final void method642(byte arg0, int arg1, int arg2) {
        field4784++;
        int var4 = this.field4788 * arg2 >> 12;
        int var5 = this.field4791 * arg2 >> 12;
        if (arg0 < 12) {
            field4789 = (String) null;
        }
        int var6 = this.field4786 * arg1 >> 12;
        int var7 = this.field4782 * arg1 >> 12;
        class20.method122(this.field5737, (byte) 127, this.field5738, var6, var4, var5, var7, this.field5744);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([ILfc;Z[I[I)V", line = 671)
    public static final void method2136(int[] arg0, class288 arg1, boolean arg2, int[] arg3, int[] arg4) {
        field4780++;
        if (!arg2) {
            field4787 = 63;
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field3539.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field3539[var9] = null;
                    } else {
                        class43 var10 = class198.method1524(var6, -66);
                        int var11 = var10.field668;
                        class194 var12 = arg1.field3539[var9];
                        if (var12 != null) {
                            if (var12.field3092 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field3539[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3089 = 0;
                                    var12.field3087 = 1;
                                    var12.field3090 = var8;
                                    var12.field3088 = 0;
                                    var12.field3091 = 0;
                                    class334.method2338(false, arg1.field3577, arg1.field3511, 0, (byte) -13, var10);
                                } else if (var11 == 2) {
                                    var12.field3088 = 0;
                                }
                            } else if (var10.field660 >= class198.method1524(var12.field3092, 122).field660) {
                                var12 = arg1.field3539[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class194 var13 = arg1.field3539[var9] = new class194();
                            var13.field3092 = var6;
                            var13.field3087 = 1;
                            var13.field3089 = 0;
                            var13.field3091 = 0;
                            var13.field3090 = var8;
                            var13.field3088 = 0;
                            class334.method2338(false, arg1.field3577, arg1.field3511, 0, (byte) -13, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }
}
