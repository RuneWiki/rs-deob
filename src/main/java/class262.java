import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class262 {

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4616 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Leg;")
    public static class37 field4612 = class174.method1167("Votre liste noire est pleine (X100 noms maximum(Y)3", 123);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Leg;")
    public static class37 field4618 = class174.method1167("jaune:", -120);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[I")
    public static int[] field4617;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Z")
    public final boolean method1767(int arg0) {
        if (arg0 != 26552) {
            field4618 = null;
        }
        field4621++;
        return (this.field4609 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIB)I")
    public static final int method1768(int arg0, int arg1, int arg2, byte arg3) {
        field4622++;
        if (class218.field3754 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        if (arg3 >= -91) {
            method1770(119, (byte[]) null);
        }
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class241.field4312[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = (128 - var6) * class218.field3754[var7][var4][var5] + class218.field3754[var7][var4 + 1][var5] * var6 >> 7;
        int var9 = (128 - var6) * class218.field3754[var7][var4][var5 + 1] + (class218.field3754[var7][var4 + 1][var5 + 1] * var6) >> 7;
        int var10 = arg2 & 0x7F;
        return (128 - var10) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field4618 = null;
        field4617 = null;
        field4612 = null;
        if (arg0 != -66) {
            method1769((byte) 126);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1770(int arg0, byte[] arg1) {
        field4620++;
        class187 var2 = new class187(arg1);
        int var3 = var2.method1268(255);
        if (var3 != 1) {
            return false;
        } else if (arg0 == 19860) {
            boolean var4 = var2.method1268(255) == 1;
            if (var4) {
                class147.method1016(arg0 ^ 0x4D94, var2);
            }
            class126.method900(9759, var2);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Z")
    public final boolean method1771(boolean arg0) {
        if (arg0) {
            field4617 = null;
        }
        field4624++;
        return (this.field4609 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z")
    public static final boolean method1772(int arg0, int arg1) {
        field4614++;
        if (class40.field638[arg1]) {
            return true;
        } else if (class30.field444.method663(arg1, 93)) {
            int var2 = class30.field444.method672(arg1, (byte) 120);
            if (var2 == 0) {
                class40.field638[arg1] = true;
                return true;
            }
            if (class232.field4000[arg1] == null) {
                class232.field4000[arg1] = new class237[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class232.field4000[arg1][var3] == null) {
                    byte[] var4 = class30.field444.method666(var3, arg1, (byte) -51);
                    if (var4 != null) {
                        class232.field4000[arg1][var3] = new class237();
                        class232.field4000[arg1][var3].field4211 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class232.field4000[arg1][var3].method1629(arg0 + 12810, new class187(var4));
                        } else {
                            class232.field4000[arg1][var3].method1632(25378, new class187(var4));
                        }
                    }
                }
            }
            class40.field638[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Z")
    public final boolean method1773(int arg0) {
        int var2 = 14 % ((-arg0 - 15) / 60);
        field4611++;
        return (this.field4609 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)Z")
    public final boolean method1774(byte arg0) {
        field4615++;
        if (arg0 <= 88) {
            return false;
        } else {
            return (this.field4609 & 0x4) != 0;
        }
    }
}
