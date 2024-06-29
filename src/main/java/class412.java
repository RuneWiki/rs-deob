import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class412 {

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lgo;")
    private class304 field5642 = new class304();

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Lgo;")
    private class304 field5654 = new class304();

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Lgo;")
    private class304 field5655 = new class304();

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lgo;")
    private class304 field5656 = new class304();

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "Lkk;")
    private class161 field5659 = new class161(4);

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public volatile int field5663 = 0;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "B")
    private byte field5664 = 0;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public volatile int field5662 = 0;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Lkk;")
    private class161 field5661 = new class161(8);

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
    public static boolean field5643 = true;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lhq;")
    public static class30 field5634 = new class30("", 10);

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field5645 = 0;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "[[Z")
    public static boolean[][] field5650 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lrc;")
    public static class108 field5649 = new class108(93, 6);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    private int field5657;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "J")
    private long field5660;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Ltc;")
    private class332 field5658;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Lgq;")
    private class491 field5665;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 5)
    public static void method2463(int arg0) {
        field5650 = null;
        field5634 = null;
        field5649 = null;
        if (arg0 != 0) {
            field5653 = 64;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 21)
    public final void method2464(int arg0) {
        field5648++;
        try {
            this.field5658.method2095(false);
        } catch (Exception var2) {
        }
        this.field5662 = -1;
        this.field5664 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 != -8296) {
            field5645 = -8;
        }
        this.field5658 = null;
        this.field5663++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I", line = 39)
    public static final int method2465(int arg0, boolean arg1, int arg2) {
        if (arg2 != -2110192752) {
            return 74;
        }
        field5632++;
        if (arg1) {
            return 0;
        }
        class48 var3 = class317.method2019((byte) -109, arg0, arg1);
        if (var3 == null) {
            return class95.field1341.method49((byte) 110, arg0).field5454;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field723.length; var5++) {
            if (var3.field723[var5] == -1) {
                var4++;
            }
        }
        return var4 + class95.field1341.method49((byte) 4, arg0).field5454 - var3.field723.length;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 73)
    public final void method2466(int arg0) {
        field5638++;
        if (this.field5658 != null) {
            this.field5658.method2095(false);
        }
        if (arg0 != 0) {
            this.method2470(true, 97);
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z", line = 89)
    public final boolean method2467(int arg0) {
        if (arg0 == -21) {
            field5639++;
            return this.method2469(-92) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIIB)Lgq;", line = 100)
    public final class491 method2468(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field5636++;
        long var6 = (long) ((arg2 << 16) + arg3);
        class491 var8 = new class491();
        var8.field6546 = arg1;
        var8.field6927 = arg4;
        var8.field713 = var6;
        if (arg1) {
            if (this.method2469(-102) >= 20) {
                throw new RuntimeException();
            }
            this.field5642.method1962((byte) -67, var8);
        } else if (this.method2471(arg0 ^ 0x14) < 20) {
            this.field5655.method1962((byte) -67, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != -21) {
            this.method2476((class332) null, true, 59);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)I", line = 143)
    public final int method2469(int arg0) {
        field5637++;
        if (arg0 > -86) {
            this.field5657 = 26;
        }
        return this.field5642.method1958(117) + this.field5654.method1958(103);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V", line = 154)
    public final void method2470(boolean arg0, int arg1) {
        field5644++;
        if (this.field5658 == null) {
            return;
        }
        try {
            this.field5659.field2298 = 0;
            this.field5659.method1180((byte) -110, arg0 ? 2 : 3);
            this.field5659.method1142((byte) -63, arg1);
            this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
        } catch (IOException var4) {
            try {
                this.field5658.method2095(false);
            } catch (Exception var3) {
            }
            this.field5663++;
            this.field5662 = -2;
            this.field5658 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)I", line = 180)
    private final int method2471(int arg0) {
        if (arg0 == -1) {
            field5631++;
            return this.field5655.method1958(120) + this.field5656.method1958(111);
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V", line = 193)
    public final void method2472(int arg0) {
        if (this.field5658 != null) {
            this.field5658.method2091(-61);
        }
        field5640++;
        if (arg0 != 0) {
            this.field5661 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 207)
    private final void method2473(boolean arg0) {
        field5633++;
        if (this.field5658 == null) {
            return;
        }
        try {
            if (arg0) {
                this.method2473(true);
            }
            this.field5659.field2298 = 0;
            this.field5659.method1180((byte) -110, 6);
            this.field5659.method1142((byte) -47, 3);
            this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
        } catch (IOException var3) {
            try {
                this.field5658.method2095(false);
            } catch (Exception var2) {
            }
            this.field5658 = null;
            this.field5662 = -2;
            this.field5663++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V", line = 235)
    public final void method2474(int arg0) {
        field5646++;
        if (this.field5658 == null) {
            return;
        }
        try {
            this.field5659.field2298 = 0;
            this.field5659.method1180((byte) -110, 7);
            this.field5659.method1142((byte) -73, arg0);
            this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
        } catch (IOException var3) {
            try {
                this.field5658.method2095(false);
            } catch (Exception var2) {
            }
            this.field5658 = null;
            this.field5663++;
            this.field5662 = -2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)Z", line = 260)
    public final boolean method2475(boolean arg0) {
        field5647++;
        if (this.field5658 != null) {
            long var2 = class10.method51(-3183);
            int var4 = (int) (var2 - this.field5660);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5660 = var2;
            this.field5657 += var4;
            if (this.field5657 > 30000) {
                try {
                    this.field5658.method2095(false);
                } catch (Exception var27) {
                }
                this.field5658 = null;
            }
        }
        if (this.field5658 == null) {
            return this.method2469(-104) == 0 && this.method2471(-1) == 0;
        }
        try {
            this.field5658.method2085(3);
            class491 var5 = (class491) this.field5642.method1955(0);
            if (!arg0) {
                return false;
            }
            while (var5 != null) {
                this.field5659.field2298 = 0;
                this.field5659.method1180((byte) -110, 1);
                this.field5659.method1142((byte) -48, (int) var5.field713);
                this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
                this.field5654.method1962((byte) -67, var5);
                var5 = (class491) this.field5642.method1954(false);
            }
            for (class491 var6 = (class491) this.field5655.method1955(0); var6 != null; var6 = (class491) this.field5655.method1954(false)) {
                this.field5659.field2298 = 0;
                this.field5659.method1180((byte) -110, 0);
                this.field5659.method1142((byte) -64, (int) var6.field713);
                this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
                this.field5656.method1962((byte) -67, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5658.method2089(false);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5657 = 0;
                byte var9 = 0;
                if (this.field5665 == null) {
                    var9 = 8;
                } else if (this.field5665.field6928 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5661.field2298;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field5658.method2094(this.field5661.field2298, var10, -93, this.field5661.field2262);
                    if (this.field5664 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5661.field2262[this.field5661.field2298 + var11] = (byte) class134.method993(this.field5661.field2262[this.field5661.field2298 + var11], this.field5664);
                        }
                    }
                    this.field5661.field2298 += var10;
                    if (var9 <= this.field5661.field2298) {
                        if (this.field5665 == null) {
                            this.field5661.field2298 = 0;
                            int var12 = this.field5661.method1172((byte) -107);
                            int var13 = this.field5661.method1134(-16848);
                            int var14 = this.field5661.method1172((byte) -23);
                            int var15 = this.field5661.method1168(255);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class491 var21;
                            if (var17) {
                                for (var21 = (class491) this.field5656.method1955(0); var21 != null && var21.field713 != var18; var21 = (class491) this.field5656.method1954(false)) {
                                }
                            } else {
                                for (var21 = (class491) this.field5654.method1955(0); var21 != null && var21.field713 != var18; var21 = (class491) this.field5654.method1954(!arg0)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5665 = var21;
                            this.field5665.field6926 = new class161(var15 + var22 + this.field5665.field6927);
                            this.field5665.field6926.method1180((byte) -110, var16);
                            this.field5665.field6926.method1177(var15, -38);
                            this.field5665.field6928 = 8;
                            this.field5661.field2298 = 0;
                        } else if (this.field5665.field6928 != 0) {
                            throw new IOException();
                        } else if (this.field5661.field2262[0] == -1) {
                            this.field5665.field6928 = 1;
                            this.field5661.field2298 = 0;
                        } else {
                            this.field5665 = null;
                        }
                    }
                } else {
                    int var23 = this.field5665.field6926.field2262.length - this.field5665.field6927;
                    int var24 = 512 - this.field5665.field6928;
                    if (var23 - this.field5665.field6926.field2298 < var24) {
                        var24 = var23 - this.field5665.field6926.field2298;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5658.method2094(this.field5665.field6926.field2298, var24, -126, this.field5665.field6926.field2262);
                    if (this.field5664 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5665.field6926.field2262[this.field5665.field6926.field2298 + var25] = (byte) class134.method993(this.field5665.field6926.field2262[this.field5665.field6926.field2298 + var25], this.field5664);
                        }
                    }
                    this.field5665.field6928 += var24;
                    this.field5665.field6926.field2298 += var24;
                    if (this.field5665.field6926.field2298 == var23) {
                        this.field5665.method479((byte) -8);
                        this.field5665.field6539 = false;
                        this.field5665 = null;
                    } else if (this.field5665.field6928 == 512) {
                        this.field5665.field6928 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5658.method2095(!arg0);
            } catch (Exception var26) {
            }
            this.field5658 = null;
            this.field5663++;
            this.field5662 = -2;
            return this.method2469(-109) == 0 && this.method2471(-1) == 0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ltc;ZI)V", line = 540)
    public final void method2476(class332 arg0, boolean arg1, int arg2) {
        field5652++;
        if (this.field5658 != null) {
            try {
                this.field5658.method2095(false);
            } catch (Exception var9) {
            }
            this.field5658 = null;
        }
        this.field5658 = arg0;
        this.method2473(false);
        this.method2470(arg1, 0);
        int var4 = -32 % ((27 - arg2) / 58);
        this.field5661.field2298 = 0;
        this.field5665 = null;
        while (true) {
            class491 var5 = (class491) this.field5654.method1961((byte) 49);
            if (var5 == null) {
                while (true) {
                    class491 var6 = (class491) this.field5656.method1961((byte) 49);
                    if (var6 == null) {
                        if (this.field5664 != 0) {
                            try {
                                this.field5659.field2298 = 0;
                                this.field5659.method1180((byte) -110, 4);
                                this.field5659.method1180((byte) -110, this.field5664);
                                this.field5659.method1173(0, (byte) 127);
                                this.field5658.method2090(0, this.field5659.field2262, (byte) -45, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field5658.method2095(false);
                                } catch (Exception var7) {
                                }
                                this.field5658 = null;
                                this.field5663++;
                                this.field5662 = -2;
                            }
                        }
                        this.field5657 = 0;
                        this.field5660 = class10.method51(-3183);
                        return;
                    }
                    this.field5655.method1962((byte) -67, var6);
                }
            }
            this.field5642.method1962((byte) -67, var5);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lvc;Z)V", line = 614)
    public static final void method2477(class89 arg0, boolean arg1) {
        if (!arg1) {
            field5650 = null;
        }
        if (class205.field3005) {
            class134.method997(arg1, arg0);
        } else {
            class225.method1535((byte) 27, arg0);
        }
        field5651++;
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)Z", line = 634)
    public final boolean method2478(int arg0) {
        field5641++;
        if (arg0 >= -93) {
            this.field5665 = null;
        }
        return this.method2471(-1) >= 20;
    }
}
