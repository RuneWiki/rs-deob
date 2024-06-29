import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class128 extends class177 {

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Z")
    public boolean field2121 = true;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public int field2130 = 12800;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public int field2135 = 0;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public int field2132 = -1;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public int field2128 = 12800;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public int field2137 = 0;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lbe;")
    public class283 field2124;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "Lbe;")
    public class283 field2127;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "Lj;")
    public class269 field2138;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Loh;")
    public static class15 field2120 = new class15(64);

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "(I)V", line = 19)
    public final void method797(int arg0) {
        this.field2135 = 0;
        this.field2130 = 12800;
        if (arg0 != -1) {
            return;
        }
        field2126++;
        this.field2128 = 12800;
        this.field2137 = 0;
        for (class234 var2 = (class234) this.field2138.method1812((byte) -106); var2 != null; var2 = (class234) this.field2138.method1813((byte) 76)) {
            if (this.field2137 < var2.field3946) {
                this.field2137 = var2.field3946;
            }
            if (this.field2130 > var2.field3940) {
                this.field2130 = var2.field3940;
            }
            if (this.field2128 > var2.field3944) {
                this.field2128 = var2.field3944;
            }
            if (var2.field3939 > this.field2135) {
                this.field2135 = var2.field3939;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lbe;Lbe;IIIZ)V", line = 254)
    public class128(class283 arg0, class283 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2132 = arg4;
        this.field2136 = arg3;
        this.field2124 = arg0;
        this.field2125 = arg2;
        this.field2121 = arg5;
        this.field2127 = arg1;
        this.field2138 = new class269();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)Z", line = 71)
    public final boolean method798(byte arg0, int arg1, int arg2) {
        field2123++;
        if (this.field2128 > arg2 || this.field2137 < arg2 || arg1 < this.field2130 || arg1 > this.field2135) {
            return false;
        }
        if (arg0 <= 10) {
            method799(104, (class283) null);
        }
        for (class234 var4 = (class234) this.field2138.method1812((byte) -124); var4 != null; var4 = (class234) this.field2138.method1813((byte) 60)) {
            if (var4.method1575((byte) 127, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILbe;)Z", line = 123)
    public static final boolean method799(int arg0, class283 arg1) {
        field2133++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class103.field1748; var2++) {
            if (arg1.method1910(16369, class143.field2372[var2])) {
                return true;
            }
        }
        if (arg1.method1910(16369, class213.field3624.field3274)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBII)V", line = 149)
    public static final void method800(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2122++;
        if (class23.field349 < 100) {
            class121.method770(2048);
        }
        class311.method2114(arg4, arg1, arg0 + arg4, arg1 + arg3);
        if (class23.field349 < 100) {
            byte var15 = 20;
            int var16 = arg4 + (arg0 / 2);
            int var17 = arg3 / 2 + arg1 - var15 - 18;
            class311.method2116(arg4, arg1, arg0, arg3, 0);
            class311.method2113(var16 - 152, var17, 304, 34, 9179409);
            class311.method2113(var16 - 151, var17 + 1, 302, 32, 0);
            class311.method2116(var16 - 150, var17 + 2, class23.field349 * 3, 30, 9179409);
            class311.method2116(var16 + (class23.field349 * 3) - 150, var17 - -2, 300 - (class23.field349 * 3), 30, 0);
            class240.field4056.method1648(class307.field5271, var16, var17 + var15, 16777215, -1);
            return;
        }
        class117.field1977 = class7.field79 - ((int) ((float) arg0 / class123.field2044));
        class138.field2301 = (int) ((float) (arg0 * 2) / class123.field2044);
        class90.field1525 = class159.field2604 - ((int) ((float) arg3 / class123.field2044));
        int var5 = class7.field79 - ((int) ((float) arg0 / class123.field2044));
        class46.field622 = (int) ((float) (arg3 * 2) / class123.field2044);
        int var6 = class159.field2604 - ((int) ((float) arg3 / class123.field2044));
        int var7 = 123 % ((-arg2 - 28) / 63);
        int var8 = (int) ((float) arg3 / class123.field2044) + class159.field2604;
        int var9 = (int) ((float) arg0 / class123.field2044) + class7.field79;
        if (class54.field725 == null || class54.field725.field1828 != arg0 || class54.field725.field1821 != arg3) {
            class54.field725 = null;
            class54.field725 = new class235(arg0, arg3);
        }
        class78.method512(class54.field725.field3484, arg0, arg3);
        class190.method1238(0, var6, var5, var9, var8, arg3, (byte) -111, 0, arg0);
        class109.method722(0, var5, 0, arg3, var8, var6, -38, arg0, var9);
        class119.method766(0, var5, arg0, var6, var9, arg3, 0, -12470, var8);
        class54.field725.method708(arg4, arg1);
        if (class222.field3731 > 0) {
            class222.field3731--;
        }
        if (!class65.field906) {
            return;
        }
        int var10 = arg3 + arg1 - 8;
        int var11 = arg0 + arg4 - 5;
        class269.field4539.method1657(class299.method2022(new class283[] { class7.field72, class296.method2012(class109.field1848, (byte) -75) }, (byte) 18), var11, var10, 16776960, -1);
        Runtime var12 = Runtime.getRuntime();
        int var13 = 16776960;
        int var18 = var10 - 15;
        int var14 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var14 > 65536) {
            var13 = 16711680;
        }
        class269.field4539.method1657(class299.method2022(new class283[] { class214.field3636, class296.method2012(var14, (byte) -36), class227.field3827 }, (byte) 6), var11, var18, var13, -1);
        var10 = var18 - 15;
    }

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)V", line = 240)
    public static void method801(int arg0) {
        if (arg0 != 15) {
            field2129 = 45;
        }
        field2120 = null;
    }
}
