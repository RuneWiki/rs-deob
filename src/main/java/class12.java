import java.io.IOException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class12 {

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lmg;")
    private class116 field117 = new class116();

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lmg;")
    private class116 field121 = new class116();

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lmg;")
    private class116 field122 = new class116();

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lmg;")
    private class116 field124 = new class116();

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lqm;")
    private class227 field127 = new class227(4);

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public volatile int field131 = 0;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public volatile int field133 = 0;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "B")
    private byte field132 = 0;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lqm;")
    private class227 field130 = new class227(8);

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[Z")
    public static boolean[] field115 = new boolean[100];

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
    public static int[] field119 = new int[25];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "J")
    private long field129;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lln;")
    private class117 field126;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Lol;")
    private class198 field134;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 6)
    public final void method54(int arg0) {
        if (arg0 == 0) {
            field118++;
            if (this.field126 != null) {
                this.field126.method920((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z", line = 24)
    public final boolean method55(int arg0) {
        field120++;
        if (this.field126 != null) {
            long var2 = class47.method371(-93);
            int var4 = (int) (var2 - this.field129);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field128 += var4;
            this.field129 = var2;
            if (this.field128 > 30000) {
                try {
                    this.field126.method916((byte) 90);
                } catch (Exception var31) {
                }
                this.field126 = null;
            }
        }
        if (this.field126 == null) {
            return this.method67((byte) 0) == 0 && this.method65(123) == 0;
        }
        try {
            this.field126.method917((byte) -106);
            int var6 = 16 % ((arg0 + 61) / 63);
            for (class198 var7 = (class198) this.field117.method912(false); var7 != null; var7 = (class198) this.field117.method909(-114)) {
                this.field127.field3760 = 0;
                this.field127.method1712(1, -69);
                this.field127.method1727(-12323, (int) var7.field2754);
                this.field126.method924(0, this.field127.field3793, 4, 77);
                this.field121.method911(500, var7);
            }
            for (class198 var8 = (class198) this.field122.method912(false); var8 != null; var8 = (class198) this.field122.method909(-114)) {
                this.field127.field3760 = 0;
                this.field127.method1712(0, -74);
                this.field127.method1727(-12323, (int) var8.field2754);
                this.field126.method924(0, this.field127.field3793, 4, 82);
                this.field124.method911(500, var8);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field126.method926(0);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field128 = 0;
                byte var11 = 0;
                if (this.field134 == null) {
                    var11 = 8;
                } else if (this.field134.field3158 == 0) {
                    var11 = 1;
                }
                if (var11 <= 0) {
                    int var12 = this.field134.field3153.field3793.length - this.field134.field3163;
                    int var13 = 512 - this.field134.field3158;
                    if (var12 - this.field134.field3153.field3760 < var13) {
                        var13 = var12 - this.field134.field3153.field3760;
                    }
                    if (var10 < var13) {
                        var13 = var10;
                    }
                    this.field126.method919(this.field134.field3153.field3793, this.field134.field3153.field3760, var13, true);
                    if (this.field132 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field134.field3153.field3793[this.field134.field3153.field3760 + var14] = (byte) class141.method1087(this.field134.field3153.field3793[this.field134.field3153.field3760 + var14], this.field132);
                        }
                    }
                    this.field134.field3158 += var13;
                    this.field134.field3153.field3760 += var13;
                    if (this.field134.field3153.field3760 == var12) {
                        this.field134.method1352(-27);
                        this.field134.field1434 = false;
                        this.field134 = null;
                    } else if (this.field134.field3158 == 512) {
                        this.field134.field3158 = 0;
                    }
                } else {
                    int var15 = var11 - this.field130.field3760;
                    if (var10 < var15) {
                        var15 = var10;
                    }
                    this.field126.method919(this.field130.field3793, this.field130.field3760, var15, true);
                    if (this.field132 != 0) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            this.field130.field3793[this.field130.field3760 + var16] = (byte) class141.method1087(this.field130.field3793[this.field130.field3760 + var16], this.field132);
                        }
                    }
                    this.field130.field3760 += var15;
                    if (var11 <= this.field130.field3760) {
                        if (this.field134 == null) {
                            this.field130.field3760 = 0;
                            int var17 = this.field130.method1720((byte) -57);
                            int var18 = this.field130.method1765(true);
                            int var19 = this.field130.method1720((byte) -31);
                            int var20 = var19 & 0x7F;
                            boolean var21 = (var19 & 0x80) != 0;
                            int var22 = this.field130.method1715((byte) 32);
                            long var23 = (long) ((var17 << 16) + var18);
                            Object var25 = null;
                            class198 var26;
                            if (var21) {
                                for (var26 = (class198) this.field124.method912(false); var26 != null && var26.field2754 != var23; var26 = (class198) this.field124.method909(-109)) {
                                }
                            } else {
                                for (var26 = (class198) this.field121.method912(false); var26 != null && var26.field2754 != var23; var26 = (class198) this.field121.method909(-124)) {
                                }
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            int var27 = var20 == 0 ? 5 : 9;
                            this.field134 = var26;
                            this.field134.field3153 = new class227(var22 + var27 + this.field134.field3163);
                            this.field134.field3153.method1712(var20, -68);
                            this.field134.field3153.method1757(var22, -111);
                            this.field134.field3158 = 8;
                            this.field130.field3760 = 0;
                        } else if (this.field134.field3158 != 0) {
                            throw new IOException();
                        } else if (this.field130.field3793[0] == -1) {
                            this.field130.field3760 = 0;
                            this.field134.field3158 = 1;
                        } else {
                            this.field134 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var32) {
            try {
                this.field126.method916((byte) 78);
            } catch (Exception var30) {
            }
            this.field131++;
            this.field126 = null;
            this.field133 = -2;
            return this.method67((byte) 0) == 0 && this.method65(110) == 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZB)V", line = 301)
    public final void method56(boolean arg0, byte arg1) {
        if (arg1 != -85) {
            method61(60);
        }
        field107++;
        if (this.field126 == null) {
            return;
        }
        try {
            this.field127.field3760 = 0;
            this.field127.method1712(arg0 ? 2 : 3, -110);
            this.field127.method1727(-12323, 0);
            this.field126.method924(0, this.field127.field3793, 4, 85);
        } catch (IOException var6) {
            try {
                this.field126.method916((byte) 79);
            } catch (Exception var5) {
            }
            this.field133 = -2;
            this.field126 = null;
            this.field131++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lln;IZ)V", line = 328)
    public final void method57(class117 arg0, int arg1, boolean arg2) {
        field125++;
        if (this.field126 != null) {
            try {
                this.field126.method916((byte) 102);
            } catch (Exception var11) {
            }
            this.field126 = null;
        }
        this.field126 = arg0;
        this.method58(0);
        if (arg1 != 4) {
            field115 = (boolean[]) null;
        }
        this.method56(arg2, (byte) -85);
        this.field134 = null;
        this.field130.field3760 = 0;
        while (true) {
            class198 var5 = (class198) this.field121.method914(arg1 - 20221);
            if (var5 == null) {
                while (true) {
                    class198 var6 = (class198) this.field124.method914(-20217);
                    if (var6 == null) {
                        if (this.field132 != 0) {
                            try {
                                this.field127.field3760 = 0;
                                this.field127.method1712(4, -69);
                                this.field127.method1712(this.field132, -72);
                                this.field127.method1729(0, 206);
                                this.field126.method924(0, this.field127.field3793, 4, 85);
                            } catch (IOException var10) {
                                try {
                                    this.field126.method916((byte) 94);
                                } catch (Exception var9) {
                                }
                                this.field131++;
                                this.field126 = null;
                                this.field133 = -2;
                            }
                        }
                        this.field128 = 0;
                        this.field129 = class47.method371(92);
                        return;
                    }
                    this.field122.method911(500, var6);
                }
            }
            this.field117.method911(500, var5);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 401)
    private final void method58(int arg0) {
        field111++;
        if (this.field126 == null) {
            return;
        }
        try {
            this.field127.field3760 = arg0;
            this.field127.method1712(6, -104);
            this.field127.method1727(-12323, 3);
            this.field126.method924(0, this.field127.field3793, 4, 63);
        } catch (IOException var5) {
            try {
                this.field126.method916((byte) 103);
            } catch (Exception var4) {
            }
            this.field131++;
            this.field126 = null;
            this.field133 = -2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Z", line = 427)
    public final boolean method59(int arg0) {
        field114++;
        if (arg0 != 0) {
            this.method56(true, (byte) -70);
        }
        return this.method65(121) >= 20;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 440)
    public static final void method60(int arg0) {
        if (class65.field1152 != null) {
            class65.field1152.method1512((byte) 78);
        }
        field109++;
        if (class260.field4374 != null) {
            class260.field4374.method1512((byte) 97);
        }
        class165.method1285(2, 22050, class248.field4052, 114);
        class65.field1152 = class340.method2388(0, class128.field2163, 22050, (byte) -87, class151.field2402);
        class65.field1152.method1515(class79.field1364, 48);
        class260.field4374 = class340.method2388(1, class128.field2163, 2048, (byte) -87, class151.field2402);
        class260.field4374.method1515(class245.field4030, 84);
        if (arg0 != -9820) {
            method64((class36) null, false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V", line = 462)
    public static void method61(int arg0) {
        field119 = null;
        field115 = null;
        if (arg0 != 6) {
            method61(-3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V", line = 473)
    public final void method62(int arg0) {
        field106++;
        if (this.field126 == null) {
            return;
        }
        try {
            this.field127.field3760 = 0;
            if (arg0 != 8086) {
                this.method67((byte) -40);
            }
            this.field127.method1712(7, arg0 ^ 0xFFFFE026);
            this.field127.method1727(arg0 ^ 0xFFFFD04B, 0);
            this.field126.method924(0, this.field127.field3793, 4, 115);
        } catch (IOException var5) {
            try {
                this.field126.method916((byte) 78);
            } catch (Exception var4) {
            }
            this.field131++;
            this.field133 = -2;
            this.field126 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)Z", line = 501)
    public final boolean method63(int arg0) {
        if (arg0 != 20844) {
            field119 = (int[]) null;
        }
        field116++;
        return this.method67((byte) 0) >= 20;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Laa;Z)V", line = 514)
    public static final void method64(class36 arg0, boolean arg1) {
        class354.field5628.method2302((byte) -33, arg0);
        while (true) {
            class36 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class36[][] var7;
            class36 var120;
            do {
                class36 var119;
                do {
                    class36 var118;
                    do {
                        class36 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class36) class354.field5628.method2307((byte) 127);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field549);
                                            var3 = var2.field525;
                                            var4 = var2.field553;
                                            var5 = var2.field536;
                                            var6 = var2.field541;
                                            var7 = class129.field2184[var5];
                                            var8 = 0.0F;
                                            if (class42.field607) {
                                                if (class27.field332 == class101.field1656) {
                                                    int var9 = class128.field2168[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class31.field443 != var10) {
                                                        class31.field443 = var10;
                                                        class148.method1150(var10, 28946);
                                                        class167.method1296(class329.method2320((byte) 122));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class190.field3044 != var11) {
                                                        class190.field3044 = var11;
                                                        class92.method727(var11, 4);
                                                    }
                                                    int var12 = class208.field3270[0][var3 + 1][var4] + class208.field3270[0][var3][var4] + class208.field3270[0][var3][var4 + 1] + class208.field3270[0][var3 + 1][var4 + 1] >> 2;
                                                    class310.method2203(-var12, 3, 77);
                                                    var8 = 201.5F;
                                                    class42.method298(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class42.method298(var8);
                                                }
                                            }
                                            if (!var2.field543) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class36 var13 = class129.field2184[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field549) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class245.field4011 && var3 > class184.field2971) {
                                                    class36 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field549 && (var14.field543 || (var2.field552 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class245.field4011 && var3 < class83.field1414 - 1) {
                                                    class36 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field549 && (var15.field543 || (var2.field552 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class125.field2138 && var4 > class159.field2533) {
                                                    class36 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field549 && (var16.field543 || (var2.field552 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class125.field2138 && var4 < class117.field1980 - 1) {
                                                    class36 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field549 && (var17.field543 || (var2.field552 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field543 = false;
                                            if (var2.field546 != null) {
                                                class36 var18 = var2.field546;
                                                if (class42.field607) {
                                                    class42.method298(201.5F - (float) (var18.field541 + 1) * 50.0F);
                                                }
                                                if (var18.field529 == null) {
                                                    if (var18.field530 != null) {
                                                        if (class273.method2044(0, var3, var4)) {
                                                            class7.method26(var18.field530, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, true);
                                                        } else {
                                                            class7.method26(var18.field530, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class273.method2044(0, var3, var4)) {
                                                    class179.method1409(var18.field529, 0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, true);
                                                } else {
                                                    class179.method1409(var18.field529, 0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, false);
                                                }
                                                class338 var19 = var18.field533;
                                                if (var19 != null) {
                                                    if (class42.field607) {
                                                        if ((var19.field5395 & var2.field534) == 0) {
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                        } else {
                                                            class30.method203(var19.field5395, class291.field4713, class66.field1175, class36.field550, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field5392.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var19.field5394 - class291.field4713, var19.field5396 - class66.field1175, var19.field5391 - class36.field550, var19.field5397, var5, (class158) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field531; var20++) {
                                                    class209 var21 = var18.field544[var20];
                                                    if (var21 != null) {
                                                        if (class42.field607) {
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                        }
                                                        var21.field3287.method440(var21.field3295, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var21.field3288 - class291.field4713, var21.field3286 - class66.field1175, var21.field3290 - class36.field550, var21.field3279, var5, (class158) null);
                                                    }
                                                }
                                                if (class42.field607) {
                                                    class42.method298(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field529 == null) {
                                                if (var2.field530 != null) {
                                                    if (class273.method2044(var6, var3, var4)) {
                                                        class7.method26(var2.field530, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class7.method26(var2.field530, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, false);
                                                    }
                                                }
                                            } else if (class273.method2044(var6, var3, var4)) {
                                                class179.method1409(var2.field529, var6, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field529.field3852 != 12345678 || class253.field4274 && var5 <= class141.field2309) {
                                                    class179.method1409(var2.field529, var6, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class184 var23 = var2.field537;
                                                if (var23 != null && (var23.field2972 & 0x80000000L) != 0L) {
                                                    if (class42.field607 && var23.field2965) {
                                                        class42.method298(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    var23.field2968.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var23.field2960 - class291.field4713, var23.field2963 - class66.field1175, var23.field2966 - class36.field550, var23.field2972, var5, (class158) null);
                                                    if (class42.field607 && var23.field2965) {
                                                        class42.method298(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class338 var26 = var2.field533;
                                            class339 var27 = var2.field526;
                                            if (var26 != null || var27 != null) {
                                                if (class245.field4011 == var3) {
                                                    var24++;
                                                } else if (class245.field4011 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class125.field2138 == var4) {
                                                    var24 += 3;
                                                } else if (class125.field2138 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class204.field3229[var24];
                                                var2.field534 = class232.field3853[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field5395 & class168.field2673[var24]) == 0) {
                                                    var2.field542 = 0;
                                                } else if (var26.field5395 == 16) {
                                                    var2.field542 = 3;
                                                    var2.field540 = class301.field4850[var24];
                                                    var2.field524 = 3 - var2.field540;
                                                } else if (var26.field5395 == 32) {
                                                    var2.field542 = 6;
                                                    var2.field540 = class292.field4727[var24];
                                                    var2.field524 = 6 - var2.field540;
                                                } else if (var26.field5395 == 64) {
                                                    var2.field542 = 12;
                                                    var2.field540 = class105.field1714[var24];
                                                    var2.field524 = 12 - var2.field540;
                                                } else {
                                                    var2.field542 = 9;
                                                    var2.field540 = class164.field2603[var24];
                                                    var2.field524 = 9 - var2.field540;
                                                }
                                                if ((var26.field5395 & var25) != 0 && !class78.method645(var6, var3, var4, var26.field5395)) {
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    var26.field5392.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var26.field5394 - class291.field4713, var26.field5396 - class66.field1175, var26.field5391 - class36.field550, var26.field5397, var5, (class158) null);
                                                }
                                                if ((var26.field5386 & var25) != 0 && !class78.method645(var6, var3, var4, var26.field5386)) {
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    var26.field5390.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var26.field5394 - class291.field4713, var26.field5396 - class66.field1175, var26.field5391 - class36.field550, var26.field5397, var5, (class158) null);
                                                }
                                            }
                                            if (var27 != null && !class35.method242(var6, var3, var4, var27.field5400.method444())) {
                                                if (class42.field607) {
                                                    class42.method298(var8 - 0.5F);
                                                }
                                                if ((var27.field5415 & var25) != 0) {
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    var27.field5400.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var27.field5404 + var27.field5398 - class291.field4713, var27.field5399 - class66.field1175, var27.field5401 + var27.field5405 - class36.field550, var27.field5406, var5, (class158) null);
                                                } else if (var27.field5415 == 256) {
                                                    int var28 = var27.field5404 - class291.field4713;
                                                    int var29 = var27.field5399 - class66.field1175;
                                                    int var30 = var27.field5401 - class36.field550;
                                                    int var31 = var27.field5403;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class42.field607) {
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                        }
                                                        var27.field5400.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var27.field5398 + var28, var29, var27.field5405 + var30, var27.field5406, var5, (class158) null);
                                                    } else if (var27.field5410 != null) {
                                                        if (class42.field607) {
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                        }
                                                        var27.field5410.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var28, var29, var30, var27.field5406, var5, (class158) null);
                                                    }
                                                }
                                                if (class42.field607) {
                                                    class42.method298(var8);
                                                }
                                            }
                                            if (var22) {
                                                class184 var34 = var2.field537;
                                                if (var34 != null && (var34.field2972 & 0x80000000L) == 0L) {
                                                    if (class42.field607 && var34.field2965) {
                                                        class42.method298(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    var34.field2968.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var34.field2960 - class291.field4713, var34.field2963 - class66.field1175, var34.field2966 - class36.field550, var34.field2972, var5, (class158) null);
                                                    if (class42.field607 && var34.field2965) {
                                                        class42.method298(var8);
                                                    }
                                                }
                                                class87 var35 = var2.field538;
                                                if (var35 != null && var35.field1489 == 0) {
                                                    if (class42.field607) {
                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                    }
                                                    if (var35.field1488 != null) {
                                                        var35.field1488.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var35.field1493 - class291.field4713, var35.field1486 - class66.field1175, var35.field1491 - class36.field550, var35.field1496, var5, (class158) null);
                                                    }
                                                    if (var35.field1494 != null) {
                                                        var35.field1494.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var35.field1493 - class291.field4713, var35.field1486 - class66.field1175, var35.field1491 - class36.field550, var35.field1496, var5, (class158) null);
                                                    }
                                                    if (var35.field1483 != null) {
                                                        var35.field1483.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var35.field1493 - class291.field4713, var35.field1486 - class66.field1175, var35.field1491 - class36.field550, var35.field1496, var5, (class158) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field552;
                                            if (var36 != 0) {
                                                if (var3 < class245.field4011 && (var36 & 0x4) != 0) {
                                                    class36 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field549) {
                                                        class354.field5628.method2302((byte) -52, var37);
                                                    }
                                                }
                                                if (var4 < class125.field2138 && (var36 & 0x2) != 0) {
                                                    class36 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field549) {
                                                        class354.field5628.method2302((byte) -123, var38);
                                                    }
                                                }
                                                if (var3 > class245.field4011 && (var36 & 0x1) != 0) {
                                                    class36 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field549) {
                                                        class354.field5628.method2302((byte) -114, var39);
                                                    }
                                                }
                                                if (var4 > class125.field2138 && (var36 & 0x8) != 0) {
                                                    class36 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field549) {
                                                        class354.field5628.method2302((byte) -124, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field542 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field531; var42++) {
                                                if (class151.field2404 != var2.field544[var42].field3292 && (var2.field523[var42] & var2.field542) == var2.field540) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class338 var43 = var2.field533;
                                                if (!class78.method645(var6, var3, var4, var43.field5395)) {
                                                    if (class42.field607) {
                                                        label1037: {
                                                            if ((var43.field5397 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field5394 - class291.field4713;
                                                                int var45 = var43.field5391 - class36.field550;
                                                                int var46 = (int) (var43.field5397 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class162.field2574 - 1) {
                                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class273.field4526 - 1 && var4 < class162.field2574 - 1) {
                                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class273.field4526 - 1 && var4 > 0) {
                                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field5392.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var43.field5394 - class291.field4713, var43.field5396 - class66.field1175, var43.field5391 - class36.field550, var43.field5397, var5, (class158) null);
                                                }
                                                var2.field542 = 0;
                                            }
                                        }
                                        if (!var2.field532) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field531;
                                            var2.field532 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class209 var50 = var2.field544[var49];
                                                if (class151.field2404 != var50.field3292) {
                                                    for (int var51 = var50.field3283; var51 <= var50.field3289; var51++) {
                                                        for (int var52 = var50.field3291; var52 <= var50.field3280; var52++) {
                                                            class36 var53 = var7[var51][var52];
                                                            if (var53.field543) {
                                                                var2.field532 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field542 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3283) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3289) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3291) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3280) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field542) == var2.field524) {
                                                                    var2.field532 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class270.field4501[var48++] = var50;
                                                    int var55 = class245.field4011 - var50.field3283;
                                                    int var56 = var50.field3289 - class245.field4011;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class125.field2138 - var50.field3291;
                                                    int var58 = var50.field3280 - class125.field2138;
                                                    if (var58 > var57) {
                                                        var50.field3285 = var55 + var58;
                                                    } else {
                                                        var50.field3285 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class209 var62 = class270.field4501[var61];
                                                    if (class151.field2404 != var62.field3292) {
                                                        if (var62.field3285 > var59) {
                                                            var59 = var62.field3285;
                                                            var60 = var61;
                                                        } else if (var62.field3285 == var59) {
                                                            int var63 = var62.field3288 - class291.field4713;
                                                            int var64 = var62.field3290 - class36.field550;
                                                            int var65 = class270.field4501[var60].field3288 - class291.field4713;
                                                            int var66 = class270.field4501[var60].field3290 - class36.field550;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class209 var67 = class270.field4501[var60];
                                                var67.field3292 = class151.field2404;
                                                if (!class347.method2433(var6, var67.field3283, var67.field3289, var67.field3291, var67.field3280, var67.field3287.method444())) {
                                                    if (class42.field607) {
                                                        if ((var67.field3279 & 0xFC000L) == 147456L) {
                                                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                                                            int var68 = var67.field3288 - class291.field4713;
                                                            int var69 = var67.field3290 - class36.field550;
                                                            int var70 = (int) (var67.field3279 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class30.method207(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class30.method207(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class30.method207(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class30.method207(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class30.method198(class291.field4713, class66.field1175, class36.field550, var5, var67.field3283, var67.field3291, var67.field3289, var67.field3280);
                                                        }
                                                    }
                                                    var67.field3287.method440(var67.field3295, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var67.field3288 - class291.field4713, var67.field3286 - class66.field1175, var67.field3290 - class36.field550, var67.field3279, var5, (class158) null);
                                                }
                                                for (int var71 = var67.field3283; var71 <= var67.field3289; var71++) {
                                                    for (int var72 = var67.field3291; var72 <= var67.field3280; var72++) {
                                                        class36 var73 = var7[var71][var72];
                                                        if (var73.field542 != 0) {
                                                            class354.field5628.method2302((byte) -38, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field549) {
                                                            class354.field5628.method2302((byte) -110, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field532) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field532 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field547 != null) {
                                        if (class42.field607) {
                                            GL var75 = class42.field627;
                                            class42.method298(var8);
                                            class158.method1236(class291.field4713, class66.field1175, class36.field550);
                                            int var76 = var2.field525 * 128 + 64 - class291.field4713;
                                            int var77 = class101.field1656[var5][var2.field525][var2.field553] - class66.field1175;
                                            int var78 = var2.field553 * 128 + 64 - class36.field550;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class101.field1656[var5][var2.field525][var2.field553] - class101.field1656[var5 + 1][var2.field525][var2.field553];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class281.field4613 * var78 - class279.field4597 * var76 >> 16;
                                            int var81 = class75.field1284 * var80 + class130.field2196 * var77 >> 16;
                                            int var82 = (class75.field1284 * 91 + class130.field2196 * 0 >> 16) + var81;
                                            int var83 = (class75.field1284 * -91 - class130.field2196 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class262 var85 = null;
                                            class76 var86 = null;
                                            int var87 = -1;
                                            class262 var88 = (class262) var2.field547.method1467(0);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field4413 == null || var88.field4413.field1309.field2485) {
                                                            var88.method120(126);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field4413.field1309.field2480 & 0xFFL)) != var2.field527) {
                                                            var2.field547 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field4413;
                                                            var87 = var86.field1288.field3303;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field4413 != var86 || var88.field4413.field1288.field3303 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class158.field2517[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class158.field2521[var90] = 0;
                                                        }
                                                        class158.field2526 = 0;
                                                        for (class262 var91 = var85; var91 != var88; var91 = (class262) var91.field807) {
                                                            if (var91.field4413 != null) {
                                                                int var92 = (var91.field4409 >> 12) - class291.field4713;
                                                                int var93 = (var91.field4411 >> 12) - class66.field1175;
                                                                int var94 = (var91.field4414 >> 12) - class36.field550;
                                                                int var95 = class281.field4613 * var94 - class279.field4597 * var92 >> 16;
                                                                int var96 = (class75.field1284 * var95 + class130.field2196 * var93 >> 16) - var83;
                                                                if (class158.field2517[var96] < 32) {
                                                                    class158.field2525[var96][class158.field2517[var96]++] = var91.field4407;
                                                                } else {
                                                                    if (class158.field2517[var96] == 32) {
                                                                        if (class158.field2526 == 32) {
                                                                            if (class158.field2486) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class158.field2517[var96] += class158.field2526++ + 1;
                                                                    }
                                                                    int var97 = class158.field2521[class158.field2517[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class158.field2519[class158.field2517[var96] - 32 - 1];
                                                                        int var10002 = class158.field2517[var96] - 32 - 1;
                                                                        int var10004 = class158.field2521[class158.field2517[var96] - 32 - 1];
                                                                        class158.field2521[var10002] = class158.field2521[class158.field2517[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field4407;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field547.field3000 == var91.field807) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class158.field2491 && var86.field1288.field3322 != -1) {
                                                            class153.field2439.method762(-112, var86.field1288.field3322);
                                                            var98 = true;
                                                        } else {
                                                            class42.method273(-1);
                                                        }
                                                        float var99 = (float) var87 * class158.field2528;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field1309.method1220(var75, var84, var98, var86.field1288.field3326);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field4413;
                                                            var87 = var88.field4413.field1288.field3303;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class262) var2.field547.method1465(0);
                                            }
                                            class158.method1227();
                                        } else {
                                            int var100 = class158.field2501 + class153.field2436;
                                            int var101 = class158.field2492 + class153.field2441;
                                            class51 var102 = var2.field547.field3000;
                                            for (class51 var103 = var102.field807; var103 != var102; var103 = var103.field807) {
                                                class262 var104 = (class262) var103;
                                                if (var104.field4413 != null && !var104.field4413.field1309.field2485) {
                                                    if ((byte) ((int) (var104.field4413.field1309.field2480 & 0xFFL)) != var2.field527) {
                                                        var2.field547 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field4409 >> 12) - class291.field4713;
                                                    int var106 = (var104.field4411 >> 12) - class66.field1175;
                                                    int var107 = (var104.field4414 >> 12) - class36.field550;
                                                    int var108 = class281.field4613 * var105 + class279.field4597 * var107 >> 16;
                                                    int var109 = class281.field4613 * var107 - class279.field4597 * var105 >> 16;
                                                    int var111 = class75.field1284 * var106 - class130.field2196 * var109 >> 16;
                                                    int var112 = class75.field1284 * var109 + class130.field2196 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class246.method1890(var114, var115, (var104.field4413.field1288.field3303 << 16) / var116, var104.field4412, var104.field4412 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field549);
                            } while (var2.field542 != 0);
                            if (var3 > class245.field4011 || var3 <= class184.field2971) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field549);
                        if (var3 < class245.field4011 || var3 >= class83.field1414 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field549);
                    if (var4 > class125.field2138 || var4 <= class159.field2533) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field549);
                if (var4 < class125.field2138 || var4 >= class117.field1980 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field549);
            var2.field549 = false;
            class51.field811--;
            class87 var121 = var2.field538;
            if (var121 != null && var121.field1489 != 0) {
                if (class42.field607) {
                    class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                }
                if (var121.field1488 != null) {
                    var121.field1488.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var121.field1493 - class291.field4713, var121.field1486 - class66.field1175 - var121.field1489, var121.field1491 - class36.field550, var121.field1496, var5, (class158) null);
                }
                if (var121.field1494 != null) {
                    var121.field1494.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var121.field1493 - class291.field4713, var121.field1486 - class66.field1175 - var121.field1489, var121.field1491 - class36.field550, var121.field1496, var5, (class158) null);
                }
                if (var121.field1483 != null) {
                    var121.field1483.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var121.field1493 - class291.field4713, var121.field1486 - class66.field1175 - var121.field1489, var121.field1491 - class36.field550, var121.field1496, var5, (class158) null);
                }
            }
            if (var2.field534 != 0) {
                class339 var122 = var2.field526;
                if (var122 != null && !class35.method242(var6, var3, var4, var122.field5400.method444())) {
                    if ((var122.field5415 & var2.field534) != 0) {
                        if (class42.field607) {
                            class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                        }
                        var122.field5400.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var122.field5404 + var122.field5398 - class291.field4713, var122.field5399 - class66.field1175, var122.field5401 + var122.field5405 - class36.field550, var122.field5406, var5, (class158) null);
                    } else if (var122.field5415 == 256) {
                        int var123 = var122.field5404 - class291.field4713;
                        int var124 = var122.field5399 - class66.field1175;
                        int var125 = var122.field5401 - class36.field550;
                        int var126 = var122.field5403;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class42.field607) {
                                class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                            }
                            var122.field5400.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var122.field5398 + var123, var124, var122.field5405 + var125, var122.field5406, var5, (class158) null);
                        } else if (var122.field5410 != null) {
                            if (class42.field607) {
                                class30.method210(class291.field4713, class66.field1175, class36.field550, var5, var3, var4);
                            }
                            var122.field5410.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var123, var124, var125, var122.field5406, var5, (class158) null);
                        }
                    }
                }
                class338 var129 = var2.field533;
                if (var129 != null) {
                    if ((var129.field5386 & var2.field534) != 0 && !class78.method645(var6, var3, var4, var129.field5386)) {
                        if (class42.field607) {
                            class30.method203(var129.field5386, class291.field4713, class66.field1175, class36.field550, var6, var3, var4);
                        }
                        var129.field5390.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var129.field5394 - class291.field4713, var129.field5396 - class66.field1175, var129.field5391 - class36.field550, var129.field5397, var5, (class158) null);
                    }
                    if ((var129.field5395 & var2.field534) != 0 && !class78.method645(var6, var3, var4, var129.field5395)) {
                        if (class42.field607) {
                            class30.method203(var129.field5395, class291.field4713, class66.field1175, class36.field550, var6, var3, var4);
                        }
                        var129.field5392.method440(0, class130.field2196, class75.field1284, class279.field4597, class281.field4613, var129.field5394 - class291.field4713, var129.field5396 - class66.field1175, var129.field5391 - class36.field550, var129.field5397, var5, (class158) null);
                    }
                }
            }
            if (var5 < class56.field942 - 1) {
                class36 var130 = class129.field2184[var5 + 1][var3][var4];
                if (var130 != null && var130.field549) {
                    class354.field5628.method2302((byte) -28, var130);
                }
            }
            if (var3 < class245.field4011) {
                class36 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field549) {
                    class354.field5628.method2302((byte) -104, var131);
                }
            }
            if (var4 < class125.field2138) {
                class36 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field549) {
                    class354.field5628.method2302((byte) -105, var132);
                }
            }
            if (var3 > class245.field4011) {
                class36 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field549) {
                    class354.field5628.method2302((byte) -116, var133);
                }
            }
            if (var4 > class125.field2138) {
                class36 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field549) {
                    class354.field5628.method2302((byte) -122, var134);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)I", line = 1730)
    private final int method65(int arg0) {
        field112++;
        if (arg0 < 70) {
            this.field128 = 104;
        }
        return this.field122.method910((byte) -75) + this.field124.method910((byte) -49);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZBIIB)Lol;", line = 1741)
    public final class198 method66(boolean arg0, byte arg1, int arg2, int arg3, byte arg4) {
        field123++;
        if (arg1 >= -92) {
            return (class198) null;
        }
        long var6 = (long) ((arg2 << 16) + arg3);
        class198 var8 = new class198();
        var8.field2754 = var6;
        var8.field3163 = arg4;
        var8.field1425 = arg0;
        if (arg0) {
            if (this.method67((byte) 0) >= 20) {
                throw new RuntimeException();
            }
            this.field117.method911(500, var8);
        } else if (this.method65(74) < 20) {
            this.field122.method911(500, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)I", line = 1789)
    public final int method67(byte arg0) {
        if (arg0 != 0) {
            this.method56(true, (byte) -62);
        }
        field110++;
        return this.field117.method910((byte) 91) + this.field121.method910((byte) 104);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 1805)
    public final void method68(byte arg0) {
        if (this.field126 != null) {
            this.field126.method916((byte) 102);
        }
        field108++;
        if (arg0 < 64) {
            this.method58(-51);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 1827)
    public final void method69(boolean arg0) {
        try {
            this.field126.method916((byte) 66);
        } catch (Exception var3) {
        }
        this.field126 = null;
        this.field131++;
        this.field133 = -1;
        this.field132 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (!arg0) {
            method60(-111);
        }
        field113++;
    }
}
