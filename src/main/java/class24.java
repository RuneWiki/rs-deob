import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lfd;")
    public static class194 field225;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 9)
    public static void method125(byte arg0) {
        field225 = null;
        if (arg0 != 52) {
            field225 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lv;", line = 22)
    public final class241 method126(int arg0) {
        field232++;
        class241 var2 = (class241) class189.field2388.method616(arg0 - 56, (long) this.field227);
        if (var2 != null) {
            return var2;
        }
        class241 var3 = class241.method1289(class161.field2070, this.field227, arg0);
        if (var3 != null) {
            class189.field2388.method615((byte) -118, (long) this.field227, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ltq;II)V", line = 43)
    public final void method127(class250 arg0, int arg1, int arg2) {
        if (arg2 != -26357) {
            method128(60, -37, 118, 101, -84, -86, 32, -46, 67);
        }
        field231++;
        while (true) {
            int var4 = arg0.method1350(31351);
            if (var4 == 0) {
                return;
            }
            this.method129(arg0, arg1, (byte) 113, var4);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V", line = 68)
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field229++;
        if (arg8 < ~arg2 || arg1 < 128 || arg2 > (class315.field4214 * 128 - 256) || arg1 > (class340.field4549 * 128 - 256)) {
            class155.field1969[0] = class155.field1969[1] = -1;
            return;
        }
        int var9 = class201.method1098(arg2, arg1, class263.field3592, (byte) -127) - arg5;
        class62.field635.method742(arg0, 0, 0);
        class88.field1003.method1611(class62.field635);
        class88.field1003.method1553(arg2, var9, arg1, class155.field1969);
        class62.field635.method742(-arg0, 0, 0);
        class88.field1003.method1611(class62.field635);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ltq;IBI)V", line = 90)
    private final void method129(class250 arg0, int arg1, byte arg2, int arg3) {
        field226++;
        if (arg3 == 1) {
            this.field227 = arg0.method1374(-2);
        } else if (arg3 == 2) {
            this.field228 = arg0.method1350(arg2 + 31238);
            this.field230 = arg0.method1350(31351);
        }
        if (arg2 != 113) {
            this.method126(-114);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 116)
    public static final void method130(int arg0) {
        field233++;
        for (class141 var1 = (class141) class337.field4495.method315((byte) -66); var1 != null; var1 = (class141) class337.field4495.method310(-88)) {
            int var2 = var1.field1802;
            if (class262.method1460((byte) -123, var2)) {
                boolean var3 = true;
                class194[] var4 = class235.field3227[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2575;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4510;
                    class194 var7 = class57.method301(var6, (byte) 95);
                    if (var7 != null) {
                        class204.method1107(var7, (byte) -127);
                    }
                }
            }
        }
        if (arg0 != 0) {
            field225 = null;
        }
    }
}
