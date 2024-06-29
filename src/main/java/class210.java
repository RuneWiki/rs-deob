import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class210 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field3232 = -1;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field3231 = -1;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field3234 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public int field3254 = -1;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
    public boolean field3237 = true;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Z")
    public boolean field3266 = false;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field3262 = new String[5];

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public int field3248 = -1;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public int field3261 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    private int field3268 = -1;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field3264 = -1;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public int field3272 = -1;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field3244 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Z")
    public boolean field3260 = true;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public int field3271 = -1;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field3243 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public int field3263 = 0;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    private int field3275 = -1;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Z")
    public boolean field3274 = true;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "J")
    public static long field3245 = 0L;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lss;")
    public static class213 field3235 = new class213("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Lru;")
    private class177 field3270;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Lfq;")
    public class98 field3258;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Ljava/lang/String;")
    public String field3249;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/lang/String;")
    public String field3251;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[I")
    public int[] field3253;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
    public final String method1483(int arg0, String arg1, boolean arg2) {
        field3242++;
        if (this.field3270 == null) {
            return arg1;
        }
        class446 var4 = (class446) this.field3270.method1122((byte) 59, (long) arg0);
        if (arg2) {
            return var4 == null ? arg1 : var4.field6916;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgi;I)Ljava/lang/String;")
    public static final String method1484(class437 arg0, int arg1) {
        field3238++;
        if (client.method492(arg0).method2913(-98) == arg1) {
            return null;
        } else if (arg0.field6669 == null || arg0.field6669.trim().length() == 0) {
            return class223.field3757 ? "Hidden-use" : null;
        } else {
            return arg0.field6669;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZBLza;)Lo;")
    public final class139 method1485(boolean arg0, byte arg1, class497 arg2) {
        field3246++;
        int var4 = arg0 ? this.field3271 : this.field3254;
        int var5 = arg2.field7472 << 29 | var4;
        class139 var6 = (class139) this.field3258.field1415.method2191((byte) -73, (long) var5);
        if (var6 != null) {
            return var6;
        }
        if (arg1 < 31) {
            this.field3243 = 5;
        }
        if (!this.field3258.field1410.method1012(var4, true)) {
            return null;
        }
        class175 var7 = class175.method1115(this.field3258.field1410, var4, 0);
        if (var7 != null) {
            var6 = arg2.method1278(var7, true);
            this.field3258.field1415.method2188(-122, (long) var5, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhw;IB)V")
    private final void method1486(class208 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3254 = arg0.method1455(-3387);
        } else if (arg1 == 2) {
            this.field3271 = arg0.method1455(-3387);
        } else if (arg1 == 3) {
            this.field3249 = arg0.method1448(65535);
        } else if (arg1 == 4) {
            this.field3257 = arg0.method1452(3);
        } else if (arg1 == 5) {
            this.field3248 = arg0.method1452(3);
        } else if (arg1 == 6) {
            this.field3263 = arg0.method1445(-82);
        } else if (arg1 == 7) {
            int var4 = arg0.method1445(-87);
            if ((var4 & 0x1) == 0) {
                this.field3260 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field3266 = true;
            }
        } else if (arg1 == 8) {
            this.field3237 = arg0.method1445(53) == 1;
        } else if (arg1 == 9) {
            this.field3268 = arg0.method1455(-3387);
            if (this.field3268 == 65535) {
                this.field3268 = -1;
            }
            this.field3231 = arg0.method1455(-3387);
            if (this.field3231 == 65535) {
                this.field3231 = -1;
            }
            this.field3256 = arg0.method1436((byte) 123);
            this.field3241 = arg0.method1436((byte) 109);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3262[arg1 - 10] = arg0.method1448(65535);
        } else if (arg1 == 15) {
            int var5 = arg0.method1445(85);
            this.field3253 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field3253[var6] = arg0.method1456(13329);
            }
            this.field3236 = arg0.method1436((byte) 113);
            this.field3230 = arg0.method1436((byte) 100);
        } else if (arg1 == 16) {
            this.field3274 = false;
        } else if (arg1 == 17) {
            this.field3251 = arg0.method1448(65535);
        } else if (arg1 == 18) {
            this.field3232 = arg0.method1455(-3387);
        } else if (arg1 == 19) {
            this.field3272 = arg0.method1455(-3387);
        } else if (arg1 == 20) {
            this.field3264 = arg0.method1455(-3387);
            if (this.field3264 == 65535) {
                this.field3264 = -1;
            }
            this.field3275 = arg0.method1455(-3387);
            if (this.field3275 == 65535) {
                this.field3275 = -1;
            }
            this.field3255 = arg0.method1436((byte) 94);
            this.field3240 = arg0.method1436((byte) 116);
        } else if (arg1 == 21) {
            this.field3252 = arg0.method1436((byte) 86);
        } else if (arg1 == 22) {
            this.field3250 = arg0.method1436((byte) 90);
        } else if (arg1 == 249) {
            int var7 = arg0.method1445(-91);
            if (this.field3270 == null) {
                int var8 = class123.method774(-116, var7);
                this.field3270 = new class177(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg0.method1445(-124) == 1;
                int var11 = arg0.method1452(3);
                class529 var12;
                if (var10) {
                    var12 = new class446(arg0.method1448(65535));
                } else {
                    var12 = new class330(arg0.method1436((byte) 95));
                }
                this.field3270.method1127(var12, (byte) 93, (long) var11);
            }
        }
        if (arg2 < 76) {
            this.method1485(false, (byte) -84, null);
        }
        field3269++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)I")
    public final int method1487(int arg0, byte arg1, int arg2) {
        field3239++;
        if (this.field3270 == null) {
            return arg2;
        } else if (arg1 >= -83) {
            return 116;
        } else {
            class330 var4 = (class330) this.field3270.method1122((byte) 59, (long) arg0);
            return var4 == null ? arg2 : var4.field5185;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1488(int arg0) {
        field3235 = null;
        int var1 = -120 / ((32 - arg0) / 46);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLrd;)Z")
    public final boolean method1489(byte arg0, class353 arg1) {
        field3247++;
        int var3;
        if (this.field3231 == -1) {
            if (this.field3268 == -1) {
                return true;
            }
            var3 = arg1.method1979(this.field3268, 0);
        } else {
            var3 = arg1.method1982(true, this.field3231);
        }
        if (this.field3256 > var3 || var3 > this.field3241) {
            return false;
        } else if (arg0 > -119) {
            return false;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field3275 == -1) {
                if (this.field3264 == -1) {
                    return true;
                }
                var5 = arg1.method1979(this.field3264, 0);
            } else {
                var5 = arg1.method1982(true, this.field3275);
            }
            return this.field3255 <= var5 && var5 <= this.field3240;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public final void method1490(byte arg0) {
        if (this.field3253 != null) {
            for (int var2 = 0; var2 < this.field3253.length; var2 += 2) {
                if (this.field3244 > this.field3253[var2]) {
                    this.field3244 = this.field3253[var2];
                } else if (this.field3234 < this.field3253[var2]) {
                    this.field3234 = this.field3253[var2];
                }
                if (this.field3261 > this.field3253[var2 + 1]) {
                    this.field3261 = this.field3253[var2 + 1];
                } else if (this.field3253[var2 + 1] > this.field3243) {
                    this.field3243 = this.field3253[var2 + 1];
                }
            }
        }
        field3267++;
        int var3 = -14 / ((-arg0 - 4) / 56);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lza;Z)Lo;")
    public final class139 method1491(class497 arg0, boolean arg1) {
        field3265++;
        class139 var3 = (class139) this.field3258.field1415.method2191((byte) -73, (long) (arg0.field7472 << 29 | this.field3232 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        this.field3258.field1410.method1012(this.field3232, arg1);
        class175 var4 = class175.method1115(this.field3258.field1410, this.field3232, 0);
        if (var4 != null) {
            var3 = arg0.method1278(var4, true);
            this.field3258.field1415.method2188(-128, (long) (arg0.field7472 << 29 | 0x20000 | this.field3232), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILhw;)V")
    public final void method1492(int arg0, class208 arg1) {
        while (true) {
            int var3 = arg1.method1445(85);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field3257 = -102;
                }
                field3259++;
                return;
            }
            this.method1486(arg1, var3, (byte) 100);
        }
    }
}
