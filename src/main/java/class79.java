import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class79 extends class11 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Lng;")
    public class330 field1145;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[B")
    public byte[] field1143;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V", line = 7)
    public static final void method609(int arg0, int arg1) {
        field1142++;
        if (arg0 != 3) {
            field1144 = 93;
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class4.method21((byte) 44);
        } else if (arg1 == 2) {
            class151.method1095(false);
        } else if (arg1 == 3) {
            class135.method979(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)[B", line = 46)
    public final byte[] method66(byte arg0) {
        field1146++;
        if (arg0 != -115) {
            this.field1145 = (class330) null;
        }
        if (this.field115) {
            throw new RuntimeException();
        }
        return this.field1143;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)I", line = 68)
    public final int method64(byte arg0) {
        if (arg0 != -73) {
            field1144 = -46;
        }
        field1141++;
        return this.field115 ? 0 : 100;
    }
}
