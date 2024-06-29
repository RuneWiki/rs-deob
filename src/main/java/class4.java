import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class4 extends RuntimeException {

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Ljava/lang/Throwable;")
    public Throwable field86;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/lang/String;")
    public String field76;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
    public static boolean field71 = false;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
    public static boolean field72 = false;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Loc;")
    public static class99 field81 = class48.method402((byte) -104, " x");

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Loc;")
    public static class99 field85 = class48.method402((byte) -104, "Classic");

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Loc;")
    public static class99 field87 = class48.method402((byte) -104, "(Y");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Ldc;")
    public static class24 field80;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljc;")
    public static class64 field70;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lla;")
    public static class76 field83;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[[[B")
    public static byte[][][] field74;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
    public static final int method21(int arg0) {
        field78++;
        if (arg0 != -18717) {
            field70 = null;
        }
        return class52.field1239++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    public static final void method22(int arg0, int arg1, int arg2) {
        if (arg1 != 17774) {
            return;
        }
        if (class60.field1603 != 0 && arg2 != -1) {
            class79.method683(class138.field3451, class60.field1603, false, false, arg2, 0);
            class72.field1837 = true;
        }
        field79++;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static final void method23(int arg0) {
        if (class49.field1179 == 1) {
            if (class23.field540 >= 6 && class23.field540 <= 106 && field75 >= 467 && field75 <= 499) {
                class34.field872 = true;
                class113.field2832 = true;
                class150.field3728++;
                class113.field2826 = (class113.field2826 + 1) % 4;
                class134.field3276.method869((byte) 11, 220);
                class134.field3276.method514((byte) 73, class113.field2826);
                class134.field3276.method514((byte) 73, class84.field2096);
                class134.field3276.method514((byte) 73, class55.field1414);
            }
            if (class23.field540 >= 135 && class23.field540 <= 235 && field75 >= 467 && field75 <= 499) {
                class113.field2832 = true;
                class84.field2096 = (class84.field2096 + 1) % 3;
                class34.field872 = true;
                class134.field3276.method869((byte) 11, 220);
                class134.field3276.method514((byte) 73, class113.field2826);
                class150.field3728++;
                class134.field3276.method514((byte) 73, class84.field2096);
                class134.field3276.method514((byte) 73, class55.field1414);
            }
            if (class23.field540 >= 273 && class23.field540 <= 373 && field75 >= 467 && field75 <= 499) {
                class34.field872 = true;
                class55.field1414 = (class55.field1414 + 1) % 3;
                class150.field3728++;
                class113.field2832 = true;
                class134.field3276.method869((byte) 11, 220);
                class134.field3276.method514((byte) 73, class113.field2826);
                class134.field3276.method514((byte) 73, class84.field2096);
                class134.field3276.method514((byte) 73, class55.field1414);
            }
            if (class23.field540 >= 412 && class23.field540 <= 512 && field75 >= 467 && field75 <= 499) {
                if (class23.field555 == -1) {
                    class132.method1069(-124);
                    if (class108.field2657 != -1) {
                        class55.field1419 = class23.field555 = class108.field2657;
                        class137.field3434 = class137.field3407;
                        class100.field2433 = false;
                    }
                } else {
                    class48.method400(0, class2.field29, 119, class137.field3407);
                    if (class35.field901 != null) {
                        class48.method400(0, class35.field901, -71, class137.field3407);
                    }
                }
            }
        }
        int var1 = 52 % (arg0 / 58);
        field84++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
    public static final void method24(boolean arg0, int arg1) {
        field73++;
        if (arg0) {
            class36 var2 = (class36) class14.field327.method1001((long) arg1, (byte) 101);
            if (var2 != null) {
                var2.method394((byte) -47);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static void method25(int arg0) {
        field70 = null;
        field87 = null;
        field80 = null;
        field74 = null;
        if (arg0 > -65) {
            method25(87);
        }
        field83 = null;
        field81 = null;
        field85 = null;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static final void method26(int arg0) {
        field82++;
        try {
            int var1 = 100 % ((40 - arg0) / 45);
            Graphics var2 = class5.field99.getGraphics();
            class91.field2220.method109(17, 357, 0, var2);
        } catch (Exception var3) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)V")
    public static final void method27(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class86.field2151; var2++) {
            int var3 = (class9.field232[var2] << 14) + 536870912;
            class149 var4 = class149.field3691[class9.field232[var2]];
            if (var4 != null && var4.method1032(-16) && var4.field3689.field1092 == arg0 && var4.field3689.method392(60)) {
                int var5 = var4.field3115 >> 7;
                int var6 = var4.field3077 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field3119 == 1 && (var4.field3115 & 0x7F) == 64 && (var4.field3077 & 0x7F) == 64) {
                        if (class118.field2898[var5][var6] == class81.field2012) {
                            continue;
                        }
                        class118.field2898[var5][var6] = class81.field2012;
                    }
                    if (!var4.field3689.field1126) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class68.field1757.method38(class84.field2116, var4.field3115, var4.field3077, class137.method1144(true, var4.field3115 + (var4.field3119 - 1) * 64, (var4.field3119 + -1) * 64 + var4.field3077, class84.field2116), (var4.field3119 - 1) * 64 + 60, var4, var4.field3107, var3, var4.field3089);
                }
            }
        }
        field77++;
        if (arg1 <= 62) {
            method24(false, -56);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class4(Throwable arg0, String arg1) {
        this.field86 = arg0;
        this.field76 = arg1;
    }
}
