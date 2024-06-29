import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class35 extends class397 {

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    private int field557 = 4096;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "Lwt;")
    public static class194 field555 = new class194("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBLts;)Ljava/lang/String;")
    public static final String method288(int arg0, byte arg1, class356 arg2) {
        if (arg1 < 35) {
            field556 = -68;
        }
        ++field560;
        if (!client.method1188(arg2).method2935(arg0, (byte) 125) && arg2.field5288 == null) {
            return null;
        } else if (arg2.field5177 != null && arg0 < arg2.field5177.length && arg2.field5177[arg0] != null && arg2.field5177[arg0].trim().length() != 0) {
            return arg2.field5177[arg0];
        } else {
            return class27.field438 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(Z)V")
    public static void method289(boolean arg0) {
        if (!arg0) {
            field555 = null;
        }
        field555 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 == -1) {
            this.field557 = arg2.method993((byte) -79);
        }
        ++field562;
        if (arg1 != 80) {
            this.method27(-80, (byte) 51, (class156) null);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field561;
        int[] var3 = super.field5854.method465(arg1, 118);
        if (super.field5854.field991) {
            int[] var4 = this.method2376(112, 0, arg1 + -1 & class340.field4948);
            int[] var5 = this.method2376(69, 0, arg1);
            int[] var6 = this.method2376(70, 0, class340.field4948 & arg1 + 1);
            for (int var7 = 0; ~class164.field2152 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field557;
                int var9 = (var5[var7 + 1 & class107.field1429] + -var5[var7 + -1 & class107.field1429]) * this.field557;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg0 != -780833076) {
            this.method31(87, -87);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method290(String arg0, int arg1) {
        ++field558;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class296.field4317 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class281.field4019[var2])) {
                    return true;
                }
            }
            if (arg1 != 4877) {
                return false;
            } else {
                return arg0.equalsIgnoreCase(class415.field6145.field4592);
            }
        }
    }
}
