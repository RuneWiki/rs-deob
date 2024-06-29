import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class48 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field797 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Z")
    public boolean field793 = false;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field808 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field801 = -1;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lcd;")
    private static class64 field805 = class44.method335((byte) 71, "Prepared sound engine");

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lcd;")
    public static class64 field800 = field805;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lcd;")
    public static class64 field807 = class44.method335((byte) 71, "::wm1");

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lte;")
    public static class282 field803;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lul;")
    public class39 field804;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field806;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method353(int arg0, int arg1) {
        field796++;
        if (arg1 > -100) {
            return true;
        } else {
            return (arg0 & 0x3B0563) >> 21 != 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lqm;Lqm;ZB)V", line = 21)
    public static final void method354(class222 arg0, class222 arg1, boolean arg2, byte arg3) {
        class114.field2093 = arg0;
        class138.field2454 = arg2;
        if (arg3 != 8) {
            method356((class60) null, (byte) 11);
        }
        class53.field858 = arg1;
        field799++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)[B", line = 49)
    public static final byte[] method355(byte[] arg0, int arg1) {
        field802++;
        if (arg1 != 8945) {
            method354((class222) null, (class222) null, true, (byte) 74);
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class95.method721(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lja;B)Z", line = 67)
    public static final boolean method356(class60 arg0, byte arg1) {
        field795++;
        if (arg0.field1025 == null) {
            return false;
        }
        if (arg1 > -35) {
            method355((byte[]) null, 17);
        }
        for (int var2 = 0; var2 < arg0.field1025.length; var2++) {
            int var3 = class175.method1223(0, var2, arg0);
            int var4 = arg0.field1069[var2];
            if (arg0.field1025[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1025[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1025[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 129)
    public static void method357(int arg0) {
        field805 = null;
        field807 = null;
        if (arg0 != 0) {
            field801 = -81;
        }
        field800 = null;
        field803 = null;
    }
}
