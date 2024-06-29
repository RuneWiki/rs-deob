import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class92 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lsg;")
    public static class30 field1855 = class167.method1221((byte) 33, " loggt sich aus)3");

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lsg;")
    public static class30 field1861 = class167.method1221((byte) 33, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lsg;")
    public static class30 field1863 = class167.method1221((byte) 33, "showingVideoAd");

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public static final void method744(int arg0, byte arg1) {
        if (arg1 < -27) {
            field1856++;
            class68 var2 = class103.method830(arg0, 4, 8);
            var2.method610(2141640544);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLva;)V")
    public static final void method745(byte arg0, class120 arg1) {
        if (arg0 != -114) {
            field1857 = -25;
        }
        class91 var2 = (class91) class68.field1482.method1168(arg0 + 111, arg1.field2349.method297((byte) -53));
        if (var2 == null) {
            class195.method1410((class40) null, (class275) null, 0, arg1.field1372[0], class159.field2998, (byte) -97, arg1.field1349[0], arg1);
        } else {
            var2.method740((byte) -40);
        }
        field1858++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method746(byte arg0) {
        field1861 = null;
        if (arg0 <= 88) {
            method747(10, 102, 13, 0, 37, -46, (class217) null);
        }
        field1855 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIILfi;)Lfi;")
    public static final class217 method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6) {
        long var7 = (long) arg4;
        class217 var9 = (class217) class101.field2063.method1644((byte) -91, var7);
        field1859++;
        if (var9 == null) {
            class128 var10 = class128.method969(class233.field4151, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method965(64, 768, -50, -10, -50);
            class101.field2063.method1646(var7, var9, -123);
        }
        int var11 = arg6.method1554();
        int var12 = arg6.method1552();
        int var13 = arg6.method1560();
        int var14 = arg6.method1542();
        class217 var15 = var9.method1558(true, true);
        if (arg1 != 0) {
            var15.method1565(arg1);
        }
        class214 var16 = (class214) var15;
        if (arg0 != class31.method303(arg5 + var11, arg3 + var13, class159.field2998, -4) || arg0 != class31.method303(arg5 + var12, arg3 + var14, class159.field2998, arg2 ^ 0x5DAD)) {
            for (int var17 = 0; var17 < var16.field3876; var17++) {
                var16.field3887[var17] += class31.method303(var16.field3873[var17] + arg5, var16.field3870[var17] + arg3, class159.field2998, -4) - arg0;
            }
            var16.field3883 = false;
        }
        return arg2 == -23983 ? var15 : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method748(int arg0) {
        if (arg0 != 8) {
            method745((byte) -72, (class120) null);
        }
        field1860++;
        class68.field1495.method1650(106);
    }
}
