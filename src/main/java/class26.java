import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class26 implements class286 {

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Z")
    private boolean field412 = true;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
    public static boolean field380 = false;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lna;")
    public static class26 field388 = class69.method505("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) -118);

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field384 = 0;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Lna;")
    public static class26 field427 = class69.method505(":allyreq:", (byte) -127);

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "[I")
    public static int[] field437 = new int[50];

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "Lna;")
    private static class26 field439 = class69.method505("Allocated memory", (byte) -120);

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lna;")
    public static class26 field402 = field439;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
    public static boolean field395;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Z")
    public static boolean field421;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "[B")
    public byte[] field418;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Ljava/net/URL;", line = 4)
    public final URL method158(boolean arg0) throws MalformedURLException {
        field429++;
        if (arg0) {
            this.method179(true, 22);
        }
        return new URL(new String(this.field418, 0, this.field436));
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLna;)Z", line = 18)
    public final boolean method159(byte arg0, class26 arg1) {
        field390++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field436 == arg1.field436) {
            if (arg0 != -42) {
                this.method199(-127);
            }
            byte[] var3 = arg1.field418;
            byte[] var4 = this.field418;
            for (int var5 = 0; var5 < this.field436; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIZ)Z", line = 54)
    public static final boolean method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field426++;
        long var8 = class107.method760(arg6, arg1 + arg5, arg0 + arg3);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = ((int) var8 & 0x7C2EA) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class78 var13 = class104.method750(4, var12);
            if (var13.field1211 == -1) {
                int var14 = arg2;
                if (var8 > 0L) {
                    var14 = arg4;
                }
                int[] var15 = class34.field571;
                int var16 = (52736 - (arg3 * 512)) * 4 + arg1 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class316.method2189(arg1, var13, false, arg0, arg5, arg3, var10)) {
                return false;
            }
        }
        long var17 = class132.method890(arg6, arg1 + arg5, arg0 + arg3);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7F304) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class78 var22 = class104.method750(4, var21);
            if (var22.field1211 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = arg1 * 4 + (((103 - arg3) * 2048) + 24624);
                    int[] var25 = class34.field571;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1025] = var23;
                        var25[var24 + 512 + 2] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 1024 + 2] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class316.method2189(arg1, var22, false, arg0, arg5, arg3, var19)) {
                return false;
            }
        }
        long var26 = class55.method403(arg6, arg1 + arg5, arg0 + arg3);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class78 var30 = class104.method750(4, var29);
            if (var30.field1211 != -1 && !class316.method2189(arg1, var30, !arg7, arg0, arg5, arg3, var28)) {
                return false;
            }
        }
        if (!arg7) {
            field395 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)I", line = 277)
    public final int method161(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        field389++;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        int var7 = 29 / ((-arg0 - 47) / 37);
        while (this.field436 > var6) {
            label83: {
                int var8 = this.field418[var6] & 0xFF;
                if (var6 == 0) {
                    if (var8 == 45) {
                        var3 = true;
                        break label83;
                    }
                    if (var8 == 43) {
                        break label83;
                    }
                }
                if (var8 >= 48 && var8 <= 57) {
                    var8 -= 48;
                } else if (var8 >= 65 && var8 <= 90) {
                    var8 -= 55;
                } else if (var8 >= 97 && var8 <= 122) {
                    var8 -= 87;
                } else {
                    throw new NumberFormatException();
                }
                if (arg1 <= var8) {
                    throw new NumberFormatException();
                }
                if (var3) {
                    var8 = -var8;
                }
                int var9 = arg1 * var5 + var8;
                if (var9 / arg1 != var5) {
                    throw new NumberFormatException();
                }
                var5 = var9;
                var4 = true;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILna;)Z", line = 355)
    public final boolean method162(int arg0, class26 arg1) {
        field398++;
        if (arg1 == null) {
            return false;
        } else if (this.field436 == arg1.field436) {
            int var3 = -54 / ((arg0 + 43) / 61);
            for (int var4 = 0; var4 < this.field436; var4++) {
                byte var5 = this.field418[var4];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                byte var6 = arg1.field418[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 396)
    public final void method163(int arg0, int arg1, Graphics arg2, byte arg3) {
        field400++;
        if (arg3 >= -85) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field418, 0, this.field436, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field418, 0, this.field436);
        }
        arg2.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lna;Z)Lna;", line = 420)
    public final class26 method164(class26 arg0, boolean arg1) {
        field420++;
        if (!this.field412) {
            throw new IllegalArgumentException();
        } else if (arg1) {
            if (this.field436 + arg0.field436 > this.field418.length) {
                int var3;
                for (var3 = 1; var3 < (this.field436 + arg0.field436); var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class75.method536(this.field418, 0, var4, 0, this.field436);
                this.field418 = var4;
            }
            class75.method536(arg0.field418, 0, this.field418, this.field436, arg0.field436);
            this.field436 += arg0.field436;
            return this;
        } else {
            return (class26) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lna;", line = 461)
    public final class26 method165(int arg0) {
        if (arg0 != -98) {
            this.method193((byte) -53, (class26) null);
        }
        class26 var2 = new class26();
        field425++;
        var2.field436 = this.field436;
        var2.field418 = new byte[this.field436];
        for (int var3 = 0; var3 < this.field436; var3++) {
            byte var4 = this.field418[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field418[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lba;Lba;IIIZZ)I", line = 507)
    public static final int method166(class166 arg0, class166 arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var7 = class154.method1046(arg1, arg4, arg2 - 5638, arg0, arg6);
        field438++;
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg2 != 5730) {
            return -76;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class154.method1046(arg1, arg3, arg2 ^ 0x1613, arg0, arg5);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lna;", line = 540)
    public final class26 method167(int arg0) {
        field432++;
        byte var2 = 2;
        class26 var3 = new class26();
        var3.field436 = this.field436;
        if (arg0 < 67) {
            return (class26) null;
        }
        var3.field418 = new byte[this.field436];
        for (int var4 = 0; var4 < this.field436; var4++) {
            byte var5 = this.field418[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field418[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lve;IZ)Lmm;", line = 604)
    public static final class256 method168(class266 arg0, int arg1, boolean arg2) {
        field417++;
        if (class141.method938((byte) -118, arg0, arg1)) {
            if (arg2) {
                method170(-39, true, -93, (class266) null);
            }
            return class193.method1305(-93);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)J", line = 623)
    public final long method169(int arg0) {
        long var2 = 0L;
        if (arg0 < 4) {
            field439 = (class26) null;
        }
        for (int var4 = 0; var4 < this.field436; var4++) {
            var2 = (var2 << 5) + (long) (this.field418[var4] & 0xFF) - var2;
        }
        field394++;
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZILve;)Lek;", line = 643)
    public static final class183 method170(int arg0, boolean arg1, int arg2, class266 arg3) {
        field408++;
        if (!arg1) {
            method166((class166) null, (class166) null, -64, -40, 23, false, false);
        }
        return class196.method1317(arg3, arg0, arg2, -30901) ? class14.method105((byte) 82) : null;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I", line = 669)
    public final int method171(int arg0) {
        field413++;
        if (arg0 >= -16) {
            this.method175(false);
        }
        return this.field436;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V", line = 680)
    public static void method172(int arg0) {
        field402 = null;
        if (arg0 != -8635) {
            field402 = (class26) null;
        }
        field437 = null;
        field427 = null;
        field388 = null;
        field439 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILna;II)Lna;", line = 700)
    public final class26 method173(int arg0, class26 arg1, int arg2, int arg3) {
        field442++;
        if (!this.field412) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg2 <= arg3 && arg3 <= arg1.field436) {
            if (arg3 + this.field436 - arg2 > this.field418.length) {
                int var5;
                for (var5 = 1; var5 < (this.field436 + arg1.field436); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class75.method536(this.field418, 0, var6, 0, this.field436);
                this.field418 = var6;
            }
            class75.method536(arg1.field418, arg2, this.field418, this.field436, arg3 - arg2);
            if (arg0 != 1) {
                field427 = (class26) null;
            }
            this.field436 += arg3 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z", line = 745)
    public final boolean method174(int arg0) {
        if (arg0 < 79) {
            this.method183((byte) 114);
        }
        field399++;
        return this.method192(10, true);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lna;", line = 759)
    public final class26 method175(boolean arg0) {
        field407++;
        class26 var2 = new class26();
        var2.field436 = this.field436;
        var2.field418 = new byte[var2.field436];
        if (arg0) {
            for (int var3 = 0; var3 < this.field436; var3++) {
                var2.field418[this.field436 - var3 - 1] = this.field418[var3];
            }
            return var2;
        } else {
            return (class26) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Lna;", line = 781)
    public final class26 method176(byte arg0) {
        field428++;
        class26 var2 = new class26();
        var2.field436 = this.field436;
        var2.field418 = new byte[this.field436];
        boolean var3 = true;
        int var4 = 0;
        if (arg0 != -50) {
            this.toString();
        }
        while (this.field436 > var4) {
            byte var5 = this.field418[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field418[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field418[var4] = (byte) (var5 - 32);
            } else {
                var2.field418[var4] = var5;
                var3 = false;
            }
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BLna;)I", line = 833)
    public final int method177(byte arg0, class26 arg1) {
        if (arg0 >= -44) {
            field395 = true;
        }
        field381++;
        int var3 = 0;
        int var4 = 0;
        int var5 = arg1.field436;
        int var6 = this.field436;
        int var7 = this.field436;
        int var8 = arg1.field436;
        int var9 = 0;
        int var10 = 0;
        while (var6 != 0 && var5 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field418[var9] & 0xFF;
                var9++;
            }
            if (class203.method1367(var3, -116)) {
                var7++;
            } else {
                var6--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field418[var10] & 0xFF;
                var10++;
            }
            if (class203.method1367(var4, -86)) {
                var8++;
            } else {
                var5--;
            }
            if (class170.field2657[var3] < class170.field2657[var4]) {
                return -1;
            }
            if (class170.field2657[var4] < class170.field2657[var3]) {
                return 1;
            }
        }
        if (var8 <= var7) {
            return var7 > var8 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;Z)Ljava/net/URL;", line = 925)
    public final URL method178(URL arg0, boolean arg1) throws MalformedURLException {
        if (!arg1) {
            this.field418 = (byte[]) null;
        }
        field397++;
        return new URL(arg0, new String(this.field418, 0, this.field436));
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)Lna;", line = 936)
    public final class26 method179(boolean arg0, int arg1) {
        field405++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class26 var3 = new class26();
        var3.field418 = new byte[this.field436 + 1];
        var3.field436 = this.field436 + 1;
        if (arg0) {
            field427 = (class26) null;
        }
        class75.method536(this.field418, 0, var3.field418, 0, this.field436);
        var3.field418[this.field436] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)V", line = 958)
    public final void method180(boolean arg0) {
        field414++;
        String var2;
        try {
            if (arg0) {
                return;
            }
            var2 = new String(this.field418, 0, this.field436, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field418, 0, this.field436);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(BLna;)Z", line = 987)
    public final boolean method181(byte arg0, class26 arg1) {
        field373++;
        if (arg1.field436 > this.field436) {
            return false;
        }
        int var3 = this.field436 - arg1.field436;
        if (arg0 >= -25) {
            field437 = (int[]) null;
        }
        for (int var4 = 0; var4 < arg1.field436; var4++) {
            if (this.field418[var3 + var4] != arg1.field418[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lna;I)I", line = 1015)
    public final int method182(class26 arg0, int arg1) {
        if (arg1 <= 49) {
            return -20;
        } else {
            field419++;
            return this.method197(arg0, 0, -1);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I", line = 1026)
    public final int method183(byte arg0) {
        field410++;
        if (arg0 > -89) {
            this.method188(33, 31, -79);
        }
        return this.method161((byte) -114, 10);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V", line = 1037)
    public final void method184(int arg0, boolean arg1) {
        field383++;
        if (!this.field412) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field418.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class75.method536(this.field418, 0, var4, 0, this.field436);
                this.field418 = var4;
            }
            for (int var5 = this.field436; var5 < arg0; var5++) {
                this.field418[var5] = 32;
            }
            if (arg1) {
                field437 = (int[]) null;
            }
            this.field436 = arg0;
        }
    }

    @OriginalMember(owner = "client!na", name = "toString", descriptor = "()Ljava/lang/String;", line = 1082)
    public final String toString() {
        field430++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLjava/applet/Applet;)V", line = 1093)
    public final void method185(boolean arg0, Applet arg1) throws Throwable {
        field375++;
        if (arg0) {
            String var3 = new String(this.field418, 0, this.field436);
            class227.method1519(arg1, !arg0, var3);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I", line = 1107)
    public final int method186(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        field392++;
        if (arg2 != 1536) {
            return 123;
        }
        for (int var5 = arg1; var5 < this.field436; var5++) {
            if (this.field418[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lna;", line = 1138)
    public final class26 method187(int arg0, byte arg1) {
        if (arg1 != -74) {
            this.toString();
        }
        field386++;
        return this.method188(this.field436, arg1 ^ 0xFFFFFFB6, arg0);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Lna;", line = 1149)
    public final class26 method188(int arg0, int arg1, int arg2) {
        field396++;
        class26 var4 = new class26();
        var4.field436 = arg0 - arg2;
        var4.field418 = new byte[arg0 - arg2];
        class75.method536(this.field418, arg2, var4.field418, arg1, var4.field436);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Lna;I)Z", line = 1162)
    public final boolean method189(class26 arg0, int arg1) {
        field415++;
        if (this.field436 < arg0.field436) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field436; var3++) {
            if (this.field418[var3] != arg0.field418[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1183)
    public final boolean equals(Object arg0) {
        field379++;
        if (!(arg0 instanceof class26)) {
            throw new IllegalArgumentException();
        }
        return this.method159((byte) -42, (class26) arg0);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(Lna;I)I", line = 1218)
    public final int method190(class26 arg0, int arg1) {
        if (arg1 != -1) {
            this.method175(true);
        }
        field401++;
        int var3;
        if (arg0.field436 < this.field436) {
            var3 = arg0.field436;
        } else {
            var3 = this.field436;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field418[var4] & 0xFF) < (arg0.field418[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field418[var4] & 0xFF) < (this.field418[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field436 > this.field436) {
            return -1;
        } else if (arg0.field436 >= this.field436) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lna;ZLna;)Lna;", line = 1257)
    public final class26 method191(class26 arg0, boolean arg1, class26 arg2) {
        field411++;
        int var4 = this.field436;
        int var5 = arg0.field436 - arg2.field436;
        int var6 = 0;
        while (true) {
            int var7 = this.method197(arg2, var6, -1);
            if (var7 < 0) {
                int var8 = 0;
                class26 var9 = class5.method26((byte) -104, var4);
                while (true) {
                    int var10 = this.method197(arg2, var8, -1);
                    if (var10 < 0) {
                        while (var8 < this.field436) {
                            var9.method203(this.field418[var8++] & 0xFF, (byte) 117);
                        }
                        if (!arg1) {
                            this.method198(-5, (byte) -91);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method203(this.field418[var8++] & 0xFF, (byte) 125);
                    }
                    var9.method164(arg0, arg1);
                    var8 += arg2.field436;
                }
            }
            var6 = var7 + arg2.field436;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!na", name = "hashCode", descriptor = "()I", line = 1319)
    public final int hashCode() {
        field433++;
        return this.method205(false);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)Z", line = 1332)
    private final boolean method192(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (!arg1) {
            field380 = false;
        }
        boolean var3 = false;
        field374++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field436; var6++) {
            int var7 = this.field418[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg0) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if ((var8 / arg0) != var5) {
                return false;
            }
            var5 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(BLna;)Z", line = 1403)
    public final boolean method193(byte arg0, class26 arg1) {
        field423++;
        if (this.field436 < arg1.field436) {
            return false;
        }
        if (arg0 != -32) {
            this.field436 = 13;
        }
        for (int var3 = 0; var3 < arg1.field436; var3++) {
            byte var4 = this.field418[var3];
            byte var5 = arg1.field418[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Lna;", line = 1443)
    public final class26 method194(int arg0) {
        if (arg0 <= 86) {
            this.method195(117);
        }
        field431++;
        return this;
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)Lna;", line = 1457)
    public final class26 method195(int arg0) {
        if (arg0 != 1) {
            method166((class166) null, (class166) null, 23, 68, 126, false, false);
        }
        int var2 = 0;
        field382++;
        while (var2 < this.field436 && (this.field418[var2] >= 0 && this.field418[var2] <= 32 || (this.field418[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field436; var3 > var2 && (this.field418[var3 - 1] >= 0 && this.field418[var3 - 1] <= 32 || (this.field418[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field436 == var3) {
            return this;
        }
        class26 var4 = new class26();
        var4.field436 = var3 - var2;
        var4.field418 = new byte[var4.field436];
        for (int var5 = 0; var5 < var4.field436; var5++) {
            var4.field418[var5] = this.field418[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)Lna;", line = 1494)
    public final class26 method196(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        class26 var5 = new class26();
        byte var6 = (byte) arg0;
        var5.field436 = this.field436;
        field424++;
        var5.field418 = new byte[this.field436];
        if (arg1 < 3) {
            field380 = true;
        }
        for (int var7 = 0; var7 < this.field436; var7++) {
            byte var8 = this.field418[var7];
            if (var4 == var8) {
                var5.field418[var7] = var6;
            } else {
                var5.field418[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lna;II)I", line = 1528)
    public final int method197(class26 arg0, int arg1, int arg2) {
        field435++;
        int var4 = arg0.field436;
        if (arg1 >= this.field436) {
            return var4 == 0 ? this.field436 : -1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~var4 == arg2) {
            return arg1;
        }
        int var5 = this.field436 - var4;
        byte[] var6 = arg0.field418;
        byte var7 = var6[0];
        for (int var8 = arg1; var8 <= var5; var8++) {
            if (this.field418[var8] != var7) {
                do {
                    var8++;
                    if (var8 > var5) {
                        return -1;
                    }
                } while (this.field418[var8] != var7);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            for (int var11 = 1; var11 < var4; var11++) {
                if (this.field418[var10] != var6[var11]) {
                    var9 = false;
                    break;
                }
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)[Lna;", line = 1609)
    public final class26[] method198(int arg0, byte arg1) {
        field441++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field436; var4++) {
            if (this.field418[var4] == arg0) {
                var3++;
            }
        }
        class26[] var5 = new class26[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 88 / ((arg1 + 12) / 33);
        while (var8 < var3) {
            int var10;
            for (var10 = 0; this.field418[var7 + var10] != arg0; var10++) {
            }
            var5[var6++] = this.method188(var7 + var10, 0, var7);
            var7 += var10 + 1;
            var8++;
        }
        var5[var3] = this.method188(this.field436, 0, var7);
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "i", descriptor = "(I)[B", line = 1677)
    public final byte[] method199(int arg0) {
        field403++;
        byte[] var2 = new byte[this.field436];
        class75.method536(this.field418, 0, var2, arg0, this.field436);
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(IB)I", line = 1688)
    public final int method200(int arg0, byte arg1) {
        field393++;
        int var3 = 53 / ((arg1 - 9) / 32);
        return this.field418[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBZIZIIZ)Lqf;", line = 1699)
    public static final class148 method201(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        class217 var8 = class45.method341(arg3, (byte) 106);
        if (arg6 > 1 && var8.field3463 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg6 >= var8.field3418[var10] && var8.field3418[var10] != 0) {
                    var9 = var8.field3463[var10];
                }
            }
            if (var9 != -1) {
                var8 = class45.method341(var9, (byte) 84);
            }
        }
        class270 var11 = var8.method1470(18206);
        field409++;
        if (var11 == null) {
            return null;
        }
        class256 var12 = null;
        if (var8.field3446 != -1) {
            var12 = (class256) method201(0, (byte) 116, true, var8.field3444, false, 1, 10, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3413 != -1) {
            var12 = (class256) method201(arg0, (byte) -107, true, var8.field3451, false, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class34.field571;
        int var14 = class34.field563;
        int var15 = class34.field565;
        int[] var16 = new int[4];
        class34.method288(var16);
        class256 var17 = new class256(36, 32);
        class34.method282(var17.field4199, 36, 32);
        class200.method1338();
        class200.method1349(16, 16);
        int var18 = var8.field3470;
        class200.field3107 = false;
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class200.field3115[var8.field3441] * var18 >> 16;
        int var20 = class200.field3104[var8.field3441] * var18 >> 16;
        var11.method1604(0, var8.field3458, var8.field3420, var8.field3441, var8.field3447, var20 - (var11.method679() / 2 - var8.field3398), var8.field3398 + var19, -1L);
        if (arg5 >= 1) {
            var17.method1803(1);
            if (arg5 >= 2) {
                var17.method1803(16777215);
            }
            class34.method282(var17.field4199, 36, 32);
        }
        if (arg0 != 0) {
            var17.method1811(arg0);
        }
        int var21 = 73 / ((-arg1 - 56) / 47);
        if (var8.field3446 != -1) {
            var12.method876(0, 0);
        } else if (var8.field3413 != -1) {
            class34.method282(var12.field4199, 36, 32);
            var17.method876(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field3415 == 1 || arg6 != 1) && arg6 != -1) {
            class144.field2189.method1198(class116.method809(1000, arg6), 0, 9, 16776960, 1);
        }
        class34.method282(var13, var14, var15);
        class34.method279(var16);
        class200.method1338();
        class200.field3107 = true;
        return class255.field4184 && !arg2 ? new class130(var17) : var17;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Lna;", line = 1831)
    public final class26 method202(byte arg0) {
        field440++;
        long var2 = this.method169(arg0 + 90);
        synchronized (na.class) {
            if (class218.field3494 == null) {
                class218.field3494 = new class259(4096);
            } else {
                for (class56 var5 = (class56) class218.field3494.method1827(var2, arg0 ^ 0x20); var5 != null; var5 = (class56) class218.field3494.method1831(0)) {
                    if (this.method159((byte) -42, var5.field914)) {
                        return var5.field914;
                    }
                }
            }
            class56 var6 = new class56();
            if (arg0 == 32) {
                var6.field914 = this;
                this.field412 = false;
                class218.field3494.method1826(1, var6, var2);
                return this;
            } else {
                return (class26) null;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(IB)Lna;", line = 1878)
    public final class26 method203(int arg0, byte arg1) {
        field377++;
        if (arg1 <= 110) {
            field395 = true;
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field412) {
            if (this.field418.length == this.field436) {
                int var3;
                for (var3 = 1; var3 <= this.field436; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class75.method536(this.field418, 0, var4, 0, this.field436);
                this.field418 = var4;
            }
            this.field418[this.field436++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/applet/Applet;)Lna;", line = 1914)
    public final class26 method204(byte arg0, Applet arg1) {
        field422++;
        if (arg0 < 124) {
            this.method183((byte) -82);
        }
        String var3 = new String(this.field418, 0, this.field436);
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class56.method409(var4, 27307);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)I", line = 1936)
    public final int method205(boolean arg0) {
        field406++;
        int var2 = 0;
        if (arg0) {
            field437 = (int[]) null;
        }
        for (int var3 = 0; var3 < this.field436; var3++) {
            var2 = (this.field418[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1969)
    public final int method206(int arg0, FontMetrics arg1) {
        if (arg0 != -21018) {
            return 63;
        }
        String var3;
        try {
            var3 = new String(this.field418, 0, this.field436, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field418, 0, this.field436);
        }
        field391++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lna;", line = 1990)
    public final class26 method207(byte arg0) {
        field404++;
        if (!this.field412) {
            throw new IllegalArgumentException();
        }
        if (arg0 != 90) {
            field384 = -84;
        }
        if (this.field418.length != this.field436) {
            byte[] var2 = new byte[this.field436];
            class75.method536(this.field418, 0, var2, 0, this.field436);
            this.field418 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 2025)
    public final Object method208(int arg0, Applet arg1) throws Throwable {
        field376++;
        String var3 = new String(this.field418, 0, this.field436);
        Object var4 = class227.method1517(var3, (byte) -111, arg1);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class320.method2222(var5, -4114, var5.length, 0);
        }
        if (arg0 != -1857) {
            this.method184(116, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "j", descriptor = "(I)J", line = 2049)
    public final long method209(int arg0) {
        field416++;
        long var2 = 0L;
        if (arg0 >= -105) {
            field421 = true;
        }
        for (int var4 = 0; this.field436 > var4 && var4 < 12; var4++) {
            byte var5 = this.field418[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "(I)Lna;", line = 2102)
    public final class26 method210(int arg0) {
        field385++;
        class26 var2 = class153.method1042(-29664, this.method209(-112));
        if (arg0 >= -4) {
            return (class26) null;
        } else if (var2 == null) {
            return class287.field4800;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z[BIII)I", line = 2119)
    public final int method211(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        class75.method536(this.field418, arg3, arg1, arg2, arg4 - arg3);
        if (!arg0) {
            method201(42, (byte) -117, true, -47, false, 3, -26, true);
        }
        field434++;
        return arg4 - arg3;
    }
}
