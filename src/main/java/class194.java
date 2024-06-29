import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class194 extends class50 {

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    private int field3124 = 0;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lgg;")
    private class61 field3129 = new class61(16);

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    private int field3143 = 0;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lsj;")
    private class48 field3142 = new class48();

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "J")
    private long field3145 = 0L;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lwh;")
    private class9 field3138;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    private int field3109;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Z")
    private boolean field3144;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Lsj;")
    private class48 field3141;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lgh;")
    private class206 field3114;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lwh;")
    private class9 field3139;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Z")
    private boolean field3146;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lfe;")
    private class218 field3125;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    private int field3137;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    private int field3110;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lpf;")
    private class73 field3130;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lrb;")
    private class199 field3116;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
    private boolean field3140;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "[B")
    private byte[] field3123;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
    public static final String method1307(int arg0, String[] arg1, byte arg2, int arg3) {
        field3135++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg0 + arg3;
            for (int var7 = arg3; var7 < var6; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var5 += 4;
                } else {
                    var5 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            if (arg2 < 69) {
                method1308(71, 25, 12, 114, 124);
            }
            for (int var9 = arg3; var9 < var6; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    public static final void method1308(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3111++;
        if (arg2 != -2) {
            method1314((class134) null, -47);
        }
        if (arg4 - arg3 >= class58.field817 && (arg3 + arg4) <= class121.field2042 && arg0 - arg3 >= class156.field2507 && client.field3617 >= arg0 + arg3) {
            class214.method1437(0, arg0, arg4, arg3, arg1);
        } else {
            class131.method908(arg4, arg3, false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)V")
    public final void method396(int arg0, int arg1) {
        field3133++;
        if (this.field3138 == null) {
            return;
        }
        for (class69 var3 = this.field3142.method365(3); var3 != null; var3 = this.field3142.method372((byte) 7)) {
            if (((long) arg0) == var3.field962) {
                return;
            }
        }
        class69 var4 = new class69();
        var4.field962 = (long) arg0;
        if (arg1 >= -81) {
            this.method1313(-20);
        }
        this.field3142.method363(-110, var4);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public final void method1309(int arg0) {
        field3126++;
        if (this.field3141 == null || this.method394(93) == null) {
            return;
        }
        class69 var2 = this.field3142.method365(3);
        if (arg0 != 0) {
            this.field3130 = null;
        }
        while (var2 != null) {
            int var3 = (int) var2.field962;
            if (var3 < 0 || this.field3116.field3201 <= var3 || this.field3116.field3203[var3] == 0) {
                var2.method544(89);
            } else {
                if (this.field3123[var3] == 0) {
                    this.method1317(arg0 ^ 0x2, 1, var3);
                }
                if (this.field3123[var3] == -1) {
                    this.method1317(2, 2, var3);
                }
                if (this.field3123[var3] == 1) {
                    var2.method544(-64);
                }
            }
            var2 = this.field3142.method372((byte) 7);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILwd;Lwd;)V")
    public static final void method1310(int arg0, class69 arg1, class69 arg2) {
        field3119++;
        if (arg0 != 255) {
            return;
        }
        if (arg2.field959 != null) {
            arg2.method544(-46);
        }
        arg2.field959 = arg1.field959;
        arg2.field960 = arg1;
        arg2.field959.field960 = arg2;
        arg2.field960.field959 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg9 && arg3 == arg8 && arg4 == arg7 && arg0 == arg6) {
            class263.method1723(arg8, arg0, arg5, arg2, arg1 ^ 0xE93990B3, arg4);
        } else {
            int var10 = arg2;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg4 + var14 - var16 - arg2;
            int var18 = arg6 * 3;
            int var19 = arg0 + var15 - arg8 - var18;
            int var20 = var12 + var18 - var15 - var15;
            int var21 = var15 - var12;
            int var22 = var13 + var16 - var14 - var14;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var22 * var25;
                int var29 = var19 * var26;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var21 * var24;
                int var33 = (var27 + var28 + var31 >> 12) + arg2;
                int var34 = (var29 + var30 + var32 >> 12) + arg8;
                class263.method1723(var11, var34, arg5, var10, arg1 ^ 0xE93990B3, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg1 != -382103476) {
            method1319(false, 6, 86, 105, 104);
        }
        field3121++;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
    public final int method1312(int arg0) {
        field3112++;
        return arg0 <= 26 ? -90 : this.field3124;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I")
    public final int method1313(int arg0) {
        if (arg0 != 255) {
            this.method394(-122);
        }
        field3136++;
        return this.field3116 == null ? 0 : this.field3116.field3218;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljj;I)V")
    public static final void method1314(class134 arg0, int arg1) {
        class173.field2803 = arg0;
        field3120++;
        if (arg1 != -1589) {
            method1310(-65, (class69) null, (class69) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[B")
    public final byte[] method392(int arg0, int arg1) {
        class73 var3 = this.method1317(arg0 + 2, arg0, arg1);
        field3122++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method7((byte) -83);
            var3.method544(85);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
    public final int method1315(boolean arg0) {
        field3113++;
        if (this.field3116 == null) {
            return 0;
        } else if (this.field3144) {
            class69 var2 = this.field3141.method365(3);
            if (arg0) {
                this.field3130 = null;
            }
            return var2 == null ? 0 : (int) var2.field962;
        } else {
            return this.field3116.field3218;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)I")
    public final int method1316(boolean arg0) {
        if (arg0) {
            return 125;
        }
        field3115++;
        if (this.method394(126) == null) {
            return this.field3130 == null ? 0 : this.field3130.method2((byte) 113);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Lpf;")
    private final class73 method1317(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            this.method1320(true);
        }
        class73 var4 = (class73) this.field3129.method457((long) arg2, (byte) -115);
        field3117++;
        if (var4 != null && arg1 == 0 && !var4.field999 && var4.field998) {
            var4.method544(110);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3138 == null || this.field3123[arg2] == -1) {
                    if (this.field3114.method1391(3)) {
                        return null;
                    }
                    var4 = this.field3114.method1395(true, arg2, this.field3109, (byte) -116, (byte) 2);
                } else {
                    var4 = this.field3125.method1451(arg2, this.field3138, arg0 - 2);
                }
            } else if (arg1 == 1) {
                if (this.field3138 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3125.method1453(arg2, this.field3138, (byte) 34);
            } else if (arg1 == 2) {
                if (this.field3138 == null) {
                    throw new RuntimeException();
                }
                if (this.field3123[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3114.method1381(false)) {
                    return null;
                }
                var4 = this.field3114.method1395(false, arg2, this.field3109, (byte) -119, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3129.method466((long) arg2, var4, (byte) 93);
        }
        if (var4.field998) {
            return null;
        }
        byte[] var5 = var4.method7((byte) 98);
        if (!var4 instanceof class1) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class156.field2505.reset();
                class156.field2505.update(var5, 0, var5.length - 2);
                int var6 = (int) class156.field2505.getValue();
                if (this.field3116.field3208[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field3114.field3329 = 0;
                this.field3114.field3327 = 0;
            } catch (RuntimeException var12) {
                this.field3114.method1387((byte) -98);
                var4.method544(arg0 ^ 0x5F);
                if (var4.field999 && !this.field3114.method1391(3)) {
                    class41 var7 = this.field3114.method1395(true, arg2, this.field3109, (byte) -118, (byte) 2);
                    this.field3129.method466((long) arg2, var7, (byte) 93);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3116.field3207[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3116.field3207[arg2];
            if (this.field3138 != null) {
                this.field3125.method1449(var5, 2, this.field3138, arg2);
                if (this.field3123[arg2] != 1) {
                    this.field3124++;
                    this.field3123[arg2] = 1;
                }
            }
            if (!var4.field999) {
                var4.method544(120);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class156.field2505.reset();
            class156.field2505.update(var5, 0, var5.length - 2);
            int var8 = (int) class156.field2505.getValue();
            if (this.field3116.field3208[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3116.field3207[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field3123[arg2] != 1) {
                this.field3124++;
                this.field3123[arg2] = 1;
            }
            if (!var4.field999) {
                var4.method544(arg0 ^ 0x56);
            }
            return var4;
        } catch (Exception var11) {
            this.field3123[arg2] = -1;
            var4.method544(120);
            if (var4.field999 && !this.field3114.method1391(3)) {
                class41 var10 = this.field3114.method1395(true, arg2, this.field3109, (byte) -111, (byte) 2);
                this.field3129.method466((long) arg2, var10, (byte) 93);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lrb;")
    public final class199 method394(int arg0) {
        if (arg0 < 66) {
            method1314((class134) null, -102);
        }
        field3128++;
        if (this.field3116 != null) {
            return this.field3116;
        }
        if (this.field3130 == null) {
            if (this.field3114.method1391(3)) {
                return null;
            }
            this.field3130 = this.field3114.method1395(true, this.field3109, 255, (byte) -111, (byte) 0);
        }
        if (this.field3130.field998) {
            return null;
        }
        byte[] var2 = this.field3130.method7((byte) -94);
        if (this.field3130 instanceof class1) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3116 = new class199(var2, this.field3137);
                if (this.field3116.field3205 != this.field3110) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3116 = null;
                if (this.field3114.method1391(3)) {
                    this.field3130 = null;
                } else {
                    this.field3130 = this.field3114.method1395(true, this.field3109, 255, (byte) -127, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3116 = new class199(var2, this.field3137);
            } catch (RuntimeException var4) {
                this.field3114.method1387((byte) -98);
                this.field3116 = null;
                if (this.field3114.method1391(3)) {
                    this.field3130 = null;
                } else {
                    this.field3130 = this.field3114.method1395(true, this.field3109, 255, (byte) -121, (byte) 0);
                }
                return null;
            }
            if (this.field3139 != null) {
                this.field3125.method1449(var2, 2, this.field3139, this.field3109);
            }
        }
        if (this.field3138 != null) {
            this.field3123 = new byte[this.field3116.field3201];
            this.field3124 = 0;
        }
        this.field3130 = null;
        return this.field3116;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        field3118++;
        if (arg0 != 20354) {
            this.method396(-103, 19);
        }
        class73 var3 = (class73) this.field3129.method457((long) arg1, (byte) -115);
        return var3 == null ? 0 : var3.method2((byte) 113);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        field3132++;
        if (this.field3141 != null) {
            if (this.method394(108) == null) {
                return;
            }
            if (this.field3144) {
                boolean var2 = true;
                for (class69 var3 = this.field3141.method365(3); var3 != null; var3 = this.field3141.method372((byte) 7)) {
                    int var5 = (int) var3.field962;
                    if (this.field3123[var5] == 0) {
                        this.method1317(2, 1, var5);
                    }
                    if (this.field3123[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method544(-75);
                    }
                }
                while (this.field3116.field3203.length > this.field3143) {
                    if (this.field3116.field3203[this.field3143] == 0) {
                        this.field3143++;
                    } else {
                        if (this.field3125.field3501 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3123[this.field3143] == 0) {
                            this.method1317(2, 1, this.field3143);
                        }
                        if (this.field3123[this.field3143] == 0) {
                            var2 = false;
                            class69 var4 = new class69();
                            var4.field962 = (long) this.field3143;
                            this.field3141.method363(81, var4);
                        }
                        this.field3143++;
                    }
                }
                if (var2) {
                    this.field3143 = 0;
                    this.field3144 = false;
                }
            } else if (this.field3140) {
                boolean var6 = true;
                for (class69 var7 = this.field3141.method365(3); var7 != null; var7 = this.field3141.method372((byte) 7)) {
                    int var9 = (int) var7.field962;
                    if (this.field3123[var9] != 1) {
                        this.method1317(2, 2, var9);
                    }
                    if (this.field3123[var9] == 1) {
                        var7.method544(91);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3116.field3203.length > this.field3143) {
                    if (this.field3116.field3203[this.field3143] == 0) {
                        this.field3143++;
                    } else {
                        if (this.field3114.method1381(false)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3123[this.field3143] != 1) {
                            this.method1317(2, 2, this.field3143);
                        }
                        if (this.field3123[this.field3143] != 1) {
                            var6 = false;
                            class69 var8 = new class69();
                            var8.field962 = (long) this.field3143;
                            this.field3141.method363(82, var8);
                        }
                        this.field3143++;
                    }
                }
                if (var6) {
                    this.field3143 = 0;
                    this.field3140 = false;
                }
            } else {
                this.field3141 = null;
            }
        }
        if (arg0 > -26) {
            method1307(59, (String[]) null, (byte) -32, -67);
        }
        if (!this.field3146 || this.field3145 > class182.method1253(20215)) {
            return;
        }
        for (class73 var10 = (class73) this.field3129.method465((byte) -98); var10 != null; var10 = (class73) this.field3129.method461((byte) -13)) {
            if (!var10.field998) {
                if (var10.field993) {
                    if (!var10.field999) {
                        throw new RuntimeException();
                    }
                    var10.method544(127);
                } else {
                    var10.field993 = true;
                }
            }
        }
        this.field3145 = class182.method1253(20215) + 1000L;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIII)V")
    public static final void method1319(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3127++;
        if (class156.field2507 <= arg2 && client.field3617 >= arg2) {
            int var5 = class18.method125(-24914, arg1, class121.field2042, class58.field817);
            int var6 = class18.method125(-24914, arg4, class121.field2042, class58.field817);
            class227.method1498(arg3, var5, -48, arg2, var6);
        }
        if (arg0) {
            field3131 = -118;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
    public final void method1320(boolean arg0) {
        field3134++;
        if (this.field3138 != null) {
            this.field3140 = arg0;
            if (this.field3141 == null) {
                this.field3141 = new class48();
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILwh;Lwh;Lgh;Lfe;IIZ)V")
    public class194(int arg0, class9 arg1, class9 arg2, class206 arg3, class218 arg4, int arg5, int arg6, boolean arg7) {
        this.field3138 = arg1;
        this.field3109 = arg0;
        if (this.field3138 == null) {
            this.field3144 = false;
        } else {
            this.field3144 = true;
            this.field3141 = new class48();
        }
        this.field3114 = arg3;
        this.field3139 = arg2;
        this.field3146 = arg7;
        this.field3125 = arg4;
        this.field3137 = arg5;
        this.field3110 = arg6;
        if (this.field3139 != null) {
            this.field3130 = this.field3125.method1451(this.field3109, this.field3139, 0);
        }
    }
}
