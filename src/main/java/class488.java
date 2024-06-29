import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class class488 extends class569 {

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6465 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "[I")
    public static int[] field6466 = new int[14];

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "B")
    public byte field6456;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "B")
    public byte field6470;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "F")
    public static float field6469;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lpl;")
    public static class612 field6460;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Lpl;")
    public static class612 field6467;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Z")
    public boolean field6457;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([Lgga;I)I")
    public abstract int method785(class332[] arg0, int arg1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILec;)I")
    public static final int method2639(int arg0, class146 arg1) {
        if (arg0 != 6407) {
            method2641(-81);
        }
        field6459++;
        if (class695.field9862 == arg1) {
            return 6407;
        } else if (class590.field8288 == arg1) {
            return 6408;
        } else if (class586.field8227 == arg1) {
            return 6406;
        } else if (class639.field8973 == arg1) {
            return 6409;
        } else if (class307.field3905 == arg1) {
            return 6410;
        } else if (class223.field2786 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLr;)Log;")
    public abstract class101 method73(boolean arg0, class566 arg1);

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)Z")
    public abstract boolean method83(byte arg0);

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)I")
    public abstract int method72(int arg0);

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(B)Z")
    public abstract boolean method786(byte arg0);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B[Lgga;II)I")
    public final int method2640(byte arg0, class332[] arg1, int arg2, int arg3) {
        field6468++;
        long var5 = class704.field9932[this.field6470][arg2][arg3];
        long var7 = 0L;
        int var9 = 0;
        if (arg0 < 59) {
            return -34;
        }
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class352.field4498[var10 - 1].field4779;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(ZLr;)V")
    public abstract void method67(boolean arg0, class566 arg1);

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V")
    public static void method2641(int arg0) {
        field6465 = null;
        field6467 = null;
        field6466 = null;
        field6460 = null;
        if (arg0 != 32064) {
            method2639(-12, null);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public abstract void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lr;I)Lsd;")
    public abstract class362 method82(class566 arg0, int arg1);

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)Z")
    public abstract boolean method787(int arg0);

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)I")
    public abstract int method71(int arg0);

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(B)Z")
    public abstract boolean method68(byte arg0);

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "(B)Z")
    public abstract boolean method79(byte arg0);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILr;I)Z")
    public abstract boolean method75(int arg0, int arg1, class566 arg2, int arg3);
}
