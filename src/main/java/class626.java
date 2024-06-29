import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class626 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lqc;")
    private class325 field9174 = new class325(64);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Ldda;")
    private class597 field9181;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field9178;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[Lls;")
    public static class418[] field9173 = new class418[0];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field9176 = -1;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[C")
    public static char[] field9175 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field9182 = 0;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lqu;")
    public static class364 field9179 = new class364(28, 6);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lcd;I)V", line = 6)
    public static final void method3650(class86 arg0, int arg1) {
        field9170++;
        int var2 = arg0.field1045 - class576.field8505;
        int var3 = arg0.field1015 * 128 + arg1 * arg0.method514(0);
        int var4 = arg0.field1030 * 128 + (arg0.method514(0) * 64);
        arg0.field3463 += (var4 - arg0.field3463) / var2;
        arg0.field3464 += (var3 - arg0.field3464) / var2;
        arg0.field1096 = 0;
        if (arg0.field1077 == 0) {
            arg0.method499(-3569, 8192);
        }
        if (arg0.field1077 == 1) {
            arg0.method499(-3569, 12288);
        }
        if (arg0.field1077 == 2) {
            arg0.method499(-3569, 0);
        }
        if (arg0.field1077 == 3) {
            arg0.method499(-3569, 4096);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 49)
    public static void method3651(int arg0) {
        field9179 = null;
        if (arg0 != -28006) {
            method3656(107, (byte) 121);
        }
        field9175 = null;
        field9173 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 65)
    public final void method3652(int arg0) {
        field9177++;
        if (arg0 < -96) {
            class325 var2 = this.field9174;
            synchronized (this.field9174) {
                this.field9174.method2037(true);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 79)
    public final void method3653(boolean arg0) {
        class325 var2 = this.field9174;
        synchronized (this.field9174) {
            this.field9174.method2024((byte) -104);
        }
        if (!arg0) {
            this.field9174 = null;
        }
        field9180++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lcq;", line = 94)
    public final class106 method3654(int arg0, int arg1) {
        field9171++;
        class325 var3 = this.field9174;
        class106 var4;
        synchronized (this.field9174) {
            var4 = (class106) this.field9174.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field9181;
        byte[] var6;
        synchronized (this.field9181) {
            var6 = this.field9181.method3486((byte) -42, arg0, 16);
        }
        class106 var7 = new class106();
        if (var6 != null) {
            var7.method627(new class428(var6), (byte) 120);
        }
        class325 var8 = this.field9174;
        synchronized (this.field9174) {
            this.field9174.method2029(false, var7, (long) arg0);
        }
        return arg1 == -8109 ? var7 : null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V", line = 124)
    public final void method3655(int arg0, byte arg1) {
        class325 var3 = this.field9174;
        synchronized (this.field9174) {
            this.field9174.method2028(arg0, true);
            if (arg1 != -114) {
                this.method3655(-124, (byte) -28);
            }
        }
        field9169++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)Z", line = 137)
    public static final boolean method3656(int arg0, byte arg1) {
        class205.field3037 = arg0 + 1 & 0xFFFF;
        class480.field7290 = true;
        if (arg1 != -7) {
            method3650(null, 55);
        }
        field9184++;
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 159)
    public static final void method3657(int arg0) {
        field9172++;
        if (class564.field8368) {
            return;
        }
        class382.method2315(true, class387.field5663);
        if (class32.field330 != null) {
            class382.method2315(true, class32.field330);
        }
        class564.field8368 = true;
        int var1 = 87 % ((arg0 - 3) / 58);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 186)
    public class626(class559 arg0, int arg1, class597 arg2) {
        this.field9181 = arg2;
        if (this.field9181 == null) {
            this.field9178 = 0;
        } else {
            this.field9178 = this.field9181.method3462(16, -86);
        }
    }
}
