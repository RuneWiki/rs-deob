import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class12 extends class90 {

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public int field157 = 12800;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public int field162 = -1;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "Z")
    public boolean field165 = true;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public int field170 = -1;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public int field175 = 0;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public int field180 = 0;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public int field163 = 12800;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "Ljava/lang/String;")
    public String field179;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "Ljava/lang/String;")
    public String field171;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "Lat;")
    public class412 field161;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field169 = 1;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Lct;")
    public static class285 field159 = new class285(61, 4);

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    public static int field181 = -1;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "Lri;")
    public static class447 field178 = new class447();

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "[Z")
    public static boolean[] field158;

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 283)
    public class12(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field179 = arg1;
        this.field170 = arg6;
        this.field166 = arg0;
        this.field172 = arg3;
        this.field171 = arg2;
        this.field165 = arg5;
        this.field162 = arg4;
        if (this.field170 == 255) {
            this.field170 = 0;
        }
        this.field161 = new class412();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLvg;)I", line = 13)
    public static final int method117(byte arg0, class51 arg1) {
        field160++;
        if (arg0 <= 35) {
            method117((byte) 78, (class51) null);
        }
        int var2 = arg1.method369((byte) 126, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method369((byte) 126, 5);
        } else if (var2 == 2) {
            var3 = arg1.method369((byte) 126, 8);
        } else {
            var3 = arg1.method369((byte) 126, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII[I)Z", line = 40)
    public final boolean method118(boolean arg0, int arg1, int arg2, int[] arg3) {
        field168++;
        for (class17 var5 = (class17) this.field161.method2456(32101); var5 != null; var5 = (class17) this.field161.method2461(301)) {
            if (var5.method177(arg2, arg1, (byte) 16)) {
                var5.method176(arg3, 0, arg2, arg1);
                return true;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 70)
    public final void method119(boolean arg0) {
        if (arg0) {
            method123(-23, (byte) 33, -76);
        }
        this.field157 = 12800;
        field173++;
        this.field180 = 0;
        this.field175 = 0;
        this.field163 = 12800;
        for (class17 var2 = (class17) this.field161.method2456(32101); var2 != null; var2 = (class17) this.field161.method2461(301)) {
            if (var2.field217 < this.field163) {
                this.field163 = var2.field217;
            }
            if (var2.field216 > this.field175) {
                this.field175 = var2.field216;
            }
            if (var2.field224 < this.field157) {
                this.field157 = var2.field224;
            }
            if (var2.field212 > this.field180) {
                this.field180 = var2.field212;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z", line = 116)
    public final boolean method120(int arg0, int arg1, int arg2) {
        if (arg1 != -24637) {
            this.method120(72, 76, 65);
        }
        field167++;
        for (class17 var4 = (class17) this.field161.method2456(32101); var4 != null; var4 = (class17) this.field161.method2461(arg1 ^ 0xFFFF9EEE)) {
            if (var4.method177(arg0, arg2, (byte) -104)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 138)
    public static void method121(byte arg0) {
        field178 = null;
        field159 = null;
        field158 = null;
        if (arg0 > -101) {
            method121((byte) -122);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIIB)Z", line = 150)
    public final boolean method122(int[] arg0, int arg1, int arg2, byte arg3) {
        field174++;
        for (class17 var5 = (class17) this.field161.method2456(32101); var5 != null; var5 = (class17) this.field161.method2461(301)) {
            if (var5.method174(arg2, arg1, -28)) {
                var5.method181(arg2, arg0, arg1, -378);
                return true;
            }
        }
        if (arg3 <= 60) {
            method123(62, (byte) -5, -14);
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V", line = 177)
    public static final void method123(int arg0, byte arg1, int arg2) {
        field177++;
        if (class156.field2169 != arg2) {
            class288.field4397 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class288.field4397[var3] = (var3 << 12) / arg2;
            }
            class428.field6112 = arg2 - 1;
            class156.field2169 = arg2;
            class126.field1715 = arg2 * 32;
        }
        if (arg1 > -8) {
            method123(-41, (byte) 92, 23);
        }
        if (class487.field6842 == arg0) {
            return;
        }
        if (class156.field2169 == arg0) {
            class14.field206 = class288.field4397;
        } else {
            class14.field206 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class14.field206[var4] = (var4 << 12) / arg0;
            }
        }
        class493.field6947 = arg0 - 1;
        class487.field6842 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[III)Z", line = 243)
    public final boolean method124(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field164++;
        if (arg0 >= -89) {
            return false;
        }
        for (class17 var6 = (class17) this.field161.method2456(32101); var6 != null; var6 = (class17) this.field161.method2461(301)) {
            if (var6.method173(arg3, arg4, 1, arg1)) {
                var6.method176(arg2, 0, arg1, arg3);
                return true;
            }
        }
        return false;
    }
}
