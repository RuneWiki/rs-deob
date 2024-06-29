import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class class318 extends class498 {

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "Z")
    public boolean field4421 = false;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lkr;")
    public static class602 field4407 = new class602(80, 4);

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "[[[I")
    public static int[][][] field4420 = new int[2][][];

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "Lww;")
    public static class288 field4422 = new class288(8, 1);

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "[I")
    public static int[] field4425 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "Lst;")
    public static class335 field4424 = new class335(19, 3);

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "[Ldc;")
    public static class63[] field4426 = new class63[2048];

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "B")
    public byte field4408;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "B")
    public byte field4419;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public int field4417;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Luq;")
    public class318 field4412;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
    public boolean field4414;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)Z")
    public abstract boolean method783(int arg0);

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)V")
    public static void method2057(int arg0) {
        field4422 = null;
        field4426 = null;
        if (arg0 == 16711680) {
            field4420 = null;
            field4407 = null;
            field4425 = null;
            field4424 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)I")
    public int method2058(int arg0) {
        field4411++;
        if (arg0 != 0) {
            this.field4415 = 27;
        }
        return 0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLha;)V")
    public abstract void method659(boolean arg0, class548 arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([Ltj;B)I")
    public abstract int method626(class687[] arg0, byte arg1);

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "(I)Z")
    public abstract boolean method628(int arg0);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lha;I)Lua;")
    public abstract class3 method660(class548 arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lha;B)Liha;")
    public abstract class613 method653(class548 arg0, byte arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILha;IB)Z")
    public abstract boolean method644(int arg0, class548 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII[Ltj;)I")
    public final int method2059(byte arg0, int arg1, int arg2, class687[] arg3) {
        field4416++;
        if (arg0 != -111) {
            field4420 = null;
        }
        long var5 = class142.field2015[this.field4408][arg1][arg2];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg3[var9++] = class532.field7385[var10 - 1].field1842;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "(I)Z")
    public abstract boolean method785(int arg0);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(Lha;B)Z")
    public abstract boolean method627(class548 arg0, byte arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLha;ZILuq;II)V")
    public abstract void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)Z")
    public abstract boolean method642(byte arg0);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)I")
    public abstract int method793(byte arg0);

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "(I)V")
    public abstract void method641(int arg0);

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "(I)I")
    public abstract int method790(int arg0);
}
