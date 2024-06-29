import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class284 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
    public static int[] field4659 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field4661 = new int[5];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lwg;")
    private class198 field4660;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lph;")
    private class308 field4667;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Llk;", line = 8)
    public static final class280 method2008(int arg0, boolean arg1) {
        field4664++;
        class280 var2 = (class280) class177.field2753.method1539(-63, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field3959.method1504(0, arg1, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class280 var4 = class116.method755(1439220704, var3);
            class177.field2753.method1538(22, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lwg;I)V", line = 34)
    public final void method2009(class198 arg0, int arg1) {
        this.field4660 = arg0;
        field4662++;
        if (arg1 != -30558) {
            method2013((byte) -56);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lph;", line = 46)
    public final class308 method2010(int arg0) {
        field4666++;
        int var2 = -30 / ((80 - arg0) / 39);
        class308 var3 = this.field4667;
        if (this.field4660.field3055 == var3) {
            this.field4667 = null;
            return null;
        } else {
            this.field4667 = var3.field5012;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lph;", line = 71)
    public final class308 method2011(int arg0) {
        class308 var2 = this.field4660.field3055.field5012;
        field4665++;
        if (this.field4660.field3055 == var2) {
            this.field4667 = null;
            return null;
        } else if (arg0 == -1) {
            this.field4667 = var2.field5012;
            return var2;
        } else {
            return (class308) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lkl;I[I[I[I)V", line = 90)
    public static final void method2012(class39 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field4663++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var6 != 0 && arg0.field4771.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg0.field4771[var9] = null;
                    } else {
                        class131 var10 = class68.method476((byte) 73, var8);
                        class223 var11 = arg0.field4771[var9];
                        int var12 = var10.field2004;
                        if (var11 != null) {
                            if (var11.field3450 == var8) {
                                if (var12 == 0) {
                                    var11 = arg0.field4771[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field3456 = 0;
                                    var11.field3452 = 1;
                                    var11.field3438 = var7;
                                    var11.field3445 = 0;
                                    var11.field3451 = 0;
                                    class276.method1970(var10, class329.field5388 == arg0, arg0.field4783, 82, arg0.field4796, 0);
                                } else if (var12 == 2) {
                                    var11.field3456 = 0;
                                }
                            } else if (var10.field2011 >= class68.method476((byte) 76, var11.field3450).field2011) {
                                var11 = arg0.field4771[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class223 var13 = arg0.field4771[var9] = new class223();
                            var13.field3445 = 0;
                            var13.field3456 = 0;
                            var13.field3452 = 1;
                            var13.field3451 = 0;
                            var13.field3450 = var8;
                            var13.field3438 = var7;
                            class276.method1970(var10, class329.field5388 == arg0, arg0.field4783, 126, arg0.field4796, 0);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        if (arg1 < 14) {
            field4659 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 191)
    public static void method2013(byte arg0) {
        field4659 = null;
        if (arg0 == 54) {
            field4661 = null;
        }
    }
}
