import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class class697 extends class177 {

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "Lsb;")
    public static class266 field9807 = new class266(49, 2);

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public static int field9817 = 0;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "B")
    public byte field9804;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "B")
    public byte field9814;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public int field9805;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
    public int field9806;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public int field9808;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public int field9809;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public int field9811;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public int field9815;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "Z")
    public boolean field9810;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "[Li;")
    public static class37[] field9813;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([Lff;B)I")
    public abstract int method835(class9[] arg0, byte arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILr;)Lbm;")
    public abstract class98 method450(int arg0, class167 arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[Lff;II)I")
    public final int method3896(int arg0, class9[] arg1, int arg2, int arg3) {
        field9812++;
        long var5 = class335.field5016[this.field9814][arg3][arg0];
        if (arg2 != 48) {
            this.method444(null, (byte) 84, 8, -69);
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class173.field2850[var10 - 1].field9658;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLr;)V")
    public abstract void method463(boolean arg0, class167 arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)Ltea;")
    public static final class219 method3897(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        return var3 == null || var3.field5494 == null ? null : var3.field5494;
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)Z")
    public abstract boolean method524(int arg0);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lr;BII)Z")
    public abstract boolean method444(class167 arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)Z")
    public abstract boolean method836(boolean arg0);

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)V")
    public static final void method3898(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class104.method965(var3.field5491);
        class104.method965(var3.field5493);
        if (var3.field5491 != null) {
            var3.field5491 = null;
        }
        if (var3.field5493 != null) {
            var3.field5493 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)V")
    public abstract void method448(int arg0);

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "(I)I")
    public abstract int method530(int arg0);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public abstract void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6);

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(ILr;)Lfe;")
    public abstract class531 method449(int arg0, class167 arg1);

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "(B)Z")
    public abstract boolean method522(byte arg0);

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(Z)I")
    public abstract int method523(boolean arg0);

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)Z")
    public abstract boolean method447(int arg0);

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "(B)Z")
    public abstract boolean method838(byte arg0);

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "(I)V")
    public static void method3899(int arg0) {
        if (arg0 < 16) {
            method3899(-93);
        }
        field9807 = null;
        field9813 = null;
    }
}
