import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class327 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[Lrs;")
    public static class392[] field4644 = new class392[29];

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lse;")
    public static class138 field4640 = new class138(64);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
    public static int[] field4648 = new int[4096];

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
    public static int[] field4649 = new int[256];

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "[I")
    public static int[] field4647 = new int[25];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[Z")
    public static boolean[] field4638;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[[[B")
    public static byte[][][] field4639;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method335(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method2115(int arg0) {
        if (arg0 != -15551) {
            method2118(-63, -116, 26);
        }
        field4647 = null;
        field4648 = null;
        field4644 = null;
        field4639 = null;
        field4649 = null;
        field4640 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZI)V")
    public static final void method2116(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class114.field1398--;
            if (class114.field1398 == 0) {
                class318.field4509 = null;
            }
        }
        if (arg2 != -26) {
            field4638 = null;
        }
        if (arg1) {
            class365.field5180--;
            if (class365.field5180 == 0) {
                class113.field1391 = null;
            }
        }
        field4637++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
    public static final boolean method2117(int arg0, int arg1) {
        field4645++;
        if ((short) arg1 == arg0 || arg0 == 15 || arg0 == 3 || arg0 == 13 || arg0 == 1008) {
            return true;
        } else {
            return arg0 == 25 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Lkl;")
    public static final class46 method2118(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        return var3 == null || var3.field2790 == null ? null : var3.field2790;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqr;[I[I[II)V")
    public static final void method2119(class40 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        field4646++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field5596.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field5596[var9] = null;
                    } else {
                        class412 var10 = class189.method1288(-8192, var6);
                        int var11 = var10.field5910;
                        class299 var12 = arg0.field5596[var9];
                        if (var12 != null) {
                            if (var12.field4182 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field5596[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4186 = 0;
                                    var12.field4187 = 0;
                                    var12.field4185 = 1;
                                    var12.field4188 = var8;
                                    var12.field4183 = 0;
                                    class148.method896(class384.field5422 == arg0, var10, (byte) 121, arg0.field3284, 0, arg0.field3269);
                                } else if (var11 == 2) {
                                    var12.field4187 = 0;
                                }
                            } else if (var10.field5931 >= class189.method1288(-8192, var12.field4182).field5931) {
                                var12 = arg0.field5596[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class299 var13 = arg0.field5596[var9] = new class299();
                            var13.field4182 = var6;
                            var13.field4188 = var8;
                            var13.field4186 = 0;
                            var13.field4185 = 1;
                            var13.field4187 = 0;
                            var13.field4183 = 0;
                            class148.method896(class384.field5422 == arg0, var10, (byte) 116, arg0.field3284, 0, arg0.field3269);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4 <= 39) {
            method2116(false, false, 74);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method336(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method2120(int arg0) {
        field4636++;
        if (class347.field4918 || arg0 != -26) {
            return;
        }
        class25.method175(class276.field3922, false);
        if (class370.field5218 != null) {
            class25.method175(class370.field5218, false);
        }
        class347.field4918 = true;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public abstract int method328(int arg0, int arg1);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)I")
    public abstract int method342(int arg0, int arg1);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lqp;[I)V")
    public abstract void method331(class397 arg0, int[] arg1);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method346(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lmm;IIIIZ)Z")
    public abstract boolean method333(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILmm;)Lmm;")
    public abstract class152 method329(int arg0, int arg1, class152 arg2);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lmm;IIIIZ)V")
    public abstract void method330(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(II)V")
    public abstract void method347(int arg0, int arg1);

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(II)V")
    public class327(int arg0, int arg1) {
        this.field4642 = arg1;
        this.field4635 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public abstract void method332();

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)V")
    public abstract void method341(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lmm;IIIIZ)V")
    public abstract void method339(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
