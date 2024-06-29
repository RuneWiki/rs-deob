import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class298 extends class170 {

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field5082 = 0;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "Lmh;")
    public static class128 field5085 = class22.method156(125, "Sprites geladen)3");

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field5078 = 0;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "S")
    public static short field5081 = 256;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "[Lvd;")
    public static class127[] field5077;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "[Lvi;")
    public static class5[] field5087;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "[S")
    public static short[] field5083;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I", line = 4)
    public static final int method2038(int arg0, int arg1) {
        field5084++;
        if (arg1 != 687554119) {
            field5086 = 7;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I", line = 18)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            field5081 = -104;
        }
        field5088++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)V", line = 54)
    public static final void method2039(byte arg0, int arg1) {
        field5089++;
        if (class105.field1799 == arg1) {
            return;
        }
        if (class105.field1799 == 0) {
            class295.method2017(0);
        }
        if (arg1 == 40) {
            class313.method2133(arg0 ^ 0xFFFFFFA3);
        }
        if (arg1 != 40 && class183.field3214 != null) {
            class183.field3214.method1229(false);
            class183.field3214 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class97.field1670 = 0;
            class130.field2272 = 0;
            class314.field5312 = 1;
            class216.field3798 = 1;
            class121.field2046 = 0;
            class88.method547(-1741557305);
        }
        if (arg1 == 5) {
            class260.method1821((byte) 62, class4.field74);
        } else {
            class57.method379((byte) 68);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg0 != -52) {
            method2039((byte) -33, -65);
        }
        boolean var3 = class105.field1799 == 5 || class105.field1799 == 10 || class105.field1799 == 28;
        if (var2 != var3) {
            if (var2) {
                class152.field2612 = class162.field2767;
                if (class139.field2391 == 0) {
                    class268.method1869(17714, 2);
                } else {
                    class201.method1400(false, class162.field2767, 0, 2, -100, 255, class162.field2765);
                }
                class56.field1078.method682((byte) 89, false);
            } else {
                class268.method1869(17714, 2);
                class56.field1078.method682((byte) -118, true);
            }
        }
        if (class247.field4247 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class247.method1682();
        }
        class105.field1799 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldj;III)[Lfb;", line = 132)
    public static final class55[] method2040(class314 arg0, int arg1, int arg2, int arg3) {
        field5075++;
        if (class118.method708(-2, arg1, arg0, arg2)) {
            return arg3 == 2 ? class211.method1452(4206) : (class55[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 151)
    public static void method2041(int arg0) {
        int var1 = -39 / ((arg0 + 25) / 63);
        field5083 = null;
        field5087 = null;
        field5077 = null;
        field5085 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[[I", line = 173)
    public final int[][] method62(int arg0, int arg1) {
        int var3 = -108 % ((-arg1 - 24) / 46);
        field5079++;
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[][] var5 = this.method1139(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var5[1];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class185.field3225; var12++) {
                var8[var12] = 4096 - var6[var12];
                var10[var12] = 4096 - var9[var12];
                var11[var12] = 4096 - var7[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 217)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILbg;B)V", line = 229)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            this.method69((byte) 68, 23);
        }
        field5076++;
        if (arg0 == 0) {
            this.field2970 = arg1.method1325(arg2 ^ 0x1DC6) == 1;
        }
    }
}
