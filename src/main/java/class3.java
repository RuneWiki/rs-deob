import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class3 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Le;")
    public static class191 field20 = class54.method368(":duelstake:", 2047);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lng;")
    public static class121 field19;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lng;")
    public static class121 field24;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Leg;")
    public static class33 field23;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field19 = null;
        field24 = null;
        field20 = null;
        field23 = null;
        if (arg0 >= -91) {
            method9(-78);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method9(int arg0) {
        int var1 = 0;
        if (arg0 != 1) {
            return;
        }
        while (class90.field1460 > var1) {
            int var2 = class18.field247[var1];
            class76 var3 = class245.field4357[var2];
            int var4 = class107.field1776.method1580(-98);
            if ((var4 & 0x1) != 0) {
                var4 += class107.field1776.method1580(-119) << 8;
            }
            class236.method1664(var2, var3, 32347, var4);
            var1++;
        }
        field26++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method10(int arg0, int arg1) {
        if (arg1 != 30554) {
            return;
        }
        field27++;
        class235.field4191.method990(95, arg0);
        class157.field2679.method990(28, arg0);
        class8.field76.method990(49, arg0);
        class82.field1381.method990(78, arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILng;II)[Lwa;")
    public static final class226[] method11(int arg0, class121 arg1, int arg2, int arg3) {
        field25++;
        if (class121.method796(true, arg0, arg3, arg1)) {
            if (arg2 < 31) {
                method11(29, (class121) null, 42, 60);
            }
            return class262.method1800((byte) 119);
        } else {
            return null;
        }
    }
}
