import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class138 {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public static int[] field2123 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    public static int[] field2122 = new int[100];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2127 = 2;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lub;")
    public static class43 field2119;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[B")
    public byte[] field2125;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[B")
    public byte[] field2130;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[Lub;")
    public static class43[] field2120;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method862(boolean arg0) {
        class44.field520.field699 = 0;
        class125.field1767 = 0;
        class62.field855 = 0;
        class133.field1900 = -1;
        class171.field2871 = -1;
        class70.field979 = -1;
        class160.field2574 = arg0;
        class76.field1096 = 0;
        class195.field3432 = -1;
        field2134++;
        class156.field2510 = 0;
        class84.field1233 = 0;
        class229.field4077.field699 = 0;
        class12.field133 = 0;
        for (int var1 = 0; var1 < class247.field4397.length; var1++) {
            if (class247.field4397[var1] != null) {
                class247.field4397[var1].field2075 = -1;
            }
        }
        for (int var2 = 0; var2 < class153.field2482.length; var2++) {
            if (class153.field2482[var2] != null) {
                class153.field2482[var2].field2075 = -1;
            }
        }
        class181.method1184((byte) -59);
        class202.field3597 = 1;
        class180.method1182((byte) -101, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class161.field2588[var3] = true;
        }
        class62.field862.method1653(-50);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lp;B)Llb;")
    public static final class35 method863(class56 arg0, byte arg1) {
        if (arg1 != -21) {
            method864(16, 120);
        }
        field2116++;
        class35 var2 = new class35();
        var2.field418 = arg0.method318(true);
        var2.field419 = class40.method207(var2.field418, -120);
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static final int method864(int arg0, int arg1) {
        field2118++;
        class126 var2 = class185.method1210(arg1, 65535);
        int var3 = var2.field1788;
        if (arg0 == 0) {
            int var4 = var2.field1791;
            int var5 = var2.field1783;
            int var6 = class84.field1232[var4 - var5];
            return class215.field3873[var3] >> var5 & var6;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method865(int arg0) {
        field2119 = null;
        field2123 = null;
        field2120 = null;
        int var1 = 33 / ((arg0 + 91) / 35);
        field2122 = null;
    }
}
