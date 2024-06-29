import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class21 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field251 = "Examine";

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[[I")
    public static int[][] field255 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
    public static int[] field258 = new int[2];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field259 = new int[100];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lbc;")
    public static class282 field256;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;BI)V")
    public static final void method125(String arg0, String arg1, int arg2, String arg3, byte arg4, int arg5) {
        field260++;
        for (int var6 = 99; var6 > 0; var6--) {
            class195.field2782[var6] = class195.field2782[var6 - 1];
            class39.field471[var6] = class39.field471[var6 - 1];
            class87.field1176[var6] = class87.field1176[var6 - 1];
            class96.field1286[var6] = class96.field1286[var6 - 1];
            class3.field37[var6] = class3.field37[var6 - 1];
        }
        class181.field2580 = class176.field2500;
        class195.field2782[0] = arg2;
        class217.field3073++;
        class3.field37[0] = arg5;
        class39.field471[0] = arg1;
        class87.field1176[0] = arg0;
        class96.field1286[0] = arg3;
        if (arg4 != -86) {
            field256 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/Object;Lsi;)V")
    public static final void method126(int arg0, Object arg1, class56 arg2) {
        field252++;
        if (arg2.field657 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 32488) {
            return;
        }
        while (var3 < 50 && arg2.field657.peekEvent() != null) {
            class247.method1595(1L, (byte) -83);
            var3++;
        }
        if (arg1 != null) {
            arg2.field657.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method127(int arg0) {
        field259 = null;
        field255 = null;
        field258 = null;
        field251 = null;
        field256 = null;
        if (arg0 != 4) {
            field251 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method128(int arg0, String arg1) {
        field257++;
        if (class200.field2840 == null || arg1.length() == 0) {
            return -1;
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < class200.field2840.field2238; var2++) {
                if (class138.method902(class200.field2840.field2229[var2], " ", (byte) -120, "<br>").equals(arg1)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -124;
        }
    }
}
