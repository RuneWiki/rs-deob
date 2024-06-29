import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class135 extends class171 {

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    private int field2342 = 0;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Li;")
    private class112 field2331 = new class112(16);

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field2365 = 0;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Lci;")
    private class60 field2363 = new class60();

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "J")
    private long field2367 = 0L;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Lac;")
    private class126 field2353;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "Z")
    private boolean field2366;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Lci;")
    private class60 field2364;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Lud;")
    private class51 field2339;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Lac;")
    private class126 field2354;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Z")
    private boolean field2368;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    private int field2357;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Ls;")
    private class92 field2340;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Lob;")
    private class176 field2352;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[[B")
    public static byte[][] field2346 = new byte[1000][];

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[Z")
    public static boolean[] field2336 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "[I")
    public static int[] field2360 = new int[50];

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lpj;")
    private class98 field2343;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "Z")
    private boolean field2362;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "[B")
    private byte[] field2361;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Leh;B)Lth;")
    public static final class118 method935(class101 arg0, byte arg1) {
        if (arg1 != -94) {
            field2336 = null;
        }
        field2349++;
        return new class118(arg0.method686(-3), arg0.method686(-3), arg0.method686(-3), arg0.method686(-3), arg0.method658(arg1 ^ 0xFFFFA8B6), arg0.method658(22292), arg0.method669((byte) 36));
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)V")
    public final void method936(int arg0, int arg1) {
        if (arg1 != 16) {
            this.field2352 = null;
        }
        field2335++;
        if (this.field2353 == null) {
            return;
        }
        for (class83 var3 = this.field2363.method379(6347); var3 != null; var3 = this.field2363.method378(97)) {
            if (((long) arg0) == var3.field1515) {
                return;
            }
        }
        class83 var4 = new class83();
        var4.field1515 = (long) arg0;
        this.field2363.method374(-1, var4);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)I")
    public final int method937(byte arg0) {
        field2358++;
        return arg0 <= 18 ? 122 : this.field2342;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public final void method938(boolean arg0) {
        field2332++;
        if (!arg0) {
            return;
        }
        if (this.field2364 != null) {
            if (this.method949((byte) -67) == null) {
                return;
            }
            if (this.field2366) {
                boolean var2 = true;
                for (class83 var3 = this.field2364.method379(6347); var3 != null; var3 = this.field2364.method378(52)) {
                    int var5 = (int) var3.field1515;
                    if (this.field2361[var5] == 0) {
                        this.method947(var5, 0, 1);
                    }
                    if (this.field2361[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method547(10026);
                    }
                }
                while (this.field2343.field1671.length > this.field2365) {
                    if (this.field2343.field1671[this.field2365] == 0) {
                        this.field2365++;
                    } else {
                        if (this.field2340.field1628 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2361[this.field2365] == 0) {
                            this.method947(this.field2365, 0, 1);
                        }
                        if (this.field2361[this.field2365] == 0) {
                            var2 = false;
                            class83 var4 = new class83();
                            var4.field1515 = (long) this.field2365;
                            this.field2364.method374(-1, var4);
                        }
                        this.field2365++;
                    }
                }
                if (var2) {
                    this.field2366 = false;
                    this.field2365 = 0;
                }
            } else if (this.field2362) {
                boolean var6 = true;
                for (class83 var7 = this.field2364.method379(6347); var7 != null; var7 = this.field2364.method378(68)) {
                    int var9 = (int) var7.field1515;
                    if (this.field2361[var9] != 1) {
                        this.method947(var9, 0, 2);
                    }
                    if (this.field2361[var9] == 1) {
                        var7.method547(10026);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2365 < this.field2343.field1671.length) {
                    if (this.field2343.field1671[this.field2365] == 0) {
                        this.field2365++;
                    } else {
                        if (this.field2339.method316((byte) 35)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2361[this.field2365] != 1) {
                            this.method947(this.field2365, 0, 2);
                        }
                        if (this.field2361[this.field2365] != 1) {
                            class83 var8 = new class83();
                            var8.field1515 = (long) this.field2365;
                            this.field2364.method374(-1, var8);
                            var6 = false;
                        }
                        this.field2365++;
                    }
                }
                if (var6) {
                    this.field2365 = 0;
                    this.field2362 = false;
                }
            } else {
                this.field2364 = null;
            }
        }
        if (!this.field2368 || this.field2367 > class232.method1544((byte) -73)) {
            return;
        }
        for (class176 var10 = (class176) this.field2331.method782(0); var10 != null; var10 = (class176) this.field2331.method788(true)) {
            if (!var10.field2893) {
                if (var10.field2887) {
                    if (!var10.field2885) {
                        throw new RuntimeException();
                    }
                    var10.method547(10026);
                } else {
                    var10.field2887 = true;
                }
            }
        }
        this.field2367 = class232.method1544((byte) -99) + 1000L;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I")
    public final int method939(boolean arg0) {
        field2345++;
        if (this.field2343 == null) {
            return 0;
        } else if (arg0) {
            return 67;
        } else {
            return this.field2343.field1686;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
    public static void method940(boolean arg0) {
        field2346 = null;
        field2336 = null;
        field2360 = null;
        if (!arg0) {
            method944(-47, -58, 94, -10, -106, 40, 87);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public final int method941(int arg0, int arg1) {
        field2355++;
        class176 var3 = (class176) this.field2331.method779(-111, (long) arg0);
        if (var3 == null) {
            if (arg1 != -2071) {
                method940(true);
            }
            return 0;
        } else {
            return var3.method37(100);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
    public final int method942(int arg0) {
        field2334++;
        if (arg0 != 100) {
            field2336 = null;
        }
        if (this.method949((byte) -67) == null) {
            return this.field2352 == null ? 0 : this.field2352.method37(arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
    public final void method943(byte arg0) {
        field2333++;
        if (this.field2364 == null || this.method949((byte) -67) == null) {
            return;
        }
        for (class83 var2 = this.field2363.method379(6347); var2 != null; var2 = this.field2363.method378(-98)) {
            int var3 = (int) var2.field1515;
            if (var3 < 0 || var3 >= this.field2343.field1687 || this.field2343.field1671[var3] == 0) {
                var2.method547(10026);
            } else {
                if (this.field2361[var3] == 0) {
                    this.method947(var3, 0, 1);
                }
                if (this.field2361[var3] == -1) {
                    this.method947(var3, 0, 2);
                }
                if (this.field2361[var3] == 1) {
                    var2.method547(arg0 ^ 0xFFFFD8D5);
                }
            }
        }
        if (arg0 != -1) {
            this.method938(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2359++;
        if (arg6 <= 83) {
            return;
        }
        int var7 = arg0 + arg5;
        int var8 = arg1 - arg5;
        int var9 = arg3 + arg5;
        int var10 = arg2 - arg5;
        for (int var11 = arg0; var11 < var7; var11++) {
            class93.method598(-7, arg2, arg3, class167.field2735[var11], arg4);
        }
        for (int var12 = arg1; var12 > var8; var12--) {
            class93.method598(-7, arg2, arg3, class167.field2735[var12], arg4);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class167.field2735[var13];
            class93.method598(-7, var9, arg3, var14, arg4);
            class93.method598(-7, arg2, var10, var14, arg4);
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)I")
    public final int method945(byte arg0) {
        field2351++;
        if (this.field2343 == null) {
            return 0;
        }
        int var2 = 101 % ((33 - arg0) / 39);
        if (this.field2366) {
            class83 var3 = this.field2364.method379(6347);
            return var3 == null ? 0 : (int) var3.field1515;
        } else {
            return this.field2343.field1686;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)Lmb;")
    public static final class127 method946(int arg0, int arg1) {
        field2341++;
        class127 var2 = (class127) class166.field2718.method3(32, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 8792) {
            byte[] var3 = class51.field891.method746(class224.method1509(arg1, 2047), (byte) -128, class223.method1503(arg1, -1536));
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method875(new class101(var3), 0);
            }
            class166.field2718.method4(0, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lob;")
    private final class176 method947(int arg0, int arg1, int arg2) {
        field2344++;
        if (arg1 != 0) {
            return null;
        }
        class176 var4 = (class176) this.field2331.method779(107, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field2885 && var4.field2893) {
            var4.method547(10026);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2353 == null || this.field2361[arg0] == -1) {
                    if (this.field2339.method320(124)) {
                        return null;
                    }
                    var4 = this.field2339.method322(true, (byte) 23, this.field2337, (byte) 2, arg0);
                } else {
                    var4 = this.field2340.method596(arg0, this.field2353, false);
                }
            } else if (arg2 == 1) {
                if (this.field2353 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2340.method590(arg0, -72, this.field2353);
            } else if (arg2 == 2) {
                if (this.field2353 == null) {
                    throw new RuntimeException();
                }
                if (this.field2361[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2339.method316((byte) 35)) {
                    return null;
                }
                var4 = this.field2339.method322(false, (byte) 23, this.field2337, (byte) 2, arg0);
            } else {
                throw new RuntimeException();
            }
            this.field2331.method780((byte) -78, (long) arg0, var4);
        }
        if (var4.field2893) {
            return null;
        }
        byte[] var5 = var4.method36((byte) 46);
        if (!var4 instanceof class6) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class129.field2259.reset();
                class129.field2259.update(var5, 0, var5.length - 2);
                int var9 = (int) class129.field2259.getValue();
                if (this.field2343.field1684[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field2339.field902 = 0;
                this.field2339.field904 = 0;
            } catch (RuntimeException var12) {
                this.field2339.method311(1);
                var4.method547(10026);
                if (var4.field2885 && !this.field2339.method320(88)) {
                    class268 var10 = this.field2339.method322(true, (byte) 23, this.field2337, (byte) 2, arg0);
                    this.field2331.method780((byte) -78, (long) arg0, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2343.field1676[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2343.field1676[arg0];
            if (this.field2353 != null) {
                this.field2340.method594(this.field2353, -16380, var5, arg0);
                if (this.field2361[arg0] != 1) {
                    this.field2342++;
                    this.field2361[arg0] = 1;
                }
            }
            if (!var4.field2885) {
                var4.method547(10026);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class129.field2259.reset();
            class129.field2259.update(var5, 0, var5.length - 2);
            int var6 = (int) class129.field2259.getValue();
            if (this.field2343.field1684[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2343.field1676[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2361[arg0] != 1) {
                this.field2342++;
                this.field2361[arg0] = 1;
            }
            if (!var4.field2885) {
                var4.method547(arg1 ^ 0x272A);
            }
            return var4;
        } catch (Exception var11) {
            this.field2361[arg0] = -1;
            var4.method547(10026);
            if (var4.field2885 && !this.field2339.method320(arg1 + 84)) {
                class268 var8 = this.field2339.method322(true, (byte) 23, this.field2337, (byte) 2, arg0);
                this.field2331.method780((byte) -78, (long) arg0, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[B")
    public final byte[] method948(int arg0, int arg1) {
        field2350++;
        class176 var3 = this.method947(arg1, 0, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 != -7621) {
            this.field2368 = true;
        }
        byte[] var4 = var3.method36((byte) 46);
        var3.method547(arg0 ^ 0xFFFFC511);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Lpj;")
    public final class98 method949(byte arg0) {
        field2347++;
        if (this.field2343 != null) {
            return this.field2343;
        }
        if (this.field2352 == null) {
            if (this.field2339.method320(81)) {
                return null;
            }
            this.field2352 = this.field2339.method322(true, (byte) 23, 255, (byte) 0, this.field2337);
        }
        if (this.field2352.field2893) {
            return null;
        }
        byte[] var2 = this.field2352.method36((byte) 46);
        if (this.field2352 instanceof class6) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2343 = new class98(var2, this.field2357);
                if (this.field2343.field1694 != this.field2348) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2343 = null;
                if (this.field2339.method320(arg0 + 157)) {
                    this.field2352 = null;
                } else {
                    this.field2352 = this.field2339.method322(true, (byte) 23, 255, (byte) 0, this.field2337);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2343 = new class98(var2, this.field2357);
            } catch (RuntimeException var4) {
                this.field2339.method311(1);
                this.field2343 = null;
                if (this.field2339.method320(127)) {
                    this.field2352 = null;
                } else {
                    this.field2352 = this.field2339.method322(true, (byte) 23, 255, (byte) 0, this.field2337);
                }
                return null;
            }
            if (this.field2354 != null) {
                this.field2340.method594(this.field2354, -16380, var2, this.field2337);
            }
        }
        if (this.field2353 != null) {
            this.field2361 = new byte[this.field2343.field1687];
            this.field2342 = 0;
        }
        if (arg0 != -67) {
            this.method938(false);
        }
        this.field2352 = null;
        return this.field2343;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public final void method950(int arg0) {
        if (arg0 != 6298) {
            this.method943((byte) 21);
        }
        field2338++;
        if (this.field2353 != null) {
            this.field2362 = true;
            if (this.field2364 == null) {
                this.field2364 = new class60();
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(ILac;Lac;Lud;Ls;IIZ)V")
    public class135(int arg0, class126 arg1, class126 arg2, class51 arg3, class92 arg4, int arg5, int arg6, boolean arg7) {
        this.field2337 = arg0;
        this.field2353 = arg1;
        if (this.field2353 == null) {
            this.field2366 = false;
        } else {
            this.field2366 = true;
            this.field2364 = new class60();
        }
        this.field2339 = arg3;
        this.field2348 = arg6;
        this.field2354 = arg2;
        this.field2368 = arg7;
        this.field2357 = arg5;
        this.field2340 = arg4;
        if (this.field2354 != null) {
            this.field2352 = this.field2340.method596(this.field2337, this.field2354, false);
        }
    }
}
