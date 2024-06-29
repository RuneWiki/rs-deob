import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class107 extends class134 implements class55 {

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "Lfq;")
    public class134 field1458;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Ljm;")
    public static class485 field1459 = new class485(9, 4);

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "Luf;")
    public static class310 field1465 = new class310(70, -1);

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "F")
    public static float field1466;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        if (arg0 != 13599) {
            field1466 = -0.65681005F;
        }
        field1452++;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILqa;)V")
    public final void method357(int arg0, class162 arg1) {
        if (arg0 < 41) {
            this.method356(-116, null);
        }
        field1451++;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 <= 34) {
            this.method356(98, null);
        }
        field1461++;
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        field1450++;
        if (arg0) {
            this.field1458 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        if (arg1 != 16562) {
            this.field1458 = null;
        }
        field1455++;
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            this.method354((byte) -21);
        }
        field1456++;
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        field1448++;
        if (arg2 != 24130) {
            this.method398(-93);
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILqa;)V")
    public final void method356(int arg0, class162 arg1) {
        field1449++;
        if (arg0 < 100) {
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (arg0 < 74) {
            field1465 = null;
        }
        field1462++;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field1465 = null;
        field1459 = null;
        int var1 = -108 / (arg0 / 58);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            this.field1458 = null;
        }
        field1463++;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = -95 / ((-arg0 - 29) / 33);
        field1454++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method693(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class38.field513 != null && (arg3 != 3 || class437.field6374.field4269 != arg1 || class437.field6374.field4253 != arg0)) {
            class159.method978(-119, class282.field3804, class38.field513);
            class38.field513 = null;
        }
        field1464++;
        if (arg3 == 3 && class38.field513 == null) {
            class38.field513 = class479.method2815(class282.field3804, 0, 23430, arg0, 0, arg1);
            if (class38.field513 != null) {
                class437.field6374.field4269 = arg1;
                class437.field6374.field4253 = arg0;
                class437.field6374.method557(class282.field3804, (byte) -80);
            }
        }
        if (arg3 == 3 && class38.field513 == null) {
            method693(-1, -1, arg2, class437.field6374.field4263, 0, true);
            return;
        }
        Container var6;
        if (class38.field513 != null) {
            class282.field3808 = arg0;
            class166.field2345 = arg1;
            var6 = class38.field513;
        } else if (class140.field1993 == null) {
            var6 = class282.field3804.field5516;
            class166.field2345 = var6.getSize().width;
            class282.field3808 = var6.getSize().height;
        } else {
            Insets var7 = class140.field1993.getInsets();
            int var10001 = -var7.left;
            class166.field2345 = class140.field1993.getSize().width + (var10001 - var7.right);
            class282.field3808 = class140.field1993.getSize().height - var7.top - var7.bottom;
            var6 = class140.field1993;
        }
        if (arg3 == 1) {
            class177.field2513 = class95.field1311;
            class426.field6240 = 0;
            class351.field4795 = class260.field3581;
            class200.field2856 = (class166.field2345 - class95.field1311) / 2;
        } else if (class463.field6730 < 96 && class278.field3761 == 0) {
            int var8 = class166.field2345 > 1024 ? 1024 : class166.field2345;
            class200.field2856 = (class166.field2345 - var8) / 2;
            int var9 = class282.field3808 <= 768 ? class282.field3808 : 768;
            class177.field2513 = var8;
            class351.field4795 = var9;
            class426.field6240 = 0;
        } else {
            class426.field6240 = 0;
            class351.field4795 = class282.field3808;
            class177.field2513 = class166.field2345;
            class200.field2856 = 0;
        }
        if (class528.field7773 != class175.field2498) {
            boolean var10000;
            if (class177.field2513 < 1024 && class351.field4795 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class376.method2165(-1);
        } else {
            class474.field6924.setSize(class177.field2513, class351.field4795);
            class418.field6109.method538(class474.field6924);
            if (class140.field1993 == var6) {
                Insets var10 = class140.field1993.getInsets();
                class474.field6924.setLocation(class200.field2856 + var10.left, class426.field6240 + var10.top);
            } else {
                class474.field6924.setLocation(class200.field2856, class426.field6240);
            }
        }
        if (arg3 < 2) {
            class106.field1440 = false;
        } else {
            class106.field1440 = true;
        }
        if (class319.field4419 != -1) {
            class302.method1720(true, 66);
        }
        if (class117.field1578 != null && (class137.field1958 == 30 || class137.field1958 == 25)) {
            class305.method1732((byte) 67);
        }
        for (int var11 = arg4; var11 < 100; var11++) {
            class451.field6504[var11] = true;
        }
        class308.field4230 = true;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
    public final int method354(byte arg0) {
        int var2 = -59 % ((arg0 - 61) / 53);
        field1453++;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
    public final void method361(int arg0) {
        field1457++;
        int var2 = -5 / ((-arg0 - 36) / 36);
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIILfq;)V")
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, class134 arg5) {
        super(arg2, arg3, arg4, class173.method1071(3, arg0, arg1));
        this.field1458 = arg5;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        field1460++;
        if (!arg6) {
            this.method357(31, null);
        }
    }
}
