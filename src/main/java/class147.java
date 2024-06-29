import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class147 {

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "Lwb;")
    public class181 field1895 = new class181();

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public static int[] field1889 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lrga;")
    public static class280 field1886 = new class280(81, 2);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "Lwb;")
    private class181 field1897;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lkp;")
    public static class507 field1887;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Lpl;")
    public static class612 field1894;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Lwb;")
    public final class181 method846(int arg0) {
        if (arg0 != -19895) {
            method847(-107);
        }
        field1896++;
        class181 var2 = this.field1895.field2322;
        if (this.field1895 == var2) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var2.field2322;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public static void method847(int arg0) {
        field1894 = null;
        if (arg0 != -1) {
            method851(null, -30, null, null, null);
        }
        field1889 = null;
        field1886 = null;
        field1887 = null;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
    public final void method848(int arg0) {
        field1891++;
        while (true) {
            class181 var2 = this.field1895.field2322;
            if (this.field1895 == var2) {
                if (arg0 == 0) {
                    this.field1897 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1132(10511);
        }
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)I")
    public final int method849(int arg0) {
        field1888++;
        int var2 = 0;
        class181 var3 = this.field1895.field2322;
        if (arg0 != -14300) {
            this.method852(9);
        }
        while (this.field1895 != var3) {
            var2++;
            var3 = var3.field2322;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLwb;)V")
    public final void method850(byte arg0, class181 arg1) {
        field1890++;
        if (arg1.field2321 != null) {
            arg1.method1132(arg0 + 10385);
        }
        arg1.field2322 = this.field1895;
        arg1.field2321 = this.field1895.field2321;
        if (arg0 != 126) {
            field1889 = null;
        }
        arg1.field2321.field2322 = arg1;
        arg1.field2322.field2321 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([II[ILqi;[I)V")
    public static final void method851(int[] arg0, int arg1, int[] arg2, class514 arg3, int[] arg4) {
        field1892++;
        int var5 = -48 / ((arg1 + 11) / 48);
        for (int var6 = 0; var6 < arg0.length; var6++) {
            int var7 = arg0[var6];
            int var8 = arg2[var6];
            int var9 = arg4[var6];
            for (int var10 = 0; var8 != 0 && var10 < arg3.field9704.length; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field9704[var10] = null;
                    } else {
                        class395 var11 = class583.field8149.method1844(64, var7);
                        int var12 = var11.field4970;
                        class248 var13 = arg3.field9704[var10];
                        if (var13 != null) {
                            if (var13.field3060 == var7) {
                                if (var12 == 0) {
                                    var13 = arg3.field9704[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field3061 = 0;
                                    var13.field3059 = 0;
                                    var13.field3064 = 1;
                                    var13.field3058 = var9;
                                    var13.field3062 = 0;
                                    class192.method1159(arg3.field6470, var11, arg3.field6461, arg3.field6464, 82, 0, class376.field4748 == arg3);
                                } else if (var12 == 2) {
                                    var13.field3062 = 0;
                                }
                            } else if (var11.field4983 >= class583.field8149.method1844(64, var13.field3060).field4983) {
                                var13 = arg3.field9704[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class248 var14 = arg3.field9704[var10] = new class248();
                            var14.field3058 = var9;
                            var14.field3062 = 0;
                            var14.field3060 = var7;
                            var14.field3064 = 1;
                            var14.field3061 = 0;
                            var14.field3059 = 0;
                            class192.method1159(arg3.field6470, var11, arg3.field6461, arg3.field6464, 81, 0, class376.field4748 == arg3);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Lwb;")
    public final class181 method852(int arg0) {
        field1893++;
        int var2 = -93 / ((-arg0 - 55) / 57);
        class181 var3 = this.field1897;
        if (this.field1895 == var3) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var3.field2322;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class147() {
        this.field1895.field2321 = this.field1895;
        this.field1895.field2322 = this.field1895;
    }
}
