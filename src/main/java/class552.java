import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class552 {

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    private int field7817 = -1;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    private int field7821 = 0;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lhga;")
    private class158 field7820 = new class158();

    @OriginalMember(owner = "client!et", name = "l", descriptor = "Z")
    public boolean field7825 = false;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    private int field7818;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    private int field7815;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "[Lab;")
    private class623[] field7814;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "[[I")
    private int[][] field7816;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Z")
    public static boolean field7822 = false;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method3161(boolean arg0) {
        field7819++;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field7815; var2++) {
            this.field7816[var2] = null;
        }
        this.field7814 = null;
        this.field7816 = null;
        this.field7820.method1222((byte) -115);
        this.field7820 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIILpc;Lpc;)V")
    public static final void method3162(int arg0, int arg1, int arg2, class624 arg3, class624 arg4) {
        class370 var5 = class43.method570(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5491 = arg3;
        var5.field5493 = arg4;
        int var6 = class697.field9813 == class485.field6947 ? 1 : 0;
        if (!arg3.method522((byte) -36)) {
            class7.field513[var6][class575.field8353[var6]++] = arg3;
        } else if (arg3.method524(-128)) {
            class368.field5462[var6][class43.field1090[var6]++] = arg3;
        } else {
            class148.field2552[var6][class338.field5048[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method522((byte) -36)) {
            if (arg4.method524(85)) {
                class368.field5462[var6][class43.field1090[var6]++] = arg4;
                return;
            }
            class148.field2552[var6][class338.field5048[var6]++] = arg4;
            return;
        }
        class7.field513[var6][class575.field8353[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[[I")
    public final int[][] method3163(int arg0) {
        int var2 = 6 % ((-arg0 - 62) / 60);
        field7824++;
        if (this.field7818 != this.field7815) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field7815; var3++) {
            this.field7814[var3] = class566.field8263;
        }
        return this.field7816;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
    public final int[] method3164(int arg0, int arg1) {
        if (arg1 > -106) {
            this.method3163(52);
        }
        field7823++;
        if (this.field7818 == this.field7815) {
            this.field7825 = this.field7814[arg0] == null;
            this.field7814[arg0] = class566.field8263;
            return this.field7816[arg0];
        } else if (this.field7815 == 1) {
            this.field7825 = this.field7817 != arg0;
            this.field7817 = arg0;
            return this.field7816[0];
        } else {
            class623 var3 = this.field7814[arg0];
            if (var3 == null) {
                this.field7825 = true;
                if (this.field7815 <= this.field7821) {
                    class623 var4 = (class623) this.field7820.method1221((byte) -24);
                    var3 = new class623(arg0, var4.field9013);
                    this.field7814[var4.field9016] = null;
                    var4.method2588(300);
                } else {
                    var3 = new class623(arg0, this.field7821);
                    this.field7821++;
                }
                this.field7814[arg0] = var3;
            } else {
                this.field7825 = false;
            }
            this.field7820.method1228(var3, (byte) 59);
            return this.field7816[var3.field9013];
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(III)V")
    public class552(int arg0, int arg1, int arg2) {
        this.field7818 = arg1;
        this.field7815 = arg0;
        this.field7814 = new class623[this.field7818];
        this.field7816 = new int[this.field7815][arg2];
    }
}
