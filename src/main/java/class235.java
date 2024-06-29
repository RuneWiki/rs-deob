import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class235 {

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    private int field3336 = 32;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
    private boolean field3346 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "J")
    private long field3326 = class264.method1698(true);

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "[Lho;")
    private class218[] field3349 = new class218[8];

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "J")
    private long field3355 = 0L;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    private int field3353 = 0;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Z")
    private boolean field3357 = true;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "J")
    private long field3359 = 0L;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    private int field3360 = 0;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field3358 = 0;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field3350 = 0;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "[Lho;")
    private class218[] field3356 = new class218[8];

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
    public static int[] field3338;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lho;")
    private class218 field3333;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
    public int[] field3339;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public void method924() throws Exception {
        field3331++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method1588(int arg0) {
        field3330++;
        if (arg0 != 7) {
            this.method1588(-33);
        }
        this.field3357 = true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
    private final void method1589(boolean arg0, int arg1) {
        field3344++;
        this.field3353 -= arg1;
        if (this.field3353 < 0) {
            this.field3353 = 0;
        }
        if (arg0 && this.field3333 != null) {
            this.field3333.method1225(arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILm;IIBLqa;)V")
    public static final void method1590(int arg0, int arg1, class373 arg2, int arg3, int arg4, byte arg5, class496 arg6) {
        field3337++;
        if (class369.field5668 < 100) {
            class162.method1147((byte) -63, arg6, arg2);
        }
        arg6.method1046(arg3, arg0, arg1 + arg3, arg0 + arg4);
        if (class369.field5668 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg1 / 2);
            int var9 = arg4 / 2 + arg0 - var7 - 18;
            arg6.method1112(arg3, arg0, arg1, arg4, -16777216, 0);
            arg6.method1125(var8 - 152, var9, 304, 34, class104.field1482[class460.field6747].getRGB(), 0);
            arg6.method1112(var8 - 150, var9 + 2, class369.field5668 * 3, 30, class225.field3212[class460.field6747].getRGB(), 0);
            class104.field1497.method239(-1, 14144, class341.field5380.method2335((byte) -100, class288.field4292), class304.field4469[class460.field6747].getRGB(), var8, var7 + var9);
            return;
        }
        int var10 = class277.field3839 - ((int) ((float) arg1 / class135.field1961));
        int var11 = (int) ((float) arg4 / class135.field1961) + class501.field7487;
        int var12 = (int) ((float) arg1 / class135.field1961) + class277.field3839;
        class302.field4451 = class277.field3839 - (int) ((float) arg1 / class135.field1961);
        class520.field7712 = (int) ((float) (arg4 * 2) / class135.field1961);
        class288.field4294 = (int) ((float) (arg1 * 2) / class135.field1961);
        class407.field6153 = class501.field7487 - ((int) ((float) arg4 / class135.field1961));
        int var13 = class501.field7487 - ((int) ((float) arg4 / class135.field1961));
        class135.method889(var10 + class135.field1969, var11 - -class135.field1974, class135.field1969 + var12, class135.field1974 + var13, arg3, arg0, arg1 + arg3, arg0 + 1 + arg4);
        class135.method897(arg6);
        if (arg5 != -51) {
            return;
        }
        class306 var14 = class135.method878(arg6);
        class370.method2319(0, (byte) 111, var14, arg6, 0);
        if (class56.field756 > 0) {
            class480.field7013--;
            if (class480.field7013 == 0) {
                class56.field756--;
                class480.field7013 = 20;
            }
        }
        if (!class430.field6388) {
            return;
        }
        int var15 = arg1 + arg3 - 5;
        int var16 = arg4 + arg0 - 8;
        class84.field1153.method240(var16, var15, "Fps:" + class167.field2433, 16776960, (byte) 84, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class84.field1153.method240(var20, var15, "Mem:" + var18 + "k", var19, (byte) 51, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
    public void method930() throws Exception {
        field3347++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method928(Component arg0) throws Exception {
        field3343++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public void method927(int arg0) throws Exception {
        field3340++;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final synchronized void method1591(int arg0) {
        field3329++;
        if (this.field3346) {
            return;
        }
        long var2 = class264.method1698(true);
        try {
            if (this.field3326 + 500000L < var2) {
                this.field3326 = var2 - 500000L;
            }
            while (var2 > this.field3326 + 5000L) {
                this.method1589(true, 256);
                this.field3326 += (256000 / class462.field6769);
            }
        } catch (Exception var7) {
            this.field3326 = var2;
        }
        if (this.field3339 == null) {
            return;
        }
        try {
            if (arg0 != 12465) {
                this.method1595(-69, -90, null);
            }
            if (this.field3359 != 0L) {
                if (this.field3359 > var2) {
                    return;
                }
                this.method927(this.field3351);
                this.field3357 = true;
                this.field3359 = 0L;
            }
            int var4 = this.method925();
            if ((this.field3358 - var4) > this.field3350) {
                this.field3350 = this.field3358 - var4;
            }
            int var5 = this.field3354 + this.field3352;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field3351) {
                this.field3351 += 1024;
                if (this.field3351 > 16384) {
                    this.field3351 = 16384;
                }
                this.method926();
                this.method927(this.field3351);
                var4 = 0;
                this.field3357 = true;
                if (this.field3351 < (var5 + 256)) {
                    var5 = this.field3351 - 256;
                    this.field3352 = var5 - this.field3354;
                }
            }
            while (var4 < var5) {
                this.method1592(this.field3339, 256);
                var4 += 256;
                this.method930();
            }
            if (this.field3355 < var2) {
                if (this.field3357) {
                    this.field3357 = false;
                } else if (this.field3350 == 0 && this.field3360 == 0) {
                    this.method926();
                    this.field3359 = var2 + 2000L;
                    return;
                } else {
                    this.field3352 = Math.min(this.field3360, this.field3350);
                    this.field3360 = this.field3350;
                }
                this.field3355 = var2 + 2000L;
                this.field3350 = 0;
            }
            this.field3358 = var4;
        } catch (Exception var6) {
            this.method926();
            this.field3359 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V")
    private final void method1592(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class40.field620) {
            var3 = arg1 << 1;
        }
        class361.method2279(arg0, 0, var3);
        this.field3353 -= arg1;
        if (this.field3333 != null && this.field3353 <= 0) {
            this.field3353 += class462.field6769 >> 4;
            class162.method1153(this.field3333, 119);
            this.method1595(-88, this.field3333.method1247(), this.field3333);
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
                        class218 var10 = null;
                        class218 var11 = this.field3356[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class210 var12 = var11.field3021;
                                if (var12 == null || var12.field2969 <= var8) {
                                    var11.field3020 = true;
                                    int var13 = var11.method1237();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2969 += var13;
                                    }
                                    if (var4 >= this.field3336) {
                                        break label107;
                                    }
                                    class218 var14 = var11.method1251();
                                    if (var14 != null) {
                                        int var15 = var11.field3023;
                                        while (var14 != null) {
                                            this.method1595(-124, var15 * var14.method1247() >> 8, var14);
                                            var14 = var11.method1260();
                                        }
                                    }
                                    class218 var16 = var11.field3022;
                                    var11.field3022 = null;
                                    if (var10 == null) {
                                        this.field3356[var7] = var16;
                                    } else {
                                        var10.field3022 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3349[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3022;
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
                class218 var18 = this.field3356[var17];
                this.field3356[var17] = this.field3349[var17] = null;
                while (var18 != null) {
                    class218 var19 = var18.field3022;
                    var18.field3022 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3353 < 0) {
            this.field3353 = 0;
        }
        if (this.field3333 != null) {
            this.field3333.method1235(arg0, 0, arg1);
        }
        this.field3326 = class264.method1698(true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ID)V")
    public static final void method1593(int arg0, double arg1) {
        field3327++;
        int var3 = 105 / ((arg0 - 70) / 38);
        if (class37.field595 == arg1) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
            class197.field2785[var4] = var5 > 255 ? 255 : var5;
        }
        class37.field595 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public final synchronized void method1594(boolean arg0) {
        field3348++;
        if (class62.field885 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class62.field885.field6752[var3] == this) {
                    class62.field885.field6752[var3] = null;
                }
                if (class62.field885.field6752[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class62.field885.field6753 = true;
                while (class62.field885.field6746) {
                    class106.method710(50L, (byte) 6);
                }
                class62.field885 = null;
            }
        }
        if (arg0) {
            this.method1592(null, -6);
        }
        this.method926();
        this.field3339 = null;
        this.field3346 = true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILho;)V")
    private final void method1595(int arg0, int arg1, class218 arg2) {
        field3328++;
        if (arg0 > -76) {
            this.method1595(82, -1, null);
        }
        int var4 = arg1 >> 5;
        class218 var5 = this.field3349[var4];
        if (var5 == null) {
            this.field3356[var4] = arg2;
        } else {
            var5.field3022 = arg2;
        }
        this.field3349[var4] = arg2;
        arg2.field3023 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final synchronized void method1596(byte arg0) {
        field3341++;
        this.field3357 = true;
        try {
            if (arg0 != -37) {
                this.method1589(false, -54);
            }
            this.method924();
        } catch (Exception var2) {
            this.method926();
            this.field3359 = class264.method1698(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILho;)V")
    public final synchronized void method1597(int arg0, class218 arg1) {
        this.field3333 = arg1;
        field3335++;
        if (arg0 != 8) {
            this.field3356 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()I")
    public int method925() throws Exception {
        field3342++;
        return this.field3351;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static void method1598(int arg0) {
        field3338 = null;
        int var1 = -2 / ((arg0 - 45) / 44);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[[B[I[B[III[[B)I")
    public static final int method1599(int arg0, byte[][] arg1, int[] arg2, byte[] arg3, int[] arg4, int arg5, int arg6, byte[][] arg7) {
        field3332++;
        int var8 = arg2[arg6];
        int var9 = var8 + arg4[arg6];
        int var10 = arg2[arg5];
        int var11 = arg4[arg5] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg3[arg6] & 0xFF;
        if ((arg3[arg5] & 0xFF) < var14) {
            var14 = arg3[arg5] & 0xFF;
        }
        byte[] var15 = arg7[arg6];
        if (arg0 > -38) {
            field3345 = 77;
        }
        byte[] var16 = arg1[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public void method926() {
        field3325++;
    }

    static {
        new class375("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field3338 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
        field3345 = 0;
    }
}
