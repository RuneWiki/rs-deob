import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class128 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lbd;")
    public static class162 field2322 = class17.method142(0, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lrk;")
    public class255 field2327;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lpm;")
    public class99 field2317;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[Lpm;")
    public static class99[] field2325;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZII)Lbd;", line = 12)
    public static final class162 method1028(int arg0, boolean arg1, int arg2, int arg3) {
        field2323++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (arg3 != 24825) {
            method1029(58);
        }
        int var4 = 1;
        for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg2;
            arg0 /= arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class162 var10 = new class162();
        var10.field2817 = var7;
        var10.field2865 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 75)
    public static final void method1029(int arg0) {
        field2320++;
        if (!class13.field213) {
            return;
        }
        class78 var1 = class112.method903(class282.field4795, class46.field729, -25988);
        if (var1 != null && var1.field1307 != null) {
            class180 var2 = new class180();
            var2.field3099 = var1;
            var2.field3102 = var1.field1307;
            class31.method257(-32581, var2);
        }
        class13.field213 = false;
        class55.method386(arg0 + arg0, var1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILob;)Lob;", line = 108)
    public static final class78 method1030(int arg0, class78 arg1) {
        field2324++;
        if (arg0 != -1) {
            return (class78) null;
        }
        class78 var2 = client.method863(arg1);
        if (var2 == null) {
            var2 = arg1.field1325;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V", line = 125)
    public static final void method1031(boolean arg0, int arg1) {
        class133.field2377.method1538(arg1, (byte) -55);
        field2318++;
        class184.field3177.method1538(arg1, (byte) -90);
        if (arg0) {
            field2316 = -125;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)Lbd;", line = 139)
    public static final class162 method1032(int arg0, int arg1, byte arg2) {
        field2321++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class116.field2093;
        } else if (var3 < -6) {
            return class17.field282;
        } else if (var3 < -3) {
            return class48.field774;
        } else if (var3 >= 0) {
            int var4 = 65 % ((43 - arg2) / 36);
            if (var3 > 9) {
                return class180.field3087;
            } else if (var3 > 6) {
                return class292.field4921;
            } else if (var3 > 3) {
                return class223.field3736;
            } else if (var3 > 0) {
                return class204.field3447;
            } else {
                return class213.field3574;
            }
        } else {
            return class252.field4215;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 180)
    public static void method1033(byte arg0) {
        field2322 = null;
        field2325 = null;
        if (arg0 != 24) {
            method1029(-27);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Object;Lib;I)V", line = 191)
    public static final void method1034(Object arg0, class28 arg1, int arg2) {
        field2319++;
        if (arg1.field475 == null || arg2 != -51) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field475.peekEvent() != null; var3++) {
            class177.method1342(1L, 1);
        }
        if (arg0 != null) {
            arg1.field475.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
