import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field241 = -1;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public static int[] field239 = new int[2048];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lng;")
    public class141 field235;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    public int[] field236;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field233;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)Lmg;", line = 4)
    public static final class61 method123(String arg0, int arg1) {
        field238++;
        for (class61 var2 = (class61) class211.field3208.method1109(-96); var2 != null; var2 = (class61) class211.field3208.method1115((byte) 101)) {
            if (var2.field814.equals(arg0)) {
                return var2;
            }
        }
        if (arg1 == -1) {
            return null;
        } else {
            return (class61) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Laa;", line = 29)
    public static final class204 method124(int arg0, byte arg1) {
        class204 var2 = (class204) class192.field2875.method2180((long) arg0, (byte) 31);
        field234++;
        if (arg1 < 123) {
            field239 = (int[]) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class81.field1149.method1441(arg0, (byte) -44, 3);
        class204 var4 = new class204();
        if (var3 != null) {
            var4.method1403((byte) 57, new class263(var3));
        }
        class192.field2875.method2175((long) arg0, var4, -115);
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 54)
    public static void method125(int arg0) {
        if (arg0 <= 4) {
            method123((String) null, 91);
        }
        field239 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 78)
    public static final void method126(boolean arg0) {
        if (arg0) {
            class204.method1397(-80, 0, 0);
            field240++;
        }
    }
}
