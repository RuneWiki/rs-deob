import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class115 extends class166 {

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Z")
    public boolean field2411 = false;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Lcd;")
    public static class23 field2409 = class54.method414(" zuerst von Ihrer Freunde)2Liste(Q", -1);

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lcd;")
    private static class23 field2402 = class54.method414("go back to the main RuneScape webpage", -1);

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "Lcd;")
    public static class23 field2403 = field2402;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "Lcd;")
    public static class23 field2407 = class54.method414(" loggt sich aus)3", -1);

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Lcd;")
    public static class23 field2410 = class54.method414("headicons_prayer", -1);

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public static final void method731(int arg0) {
        field2405++;
        class108.field2307 = 0;
        class104.field2264 = 0;
        class35.method250(false);
        class139.method884((byte) -113);
        class66.method487((byte) -92);
        if (arg0 != 2) {
            method733((byte) -17, true);
        }
        class56.method436(78);
        for (int var1 = 0; var1 < class104.field2264; var1++) {
            int var3 = class56.field1310[var1];
            if (class15.field339 != class95.field2007[var3].field266) {
                class95.field2007[var3] = null;
            }
        }
        if (class199.field3900 != class81.field1769.field3752) {
            throw new RuntimeException("gpp1 pos:" + class81.field1769.field3752 + " psize:" + class199.field3900);
        }
        for (int var2 = 0; var2 < class57.field1348; var2++) {
            if (class95.field2007[class69.field1622[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class57.field1348);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLkh;)V")
    public static final void method732(byte arg0, class97 arg1) {
        class124.field2548 = arg1;
        if (arg0 < 0) {
            method734(false);
        }
        field2406++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
    public static final void method733(byte arg0, boolean arg1) {
        field2401++;
        if (class61.field1418 == null) {
            return;
        }
        try {
            if (arg0 <= 71) {
                field2404 = 92;
            }
            class189 var2 = new class189(4);
            var2.method1180(arg1 ? 2 : 3, (byte) 69);
            var2.method1219(0, false);
            class61.field1418.method495(4, var2.field3753, (byte) 96, 0);
        } catch (IOException var4) {
            try {
                class61.field1418.method501(false);
            } catch (Exception var3) {
            }
            class61.field1418 = null;
            class39.field846++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method734(boolean arg0) {
        field2403 = null;
        field2402 = null;
        field2409 = null;
        field2410 = null;
        field2407 = null;
        if (arg0) {
            field2409 = null;
        }
    }
}
