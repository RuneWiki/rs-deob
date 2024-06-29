import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class173 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Led;")
    public static class43 field3450 = class191.method1219("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", false);

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Led;")
    public static class43 field3457 = class191.method1219("auf einer freien Welt zu spielen)3", false);

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3459 = 20;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Led;")
    public static class43 field3453 = class191.method1219("Der Anmelde)2Server ist offline)3", false);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Led;")
    public class43 field3454;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Z")
    public boolean field3452;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lnb;")
    public static class120[] field3445;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method1092(boolean arg0) {
        if (!arg0) {
            field3445 = null;
            field3450 = null;
            field3457 = null;
            field3453 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static final int method1093(int arg0, int arg1) {
        field3449++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 != 1024) {
            field3453 = null;
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3) {
        field3451++;
        class129 var4 = class133.method858(-1, arg3, arg2);
        if (var4 != null && var4.field2632 != null) {
            class115 var5 = new class115();
            var5.field2238 = var4.field2632;
            var5.field2249 = var4;
            class203.method1311(var5, 3538);
        }
        class58.field1173 = arg3;
        class203.field3962 = arg2;
        class174.field3464 = true;
        class27.field486 = arg1;
        if (arg0 < 111) {
            field3457 = null;
        }
        class43.method265(false, var4);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lga;ILjava/awt/Component;Lga;)V")
    public static final void method1095(class58 arg0, int arg1, Component arg2, class58 arg3) {
        field3447++;
        if (class193.field3763) {
            return;
        }
        class168.method1054();
        byte[] var4 = arg0.method355(class68.field1363, (byte) 12, class18.field314);
        class191.field3725 = new class120(var4, arg2);
        class182.field3604 = class191.field3725.method780();
        class29.field537 = class193.method1232(arg3, class68.field1363, class88.field1723, arg1 ^ 0xFFFFFEFF);
        class35.field645 = class193.method1232(arg3, class68.field1363, class101.field1924, -1);
        class60.field1229 = class193.method1232(arg3, class68.field1363, class119.field2381, -1);
        class59.field1225 = class84.method512(arg3, class105.field2017, class68.field1363, (byte) -47);
        class154.field3136 = class84.method512(arg3, class140.field2916, class68.field1363, (byte) -47);
        class76.field1522 = new int[arg1];
        for (int var5 = 0; var5 < 64; var5++) {
            class76.field1522[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class76.field1522[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class76.field1522[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class76.field1522[var8 + 192] = 16777215;
        }
        class64.field1307 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class64.field1307[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class64.field1307[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class64.field1307[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class64.field1307[var12 + 192] = 16777215;
        }
        class142.field2942 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class142.field2942[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class142.field2942[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class142.field2942[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class142.field2942[var16 + 192] = 16777215;
        }
        class174.field3465 = new int[32768];
        class29.field540 = new int[256];
        class83.field1639 = new int[32768];
        class128.method828(false, null);
        class68.field1374 = class68.field1363;
        class17.field288 = new int[32768];
        class174.field3471 = new int[32768];
        if (class41.field796 == 0) {
            class159.field3214 = true;
        } else {
            class159.field3214 = false;
        }
        class5.field112 = false;
        class201.field3944 = 0;
        class68.field1368 = class68.field1363;
        if (class159.field3214) {
            class205.method1318((byte) -97, 2);
        } else {
            class80.method492(-16630, class68.field1363, class174.field3461, 2, 255, false, class189.field3695);
        }
        class74.method460((byte) -111, false);
        class193.field3763 = true;
        class191.field3725.method785(0, 0);
        class182.field3604.method785(382, 0);
        class29.field537.method1163(382 - class29.field537.field3574 / 2, 18);
        class49.field1001 = new class120(128, 254);
        class102.field1946 = new class120(128, 254);
    }
}
