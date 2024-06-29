import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class217 extends class577 implements class542 {

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lpha;")
    public static class174 field3365 = new class174("", 16);

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "C")
    public char field3371;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "J")
    public long field3369;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)C", line = 5)
    public final char method1489(int arg0) {
        if (arg0 <= 45) {
            return (char) 65515;
        } else {
            field3362++;
            return this.field3371;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Z", line = 22)
    public static final boolean method1490(int arg0, int arg1) {
        field3360++;
        if (class505.field7173[arg0]) {
            return true;
        } else if (class428.field5819.method4357(22084, arg0)) {
            int var2 = class428.field5819.method4353(arg0, true);
            if (~var2 == arg1) {
                class505.field7173[arg0] = true;
                return true;
            }
            if (class787.field10812[arg0] == null) {
                class787.field10812[arg0] = new class451[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class787.field10812[arg0][var3] == null) {
                    byte[] var4 = class428.field5819.method4339(var3, 0, arg0);
                    if (var4 != null) {
                        class451 var5 = class787.field10812[arg0][var3] = new class451();
                        var5.field6222 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2691(new class494(var4), -126);
                    }
                }
            }
            class505.field7173[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I", line = 86)
    public final int method1491(int arg0) {
        if (arg0 == -29344) {
            field3361++;
            return this.field3366;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 99)
    public static void method1492(boolean arg0) {
        if (!arg0) {
            field3365 = null;
        }
        field3365 = null;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)J", line = 109)
    public final long method1493(int arg0) {
        field3368++;
        if (arg0 != -10517) {
            method1494(127);
        }
        return this.field3369;
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)I", line = 121)
    public static final int method1494(int arg0) {
        field3363++;
        if (class626.field8777) {
            return 6;
        } else if (class694.field9692 == null) {
            return 0;
        } else {
            int var1 = 57 % ((arg0 - 21) / 44);
            int var2 = class694.field9692.field10340;
            if (class618.method3570(-31, var2)) {
                return 1;
            } else if (class776.method4271(var2, 1951)) {
                return 2;
            } else if (class457.method2724(var2, (byte) 89)) {
                return 3;
            } else if (class460.method2740(false, var2)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z", line = 156)
    public static final boolean method1495(byte arg0, int arg1) {
        if (arg0 == -49) {
            field3364++;
            return arg1 != 1 && arg1 != 7;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 169)
    public final int method1496(int arg0) {
        field3367++;
        return arg0 == 21053 ? this.field3370 : 113;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)I", line = 180)
    public final int method1497(int arg0) {
        if (arg0 == -2342) {
            field3359++;
            return this.field3372;
        } else {
            return 30;
        }
    }
}
