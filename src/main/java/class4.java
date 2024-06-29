import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field28 = -1;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "J")
    public static long field36 = 0L;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lde;")
    public class4 field35;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lde;")
    public class4 field38;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    public static boolean field31;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Llk;")
    public static final class188 method17(int arg0, int arg1) {
        field29++;
        class188 var2 = (class188) class251.field3923.method950((long) arg1, (byte) -45);
        if (arg0 != 17887) {
            field31 = true;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field283.method2050(85, 16, arg1);
        class188 var4 = new class188();
        if (var3 != null) {
            var4.method1191((byte) -116, new class215(var3));
        }
        class251.field3923.method942((long) arg1, (byte) 59, var4);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)I")
    public static final int method18(int arg0, byte arg1) {
        field30++;
        if (arg1 <= 27) {
            return 19;
        } else if (arg0 < 0) {
            return 0;
        } else {
            class205 var2 = (class205) class278.field4412.method1453(true, (long) arg0);
            if (var2 == null) {
                return class277.method1798((byte) -40, arg0).field208;
            }
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field3069.length; var4++) {
                if (var2.field3069[var4] == -1) {
                    var3++;
                }
            }
            return var3 + class277.method1798((byte) -40, arg0).field208 - var2.field3069.length;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static final void method19(boolean arg0) {
        if (arg0) {
            field33++;
            class15.field267.method948((byte) 58);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
    public final void method20(boolean arg0) {
        field34++;
        if (this.field35 == null) {
            return;
        }
        this.field35.field38 = this.field38;
        this.field38.field35 = this.field35;
        this.field38 = null;
        if (arg0) {
            field36 = -71L;
        }
        this.field35 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)I")
    public static final int method21(int arg0, int arg1, byte arg2) {
        field37++;
        if (arg2 != 11) {
            method19(true);
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg0--;
            arg1 >>>= 0x1;
        }
        return var3;
    }
}
