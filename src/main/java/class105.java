import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class105 extends class253 {

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Ljd;")
    private static class85 field1837 = class221.method1499("K", (byte) 86);

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Ljd;")
    public static class85 field1841 = field1837;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[Z")
    public static boolean[] field1843 = new boolean[112];

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Ljd;")
    public static class85 field1848 = class221.method1499("<col=ffffff> )4 ", (byte) -101);

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1849 = -1;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Ljd;")
    public static class85 field1847 = field1837;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[I")
    public static int[] field1838;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[I")
    public static int[] field1846;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JZ)V")
    public static final void method723(long arg0, boolean arg1) {
        field1845++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1) {
            method726((byte) 56);
        }
        while (class45.field810 > var3) {
            if (class28.field428[var3] == arg0) {
                class152.field2598++;
                class45.field810--;
                for (int var4 = var3; var4 < class45.field810; var4++) {
                    class1.field5[var4] = class1.field5[var4 + 1];
                    class222.field3890[var4] = class222.field3890[var4 + 1];
                    class190.field3267[var4] = class190.field3267[var4 + 1];
                    class28.field428[var4] = class28.field428[var4 + 1];
                    class183.field3117[var4] = class183.field3117[var4 + 1];
                    client.field2560[var4] = client.field2560[var4 + 1];
                }
                class207.field3613 = class43.field755;
                class207.field3618.method483(-24260, 54);
                class207.field3618.method1674((byte) 101, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class105() {
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjd;I)V")
    public static final void method724(int arg0, class85 arg1, int arg2) {
        field1840++;
        class85 var3 = arg1.method620(false).method587((byte) -80);
        boolean var4 = false;
        for (int var5 = arg0; var5 < class196.field3375; var5++) {
            class44 var6 = class249.field4291[class151.field2556[var5]];
            if (var6 != null && var6.field762 != null && var6.field762.method582(var3, arg0 ^ 0xFFFFFFC9)) {
                var4 = true;
                class22.method150(0, var6.field1043[0], class22.field308.field1066[0], 0, arg0 ^ 0x45, 2, false, 1, 1, 0, var6.field1066[0], class22.field308.field1043[0]);
                if (arg2 == 1) {
                    class207.field3618.method483(-24260, 59);
                    class153.field2631++;
                    class207.field3618.method1675(~arg0, class151.field2556[var5]);
                } else if (arg2 == 4) {
                    class207.field3618.method483(-24260, 133);
                    class207.field3618.method1703(class151.field2556[var5], -94);
                    class235.field4065++;
                } else if (arg2 == 5) {
                    class207.field3618.method483(-24260, 215);
                    class207.field3618.method1675(-1, class151.field2556[var5]);
                    class83.field1506++;
                } else if (arg2 == 6) {
                    class207.field3618.method483(-24260, 101);
                    class207.field3618.method1703(class151.field2556[var5], -119);
                    class267.field4749++;
                } else if (arg2 == 7) {
                    class207.field3618.method483(-24260, 142);
                    class3.field33++;
                    class207.field3618.method1680((byte) 111, class151.field2556[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class148.method972(class172.method1150(new class85[] { class232.field4009, var3 }, arg0), (byte) -69, class100.field1795, 0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public static final void method725() {
        for (int var0 = 0; var0 < class123.field2177; var0++) {
            class213 var1 = class111.field1946[var0];
            class104.method721(var1);
            class111.field1946[var0] = null;
        }
        class123.field2177 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1842 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method726(byte arg0) {
        field1841 = null;
        field1848 = null;
        field1837 = null;
        field1847 = null;
        field1846 = null;
        if (arg0 == 11) {
            field1843 = null;
            field1838 = null;
        }
    }
}
