import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class623 extends class539 {

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field8684 = -1;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field8670 = -1;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field8692 = -1;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Luc;")
    public static class27 field8685 = new class27(7, 18);

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lfc;")
    public static class235 field8693 = new class235(89, 4);

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "F")
    public static float field8694;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field8665;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public int field8666;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public int field8667;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field8668;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field8669;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field8671;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public int field8672;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public int field8673;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field8675;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field8676;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public int field8677;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field8678;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public int field8682;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public int field8683;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public int field8686;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public int field8689;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public int field8691;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Lji;")
    public class559 field8688;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Ljk;")
    public class579 field8690;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Lqr;")
    public class59 field8679;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Lpv;")
    public class63 field8681;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "[Lqg;")
    public static class425[] field8674;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[B)[B", line = 6)
    public static final byte[] method3465(int arg0, byte[] arg1) {
        field8687++;
        class96 var2 = new class96(arg1);
        int var3 = var2.method718(100);
        if (arg0 <= 33) {
            method3465(-39, null);
        }
        int var4 = var2.method714(false);
        if (var4 < 0 || class583.field8128 != 0 && var4 > class583.field8128) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method719(var5, var4, -7861, 0);
            return var5;
        } else {
            int var6 = var2.method714(false);
            if (var6 < 0 || class583.field8128 != 0 && var6 > class583.field8128) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class69.method564(var7, var6, arg1, var4, 9);
            } else {
                class463 var8 = class507.field6945;
                synchronized (class507.field6945) {
                    class507.field6945.method2662(var2, var7, -2290);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 65)
    public static void method3466(boolean arg0) {
        if (!arg0) {
            field8685 = null;
        }
        field8685 = null;
        field8674 = null;
        field8693 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 95)
    public final void method3467(byte arg0) {
        field8680++;
        this.field8681 = null;
        this.field8679 = null;
        this.field8690 = null;
        if (arg0 <= -53) {
            this.field8688 = null;
        }
    }
}
