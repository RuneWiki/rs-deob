import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class317 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lwi;")
    public static class330 field4604 = new class330(8);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4608 = new String[100];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
    public boolean field4605;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static final void method1987(byte arg0) {
        field4607++;
        int var1 = 67 % ((arg0 + 5) / 62);
        for (int var2 = 0; var2 < class282.field4151; var2++) {
            int var3 = class421.field6420[var2];
            class17 var4 = ((class24) class406.field6158.method1747((long) var3, false)).field348;
            int var5 = class409.field6214.method1087(false);
            if ((var5 & 0x4) != 0) {
                var5 += class409.field6214.method1087(false) << 8;
            }
            if ((var5 & 0x80) != 0) {
                var4.field3833 = class409.field6214.method1100(-25469);
                if (var4.field3833 == 65535) {
                    var4.field3833 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                int var6 = class409.field6214.method1100(-25469);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class409.field6214.method1067(false);
                class311.method1963(var4, var7, (byte) -104, var6);
            }
            if ((var5 & 0x20) != 0) {
                int var8 = class409.field6214.method1077((byte) -122);
                int var9 = class409.field6214.method1067(false);
                var4.method1770(var9, var8, class393.field6017, -29331);
            }
            if ((var5 & 0x40) != 0) {
                int var10 = class409.field6214.method1079(-13703);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class409.field6214.method1059((byte) 30);
                int var12 = class409.field6214.method1057(19);
                var4.method1773(false, var12, var11, var10, (byte) -73);
            }
            if ((var5 & 0x800) != 0) {
                int var13 = class409.field6214.method1087(false);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class409.field6214.method1079(-13703);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class409.field6214.method1067(false);
                    var16[var17] = class409.field6214.method1100(-25469);
                }
                class460.method2784(var4, 0, var14, var15, var16);
            }
            if ((var5 & 0x200) != 0) {
                var4.field3830 = class409.field6214.method1088((byte) -93);
                var4.field3857 = class409.field6214.method1092(true);
                var4.field3869 = class409.field6214.method1092(true);
                var4.field3841 = class409.field6214.method1065(-3881);
                var4.field3817 = class409.field6214.method1074(-635989152) + class393.field6017;
                var4.field3870 = class409.field6214.method1100(-25469) + class393.field6017;
                var4.field3814 = class409.field6214.method1086((byte) 108);
                var4.field3841 += var4.field3915[0];
                var4.field3857 += var4.field3915[0];
                var4.field3830 += var4.field3917[0];
                var4.field3869 += var4.field3917[0];
                var4.field3910 = 0;
                var4.field3918 = 1;
            }
            if ((var5 & 0x8) != 0) {
                if (var4.field274.method1665((byte) -102)) {
                    class308.method1930(var4, true);
                }
                var4.method167(8046, class137.field1834.method1626((byte) -15, class409.field6214.method1100(-25469)));
                var4.method1771(var4.field274.field3586, 0);
                var4.field3878 = var4.field274.field3568 << 3;
                if (var4.field274.method1665((byte) 31)) {
                    class165.method1124(0, var4.field3915[0], -2, var4, var4.field1866, null, var4.field3917[0], null);
                }
            }
            if ((var5 & 0x1000) != 0) {
                int var19 = class409.field6214.method1074(-635989152);
                var4.field3904 = class409.field6214.method1087(false);
                var4.field3866 = class409.field6214.method1086((byte) 26);
                var4.field3858 = (var19 & 0x8000) != 0;
                var4.field3883 = var19 & 0x7FFF;
                var4.field3876 = class393.field6017 + var4.field3904 + var4.field3883;
            }
            if ((var5 & 0x400) != 0) {
                int var20 = class409.field6214.method1074(-635989152);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class409.field6214.method1059((byte) 30);
                int var22 = class409.field6214.method1057(72);
                var4.method1773(true, var22, var21, var20, (byte) -73);
            }
            if ((var5 & 0x2) != 0) {
                var4.field3862 = class409.field6214.method1064(false);
                var4.field3879 = 100;
            }
            if ((var5 & 0x1) != 0) {
                int var23 = class409.field6214.method1077((byte) -127);
                int var24 = class409.field6214.method1057(37);
                var4.method1770(var24, var23, class393.field6017, -29331);
                var4.field3865 = class393.field6017 + 300;
                var4.field3898 = class409.field6214.method1086((byte) -110);
            }
            if ((var5 & 0x2000) != 0) {
                var4.field282 = class409.field6214.method1079(-13703);
                var4.field288 = class409.field6214.method1100(-25469);
            }
            if ((var5 & 0x100) != 0) {
                var4.field3873 = class409.field6214.method1088((byte) -112);
                var4.field3826 = class409.field6214.method1088((byte) 95);
                var4.field3881 = class409.field6214.method1088((byte) 59);
                var4.field3825 = (byte) class409.field6214.method1087(false);
                var4.field3903 = class393.field6017 + class409.field6214.method1100(-25469);
                var4.field3896 = class393.field6017 + class409.field6214.method1058(-882090520);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1988(int arg0) {
        field4608 = null;
        field4604 = null;
        if (arg0 != -300) {
            field4604 = null;
        }
    }
}
