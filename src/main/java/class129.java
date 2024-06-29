import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class129 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lwb;")
    public static class130 field3046 = class26.method212("(U1", -32376);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lwb;")
    public static class130 field3050 = class26.method212("Lade Freunde)2Liste)3)3)3", -32376);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
    public static boolean field3043 = false;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
    public static boolean field3047 = false;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3052 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lqd;")
    public static class100 field3044;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 16)
    public static void method949(int arg0) {
        field3050 = null;
        field3044 = null;
        if (arg0 == 32768) {
            field3046 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 29)
    public static int method950(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BZZ)V", line = 50)
    public static final void method951(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        field3049++;
        if (arg3) {
            field3045 = 41;
        }
        if (class93.field2250 == null) {
            return;
        }
        if (class30.field839 >= 0) {
            class93.field2250.method176(43);
            class88.field2127 = null;
            class45.field1202 = 20;
            class132.field3186 = 0;
            class30.field839 = -1;
        }
        if (arg1 == null) {
            return;
        }
        if (class45.field1202 > 0) {
            class93.field2250.method179((byte) -127, arg0);
            class45.field1202 = 0;
        }
        class30.field839 = arg0;
        class93.field2250.method177(arg1, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method952(boolean arg0) {
        field3041++;
        class95.method713((byte) -99);
        if (arg0) {
            field3043 = false;
        }
        if (class101.field2426 == 1) {
            class7.field253[class98.field2372 / 100].method233(class85.field2027 - 12, class20.field594 + -12);
        }
        if (class101.field2426 == 2) {
            class7.field253[class98.field2372 / 100 + 4].method233(class85.field2027 - 12, class20.field594 + -8 - 4);
        }
        if (class3.field139 != -1) {
            class69.method559(class3.field139, 122);
            class90.method667(0, 0, -36, -1, 4, class3.field139, 0, 512, 334);
        }
        if (class115.field2843 != -1) {
            class69.method559(class115.field2843, 108);
            class90.method667(0, 0, -36, -1, 0, class115.field2843, 0, 512, 334);
        }
        class89.method659(-3119);
        if (!class58.field1462) {
            class79.method607(-25634);
            class111.method852((byte) 94);
        } else if (class116.field2863 == 0) {
            class8.method66(true);
        }
        if (class1.field9 == 1) {
            class21.field606.method233(472, 296);
        }
        if (class51.field1345) {
            byte var1 = 20;
            short var2 = 507;
            int var3 = 16776960;
            if (class90.field2185 < 30 && class4.field189) {
                var3 = 16711680;
            }
            if (class90.field2185 < 20 && !class4.field189) {
                var3 = 16711680;
            }
            class132.field3202.method997(class15.method114(new class130[] { class17.field455, class109.method831(class90.field2185, 10) }, -20349), var2, var1, var3);
            int var4 = 16776960;
            int var10 = var1 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (var6 > 32768 && class4.field189) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class4.field189) {
                var4 = 16711680;
            }
            class132.field3202.method997(class15.method114(new class130[] { class35.field1006, class109.method831(var6, 10), class52.field1361 }, -20349), var2, var10, var4);
            var10 += 15;
            if (class94.field2292) {
                class132.field3202.method997(class46.field1238, var2, var10, 16711680);
                class94.field2292 = false;
                var10 += 15;
            }
            if (class108.field2609) {
                class132.field3202.method997(class112.field2748, var2, var10, 16711680);
                class108.field2609 = false;
                var10 += 15;
            }
            if (class26.field740) {
                class132.field3202.method997(class52.field1360, var2, var10, 16711680);
                var10 += 15;
                class26.field740 = false;
            }
        }
        if (class36.field1078 == 0) {
            return;
        }
        int var7 = class36.field1078 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 < 10) {
            class132.field3202.method1002(class15.method114(new class130[] { class56.field1427, class109.method831(var8, 10), class94.field2263, class109.method831(var9, 10) }, -20349), 4, 329, 16776960);
        } else {
            class132.field3202.method1002(class15.method114(new class130[] { class56.field1427, class109.method831(var8, 10), class15.field441, class109.method831(var9, 10) }, -20349), 4, 329, 16776960);
        }
    }
}
