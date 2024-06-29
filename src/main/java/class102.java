import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class102 extends class112 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)I")
    public static final int method755(byte arg0, int arg1) {
        field1562++;
        double var2 = (double) ((arg1 & 0xFF2AEE) >> 16) / 256.0D;
        if (arg0 <= 118) {
            method760(50, -81, (class124) null, 86);
        }
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var6 > var10) {
            var10 = var6;
        }
        double var16 = (var8 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var14 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var18 >> 1) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public abstract void method109(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)V")
    public final void method756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1558++;
        int var6 = this.field1554 << 3;
        if (arg3 < 40) {
            this.field1556 = -109;
        }
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field1556 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method114(var6, var8, var7, var9, arg0, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public abstract void method113(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)[Lbf;")
    public static final class102[] method757(int arg0) {
        field1555++;
        class102[] var1 = new class102[class132.field2195];
        for (int var2 = arg0; var2 < class132.field2195; var2++) {
            int var3 = class4.field56[var2] * class19.field268[var2];
            byte[] var4 = class66.field1082[var2];
            if (class111.field1711[var2]) {
                int[] var5 = new int[var3];
                byte[] var6 = class92.field1452[var2];
                for (int var7 = 0; var7 < var3; var7++) {
                    var5[var7] = class140.method1045(class244.field3857[class64.method498(var4[var7], 255)], class64.method498(var6[var7], 255) << 24);
                }
                var1[var2] = new class202(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], var5);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class244.field3857[class64.method498(255, var4[var9])];
                }
                var1[var2] = new class17(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], var8);
            }
        }
        class213.method1410(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)V")
    public static final void method758(boolean arg0) {
        class23.field350.method1156(-80);
        field1566++;
        if (arg0) {
            method758(false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public abstract void method111(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    public abstract void method124(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lig;B)Ljava/lang/String;")
    public static final String method759(class136 arg0, byte arg1) {
        field1563++;
        return arg1 == 86 ? class262.method1757(arg1 - 24357, 32767, arg0) : null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILsb;I)Lcj;")
    public static final class74 method760(int arg0, int arg1, class124 arg2, int arg3) {
        if (arg3 >= -120) {
            return null;
        } else {
            field1565++;
            return class113.method833(arg0, arg2, arg1, -115) ? class279.method1879((byte) 77) : null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
    public abstract void method125(int arg0, int arg1);
}
