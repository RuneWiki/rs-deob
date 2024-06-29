import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class741 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Llba;")
    public class223 field10209;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field10208 = 104;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 8)
    public void method428(boolean arg0) {
        if (!arg0) {
            this.method430(-2, true);
        }
        field10210++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 22)
    public void method431(int arg0) {
        if (arg0 == -1) {
            field10213++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 33)
    public void method427(int arg0) {
        if (arg0 != 0) {
            field10208 = 19;
        }
        field10207++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 43)
    public void method426(byte arg0) {
        field10215++;
        if (arg0 >= -91) {
            this.field10209 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Llba;)V", line = 52)
    public class741(class223 arg0) {
        this.field10209 = arg0;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 63)
    public void method424(int arg0) {
        if (arg0 > -3) {
            method4110(true, -45, null);
        }
        field10211++;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V", line = 78)
    public void method1950(byte arg0) {
        field10212++;
        if (arg0 <= 104) {
            this.method424(-123);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z", line = 88)
    public static final boolean method4109(int arg0, int arg1, int arg2) {
        if (arg1 < 1) {
            return true;
        } else {
            field10206++;
            return class571.method3358(256, arg2, arg0) || class590.method3454(arg2, -79, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 101)
    public static final void method4110(boolean arg0, int arg1, String arg2) {
        field10214++;
        if (arg2 == null) {
            return;
        }
        if (class302.field4404 >= 100) {
            class128.method876(4, (byte) 120, class712.field9892.method3999(class553.field7667, (byte) -99));
            return;
        }
        String var3 = class690.method3915(-4097, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class302.field4404; var4++) {
            String var9 = class690.method3915(-4097, class17.field100[var4]);
            if (var9 != null && var9.equals(var3)) {
                class128.method876(4, (byte) 122, arg2 + class712.field9893.method3999(class553.field7667, (byte) -68));
                return;
            }
            if (class554.field7679[var4] != null) {
                String var10 = class690.method3915(-4097, class554.field7679[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class128.method876(4, (byte) 124, arg2 + class712.field9893.method3999(class553.field7667, (byte) -66));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class688.field9600; var5++) {
            String var7 = class690.method3915(-4097, class396.field5622[var5]);
            if (var7 != null && var7.equals(var3)) {
                class128.method876(4, (byte) 111, class712.field9898.method3999(class553.field7667, (byte) -24) + arg2 + class712.field9899.method3999(class553.field7667, (byte) -104));
                return;
            }
            if (class715.field9932[var5] != null) {
                String var8 = class690.method3915(-4097, class715.field9932[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class128.method876(4, (byte) 120, class712.field9898.method3999(class553.field7667, (byte) -117) + arg2 + class712.field9899.method3999(class553.field7667, (byte) -84));
                    return;
                }
            }
        }
        if (class690.method3915(-4097, class724.field10031.field9965).equals(var3)) {
            class128.method876(4, (byte) 113, class712.field9895.method3999(class553.field7667, (byte) -47));
        } else if (arg1 > 24) {
            class672.field9441++;
            class116 var6 = class248.method1672(class84.field1023, class636.field8949, -20647);
            var6.field1575.method3005(255, class395.method2435(arg2, 1) + 1);
            var6.field1575.method3037(0, arg2);
            var6.field1575.method3005(255, arg0 ? 1 : 0);
            class443.method2655(0, var6);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
    public abstract void method430(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V")
    public abstract void method429(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILml;)V")
    public abstract void method433(int arg0, int arg1, class34 arg2);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
    public abstract void method432(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z")
    public abstract boolean method425(byte arg0);

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public abstract void method434(int arg0);
}
