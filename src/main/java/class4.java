import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class96 {

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field37 = 10;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lsc;")
    public static class259 field32 = new class259(16);

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
    public static int[] field48 = new int[1000];

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Lna;")
    private static class26 field47 = class69.method505("Members object", (byte) -122);

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "Lna;")
    public static class26 field46 = field47;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lna;")
    public class26 field39;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "[I")
    public int[] field36;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "[I")
    public int[] field44;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "[Lkl;")
    public static class131[] field49;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[Lsc;")
    public class259[] field38;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "[Lna;")
    public class26[] field41;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lni;", line = 24)
    public static final class24 method19(boolean arg0, int arg1) {
        field31++;
        class24 var2 = (class24) class229.field3638.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class323.field5555.method1889(1, (byte) -122, arg1);
            class24 var4 = new class24();
            if (var3 != null) {
                var4.method149(arg1, new class82(var3), 255);
            }
            class229.field3638.method1978((byte) -104, var4, (long) arg1);
            return var4;
        } else {
            return (class24) null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I", line = 48)
    public static final int method20(byte arg0, int arg1) {
        if (arg0 != -34) {
            field47 = (class26) null;
        }
        field45++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLve;)V", line = 63)
    public static final void method21(boolean arg0, class266 arg1) {
        field43++;
        if (!arg0) {
            class132.field2000 = arg1;
            class29.field497 = class132.field2000.method1898(4, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V", line = 83)
    public static void method22(int arg0) {
        field47 = null;
        field46 = null;
        field49 = null;
        field32 = null;
        field48 = null;
        if (arg0 != -30497) {
            field49 = (class131[]) null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)I", line = 97)
    public static int method23(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
