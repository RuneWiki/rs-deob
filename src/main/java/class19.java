import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class19 extends class154 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[B")
    public byte[] field319;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static final void method128(int arg0) {
        class35.field531.method944(114);
        if (arg0 != 0) {
            field318 = -125;
        }
        class126.field1759.method944(-127);
        field323++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILnj;I)V")
    public static final void method129(int arg0, int arg1, int arg2, class240 arg3, int arg4) {
        if (arg4 < 5) {
            return;
        }
        field320++;
        for (class309 var5 = (class309) class153.field2128.method369((byte) -127); var5 != null; var5 = (class309) class153.field2128.method362(false)) {
            if (var5.field4968 == arg0 && arg2 * 128 == var5.field4980 && arg1 * 128 == var5.field4971 && var5.field4975.field3710 == arg3.field3710) {
                if (var5.field4979 != null) {
                    class116.field1671.method910(var5.field4979);
                    var5.field4979 = null;
                }
                if (var5.field4978 != null) {
                    class116.field1671.method910(var5.field4978);
                    var5.field4978 = null;
                }
                var5.method962(128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
    public static final boolean method130(byte arg0) {
        field317++;
        class179 var1 = class257.field4154;
        synchronized (class257.field4154) {
            if (class93.field1364 == class145.field2005) {
                return false;
            }
            class113.field1618 = class242.field3806[class93.field1364];
            if (arg0 != 120) {
                field318 = 101;
            }
            class27.field432 = class197.field3022[class93.field1364];
            class93.field1364 = class93.field1364 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field319 = arg0;
    }
}
