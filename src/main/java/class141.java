import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class141 extends class243 {

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    private int field2437 = 3216;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    private int field2431 = 4096;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "[I")
    private int[] field2436 = new int[3];

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    private int field2426 = 3216;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "[S")
    public static short[] field2429 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "J")
    public static long field2438;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Lta;")
    public static class105 field2427;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    private final void method894(int arg0) {
        ++field2433;
        double var2 = Math.cos((double) ((float) this.field2437 / 4096.0F));
        this.field2436[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2426 / 4096.0F)) * var2);
        this.field2436[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2426 / 4096.0F)));
        if (arg0 != 21575) {
            this.method81((class226) null, true, 25);
        }
        this.field2436[2] = (int) (Math.sin((double) ((float) this.field2437 / 4096.0F)) * 4096.0D);
        int var4 = this.field2436[0] * this.field2436[0] >> 12;
        int var5 = this.field2436[2] * this.field2436[2] >> 12;
        int var6 = this.field2436[1] * this.field2436[1] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 - -var5 >> 12)));
        if (~var7 != -1) {
            this.field2436[0] = (this.field2436[0] << 12) / var7;
            this.field2436[1] = (this.field2436[1] << 12) / var7;
            this.field2436[2] = (this.field2436[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
    public static final void method895(int arg0) {
        ++field2428;
        if (arg0 != -22209) {
            field2427 = null;
        }
        class213.field3602 = new class198();
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(III)J")
    public static final long method896(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 != null && var3.field2037 != null ? var3.field2037.field1378 : 0L;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field2432;
        if (arg0) {
            this.field2436 = null;
        }
        this.method894(21575);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static void method897(byte arg0) {
        if (arg0 != 3) {
            method897((byte) -47);
        }
        field2427 = null;
        field2429 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field2434;
        if (arg1) {
            this.field2437 = 99;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2437 = arg0.method1447(0);
                }
            } else {
                this.field2426 = arg0.method1447(0);
            }
        } else {
            this.field2431 = arg0.method1447(0);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field2425;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = 52 / ((arg0 - -15) / 51);
        if (super.field4215.field2707) {
            int var5 = class254.field4461 * this.field2431 >> 12;
            int[] var6 = this.method1614(0, class254.field4469 & arg1 - 1, 119);
            int[] var7 = this.method1614(0, arg1, 85);
            int[] var8 = this.method1614(0, arg1 - -1 & class254.field4469, 105);
            for (int var9 = 0; ~class212.field3586 < ~var9; ++var9) {
                int var10 = (var7[class179.field3062 & var9 + -1] - var7[var9 + 1 & class179.field3062]) * var5 >> 12;
                int var11 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var12 = var10 >> 4;
                int var13 = var11 >> 4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class87.field1506[((var13 + 1) * var13 >> 1) + var12] & 255;
                int var15 = var11 * var14 >> 8;
                int var16 = this.field2436[1] * var15 >> 12;
                int var17 = var10 * var14 >> 8;
                int var18 = var14 * 4096 >> 8;
                int var19 = this.field2436[2] * var18 >> 12;
                int var20 = this.field2436[0] * var17 >> 12;
                var3[var9] = var16 + var19 + var20;
            }
        }
        return var3;
    }
}
