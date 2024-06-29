import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class1 {

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lfa;")
    public class564 field7 = new class564();

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
    public boolean field8 = false;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public static boolean field2 = false;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "S")
    public static short field6 = 32767;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4 = "";

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLgh;)V", line = 4)
    public final void method1(boolean arg0, class48 arg1) {
        field3++;
        if (arg0) {
            this.method3(-100);
        }
        class668 var3 = arg1.field792;
        boolean var4 = true;
        class385[] var5 = arg1.field795;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field5768) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field8) {
            for (class48 var7 = (class48) this.field7.method3272(-121); var7 != null; var7 = (class48) this.field7.method3274(false)) {
                if (var7.field792 == var3) {
                    var7.method3610(-25057);
                    class59.method577(var7, (byte) -82);
                }
            }
        }
        for (class48 var8 = (class48) this.field7.method3272(-114); var8 != null; var8 = (class48) this.field7.method3274(false)) {
            if (var8.field792.field9480 <= var3.field9480) {
                class529.method3138(arg1, (byte) 120, var8);
                return;
            }
        }
        this.field7.method3266(arg1, !arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V", line = 75)
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        field5++;
        class118 var4 = class86.method755(true, arg0, arg1);
        var4.method933((byte) 103);
        var4.field1821 = arg2;
        var4.field1811 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 88)
    public final void method3(int arg0) {
        while (true) {
            class48 var2 = (class48) this.field7.method3271((byte) -34);
            if (var2 == null) {
                if (arg0 != 32767) {
                    method4((byte) 50);
                }
                field1++;
                return;
            }
            var2.method3610(arg0 ^ 0xFFFFE1E0);
            class59.method577(var2, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 112)
    public static void method4(byte arg0) {
        if (arg0 > 4) {
            field4 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Z)V", line = 141)
    public class1(boolean arg0) {
        this.field8 = arg0;
    }
}
