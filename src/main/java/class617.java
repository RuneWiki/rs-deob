import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class617 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Ldr;")
    public static class675 field8369 = new class675(19, 3);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method3441(byte arg0) {
        int var1 = 98 / ((arg0 - 57) / 57);
        field8369 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
    public static final boolean method3442(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field8373 = -89;
        }
        field8371++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8370++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
    public static final String method3443(boolean arg0, int[] arg1) {
        field8372++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class394.field5027;
        int var4 = 0;
        if (arg0) {
            return null;
        }
        while (var4 < arg1.length) {
            class388 var5 = class434.field5475.method158(arg1[var4], 35);
            if (var5.field4980 != -1) {
                class468 var6 = (class468) class444.field5589.method1221((long) var5.field4980, true);
                if (var6 == null) {
                    class495 var7 = class495.method2695(class136.field1656, var5.field4980, 0);
                    if (var7 != null) {
                        var6 = class309.field3898.method402(var7, true);
                        class444.field5589.method1230((byte) 104, (long) var5.field4980, var6);
                    }
                }
                if (var6 != null) {
                    class306.field3871[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }
}
