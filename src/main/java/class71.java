import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class71 extends class90 {

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lam;")
    public class493 field960;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Lgi;")
    public class453 field956;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field953 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "Lfc;")
    public static class239 field959;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
    public final void method616(int arg0) {
        this.field962 = this.field960.field6939;
        field955++;
        this.field951 = this.field960.field6934;
        this.field952 = this.field960.field6933;
        if (this.field960.field6945 != null) {
            this.field960.field6945.method483(this.field956.field6430, this.field956.field6429, this.field956.field6438, class166.field2350);
        }
        this.field958 = class166.field2350[arg0];
        this.field961 = class166.field2350[2];
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
    public static void method617(int arg0) {
        field959 = null;
        int var1 = 78 % ((arg0 - 55) / 38);
        field953 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    public static final int method618(int arg0, int arg1) {
        return class111.field1568 == null ? 0 : class111.field1568[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lbm;")
    public static final class204 method619(int arg0, byte arg1) {
        field954++;
        class204[] var2 = class70.method612(-12483);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class204 var4 = var2[var3];
            if (var4.field3103 == arg0) {
                return var4;
            }
        }
        if (arg1 != 67) {
            field953 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lam;Lhn;)V")
    public class71(class493 arg0, class59 arg1) {
        this.field960 = arg0;
        this.field956 = class25.method217(true, arg0.field6943);
        this.method616(0);
    }
}
