import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lwd;")
    public static class150 field1729 = class2.method9(true, "sl_flags");

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lwd;")
    public static class150 field1732 = class2.method9(true, "Nehmen");

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lwd;")
    public static class150 field1740 = class2.method9(true, "Schlie-8en");

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
    public static int[] field1743 = new int[] { 0, 2, 0, 0, 0, 0, 0, 0, 0, 3, 4, 0, 0, 1, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0, 8, 5, -2, -2, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, 6, 0, 6, 0, 0, 14, 0, 0, 1, 0, 0, 0, 0, 6, 0, 0, 8, 0, 0, 0, 0, 0, 5, 2, 0, 0, 0, 3, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 4, 0, 0, 6, 0, 0, 0, -1, 0, 0, 0, 6, 0, 5, 0, 0, 0, -1, 0, 0, 0, 10, 1, 0, 7, 0, 0, 0, 2, 0, 0, 2, 4, 0, 6, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, -2, 1, 0, 0, 0, 5, 2, 0, 0, 0, 0, 0, 0, 4, 0, 6, 0, 0, 6, 0, 0, 15, 0, 0, 6, 2, 0, 7, 10, 4, 0, -2, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 11, 0, -1, 0, 6, 0, 2, 0, 0, 0, 6, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 1, 0, 0, 0, 0, 5, 0, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 0, 0, 0, 3, 0 };

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[[B")
    public static byte[][] field1730 = new byte[50][];

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lwd;")
    public static class150 field1741 = class2.method9(true, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lwd;")
    public static class150 field1744 = class2.method9(true, "weiss:");

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lkc;")
    public static class72 field1734;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field1728;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method525(int arg0, int arg1) {
        if (arg1 == -1 && !class82.field1974) {
            class16.method117(-38);
        } else if (arg1 != -1 && class108.field2442 != arg1 && class104.field2346 != 0 && !class82.field1974) {
            class107.method742(arg1, false, class30.field912, arg0 ^ 0xFFFFB60B, 2, class104.field2346, 0);
        }
        class108.field2442 = arg1;
        if (arg0 != -1) {
            method530(19);
        }
        field1739++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lff;ILjava/awt/Component;Lff;)V")
    public static final void method526(class42 arg0, int arg1, Component arg2, class42 arg3) {
        field1742++;
        if (class58.field1490) {
            return;
        }
        class21.field583 = class82.method591((byte) -112, arg2, 503, 765);
        class21.field583.method546(arg1 - 153);
        class120.method878();
        byte[] var4 = arg3.method320(class76.field1869, class94.field2178, -1);
        class50.field1330 = new class51(var4, arg2);
        class150.field3698 = class50.field1330.method387();
        class22.field640 = class86.method617(class73.field1844, (byte) -81, arg0, class94.field2178);
        class92.field2145 = class86.method617(class70.field1783, (byte) -109, arg0, class94.field2178);
        class82.field1980 = class86.method617(class130.field3070, (byte) -117, arg0, class94.field2178);
        class43.field1157 = class43.method335(class94.field2178, 28257, arg0, class145.field3516);
        if (arg1 != 192) {
            method525(49, 104);
        }
        class56.field1452 = class43.method335(class94.field2178, arg1 ^ 0x6EA1, arg0, class35.field966);
        class82.field1979 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class82.field1979[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class82.field1979[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class82.field1979[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class82.field1979[var8 + 192] = 16777215;
        }
        class118.field2717 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class118.field2717[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class118.field2717[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class118.field2717[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class118.field2717[var12 + 192] = 16777215;
        }
        class136.field3205 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class136.field3205[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class136.field3205[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class136.field3205[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class136.field3205[var16 + 192] = 16777215;
        }
        field1728 = new int[32768];
        class74.field1855 = new int[32768];
        class4.field76 = new int[256];
        class109.method779(128, null);
        class94.field2171 = class94.field2178;
        class94.field2190 = class94.field2178;
        if (class104.field2346 == 0) {
            class23.field665 = true;
        } else {
            class23.field665 = false;
        }
        class65.field1651 = new int[32768];
        class82.field1976 = new int[32768];
        class147.field3563 = 0;
        class97.field2227 = false;
        if (class23.field665) {
            class130.method985(122, 2);
        } else {
            method527(2, class94.field2178, class30.field912, false, arg1 ^ 0xF6, class146.field3531, 255);
        }
        class30.method246((byte) -77, false);
        class58.field1490 = true;
        class97.field2225 = true;
        class50.field1330.method410(0, 0);
        class150.field3698.method410(382, 0);
        class22.field640.method803(382 - class22.field640.field2653 / 2, 18);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILwd;Lff;ZILwd;I)V")
    private static final void method527(int arg0, class150 arg1, class42 arg2, boolean arg3, int arg4, class150 arg5, int arg6) {
        field1733++;
        int var7 = arg2.method310((byte) 14, arg5);
        int var8 = arg2.method323((byte) -114, var7, arg1);
        class107.method742(var7, arg3, arg2, 18932, arg0, arg6, var8);
        int var9 = 16 / ((arg4 + 15) / 51);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhb;IIB)V")
    public static final void method528(class51 arg0, int arg1, int arg2, byte arg3) {
        field1736++;
        if (arg3 != 106) {
            return;
        }
        int var4 = arg2 * arg2 + arg1 * arg1;
        if (var4 <= 4225 || var4 >= 90000) {
            class104.method720(arg0, arg1, arg3 ^ 0x8, arg2);
            return;
        }
        int var5 = class147.field3568 + class109.field2532 & 0x7FF;
        int var6 = class60.field1523[var5];
        int var7 = var6 * 256 / (class131.field3094 + 256);
        int var8 = class60.field1515[var5];
        int var9 = var8 * 256 / (class131.field3094 + 256);
        int var10 = arg1 * var7 + arg2 * var9 >> 16;
        int var11 = arg1 * var9 - arg2 * var7 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class98.field2238.method393(var14 + 94 + 4 - 10, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
    public static final void method529(int arg0, boolean arg1) {
        field1737++;
        if (class10.field243.field3252 == null) {
            return;
        }
        for (int var2 = arg0; var2 < 50 && class10.field243.field3252.peekEvent() != null; var2++) {
            class72.method548(-56, 1L);
        }
        if (arg1) {
            class10.field243.field3252.postEvent(new ActionEvent(class142.field3439, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1744 = null;
        field1732 = null;
        field1728 = null;
        field1729 = null;
        field1730 = null;
        if (arg0 > 37) {
            field1740 = null;
            field1734 = null;
            field1743 = null;
            field1741 = null;
        }
    }
}
