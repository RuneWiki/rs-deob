import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 {

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "B")
    public byte field414 = 0;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "S")
    public short field404;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "B")
    public byte field416;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "B")
    public byte field402;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "S")
    public short field398;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Lmga;")
    public static class666 field400 = new class666(4);

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "J")
    public static long field410 = -1L;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "[I")
    public static int[] field415 = new int[2048];

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "B")
    public byte field401;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "B")
    public byte field407;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "B")
    public byte field417;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "B")
    public byte field420;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Lwh;")
    public class136 field403;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "Lc;")
    public class174 field399;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "Ll;")
    public class18 field396;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Ll;")
    public class18 field413;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "Lfba;")
    public class24 field408;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "Ldk;")
    public class477 field406;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "Ldk;")
    public class477 field411;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "Lpga;")
    public static class500 field418;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "Llw;")
    public class618 field422;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Lbo;")
    public class684 field409;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "S")
    public short field412;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "Z")
    public boolean field405;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "Z")
    public boolean field419;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "Z")
    public boolean field421;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 3)
    public static void method219(byte arg0) {
        field415 = null;
        field400 = null;
        if (arg0 <= 89) {
            field415 = null;
        }
        field418 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V", line = 16)
    public final void method220(boolean arg0) {
        field397++;
        while (this.field409 != null) {
            class684 var2 = this.field409.field9618;
            this.field409.method3809(2048);
            this.field409 = var2;
        }
        if (!arg0) {
            method219((byte) 125);
        }
        this.field414 = 0;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(III)V", line = 34)
    public class24(int arg0, int arg1, int arg2) {
        this.field404 = (short) arg2;
        this.field402 = this.field416 = (byte) arg0;
        this.field398 = (short) arg1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILhfa;[I)V", line = 60)
    public static final void method221(int arg0, int arg1, class287 arg2, int[] arg3) {
        field395++;
        if (arg2.field5576 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field5576.length; var5++) {
                if (arg2.field5576[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field5575 != -1) {
                class616 var6 = class636.field8570.method231(arg2.field5575, arg0 - 11763);
                int var7 = var6.field8162;
                if (var7 == 1) {
                    arg2.field5606 = 1;
                    arg2.field5629 = 0;
                    arg2.field5554 = 0;
                    arg2.field5623 = 0;
                    arg2.field5611 = arg1;
                    class373.method2199(arg2.field8609, arg2.field8620, (byte) 94, arg2.field8612, arg2.field5623, var6, false);
                }
                if (var7 == 2) {
                    arg2.field5629 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg2.field5576 == null || arg2.field5576[var9] == -1 || class636.field8570.method231(arg3[var9], -11764).field8155 >= class636.field8570.method231(arg2.field5576[var9], arg0 ^ 0x2DF3).field8155) {
                arg2.field5576 = arg3;
                arg2.field5641 = arg2.field5642;
                arg2.field5611 = arg1;
            }
        }
        if (var8) {
            arg2.field5611 = arg1;
            arg2.field5576 = arg3;
            arg2.field5641 = arg2.field5642;
        }
        if (arg0 != -1) {
            method219((byte) -2);
        }
    }
}
