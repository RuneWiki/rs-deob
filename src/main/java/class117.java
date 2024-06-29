import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class117 extends IOException {

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 4)
    public class117(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 10)
    public static final void method766(int arg0) {
        field1215++;
        class585.field8256 = 0;
        if (arg0 != -29040) {
            method767((byte) -6);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class633.field9108[var1] = null;
            class311.field3859[var1] = 1;
            class603.field8577[var1] = null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 32)
    public static final void method767(byte arg0) {
        field1214++;
        if (class465.field6642) {
            return;
        }
        class465.field6642 = true;
        if (arg0 != 1) {
            method767((byte) 74);
        }
        class144.field1602 += (24.0F - class144.field1602) / 2.0F;
        class217.field2521 = true;
    }
}
