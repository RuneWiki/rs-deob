import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class167 extends class159 {

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "[[I")
    public static int[][] field2632 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2628 = "shake:";

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2630 = null;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Z")
    public static boolean field2636 = true;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2637 = "Loaded defaults";

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "[[Lsi;")
    public static class264[][] field2627;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I", line = 7)
    public static int method1160(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 20)
    public static final void method1161(int arg0) {
        field2634++;
        if (arg0 != 11534) {
            field2637 = (String) null;
        }
        if (class291.field4825 == 5) {
            class291.field4825 = 6;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 44)
    public static void method1162(byte arg0) {
        field2628 = null;
        field2630 = null;
        field2627 = (class264[][]) null;
        field2637 = null;
        int var1 = 49 / ((arg0 + 62) / 62);
        field2632 = (int[][]) null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 71)
    public static final void method1163(boolean arg0) {
        if (!arg0) {
            field2637 = (String) null;
        }
        field2626++;
        if (class329.field5388 != null && (class329.field5388.field4796 - ((class329.field5388.method312(68) - 1) * 64) >> 7) == class223.field3439 && (class329.field5388.field4783 + 64 - class329.field5388.method312(51) * 64 >> 7) == class183.field2854) {
            class223.field3439 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class273.field4482[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class38.field561; var3++) {
            class39 var4 = class130.field1984[class150.field2410[var3]];
            if (var4 != null) {
                var4.field4720 = false;
            }
        }
        for (int var5 = 0; var5 < class294.field4892; var5++) {
            class233 var6 = class329.field5377[class243.field3843[var5]];
            if (var6 != null) {
                var6.field4720 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V", line = 133)
    public static final void method1164(boolean arg0) {
        class322.field5289 = null;
        class94.field1379 = null;
        field2633++;
        class18.field228 = null;
        class28.field419 = null;
        class201.field3085 = null;
        class105.field1522 = (byte[][]) null;
        if (arg0) {
            field2627 = (class264[][]) ((class264[][]) null);
        }
    }
}
