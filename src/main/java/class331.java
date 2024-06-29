import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class331 extends class626 {

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4680 = new Rectangle[100];

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
    public final int method2112(int arg0) {
        field4678++;
        if (arg0 != -1) {
            this.method2117(true);
        }
        return this.field4679 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
    public static void method2113(byte arg0) {
        if (arg0 != -57) {
            method2113((byte) -21);
        }
        field4680 = null;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)Z")
    public final boolean method2114(int arg0) {
        if (arg0 != 2) {
            this.method2115(-35);
        }
        field4676++;
        return ((this.field4679 & 0x6ED39D) >> 22) != 0;
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)Z")
    public final boolean method2115(int arg0) {
        if (arg0 != 1973135573) {
            this.method2117(false);
        }
        field4677++;
        return (this.field4679 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)Z")
    public final boolean method2116(byte arg0, int arg1) {
        field4673++;
        if (arg0 < 4) {
            this.field4679 = -86;
        }
        return (this.field4679 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)Z")
    public final boolean method2117(boolean arg0) {
        field4674++;
        if (arg0) {
            return (this.field4679 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)I")
    public final int method2118(boolean arg0) {
        field4681++;
        if (!arg0) {
            field4680 = null;
        }
        return class233.method1586(this.field4679, 112);
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(II)V")
    public class331(int arg0, int arg1) {
        this.field4679 = arg0;
        this.field4675 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ld;IIIIILha;)V")
    public static final void method2119(class149 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6) {
        field4672++;
        if (class442.field6163 < 100) {
            class335.method2143(arg6, arg0, -3993);
        }
        arg6.method584(arg5, arg4, arg1 + arg5, arg2 + arg4);
        if (arg3 > -74) {
            field4680 = null;
        }
        if (class442.field6163 < 100) {
            byte var7 = 20;
            int var8 = arg5 + (arg1 / 2);
            arg6.method630(arg5, arg4, arg1, arg2, -16777216, 0);
            int var9 = arg4 - var7 - (-(arg2 / 2) + 18);
            arg6.method616(var8 - 152, var9, 304, 34, class34.field446[class54.field1035].getRGB(), 0);
            arg6.method630(var8 - 150, var9 + 2, class442.field6163 * 3, 30, class668.field9368[class54.field1035].getRGB(), 0);
            class537.field7568.method651(var8, var9 + var7, class281.field3959.method1839((byte) 45, class744.field10426), class369.field5172[class54.field1035].getRGB(), (byte) 118, -1);
            return;
        }
        int var10 = class587.field8271 - (int) ((float) arg1 / class542.field7623);
        int var11 = class590.field8288 + ((int) ((float) arg2 / class542.field7623));
        int var12 = (int) ((float) arg1 / class542.field7623) + class587.field8271;
        int var13 = class590.field8288 - ((int) ((float) arg2 / class542.field7623));
        class618.field8928 = (int) ((float) (arg1 * 2) / class542.field7623);
        class189.field2728 = (int) ((float) (arg2 * 2) / class542.field7623);
        class158.field2366 = class587.field8271 - ((int) ((float) arg1 / class542.field7623));
        class478.field6823 = class590.field8288 - ((int) ((float) arg2 / class542.field7623));
        class542.method3198(class542.field7632 + var10, class542.field7644 + var11, class542.field7632 + var12, class542.field7644 + var13, arg5, arg4, arg1 + arg5, arg4 - -arg2 + 1);
        class542.method3189(arg6);
        class220 var14 = class542.method3192(arg6);
        class380.method2379(0, arg6, var14, (byte) -51, 0);
        if (class613.field8875 > 0) {
            class170.field2485--;
            if (class170.field2485 == 0) {
                class170.field2485 = 20;
                class613.field8875--;
            }
        }
        if (!class143.field2194) {
            return;
        }
        int var15 = arg1 + arg5 - 5;
        int var16 = arg2 + arg4 - 8;
        class722.field10090.method662(var15, -1, 16776960, "Fps:" + class77.field1452, var16, (byte) 113);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class722.field10090.method662(var15, -1, var19, "Mem:" + var18 + "k", var20, (byte) 110);
        var16 = var20 - 15;
    }
}
