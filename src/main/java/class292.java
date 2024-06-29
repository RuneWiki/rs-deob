import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class292 implements class600 {

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lpt;")
    private class451 field3780 = new class451(128);

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    private int[] field3779 = new int[class29.field203.field8894];

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "[I")
    public int[] field3783 = new int[class29.field203.field8894];

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lvj;")
    public static class373 field3777 = new class373(112, 9);

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[Llk;")
    public static class502[] field3784 = new class502[14];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[[[Ldg;")
    public static class349[][][] field3786;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I", line = 5)
    public final int method1630(int arg0, int arg1) {
        field3773++;
        if (arg1 < 110) {
            this.method1632(109, true);
        }
        class445 var3 = class530.field7446.method2052((byte) -121, arg0);
        int var4 = var3.field6131;
        int var5 = var3.field6137;
        int var6 = var3.field6139;
        int var7 = class201.field2407[var6 - var5];
        return this.field3783[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V", line = 28)
    public final void method1631(int arg0, byte arg1, int arg2) {
        if (arg1 != 18) {
            this.method1631(-28, (byte) -65, 85);
        }
        this.field3779[arg0] = arg2;
        field3781++;
        class137 var4 = (class137) this.field3780.method2645((long) arg0, (byte) -110);
        if (var4 == null) {
            class137 var5 = new class137(4611686018427387905L);
            this.field3780.method2640(1, (long) arg0, var5);
        } else if (var4.field1670 != 4611686018427387905L) {
            var4.field1670 = class190.method1030(false) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)I", line = 57)
    public final int method1632(int arg0, boolean arg1) {
        field3785++;
        return arg1 ? -27 : this.field3783[arg0];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 69)
    public final void method1633(int arg0, int arg1, int arg2) {
        field3776++;
        class445 var4 = class530.field7446.method2052((byte) -83, arg1);
        int var5 = var4.field6131;
        int var6 = var4.field6137;
        int var7 = var4.field6139;
        int var8 = class201.field2407[var7 - var6];
        if (arg0 < arg2 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1631(var5, (byte) 18, var9 & arg0 << var6 | this.field3779[var5] & ~var9);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V", line = 97)
    public final void method1634(int arg0, int arg1, int arg2) {
        this.field3783[arg2] = arg0;
        field3782++;
        class137 var4 = (class137) this.field3780.method2645((long) arg2, (byte) -105);
        if (var4 == null) {
            class137 var5 = new class137(class190.method1030(false) + 500L);
            this.field3780.method2640(arg1 - 111, (long) arg2, var5);
        } else {
            var4.field1670 = class190.method1030(false) + 500L;
        }
        if (arg1 != 112) {
            this.field3780 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 121)
    public static final void method1635(boolean arg0) {
        client.field3215 = null;
        class7.field59 = null;
        class388.field5126 = null;
        class128.field1576 = null;
        class175.field2139 = null;
        class636.field9145 = null;
        if (arg0) {
            field3775++;
            class426.field5484 = null;
            class258.field3324 = null;
            class6.field49 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)I", line = 144)
    public final int method1636(boolean arg0, int arg1) {
        field3772++;
        long var3 = class190.method1030(false);
        for (class137 var5 = arg0 ? (class137) this.field3780.method2638(false) : (class137) this.field3780.method2641(12089); var5 != null; var5 = (class137) this.field3780.method2641(12089)) {
            if (var3 > (var5.field1670 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field1670 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7967;
                    this.field3783[var6] = this.field3779[var6];
                    var5.method3187(true);
                    return var6;
                }
                var5.method3187(true);
            }
        }
        if (arg1 != 11032) {
            this.method1633(118, -84, 84);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)V", line = 184)
    public static void method1637(boolean arg0) {
        if (!arg0) {
            field3777 = null;
            field3786 = null;
            field3784 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)V", line = 196)
    public final void method1638(byte arg0, int arg1, int arg2) {
        field3774++;
        class445 var4 = class530.field7446.method2052((byte) -108, arg1);
        int var5 = var4.field6131;
        int var6 = var4.field6137;
        if (arg0 <= 42) {
            method1637(false);
        }
        int var7 = var4.field6139;
        int var8 = class201.field2407[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1634(this.field3783[var5] & ~var9 | var9 & arg2 << var6, 112, var5);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 236)
    public final void method1639(int arg0) {
        field3778++;
        if (arg0 != -14752) {
            this.method1631(-126, (byte) 104, 58);
        }
        for (int var2 = 0; var2 < class29.field203.field8894; var2++) {
            class377 var3 = class29.field203.method3527((byte) -112, var2);
            if (var3 != null && var3.field5018 == 0) {
                this.field3779[var2] = 0;
                this.field3783[var2] = 0;
            }
        }
        this.field3780 = new class451(128);
    }
}
