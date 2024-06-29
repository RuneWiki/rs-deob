import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 extends class171 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field740 = 0;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Lfi;")
    public class112 field750;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Led;")
    public class187 field757;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lug;")
    public class205 field752;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lse;")
    public static class211 field758;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lec;")
    public class24 field761;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method327(byte arg0) {
        int var1 = -50 % ((arg0 - 75) / 35);
        field758 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
    public static final boolean method328(int arg0, int arg1) {
        field756++;
        if (class191.field2650[arg1]) {
            return true;
        } else if (class221.field3323.method1581(arg1, false)) {
            int var2 = class221.field3323.method1577(arg1, -6339);
            if (var2 == 0) {
                class191.field2650[arg1] = true;
                return true;
            }
            if (class158.field2208[arg1] == null) {
                class158.field2208[arg1] = new class211[var2];
            }
            int var3 = 0;
            if (arg0 != 19031) {
                field758 = null;
            }
            while (var2 > var3) {
                if (class158.field2208[arg1][var3] == null) {
                    byte[] var4 = class221.field3323.method1576(arg0 ^ 0xFFFFB5FE, arg1, var3);
                    if (var4 != null) {
                        class211 var5 = class158.field2208[arg1][var3] = new class211();
                        var5.field3093 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1375(new class224(var4), (byte) -60);
                        } else {
                            var5.method1372(0, new class224(var4));
                        }
                    }
                }
                var3++;
            }
            class191.field2650[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public final void method329(byte arg0) {
        if (arg0 < 86) {
            this.field743 = 8;
        }
        this.field761 = null;
        this.field752 = null;
        this.field757 = null;
        field755++;
        this.field750 = null;
    }
}
