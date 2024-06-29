import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class323 extends class4 {

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "[B")
    public byte[] field4474;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field4475 = 2;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field4473 = -1;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2075(int arg0, int arg1) {
        field4476++;
        if (class424.method2641(arg1, -11664)) {
            if (arg0 != -19180) {
                field4472 = -103;
            }
            class255.method1734(class266.field3900[arg1], -1, -121);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "([B)V", line = 33)
    public class323(byte[] arg0) {
        this.field4474 = arg0;
    }
}
