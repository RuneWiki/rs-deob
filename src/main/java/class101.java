import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class101 extends class414 {

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "Lgd;")
    private class696 field1347;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "Lbt;")
    public static class437 field1342 = new class437(8, 2);

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "Z")
    public static boolean field1346 = false;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "Llha;")
    private class445 field1344;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Llha;", line = 12)
    public final class445 method579(int arg0) {
        if (arg0 >= -104) {
            this.field1340 = 79;
        }
        field1349++;
        if (this.field1344 == null) {
            class590.field7486[2] = this.field1341;
            class284 var2 = this.field1347.field7199;
            class590.field7486[0] = this.field1348;
            class590.field7486[3] = this.field1343;
            class590.field7486[1] = this.field1350;
            class590.field7486[4] = this.field1340;
            class590.field7486[5] = this.field1345;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1733(-1852, class590.field7486[var5])) {
                    return null;
                }
                class191 var7 = var2.method1732((byte) -32, class590.field7486[var5]);
                int var8 = var7.field2673 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field2671 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class141.field1852[var6] = var2.method1737(class590.field7486[var6], var4, 1.0F, false, var4, (byte) 45);
            }
            this.field1344 = this.field1347.method1182(class141.field1852, var4, var3, -21313);
        }
        return this.field1344;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V", line = 73)
    public static void method580(boolean arg0) {
        field1342 = null;
        if (!arg0) {
            field1342 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lgd;IIIIII)V", line = 90)
    public class101(class696 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1345 = arg6;
        this.field1341 = arg3;
        this.field1347 = arg0;
        this.field1348 = arg1;
        this.field1343 = arg4;
        this.field1340 = arg5;
        this.field1350 = arg2;
    }
}
