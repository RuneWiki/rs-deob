import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class323 {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[I")
    public int[] field4017 = new int[2];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public int[] field4009 = new int[3];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public int[] field4008 = new int[2];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    public int[] field4013 = new int[3];

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[S")
    public short[] field4010;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[S")
    public short[] field4012;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[Les;")
    public static class403[] field4015 = new class403[2048];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Ld;")
    public static class162 field4014;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1926(int arg0) {
        field4015 = null;
        field4014 = null;
        if (arg0 != -28800) {
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)I")
    public static final int method1927(int arg0, byte arg1, int arg2) {
        if (arg1 != 100) {
            field4014 = null;
        }
        field4011++;
        int var3 = class110.method885(4, arg0 + 91923, arg2 + 45365, -110) - (128 - (class110.method885(2, arg0 + 37821, arg2 - -10294, -104) - 128 >> 1) - (class110.method885(1, arg0, arg2, -113) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBI)V")
    public static final void method1928(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4016++;
        class714 var5 = class350.method2072((long) arg4, 4, (byte) 124);
        var5.method4043(6380);
        var5.field10023 = arg1;
        if (arg3 != -79) {
            field4015 = null;
        }
        var5.field10018 = arg0;
        var5.field10021 = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lfda;)V")
    public class323(class340 arg0) {
        this.field4013[1] = arg0.field4276;
        this.field4013[2] = arg0.field4189;
        this.field4013[0] = arg0.field4198;
        this.field4009[0] = arg0.field4191;
        this.field4009[2] = arg0.field4267;
        this.field4009[1] = arg0.field4238;
        this.field4008[0] = arg0.field4244;
        this.field4008[1] = arg0.field4204;
        this.field4017[0] = arg0.field4256;
        this.field4017[1] = arg0.field4258;
        if (arg0.field4224 != null) {
            this.field4010 = new short[arg0.field4224.length];
            class211.method1334(arg0.field4224, 0, this.field4010, 0, this.field4010.length);
        }
        if (arg0.field4230 != null) {
            this.field4012 = new short[arg0.field4230.length];
            class211.method1334(arg0.field4230, 0, this.field4012, 0, this.field4012.length);
        }
    }
}
