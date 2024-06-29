import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class148 extends class88 {

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public int field2319 = 0;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public int field2316 = 12800;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public int field2320 = -1;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public int field2330 = 12800;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
    public int field2334 = 0;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "Z")
    public boolean field2335 = true;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public int field2325 = -1;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "Ljava/lang/String;")
    public String field2337;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "Ljava/lang/String;")
    public String field2323;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "Lab;")
    public class269 field2329;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "[I")
    public static int[] field2328 = new int[100];

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field2336 = "Please remove ";

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2314++;
        int var8 = arg1 + 1;
        class78.method433(arg4, arg2, class14.field186[arg1], arg0, (byte) 123);
        int var9 = arg3 - 1;
        class78.method433(arg4, arg2, class14.field186[arg3], arg0, (byte) 123);
        if (arg5 == -78) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class14.field186[var6];
                var7[arg2] = var7[arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBII)[I")
    public final int[] method1020(int arg0, byte arg1, int arg2, int arg3) {
        field2315++;
        class89 var5 = (class89) this.field2329.method1802(43);
        if (arg1 != 63) {
            this.field2335 = true;
        }
        while (var5 != null) {
            if (var5.method489(arg3, arg2, 0, arg0)) {
                return var5.method491((byte) 99, arg3, arg0);
            }
            var5 = (class89) this.field2329.method1815(arg1 - 63);
        }
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)Z")
    public final boolean method1021(int arg0, int arg1, byte arg2) {
        field2318++;
        if (arg2 <= 102) {
            method1023(-56);
        }
        for (class89 var4 = (class89) this.field2329.method1802(43); var4 != null; var4 = (class89) this.field2329.method1815(0)) {
            if (var4.method488(arg0, (byte) -114, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)[I")
    public final int[] method1022(int arg0, int arg1, int arg2) {
        field2327++;
        if (arg2 != 0) {
            method1019(-57, -109, 76, -24, -74, (byte) -50);
        }
        for (class89 var4 = (class89) this.field2329.method1802(arg2 + 43); var4 != null; var4 = (class89) this.field2329.method1815(0)) {
            if (var4.method488(arg0, (byte) -97, arg1)) {
                return var4.method491((byte) 125, arg1, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static void method1023(int arg0) {
        if (arg0 != 0) {
            field2326 = 91;
        }
        field2328 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
    public final void method1024(byte arg0) {
        int var2 = -114 / ((arg0 + 11) / 32);
        field2332++;
        this.field2330 = 12800;
        this.field2334 = 0;
        this.field2319 = 0;
        this.field2316 = 12800;
        for (class89 var3 = (class89) this.field2329.method1802(43); var3 != null; var3 = (class89) this.field2329.method1815(0)) {
            if (var3.field1093 < this.field2330) {
                this.field2330 = var3.field1093;
            }
            if (this.field2334 < var3.field1108) {
                this.field2334 = var3.field1108;
            }
            if (var3.field1101 > this.field2319) {
                this.field2319 = var3.field1101;
            }
            if (var3.field1105 < this.field2316) {
                this.field2316 = var3.field1105;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)[I")
    public final int[] method1025(int arg0, int arg1, int arg2) {
        field2317++;
        if (arg2 != 12800) {
            this.method1020(96, (byte) -112, 73, -15);
        }
        for (class89 var4 = (class89) this.field2329.method1802(43); var4 != null; var4 = (class89) this.field2329.method1815(0)) {
            if (var4.method485(arg2 ^ 0x3205, arg1, arg0)) {
                return var4.method490(arg0, arg1, arg2 - 12795);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class148(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2337 = arg2;
        this.field2321 = arg3;
        this.field2333 = arg0;
        this.field2325 = arg4;
        this.field2323 = arg1;
        this.field2335 = arg5;
        this.field2320 = arg6;
        if (this.field2320 == 255) {
            this.field2320 = 0;
        }
        this.field2329 = new class269();
    }
}
