import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class82 {

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Z")
    public boolean field1027 = true;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "C")
    private char field1032;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Ljava/lang/String;")
    public String field1031;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public static final void method633(byte arg0) {
        field1029++;
        if (class299.field4217 < 0) {
            class299.field4217 = 0;
            class206.field2719 = -1;
            class625.field8690 = -1;
        }
        if (class678.field9285 < class299.field4217) {
            class625.field8690 = -1;
            class299.field4217 = class678.field9285;
            class206.field2719 = -1;
        }
        if (arg0 != 56) {
            method637(-65, null);
        }
        if (class193.field2580 < 0) {
            class206.field2719 = -1;
            class625.field8690 = -1;
            class193.field2580 = 0;
        }
        if (class678.field9300 < class193.field2580) {
            class193.field2580 = class678.field9300;
            class625.field8690 = -1;
            class206.field2719 = -1;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Z")
    public final boolean method634(int arg0) {
        if (arg0 != 0) {
            this.field1027 = true;
        }
        field1030++;
        return this.field1032 == 's';
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lee;II)V")
    private final void method635(class675 arg0, int arg1, int arg2) {
        field1028++;
        if (arg2 != -28055) {
            return;
        }
        if (arg1 == 1) {
            this.field1032 = class174.method1114(arg0.method3719(1854307120), 0);
        } else if (arg1 == 2) {
            this.field1025 = arg0.method3703(88);
        } else if (arg1 == 4) {
            this.field1027 = false;
        } else if (arg1 == 5) {
            this.field1031 = arg0.method3697(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lee;I)V")
    public final void method636(class675 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                field1034++;
                return;
            }
            this.method635(arg0, var3, arg1 ^ 0x6D96);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILafa;)Z")
    public static final boolean method637(int arg0, class344 arg1) {
        field1026++;
        if (arg0 <= 29) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else if (!arg1.field4838) {
            return false;
        } else if (!arg1.method2223(class678.field9274, 2)) {
            return false;
        } else if (class467.field6613.method1180((byte) 26, (long) arg1.field4833) == null) {
            return class455.field6430.method1180((byte) 26, (long) arg1.field4807) == null;
        } else {
            return false;
        }
    }
}
