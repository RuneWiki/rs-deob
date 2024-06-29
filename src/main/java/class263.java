import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class263 extends class304 {

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4050 = "cyan:";

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field4057 = -1;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "[Ltf;")
    public static class128[] field4058 = new class128[4];

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lmg;")
    public static class64 field4054;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[[[Lvb;")
    public static class79[][][] field4062;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 5)
    public static void method1846(int arg0) {
        field4050 = null;
        field4054 = null;
        field4058 = null;
        field4062 = (class79[][][]) null;
        if (arg0 >= -65) {
            method1848(true, (class95) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V", line = 18)
    private final void method1847(int arg0, byte arg1) {
        field4055++;
        this.field4061 = arg0 >> 12 & 0xFF0;
        if (arg1 == -45) {
            this.field4052 = arg0 & 0xFF << 4;
            this.field4053 = (arg0 & 0xFF00) >> 4;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 40)
    public class263() {
        this(0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwm;II)V", line = 48)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field4056++;
        if (arg2 == -2828 && arg1 == 0) {
            this.method1847(arg0.method1758((byte) 75), (byte) -45);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ZLjd;)V", line = 75)
    public static final void method1848(boolean arg0, class95 arg1) {
        class102.field1479 = arg1;
        class275.field4282 = class102.field1479.method685((byte) 15, 16);
        if (!arg0) {
            field4057 = 13;
        }
        field4059++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I", line = 92)
    public final int[][] method75(int arg0, int arg1) {
        if (arg1 != 0) {
            method1848(true, (class95) null);
        }
        field4060++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class218.field3333; var7++) {
                var4[var7] = this.field4061;
                var5[var7] = this.field4053;
                var6[var7] = this.field4052;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V", line = 129)
    private class263(int arg0) {
        super(0, false);
        this.method1847(arg0, (byte) -45);
    }
}
