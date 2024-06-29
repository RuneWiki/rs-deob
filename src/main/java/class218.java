import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class218 extends class102 {

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    private int field4034 = 0;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    private int field4038 = 10;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    private int field4040 = 2048;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "[I")
    public static int[] field4029 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Ls;")
    public static class194 field4035 = new class194(128);

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "Z")
    public static boolean field4042 = false;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "[[I")
    public static int[][] field4043 = new int[104][104];

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lfc;")
    public static class58 field4039;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[I")
    private int[] field4032;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "[I")
    private int[] field4036;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static final void method1422(int arg0) {
        if (arg0 == 3516) {
            ++field4041;
            if (class163.field2951 != null) {
                class163.field2951.method107(122);
            }
            if (class192.field3585 != null) {
                class192.field3585.method107(124);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 == 14005) {
            this.method1423((byte) 101);
            ++field4037;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    private final void method1423(byte arg0) {
        this.field4036 = new int[this.field4038 + 1];
        ++field4033;
        this.field4032 = new int[this.field4038 + 1];
        if (arg0 > 68) {
            int var2 = 4096 / this.field4038;
            int var3 = this.field4040 * var2 >> 12;
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~this.field4038; ++var5) {
                this.field4032[var5] = var4;
                this.field4036[var5] = var3 + var4;
                var4 += var2;
            }
            this.field4032[this.field4038] = 4096;
            this.field4036[this.field4038] = 4096 - -this.field4036[0];
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
    public static void method1424(byte arg0) {
        if (arg0 > -11) {
            method1422(113);
        }
        field4039 = null;
        field4043 = null;
        field4029 = null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field4031;
            int[] var3 = super.field1960.method699((byte) -74, arg1);
            if (super.field1960.field2007) {
                int var4 = class94.field1769[arg1];
                if (this.field4034 != 0) {
                    for (int var5 = 0; var5 < class155.field2796; ++var5) {
                        int var6 = 0;
                        int var7 = class124.field2292[var5];
                        short var8 = 0;
                        int var9 = this.field4034;
                        if (~var9 != -2) {
                            if (var9 != 2) {
                                if (var9 == 3) {
                                    var6 = 2048 - -(var7 - var4 >> 1);
                                }
                            } else {
                                var6 = (var7 + -4096 + var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = var7;
                        }
                        for (int var10 = 0; ~this.field4038 < ~var10; ++var10) {
                            if (var6 >= this.field4032[var10] && ~var6 > ~this.field4032[var10 + 1]) {
                                if (this.field4036[var10] > var6) {
                                    var8 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var8;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field4038; ++var12) {
                        if (~var4 <= ~this.field4032[var12] && ~this.field4032[var12 - -1] < ~var4) {
                            if (this.field4036[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class154.method988(var3, 0, class155.field2796, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)Z")
    public static final boolean method1425(byte arg0) {
        ++field4030;
        class48 var1 = class98.field1828;
        synchronized (class98.field1828) {
            if (~class96.field1820 == ~class6.field137) {
                return false;
            } else {
                class106.field1984 = class62.field1315[class6.field137];
                class60.field1291 = class162.field2929[class6.field137];
                if (arg0 >= -116) {
                    method1424((byte) -58);
                }
                class6.field137 = 127 & class6.field137 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4028;
        if (!arg2) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field4034 = arg0.method1243(3);
                    }
                } else {
                    this.field4040 = arg0.method1252(2);
                }
            } else {
                this.field4038 = arg0.method1243(3);
            }
        }
    }
}
