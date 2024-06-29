import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class305 extends class76 {

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Luf;")
    public static class310 field4182 = new class310(35, 4);

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Z")
    public boolean field4183;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
    public static boolean field4187;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1730(int arg0, int arg1) {
        field4179++;
        int var2 = arg0 >>> 1;
        if (arg1 != 3299) {
            return 24;
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 24)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (!arg6) {
            this.field4185 = 64;
        }
        field4175++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IFIIIIIZ)[I", line = 35)
    public static final int[] method1731(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4174++;
        if (arg5 > -36) {
            return null;
        }
        int[] var8 = new int[arg0];
        class510 var9 = new class510();
        var9.field7490 = arg4;
        var9.field7486 = arg3;
        var9.field7485 = (int) (arg1 * 4096.0F);
        var9.field7487 = arg6;
        var9.field7484 = arg7;
        var9.field7482 = arg2;
        var9.method207(2);
        class520.method3060(1, arg0, -96);
        var9.method2998(0, var8, 3746);
        return var8;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 62)
    public static final void method1732(byte arg0) {
        field4177++;
        class356.method1978((byte) 19, class402.field5591);
        class425.field6210++;
        if (arg0 >= 28) {
            class244.field3395.method2084(class448.method2641((byte) 85), false);
            class244.field3395.method2070(81954016, class177.field2513);
            class244.field3395.method2070(81954016, class351.field4795);
            class244.field3395.method2084(class437.field6374.field4280, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Z", line = 78)
    public final boolean method399(boolean arg0) {
        if (arg0) {
            method1733((byte) -37);
        }
        field4176++;
        return false;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V", line = 95)
    public static void method1733(byte arg0) {
        if (arg0 <= -48) {
            field4182 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V", line = 114)
    public final void method398(int arg0) {
        field4180++;
        if (arg0 < 74) {
            field4187 = true;
        }
        throw new IllegalStateException();
    }
}
