import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class207 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3457 = -1;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "S")
    public static short field3459 = 32767;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "F")
    public static float field3454;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    public static int[] field3455;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBI)I")
    public static final int method1424(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 >> 7;
        field3456++;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class160.field2626[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg3 & 0x7F;
        if (arg2 < 6) {
            return -45;
        } else {
            int var9 = (128 - var6) * class172.field2820[var7][var4][var5] + class172.field2820[var7][var4 + 1][var5] * var6 >> 7;
            int var10 = (128 - var6) * class172.field2820[var7][var4][var5 + 1] + class172.field2820[var7][var4 + 1][var5 + 1] * var6 >> 7;
            return (128 - var8) * var9 + (var8 * var10) >> 7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1425(int arg0) {
        class89.field1477.method1350((byte) 122);
        if (arg0 == 103) {
            field3451++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1426(byte arg0, int arg1) {
        field3460++;
        if (class246.field4274[arg1]) {
            return true;
        } else if (class222.field3865.method812(false, arg1)) {
            int var2 = class222.field3865.method821(false, arg1);
            if (var2 == 0) {
                class246.field4274[arg1] = true;
                return true;
            }
            if (class10.field106[arg1] == null) {
                class10.field106[arg1] = new class213[var2];
            }
            if (arg0 < 87) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class10.field106[arg1][var3] == null) {
                    byte[] var4 = class222.field3865.method828(arg1, (byte) 98, var3);
                    if (var4 != null) {
                        class10.field106[arg1][var3] = new class213();
                        class10.field106[arg1][var3].field3703 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class10.field106[arg1][var3].method1464((byte) -41, new class121(var4));
                        } else {
                            class10.field106[arg1][var3].method1462((byte) -2, new class121(var4));
                        }
                    }
                }
            }
            class246.field4274[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3455 = null;
        if (arg0 != 1) {
            method1424(101, -23, (byte) -10, -75);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class207() {
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwc;B)Lwc;")
    public static final class213 method1428(class213 arg0, byte arg1) {
        field3461++;
        class213 var2 = client.method1060(arg0);
        if (arg1 == -101) {
            if (var2 == null) {
                var2 = arg0.field3631;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsb;)V")
    public class207(class207 arg0) {
        this.field3462 = arg0.field3462;
        this.field3458 = arg0.field3458;
        this.field3463 = arg0.field3463;
        this.field3464 = arg0.field3464;
    }
}
