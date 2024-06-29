import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class89 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    public static int[] field2007 = new int[100];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lo;")
    public static class84 field2006 = class15.method124(" with @yel@", 255);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
    public static boolean field2009 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lo;")
    public static class84 field2016 = class15.method124("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3", 255);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    public static int[] field2013 = new int[128];

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lba;")
    public static class8 field2019 = new class8(32);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Lo;")
    public static class84 field2024 = class15.method124("Loading config )2 ", 255);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lo;")
    public static class84 field2023 = class15.method124("You are standing in a members)2only area)3", 255);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lfc;")
    public static class34 field2022;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field2005;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
    public int[] field2015;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 19)
    public static void method703(boolean arg0) {
        field2022 = null;
        field2006 = null;
        field2023 = null;
        field2019 = null;
        if (arg0) {
            field2017 = 36;
        }
        field2024 = null;
        field2007 = null;
        field2016 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 47)
    protected class89() {
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V", line = 52)
    public static final void method706(boolean arg0, byte arg1) {
        if (class107.field2271.field1380 >> 7 == class45.field970 && class107.field2271.field1391 >> 7 == class97.field2077) {
            class45.field970 = 0;
        }
        field2020++;
        if (arg1 != -92) {
            return;
        }
        int var2 = class107.field2257;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class63 var5;
            if (arg0) {
                var4 = 33538048;
                var5 = class107.field2271;
            } else {
                var5 = class119.field2643[class85.field1949[var3]];
                var4 = class85.field1949[var3] << 14;
            }
            if (var5 != null && var5.method496(28738)) {
                int var6 = var5.field1380 >> 7;
                var5.field1327 = false;
                if ((class1.field23 && class107.field2257 > 50 || class107.field2257 > 200) && !arg0 && var5.field1434 == var5.field1399) {
                    var5.field1327 = true;
                }
                int var7 = var5.field1391 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field1300 == null || class128.field2837 < var5.field1304 || class128.field2837 >= var5.field1309) {
                        if ((var5.field1380 & 0x7F) == 64 && (var5.field1391 & 0x7F) == 64) {
                            if (class16.field290[var6][var7] == class27.field530) {
                                continue;
                            }
                            class16.field290[var6][var7] = class27.field530;
                        }
                        var5.field1307 = class105.method778(class1.field11, var5.field1380, 3, var5.field1391);
                        class112.field2427.method811(class1.field11, var5.field1380, var5.field1391, var5.field1307, 60, var5, var5.field1421, var4, var5.field1439);
                    } else {
                        var5.field1327 = false;
                        var5.field1307 = class105.method778(class1.field11, var5.field1380, 3, var5.field1391);
                        class112.field2427.method843(class1.field11, var5.field1380, var5.field1391, var5.field1307, 60, var5, var5.field1421, var4, var5.field1294, var5.field1303, var5.field1295, var5.field1319);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 136)
    public final void method707(int arg0) {
        if (arg0 >= -52) {
            this.method704(-67, -68, null, -78);
        }
        class32.method282(this.field2015, this.field2008, this.field2014);
        field2021++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I", line = 174)
    public static final int method708(byte arg0) {
        field2004++;
        if (arg0 != 119) {
            method708((byte) -55);
        }
        return class17.field306++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 187)
    public static final void method709(byte arg0) {
        class25.field410.method742(4);
        if (arg0 <= 66) {
            method709((byte) 76);
        }
        field2011++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method704(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method705(int arg0, Graphics arg1, int arg2, int arg3);
}
