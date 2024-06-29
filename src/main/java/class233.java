import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class233 extends class247 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    private int field3244 = 0;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Lfe;")
    private class384 field3241 = new class384(16);

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    private int field3268 = 0;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "Lum;")
    private class347 field3266 = new class347();

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "J")
    private long field3270 = 0L;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "Lek;")
    private class334 field3255;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "Z")
    private boolean field3264;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "Lum;")
    private class347 field3267;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Lt;")
    private class454 field3256;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Lek;")
    private class334 field3248;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "Z")
    private boolean field3271;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Lqc;")
    private class502 field3257;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Lmc;")
    private class83 field3238;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "Liu;")
    public static class390 field3260 = new class390(14, 6);

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "Lwt;")
    public static class194 field3262 = new class194("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "Liu;")
    public static class390 field3269 = new class390(56, 3);

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Lvn;")
    private class195 field3261;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "Z")
    private boolean field3265;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "[B")
    private byte[] field3243;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I", line = 4)
    public final int method1409(int arg0) {
        field3250++;
        if (arg0 != 22097) {
            this.method1411(false);
        }
        if (this.field3261 == null) {
            return 0;
        } else if (this.field3264) {
            class86 var2 = this.field3267.method2096(-21400);
            return var2 == null ? 0 : (int) var2.field1177;
        } else {
            return this.field3261.field2758;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)[B", line = 28)
    public final byte[] method1410(int arg0, byte arg1) {
        if (arg1 < 109) {
            this.field3271 = false;
        }
        field3263++;
        class83 var3 = this.method1413(-1300707992, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method524(-6554);
            var3.method536(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 48)
    public final void method1411(boolean arg0) {
        field3242++;
        if (this.field3267 != null) {
            if (this.method1419((byte) -109) == null) {
                return;
            }
            if (this.field3264) {
                boolean var6 = true;
                for (class86 var7 = this.field3267.method2096(-21400); var7 != null; var7 = this.field3267.method2084((byte) 19)) {
                    int var9 = (int) var7.field1177;
                    if (this.field3243[var9] == 0) {
                        this.method1413(-1300707992, var9, 1);
                    }
                    if (this.field3243[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method536(false);
                    }
                }
                while (this.field3268 < this.field3261.field2751.length) {
                    if (this.field3261.field2751[this.field3268] == 0) {
                        this.field3268++;
                    } else {
                        if (this.field3257.field7675 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3243[this.field3268] == 0) {
                            this.method1413(-1300707992, this.field3268, 1);
                        }
                        if (this.field3243[this.field3268] == 0) {
                            class86 var8 = new class86();
                            var8.field1177 = this.field3268;
                            this.field3267.method2086((byte) -125, var8);
                            var6 = false;
                        }
                        this.field3268++;
                    }
                }
                if (var6) {
                    this.field3268 = 0;
                    this.field3264 = false;
                }
            } else if (this.field3265) {
                boolean var2 = true;
                for (class86 var3 = this.field3267.method2096(-21400); var3 != null; var3 = this.field3267.method2084((byte) 19)) {
                    int var5 = (int) var3.field1177;
                    if (this.field3243[var5] != 1) {
                        this.method1413(-1300707992, var5, 2);
                    }
                    if (this.field3243[var5] == 1) {
                        var3.method536(arg0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3261.field2751.length > this.field3268) {
                    if (this.field3261.field2751[this.field3268] == 0) {
                        this.field3268++;
                    } else {
                        if (this.field3256.method2652(20)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3243[this.field3268] != 1) {
                            this.method1413(-1300707992, this.field3268, 2);
                        }
                        if (this.field3243[this.field3268] != 1) {
                            class86 var4 = new class86();
                            var4.field1177 = this.field3268;
                            var2 = false;
                            this.field3267.method2086((byte) -116, var4);
                        }
                        this.field3268++;
                    }
                }
                if (var2) {
                    this.field3268 = 0;
                    this.field3265 = false;
                }
            } else {
                this.field3267 = null;
            }
        }
        if (this.field3271 && class109.method653(false) >= this.field3270) {
            for (class83 var10 = (class83) this.field3241.method2316(4999); var10 != null; var10 = (class83) this.field3241.method2308((byte) 114)) {
                if (!var10.field1128) {
                    if (var10.field1126) {
                        if (!var10.field1127) {
                            throw new RuntimeException();
                        }
                        var10.method536(false);
                    } else {
                        var10.field1126 = true;
                    }
                }
            }
            this.field3270 = class109.method653(false) + 1000L;
        }
        if (arg0) {
            this.method1419((byte) 112);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 227)
    public final void method1412(int arg0) {
        field3246++;
        if (this.field3267 == null || this.method1419((byte) -122) == null) {
            return;
        }
        class86 var2 = this.field3266.method2096(-21400);
        if (arg0 < 64) {
            this.method1418((byte) -26);
        }
        while (var2 != null) {
            int var3 = (int) var2.field1177;
            if (var3 < 0 || this.field3261.field2761 <= var3 || this.field3261.field2751[var3] == 0) {
                var2.method536(false);
            } else {
                if (this.field3243[var3] == 0) {
                    this.method1413(-1300707992, var3, 1);
                }
                if (this.field3243[var3] == -1) {
                    this.method1413(-1300707992, var3, 2);
                }
                if (this.field3243[var3] == 1) {
                    var2.method536(false);
                }
            }
            var2 = this.field3266.method2084((byte) 19);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Lmc;", line = 273)
    private final class83 method1413(int arg0, int arg1, int arg2) {
        field3239++;
        if (arg0 != -1300707992) {
            this.field3238 = null;
        }
        class83 var4 = (class83) this.field3241.method2310((byte) 95, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field1127 && var4.field1128) {
            var4.method536(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3255 == null || this.field3243[arg1] == -1) {
                    if (this.field3256.method2651(0)) {
                        return null;
                    }
                    var4 = this.field3256.method2643(arg1, this.field3254, (byte) 2, (byte) -30, true);
                } else {
                    var4 = this.field3257.method3024(this.field3255, arg1, 1);
                }
            } else if (arg2 == 1) {
                if (this.field3255 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3257.method3022(2, this.field3255, arg1);
            } else if (arg2 == 2) {
                if (this.field3255 == null) {
                    throw new RuntimeException();
                }
                if (this.field3243[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3256.method2652(20)) {
                    return null;
                }
                var4 = this.field3256.method2643(arg1, this.field3254, (byte) 2, (byte) -30, false);
            } else {
                throw new RuntimeException();
            }
            this.field3241.method2317(-1, (long) arg1, var4);
        }
        if (var4.field1128) {
            return null;
        }
        byte[] var5 = var4.method524(arg0 + 1300701438);
        if (!var4 instanceof class310) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class153.field1957.reset();
                class153.field1957.update(var5, 0, var5.length - 2);
                int var9 = (int) class153.field1957.getValue();
                if (this.field3261.field2752[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field3256.field6620 = 0;
                this.field3256.field6619 = 0;
            } catch (RuntimeException var12) {
                this.field3256.method2649(true);
                var4.method536(false);
                if (var4.field1127 && !this.field3256.method2651(0)) {
                    class225 var10 = this.field3256.method2643(arg1, this.field3254, (byte) 2, (byte) -30, true);
                    this.field3241.method2317(-1, (long) arg1, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3261.field2747[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3261.field2747[arg1];
            if (this.field3255 != null) {
                this.field3257.method3027(this.field3255, 2, arg1, var5);
                if (this.field3243[arg1] != 1) {
                    this.field3244++;
                    this.field3243[arg1] = 1;
                }
            }
            if (!var4.field1127) {
                var4.method536(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class153.field1957.reset();
            class153.field1957.update(var5, 0, var5.length - 2);
            int var6 = (int) class153.field1957.getValue();
            if (this.field3261.field2752[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3261.field2747[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3243[arg1] != 1) {
                this.field3244++;
                this.field3243[arg1] = 1;
            }
            if (!var4.field1127) {
                var4.method536(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field3243[arg1] = -1;
            var4.method536(false);
            if (var4.field1127 && !this.field3256.method2651(0)) {
                class225 var8 = this.field3256.method2643(arg1, this.field3254, (byte) 2, (byte) -30, true);
                this.field3241.method2317(-1, (long) arg1, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 495)
    public final void method1414(int arg0) {
        if (arg0 <= 19) {
            return;
        }
        field3249++;
        if (this.field3255 != null) {
            this.field3265 = true;
            if (this.field3267 == null) {
                this.field3267 = new class347();
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)I", line = 515)
    public final int method1415(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3254 = -7;
        }
        field3240++;
        class83 var3 = (class83) this.field3241.method2310((byte) 86, (long) arg0);
        return var3 == null ? 0 : var3.method526((byte) -92);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 535)
    public static void method1416(byte arg0) {
        field3262 = null;
        field3269 = null;
        if (arg0 != 0) {
            field3262 = null;
        }
        field3260 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V", line = 550)
    public final void method1417(int arg0, int arg1) {
        field3252++;
        if (this.field3255 == null) {
            return;
        }
        int var3 = 34 / ((61 - arg0) / 47);
        for (class86 var4 = this.field3266.method2096(-21400); var4 != null; var4 = this.field3266.method2084((byte) 19)) {
            if ((long) arg1 == var4.field1177) {
                return;
            }
        }
        class86 var5 = new class86();
        var5.field1177 = arg1;
        this.field3266.method2086((byte) -118, var5);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)I", line = 586)
    public final int method1418(byte arg0) {
        field3258++;
        if (this.method1419((byte) -127) == null) {
            return this.field3238 == null ? 0 : this.field3238.method526((byte) -92);
        } else {
            if (arg0 != 10) {
                this.method1419((byte) 19);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lvn;", line = 606)
    public final class195 method1419(byte arg0) {
        field3245++;
        if (this.field3261 != null) {
            return this.field3261;
        }
        if (this.field3238 == null) {
            if (this.field3256.method2651(0)) {
                return null;
            }
            this.field3238 = this.field3256.method2643(this.field3254, 255, (byte) 0, (byte) -30, true);
        }
        if (this.field3238.field1128) {
            return null;
        }
        if (arg0 > -106) {
            field3262 = null;
        }
        byte[] var2 = this.field3238.method524(-6554);
        if (this.field3238 instanceof class310) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3261 = new class195(var2, this.field3253);
                if (this.field3261.field2757 != this.field3251) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3261 = null;
                if (this.field3256.method2651(0)) {
                    this.field3238 = null;
                } else {
                    this.field3238 = this.field3256.method2643(this.field3254, 255, (byte) 0, (byte) -30, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3261 = new class195(var2, this.field3253);
            } catch (RuntimeException var4) {
                this.field3256.method2649(true);
                this.field3261 = null;
                if (this.field3256.method2651(0)) {
                    this.field3238 = null;
                } else {
                    this.field3238 = this.field3256.method2643(this.field3254, 255, (byte) 0, (byte) -30, true);
                }
                return null;
            }
            if (this.field3248 != null) {
                this.field3257.method3027(this.field3248, 2, this.field3254, var2);
            }
        }
        if (this.field3255 != null) {
            this.field3244 = 0;
            this.field3243 = new byte[this.field3261.field2761];
        }
        this.field3238 = null;
        return this.field3261;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)I", line = 703)
    public final int method1420(byte arg0) {
        field3247++;
        if (arg0 != -77) {
            this.field3256 = null;
        }
        return this.field3261 == null ? 0 : this.field3261.field2758;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILek;Lek;Lt;Lqc;IIZ)V", line = 768)
    public class233(int arg0, class334 arg1, class334 arg2, class454 arg3, class502 arg4, int arg5, int arg6, boolean arg7) {
        this.field3254 = arg0;
        this.field3255 = arg1;
        if (this.field3255 == null) {
            this.field3264 = false;
        } else {
            this.field3264 = true;
            this.field3267 = new class347();
        }
        this.field3251 = arg6;
        this.field3256 = arg3;
        this.field3248 = arg2;
        this.field3271 = arg7;
        this.field3253 = arg5;
        this.field3257 = arg4;
        if (this.field3248 != null) {
            this.field3238 = this.field3257.method3024(this.field3248, this.field3254, 1);
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I", line = 725)
    public final int method1421(int arg0) {
        if (arg0 == -30995) {
            field3259++;
            return this.field3244;
        } else {
            return -11;
        }
    }
}
