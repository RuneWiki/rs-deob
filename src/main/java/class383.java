import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class383 extends class321 {

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "S")
    public static short field5171 = 32767;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[Lmn;")
    public static class61[] field5170 = new class61[6];

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
    public static boolean field5175 = false;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "B")
    public byte field5166;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "B")
    public byte field5169;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Z")
    public boolean field5180;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[I")
    public static int[] field5177;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[[S")
    public static short[][] field5172;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
    public abstract boolean method481(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lr;III)Z")
    public abstract boolean method173(class564 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Z")
    public abstract boolean method183(byte arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIILrb;Lr;Z)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Z")
    public abstract boolean method483(byte arg0);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
    public abstract int method175(byte arg0);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lr;I)Lwj;")
    public abstract class315 method182(class564 arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)I")
    public abstract int method179(int arg0);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(Lr;I)Llf;")
    public abstract class676 method185(class564 arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Leq;)I")
    public abstract int method479(int arg0, class670[] arg1);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)Z")
    public abstract boolean method180(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[Leq;I)I")
    public final int method2199(int arg0, int arg1, class670[] arg2, int arg3) {
        field5167++;
        long var5 = class312.field3882[this.field5166][arg0][arg1];
        long var7 = 0L;
        int var9 = -41 / ((7 - arg3) / 40);
        int var10 = 0;
        while (var7 <= 48L) {
            int var11 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var11 <= 0) {
                break;
            }
            var7 += 16L;
            arg2[var10++] = class85.field860[var11 - 1].field2980;
        }
        for (int var12 = var10; var12 < 4; var12++) {
            arg2[var12] = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lr;Z)V")
    public abstract void method172(class564 arg0, boolean arg1);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static void method2200(boolean arg0) {
        field5170 = null;
        field5177 = null;
        if (!arg0) {
            field5175 = true;
        }
        field5172 = null;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)Z")
    public abstract boolean method177(int arg0);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)V")
    public abstract void method170(int arg0);
}
