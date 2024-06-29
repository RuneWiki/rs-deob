import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class187 extends Canvas {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field3442;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lcf;")
    public static class93 field3443 = class147.method1066("cookieprefix", -48);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lcf;")
    public static class93 field3440 = class147.method1066("blinken1:", -48);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lcf;")
    public static class93 field3446 = class147.method1066("Liste des mises -9 jour charg-Be", -48);

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "S")
    public static short field3448 = 205;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
    public static int[] field3450 = new int[64];

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[[[B")
    public static byte[][][] field3447;

    @OriginalMember(owner = "client!dj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3452++;
        this.field3442.paint(arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1355(int arg0) {
        field3443 = null;
        int var1 = 106 % ((arg0 + 25) / 57);
        field3446 = null;
        field3440 = null;
        field3447 = null;
        field3450 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    public static final void method1356(int arg0, int arg1) {
        field3444++;
        class212 var2 = class123.method905(-1205364448, 7, arg0);
        if (arg1 == -10) {
            var2.method1502(255);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class187(Component arg0) {
        this.field3442 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3442.update(arg0);
        field3441++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lhg;B)V")
    public static final void method1357(class177 arg0, byte arg1) {
        class73.field1324 = class275.method1841(0, -99, class37.field567, arg0);
        field3449++;
        class58.field996 = class168.method1211(127, 0, arg0, class227.field4063);
        class255.field4615 = class168.method1211(127, 0, arg0, class29.field430);
        class97.field1731 = class168.method1211(127, 0, arg0, class177.field3071);
        class18.field231 = class168.method1211(127, 0, arg0, class238.field4258);
        class264.field4700 = class168.method1211(127, 0, arg0, class180.field3179);
        class149.field2627 = class168.method1211(127, 0, arg0, class46.field751);
        class101.field1752 = class248.method1683(arg0, class11.field150, false, 0);
        class152.field2677 = class217.method1526(class33.field519, arg0, 105, 0);
        class166.field2922 = class217.method1526(class143.field2481, arg0, 81, 0);
        class87.field1567 = class267.method1783(arg0, 22640, 0, class159.field2797);
        class140.field2434 = class267.method1783(arg0, 22640, 0, class38.field574);
        class63.field1149.method1818(class140.field2434, (int[]) null);
        class140.field2436.method1818(class140.field2434, (int[]) null);
        class183.field3383.method1818(class140.field2434, (int[]) null);
        class158 var2 = method1358(0, 0, arg0, class253.field4560);
        var2.method1133();
        class257.field4638 = var2;
        class158[] var3 = class275.method1841(0, 101, class146.field2577, arg0);
        if (arg1 < 56) {
            return;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1133();
        }
        class237.field4214 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class73.field1324.length; var9++) {
            class73.field1324[var9].method1137(var5 + var8, var6 + var8, var7 + var8);
        }
        class130.field2289 = class73.field1324;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILhg;I)Lnf;")
    public static final class158 method1358(int arg0, int arg1, class177 arg2, int arg3) {
        field3451++;
        if (class149.method1074(arg1, arg2, 16597, arg3)) {
            if (arg0 != 0) {
                method1358(67, -47, (class177) null, -84);
            }
            return class177.method1268(false);
        } else {
            return null;
        }
    }
}
