import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method162(byte arg0) {
        field321++;
        if (class290.field4567 != null) {
            class290.field4567.method1958(5000);
            class290.field4567 = null;
        }
        class21.method161(false);
        class108.method698();
        for (int var1 = 0; var1 < 4; var1++) {
            class122.field1703[var1].method1841((byte) 121);
        }
        class32.method204(-1, false);
        System.gc();
        class140.method947(2, -94);
        class28.field373 = -1;
        class49.field709 = false;
        class47.method312(true, 5470);
        class37.field565 = 0;
        class125.field1755 = false;
        class101.field1422 = 0;
        class178.field2495 = 0;
        class216.field3255 = 0;
        for (int var2 = 0; var2 < class175.field2463.length; var2++) {
            class175.field2463[var2] = null;
        }
        class103.field1442 = 0;
        class92.field1283 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class154.field2133[var3] = null;
            class248.field3803[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class119.field1679[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class297.field4690[var5][var6][var7] = null;
                }
            }
        }
        class177.method1161(0);
        class215.field3245 = 0;
        class41.method271(16);
        class167.method1095(true, -6025);
        try {
            int var8 = -24 / ((arg0 + 58) / 48);
            class259.method1722("loggedout", 3787, class200.field2784.field3715);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lac;")
    public static final class137 method163(int arg0, int arg1) {
        field316++;
        class137 var2 = (class137) class155.field2156.method961((long) arg0, 9156);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class17.field181.method1576(-92, 5, arg0);
        if (arg1 <= 123) {
            return null;
        }
        class137 var4 = new class137();
        if (var3 != null) {
            var4.method932((byte) 56, new class224(var3));
        }
        class155.field2156.method957(21915, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILse;IIIB)V")
    public static final void method164(int arg0, int arg1, int arg2, class211 arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = arg6 * arg6 + (arg2 * arg2);
        field317++;
        if (arg1 < var8) {
            return;
        }
        if (arg7 >= -44) {
            field319 = -7;
        }
        int var9 = Math.min(arg3.field3112 / 2, arg3.field3166 / 2);
        if (var9 * var9 >= var8) {
            class187.method1199(arg6, arg0, -8286, arg2, class168.field2317[arg5], arg4, arg3);
            return;
        }
        var9 -= 10;
        int var10 = (int) class68.field912 + class217.field3266 & 0x7FF;
        int var11 = class90.field1259[var10];
        int var12 = var11 * 256 / (class111.field1600 + 256);
        int var13 = class90.field1255[var10];
        int var14 = var13 * 256 / (class111.field1600 + 256);
        int var15 = arg2 * var12 + arg6 * var14 >> 16;
        int var16 = arg2 * var14 - arg6 * var12 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        ((class128) class11.field106[arg5]).method874(arg3.field3112 / 2 + arg0 + var19 - 10, arg3.field3166 / 2 + arg4 + -var20 + -10, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method165(boolean arg0, String arg1, int arg2) {
        field320++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class208.field2968.method820(arg1, 250);
        int var7 = class208.field2968.method830(arg1, 250) * 13;
        class64.method401(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 0);
        class64.method393(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class208.field2968.method832(arg1, var5, var4, var6, var7, 16777215, -1, 1, arg2, 0);
        class238.method1595((byte) 30, var5 - var3, var3 + var7 + var3, var3 + var3 + var6, -var3 + var4);
        if (!arg0) {
            class107.method692(var7, var6, (byte) -77, var4, var5);
            return;
        }
        try {
            Graphics var8 = class156.field2177.getGraphics();
            class207.field2889.method662(0, 0, (byte) -69, var8);
        } catch (Exception var9) {
            class156.field2177.repaint();
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
    public static final void method166(int arg0, int arg1) {
        class101.field1406.method536(-119, arg1);
        field318++;
        if (arg0 != 10) {
            field319 = -74;
        }
    }
}
