import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class344 extends class223 {

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "[I")
    public static int[] field4773;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4776;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
    public static int[] field4774;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
    public static int[] field4772;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Lqo;")
    public class19 field4757;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Ljs;")
    public class217 field4765;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Lvg;")
    public class39 field4761;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Lqh;")
    public class49 field4766;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljj;III)V")
    public static final void method2078(class76 arg0, int arg1, int arg2, int arg3) {
        long var4 = class270.field3980[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field1031 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field1034[arg0.field1031++] = class9.field115[var8 - 1].field7653;
            var6 += 16L;
        }
        for (int var9 = arg0.field1031; var9 < 4; var9++) {
            arg0.field1034[var9] = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Lrb;")
    public static final class235 method2079(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2098;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIB)I")
    public static final int method2080(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4752++;
        if (arg4 == -79) {
            int var5 = 65536 - class340.field4715[arg0 * 8192 / arg1] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBII)V")
    public static final void method2081(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg2 << 3;
        int var6 = arg0 << 3;
        field4756++;
        if (arg1 >= -58) {
            field4773 = null;
        }
        if (class462.field6802 == 2) {
            class316.field4503 = var5;
            class321.field4529 = var6;
            class170.field2418 = var4;
        }
        class328.field4588 = var5;
        class386.field5687 = var6;
        class494.method2961(84);
        class531.field7820 = true;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
    public static void method2082(byte arg0) {
        if (arg0 < -124) {
            field4772 = null;
            field4776 = null;
            field4773 = null;
            field4774 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method2083(int arg0) {
        if (arg0 != 0) {
            this.field4755 = 75;
        }
        this.field4766 = null;
        field4750++;
        this.field4765 = null;
        this.field4757 = null;
        this.field4761 = null;
    }

    static {
        new class331("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field4773 = new int[1];
        field4776 = new String[100];
        field4774 = new int[100];
        field4772 = new int[14];
    }
}
