import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class266 {

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field3566 = 443;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Z")
    public boolean field3561 = false;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public int field3570 = 43594;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
    public static boolean field3558 = false;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3568 = "";

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lhn;")
    public static class509 field3565 = new class509(8);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lvp;")
    public static class126 field3571;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
    public String field3564;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
    public static final void method1627(boolean arg0, int arg1) {
        class492.method2979(class222.field2984, 98);
        field3563++;
        class282.field3742++;
        for (class360 var2 = (class360) class152.field1989.method300((byte) -126); var2 != null; var2 = (class360) class152.field1989.method301(-117)) {
            if (!var2.method2673(-117)) {
                var2 = (class360) class152.field1989.method300((byte) -90);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4888 == 0) {
                class115.method696(arg0, 85, true, var2);
            }
        }
        if (arg1 < -76 && class446.field6492 != null) {
            class413.method2521(class446.field6492, false);
            class446.field6492 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
    public final int method1628(int arg0) {
        field3557++;
        if (this.field3561) {
            return this.field3566;
        } else {
            int var2 = -18 % ((-arg0 - 51) / 48);
            return this.field3570;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lml;I)Z")
    public final boolean method1629(class266 arg0, int arg1) {
        if (arg1 != -13798) {
            return false;
        }
        field3560++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field3559 == arg0.field3559 && this.field3564.equals(arg0.field3564);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLtl;)V")
    public static final void method1630(byte arg0, class440 arg1) {
        arg1.field6382 = null;
        field3567++;
        if (class508.field7352 < 20) {
            class226.field3047.method286((byte) 0, arg1);
            class508.field7352++;
        }
        int var2 = 105 % ((arg0 - 61) / 59);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method1631(byte arg0) {
        field3568 = null;
        if (arg0 >= 52) {
            field3571 = null;
            field3565 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[S)[S")
    public static final short[] method1632(byte arg0, short[] arg1) {
        field3562++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        class438.method2686(arg1, 0, var2, 0, arg1.length);
        if (arg0 != 59) {
            field3568 = null;
        }
        return var2;
    }
}
