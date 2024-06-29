import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class579 extends class152 implements class212 {

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field8194;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "Lju;")
    public static class137 field8197 = new class137(13, 7);

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lhk;ILjaclib/memory/Buffer;IZ)V", line = 3)
    public class579(class111 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8194 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([BIII)V", line = 12)
    public final void method1493(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -13172) {
            field8197 = null;
        }
        ++field8192;
        this.method1197(arg2, arg0, 0);
        this.field8194 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I", line = 24)
    public final int method1494(byte arg0) {
        ++field8198;
        return arg0 > -61 ? -12 : super.field2504;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lhk;I[BIZ)V", line = 35)
    public class579(class111 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8194 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 43)
    public static void method3333(int arg0) {
        field8197 = null;
        int var1 = 103 % ((arg0 - -69) / 44);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 52)
    public final int method1491(byte arg0) {
        ++field8190;
        int var2 = 21 % ((arg0 - -10) / 48);
        return this.field8194;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)J", line = 66)
    public final long method1492(byte arg0) {
        if (arg0 != 124) {
            return 2L;
        } else {
            ++field8193;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILgj;)Ljf;", line = 78)
    public static final class229 method3334(int arg0, int arg1, int arg2, class662 arg3) {
        ++field8191;
        if (arg2 > -19) {
            return null;
        } else {
            class93 var4 = new class93(arg3.method3732(arg1, 8906, arg0));
            class229 var5 = new class229(arg1, var4.method752(0), var4.method752(0), var4.method773(3), var4.method773(3), ~var4.method793((byte) 49) == -2, var4.method793((byte) 77), var4.method793((byte) 90));
            int var6 = var4.method793((byte) 6);
            for (int var7 = 0; var7 < var6; ++var7) {
                var5.field3339.method3594((byte) -65, new class35(var4.method793((byte) 89), var4.method763(-12), var4.method763(80), var4.method763(83), var4.method763(122), var4.method763(10), var4.method763(-77), var4.method763(119), var4.method763(-45)));
            }
            var5.method1557((byte) -123);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Luv;II)V", line = 106)
    public static final void method3335(class385 arg0, int arg1, int arg2) {
        if (arg2 < 110) {
            method3335((class385) null, -89, -23);
        }
        if (arg0.field5214 != null) {
            int var3 = arg0.field5214[arg1 + 1];
            if (arg0.field5230 != var3) {
                arg0.field5270 = 0;
                arg0.field5251 = 0;
                arg0.field5305 = arg0.field5307;
                arg0.field5242 = 1;
                arg0.field5238 = 0;
                arg0.field5230 = var3;
                if (~arg0.field5230 != 0) {
                    class189.method1394(arg0, 256, class108.field1696.method1279((byte) 92, arg0.field5230), arg0.field5270);
                }
            }
        }
        ++field8195;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 136)
    public final void method177(int arg0) {
        super.field2494.method941(-28678, this);
        ++field8196;
        if (arg0 != -22194) {
            method3334(-105, -121, -37, (class662) null);
        }
    }
}
