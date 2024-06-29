import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class249 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3972 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    public long field3979;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lsb;")
    public static class124 field3970;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lqi;")
    public static class217 field3969;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lci;")
    public class60 field3973;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static final int method1662(int arg0, int arg1) {
        int var2 = 62 / ((arg0 + 82) / 33);
        int var3 = arg1 & 0x3F;
        int var4 = arg1 >> 6 & 0x3;
        field3976++;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method1663(byte arg0) {
        field3969 = null;
        field3970 = null;
        if (arg0 != 56) {
            method1664(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method1664(boolean arg0) {
        field3974++;
        class167 var1 = (class167) class91.field1434.method1062(68);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            int var2 = var1.field2756;
            if (class279.method1878(0, var2)) {
                class114[] var3 = class128.field2119[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1765;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field2406;
                    class114 var7 = class8.method43(var6, (byte) 55);
                    if (var7 != null) {
                        class72.method556(0, var7);
                    }
                }
            }
            var1 = (class167) class91.field1434.method1059(-14608);
        }
    }
}
