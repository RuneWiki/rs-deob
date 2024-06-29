import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class123 extends class60 {

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    public static int[] field1998 = new int[2500];

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "J")
    public long field2003;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lag;")
    public class123 field2000;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lag;")
    public class123 field2001;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 4)
    public static void method980(int arg0) {
        field1998 = null;
        if (arg0 <= 42) {
            field1998 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 18)
    public final void method981(int arg0) {
        if (arg0 >= -113) {
            this.field2001 = (class123) null;
        }
        field2002++;
        if (this.field2001 != null) {
            this.field2001.field2000 = this.field2000;
            this.field2000.field2001 = this.field2001;
            this.field2000 = null;
            this.field2001 = null;
        }
    }
}
