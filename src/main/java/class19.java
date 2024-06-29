import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Z")
    private boolean field332 = false;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    private int field351 = 32;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
    private long field337 = class385.method2442(-6631);

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
    private long field358 = 0L;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "[Ler;")
    private class55[] field364 = new class55[8];

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Z")
    private boolean field362 = true;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "[Ler;")
    private class55[] field363 = new class55[8];

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    private int field356 = 0;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "J")
    private long field361 = 0L;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    private int field369 = 0;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    private int field368 = 0;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field344 = 16777215;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "Lbj;")
    public static class131 field353;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "[B")
    public static byte[] field359;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "Lnq;")
    public static class268 field341;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Ler;")
    private class55 field345;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
    public int[] field336;

    static {
        new class442("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field353 = new class131(20);
        int var0 = 0;
        field359 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field359[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field367 = 0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 3)
    public static void method255(int arg0) {
        field359 = null;
        field353 = null;
        field341 = null;
        if (arg0 != 0) {
            field359 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V", line = 21)
    public void method256() throws Exception {
        field333++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "()V", line = 30)
    public void method257() throws Exception {
        field338++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 37)
    public final synchronized void method258(byte arg0) {
        if (class272.field3767 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class272.field3767.field3328[var3] == this) {
                    class272.field3767.field3328[var3] = null;
                }
                if (class272.field3767.field3328[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class272.field3767.field3325 = true;
                while (class272.field3767.field3329) {
                    class349.method2219(50L, -123);
                }
                class272.field3767 = null;
            }
        }
        if (arg0 == -118) {
            field340++;
            this.method268();
            this.field332 = true;
            this.field336 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)Lpk;", line = 85)
    public static final class109 method259(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        return var3 == null || var3.field1739 == null ? null : var3.field1739;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLer;)V", line = 92)
    public final synchronized void method260(byte arg0, class55 arg1) {
        field343++;
        if (arg0 != -77) {
            method269((class268) null, (byte) 90, 89);
        }
        this.field345 = arg1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 103)
    public void method261(Component arg0) throws Exception {
        field350++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 115)
    public final synchronized void method262(int arg0) {
        field346++;
        if (arg0 >= -115) {
            field341 = null;
        }
        this.field362 = true;
        try {
            this.method256();
        } catch (Exception var2) {
            this.method268();
            this.field361 = class385.method2442(-6631) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ler;IB)V", line = 134)
    private final void method263(class55 arg0, int arg1, byte arg2) {
        field334++;
        int var4 = -1 % ((-arg2 - 30) / 59);
        int var5 = arg1 >> 5;
        class55 var6 = this.field364[var5];
        if (var6 == null) {
            this.field363[var5] = arg0;
        } else {
            var6.field759 = arg0;
        }
        this.field364[var5] = arg0;
        arg0.field758 = arg1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V", line = 157)
    private final void method264(int arg0, int arg1) {
        field349++;
        if (arg1 != -574) {
            return;
        }
        this.field368 -= arg0;
        if (this.field368 < 0) {
            this.field368 = 0;
        }
        if (this.field345 != null) {
            this.field345.method455(arg0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "()I", line = 176)
    public int method265() throws Exception {
        field339++;
        return this.field355;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V", line = 187)
    public final synchronized void method266(byte arg0) {
        field342++;
        if (this.field332) {
            return;
        }
        if (arg0 != -47) {
            this.method263((class55) null, -91, (byte) 69);
        }
        long var2 = class385.method2442(-6631);
        try {
            if (this.field337 + 500000L < var2) {
                this.field337 = var2 - 500000L;
            }
            while (var2 > (this.field337 + 5000L)) {
                this.method264(256, -574);
                this.field337 += (long) (256000 / class76.field1094);
            }
        } catch (Exception var7) {
            this.field337 = var2;
        }
        if (this.field336 == null) {
            return;
        }
        try {
            if (this.field361 != 0L) {
                if (this.field361 > var2) {
                    return;
                }
                this.method270(this.field355);
                this.field361 = 0L;
                this.field362 = true;
            }
            int var4 = this.method265();
            if (this.field356 - var4 > this.field357) {
                this.field357 = this.field356 - var4;
            }
            int var5 = this.field366 + this.field365;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field355) {
                this.field355 += 1024;
                if (this.field355 > 16384) {
                    this.field355 = 16384;
                }
                this.method268();
                var4 = 0;
                this.method270(this.field355);
                if (this.field355 < (var5 + 256)) {
                    var5 = this.field355 - 256;
                    this.field365 = var5 - this.field366;
                }
                this.field362 = true;
            }
            while (var5 > var4) {
                this.method271(this.field336, 256);
                this.method257();
                var4 += 256;
            }
            if (this.field358 < var2) {
                if (this.field362) {
                    this.field362 = false;
                } else if (this.field357 == 0 && this.field369 == 0) {
                    this.method268();
                    this.field361 = var2 + 2000L;
                    return;
                } else {
                    this.field365 = Math.min(this.field369, this.field357);
                    this.field369 = this.field357;
                }
                this.field358 = var2 + 2000L;
                this.field357 = 0;
            }
            this.field356 = var4;
        } catch (Exception var6) {
            this.method268();
            this.field361 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lg;I)V", line = 303)
    public static final void method267(class87 arg0, int arg1) {
        field348++;
        if (arg0 == null || class121.field1699.field1267 == arg0) {
            return;
        }
        int var2 = arg0.field1215;
        int var3 = arg0.field1214;
        int var4 = arg0.field1217;
        int var5 = (int) arg0.field1216;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg0.field1216;
        int var8;
        int var9;
        if (class212.field2958 == null) {
            var8 = class361.field5001;
            var9 = class141.field2024;
        } else {
            var9 = class212.field2958.method384(3);
            var8 = class212.field2958.method383(6);
        }
        if (var4 == 46) {
            class134 var10 = class381.field5447[var5];
            if (var10 != null) {
                class290.field4070 = var8;
                class418.field5940 = 2;
                class325.field4448 = var9;
                class393.field5633 = 0;
                class337.field4629++;
                class46.field648.method1178(63, 195);
                class46.field648.method197(class203.field2790.method1872(82, arg1 ^ 0x116F) ? 1 : 0, -16651);
                class46.field648.method157(arg1 - 99, var5);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var10.method942(false), var10.field5332[0], 0, var10.field5326[0], 0, -1, var10.method942(false), true);
            }
        }
        if (var4 == 8) {
            class134 var11 = class381.field5447[var5];
            if (var11 != null) {
                class325.field4448 = var9;
                class203.field2784++;
                class290.field4070 = var8;
                class393.field5633 = 0;
                class418.field5940 = 2;
                class46.field648.method1178(63, 51);
                class46.field648.method178(var5, arg1 - 99);
                class46.field648.method176((byte) 42, class203.field2790.method1872(82, 4463) ? 1 : 0);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var11.method942(false), var11.field5332[0], 0, var11.field5326[0], 0, -1, var11.method942(false), true);
            }
        }
        if (var4 == 50) {
            class405.field5754++;
            class393.field5633 = 0;
            class418.field5940 = 1;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class46.field648.method1178(63, 127);
            class46.field648.method183(class447.field6269 + var3, true);
            class46.field648.method191(class212.field2968 + var2, arg1 + -97);
            class46.field648.method191(class178.field2451, arg1 - 110);
            class46.field648.method195(2, class231.field3339);
            class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -4, 1, var3, 0, var2, 0, -1, 1, true);
        }
        if (var4 == 60) {
            class418.field5940 = 2;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class393.field5633 = 0;
            class208.field2858++;
            class46.field648.method1178(63, 198);
            class46.field648.method169(-94, class231.field3339);
            class46.field648.method201(class203.field2790.method1872(82, arg1 ^ 0x116F) ? 1 : 0, 3);
            class46.field648.method178(class447.field6269 + var3, -65);
            class46.field648.method191(var5, -89);
            class46.field648.method178(class212.field2968 + var2, arg1 + -54);
            class46.field648.method183(class178.field2451, true);
            class71.method539(var3, var2, 0);
        }
        if (var4 == 51) {
            class290.field4070 = var8;
            class325.field4448 = var9;
            class393.field5633 = 0;
            class418.field5940 = 2;
            class374.field5284++;
            class46.field648.method1178(63, 122);
            class46.field648.method178(var5, -124);
            class46.field648.method183(var2 + class212.field2968, true);
            class46.field648.method178(class447.field6269 + var3, -99);
            class46.field648.method176((byte) 42, class203.field2790.method1872(82, 4463) ? 1 : 0);
            class71.method539(var3, var2, 0);
        }
        if (var4 == 49) {
            class276.field3840++;
            class393.field5633 = 0;
            class325.field4448 = var9;
            class418.field5940 = 2;
            class290.field4070 = var8;
            class46.field648.method1178(63, 254);
            class46.field648.method197(class203.field2790.method1872(82, 4463) ? 1 : 0, -16651);
            class46.field648.method178(class212.field2968 + var2, -37);
            class46.field648.method183(class447.field6269 + var3, true);
            class46.field648.method178(Integer.MAX_VALUE & (int) (var6 >>> 32), -41);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (var4 == 1008 || var4 == 1009 || var4 == 1007 || var4 == 1001 || var4 == 1012) {
            class429.method2711(var4, (byte) 98, var5, var2);
        }
        if (var4 == 5) {
            class134 var12 = class381.field5447[var5];
            if (var12 != null) {
                class325.field4448 = var9;
                class418.field5940 = 2;
                class237.field3372++;
                class393.field5633 = 0;
                class290.field4070 = var8;
                class46.field648.method1178(63, 204);
                class46.field648.method183(var5, true);
                class46.field648.method197(class203.field2790.method1872(82, arg1 + 4463) ? 1 : 0, -16651);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var12.method942(false), var12.field5332[0], 0, var12.field5326[0], 0, -1, var12.method942(false), true);
            }
        }
        if (var4 == 22) {
            class198 var13 = class98.field1358[var5];
            if (var13 != null) {
                class418.field5940 = 2;
                class325.field4448 = var9;
                class393.field5633 = 0;
                class425.field5994++;
                class290.field4070 = var8;
                class46.field648.method1178(63, 1);
                class46.field648.method157(112, class178.field2451);
                class46.field648.method195(arg1 + 2, class231.field3339);
                class46.field648.method178(var5, arg1 ^ 0xFFFFFFDE);
                class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var13.method942(false), var13.field5332[0], 0, var13.field5326[0], 0, -1, var13.method942(false), true);
            }
        }
        if (var4 == 47 || var4 == 1002) {
            class41.method381(var3, var5, arg0.field1220, var2, (byte) -113);
        }
        if (var4 == 1004) {
            class14.field271++;
            class418.field5940 = 2;
            class393.field5633 = 0;
            class290.field4070 = var8;
            class325.field4448 = var9;
            class46.field648.method1178(63, 184);
            class46.field648.method178(var5, -123);
        }
        if (var4 == 44) {
            class312.field4268++;
            class393.field5633 = 0;
            class290.field4070 = var8;
            class325.field4448 = var9;
            class418.field5940 = 2;
            class46.field648.method1178(63, 38);
            class46.field648.method157(79, class212.field2968 + var2);
            class46.field648.method157(-105, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class46.field648.method191(class447.field6269 + var3, arg1 ^ 0xFFFFFFA6);
            class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (arg1 != 0) {
            field341 = null;
        }
        if (var4 == 11) {
            class198 var14 = class98.field1358[var5];
            if (var14 != null) {
                class325.field4448 = var9;
                class393.field5633 = 0;
                class290.field4070 = var8;
                class139.field1990++;
                class418.field5940 = 2;
                class46.field648.method1178(63, 225);
                class46.field648.method197(class203.field2790.method1872(82, 4463) ? 1 : 0, -16651);
                class46.field648.method157(arg1 ^ 0x48, var5);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var14.method942(false), var14.field5332[0], 0, var14.field5326[0], 0, arg1 - 1, var14.method942(false), true);
            }
        }
        if (var4 == 57) {
            class357.field4881++;
            class325.field4448 = var9;
            class418.field5940 = 2;
            class290.field4070 = var8;
            class393.field5633 = 0;
            class46.field648.method1178(63, 110);
            class46.field648.method183(class447.field6269 + var3, true);
            class46.field648.method183(var2 + class212.field2968, true);
            class46.field648.method157(-117, var5);
            class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, arg1 + 3);
            class71.method539(var3, var2, 0);
        }
        if (var4 == 15) {
            class198 var15 = class98.field1358[var5];
            if (var15 != null) {
                class393.field5633 = 0;
                class325.field4448 = var9;
                class399.field5697++;
                class418.field5940 = 2;
                class290.field4070 = var8;
                class46.field648.method1178(63, 125);
                class46.field648.method178(var5, -98);
                class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, arg1 + 255);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var15.method942(false), var15.field5332[0], 0, var15.field5326[0], 0, arg1 - 1, var15.method942(false), true);
            }
        }
        if (var4 == 25) {
            class393.field5633 = 0;
            class418.field5940 = 2;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class359.field4902++;
            class46.field648.method1178(63, 12);
            class46.field648.method157(-109, var2 + class212.field2968);
            class46.field648.method191(class447.field6269 + var3, arg1 ^ 0xFFFFFF93);
            class46.field648.method183(var5, true);
            class46.field648.method197(class203.field2790.method1872(82, arg1 + 4463) ? 1 : 0, -16651);
            class71.method539(var3, var2, arg1);
        }
        if (var4 == 18) {
            class134 var16 = class381.field5447[var5];
            if (var16 != null) {
                class418.field5940 = 2;
                class290.field4070 = var8;
                class325.field4448 = var9;
                class20.field374++;
                class393.field5633 = 0;
                class46.field648.method1178(63, 162);
                class46.field648.method178(var5, -89);
                class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var16.method942(false), var16.field5332[0], 0, var16.field5326[0], 0, arg1 - 1, var16.method942(false), true);
            }
        }
        if (var4 == 1010) {
            class393.field5633 = 0;
            class290.field4070 = var8;
            class418.field5940 = 2;
            class325.field4448 = var9;
            class198 var17 = class98.field1358[var5];
            if (var17 != null) {
                class327 var18 = var17.field2737;
                if (var18.field4475 != null) {
                    var18 = var18.method2108(true);
                }
                if (var18 != null) {
                    class46.field648.method1178(63, 100);
                    class184.field2510++;
                    class46.field648.method157(68, var18.field4472);
                }
            }
        }
        if (var4 == 21) {
            class134 var19 = class381.field5447[var5];
            if (var19 != null) {
                class325.field4448 = var9;
                class393.field5633 = 0;
                class418.field5940 = 2;
                class290.field4070 = var8;
                class57.field779++;
                class46.field648.method1178(63, 168);
                class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, 255);
                class46.field648.method157(-36, var5);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var19.method942(false), var19.field5332[0], 0, var19.field5326[0], 0, -1, var19.method942(false), true);
            }
        }
        if (var4 == 12) {
            class393.field5633 = 0;
            class290.field4070 = var8;
            class167.field2308++;
            class325.field4448 = var9;
            class418.field5940 = 2;
            class46.field648.method1178(63, 63);
            class46.field648.method178((int) (var6 >>> 32) & Integer.MAX_VALUE, arg1 - 85);
            class46.field648.method157(arg1 ^ 0xFFFFFF94, var2 + class212.field2968);
            class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, arg1 ^ 0xFF);
            class46.field648.method178(var3 + class447.field6269, -51);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (var4 == 20) {
            class134 var20 = class381.field5447[var5];
            if (var20 != null) {
                class290.field4070 = var8;
                class418.field5940 = 2;
                class393.field5633 = 0;
                class240.field3414++;
                class325.field4448 = var9;
                class46.field648.method1178(63, 31);
                class46.field648.method157(110, var5);
                class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var20.method942(false), var20.field5332[0], 0, var20.field5326[0], 0, -1, var20.method942(false), true);
            }
        }
        if (var4 == 10) {
            class418.field5940 = 2;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class393.field5633 = 0;
            class85.field1202++;
            class46.field648.method1178(63, 222);
            class46.field648.method178(Integer.MAX_VALUE & (int) (var6 >>> 32), -44);
            class46.field648.method191(var3 + class447.field6269, arg1 ^ 0xFFFFFF87);
            class46.field648.method176((byte) 42, class203.field2790.method1872(82, 4463) ? 1 : 0);
            class46.field648.method178(var2 + class212.field2968, arg1 + -49);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (var4 == 48) {
            class325.field4448 = var9;
            class418.field5940 = 2;
            class33.field515++;
            class290.field4070 = var8;
            class393.field5633 = 0;
            class46.field648.method1178(63, 187);
            class46.field648.method157(-126, var5);
            class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, 255);
            class46.field648.method157(arg1 - 119, var2 - -class212.field2968);
            class46.field648.method178(class447.field6269 + var3, -35);
            class71.method539(var3, var2, 0);
        }
        if (var4 == 2 && class109.field1567 == null) {
            class155.method1043(var2, (byte) -45, var3);
            class109.field1567 = class143.method983(~arg1, var3, var2);
            class404.method2531(26878, class109.field1567);
        }
        if (var4 == 1003) {
            class393.field5633 = 0;
            class107.field1481++;
            class290.field4070 = var8;
            class418.field5940 = 2;
            class325.field4448 = var9;
            class46.field648.method1178(63, 172);
            class46.field648.method178(var5, -119);
        }
        if (var4 == 9) {
            class453 var21 = class143.method983(-1, var3, var2);
            if (var21 != null) {
                class418.method2624(arg1 ^ 0xFFFFFF8F);
                class139 var22 = client.method1091(var21);
                class249.method1674(var22.field1979, var3, var21.field6312, var21.field6359, var2, var22.method954(1), 3);
                class249.field3519 = class13.method225(false, var21);
                class416.field5913 = var21.field6437 + "<col=ffffff>";
                if (class249.field3519 == null) {
                    class249.field3519 = "Null";
                }
            }
            return;
        }
        if (var4 == 30) {
            class134 var23 = class381.field5447[var5];
            if (var23 != null) {
                class371.field5219++;
                class418.field5940 = 2;
                class290.field4070 = var8;
                class393.field5633 = 0;
                class325.field4448 = var9;
                class46.field648.method1178(63, 77);
                class46.field648.method157(112, var5);
                class46.field648.method201(class203.field2790.method1872(82, arg1 ^ 0x116F) ? 1 : 0, 3);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var23.method942(false), var23.field5332[0], 0, var23.field5326[0], 0, -1, var23.method942(false), true);
            }
        }
        if (var4 == 4) {
            class198 var24 = class98.field1358[var5];
            if (var24 != null) {
                class418.field5940 = 2;
                class290.field4070 = var8;
                class42.field618++;
                class325.field4448 = var9;
                class393.field5633 = 0;
                class46.field648.method1178(63, 32);
                class46.field648.method183(var5, true);
                class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, 255);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var24.method942(false), var24.field5332[0], 0, var24.field5326[0], 0, -1, var24.method942(false), true);
            }
        }
        if (var4 == 6) {
            class453 var25 = class143.method983(-1, var3, var2);
            if (var25 != null) {
                class434.method2725(false, var25);
            }
        }
        if (var4 == 23) {
            if (class105.field1435 > 0 && class203.field2790.method1872(82, 4463) && class203.field2790.method1872(81, arg1 ^ 0x116F)) {
                class54.method447(class212.field2968 + var2, (byte) 48, class142.field2034, class447.field6269 + var3);
            } else {
                class273.method1783(var5, (byte) -127, var3, var2);
                if (var5 == 1) {
                    class46.field648.method173(-1, arg1 + 255);
                    class46.field648.method173(-1, 255);
                    class46.field648.method191((int) class333.field4599, -73);
                    class46.field648.method173(57, 255);
                    class46.field648.method173(class126.field1778, 255);
                    class46.field648.method173(class374.field5308, 255);
                    class46.field648.method173(89, 255);
                    class46.field648.method191(class412.field5841.field6262, arg1 ^ 0xFFFFFF80);
                    class46.field648.method191(class412.field5841.field6266, -102);
                    class46.field648.method173(63, 255);
                } else {
                    class418.field5940 = 1;
                    class325.field4448 = var9;
                    class393.field5633 = 0;
                    class290.field4070 = var8;
                }
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -4, 1, var3, 0, var2, 0, ~arg1, 1, true);
            }
        }
        if (var4 == 59) {
            class418.field5940 = 2;
            class94.field1305++;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class393.field5633 = 0;
            class46.field648.method1178(63, 65);
            class46.field648.method157(arg1 ^ 0x7C, var5);
            class46.field648.method191(class447.field6269 + var3, arg1 ^ 0xFFFFFF9F);
            class46.field648.method176((byte) 42, class203.field2790.method1872(82, 4463) ? 1 : 0);
            class46.field648.method191(class212.field2968 + var2, arg1 + -88);
            class71.method539(var3, var2, arg1);
        }
        if (var4 == 13) {
            class134 var26 = class381.field5447[var5];
            if (var26 != null) {
                class290.field4070 = var8;
                class325.field4448 = var9;
                class333.field4592++;
                class418.field5940 = 2;
                class393.field5633 = 0;
                class46.field648.method1178(63, 189);
                class46.field648.method201(class203.field2790.method1872(82, arg1 ^ 0x116F) ? 1 : 0, arg1 ^ 0x3);
                class46.field648.method183(var5, true);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var26.method942(false), var26.field5332[0], 0, var26.field5326[0], 0, -1, var26.method942(false), true);
            }
        }
        if (var4 == 3) {
            if (class105.field1435 > 0 && class203.field2790.method1872(82, arg1 + 4463) && class203.field2790.method1872(81, 4463)) {
                class54.method447(class212.field2968 + var2, (byte) 48, class142.field2034, class447.field6269 + var3);
            } else {
                class393.field5633 = 0;
                class418.field5940 = 1;
                class290.field4070 = var8;
                class59.field790++;
                class325.field4448 = var9;
                class46.field648.method1178(63, 98);
                class46.field648.method178(class212.field2968 + var2, arg1 + -75);
                class46.field648.method157(110, class447.field6269 + var3);
            }
        }
        if (var4 == 19) {
            class134 var27 = class381.field5447[var5];
            if (var27 != null) {
                class418.field5940 = 2;
                class200.field2770++;
                class325.field4448 = var9;
                class290.field4070 = var8;
                class393.field5633 = 0;
                class46.field648.method1178(63, 147);
                class46.field648.method176((byte) 42, class203.field2790.method1872(82, 4463) ? 1 : 0);
                class46.field648.method195(2, class231.field3339);
                class46.field648.method157(-67, class178.field2451);
                class46.field648.method157(120, var5);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var27.method942(false), var27.field5332[0], 0, var27.field5326[0], 0, ~arg1, var27.method942(false), true);
            }
        }
        if (var4 == 45) {
            class198 var28 = class98.field1358[var5];
            if (var28 != null) {
                class290.field4070 = var8;
                class418.field5940 = 2;
                class56.field762++;
                class393.field5633 = 0;
                class325.field4448 = var9;
                class46.field648.method1178(63, 217);
                class46.field648.method191(var5, arg1 ^ 0xFFFFFFA1);
                class46.field648.method173(class203.field2790.method1872(82, 4463) ? 1 : 0, 255);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var28.method942(false), var28.field5332[0], 0, var28.field5326[0], 0, ~arg1, var28.method942(false), true);
            }
        }
        if (var4 == 58) {
            class198 var29 = class98.field1358[var5];
            if (var29 != null) {
                class17.field314++;
                class418.field5940 = 2;
                class325.field4448 = var9;
                class290.field4070 = var8;
                class393.field5633 = 0;
                class46.field648.method1178(63, 158);
                class46.field648.method157(-99, var5);
                class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
                class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], -2, var29.method942(false), var29.field5332[0], 0, var29.field5326[0], 0, -1, var29.method942(false), true);
            }
        }
        if (var4 == 17) {
            class325.field4448 = var9;
            class47.field658++;
            class290.field4070 = var8;
            class418.field5940 = 2;
            class393.field5633 = 0;
            class46.field648.method1178(63, 37);
            class46.field648.method183(var2 + class212.field2968, true);
            class46.field648.method183(class447.field6269 + var3, true);
            class46.field648.method183(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
            class46.field648.method183(class178.field2451, true);
            class46.field648.method195(2, class231.field3339);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (var4 == 1011) {
            class274.field3799++;
            class393.field5633 = 0;
            class418.field5940 = 2;
            class325.field4448 = var9;
            class290.field4070 = var8;
            class46.field648.method1178(63, 191);
            class46.field648.method191(class212.field2968 + var2, -103);
            class46.field648.method191(Integer.MAX_VALUE & (int) (var6 >>> 32), -113);
            class46.field648.method191(class447.field6269 + var3, -73);
            class46.field648.method201(class203.field2790.method1872(82, 4463) ? 1 : 0, 3);
            class396.method2503((byte) -102, var2, var3, var6);
        }
        if (class327.field4511) {
            class418.method2624(arg1 - 115);
        }
        if (class386.field5538 != null && class414.field5882 == 0) {
            class404.method2531(26878, class386.field5538);
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "()V", line = 1022)
    public void method268() {
        field360++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lnq;BI)Lk;", line = 1029)
    public static final class337 method269(class268 arg0, byte arg1, int arg2) {
        field352++;
        if (arg1 != -31) {
            method267((class87) null, -122);
        }
        byte[] var3 = arg0.method1757(-3, arg2);
        return var3 == null ? null : new class337(var3);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 1048)
    public void method270(int arg0) throws Exception {
        field347++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([II)V", line = 1057)
    private final void method271(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class247.field3492) {
            var3 = arg1 << 1;
        }
        class36.method349(arg0, 0, var3);
        this.field368 -= arg1;
        if (this.field345 != null && this.field368 <= 0) {
            this.field368 += class76.field1094 >> 4;
            class189.method1230((byte) 127, this.field345);
            this.method263(this.field345, this.field345.method449(), (byte) -127);
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
                        class55 var10 = null;
                        class55 var11 = this.field363[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class433 var12 = var11.field757;
                                if (var12 == null || var12.field6114 <= var8) {
                                    var11.field760 = true;
                                    int var13 = var11.method451();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6114 += var13;
                                    }
                                    if (var4 >= this.field351) {
                                        break label107;
                                    }
                                    class55 var14 = var11.method454();
                                    if (var14 != null) {
                                        int var15 = var11.field758;
                                        while (var14 != null) {
                                            this.method263(var14, var15 * var14.method449() >> 8, (byte) -90);
                                            var14 = var11.method453();
                                        }
                                    }
                                    class55 var16 = var11.field759;
                                    var11.field759 = null;
                                    if (var10 == null) {
                                        this.field363[var7] = var16;
                                    } else {
                                        var10.field759 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field364[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field759;
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
                class55 var18 = this.field363[var17];
                this.field363[var17] = this.field364[var17] = null;
                while (var18 != null) {
                    class55 var19 = var18.field759;
                    var18.field759 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field368 < 0) {
            this.field368 = 0;
        }
        if (this.field345 != null) {
            this.field345.method452(arg0, 0, arg1);
        }
        this.field337 = class385.method2442(-6631);
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 1225)
    public final void method272(int arg0) {
        if (arg0 != 2) {
            this.method271((int[]) null, 117);
        }
        field335++;
        this.field362 = true;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)V", line = 1241)
    public static final void method273(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class59.field801 != -1) {
                class117.method809(class59.field801, (byte) 127);
            }
            for (class26 var2 = (class26) class454.field6477.method885(-78); var2 != null; var2 = (class26) class454.field6477.method881((byte) -68)) {
                if (!var2.method2470((byte) 78)) {
                    var2 = (class26) class454.field6477.method885(-69);
                    if (var2 == null) {
                        break;
                    }
                }
                class325.method2090(var2, true, false, -10);
            }
            class59.field801 = -1;
            class454.field6477 = new class129(8);
            class171.method1129((byte) -103);
            class59.field801 = class181.field2489;
            class231.method1590(false, true);
            class386.method2450((byte) -39);
            class177.method1164(class59.field801);
        }
        field354++;
        class429.method2713((byte) 58);
        class267.field3695 = -1;
        if (!arg1) {
            field341 = null;
        }
        class416.method2610(class382.field5460, -1);
        class412.field5841 = new class134();
        class412.field5841.field6266 = 6656;
        class412.field5841.field6262 = 6656;
        class412.field5841.field5326[0] = 52;
        class20.field376 = 0;
        class106.field1447 = 0;
        class412.field5841.field5332[0] = 52;
        if (class128.field1807 == 2) {
            class106.field1447 = class389.field5585 << 7;
            class20.field376 = class89.field1239 << 7;
        } else {
            class288.method1874((byte) -43);
        }
        class9.method146(-22904);
        if (class106.field1447 == 0 || class20.field376 == 0) {
            class139.method958(10, false);
        } else {
            class423.method2680(10);
            class139.method958(28, false);
        }
    }
}
