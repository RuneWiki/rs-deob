import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class428 {

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Ltf;")
    private class701 field6083;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Ltf;")
    private class701 field6082;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lsea;")
    public static class319 field6081 = new class319();

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field6085 = 0;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field6086 = 0;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lwk;")
    private class442 field6078;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLvb;)Lwaa;")
    public final class33 method2470(byte arg0, class318 arg1) {
        field6084++;
        if (arg0 != 89) {
            this.method2470((byte) -40, null);
        }
        if (arg1 == null) {
            return null;
        }
        class14 var3 = arg1.method203((byte) -92);
        if (class652.field9152 == var3) {
            return new class203((class552) arg1);
        } else if (class365.field4897 == var3) {
            return new class29(this.method2471((byte) 85), (class393) arg1);
        } else if (class192.field2221 == var3) {
            return new class387(this.field6083, (class39) arg1);
        } else if (class373.field5080 == var3) {
            return new class692(this.field6083, (class345) arg1);
        } else if (class655.field9231 == var3) {
            return new class87(this.field6083, this.field6082, (class202) arg1);
        } else if (class295.field3685 == var3) {
            return new class406(this.field6083, this.field6082, (class291) arg1);
        } else if (class588.field8322 == var3) {
            return new class495(this.field6083, this.field6082, (class631) arg1);
        } else if (class632.field8899 == var3) {
            return new class31(this.field6083, this.field6082, (class322) arg1);
        } else if (class325.field3998 == var3) {
            return new class89(this.field6083, (class522) arg1);
        } else if (class45.field465 == var3) {
            return new class16(this.field6083, this.field6082, (class225) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lwk;")
    private final class442 method2471(byte arg0) {
        int var2 = 43 % ((arg0 - 31) / 53);
        field6079++;
        if (this.field6078 == null) {
            this.field6078 = new class442();
        }
        return this.field6078;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ltf;Ltf;)V")
    public class428(class701 arg0, class701 arg1) {
        this.field6083 = arg0;
        this.field6082 = arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2472(int arg0) {
        field6081 = null;
        if (arg0 != -23839) {
            field6081 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Loh;[II[I[I)V")
    public static final void method2473(class600 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg2; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg0.field9483.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field9483[var9] = null;
                    } else {
                        class257 var10 = class265.field3301.method3043(var6, -8191);
                        int var11 = var10.field3220;
                        class2 var12 = arg0.field9483[var9];
                        if (var12 != null) {
                            if (var12.field12 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field9483[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field14 = 0;
                                    var12.field9 = 0;
                                    var12.field10 = 1;
                                    var12.field13 = var8;
                                    var12.field8 = 0;
                                    class635.method3570((byte) -71, false, arg0.field5179, var10, arg0.field5166, arg0.field5176, 0);
                                } else if (var11 == 2) {
                                    var12.field14 = 0;
                                }
                            } else if (var10.field3225 >= class265.field3301.method3043(var12.field12, -8191).field3225) {
                                var12 = arg0.field9483[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class2 var13 = arg0.field9483[var9] = new class2();
                            var13.field8 = 0;
                            var13.field14 = 0;
                            var13.field9 = 0;
                            var13.field12 = var6;
                            var13.field10 = 1;
                            var13.field13 = var8;
                            class635.method3570((byte) -76, false, arg0.field5179, var10, arg0.field5166, arg0.field5176, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field6080++;
    }
}
