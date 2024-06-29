import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class40 extends class313 {

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field591 = 4096;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Z")
    private boolean field599 = true;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "J")
    public static long field603 = 0L;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
    public static int[] field600;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[[[B")
    public static byte[][][] field602;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLlg;II)V", line = 6)
    public static final void method335(byte arg0, class137 arg1, int arg2, int arg3) {
        field601++;
        if (arg0 >= 0 || class293.field4708 < 2 && class93.field1458 == 0 && !class179.field3027) {
            return;
        }
        String var4 = class212.method1576(-94);
        if (arg1 == null) {
            int var6 = class177.field3014.method2220(var4, arg3 + 4, arg2 + 15, 16777215, 0, class112.field1874, class354.field5586);
            class33.method300(15, 11314, arg2, var6 + class177.field3014.method2223(var4), arg3 - -4);
            return;
        }
        class323 var5 = arg1.method1123((byte) 23, class12.field187);
        if (var5 == null) {
            var5 = class177.field3014;
        }
        var5.method2231(var4, arg3, arg2, arg1.field2533, arg1.field2515, arg1.field2505, arg1.field2503, arg1.field2450, arg1.field2431, class112.field1874, class354.field5586, class35.field503);
        class33.method300(class35.field503[3], 11314, class35.field503[1], class35.field503[2], class35.field503[0]);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V", line = 39)
    public static void method336(int arg0) {
        field600 = null;
        if (arg0 != 7616) {
            method336(-6);
        }
        field602 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I", line = 52)
    public final int[][] method299(int arg0, int arg1) {
        field605++;
        if (arg1 != 2) {
            method337(true, -51);
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 126);
        if (this.field4958.field5463) {
            int[] var4 = this.method2156(0, true, class132.field2262 & arg0 - 1);
            int[] var5 = this.method2156(0, true, arg0);
            int[] var6 = this.method2156(0, true, class132.field2262 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class133.field2269; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field591;
                int var12 = (var5[class297.field4731 & var10 + 1] - var5[class297.field4731 & var10 - 1]) * this.field591;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field599) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var9[var10] = var20;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V", line = 139)
    public static final void method337(boolean arg0, int arg1) {
        class30 var2 = class99.method857((byte) 114, arg1, 2);
        var2.method276(0);
        if (arg0) {
            field600 = (int[]) null;
        }
        field597++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V", line = 152)
    public static final void method338(byte arg0, int arg1) {
        field598++;
        class30 var2 = class99.method857((byte) -99, arg1, 5);
        if (arg0 >= -59) {
            field600 = (int[]) null;
        }
        var2.method276(0);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 249)
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILcg;Ljava/lang/String;)Llk;", line = 176)
    public static final class304 method339(int arg0, class49 arg1, String arg2) {
        int var3 = arg1.method437((byte) -33, arg2);
        if (arg0 != 1) {
            return (class304) null;
        }
        field595++;
        if (var3 == -1) {
            return new class304(0);
        }
        int[] var4 = arg1.method430(var3, (byte) -64);
        class304 var5 = new class304(var4.length);
        for (int var6 = 0; var6 < var5.field4814; var6++) {
            class336 var7 = new class336(arg1.method441(false, var3, var4[var6]));
            var5.field4819[var6] = var7.method2365(109);
            var5.field4818[var6] = var7.method2323(class289.method1969(arg0, -107));
            var5.field4822[var6] = var7.method2338((byte) 67);
            var5.field4816[var6] = var7.method2338((byte) 26);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILpi;)V", line = 224)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field591 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field599 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            method335((byte) 46, (class137) null, -99, 31);
        }
        field596++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lwc;IIIIII)V", line = 253)
    public static final void method340(class116 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field593++;
        class258.method1787(arg0.field1985, 190123016, arg5, arg0.field2036, arg1, arg6, arg3, arg2);
        if (arg4 < 125) {
            field603 = -47L;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 264)
    public static final void method341(byte arg0) {
        class339.field5418.method470(12);
        field594++;
        if (arg0 != 59) {
            field592 = 109;
        }
    }
}
