import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class509 {

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Z")
    private boolean field7426 = false;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    private int field7431 = 32;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "J")
    private long field7424 = class254.method1522((byte) -51);

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
    private boolean field7441 = true;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    private int field7443 = 0;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "[Loo;")
    private class31[] field7446 = new class31[8];

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    private int field7442 = 0;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "J")
    private long field7439 = 0L;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    private int field7452 = 0;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "J")
    private long field7455 = 0L;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "[Loo;")
    private class31[] field7451 = new class31[8];

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    private int field7454 = 0;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "Lkc;")
    public static class157 field7440 = new class157("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "Lde;")
    public static class10 field7449 = new class10(14, 0, 4, 1);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    private int field7450;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public int field7457;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "Loo;")
    private class31 field7437;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "Ldk;")
    public static class421 field7453;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "[I")
    public int[] field7430;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "[I")
    public static int[] field7456;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "[J")
    public static long[] field7435;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lsq;")
    public static final class363 method3013(int arg0, int arg1) {
        field7428++;
        class363 var2 = (class363) class27.field373.method2767((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class247.field3364.method2512(1, (byte) -93, arg0);
        if (arg1 != -14838) {
            method3013(110, 120);
        }
        class363 var4 = new class363();
        var4.field5214 = arg0;
        if (var3 != null) {
            var4.method2170(-128, new class319(var3));
        }
        var4.method2173((byte) -93);
        if (var4.field5207 == 2 && class331.field4494.method1592((byte) -25, (long) arg0) == null) {
            class331.field4494.method1586(new class437(class461.field6675), (long) arg0, 1);
            class80.field1128[class461.field6675++] = var4;
        }
        class27.field373.method2777(arg1 ^ 0x3DF5, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final synchronized void method3014(int arg0) {
        this.field7441 = true;
        field7445++;
        try {
            this.method961();
            if (arg0 != 14394) {
                method3013(-62, -5);
            }
        } catch (Exception var2) {
            this.method960();
            this.field7439 = class254.method1522((byte) -51) + 2000L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public final synchronized void method3015(int arg0) {
        field7448++;
        if (this.field7426) {
            return;
        }
        long var2 = class254.method1522((byte) -51);
        try {
            if (this.field7424 + 500000L < var2) {
                this.field7424 = var2 - 500000L;
            }
            while (var2 > this.field7424 + 5000L) {
                this.method3022(256, (byte) -119);
                this.field7424 += (256000 / class506.field7397);
            }
        } catch (Exception var7) {
            this.field7424 = var2;
        }
        if (this.field7430 == null) {
            return;
        }
        try {
            if (this.field7439 != 0L) {
                if (var2 < this.field7439) {
                    return;
                }
                this.method959(this.field7447);
                this.field7441 = true;
                this.field7439 = 0L;
            }
            int var4 = this.method956();
            if (this.field7442 - var4 > this.field7454) {
                this.field7454 = this.field7442 - var4;
            }
            int var5 = this.field7457 + this.field7450;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field7447 < var5 + 256) {
                this.field7447 += 1024;
                if (this.field7447 > 16384) {
                    this.field7447 = 16384;
                }
                this.method960();
                var4 = 0;
                this.method959(this.field7447);
                if ((var5 + 256) > this.field7447) {
                    var5 = this.field7447 - 256;
                    this.field7450 = var5 - this.field7457;
                }
                this.field7441 = true;
            }
            if (arg0 != 0) {
                field7453 = null;
            }
            while (var4 < var5) {
                this.method3019(this.field7430, 256);
                this.method962();
                var4 += 256;
            }
            if (this.field7455 < var2) {
                if (this.field7441) {
                    this.field7441 = false;
                } else if (this.field7454 == 0 && this.field7443 == 0) {
                    this.method960();
                    this.field7439 = var2 + 2000L;
                    return;
                } else {
                    this.field7450 = Math.min(this.field7443, this.field7454);
                    this.field7443 = this.field7454;
                }
                this.field7455 = var2 + 2000L;
                this.field7454 = 0;
            }
            this.field7442 = var4;
        } catch (Exception var6) {
            this.method960();
            this.field7439 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V")
    public static void method3016(int arg0) {
        if (arg0 != -24435) {
            field7440 = null;
        }
        field7435 = null;
        field7449 = null;
        field7440 = null;
        field7456 = null;
        field7453 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
    public void method960() {
        field7425++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method957(Component arg0) throws Exception {
        field7422++;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
    public final synchronized void method3017(int arg0) {
        if (class500.field7324 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class500.field7324.field1896[var3] == this) {
                    class500.field7324.field1896[var3] = null;
                }
                if (class500.field7324.field1896[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class500.field7324.field1891 = true;
                while (class500.field7324.field1895) {
                    class334.method2047(50L, 0);
                }
                class500.field7324 = null;
            }
        }
        field7423++;
        this.method960();
        if (arg0 > 83) {
            this.field7430 = null;
            this.field7426 = true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILoo;I)V")
    private final void method3018(int arg0, class31 arg1, int arg2) {
        field7434++;
        int var4 = arg0 >> 5;
        class31 var5 = this.field7446[var4];
        if (var5 == null) {
            this.field7451[var4] = arg1;
        } else {
            var5.field468 = arg1;
        }
        if (arg2 == 24819) {
            this.field7446[var4] = arg1;
            arg1.field467 = arg0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([II)V")
    private final void method3019(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class163.field2472) {
            var3 = arg1 << 1;
        }
        class57.method375(arg0, 0, var3);
        this.field7452 -= arg1;
        if (this.field7437 != null && this.field7452 <= 0) {
            this.field7452 += class506.field7397 >> 4;
            class240.method1461((byte) -18, this.field7437);
            this.method3018(this.field7437.method227(), this.field7437, 24819);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class31 var10 = null;
                        class31 var11 = this.field7451[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class198 var12 = var11.field469;
                                if (var12 == null || var12.field2897 <= var8) {
                                    var11.field470 = true;
                                    int var13 = var11.method225();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2897 += var13;
                                    }
                                    if (var4 >= this.field7431) {
                                        break label107;
                                    }
                                    class31 var14 = var11.method226();
                                    if (var14 != null) {
                                        int var15 = var11.field467;
                                        while (var14 != null) {
                                            this.method3018(var15 * var14.method227() >> 8, var14, 24819);
                                            var14 = var11.method228();
                                        }
                                    }
                                    class31 var16 = var11.field468;
                                    var11.field468 = null;
                                    if (var10 == null) {
                                        this.field7451[var7] = var16;
                                    } else {
                                        var10.field468 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7446[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field468;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class31 var18 = this.field7451[var17];
                this.field7451[var17] = this.field7446[var17] = null;
                while (var18 != null) {
                    class31 var19 = var18.field468;
                    var18.field468 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7452 < 0) {
            this.field7452 = 0;
        }
        if (this.field7437 != null) {
            this.field7437.method231(arg0, 0, arg1);
        }
        this.field7424 = class254.method1522((byte) -51);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Loo;B)V")
    public final synchronized void method3020(class31 arg0, byte arg1) {
        this.field7437 = arg0;
        field7444++;
        if (arg1 != 87) {
            this.field7439 = 103L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public void method959(int arg0) throws Exception {
        field7429++;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
    public int method956() throws Exception {
        field7432++;
        return this.field7447;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
    public final void method3021(int arg0) {
        field7427++;
        if (arg0 != -27669) {
            method3013(-89, -3);
        }
        this.field7441 = true;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
    public void method961() throws Exception {
        field7436++;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
    private final void method3022(int arg0, byte arg1) {
        this.field7452 -= arg0;
        field7438++;
        if (this.field7452 < 0) {
            this.field7452 = 0;
        }
        if (this.field7437 != null) {
            this.field7437.method230(arg0);
        }
        int var3 = 24 / ((-arg1 - 45) / 44);
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()V")
    public void method962() throws Exception {
        field7433++;
    }
}
