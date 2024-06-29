import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class152 extends class337 {

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
    private int[] field2323 = new int[this.field5230];

    @OriginalMember(owner = "client!d", name = "A", descriptor = "[I")
    public static int[] field2328 = new int[50];

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Z")
    public static boolean field2329 = false;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
    public static int[] field2333 = new int[1000];

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Llc;")
    public static class176 field2330;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[B")
    private byte[] field2332;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[Lug;")
    public static class321[] field2336;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5230; var7++) {
            this.field2323[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZI)V", line = 21)
    public final void method98(int arg0, boolean arg1, int arg2) {
        field2337++;
        this.field2325 += this.field2323[arg2] * arg0 >> 12;
        if (!arg1) {
            method1061(65, -93);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 36)
    public static void method1060(boolean arg0) {
        field2328 = null;
        if (!arg0) {
            method1063((String[]) null, 101);
        }
        field2330 = null;
        field2333 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I", line = 49)
    public static final int method1061(int arg0, int arg1) {
        if (arg1 != 5) {
            field2328 = (int[]) null;
        }
        class341 var2 = class234.method1680(arg0, 0);
        int var3 = var2.field5308;
        int var4 = var2.field5306;
        field2322++;
        int var5 = var2.field5318;
        int var6 = class86.field1308[var5 - var4];
        return var6 & class29.field422[var3] >> var4;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Z", line = 73)
    public static final boolean method1062(int arg0) {
        if (arg0 <= 114) {
            return false;
        } else {
            field2326++;
            return class186.field2991 ? true : class237.field3757;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 90)
    public static final String[] method1063(String[] arg0, int arg1) {
        field2338++;
        if (arg1 != 5) {
            return (String[]) null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 121)
    public final void method94(int arg0) {
        field2327++;
        this.field2325 = Math.abs(this.field2325);
        if (this.field2325 >= 4096) {
            this.field2325 = 4095;
        }
        this.method1064(this.field2331++, (byte) (this.field2325 >> 4));
        if (arg0 != -11780) {
            field2330 = (class176) null;
        }
        this.field2325 = 0;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 141)
    public final void method97(int arg0) {
        this.field2325 = 0;
        this.field2331 = 0;
        if (arg0 != 1) {
            this.method97(77);
        }
        field2335++;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)V", line = 155)
    public void method1064(int arg0, byte arg1) {
        field2334++;
        this.field2332[this.field2331++] = (byte) ((class200.method1465(255, arg1) >> 1) + 127);
    }
}
