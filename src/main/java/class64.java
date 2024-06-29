import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lic;")
    private static class59 field1630 = class59.method433(0, "Loading textures )2 ");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lic;")
    public static class59[] field1632 = new class59[500];

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lic;")
    public static class59 field1637 = class59.method433(0, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lic;")
    public static class59 field1633 = field1630;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lce;")
    public static class20 field1634;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[Lt;")
    public static class132[] field1638;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method527(int arg0) {
        field1629++;
        class111.field2651 = false;
        class127.field2882 = false;
        if (arg0 != -7178) {
            method529((byte) 61, 13, -51, 43, -15, 15);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field1633 = null;
        if (arg0 != -107) {
            return;
        }
        field1634 = null;
        field1637 = null;
        field1630 = null;
        field1632 = null;
        field1638 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIIII)V")
    public static final void method529(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1636++;
        if (class157.field3436 == arg3 && class106.field2544 == arg5 && (class96.field2437 == arg4 || !class127.field2882)) {
            return;
        }
        class157.field3436 = arg3;
        class106.field2544 = arg5;
        class96.field2437 = arg4;
        if (!class127.field2882) {
            class96.field2437 = 0;
        }
        class89.method737(25, 128);
        class121.method942(class134.field2982, true, (byte) 112);
        int var6 = class89.field2229;
        int var7 = class68.field1756;
        class89.field2229 = (arg3 - 6) * 8;
        int var8 = class89.field2229 - var6;
        int var9 = class89.field2229;
        class68.field1756 = (arg5 - 6) * 8;
        int var10 = class68.field1756 - var7;
        int var11 = class68.field1756;
        for (int var12 = 0; var12 < 32768; var12++) {
            class90 var28 = class47.field1210[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1719[var29] -= var8;
                    var28.field1704[var29] -= var10;
                }
                var28.field1751 -= var10 * 128;
                var28.field1730 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class49 var26 = class91.field2323[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1719[var27] -= var8;
                    var26.field1704[var27] -= var10;
                }
                var26.field1730 -= var8 * 128;
                var26.field1751 -= var10 * 128;
            }
        }
        class44.field1127 = arg4;
        byte var14 = 0;
        byte var15 = 104;
        class159.field3650.method549((byte) -24, false, arg1, arg2);
        byte var16 = 1;
        if (arg0 != 24) {
            field1631 = -32;
        }
        if (var8 < 0) {
            var15 = -1;
            var16 = -1;
            var14 = 103;
        }
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var10 + var22;
                int var24 = var20 + var8;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class23.field563[var25][var20][var22] = class23.field563[var25][var24][var23];
                    } else {
                        class23.field563[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class118 var21 = (class118) class22.field525.method682(0); var21 != null; var21 = (class118) class22.field525.method684((byte) -65)) {
            var21.field2739 -= var8;
            var21.field2751 -= var10;
            if (var21.field2739 < 0 || var21.field2751 < 0 || var21.field2739 >= 104 || var21.field2751 >= 104) {
                var21.method929(120);
            }
        }
        class131.field2942 = false;
        class94.field2406 = -1;
        class68.field1703 = 0;
        if (class88.field2213 != 0) {
            class88.field2213 -= var8;
            class53.field1315 -= var10;
        }
        class44.field1131.method680(105);
        class89.field2242.method680(-122);
    }
}
