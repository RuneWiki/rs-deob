import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class192 {

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lmt;")
    public static class276 field2732 = new class276(1, 2, 2, 0);

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
    public static boolean field2735 = false;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lkn;")
    public static class530 field2734 = new class530("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field2734 = null;
        field2732 = null;
        if (arg0 <= 59) {
            field2735 = false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V")
    public static final void method1221(byte arg0, int arg1) {
        class481.method2775(0);
        field2731++;
        class387.method2239(-90);
        class165.method1045(arg1, false, true);
        class433.method2556(7, class61.field761, class385.field5414, class478.field6666);
        class29.method182(class61.field761, class385.field5414, -115);
        class267.method1689(false);
        if (arg0 != -87) {
            field2735 = true;
        }
        class190.method1214(92, class90.field1122);
        class385.method2235((byte) 120);
        class217.method1351(arg0 ^ 0x3);
        if (class488.field6832 == 2) {
            class86.method623(3, (byte) -62);
        } else if (class488.field6832 == 6) {
            class86.method623(7, (byte) -31);
        } else if (class488.field6832 == 9) {
            class86.method623(10, (byte) -79);
            return;
        } else if (class488.field6832 == 1) {
            class300.method1835(class61.field761, class385.field5414, arg0 + 89);
            return;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public static final void method1222(int arg0) {
        field2736++;
        class279.field4128 = arg0;
        int var1 = class264.field3874.method2361(255);
        int var2 = class264.field3874.method2334(-128);
        int var3 = class264.field3874.method2338(0);
        boolean var4 = class264.field3874.method2370((byte) 41) == 1;
        class9.method57(-99);
        class54.method458((byte) 59, var1);
        int var5 = (class190.field2715 - class264.field3874.field5665) / 16;
        class326.field4755 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class326.field4755[var6][var10] = class264.field3874.method2319((byte) 112);
            }
        }
        class414.field5848 = new int[var5];
        class236.field3434 = new int[var5];
        class498.field7054 = null;
        class422.field5944 = new int[var5];
        class502.field7100 = new byte[var5][];
        class196.field2778 = new byte[var5][];
        class332.field4827 = new int[var5];
        class85.field1066 = null;
        class104.field1371 = new byte[var5][];
        class518.field7630 = new byte[var5][];
        class45.field519 = new int[var5];
        int var7 = 0;
        for (int var8 = (var3 - (class43.field494 >> 4)) / 8; var8 <= (((class43.field494 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var2 - (class500.field7068 >> 4)) / 8; var9 <= (var2 + (class500.field7068 >> 4)) / 8; var9++) {
                class332.field4827[var7] = (var8 << 8) + var9;
                class422.field5944[var7] = class189.field2710.method429("m" + var8 + "_" + var9, -1);
                class45.field519[var7] = class189.field2710.method429("l" + var8 + "_" + var9, arg0 - 1);
                class414.field5848[var7] = class189.field2710.method429("um" + var8 + "_" + var9, -1);
                class236.field3434[var7] = class189.field2710.method429("ul" + var8 + "_" + var9, arg0 - 1);
                var7++;
            }
        }
        class335.method2003(10, -11, var3, var4, var2);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)I")
    public static final int method1223(int arg0, int arg1, int arg2, int arg3) {
        field2733++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg0;
        int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg0 >> 7;
        int var6 = 81 / ((arg1 - 21) / 38);
        int var7 = (arg2 & 0x380) * var4 + ((arg3 & 0x380) * arg0) >> 7;
        int var8 = (arg2 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg0 >> 7;
        return var5 & 0x7F | var7 & 0x380 | var8 & 0xFC00;
    }
}
