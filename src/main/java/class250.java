import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class250 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lic;")
    public static class284 field4232 = new class284();

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[Ll;")
    public static class245[] field4234 = new class245[8];

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "F")
    public static float field4237 = 0.0F;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
    public static int[] field4238 = new int[25];

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "J")
    public static long field4239 = 0L;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lmd;")
    public static class273 field4236;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public abstract void method1650(int arg0, int arg1);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public abstract void method1651(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        field4227++;
        class248.field4139.method97(arg0 ^ 0x46);
        class279.field4629.method97(121);
        if (arg0 != 0) {
            field4233 = -122;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4236 = null;
        field4234 = null;
        field4238 = null;
        field4232 = null;
        if (arg0 > -108) {
            method1826((class208) null, -43, -43, (class208) null, true, true, -21);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lsj;IILsj;ZZI)I")
    public static final int method1826(class208 arg0, int arg1, int arg2, class208 arg3, boolean arg4, boolean arg5, int arg6) {
        field4228++;
        int var7 = class6.method44(arg4, arg3, arg1, arg0, (byte) -91);
        if (~var7 != arg6) {
            return arg4 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class6.method44(arg5, arg3, arg2, arg0, (byte) -91);
            return arg5 ? -var8 : var8;
        }
    }
}
