import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class249 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4308 = 0;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lmb;")
    public static class96 field4314 = class243.method1708("::noclip", (byte) 97);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lmb;")
    public static class96 field4313 = class243.method1708("hitmarks", (byte) 109);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "J")
    public long field4304;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lh;")
    public class249 field4302;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lh;")
    public class249 field4307;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1738(int arg0) {
        field4313 = null;
        int var1 = 71 % ((arg0 + 82) / 35);
        field4314 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IJ)V")
    public static final void method1739(int arg0, long arg1) {
        field4311++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class76.field1306 < 100 || class193.field3332) || class76.field1306 >= 200) {
            class226.method1540(class120.field2227, 0, (byte) -60, class127.field2329);
            return;
        }
        class96 var3 = class57.method421((byte) -114, arg1).method706((byte) -128);
        for (int var4 = 0; var4 < class76.field1306; var4++) {
            if (class250.field4317[var4] == arg1) {
                class226.method1540(class120.field2227, 0, (byte) 99, class36.method289(-5615, new class96[] { var3, class241.field4186 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class231.field3974; var5++) {
            if (class7.field132[var5] == arg1) {
                class226.method1540(class120.field2227, 0, (byte) -86, class36.method289(-5615, new class96[] { class121.field2231, var3, class100.field1691 }));
                return;
            }
        }
        if (var3.method705(0, class236.field4047.field828)) {
            class226.method1540(class120.field2227, 0, (byte) -121, class169.field2975);
            return;
        }
        class185.field3224[class76.field1306] = var3;
        if (arg0 >= -50) {
            return;
        }
        class216.field3706++;
        class250.field4317[class76.field1306] = arg1;
        class251.field4337[class76.field1306] = 0;
        class251.field4336[class76.field1306] = class120.field2227;
        class124.field2298[class76.field1306] = 0;
        class86.field1454[class76.field1306] = false;
        class76.field1306++;
        class208.field3588 = class67.field1137;
        class140.field2505.method1012((byte) -26, 46);
        class140.field2505.method1668(arg1, -112);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Z")
    public final boolean method1740(byte arg0) {
        field4303++;
        if (arg0 == 69) {
            return this.field4302 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BB)I")
    public static final int method1741(int arg0, byte[] arg1, byte arg2) {
        int var3 = 7 % ((arg2 + 9) / 35);
        field4306++;
        return class272.method1855(0, arg0, arg1, (byte) 41);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method1742(boolean arg0) {
        if (arg0) {
            class259.field4487 = class159.field2828;
            class173.field3022 = class25.field418;
        } else {
            class259.field4487 = class32.field501;
            class173.field3022 = class106.field1790;
        }
        class163.field2893 = class259.field4487.length;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public final void method1743(byte arg0) {
        field4305++;
        if (this.field4302 == null) {
            return;
        }
        this.field4302.field4307 = this.field4307;
        this.field4307.field4302 = this.field4302;
        this.field4302 = null;
        this.field4307 = null;
        if (arg0 < 3) {
            field4309 = 95;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)Lmb;")
    public static final class96 method1744(boolean arg0, int arg1, int arg2) {
        field4310++;
        return arg2 == 0 ? class137.method1022(arg0, (byte) -102, 10, arg1) : null;
    }
}
