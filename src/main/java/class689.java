import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class689 extends class329 {

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "J")
    public long field9769;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lfh;")
    public static class266 field9767 = new class266(5, 4);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lsa;")
    public static class595 field9771;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lpl;")
    public static class612 field9770;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lpl;")
    public static class612 field9772;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 4)
    public static void method3881(int arg0) {
        field9770 = null;
        if (arg0 == 2650) {
            field9772 = null;
            field9771 = null;
            field9767 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 18)
    public static final void method3882(boolean arg0, String arg1, int arg2) {
        field9768++;
        if (arg1 == null) {
            return;
        }
        if (class238.field2980 >= 100) {
            class250.method1468(4, false, class83.field1147.method476((byte) 116, class250.field3068));
            return;
        }
        int var3 = 49 / ((-arg2 - 55) / 37);
        String var4 = class158.method900(arg1, true);
        if (var4 == null) {
            return;
        }
        for (int var5 = 0; var5 < class238.field2980; var5++) {
            String var10 = class158.method900(class680.field9564[var5], true);
            if (var10 != null && var10.equals(var4)) {
                class250.method1468(4, false, arg1 + class83.field1148.method476((byte) 113, class250.field3068));
                return;
            }
            if (class215.field2669[var5] != null) {
                String var11 = class158.method900(class215.field2669[var5], true);
                if (var11 != null && var11.equals(var4)) {
                    class250.method1468(4, false, arg1 + class83.field1148.method476((byte) 73, class250.field3068));
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < class66.field904; var6++) {
            String var8 = class158.method900(class50.field708[var6], true);
            if (var8 != null && var8.equals(var4)) {
                class250.method1468(4, false, class83.field1153.method476((byte) 94, class250.field3068) + arg1 + class83.field1154.method476((byte) 74, class250.field3068));
                return;
            }
            if (class531.field7172[var6] != null) {
                String var9 = class158.method900(class531.field7172[var6], true);
                if (var9 != null && var9.equals(var4)) {
                    class250.method1468(4, false, class83.field1153.method476((byte) 87, class250.field3068) + arg1 + class83.field1154.method476((byte) 77, class250.field3068));
                    return;
                }
            }
        }
        if (class158.method900(class376.field4748.field7017, true).equals(var4)) {
            class250.method1468(4, false, class83.field1150.method476((byte) -87, class250.field3068));
            return;
        }
        class277.field3473++;
        class704 var7 = class314.method1820(class697.field9864, class400.field5014, (byte) 112);
        var7.field9929.method3509(class109.method611(arg1, (byte) 2) + 1, (byte) -118);
        var7.field9929.method3489(arg1, -19);
        var7.field9929.method3509(arg0 ? 1 : 0, (byte) -113);
        class122.method654(var7, (byte) -36);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 116)
    public class689() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(J)V", line = 120)
    public class689(long arg0) {
        this.field9769 = arg0;
    }
}
