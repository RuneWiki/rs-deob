import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class410 extends class696 {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
    public boolean field5780 = false;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "[Lrl;")
    public static class685[] field5786 = new class685[4];

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "B")
    public byte field5779;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "B")
    public byte field5792;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field5782;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field5784;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public int field5790;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lmb;")
    public class410 field5793;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
    public boolean field5788;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public abstract void method523(int arg0);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z")
    public abstract boolean method516(byte arg0);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLha;)V")
    public abstract void method522(boolean arg0, class454 arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lha;I)Lie;")
    public abstract class607 method509(class454 arg0, int arg1);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILha;)Z")
    public abstract boolean method935(int arg0, class454 arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ[Lpk;)I")
    public final int method2425(int arg0, int arg1, boolean arg2, class621[] arg3) {
        field5787++;
        long var5 = class374.field5261[this.field5779][arg0][arg1];
        long var7 = 0L;
        if (!arg2) {
            this.field5788 = true;
        }
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg3[var9++] = class708.field9968[var10 - 1].field8615;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public abstract void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)Z")
    public abstract boolean method265(byte arg0);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLwga;)I")
    public static final int method2426(byte arg0, class506 arg1) {
        field5789++;
        if (arg0 >= -51) {
            return -25;
        } else if (class632.field8774 == arg1) {
            return 5890;
        } else if (class222.field2913 == arg1) {
            return 34167;
        } else if (class155.field1970 == arg1) {
            return 34168;
        } else if (class663.field9083 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lha;B)Lufa;")
    public abstract class152 method520(class454 arg0, byte arg1);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBLha;)Z")
    public abstract boolean method512(int arg0, int arg1, byte arg2, class454 arg3);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
    public abstract int method247(int arg0);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)I")
    public abstract int method269(byte arg0);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static void method2427(int arg0) {
        field5786 = null;
        if (arg0 != -1) {
            field5786 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lpk;)I")
    public abstract int method933(int arg0, class621[] arg1);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
    public int method789(int arg0) {
        field5785++;
        return arg0 <= 86 ? 88 : 0;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)Z")
    public abstract boolean method256(byte arg0);

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z")
    public abstract boolean method936(int arg0);
}
