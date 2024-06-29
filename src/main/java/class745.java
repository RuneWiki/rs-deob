import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public abstract class class745 extends class91 {

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "Z")
    public boolean field10346 = false;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "Z")
    public static volatile boolean field10357 = false;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
    public static int field10359 = 1;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "Lin;")
    public static class380 field10353 = new class380(125, 12);

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "Z")
    public static boolean field10363 = false;

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "Lin;")
    public static class380 field10362 = new class380(69, 1);

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "B")
    public byte field10349;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "B")
    public byte field10361;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public int field10347;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public int field10348;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public int field10350;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    public int field10352;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public int field10355;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
    public int field10358;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "Lnfa;")
    public class745 field10360;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "Z")
    public boolean field10351;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)Z")
    public abstract boolean method1170(int arg0);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILha;Lnfa;ZI)V")
    public abstract void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;I)Luh;")
    public abstract class162 method204(class475 arg0, int arg1);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[Lmfa;)I")
    public abstract int method1424(int arg0, class217[] arg1);

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "(I)V")
    public abstract void method196(int arg0);

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)I")
    public abstract int method1167(int arg0);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BIILha;)Z")
    public abstract boolean method198(byte arg0, int arg1, int arg2, class475 arg3);

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)I")
    public int method2960(int arg0) {
        field10356++;
        if (arg0 != -5102) {
            this.method205((byte) 85, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLha;)Z")
    public abstract boolean method1428(byte arg0, class475 arg1);

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)Z")
    public abstract boolean method1175(byte arg0);

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "(I)V")
    public static void method4111(int arg0) {
        field10362 = null;
        if (arg0 == 24717) {
            field10353 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)I")
    public abstract int method1173(boolean arg0);

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "(B)Z")
    public abstract boolean method1429(byte arg0);

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(ILha;)V")
    public abstract void method192(int arg0, class475 arg1);

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)Z")
    public abstract boolean method197(boolean arg0);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method4112(String arg0, int arg1) {
        field10345++;
        if (arg1 != -29639) {
            return 49;
        }
        for (int var2 = 0; var2 < class422.field5869.length; var2++) {
            if (class422.field5869[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([Lmfa;IBI)I")
    public final int method4113(class217[] arg0, int arg1, byte arg2, int arg3) {
        field10354++;
        if (arg2 != 122) {
            this.field10346 = true;
        }
        long var5 = class293.field4281[this.field10361][arg3][arg1];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg0[var9++] = class208.field3032[var10 - 1].field4161;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BLha;)Lmg;")
    public abstract class248 method205(byte arg0, class475 arg1);
}
