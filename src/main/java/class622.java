import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class622 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8289 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    public static int[] field8293 = new int[3];

    @OriginalMember(owner = "client!of", name = "f", descriptor = "D")
    public static double field8290;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field8288;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field8297;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Ljda;")
    public static class228 field8287;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lwu;")
    public static class376 field8296;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Leu;")
    public class483 field8292;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)I", line = 4)
    public static final int method3421(int arg0, byte arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field8294++;
        if (arg1 != -124) {
            field8287 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BILee;)V", line = 25)
    private final void method3422(byte arg0, int arg1, class677 arg2) {
        field8285++;
        int var4 = 3 % ((arg0 - 56) / 60);
        if (arg1 == 1) {
            this.field8291 = arg2.method3807(-1);
        } else if (arg1 == 2) {
            this.field8288 = arg2.method3821((byte) -67);
            this.field8297 = arg2.method3821((byte) 75);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Ljn;", line = 50)
    public final synchronized class720 method3423(boolean arg0) {
        field8286++;
        class720 var2 = (class720) this.field8292.field6609.method552(4, (long) this.field8291);
        if (arg0) {
            this.method3423(true);
        }
        if (var2 != null) {
            return var2;
        }
        class720 var3 = class720.method4034(this.field8292.field6605, this.field8291, 0);
        if (var3 != null) {
            this.field8292.field6609.method556((byte) 0, (long) this.field8291, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLee;)V", line = 79)
    public final void method3424(byte arg0, class677 arg1) {
        if (arg0 <= 71) {
            this.method3422((byte) -77, -108, null);
        }
        field8295++;
        while (true) {
            int var3 = arg1.method3821((byte) -46);
            if (var3 == 0) {
                return;
            }
            this.method3422((byte) 119, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 109)
    public static void method3425(byte arg0) {
        if (arg0 != -58) {
            method3425((byte) 93);
        }
        field8296 = null;
        field8287 = null;
        field8293 = null;
    }
}
