import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class216 {

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lri;")
    private class97 field3554;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lri;")
    private class97 field3557;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "Lws;")
    public static class328 field3558 = new class328(10, 16);

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lpa;")
    private class339 field3555;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "Lri;")
    public static class97 field3561;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 4)
    public static void method1619(int arg0) {
        if (arg0 == 19676) {
            field3558 = null;
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILjfa;)Lat;", line = 16)
    public final class346 method1620(int arg0, class264 arg1) {
        field3560++;
        if (arg1 == null) {
            return null;
        }
        class444 var3 = arg1.method1247(3848);
        if (class24.field379 == var3) {
            return new class590((class631) arg1);
        }
        if (arg0 != -4517) {
            field3558 = null;
        }
        if (class673.field9482 == var3) {
            return new class425(this.method1621(-25499), (class463) arg1);
        } else if (class677.field9527 == var3) {
            return new class311(this.field3554, (class682) arg1);
        } else if (class524.field7646 == var3) {
            return new class535(this.field3554, (class481) arg1);
        } else if (class89.field1075 == var3) {
            return new class350(this.field3554, this.field3557, (class217) arg1);
        } else if (class355.field5664 == var3) {
            return new class52(this.field3554, this.field3557, (class244) arg1);
        } else if (class412.field6320 == var3) {
            return new class407(this.field3554, this.field3557, (class272) arg1);
        } else if (class147.field2460 == var3) {
            return new class330(this.field3554, this.field3557, (class403) arg1);
        } else if (class609.field8651 == var3) {
            return new class118(this.field3554, (class149) arg1);
        } else if (class683.field9584 == var3) {
            return new class404(this.field3554, this.field3557, (class602) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lri;Lri;)V", line = 78)
    public class216(class97 arg0, class97 arg1) {
        this.field3554 = arg0;
        this.field3557 = arg1;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Lpa;", line = 87)
    private final class339 method1621(int arg0) {
        if (arg0 != -25499) {
            return null;
        }
        if (this.field3555 == null) {
            this.field3555 = new class339();
        }
        field3559++;
        return this.field3555;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILpn;BLqg;)V", line = 101)
    public static final void method1622(int arg0, class692 arg1, byte arg2, class428 arg3) {
        field3556++;
        if (class275.field4413 >= 50 || arg3 == null || arg3.field6517 == null || arg0 >= arg3.field6517.length || arg3.field6517[arg0] == null || arg2 >= -12) {
            return;
        }
        int var4 = arg3.field6517[arg0][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xE9) >> 5;
        int var7 = var4 & 0x1F;
        if (arg3.field6517[arg0].length > 1) {
            int var8 = (int) ((double) arg3.field6517[arg0].length * Math.random());
            if (var8 > 0) {
                var5 = arg3.field6517[arg0][var8];
            }
        }
        int var9 = 256;
        if (arg3.field6515 != null && arg3.field6508 != null) {
            var9 = arg3.field6515[arg0] + (int) (Math.random() * (double) (arg3.field6508[arg0] - arg3.field6515[arg0]));
        }
        int var10 = arg3.field6524 == null ? 255 : arg3.field6524[arg0];
        if (var7 == 0) {
            if (class567.field8141 == arg1) {
                if (!arg3.field6526) {
                    class556.method3322(var5, 71, var9, 0, var6, var10);
                    return;
                }
                class299.method2072(var10, var9, 0, var5, 93, var6, false);
            }
        } else if (class17.field282.field4847 != 0) {
            int var11 = arg1.field9696 - 256 >> 9;
            int var12 = arg1.field9705 - 256 >> 9;
            int var13 = class567.field8141 == arg1 ? 0 : (arg1.field9695 << 24) + (var12 << 8) + (var11 << 16) + var7;
            class674.field9494[class275.field4413++] = new class681((byte) (arg3.field6526 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg1);
        }
    }
}
