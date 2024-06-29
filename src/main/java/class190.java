import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class190 extends class304 {

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    private int field2979 = 585;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "[I")
    public static int[] field2977 = new int[128];

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 7)
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lwm;II)V", line = 32)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2979 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            method1404(68);
        }
        field2981++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIBLt;)V", line = 56)
    public static final void method1403(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class305 arg6) {
        class206.method1484(arg6.field4713, arg0, arg6.field4731, arg4, arg5 ^ 0x60, arg1, arg3, arg2);
        if (arg5 != -49) {
            field2976 = -105;
        }
        field2980++;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 67)
    public static void method1404(int arg0) {
        if (arg0 == 585) {
            field2977 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I", line = 81)
    public final int[] method71(int arg0, int arg1) {
        field2982++;
        if (arg0 != 7) {
            method1403(-77, -110, 10, 63, 89, (byte) -33, (class305) null);
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1];
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                int var6 = class162.field2631[var5];
                if (this.field2979 < var6 && var6 < (4096 - this.field2979) && var4 > 2048 - this.field2979 && this.field2979 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2979);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field2979) < var6 && var6 < this.field2979 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2979;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2979);
                } else if (var4 < this.field2979 || var4 > (4096 - this.field2979)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2979;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2979);
                } else if (this.field2979 <= var6 && var6 <= (4096 - this.field2979)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2979);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
