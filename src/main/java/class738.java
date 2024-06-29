import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class738 extends class637 {

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "Z")
    public static boolean field10171 = false;

    @OriginalMember(owner = "client!nda", name = "B", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    public int field10174;

    @OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "Lpn;")
    public class327 field10172;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "[B")
    public byte[] field10173;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "(I)[B", line = 15)
    public final byte[] method2735(int arg0) {
        if (arg0 != 100) {
            return null;
        } else {
            ++field10175;
            if (super.field8952) {
                throw new RuntimeException();
            } else {
                return this.field10173;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)I", line = 35)
    public final int method2736(byte arg0) {
        if (arg0 != 123) {
            return 92;
        } else {
            ++field10169;
            return super.field8952 ? 0 : 100;
        }
    }
}
