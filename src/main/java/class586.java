import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class586 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field8429 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[I")
    public static int[] field8431 = null;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lju;")
    public static class102 field8432 = new class102(50, 3);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field8433 = -1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLwn;)V", line = 4)
    public static final void method3486(byte arg0, class583 arg1) {
        field8430++;
        for (int var2 = 0; var2 < class724.field10204; var2++) {
            int var4 = class513.field7162[var2];
            class655 var5 = class40.field563[var4];
            int var6 = arg1.method194((byte) 119);
            if ((var6 & 0x4) != 0) {
                var6 += arg1.method194((byte) 119) << 8;
            }
            if ((var6 & 0x2000) != 0) {
                var6 += arg1.method194((byte) 119) << 16;
            }
            class183.method1224(arg1, var6, var5, (byte) 93, var4);
        }
        int var3 = 19 % ((20 - arg0) / 33);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 37)
    public static void method3487(int arg0) {
        field8432 = null;
        field8431 = null;
        if (arg0 > -36) {
            field8429 = 119;
        }
    }
}
