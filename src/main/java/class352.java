import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class352 extends class259 {

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lpo;")
    private class332 field5142;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    private int field5141;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    private int field5140;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    private int field5136;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    private int field5138;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "[I")
    private static int[] field5134 = new int[6];

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[[I")
    private static int[][] field5137 = new int[6][];

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Lbc;")
    private class205 field5139;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Lbc;")
    public final class205 method1619(byte arg0) {
        int var2 = -111 / ((-arg0 - 29) / 34);
        if (this.field5139 == null) {
            class60 var3 = this.field5142.field4744;
            field5134[5] = this.field5136;
            field5134[1] = this.field5135;
            field5134[4] = this.field5133;
            field5134[2] = this.field5138;
            field5134[3] = this.field5140;
            field5134[0] = this.field5141;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method369(field5134[var6], (byte) -100)) {
                    return null;
                }
                class311 var7 = var3.method371(field5134[var6], (byte) 96);
                int var8 = var7.field4442 ? 64 : 128;
                if (var8 > var5) {
                    var5 = var8;
                }
                if (var7.field4430 > 0) {
                    var4 = true;
                }
            }
            for (int var9 = 0; var9 < 6; var9++) {
                field5137[var9] = var3.method373(var5, field5134[var9], 1.0F, var5, 8125, false);
            }
            this.field5139 = new class205(this.field5142, 6407, var5, var4, field5137);
        }
        return this.field5139;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lpo;IIIIII)V")
    public class352(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5142 = arg0;
        this.field5135 = arg2;
        this.field5141 = arg1;
        this.field5140 = arg4;
        this.field5136 = arg6;
        this.field5133 = arg5;
        this.field5138 = arg3;
    }
}
