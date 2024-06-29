import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class7 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    private int field140 = -1;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    private int field147 = 0;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lbb;")
    private class49 field143 = new class49();

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
    public boolean field158 = false;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[Lre;")
    private class236[] field149;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[[[I")
    private int[][][] field155;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[I")
    public static int[] field144 = new int[64];

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
    public static boolean field148 = true;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lcb;")
    public static class137 field152;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Laj;")
    public static class151 field142;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method46(int arg0) {
        field151++;
        if (this.field150 != this.field146) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field150; var2++) {
            this.field149[var2] = class66.field1108;
        }
        return this.field155;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)Lek;")
    public static final class250 method47(boolean arg0) {
        field153++;
        class230 var1 = new class230(class134.field2214, class253.field4293, class49.field842[0], class73.field1283[0], class297.field4859[0], class43.field656[0], class289.field4758[0], class185.field2952);
        class155.method1175(-76);
        return arg0 ? null : var1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method48(byte arg0) {
        for (int var2 = 0; var2 < this.field150; var2++) {
            this.field155[var2][0] = null;
            this.field155[var2][1] = null;
            this.field155[var2][2] = null;
            this.field155[var2] = null;
        }
        field157++;
        this.field149 = null;
        this.field155 = null;
        this.field143.method317(118);
        if (arg0 > 41) {
            this.field143 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public static final void method49(boolean arg0) {
        class259.field4351 = new class49();
        if (arg0) {
            field152 = null;
        }
        field145++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[[I")
    public final int[][] method50(int arg0, byte arg1) {
        field156++;
        if (arg1 <= 110) {
            method51((String) null, 61);
        }
        if (this.field150 == this.field146) {
            this.field158 = this.field149[arg0] == null;
            this.field149[arg0] = class66.field1108;
            return this.field155[arg0];
        } else if (this.field150 == 1) {
            this.field158 = this.field140 != arg0;
            this.field140 = arg0;
            return this.field155[0];
        } else {
            class236 var3 = this.field149[arg0];
            if (var3 == null) {
                this.field158 = true;
                if (this.field147 < this.field150) {
                    var3 = new class236(arg0, this.field147);
                    this.field147++;
                } else {
                    class236 var4 = (class236) this.field143.method319(117);
                    var3 = new class236(arg0, var4.field3983);
                    this.field149[var4.field3987] = null;
                    var4.method993(32);
                }
                this.field149[arg0] = var3;
            } else {
                this.field158 = false;
            }
            this.field143.method313(1, var3);
            return this.field155[var3.field3983];
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method51(String arg0, int arg1) {
        field141++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 13312) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + class206.method1437(arg0.charAt(var4), (byte) -28) - var3;
            }
            return var3;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lii;")
    public static final class33 method52(Throwable arg0, String arg1) {
        class33 var2;
        if ((arg0 instanceof class33)) {
            var2 = (class33) arg0;
            var2.field531 = var2.field531 + ' ' + arg1;
        } else {
            var2 = new class33(arg0, arg1);
        }
        field154++;
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method53(int arg0) {
        int var1 = 0 / ((arg0 + 32) / 37);
        field142 = null;
        field144 = null;
        field152 = null;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V")
    public class7(int arg0, int arg1, int arg2) {
        this.field150 = arg0;
        this.field146 = arg1;
        this.field149 = new class236[this.field146];
        this.field155 = new int[this.field150][3][arg2];
    }
}
