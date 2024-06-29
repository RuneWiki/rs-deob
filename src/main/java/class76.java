import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class76 {

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
    public int[] field1067;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "[I")
    public int[] field1069;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "J")
    public static long field1066;

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
    public class76(int arg0) {
        this.field1068 = arg0;
        this.field1067 = new int[this.field1068];
        this.field1069 = new int[this.field1068];
    }
}
