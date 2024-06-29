import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class409 extends class107 {

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "Loq;")
    public class378 field5563;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "Lej;")
    public class132 field5555;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "Z")
    public static boolean field5559 = false;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public int field5553;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public int field5554;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "Lus;")
    public static class1 field5557;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 14)
    public static void method2491(int arg0) {
        if (arg0 < 15) {
            field5559 = false;
        }
        field5557 = null;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)V", line = 25)
    public final void method2492(byte arg0) {
        this.field5552 = this.field5563.field5216;
        this.field5556 = this.field5563.field5214;
        if (arg0 != 100) {
            method2493(80, 87);
        }
        field5560++;
        this.field5553 = this.field5563.field5217;
        if (this.field5563.field5222 != null) {
            this.field5563.field5222.method1899(this.field5555.field1993, this.field5555.field1989, this.field5555.field1981, class368.field5117);
        }
        this.field5562 = class368.field5117[0];
        this.field5554 = class368.field5117[2];
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)I", line = 51)
    public static final int method2493(int arg0, int arg1) {
        field5558++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xD5) >> 6;
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
        if (arg1 <= 45) {
            field5557 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Loq;Lcv;)V", line = 103)
    public class409(class378 arg0, class593 arg1) {
        this.field5563 = arg0;
        this.field5555 = this.field5563.method2342(false);
        this.method2492((byte) 100);
    }
}
