import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class741 implements class536 {

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field10393;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public int field10396;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "[F")
    public float[] field10398;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "[[I")
    public static int[][] field10395 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
    public static final void method4123(byte arg0, int arg1) {
        if (arg0 != 73) {
            field10395 = null;
        }
        field10394++;
        if (class731.field10231 == 0) {
            class284.field4029.method1694(arg1, (byte) -116);
        } else {
            class107.field1766 = arg1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)Z")
    public static final boolean method4124(int arg0, int arg1, int arg2) {
        field10399++;
        if (!class34.field450) {
            return false;
        }
        if (arg0 != -24567) {
            method4125(95, null);
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class117.field1849[var3] == null || class117.field1849[var3][var4] == null) {
            return false;
        }
        class50 var5 = class117.field1849[var3][var4];
        if (arg2 == -1 && var5.field765 == 0) {
            for (class66 var6 = (class66) class288.field4066.method1522(true); var6 != null; var6 = (class66) class288.field4066.method1527((byte) 57)) {
                if (var6.field1198 == 51 || var6.field1198 == 1001 || var6.field1198 == 47 || var6.field1198 == 44 || var6.field1198 == 60) {
                    for (class50 var7 = class545.method3220(65535, var6.field1189); var7 != null; var7 = class202.method1412(13493, var7)) {
                        if (var5.field792 == var7.field792) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class66 var8 = (class66) class288.field4066.method1522(true); var8 != null; var8 = (class66) class288.field4066.method1527((byte) 87)) {
                if (var8.field1200 == arg2 && var5.field792 == var8.field1189 && (var8.field1198 == 51 || var8.field1198 == 1001 || var8.field1198 == 47 || var8.field1198 == 44 || var8.field1198 == 60)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILeq;)V")
    public static final void method4125(int arg0, class209 arg1) {
        if (arg0 != 1) {
            field10395 = null;
        }
        field10400++;
        class72.field1283 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
    public static void method4126(boolean arg0) {
        field10395 = null;
        if (!arg0) {
            field10397 = 106;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(II)V")
    public class741(int arg0, int arg1) {
        this.field10393 = arg1;
        this.field10396 = arg0;
        this.field10398 = new float[arg0 * arg1];
    }
}
