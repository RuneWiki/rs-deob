import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lag;")
    private class469 field494;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lcq;")
    public static class107 field492;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public static int[] field491;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method203(int arg0) {
        field493++;
        class380.field5023 = new class122(8);
        class119.field1524 = 0;
        for (class514 var1 = (class514) class251.field3302.method1298((byte) 40); var1 != null; var1 = (class514) class251.field3302.method1305((byte) -126)) {
            var1.method2918();
        }
        if (arg0 > -54) {
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        field496++;
        this.field494.method2683(this.field498, 1);
        super.finalize();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lefa;", line = 36)
    public static final class153 method204(byte arg0, int arg1) {
        if (arg0 > -74) {
            field491 = null;
        }
        field495++;
        class153 var2 = (class153) class249.field3225.method2176(-124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field1481.method1938(arg1, 0, -17);
        class153 var4 = new class153();
        if (var3 != null) {
            var4.method896(49, new class157(var3));
        }
        var4.method897((byte) -70);
        class249.field3225.method2174(var4, (long) arg1, (byte) 19);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lr;B)V", line = 65)
    public static final void method205(class562 arg0, byte arg1) {
        field497++;
        int var2 = class114.field1464;
        if (arg1 != 44) {
            return;
        }
        int var3 = class102.field1224;
        int var4 = class172.field2446;
        int var5 = class464.field6078;
        int var6 = -10660793;
        arg0.method3118(true, var5, var2, var3, var4, var6);
        arg0.method3118(true, 16, var2 + 1, var3 + 1, var4 - 2, -16777216);
        arg0.method3126(var3 + 18, var2 + 1, var5 - 19, 1, var4 - 2, -16777216);
        class622.field8625.method2316(var2 + 3, var6, var3 + 14, class371.field4903.method2141(class422.field5539, true), -1, arg1 - 44);
        int var7 = class409.field5387.method1890(16777215);
        int var8 = class409.field5387.method1893((byte) 74);
        int var9 = 0;
        for (class354 var10 = (class354) class101.field1211.method2506(arg1 ^ 0x68); var10 != null; var10 = (class354) class101.field1211.method2505(-116)) {
            int var11 = (class137.field1873 - (var9 + 1)) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field4721) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class198.method1280(var10.field4729, -1007)) {
                var13 = class87.field1058.method1394(-45, (int) var10.field4723).field8058;
            } else if (var10.field4719 != -1) {
                var13 = class87.field1058.method1394(-89, var10.field4719).field8058;
            } else if (class258.method1561(var10.field4729, -114)) {
                class407 var16 = (class407) class296.field3921.method3057(arg1 - 43, (long) ((int) var10.field4723));
                if (var16 != null) {
                    class351 var17 = var16.field5354;
                    class384 var18 = var17.field4671;
                    if (var18.field5121 != null) {
                        var18 = var18.method2203(3, class564.field7696);
                    }
                    if (var18 != null) {
                        var13 = var18.field5091;
                    }
                }
            } else if (class125.method744(var10.field4729, 45)) {
                Object var14 = null;
                class600 var15;
                if (var10.field4729 == 1011) {
                    var15 = class118.field1510.method3921((int) var10.field4723, -69);
                } else {
                    var15 = class118.field1510.method3921((int) (var10.field4723 >>> 32 & 0x7FFFFFFFL), -114);
                }
                if (var15.field8257 != null) {
                    var15 = var15.method3324((byte) 78, class564.field7696);
                }
                if (var15 != null) {
                    var13 = var15.field8333;
                }
            }
            String var19 = class509.method2886(arg1 ^ 0xFFFFFFA1, var10);
            if (var13 != null) {
                var19 = var19 + class557.method3098(var13, 584);
            }
            class622.field8625.method2317(var11, (byte) 123, var2 + 3, 0, class466.field6127, class196.field2683, var12, var19);
            var9++;
            if (var10.field4726) {
                class121.field1581.method2990(var2 - (-class254.field3332.method3765(var19, (byte) 6) - 5), var11 + -12);
            }
        }
        class61.method342(class102.field1224, class172.field2446, class114.field1464, -122, class464.field6078);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIB)I", line = 171)
    public static final int method206(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -61) {
            return -17;
        }
        field499++;
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg3 : arg2;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg0) : arg3;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 194)
    public static void method207(boolean arg0) {
        field492 = null;
        field491 = null;
        if (arg0) {
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lag;II)V", line = 209)
    public class35(class469 arg0, int arg1, int arg2) {
        this.field498 = arg2;
        this.field494 = arg0;
    }
}
