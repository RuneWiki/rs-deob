import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class377 extends class362 {

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    private int field5348 = 0;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "Ljj;")
    private class156 field5353 = new class156(16);

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    private int field5360 = 0;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "Lvq;")
    private class22 field5366 = new class22();

    @OriginalMember(owner = "client!os", name = "V", descriptor = "J")
    private long field5371 = 0L;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Luf;")
    private class281 field5331;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    private int field5354;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "Z")
    private boolean field5363;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "Lvq;")
    private class22 field5365;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Luf;")
    private class281 field5336;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    private int field5347;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "Z")
    private boolean field5370;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "Lid;")
    private class240 field5346;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "Lka;")
    private class406 field5343;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "Lmm;")
    private class355 field5357;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field5339 = -1;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Ldp;")
    public static class174 field5337;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "Ll;")
    private class260 field5340;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "Z")
    private boolean field5367;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "[B")
    private byte[] field5345;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[I")
    public static int[] field5341;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "[Lsf;")
    public static class143[] field5352;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[Ljo;")
    public static class218[] field5333;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)I", line = 3)
    public static final int method2387(int arg0) {
        if (arg0 < 90) {
            method2389((byte) -43);
        }
        field5355++;
        return 2;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 14)
    public final void method2388(boolean arg0) {
        field5361++;
        if (!arg0) {
            this.method2319(39, (byte) 31);
        }
        if (this.field5365 == null || this.method2320(8658) == null) {
            return;
        }
        for (class35 var2 = this.field5366.method157((byte) -125); var2 != null; var2 = this.field5366.method145(28)) {
            int var3 = (int) var2.field499;
            if (var3 < 0 || this.field5340.field3915 <= var3 || this.field5340.field3928[var3] == 0) {
                var2.method251(111);
            } else {
                if (this.field5345[var3] == 0) {
                    this.method2392(43, var3, 1);
                }
                if (this.field5345[var3] == -1) {
                    this.method2392(70, var3, 2);
                }
                if (this.field5345[var3] == 1) {
                    var2.method251(110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 58)
    public static void method2389(byte arg0) {
        field5352 = null;
        field5337 = null;
        if (arg0 != 46) {
            field5352 = null;
        }
        field5333 = null;
        field5341 = null;
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V", line = 72)
    public static final void method2390(int arg0) {
        class286.field4285++;
        field5338++;
        class13.field216.method2781(false, 153);
        if (arg0 != 23895) {
            method2389((byte) 71);
        }
        class13.field216.method324(class51.field826, -105);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Ll;", line = 85)
    public final class260 method2320(int arg0) {
        field5362++;
        if (this.field5340 != null) {
            return this.field5340;
        }
        if (this.field5357 == null) {
            if (this.field5343.method2560(true)) {
                return null;
            }
            this.field5357 = this.field5343.method2571((byte) 0, 255, true, this.field5354, false);
        }
        if (this.field5357.field5053) {
            return null;
        }
        if (arg0 != 8658) {
            this.field5336 = null;
        }
        byte[] var2 = this.field5357.method1883(-100);
        if (this.field5357 instanceof class263) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5340 = new class260(var2, this.field5347);
                if (this.field5340.field3932 != this.field5359) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5340 = null;
                if (this.field5343.method2560(true)) {
                    this.field5357 = null;
                } else {
                    this.field5357 = this.field5343.method2571((byte) 0, 255, true, this.field5354, false);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5340 = new class260(var2, this.field5347);
            } catch (RuntimeException var4) {
                this.field5343.method2570(arg0 ^ 0x5F6);
                this.field5340 = null;
                if (this.field5343.method2560(true)) {
                    this.field5357 = null;
                } else {
                    this.field5357 = this.field5343.method2571((byte) 0, 255, true, this.field5354, false);
                }
                return null;
            }
            if (this.field5336 != null) {
                this.field5346.method1747(this.field5354, var2, 30361, this.field5336);
            }
        }
        this.field5357 = null;
        if (this.field5331 != null) {
            this.field5345 = new byte[this.field5340.field3915];
            this.field5348 = 0;
        }
        return this.field5340;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)[B", line = 196)
    public final byte[] method2322(int arg0, int arg1) {
        if (arg1 != -1400) {
            this.method2392(5, -5, -115);
        }
        field5368++;
        class355 var3 = this.method2392(96, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1883(60);
            var3.method251(arg1 + 1442);
            return var4;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I", line = 221)
    public final int method2317(int arg0, int arg1) {
        field5356++;
        if (arg1 != 528) {
            this.field5367 = false;
        }
        class355 var3 = (class355) this.field5353.method1219((long) arg0, -89);
        return var3 == null ? 0 : var3.method1884(-114);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)I", line = 244)
    public final int method2391(byte arg0) {
        if (arg0 == -15) {
            field5335++;
            return this.field5340 == null ? 0 : this.field5340.field3920;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Lmm;", line = 258)
    private final class355 method2392(int arg0, int arg1, int arg2) {
        field5364++;
        if (arg0 < 41) {
            this.method2398((byte) 61);
        }
        class355 var4 = (class355) this.field5353.method1219((long) arg1, -112);
        if (var4 != null && arg2 == 0 && !var4.field5052 && var4.field5053) {
            var4.method251(64);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5331 == null || this.field5345[arg1] == -1) {
                    if (this.field5343.method2560(true)) {
                        return null;
                    }
                    var4 = this.field5343.method2571((byte) 2, this.field5354, true, arg1, false);
                } else {
                    var4 = this.field5346.method1753(2048, arg1, this.field5331);
                }
            } else if (arg2 == 1) {
                if (this.field5331 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5346.method1750(-37, arg1, this.field5331);
            } else if (arg2 == 2) {
                if (this.field5331 == null) {
                    throw new RuntimeException();
                }
                if (this.field5345[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5343.method2563(true)) {
                    return null;
                }
                var4 = this.field5343.method2571((byte) 2, this.field5354, false, arg1, false);
            } else {
                throw new RuntimeException();
            }
            this.field5353.method1217(1, (long) arg1, var4);
        }
        if (var4.field5053) {
            return null;
        }
        byte[] var5 = var4.method1883(-5);
        if (!var4 instanceof class263) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class30.field430.reset();
                class30.field430.update(var5, 0, var5.length - 2);
                int var9 = (int) class30.field430.getValue();
                if (this.field5340.field3925[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field5343.field5926 = 0;
                this.field5343.field5925 = 0;
            } catch (RuntimeException var12) {
                this.field5343.method2570(9252);
                var4.method251(118);
                if (var4.field5052 && !this.field5343.method2560(true)) {
                    class306 var10 = this.field5343.method2571((byte) 2, this.field5354, true, arg1, false);
                    this.field5353.method1217(1, (long) arg1, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5340.field3930[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field5340.field3930[arg1];
            if (this.field5331 != null) {
                this.field5346.method1747(arg1, var5, 30361, this.field5331);
                if (this.field5345[arg1] != 1) {
                    this.field5348++;
                    this.field5345[arg1] = 1;
                }
            }
            if (!var4.field5052) {
                var4.method251(88);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class30.field430.reset();
            class30.field430.update(var5, 0, var5.length - 2);
            int var6 = (int) class30.field430.getValue();
            if (this.field5340.field3925[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5340.field3930[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5345[arg1] != 1) {
                this.field5348++;
                this.field5345[arg1] = 1;
            }
            if (!var4.field5052) {
                var4.method251(64);
            }
            return var4;
        } catch (Exception var11) {
            this.field5345[arg1] = -1;
            var4.method251(13);
            if (var4.field5052 && !this.field5343.method2560(true)) {
                class306 var8 = this.field5343.method2571((byte) 2, this.field5354, true, arg1, false);
                this.field5353.method1217(1, (long) arg1, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILuf;Luf;Lka;Lid;IIZ)V", line = 876)
    public class377(int arg0, class281 arg1, class281 arg2, class406 arg3, class240 arg4, int arg5, int arg6, boolean arg7) {
        this.field5331 = arg1;
        this.field5354 = arg0;
        if (this.field5331 == null) {
            this.field5363 = false;
        } else {
            this.field5363 = true;
            this.field5365 = new class22();
        }
        this.field5359 = arg6;
        this.field5336 = arg2;
        this.field5347 = arg5;
        this.field5370 = arg7;
        this.field5346 = arg4;
        this.field5343 = arg3;
        if (this.field5336 != null) {
            this.field5357 = this.field5346.method1753(2048, this.field5354, this.field5336);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLmb;)V", line = 480)
    public static final void method2393(boolean arg0, class258 arg1) {
        field5350++;
        if (!arg0) {
            method2387(101);
        }
        int var2 = arg1.field3821;
        if (var2 == 324) {
            if (class150.field2303 == -1) {
                class383.field5491 = arg1.field3786;
                class150.field2303 = arg1.field3810;
            }
            if (class333.field4770.field2346) {
                arg1.field3810 = class150.field2303;
            } else {
                arg1.field3810 = class383.field5491;
            }
        } else if (var2 == 325) {
            if (class150.field2303 == -1) {
                class150.field2303 = arg1.field3810;
                class383.field5491 = arg1.field3786;
            }
            if (class333.field4770.field2346) {
                arg1.field3810 = class383.field5491;
            } else {
                arg1.field3810 = class150.field2303;
            }
        } else if (var2 == 327) {
            arg1.field3771 = 150;
            arg1.field3889 = (int) (Math.sin((double) class267.field4002 / 40.0D) * 256.0D) & 0x3FFF;
            arg1.field3858 = 5;
            arg1.field3864 = -1;
        } else if (var2 == 328) {
            if (class86.field1394.field2066 == null) {
                arg1.field3872 = 0;
                arg1.field3864 = 0;
            } else {
                arg1.field3771 = 150;
                arg1.field3889 = (int) (Math.sin((double) class267.field4002 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3858 = 5;
                arg1.field3864 = 2047;
                arg1.field3872 = class88.method660((byte) 80, class86.field1394.field2066);
                arg1.field3731 = class86.field1394.field5608;
                arg1.field3894 = 0;
                arg1.field3828 = class86.field1394.field5642;
                arg1.field3811 = class86.field1394.field5659;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V", line = 562)
    public final void method2394(byte arg0) {
        if (arg0 != 7) {
            field5369 = 10;
        }
        field5332++;
        if (this.field5365 != null) {
            if (this.method2320(arg0 + 8651) == null) {
                return;
            }
            if (this.field5363) {
                boolean var6 = true;
                for (class35 var7 = this.field5365.method157((byte) -125); var7 != null; var7 = this.field5365.method145(93)) {
                    int var9 = (int) var7.field499;
                    if (this.field5345[var9] == 0) {
                        this.method2392(arg0 + 97, var9, 1);
                    }
                    if (this.field5345[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method251(108);
                    }
                }
                while (this.field5340.field3928.length > this.field5360) {
                    if (this.field5340.field3928[this.field5360] == 0) {
                        this.field5360++;
                    } else {
                        if (this.field5346.field3473 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field5345[this.field5360] == 0) {
                            this.method2392(74, this.field5360, 1);
                        }
                        if (this.field5345[this.field5360] == 0) {
                            class35 var8 = new class35();
                            var8.field499 = (long) this.field5360;
                            this.field5365.method148((byte) 99, var8);
                            var6 = false;
                        }
                        this.field5360++;
                    }
                }
                if (var6) {
                    this.field5360 = 0;
                    this.field5363 = false;
                }
            } else if (this.field5367) {
                boolean var2 = true;
                for (class35 var3 = this.field5365.method157((byte) -125); var3 != null; var3 = this.field5365.method145(93)) {
                    int var5 = (int) var3.field499;
                    if (this.field5345[var5] != 1) {
                        this.method2392(arg0 + 106, var5, 2);
                    }
                    if (this.field5345[var5] == 1) {
                        var3.method251(48);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field5360 < this.field5340.field3928.length) {
                    if (this.field5340.field3928[this.field5360] == 0) {
                        this.field5360++;
                    } else {
                        if (this.field5343.method2563(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field5345[this.field5360] != 1) {
                            this.method2392(93, this.field5360, 2);
                        }
                        if (this.field5345[this.field5360] != 1) {
                            class35 var4 = new class35();
                            var4.field499 = (long) this.field5360;
                            var2 = false;
                            this.field5365.method148((byte) 113, var4);
                        }
                        this.field5360++;
                    }
                }
                if (var2) {
                    this.field5367 = false;
                    this.field5360 = 0;
                }
            } else {
                this.field5365 = null;
            }
        }
        if (!this.field5370 || class10.method63(-21149) < this.field5371) {
            return;
        }
        for (class355 var10 = (class355) this.field5353.method1222(5656); var10 != null; var10 = (class355) this.field5353.method1224((byte) -97)) {
            if (!var10.field5053) {
                if (var10.field5051) {
                    if (!var10.field5052) {
                        throw new RuntimeException();
                    }
                    var10.method251(25);
                } else {
                    var10.field5051 = true;
                }
            }
        }
        this.field5371 = class10.method63(arg0 ^ 0xFFFFAD64) + 1000L;
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I", line = 753)
    public final int method2395(int arg0) {
        field5351++;
        if (this.field5340 == null) {
            return 0;
        }
        if (arg0 != -3202) {
            this.method2388(true);
        }
        if (this.field5363) {
            class35 var2 = this.field5365.method157((byte) -125);
            return var2 == null ? 0 : (int) var2.field499;
        } else {
            return this.field5340.field3920;
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)I", line = 780)
    public final int method2396(int arg0) {
        if (arg0 != 2) {
            this.field5336 = null;
        }
        field5344++;
        return this.field5348;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V", line = 797)
    public final void method2319(int arg0, byte arg1) {
        field5342++;
        if (this.field5331 == null) {
            return;
        }
        for (class35 var3 = this.field5366.method157((byte) -125); var3 != null; var3 = this.field5366.method145(-107)) {
            if (((long) arg0) == var3.field499) {
                return;
            }
        }
        if (arg1 >= -29) {
            this.method2395(85);
        }
        class35 var4 = new class35();
        var4.field499 = (long) arg0;
        this.field5366.method148((byte) 101, var4);
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)I", line = 825)
    public final int method2397(int arg0) {
        field5334++;
        if (this.method2320(8658) == null) {
            return this.field5357 == null ? 0 : this.field5357.method1884(-124);
        } else {
            int var2 = -25 % ((arg0 - 60) / 52);
            return 100;
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V", line = 848)
    public final void method2398(byte arg0) {
        if (arg0 <= 49) {
            return;
        }
        field5349++;
        if (this.field5331 != null) {
            this.field5367 = true;
            if (this.field5365 == null) {
                this.field5365 = new class22();
            }
        }
    }
}
