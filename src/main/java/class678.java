import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class678 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field9442;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
    public int[] field9443;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    public int[] field9447;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field9440 = -1;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    public static boolean field9441 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lvl;")
    public static class15 field9438 = new class15(70, -1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
    public static final int method3820(int arg0, int arg1, int arg2) {
        field9444++;
        if (arg1 >= -75) {
            field9438 = null;
        }
        byte var3;
        if (arg0 > 20000) {
            var3 = 4;
            class358.method2208(-125);
        } else if (arg0 > 10000) {
            class337.method2110((byte) -127);
            var3 = 3;
        } else if (arg0 <= 5000) {
            var3 = 1;
            class124.method1072(true, -122);
        } else {
            class567.method3272(true);
            var3 = 2;
        }
        if (arg2 != class111.field1911.field6725.method3784((byte) 60)) {
            class111.field1911.method2823(true, class111.field1911.field6753, arg2);
            class624.method3517(false, 0, arg2);
        }
        class307.method1957(0);
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method3821(int arg0) {
        field9438 = null;
        int var1 = -10 / ((-arg0 - 8) / 41);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z")
    public static final boolean method3822(int arg0, int arg1, int arg2) {
        if (arg2 == 2048) {
            field9445++;
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;)V")
    public static final void method3823(String arg0, byte arg1, boolean arg2, String arg3) {
        class128.field2249 = arg2;
        class184.field2862 = arg3;
        field9439++;
        class550.field7473 = arg0;
        if (!class128.field2249 && (class184.field2862.equals("") || class550.field7473.equals(""))) {
            class95.method807((byte) -75, 3);
            return;
        }
        if (class328.field4463 != 1) {
            class437.field5942 = -1;
            class665.field9233 = 0;
        }
        class568.field8080 = false;
        class95.method807((byte) 98, -3);
        class517.field7034 = 1;
        class609.field8502 = 0;
        if (arg1 == -95) {
            class181.field2835 = 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lkka;Z)I")
    public static final int method3824(class329 arg0, boolean arg1) {
        field9446++;
        if (arg1) {
            method3821(52);
        }
        int var2 = arg0.method2078(2, 15455);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2078(5, 15455);
        } else if (var2 == 2) {
            var3 = arg0.method2078(8, 15455);
        } else {
            var3 = arg0.method2078(11, 15455);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
    public class678(int arg0) {
        this.field9442 = arg0;
        this.field9443 = new int[this.field9442];
        this.field9447 = new int[this.field9442];
    }
}
