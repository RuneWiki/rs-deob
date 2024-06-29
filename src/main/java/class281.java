import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class281 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    private int field4443 = 0;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    private int field4448 = 0;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public int field4455 = -1;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    private int field4452 = 128;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    private int field4450 = 128;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Z")
    public boolean field4459 = false;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Z")
    public boolean field4458 = false;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field4461 = 0;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4449 = null;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[I")
    public static int[] field4457 = new int[2];

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    private int field4451;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[S")
    private short[] field4441;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[S")
    private short[] field4442;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[S")
    private short[] field4446;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[S")
    private short[] field4460;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILig;I)V")
    private final void method1885(int arg0, class136 arg1, int arg2) {
        field4444++;
        if (arg2 == 1) {
            this.field4451 = arg1.method996(65280);
        } else if (arg2 == 2) {
            this.field4455 = arg1.method996(65280);
        } else if (arg2 == 4) {
            this.field4450 = arg1.method996(65280);
        } else if (arg2 == 5) {
            this.field4452 = arg1.method996(65280);
        } else if (arg2 == 6) {
            this.field4443 = arg1.method996(65280);
        } else if (arg2 == 7) {
            this.field4448 = arg1.method1012(4);
        } else if (arg2 == 8) {
            this.field4461 = arg1.method1012(4);
        } else if (arg2 == 9) {
            this.field4458 = true;
        } else if (arg2 == 10) {
            this.field4459 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1012(4);
            this.field4441 = new short[var6];
            this.field4442 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4441[var7] = (short) arg1.method996(65280);
                this.field4442[var7] = (short) arg1.method996(65280);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1012(4);
            this.field4446 = new short[var4];
            this.field4460 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4460[var5] = (short) arg1.method996(65280);
                this.field4446[var5] = (short) arg1.method996(65280);
            }
        }
        if (arg0 < 108) {
            this.field4458 = false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method1886(int arg0) {
        field4456++;
        if (!class239.field3761) {
            return;
        }
        class114 var1 = class129.method939(class33.field550, 36, class7.field90);
        if (arg0 >= -18) {
            return;
        }
        if (var1 != null && var1.field1832 != null) {
            class196 var2 = new class196();
            var2.field3205 = var1.field1832;
            var2.field3213 = var1;
            class129.method938(110, var2);
        }
        class239.field3761 = false;
        class96.field1494 = -1;
        class72.method556(0, var1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lig;I)V")
    public final void method1887(class136 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1012(4);
            if (var3 == 0) {
                field4447++;
                if (arg1 != 0) {
                    method1889(false);
                    return;
                }
                return;
            }
            this.method1885(110, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIII)Lpb;")
    public final class168 method1888(byte arg0, int arg1, int arg2, int arg3) {
        field4453++;
        class168 var5 = (class168) class270.field4337.method1155((long) this.field4454, true);
        if (var5 == null) {
            class264 var6 = class264.method1779(class113.field1738, this.field4451, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4441 != null) {
                for (int var7 = 0; var7 < this.field4441.length; var7++) {
                    var6.method1803(this.field4441[var7], this.field4442[var7]);
                }
            }
            if (this.field4460 != null) {
                for (int var8 = 0; var8 < this.field4460.length; var8++) {
                    var6.method1799(this.field4460[var8], this.field4446[var8]);
                }
            }
            var5 = var6.method1786(this.field4448 + 64, this.field4461 + 850, -30, -50, -30);
            class270.field4337.method1161(var5, (byte) -116, (long) this.field4454);
        }
        if (arg0 != 36) {
            return null;
        }
        class168 var9;
        if (this.field4455 == -1 || arg2 == -1) {
            var9 = var5.method336(true, true, true);
        } else {
            var9 = class28.method246(75, this.field4455).method618(var5, arg3, arg2, 65535, arg1);
        }
        if (this.field4450 != 128 || this.field4452 != 128) {
            var9.method338(this.field4450, this.field4452, this.field4450);
        }
        if (this.field4443 != 0) {
            if (this.field4443 == 90) {
                var9.method357();
            }
            if (this.field4443 == 180) {
                var9.method351();
            }
            if (this.field4443 == 270) {
                var9.method344();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void method1889(boolean arg0) {
        field4457 = null;
        field4449 = null;
        if (arg0) {
            field4457 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method1890(int arg0) {
        field4445++;
        Container var1;
        if (class201.field3273 != null) {
            var1 = class201.field3273;
        } else if (class207.field3327 == null) {
            var1 = class205.field3294.field1291;
        } else {
            var1 = class207.field3327;
        }
        int var2 = 102 % ((arg0 - 68) / 36);
        class205.field3297 = var1.getSize().width;
        class56.field991 = var1.getSize().height;
        if (class207.field3327 == var1) {
            Insets var3 = class207.field3327.getInsets();
            class205.field3297 -= var3.right + var3.left;
            class56.field991 -= var3.top + var3.bottom;
        }
        if (class218.method1447(-769845689) < 2) {
            class287.field4595 = (class205.field3297 - 765) / 2;
            class22.field339 = 0;
            class137.field2301 = 765;
            class33.field557 = 503;
        } else {
            class137.field2301 = class205.field3297;
            class22.field339 = 0;
            class33.field557 = class56.field991;
            class287.field4595 = 0;
        }
        class22.field340.setSize(class137.field2301, class33.field557);
        if (class207.field3327 == var1) {
            Insets var4 = class207.field3327.getInsets();
            class22.field340.setLocation(var4.left + class287.field4595, class22.field339 + var4.top);
        } else {
            class22.field340.setLocation(class287.field4595, class22.field339);
        }
        if (class223.field3558 != -1) {
            class190.method1313(true, 115);
        }
        class149.method1092(128);
    }
}
