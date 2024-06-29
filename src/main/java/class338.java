import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class338 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4502 = 0;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4503 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Z")
    public static boolean field4511 = false;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "J")
    public long field4510;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Lmk;")
    public static class154 field4512;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lgl;")
    public class338 field4505;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lgl;")
    public class338 field4506;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 8)
    public static void method1966(int arg0) {
        field4512 = null;
        if (arg0 != 31) {
            field4503 = null;
        }
        field4503 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 24)
    public final void method1967(int arg0) {
        field4508++;
        if (this.field4506 == null) {
            return;
        }
        if (arg0 != -1) {
            this.method1967(-34);
        }
        this.field4506.field4505 = this.field4505;
        this.field4505.field4506 = this.field4506;
        this.field4506 = null;
        this.field4505 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI[I)V", line = 41)
    public static final void method1968(byte arg0, int arg1, int[] arg2) {
        int var3 = 31;
        if (arg0 != -69) {
            method1968((byte) -17, -99, (int[]) null);
        }
        while (var3 > 0) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg2[var5 + var4] == 0 && arg2[var4 + var5 - 36 - 1] != 0) {
                    arg2[var4 + var5] = arg1;
                }
            }
            var3--;
        }
        field4504++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILlo;)V", line = 78)
    public static final void method1969(int arg0, class419 arg1) {
        field4501++;
        if (arg0 != 22672) {
            field4512 = null;
        }
        int var2 = arg1.field6029 - class234.field3224;
        int var3 = arg1.field6020 * 128 + arg1.method857((byte) -106) * 64;
        int var4 = arg1.field6089 * 128 + (arg1.method857((byte) -106) * 64);
        arg1.field152 += (var3 - arg1.field152) / var2;
        arg1.field154 += (var4 - arg1.field154) / var2;
        arg1.field6112 = 0;
        if (arg1.field6076 == 0) {
            arg1.method2612(4, 8192);
        }
        if (arg1.field6076 == 1) {
            arg1.method2612(arg0 - 22668, 12288);
        }
        if (arg1.field6076 == 2) {
            arg1.method2612(arg0 ^ 0x5894, 0);
        }
        if (arg1.field6076 == 3) {
            arg1.method2612(4, 4096);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z", line = 116)
    public final boolean method1970(int arg0) {
        field4507++;
        if (arg0 == -2) {
            return this.field4506 != null;
        } else {
            return true;
        }
    }
}
