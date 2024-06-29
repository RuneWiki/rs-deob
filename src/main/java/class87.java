import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class87 extends class182 {

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    private int field1527 = 585;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1520 = 0;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1525 = "Loading textures - ";

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1526 = "Loading sprites - ";

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "F")
    public static float field1523 = 128.0F;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBLcb;)V", line = 5)
    public static final void method666(int arg0, int arg1, byte arg2, class314 arg3) {
        int var4 = -55 / ((arg2 - 52) / 44);
        if (arg3.field166 == arg0 && arg0 != -1) {
            class300 var5 = class258.method1807(arg0, 95);
            int var6 = var5.field4872;
            if (var6 == 1) {
                arg3.field210 = 0;
                arg3.field203 = 1;
                arg3.field220 = 0;
                arg3.field180 = arg1;
                arg3.field191 = 0;
                class347.method2479(false, (byte) -102, var5, arg3.field220, arg3.field199, arg3.field213);
            }
            if (var6 == 2) {
                arg3.field191 = 0;
            }
        } else if (arg0 == -1 || arg3.field166 == -1 || class258.method1807(arg0, 95).field4892 >= class258.method1807(arg3.field166, 59).field4892) {
            arg3.field220 = 0;
            arg3.field180 = arg1;
            arg3.field166 = arg0;
            arg3.field191 = 0;
            arg3.field210 = 0;
            arg3.field203 = 1;
            arg3.field212 = arg3.field179;
            if (arg3.field166 != -1) {
                class347.method2479(false, (byte) -125, class258.method1807(arg3.field166, 57), arg3.field220, arg3.field199, arg3.field213);
            }
        }
        field1529++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 62)
    public class87() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I", line = 67)
    public final int[] method125(int arg0, int arg1) {
        field1528++;
        int[] var3 = this.field3166.method775(arg1, arg0 ^ 0x7E);
        if (arg0 != 2) {
            field1526 = (String) null;
        }
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1];
            for (int var5 = 0; var5 < class26.field672; var5++) {
                int var6 = class21.field539[var5];
                if (this.field1527 < var6 && var6 < (4096 - this.field1527) && (2048 - this.field1527) < var4 && this.field1527 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1527);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field1527) < var6 && this.field1527 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1527;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1527);
                } else if (var4 < this.field1527 || var4 > (4096 - this.field1527)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1527;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1527);
                } else if (this.field1527 <= var6 && 4096 - this.field1527 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1527);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Loe;IB)V", line = 157)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 == 60) {
            if (arg1 == 0) {
                this.field1527 = arg0.method989(115);
            }
            field1521++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 184)
    public static void method667(boolean arg0) {
        if (!arg0) {
            method667(false);
        }
        field1525 = null;
        field1526 = null;
    }
}
