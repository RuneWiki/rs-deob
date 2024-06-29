import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class265 extends class117 {

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3686 = new String[100];

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lcs;")
    public static class351 field3690 = new class351(6, 2);

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Lpc;")
    public static class141 field3697;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/lang/String;")
    public String field3688;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public static void method1670(int arg0) {
        field3690 = null;
        if (arg0 > -105) {
            field3697 = null;
        }
        field3686 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILwj;Lwj;ZII)I")
    public static final int method1671(boolean arg0, int arg1, class334 arg2, class334 arg3, boolean arg4, int arg5, int arg6) {
        int var7 = 117 % ((-44 - arg1) / 55);
        ++field3696;
        int var8 = class294.method1817(arg3, arg2, 1000, arg0, arg5);
        if (~var8 != -1) {
            return arg0 ? -var8 : var8;
        } else if (~arg6 == 0) {
            return 0;
        } else {
            int var9 = class294.method1817(arg3, arg2, 1000, arg4, arg6);
            return !arg4 ? var9 : -var9;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I")
    public final int method1672(boolean arg0) {
        if (arg0) {
            return -48;
        } else {
            ++field3691;
            return (int) (super.field2608 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)J")
    public final long method1673(int arg0) {
        ++field3695;
        if (arg0 != 0) {
            this.field3689 = -60;
        }
        return super.field1649 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lms;BZ)V")
    public static final void method1674(class363 arg0, byte arg1, boolean arg2) {
        if (arg1 != 28) {
            method1674((class363) null, (byte) -111, false);
        }
        ++field3694;
        int var3 = ~arg0.field5116 == -1 ? arg0.field5101 : arg0.field5116;
        int var4 = arg0.field5114 == 0 ? arg0.field5200 : arg0.field5114;
        class389.method2318(class39.field666[arg0.field5096 >> 16], arg0.field5096, arg2, (byte) 123, var3, var4);
        if (arg0.field5113 != null) {
            class389.method2318(arg0.field5113, arg0.field5096, arg2, (byte) -108, var3, var4);
        }
        class465 var5 = (class465) class231.field3258.method2614((long) arg0.field5096, arg1 + 77);
        if (var5 != null) {
            class105.method668(true, var3, arg2, var5.field6527, var4);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    public final void method1675(boolean arg0) {
        super.field1649 |= Long.MIN_VALUE;
        ++field3699;
        if (~this.method1673(0) == -1L) {
            class393.field5521.method1584(115, this);
        }
        if (arg0) {
            this.method1673(106);
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)I")
    public final int method1676(int arg0) {
        if (arg0 != -19941) {
            field3697 = null;
        }
        ++field3693;
        return (int) super.field2608;
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V")
    public final void method1677(int arg0) {
        super.field1649 = super.field1649 & Long.MIN_VALUE | class193.method1237(-9581) - -500L;
        ++field3687;
        class238.field3356.method1584(66, this);
        if (arg0 != 21748) {
            field3686 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V")
    public class265(int arg0, int arg1) {
        super.field2608 = (long) arg0 << 32 | (long) arg1;
    }
}
