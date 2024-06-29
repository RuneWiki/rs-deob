import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class362 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field4676 = 2048;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field4681 = 2048;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field4682 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field4677 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4679 = 0;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILfd;)V", line = 6)
    private final void method2073(boolean arg0, int arg1, class418 arg2) {
        if (arg1 == 1) {
            this.field4677 = arg2.method2396(76);
        } else if (arg1 == 2) {
            this.field4681 = arg2.method2393(-30727);
        } else if (arg1 == 3) {
            this.field4676 = arg2.method2393(-30727);
        } else if (arg1 == 4) {
            this.field4682 = arg2.method2383(65280);
        }
        if (!arg0) {
            field4678++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lfd;I)V", line = 42)
    public final void method2074(class418 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2396(-109);
            if (var3 == 0) {
                if (arg1 != 32767) {
                    this.method2074(null, 46);
                }
                field4683++;
                return;
            }
            this.method2073(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ldt;Loa;BLkq;)V", line = 74)
    public static final void method2075(class576 arg0, class43 arg1, byte arg2, class700 arg3) {
        field4680++;
        class511 var4 = arg0.method3149((byte) 21, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method608();
        if (var5 < var4.method607()) {
            var5 = var4.method607();
        }
        byte var6 = 10;
        int var7 = arg3.field9764;
        if (arg2 < 86) {
            return;
        }
        int var8 = arg3.field9767;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field7841 != null) {
            var9 = class47.field665.method2906((byte) 125, null, null, class415.field5338, arg0.field7841);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class415.field5338[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class186.field2378.method52(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class186.field2378.method51() * var9 + (class186.field2378.method49() / 2);
        }
        int var15 = var5 / 2 + arg3.field9764;
        int var16 = arg3.field9767;
        if (var7 < class706.field9849 + var5) {
            var7 = class706.field9849;
            var15 = var10 / 2 + class706.field9849 + var5 / 2 + var6 + 5;
        } else if (var7 > (class706.field9847 - var5)) {
            var15 = class706.field9847 - var6 - (var5 / 2) - (var10 / 2) - 5;
            var7 = class706.field9847 - var5;
        }
        if (var8 < class706.field9854 + var5) {
            var8 = class706.field9854;
            var16 = var5 / 2 + var6 + class706.field9854;
        } else if (class706.field9855 - var5 < var8) {
            var16 = class706.field9855 - (var5 / 2) - var6 - var11;
            var8 = class706.field9855 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field9764), (double) (var8 - arg3.field9767)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2750((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field7841 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 - (-var10 - 10);
            var21 = class186.field2378.method51() * var9 + var16 + 3;
            if (arg0.field7847 != 0) {
                arg1.method400(arg0.field7847, var18, var21 - var16, (byte) 101, var20 - var18, var16);
            }
            if (arg0.field7811 != 0) {
                arg1.method354(var20 - var18, arg0.field7811, -98, var18, var21 - var16, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class415.field5338[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class186.field2378.method50(arg1, var23, var15, var16, arg0.field7838, true);
                var16 += class186.field2378.method51();
            }
        }
        if (arg0.field7816 == -1 && arg0.field7841 == null) {
            return;
        }
        class123 var24 = new class123(arg3);
        int var25 = var5 >> 1;
        var24.field1597 = var8 + var25;
        var24.field1594 = var7 + var25;
        var24.field1603 = var21;
        var24.field1593 = var18;
        var24.field1591 = var19;
        var24.field1598 = var20;
        var24.field1595 = var7 - var25;
        var24.field1590 = var8 - var25;
        class453.field5907.method2087(var24, -110);
    }
}
