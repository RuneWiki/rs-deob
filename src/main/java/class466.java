import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class466 extends class528 {

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public int field7139 = -1;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public int field7142 = -1;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field7135;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field7136;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public int field7137;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public int field7140;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 == -1) {
            ++field7143;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field7138;
        class205 var5 = arg3.method1231();
        var5.method158(super.field7770, super.field7768, super.field7773);
        class536 var6 = class337.field5262.method2077((byte) -65, this.field7136).method1339(-1, (byte) -96, this.field7140, (class363) null, 0, 0, (class78) null, arg3, 131072);
        if (var6 != null && var6.method298(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (this.field7139 != -1) {
                class536 var7 = class337.field5262.method2077((byte) -65, this.field7139).method1339(-1, (byte) 124, this.field7137, (class363) null, 0, 0, (class78) null, arg3, 131072);
                if (var7 != null && var7.method298(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (arg1 != 32689) {
                this.method102(-82, (class497) null);
            }
            if (this.field7142 != -1) {
                class536 var8 = class337.field5262.method2077((byte) -65, this.field7142).method1339(-1, (byte) 127, this.field7135, (class363) null, 0, 0, (class78) null, arg3, 131072);
                if (var8 != null && var8.method298(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)Lkj;")
    public static final class55 method2908(int arg0, int arg1, int arg2, int arg3) {
        ++field7141;
        if (arg1 != 64) {
            return null;
        } else {
            class409 var4 = class217.field3699[arg2][arg0][arg3];
            if (var4 == null) {
                return null;
            } else {
                class55 var5 = null;
                int var6 = -1;
                for (class192 var7 = var4.field6175; var7 != null; var7 = var7.field2841) {
                    class423 var8 = var7.field2845;
                    if (var8 instanceof class55) {
                        class55 var9 = (class55) var8;
                        int var10 = var9.method415(arg1 + -68) * 64 + -4;
                        int var11 = -var10 + var9.field6417 >> 7;
                        int var12 = var9.field6410 - var10 >> 7;
                        int var13 = var9.field6417 + var10 >> 7;
                        int var14 = var9.field6410 + var10 >> 7;
                        if (var11 <= arg0 && ~var12 >= ~arg3 && var13 >= arg0 && ~arg3 >= ~var14) {
                            int var15 = (var13 - -1 + -arg0) * (var14 - -1 + -arg3);
                            if (~var6 > ~var15) {
                                var6 = var15;
                                var5 = var9;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field7144;
        class205 var3 = arg1.method1231();
        var3.method158(super.field7770, super.field7768, super.field7773);
        if (arg0 != 2) {
            this.field7140 = 6;
        }
        class514 var4 = class104.method706(0, 3);
        if (~this.field7142 != 0) {
            class536 var5 = class337.field5262.method2077((byte) -65, this.field7142).method1339(-1, (byte) 113, this.field7135, (class363) null, 0, 0, (class78) null, arg1, 2048);
            if (var5 != null) {
                var5.method295(var3, var4.field7629[2], 0);
            }
        }
        if (~this.field7139 != 0) {
            class536 var6 = class337.field5262.method2077((byte) -65, this.field7139).method1339(-1, (byte) -43, this.field7137, (class363) null, 0, 0, (class78) null, arg1, 2048);
            if (var6 != null) {
                var6.method295(var3, var4.field7629[1], 0);
            }
        }
        class536 var7 = class337.field5262.method2077((byte) -65, this.field7136).method1339(-1, (byte) 127, this.field7140, (class363) null, 0, 0, (class78) null, arg1, 2048);
        if (var7 != null) {
            var7.method295(var3, var4.field7629[0], 0);
        }
        return var4;
    }
}
