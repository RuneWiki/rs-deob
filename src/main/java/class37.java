import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class37 extends class544 {

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljj;")
    private class66 field501;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field506 = class211.method1380(1600, (byte) -102);

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Loj;")
    private class498 field509;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method322(boolean arg0) {
        field502++;
        class541.field7534 = new class587(class27.field367.method3220(!arg0, class538.field7500), "", class185.field2692, 1006, -1, 0L, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Loj;", line = 13)
    public final class498 method323(boolean arg0) {
        field508++;
        if (this.field509 == null) {
            class472 var2 = this.field501.field2443;
            class636.field9237[1] = this.field499;
            class636.field9237[2] = this.field503;
            class636.field9237[4] = this.field504;
            class636.field9237[0] = this.field500;
            class636.field9237[3] = this.field498;
            class636.field9237[5] = this.field505;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2389(-53, class636.field9237[var5])) {
                    return null;
                }
                class576 var7 = var2.method2387((byte) 127, class636.field9237[var5]);
                int var8 = var7.field8205 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field8201 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class193.field2783[var6] = var2.method2388(var4, var4, false, class636.field9237[var6], 1.0F, (byte) -64);
            }
            this.field509 = new class498(this.field501, 6407, var4, var3, class193.field2783);
        }
        if (!arg0) {
            this.field509 = null;
        }
        return this.field509;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLjava/lang/String;ILgp;)Lmj;", line = 75)
    public static final class313 method324(boolean arg0, String arg1, int arg2, class561 arg3) {
        field507++;
        int var4 = arg3.method3195(0, arg1);
        if (var4 == -1) {
            return new class313(0);
        }
        int[] var5 = arg3.method3176(-96, var4);
        class313 var6 = new class313(var5.length);
        int var7 = 0;
        int var8 = arg2;
        while (true) {
            while (var7 < var6.field4569) {
                class268 var9 = new class268(arg3.method3175(var5[var8++], (byte) -53, var4));
                int var10 = var9.method1748(120);
                int var11 = var9.method1745(32132);
                int var12 = var9.method1738(255);
                if (!arg0 && var12 == 1) {
                    var6.field4569--;
                } else {
                    var6.field4566[var7] = var10;
                    var6.field4563[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 128)
    public static final void method325(int arg0) {
        class243.field3519 = arg0;
        for (int var1 = 0; var1 < class362.field5145; var1++) {
            for (int var2 = 0; var2 < class305.field4400; var2++) {
                if (class277.field4051[arg0][var1][var2] == null) {
                    class277.field4051[arg0][var1][var2] = new class184(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljj;IIIIII)V", line = 155)
    public class37(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field505 = arg6;
        this.field499 = arg2;
        this.field498 = arg4;
        this.field500 = arg1;
        this.field503 = arg3;
        this.field504 = arg5;
        this.field501 = arg0;
    }
}
