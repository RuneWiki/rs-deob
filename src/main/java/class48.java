import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class48 extends class80 {

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field709 = 0;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lph;")
    public static class229 field707 = class266.method1858("(U (X", 0);

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[I")
    public static int[] field710 = new int[100];

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "[[Z")
    public static boolean[][] field712 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Lph;")
    public static class229 field705 = class266.method1858("<col=00ff80>", 0);

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lsi;")
    public static class66 field704;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 13)
    public static final void method337(String arg0, byte arg1) {
        field701++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1 >= -120) {
            field697 = -36;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILhb;)V", line = 30)
    public static final void method338(int arg0, class164 arg1) {
        field703++;
        int var2 = arg1.method1209(-128);
        class298.field4844 = new class180[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class298.field4844[var3] = new class180();
            class298.field4844[var3].field2948 = arg1.method1209(-128);
            class298.field4844[var3].field2953 = arg1.method1197(false);
        }
        class124.field2081 = arg1.method1209(-128);
        class287.field4718 = arg1.method1209(-128);
        class57.field812 = arg1.method1209(-128);
        class85.field1464 = new class134[class287.field4718 + 1 - class124.field2081];
        for (int var4 = 0; var4 < class57.field812; var4++) {
            int var5 = arg1.method1209(-128);
            class134 var6 = class85.field1464[var5] = new class134();
            var6.field2156 = arg1.method1178(8);
            var6.field2161 = arg1.method1191(31776);
            var6.field2178 = class124.field2081 + var5;
            var6.field2177 = arg1.method1197(false);
            var6.field2185 = arg1.method1197(false);
        }
        class216.field3556 = arg1.method1191(31776);
        int var7 = -87 / ((-arg0 - 37) / 46);
        class229.field3762 = true;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILsi;)Lka;", line = 84)
    public static final class293 method339(int arg0, int arg1, int arg2, class66 arg3) {
        field711++;
        if (class176.method1264(arg2, (byte) 62, arg3, arg0)) {
            if (arg1 > -60) {
                method339(-90, 8, -58, (class66) null);
            }
            return class329.method2258((byte) 109);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)I", line = 102)
    public static final int method340(int arg0) {
        if (arg0 != -10291) {
            field707 = (class229) null;
        }
        field702++;
        class249.field4139 = 0;
        return class154.method1119(arg0 ^ 0xFFFFD7B6);
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 137)
    public static void method341(int arg0) {
        field705 = null;
        field707 = null;
        field712 = (boolean[][]) null;
        if (arg0 <= -106) {
            field704 = null;
            field710 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILsi;I)[Lcl;", line = 165)
    public static final class32[] method342(int arg0, class66 arg1, int arg2) {
        field706++;
        int var3 = -25 % ((9 - arg0) / 47);
        return class45.method333(0, arg1, arg2) ? class132.method938(-45) : null;
    }
}
