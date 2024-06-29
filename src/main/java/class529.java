import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class529 extends class379 {

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field7480 = 1401;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public int field7475;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public int field7481;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lkq;")
    public class620 field7472;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "Lkq;")
    public class620 field7473;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "Ljava/lang/String;")
    public String field7476;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "Z")
    public boolean field7474;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field7477;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(FFFB)F")
    public static final float method3160(float arg0, float arg1, float arg2, byte arg3) {
        if (arg3 <= 70) {
            method3161(-27, -69, -7);
        }
        field7468++;
        return (arg2 - arg0) * arg1 + arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
    public static final boolean method3161(int arg0, int arg1, int arg2) {
        field7470++;
        if (arg1 > -87) {
            method3160(0.9116765F, 0.46157432F, -0.67331976F, (byte) -116);
        }
        return (arg2 & 0x400) != 0;
    }
}
