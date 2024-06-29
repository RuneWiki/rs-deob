import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class717 extends class71 {

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public int field9990 = -1;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Z")
    public boolean field9991 = false;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Lgw;")
    public static class690 field9986 = new class690(50);

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public int field9982;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public int field9985;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public int field9987;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public int field9988;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public int field9989;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static final void method4020(int arg0) {
        int var1 = 0;
        if (arg0 > -100) {
            return;
        }
        while (class262.field3837 > var1) {
            int var2 = class446.field6192[var1];
            class234 var3 = (class234) class372.field5245.method812(104, (long) var2);
            if (var3 != null) {
                class679 var4 = var3.field3471;
                class714.method4012(var4.field9436.field1656, var4, 12309);
            }
            var1++;
        }
        field9983++;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method4021(int arg0) {
        field9986 = null;
        if (arg0 != 0) {
            field9984 = 62;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
    public class717(int arg0) {
        this.field9990 = arg0;
    }
}
