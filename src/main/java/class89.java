import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class89 {

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    private int field1286 = 1;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field1283 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field1277 = 1;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    private int field1298 = 0;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lps;")
    private class63 field1300 = new class63();

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
    private boolean field1307 = true;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Z")
    private boolean field1308 = true;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
    private boolean field1304 = true;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
    private boolean field1305 = true;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Z")
    private boolean field1309 = false;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    private int field1311 = -1;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "[Lwv;")
    private class25[] field1306 = new class25[2];

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lnq;")
    private class325 field1295;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lsk;")
    private class447 field1280;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lsk;")
    private class447 field1294;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lsk;")
    private class447 field1289;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Z")
    public static boolean field1287 = false;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lni;")
    public static class367 field1281 = new class367(59, 8);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lwv;")
    private class25 field1301;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lin;")
    private class60 field1302;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lin;")
    private class60 field1310;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Z")
    private boolean field1296;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 8)
    public final void method596(byte arg0) {
        field1291++;
        if (!this.field1296) {
            return;
        }
        if (this.field1289 != null) {
            int var2 = 16384;
            this.field1295.method2053(this.field1289, 0);
            this.field1295.method2037((byte) 74, this.field1280);
            this.field1289.method2720(0, (byte) -53);
            this.field1280.method2711(-66, 0);
            if (this.field1309) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1277, this.field1286, 0, 0, this.field1277, this.field1286, var2, 9728);
            this.field1295.method2082(111, this.field1289);
            this.field1295.method2039(this.field1280, true);
        }
        this.field1295.method2096(-29861);
        if (arg0 < 8) {
            return;
        }
        this.field1295.method2087(0, 16711935);
        this.field1295.method2045(34023, 1);
        this.field1295.method753();
        int var3 = 0;
        int var4 = 1;
        class533 var6;
        for (class533 var5 = (class533) this.field1300.method445(33); var5 != null; var5 = var6) {
            var6 = (class533) this.field1300.method451(false);
            int var7 = var5.method3157((byte) 89);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2394(120, this.field1306[var3], this.field1301, var8);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field1295.method2055(this.field1280, 103);
                    this.field1295.method2052(-50, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1286);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1298, this.field1283);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1298, this.field1286 + this.field1283);
                    OpenGL.glTexCoord2f((float) this.field1277, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1298 + this.field1277, this.field1286 + this.field1283);
                    OpenGL.glTexCoord2f((float) this.field1277, (float) this.field1286);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1298 + this.field1277, this.field1283);
                    OpenGL.glEnd();
                } else {
                    this.field1280.method2711(-66, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1286);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1286);
                    OpenGL.glTexCoord2f((float) this.field1277, (float) this.field1286);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1277, this.field1286);
                    OpenGL.glTexCoord2f((float) this.field1277, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1277, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method2390(var8, (byte) -114);
            }
        }
        this.field1296 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Z", line = 112)
    public final boolean method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1299++;
        if (this.field1294 == null || this.field1300.method455(true)) {
            return false;
        }
        if (this.field1277 != arg4 || this.field1286 != arg1) {
            this.field1286 = arg1;
            this.field1277 = arg4;
            for (class5 var6 = this.field1300.method445(33); var6 != this.field1300.field906; var6 = var6.field39) {
                ((class533) var6).method2392(this.field1286, this.field1277, 54);
            }
            this.field1308 = true;
            this.field1305 = true;
            this.field1304 = true;
        }
        if (!this.method605(arg2 ^ arg2)) {
            return false;
        }
        this.field1283 = arg0;
        this.field1296 = true;
        this.field1298 = arg3;
        this.field1295.method2071(81, this.field1294);
        this.field1294.method2711(-66, 0);
        this.field1295.method2052(-76, -this.field1298, this.field1286 + (-this.field1294.method2716(arg2 ^ 0xFFFF8CC2) - this.field1283));
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 152)
    public static final void method598(byte arg0) {
        field1279++;
        if (class536.field7870 < 1024.0F) {
            class536.field7870 = 1024.0F;
        }
        if (class536.field7870 > 3072.0F) {
            class536.field7870 = 3072.0F;
        }
        while (class53.field744 >= 16384.0F) {
            class53.field744 -= 16384.0F;
        }
        while (class53.field744 < 0.0F) {
            class53.field744 += 16384.0F;
        }
        int var1 = class366.field5609 >> 7;
        int var2 = class312.field4571 >> 7;
        int var3 = class352.method2264(-93, class367.field5618, class312.field4571, class366.field5609);
        int var4 = 40 % ((-arg0 - 13) / 37);
        int var5 = 0;
        if (var1 > 3 && var2 > 3 && (class398.field6071 - 4) > var1 && var2 < (class528.field7734 - 4)) {
            for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                for (int var7 = var2 - 4; var7 <= (var2 + 4); var7++) {
                    int var8 = class367.field5618;
                    if (var8 < 3 && class28.method249(var6, var7, -87)) {
                        var8++;
                    }
                    int var9 = 0;
                    if (class274.field3811.field3651 != null && class274.field3811.field3651[var8] != null) {
                        var9 = (class274.field3811.field3651[var8][var6][var7] & 0xFF) * 8;
                    }
                    int var10 = var3 - (class306.field4447[var8].method222(var6, var7) - var9);
                    if (var10 > var5) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = (var5 >> 0) * 1536;
        if (var11 > 786432) {
            var11 = 786432;
        }
        if (var11 < 262144) {
            var11 = 262144;
        }
        if (class426.field6481 < var11) {
            class426.field6481 += (var11 - class426.field6481) / 24;
        } else if (var11 < class426.field6481) {
            class426.field6481 += (var11 - class426.field6481) / 80;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 236)
    public final void method599(byte arg0) {
        field1290++;
        this.field1302 = null;
        this.field1306 = null;
        this.field1301 = null;
        this.field1294 = this.field1289 = this.field1280 = null;
        this.field1310 = null;
        if (!this.field1300.method455(true)) {
            for (class5 var2 = this.field1300.method445(33); var2 != this.field1300.field906; var2 = var2.field39) {
                ((class533) var2).method2391(-10748);
            }
        }
        this.field1277 = this.field1286 = 1;
        int var3 = -68 / ((arg0 + 33) / 58);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lqa;B)V", line = 265)
    public static final void method600(class165 arg0, byte arg1) {
        field1278++;
        if (!(class367.field5621 >= 2 || class44.field641) || class466.field6949 != null) {
            return;
        }
        String var2;
        if (class44.field641 && class367.field5621 < 2) {
            var2 = class468.field7001 + client.field2675.method2705((byte) 69, class257.field3556) + class466.field6947 + " ->";
        } else if (class147.field1952 && class35.field515.method1970(true, 81) && class367.field5621 > 2) {
            var2 = class400.method2476((class54) class131.field1769.field906.field36.field36, 32);
        } else {
            class54 var3 = (class54) class131.field1769.field906.field36;
            var2 = class400.method2476(var3, 32);
            int[] var4 = null;
            if (class362.method2307(var3.field764, 22116)) {
                var4 = class103.field1489.method1603((byte) -99, (int) var3.field758).field1036;
            } else if (var3.field753 != -1) {
                var4 = class103.field1489.method1603((byte) -99, var3.field753).field1036;
            } else if (class296.method1894(var3.field764, 64)) {
                class24 var5 = (class24) class406.field6158.method1747((long) ((int) var3.field758), false);
                if (var5 != null) {
                    class17 var6 = var5.field348;
                    class258 var7 = var6.field274;
                    if (var7.field3627 != null) {
                        var7 = var7.method1660(class288.field4208, (byte) 74);
                    }
                    if (var7 != null) {
                        var4 = var7.field3632;
                    }
                }
            } else if (class270.method1737((byte) -36, var3.field764)) {
                Object var8 = null;
                class209 var9;
                if (var3.field764 == 1007) {
                    var9 = class432.field6575.method1872((int) var3.field758, false);
                } else {
                    var9 = class432.field6575.method1872((int) (var3.field758 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var9.field2934 != null) {
                    var9 = var9.method1435(-1, class288.field4208);
                }
                if (var9 != null) {
                    var4 = var9.field2931;
                }
            }
            if (var4 != null) {
                var2 = var2 + class200.method1359(var4, (byte) 116);
            }
        }
        if (class367.field5621 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class367.field5621 - 2) + class531.field7808.method2705((byte) 69, class257.field3556);
        }
        int var10 = -72 / ((arg1 - 16) / 42);
        if (class199.field2656 != null) {
            class268 var12 = class199.field2656.method1813(-1, arg0);
            if (var12 == null) {
                var12 = class199.field2653;
            }
            var12.method1722(class199.field2656.field4033, class268.field3740, class311.field4548, class109.field1543, class199.field2656.field3991, class199.field2656.field4063, class540.field7918, class199.field2656.field4146, class96.field1416, 32058, class286.field4197, var2, class203.field2718, class199.field2656.field4060, class199.field2656.field4043);
            class431.method2635(class268.field3740[2], (byte) 106, class268.field3740[0], class268.field3740[3], class268.field3740[1]);
        } else if (class282.field4156 != null && class67.field957 == class41.field603) {
            int var11 = class199.field2653.method1709(class286.field4197, class540.field7918, 31, class203.field2718, class308.field4460 + 16, class88.field1262 + 4, 0, var2, 16777215, class311.field4548);
            class431.method2635(var11 + class175.field2338.method564(-87, var2), (byte) -71, class88.field1262 + 4, 16, class308.field4460);
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 372)
    public static void method601(byte arg0) {
        field1281 = null;
        if (arg0 != -20) {
            method600(null, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lnq;)V", line = 788)
    public class89(class325 arg0) {
        this.field1295 = arg0;
        if (this.field1295.field4939 && this.field1295.field5027) {
            this.field1294 = this.field1280 = new class447(this.field1295);
            if (this.field1295.field4882 > 1 && this.field1295.field4995 && this.field1295.field4982) {
                this.field1294 = this.field1289 = new class447(this.field1295);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lwo;I)V", line = 392)
    public final void method602(class533 arg0, int arg1) {
        arg0.field7839 = false;
        field1288++;
        if (arg1 == -2814) {
            arg0.method2391(arg1 ^ 0x2306);
            arg0.method25(-13489);
            this.method606(15185);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(FIFFIZII)[F", line = 406)
    public static final float[] method603(float arg0, int arg1, float arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1282++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[6] = -var11;
        var8[2] = var11;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        if (!arg5) {
            method598((byte) -7);
        }
        float var16 = (float) arg7 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg4 * arg4 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg6 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[6] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var13[4] = var16;
            var13[3] = -var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[1] = var15 * var17;
            var13[5] = var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[1] *= arg3;
        var9[7] *= arg2;
        var9[8] *= arg2;
        var9[6] *= arg2;
        var9[4] *= arg0;
        var9[3] *= arg0;
        var9[2] *= arg3;
        var9[0] *= arg3;
        var9[5] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Z", line = 491)
    public final boolean method604(byte arg0) {
        field1293++;
        if (arg0 >= -56) {
            return false;
        } else {
            return this.field1294 != null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z", line = 506)
    private final boolean method605(int arg0) {
        if (this.field1308) {
            if (this.field1302 != null) {
                this.field1302.method432(false);
                this.field1302 = null;
            }
            if (this.field1301 != null) {
                this.field1301.method3172(6146);
                this.field1301 = null;
            }
            if (this.field1289 != null) {
                this.field1302 = new class60(this.field1295, 6402, this.field1277, this.field1286, this.field1295.field4882);
            }
            if (this.field1309) {
                this.field1301 = new class25(this.field1295, 34037, 6402, this.field1277, this.field1286);
            } else if (this.field1302 == null) {
                this.field1302 = new class60(this.field1295, 6402, this.field1277, this.field1286);
            }
            this.field1307 = true;
            this.field1304 = true;
            this.field1308 = false;
        }
        field1292++;
        if (this.field1305) {
            if (this.field1310 != null) {
                this.field1310.method432(false);
                this.field1310 = null;
            }
            if (this.field1306[0] != null) {
                this.field1306[0].method3172(arg0 + 6146);
                this.field1306[0] = null;
            }
            if (this.field1306[1] != null) {
                this.field1306[1].method3172(arg0 ^ 0x1802);
                this.field1306[1] = null;
            }
            if (this.field1289 != null) {
                this.field1310 = new class60(this.field1295, this.field1311, this.field1277, this.field1286, this.field1295.field4882);
            }
            this.field1306[0] = new class25(this.field1295, 34037, this.field1311, this.field1277, this.field1286);
            this.field1306[1] = this.field1303 > 1 ? new class25(this.field1295, 34037, this.field1311, this.field1277, this.field1286) : null;
            this.field1307 = true;
            this.field1304 = true;
            this.field1305 = false;
        }
        if (arg0 != 0) {
            return false;
        }
        if (this.field1304) {
            if (this.field1289 == null) {
                this.field1295.method2071(121, this.field1280);
                this.field1280.method2717(0, (byte) -109);
                this.field1280.method2717(1, (byte) -84);
                this.field1280.method2717(8, (byte) -118);
                this.field1280.method2708(0, (byte) 20, this.field1306[0]);
                if (this.field1303 > 1) {
                    this.field1280.method2708(1, (byte) 20, this.field1306[1]);
                }
                if (this.field1309) {
                    this.field1280.method2708(8, (byte) 20, this.field1301);
                } else {
                    this.field1280.method2715(8, false, this.field1302);
                }
                this.field1295.method2055(this.field1280, 110);
            } else {
                this.field1295.method2071(125, this.field1280);
                this.field1280.method2717(0, (byte) -120);
                this.field1280.method2717(1, (byte) -126);
                this.field1280.method2717(8, (byte) -102);
                this.field1280.method2708(0, (byte) 20, this.field1306[0]);
                if (this.field1303 > 1) {
                    this.field1280.method2708(1, (byte) 20, this.field1306[1]);
                }
                if (this.field1309) {
                    this.field1280.method2708(8, (byte) 20, this.field1301);
                }
                this.field1295.method2055(this.field1280, arg0 ^ 0x72);
                this.field1295.method2071(123, this.field1289);
                this.field1289.method2717(0, (byte) -94);
                this.field1289.method2717(8, (byte) -102);
                this.field1289.method2715(0, false, this.field1310);
                this.field1289.method2715(8, false, this.field1302);
                this.field1295.method2055(this.field1289, 123);
            }
            this.field1307 = true;
            this.field1304 = false;
        }
        if (this.field1307) {
            this.field1295.method2071(99, this.field1294);
            this.field1307 = !this.field1294.method2713(36053);
            this.field1295.method2055(this.field1294, 120);
        }
        return !this.field1307;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 640)
    private final void method606(int arg0) {
        field1284++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class533 var5 = (class533) this.field1300.method445(33); var5 != null; var5 = (class533) this.field1300.method451(false)) {
            int var9 = var5.method2393((byte) -106);
            var4 += var5.method3157((byte) 127);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method3156(false);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1311 != var6) {
            this.field1305 = true;
            this.field1311 = var6;
        }
        int var7 = this.field1303 <= 2 ? this.field1303 : 2;
        int var8 = var4 > 2 ? 2 : var4;
        this.field1303 = var4;
        if (this.field1309 != var2) {
            this.field1309 = var2;
            this.field1308 = true;
        }
        if (arg0 != 15185) {
            method603(1.10738F, 94, 0.5291254F, -0.45078617F, -36, true, -46, -52);
        }
        if (var7 != var8) {
            this.field1304 = this.field1305 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lwo;B)Z", line = 712)
    public final boolean method607(class533 arg0, byte arg1) {
        field1285++;
        if (this.field1294 != null) {
            if (arg0.method2395(arg1 ^ 0x287D) || arg0.method2396(arg1 - 143)) {
                this.field1300.method453((byte) 111, arg0);
                this.method606(15185);
                if (this.method605(0)) {
                    if (this.field1277 != -1 && this.field1286 != -1) {
                        arg0.method2392(this.field1286, this.field1277, arg1 + 67);
                    }
                    arg0.field7839 = true;
                    return true;
                }
            }
            this.method602(arg0, -2814);
        }
        if (arg1 != 40) {
            this.method597(-15, 18, 18, -82, 64);
        }
        return false;
    }
}
