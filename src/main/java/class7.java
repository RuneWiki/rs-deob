import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class7 {

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Ltb;")
    private class450 field149 = new class450(256);

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Len;")
    private class478 field151;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lfa;")
    private class526 field156;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field147++;
        int var7 = class605.method3315(arg5, 4095, class289.field3595, class159.field2063);
        int var8 = class605.method3315(arg3, 4095, class289.field3595, class159.field2063);
        int var9 = class605.method3315(arg0, 4095, class263.field3294, class314.field4052);
        int var10 = class605.method3315(arg1, 4095, class263.field3294, class314.field4052);
        int var11 = class605.method3315(arg4 + arg5, 4095, class289.field3595, class159.field2063);
        int var12 = class605.method3315(arg3 - arg4, 4095, class289.field3595, class159.field2063);
        for (int var13 = var7; var13 < var11; var13++) {
            class57.method362(var9, class550.field7650[var13], arg2, var10, 69);
        }
        if (!arg6) {
            return;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class57.method362(var9, class550.field7650[var14], arg2, var10, -119);
        }
        int var15 = class605.method3315(arg0 + arg4, 4095, class263.field3294, class314.field4052);
        int var16 = class605.method3315(arg1 - arg4, 4095, class263.field3294, class314.field4052);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class550.field7650[var17];
            class57.method362(var9, var18, arg2, var15, 34);
            class57.method362(var16, var18, arg2, var10, 18);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
    public static final boolean method55(byte arg0, int arg1, int arg2) {
        field153++;
        if (arg0 <= 20) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public final void method56(int arg0) {
        this.field149.method2411(true, 5);
        if (arg0 <= 94) {
            this.method57(-45, -109);
        }
        field150++;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lls;")
    public final class459 method57(int arg0, int arg1) {
        if (arg1 != -23049) {
            method58(-76);
        }
        field152++;
        Object var3 = this.field149.method2418((long) arg0, (byte) 100);
        if (var3 != null) {
            return (class459) var3;
        } else if (this.field156.method2480(false, arg0)) {
            class13 var4 = this.field156.method2486(arg0, (byte) 86);
            int var5 = var4.field241 ? 64 : this.field151.field6262;
            class459 var7;
            if (var4.field245 && this.field151.method1006()) {
                float[] var6 = this.field156.method2483(110, var5, false, 0.7F, var5, arg0);
                var7 = this.field151.method2532(var5, var6, class590.field8288, var4.field232 != 0, var5, arg1 + 23049);
            } else {
                int[] var8 = !var4.field244 && class639.method3580(-30497, var4.field234) ? this.field156.method2481(arg0, 0.7F, true, var5, -5969, var5) : this.field156.method2488(0.7F, var5, (byte) 23, false, var5, arg0);
                var7 = this.field151.method2576(var5, var4.field232 != 0, var5, var8, (byte) 70);
            }
            var7.method525((byte) -81, var4.field243, var4.field238);
            this.field149.method2409((long) arg0, var7, arg1 ^ 0xFFFFA5F6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
    public static final void method58(int arg0) {
        class665.method3742(class32.field452, (long) class133.field1735, 27063);
        field157++;
        int var1 = -37 / ((arg0 - 56) / 59);
        if (class316.field4063 != -1) {
            class531.method2885(-69, class316.field4063);
        }
        for (int var2 = 0; var2 < class66.field905; var2++) {
            if (class413.field5168[var2]) {
                class177.field2286[var2] = true;
            }
            class472.field5994[var2] = class413.field5168[var2];
            class413.field5168[var2] = false;
        }
        class412.field5149 = class133.field1735;
        if (class316.field4063 != -1) {
            class66.field905 = 0;
            class514.method2784(16383);
        }
        class32.field452.method1017();
        class414.method2205(2, class32.field452);
        int var3 = class311.method1797(-3);
        if (var3 == -1) {
            var3 = class474.field6013;
        }
        if (var3 == -1) {
            var3 = class224.field2810;
        }
        class258.method1508(true, var3);
        class653.field9220 = 0;
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
    public final void method59(int arg0) {
        if (arg0 != 0) {
            this.field149 = null;
        }
        this.field149.method2406(18385);
        field155++;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method60(byte arg0, int arg1) {
        if (arg0 == 82) {
            field154++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "(I)V")
    public static final void method61(int arg0) {
        for (class480 var1 = (class480) class586.field8174.method807(true); var1 != null; var1 = (class480) class586.field8174.method807(true)) {
            class415.method2210((byte) -45, var1);
        }
        field148++;
        int var2;
        int var3;
        if (class301.field3698.method135(class651.field9191, 111)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class667.field9402;
            var3 = class667.field9402;
        }
        client.method3803();
        int var4 = var3;
        if (arg0 != 255) {
            method60((byte) 88, 75);
        }
        while (var2 >= var4) {
            client.method3801();
            client.method3818(var4);
            client.method3804(var4);
            var4++;
        }
        client.method3815();
        client.method3811();
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Len;Lfa;)V")
    public class7(class478 arg0, class526 arg1) {
        this.field151 = arg0;
        this.field156 = arg1;
    }
}
