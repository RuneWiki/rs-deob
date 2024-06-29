import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class76 extends class188 {

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
    public static boolean field993 = true;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Z", line = 7)
    public final boolean method480(byte arg0) {
        field991++;
        if (arg0 == 84) {
            return (this.field994 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Z", line = 19)
    public final boolean method481(int arg0) {
        if (arg0 == -289675939) {
            field998++;
            return (this.field994 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z", line = 32)
    public final boolean method482(byte arg0) {
        field1001++;
        if (arg0 == -42) {
            return (this.field994 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z", line = 46)
    public final boolean method483(int arg0, int arg1) {
        field992++;
        if (arg1 != -4150) {
            field1003 = 16;
        }
        return (this.field994 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I", line = 57)
    public final int method484(int arg0) {
        field985++;
        return arg0 < 7 ? 12 : (this.field994 & 0x1D685D) >> 18;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)I", line = 68)
    public final int method485(byte arg0) {
        if (arg0 > -39) {
            return -83;
        } else {
            field1000++;
            return class203.method1419(-96, this.field994);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIBI)V", line = 80)
    public static final void method486(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field990++;
        class64 var5 = (class64) class6.field67.method770((long) arg0, 90);
        if (var5 == null) {
            var5 = new class64();
            class6.field67.method764(24369, var5, (long) arg0);
        }
        if (var5.field773.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field773.length; var8++) {
                var7[var8] = var5.field773[var8];
                var6[var8] = var5.field768[var8];
            }
            for (int var9 = var5.field773.length; var9 < arg2; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field773 = var7;
            var5.field768 = var6;
        }
        if (arg3 == -82) {
            var5.field773[arg2] = arg1;
            var5.field768[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Z", line = 136)
    public final boolean method487(int arg0) {
        field995++;
        if (arg0 != 0) {
            field1003 = 115;
        }
        return (this.field994 & 0x37DF7AD7) >> 29 != 0;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)Z", line = 148)
    public final boolean method488(int arg0) {
        if (arg0 != 2332046) {
            this.method487(54);
        }
        field999++;
        return (this.field994 & 0x23958E) >> 21 != 0;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(II)V", line = 157)
    public class76(int arg0, int arg1) {
        this.field986 = arg1;
        this.field994 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)Z", line = 168)
    public final boolean method489(byte arg0) {
        if (arg0 < 82) {
            field1003 = -9;
        }
        field988++;
        return (this.field994 & 0x127C4D3B) >> 28 != 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILhi;)Lhi;", line = 180)
    public static final class323 method490(int arg0, class323 arg1) {
        field1002++;
        if (arg1.field5196 != -1) {
            return class45.method277(-12866, arg1.field5196);
        }
        int var2 = arg1.field5073 >>> 16;
        class236 var3 = new class236(class88.field1166);
        if (arg0 != 1898551440) {
            return (class323) null;
        }
        for (class238 var4 = (class238) var3.method1630(24712); var4 != null; var4 = (class238) var3.method1634(22)) {
            if (var4.field3658 == var2) {
                return class45.method277(-12866, (int) var4.field2834);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)Z", line = 215)
    public final boolean method491(int arg0) {
        if (arg0 > -86) {
            return true;
        } else {
            field989++;
            return (this.field994 >> 22 & 0x1) != 0;
        }
    }
}
