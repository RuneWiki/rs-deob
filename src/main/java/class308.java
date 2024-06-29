import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class308 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Leb;")
    public static class115 field4801;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[[[I")
    public static int[][][] field4797;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lje;", line = 4)
    public static final class74 method2132(int arg0, byte arg1) {
        field4798++;
        class74 var2 = (class74) class78.field1100.method1432((byte) 112, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = 62 % ((arg1 - 84) / 38);
        byte[] var4 = class51.field786.method1507(0, (byte) -126, arg0);
        class74 var5 = new class74(var4);
        var5.method433(class255.field3810, (int[]) null);
        class78.field1100.method1436(false, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Object;ZLna;)V", line = 27)
    public static final void method2133(Object arg0, boolean arg1, class26 arg2) {
        field4800++;
        if (arg2.field287 == null) {
            return;
        }
        if (!arg1) {
            method2132(0, (byte) -46);
        }
        for (int var3 = 0; var3 < 50 && arg2.field287.peekEvent() != null; var3++) {
            class97.method768(1L, 115);
        }
        if (arg0 != null) {
            arg2.field287.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILna;)V", line = 62)
    public static final void method2134(int arg0, class26 arg1) {
        class275 var2 = null;
        class317.field4926 = 3;
        class242.method1672((byte) 76, true);
        class44.field684 = 0;
        class325.field5062 = true;
        class261.field3874 = 127;
        class11.field127 = true;
        class204.field3246 = 0;
        class143.field2212 = 2;
        class213.field3387 = true;
        class170.field2536 = 255;
        class154.field2327 = true;
        field4802++;
        class319.field4971 = true;
        class117.field1834 = 0;
        class38.field581 = true;
        class175.field2589 = true;
        class289.field4541 = true;
        class100.field1498 = 0;
        class238.field3618 = 127;
        class228.field3534 = true;
        if (arg0 >= -77) {
            method2137(28);
        }
        class69.field1019 = true;
        class101.field1512 = true;
        if (class228.field3523 >= 96) {
            class254.method1779(2);
        } else {
            class254.method1779(0);
        }
        class107.field1647 = 0;
        class304.field4766 = false;
        class37.field545 = false;
        class252.field3765 = 0;
        class287.field4432 = true;
        class235.field3605 = false;
        class6.field63 = 0;
        try {
            class233 var3 = arg1.method175("runescape", (byte) 71);
            while (var3.field3585 == 0) {
                class97.method768(1L, 74);
            }
            if (var3.field3585 == 1) {
                int var4 = 0;
                var2 = (class275) var3.field3590;
                byte[] var5 = new byte[(int) var2.method1923(117)];
                while (var5.length > var4) {
                    int var6 = var2.method1919(var5, 0, var5.length - var4, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class201.method1451(new class35(var5), 108);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1921(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 148)
    public static void method2135(byte arg0) {
        field4801 = null;
        field4797 = (int[][][]) null;
        if (arg0 != 123) {
            field4801 = (class115) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZ)V", line = 160)
    public static final void method2136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class39.field589 = arg1;
        class210.field3312 = arg2;
        class293.field4601 = arg3;
        class180.field2695 = new class99[arg0][class39.field589][class210.field3312];
        class258.field3844 = new int[arg0][class39.field589 + 1][class210.field3312 + 1];
        if (class36.field534) {
            class287.field4423 = new class123[4][];
        }
        if (arg4) {
            class314.field4874 = new class99[1][class39.field589][class210.field3312];
            class118.field1871 = new int[class39.field589][class210.field3312];
            field4797 = new int[1][class39.field589 + 1][class210.field3312 + 1];
            if (class36.field534) {
                class304.field4757 = new class123[1][];
            }
        } else {
            class314.field4874 = (class99[][][]) null;
            class118.field1871 = (int[][]) null;
            field4797 = (int[][][]) null;
            class304.field4757 = (class123[][]) null;
        }
        class95.method751(false);
        class213.field3389 = new class96[500];
        class262.field3901 = 0;
        class292.field4592 = new class96[500];
        class6.field55 = 0;
        class267.field4023 = new int[arg0][class39.field589 + 1][class210.field3312 + 1];
        class249.field3739 = new class91[5000];
        class39.field593 = 0;
        class271.field4095 = new class91[100];
        class312.field4849 = new boolean[class293.field4601 + class293.field4601 + 1][class293.field4601 + class293.field4601 + 1];
        class142.field2191 = new boolean[class293.field4601 + class293.field4601 + 2][class293.field4601 + class293.field4601 + 2];
        class323.field5039 = new byte[arg0][class39.field589][class210.field3312];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 202)
    public static final void method2137(int arg0) {
        if (arg0 > -110) {
            field4797 = (int[][][]) ((int[][][]) null);
        }
        if (class307.field4795 == null || class156.field2345 == null) {
            class307.field4795 = new int[256];
            class156.field2345 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class307.field4795[var1] = (int) (Math.sin(var2) * 4096.0D);
                class156.field2345[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field4799++;
    }
}
