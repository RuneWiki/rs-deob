import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class117 extends class138 {

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lck;")
    public static class119 field1769 = class298.method1987((byte) 124, "deltachrome");

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Lvk;")
    public static class67 field1763 = new class67(32);

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field1770 = -1;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "B")
    public byte field1766;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "Lwi;")
    public class23 field1762;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Lwi;")
    public static class23 field1764;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)I", line = 16)
    public static final int method736(int arg0) {
        if (arg0 != 32) {
            field1764 = (class23) null;
        }
        field1767++;
        return 2;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 27)
    public static final void method737(int arg0) {
        if (arg0 != 2295) {
            method738(26);
        }
        field1768++;
        for (class71 var1 = (class71) class10.field182.method995(arg0 + 1836594641); var1 != null; var1 = (class71) class10.field182.method996(0)) {
            class42 var2 = var1.field1112;
            if (class10.field189 != var2.field631 || var2.field630) {
                var1.method552((byte) -121);
            } else if (var2.field635 <= class1.field15) {
                var2.method324(class164.field2592, 1);
                if (var2.field630) {
                    var1.method552((byte) -125);
                } else {
                    class220.method1397(var2.field631, var2.field633, var2.field643, var2.field647, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V", line = 67)
    public static void method738(int arg0) {
        field1764 = null;
        if (arg0 != -1) {
            method737(41);
        }
        field1763 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V", line = 98)
    public static final void method739(int arg0) {
        for (int var1 = arg0; var1 < class81.field1238; var1++) {
            int var2 = class113.field1723[var1];
            class163 var3 = class70.field1103[var2];
            int var4 = class22.field333.method64((byte) 90);
            if ((var4 & 0x8) != 0) {
                var3.field4952 = class22.field333.method23(-126);
                if (var3.field4952 == 65535) {
                    var3.field4952 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field4994 = class22.field333.method41((byte) -121);
                var3.field4997 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class22.field333.method64((byte) -96);
                int var6 = class22.field333.method64((byte) 123);
                var3.method1983(class1.field15, var5, 20718, var6);
                var3.field4961 = class1.field15 + 300;
                var3.field4972 = class22.field333.method68((byte) -125);
            }
            if ((var4 & 0x40) != 0) {
                var3.field5009 = class22.field333.method15((byte) 114);
                var3.field4969 = class22.field333.method54(31935);
            }
            if ((var4 & 0x2) != 0) {
                var3.field4962 = class22.field333.method63((byte) 1);
                int var7 = class22.field333.method71(arg0 ^ 0xD8271638);
                var3.field4992 = (var7 & 0xFFFF) + class1.field15;
                var3.field4995 = var7 >> 16;
                var3.field4998 = 0;
                if (var3.field4962 == 65535) {
                    var3.field4962 = -1;
                }
                var3.field4965 = 0;
                if (var3.field4992 > class1.field15) {
                    var3.field4965 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var8 = class22.field333.method63((byte) 1);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class22.field333.method68((byte) -121);
                class54.method404(var3, var9, var8, false);
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class22.field333.method45((byte) -126);
                int var11 = class22.field333.method45((byte) -126);
                var3.method1983(class1.field15, var10, 20718, var11);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field2575.method385((byte) -45)) {
                    class243.method1579(var3, (byte) 106);
                }
                var3.field2575 = class134.method896(-1, class22.field333.method54(31935));
                var3.field4956 = var3.field2575.field796;
                var3.field4964 = var3.field2575.field794;
                var3.field4953 = var3.field2575.field829;
                var3.field4976 = var3.field2575.field785;
                var3.field4945 = var3.field2575.field778;
                var3.field4999 = var3.field2575.field789;
                var3.field4979 = var3.field2575.field820;
                var3.field4943 = var3.field2575.field804;
                var3.field4982 = var3.field2575.field836;
                if (var3.field2575.method385((byte) -45)) {
                    class279.method1853(var3.field4963[0], (byte) -127, 0, class10.field189, var3.field4973[0], (class292) null, var3, (class291) null);
                }
            }
        }
        field1765++;
    }
}
