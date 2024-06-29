import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class243 extends class192 {

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
    public volatile boolean field4208 = true;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4210 = new CRC32();

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Loh;")
    public static class258 field4218 = class153.method1046("Spieler kann nicht gefunden werden: ", 104);

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[Led;")
    public static class245[] field4216 = new class245[4];

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lmb;")
    public static class172 field4214 = new class172(64);

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lkf;")
    public static class152 field4226 = new class152(0, 0);

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Z")
    public static volatile boolean field4227 = true;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Loh;")
    public static class258 field4228 = class153.method1046("null", 91);

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Z")
    public boolean field4209;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Z")
    public boolean field4219;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "[I")
    public static int[] field4217;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "[[[S")
    public static short[][][] field4223;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLoh;)V", line = 4)
    public static final void method1652(byte arg0, class258 arg1) {
        field4221++;
        if (arg0 != -128) {
            field4226 = (class152) null;
        }
        if (class70.field1212 >= 2) {
            if (arg1.method1778(-11925, class90.field1582)) {
                class247.method1686((byte) -34);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class140.method965(false, 0, class100.method755(arg0 ^ 0x7A, new class258[] { class237.field4145, class218.method1481(124, var4), class297.field5089 }), (class258) null);
            }
            if (class257.field4390 && arg1.method1778(-11925, class51.field817)) {
                System.out.println("oncard_geometry:" + class196.field3438);
                System.out.println("oncard_2d:" + class196.field3440);
                System.out.println("oncard_texture:" + class196.field3442);
            }
            if (arg1.method1778(arg0 - 11797, class107.field1905)) {
                class190.method1285(-21956);
            }
            if (arg1.method1778(-11925, class218.field3771)) {
                class287.field4944.method1956((byte) 14);
            }
            if (arg1.method1778(arg0 ^ 0x2EEB, class86.field1470)) {
                class287.field4944.method1951(17);
            }
            if (arg1.method1778(-11925, class190.field3363)) {
                class297.field5086.method2067((byte) -89);
                class73.field1289.method1119(126);
                class287.field4944.method1958(3);
            }
            if (arg1.method1778(-11925, class180.field3218)) {
                class311.field5265 = true;
            }
            if (arg1.method1778(-11925, class252.field4332)) {
                class106.method791((byte) 8, 25);
            }
            if (arg1.method1778(-11925, class88.field1500)) {
                class282.field4843 = true;
            }
            if (arg1.method1778(-11925, class4.field57)) {
                class282.field4843 = false;
            }
            if (arg1.method1778(-11925, class213.field3666)) {
                class218.method1476(0, false, -1, -1, (byte) 14);
            }
            if (arg1.method1778(arg0 ^ 0x2EEB, class229.field3956)) {
                class218.method1476(1, false, -1, -1, (byte) 14);
            }
            if (arg1.method1778(-11925, class76.field1317)) {
                class218.method1476(2, false, -1, -1, (byte) 14);
            }
            if (arg1.method1778(-11925, class220.field3813)) {
                class218.method1476(3, false, 768, 1024, (byte) 14);
            }
            if (arg1.method1778(-11925, class48.field721)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            field4216[var5].field4255[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1818((byte) 98, class180.field3220) && class50.field789 != 0) {
                class63.method486(2, arg1.method1777((byte) 127, 6).method1807((byte) 96));
            }
            if (arg1.method1778(-11925, class4.field60) && class50.field789 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1818((byte) -124, class285.field4901)) {
                class191.field3373 = arg1.method1777((byte) 123, 12).method1817((byte) -48).method1807((byte) 95);
                class140.method965(false, 0, class100.method755(arg0 ^ 0x7A, new class258[] { class132.field2307, class218.method1481(arg0 + 74, class191.field3373) }), (class258) null);
            }
            if (arg1.method1778(-11925, class167.field2830)) {
                class166.field2823 = true;
            }
        }
        class159.field2710.method885(236, -68);
        class159.field2710.method1598(arg1.method1816(false) - 1, 27052);
        class159.field2710.method1590(arg1.method1777((byte) 126, 2), (byte) -88);
        class86.field1460++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZIIBII)V", line = 158)
    public static final void method1653(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class78.field1334 = arg5;
        class152.field2616 = arg6;
        class303.field5174 = arg3;
        class197.field3471 = arg0;
        class165.field2800 = arg2;
        if (arg4 != -106) {
            return;
        }
        field4224++;
        if (arg1 && class197.field3471 >= 100) {
            class285.field4906 = class78.field1334 * 128 + 64;
            class61.field1086 = class303.field5174 * 128 + 64;
            class245.field4258 = class228.method1525(true, class272.field4704, class61.field1086, class285.field4906) - class165.field2800;
        }
        class109.field1926 = 2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLs;)V", line = 196)
    public static final void method1654(byte arg0, class171 arg1) {
        field4211++;
        if (arg0 != -5) {
            return;
        }
        class171 var2 = class90.method672((byte) 12, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class218.field3773;
            var4 = class42.field577;
        } else {
            var3 = var2.field3002;
            var4 = var2.field3054;
        }
        class311.method2156(arg1, var4, false, false, var3);
        class103.method781(var3, arg1, var4, false);
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(B)V", line = 222)
    public static void method1655(byte arg0) {
        field4223 = (short[][][]) null;
        field4214 = null;
        field4226 = null;
        if (arg0 != 55) {
            method1655((byte) -77);
        }
        field4218 = null;
        field4210 = null;
        field4216 = null;
        field4228 = null;
        field4217 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lrh;", line = 246)
    public static final class285 method1656(int arg0, byte arg1) {
        field4212++;
        class285 var2 = (class285) class27.field323.method701((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -76) {
            method1656(89, (byte) -28);
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class231.field3988.method1453(0, (byte) -8, arg0);
        } else {
            var3 = class124.field2207.method1453(0, (byte) -98, arg0 & 0x7FFF);
        }
        class285 var4 = new class285();
        if (var3 != null) {
            var4.method2009(new class235(var3), 3);
        }
        if (arg0 >= 32768) {
            var4.method1998(31562);
        }
        class27.field323.method698((long) arg0, (byte) 86, var4);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(B)[F", line = 300)
    public static final float[] method1657(byte arg0) {
        field4213++;
        float var1 = class304.method2130() + class304.method2131();
        int var2 = class304.method2128();
        float var3 = (float) ((var2 & 0xFFDC) >> 8) / 255.0F;
        float var4 = (float) ((var2 & 0xFFF07C) >> 16) / 255.0F;
        class106.field1895[3] = 1.0F;
        float var5 = 0.58823526F;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class106.field1895[2] = class119.field2109[2] * var6 * var5 * var1;
        class106.field1895[0] = class119.field2109[0] * var4 * var5 * var1;
        int var7 = -123 / ((arg0 - 30) / 39);
        class106.field1895[1] = class119.field2109[1] * var3 * var5 * var1;
        return class106.field1895;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
    public abstract int method1063(int arg0);

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(B)[B")
    public abstract byte[] method1061(byte arg0);
}
