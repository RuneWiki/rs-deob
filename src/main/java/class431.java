import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class431 {

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public int field6095 = 8;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public int field6096 = 16777215;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field6092 = 0;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6090 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "Z")
    public boolean field6098;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()V", line = 7)
    public static final void method2716() {
        for (int var0 = 0; var0 < class52.field730; var0++) {
            class447 var1 = class21.field384[var0];
            class278.method1811(var1);
            class21.field384[var0] = null;
        }
        class52.field730 = 0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 21)
    public static final void method2717(int arg0) {
        field6099++;
        class389.field5591 = arg0;
        int var1 = (class412.field5841.field6262 >> 7) + class212.field2968;
        int var2 = (class412.field5841.field6266 >> 7) + class447.field6269;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class389.field5591 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class389.field5591 = 1;
        }
        if (class389.field5591 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class389.field5591 = 0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lkh;BI)V", line = 44)
    public final void method2718(class11 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method172((byte) 52);
            if (var4 == 0) {
                if (arg1 != -29) {
                    method2719(111);
                }
                field6091++;
                return;
            }
            this.method2720(arg0, var4, arg2, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 67)
    public static void method2719(int arg0) {
        if (arg0 != 15476) {
            field6090 = null;
        }
        field6090 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lkh;IIB)V", line = 83)
    private final void method2720(class11 arg0, int arg1, int arg2, byte arg3) {
        field6087++;
        if (arg3 < 76) {
            return;
        }
        if (arg1 == 1) {
            this.field6095 = arg0.method174(255);
        } else if (arg1 == 2) {
            this.field6098 = true;
        } else if (arg1 == 3) {
            this.field6086 = arg0.method207(7124);
            this.field6089 = arg0.method207(7124);
            this.field6088 = arg0.method207(7124);
        } else if (arg1 == 4) {
            this.field6093 = arg0.method172((byte) 52);
        } else if (arg1 == 5) {
            this.field6094 = arg0.method174(255);
            return;
        } else if (arg1 == 6) {
            this.field6096 = arg0.method208(27308);
            return;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILjm;IZI)V", line = 129)
    public static final void method2721(int arg0, int arg1, class411 arg2, int arg3, boolean arg4, int arg5) {
        int var6 = -43 % ((48 - arg3) / 41);
        field6097++;
        if (class108.field1556 >= 50 || arg2 == null || arg2.field5827 == null || arg2.field5827.length <= arg5 || arg2.field5827[arg5] == null) {
            return;
        }
        int var7 = arg2.field5827[arg5][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE3) >> 5;
        if (arg2.field5827[arg5].length > 1) {
            int var10 = (int) ((double) arg2.field5827[arg5].length * Math.random());
            if (var10 > 0) {
                var8 = arg2.field5827[arg5][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg4) {
                class273.method1780(var8, 30346, 255, var9, 0);
            }
        } else if (class345.field4692 != 0) {
            class406.field5777[class108.field1556] = var8;
            class59.field810[class108.field1556] = var9;
            class156.field2199[class108.field1556] = 0;
            class228.field3321[class108.field1556] = null;
            class123.field1702[class108.field1556] = 255;
            int var12 = (arg1 - 64) / 128;
            int var13 = (arg0 - 64) / 128;
            class428.field6063[class108.field1556] = (var12 << 16) + (var13 << 8) + var11;
            class108.field1556++;
        }
    }
}
