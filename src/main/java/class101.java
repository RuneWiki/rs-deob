import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class101 extends class569 {

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lrga;")
    public static class280 field1363 = new class280(79, 8);

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Llo;")
    public class488 field1364;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[Lpba;")
    public class151[] field1361;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lr;III)Z", line = 6)
    public final boolean method574(class566 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.field1364 = null;
        }
        field1362++;
        if (this.field1361 != null) {
            for (int var5 = 0; var5 < this.field1361.length; var5++) {
                if (this.field1361[var5].method863(arg3, arg2) && this.field1364.method75(arg3, arg2, arg0, 9678)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 32)
    public static void method575(int arg0) {
        if (arg0 > -79) {
            method575(17);
        }
        field1363 = null;
    }
}
