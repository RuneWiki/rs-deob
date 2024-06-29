import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class159 {

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lhl;")
    public static class139 field2317 = new class139(260);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1074(int arg0) {
        field2317 = null;
        if (arg0 >= -100) {
            field2318 = -71;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public static final int method1075(int arg0, int arg1) {
        if (arg0 > -53) {
            method1075(-15, 84);
        }
        field2315++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method1076(byte arg0) {
        field2316++;
        if (arg0 == 92) {
            class244.field3783.method940(97);
            class222.field3459.method940(102);
            class50.field818.method940(13);
            class235.field3611.method940(arg0 - 23);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZII)I")
    public static final int method1077(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 > -85) {
            return -21;
        }
        field2314++;
        class270 var4 = (class270) class155.field2273.method306((long) arg2, 16216);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4213.length; var6++) {
            if (var4.field4213[var6] >= 0 && class152.field2218 > var4.field4213[var6]) {
                class15 var7 = class140.method951((byte) -94, var4.field4213[var6]);
                if (var7.field273 != null) {
                    class135 var8 = (class135) var7.field273.method306((long) arg3, 16216);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field4216[var6] * var8.field1975;
                        } else {
                            var5 += var8.field1975;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
