import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class150 extends class206 {

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[I")
    public static int[] field2584 = new int[128];

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Ljava/awt/Image;")
    public static Image field2576;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[I")
    public int[] field2571;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field2572;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
    public int[] field2575;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[Lbi;")
    public class77[] field2579;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lbi;")
    public class77[] field2581;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[[[B")
    public byte[][][] field2582;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 4)
    public static final void method1150(int arg0) {
        if (arg0 == 29763) {
            class221.field3764.method1201(arg0 ^ 0xFFFFC532);
            field2574++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[IIII)V", line = 16)
    public static final void method1151(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field2580++;
        int var11 = arg4 - 1;
        int var5 = var11 - arg0;
        arg2--;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg1[var6] = arg3;
            int var7 = var6 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var12 = var10 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg2 = var13 + 1;
            arg1[arg2] = arg3;
        }
        while (arg2 < var11) {
            arg2++;
            arg1[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 42)
    public static final void method1152(int arg0) {
        field2583++;
        if (!class153.field2625) {
            class272.field4692[0] = class155.field2652;
            class99.field1646[0] = 1006;
            if (class285.field4915 != 0) {
                class217.field3708 = class82.field1367;
                class152.field2623 = class161.field2737;
            } else if (class87.field1435 == 0) {
                class152.field2623 = class66.field1135;
                class217.field3708 = class26.field351;
            } else {
                class217.field3708 = class271.field4685;
                class152.field2623 = class39.field595;
            }
            class126.field2188 = 1;
            class94.field1521[0] = class121.field2037;
        }
        if (class81.field1361 != -1) {
            class153.method1173(class81.field1361, false);
        }
        for (int var1 = 0; var1 < class273.field4720; var1++) {
            if (class226.field3815[var1]) {
                class219.field3743[var1] = true;
            }
            class218.field3727[var1] = class226.field3815[var1];
            class226.field3815[var1] = false;
        }
        class214.field3640 = true;
        class39.field618 = -1;
        class180.field3019 = null;
        class217.field3720 = class143.field2463;
        class61.field1069 = -1;
        if (class81.field1361 != -1) {
            class273.field4720 = 0;
            class79.method674(0, -1, class81.field1361, (byte) 112, 0, 0, 0, class188.field3141, class244.field4111);
        }
        class222.method1633();
        class65.method554(true);
        if (class153.field2625) {
            class190.method1438(-94);
        } else if (class39.field618 != -1) {
            class272.method1942(class61.field1069, -107, class39.field618);
        }
        if (class85.field1392 == 3) {
            for (int var2 = 0; var2 < class273.field4720; var2++) {
                if (class218.field3727[var2]) {
                    class222.method1641(class217.field3716[var2], class157.field2698[var2], class120.field2024[var2], class172.field2909[var2], 16711935, 128);
                } else if (class219.field3743[var2]) {
                    class222.method1641(class217.field3716[var2], class157.field2698[var2], class120.field2024[var2], class172.field2909[var2], 16711680, 128);
                }
            }
        }
        class126.method1012(class279.field4831.field3259, class250.field4208, class67.field1174, 64, class279.field4831.field3218);
        class250.field4208 = 0;
        if (arg0 != -2392) {
            field2573 = -52;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V", line = 163)
    public static void method1153(int arg0) {
        field2584 = null;
        if (arg0 != 18316) {
            method1153(82);
        }
        field2576 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 179)
    public static final void method1154(byte arg0) {
        field2578++;
        class97.field1590.method1200(false);
        if (arg0 < 5) {
            method1150(31);
        }
    }
}
