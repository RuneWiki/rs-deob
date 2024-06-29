import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class161 extends class3 {

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public int field2545 = 0;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "Z")
    public boolean field2557 = true;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public int field2563 = 0;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public int field2559 = -1;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public int field2566 = 12800;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public int field2568 = 12800;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "Lok;")
    public class41 field2558;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "Lok;")
    public class41 field2565;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lda;")
    public class212 field2546;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2552 = -1;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field2562 = 50;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "Lok;")
    public static class41 field2555 = class137.method956("<img=0>", 45);

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "[Lok;")
    public static class41[] field2569 = new class41[field2562];

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
    public static int[] field2542 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "[I")
    public static int[] field2551 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "Z")
    public static boolean field2567 = false;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "[I")
    public static int[] field2570 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "[I")
    public static int[] field2561 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[I")
    public static int[] field2547 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "[I")
    public static int[] field2540 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[I")
    public static int[] field2553 = new int[field2562];

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Lfm;")
    public static class94 field2548;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z", line = 9)
    public final boolean method1135(byte arg0, int arg1, int arg2) {
        field2544++;
        if (this.field2566 > arg1 || this.field2563 < arg1 || this.field2568 > arg2 || arg2 > this.field2545) {
            return false;
        }
        for (class250 var4 = (class250) this.field2546.method1495(-312); var4 != null; var4 = (class250) this.field2546.method1501(-92)) {
            if (var4.method1770(arg0 ^ 0x6E, arg1, arg2)) {
                return true;
            }
        }
        if (arg0 != 94) {
            this.field2559 = 72;
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLmh;)V", line = 53)
    public static final void method1136(boolean arg0, class65 arg1) {
        class208.field3362 = class89.method635(30000, class46.field723, arg1);
        class148.field2298 = new int[256];
        int var2 = 0;
        if (!arg0) {
            method1137(-73);
        }
        while (var2 < 3) {
            float var3 = (float) ((class75.field1116[var2] & 0xFF0000) >> 16);
            int var4 = class75.field1116[var2 + 1] >> 8 & 0xFF;
            int var5 = (class75.field1116[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var3) / 64.0F;
            float var7 = (float) (class75.field1116[var2] >> 8 & 0xFF);
            float var8 = ((float) var4 - var7) / 64.0F;
            float var9 = (float) (class75.field1116[var2] & 0xFF);
            int var10 = class75.field1116[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class148.field2298[var2 * 64 + var12] = class255.method1813(class255.method1813((int) var3 << 16, (int) var7 << 8), (int) var9);
                var9 += var11;
                var3 += var6;
                var7 += var8;
            }
            var2++;
        }
        field2556++;
        for (int var13 = 192; var13 < 255; var13++) {
            class148.field2298[var13] = class75.field1116[3];
        }
        class266.field4230 = new int[32768];
        class184.field3007 = new int[32768];
        class62.method434((byte) -28, (class279) null);
        class97.field1430 = new int[32768];
        class116.field1694 = new int[32768];
        if (class166.field2625) {
            class312.field5262 = new class108(128, 254);
        } else {
            class312.field5262 = new class72(128, 254);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 122)
    public static void method1137(int arg0) {
        field2569 = null;
        field2551 = null;
        field2540 = null;
        field2542 = null;
        field2548 = null;
        field2553 = null;
        field2570 = null;
        field2547 = null;
        if (arg0 != 255) {
            method1137(-27);
        }
        field2561 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 152)
    public final void method1138(int arg0) {
        if (arg0 != 628) {
            method1139(63, -63, 95, 112, -116, 18, 74);
        }
        field2554++;
        this.field2566 = 12800;
        this.field2563 = 0;
        this.field2545 = 0;
        this.field2568 = 12800;
        for (class250 var2 = (class250) this.field2546.method1495(-312); var2 != null; var2 = (class250) this.field2546.method1501(-92)) {
            if (this.field2545 < var2.field3976) {
                this.field2545 = var2.field3976;
            }
            if (this.field2563 < var2.field3978) {
                this.field2563 = var2.field3978;
            }
            if (var2.field3987 < this.field2566) {
                this.field2566 = var2.field3987;
            }
            if (var2.field3982 < this.field2568) {
                this.field2568 = var2.field3982;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lok;Lok;IIIZ)V", line = 340)
    public class161(class41 arg0, class41 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2559 = arg4;
        this.field2560 = arg3;
        this.field2558 = arg1;
        this.field2557 = arg5;
        this.field2564 = arg2;
        this.field2565 = arg0;
        this.field2546 = new class212();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIIII)V", line = 195)
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 64) {
            method1136(false, (class65) null);
        }
        if ((arg0 - arg6) >= class273.field4449 && (arg0 + arg6) <= class153.field2439 && class15.field192 <= (arg5 - arg6) && arg5 + arg6 <= class237.field3801) {
            class312.method2160(arg1, arg0, arg3, true, arg5, arg6, arg2);
        } else {
            class59.method422(arg2, arg3, arg0, arg6, arg1, arg5, arg4 - 177);
        }
        field2541++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 226)
    public static final void method1140(int arg0, int arg1) {
        class68.method495((byte) 119);
        field2549++;
        class167.method1196((byte) 45);
        int var2 = class187.method1348((byte) 121, arg0).field3807;
        if (var2 == 0) {
            return;
        }
        int var3 = class60.field885[arg0];
        if (var2 == 5) {
            class192.field3107 = var3;
        }
        if (arg1 == var2) {
            class162.field2585 = var3;
        }
        if (var2 == 6) {
            class116.field1689 = var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lpe;Z)V", line = 272)
    public static final void method1141(class73 arg0, boolean arg1) {
        field2550++;
        class9.method36(200000, arg1, arg0);
        if (!arg1) {
            method1142(73);
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V", line = 301)
    public static final void method1142(int arg0) {
        field2543++;
        class125 var1 = (class125) class286.field4645.method1495(arg0 ^ 0x546C);
        if (arg0 != -21852) {
            field2555 = (class41) null;
        }
        while (var1 != null) {
            if (var1.field1866 == -1) {
                var1.field1849 = 0;
                class245.method1749(var1, 18583);
            } else {
                var1.method418(6971);
            }
            var1 = (class125) class286.field4645.method1501(arg0 ^ 0x5535);
        }
    }
}
