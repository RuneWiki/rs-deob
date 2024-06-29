import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class138 extends class170 {

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Lqk;")
    public static class207 field2389 = class24.method212(255, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Lqk;")
    public static class207 field2387 = class24.method212(255, "Null");

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "Lqk;")
    public static class207 field2394 = class24.method212(255, "Shift)2click ENABLED(Q");

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    public static int field2396 = -1;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field2388 = 0;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Z")
    public static boolean field2385 = false;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "Lqk;")
    public static class207 field2391 = class24.method212(255, "unzap");

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            this.method32(123, true);
        }
        ++field2393;
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, 71, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class88.field1595; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = 4096 - var6[var11];
                var9[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        int[] var3 = super.field3001.method1538(75, arg1);
        if (arg0 != -30) {
            field2388 = 84;
        }
        ++field2398;
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, arg0 ^ -103);
            for (int var5 = 0; var5 < class88.field1595; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
    public static void method951(int arg0) {
        field2391 = null;
        field2394 = null;
        field2387 = null;
        if (arg0 != -2) {
            field2388 = -118;
        }
        field2389 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            field2387 = null;
        }
        if (~arg2 == -1) {
            super.field2998 = ~arg0.method1045((byte) -84) == -2;
        }
        ++field2392;
    }
}
