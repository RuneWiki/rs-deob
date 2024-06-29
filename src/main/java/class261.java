import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class261 extends class270 {

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field4383 = 4096;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "[I")
    private int[] field4388 = new int[3];

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    private int field4391 = 3216;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    private int field4392 = 3216;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "[I")
    public static int[] field4382 = new int[50];

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "F")
    public static float field4385;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "Lm;")
    public static class45 field4390;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIBII)V", line = 6)
    public static final void method1805(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class99.field1630 = arg4;
        if (arg2 >= 123) {
            class176.field2819 = arg3;
            field4387++;
            class81.field1348 = arg1;
            class52.field755 = arg0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(B)V", line = 21)
    public final void method231(byte arg0) {
        field4394++;
        this.method1807(1996270508);
        if (arg0 != 90) {
            this.field4383 = -92;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 256)
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lmi;II)V", line = 47)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4383 = arg0.method721(75);
        } else if (arg1 == 1) {
            this.field4391 = arg0.method721(127);
        } else if (arg1 == 2) {
            this.field4392 = arg0.method721(51);
        }
        field4386++;
        int var5 = -27 / ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZLmh;)V", line = 83)
    public static final void method1806(int arg0, int arg1, int arg2, boolean arg3, class62 arg4) {
        class191 var5 = class52.method331((byte) -101, arg2, arg0);
        field4395++;
        if (var5 == null) {
            return;
        }
        if (var5.field3092 != null) {
            class161 var6 = new class161();
            var6.field2595 = arg1;
            var6.field2597 = var5;
            var6.field2596 = arg4;
            var6.field2598 = var5.field3092;
            class262.method1818(var6, 39);
        }
        boolean var7 = true;
        if (var5.field3083 > 0) {
            var7 = class146.method1066(var5, 0);
        }
        if (!var7 || !class277.method1895(arg3, arg1 - 1, client.method2058(var5))) {
            return;
        }
        if (arg1 == 1) {
            class246.field4187++;
            class170.field2772.method1693(63, arg3);
            class170.field2772.method712(arg2, -94);
            class170.field2772.method738((byte) 85, arg0);
        }
        if (arg1 == 2) {
            class170.field2772.method1693(121, false);
            class170.field2772.method712(arg2, 125);
            class155.field2499++;
            class170.field2772.method738((byte) 54, arg0);
        }
        if (arg1 == 3) {
            class170.field2772.method1693(137, false);
            class301.field5175++;
            class170.field2772.method712(arg2, 24);
            class170.field2772.method738((byte) 64, arg0);
        }
        if (arg1 == 4) {
            class170.field2772.method1693(149, false);
            class170.field2772.method712(arg2, -89);
            class159.field2567++;
            class170.field2772.method738((byte) -100, arg0);
        }
        if (arg1 == 5) {
            class170.field2772.method1693(238, false);
            class68.field1055++;
            class170.field2772.method712(arg2, -97);
            class170.field2772.method738((byte) -104, arg0);
        }
        if (arg1 == 6) {
            class170.field2772.method1693(195, false);
            class170.field2772.method712(arg2, 118);
            class170.field2772.method738((byte) 117, arg0);
            class62.field885++;
        }
        if (arg1 == 7) {
            class170.field2772.method1693(177, arg3);
            class170.field2772.method712(arg2, -92);
            class170.field2772.method738((byte) 80, arg0);
            class20.field213++;
        }
        if (arg1 == 8) {
            class170.field2772.method1693(86, false);
            class170.field2772.method712(arg2, 116);
            class170.field2772.method738((byte) -124, arg0);
            class308.field5289++;
        }
        if (arg1 == 9) {
            class143.field2293++;
            class170.field2772.method1693(240, false);
            class170.field2772.method712(arg2, 126);
            class170.field2772.method738((byte) 122, arg0);
        }
        if (arg1 == 10) {
            class170.field2772.method1693(105, false);
            class170.field2772.method712(arg2, -99);
            class170.field2772.method738((byte) 109, arg0);
            class158.field2546++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 224)
    private final void method1807(int arg0) {
        field4389++;
        double var2 = Math.cos((double) ((float) this.field4392 / 4096.0F));
        this.field4388[0] = (int) (var2 * Math.sin((double) ((float) this.field4391 / 4096.0F)) * 4096.0D);
        if (arg0 != 1996270508) {
            return;
        }
        this.field4388[1] = (int) (Math.cos((double) ((float) this.field4391 / 4096.0F)) * var2 * 4096.0D);
        this.field4388[2] = (int) (Math.sin((double) ((float) this.field4392 / 4096.0F)) * 4096.0D);
        int var4 = this.field4388[2] * this.field4388[2] >> 12;
        int var5 = this.field4388[1] * this.field4388[1] >> 12;
        int var6 = this.field4388[0] * this.field4388[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field4388[1] = (this.field4388[1] << 12) / var7;
            this.field4388[2] = (this.field4388[2] << 12) / var7;
            this.field4388[0] = (this.field4388[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(B)V", line = 269)
    public static void method1808(byte arg0) {
        if (arg0 >= -2) {
            method1805(44, -56, (byte) 72, 43, 29);
        }
        field4390 = null;
        field4382 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 283)
    public final int[] method6(int arg0, int arg1) {
        field4384++;
        if (arg0 != 18693) {
            this.method231((byte) 40);
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class102.field1670 * this.field4383 >> 12;
            int[] var5 = this.method1850(0, arg0 - 18693, arg1 + -1 & class307.field5268);
            int[] var6 = this.method1850(0, 0, arg1);
            int[] var7 = this.method1850(0, 0, arg1 + 1 & class307.field5268);
            for (int var8 = 0; var8 < class109.field1770; var8++) {
                int var9 = (var6[var8 - 1 & class49.field717] - var6[var8 + 1 & class49.field717]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class80.field1332[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field4388[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field4388[0] * var16 >> 12;
                int var19 = this.field4388[1] * var17 >> 12;
                var3[var8] = var15 + var18 + var19;
            }
        }
        return var3;
    }
}
