import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class639 extends class134 {

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lea;")
    public static class547 field8866 = new class547(48, 3);

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Lrga;")
    public static class242 field8868 = new class242("stellardawn", 1);

    @OriginalMember(owner = "client!av", name = "p", descriptor = "Lea;")
    public static class547 field8876 = new class547(73, 4);

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Lni;")
    public static class522 field8870;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            this.method60((byte) 21);
        }
        ++field8874;
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        ++field8873;
        if (~super.field1708 != -2 && super.field1708 != 0) {
            super.field1708 = this.method58(0);
        }
        if (arg0 < 118) {
            method3597((class176) null, -99, -101, -104, -34, -85);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZII)V")
    public static final void method3594(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field8866 = null;
        }
        ++field8869;
        if (class687.field9628 != arg1) {
            class666.field9279 = new int[arg1];
            for (int var3 = 0; ~arg1 < ~var3; ++var3) {
                class666.field9279[var3] = (var3 << 12) / arg1;
            }
            class28.field206 = arg1 + -1;
            class265.field3499 = arg1 * 32;
            class687.field9628 = arg1;
        }
        if (class676.field9444 != arg2) {
            if (~class687.field9628 != ~arg2) {
                class685.field9613 = new int[arg2];
                for (int var4 = 0; var4 < arg2; ++var4) {
                    class685.field9613[var4] = (var4 << 12) / arg2;
                }
            } else {
                class685.field9613 = class666.field9279;
            }
            class676.field9444 = arg2;
            class625.field8744 = arg2 + -1;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILkda;)V")
    public class639(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I")
    public final int method3595(byte arg0) {
        if (arg0 <= 119) {
            this.method57(-57, 123);
        }
        ++field8871;
        return super.field1708;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lkda;)V")
    public class639(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)I")
    public static final int method3596(byte arg0, int arg1) {
        if (arg0 != -95) {
            method3597((class176) null, -47, -58, -94, -118, -95);
        }
        ++field8867;
        int var2 = arg1 & 63;
        int var3 = 3 & arg1 >> 6;
        if (~var2 == -19) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (~var2 == -20 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (~var3 == -2) {
                return 32;
            }
            if (~var3 == -3) {
                return 64;
            }
            if (~var3 == -4) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lgg;IIIII)V")
    public static final void method3597(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class307.field4170 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class68.field743) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class480.field6629 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class624 var14 = class77.field947[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class25.field188[var11].method1685(var13, -12639, var12) + class25.field188[var11].method1685(var13, -12639, var12 + 1) + class25.field188[var11].method1685(var13 + 1, -12639, var12) + class25.field188[var11].method1685(var13 + 1, -12639, var12 + 1)) / 4 - (class25.field188[arg1].method1685(arg3, -12639, arg2) + class25.field188[arg1].method1685(arg3, -12639, arg2 + 1) + class25.field188[arg1].method1685(arg3 + 1, -12639, arg2) + class25.field188[arg1].method1685(arg3 + 1, -12639, arg2 + 1)) / 4;
                                    class719 var16 = var14.field8728;
                                    class719 var17 = var14.field8737;
                                    if (var16 != null && var16.method157((byte) -84)) {
                                        arg0.method162(var16, (byte) -124, var6, (var12 - arg2) * class601.field8373 + (1 - arg4) * class522.field7044, class22.field158, var15, (var13 - arg3) * class601.field8373 + (1 - arg5) * class522.field7044);
                                    }
                                    if (var17 != null && var17.method157((byte) -71)) {
                                        arg0.method162(var17, (byte) 88, var6, (var12 - arg2) * class601.field8373 + (1 - arg4) * class522.field7044, class22.field158, var15, (var13 - arg3) * class601.field8373 + (1 - arg5) * class522.field7044);
                                    }
                                    for (class603 var18 = var14.field8729; var18 != null; var18 = var18.field8413) {
                                        class752 var19 = var18.field8410;
                                        if (var19 != null && var19.method157((byte) -125) && (var19.field10422 == var12 || var7 == var12) && (var19.field10421 == var13 || var9 == var13)) {
                                            int var20 = var19.field10426 - var19.field10422 + 1;
                                            int var21 = var19.field10425 - var19.field10421 + 1;
                                            arg0.method162(var19, (byte) -126, var6, (var19.field10422 - arg2) * class601.field8373 + (var20 - arg4) * class522.field7044, class22.field158, var15, (var19.field10421 - arg3) * class601.field8373 + (var21 - arg5) * class522.field7044);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        int var3 = -24 / ((-26 - arg0) / 41);
        ++field8875;
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
    public static void method3598(byte arg0) {
        field8866 = null;
        if (arg0 != 122) {
            field8866 = null;
        }
        field8876 = null;
        field8870 = null;
        field8868 = null;
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            return -104;
        } else {
            ++field8872;
            return 1;
        }
    }
}
