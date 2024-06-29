import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class135 extends class115 {

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Lud;")
    private static class279 field2454 = class130.method1024(" is already on your friend list)3", 255);

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field2455 = 500;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
    public static int[] field2456 = new int[5];

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Lud;")
    public static class279 field2457 = field2454;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lud;")
    public static class279 field2462 = class130.method1024("clignotant2:", 255);

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field2466 = 0;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field2458 = -1;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lcd;")
    private class69 field2467;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I", line = 20)
    public final int method1055(int arg0, int arg1, int arg2) {
        field2465++;
        if (this.field2467 == null) {
            return arg2;
        }
        if (arg0 != 0) {
            this.method1055(116, 73, 77);
        }
        class91 var4 = (class91) this.field2467.method610((long) arg1, -1);
        return var4 == null ? arg2 : var4.field1714;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lvh;IB)V", line = 57)
    private final void method1056(class53 arg0, int arg1, byte arg2) {
        if (arg2 != 52) {
            method1059(-68, -61, -119);
        }
        field2461++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method483(-120);
        if (this.field2467 == null) {
            int var5 = class189.method1440(arg2 ^ 0x35, var4);
            this.field2467 = new class69(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method483(-118) == 1;
            int var8 = arg0.method461((byte) 124);
            class314 var9;
            if (var7) {
                var9 = new class272(arg0.method467((byte) -16));
            } else {
                var9 = new class91(arg0.method453(arg2 ^ 0x35));
            }
            this.field2467.method612(false, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Z", line = 102)
    public static final boolean method1057(byte arg0, int arg1) {
        field2460++;
        if (arg0 == -80) {
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lvh;B)V", line = 116)
    public final void method1058(class53 arg0, byte arg1) {
        int var3 = -93 / ((2 - arg1) / 37);
        while (true) {
            int var4 = arg0.method483(-108);
            if (var4 == 0) {
                field2464++;
                return;
            }
            this.method1056(arg0, var4, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)Lql;", line = 135)
    public static final class17 method1059(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3439;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 146)
    public static void method1060(int arg0) {
        field2456 = null;
        field2457 = null;
        field2462 = null;
        if (arg0 != 90) {
            field2456 = (int[]) null;
        }
        field2454 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILud;I)Lud;", line = 164)
    public final class279 method1061(int arg0, class279 arg1, int arg2) {
        field2459++;
        if (this.field2467 == null) {
            return arg1;
        } else if (arg0 == 500) {
            class272 var4 = (class272) this.field2467.method610((long) arg2, arg0 ^ 0xFFFFFE0B);
            return var4 == null ? arg1 : var4.field4843;
        } else {
            return (class279) null;
        }
    }
}
