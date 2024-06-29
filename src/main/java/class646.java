import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class646 extends class435 {

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Z")
    public boolean field9160;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "[Lai;")
    public class646[] field9158;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field9153;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Lcw;")
    public class127 field9164;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lhca;")
    public class365 field9156;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lch;Lr;I)I", line = 14)
    public static final int method3625(class219 arg0, class98 arg1, int arg2) {
        if (arg2 > -50) {
            return -70;
        }
        field9163++;
        if (arg0.field3283 != -1) {
            return arg0.field3283;
        }
        if (arg0.field3284 != -1) {
            class377 var3 = arg1.field1459.method2359(-122, arg0.field3284);
            if (!var3.field5232) {
                return var3.field5223;
            }
        }
        return arg0.field3290;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I", line = 40)
    public int[][] method298(int arg0, int arg1) {
        field9169++;
        if (arg0 != -12424) {
            this.field9156 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)[[I", line = 53)
    public final int[][] method3626(int arg0, int arg1, int arg2) {
        if (arg0 < 33) {
            method3625(null, null, -87);
        }
        field9159++;
        if (this.field9158[arg2].field9160) {
            int[] var4 = this.field9158[arg2].method424(arg1, (byte) -120);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9158[arg2].method298(-12424, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)[I", line = 86)
    public int[] method424(int arg0, byte arg1) {
        field9168++;
        if (arg1 == -120) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)I", line = 97)
    public static final int method3627(int arg0, int arg1, int arg2) {
        field9154++;
        if (arg0 >= -9) {
            return 49;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg1 - var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)I", line = 112)
    public int method3146(boolean arg0) {
        field9161++;
        return arg0 ? -1 : 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lek;IB)V", line = 132)
    public void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 <= 7) {
            this.field9156 = null;
        }
        field9157++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I", line = 142)
    public int method1540(int arg0) {
        if (arg0 != 0) {
            this.field9156 = null;
        }
        field9155++;
        return -1;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IZ)V", line = 152)
    public class646(int arg0, boolean arg1) {
        this.field9160 = arg1;
        this.field9158 = new class646[arg0];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)[I", line = 164)
    public final int[] method3628(boolean arg0, int arg1, int arg2) {
        field9165++;
        if (arg0) {
            this.field9158 = null;
        }
        return this.field9158[arg1].field9160 ? this.field9158[arg1].method424(arg2, (byte) -120) : this.field9158[arg1].method298(-12424, arg2)[0];
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 190)
    public void method1543(int arg0) {
        int var2 = -66 % ((-arg0 - 49) / 45);
        field9162++;
        if (this.field9160) {
            this.field9156.method2188(0);
            this.field9156 = null;
        } else {
            this.field9164.method1004(122);
            this.field9164 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 217)
    public void method422(int arg0) {
        if (arg0 != -1) {
            this.field9153 = -51;
        }
        field9170++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V", line = 233)
    public void method1538(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method295(null, 27, (byte) 22);
        }
        field9167++;
        int var4 = this.field9153 == 255 ? arg2 : this.field9153;
        if (this.field9160) {
            this.field9156 = new class365(var4, arg2, arg0);
        } else {
            this.field9164 = new class127(var4, arg2, arg0);
        }
    }
}
