import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class138 extends class110 {

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Lqd;")
    public static class189 field2105;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Llm;")
    public static class210 field2094;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method445(int arg0, boolean arg1) {
        if (arg1) {
            field2094 = (class210) null;
        }
        field2096++;
        int[][] var3 = this.field1701.method1477((byte) 125, arg0);
        if (this.field1701.field3255) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class124.field1936; var7++) {
                var5[var7] = this.field2093;
                var4[var7] = this.field2098;
                var6[var7] = this.field2106;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method999(boolean arg0) {
        class212.field3224 = null;
        class305.field4651 = null;
        class9.field67 = null;
        class7.field52 = null;
        if (arg0) {
            field2103 = 29;
        }
        class134.field2046 = null;
        field2099++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILre;I)V", line = 69)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.method1000(arg1.method1824(false), 4080);
        }
        field2102++;
        if (arg2 >= -37) {
            field2094 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V", line = 90)
    private final void method1000(int arg0, int arg1) {
        this.field2093 = arg1 & arg0 >> 12;
        this.field2098 = (arg0 & 0xFF00) >> 4;
        this.field2106 = (arg0 & 0xFF) << 4;
        field2097++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIBII)V", line = 100)
    public static final void method1001(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2101++;
        int var8 = arg0 + 1;
        class315.method2160(class40.field488[arg0], arg5, arg1, arg2, 7);
        int var9 = arg4 - 1;
        class315.method2160(class40.field488[arg4], arg5, arg1, arg2, 7);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class40.field488[var6];
            var7[arg2] = var7[arg1] = arg5;
        }
        if (arg3 != 93) {
            method1001(98, 62, -85, (byte) 90, -104, -9);
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 124)
    public static void method1002(int arg0) {
        field2105 = null;
        if (arg0 >= -30) {
            field2105 = (class189) null;
        }
        field2094 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V", line = 135)
    private class138(int arg0) {
        super(0, false);
        this.method1000(arg0, 4080);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 154)
    public static final void method1003(String arg0, int arg1) {
        field2100++;
        if (class125.field1964 == null) {
            return;
        }
        int var2 = -20 % ((arg1 + 21) / 42);
        long var3 = class242.method1638(arg0, -14393);
        int var5 = 0;
        if (var3 == 0L) {
            return;
        }
        while (var5 < class125.field1964.length && class125.field1964[var5].field1603 != var3) {
            var5++;
        }
        if (class125.field1964.length > var5 && class125.field1964[var5] != null) {
            class152.field2282++;
            class234.field3507.method28(182, false);
            class234.field3507.method1816(class125.field1964[var5].field1603, 21054);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 191)
    public class138() {
        this(0);
    }
}
