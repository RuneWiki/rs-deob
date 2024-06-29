import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class354 {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    private int field497 = 4096;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Lao;")
    public static class188 field498 = new class188(61, 4);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Ljava/lang/String;")
    public static String field499 = "";

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lvp;")
    public static class123 field504;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field503;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "[I")
    public static int[] field501;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        if (arg1 != -95) {
            method255((byte) 45);
        }
        ++field502;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, class30.field492 & arg0 + -1, (byte) 69);
            int[] var5 = this.method2293(0, arg0, (byte) 69);
            int[] var6 = this.method2293(0, class30.field492 & arg0 + 1, (byte) 69);
            for (int var7 = 0; class404.field5952 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field497;
                int var9 = (var5[var7 + 1 & class168.field2527] - var5[class168.field2527 & var7 + -1]) * this.field497;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)I")
    public static final int method254(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field496;
        int var5 = -class324.field4974[arg4 * 8192 / arg3] + 65536 >> 1;
        int var6 = 78 / ((-60 - arg0) / 62);
        return ((-var5 + 65536) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field504 = null;
        if (arg0 <= 41) {
            method254((byte) -59, -50, 106, 26, -103);
        }
        field499 = null;
        field503 = null;
        field498 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
    public static final void method256(int arg0, boolean arg1) {
        class420.method2576(class112.field1780, class341.field5207, arg0 ^ 31007, arg1, class477.field7003);
        ++field494;
        if (arg0 != 44) {
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)Lda;")
    public static final class42 method257(int arg0) {
        ++field500;
        if (class2.field23 != null && class74.field1237 != null) {
            if (arg0 != 61) {
                method256(35, true);
            }
            for (class42 var1 = (class42) class74.field1237.method2931((byte) -60); var1 != null; var1 = (class42) class74.field1237.method2931((byte) -60)) {
                class210 var2 = class2.field15.method1835(36, var1.field649);
                if (var2 != null && var2.field3049 && var2.method1401(class2.field12, arg0 ^ 77)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 == 0) {
            this.field497 = arg1.method1868(0);
        }
        if (arg0 == 15180) {
            ++field495;
        }
    }

    static {
        new class180("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field504 = new class123(44, 7);
    }
}
