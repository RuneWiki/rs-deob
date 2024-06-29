import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class262 {

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public int field3570 = -1;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Z")
    public boolean field3578 = true;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public int field3579 = 128;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    private int field3575 = 0;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3574 = "shake:";

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "J")
    public static long field3580 = 0L;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "Lam;")
    public static class286 field3582;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1459(int arg0, int arg1) {
        field3576++;
        class51.field498 = arg0;
        if (arg1 != -2) {
            field3574 = null;
        }
        class114 var2 = class77.field869;
        synchronized (class77.field869) {
            class77.field869.method613(true);
        }
        class114 var3 = class12.field111;
        synchronized (class12.field111) {
            class12.field111.method613(true);
        }
        class114 var4 = class291.field3956;
        synchronized (class291.field3956) {
            class291.field3956.method613(true);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Z", line = 28)
    public static final boolean method1460(byte arg0, int arg1) {
        field3581++;
        if (class289.field3940[arg1]) {
            return true;
        } else if (class131.field1693.method1671(arg1, (byte) -84)) {
            if (arg0 >= -120) {
                field3573 = -14;
            }
            int var2 = class131.field1693.method1691(arg1, 0);
            if (var2 == 0) {
                class289.field3940[arg1] = true;
                return true;
            }
            if (class235.field3227[arg1] == null) {
                class235.field3227[arg1] = new class194[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class235.field3227[arg1][var3] == null) {
                    byte[] var4 = class131.field1693.method1687(var3, arg1, 255);
                    if (var4 != null) {
                        class194 var5 = class235.field3227[arg1][var3] = new class194();
                        var5.field2502 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1044(new class250(var4), (byte) 110);
                        } else {
                            var5.method1047((byte) -44, new class250(var4));
                        }
                    }
                }
            }
            class289.field3940[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)I", line = 86)
    public static int method1461(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V", line = 115)
    private final void method1462(int arg0, int arg1) {
        field3584++;
        double var3 = (double) ((arg1 & 0xFFAD9B) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF42) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3569 = (int) (var17 * 256.0D);
        if (arg0 <= 125) {
            method1464(31, 79, 27);
        }
        this.field3568 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field3583 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3583 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3568 < 0) {
            this.field3568 = 0;
        } else if (this.field3568 > 255) {
            this.field3568 = 255;
        }
        if (this.field3569 < 0) {
            this.field3569 = 0;
        } else if (this.field3569 > 255) {
            this.field3569 = 255;
        }
        if (this.field3583 < 1) {
            this.field3583 = 1;
        }
        this.field3571 = (int) ((double) this.field3583 * var19);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILam;)V", line = 208)
    public static final void method1463(int arg0, class286 arg1) {
        if (arg0 <= 120) {
            method1464(-3, -31, -118);
        }
        class36.field380 = arg1;
        field3572++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V", line = 219)
    public static final void method1464(int arg0, int arg1, int arg2) {
        field3587++;
        class40 var3 = class162.method872(arg2, (byte) 92, 14);
        if (arg0 != -1) {
            field3582 = null;
        }
        var3.method190(0);
        var3.field418 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLtq;I)V", line = 235)
    public final void method1465(boolean arg0, class250 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method1350(31351);
            if (var4 == 0) {
                field3577++;
                return;
            }
            this.method1466(arg1, var4, 13831, arg2);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ltq;III)V", line = 261)
    private final void method1466(class250 arg0, int arg1, int arg2, int arg3) {
        field3586++;
        if (arg1 == 1) {
            this.field3575 = arg0.method1372(-2);
            this.method1462(127, this.field3575);
        } else if (arg1 == 2) {
            this.field3570 = arg0.method1374(-2);
            if (this.field3570 == 65535) {
                this.field3570 = -1;
            }
        } else if (arg1 == 3) {
            this.field3579 = arg0.method1374(-2);
        } else if (arg1 == 4) {
            this.field3578 = false;
        }
        if (arg2 != 13831) {
            method1459(-64, 62);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 302)
    public static void method1467(int arg0) {
        if (arg0 != 23227) {
            field3582 = null;
        }
        field3582 = null;
        field3574 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 320)
    public static final void method1468(byte arg0) {
        field3585++;
        class114 var1 = class204.field2762;
        synchronized (class204.field2762) {
            if (arg0 != -102) {
                return;
            }
            class204.field2762.method606((byte) 111);
        }
        class114 var2 = class104.field1286;
        synchronized (class104.field1286) {
            class104.field1286.method606((byte) 103);
        }
    }
}
