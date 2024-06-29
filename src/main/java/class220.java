import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class220 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lel;")
    private class201 field3997;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lqf;")
    private class244 field4003;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lqd;")
    private class3 field3998;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public static int[] field4007 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Ltf;")
    private class106 field4010;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[Lld;")
    private class79[] field4009;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lsj;BLsj;)V")
    public static final void method1545(class49 arg0, byte arg1, class49 arg2) {
        class59.field1190 = arg2;
        class284.field5003 = arg0;
        if (arg1 <= -89) {
            field4000++;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static void method1546(boolean arg0) {
        if (arg0) {
            field4007 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILje;Lje;IZ)Lld;")
    private final class79 method1547(int arg0, class182 arg1, class182 arg2, int arg3, boolean arg4) {
        field4004++;
        if (this.field4010 == null) {
            throw new RuntimeException();
        }
        this.field4010.field2085 = arg0 * 8 + 5;
        if (this.field4010.field2108.length <= this.field4010.field2085) {
            throw new RuntimeException();
        } else if (this.field4009[arg0] == null) {
            int var6 = this.field4010.method746((byte) -100);
            int var7 = this.field4010.method746((byte) -100);
            class79 var8 = new class79(arg0, arg2, arg1, this.field3997, this.field4003, var6, var7, arg4);
            this.field4009[arg0] = var8;
            int var9 = -24 % ((53 - arg3) / 59);
            return var8;
        } else {
            return this.field4009[arg0];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLsj;)Lsb;")
    public static final class224 method1548(int arg0, boolean arg1, class49 arg2) {
        field4006++;
        if (!arg1) {
            method1548(-78, false, (class49) null);
        }
        return class280.method1891(!arg1, arg2, arg0) ? class175.method1205(1) : null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method1549(int arg0, int arg1) {
        class268.field4800 = arg1 / arg0;
        field4001++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
    public final boolean method1550(int arg0) {
        field4002++;
        if (this.field4010 != null) {
            return true;
        }
        if (this.field3998 == null) {
            if (this.field3997.method1381((byte) 108)) {
                return false;
            }
            this.field3998 = this.field3997.method1377(255, 255, true, 119, (byte) 0);
        }
        if (this.field3998.field2685) {
            return false;
        }
        this.field4010 = new class106(this.field3998.method12(false));
        if (arg0 != 29995) {
            this.field3998 = null;
        }
        this.field4009 = new class79[(this.field4010.field2108.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public final void method1551(byte arg0) {
        field3999++;
        if (this.field4009 == null) {
            return;
        }
        if (arg0 >= -92) {
            this.method1547(93, (class182) null, (class182) null, 40, false);
        }
        for (int var2 = 0; var2 < this.field4009.length; var2++) {
            if (this.field4009[var2] != null) {
                this.field4009[var2].method552(true);
            }
        }
        for (int var3 = 0; var3 < this.field4009.length; var3++) {
            if (this.field4009[var3] != null) {
                this.field4009[var3].method555((byte) 45);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lje;IBLje;)Lld;")
    public final class79 method1552(class182 arg0, int arg1, byte arg2, class182 arg3) {
        if (arg2 < 12) {
            this.method1552((class182) null, -38, (byte) 64, (class182) null);
        }
        field4008++;
        return this.method1547(arg1, arg3, arg0, -86, true);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lel;Lqf;)V")
    public class220(class201 arg0, class244 arg1) {
        this.field3997 = arg0;
        this.field4003 = arg1;
        if (!this.field3997.method1381((byte) -101)) {
            this.field3998 = this.field3997.method1377(255, 255, true, 70, (byte) 0);
        }
    }
}
