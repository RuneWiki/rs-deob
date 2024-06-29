import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class286 extends class37 {

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field4168 = -1;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public int field4175 = -1;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[[Z")
    public static boolean[][] field4167 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lus;")
    public static class1 field4171 = new class1(59, 12);

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[[Lhg;")
    public static class450[][] field4169;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field4173;
        class282 var5 = arg3.method601();
        var5.method1019(super.field490, super.field485, super.field477);
        if (arg1 < 16) {
            method1789(-6);
        }
        class491 var6 = class64.field834.method2129(this.field4178, false).method268((class132) null, 0, this.field4177, -1, false, arg3, 65536, (class153) null, 0);
        if (var6 != null && var6.method1339(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field4168 != 0) {
                class491 var7 = class64.field834.method2129(this.field4168, false).method268((class132) null, 0, this.field4170, -1, false, arg3, 65536, (class153) null, 0);
                if (var7 != null && var7.method1339(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field4175 != -1) {
                class491 var8 = class64.field834.method2129(this.field4175, false).method268((class132) null, 0, this.field4176, -1, false, arg3, 65536, (class153) null, 0);
                if (var8 != null && var8.method1339(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field4167 = null;
        field4169 = null;
        field4171 = null;
        if (arg0 != 0) {
            method1790(true, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field4172;
        if (arg1 > -95) {
            this.field4177 = 114;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z[B)Lhd;")
    public static final class482 method1790(boolean arg0, byte[] arg1) {
        ++field4179;
        class482 var2 = new class482();
        class276 var3 = new class276(arg1);
        var3.field4021 = var3.field4064.length - 2;
        int var4 = var3.method1729(65280);
        int var5 = -var4 + -2 + var3.field4064.length + -12;
        if (arg0) {
            field4171 = null;
        }
        var3.field4021 = var5;
        int var6 = var3.method1688(20402);
        var2.field6792 = var3.method1729(65280);
        var2.field6784 = var3.method1729(65280);
        var2.field6794 = var3.method1729(65280);
        var2.field6782 = var3.method1729(65280);
        int var7 = var3.method1701(-23121);
        if (var7 > 0) {
            var2.field6786 = new class470[var7];
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                int var9 = var3.method1729(65280);
                class470 var10 = new class470(class276.method1708(1256978000, var9));
                var2.field6786[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method1688(20402);
                    int var12 = var3.method1688(20402);
                    var10.method2767(-1, (long) var11, new class324(var12));
                }
            }
        }
        var3.field4021 = 0;
        var2.field6787 = var3.method1742(-1);
        var2.field6793 = new int[var6];
        var2.field6788 = new int[var6];
        var2.field6791 = new String[var6];
        int var13 = 0;
        while (~var5 < ~var3.field4021) {
            int var14 = var3.method1729(65280);
            if (~var14 == -4) {
                var2.field6791[var13] = var3.method1750(-124).intern();
            } else if (~var14 > -101 && var14 != 21 && var14 != 38 && ~var14 != -40) {
                var2.field6793[var13] = var3.method1688(20402);
            } else {
                var2.field6793[var13] = var3.method1701(-23121);
            }
            var2.field6788[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field4174;
        class282 var3 = arg1.method601();
        var3.method1019(super.field490, super.field485, super.field477);
        class477 var4 = class96.method543(3, (byte) 71);
        if (this.field4175 != -1) {
            class491 var5 = class64.field834.method2129(this.field4175, false).method268((class132) null, 0, this.field4176, -1, false, arg1, 1024, (class153) null, 0);
            if (var5 != null) {
                var5.method1323(var3, var4.field6696[2], 0);
            }
        }
        if (this.field4168 != -1) {
            class491 var6 = class64.field834.method2129(this.field4168, false).method268((class132) null, 0, this.field4170, -1, false, arg1, 1024, (class153) null, 0);
            if (var6 != null) {
                var6.method1323(var3, var4.field6696[1], 0);
            }
        }
        class491 var7 = class64.field834.method2129(this.field4178, false).method268((class132) null, arg0, this.field4177, -1, false, arg1, 1024, (class153) null, 0);
        if (var7 != null) {
            var7.method1323(var3, var4.field6696[0], 0);
        }
        return var4;
    }
}
