import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class411 extends class138 {

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    private int field5980;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    private int field5981;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Lge;")
    private class104 field5984;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    private int field5989;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    private int field5987;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "[I")
    private static int[] field5982 = new int[6];

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[[I")
    private static int[][] field5983 = new int[6][];

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "Lca;")
    private class414 field5988;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)Lca;", line = 13)
    public final class414 method1123(byte arg0) {
        if (arg0 != 11) {
            this.method1123((byte) -12);
        }
        if (this.field5988 == null) {
            field5982[0] = this.field5989;
            field5982[5] = this.field5981;
            field5982[1] = this.field5986;
            field5982[3] = this.field5985;
            field5982[2] = this.field5980;
            field5982[4] = this.field5987;
            class181 var2 = this.field5984.field1606;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1415((byte) 110, field5982[var5])) {
                    return null;
                }
                class200 var6 = var2.method1412(field5982[var5], (byte) -122);
                int var7 = var6.field2931 ? 64 : 128;
                if (var6.field2926 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field5983[var8] = var2.method1413(var4, field5982[var8], var4, 1.0F, false, false);
            }
            this.field5988 = new class414(this.field5984, 6407, var4, var3, field5983);
        }
        return this.field5988;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lge;IIIIII)V", line = 75)
    public class411(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5985 = arg4;
        this.field5980 = arg3;
        this.field5986 = arg2;
        this.field5981 = arg6;
        this.field5984 = arg0;
        this.field5989 = arg1;
        this.field5987 = arg5;
    }
}
