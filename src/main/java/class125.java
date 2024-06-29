import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class125 extends class7 {

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "[I")
    private int[] field2394 = new int[3];

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    private int field2398 = 4096;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    private int field2396 = 3216;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    private int field2404 = 3216;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2395 = 0;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "Lvc;")
    public static class212 field2405 = new class212(100);

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lob;")
    private static class141 field2410 = class175.method1195(40, "To create a new account you need to");

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "Lob;")
    public static class141 field2412 = class175.method1195(40, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Lob;")
    public static class141 field2406 = field2410;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "Lob;")
    private static class141 field2413 = class175.method1195(40, "Please reload this page)3");

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "[I")
    public static int[] field2416 = new int[2048];

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lob;")
    public static class141 field2411 = field2413;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "Llg;")
    public static class116 field2415;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lca;")
    public static class22 field2414;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "Li;")
    public static class80 field2409;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "[Lkc;")
    public static class102[] field2407;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)Lob;")
    public static final class141 method803(int arg0, long arg1) {
        ++field2399;
        if (arg0 != 28860) {
            method803(14, -55L);
        }
        return class59.method396(arg1, 10, false, -15271);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
    private final void method804(boolean arg0) {
        ++field2400;
        double var2 = Math.cos((double) ((float) this.field2404 / 4096.0F));
        this.field2394[0] = (int) (Math.sin((double) ((float) this.field2396 / 4096.0F)) * var2 * 4096.0D);
        this.field2394[1] = (int) (Math.cos((double) ((float) this.field2396 / 4096.0F)) * var2 * 4096.0D);
        this.field2394[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2404 / 4096.0F)));
        if (arg0) {
            method806((byte) -103);
        }
        int var4 = this.field2394[1] * this.field2394[1] >> 12;
        int var5 = this.field2394[0] * this.field2394[0] >> 12;
        int var6 = this.field2394[2] * this.field2394[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field2394[2] = (this.field2394[2] << 12) / var7;
            this.field2394[0] = (this.field2394[0] << 12) / var7;
            this.field2394[1] = (this.field2394[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field2408;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class163.field3151 * this.field2398 >> 12;
            int[] var5 = this.method52(arg1 + -1 & class54.field1050, 0, 62);
            int[] var6 = this.method52(arg1, 0, 127);
            int[] var7 = this.method52(arg1 + 1 & class54.field1050, 0, 67);
            for (int var8 = 0; var8 < class117.field2272; ++var8) {
                int var9 = (var6[class106.field2030 & var8 - 1] - var6[class106.field2030 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class63.field1240[var12 - -((var11 + 1) * var11 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field2394[2] * var15 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field2394[0] * var17 >> 12;
                int var19 = this.field2394[1] * var14 >> 12;
                var3[var8] = var16 + var18 - -var19;
            }
        }
        if (arg0 < 13) {
            field2407 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = 111 % ((arg1 - 66) / 57);
        ++field2401;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2404 = arg2.method1007(123);
                }
            } else {
                this.field2396 = arg2.method1007(37);
            }
        } else {
            this.field2398 = arg2.method1007(70);
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field2403;
        if (arg0 != 1) {
            field2416 = null;
        }
        this.method804(false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILob;Lob;Lob;I)V")
    public static final void method805(int arg0, class141 arg1, class141 arg2, class141 arg3, int arg4) {
        ++field2397;
        int var5 = 99;
        if (arg0 != -11840) {
            field2407 = null;
        }
        while (~var5 < -1) {
            class113.field2170[var5] = class113.field2170[var5 + -1];
            class96.field1895[var5] = class96.field1895[var5 + -1];
            class223.field4217[var5] = class223.field4217[var5 + -1];
            client.field589[var5] = client.field589[var5 - 1];
            --var5;
        }
        class113.field2170[0] = arg4;
        class96.field1895[0] = arg1;
        class152.field2913 = class174.field3461;
        class223.field4217[0] = arg3;
        ++class108.field2092;
        client.field589[0] = arg2;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static void method806(byte arg0) {
        field2412 = null;
        field2407 = null;
        field2413 = null;
        field2409 = null;
        field2405 = null;
        field2406 = null;
        field2410 = null;
        field2411 = null;
        field2414 = null;
        if (arg0 >= 2) {
            field2415 = null;
            field2416 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, true);
    }
}
