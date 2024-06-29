import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class219 extends class194 {

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method1524(boolean arg0) {
        field3289++;
        if (client.field4443 == 10 && class272.field4317) {
            method1525((byte) 110, 28);
        }
        if (arg0) {
            method1524(true);
        }
        if (client.field4443 == 30) {
            method1525((byte) 46, 25);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[[I", line = 26)
    public final int[][] method681(int arg0, byte arg1) {
        field3291++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (arg1 != -119) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4752.field4179 && this.method1345(-128)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field2943 * this.field2943;
            for (int var8 = 0; var8 < class31.field367; var8++) {
                int var9 = this.field2953[var7 + (var8 % this.field2955)];
                var6[var8] = class261.method1840(255, var9) << 4;
                var5[var8] = class261.method1840(var9, 65280) >> 4;
                var4[var8] = class261.method1840(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V", line = 75)
    public static final void method1525(byte arg0, int arg1) {
        field3292++;
        if (client.field4443 == arg1) {
            return;
        }
        if (client.field4443 == 0) {
            class75.method468(-1);
        }
        int var2 = 9 % ((-arg0 - 13) / 58);
        if (arg1 == 40) {
            class85.method541(false);
        }
        boolean var3 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class187.field2827 != null) {
            class187.field2827.method1527(118);
            class187.field2827 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class333.field5331 = 0;
            class65.field779 = 0;
            class36.field420 = 0;
            class308.field4779 = 1;
            class227.field3437 = 1;
            class151.method1104(-1, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class111.method725(13402);
        }
        if (arg1 == 5) {
            class208.method1457(class65.field786, (byte) 55);
        } else {
            class332.method2300(87);
        }
        boolean var4 = client.field4443 == 5 || client.field4443 == 10 || client.field4443 == 28;
        if (var3 != var4) {
            if (var3) {
                class278.field4370 = client.field4442;
                if (class31.field365 == 0) {
                    class125.method855(false, 2);
                } else {
                    class163.method1173(2, -11014, false, class60.field714, 0, client.field4442, 255);
                }
                class179.field2684.method507((byte) -65, false);
            } else {
                class125.method855(false, 2);
                class179.field2684.method507((byte) -127, true);
            }
        }
        if (class272.field4317 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class272.method1953();
        }
        client.field4443 = arg1;
    }
}
