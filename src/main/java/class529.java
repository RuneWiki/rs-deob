import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class529 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[[I")
    public static int[][] field7777 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
    public static volatile long field7778 = 0L;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
    public long field7780;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lwh;")
    public class529 field7776;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lwh;")
    public class529 field7779;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public static int[] field7782;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I")
    public static final int method3144(int arg0, byte arg1) {
        field7785++;
        if (arg1 != 73) {
            method3148(-50);
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method3145(byte arg0) {
        if (arg0 != 55) {
            method3145((byte) -115);
        }
        field7777 = null;
        field7782 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILya;)V")
    public static final void method3146(int arg0, class223 arg1) {
        class53.field732[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)Z")
    public final boolean method3147(int arg0) {
        field7786++;
        if (arg0 < 70) {
            this.field7779 = null;
        }
        return this.field7776 != null;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public static final void method3148(int arg0) {
        for (class407 var1 = (class407) class541.field7904.method2123(-114); var1 != null; var1 = (class407) class541.field7904.method2126((byte) 61)) {
            if (var1.field6156) {
                var1.method2608(arg0 + 918414074);
            }
        }
        field7783++;
        if (arg0 != -918414074) {
            field7778 = -90L;
        }
        for (class407 var2 = (class407) class354.field5492.method2123(-75); var2 != null; var2 = (class407) class354.field5492.method2126((byte) 61)) {
            if (var2.field6156) {
                var2.method2608(0);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    public final void method3149(int arg0) {
        field7784++;
        if (this.field7776 == null) {
            return;
        }
        this.field7776.field7779 = this.field7779;
        this.field7779.field7776 = this.field7776;
        if (arg0 < 47) {
            this.method3149(40);
        }
        this.field7779 = null;
        this.field7776 = null;
    }
}
