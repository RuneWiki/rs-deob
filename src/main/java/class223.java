import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class223 implements class205 {

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3138;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
    public boolean field3125;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1492(byte arg0) {
        field3138 = null;
        if (arg0 >= -76) {
            field3138 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public static final void method1493(int arg0, int arg1, int arg2) {
        if ((class308.field4355 < class308.field4351)) {
            class308.field4355 = (float) ((double) class308.field4355 / 30.0D + (double) class308.field4355);
            if (class308.field4351 < class308.field4355) {
                class308.field4355 = class308.field4351;
            }
            class181.method1221(0);
            class308.field4354 = (int) class308.field4355 >> 1;
            class308.field4348 = class138.method857(class308.field4354, arg2 ^ 0x11A1);
        } else if (class308.field4351 < class308.field4355) {
            class308.field4355 = (float) ((double) class308.field4355 - (double) class308.field4355 / 30.0D);
            if (class308.field4355 < class308.field4351) {
                class308.field4355 = class308.field4351;
            }
            class181.method1221(0);
            class308.field4354 = (int) class308.field4355 >> 1;
            class308.field4348 = class138.method857(class308.field4354, -14209);
        }
        field3137++;
        if (arg2 != -9762) {
            return;
        }
        if (class401.field5727 != -1 && class113.field1395 != -1) {
            int var3 = class401.field5727 - class324.field4619;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class113.field1395 - class419.field5993;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class324.field4619 += var3;
            class419.field5993 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class113.field1395 = -1;
                class401.field5727 = -1;
            }
            class181.method1221(0);
        }
        if (class327.field4643 <= 0) {
            class3.field27 = -1;
            class204.field2928 = -1;
        } else {
            class152.field1877--;
            if (class152.field1877 == 0) {
                class152.field1877 = 100;
                class327.field4643--;
            }
        }
        if (!class87.field990 || class174.field2393 == null) {
            return;
        }
        for (class377 var5 = (class377) class174.field2393.method506((byte) -128); var5 != null; var5 = (class377) class174.field2393.method514(true)) {
            class246 var6 = class153.method927(arg2 + 9762, var5.field5315.field4613);
            if (class2.field19 == 0 && var5.method2437(Integer.MIN_VALUE, arg0, arg1)) {
                if (var6.field3505 != null) {
                    if (var6.field3505[4] != null) {
                        class421.method2660(var6.field3481, var6.field3478, -1, var6.field3505[4], (long) var5.field5315.field4613, 0, 1002, (byte) 81);
                    }
                    if (var6.field3505[3] != null) {
                        class421.method2660(var6.field3481, var6.field3478, -1, var6.field3505[3], (long) var5.field5315.field4613, 0, 1012, (byte) 39);
                    }
                    if (var6.field3505[2] != null) {
                        class421.method2660(var6.field3481, var6.field3478, -1, var6.field3505[2], (long) var5.field5315.field4613, 0, 1011, (byte) 66);
                    }
                    if (var6.field3505[1] != null) {
                        class421.method2660(var6.field3481, var6.field3478, -1, var6.field3505[1], (long) var5.field5315.field4613, 0, 1004, (byte) 110);
                    }
                    if (var6.field3505[0] != null) {
                        class421.method2660(var6.field3481, var6.field3478, -1, var6.field3505[0], (long) var5.field5315.field4613, 0, 1007, (byte) 67);
                    }
                }
                if (!var5.field5315.field4617) {
                    var5.field5315.field4617 = true;
                    class201.method1335(15, var5.field5315.field4613, var6.field3481);
                }
                if (var5.field5315.field4617) {
                    class201.method1335(17, var5.field5315.field4613, var6.field3481);
                }
            } else if (var5.field5315.field4617) {
                var5.field5315.field4617 = false;
                class201.method1335(16, var5.field5315.field4613, var6.field3481);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J")
    public final long method1353(int arg0) {
        if (arg0 != 23264) {
            return -46L;
        }
        field3131++;
        long[] var2 = class399.field5711;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3126 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field3133 >> 8) ^ var5) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field3133) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field3129 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field3129 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field3129 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field3129 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field3128 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field3124 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field3124 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field3124 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field3124 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field3130) & 0xFFL)];
        return var2[(int) (((long) (this.field3125 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILmn;)Z")
    public final boolean method1354(int arg0, class205 arg1) {
        field3136++;
        if (!(arg1 instanceof class223)) {
            return false;
        }
        class223 var3 = (class223) arg1;
        if (this.field3126 != var3.field3126) {
            return false;
        } else if (arg0 != -27234) {
            return false;
        } else if (this.field3133 != var3.field3133) {
            return false;
        } else if (this.field3129 != var3.field3129) {
            return false;
        } else if (this.field3128 != var3.field3128) {
            return false;
        } else if (this.field3124 != var3.field3124) {
            return false;
        } else if (this.field3130 == var3.field3130) {
            return var3.field3125 == this.field3125;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public static final void method1494(byte arg0) {
        if (class292.field4085 < 1024.0F) {
            class292.field4085 = 1024.0F;
        }
        field3132++;
        while (class441.field6333 >= 16384.0F) {
            class441.field6333 -= 16384.0F;
        }
        if (class292.field4085 > 3072.0F) {
            class292.field4085 = 3072.0F;
        }
        while (class441.field6333 < 0.0F) {
            class441.field6333 += 16384.0F;
        }
        int var1 = -75 % ((50 - arg0) / 51);
        int var2 = class214.field3034 >> 7;
        int var3 = class331.field4680 >> 7;
        int var4 = class114.method709(class129.field1570, class214.field3034, 0, class331.field4680);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                    int var8 = class129.field1570;
                    if (var8 < 3 && class21.method157(var7, 2, var6)) {
                        var8++;
                    }
                    int var9 = 0;
                    if (class327.field4639 != null && class327.field4639[var8] != null) {
                        var9 = (class327.field4639[var8][var6][var7] & 0xFF) * 8;
                    }
                    int var10 = var4 + var9 - class161.field2122[var8].method328(var6, var7);
                    if (var10 > var5) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 1536;
        if (var11 > 786432) {
            var11 = 786432;
        }
        if (var11 < 262144) {
            var11 = 262144;
        }
        if (var11 > class186.field2707) {
            class186.field2707 += (var11 - class186.field2707) / 24;
        } else if (class186.field2707 > var11) {
            class186.field2707 += (var11 - class186.field2707) / 80;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public static final void method1495(byte arg0) {
        class75.field890 = true;
        field3127++;
        if (arg0 != -73) {
            method1493(121, 44, 34);
        }
    }

    static {
        new class362("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3134 = -50;
        field3135 = 2;
        field3138 = new String[100];
    }
}
