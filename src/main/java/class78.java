import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class78 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Z")
    public static boolean field1314 = false;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    public static int[] field1323 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lhg;")
    public static class207 field1324 = null;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Laj;")
    public static class151 field1319;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method548(int arg0) {
        field1319 = null;
        field1323 = null;
        if (arg0 == 16776960) {
            field1324 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method549(String arg0, int arg1, byte arg2) {
        field1322++;
        class36 var3 = class136.method1013(2, arg1, (byte) -90);
        int var4 = -48 / ((arg2 + 29) / 50);
        var3.method224(false);
        var3.field583 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILdl;)I")
    public static final int method550(int arg0, class123 arg1) {
        field1317++;
        int var2 = arg1.field2054;
        class190 var3 = arg1.method282(arg0 ^ 0xFFFFC631);
        if (arg0 != 15544) {
            method550(17, (class123) null);
        }
        if (arg1.field782 == var3.field3072) {
            var2 = arg1.field2059;
        } else if (arg1.field782 == var3.field3082 || arg1.field782 == var3.field3056 || arg1.field782 == var3.field3084 || arg1.field782 == var3.field3051) {
            var2 = arg1.field2061;
        } else if (arg1.field782 == var3.field3061 || arg1.field782 == var3.field3059 || arg1.field782 == var3.field3060 || arg1.field782 == var3.field3041) {
            var2 = arg1.field2082;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lpa;)V")
    public class78(class78 arg0) {
        this.field1316 = arg0.field1316;
        this.field1315 = arg0.field1315;
        this.field1321 = arg0.field1321;
        this.field1312 = arg0.field1312;
    }
}
