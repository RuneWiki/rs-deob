import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public int field227 = 128;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public int field219 = 128;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "[Z")
    public static boolean[] field223 = new boolean[200];

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Lgq;")
    public static class538 field218 = new class538(0);

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "[F")
    public static float[] field230 = new float[4];

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "F")
    public static float field231;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "[Lak;")
    public static class367[] field228;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)I", line = 4)
    public static final int method118(int arg0, int arg1, int arg2) {
        field225++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 != 200) {
            return -107;
        } else if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)Lhba;", line = 32)
    public final class10 method119(int arg0) {
        if (arg0 <= 0) {
            this.method120(false, null);
        }
        field226++;
        return new class10(this.field221, this.field227, this.field219, this.field220, this.field222, this.field224);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLhba;)V", line = 50)
    public final void method120(boolean arg0, class10 arg1) {
        this.field224 = arg1.field224;
        field229++;
        this.field221 = arg1.field221;
        this.field227 = arg1.field227;
        this.field222 = arg1.field222;
        if (!arg0) {
            this.field220 = arg1.field220;
            this.field219 = arg1.field219;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V", line = 70)
    public static void method121(boolean arg0) {
        if (!arg0) {
            method121(true);
        }
        field223 = null;
        field218 = null;
        field230 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V", line = 89)
    public class10(int arg0) {
        this.field221 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIII)V", line = 97)
    private class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field221 = arg0;
        this.field220 = arg3;
        this.field227 = arg1;
        this.field222 = arg4;
        this.field224 = arg5;
        this.field219 = arg2;
    }
}
