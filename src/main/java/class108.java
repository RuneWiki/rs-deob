import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class108 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Z")
    public boolean field1726 = true;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field1724 = new int[1000];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field1734 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lvb;")
    public static class140 field1733;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method767(int arg0) {
        class273.field4381 = 0;
        class255.field4127 = 0;
        class83.field1384 = 0;
        class55.field904 = -1;
        class89.field1454 = -1;
        field1722++;
        class314.field5061.field2568 = 0;
        class131.field2053.field2568 = 0;
        class286.field4537 = false;
        class71.field1208 = -1;
        class47.field793 = 0;
        class81.field1342 = -1;
        class33.method221(arg0 - 38532);
        for (int var1 = 0; var1 < class270.field4355.length; var1++) {
            if (class270.field4355[var1] != null) {
                class270.field4355[var1].field690 = -1;
            }
        }
        for (int var2 = 0; var2 < class12.field127.length; var2++) {
            if (class12.field127[var2] != null) {
                class12.field127[var2].field690 = -1;
            }
        }
        class95.method658(false);
        class120.field1919 = 1;
        class262.method1760(30, -67);
        if (arg0 == 12159) {
            for (int var3 = 0; var3 < 100; var3++) {
                class73.field1227[var3] = true;
            }
            class95.method659((byte) 117);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method768(int arg0) {
        field1727++;
        class216 var1 = (class216) class25.field303.method1643((byte) -96);
        if (arg0 < 36) {
            return;
        }
        while (var1 != null) {
            class255 var2 = var1.field3569;
            if (class56.field941 != var2.field4103 || class29.field360 > var2.field4137) {
                var1.method913(-3542);
            } else if (class29.field360 >= var2.field4117) {
                if (var2.field4107 > 0) {
                    class131 var3 = class12.field127[var2.field4107 - 1];
                    if (var3 != null && var3.field637 >= 0 && var3.field637 < 13312 && var3.field710 >= 0 && var3.field710 < 13312) {
                        var2.method1718(class155.method1060((byte) -12, var2.field4103, var3.field710, var3.field637) - var2.field4100, class29.field360, -73, var3.field637, var3.field710);
                    }
                }
                if (var2.field4107 < 0) {
                    int var4 = -var2.field4107 - 1;
                    class299 var5;
                    if (class123.field1961 == var4) {
                        var5 = class239.field3829;
                    } else {
                        var5 = class270.field4355[var4];
                    }
                    if (var5 != null && var5.field637 >= 0 && var5.field637 < 13312 && var5.field710 >= 0 && var5.field710 < 13312) {
                        var2.method1718(class155.method1060((byte) -12, var2.field4103, var5.field710, var5.field637) - var2.field4100, class29.field360, 55, var5.field637, var5.field710);
                    }
                }
                var2.method1721(83, class223.field3630);
                class51.method358(class56.field941, (int) var2.field4136, (int) var2.field4109, (int) var2.field4101, 60, var2, var2.field4090, -1L, false);
            }
            var1 = (class216) class25.field303.method1642((byte) 41);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method769(byte arg0) {
        field1733 = null;
        field1724 = null;
        if (arg0 <= 15) {
            field1734 = 17;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1723 = arg0;
        this.field1725 = arg2;
        this.field1721 = arg3;
        this.field1728 = arg4;
        this.field1731 = arg5;
        this.field1726 = arg6;
        this.field1730 = arg1;
    }
}
