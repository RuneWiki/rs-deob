import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lvc;")
    public static class137 field936 = class45.method325("Offline", -46);

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field939 = 127;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lia;")
    public static class57 field931;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZILwc;)V")
    public static final void method301(int arg0, int arg1, boolean arg2, int arg3, class143 arg4) {
        field933++;
        if (class68.field1394 >= 50 || field939 == 0 || (arg4.field3392 == null || arg3 >= arg4.field3392.length)) {
            return;
        }
        int var5 = arg4.field3392[arg3];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 4 & 0x7;
        int var7 = var5 >> 8;
        class36.field798[class68.field1394] = var7;
        int var8 = (arg0 - 64) / 128;
        if (arg2) {
            method301(-13, 106, true, 64, null);
        }
        class126.field2960[class68.field1394] = var6;
        int var9 = (arg1 - 64) / 128;
        int var10 = var5 & 0xF;
        class38.field831[class68.field1394] = 0;
        class103.field2396[class68.field1394] = null;
        class83.field1871[class68.field1394] = (var9 << 8) + (var8 << 16) + var10;
        class68.field1394++;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class43() {
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method302(byte arg0) {
        if (arg0 <= 0) {
            field931 = null;
            field936 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lg;)V")
    public class43(class43 arg0) {
        this.field934 = arg0.field934;
        this.field935 = arg0.field935;
        this.field932 = arg0.field932;
        this.field937 = arg0.field937;
    }
}
