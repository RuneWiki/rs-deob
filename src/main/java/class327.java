import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class327 extends class159 {

    @OriginalMember(owner = "client!qja", name = "u", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!qja", name = "p", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!qja", name = "r", descriptor = "Ljb;")
    public static class519 field4637 = new class519(62, 10);

    @OriginalMember(owner = "client!qja", name = "v", descriptor = "[F")
    public static float[] field4641 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qja", name = "w", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!qja", name = "k", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!qja", name = "l", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!qja", name = "m", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!qja", name = "n", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!qja", name = "o", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!qja", name = "q", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!qja", name = "s", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!qja", name = "t", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)Z")
    public final boolean method2110(int arg0) {
        field4634++;
        if (arg0 == 1) {
            return (this.field4635 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(BI)Lef;")
    public static final class513 method2111(byte arg0, int arg1) {
        field4630++;
        if (arg0 != 17) {
            field4642 = 12;
        }
        if (arg1 == 0) {
            if ((double) class752.field10166 == 3.0D) {
                return class171.field2242;
            }
            if ((double) class752.field10166 == 4.0D) {
                return class537.field7443;
            }
            if ((double) class752.field10166 == 6.0D) {
                return class698.field9253;
            }
            if ((double) class752.field10166 >= 8.0D) {
                return class490.field6824;
            }
        } else if (arg1 == 1) {
            if ((double) class752.field10166 == 3.0D) {
                return class698.field9253;
            }
            if ((double) class752.field10166 == 4.0D) {
                return class490.field6824;
            }
            if ((double) class752.field10166 == 6.0D) {
                return class43.field461;
            }
            if ((double) class752.field10166 >= 8.0D) {
                return class626.field8488;
            }
        } else if (arg1 == 2) {
            if ((double) class752.field10166 == 3.0D) {
                return class43.field461;
            }
            if ((double) class752.field10166 == 4.0D) {
                return class626.field8488;
            }
            if ((double) class752.field10166 == 6.0D) {
                return class577.field7875;
            }
            if ((double) class752.field10166 >= 8.0D) {
                return class55.field649;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(I)V")
    public static void method2112(int arg0) {
        field4637 = null;
        if (arg0 != 1) {
            field4637 = null;
        }
        field4641 = null;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)Z")
    public final boolean method2113(byte arg0) {
        if (arg0 == 58) {
            field4638++;
            return ((this.field4635 & 0x2BC928) >> 21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "(I)I")
    public final int method2114(int arg0) {
        field4639++;
        if (arg0 >= -91) {
            this.method2116(-19, 9);
        }
        return class452.method2687(1096584331, this.field4635);
    }

    @OriginalMember(owner = "client!qja", name = "f", descriptor = "(I)I")
    public final int method2115(int arg0) {
        field4636++;
        if (arg0 > -35) {
            field4641 = null;
        }
        return this.field4635 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)Z")
    public final boolean method2116(int arg0, int arg1) {
        field4632++;
        if (arg1 == 0) {
            return (this.field4635 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZI[BIIII)Z")
    public static final boolean method2117(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field4631++;
        int var7 = arg6 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg5 - 1) / arg1);
        if (arg0) {
            return false;
        }
        int var10 = -((arg1 + arg6 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg3] == 0) {
                    return true;
                }
                arg3 += arg1;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "(B)Z")
    public final boolean method2118(byte arg0) {
        if (arg0 > -30) {
            this.field4635 = -124;
        }
        field4633++;
        return (this.field4635 & 0x46414E) >> 22 != 0;
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(II)V")
    public class327(int arg0, int arg1) {
        this.field4640 = arg1;
        this.field4635 = arg0;
    }
}
