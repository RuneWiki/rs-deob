import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class217 extends class258 {

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private int field3212 = 0;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lh;")
    private class190 field3204 = new class190(16);

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field3218 = 0;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Lag;")
    private class97 field3215 = new class97();

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "J")
    private long field3220 = 0L;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Lac;")
    private class141 field3213;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Z")
    private boolean field3217;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "Lag;")
    private class97 field3216;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lqi;")
    private class266 field3205;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
    private boolean field3219;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lac;")
    private class141 field3211;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lud;")
    private class247 field3187;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lwc;")
    private class87 field3200;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
    public static boolean field3209 = false;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lqj;")
    private class221 field3206;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lu;")
    public static class223 field3198;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lrg;")
    public static class81 field3210;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Z")
    private boolean field3214;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "[B")
    private byte[] field3199;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Z)I")
    public final int method1387(boolean arg0) {
        if (!arg0) {
            this.field3208 = 66;
        }
        field3185++;
        return this.field3212;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(Z)I")
    public final int method1388(boolean arg0) {
        if (!arg0) {
            this.field3214 = true;
        }
        field3203++;
        if (this.method1397(118) == null) {
            return this.field3200 == null ? 0 : this.field3200.method596(-899);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method1389(byte arg0) {
        field3210 = null;
        if (arg0 != -95) {
            field3209 = false;
        }
        field3198 = null;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I")
    public final int method1390(int arg0, int arg1) {
        if (arg0 == 0) {
            field3183++;
            class87 var3 = (class87) this.field3204.method1218((long) arg1, arg0 ^ 0xFFFFFF87);
            return var3 == null ? 0 : var3.method596(arg0 ^ 0xFFFFFC7D);
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    public final void method1391(int arg0, int arg1) {
        field3190++;
        if (this.field3213 == null) {
            return;
        }
        for (class254 var3 = this.field3215.method656(116); var3 != null; var3 = this.field3215.method650(126)) {
            if ((long) arg0 == var3.field3851) {
                return;
            }
        }
        class254 var4 = new class254();
        if (arg1 != 100) {
            field3198 = null;
        }
        var4.field3851 = (long) arg0;
        this.field3215.method652(115, var4);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
    public final int method1392(byte arg0) {
        if (arg0 > -19) {
            this.field3219 = false;
        }
        field3191++;
        if (this.field3206 == null) {
            return 0;
        } else if (this.field3217) {
            class254 var2 = this.field3216.method656(122);
            return var2 == null ? 0 : (int) var2.field3851;
        } else {
            return this.field3206.field3273;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
    public final int method1393(int arg0) {
        field3189++;
        if (this.field3206 == null) {
            return 0;
        } else {
            if (arg0 >= -112) {
                this.field3215 = null;
            }
            return this.field3206.field3273;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[B")
    public final byte[] method1394(int arg0, int arg1) {
        field3201++;
        class87 var3 = this.method1400(1, arg1, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method594(true);
            var3.method1706(-60);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZB)V")
    public static final void method1395(boolean arg0, byte arg1) {
        field3192++;
        if (arg0 == class240.field3610) {
            return;
        }
        class240.field3610 = arg0;
        if (arg1 >= -60) {
            field3197 = -115;
        }
        class158.method1063(false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLha;)V")
    public static final void method1396(boolean arg0, class267 arg1) {
        if (class94.field1432 == arg1.field4031) {
            class21.field278[arg1.field4061] = true;
        }
        if (arg0) {
            method1399(-113, 52, -28, 94);
        }
        field3202++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lqj;")
    public final class221 method1397(int arg0) {
        field3182++;
        if (this.field3206 != null) {
            return this.field3206;
        }
        if (this.field3200 == null) {
            if (this.field3187.method1620(-123)) {
                return null;
            }
            this.field3200 = this.field3187.method1621((byte) 0, true, 33, this.field3208, 255);
        }
        if (this.field3200.field1339) {
            return null;
        }
        if (arg0 < 84) {
            this.field3220 = -92L;
        }
        byte[] var2 = this.field3200.method594(true);
        if (this.field3200 instanceof class203) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3206 = new class221(var2, this.field3196);
                if (this.field3206.field3283 != this.field3186) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3206 = null;
                if (this.field3187.method1620(-119)) {
                    this.field3200 = null;
                } else {
                    this.field3200 = this.field3187.method1621((byte) 0, true, -20, this.field3208, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3206 = new class221(var2, this.field3196);
            } catch (RuntimeException var4) {
                this.field3187.method1628(-1);
                this.field3206 = null;
                if (this.field3187.method1620(-122)) {
                    this.field3200 = null;
                } else {
                    this.field3200 = this.field3187.method1621((byte) 0, true, 104, this.field3208, 255);
                }
                return null;
            }
            if (this.field3211 != null) {
                this.field3205.method1771(var2, this.field3208, this.field3211, (byte) 67);
            }
        }
        this.field3200 = null;
        if (this.field3213 != null) {
            this.field3212 = 0;
            this.field3199 = new byte[this.field3206.field3262];
        }
        return this.field3206;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public final void method1398(int arg0) {
        if (arg0 <= 67) {
            this.field3200 = null;
        }
        field3188++;
        if (this.field3213 != null) {
            this.field3214 = true;
            if (this.field3216 == null) {
                this.field3216 = new class97();
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
    public static final int method1399(int arg0, int arg1, int arg2, int arg3) {
        field3207++;
        int var4 = arg2 / arg3;
        int var5 = arg3 - 1 & arg2;
        int var6 = arg0 / arg3;
        if (arg1 >= -81) {
            field3209 = false;
        }
        int var7 = arg0 & arg3 - 1;
        int var8 = class45.method300(var6, var4, 9089);
        int var9 = class45.method300(var6, var4 + 1, 9089);
        int var10 = class45.method300(var6 + 1, var4, 9089);
        int var11 = class45.method300(var6 + 1, var4 + 1, 9089);
        int var12 = class270.method1805(true, arg3, var5, var9, var8);
        int var13 = class270.method1805(true, arg3, var5, var11, var10);
        return class270.method1805(true, arg3, var7, var13, var12);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lwc;")
    private final class87 method1400(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.field3186 = -83;
        }
        field3194++;
        class87 var4 = (class87) this.field3204.method1218((long) arg2, -55);
        if (var4 != null && arg1 == 0 && !var4.field1346 && var4.field1339) {
            var4.method1706(-93);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3213 == null || this.field3199[arg2] == -1) {
                    if (this.field3187.method1620(-121)) {
                        return null;
                    }
                    var4 = this.field3187.method1621((byte) 2, true, arg0 + 114, arg2, this.field3208);
                } else {
                    var4 = this.field3205.method1772((byte) -49, this.field3213, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field3213 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3205.method1769(arg2, this.field3213, 31485);
            } else if (arg1 == 2) {
                if (this.field3213 == null) {
                    throw new RuntimeException();
                }
                if (this.field3199[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3187.method1617((byte) 68)) {
                    return null;
                }
                var4 = this.field3187.method1621((byte) 2, false, -95, arg2, this.field3208);
            } else {
                throw new RuntimeException();
            }
            this.field3204.method1215(var4, -107, (long) arg2);
        }
        if (var4.field1339) {
            return null;
        }
        byte[] var5 = var4.method594(true);
        if (!var4 instanceof class203) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class94.field1431.reset();
                class94.field1431.update(var5, 0, var5.length - 2);
                int var6 = (int) class94.field1431.getValue();
                if (this.field3206.field3275[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field3187.field3717 = 0;
                this.field3187.field3719 = 0;
            } catch (RuntimeException var12) {
                this.field3187.method1628(arg0 ^ 0xFFFFFFFE);
                var4.method1706(arg0 - 127);
                if (var4.field1346 && !this.field3187.method1620(-128)) {
                    class118 var7 = this.field3187.method1621((byte) 2, true, -101, arg2, this.field3208);
                    this.field3204.method1215(var7, -94, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3206.field3258[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3206.field3258[arg2];
            if (this.field3213 != null) {
                this.field3205.method1771(var5, arg2, this.field3213, (byte) 67);
                if (this.field3199[arg2] != 1) {
                    this.field3212++;
                    this.field3199[arg2] = 1;
                }
            }
            if (!var4.field1346) {
                var4.method1706(arg0 ^ 0xFFFFFF8C);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class94.field1431.reset();
            class94.field1431.update(var5, 0, var5.length - 2);
            int var8 = (int) class94.field1431.getValue();
            if (this.field3206.field3275[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3206.field3258[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field3199[arg2] != 1) {
                this.field3212++;
                this.field3199[arg2] = 1;
            }
            if (!var4.field1346) {
                var4.method1706(-85);
            }
            return var4;
        } catch (Exception var11) {
            this.field3199[arg2] = -1;
            var4.method1706(-70);
            if (var4.field1346 && !this.field3187.method1620(-128)) {
                class118 var10 = this.field3187.method1621((byte) 2, true, 42, arg2, this.field3208);
                this.field3204.method1215(var10, arg0 - 108, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public final void method1401(byte arg0) {
        field3193++;
        if (this.field3216 != null) {
            if (this.method1397(101) == null) {
                return;
            }
            if (this.field3217) {
                boolean var2 = true;
                for (class254 var3 = this.field3216.method656(114); var3 != null; var3 = this.field3216.method650(125)) {
                    int var5 = (int) var3.field3851;
                    if (this.field3199[var5] == 0) {
                        this.method1400(1, 1, var5);
                    }
                    if (this.field3199[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1706(-81);
                    }
                }
                while (this.field3206.field3267.length > this.field3218) {
                    if (this.field3206.field3267[this.field3218] == 0) {
                        this.field3218++;
                    } else {
                        if (this.field3205.field4016 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3199[this.field3218] == 0) {
                            this.method1400(1, 1, this.field3218);
                        }
                        if (this.field3199[this.field3218] == 0) {
                            class254 var4 = new class254();
                            var4.field3851 = (long) this.field3218;
                            var2 = false;
                            this.field3216.method652(122, var4);
                        }
                        this.field3218++;
                    }
                }
                if (var2) {
                    this.field3218 = 0;
                    this.field3217 = false;
                }
            } else if (this.field3214) {
                boolean var6 = true;
                for (class254 var7 = this.field3216.method656(arg0 + 113); var7 != null; var7 = this.field3216.method650(126)) {
                    int var9 = (int) var7.field3851;
                    if (this.field3199[var9] != 1) {
                        this.method1400(1, 2, var9);
                    }
                    if (this.field3199[var9] == 1) {
                        var7.method1706(arg0 - 79);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3218 < this.field3206.field3267.length) {
                    if (this.field3206.field3267[this.field3218] == 0) {
                        this.field3218++;
                    } else {
                        if (this.field3187.method1617((byte) 70)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3199[this.field3218] != 1) {
                            this.method1400(arg0, 2, this.field3218);
                        }
                        if (this.field3199[this.field3218] != 1) {
                            var6 = false;
                            class254 var8 = new class254();
                            var8.field3851 = (long) this.field3218;
                            this.field3216.method652(arg0 ^ 0x41, var8);
                        }
                        this.field3218++;
                    }
                }
                if (var6) {
                    this.field3218 = 0;
                    this.field3214 = false;
                }
            } else {
                this.field3216 = null;
            }
        }
        if (arg0 != 1 || !this.field3219 || this.field3220 > class287.method1928(arg0 ^ 0x6AC5)) {
            return;
        }
        for (class87 var10 = (class87) this.field3204.method1219(1); var10 != null; var10 = (class87) this.field3204.method1223(72)) {
            if (!var10.field1339) {
                if (var10.field1343) {
                    if (!var10.field1346) {
                        throw new RuntimeException();
                    }
                    var10.method1706(-70);
                } else {
                    var10.field1343 = true;
                }
            }
        }
        this.field3220 = class287.method1928(arg0 ^ 0x6AC5) + 1000L;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
    public static final void method1402(int arg0, byte arg1) {
        field3184++;
        class178.field2541.method258(arg0, (byte) 101);
        int var2 = -112 % ((-arg1 - 59) / 41);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public final void method1403(byte arg0) {
        field3195++;
        if (this.field3216 == null) {
            return;
        }
        if (arg0 != -76) {
            this.field3200 = null;
        }
        if (this.method1397(108) == null) {
            return;
        }
        for (class254 var2 = this.field3215.method656(arg0 + 197); var2 != null; var2 = this.field3215.method650(125)) {
            int var3 = (int) var2.field3851;
            if (var3 < 0 || this.field3206.field3262 <= var3 || this.field3206.field3267[var3] == 0) {
                var2.method1706(-74);
            } else {
                if (this.field3199[var3] == 0) {
                    this.method1400(1, 1, var3);
                }
                if (this.field3199[var3] == -1) {
                    this.method1400(1, 2, var3);
                }
                if (this.field3199[var3] == 1) {
                    var2.method1706(-110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILac;Lac;Lud;Lqi;IIZ)V")
    public class217(int arg0, class141 arg1, class141 arg2, class247 arg3, class266 arg4, int arg5, int arg6, boolean arg7) {
        this.field3213 = arg1;
        this.field3208 = arg0;
        if (this.field3213 == null) {
            this.field3217 = false;
        } else {
            this.field3217 = true;
            this.field3216 = new class97();
        }
        this.field3205 = arg4;
        this.field3219 = arg7;
        this.field3211 = arg2;
        this.field3196 = arg5;
        this.field3187 = arg3;
        this.field3186 = arg6;
        if (this.field3211 != null) {
            this.field3200 = this.field3205.method1772((byte) -49, this.field3211, this.field3208);
        }
    }
}
