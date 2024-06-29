import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class340 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lpa;")
    private class387 field5043 = new class387(64);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Lcb;")
    private class544 field5045;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBILha;)V", line = 8)
    public static final void method2179(int arg0, byte arg1, int arg2, class66 arg3) {
        class259.field3639 = new class713[arg0][arg2];
        field5044++;
        class731.field10209 = arg3;
        if (arg1 >= -10) {
            method2185(-51, -44, false, 53, 123, 23, -82, -0.26343754F);
        }
        if (class113.field1432 != null) {
            class514.field7344 = class250.method1672(class113.field1432[5], class113.field1432[4], (byte) 120, class113.field1432[1], class113.field1432[3], class113.field1432[0], class113.field1432[2]);
        }
        class111.field1412 = new class713();
        class140.method974(53);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 28)
    public final void method2180(int arg0) {
        class387 var2 = this.field5043;
        synchronized (this.field5043) {
            this.field5043.method2369(-1);
        }
        field5046++;
        if (arg0 <= 21) {
            this.field5043 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z", line = 41)
    public static final boolean method2181(int arg0, int arg1, int arg2) {
        if (arg2 != 1024) {
            method2185(100, -101, true, 57, -29, -34, 60, 1.8142053F);
        }
        field5050++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Lrea;", line = 52)
    public final class216 method2182(int arg0, int arg1) {
        field5042++;
        class387 var3 = this.field5043;
        class216 var4;
        synchronized (this.field5043) {
            var4 = (class216) this.field5043.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field5045;
        byte[] var6;
        synchronized (this.field5045) {
            var6 = this.field5045.method3150(arg1, -91, 31);
        }
        class216 var7 = new class216();
        if (var6 != null) {
            var7.method1500(-94, new class120(var6));
        }
        class387 var8 = this.field5043;
        synchronized (this.field5043) {
            this.field5043.method2362(var7, arg0 - 4774, (long) arg1);
            if (arg0 != 4774) {
                this.field5045 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V", line = 83)
    public final void method2183(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method2180(101);
        }
        class387 var3 = this.field5043;
        synchronized (this.field5043) {
            this.field5043.method2366(arg0, 108);
        }
        field5048++;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 137)
    public class340(class106 arg0, int arg1, class544 arg2) {
        this.field5045 = arg2;
        this.field5045.method3147(31, -116);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 101)
    public final void method2184(int arg0) {
        field5049++;
        class387 var2 = this.field5043;
        synchronized (this.field5043) {
            this.field5043.method2364(1);
        }
        if (arg0 != 0) {
            field5047 = -122;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIZIIIIF)[I", line = 115)
    public static final int[] method2185(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        field5051++;
        int var8 = -109 / ((-arg6 - 73) / 51);
        int[] var9 = new int[arg5];
        class396 var10 = new class396();
        var10.field5624 = arg4;
        var10.field5626 = arg1;
        var10.field5612 = arg0;
        var10.field5613 = arg2;
        var10.field5620 = (int) (arg7 * 4096.0F);
        var10.field5614 = arg3;
        var10.method1454((byte) 125);
        class88.method628(-10452, 1, arg5);
        var10.method2417(0, var9, (byte) -62);
        return var9;
    }
}
