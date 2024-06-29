import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class43 extends class105 {

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "Z")
    public boolean field654 = false;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "Lfga;")
    public static class254 field653 = new class254();

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "B")
    public byte field649;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "B")
    public byte field659;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "Lwc;")
    public static class66 field657;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Z")
    public boolean field656;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "[Z")
    public static boolean[] field650;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;IZI)Z")
    public abstract boolean method390(class58 arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)Z")
    public abstract boolean method391(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILdm;Lkr;BIILaa;)V")
    public static final void method392(int arg0, int arg1, class50 arg2, class743 arg3, byte arg4, int arg5, int arg6, class484 arg7) {
        field658++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class666.field9338 == 4) {
            var8 = (int) class321.field4568 & 0x3FFF;
        } else {
            var8 = (int) class321.field4568 + class440.field6138 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field783 / 2, arg2.field830 / 2) + 10;
        if (arg4 <= 88) {
            field657 = null;
        }
        int var10 = arg5 * arg5 + (arg6 * arg6);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class316.field4487[var8];
        int var12 = class316.field4490[var8];
        if (class666.field9338 != 4) {
            var12 = var12 * 256 / (class113.field1812 + 256);
            var11 = var11 * 256 / (class113.field1812 + 256);
        }
        int var13 = arg5 * var12 + arg6 * var11 >> 14;
        int var14 = arg6 * var12 - (arg5 * var11) >> 14;
        arg3.method90(arg0 + var13 + (arg2.field783 / 2) - (arg3.method82() / 2), arg1 - -(arg2.field830 / 2) - (var14 - -(arg3.method83() / 2)), arg7, arg0, arg1);
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(B)I")
    public abstract int method393(byte arg0);

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(B)I")
    public int method394(byte arg0) {
        field645++;
        if (arg0 != 1) {
            this.method401((byte) -49, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)Z")
    public abstract boolean method395(byte arg0);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(BLha;)Lvw;")
    public abstract class304 method396(byte arg0, class58 arg1);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lha;Z)Ltb;")
    public abstract class397 method397(class58 arg0, boolean arg1);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)V")
    public static void method398(boolean arg0) {
        field650 = null;
        field653 = null;
        field657 = null;
        if (arg0) {
            method398(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(B)Z")
    public abstract boolean method399(byte arg0);

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public abstract void method400(int arg0);

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(BLha;)V")
    public abstract void method401(byte arg0, class58 arg1);

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(B)Z")
    public abstract boolean method402(byte arg0);

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)Z")
    public abstract boolean method403(int arg0);

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)I")
    public abstract int method404(int arg0);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BILha;Lgs;ZII)V")
    public abstract void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([Lbh;BII)I")
    public final int method406(class36[] arg0, byte arg1, int arg2, int arg3) {
        field646++;
        long var5 = class577.field8165[this.field649][arg2][arg3];
        if (arg1 >= -80) {
            this.method396((byte) -73, null);
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg0[var9++] = class502.field7171[var10 - 1].field1891;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([Lbh;I)I")
    public abstract int method407(class36[] arg0, int arg1);
}
