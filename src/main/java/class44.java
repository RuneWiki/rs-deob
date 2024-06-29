import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class44 extends class51 {

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    private int field1072 = 1024;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
    private int field1077 = 2048;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    private int field1074 = 3072;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "Lea;")
    private static class38 field1081 = class9.method46((byte) 119, "skill)2");

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "Lea;")
    public static class38 field1082 = field1081;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "Lpg;")
    public static class141 field1080 = new class141();

    @OriginalMember(owner = "client!eg", name = "ob", descriptor = "Lea;")
    private static class38 field1086 = class9.method46((byte) 122, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!eg", name = "mb", descriptor = "I")
    public static int field1084 = -1;

    @OriginalMember(owner = "client!eg", name = "pb", descriptor = "Lea;")
    public static class38 field1087 = class9.method46((byte) 123, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!eg", name = "rb", descriptor = "Lea;")
    private static class38 field1089 = class9.method46((byte) 117, "Unable to connect)3");

    @OriginalMember(owner = "client!eg", name = "qb", descriptor = "Lea;")
    public static class38 field1088 = field1089;

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "Lea;")
    public static class38 field1083 = field1086;

    @OriginalMember(owner = "client!eg", name = "nb", descriptor = "Lea;")
    public static class38 field1085 = field1089;

    @OriginalMember(owner = "client!eg", name = "sb", descriptor = "Lea;")
    private static class38 field1090 = class9.method46((byte) 114, "Ok");

    @OriginalMember(owner = "client!eg", name = "tb", descriptor = "Lea;")
    public static class38 field1091 = field1090;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        if (arg0 == -2) {
            ++field1075;
            this.field1077 = -this.field1072 + this.field1074;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        if (arg0 <= 111) {
            field1090 = null;
        }
        ++field1071;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, arg1, (byte) -79);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class86.field2008; ++var11) {
                var10[var11] = (var5[var11] * this.field1077 >> 12) + this.field1072;
                var8[var11] = (var6[var11] * this.field1077 >> 12) + this.field1072;
                var9[var11] = (var7[var11] * this.field1077 >> 12) + this.field1072;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field1073;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1289 = arg0.method509(116) == 1;
                }
            } else {
                this.field1074 = arg0.method511(-125);
            }
        } else {
            this.field1072 = arg0.method511(-120);
        }
        if (!arg2) {
            field1084 = 70;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1078;
        if (arg0 > -125) {
            field1087 = null;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int[] var4 = this.method376(arg1, 0, -81);
            for (int var5 = 0; ~var5 > ~class86.field2008; ++var5) {
                var3[var5] = this.field1072 - -(var4[var5] * this.field1077 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        int var1 = -45 % ((-28 - arg0) / 61);
        class67.field1643.method1083(3056);
        ++field1079;
        class181.field3647.method1083(3056);
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)V")
    public static void method325(int arg0) {
        field1083 = null;
        field1085 = null;
        field1086 = null;
        field1080 = null;
        field1087 = null;
        if (arg0 >= -57) {
            method324((byte) 31);
        }
        field1088 = null;
        field1081 = null;
        field1091 = null;
        field1090 = null;
        field1089 = null;
        field1082 = null;
    }
}
