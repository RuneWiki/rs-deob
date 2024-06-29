import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class748 implements class262 {

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lwm;")
    private class30 field10218;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lwm;")
    private class30 field10213;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Ljk;")
    private class196 field10219;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
    public static int[] field10209 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field10207 = -1;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lda;")
    private class420 field10217;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 4)
    public static void method4061(int arg0) {
        if (arg0 != -31863) {
            method4063(-30, 72);
        }
        field10209 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lmq;ILmq;)V", line = 14)
    public static final void method4062(class618 arg0, int arg1, class618 arg2) {
        field10216++;
        if (arg1 != -1) {
            return;
        }
        if (arg0.field7829 != null) {
            arg0.method3306(false);
        }
        arg0.field7832 = arg2;
        arg0.field7829 = arg2.field7829;
        arg0.field7829.field7832 = arg0;
        arg0.field7832.field7829 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 34)
    public static final void method4063(int arg0, int arg1) {
        field10214++;
        class614 var2 = class497.method2759(4, 5977, (long) arg1);
        if (arg0 >= -3) {
            method4062(null, -19, null);
        }
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 61)
    public final void method1035(int arg0) {
        if (arg0 != 27889) {
            this.field10213 = null;
        }
        field10208++;
        class166 var2 = class663.method3610(this.field10218, this.field10219.field2728, -107);
        this.field10217 = class576.field7320.method1002(var2, class388.method2237(this.field10213, this.field10219.field2728), true);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z", line = 74)
    public final boolean method1034(int arg0) {
        field10210++;
        boolean var2 = true;
        if (arg0 != -32160) {
            field10207 = 52;
        }
        if (!this.field10213.method130(-2, this.field10219.field2728)) {
            var2 = false;
        }
        if (!this.field10218.method130(-2, this.field10219.field2728)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V", line = 95)
    public final void method835(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field10219.field2718.method4129(0, class719.field9443, this.field10219.field2719) + this.field10219.field2733;
            int var4 = this.field10219.field2710.method90(class398.field5240, this.field10219.field2712, 0) + this.field10219.field2721;
            this.field10217.method2426((byte) -127, this.field10219.field2713, null, var3, var4, this.field10219.field2714, 0, this.field10219.field2711, null, this.field10219.field2719, 0, this.field10219.field2723, this.field10219.field2715, this.field10219.field2725, this.field10219.field2712, null);
        }
        if (arg1 != 24726) {
            this.field10213 = null;
        }
        field10211++;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lwm;Lwm;Ljk;)V", line = 116)
    public class748(class30 arg0, class30 arg1, class196 arg2) {
        this.field10218 = arg1;
        this.field10213 = arg0;
        this.field10219 = arg2;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V", line = 126)
    public static final void method4064(int arg0) {
        class498.field6388++;
        field10212++;
        class13 var1 = class659.method3587(class68.field909, 98, class380.field4652);
        var1.field130.method1491(-129, 0);
        class116.method679(var1, 0);
        if (arg0 >= -104) {
            method4065(-28);
        }
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V", line = 141)
    public static final void method4065(int arg0) {
        if (arg0 != 6175) {
            return;
        }
        if (class634.field8063 >= 0) {
            long var1 = class502.method2786(arg0 - 13289);
            class634.field8063 = (int) ((long) class634.field8063 - (var1 - class444.field5817));
            if (class634.field8063 <= 0) {
                class259.field3483 = class766.field10415.field1757;
                class721.field9474 = class766.field10415.field1771;
                class495.field6329 = class766.field10415.field1766;
                class117.field1596 = class766.field10415.field1770;
                class656.field8456 = class766.field10415.field1767;
                class477.field6185 = class766.field10415.field1762;
                class528.field6710 = class766.field10415.field1758;
                class679.field8788 = class766.field10415.field1755;
                class568.field7184 = class766.field10415.field1754;
                class634.field8063 = -1;
                class316.field3941 = class766.field10415.field1772;
            } else {
                int var3 = (class634.field8063 << 8) / class17.field172;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class656.field8456 = ((class134.field1777 & 0xFF00FF) * var3 + ((class766.field10415.field1767 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class134.field1777 & 0xFF00) * var3 + (class766.field10415.field1767 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class568.field7184 = (class766.field10415.field1754 - class301.field3800) * var6 + class301.field3800;
                class477.field6185 = (class766.field10415.field1762 - class302.field3810) * var6 + class302.field3810;
                class117.field1596 = ((class732.field9586 & 0xFF00) * var3 + ((class766.field10415.field1770 & 0xFF00) * var4) & 0xFF0000) + ((class732.field9586 & 0xFF00FF) * var3 + (class766.field10415.field1770 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class721.field9474 = (class766.field10415.field1771 - class321.field3984) * var6 + class321.field3984;
                class316.field3941 = class27.field233 * var3 + class766.field10415.field1772 * var4 >> 8;
                class495.field6329 = (class766.field10415.field1766 - class451.field5885) * var6 + class451.field5885;
                class679.field8788 = (class766.field10415.field1755 - class458.field5983) * var6 + class458.field5983;
                class528.field6710 = (class766.field10415.field1758 - class728.field9562) * var6 + class728.field9562;
                if (class501.field6435 != class766.field10415.field1757) {
                    class259.field3483 = class702.field9291.method920(class501.field6435, class766.field10415.field1757, var6, class259.field3483);
                }
            }
            class444.field5817 = var1;
        }
        field10215++;
    }
}
