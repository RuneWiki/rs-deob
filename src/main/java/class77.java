import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class77 extends class219 {

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    private int field1210 = 0;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    private int field1209 = 4096;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lbd;")
    private static class162 field1208 = class17.method142(0, "wave2:");

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "Lbd;")
    public static class162 field1206 = field1208;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Lbd;")
    public static class162 field1204 = field1208;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Lbd;")
    private static class162 field1212 = class17.method142(0, "flash2:");

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "Lbd;")
    public static class162 field1215 = field1212;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Lbd;")
    public static class162 field1201 = field1212;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "Lbd;")
    private static class162 field1213 = class17.method142(0, "Loaded title screen");

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Lbd;")
    public static class162 field1207 = field1213;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I", line = 5)
    public static final int method579(int arg0, int arg1) {
        if (arg1 == 255) {
            field1205++;
            return arg0 & 0xFF;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILb;)V", line = 20)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field1203++;
        if (arg0 == 0) {
            this.field1210 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field1209 = arg2.method761((byte) 108);
        }
        if (arg1 != 0) {
            this.method42(-8, -59, (class94) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V", line = 56)
    public static final void method580(byte arg0) {
        class247 var1 = class237.field3946;
        synchronized (class237.field3946) {
            int var2 = -91 % ((-arg0 - 76) / 47);
            class139.field2477 = class17.field286;
            class102.field1854++;
            if (class86.field1535 >= 0) {
                while (class86.field1535 != class84.field1510) {
                    int var4 = class297.field4976[class84.field1510];
                    class84.field1510 = class84.field1510 + 1 & 0x7F;
                    if (var4 >= 0) {
                        class63.field991[var4] = true;
                    } else {
                        class63.field991[~var4] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class63.field991[var3] = false;
                }
                class86.field1535 = class84.field1510;
            }
            class17.field286 = class94.field1679;
        }
        field1217++;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V", line = 98)
    public static void method581(byte arg0) {
        field1206 = null;
        field1213 = null;
        field1208 = null;
        field1201 = null;
        field1207 = null;
        field1204 = null;
        field1212 = null;
        int var1 = 108 / ((arg0 + 81) / 33);
        field1215 = null;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 114)
    public static final void method582(int arg0) {
        class258.field4303 = arg0;
        for (int var1 = 0; var1 < class32.field524; var1++) {
            for (int var2 = 0; var2 < class158.field2787; var2++) {
                if (class288.field4856[arg0][var1][var2] == null) {
                    class288.field4856[arg0][var1][var2] = new class225(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 139)
    public class77() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIZJ)Lbd;", line = 152)
    public static final class162 method583(int arg0, boolean arg1, int arg2, boolean arg3, long arg4) {
        field1216++;
        class162 var6 = class203.method1511((byte) 117, 0);
        if (arg4 < 0L) {
            arg4 = -arg4;
            var6.method1264(-74, class262.field4372);
        }
        class162 var7 = class186.field3216;
        class162 var8 = class125.field2280;
        if (arg0 == 1) {
            var7 = class125.field2280;
            var8 = class186.field3216;
        }
        if (arg0 == 2) {
            var7 = class125.field2280;
            var8 = class35.field572;
        }
        class162 var9 = class203.method1511((byte) 109, 0);
        class162 var10 = class203.method1511((byte) 76, 0);
        if (!arg1) {
            field1215 = (class162) null;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1264(118, class156.method1212(10, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class51.field823;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg3 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1264(-38, var8);
            }
            var12++;
            var9.method1264(115, class156.method1212(10, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (var10.method1249((byte) -118) > 0) {
            var10.method1264(121, var7);
        }
        return class135.method1062(new class162[] { var6, var9.method1290((byte) -123), var10.method1290((byte) -52) }, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)[I", line = 241)
    public final int[] method41(boolean arg0, int arg1) {
        field1202++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1210 && this.field1209 >= var6 ? 4096 : 0;
            }
        }
        if (!arg0) {
            field1215 = (class162) null;
        }
        return var3;
    }
}
