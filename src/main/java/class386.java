import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class386 {

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lsb;")
    public static class266 field5661 = new class266(9, 8);

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field5665 = 0;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "[Ldq;")
    public static class650[] field5664;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "[[B")
    public static byte[][] field5663;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2385(long arg0, int arg1) {
        field5660++;
        class223.field3356.setTime(new Date(arg0));
        int var3 = class223.field3356.get(7);
        int var4 = class223.field3356.get(5);
        int var5 = class223.field3356.get(2);
        int var6 = class223.field3356.get(1);
        int var7 = class223.field3356.get(11);
        int var8 = class223.field3356.get(12);
        int var9 = class223.field3356.get(arg1);
        return class468.field6626[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class189.field3018[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method2386(int arg0) {
        field5664 = null;
        field5661 = null;
        field5663 = null;
        if (arg0 != 15561) {
            field5661 = null;
        }
    }
}
