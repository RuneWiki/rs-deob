import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 {

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Z")
    public static boolean field1269 = true;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lqj;")
    public static class147 field1262;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lme;")
    public static class224 field1263;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    public static final void method549(int arg0, int arg1) {
        field1265++;
        int var2 = -80 / ((8 - arg1) / 49);
        if (class228.method1606(-1, arg0)) {
            class24.method222(class136.field2250[arg0], 6, -1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        if (arg0 != -3) {
            field1263 = null;
        }
        field1263 = null;
        field1262 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqg;Lqh;ZBLqh;)V")
    public static final void method551(class104 arg0, class201 arg1, boolean arg2, byte arg3, class201 arg4) {
        int var5 = -50 / ((arg3 - 29) / 40);
        class194.field3102 = arg1;
        class27.field435 = arg4;
        class176.field2782 = arg2;
        field1264++;
        int var6 = class194.field3102.method1368(1596) - 1;
        class136.field2254 = var6 * 256 + class194.field3102.method1361(var6, -118);
        class286.field4518 = new String[] { null, null, null, null, class53.field920 };
        class210.field3436 = arg0;
        class124.field2010 = new String[] { null, null, class126.field2045, null, null };
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
    public static final int method552(int arg0, int arg1, int arg2) {
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        if (arg1 == 173328129) {
            field1268++;
            return var3;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[B)I")
    public static final int method553(int arg0, int arg1, byte[] arg2) {
        field1266++;
        if (arg0 < 70) {
            field1262 = null;
        }
        return class156.method1097(arg1, arg2, 0, -21780);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
    public static final void method554(byte arg0, int arg1) {
        field1267++;
        class259 var2 = class213.method1464((byte) -127, arg1, 11);
        var2.method1772((byte) -2);
        if (arg0 >= -106) {
            field1262 = null;
        }
    }
}
