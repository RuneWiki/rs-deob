import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public abstract class class24 implements class364 {

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    private int field336 = 0;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    private int field343 = -1;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Z")
    private boolean field323;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Lad;")
    public class669 field338;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Leda;")
    public static class116 field327 = new class116(62, 4);

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "Lvh;")
    public static class125 field335 = new class125(41, 4);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Lvo;")
    public static class345 field324;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field340;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field344;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method241(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)J", line = 5)
    public final long method230(int arg0) {
        if (arg0 != 19029) {
            field335 = null;
        }
        field328++;
        return this.field343 == 0 ? this.field340.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 24)
    public void method231(byte arg0) {
        field337++;
        if (arg0 == -105 && this.field343 > 0) {
            this.field338.method3776(this.field343, this.field333, arg0 ^ 0x17);
            this.field343 = -1;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V", line = 41)
    public final void method232(byte arg0) {
        if (this.field338.field9530) {
            OpenGL.glBindBufferARB(this.field326, this.field343);
        }
        field322++;
        if (arg0 != 72) {
            this.field338 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "finalize", descriptor = "()V", line = 55)
    protected final void finalize() throws Throwable {
        field339++;
        this.method231((byte) -105);
        super.finalize();
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BILr;)Z", line = 64)
    public static final boolean method233(byte arg0, int arg1, class98 arg2) {
        field329++;
        int var3 = (class430.field6136 - 104) / 2;
        int var4 = (class580.field8504 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class470.method2774(var6, -127, var57, arg1, var58)) {
                        int var59 = var58;
                        if (class151.method1151(var57, var6, (byte) -49)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class699.method3933(var57, var6, (byte) -111, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class660.field9296 = arg2.method806(var7, 0, 512, 512, 512);
        class685.method3869((byte) 95);
        int var9 = ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - (-238 - (int) (Math.random() * 20.0D)) - 10 | 0xFF000000;
        if (arg0 != -114) {
            return true;
        }
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class540.field7930 + 1 + 2][class540.field7930 + 3];
        for (int var13 = var3; var13 < var3 + 104; var13 += class540.field7930) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class540.field7930) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class540.field7930 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class540.field7930;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg2.method771(0, 0, class540.field7930 * 4 + var37, class540.field7930 * 4 + var38);
                arg2.method118(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class540.field7930; var50++) {
                        for (int var56 = 0; var56 <= class540.field7930; var56++) {
                            var12[var50][var56] = class470.method2774(var39 + var50, 22, var40 + var56, arg1, var43);
                        }
                    }
                    class621.field8841[var43].method1366(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class680.field9681) {
                        for (int var51 = -4; var51 < class540.field7930; var51++) {
                            for (int var52 = -4; var52 < class540.field7930; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class470.method2774(var53, arg0 ^ 0xFFFFFFA2, var54, arg1, var43)) {
                                    int var55 = var43;
                                    if (class151.method1151(var54, var53, (byte) -49)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class176.method1286(var53, (byte) -66, var9, var10, var37 + (var51 * 4), var55, var54, arg2, var38 - (4 - ((class540.field7930 - var52) * 4)));
                                    }
                                }
                            }
                        }
                    }
                }
                if (class680.field9681) {
                    class538 var44 = class45.field609[arg1];
                    for (int var45 = 0; var45 < class540.field7930; var45++) {
                        for (int var46 = 0; var46 < class540.field7930; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field7893[var47 - var44.field7891][var48 - var44.field7908];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method792(4, (byte) -88, 4, var38 - (4 - ((class540.field7930 - var46) * 4)), -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method773((class540.field7930 - var46) * 4 + var38 - 4, 128, 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method750((class540.field7930 - var46) * 4 + var38 - 4, arg0 ^ 0xFFFF9F0A, var45 * 4 + var37 + 3, 4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method773(var38 + 3 - (-((class540.field7930 - var46) * 4) - -4), 128, 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method750((class540.field7930 - var46) * 4 + (var38 - 4), 24708, var45 * 4 + var37, 4, -1713569622);
                            }
                        }
                    }
                }
                arg2.method824(var37, var38, class540.field7930 * 4, class540.field7930 * 4, var11, 2);
                class660.field9296.method500(((var13 - var3) * 4) + 48, -(class540.field7930 * 4) + 464 + -((-var4 + var36) * 4), class540.field7930 * 4, class540.field7930 * 4, var37, var38);
            }
        }
        arg2.method805();
        arg2.method118(-16777215);
        class498.method2983(42);
        class537.field7890 = 0;
        class690.field9787.method3896(3);
        if (!class680.field9681) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; (arg1 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class470.method2774(var14, 3, var20, arg1, var21)) {
                            class394 var22 = (class394) class415.method2469(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class394) class31.method286(var21, var14, var20, field344 == null ? (field344 = method241("sw")) : field344);
                            }
                            if (var22 == null) {
                                var22 = (class394) class454.method2636(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class394) class681.method3856(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class119 var23 = class14.field224.method2834(0, var22.method903(98));
                                if (!var23.field1915 || class206.field3186) {
                                    int var24 = var23.field1893;
                                    if (var23.field1924 != null) {
                                        for (int var25 = 0; var25 < var23.field1924.length; var25++) {
                                            if (var23.field1924[var25] != -1) {
                                                class119 var26 = class14.field224.method2834(0, var23.field1924[var25]);
                                                if (var26.field1893 >= 0) {
                                                    var24 = var26.field1893;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class30 var28 = class304.field4255.method2837(var24, -89);
                                            if (var28 != null && var28.field407) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class45.field609[var21].field7893;
                                            int var32 = class45.field609[var21].field7891;
                                            int var33 = class45.field609[var21].field7908;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var14 + 3 > var29 && (var31[var29 - (var32 - 1)][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class187.field2930[class537.field7890] = var23.field1953;
                                        class564.field8255[class537.field7890] = var29;
                                        class586.field8572[class537.field7890] = var30;
                                        class537.field7890++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class189.field2961 != null) {
                class379.field5241.field4849 = 1;
                class304.field4255.method2840((byte) 76, 64, 1024);
                for (int var15 = 0; var15 < class189.field2961.field2512; var15++) {
                    int var16 = class189.field2961.field2514[var15];
                    if (var16 >> 28 == class103.field1708.field3158) {
                        int var17 = ((var16 & 0xFFFEB5B) >> 14) - class143.field2474;
                        int var18 = (var16 & 0x3FFF) - class63.field917;
                        if (var17 >= 0 && class430.field6136 > var17 && var18 >= 0 && var18 < class580.field8504) {
                            class690.field9787.method3904(new class83(var15), arg0 ^ 0xFFFFFF8E);
                        } else {
                            class30 var19 = class304.field4255.method2837(class189.field2961.field2509[var15], -70);
                            if (var19.field450 != null && var19.field428 + var17 >= 0 && class430.field6136 > var19.field438 + var17 && (var19.field419 + var18) >= 0 && var19.field408 + var18 < class580.field8504) {
                                class690.field9787.method3904(new class83(var15), 0);
                            }
                        }
                    }
                }
                class304.field4255.method2840((byte) 110, 64, 128);
                class379.field5241.field4849 = 2;
                class379.field5241.method2097(arg0 + 9);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V", line = 510)
    private final void method234(byte arg0) {
        field341++;
        int var2 = 62 / ((53 - arg0) / 61);
        if (this.field343 >= 0) {
            return;
        }
        if (this.field338.field9530) {
            OpenGL.glGenBuffersARB(1, class68.field1085, 0);
            this.field343 = class68.field1085[0];
            OpenGL.glBindBufferARB(this.field326, this.field343);
        } else {
            this.field343 = 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V", line = 536)
    public static void method235(int arg0) {
        int var1 = -12 % ((53 - arg0) / 58);
        field327 = null;
        field335 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BILjaclib/memory/Source;)Z", line = 551)
    public final boolean method236(byte arg0, int arg1, Source arg2) {
        field330++;
        if (arg0 != 114) {
            this.method231((byte) -74);
        }
        if (arg1 > this.field334) {
            this.method234((byte) 121);
            if (this.field343 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field326, this.field343);
            OpenGL.glBufferDataARBa(this.field326, arg1, arg2.getAddress(), this.field323 ? 35040 : 35044);
            this.field338.field7270 += arg1 - this.field333;
            this.field334 = arg1;
        } else if (this.field343 > 0) {
            OpenGL.glBindBufferARB(this.field326, this.field343);
            OpenGL.glBufferSubDataARBa(this.field326, 0, this.field333, arg2.getAddress());
            this.field338.field7270 += arg1 - this.field333;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field333 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljaggl/MapBuffer;ZZ)Ljaclib/memory/Buffer;", line = 592)
    public final Buffer method237(MapBuffer arg0, boolean arg1, boolean arg2) {
        field331++;
        if (!arg1) {
            this.method236((byte) 48, 54, null);
        }
        if (this.field336 == 0) {
            this.method234((byte) -33);
            if (this.field343 <= 0) {
                this.field336 = 2;
                return this.field340;
            }
            OpenGL.glBindBufferARB(this.field326, this.field343);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field326, this.field334, null, 0, this.field323 ? 35040 : 35044);
                if (this.field338.field7118.field4707 >= this.field333) {
                    this.field336 = 1;
                    return this.field338.field7118;
                }
            }
            if (!arg0.method228() && arg0.method229(this.field326, this.field333, 35001)) {
                this.field336 = 2;
                return arg0;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V", line = 639)
    public void method238(int arg0, int arg1) {
        field325++;
        if (this.field334 < arg1) {
            this.method234((byte) -43);
            if (this.field343 > 0) {
                OpenGL.glBindBufferARB(this.field326, this.field343);
                OpenGL.glBufferDataARBub(this.field326, arg1, null, 0, this.field323 ? 35040 : 35044);
                this.field338.field7270 += arg1 - this.field334;
            } else {
                this.field340 = this.field338.method2945((byte) -128, arg1, false);
            }
            this.field334 = arg1;
        }
        if (arg0 != -22454) {
            field324 = null;
        }
        this.field333 = arg1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 672)
    public final boolean method239(MapBuffer arg0, int arg1) {
        if (arg1 != -16296) {
            return true;
        }
        field332++;
        boolean var3 = true;
        if (this.field336 != 0) {
            if (this.field343 > 0) {
                OpenGL.glBindBufferARB(this.field326, this.field343);
                if (this.field336 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field326, 0, this.field334, this.field338.field7118.getAddress());
                } else {
                    var3 = arg0.method226();
                }
            }
            this.field336 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lad;IZ)V", line = 724)
    public class24(class669 arg0, int arg1, boolean arg2) {
        this.field323 = arg2;
        this.field338 = arg0;
        this.field326 = arg1;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I", line = 708)
    public int method240(int arg0) {
        field342++;
        if (arg0 != 18471) {
            this.method236((byte) 47, -36, null);
        }
        return this.field333;
    }
}
