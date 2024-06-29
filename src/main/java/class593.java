import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class593 extends class55 {

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Z")
    public boolean field8422 = false;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "[I")
    public static int[] field8419 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field8418 = 0;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "B")
    public byte field8417;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "B")
    public byte field8429;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public int field8420;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public int field8421;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public int field8423;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public int field8424;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public int field8425;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public int field8428;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Lvs;")
    public class593 field8431;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
    public boolean field8430;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "[B")
    public static byte[] field8426;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[Lraa;ZI)I", line = 6)
    public final int method3463(int arg0, class609[] arg1, boolean arg2, int arg3) {
        field8432++;
        long var5 = class146.field1947[this.field8429][arg3][arg0];
        if (arg2) {
            return -44;
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class234.field3410[var10 - 1].field199;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(B)V", line = 51)
    public static void method3464(byte arg0) {
        if (arg0 == 98) {
            field8426 = null;
            field8419 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "(B)I", line = 66)
    public int method1798(byte arg0) {
        int var2 = 29 % ((arg0 - 73) / 47);
        field8427++;
        return 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lha;I)Lria;")
    public abstract class286 method325(class60 arg0, int arg1);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[Lraa;)I")
    public abstract int method84(int arg0, class609[] arg1);

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Z")
    public abstract boolean method85(int arg0);

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)Z")
    public abstract boolean method738(byte arg0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBLha;I)Z")
    public abstract boolean method312(int arg0, byte arg1, class60 arg2, int arg3);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lha;I)Z")
    public abstract boolean method79(class60 arg0, int arg1);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lha;Z)V")
    public abstract void method314(class60 arg0, boolean arg1);

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V")
    public abstract void method741(int arg0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public abstract void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "(B)I")
    public abstract int method315(byte arg0);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lha;B)Lc;")
    public abstract class187 method319(class60 arg0, byte arg1);

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "(B)Z")
    public abstract boolean method320(byte arg0);

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "(B)I")
    public abstract int method313(byte arg0);

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "(B)Z")
    public abstract boolean method329(byte arg0);
}
