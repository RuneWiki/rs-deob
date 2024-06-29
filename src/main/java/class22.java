import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class22 extends class123 {

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
    private int field359 = -1;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Z")
    private volatile boolean field347 = false;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "Z")
    private boolean field360 = false;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "Lvg;")
    private class262 field361;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Lvg;")
    private class262 field346;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public static int field353 = 2;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
    public static int[] field352 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!v", name = "Cb", descriptor = "Lhh;")
    public static class163 field369 = class137.method1065("Lade Sprites )2 ", 17);

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!v", name = "zb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!v", name = "Bb", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!v", name = "Ab", descriptor = "[Lqh;")
    public static class69[] field367;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "[Z")
    private volatile boolean[] field357;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)V")
    public final void method142(int arg0, boolean arg1) {
        ++field366;
        if (this.method976((byte) 84, arg0)) {
            if (this.field346 != null && this.field357 != null && this.field357[arg0]) {
                class165.method1238(this, arg1, this.field346, arg0);
            } else {
                class93.method741(true, arg0, 45218960, (byte) 2, this.field355, this, super.field2369[arg0]);
            }
            if (arg1) {
                method150(18, (class126) null);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(BI)V")
    public final void method143(byte arg0, int arg1) {
        if (arg0 > 67) {
            ++field364;
            if (this.method976((byte) 84, arg1)) {
                class214.method1526((byte) -6, this.field355, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZ[BILvg;)V")
    public final void method144(boolean arg0, boolean arg1, byte[] arg2, int arg3, class262 arg4) {
        ++field370;
        if (this.field361 == arg4) {
            if (this.field347) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
                return;
            }
            class52.field874.reset();
            class52.field874.update(arg2, 0, arg2.length);
            int var6 = (int) class52.field874.getValue();
            if (this.field363 != var6) {
                class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
                return;
            }
            class81 var7;
            try {
                var7 = new class81(class244.method1684((byte) 89, arg2));
            } catch (RuntimeException var12) {
                class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
                return;
            }
            int var8 = var7.method622(arg1);
            if (~var8 != -6 && var8 != 6) {
                class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
                return;
            }
            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method620((byte) -82);
            }
            if (this.field354 != var9) {
                class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
                return;
            }
            this.method961((byte) -112, arg2);
            this.method146(!arg1);
        } else {
            label98: {
                if (!arg0 && ~this.field359 == ~arg3) {
                    this.field347 = true;
                }
                if (arg2 != null && arg2.length > 2) {
                    class52.field874.reset();
                    class52.field874.update(arg2, 0, arg2.length + -2);
                    int var10 = (int) class52.field874.getValue();
                    int var11 = ((arg2[arg2.length + -2] & 255) << 8) + (arg2[arg2.length + -1] & 255);
                    if (~super.field2369[arg3] == ~var10 && ~super.field2365[arg3] == ~var11) {
                        this.field357[arg3] = true;
                        if (arg0) {
                            super.field2356[arg3] = class120.method942(arg2, false, (byte) 117);
                        }
                        break label98;
                    }
                    this.field357[arg3] = false;
                    if (this.field360 || arg0) {
                        class93.method741(arg0, arg3, 45218960, (byte) 2, this.field355, this, super.field2369[arg3]);
                    }
                    return;
                }
                this.field357[arg3] = false;
                if (this.field360 || arg0) {
                    class93.method741(arg0, arg3, 45218960, (byte) 2, this.field355, this, super.field2369[arg3]);
                }
                return;
            }
        }
        if (!arg1) {
            method150(16, (class126) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)I")
    public final int method145(byte arg0) {
        ++field365;
        if (arg0 != -65) {
            this.method144(false, true, (byte[]) null, 109, (class262) null);
        }
        if (this.field347) {
            return 100;
        } else if (super.field2356 != null) {
            return 99;
        } else {
            int var2 = class193.method1410((byte) 124, 255, this.field355);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    private final void method146(boolean arg0) {
        if (arg0) {
            field352 = null;
        }
        this.field357 = new boolean[super.field2356.length];
        ++field358;
        for (int var2 = 0; var2 < this.field357.length; ++var2) {
            this.field357[var2] = false;
        }
        if (this.field346 == null) {
            this.field347 = true;
        } else {
            this.field359 = -1;
            for (int var3 = 0; ~this.field357.length < ~var3; ++var3) {
                if (~super.field2337[var3] < -1) {
                    class208.method1499(this, var3, this.field346, (byte) 54);
                    this.field359 = var3;
                }
            }
            if (this.field359 == -1) {
                this.field347 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field368;
        if (arg2 != 21) {
            method152((byte) -123);
        }
        if (~arg1 >= ~class201.field3593 && arg4 >= class182.field3344) {
            boolean var6;
            if (~class127.field2465 < ~arg5) {
                var6 = false;
                arg5 = class127.field2465;
            } else if (class252.field4407 < arg5) {
                var6 = false;
                arg5 = class252.field4407;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg3 >= class127.field2465) {
                if (class252.field4407 < arg3) {
                    arg3 = class252.field4407;
                    var7 = false;
                } else {
                    var7 = true;
                }
            } else {
                var7 = false;
                arg3 = class127.field2465;
            }
            if (arg1 >= class182.field3344) {
                class227.method1585(arg3, (byte) -66, arg0, class85.field1605[arg1++], arg5);
            } else {
                arg1 = class182.field3344;
            }
            if (~arg4 < ~class201.field3593) {
                arg4 = class201.field3593;
            } else {
                class227.method1585(arg3, (byte) -66, arg0, class85.field1605[arg4--], arg5);
            }
            if (var7 && var6) {
                for (int var8 = arg1; ~var8 >= ~arg4; ++var8) {
                    int[] var9 = class85.field1605[var8];
                    var9[arg3] = var9[arg5] = arg0;
                }
            } else {
                if (!var7) {
                    if (var6) {
                        for (int var10 = arg1; var10 <= arg4; ++var10) {
                            class85.field1605[var10][arg5] = arg0;
                        }
                        return;
                    }
                } else {
                    for (int var11 = arg1; arg4 >= var11; ++var11) {
                        class85.field1605[var11][arg3] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIZ[BZ)V")
    public final void method148(boolean arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4) {
        if (!arg0) {
            ++field350;
            if (!arg4) {
                arg3[arg3.length + -2] = (byte) (super.field2365[arg1] >> 8);
                arg3[arg3.length - 1] = (byte) super.field2365[arg1];
                if (this.field346 != null) {
                    class143.method1090(arg1, -572085439, this.field346, arg3);
                    this.field357[arg1] = true;
                }
                if (arg2) {
                    super.field2356[arg1] = class120.method942(arg3, false, (byte) 103);
                    return;
                }
            } else {
                if (this.field347) {
                    throw new RuntimeException();
                }
                if (this.field361 != null) {
                    class143.method1090(this.field355, -572085439, this.field361, arg3);
                }
                this.method961((byte) 125, arg3);
                this.method146(false);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)Loh;")
    public static final class79 method149(byte[] arg0, byte arg1) {
        ++field362;
        if (arg0 == null) {
            return null;
        } else {
            class184 var2 = new class184(arg0, class65.field1107, class180.field3267, class256.field4478, class257.field4505, class223.field4070);
            if (arg1 != 103) {
                field367 = null;
            }
            class67.method463(-123);
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILgj;)V")
    public static final void method150(int arg0, class126 arg1) {
        class247 var2 = (class247) class39.field649.method1743(arg1.field2424.method1193((byte) 113), false);
        int var3 = 77 / ((arg0 - 39) / 40);
        if (var2 != null) {
            if (var2.field4366 != null) {
                class225.field4085.method594(var2.field4366);
                var2.field4366 = null;
            }
            var2.method1063(75);
        }
        ++field348;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lvg;Lvg;IZZZ)V")
    public class22(class262 arg0, class262 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field360 = arg5;
        this.field361 = arg1;
        this.field355 = arg2;
        this.field346 = arg0;
        class250.method1712(this, 21870, this.field355);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        ++field349;
        if (!this.method976((byte) 84, arg1)) {
            return 0;
        } else {
            if (arg0 != 3548) {
                field352 = null;
            }
            if (super.field2356[arg1] != null) {
                return 100;
            } else {
                return this.field357[arg1] ? 100 : class193.method1410((byte) 31, this.field355, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method152(byte arg0) {
        field352 = null;
        field369 = null;
        field367 = null;
        if (arg0 != -95) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ)V")
    public final void method153(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field355 = -126;
        }
        ++field356;
        this.field363 = arg1;
        this.field354 = arg0;
        if (this.field361 != null) {
            class165.method1238(this, false, this.field361, this.field355);
        } else {
            class93.method741(true, this.field355, 45218960, (byte) 0, 255, this, this.field363);
        }
    }
}
