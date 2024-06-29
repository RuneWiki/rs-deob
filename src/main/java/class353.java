import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class353 {

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Lw;")
    private class235 field5187 = new class235();

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lrr;")
    private class199 field5195 = new class199();

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    private int field5190;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    private int field5193;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Lsf;")
    private class143 field5192;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lwe;")
    public static class24 field5183 = new class24(64);

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lw;ZJ)V")
    public final void method2318(class235 arg0, boolean arg1, long arg2) {
        field5186++;
        if (this.field5193 == 0) {
            class235 var5 = this.field5195.method1243((byte) 67);
            var5.method2574((byte) 114);
            var5.method1439(-29183);
            if (this.field5187 == var5) {
                class235 var6 = this.field5195.method1243((byte) 67);
                var6.method2574((byte) 114);
                var6.method1439(-29183);
            }
        } else {
            this.field5193--;
        }
        this.field5192.method956(arg1, arg2, arg0);
        this.field5195.method1244(arg0, -26);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IJ)Lw;")
    public final class235 method2319(int arg0, long arg1) {
        field5191++;
        if (arg0 != -12) {
            method2325((String) null, 2, (String) null, 49L, 9, 6, false, 25, 67, false, true);
        }
        class235 var4 = (class235) this.field5192.method954(111, arg1);
        if (var4 != null) {
            this.field5195.method1244(var4, -26);
        }
        return var4;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public final void method2320(int arg0) {
        field5196++;
        this.field5195.method1246((byte) -118);
        this.field5192.method952(124);
        this.field5187 = new class235();
        this.field5193 = this.field5190;
        int var2 = 125 % ((arg0 - 36) / 49);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static final void method2321(int arg0) {
        field5189++;
        while (class114.field1556.method752(class413.field6176, (byte) 106) >= 11) {
            int var1 = class114.field1556.method763(11, false);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class125.field1664[var1] == null) {
                class125.field1664[var1] = new class194();
                class125.field1664[var1].field249 = var1;
                if (class165.field2155[var1] != null) {
                    class125.field1664[var1].method1214(class165.field2155[var1], arg0 ^ 0xFFFFE90D);
                }
                var2 = true;
            }
            class66.field943[class153.field2004++] = var1;
            class194 var3 = class125.field1664[var1];
            var3.field260 = class50.field698;
            int var4 = class114.field1556.method763(5, false);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class114.field1556.method763(5, false);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class114.field1556.method763(1, false);
            int var7 = class114.field1556.method763(1, false);
            if (var7 == 1) {
                class159.field2085[class439.field6430++] = var1;
            }
            int var8 = class120.field1616[class114.field1556.method763(3, false)];
            if (var2) {
                var3.method133(arg0 - 5886, var8);
            }
            var3.method1215(var6 == 1, true, class100.field1350.field306[0] + var4, class193.field2688, class100.field1350.field303[0] + var5);
        }
        if (arg0 != 5784) {
            method2324(-103, 49, 39, 26, true, 82, -113);
        }
        class114.field1556.method755(arg0 ^ 0x17D8);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZD)V")
    public static final void method2322(boolean arg0, double arg1) {
        if (class284.field4156 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class327.field4703[var3] = var4 > 255 ? 255 : var4;
            }
            class284.field4156 = arg1;
        }
        if (!arg0) {
            method2322(false, 0.6226619863472215D);
        }
        field5185++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method2323(byte arg0) {
        if (arg0 != -65) {
            field5183 = null;
        }
        field5183 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIZII)V")
    public static final void method2324(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5188++;
        if (arg0 >= class203.field2942 && class297.field4268 >= arg1 && class180.field2375 <= arg5 && class50.field695 >= arg3) {
            if (arg6 == 1) {
                class197.method1235((byte) -103, arg0, arg1, arg5, arg2, arg3);
            } else {
                class116.method821(-1, arg2, arg6, arg3, arg0, arg5, arg1);
            }
        } else if (arg6 == 1) {
            class101.method687(arg2, arg0, 921, arg3, arg1, arg5);
        } else {
            class125.method854(arg2, arg0, 115, arg5, arg3, arg1, arg6);
        }
        if (arg4) {
            field5183 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;JIIZIIZZ)V")
    public static final void method2325(String arg0, int arg1, String arg2, long arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
        field5197++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (arg8 != 24672) {
            method2324(96, 115, 38, 12, false, 20, -91);
        }
        class265 var14 = new class265(128);
        var14.method1707(-4, 10);
        var14.method1693((arg9 ? 4 : 0) | (arg6 ? 2 : 0) | (arg10 ? 1 : 0), (byte) 125);
        var14.method1689((byte) 119, arg3);
        var14.method1704(var12[0], (byte) 126);
        var14.method1662(arg2, (byte) -99);
        var14.method1704(var12[1], (byte) 125);
        var14.method1693(class196.field2804, (byte) 33);
        var14.method1707(-117, arg7);
        var14.method1707(-12, arg4);
        var14.method1704(var12[2], (byte) 125);
        var14.method1693(arg1, (byte) 104);
        var14.method1693(arg5, (byte) 118);
        var14.method1704(var12[3], (byte) 125);
        var14.method1703(class139.field1861, (byte) -120, class280.field4122);
        class265 var15 = new class265(350);
        var15.method1662(arg0, (byte) -124);
        int var16 = 8 - (class410.method2668((byte) -118, arg0) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1707(-108, (int) (Math.random() * 255.0D));
        }
        var15.method1690(0, var12);
        class232.field3279.field3915 = 0;
        class232.field3279.method1707(4, 22);
        class232.field3279.method1693(var15.field3915 + var14.field3915 + 2, (byte) 114);
        class232.field3279.method1693(562, (byte) 127);
        class232.field3279.method1676(0, -81, var14.field3879, var14.field3915);
        class232.field3279.method1676(0, -114, var15.field3879, var15.field3915);
        class212.field3008 = 0;
        class69.field959 = 0;
        class293.field4244 = -3;
        class239.field3379 = 1;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static final void method2326(int arg0) {
        field5194++;
        if (class59.field849 == 2) {
            return;
        }
        try {
            if (arg0 > -100) {
                field5183 = null;
            }
            class67.method434(class1.field9, (byte) -100, "tbrefresh");
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
    public class353(int arg0) {
        this.field5190 = arg0;
        this.field5193 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5192 = new class143(var2);
    }
}
