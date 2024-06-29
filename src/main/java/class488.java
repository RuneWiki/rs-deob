import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class488 extends class338 implements class323 {

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "B")
    private byte field7117;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Z")
    private boolean field7098;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "B")
    private byte field7095;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "Z")
    private boolean field7110;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "S")
    private short field7091;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Z")
    private boolean field7094;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "Z")
    private boolean field7107;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Lj;")
    private class254 field7093;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lc;")
    private class507 field7106;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field7092 = 2;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lgp;")
    public static class459 field7114 = new class459(10, -1);

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "[Luu;")
    public static class420[] field7120;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZILqa;)Z")
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        ++field7119;
        class507 var5 = this.method2917(131072, (byte) -72, arg3);
        if (var5 != null) {
            class142 var6 = arg3.method847();
            var6.method982(super.field4317, super.field4310, super.field4314);
            return var5.method499(arg0, arg2, var6, false);
        } else {
            if (arg1) {
                this.method419(-102, -18, (class129) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final int method414(int arg0) {
        if (arg0 != 17350) {
            return 16;
        } else {
            ++field7096;
            return 22;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z")
    public final boolean method417(boolean arg0) {
        if (arg0) {
            field7092 = 18;
        }
        ++field7102;
        return this.field7107;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lqa;Ljt;IIIIZIZ)V")
    public class488(class129 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5368, arg1.field5415);
        super.field4317 = arg3;
        this.field7117 = (byte) arg2;
        this.field7098 = arg1.field5347 != 0 && !arg6;
        super.field4314 = arg5;
        this.field7095 = (byte) arg7;
        this.field7110 = arg6;
        this.field7091 = (short) arg1.field5377;
        this.field7094 = arg8;
        this.field7107 = arg0.method903() && arg1.field5420 && !this.field7110 && ~class421.field5647.method3097((byte) 120, class520.field7690) != -1;
        int var10 = 2048;
        if (this.field7094) {
            var10 |= 65536;
        }
        class445 var11 = this.method2915(var10, this.field7107, arg0, 25683);
        if (var11 != null) {
            this.field7093 = var11.field6182;
            this.field7106 = var11.field6188;
            if (this.field7094) {
                this.field7106 = this.field7106.method510((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lqa;B)V")
    public final void method421(class129 arg0, byte arg1) {
        if (arg1 >= -88) {
            this.method415(119);
        }
        ++field7112;
        Object var3 = null;
        class254 var5;
        if (this.field7093 == null && this.field7107) {
            class445 var4 = this.method2915(262144, true, arg0, 25683);
            var5 = var4 == null ? null : var4.field6182;
        } else {
            var5 = this.field7093;
            this.field7093 = null;
        }
        if (var5 != null) {
            class24.method161(var5, this.field7117, super.field4317, super.field4314, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
    public final int method413(int arg0) {
        if (arg0 != -30502) {
            this.field7110 = false;
        }
        ++field7100;
        return 65535 & this.field7091;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLqa;)V")
    public final void method175(byte arg0, class129 arg1) {
        ++field7099;
        if (arg0 != 91) {
            method2918((byte) 115);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
    public final int method415(int arg0) {
        if (arg0 != -15317) {
            this.method416((class129) null, -92);
        }
        ++field7101;
        return this.field7095;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        if (arg0 != 5) {
            method2916((class88) null, 58);
        }
        ++field7108;
        return this.field7094;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLqa;I)Ldf;")
    private final class445 method2915(int arg0, boolean arg1, class129 arg2, int arg3) {
        ++field7118;
        if (arg3 != 25683) {
            this.field7106 = null;
        }
        class402 var5 = class52.field715.method1164(this.field7091 & 65535, 0);
        class251 var6;
        class251 var7;
        if (this.field7110) {
            var6 = class283.field3620[this.field7117];
            var7 = class405.field5436[0];
        } else {
            var6 = class405.field5436[this.field7117];
            if (~this.field7117 <= -4) {
                var7 = null;
            } else {
                var7 = class405.field5436[this.field7117 + 1];
            }
        }
        return var5.method2383(super.field4317, (byte) 20, arg1, arg0, var7, 22, super.field4310, super.field4314, var6, this.field7095, arg2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lbt;I)Lrs;")
    public static final class216 method2916(class88 arg0, int arg1) {
        if (arg1 > -10) {
            method2918((byte) -30);
        }
        ++field7111;
        class216 var2 = new class216();
        var2.field2772 = arg0.method568((byte) 110);
        var2.field2775 = class95.field1325.method972(-31926, var2.field2772);
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 != -32) {
            this.method173((byte) 71);
        }
        ++field7097;
        this.field7094 = false;
        if (this.field7106 != null) {
            this.field7106.method517(-65537 & this.field7106.method475());
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lqa;B)Lvs;")
    public final class465 method172(class129 arg0, byte arg1) {
        ++field7109;
        if (this.field7106 == null) {
            return null;
        } else {
            class142 var3 = arg0.method847();
            var3.method982(super.field4317, super.field4310, super.field4314);
            class465 var4 = null;
            if (this.field7098) {
                var4 = class92.method635(1, -16461);
            }
            int var5 = -114 / ((48 - arg1) / 60);
            this.field7106.method520(var3, var4 == null ? null : var4.field6843[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLqa;)Lc;")
    private final class507 method2917(int arg0, byte arg1, class129 arg2) {
        ++field7115;
        if (this.field7106 != null && ~arg2.method880(this.field7106.method475(), arg0) == -1) {
            return this.field7106;
        } else if (arg1 != -72) {
            return null;
        } else {
            class445 var4 = this.method2915(arg0, false, arg2, 25683);
            return var4 == null ? null : var4.field6188;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public static void method2918(byte arg0) {
        if (arg0 == 25) {
            field7114 = null;
            field7120 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method418(int arg0) {
        ++field7103;
        if (this.field7106 != null) {
            this.field7106.method492();
        }
        if (arg0 != -14924) {
            field7092 = -70;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILqa;)Lc;")
    public final class507 method419(int arg0, int arg1, class129 arg2) {
        if (arg1 != -32039) {
            this.method172((class129) null, (byte) -12);
        }
        ++field7113;
        return this.method2917(arg0, (byte) -72, arg2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLrn;ZIILqa;I)V")
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field7105;
        if (arg0 != 91) {
            this.field7094 = true;
        }
        if (arg1 instanceof class488) {
            class488 var8 = (class488) arg1;
            if (this.field7106 != null && var8.field7106 != null) {
                this.field7106.method483(var8.field7106, arg6, arg4, arg3, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lqa;I)V")
    public final void method416(class129 arg0, int arg1) {
        ++field7104;
        if (arg1 == 16663) {
            Object var3 = null;
            class254 var5;
            if (this.field7093 == null && this.field7107) {
                class445 var4 = this.method2915(262144, true, arg0, 25683);
                var5 = var4 == null ? null : var4.field6182;
            } else {
                var5 = this.field7093;
                this.field7093 = null;
            }
            if (var5 != null) {
                class518.method3076(var5, this.field7117, super.field4317, super.field4314, (boolean[]) null);
            }
        }
    }

    static {
        new class169("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field7120 = new class420[4];
    }
}
