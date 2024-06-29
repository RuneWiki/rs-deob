import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class45 extends class76 {

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1039 = new CRC32();

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lia;")
    public static class257 field1045 = class28.method234(106, "::fpsoff");

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lia;")
    public static class257 field1046 = class28.method234(-74, " x ");

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lvb;")
    public static class226 field1040;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static void method353(byte arg0) {
        field1045 = null;
        field1040 = null;
        if (arg0 < 104) {
            field1041 = 108;
        }
        field1039 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)V")
    public static final void method354(int arg0, byte arg1) {
        ++field1038;
        if (~arg0 != 0) {
            if (class255.field4363[arg0]) {
                class78.field1515.method1218(arg0, (byte) -123);
                if (class28.field539[arg0] != null) {
                    if (arg1 > 87) {
                        boolean var2 = true;
                        for (int var3 = 0; class28.field539[arg0].length > var3; ++var3) {
                            if (class28.field539[arg0][var3] != null) {
                                if (class28.field539[arg0][var3].field871 != 2) {
                                    class28.field539[arg0][var3] = null;
                                } else {
                                    var2 = false;
                                }
                            }
                        }
                        if (var2) {
                            class28.field539[arg0] = null;
                        }
                        class255.field4363[arg0] = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILmb;BI)[Lak;")
    public static final class190[] method355(int arg0, class178 arg1, byte arg2, int arg3) {
        ++field1037;
        if (!class156.method1093(arg0, -35, arg3, arg1)) {
            return null;
        } else {
            int var4 = -74 % ((68 - arg2) / 49);
            return class93.method685(-126);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
    public static final int method356(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field1042;
        if (arg0 == var4) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else {
            return var4 == 2 ? -arg3 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field1036;
        if (arg0 != -9351) {
            field1039 = null;
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            class86.method645(var3, 0, class96.field1807, class10.field197[arg1]);
        }
        return var3;
    }
}
