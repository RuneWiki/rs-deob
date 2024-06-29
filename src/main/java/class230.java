import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class230 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lek;")
    private class159 field4170;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lth;")
    private class109 field4177;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lwa;")
    private class246 field4179;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lnh;")
    public static class53 field4178 = new class53(64);

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Ljd;")
    public static class86 field4184 = class122.method868("(Y", true);

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Ljd;")
    public static class86 field4183 = class122.method868("M", true);

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "[J")
    public static long[] field4185 = new long[1000];

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lqk;")
    public static class200 field4180 = new class200(new byte[5000]);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lbj;")
    public static class151 field4182;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lqk;")
    private class200 field4176;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[Lke;")
    public static class106[] field4181;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[Ldb;")
    private class17[] field4168;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lgb;IILgb;)Ldb;")
    public final class17 method1597(class144 arg0, int arg1, int arg2, class144 arg3) {
        field4175++;
        if (arg2 > -36) {
            this.field4170 = null;
        }
        return this.method1598(arg1, true, arg0, arg3, 128);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZLgb;Lgb;I)Ldb;")
    private final class17 method1598(int arg0, boolean arg1, class144 arg2, class144 arg3, int arg4) {
        field4169++;
        if (this.field4176 == null) {
            throw new RuntimeException();
        }
        if (arg4 != 128) {
            this.method1603(92);
        }
        this.field4176.field3565 = arg0 * 8 + 5;
        if (this.field4176.field3565 >= this.field4176.field3547.length) {
            throw new RuntimeException();
        } else if (this.field4168[arg0] == null) {
            int var6 = this.field4176.method1386(-4603);
            int var7 = this.field4176.method1386(-4603);
            class17 var8 = new class17(arg0, arg3, arg2, this.field4170, this.field4177, var6, var7, arg1);
            this.field4168[arg0] = var8;
            return var8;
        } else {
            return this.field4168[arg0];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method1599(int arg0, int arg1) {
        field4171++;
        class161 var2 = class204.method1456(true, 9, arg0);
        if (arg1 < -103) {
            var2.method1173(true);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
    public static final boolean method1600(int arg0, int arg1, int arg2) {
        int var3 = class157.field2961[arg0][arg1][arg2];
        if (-class2.field22 == var3) {
            return false;
        } else if (class2.field22 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class55.method406(var4 + 1, class35.field796[arg0][arg1][arg2], var5 + 1) && class55.method406(var4 + 128 - 1, class35.field796[arg0][arg1 + 1][arg2], var5 + 1) && class55.method406(var4 + 128 - 1, class35.field796[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class55.method406(var4 + 1, class35.field796[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class157.field2961[arg0][arg1][arg2] = class2.field22;
                return true;
            } else {
                class157.field2961[arg0][arg1][arg2] = -class2.field22;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
    public final boolean method1601(byte arg0) {
        field4174++;
        if (this.field4176 != null) {
            return true;
        }
        if (this.field4179 == null) {
            if (this.field4170.method1151((byte) 45)) {
                return false;
            }
            this.field4179 = this.field4170.method1154(-22256, true, 255, 255, (byte) 0);
        }
        if (this.field4179.field4099) {
            return false;
        }
        this.field4176 = new class200(this.field4179.method199((byte) 36));
        this.field4168 = new class17[(this.field4176.field3547.length - 5) / 8];
        if (arg0 != -18) {
            field4180 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIIIIILwj;)V")
    public static final void method1602(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class6 arg7) {
        if (class46.field1025) {
            class257.field4551 = 32;
        } else {
            class257.field4551 = 0;
        }
        field4173++;
        class46.field1025 = false;
        if (class56.field1151 != 0) {
            if (arg6 >= arg0 && (arg0 + 16) > arg6 && arg3 <= arg5 && arg3 + 16 > arg5) {
                arg7.field102 -= 4;
                class62.method441(arg1 ^ 0x736D, arg7);
            } else if (arg6 >= arg0 && (arg0 + 16) > arg6 && (arg4 + arg3 - 16) <= arg5 && arg5 < arg3 + arg4) {
                arg7.field102 += 4;
                class62.method441(arg1 - 29411, arg7);
            } else if (arg6 >= (arg0 - class257.field4551) && arg6 < class257.field4551 + arg0 + 16 && arg5 >= (arg3 + 16) && (arg3 - (16 - arg4)) > arg5) {
                int var8 = (arg4 - 32) * arg4 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - arg3 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg7.field102 = (arg2 - arg4) * var9 / var10;
                class62.method441(arg1 ^ 0x736D, arg7);
                class46.field1025 = true;
            }
        }
        if (class181.field3262 != 0) {
            int var11 = arg7.field163;
            if (arg0 - var11 <= arg6 && arg5 >= arg3 && arg0 + 16 > arg6 && arg5 <= (arg3 + arg4)) {
                arg7.field102 += class181.field3262 * 45;
                class62.method441(-29481, arg7);
            }
        }
        if (arg1 != -70) {
            field4178 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method1603(int arg0) {
        field4172++;
        if (this.field4168 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4168.length; var2++) {
            if (this.field4168[var2] != null) {
                this.field4168[var2].method139((byte) -1);
            }
        }
        for (int var3 = arg0; var3 < this.field4168.length; var3++) {
            if (this.field4168[var3] != null) {
                this.field4168[var3].method141((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lek;Lth;)V")
    public class230(class159 arg0, class109 arg1) {
        this.field4170 = arg0;
        this.field4177 = arg1;
        if (!this.field4170.method1151((byte) 45)) {
            this.field4179 = this.field4170.method1154(-22256, true, 255, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method1604(int arg0) {
        field4184 = null;
        field4182 = null;
        field4180 = null;
        if (arg0 < 61) {
            method1604(-106);
        }
        field4183 = null;
        field4181 = null;
        field4178 = null;
        field4185 = null;
    }
}
