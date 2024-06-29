import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class524 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field7121;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field7122;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field7123;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2857(int arg0) {
        class160.field2096 = new class237(8);
        field7124++;
        class476.field6040 = 0;
        if (arg0 <= -54) {
            for (class93 var1 = (class93) class290.field3620.method802((byte) 109); var1 != null; var1 = (class93) class290.field3620.method800((byte) -106)) {
                var1.method539();
            }
        }
    }
}
