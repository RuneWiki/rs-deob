import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class204 extends class600 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "B")
    public byte field3158;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "B")
    public byte field3163;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Z")
    public boolean field3159;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[I")
    public static int[] field3165;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)Z")
    public abstract boolean method588(int arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILr;B)Z")
    public abstract boolean method632(int arg0, int arg1, class98 arg2, byte arg3);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILr;)Leh;")
    public abstract class203 method631(int arg0, class98 arg1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)I")
    public abstract int method634(byte arg0);

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z")
    public abstract boolean method592(int arg0);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Z")
    public abstract boolean method587(byte arg0);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
    public static void method1412(byte arg0) {
        field3165 = null;
        if (arg0 >= -35) {
            method1412((byte) -26);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lr;I)Lej;")
    public abstract class690 method627(class98 arg0, int arg1);

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Z")
    public abstract boolean method630(int arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public abstract void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6);

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)I")
    public abstract int method626(int arg0);

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V")
    public abstract void method585(int arg0);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(ILr;)V")
    public abstract void method625(int arg0, class98 arg1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Lam;)I")
    public abstract int method591(int arg0, class289[] arg1);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)Z")
    public abstract boolean method633(boolean arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[Lam;)I")
    public final int method1413(int arg0, int arg1, int arg2, class289[] arg3) {
        field3156++;
        long var5 = class155.field2554[this.field3158][arg2][arg0];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg3[var9++] = class126.field2067[var10 - 1].field90;
            var7 += 16L;
        }
        if (arg1 != -6813) {
            this.field3157 = 111;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }
}
