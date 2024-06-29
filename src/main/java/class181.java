import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class181 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[Lvb;")
    public class630[] field2632;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLpf;)I", line = 3)
    public static final int method1206(byte arg0, class728 arg1) {
        field2629++;
        int var2 = 5 / ((arg0 + 58) / 40);
        if (class632.field9000 == arg1) {
            return 9216;
        } else if (class754.field10479 == arg1) {
            return 34065;
        } else if (class126.field1734 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Ljava/lang/String;", line = 28)
    public static final String method1207(byte arg0) {
        field2633++;
        String var1 = "www";
        if (arg0 != -17) {
            return null;
        }
        if (class746.field10392 == class477.field6507) {
            var1 = "www-wtrc";
        } else if (class746.field10392 == class286.field3771) {
            var1 = "www-wtqa";
        } else if (class746.field10392 == class363.field4650) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class686.field9626 != null) {
            var2 = "/p=" + class686.field9626;
        }
        return "http://" + var1 + "." + class210.field2984.field1661 + ".com/l=" + class369.field4721 + "/a=" + class711.field9915 + var2 + "/";
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 58)
    public static final void method1208(int arg0) {
        class159.method997(-119, 2, class674.field9500.field5128.method2987(0) == arg0, 22050);
        field2634++;
        class510.field7114 = class548.method3273(class438.field6016, 22050, 0, class379.field5339, -60);
        class645.method3739((byte) 67, class340.method1965(3, null), true);
        class435.field5966 = class548.method3273(class438.field6016, 2048, 1, class379.field5339, -47);
        class237.field3299 = new class650();
        class435.field5966.method3143((byte) -41, class237.field3299);
        class478.field6515 = new class624(22050, class757.field10509);
        class637.method3701(-4198);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lag;ILvj;)Lvb;", line = 74)
    private final class630 method1209(class214 arg0, int arg1, class26 arg2) {
        field2628++;
        if (class523.field7343 == arg0) {
            return class242.method1537(arg2, 17910);
        } else if (class749.field10433 == arg0) {
            return class661.method3801(arg2, 4626);
        } else {
            if (arg1 != 2048) {
                this.field2626 = -102;
            }
            if (class179.field2532 == arg0) {
                return class708.method3985((byte) -69, arg2);
            } else if (class395.field5485 == arg0) {
                return class518.method3077(arg2, (byte) 26);
            } else if (class491.field6597 == arg0) {
                return class119.method779(arg2, 0);
            } else if (class540.field7551 == arg0) {
                return class248.method1575((byte) 95, arg2);
            } else if (class550.field7766 == arg0) {
                return class456.method2740(arg1 - 2169, arg2);
            } else if (class399.field5523 == arg0) {
                return class95.method652(true, arg2);
            } else if (class526.field7362 == arg0) {
                return class376.method2277((byte) -97, arg2);
            } else if (class140.field1917 == arg0) {
                return class35.method248(arg2, 2447);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvj;I)V", line = 126)
    public final void method1210(class26 arg0, int arg1) {
        field2630++;
        this.field2631 = arg0.method186((byte) 104);
        this.field2626 = arg0.method193(2);
        this.field2632 = new class630[arg0.method194((byte) 119)];
        class214[] var3 = class329.method1917(-71);
        for (int var4 = 0; var4 < this.field2632.length; var4++) {
            this.field2632[var4] = this.method1209(var3[arg0.method194((byte) 119)], 2048, arg0);
        }
        if (arg1 >= -116) {
            this.method1210(null, -34);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V", line = 154)
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class675.field9512 = arg1;
        field2627++;
        class116.field1628 = arg3;
        class490.field6592 = arg4;
        if (arg0 == 2) {
            class395.field5484 = arg2;
        }
    }
}
