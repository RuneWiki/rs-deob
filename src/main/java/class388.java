import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class388 implements class698 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lpia;")
    private class649 field5396;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljv;")
    private class741 field5397;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 6)
    public final void method621(int arg0) {
        field5394++;
        if (arg0 != 27799) {
            this.field5396 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILjava/lang/String;Lda;I)I", line = 17)
    private final int method2319(int arg0, int arg1, int arg2, String arg3, class423 arg4, int arg5) {
        if (arg0 >= -52) {
            method2320(-50, null);
        }
        field5398++;
        return arg4.method2523(arg1 + arg2, this.field5397.field10367 - arg2 * 2, 0, this.field5397.field10360, null, this.field5397.field10365 - arg2 * 2, this.field5397.field10362, arg3, null, 0, null, arg2 + arg5, 17517, 0, 0, 0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z", line = 28)
    public final boolean method616(byte arg0) {
        if (arg0 == 30) {
            field5395++;
            return this.field5396.method3508(3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V", line = 40)
    public final void method620(boolean arg0, int arg1) {
        field5399++;
        if (arg1 <= 108) {
            this.field5396 = null;
        }
        class754 var3 = this.field5396.method3507(this.field5397.field10357, (byte) 113);
        if (var3 == null) {
            return;
        }
        int var4 = this.field5397.field10369.method4235(false, class303.field3896, this.field5397.field10367) + this.field5397.field10358;
        int var5 = this.field5397.field10363.method2413(this.field5397.field10365, class708.field9966, (byte) -8) + this.field5397.field10366;
        if (this.field5397.field10368) {
            class458.field6407.method136(var4, var5, this.field5397.field10367, this.field5397.field10365, this.field5397.field10361, 0);
        }
        int var6 = var5 + this.method2319(-57, var4, 5, var3.field10514, class100.field1234, var5) * 12;
        int var9 = var6 + 8;
        if (this.field5397.field10368) {
            class458.field6407.method134(var4, var9, this.field5397.field10367 + var4 - 1, var9, this.field5397.field10361, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2319(-122, var4, 5, var3.field10519, class100.field1234, var6) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2319(-81, var4, 5, var3.field10518, class100.field1234, var10) * 12;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILtn;)Luv;", line = 74)
    public static final class25 method2320(int arg0, class179 arg1) {
        field5393++;
        class569 var2 = class659.method3579(65, arg1);
        if (arg0 == 21933) {
            int var3 = arg1.method1137((byte) -108);
            return new class25(var2.field8672, var2.field8662, var2.field8674, var2.field8675, var2.field8673, var2.field8665, var2.field8667, var2.field8663, var2.field8669, var2.field7939, var2.field7935, var2.field7934, var2.field7940, var2.field7936, var2.field7938, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lpia;Ljv;)V", line = 95)
    public class388(class649 arg0, class741 arg1) {
        this.field5396 = arg0;
        this.field5397 = arg1;
    }
}
