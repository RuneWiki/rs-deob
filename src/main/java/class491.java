import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class491 extends class464 {

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
    public static int field6931 = 1;

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "Z")
    public static volatile boolean field6932;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "B")
    public byte field6927;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "F")
    public static float field6929;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    public int field6928;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "Lkk;")
    public class161 field6926;

    static {
        new class151("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field6932 = true;
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)I", line = 12)
    public final int method1320(int arg0) {
        if (arg0 != 0) {
            this.method1320(-109);
        }
        ++field6930;
        return this.field6926 == null ? 0 : this.field6926.field2298 * 100 / (this.field6926.field2262.length + -this.field6927);
    }

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "(I)V", line = 26)
    public static final void method2877(int arg0) {
        class311.field4403.field2298 = 0;
        ++field6925;
        class490.field6916 = null;
        class46.field711 = 0;
        class368.field5073 = null;
        class46.field710.field2298 = 0;
        class34.field373 = null;
        class126.field1718 = 0;
        class367.field5044 = null;
        class89.field1270 = 0;
        class99.method812((byte) 95);
        class211.method1433((byte) -115);
        if (arg0 == -1) {
            for (int var1 = 0; var1 < 2048; ++var1) {
                class112.field1570[var1] = null;
            }
            class262.field3781 = null;
            for (int var2 = 0; ~var2 > ~class163.field2377.length; ++var2) {
                class361 var4 = class163.field2377[var2];
                if (var4 != null) {
                    var4.field5748 = -1;
                }
            }
            class233.method1636(482);
            class390.field5393 = 1;
            class237.method1649(30, false);
            for (int var3 = 0; var3 < 100; ++var3) {
                class424.field5879[var3] = true;
            }
            class178.method1277(false);
            class112.field1576 = 0L;
            class475.field6713 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "(I)[B", line = 81)
    public final byte[] method1319(int arg0) {
        ++field6924;
        if (!super.field6539 && this.field6926.field2262.length - this.field6927 <= this.field6926.field2298) {
            return arg0 != 100 ? null : this.field6926.field2262;
        } else {
            throw new RuntimeException();
        }
    }
}
