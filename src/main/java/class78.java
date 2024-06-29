import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class78 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Z")
    private boolean field1279 = false;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    private int field1292 = 32;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "J")
    private long field1272 = class134.method924(false);

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "[Lwd;")
    private class23[] field1302 = new class23[8];

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Z")
    private boolean field1301 = true;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    private int field1300 = 0;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "J")
    private long field1304 = 0L;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    private int field1305 = 0;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "J")
    private long field1306 = 0L;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    private int field1297 = 0;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    private int field1307 = 0;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "[Lwd;")
    private class23[] field1308 = new class23[8];

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1277 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lam;")
    public static class180 field1282 = new class180();

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lre;")
    public static class228 field1293 = null;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
    public static int[] field1295 = new int[14];

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lwd;")
    private class23 field1280;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
    public int[] field1281;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final synchronized void method551(int arg0) {
        field1273++;
        this.field1301 = true;
        try {
            this.method478();
            if (arg0 != 2000) {
                this.field1272 = 94L;
            }
        } catch (Exception var2) {
            this.method474();
            this.field1306 = class134.method924(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([II)V")
    private final void method552(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class7.field160) {
            var3 = arg1 << 1;
        }
        class175.method1186(arg0, 0, var3);
        this.field1297 -= arg1;
        if (this.field1280 != null && this.field1297 <= 0) {
            this.field1297 += class186.field2873 >> 4;
            class31.method240(0, this.field1280);
            this.method553(115, this.field1280.method153(), this.field1280);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class23 var10 = null;
                        class23 var11 = this.field1302[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class35 var12 = var11.field322;
                                if (var12 == null || var12.field515 <= var8) {
                                    var11.field324 = true;
                                    int var13 = var11.method22();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field515 += var13;
                                    }
                                    if (var4 >= this.field1292) {
                                        break label107;
                                    }
                                    class23 var14 = var11.method33();
                                    if (var14 != null) {
                                        int var15 = var11.field321;
                                        while (var14 != null) {
                                            this.method553(116, var15 * var14.method153() >> 8, var14);
                                            var14 = var11.method45();
                                        }
                                    }
                                    class23 var16 = var11.field323;
                                    var11.field323 = null;
                                    if (var10 == null) {
                                        this.field1302[var7] = var16;
                                    } else {
                                        var10.field323 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1308[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field323;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class23 var18 = this.field1302[var17];
                this.field1302[var17] = this.field1308[var17] = null;
                while (var18 != null) {
                    class23 var19 = var18.field323;
                    var18.field323 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1297 < 0) {
            this.field1297 = 0;
        }
        if (this.field1280 != null) {
            this.field1280.method26(arg0, 0, arg1);
        }
        this.field1272 = class134.method924(false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
    public void method478() throws Exception {
        field1274++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILwd;)V")
    private final void method553(int arg0, int arg1, class23 arg2) {
        field1288++;
        int var4 = arg1 >> 5;
        int var5 = -86 % ((arg0 - 64) / 51);
        class23 var6 = this.field1308[var4];
        if (var6 == null) {
            this.field1302[var4] = arg2;
        } else {
            var6.field323 = arg2;
        }
        this.field1308[var4] = arg2;
        arg2.field321 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()V")
    public void method475() throws Exception {
        field1276++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public final synchronized void method554(boolean arg0) {
        if (class102.field1702 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class102.field1702.field3921[var3] == this) {
                    class102.field1702.field3921[var3] = null;
                }
                if (class102.field1702.field3921[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class102.field1702.field3923 = true;
                while (class102.field1702.field3919) {
                    class150.method1011((byte) 41, 50L);
                }
                class102.field1702 = null;
            }
        }
        this.method474();
        field1296++;
        this.field1281 = null;
        this.field1279 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public final synchronized void method555(byte arg0) {
        field1286++;
        if (this.field1279) {
            return;
        }
        long var2 = class134.method924(false);
        try {
            if (var2 > this.field1272 + 500000L) {
                this.field1272 = var2 - 500000L;
            }
            while (this.field1272 + 5000L < var2) {
                this.method559(arg0 - 23338, 256);
                this.field1272 += (long) (256000 / class186.field2873);
            }
        } catch (Exception var7) {
            this.field1272 = var2;
        }
        if (this.field1281 == null) {
            return;
        }
        try {
            if (this.field1306 != 0L) {
                if (var2 < this.field1306) {
                    return;
                }
                this.method476(this.field1298);
                this.field1306 = 0L;
                this.field1301 = true;
            }
            int var4 = this.method473();
            int var5 = this.field1303 + this.field1299;
            if (arg0 != -43) {
                field1295 = null;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((this.field1307 - var4) > this.field1300) {
                this.field1300 = this.field1307 - var4;
            }
            if (var5 + 256 > this.field1298) {
                this.field1298 += 1024;
                if (this.field1298 > 16384) {
                    this.field1298 = 16384;
                }
                var4 = 0;
                this.method474();
                this.method476(this.field1298);
                this.field1301 = true;
                if ((var5 + 256) > this.field1298) {
                    var5 = this.field1298 - 256;
                    this.field1299 = var5 - this.field1303;
                }
            }
            while (var5 > var4) {
                this.method552(this.field1281, 256);
                var4 += 256;
                this.method475();
            }
            if (this.field1304 < var2) {
                if (this.field1301) {
                    this.field1301 = false;
                } else if (this.field1300 == 0 && this.field1305 == 0) {
                    this.method474();
                    this.field1306 = var2 + 2000L;
                    return;
                } else {
                    this.field1299 = Math.min(this.field1305, this.field1300);
                    this.field1305 = this.field1300;
                }
                this.field1300 = 0;
                this.field1304 = var2 + 2000L;
            }
            this.field1307 = var4;
        } catch (Exception var6) {
            this.method474();
            this.field1306 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method477(Component arg0) throws Exception {
        field1285++;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
    public int method473() throws Exception {
        field1283++;
        return this.field1298;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZBI)Ljava/lang/String;")
    public static final String method556(int arg0, boolean arg1, byte arg2, int arg3) {
        field1284++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2 < 61) {
                method557((byte) -20);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static void method557(byte arg0) {
        field1282 = null;
        int var1 = -59 / ((arg0 + 6) / 40);
        field1293 = null;
        field1295 = null;
        field1277 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public final void method558(int arg0) {
        field1290++;
        this.field1301 = true;
        if (arg0 != 0) {
            this.field1281 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    private final void method559(int arg0, int arg1) {
        if (arg0 != -23381) {
            this.method560((class23) null, (byte) -112);
        }
        this.field1297 -= arg1;
        field1275++;
        if (this.field1297 < 0) {
            this.field1297 = 0;
        }
        if (this.field1280 != null) {
            this.field1280.method32(arg1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V")
    public void method474() {
        field1291++;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public void method476(int arg0) throws Exception {
        field1287++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lwd;B)V")
    public final synchronized void method560(class23 arg0, byte arg1) {
        field1294++;
        this.field1280 = arg0;
        int var3 = 48 / ((arg1 + 74) / 36);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)I")
    public static final int method561(int arg0, byte arg1) {
        field1289++;
        int var2 = -68 % ((-arg1 - 2) / 63);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(CIB)I")
    public static final int method562(char arg0, int arg1, byte arg2) {
        if (arg2 != 119) {
            method562((char) 65428, -85, (byte) -57);
        }
        int var3 = arg0 << 4;
        field1278++;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }
}
