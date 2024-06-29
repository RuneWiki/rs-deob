import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class640 {

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public int field9109 = 8;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public int field9104 = 16777215;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "Lgr;")
    public static class530 field9108 = new class530(55, -1);

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
    public static int field9110 = 1;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public int field9100;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public int field9103;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public int field9106;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public int field9107;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public int field9114;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "Lla;")
    public static class423 field9116;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "Ltd;")
    public static class515 field9112;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "Z")
    public boolean field9101;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "[I")
    public static int[] field9113;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLjf;)Lgm;")
    public static final class208 method3695(byte arg0, class638 arg1) {
        field9099++;
        class208 var2;
        if (class82.field1154 == null) {
            var2 = new class208();
        } else {
            var2 = class82.field1154;
            class82.field1154 = class82.field1154.field3146;
            class630.field8920--;
            var2.field3146 = null;
        }
        var2.field3144 = arg1;
        return arg0 == -72 ? var2 : null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Lhe;")
    public static final class573 method3696(int arg0, int arg1) {
        field9111++;
        if (arg1 != 11106) {
            field9116 = null;
        }
        class573[] var2 = class738.method4121(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class573 var4 = var2[var3];
            if (var4.field8261 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILsl;I)V")
    private final void method3697(int arg0, class479 arg1, int arg2) {
        field9105++;
        if (arg0 != -28669) {
            method3699((byte) -45);
        }
        if (arg2 == 1) {
            this.field9109 = arg1.method2882(-1);
        } else if (arg2 == 2) {
            this.field9101 = true;
        } else if (arg2 == 3) {
            this.field9100 = arg1.method2870(-11395);
            this.field9114 = arg1.method2870(-11395);
            this.field9103 = arg1.method2870(-11395);
        } else if (arg2 == 4) {
            this.field9107 = arg1.method2886(true);
        } else if (arg2 == 5) {
            this.field9106 = arg1.method2882(-1);
        } else if (arg2 == 6) {
            this.field9104 = arg1.method2865(255);
            return;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lsl;I)V")
    public final void method3698(class479 arg0, int arg1) {
        field9102++;
        if (arg1 != 16777215) {
            return;
        }
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                return;
            }
            this.method3697(-28669, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
    public static void method3699(byte arg0) {
        field9108 = null;
        field9116 = null;
        if (arg0 < 105) {
            field9116 = null;
        }
        field9113 = null;
        field9112 = null;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
    public static final void method3700(int arg0, int arg1) {
        class556.field8080 = 100;
        class727.field10217 = -1;
        field9115++;
        if (arg1 == -19486) {
            class672.field9575 = 3;
            class68.field1054 = arg0;
        }
    }
}
