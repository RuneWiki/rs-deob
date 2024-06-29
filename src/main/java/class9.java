import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class544 {

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "J")
    public long field67;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lff;")
    public class9 field65;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Lff;")
    public class9 field70;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[Lha;")
    public static class52[] field64;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)Lud;")
    public static final class32 method45(byte arg0, Component arg1) {
        field73++;
        if (arg0 != 28) {
            field64 = null;
        }
        return new class485(arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method46(int arg0) {
        class199.field2397 = 0;
        field72++;
        if (arg0 >= 109) {
            class89.field1096.method1048(-7730);
            class89.field1096.method1040(class458.field6305, -95);
            class199.field2397++;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Z")
    public final boolean method47(byte arg0) {
        int var2 = 118 % ((arg0 + 64) / 59);
        field71++;
        return this.field70 != null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final void method48(int arg0) {
        field66++;
        if (this.field70 == null) {
            return;
        }
        this.field70.field65 = this.field65;
        this.field65.field70 = this.field70;
        if (arg0 != -1) {
            this.field65 = null;
        }
        this.field65 = null;
        this.field70 = null;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field64 = null;
        if (arg0 <= 126) {
            method50(56, 75, -57);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
    public static final boolean method50(int arg0, int arg1, int arg2) {
        field68++;
        if (arg2 != 32370) {
            method50(2, 58, 36);
        }
        return class213.method1216(arg0, arg1, 0) | (arg0 & 0x70000) != 0 || class383.method2215(arg0, 64, arg1);
    }
}
