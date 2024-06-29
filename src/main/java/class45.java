import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class45 extends class34 {

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Lvm;")
    public static class297 field837 = new class297(100);

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Lmf;")
    public static class174 field841 = new class174(128);

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "F")
    public static float field843;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "Lrj;")
    private class254 field833;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lra;BI)V", line = 5)
    private final void method374(class41 arg0, byte arg1, int arg2) {
        if (arg1 < 30) {
            this.method374((class41) null, (byte) 26, -99);
        }
        if (arg2 == 249) {
            int var4 = arg0.method357(false);
            if (this.field833 == null) {
                int var5 = class124.method859((byte) -118, var4);
                this.field833 = new class254(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method357(false) == 1;
                int var8 = arg0.method349((byte) 117);
                class163 var9;
                if (var7) {
                    var9 = new class14(arg0.method313((byte) 54));
                } else {
                    var9 = new class6(arg0.method327(4));
                }
                this.field833.method1749(true, var9, (long) var8);
            }
        }
        field836++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)V", line = 55)
    public static final void method375(int arg0, byte[] arg1) {
        field842++;
        class41 var2 = new class41(arg1);
        var2.field738 = arg1.length - 2;
        class38.field691 = var2.method346(-16);
        class216.field3848 = new byte[class38.field691][];
        class62.field1093 = new int[class38.field691];
        class6.field92 = new byte[class38.field691][];
        class90.field1656 = new boolean[class38.field691];
        class13.field172 = new int[class38.field691];
        class94.field1692 = new int[class38.field691];
        class307.field5283 = new int[class38.field691];
        var2.field738 = arg1.length - (class38.field691 * 8) - 7;
        class142.field2486 = var2.method346(-16);
        class153.field2740 = var2.method346(-16);
        int var3 = (var2.method357(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class38.field691; var4++) {
            class13.field172[var4] = var2.method346(-16);
        }
        if (arg0 >= -70) {
            method375(-123, (byte[]) null);
        }
        for (int var5 = 0; var5 < class38.field691; var5++) {
            class307.field5283[var5] = var2.method346(-16);
        }
        for (int var6 = 0; var6 < class38.field691; var6++) {
            class94.field1692[var6] = var2.method346(-16);
        }
        for (int var7 = 0; var7 < class38.field691; var7++) {
            class62.field1093[var7] = var2.method346(-16);
        }
        var2.field738 = arg1.length - (class38.field691 * 8 - -((var3 + -1) * 3)) - 7;
        class305.field5270 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class305.field5270[var8] = var2.method349((byte) 36);
            if (class305.field5270[var8] == 0) {
                class305.field5270[var8] = 1;
            }
        }
        var2.field738 = 0;
        for (int var9 = 0; var9 < class38.field691; var9++) {
            int var10 = class62.field1093[var9];
            int var11 = class94.field1692[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class6.field92[var9] = var14;
            class216.field3848[var9] = var13;
            int var16 = var2.method357(false);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method323(9092);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method323(9092);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label94: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var11 <= var19) {
                                break label94;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var13[var19 + (var11 * var20)] = var2.method323(9092);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var14[var17 + (var11 * var18)] = var2.method323(9092);
                    }
                    var17++;
                }
            }
            class90.field1656[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILke;B)Lke;", line = 225)
    public final class256 method376(int arg0, class256 arg1, byte arg2) {
        field838++;
        if (this.field833 == null) {
            return arg1;
        }
        class14 var4 = (class14) this.field833.method1744((byte) 127, (long) arg0);
        if (var4 == null) {
            return arg1;
        } else if (arg2 == 40) {
            return var4.field184;
        } else {
            return (class256) null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)I", line = 244)
    public final int method377(int arg0, int arg1, boolean arg2) {
        field834++;
        if (this.field833 == null) {
            return arg0;
        }
        class6 var4 = (class6) this.field833.method1744((byte) 125, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else if (arg2) {
            return var4.field94;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLra;)V", line = 268)
    public final void method378(boolean arg0, class41 arg1) {
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                field839++;
                if (!arg0) {
                    method375(-88, (byte[]) null);
                }
                return;
            }
            this.method374(arg1, (byte) 83, var3);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V", line = 286)
    public static void method379(boolean arg0) {
        field841 = null;
        field837 = null;
        if (arg0) {
            field840 = 26;
        }
    }
}
