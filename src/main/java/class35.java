import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class35 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field485 = 100;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field483 = -1;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[Lth;")
    public static class108[] field491 = new class108[2048];

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lhj;")
    public static class69 field490 = class181.method1318("gleiten:", (byte) -117);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public static final int method186(int arg0, int arg1, int arg2) {
        field489++;
        if (~arg2 == arg1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method187(byte arg0) {
        class9.field66++;
        if (arg0 == -100) {
            field488++;
            class48.field692.method301(156, -104);
            class48.field692.method943((byte) 127, class228.field4169);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        field487++;
        if (arg0 >= -16) {
            method186(39, 112, 29);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class40.field576[var1] = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method189(int arg0) {
        field491 = null;
        field490 = null;
        if (arg0 != 31567) {
            method189(-52);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmi;I)Lmi;")
    public abstract class245 method190(class245 arg0, int arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -3603) {
            return;
        }
        field486++;
        class15.method89(arg0, arg2, arg0 + arg1, arg2 + arg4);
        class15.method77(arg0, arg2, arg1, arg4, 0);
        if (class21.field296 < 100) {
            return;
        }
        if (class19.field243 == null || class19.field243.field1010 != arg1 || class19.field243.field999 != arg4) {
            class264 var5 = new class264(arg1, arg4);
            class15.method98(var5.field4704, arg1, arg4);
            class94.method686((byte) 86, 0, 0, class22.field306, arg4, 0, 0, class84.field1626, arg1);
            class19.field243 = var5;
            class84.field1623.method550(-126);
        }
        class19.field243.method333(arg0, arg2);
        int var6 = class76.field1484 * arg4 / class22.field306 + arg2;
        int var7 = arg0 + (class141.field2644 * arg1 / class84.field1626);
        int var8 = class149.field2775 * arg1 / class84.field1626;
        int var9 = class239.field4391 * arg4 / class22.field306;
        class15.method95(var7, var6, var8, var9, 16711680, 128);
        class15.method82(var7, var6, var8, var9, 16711680);
        if (class118.field2243 <= 0 || (class118.field2243 % 10) >= 5) {
            return;
        }
        for (class268 var10 = (class268) class231.field4224.method1724(255); var10 != null; var10 = (class268) class231.field4224.method1726(arg3 + 3705)) {
            if (class208.field3796 == var10.field4776) {
                int var11 = var10.field4761 * arg1 / class84.field1626 + arg0;
                int var12 = var10.field4765 * arg4 / class22.field306 + arg2;
                class15.method77(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }
}
