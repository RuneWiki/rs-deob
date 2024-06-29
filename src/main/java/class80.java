import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class80 {

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "[I")
    public static int[] field1099 = new int[120];

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "[I")
    public static int[] field1101 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field1102;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1099[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILwn;B)Z", line = 6)
    public static final boolean method478(int arg0, class583 arg1, byte arg2) {
        field1098++;
        if (arg2 != 38) {
            method480(false);
        }
        int var3 = arg1.method3467(-119, 2);
        if (var3 == 0) {
            if (arg1.method3467(-113, 1) != 0) {
                method478(arg0, arg1, (byte) 38);
            }
            int var4 = arg1.method3467(3, 6);
            int var5 = arg1.method3467(105, 6);
            boolean var6 = arg1.method3467(arg2 ^ 0xFFFFFF9E, 1) == 1;
            if (var6) {
                class513.field7162[class724.field10204++] = arg0;
            }
            if (class40.field563[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class257 var7 = class175.field2382[arg0];
            class655 var8 = class40.field563[arg0] = new class655();
            var8.field8344 = arg0;
            if (class383.field5386[arg0] != null) {
                var8.method3786(class383.field5386[arg0], 0);
            }
            var8.method3471(var7.field3520, (byte) -73, true);
            var8.field8342 = var7.field3519;
            int var9 = var7.field3517;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FF67D) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class179.field2535;
            int var14 = (var12 << 6) - (class510.field7109 - var5);
            var8.field9264 = var7.field3515;
            var8.field8420[0] = class634.field9025[arg0];
            var8.field9501 = var8.field9495 = (byte) var10;
            if (class753.method4175(arg2 - 12426, var14, var13)) {
                var8.field9495++;
            }
            var8.method3788(var14, 18305, var13);
            var8.field9276 = false;
            class175.field2382[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method3467(111, 2);
            int var16 = class175.field2382[arg0].field3517;
            class175.field2382[arg0].field3517 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method3467(101, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class175.field2382[arg0].field3517;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class175.field2382[arg0].field3517 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method3467(84, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class175.field2382[arg0].field3517;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class175.field2382[arg0].field3517 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)[Lcba;", line = 173)
    public static final class53[] method479(int arg0) {
        field1100++;
        if (arg0 != -28841) {
            method482((byte) -6);
        }
        return new class53[] { class410.field5727, class167.field2283, class594.field8561 };
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V", line = 188)
    public static void method480(boolean arg0) {
        if (arg0) {
            field1101 = null;
            field1099 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 203)
    public static final void method481(int arg0) {
        class538 var1 = class585.field8426;
        synchronized (class585.field8426) {
            if (arg0 >= -69) {
                method479(63);
            }
            class585.field8426.method3202((byte) 127);
        }
        field1096++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V", line = 217)
    public static final void method482(byte arg0) {
        if (class199.field2878 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class688.field9646.length; var2++) {
                if (class688.field9646[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class199.field2878;
                    var1++;
                    if (var10000 == ~var1) {
                        class577.field8263 = class688.field9646[var2].substring(class688.field9646[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class577.field8263 = "";
        }
        int var3 = -34 / ((51 - arg0) / 63);
        field1097++;
    }
}
