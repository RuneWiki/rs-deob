import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class450 {

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public int field6313;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public int field6311;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "B")
    public byte field6309;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    private int field6315;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Llh;")
    public class450 field6316;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Llu;")
    public static class610 field6321 = new class610(59, 3);

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "[[I")
    public static int[][] field6325 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field6324 = 0;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field6326 = -1;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field6304;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field6305;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field6306;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field6310;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field6317;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field6322;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2721(int arg0) {
        field6321 = null;
        field6325 = null;
        if (arg0 >= -86) {
            method2723(16, 101);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)Llh;", line = 16)
    public final class450 method2722(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 59) {
            field6318++;
            return new class450(this.field6315, arg2, arg1, arg0, this.field6309);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2723(int arg0, int arg1) {
        field6323++;
        if (arg1 != 6) {
            method2725(-24, -18);
        }
        class322.field4443 = arg0;
        class396.field5453.method837(127);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Lgn;", line = 47)
    public final class601 method2724(byte arg0) {
        field6308++;
        int var2 = 27 % ((arg0 + 2) / 54);
        return class301.method1842(this.field6315, -109);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Lin;", line = 66)
    public static final class77 method2725(int arg0, int arg1) {
        field6314++;
        if (arg1 != 26728) {
            method2725(71, -77);
        }
        class374[] var2 = class572.field8427;
        synchronized (class572.field8427) {
            class77 var3;
            if (arg0 >= class572.field8427.length || class572.field8427[arg0].method2243(-101)) {
                var3 = new class77();
                var3.field1022 = new class381[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field1022[var4] = new class381();
                }
            } else {
                var3 = (class77) class572.field8427[arg0].method2239(-24148);
                var3.method1783((byte) 29);
                int var10002 = class25.field244[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIB)V", line = 105)
    public class450(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6320 = arg1;
        this.field6313 = arg2;
        this.field6311 = arg3;
        this.field6309 = arg4;
        this.field6315 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Llh;I)V", line = 120)
    public class450(class450 arg0, int arg1) {
        this.field6316 = arg0;
        this.field6313 = this.field6316.field6313 + arg1;
        this.field6309 = this.field6316.field6309;
        this.field6315 = this.field6316.field6315;
        this.field6320 = this.field6316.field6320 + arg1;
        this.field6311 = this.field6316.field6311 + arg1;
    }
}
