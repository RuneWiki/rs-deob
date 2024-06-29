import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class175 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field2697 = -1;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field2705 = -1;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    public static int[] field2699 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    public int[] field2700;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method1249(int arg0) {
        class9.field153.method1169(true);
        field2706++;
        if (arg0 != -1) {
            field2699 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lbi;")
    public static final class95 method1250(int arg0, byte arg1) {
        field2702++;
        class95 var2 = (class95) class35.field606.method1173((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -42) {
            method1250(60, (byte) -91);
        }
        byte[] var3 = class170.field2571.method721((byte) -117, class135.method1003(arg0, 102), class255.method1727((byte) -81, arg0));
        class95 var4 = new class95();
        var4.field1512 = arg0;
        if (var3 != null) {
            var4.method744(true, new class31(var3));
        }
        var4.method739((byte) -94);
        class35.field606.method1167((byte) 109, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILha;I)V")
    public final void method1251(int arg0, class31 arg1, int arg2) {
        if (arg0 != 1) {
            this.method1251(-54, (class31) null, -18);
        }
        while (true) {
            int var4 = arg1.method265(-119);
            if (var4 == 0) {
                field2701++;
                return;
            }
            this.method1253((byte) -83, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method1252(byte arg0) {
        if (arg0 < 7) {
            method1252((byte) 99);
        }
        field2699 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIILha;)V")
    private final void method1253(byte arg0, int arg1, int arg2, class31 arg3) {
        field2703++;
        if (arg1 == 1) {
            this.field2697 = arg3.method260((byte) -67);
        } else if (arg1 == 2) {
            this.field2700 = new int[arg3.method265(-126)];
            for (int var5 = 0; var5 < this.field2700.length; var5++) {
                this.field2700[var5] = arg3.method260((byte) -67);
            }
        } else if (arg1 == 3) {
            this.field2705 = arg3.method265(-86);
        }
        int var6 = 96 % (arg0 / 54);
    }
}
