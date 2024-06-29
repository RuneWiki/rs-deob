import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class75 extends class115 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    private int field1163 = 1;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field1164 = 1;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    private int field1166 = 204;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1167 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1168 = new String[5];

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1169 = "rating: ";

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "[I")
    public static int[] field1170;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
    public static final void method500(String arg0, boolean arg1, int arg2, String arg3) {
        ++field1162;
        class280.field4469 = arg0;
        class194.field2781 = arg2;
        class173.field2479 = arg3;
        if (!class280.field4469.equals("") && !class173.field2479.equals("")) {
            if (class29.field415 != -1) {
                class42.method292(-19389);
            } else {
                class162.field2341 = 1;
                class151.field2170 = 0;
                class118.field1741 = -3;
                class179.field2561 = 0;
                class114 var4 = new class114(128);
                var4.method775(10, -117);
                var4.method737(-2645, (int) (9.9999999E7D * Math.random()));
                var4.method765(532401312, class109.method712((byte) -126, class280.field4469));
                var4.method737(-2645, (int) (9.9999999E7D * Math.random()));
                var4.method734((byte) -128, class173.field2479);
                var4.method737(-2645, (int) (Math.random() * 9.9999999E7D));
                var4.method744(field1167, 20819, class101.field1502);
                if (!arg1) {
                    field1167 = null;
                }
                class95.field1451.field1673 = 0;
                class95.field1451.method775(24, -119);
                class95.field1451.method775(2 - -var4.field1673, -123);
                class95.field1451.method794(534, (byte) -57);
                class95.field1451.method774((byte) -127, var4.field1673, 0, var4.field1629);
            }
        } else {
            class118.field1741 = 3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lve;I)V")
    public static final void method501(class233 arg0, int arg1) {
        ++field1160;
        class152.field2200 = arg0;
        if (arg1 < 76) {
            field1167 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1159;
        if (arg0 != 242152972) {
            this.field1163 = 12;
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            for (int var4 = 0; ~var4 > ~class77.field1178; ++var4) {
                int var5 = class169.field2444[var4];
                int var6 = class187.field2664[arg1];
                int var7 = var5 % (4096 / this.field1164) * this.field1164;
                int var8 = var6 % (4096 / this.field1163) * this.field1163;
                int var9 = this.field1164 * var5 >> 12;
                int var10 = this.field1163 * var6 >> 12;
                if (~this.field1166 < ~var8) {
                    for (var9 -= var10; ~var9 > -1; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (~var9 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var7 > ~this.field1166) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1166 < ~var7) {
                    int var11;
                    for (var11 = var9 - var10; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
    public static void method502(byte arg0) {
        field1170 = null;
        if (arg0 < 117) {
            method503(-51, -27, 17, -104, (byte) -44);
        }
        field1169 = null;
        field1167 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIB)V")
    public static final void method503(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~arg1 <= ~arg0) {
            class183.method1181(arg2, (byte) -69, arg1, class163.field2370[arg3], arg0);
        } else {
            class183.method1181(arg2, (byte) -69, arg0, class163.field2370[arg3], arg1);
        }
        if (arg4 >= 83) {
            ++field1165;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1171;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1166 = arg1.method756(arg0 ^ 29900);
                }
            } else {
                this.field1163 = arg1.method760(false);
            }
        } else {
            this.field1164 = arg1.method760(false);
        }
        if (arg0 != -1) {
            this.method168(19, (class114) null, -3);
        }
    }
}
