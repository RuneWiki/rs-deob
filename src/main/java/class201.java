import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class201 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lij;")
    public static class50 field3309 = class78.method578(125, "(U1");

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lij;")
    public static class50 field3316 = class78.method578(126, "::tele 0)1");

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3313 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public static int[] field3311;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
    public static int[] field3315;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    public static final int method1338(int arg0, int arg1, int arg2) {
        field3314++;
        if (arg2 != 782) {
            field3316 = null;
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static int method1339(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
    public static final int method1340(int arg0, int arg1) {
        field3310++;
        if (arg1 != -1379743800) {
            field3313 = 111;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLwd;)Lmd;")
    public static final class80 method1341(byte arg0, class217 arg1) {
        if (arg0 != -32) {
            method1340(-47, -120);
        }
        field3308++;
        class80 var2 = new class80();
        var2.field1463 = arg1.method1441(-84);
        var2.field1465 = class260.method1751(-58, var2.field1463);
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1342(boolean arg0) {
        field3316 = null;
        field3315 = null;
        field3311 = null;
        field3309 = null;
        if (arg0) {
            method1341((byte) -120, (class217) null);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1343(byte arg0, int arg1) {
        field3307++;
        if (arg0 <= 77) {
            return null;
        } else if (arg1 == 100 && class74.field1397 > 0) {
            byte[] var2 = class256.field4453[--class74.field1397];
            class256.field4453[class74.field1397] = null;
            return var2;
        } else if (arg1 == 5000 && class252.field4375 > 0) {
            byte[] var3 = class219.field3655[--class252.field4375];
            class219.field3655[class252.field4375] = null;
            return var3;
        } else if (arg1 == 30000 && class21.field457 > 0) {
            byte[] var4 = class260.field4519[--class21.field457];
            class260.field4519[class21.field457] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
