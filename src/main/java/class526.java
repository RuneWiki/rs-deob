import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class526 extends class108 {

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public int field7321;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public int field7323;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public int field7316;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Z")
    public boolean field7318;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field7315;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Luv;")
    public static class3 field7317 = new class3(55, -1);

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Luv;")
    public static class3 field7324 = new class3(40, 2);

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "Z")
    public static boolean field7327;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "[I")
    public static int[] field7326;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[Lha;")
    public static class116[] field7325;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lqa;B)V")
    public static final void method2931(class167 arg0, byte arg1) {
        field7319++;
        arg0.method977(0, 0, class502.field6955, 350);
        arg0.method997(0, 0, class502.field6955, 350, class529.field7397 << 24 | 0x332277, 1);
        if (arg1 != -114) {
            return;
        }
        int var2 = 350 / class478.field6726;
        if (class82.field1115 > 0) {
            int var3 = 342 - class478.field6726;
            int var4 = var2 * var3 / (var2 - (1 - class82.field1115));
            int var5 = 4;
            if (class82.field1115 > 1) {
                var5 += (var3 - var4) * (class82.field1115 - class486.field6792 - 1) / (class82.field1115 - 1);
            }
            arg0.method997(class502.field6955 - 16, var5, 12, var4, class529.field7397 << 24 | 0x332277, 2);
            for (int var6 = class486.field6792; var6 < (class486.field6792 + var2) && var6 < class82.field1115; var6++) {
                String[] var7 = class455.method2637('\b', (byte) 64, class14.field143[var6]);
                int var8 = (class502.field6955 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method977(var10, 0, var10 + var8 - 8, 350);
                    class522.field7281.method1626(-16777216, var7[var9], -1, 350 - class157.field2032 - class621.field8953.field2037 - ((-class486.field6792 + var6) * class478.field6726) - 2, (byte) -16, var10);
                }
            }
        }
        arg0.method977(0, 0, class502.field6955, 350);
        arg0.method967(350 - class157.field2032, -1, arg1 ^ -36, 0, class502.field6955);
        class95.field1282.method1626(-16777216, "--> " + class21.field303, -1, 349 - class627.field9137.field2037, (byte) -16, 10);
        if (!class70.field921) {
            return;
        }
        int var11 = -1;
        if ((class7.field61 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method998(var11, -32192, 12, class627.field9137.method856(0, "--> " + class21.field303.substring(0, class191.field2468)) + 10, -class627.field9137.field2037 + 350 + -11);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2932(int arg0, int arg1, short[] arg2) {
        if (arg1 != 350) {
            field7317 = null;
        }
        field7320++;
        short[] var3 = new short[arg0];
        class205.method1316(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2933(int arg0) {
        field7326 = null;
        field7325 = null;
        if (arg0 >= -43) {
            method2931(null, (byte) -88);
        }
        field7324 = null;
        field7317 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIZ)V")
    public class526(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7321 = arg4;
        this.field7323 = arg3;
        this.field7322 = arg2;
        this.field7316 = arg1;
        this.field7318 = arg5;
        this.field7315 = arg0;
    }
}
