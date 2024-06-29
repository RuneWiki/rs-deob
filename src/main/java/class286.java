import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class286 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field4775 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[[B")
    public static byte[][] field4773 = new byte[1000][];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
    public long field4766;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lfa;")
    public static class273 field4770;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Ljk;")
    public class276 field4769;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2012(int arg0) {
        field4770 = null;
        if (arg0 > -87) {
            field4773 = null;
        }
        field4773 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2013(byte arg0, String arg1) {
        class246.method1721(arg1, 0, "", (byte) -104, "", 0);
        field4765++;
        if (arg0 >= -87) {
            method2016(43, 43);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lsc;")
    public static final class272 method2014(int arg0, byte arg1) {
        field4768++;
        class272 var2 = (class272) class9.field106.method149((byte) -86, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 61) {
            method2016(-111, 106);
        }
        byte[] var3 = class134.field2107.method1877(arg0, 3, (byte) 88);
        class272 var4 = new class272();
        if (var3 != null) {
            var4.method1872(arg1 + 35, new class202(var3));
        }
        class9.field106.method152(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method2015(int arg0, int arg1) {
        field4776++;
        int var2 = class262.field4326;
        int var3 = class132.field2037;
        int var4 = class53.field715;
        int var5 = class174.field2724;
        int var6 = (int) class79.field1255;
        int var7 = (int) class202.field3253 + class128.field1974 & 0x7FF;
        if (var6 < class276.field4569 / 256) {
            var6 = class276.field4569 / 256;
        }
        int var8 = class100.field1514;
        if (class99.field1483[4] && (class225.field3580[4] + 128) > var6) {
            var6 = class225.field3580[4] + 128;
        }
        class53.method320(arg1, var7, false, class12.method66(class309.field5006.field836, class165.field2600, class309.field5006.field850, 0) - 50, var6, var6 * 3 + 600, class302.field4946, class118.field1804);
        if (class53.field715 == var4 && class262.field4326 == var2 && class174.field2724 == var5 && class132.field2037 == var3 && class100.field1514 == var8) {
            class92.field1402 = 1;
            return;
        }
        class138.field2131 = 10;
        class68.field993 = 10;
        field4767 = 10;
        int var9 = 34 % ((-arg0 - 67) / 52);
        if (var2 < class262.field4326) {
            var2 += (class262.field4326 - var2) * class138.field2131 / 1000 + class68.field993;
            if (class262.field4326 > var2) {
                class262.field4326 = var2;
            }
        }
        if (var2 > class262.field4326) {
            int var10 = var2 - (class68.field993 + ((var2 - class262.field4326) * class138.field2131 / 1000));
            if (var10 > class262.field4326) {
                class262.field4326 = var10;
            }
        }
        if (class174.field2724 > var5) {
            var5 += class68.field993 + ((class174.field2724 - var5) * class138.field2131 / 1000);
            if (class174.field2724 > var5) {
                class174.field2724 = var5;
            }
        }
        int var11 = class100.field1514 - var8;
        if (var5 > class174.field2724) {
            int var12 = var5 - (class68.field993 + ((var5 - class174.field2724) * class138.field2131 / 1000));
            if (var12 > class174.field2724) {
                class174.field2724 = var12;
            }
        }
        class163.field2566 = 10;
        if (var3 < class132.field2037) {
            var3 += class163.field2566 + ((class132.field2037 - var3) * field4767 / 1000);
            if (class132.field2037 > var3) {
                class132.field2037 = var3;
            }
        }
        if (class53.field715 > var4) {
            var4 += class68.field993 + ((class53.field715 - var4) * class138.field2131 / 1000);
            if (var4 < class53.field715) {
                class53.field715 = var4;
            }
        }
        if (class53.field715 < var4) {
            int var13 = var4 - ((var4 - class53.field715) * class138.field2131 / 1000 + class68.field993);
            if (var13 > class53.field715) {
                class53.field715 = var13;
            }
        }
        if (class132.field2037 < var3) {
            int var14 = var3 - ((var3 - class132.field2037) * field4767 / 1000 + class163.field2566);
            if (class132.field2037 < var14) {
                class132.field2037 = var14;
            }
        }
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 < -1024) {
            var11 += 2048;
        }
        if (var11 > 0) {
            int var15 = class163.field2566 + (field4767 * var11 / 1000) + var8;
            var8 = var15 & 0x7FF;
        }
        if (var11 < 0) {
            int var16 = var8 - (-var11 * field4767 / 1000 + class163.field2566);
            var8 = var16 & 0x7FF;
        }
        int var17 = class100.field1514 - var8;
        if (var17 > 1024) {
            var17 -= 2048;
        }
        if (var17 < -1024) {
            var17 += 2048;
        }
        if (var17 >= 0 || var11 <= 0 || var17 > 0 && var11 < 0) {
            class100.field1514 = var8;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)I")
    public static final int method2016(int arg0, int arg1) {
        field4772++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            if (arg1 != 1) {
                field4773 = null;
            }
            return 0;
        }
    }
}
