import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class686 {

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method3839(int arg0, int[] arg1) {
        field9363++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class495.field6889;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class777 var5 = class500.field7002.method1915(arg1[var4], arg0 ^ 0x23);
            if (var5.field10724 != -1) {
                class312 var6 = (class312) class710.field9963.method1684((long) var5.field10724, arg0 - 359);
                if (var6 == null) {
                    class600 var7 = class600.method3429(class208.field2470, var5.field10724, 0);
                    if (var7 != null) {
                        var6 = class363.field4526.method640(var7, true);
                        class710.field9963.method1686(-25638, (long) var5.field10724, var6);
                    }
                }
                if (var6 != null) {
                    class256.field3026[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!kja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9362++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)V")
    public static final void method3840(byte arg0) {
        field9364++;
        if (arg0 != -126) {
            method3839(18, null);
        }
        class617.field8304 = 0;
        class384.field4903 = 0;
        class163.field1994 = 0;
        class491.field6824 = 0;
    }
}
