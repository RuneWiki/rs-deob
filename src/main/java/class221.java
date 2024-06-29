import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class221 implements class395 {

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
    private boolean field3118 = false;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Z")
    private boolean field3122;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Lrl;")
    public class487 field3112;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    private int field3111;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field3125 = -1;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3121 = "";

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V")
    public static final void method1355(byte arg0, int arg1, int arg2) {
        field3105++;
        class261.field3728 = arg2 - class249.field3584;
        class134.field1711 = arg1 - class249.field3604;
        if (arg0 != 30) {
            method1355((byte) 48, 61, -22);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lps;BLeq;)V")
    public static final void method1356(class59 arg0, byte arg1, class134 arg2) {
        field3129++;
        if (class249.field3567 == null) {
            return;
        }
        if (class389.field5768 < 10) {
            if (!class249.field3572.method1446(false, class249.field3567.field3546)) {
                class389.field5768 = class56.field881.method1458(class249.field3567.field3546, 27706) / 10;
                return;
            }
            class459.method2672((byte) -91);
            class389.field5768 = 10;
        }
        if (class389.field5768 == 10) {
            class249.field3604 = class249.field3567.field3553 >> 6 << 6;
            class249.field3584 = class249.field3567.field3556 >> 6 << 6;
            class249.field3588 = (class249.field3567.field3560 >> 6 << 6) - (class249.field3584 - 64);
            class249.field3597 = (class249.field3567.field3545 >> 6 << 6) + 64 - class249.field3604;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class249.field3567.method1544((class415.field6145.field2959 >> 7) + class455.field6637, var3, class415.field6145.field2956, -15842, class223.field3158 + (class415.field6145.field2966 >> 7))) {
                var4 = var3[1] - class249.field3584;
                var5 = var3[2] - class249.field3604;
            }
            if (!class349.field5053 && var4 >= 0 && var4 < class249.field3588 && var5 >= 0 && var5 < class249.field3597) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class192.field2715 = var7;
                class364.field5477 = var6;
            } else if (class83.field1130 == -1 || class185.field2636 == -1) {
                class249.field3567.method1541(var3, class249.field3567.field3554 & 0x3FFF, class249.field3567.field3554 >> 14 & 0x3FFF, -31921);
                class364.field5477 = var3[2] - class249.field3604;
                class192.field2715 = var3[1] - class249.field3584;
            } else {
                class249.field3567.method1541(var3, class185.field2636, class83.field1130, -31921);
                if (var3 != null) {
                    class192.field2715 = var3[1] - class249.field3584;
                    class364.field5477 = var3[2] - class249.field3604;
                }
                class185.field2636 = -1;
                class83.field1130 = -1;
                class349.field5053 = false;
            }
            if (class249.field3567.field3549 == 37) {
                class249.field3581 = 3.0F;
                class249.field3576 = 3.0F;
            } else if (class249.field3567.field3549 == 50) {
                class249.field3581 = 4.0F;
                class249.field3576 = 4.0F;
            } else if (class249.field3567.field3549 == 75) {
                class249.field3581 = 6.0F;
                class249.field3576 = 6.0F;
            } else if (class249.field3567.field3549 == 100) {
                class249.field3581 = 8.0F;
                class249.field3576 = 8.0F;
            } else if (class249.field3567.field3549 == 200) {
                class249.field3581 = 16.0F;
                class249.field3576 = 16.0F;
            } else {
                class249.field3581 = 8.0F;
                class249.field3576 = 8.0F;
            }
            class249.field3577 = (int) class249.field3581 >> 1;
            class249.field3579 = class449.method2620((byte) 97, class249.field3577);
            class126.method706(4832);
            class249.method1556();
            class56.field883 = new class347();
            class249.field3583 += (int) (Math.random() * 5.0D) - 2;
            if (class249.field3583 < -8) {
                class249.field3583 = -8;
            }
            if (class249.field3583 > 8) {
                class249.field3583 = 8;
            }
            class249.field3574 += (int) (Math.random() * 5.0D) - 2;
            if (class249.field3574 < -16) {
                class249.field3574 = -16;
            }
            if (class249.field3574 > 16) {
                class249.field3574 = 16;
            }
            class249.method1568(arg0, class249.field3583 >> 2 << 10, class249.field3574 >> 1);
            class249.field3573.method285((byte) -38, 1024, 256);
            class249.field3568.method1263(256, 256, (byte) -110);
            class249.field3566.method2130(-10668, 4096);
            class78.field1102.method441((byte) 77, 256);
            class389.field5768 = 20;
        } else if (class389.field5768 == 20) {
            class431.method2560(7919, true);
            class249.method1563(arg2, class249.field3583, class249.field3574);
            class389.field5768 = 60;
            class431.method2560(7919, true);
            class472.method2757(0);
        } else {
            if (arg1 < 27) {
                method1356(null, (byte) 35, null);
            }
            if (class389.field5768 == 60) {
                if (class249.field3572.method1453(class249.field3567.field3546 + "_staticelements", 95)) {
                    if (!class249.field3572.method1446(false, class249.field3567.field3546 + "_staticelements")) {
                        return;
                    }
                    class249.field3575 = class342.method2071(class249.field3567.field3546 + "_staticelements", class249.field3572, (byte) -22, class470.field6790);
                } else {
                    class249.field3575 = new class281(0);
                }
                class249.method1555();
                class389.field5768 = 70;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 70) {
                class472.field6822 = new class474(arg2, 11, true, class498.field7590);
                class389.field5768 = 73;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 73) {
                class94.field1268 = new class474(arg2, 12, true, class498.field7590);
                class389.field5768 = 76;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 76) {
                class411.field6035 = new class474(arg2, 14, true, class498.field7590);
                class389.field5768 = 79;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 79) {
                class96.field1290 = new class474(arg2, 17, true, class498.field7590);
                class389.field5768 = 82;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 82) {
                class206.field2851 = new class474(arg2, 19, true, class498.field7590);
                class389.field5768 = 85;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 85) {
                class251.field3613 = new class474(arg2, 22, true, class498.field7590);
                class389.field5768 = 88;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else if (class389.field5768 == 88) {
                class493.field7525 = new class474(arg2, 26, true, class498.field7590);
                class389.field5768 = 91;
                class431.method2560(7919, true);
                class472.method2757(0);
            } else {
                class400.field5888 = new class474(arg2, 30, true, class498.field7590);
                class389.field5768 = 100;
                class431.method2560(7919, true);
                class472.method2757(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V")
    public final void method1357(boolean arg0, byte arg1) {
        field3117++;
        if (arg1 < 81) {
            this.field3116 = -100;
        }
        if (arg0 != this.field3118) {
            this.field3118 = arg0;
            this.method1361(false);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
    public static final void method1358(boolean arg0) {
        field3109++;
        if (!class118.field1533.method2961(class293.field4174, 29) && class355.field5121 != class234.field3290) {
            class478.method2791(false, false, class454.field6612, 128, class134.field1714);
            return;
        }
        class230.method1401(3, class481.field6937);
        if (arg0) {
            field3113 = 23;
        }
        if (class503.field7680 != class355.field5121) {
            class2.method9((byte) -48);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
    public static void method1359(boolean arg0) {
        if (arg0) {
            method1356(null, (byte) 10, null);
        }
        field3121 = null;
    }

    @OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3126++;
        this.method1371((byte) -107);
        super.finalize();
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
    public static final void method1360(int arg0, int arg1, int arg2) {
        field3130++;
        class338 var3 = class380.method2294((byte) 62, arg2, 14);
        var3.method2052((byte) 112);
        if (arg0 != -3547) {
            field3113 = 53;
        }
        var3.field4930 = arg1;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(Z)V")
    private final void method1361(boolean arg0) {
        if (arg0) {
            method1364(true, -65);
        }
        field3123++;
        this.field3112.method2883(this, -94);
        if (this.field3118) {
            OpenGL.glTexParameteri(this.field3116, 10241, this.field3122 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3116, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3116, 10241, this.field3122 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3116, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)I")
    public final int method1362(byte arg0) {
        if (arg0 != 16) {
            field3115 = 58;
        }
        field3124++;
        return this.field3131;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1363(byte arg0, byte[] arg1) {
        field3132++;
        class156 var2 = new class156(arg1);
        int var3 = var2.method941((byte) 124);
        int var4 = var2.method950(arg0 + 306);
        if (arg0 != -120) {
            method1358(true);
        }
        if (var4 < 0 || class245.field3519 != 0 && class245.field3519 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method942(var7, -5403, var4, 0);
            return var7;
        } else {
            int var5 = var2.method950(186);
            if (var5 < 0 || !(class245.field3519 == 0 || var5 <= class245.field3519)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class143.method900(var6, var5, arg1, var4, 9);
            } else {
                class504.field7695.method1215(var2, (byte) -19, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)I")
    public static final int method1364(boolean arg0, int arg1) {
        if (arg0) {
            return 60;
        } else {
            field3107++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(Z)I")
    private final int method1365(boolean arg0) {
        if (arg0) {
            return 11;
        } else {
            field3114++;
            int var2 = this.field3112.method2905(8, this.field3119) * this.field3111;
            return this.field3122 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
    public final void method1366(int arg0, boolean arg1) {
        if (arg0 != 3) {
            return;
        }
        if (this.field3122 != arg1) {
            int var3 = this.method1365(false);
            this.field3122 = true;
            this.method1361(false);
            this.method1367(16, var3);
        }
        field3128++;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
    private final void method1367(int arg0, int arg1) {
        field3110++;
        this.field3112.field7334 -= arg1;
        if (arg0 == 16) {
            this.field3112.field7334 += this.method1365(false);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
    public static final int method1368(int arg0, int arg1) {
        if (arg1 != 4) {
            field3115 = -10;
        }
        field3108++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
    public final boolean method1369(int arg0) {
        if (arg0 != -1) {
            this.field3131 = 111;
        }
        field3127++;
        if (!this.field3112.field7348) {
            return false;
        }
        int var2 = this.method1365(false);
        this.field3112.method2883(this, 110);
        OpenGL.glGenerateMipmapEXT(this.field3116);
        this.field3122 = true;
        this.method1361(false);
        this.method1367(arg0 ^ 0xFFFFFFEF, var2);
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B[II[II)V")
    public static final void method1370(byte arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 >= -118) {
            method1364(false, 76);
        }
        field3120++;
        if (arg2 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg2) / 2;
        int var6 = arg4;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (arg1[var10] < (var7 + (var9 & var10))) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                int var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method1370((byte) -128, arg1, var6 - 1, arg3, arg4);
        method1370((byte) -122, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public final void method1371(byte arg0) {
        if (this.field3131 > 0) {
            this.field3112.method2892(this.field3131, arg0 ^ 0x16, this.method1365(false));
            this.field3131 = 0;
        }
        if (arg0 == -107) {
            field3106++;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lrl;IIIZ)V")
    public class221(class487 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3119 = arg2;
        this.field3122 = arg4;
        this.field3116 = arg1;
        this.field3112 = arg0;
        this.field3111 = arg3;
        OpenGL.glGenTextures(1, class175.field2398, 0);
        this.field3131 = class175.field2398[0];
        this.method1367(16, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public abstract void method224(int arg0);
}
