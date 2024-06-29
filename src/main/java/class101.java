import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class101 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[Lge;")
    public static class69[] field1857;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
    public static final boolean method857(byte arg0) {
        if (arg0 >= -69) {
            field1857 = null;
        }
        field1860++;
        try {
            return class77.method636(16);
        } catch (IOException var4) {
            class133.method1039(15);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class259.field4572 + "," + class170.field3013 + "," + class15.field350 + " - " + class16.field368 + "," + (class56.field1033.field2296[0] + class272.field4795) + "," + (class56.field1033.field2253[0] + class155.field2759) + " - ";
            for (int var3 = 0; class16.field368 > var3 && var3 < 50; var3++) {
                var2 = var2 + class183.field3182.field269[var3] + ",";
            }
            class154.method1177(var5, (byte) -94, var2);
            class128.method1006(-26);
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method858(boolean arg0, int arg1) {
        if (!arg0) {
            field1857 = null;
        }
        field1861++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public static final void method859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -27188) {
            method857((byte) -5);
        }
        class68.field1270 = -1;
        field1862++;
        class160.field2858 = -1;
        class79.field1446 = class249.field4417 * arg2 / arg1;
        class149.field2671 = class237.field4094 * arg0 / arg4;
        class38.method343(124);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method860(byte arg0) {
        field1857 = null;
        if (arg0 < 100) {
            method858(true, -91);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
    public static final int method861(int arg0, int arg1) {
        if (arg0 > -126) {
            return 70;
        } else {
            field1859++;
            return arg1 >> 18 & 0x7;
        }
    }
}
