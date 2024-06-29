import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 {

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private int field162 = 0;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lhj;")
    private class29 field157;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[[[I")
    public static int[][][] field155 = new int[2][][];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Llb;")
    public static class211 field158;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lwj;")
    private class217 field156;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lwj;", line = 12)
    public final class217 method106(byte arg0) {
        field159++;
        if (this.field162 > 0 && this.field157.field343[this.field162 - 1] != this.field156) {
            class217 var2 = this.field156;
            this.field156 = var2.field3419;
            return var2;
        }
        if (arg0 <= 26) {
            this.method106((byte) 104);
        }
        class217 var3;
        do {
            if (this.field162 >= this.field157.field332) {
                return null;
            }
            var3 = this.field157.field343[this.field162++].field3419;
        } while (this.field157.field343[this.field162 - 1] == var3);
        this.field156 = var3.field3419;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;CB)I", line = 45)
    public static final int method107(String arg0, char arg1, byte arg2) {
        if (arg2 != -109) {
            return 123;
        }
        field161++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 74)
    public static void method108(int arg0) {
        if (arg0 == -21708) {
            field155 = (int[][][]) null;
            field158 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V", line = 88)
    public static final void method109(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        if (class304.field4755 == arg1 && arg1 != 0) {
            class8 var2 = class249.field3738[arg1];
            var2.method72(class170.field2539);
        }
        field154++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lhj;)V", line = 122)
    public class14(class29 arg0) {
        this.field157 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lwj;", line = 112)
    public final class217 method110(int arg0) {
        if (arg0 < 110) {
            this.field157 = (class29) null;
        }
        field163++;
        this.field162 = 0;
        return this.method106((byte) 44);
    }
}
