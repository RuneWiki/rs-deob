import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class83 {

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "B")
    private byte field1022;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
    public static int[] field1020 = new int[8];

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Ltda;")
    public static class591 field1024;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "[I")
    public static int[] field1025;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
    public final int method779(byte arg0) {
        field1027++;
        if (arg0 != 105) {
            field1024 = null;
        }
        return this.field1022 & 0x7;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
    public final int method780(int arg0) {
        if (arg0 < 115) {
            return -84;
        } else {
            field1026++;
            return (this.field1022 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public static final void method781(int arg0) {
        int var1 = 0;
        if (arg0 <= 44) {
            return;
        }
        while (var1 < 5) {
            class631.field8880[var1] = false;
            var1++;
        }
        field1031++;
        class503.field7364 = 0;
        class24.field402 = -1;
        class556.field8042 = 0;
        class126.field2062 = 1;
        class207.field3456 = -1;
        class81.field1005 = -1;
        class664.field9243 = -1;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field1025 = null;
        field1020 = null;
        int var1 = 113 % ((arg0 + 27) / 48);
        field1024 = null;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lie;)V")
    public class83(class6 arg0) {
        this.field1022 = arg0.method81(true);
        this.field1023 = arg0.method67(12021);
        this.field1030 = arg0.method72(-96);
        this.field1021 = arg0.method72(-70);
        this.field1028 = arg0.method72(-75);
        this.field1029 = arg0.method72(-35);
    }
}
