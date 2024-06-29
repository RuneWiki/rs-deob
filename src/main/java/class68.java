import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class68 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    private int field1150 = -1;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field1157 = 0;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Ldm;")
    private class46 field1155 = new class46();

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Z")
    public boolean field1163 = false;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[Leu;")
    private class407[] field1147;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[[I")
    private int[][] field1148;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1153 = null;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1149 = -1;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1154;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lan;Lan;BLan;Lan;)V")
    public static final void method563(class21 arg0, class21 arg1, byte arg2, class21 arg3, class21 arg4) {
        class110.field1709 = arg1;
        class313.field4217 = arg3;
        class226.field3241 = arg0;
        class428.field6074 = arg4;
        if (arg2 != -107) {
            field1151 = 73;
        }
        field1162++;
        class618.field8850 = new class114[class313.field4217.method239(-43)][];
        class197.field2797 = new boolean[class313.field4217.method239(arg2 + 70)];
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public final void method564(int arg0) {
        for (int var2 = 0; var2 < this.field1158; var2++) {
            this.field1148[var2] = null;
        }
        field1156++;
        this.field1147 = null;
        this.field1148 = null;
        if (arg0 != -1) {
            method568(-70);
        }
        this.field1155.method465(true);
        this.field1155 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
    public final int[] method565(int arg0, int arg1) {
        if (arg1 != -24728) {
            method566(null, -43, null);
        }
        field1152++;
        if (this.field1161 == this.field1158) {
            this.field1163 = this.field1147[arg0] == null;
            this.field1147[arg0] = class640.field9310;
            return this.field1148[arg0];
        } else if (this.field1158 == 1) {
            this.field1163 = this.field1150 != arg0;
            this.field1150 = arg0;
            return this.field1148[0];
        } else {
            class407 var3 = this.field1147[arg0];
            if (var3 == null) {
                this.field1163 = true;
                if (this.field1157 < this.field1158) {
                    var3 = new class407(arg0, this.field1157);
                    this.field1157++;
                } else {
                    class407 var4 = (class407) this.field1155.method467(3344);
                    var3 = new class407(arg0, var4.field5781);
                    this.field1147[var4.field5776] = null;
                    var4.method1117(0);
                }
                this.field1147[arg0] = var3;
            } else {
                this.field1163 = false;
            }
            this.field1155.method462((byte) 116, var3);
            return this.field1148[var3.field5781];
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lik;ILik;)V")
    public static final void method566(class176 arg0, int arg1, class176 arg2) {
        if (arg2.field2519 != null) {
            arg2.method1117(0);
        }
        field1160++;
        arg2.field2519 = arg0.field2519;
        int var3 = -76 / ((47 - arg1) / 48);
        arg2.field2516 = arg0;
        arg2.field2519.field2516 = arg2;
        arg2.field2516.field2519 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)[[I")
    public final int[][] method567(int arg0) {
        field1159++;
        if (this.field1161 != this.field1158) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1158; var2++) {
            this.field1147[var2] = class640.field9310;
        }
        return this.field1148;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method568(int arg0) {
        if (arg0 != -1) {
            method566(null, 89, null);
        }
        field1153 = null;
        field1154 = null;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(III)V")
    public class68(int arg0, int arg1, int arg2) {
        this.field1158 = arg0;
        this.field1161 = arg1;
        this.field1147 = new class407[this.field1161];
        this.field1148 = new int[this.field1158][arg2];
    }
}
