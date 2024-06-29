import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class204 extends class51 {

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[[[B")
    public static byte[][][] field3567 = new byte[4][104][104];

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "Lhi;")
    public static class82 field3573 = class95.method664((byte) -48, " <col=00ff80>");

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Lhi;")
    public class82 field3571;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "[I")
    public int[] field3568;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "[I")
    public int[] field3576;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "[I")
    public int[] field3577;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "[I")
    public int[] field3580;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "[[[B")
    public static byte[][][] field3581;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1460(boolean arg0) {
        field3573 = null;
        field3581 = (byte[][][]) null;
        field3567 = (byte[][][]) null;
        if (arg0) {
            method1460(true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)I", line = 17)
    public final int method1461(int arg0, int arg1) {
        if (arg1 < 60) {
            field3581 = (byte[][][]) ((byte[][][]) null);
        }
        field3570++;
        if (this.field3580 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3580.length; var3++) {
            if (this.field3568[var3] == arg0) {
                return this.field3580[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Z", line = 44)
    public static final boolean method1462(int arg0, int arg1) {
        if (arg0 == 20336) {
            field3569++;
            return (arg1 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILbc;I)V", line = 69)
    private final void method1463(int arg0, class153 arg1, int arg2) {
        field3578++;
        if (arg0 == 1) {
            this.field3571 = arg1.method1092((byte) 118);
        } else if (arg0 == 2) {
            int var7 = arg1.method1082(-78);
            this.field3577 = new int[var7];
            this.field3576 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3577[var8] = arg1.method1090(false);
                int var9 = arg1.method1082(-31);
                if (var9 == 0) {
                    this.field3576[var8] = -1;
                } else {
                    this.field3576[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1082(-36);
            this.field3580 = new int[var4];
            this.field3568 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3580[var5] = arg1.method1090(false);
                int var6 = arg1.method1082(-111);
                if (var6 == 0) {
                    this.field3568[var5] = -1;
                } else {
                    this.field3568[var5] = var6;
                }
            }
        } else if (arg0 == 4) {
        }
        if (arg2 <= 77) {
            method1460(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V", line = 154)
    public final void method1464(byte arg0) {
        field3572++;
        if (this.field3580 != null) {
            for (int var2 = 0; var2 < this.field3580.length; var2++) {
                this.field3580[var2] = class98.method674(this.field3580[var2], 32768);
            }
        }
        if (arg0 != 71) {
            this.field3580 = (int[]) null;
        }
        if (this.field3577 != null) {
            for (int var3 = 0; var3 < this.field3577.length; var3++) {
                this.field3577[var3] = class98.method674(this.field3577[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lbc;I)V", line = 188)
    public final void method1465(class153 arg0, int arg1) {
        field3575++;
        while (true) {
            int var3 = arg0.method1082(-29);
            if (var3 == 0) {
                if (arg1 >= -28) {
                    this.field3571 = (class82) null;
                }
                return;
            }
            this.method1463(var3, arg0, 91);
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I", line = 210)
    public final int method1466(int arg0, int arg1) {
        field3579++;
        if (this.field3577 == null) {
            return -1;
        } else if (arg0 >= -73) {
            return -91;
        } else {
            for (int var3 = 0; var3 < this.field3577.length; var3++) {
                if (this.field3576[var3] == arg1) {
                    return this.field3577[var3];
                }
            }
            return -1;
        }
    }
}
