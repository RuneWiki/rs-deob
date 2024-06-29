import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class191 extends class406 {

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Z")
    public static boolean field2751 = false;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1293(int arg0, int arg1) {
        class193 var2 = class250.field3570[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class193 var4 = class250.field3570[var3][arg0][arg1] = class250.field3570[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2777--;
                for (class250 var5 = var4.field2779; var5 != null; var5 = var5.field3568) {
                    class233 var6 = var5.field3571;
                    if (var6.field3268 == arg0 && var6.field3267 == arg1) {
                        var6.field3285--;
                    }
                }
            }
        }
        if (class250.field3570[0][arg0][arg1] == null) {
            class250.field3570[0][arg0][arg1] = new class193(0, arg0, arg1);
            class250.field3570[0][arg0][arg1].field2789 = 1;
        }
        class250.field3570[0][arg0][arg1].field2773 = var2;
        class250.field3570[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V", line = 48)
    public static final void method1294(int arg0, int arg1, int arg2, int arg3) {
        if (class87.field992 != null) {
            class87.field992[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IIII)V", line = 53)
    public static final void method1295(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg0 << 3;
        field2747++;
        int var6 = arg1 << 3;
        class441.field6333 = (float) var6;
        if (arg2 != 30176) {
            field2751 = true;
        }
        class292.field4085 = (float) var4;
        if (class129.field1568 == 2) {
            class377.field5324 = var6;
            class138.field1722 = var4;
            class232.field3265 = var5;
        }
        class223.method1494((byte) 116);
        class225.field3160 = true;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)I", line = 80)
    public static final int method1296(byte arg0, int arg1, int arg2) {
        field2745++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -123 % ((arg0 - 4) / 55);
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILdg;)V", line = 100)
    public static final void method1297(int arg0, class236 arg1) {
        field2752++;
        int var2 = arg1.method1594(-47);
        class441.field6328 = new class329[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class441.field6328[var3] = new class329();
            class441.field6328[var3].field4662 = arg1.method1594(arg0 - 21);
            class441.field6328[var3].field4659 = arg1.method1561((byte) -121);
        }
        class86.field977 = arg1.method1594(-87);
        class180.field2462 = arg1.method1594(-96);
        if (arg0 != -1) {
            field2751 = true;
        }
        class338.field4801 = arg1.method1594(-72);
        class166.field2330 = new class130[class180.field2462 + 1 - class86.field977];
        for (int var4 = 0; var4 < class338.field4801; var4++) {
            int var5 = arg1.method1594(-96);
            class130 var6 = class166.field2330[var5] = new class130();
            var6.field6323 = arg1.method1574(-126);
            var6.field6330 = arg1.method1597(arg0 ^ 0xFFFFF1C6);
            var6.field1575 = class86.field977 + var5;
            var6.field1573 = arg1.method1561((byte) -121);
            var6.field1586 = arg1.method1561((byte) -121);
        }
        class448.field6439 = arg1.method1597(3641);
        class141.field1741 = true;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V", line = 149)
    public static final void method1298(byte arg0, int arg1) {
        class237 var2 = class406.field5860;
        synchronized (class406.field5860) {
            class406.field5860.method1629(arg1, 70);
        }
        field2754++;
        class237 var3 = class66.field755;
        synchronized (class66.field755) {
            class66.field755.method1629(arg1, 64);
        }
        class101 var4 = class26.field322;
        synchronized (class26.field322) {
            class26.field322.method567((byte) -100, arg1);
        }
        if (arg0 != -42) {
            field2751 = true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II)V", line = 168)
    public class191(int arg0, int arg1) {
        this.field2749 = arg1;
        this.field2753 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(IIII)I", line = 180)
    public static final int method1299(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 63 % ((arg3 - 26) / 34);
        field2746++;
        if ((class399.field5699[arg2][arg1][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class399.field5699[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }
}
