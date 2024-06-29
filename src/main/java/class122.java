import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class122 extends class74 {

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    private int field1876 = 585;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[I")
    public static int[] field1875 = new int[14];

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1872;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = class207.field3212[arg1];
            for (int var5 = 0; var5 < class178.field2662; ++var5) {
                int var6 = class224.field3522[var5];
                if (~this.field1876 > ~var6 && var6 < 4096 - this.field1876 && var4 > -this.field1876 + 2048 && var4 < 2048 - -this.field1876) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1876 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > 2048 - this.field1876 && ~(this.field1876 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1876;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1876 + 2048);
                } else if (~this.field1876 >= ~var4 && 4096 - this.field1876 >= var4) {
                    if (var6 >= this.field1876 && var6 <= 4096 - this.field1876) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1876 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1876;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1876 + 2048);
                }
            }
        }
        if (arg0 != 4) {
            this.field1876 = 16;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public static void method868(int arg0) {
        field1875 = null;
        if (arg0 != 2048) {
            method868(7);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field1873;
        if (arg0 == -79) {
            if (arg2 == 0) {
                this.field1876 = arg1.method293(-91);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public static final void method869(boolean arg0, int arg1) {
        if (!arg0) {
            ++field1877;
            class295 var2 = class250.method1673(-108, 12, arg1);
            var2.method1979(-8205);
        }
    }
}
