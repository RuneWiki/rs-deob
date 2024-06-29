import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class551 extends class454 {

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Ljava/lang/String;")
    public String field7652;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lpf;")
    public class30 field7645;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field7651 = 0;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Lpd;")
    public static class646 field7649;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method3178(int arg0) {
        field7649 = null;
        if (arg0 != -1) {
            field7651 = 47;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method3179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7646++;
        int var6 = arg3;
        if (arg2 != -31718) {
            method3178(-85);
        }
        while (var6 <= arg1) {
            for (int var7 = arg5; var7 <= arg0; var7++) {
                if (class128.field2153[var6][var7] == arg4 && class195.field2935[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)[Lmp;")
    public static final class565[] method3180(int arg0) {
        if (arg0 != -1) {
            field7649 = null;
        }
        field7647++;
        return new class565[] { class631.field8939, class539.field7488, class320.field4556 };
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class551(String arg0) {
        this.field7652 = arg0;
        this.field7645 = new class30();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLm;)Z")
    public final boolean method3181(boolean arg0, class554 arg1) {
        if (arg0) {
            method3178(7);
        }
        field7650++;
        int var3 = this.method3182(11569);
        arg1.method2665(24902);
        this.field7643--;
        if (this.field7643 != 0) {
            return this.method3182(11569) != var3;
        }
        this.method4237(-1);
        this.method2665(24902);
        class81.field1197--;
        class359.field5083.method2890(-7307, arg1.field7680, this);
        return false;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)I")
    public final int method3182(int arg0) {
        if (arg0 != 11569) {
            this.method3183(null, 73);
        }
        field7644++;
        return this.field7645.field332.field6213 == this.field7645.field332 ? -1 : ((class554) this.field7645.field332.field6213).field7682;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lm;I)Z")
    public final boolean method3183(class554 arg0, int arg1) {
        int var3 = -84 % ((-arg1 - 71) / 50);
        field7648++;
        boolean var4 = true;
        arg0.method2665(24902);
        for (class554 var5 = (class554) this.field7645.method249(18371); var5 != null; var5 = (class554) this.field7645.method254((byte) -64)) {
            if (class278.method1777(var5.field7682, -108, arg0.field7682)) {
                class490.method2865(var5, arg0, 5);
                this.field7643++;
                if (var4) {
                    return false;
                }
                return true;
            }
            var4 = false;
        }
        this.field7645.method248((byte) 122, arg0);
        this.field7643++;
        return var4;
    }
}
