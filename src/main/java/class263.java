import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class263 extends class152 {

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "[J")
    public static long[] field4392 = new long[1000];

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "[I")
    public static int[] field4389;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLcj;)V", line = 8)
    public static final void method1769(byte arg0, class301 arg1) {
        if (arg0 != -56) {
            method1769((byte) -46, (class301) null);
        }
        class314 var2 = (class314) class199.field3389.method1631(false, arg1.field5019.method845((byte) -128));
        field4391++;
        if (var2 == null) {
            return;
        }
        if (var2.field5382 != null) {
            class278.field4633.method562(var2.field5382);
            var2.field5382 = null;
        }
        var2.method499((byte) 64);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)V", line = 31)
    public static final void method1770(int arg0, int arg1) {
        class209.field3571.method1175(true, arg0);
        class223.field3756.method1175(true, arg0);
        if (arg1 == 3238) {
            field4388++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)Lvj;", line = 46)
    public static final class184 method1771(int arg0) {
        field4390++;
        int var1 = class279.field4643[0] * field4389[0];
        int var2 = 29 / ((arg0 - 9) / 40);
        byte[] var3 = class190.field3255[0];
        int[] var4 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = class241.field4062[class47.method289(var3[var5], 255)];
        }
        class184 var6 = new class184(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], field4389[0], var4);
        class197.method1395((byte) 127);
        return var6;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)[I", line = 80)
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        field4387++;
        if (!arg0) {
            field4389 = (int[]) null;
        }
        if (this.field2776.field4516) {
            int[][] var4 = this.method1133(arg1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class244.field4133; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 113)
    public class263() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V", line = 127)
    public static void method1772(boolean arg0) {
        if (!arg0) {
            field4392 = null;
            field4389 = null;
        }
    }
}
