import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class265 extends class286 {

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    private int field4503 = 4096;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lbe;")
    public static class283 field4502 = class153.method941(126, "<col=00ff80>");

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Lbe;")
    public static class283 field4505 = class153.method941(125, "_labels");

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lfe;ZI)V", line = 15)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4504++;
            if (arg2 == 0) {
                this.field4503 = arg0.method1496(true);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 28)
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V", line = 40)
    public static void method1791(int arg0) {
        field4502 = null;
        field4505 = null;
        if (arg0 < 15) {
            method1791(-33);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            field4505 = (class283) null;
        }
        field4500++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(class126.field2100 & arg1 - 1, 0, -1);
            int[] var5 = this.method1963(arg1, 0, -1);
            int[] var6 = this.method1963(arg1 + 1 & class126.field2100, 0, -1);
            for (int var7 = 0; var7 < class27.field410; var7++) {
                int var8 = (var5[var7 + 1 & class284.field4857] - var5[var7 - 1 & class284.field4857]) * this.field4503;
                int var9 = (var6[var7] - var4[var7]) * this.field4503;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
