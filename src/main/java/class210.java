import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class210 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)I", line = 6)
    public static final int method1330(int arg0, byte arg1, int arg2, int arg3) {
        field2872++;
        if (arg1 > -14) {
            field2871 = 15;
        }
        if (class141.field2049 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class12.field251 - 1 || var5 > class289.field3782 - 1) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class117.field1677[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class141.field2049[var6].method276(arg2, arg3);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J")
    public abstract long method1329(byte arg0);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)C")
    public abstract char method1331(byte arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
    public abstract int method1332(int arg0);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
    public abstract int method1333(byte arg0);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
    public abstract boolean method1334(int arg0);
}
