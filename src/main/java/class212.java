import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class212 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "B")
    private byte field3003;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lps;")
    public static class63 field3001 = new class63();

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3006 = 1339;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V", line = 6)
    public static final void method1458(boolean arg0, int arg1) {
        field3004++;
        if (arg0) {
            if (class337.field5232 != -1) {
                class138.method927((byte) 54, class337.field5232);
            }
            for (class436 var2 = (class436) class312.field4570.method1743(false); var2 != null; var2 = (class436) class312.field4570.method1742(arg1 ^ 0x7BEF)) {
                if (!var2.method24(-25618)) {
                    var2 = (class436) class312.field4570.method1743(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class486.method2910(var2, false, true, 0);
            }
            class337.field5232 = -1;
            class312.field4570 = new class272(8);
            class313.method1973((byte) 84);
            class337.field5232 = class236.field3342;
            class404.method2490(98, false);
            class141.method950(0);
            class343.method2219(class337.field5232);
        }
        class155.field2015 = false;
        class530.field7794 = "";
        class452.field6813 = "";
        class74.method512(-32579);
        class449.field6752 = -1;
        class278.method1789(-68, class271.field3768);
        class56.field800 = new class96();
        class56.field800.field3917[0] = class398.field6071 / 2;
        class56.field800.field1867 = class398.field6071 * 128 / 2;
        if (arg1 != 31616) {
            return;
        }
        class56.field800.field1862 = class528.field7734 * 128 / 2;
        class56.field800.field3915[0] = class528.field7734 / 2;
        class140.field1869 = 0;
        class199.field2646 = 0;
        if (class340.field5269 == 2) {
            class199.field2646 = class486.field7194 << 7;
            class140.field1869 = class24.field355 << 7;
        } else {
            class297.method1897(-124);
        }
        class173.method1171((byte) -32);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I", line = 71)
    public final int method1459(int arg0) {
        if (arg0 != 0) {
            this.field3000 = 88;
        }
        field2997++;
        return (this.field3003 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 84)
    public static void method1460(boolean arg0) {
        field3001 = null;
        if (!arg0) {
            method1460(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I", line = 97)
    public final int method1461(int arg0) {
        field2999++;
        if (arg0 != -5847) {
            this.method1459(53);
        }
        return this.field3003 & 0x7;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)V", line = 115)
    public static final void method1462(boolean arg0, int arg1) {
        field3005++;
        if (arg1 != 5424) {
            field3006 = -30;
        }
        for (class179 var2 = (class179) class86.field1251.method445(33); var2 != null; var2 = (class179) class86.field1251.method451(false)) {
            if (var2.field2400 != null) {
                class31.field463.method883(var2.field2400);
                var2.field2400 = null;
            }
            if (var2.field2391 != null) {
                class31.field463.method883(var2.field2391);
                var2.field2391 = null;
            }
            var2.method25(-13489);
        }
        if (!arg0) {
            return;
        }
        for (class179 var3 = (class179) class86.field1254.method445(arg1 - 5391); var3 != null; var3 = (class179) class86.field1254.method451(false)) {
            if (var3.field2400 != null) {
                class31.field463.method883(var3.field2400);
                var3.field2400 = null;
            }
            var3.method25(-13489);
        }
        for (class179 var4 = (class179) class424.field6459.method1743(false); var4 != null; var4 = (class179) class424.field6459.method1742(122)) {
            if (var4.field2400 != null) {
                class31.field463.method883(var4.field2400);
                var4.field2400 = null;
            }
            var4.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 182)
    public class212() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lnj;)V", line = 184)
    public class212(class164 arg0) {
        this.field3003 = arg0.method1088((byte) 102);
        this.field3000 = arg0.method1074(-635989152);
        this.field2996 = arg0.method1099(-113);
        this.field2995 = arg0.method1099(-127);
        this.field3002 = arg0.method1099(-108);
        this.field2998 = arg0.method1099(98);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLqa;IIII)V", line = 197)
    public static final void method1463(byte arg0, class165 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2994++;
        arg1.method739(arg2, arg3, arg2 + arg5, arg3 + arg4);
        arg1.method1117(arg4, arg3, -16777216, arg2, arg5, (byte) 73);
        if (arg0 < 89) {
            method1460(true);
        }
        if (class357.field5502 < 100) {
            return;
        }
        float var6 = (float) class12.field246 / (float) class12.field238;
        int var7 = arg5;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg5 - var7) / 2 + arg2;
        int var10 = (arg4 - var8) / 2 + arg3;
        if (class91.field1335 == null || arg5 != class91.field1335.method296() || class91.field1335.method305() != arg4) {
            class12.method127(class12.field247, class12.field245 + class12.field246, class12.field247 + class12.field238, class12.field245, var9, var10, var7 + var9, var10 - -var8);
            class12.method119(arg1);
            class91.field1335 = arg1.method816(var9, var10, var7, var8, false);
        }
        class91.field1335.method2201(var9, var10);
        int var11 = class352.field5442 * var7 / class12.field238;
        int var12 = class114.field1588 * var8 / class12.field246;
        int var13 = var9 + (class394.field6028 * var7 / class12.field238);
        int var14 = var8 + var10 - (class393.field6016 * var8 / class12.field246) - var12;
        int var15 = -1996554240;
        if (class67.field957 == class249.field3474) {
            var15 = -1996488705;
        }
        arg1.method747(var13, var14, var11, var12, var15, 1);
        arg1.method810(var13, var14, var11, var12, var15, 0);
        if (class84.field1223 <= 0) {
            return;
        }
        int var16;
        if (class150.field1970 > 50) {
            var16 = (100 - class150.field1970) * 5;
        } else {
            var16 = class150.field1970 * 5;
        }
        for (class484 var17 = (class484) class12.field216.method445(33); var17 != null; var17 = (class484) class12.field216.method451(false)) {
            class38 var18 = class12.field210.method1851(36, var17.field7129);
            if (class23.method220(123, var18)) {
                if (class439.field6616 == var17.field7129) {
                    int var19 = var9 + (var17.field7125 * var7 / class12.field238);
                    int var20 = (class12.field246 - var17.field7130) * var8 / class12.field246 + var10;
                    arg1.method1117(4, var20 - 2, var16 << 24 | 0xFFFF00, var19 - 2, 4, (byte) 73);
                } else if (class390.field5956 != -1 && class390.field5956 == var18.field571) {
                    int var21 = var17.field7125 * var7 / class12.field238 + var9;
                    int var22 = (class12.field246 - var17.field7130) * var8 / class12.field246 + var10;
                    arg1.method1117(4, var22 - 2, var16 << 24 | 0xFFFF00, var21 - 2, 4, (byte) 73);
                }
            }
        }
    }
}
