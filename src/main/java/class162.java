import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class162 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    private int[] field2888;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lpj;")
    public static class237 field2889 = class33.method353("Okay", 20);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lpj;")
    public static class237 field2886 = class33.method353("Cabbage", 26);

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lpj;")
    public static class237 field2891 = class33.method353("k", 37);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public final int method1141(int arg0, int arg1) {
        int var3 = 56 % ((arg1 - 84) / 34);
        int var4 = (this.field2888.length >> 1) - 1;
        field2892++;
        int var5 = arg0 & var4;
        while (true) {
            int var6 = this.field2888[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2888[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method1142(int arg0) {
        field2885++;
        if (class101.field1803 != null || class45.field972 != null) {
            return;
        }
        if (arg0 != 25) {
            method1143(-48);
        }
        int var1 = class123.field2173;
        if (class247.field4306) {
            if (var1 != 1) {
                int var6 = class174.field3059;
                int var7 = class28.field515;
                if (class269.field4599 - 10 > var7 || var7 > class269.field4599 + class23.field423 + 10 || class176.field3088 - 10 > var6 || var6 > class176.field3088 + class166.field2940 + 10) {
                    class247.field4306 = false;
                    class232.method1542(class23.field423, arg0 ^ 0xFFFF96F5, class166.field2940, class269.field4599, class176.field3088);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class176.field3088;
            int var9 = class269.field4599;
            int var10 = class23.field423;
            int var11 = class58.field1196;
            int var12 = -1;
            int var13 = class227.field3891;
            for (int var14 = 0; var14 < class271.field4664; var14++) {
                int var15 = (class271.field4664 - var14 - 1) * 15 + var8 + 31;
                if (var13 > var9 && (var9 + var10) > var13 && var11 > (var15 - 13) && (var15 + 3) > var11) {
                    var12 = var14;
                }
            }
            if (var12 != -1) {
                class19.method195(var12, 31040);
            }
            class247.field4306 = false;
            class232.method1542(class23.field423, -26900, class166.field2940, class269.field4599, class176.field3088);
            return;
        }
        if (var1 == 1 && class271.field4664 > 0) {
            short var2 = class235.field4090[class271.field4664 - 1];
            if (var2 == 39 || var2 == 1 || var2 == 12 || var2 == 51 || var2 == 8 || var2 == 48 || var2 == 20 || var2 == 24 || var2 == 2 || var2 == 16 || var2 == 25 || var2 == 1001) {
                int var3 = class119.field2089[class271.field4664 - 1];
                int var4 = class135.field2358[class271.field4664 - 1];
                class141 var5 = class70.method572(arg0 ^ 0x4E52, var4);
                if (class155.method1069(121, client.method1042(var5)) || class227.method1510(client.method1042(var5), -1496161763)) {
                    class184.field3227 = false;
                    class163.field2906 = 0;
                    if (class101.field1803 != null) {
                        class128.method911(class101.field1803, -17149);
                    }
                    class101.field1803 = class70.method572(20043, var4);
                    class69.field1362 = var3;
                    class110.field1935 = class58.field1196;
                    class49.field1064 = class227.field3891;
                    class128.method911(class101.field1803, arg0 - 17174);
                    return;
                }
            }
        }
        if (var1 == 1 && (class7.field93 == 1 && class271.field4664 > 2 || class77.method593(class271.field4664 - 1, (byte) 112))) {
            var1 = 2;
        }
        if (var1 == 2 && class271.field4664 > 0 || class260.field4465 == 1) {
            class158.method1119((byte) 91);
        }
        if (var1 == 1 && class271.field4664 > 0 || class260.field4465 == 2) {
            class235.method1568(-117);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2891 = null;
        field2886 = null;
        field2889 = null;
        if (arg0 != 23713) {
            field2889 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I)V")
    public class162(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2888 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2888[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2888[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2888[var5 + var5] = arg0[var4];
            this.field2888[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static final void method1144(boolean arg0) {
        if (arg0) {
            class274.field4775 = class69.field1355;
            class99.field1773 = class206.field3509;
        } else {
            class274.field4775 = class115.field2027;
            class99.field1773 = class74.field1421;
        }
        class158.field2852 = class274.field4775.length;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1145(byte arg0, int arg1) {
        field2887++;
        int var2 = -65 / ((arg0 + 82) / 41);
        return ((arg1 & 0x53F12E) >> 22) != 0;
    }
}
