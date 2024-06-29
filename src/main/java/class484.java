import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class484 extends class155 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "B")
    public byte field6688 = 5;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field6683;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field6685;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field6687;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
    public boolean field6690;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Z", line = 12)
    public static final boolean method2853(int arg0, byte arg1) {
        field6682++;
        if (class120.field2047[arg0]) {
            return true;
        } else if (class720.field10061.method2986(-23687, arg0)) {
            if (arg1 >= -29) {
                field6680 = -56;
            }
            int var2 = class720.field10061.method3007(-1, arg0);
            if (var2 == 0) {
                class120.field2047[arg0] = true;
                return true;
            }
            if (class610.field8661[arg0] == null) {
                class610.field8661[arg0] = new class519[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class610.field8661[arg0][var3] == null) {
                    byte[] var4 = class720.field10061.method3019(arg0, var3, 120);
                    if (var4 != null) {
                        class519 var5 = class610.field8661[arg0][var3] = new class519();
                        var5.field7247 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3041(new class431(var4), -22178);
                    }
                }
            }
            class120.field2047[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z", line = 79)
    public static final boolean method2854(int arg0, int arg1, int arg2) {
        field6686++;
        if (arg1 >= -12) {
            method2854(-29, 93, -74);
        }
        if (class356.method2151(arg0, (byte) -112, arg2)) {
            return class236.method1598(arg0, -66, arg2) | (arg2 & 0x9000) != 0 | class350.method2125((byte) 17, arg0, arg2) ? true : (arg0 & 0x37) == 0 & ((arg2 & 0x2000) != 0 | class381.method2294(arg2, 0, arg0) | class208.method1444(arg0, arg2, (byte) -57));
        } else {
            return false;
        }
    }
}
