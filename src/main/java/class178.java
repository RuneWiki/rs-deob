import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class178 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field3021 = -1;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lc;")
    public static class331 field3018 = new class331();

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3026 = -1;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lpb;")
    public class88 field3024;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[I")
    public int[] field3025;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field3017;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 4)
    public static void method1371(byte arg0) {
        if (arg0 == 67) {
            field3018 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method1372(byte arg0, int arg1) {
        if (arg0 < 105) {
            field3026 = 90;
        }
        field3020++;
        class4.field56.method469(-11815, arg1);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 42)
    public static final void method1373(byte arg0) {
        class253.field4069.method470(12);
        if (arg0 != -68) {
            method1373((byte) 57);
        }
        field3019++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lcg;ILcg;Lcg;)V", line = 68)
    public static final void method1374(class49 arg0, int arg1, class49 arg2, class49 arg3) {
        class185.field3142 = arg0;
        class97.field1584 = arg2;
        field3023++;
        class348.field5542 = arg3;
        if (arg1 < 74) {
            field3022 = 100;
        }
    }
}
