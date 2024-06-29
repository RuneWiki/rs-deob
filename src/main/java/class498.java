import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class498 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Le;")
    public class354 field7580 = new class354();

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lwt;")
    public static class194 field7579 = new class194("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field7587 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
    public static int[] field7586 = new int[2];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Le;")
    private class354 field7585;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field7590;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 9)
    public static void method2986(int arg0) {
        field7579 = null;
        if (arg0 >= 1) {
            field7590 = null;
            field7586 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 176)
    public class498() {
        this.field7580.field5112 = this.field7580;
        this.field7580.field5114 = this.field7580;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 29)
    public final void method2987(int arg0) {
        int var2 = 125 / (arg0 / 48);
        field7589++;
        while (true) {
            class354 var3 = this.field7580.field5112;
            if (this.field7580 == var3) {
                this.field7585 = null;
                return;
            }
            var3.method2146(false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Le;", line = 52)
    public final class354 method2988(int arg0) {
        if (arg0 != 30374) {
            method2986(112);
        }
        field7581++;
        class354 var2 = this.field7585;
        if (this.field7580 == var2) {
            this.field7585 = null;
            return null;
        } else {
            this.field7585 = var2.field5112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Le;", line = 73)
    public final class354 method2989(byte arg0) {
        field7583++;
        class354 var2 = this.field7580.field5112;
        if (this.field7580 == var2) {
            this.field7585 = null;
            return null;
        } else if (arg0 > -66) {
            return null;
        } else {
            this.field7585 = var2.field5112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[BIII)V", line = 102)
    public static final void method2990(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -16865) {
            field7579 = null;
        }
        field7588++;
        if (arg3 <= arg4) {
            return;
        }
        int var6 = arg3 - arg4 >> 2;
        int var7 = arg4 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Le;B)V", line = 132)
    public final void method2991(class354 arg0, byte arg1) {
        field7582++;
        if (arg0.field5114 != null) {
            arg0.method2146(false);
        }
        arg0.field5114 = this.field7580.field5114;
        arg0.field5112 = this.field7580;
        arg0.field5114.field5112 = arg0;
        int var3 = 60 % ((66 - arg1) / 54);
        arg0.field5112.field5114 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 158)
    public static final void method2992(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field7584++;
        if (class121.field1587 != null) {
            class121.field1587.method1710(-85);
        }
        if (class342.field4970 != null) {
            class342.field4970.method1710(-122);
        }
    }
}
