import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class250 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field3203 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field3204 = -1;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field3214 = -1;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public int field3215 = 64;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
    public boolean field3207 = true;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public int field3217 = 127;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Z")
    public boolean field3205 = true;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
    public boolean field3219 = false;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field3213 = 512;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public int field3202 = 1190717;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field3208 = -1;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field3225 = 8;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Loh;")
    public static class368 field3212 = new class368();

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[C")
    public static char[] field3227 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lpr;")
    public static class407 field3226 = new class407(94, 6);

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Lgl;")
    public static class547 field3229 = new class547(5, 16);

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lvv;")
    public class293 field3218;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Liaa;I)V", line = 7)
    public final void method1433(class452 arg0, int arg1) {
        field3216++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2541(arg1 ^ 0x6F);
            if (var3 == 0) {
                return;
            }
            this.method1438(var3, (byte) 117, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I", line = 32)
    public static final int method1434(int arg0, int arg1, int arg2, int arg3) {
        field3222++;
        int var4 = 255 - arg0;
        int var5 = ((arg3 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg3 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        if (arg2 != 12686) {
            method1434(-36, -103, 57, 43);
        }
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lap;I)V", line = 47)
    public static final void method1435(class435 arg0, int arg1) {
        field3221++;
        if (class380.field4936 == null) {
            class430 var2 = new class430();
            byte[] var3 = var2.method2305(true, 128, 128, 16);
            class380.field4936 = class356.method1967(var3, 14, false);
        }
        if (class264.field3333 == null) {
            class511 var4 = new class511();
            byte[] var5 = var4.method2928(16, 0, 128, 128);
            class264.field3333 = class356.method1967(var5, arg1 - 125, false);
        }
        class445 var6 = arg0.field5929;
        if (var6.method2460((byte) -92) && class211.field2559 == null) {
            byte[] var7 = class477.method2792(new class655(419684), 4.0F, 4.0F, (byte) -77, 8, 0.5F, 128, 128, 0.6F, 16, 16.0F);
            class211.field2559 = class356.method1967(var7, -118, false);
        }
        if (arg1 != 16) {
            method1436(-126);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 91)
    public static final void method1436(int arg0) {
        class567.method3207((byte) -69, class464.field6446);
        field3210++;
        class185.field2249++;
        if (class457.field6383 && class492.field7142) {
            int var1 = class407.field5419.method162(-26561);
            int var2 = class407.field5419.method161(31285);
            int var3 = var1 - class422.field5614;
            int var4 = var2 - class453.field6279;
            if (var3 < class485.field7063) {
                var3 = class485.field7063;
            }
            if (class168.field2013 > var4) {
                var4 = class168.field2013;
            }
            if (class485.field7063 + class66.field694.field5035 < class464.field6446.field5035 + var3) {
                var3 = class485.field7063 + class66.field694.field5035 - class464.field6446.field5035;
            }
            if ((class168.field2013 + class66.field694.field4958) < (class464.field6446.field4958 + var4)) {
                var4 = class168.field2013 + class66.field694.field4958 - class464.field6446.field4958;
            }
            int var5 = var3 + class66.field694.field5008 - class485.field7063;
            int var6 = -73 / ((-arg0 - 10) / 35);
            int var7 = var4 + class66.field694.field5051 - class168.field2013;
            if (class407.field5419.method155(true)) {
                if (class464.field6446.field5122 < class185.field2249) {
                    int var9 = var3 - class11.field107;
                    int var10 = var4 - class225.field2881;
                    if (class464.field6446.field5039 < var9 || var9 < -class464.field6446.field5039 || class464.field6446.field5039 < var10 || var10 < -class464.field6446.field5039) {
                        class682.field9687 = true;
                    }
                }
                if (class464.field6446.field5093 != null && class682.field9687) {
                    class676 var11 = new class676();
                    var11.field9580 = class464.field6446.field5093;
                    var11.field9585 = class464.field6446;
                    var11.field9586 = var7;
                    var11.field9579 = var5;
                    class364.method1998(var11);
                }
            } else {
                if (class682.field9687) {
                    class420.method2278(5580);
                    if (class464.field6446.field4993 != null) {
                        class676 var8 = new class676();
                        var8.field9578 = class332.field4291;
                        var8.field9586 = var7;
                        var8.field9580 = class464.field6446.field4993;
                        var8.field9579 = var5;
                        var8.field9585 = class464.field6446;
                        class364.method1998(var8);
                    }
                    if (class332.field4291 != null && client.method1525(class464.field6446) != null) {
                        class267.method1508(37, class332.field4291, class464.field6446);
                    }
                } else if ((class438.field6096 == 1 || class546.method3093(6)) && class145.field1625 > 2) {
                    class67.method438(class453.field6279 + class225.field2881, false, class422.field5614 + class11.field107);
                } else if (class527.method2997((byte) -73)) {
                    class67.method438(class453.field6279 + class225.field2881, false, class422.field5614 + class11.field107);
                }
                class464.field6446 = null;
            }
        } else if (class185.field2249 > 1) {
            class464.field6446 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 207)
    public final void method1437(boolean arg0) {
        if (!arg0) {
            method1441((byte) -35);
        }
        this.field3225 = this.field3211 | this.field3225 << 8;
        if (this.field3214 == -1) {
            this.field3214 = this.field3208;
        }
        field3224++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLiaa;)V", line = 221)
    private final void method1438(int arg0, byte arg1, class452 arg2) {
        field3223++;
        if (arg1 <= 75) {
            method1441((byte) 69);
        }
        if (arg0 == 1) {
            this.field3203 = class418.method2264(arg2.method2524(3), false);
        } else if (arg0 == 2) {
            this.field3208 = arg2.method2541(61);
            return;
        } else if (arg0 == 3) {
            this.field3208 = arg2.method2574(-1758460248);
            if (this.field3208 == 65535) {
                this.field3208 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field3205 = false;
            return;
        } else if (arg0 == 7) {
            this.field3204 = class418.method2264(arg2.method2524(3), false);
            return;
        } else if (arg0 == 8) {
            this.field3218.field3855 = this.field3211;
            return;
        } else if (arg0 == 9) {
            this.field3213 = arg2.method2574(-1758460248) << 2;
            return;
        } else if (arg0 == 10) {
            this.field3207 = false;
            return;
        } else if (arg0 == 11) {
            this.field3225 = arg2.method2541(38);
            return;
        } else if (arg0 == 12) {
            this.field3219 = true;
            return;
        } else {
            if (arg0 == 13) {
                this.field3202 = arg2.method2524(3);
            } else if (arg0 == 14) {
                this.field3215 = arg2.method2541(79) << 2;
                return;
            } else if (arg0 == 15) {
                this.field3214 = arg2.method2574(-1758460248);
                if (this.field3214 == 65535) {
                    this.field3214 = -1;
                    return;
                }
                return;
            } else if (arg0 == 16) {
                this.field3217 = arg2.method2541(61);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIZIIII)V", line = 303)
    public static final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field3220++;
        if (arg3 < 512 || arg4 < 512 || arg3 > ((class399.field5338 - 2) * 512) || (class349.field4567 - 2) * 512 < arg4) {
            class377.field4913[0] = class377.field4913[1] = -1;
            return;
        }
        int var10 = class363.method1995(arg2, arg4, -1327568407, arg3) - arg6;
        class139.field1593.method235(arg8, 0, 0);
        class453.field6284.method311(class139.field1593);
        class453.field6284.method331(arg3, var10, arg4, class377.field4913);
        class139.field1593.method235(-arg8, 0, 0);
        class453.field6284.method311(class139.field1593);
        if (!arg5) {
            method1439(-96, 35, -68, -2, 42, false, -24, 63, 48, 43);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 338)
    public static void method1440(boolean arg0) {
        field3226 = null;
        field3229 = null;
        field3227 = null;
        if (arg0) {
            field3229 = null;
        }
        field3212 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 385)
    public static final void method1441(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class561.field7978[var1] = null;
        }
        if (arg0 != 87) {
            field3226 = null;
        }
        field3209++;
        class382.field5127 = 0;
    }
}
