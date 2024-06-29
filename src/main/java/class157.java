import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class157 {

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "B")
    private byte field1758;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "Lpr;")
    public static class407 field1765 = new class407(116, 3);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "[Lxa;")
    public static class458[] field1766;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
    public final int method855(int arg0) {
        field1757++;
        if (arg0 != 23934) {
            this.field1758 = 8;
        }
        return (this.field1758 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILoa;)V")
    public static final void method856(int arg0, class635 arg1) {
        field1759++;
        arg1.method314(0, 0, class399.field5336, 350);
        arg1.method286(0, 0, class399.field5336, 350, class448.field6149 << 24 | 0x332277, arg0);
        int var2 = 350 / class375.field4871;
        if (class37.field413 > 0) {
            int var3 = 346 - class375.field4871 - 4;
            int var4 = var2 * var3 / (var2 + class37.field413 - 1);
            int var5 = 4;
            if (class37.field413 > 1) {
                var5 += (class37.field413 - class154.field1735 - 1) * (var3 - var4) / (class37.field413 - 1);
            }
            arg1.method286(class399.field5336 - 16, var5, 12, var4, class448.field6149 << 24 | 0x332277, 2);
            for (int var6 = class154.field1735; (class154.field1735 + var2) > var6 && var6 < class37.field413; var6++) {
                String[] var7 = class107.method674(class535.field7652[var6], arg0, '\b');
                int var8 = (class399.field5336 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method314(var10, 0, var8 + var10 - 8, 350);
                    class404.field5386.method1124(arg0 ^ 0x1, var7[var9], -1, -16777216, var10, 350 - class653.field9338.field9123 - ((-class154.field1735 + var6) * class375.field4871) - class492.field7136 - 2);
                }
            }
        }
        arg1.method314(0, 0, class399.field5336, 350);
        arg1.method3549(-1, class399.field5336, 350 - class492.field7136, 0, (byte) 54);
        class211.field2561.method1124(0, "--> " + class511.field7325, -1, -16777216, 10, 350 - (class612.field8650.field9123 + 1));
        if (!class412.field5476) {
            return;
        }
        int var11 = -1;
        if ((class469.field6549 % 30) > 15) {
            var11 = 16777215;
        }
        arg1.method3558(arg0 ^ 0x63, var11, class612.field8650.method3622(62, "--> " + class511.field7325.substring(0, class665.field9460)) + 10, -class612.field8650.field9123 + 350 + -11, 12);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lvp;IIII)V")
    public static final void method857(class172 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class66.method434(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class181.field2222) {
            class66.method434(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class66.method434(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class272.field3451) {
            class66.method434(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class272.field3451) {
            class66.method434(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class181.field2222 && arg4 <= class272.field3451) {
            class66.method434(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class66.method434(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class181.field2222 && arg4 > 0) {
            class66.method434(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field1765 = null;
        if (arg0 != -88) {
            field1766 = null;
        }
        field1766 = null;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)I")
    public final int method859(byte arg0) {
        if (arg0 == -4) {
            field1760++;
            return this.field1758 & 0x7;
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
    public class157() {
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Liaa;)V")
    public class157(class452 arg0) {
        this.field1758 = arg0.method2547(true);
        this.field1764 = arg0.method2574(-1758460248);
        this.field1767 = arg0.method2575((byte) -48);
        this.field1763 = arg0.method2575((byte) -48);
        this.field1762 = arg0.method2575((byte) -48);
        this.field1761 = arg0.method2575((byte) -48);
    }
}
