import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class317 extends class184 {

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Lqe;")
    public static class469 field4517 = new class469(24, 6);

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
    public class317() {
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Lcq;")
    public static final class468 method2011(int arg0) {
        field4515++;
        class468 var1 = class85.method693(64);
        var1.field6843 = null;
        var1.field6841 = arg0;
        var1.field6839 = new class304(5000);
        return var1;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BI)Z")
    public static final boolean method2012(byte arg0, int arg1) {
        field4519++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            if (arg1 != 7911) {
                method2015(-22, -105, 91, -122, -58);
            }
            return var2 < 128 || var2 >= 160 || class382.field5762[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V")
    public static void method2013(int arg0) {
        field4517 = null;
        int var1 = -22 % ((arg0 - 55) / 34);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2014(byte arg0, String arg1) {
        System.exit(1);
        if (arg0 > 38) {
            field4520++;
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(I)V")
    public class317(int arg0) {
        this.field4518 = arg0;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V")
    public static final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -14905) {
            return;
        }
        field4516++;
        class150 var5 = class676.method3885(1000, 4, arg1);
        var5.method1116(arg0 + 14933);
        var5.field2345 = arg4;
        var5.field2342 = arg3;
        var5.field2346 = arg2;
    }
}
