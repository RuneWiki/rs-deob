import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class623 extends class349 {

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    private int field8467 = 204;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    private int field8471 = 1;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    private int field8474 = 1;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field8473 = new String[100];

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field8475 = new Random();

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "[I")
    public static int[] field8469;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V", line = 8)
    public static void method3406(int arg0) {
        if (arg0 != -16777216) {
            method3407(73L, -29);
        }
        field8473 = null;
        field8469 = null;
        field8475 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(JI)V", line = 21)
    public static final void method3407(long arg0, int arg1) {
        ++field8470;
        class253.field3491.field1745 = 0;
        class253.field3491.method951((byte) -82, class393.field5637.field4951);
        class253.field3491.method923(arg0, -22205);
        class253.field3491.method951((byte) -82, class350.field5121);
        class80.field1018 = 0;
        class235.field3071 = -3;
        class598.field8179 = arg1;
        class335.field4936 = 1;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 36)
    public class623() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(BI)[I", line = 39)
    public final int[] method13(byte arg0, int arg1) {
        int var3 = 115 / ((56 - arg0) / 41);
        ++field8472;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            for (int var5 = 0; ~class39.field497 < ~var5; ++var5) {
                int var6 = class29.field283[var5];
                int var7 = class54.field709[arg1];
                int var8 = this.field8474 * var6 >> 12;
                int var9 = this.field8471 * var7 >> 12;
                int var10 = var6 % (4096 / this.field8474) * this.field8474;
                int var11 = var7 % (4096 / this.field8471) * this.field8471;
                if (var11 < this.field8467) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (this.field8467 > var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (~this.field8467 < ~var10) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (~var12 < -4) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V", line = 124)
    public static final void method3408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class659.field9291 != null) {
            class659.field9291[arg0][arg1] = -16777216 | arg2;
        }
        if (class629.field8555 != null) {
            class629.field8555[arg0][arg1] = (short) arg3;
        }
        if (class298.field3992 != null) {
            class298.field3992[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILdga;)V", line = 143)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 == 4095) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field8467 = arg2.method922((byte) -128);
                    }
                } else {
                    this.field8471 = arg2.method957((byte) -86);
                }
            } else {
                this.field8474 = arg2.method957((byte) -88);
            }
            ++field8468;
        }
    }
}
