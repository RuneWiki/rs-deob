import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class56 extends class182 {

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "[[[I")
    public static int[][][] field1101 = new int[2][][];

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1108 = "Select";

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1109 = new String[1000];

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
    public static int[] field1111 = new int[2];

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "J")
    public static long field1104;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lwb;")
    public static class175 field1105;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "Lsh;")
    public static class320 field1112;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 5)
    public class56() {
        this(0);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V", line = 12)
    private class56(int arg0) {
        super(0, false);
        this.method474(arg0, 100);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V", line = 29)
    private final void method474(int arg0, int arg1) {
        this.field1106 = (arg0 & 0xFF0000) >> 12;
        if (arg1 <= 48) {
            this.method126((class146) null, 122, (byte) 67);
        }
        this.field1103 = (arg0 & 0xFF) << 4;
        field1102++;
        this.field1115 = (arg0 & 0xFF00) >> 4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I", line = 45)
    public final int[][] method122(int arg0, int arg1) {
        field1113++;
        int[][] var3 = this.field3152.method1953(arg0, 94);
        if (arg1 != 4944) {
            this.method126((class146) null, -33, (byte) 52);
        }
        if (this.field3152.field4493) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class26.field672; var7++) {
                var4[var7] = this.field1106;
                var6[var7] = this.field1115;
                var5[var7] = this.field1103;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 81)
    public static final void method475(boolean arg0, int arg1) {
        field1114++;
        if (arg0 == class57.field1141) {
            return;
        }
        class57.field1141 = arg0;
        class91.method699(0);
        if (arg1 != -16529) {
            method475(true, 87);
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V", line = 98)
    public static void method476(int arg0) {
        field1109 = null;
        field1111 = null;
        field1105 = null;
        if (arg0 != -841102620) {
            field1111 = (int[]) null;
        }
        field1108 = null;
        field1112 = null;
        field1101 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)I", line = 113)
    public static final int method477(int arg0, int arg1) {
        field1100++;
        if (arg1 < 0) {
            return 0;
        }
        class353 var2 = (class353) class216.field3591.method2344(-1, (long) arg1);
        if (var2 == null) {
            return class131.method926(arg1, (byte) 4).field4719;
        }
        int var3 = 0;
        for (int var4 = arg0; var4 < var2.field5646.length; var4++) {
            if (var2.field5646[var4] == -1) {
                var3++;
            }
        }
        return var3 + class131.method926(arg1, (byte) 4).field4719 - var2.field5646.length;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Loe;IB)V", line = 152)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            field1098 = -3;
        }
        field1099++;
        if (arg1 == 0) {
            this.method474(arg0.method1025((byte) -97), 90);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Ltn;", line = 179)
    public static final class129 method478(byte arg0, int arg1) {
        class129 var2 = (class129) class328.field5273.method893((long) arg1, 60);
        field1110++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -11) {
            method475(false, 126);
        }
        byte[] var3 = class97.field1769.method1404(1, arg1, (byte) -69);
        class129 var4 = new class129();
        if (var3 != null) {
            var4.method917(44, new class146(var3), arg1);
        }
        class328.field5273.method888((long) arg1, var4, 103);
        return var4;
    }
}
