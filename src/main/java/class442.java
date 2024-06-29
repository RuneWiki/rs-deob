import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class442 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public int field6611;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lvj;")
    private class303 field6616;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
    public static int[] field6612 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lln;Z)V", line = 3)
    public static final void method2650(class256 arg0, boolean arg1) {
        field6613++;
        class69 var2 = (class69) class284.field4051.method171((byte) 74, (long) arg0.field7669);
        if (var2 == null) {
            class228.method1490(arg0.field6232, 0, (byte) 117, null, arg0.field7694[0], arg0, null, arg0.field7692[0]);
        } else {
            var2.method566(31106);
        }
        if (arg1) {
            method2652(false, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lkl;", line = 23)
    public static final class54 method2651(int arg0, int arg1, int arg2) {
        field6615++;
        if (arg2 != -13208) {
            return null;
        }
        class54 var3 = (class54) class201.field2939.method171((byte) 117, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class54(arg1, arg0);
            class201.field2939.method166(var3, var3.field4904, -73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        field6614++;
        this.field6616.method1977(this.field6611, (byte) -9);
        super.finalize();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)V", line = 60)
    public static final void method2652(boolean arg0, byte arg1) {
        for (class69 var2 = (class69) class110.field1872.method2427(arg1 + 15); var2 != null; var2 = (class69) class110.field1872.method2422(-126)) {
            if (var2.field1181 != null) {
                class45.field837.method2035(var2.field1181);
                var2.field1181 = null;
            }
            if (var2.field1186 != null) {
                class45.field837.method2035(var2.field1186);
                var2.field1186 = null;
            }
            var2.method2090(arg1 - 110);
        }
        field6617++;
        if (arg0) {
            for (class69 var3 = (class69) class510.field7530.method2427(126); var3 != null; var3 = (class69) class510.field7530.method2422(arg1 - 182)) {
                if (var3.field1181 != null) {
                    class45.field837.method2035(var3.field1181);
                    var3.field1181 = null;
                }
                var3.method2090(-1);
            }
            for (class69 var4 = (class69) class284.field4051.method160((byte) -20); var4 != null; var4 = (class69) class284.field4051.method163(124)) {
                if (var4.field1181 != null) {
                    class45.field837.method2035(var4.field1181);
                    var4.field1181 = null;
                }
                var4.method2090(-1);
            }
        }
        if (arg1 != 109) {
            method2651(25, 70, -82);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 125)
    public static void method2653(int arg0) {
        field6612 = null;
        if (arg0 != 2) {
            field6612 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lvj;II)V", line = 136)
    public class442(class303 arg0, int arg1, int arg2) {
        this.field6611 = arg2;
        this.field6616 = arg0;
    }
}
