import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class4 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lsc;")
    public static class181 field78 = null;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[Lqh;")
    public static class100[] field89 = new class100[5000];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljb;")
    public static class11 field79;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method33(boolean arg0) {
        field79 = null;
        field89 = null;
        if (!arg0) {
            field78 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public static final void method34(boolean arg0) {
        field88++;
        if (class243.field4227 != -1) {
            class61.method441(class243.field4227, (byte) 74);
        }
        if (arg0) {
            method36((byte) -82);
        }
        for (int var1 = 0; var1 < class207.field3551; var1++) {
            if (class61.field943[var1]) {
                class114.field1849[var1] = true;
            }
            class235.field4092[var1] = class61.field943[var1];
            class61.field943[var1] = false;
        }
        class185.field3291 = null;
        class47.field740 = -1;
        class63.field979 = -1;
        class100.field1669 = class237.field4125;
        if (class243.field4227 != -1) {
            class207.field3551 = 0;
            class240.method1638(-1, -21307, 0, 0, 0, class243.field4227, class41.field620, 0, class143.field2321);
        }
        class17.method147();
        class258.field4504 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljb;I)V")
    public static final void method35(class11 arg0, int arg1) {
        field86++;
        if (arg1 <= 115) {
            method36((byte) 69);
        }
        class69.field1104 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method36(byte arg0) {
        if (arg0 != 18) {
            return;
        }
        if (class8.field156 != null) {
            class8.field156.method1701((byte) 100);
        }
        if (class174.field2914 != null) {
            class174.field2914.method1701((byte) 102);
        }
        field87++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method37(int arg0, int arg1) {
        class220 var2 = class221.field3820[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class220 var4 = class221.field3820[var3][arg0][arg1] = class221.field3820[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3811--;
                for (int var5 = 0; var5 < var4.field3806; var5++) {
                    class100 var6 = var4.field3797[var5];
                    if ((var6.field1677 >> 29 & 0x3L) == 2L && var6.field1688 == arg0 && var6.field1672 == arg1) {
                        var6.field1670--;
                    }
                }
            }
        }
        if (class221.field3820[0][arg0][arg1] == null) {
            class221.field3820[0][arg0][arg1] = new class220(0, arg0, arg1);
        }
        class221.field3820[0][arg0][arg1].field3798 = var2;
        class221.field3820[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)Z")
    public static final boolean method38(boolean arg0) {
        field80++;
        if (arg0) {
            return false;
        }
        if (class8.field158 != 0) {
            try {
                if ((Boolean) class39.field600.method1244(0, class224.field3870.field2285)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
