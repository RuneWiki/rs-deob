import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class327 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    private int field5348 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lil;")
    private class4 field5349;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lfh;")
    public static class313 field5347 = new class313(new byte[5000]);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5351 = "green:";

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field5353 = -1;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "[I")
    public static int[] field5354 = new int[25];

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lak;")
    private class159 field5355;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Lak;", line = 11)
    public final class159 method2331(byte arg0) {
        field5350++;
        if (arg0 < 104) {
            this.method2332(-106);
        }
        if (this.field5348 > 0 && this.field5349.field52[this.field5348 - 1] != this.field5355) {
            class159 var2 = this.field5355;
            this.field5355 = var2.field2551;
            return var2;
        }
        class159 var3;
        do {
            if (this.field5348 >= this.field5349.field51) {
                return null;
            }
            var3 = this.field5349.field52[this.field5348++].field2551;
        } while (this.field5349.field52[this.field5348 - 1] == var3);
        this.field5355 = var3.field2551;
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lak;", line = 44)
    public final class159 method2332(int arg0) {
        field5352++;
        this.field5348 = arg0;
        return this.method2331((byte) 112);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lil;)V", line = 86)
    public class327(class4 arg0) {
        this.field5349 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 59)
    public static void method2333(int arg0) {
        field5354 = null;
        field5351 = null;
        field5347 = null;
        if (arg0 != 25) {
            method2333(-82);
        }
    }
}
