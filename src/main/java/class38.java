import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class38 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lbe;")
    public static class283 field545 = class153.method941(-57, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[Lc;")
    public static class290[] field555 = new class290[4];

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    public static int[] field552 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Z")
    public static boolean field548 = false;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field553;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
    public static boolean field550;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[[[I")
    public static int[][][] field551;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 11)
    public static final void method235(byte arg0) {
        if (arg0 > -43) {
            field548 = true;
        }
        field558++;
        if (class278.field4645 != null) {
            class12 var1 = class278.field4645;
            synchronized (class278.field4645) {
                class278.field4645 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 38)
    public static void method236(int arg0) {
        field552 = null;
        field555 = null;
        if (arg0 < 109) {
            method240((byte) -118);
        }
        field545 = null;
        field551 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lsf;)V", line = 52)
    public static final void method237(int arg0, class100[] arg1) {
        class3.field35[arg0] = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 58)
    public static final void method238(boolean arg0) {
        field557++;
        if (class150.field2455 == -1 || class30.field454 == -1) {
            return;
        }
        int var1 = ((class200.field3421 - class99.field1673) * class97.field1656 >> 16) + class99.field1673;
        class97.field1656 += var1;
        float[] var2 = new float[3];
        int var3 = class151.field2463 * 2;
        if (class97.field1656 >= 65535) {
            if (class47.field641) {
                class291.field4939 = false;
            } else {
                class291.field4939 = true;
            }
            class47.field641 = true;
            class97.field1656 = 65535;
        } else {
            class47.field641 = false;
            class291.field4939 = false;
        }
        float var4 = (float) class97.field1656 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class154.field2536[class150.field2455][var3 + 1][var5] * 3;
            int var7 = class154.field2536[class150.field2455][var3][var5] * 3;
            int var8 = var6 - var7;
            int var9 = (class154.field2536[class150.field2455][var3 + 2][var5] + class154.field2536[class150.field2455][var3 + 2][var5] - class154.field2536[class150.field2455][var3 + 3][var5]) * 3;
            int var10 = class154.field2536[class150.field2455][var3][var5];
            int var11 = class154.field2536[class150.field2455][var3 + 2][var5] - (var10 - var6) - var9;
            int var12 = var9 + var7 - (var6 * 2);
            var2[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var8) * var4 + (float) var10;
        }
        if (class214.field3637 == 0 && class107.field1833 == 0) {
            class214.field3637 = (((int) var2[0] >> 10) - 6) * 8;
            class107.field1833 = (((int) var2[2] >> 10) - 6) * 8;
        }
        class116.field1976 = (int) var2[0] - class214.field3637 * 128;
        class135.field2273 = (int) var2[2] - (class107.field1833 * 128);
        class63.field876 = (int) var2[1] * -1;
        float[] var13 = new float[3];
        int var14 = class115.field1927 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class154.field2536[class30.field454][var14][var15] * 3;
            int var17 = class154.field2536[class30.field454][var14 + 1][var15] * 3;
            int var18 = (class154.field2536[class30.field454][var14 + 2][var15] + class154.field2536[class30.field454][var14 + 2][var15] - class154.field2536[class30.field454][var14 + 3][var15]) * 3;
            int var19 = class154.field2536[class30.field454][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class154.field2536[class30.field454][var14 + 2][var15] + var17 - var18 - var19;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var19;
        }
        float var23 = (var13[1] - var2[1]) * -1.0F;
        float var24 = var13[0] - var2[0];
        if (!arg0) {
            return;
        }
        float var25 = var13[2] - var2[2];
        double var26 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class20.field249 = (float) Math.atan2((double) var23, var26);
        class42.field590 = -((float) Math.atan2((double) var24, (double) var25));
        class295.field5011 = (int) ((double) class42.field590 * 325.949D) & 0x7FF;
        class150.field2450 = (int) ((double) class20.field249 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BILfe;)V", line = 171)
    public final void method239(byte[] arg0, int arg1, class229 arg2) {
        field556++;
        if (arg2.field3879[arg2.field3905] != 31 || arg2.field3879[arg2.field3905 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field553 == null) {
            this.field553 = new Inflater(true);
        }
        try {
            this.field553.setInput(arg2.field3879, arg2.field3905 + 10, -arg2.field3905 + -10 + -8 + arg2.field3879.length);
            this.field553.inflate(arg0);
            if (arg1 >= -105) {
                this.field553 = (Inflater) null;
            }
        } catch (Exception var5) {
            this.field553.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field553.reset();
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 195)
    public static final void method240(byte arg0) {
        class20.method137(463195980, 5);
        class76.method499(5, 1280);
        class6.method35(5, -36);
        class227.method1487(5, (byte) -55);
        int var1 = -62 % ((arg0 - 11) / 33);
        field549++;
        class307.method2092(-10, 5);
        class288.method1971(5, false);
        class160.method975(5, (byte) -104);
        class203.method1295(1, 5);
        class247.method1684(5, 98);
        class45.method265(5, 0);
        class295.method1998(5, true);
        class64.method412((byte) 123, 50);
        class222.method1459((byte) 34, 5);
        class7.method42(5, 119);
        class217.field3678.method1637(true, 5);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIILgf;JLgf;Lgf;)V", line = 228)
    public static final void method241(int arg0, int arg1, int arg2, int arg3, class7 arg4, long arg5, class7 arg6, class7 arg7) {
        class305 var9 = new class305();
        var9.field5230 = arg4;
        var9.field5231 = arg1 * 128 + 64;
        var9.field5222 = arg2 * 128 + 64;
        var9.field5234 = arg3;
        var9.field5219 = arg5;
        var9.field5205 = arg6;
        var9.field5199 = arg7;
        int var10 = 0;
        class160 var11 = class86.field1459[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2627; var12++) {
                class26 var13 = var11.field2623[var12];
                if ((var13.field379 & 0x400000L) == 4194304L) {
                    int var14 = var13.field381.method40();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field5218 = -var10;
        if (class86.field1459[arg0][arg1][arg2] == null) {
            class86.field1459[arg0][arg1][arg2] = new class160(arg0, arg1, arg2);
        }
        class86.field1459[arg0][arg1][arg2].field2616 = var9;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V", line = 275)
    public static final void method242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field554++;
        class74 var5 = (class74) class170.field2860.method1612((long) arg1, arg2 ^ 0x7D);
        if (arg2 != 0) {
            field551 = (int[][][]) ((int[][][]) null);
        }
        if (var5 == null) {
            var5 = new class74();
            class170.field2860.method1611(var5, -1, (long) arg1);
        }
        if (arg0 >= var5.field1290.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field1290.length; var8++) {
                var6[var8] = var5.field1290[var8];
                var7[var8] = var5.field1288[var8];
            }
            for (int var9 = var5.field1290.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1288 = var7;
            var5.field1290 = var6;
        }
        var5.field1290[arg0] = arg4;
        var5.field1288[arg0] = arg3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 329)
    public static final void method243(int arg0) {
        while (true) {
            if (class262.field4462.method619((byte) -98, class260.field4419) >= 27) {
                int var1 = class262.field4462.method617((byte) -21, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class33.field493[var1] == null) {
                        var2 = true;
                        class33.field493[var1] = new class60();
                    }
                    class60 var3 = class33.field493[var1];
                    class219.field3698[class242.field4078++] = var1;
                    var3.field1186 = class75.field1309;
                    if (var3.field822 != null && var3.field822.method813(-1)) {
                        class1.method1(0, var3);
                    }
                    int var4 = class262.field4462.method617((byte) -21, 1);
                    if (var4 == 1) {
                        class26.field393[class69.field1015++] = var1;
                    }
                    int var5 = class262.field4462.method617((byte) -21, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class76.field1318[class262.field4462.method617((byte) -21, 3)];
                    if (var2) {
                        var3.field1153 = var3.field1160 = var6;
                    }
                    var3.field822 = class207.method1379(-63, class262.field4462.method617((byte) -21, 14));
                    int var7 = class262.field4462.method617((byte) -21, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class262.field4462.method617((byte) -21, 1);
                    var3.method458(var3.field822.field2157, 18072);
                    var3.field1204 = var3.field822.field2158;
                    var3.field1207 = var3.field822.field2160;
                    var3.field1202 = var3.field822.field2173;
                    var3.field1169 = var3.field822.field2201;
                    var3.field1151 = var3.field822.field2178;
                    var3.field1184 = var3.field822.field2168;
                    if (var3.field1202 == 0) {
                        var3.field1160 = 0;
                    }
                    var3.field1152 = var3.field822.field2146;
                    var3.field1203 = var3.field822.field2200;
                    var3.method457(var8 == 1, class213.field3624.field1150[0] + var5, var3.method460((byte) 6), (byte) -17, class213.field3624.field1178[0] + var7);
                    if (var3.field822.method813(-1)) {
                        class134.method832(0, (class281) null, (class191) null, var3.field1150[0], var3, -4, class61.field850, var3.field1178[0]);
                    }
                    continue;
                }
            }
            class262.field4462.method620(true);
            if (arg0 != 1) {
                return;
            }
            field546++;
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V", line = 429)
    private class38(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 442)
    public class38() {
        this(-1, 1000000, 1000000);
    }
}
