import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class149 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[Lsg;")
    public static class30[] field2840 = new class30[100];

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2839 = new CRC32();

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lub;")
    public static class17 field2841 = new class17(64);

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lsg;")
    public static class30 field2842 = class167.method1221((byte) 33, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lsg;")
    public static class30 field2844 = class167.method1221((byte) 33, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lhc;")
    public static class144 field2838;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lcg;")
    public static class34 field2836;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lde;")
    public static class50 field2843;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public static final void method1084(boolean arg0, int arg1) {
        if (arg1 != -14337) {
            return;
        }
        field2834++;
        byte var2 = 4;
        byte[][] var3 = class23.field431;
        for (int var4 = 0; var4 < var2; var4++) {
            class67.method603((byte) -59);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class230.field4096[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class208.field3746.length; var13++) {
                                if (class208.field3746[var13] == var12 && var3[var13] != null) {
                                    class270.method1849((var10 & 0x7) * 8, var6 * 8, var3[var13], var9, var8, var5 * 8, arg1 - 9260, arg0, class100.field2032, (var11 & 0x7) * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static final void method1085(byte arg0) {
        if (arg0 > -121) {
            method1086(123);
        }
        field2835++;
        if (class41.field1016[96]) {
            class80.field1716 += (-class80.field1716 - 24) / 2;
        } else if (class41.field1016[97]) {
            class80.field1716 += (24 - class80.field1716) / 2;
        } else {
            class80.field1716 /= 2;
        }
        if (class41.field1016[98]) {
            class251.field4432 += (12 - class251.field4432) / 2;
        } else if (class41.field1016[99]) {
            class251.field4432 += (-class251.field4432 - 12) / 2;
        } else {
            class251.field4432 /= 2;
        }
        class91.field1851 += class251.field4432 / 2;
        class110.field2202 += class80.field1716 / 2;
        int var1 = class139.field2719 + class247.field4394.field1360;
        int var2 = class132.field2602 + class247.field4394.field1336;
        if ((class277.field4839 - var1) < -500 || class277.field4839 - var1 > 500 || (class98.field1984 - var2) < -500 || class98.field1984 - var2 > 500) {
            class277.field4839 = var1;
            class98.field1984 = var2;
        }
        if (class98.field1984 != var2) {
            class98.field1984 += (var2 - class98.field1984) / 16;
        }
        if (class277.field4839 != var1) {
            class277.field4839 += (var1 - class277.field4839) / 16;
        }
        class25.method224((byte) -29);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1086(int arg0) {
        field2838 = null;
        field2844 = null;
        field2843 = null;
        field2842 = null;
        field2841 = null;
        field2836 = null;
        if (arg0 != 4975) {
            field2845 = -110;
        }
        field2839 = null;
        field2840 = null;
    }
}
