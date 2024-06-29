import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class454 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lwp;")
    public static class453 field5815 = new class453(0, -2);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field5822 = -1;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 3)
    public static void method2428(byte arg0) {
        field5815 = null;
        if (arg0 != 57) {
            method2432(91);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)S", line = 13)
    public static final short method2429(int arg0, int arg1) {
        field5817++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x387) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        if (arg0 != 0) {
            method2429(78, 76);
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Canvas;Lfa;I)Lr;", line = 49)
    public static final class566 method2430(int arg0, Canvas arg1, class526 arg2, int arg3) {
        if (arg3 == 191) {
            field5819++;
            return new class548(arg1, arg2, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 62)
    public static final int method2431(int arg0, String arg1, String arg2, int arg3) {
        field5816++;
        int var4 = arg2.length();
        if (arg3 > -100) {
            field5815 = null;
        }
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class312.method1810(var22, true);
            var9 = class312.method1810(var24, true);
            char var26 = class67.method396(arg0, true, var22);
            char var27 = class67.method396(arg0, true, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class156.method892(var28, arg0, 93) - class156.method892(var29, arg0, 125);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class156.method892(var20, arg0, 102) - class156.method892(var21, arg0, 93);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class156.method892(var14, arg0, 93) - class156.method892(var15, arg0, 116);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 190)
    public static final void method2432(int arg0) {
        field5818++;
        if (class174.field2265) {
            return;
        }
        if (class301.field3698.field6607) {
            class331.field4223 = ((int) class331.field4223 + 191 & 0xFFFFFF80);
        } else {
            class539.field7228 += (24.0F - class539.field7228) / 2.0F;
        }
        if (arg0 == 191) {
            class174.field2265 = true;
            class365.field4649 = true;
        }
    }
}
