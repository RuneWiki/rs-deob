import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lai;")
    private static class10 field34 = class44.method278("Continue", 96);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lai;")
    public static class10 field37 = class44.method278("Lade Konfiguration )2 ", -105);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lai;")
    private static class10 field42 = class44.method278("Please reload this page)3", -122);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lai;")
    public static class10 field35 = field34;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    public static int[] field32 = new int[100];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lai;")
    public static class10 field31 = field42;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lai;")
    public static class10 field41 = class44.method278("Schlie-8en", 103);

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lai;")
    private static class10 field36 = class44.method278("Please remove ", -43);

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lai;")
    public static class10 field40 = field36;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lai;")
    public static class10 field43 = field36;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lwf;")
    public static class205 field39 = new class205(0, 0);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lai;")
    public static class10 field46 = class44.method278(" loggt sich aus)3", 106);

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lai;")
    private static class10 field48 = class44.method278("Press (Wchange your password(W on front page)3", 123);

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lai;")
    public static class10 field45 = field48;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lmb;")
    public static class111 field38;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lc;Lc;ZLjava/awt/Component;)V")
    public static final void method11(class21 arg0, class21 arg1, boolean arg2, Component arg3) {
        field44++;
        if (class3.field24) {
            return;
        }
        class62.method399();
        byte[] var4 = arg0.method149(class15.field250, class10.field136, arg2);
        class146.field2791 = new class17(var4, arg3);
        class195.field3704 = class146.field2791.method101();
        class126.field2407 = class141.method953(arg1, class10.field136, class205.field3985, -76);
        class193.field3667 = class141.method953(arg1, class10.field136, class207.field4046, -112);
        class169.field3269 = class141.method953(arg1, class10.field136, class146.field2796, -76);
        class153.field2929 = class102.method672(class192.field3656, (byte) 119, class10.field136, arg1);
        class78.field1371 = class102.method672(class151.field2890, (byte) 92, class10.field136, arg1);
        class50.field894 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class50.field894[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class50.field894[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class50.field894[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class50.field894[var8 + 192] = 16777215;
        }
        class18.field262 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class18.field262[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class18.field262[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class18.field262[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class18.field262[var12 + 192] = 16777215;
        }
        class18.field264 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class18.field264[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class18.field264[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class18.field264[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class18.field264[var16 + 192] = 16777215;
        }
        class13.field210 = new int[32768];
        class77.field1360 = new int[256];
        class133.field2505 = new int[32768];
        class118.method842(127, null);
        class153.field2937 = false;
        class149.field2866 = 0;
        class10.field123 = class10.field136;
        class201.field3935 = new int[32768];
        class10.field162 = class10.field136;
        if (class93.field1688 == 0) {
            class78.field1380 = true;
        } else {
            class78.field1380 = false;
        }
        class46.field763 = new int[32768];
        if (class78.field1380) {
            class142.method959((byte) 22, 2);
        } else {
            class200.method1297(255, 2, class10.field136, class201.field3931, false, class5.field67, 43);
        }
        class102.method674(arg2, (byte) 124);
        class3.field24 = true;
        class146.field2791.method97(0, 0);
        class195.field3704.method97(382, 0);
        class126.field2407.method1134(382 - class126.field2407.field3341 / 2, 18);
        class133.field2501 = new class17(128, 254);
        class37.field589 = new class17(128, 254);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method12(int arg0) {
        field32 = null;
        field41 = null;
        if (arg0 != 262144) {
            field48 = null;
        }
        field36 = null;
        field45 = null;
        field42 = null;
        field46 = null;
        field34 = null;
        field39 = null;
        field38 = null;
        field48 = null;
        field31 = null;
        field37 = null;
        field35 = null;
        field43 = null;
        field40 = null;
    }
}
