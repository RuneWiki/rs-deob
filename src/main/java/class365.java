import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class365 extends class260 {

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public int field5351 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Ldi;")
    public static class83 field5345 = new class83(37, 3);

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "[I")
    public static int[] field5357 = new int[1];

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "Lqp;")
    public static class466 field5355 = new class466("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public int field5335;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field5336;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field5339;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field5343;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field5344;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field5347;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public int field5348;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Ljo;")
    public class220 field5361;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Lsk;")
    public class438 field5353;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Ldw;")
    public class502 field5337;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lhn;")
    public class505 field5342;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Lhn;")
    public class505 field5356;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Z")
    public boolean field5349;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "[I")
    public int[] field5352;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLya;)V", line = 8)
    public static final void method2198(byte arg0, class38 arg1) {
        field5341++;
        int var2 = class88.field1290;
        int var3 = class263.field3634;
        int var4 = class464.field6821;
        int var5 = class142.field2034 - 3;
        byte var6 = 20;
        if (class98.field1487 == null || class89.field1306 == null) {
            if (class364.field5334.method747(class240.field3366, (byte) -68) && class364.field5334.method747(class336.field4522, (byte) -68)) {
                class98.field1487 = arg1.method265(class4.method22(class364.field5334, class240.field3366, 0), true);
                class4 var7 = class4.method22(class364.field5334, class336.field4522, 0);
                class89.field1306 = arg1.method265(var7, true);
                var7.method27();
                class457.field6711 = arg1.method265(var7, true);
            } else {
                arg1.method243(var2, var3, var4, var6, 255 - class370.field5403 << 24 | class382.field5581, 1);
            }
        }
        if (class98.field1487 != null && class89.field1306 != null) {
            int var8 = (var4 - (class89.field1306.method102() * 2)) / class98.field1487.method102();
            for (int var9 = 0; var9 < var8; var9++) {
                class98.field1487.method85(var2 + class89.field1306.method102() + (var9 * class98.field1487.method102()), var3);
            }
            class89.field1306.method85(var2, var3);
            class457.field6711.method85(var4 + var2 - class457.field6711.method102(), var3);
        }
        class135.field1949.method1833(var2 + 3, class391.field5725.method2731(62, class372.field5455), -1, 86, var3 + 14, class275.field3769 | 0xFF000000);
        arg1.method243(var2, var3 + var6, var4, var5 - var6, -class370.field5403 + 255 << 24 | class382.field5581, 1);
        int var10 = class518.field7668.method1813(0);
        if (arg0 != 70) {
            return;
        }
        int var11 = class518.field7668.method1822(126);
        int var12 = 0;
        for (class82 var13 = (class82) class526.field7778.method2818((byte) 120); var13 != null; var13 = (class82) class526.field7778.method2820((byte) -58)) {
            int var30 = (class274.field3764 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var10 > var2 && var10 < var2 + var4 && var11 > (var30 - 13) && var30 + 4 > var11 && var13.field1234) {
                arg1.method243(var2, var30 - 12, var4, 16, class520.field7706 | 255 - class289.field4014 << 24, 1);
            }
            var12++;
        }
        if ((class17.field233 == null || class316.field4327 == null || class483.field7052 == null) && class364.field5334.method747(class300.field4124, (byte) -68) && class364.field5334.method747(class127.field1890, (byte) -68) && class364.field5334.method747(class93.field1339, (byte) -68)) {
            class4 var14 = class4.method22(class364.field5334, class127.field1890, 0);
            class316.field4327 = arg1.method265(var14, true);
            var14.method27();
            class258.field3592 = arg1.method265(var14, true);
            class17.field233 = arg1.method265(class4.method22(class364.field5334, class300.field4124, 0), true);
            class4 var15 = class4.method22(class364.field5334, class93.field1339, 0);
            class483.field7052 = arg1.method265(var15, true);
            var15.method27();
            class531.field7824 = arg1.method265(var15, true);
        }
        if (class17.field233 != null && class316.field4327 != null && class483.field7052 != null) {
            int var16 = (var4 - class483.field7052.method102() * 2) / class17.field233.method102();
            for (int var17 = 0; var17 < var16; var17++) {
                class17.field233.method85(var2 + class483.field7052.method102() + var17 * class17.field233.method102(), var3 + var5 + -class17.field233.method98());
            }
            int var18 = (var5 - class483.field7052.method98() - var6) / class316.field4327.method98();
            for (int var19 = 0; var19 < var18; var19++) {
                class316.field4327.method85(var2, class316.field4327.method98() * var19 + var3 + var6);
                class258.field3592.method85(var2 + var4 - class258.field3592.method102(), var6 + var3 + var19 * class316.field4327.method98());
            }
            class483.field7052.method85(var2, var5 + var3 - class483.field7052.method98());
            class531.field7824.method85(var2 + var4 - class483.field7052.method102(), var3 - -var5 + -class483.field7052.method98());
        }
        int var20 = 0;
        for (class82 var21 = (class82) class526.field7778.method2818((byte) -7); var21 != null; var21 = (class82) class526.field7778.method2820((byte) -58)) {
            int var22 = var3 + 13 - (-((class274.field3764 + -1 + -var20) * 16) + -var6);
            int var23 = class275.field3769 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && (var22 - 13) < var11 && var22 + 4 > var11 && var21.field1234) {
                var23 = class402.field5899 | 0xFF000000;
            }
            int[] var24 = null;
            if (class256.method1540(var21.field1230, -105)) {
                var24 = class328.field4480.method3091(arg0 ^ 0x3B, (int) var21.field1238).field7552;
            } else if (var21.field1235 != -1) {
                var24 = class328.field4480.method3091(82, var21.field1235).field7552;
            } else if (class442.method2632((byte) -34, var21.field1230)) {
                class502 var25 = class378.field5533[(int) var21.field1238];
                if (var25 != null) {
                    class79 var26 = var25.field7387;
                    if (var26.field1143 != null) {
                        var26 = var26.method646(0, class421.field6166);
                    }
                    if (var26 != null) {
                        var24 = var26.field1209;
                    }
                }
            } else if (class90.method672(var21.field1230, (byte) 93)) {
                Object var27 = null;
                class220 var28;
                if (var21.field1230 == 1006) {
                    var28 = class78.field1141.method2103((int) var21.field1238, true);
                } else {
                    var28 = class78.field1141.method2103((int) (var21.field1238 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var28.field3080 != null) {
                    var28 = var28.method1362(true, class421.field6166);
                }
                if (var28 != null) {
                    var24 = var28.field3132;
                }
            }
            String var29 = class113.method813(var21, -2048);
            if (var24 != null) {
                var29 = var29 + class235.method1451(0, var24);
            }
            class135.field1949.method1827(var22, 0, class383.field5592, class150.field2264, var29, var2 + 3, (byte) -24, var23);
            var20++;
            if (var21.field1236) {
                class511.field7573.method85(var2 + (class407.field5952.method2867(var29, (byte) -70) + 5), var22 + -12);
            }
        }
        class469.method2750(class464.field6821, class142.field2034, (byte) 68, class263.field3634, class88.field1290);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 214)
    public final void method2199(byte arg0) {
        if (arg0 != 65) {
            method2198((byte) 70, null);
        }
        field5340++;
        int var2 = this.field5348;
        if (this.field5361 != null) {
            class220 var3 = this.field5361.method1362(true, class421.field6166);
            if (var3 == null) {
                this.field5348 = -1;
                this.field5354 = 0;
                this.field5338 = 0;
                this.field5352 = null;
                this.field5343 = 0;
                this.field5358 = 0;
            } else {
                this.field5348 = var3.field3069;
                this.field5338 = var3.field3128;
                this.field5354 = var3.field3139;
                this.field5343 = var3.field3106 << 7;
                this.field5358 = var3.field3062;
                this.field5352 = var3.field3066;
            }
        } else if (this.field5337 != null) {
            int var4 = class52.method451(this.field5337, arg0 ^ 0x37);
            if (var2 != var4) {
                this.field5348 = var4;
                class79 var5 = this.field5337.field7387;
                if (var5.field1143 != null) {
                    var5 = var5.method646(0, class421.field6166);
                }
                if (var5 == null) {
                    this.field5354 = this.field5343 = 0;
                } else {
                    this.field5343 = var5.field1195 << 7;
                    this.field5354 = var5.field1202;
                }
            }
        } else if (this.field5353 != null) {
            this.field5348 = class178.method1152(200, this.field5353);
            this.field5343 = this.field5353.field6427 << 7;
            this.field5354 = this.field5353.field6448;
        }
        if (this.field5348 != var2 && this.field5356 != null) {
            class361.field5267.method582(this.field5356);
            this.field5356 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 298)
    public static void method2200(int arg0) {
        field5355 = null;
        int var1 = 22 % ((-arg0 - 6) / 39);
        field5345 = null;
        field5357 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lmg;Lmg;Lmg;ZLmg;)V", line = 310)
    public static final void method2201(class101 arg0, class101 arg1, class101 arg2, boolean arg3, class101 arg4) {
        class136.field1958 = arg1;
        class519.field7685 = arg2;
        class527.field7794 = arg4;
        if (!arg3) {
            field5357 = null;
        }
        field5346++;
        class274.field3763 = arg0;
        class495.field7226 = new class150[class136.field1958.method746(73)][];
        class255.field3535 = new boolean[class136.field1958.method746(34)];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V", line = 345)
    public static final void method2202(int arg0, int arg1, int arg2) {
        field5360++;
        class247 var3 = new class247(16);
        int var4 = -53 / ((arg2 - 38) / 50);
        for (class135 var5 = (class135) class36.field457.method1494(0); var5 != null; var5 = (class135) class36.field457.method1493((byte) 124)) {
            var5.method1565(0);
            int var6 = (int) (var5.field3615 >> 28);
            int var7 = (int) (var5.field3615 >> 14 & 0x3FFFL) - arg1;
            int var8 = (int) (var5.field3615 & 0x3FFFL) - arg0;
            if (var8 >= 0 && var7 >= 0 && class527.field7799 > var8 && var7 < class422.field6182) {
                var3.method1487(-47, (long) (var6 << 28 | var7 << 14 | var8), var5);
            }
        }
        class36.field457 = var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lba;III[Z)V", line = 380)
    public static final void method2203(class263 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class89.field1302 == class211.field2950) {
            return;
        }
        int var5 = class385.field5608[arg1].method361(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class142 var7 = class385.field5608[var6];
                if (var7 != null) {
                    var7.method363(arg0, arg2, var5 - var7.method361(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
