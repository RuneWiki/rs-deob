import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class452 extends class130 {

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public int field5798;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field5795;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "Lwp;")
    public static class453 field5796 = new class453(115, 12);

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "J")
    public static long field5799 = -1L;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "Lkp;")
    public static class507 field5801 = null;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field5802 = 104;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "Lre;")
    public static class636 field5800;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Lwea;")
    public final class259 method235(int arg0) {
        if (arg0 < 38) {
            field5802 = 65;
        }
        field5797++;
        return class161.field2130;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lct;Lrc;IIIIIIIIII)V")
    public class452(class414 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5798 = arg10;
        this.field5795 = arg11;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLks;)V")
    public static final void method2422(byte arg0, class30 arg1) {
        field5794++;
        arg1.method207(8);
        int var2 = 0;
        for (int var3 = 0; var3 < class596.field8384; var3++) {
            int var15 = class354.field4521[var3];
            if ((class481.field6395[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class481.field6395[var15] = (byte) class444.method2376(class481.field6395[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method200(false, 1);
                    if (var16 == 0) {
                        var2 = class693.method3911(11, arg1);
                        class481.field6395[var15] = (byte) class444.method2376(class481.field6395[var15], 2);
                    } else {
                        class21.method147(arg1, -36, var15);
                    }
                }
            }
        }
        arg1.method206((byte) -58);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        if (arg0 > -46) {
            method2422((byte) 117, null);
        }
        arg1.method207(8);
        for (int var4 = 0; var4 < class596.field8384; var4++) {
            int var13 = class354.field4521[var4];
            if ((class481.field6395[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class481.field6395[var13] = (byte) class444.method2376(class481.field6395[var13], 2);
                } else {
                    int var14 = arg1.method200(false, 1);
                    if (var14 == 0) {
                        var2 = class693.method3911(11, arg1);
                        class481.field6395[var13] = (byte) class444.method2376(class481.field6395[var13], 2);
                    } else {
                        class21.method147(arg1, -35, var13);
                    }
                }
            }
        }
        arg1.method206((byte) -68);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method207(8);
        for (int var5 = 0; var5 < class561.field7807; var5++) {
            int var11 = class392.field4943[var5];
            if ((class481.field6395[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class481.field6395[var11] = (byte) class444.method2376(class481.field6395[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method200(false, 1);
                    if (var12 == 0) {
                        var2 = class693.method3911(11, arg1);
                        class481.field6395[var11] = (byte) class444.method2376(class481.field6395[var11], 2);
                    } else if (class636.method3562(arg1, var11, 31261)) {
                        class481.field6395[var11] = (byte) class444.method2376(class481.field6395[var11], 2);
                    }
                }
            }
        }
        arg1.method206((byte) -64);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method207(8);
        for (int var6 = 0; var6 < class561.field7807; var6++) {
            int var9 = class392.field4943[var6];
            if ((class481.field6395[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class481.field6395[var9] = (byte) class444.method2376(class481.field6395[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method200(false, 1);
                    if (var10 == 0) {
                        var2 = class693.method3911(11, arg1);
                        class481.field6395[var9] = (byte) class444.method2376(class481.field6395[var9], 2);
                    } else if (class636.method3562(arg1, var9, 31261)) {
                        class481.field6395[var9] = (byte) class444.method2376(class481.field6395[var9], 2);
                    }
                }
            }
        }
        arg1.method206((byte) -122);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class561.field7807 = 0;
        class596.field8384 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class481.field6395[var7] = (byte) (class481.field6395[var7] >> 1);
            class514 var8 = class351.field4490[var7];
            if (var8 == null) {
                class392.field4943[class561.field7807++] = var7;
            } else {
                class354.field4521[class596.field8384++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public static void method2423(boolean arg0) {
        if (arg0) {
            field5801 = null;
        }
        field5800 = null;
        field5796 = null;
        field5801 = null;
    }
}
