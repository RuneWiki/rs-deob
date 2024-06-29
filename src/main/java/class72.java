import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class72 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "B")
    private byte field1196;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lwb;")
    public static class171 field1200;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 5)
    public static void method687(byte arg0) {
        field1200 = null;
        if (arg0 < 54) {
            method687((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I", line = 15)
    public final int method688(boolean arg0) {
        if (arg0) {
            field1202++;
            return this.field1196 & 0x7;
        } else {
            return 119;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I", line = 27)
    public final int method689(int arg0) {
        if (arg0 != -9) {
            this.field1196 = 22;
        }
        field1209++;
        return (this.field1196 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 67)
    public class72() {
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lpi;)V", line = 69)
    public class72(class336 arg0) {
        this.field1196 = arg0.method2323(101);
        this.field1201 = arg0.method2339((byte) -46);
        this.field1203 = arg0.method2338((byte) 49);
        this.field1204 = arg0.method2338((byte) 115);
        this.field1197 = arg0.method2338((byte) 35);
        this.field1208 = arg0.method2338((byte) 46);
    }
}
