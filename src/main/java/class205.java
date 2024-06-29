import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class205 extends class51 {

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
    private int field4032 = -1;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "Z")
    public static boolean field4029 = false;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "Lea;")
    private static class38 field4034 = class9.method46((byte) 126, "flash1:");

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "[Lea;")
    public static class38[] field4031 = new class38[500];

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "Lea;")
    public static class38 field4030 = field4034;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field4028 = 0;

    @OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lea;")
    public static class38 field4026 = field4034;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    public static int field4035 = 0;

    @OriginalMember(owner = "client!wh", name = "tb", descriptor = "Lea;")
    public static class38 field4046 = class9.method46((byte) 126, "VOLL");

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
    private int field4037;

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!wh", name = "ob", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!wh", name = "qb", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wh", name = "sb", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wh", name = "rb", descriptor = "Ljava/awt/Font;")
    public static Font field4044;

    @OriginalMember(owner = "client!wh", name = "pb", descriptor = "[I")
    private int[] field4042;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, false);
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field4034 = null;
        field4046 = null;
        if (arg0 >= -91) {
            field4034 = null;
        }
        field4030 = null;
        field4026 = null;
        field4031 = null;
        field4044 = null;
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)I")
    public final int method375(int arg0) {
        if (arg0 != -30563) {
            return -78;
        } else {
            ++field4043;
            return this.field4032;
        }
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)Z")
    private final boolean method1339(int arg0) {
        ++field4045;
        if (this.field4042 != null) {
            return true;
        } else if (arg0 <= 50) {
            return false;
        } else if (~this.field4032 <= -1) {
            int var2 = !class125.field2692.method1244(-113, this.field4032) ? 128 : 64;
            this.field4042 = class125.field2692.method1243((byte) -106, this.field4032);
            this.field4036 = var2;
            this.field4037 = var2;
            return this.field4042 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Lef;I)V")
    public static final void method1340(int arg0, class43[] arg1, int arg2) {
        if (arg0 != -7251) {
            field4035 = -71;
        }
        for (int var3 = 0; arg1.length > var3; ++var3) {
            class43 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field965 == -1) {
                    if (var4.field1061 != null) {
                        method1340(-7251, var4.field1061, arg2);
                    }
                    class42 var5 = (class42) class177.field3580.method183((byte) 67, (long) var4.field1013);
                    if (var5 != null) {
                        class65.method460(var5.field921, arg2, arg0 ^ 7215);
                    }
                }
                if (arg2 == 0 && var4.field944 != null) {
                    class48 var6 = new class48();
                    var6.field1153 = var4;
                    var6.field1166 = var4.field944;
                    class113.method894(var6, (byte) 112);
                }
                if (~arg2 == -2 && var4.field1018 != null) {
                    if (~var4.field945 <= -1) {
                        class43 var7 = class98.method813(var4.field1013, 4096);
                        if (var7 == null || var7.field1061 == null || ~var7.field1061.length >= ~var4.field945 || var7.field1061[var4.field945] != var4) {
                            continue;
                        }
                    }
                    class48 var8 = new class48();
                    var8.field1166 = var4.field1018;
                    var8.field1153 = var4;
                    class113.method894(var8, (byte) 121);
                }
            }
        }
        ++field4041;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lef;B)Lea;")
    public static final class38 method1341(class43 arg0, byte arg1) {
        ++field4033;
        if (~class25.method147(class40.method299(arg0, 25), false) == -1) {
            return null;
        } else if (arg0.field971 != null && ~arg0.field971.method255((byte) -99).method276((byte) 38) != -1) {
            int var2 = 0 % ((arg1 - 15) / 41);
            return arg0.field971;
        } else {
            return class37.field783 ? class90.field2053 : null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field4038;
        if (arg2) {
            if (arg1 == 0) {
                this.field4032 = arg0.method511(-128);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field4039;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032 && this.method1339(118)) {
            int var4 = (class114.field2528 == this.field4036 ? arg1 : this.field4036 * arg1 / class114.field2528) * this.field4037;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class86.field2008 == this.field4037) {
                for (int var8 = 0; class86.field2008 > var8; ++var8) {
                    int var9 = this.field4042[var4++];
                    var6[var8] = class52.method380(255, var9) << 4;
                    var7[var8] = class52.method380(65280, var9) >> 4;
                    var5[var8] = class52.method380(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class86.field2008 > var10; ++var10) {
                    int var11 = this.field4037 * var10 / class86.field2008;
                    int var12 = this.field4042[var4 + var11];
                    var6[var10] = class52.method380(255, var12) << 4;
                    var7[var10] = class52.method380(4080, var12 >> 4);
                    var5[var10] = class52.method380(var12 >> 12, 4080);
                }
            }
        }
        if (arg0 < 111) {
            field4034 = null;
        }
        return var3;
    }
}
