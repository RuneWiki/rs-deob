import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class283 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public int field4004 = 0;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "[Ljava/lang/Object;")
    public Object[] field4007 = new Object[5000];

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "[B")
    public byte[] field4006 = new byte[5000];

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public int field4011 = 0;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public volatile int field4013 = 0;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public volatile int field4010 = 0;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "[I")
    public static int[] field4012 = new int[8];

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILfba;)V")
    public abstract void method1410(int arg0, class24 arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)V")
    public abstract void method1408(int arg0, byte arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLd;IZ)V")
    public abstract void method1411(byte arg0, class139 arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZILbd;I)V")
    public static final void method1756(int arg0, boolean arg1, int arg2, class58 arg3, int arg4) {
        field4008++;
        if (!arg1) {
            method1756(29, true, -108, null, -16);
        }
        for (class597 var5 = (class597) class6.field182.method3257(-110); var5 != null; var5 = (class597) class6.field182.method3263((byte) -79)) {
            if (var5.field7893 == arg0 && arg2 << 9 == var5.field7907 && (arg4 << 9) == var5.field7918 && var5.field7896.field824 == arg3.field824) {
                if (var5.field7914 != null) {
                    class639.field8604.method164(var5.field7914);
                    var5.field7914 = null;
                }
                if (var5.field7919 != null) {
                    class639.field8604.method164(var5.field7919);
                    var5.field7919 = null;
                }
                var5.method2797(-104);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lfba;B)V")
    public abstract void method1406(class24 arg0, byte arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
    public abstract void method1400(boolean arg0);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
    public abstract void method1407(boolean arg0);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)V")
    public abstract void method1409(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4012 = null;
        if (arg0 > -92) {
            field4005 = -65;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lfba;I)V")
    public abstract void method1405(class24 arg0, int arg1);
}
