import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class174 extends class300 {

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    private int field2731 = 0;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    private int field2735 = 4096;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "Lol;")
    public static class220 field2737 = new class220();

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Lqk;")
    public static final class57 method1241(int arg0, int arg1) {
        class57 var2 = (class57) client.field3874.method1517((long) arg1, (byte) -116);
        ++field2728;
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 88 / ((-74 - arg0) / 47);
            byte[] var4 = class240.field3852.method501(-2, class22.method121(arg1, 125), class49.method302(arg1, (byte) 110));
            class57 var5 = new class57();
            var5.field827 = arg1;
            if (var4 != null) {
                var5.method369(-29146, new class170(var4));
            }
            var5.method368(21);
            client.field3874.method1518(var5, (long) arg1, (byte) 75);
            return var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field2734;
        if (arg1 < -43) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field2735 = arg0.method1186((byte) -105);
                }
            } else {
                this.field2731 = arg0.method1186((byte) -80);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            field2727 = -13;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        ++field2729;
        if (super.field4797.field470) {
            int[] var4 = this.method2018(0, -1, arg0);
            for (int var5 = 0; class180.field2826 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field2731 <= var6 && ~var6 >= ~this.field2735 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILfe;)Ljava/lang/String;")
    public static final String method1242(int arg0, class231 arg1) {
        ++field2730;
        if (client.method1698(arg1).method159(73) == 0) {
            return null;
        } else if (arg0 <= 84) {
            return null;
        } else if (arg1.field3581 != null && arg1.field3581.trim().length() != 0) {
            return arg1.field3581;
        } else {
            return class107.field1563 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        if (arg0 != 97) {
            method1243((byte) 52);
        }
        field2737 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class174() {
        super(1, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIIZZ)V")
    public static final void method1244(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        ++field2736;
        class86.method584(0, arg2, 0, arg1, arg4, arg3, class68.field1021.length - 1);
        if (arg0 != -93) {
            method1242(6, (class231) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IBI)I")
    public static final int method1245(int arg0, byte arg1, int arg2) {
        ++field2733;
        if (arg1 < 12) {
            return 65;
        } else {
            int var3 = arg2 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg2 + var3;
        }
    }
}
