import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public abstract class class167 extends class503 {

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "Z")
    public boolean field2255 = false;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "Ljda;")
    public static class239 field2247 = new class239(8);

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    public static int field2258 = -1;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "B")
    public byte field2244;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "B")
    public byte field2250;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "Lwea;")
    public class167 field2252;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "Z")
    public boolean field2243;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[Luca;IB)I", line = 4)
    public final int method1200(int arg0, class540[] arg1, int arg2, byte arg3) {
        field2254++;
        long var5 = class608.field8264[this.field2250][arg2][arg0];
        if (arg3 != 36) {
            return -37;
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class369.field5356[var10 - 1].field9828;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(B)V", line = 48)
    public static void method1201(byte arg0) {
        field2247 = null;
        if (arg0 <= 47) {
            method1201((byte) 101);
        }
    }

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "(I)V", line = 62)
    public static final void method1202(int arg0) {
        class564.field7562 = arg0;
        for (int var1 = 0; var1 < class405.field5875; var1++) {
            for (int var2 = 0; var2 < class710.field9947; var2++) {
                if (class626.field8501[arg0][var1][var2] == null) {
                    class626.field8501[arg0][var1][var2] = new class243(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lr;III[Z)Z", line = 99)
    public static final boolean method1203(class195 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class538.field7317 != class528.field7227) {
            int var6 = class412.field5933[arg1].method1882(arg3, 0, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class296 var8 = class412.field5933[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1882(arg3, 0, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1142(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1152(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(B)V", line = 134)
    public static final void method1204(byte arg0) {
        class645.method3582(1);
        field2249++;
        class598.field8147 = null;
        class584.field7797 = 0;
        class434.field6143 = null;
        class206.field2700 = 0;
        class385.field5623 = 0;
        class15.field225 = null;
        class635.field8859 = null;
        class89.field1233.field5459 = 0;
        class686.method3810(arg0 ^ 0x5A);
        class487.method2828(0);
        int var1 = 0;
        if (arg0 != 16) {
            field2258 = -128;
        }
        while (var1 < 2048) {
            class599.field8149[var1] = null;
            var1++;
        }
        class551.field7456 = null;
        for (int var2 = 0; var2 < class184.field2457; var2++) {
            class192 var4 = class495.field6850[var2].field2336;
            if (var4 != null) {
                var4.field1787 = -1;
            }
        }
        class664.method3678(3);
        class502.field6938 = 1;
        class704.field9868 = -1;
        class518.field7072 = -1;
        class300.method1901(10, 2);
        for (int var3 = 0; var3 < 100; var3++) {
            class627.field8773[var3] = true;
        }
        class10.method85(1624);
        class126.field1902 = null;
        class18.field272 = 0L;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)I", line = 190)
    public int method1205(boolean arg0) {
        if (!arg0) {
            this.field2250 = 43;
        }
        field2256++;
        return 0;
    }

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)Z")
    public abstract boolean method45(int arg0);

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "(I)Z")
    public abstract boolean method19(int arg0);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lha;B)Lel;")
    public abstract class574 method27(class65 arg0, byte arg1);

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILha;)Z")
    public abstract boolean method33(int arg0, int arg1, int arg2, class65 arg3);

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "(I)Z")
    public abstract boolean method21(int arg0);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLha;)V")
    public abstract void method32(byte arg0, class65 arg1);

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "(I)I")
    public abstract int method28(int arg0);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public abstract void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILha;)Ldfa;")
    public abstract class176 method22(int arg0, class65 arg1);

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(ILha;)Z")
    public abstract boolean method41(int arg0, class65 arg1);

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "(I)I")
    public abstract int method24(int arg0);

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "(I)Z")
    public abstract boolean method59(int arg0);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B[Luca;)I")
    public abstract int method43(byte arg0, class540[] arg1);
}
