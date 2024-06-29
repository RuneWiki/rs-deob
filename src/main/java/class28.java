import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class28 {

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lhi;")
    public static class82 field365 = class95.method664((byte) -118, "::wm2");

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    public static int[] field375 = new int[500];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field369 = -1;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lbc;")
    public static class153 field377 = new class153(new byte[5000]);

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lhi;")
    public static class82 field379 = class95.method664((byte) -118, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[Ljg;")
    public static class140[] field384 = new class140[28];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lhn;")
    public static class317 field383 = new class317(30);

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lhi;")
    public static class82 field385 = class95.method664((byte) -84, "(Y");

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "[I")
    public static int[] field388 = new int[2];

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lhi;")
    private static class82 field387 = class95.method664((byte) -86, "skill: ");

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lhi;")
    public static class82 field386 = field387;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[[B")
    public static byte[][] field371;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 10)
    public static final int method173(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            method173(-61, 48, -29);
        }
        field372++;
        class164 var3 = (class164) class67.field1038.method507((long) arg1, arg2 + 602425308);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field2864.length) {
            return var3.field2864[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIII)V", line = 45)
    public static final void method174(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field364++;
        if (class147.field2485) {
            class116.method789(arg2, arg4, arg0 + arg2, arg3 + arg4);
            class116.method784(arg2, arg4, arg0, arg3, 0);
        } else {
            class320.method2220(arg2, arg4, arg0 + arg2, arg3 + arg4);
            class320.method2217(arg2, arg4, arg0, arg3, 0);
        }
        if (class245.field4257 < 100) {
            return;
        }
        if (class284.field4763 == null || class284.field4763.field1543 != arg0 || class284.field4763.field1533 != arg3) {
            class303 var5 = new class303(arg0, arg3);
            class320.method2221(var5.field5160, arg0, arg3);
            class109.method747(0, 0, class157.field2719, arg3, 0, 0, 0, arg0, class244.field4242);
            if (class147.field2485) {
                class284.field4763 = new class210(var5);
            } else {
                class284.field4763 = var5;
            }
            if (class147.field2485) {
                class320.field5531 = null;
            } else {
                class321.field5534.method1954(21155);
            }
        }
        if (arg1) {
            method173(12, -72, -16);
        }
        class284.field4763.method606(arg2, arg4);
        int var6 = class324.field5567 * arg0 / class244.field4242;
        int var7 = arg2 + (class127.field2228 * arg0 / class244.field4242);
        int var8 = class22.field309 * arg3 / class157.field2719 + arg4;
        int var9 = class255.field4386 * arg3 / class157.field2719;
        if (class147.field2485) {
            class116.method795(var7, var8, var6, var9, 16711680, 128);
            class116.method786(var7, var8, var6, var9, 16711680);
        } else {
            class320.method2199(var7, var8, var6, var9, 16711680, 128);
            class320.method2207(var7, var8, var6, var9, 16711680);
        }
        if (class205.field3592 <= 0 || class205.field3592 % 10 >= 5) {
            return;
        }
        for (class74 var10 = (class74) class241.field4174.method1936(16173); var10 != null; var10 = (class74) class241.field4174.method1926((byte) 90)) {
            if (class26.field349 == var10.field1129) {
                int var11 = var10.field1128 * arg0 / class244.field4242 + arg2;
                int var12 = var10.field1130 * arg3 / class157.field2719 + arg4;
                if (class147.field2485) {
                    class116.method784(var11 - 2, var12 - 2, 4, 4, 16776960);
                } else {
                    class320.method2217(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 136)
    public static void method175(byte arg0) {
        if (arg0 != -31) {
            field379 = (class82) null;
        }
        field384 = null;
        field386 = null;
        field383 = null;
        field365 = null;
        field388 = null;
        field379 = null;
        field377 = null;
        field387 = null;
        field385 = null;
        field371 = (byte[][]) null;
        field375 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 157)
    public static final void method176(int arg0) {
        field366++;
        if (arg0 != 23553) {
            return;
        }
        for (int var1 = 0; var1 < class25.field333; var1++) {
            int var2 = class43.field749[var1];
            class275 var3 = class99.field1777[var2];
            if (var3 != null) {
                class194.method1351(114, var3.field4628.field4052, var3);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V", line = 184)
    public class28(int arg0, int arg1, int arg2) {
        this.field370 = arg1;
        this.field368 = arg2;
        this.field373 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
    public abstract void method24(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)V")
    public abstract void method22(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(III)V")
    public abstract void method26(int arg0, int arg1, int arg2);
}
