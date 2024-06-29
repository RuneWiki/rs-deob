import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class284 extends class98 {

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    private int field3997 = 3072;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    private int field3998 = 1024;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    private int field4001 = 2048;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "Z")
    public static boolean field3993 = false;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "J")
    public static long field3996;

    static {
        new class362("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILdg;I)V", line = 3)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1176 = arg1.method1574(-56) == 1;
                }
            } else {
                this.field3997 = arg1.method1617((byte) 48);
            }
        } else {
            this.field3998 = arg1.method1617((byte) 48);
        }
        if (arg2 != 0) {
            this.method83(-83, 36);
        }
        ++field4000;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[[I", line = 50)
    public final int[][] method194(int arg0, int arg1) {
        ++field3992;
        int var3 = 22 / ((arg1 - 60) / 43);
        int[][] var4 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[][] var5 = this.method546(arg0, (byte) 33, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class268.field3811; ++var12) {
                var9[var12] = (var6[var12] * this.field4001 >> 12) + this.field3998;
                var10[var12] = this.field3998 - -(var7[var12] * this.field4001 >> 12);
                var11[var12] = (var8[var12] * this.field4001 >> 12) + this.field3998;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 103)
    public final void method188(int arg0) {
        if (arg0 != 1) {
            this.field3997 = 78;
        }
        this.field4001 = this.field3997 - this.field3998;
        ++field3999;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[I", line = 119)
    public final int[] method83(int arg0, int arg1) {
        ++field3994;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -66, arg1);
            for (int var5 = 0; ~var5 > ~class268.field3811; ++var5) {
                var3[var5] = (var4[var5] * this.field4001 >> 12) + this.field3998;
            }
        }
        if (arg0 != 0) {
            this.field4001 = -23;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 161)
    public class284() {
        super(1, false);
    }
}
