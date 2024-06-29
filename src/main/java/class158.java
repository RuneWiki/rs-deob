import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class158 extends class525 {

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field2407 = -1;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public int field2408 = 12800;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public int field2419 = 12800;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public int field2404 = 0;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public int field2412 = 0;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "Z")
    public boolean field2414 = true;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public int field2411 = -1;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljava/lang/String;")
    public String field2417;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
    public String field2421;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Lgw;")
    public class118 field2406;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public static final void method1103(int arg0, int arg1) {
        class94.field1501 = -1;
        if (arg1 != -76) {
            return;
        }
        field2410++;
        if (arg0 == 37) {
            class382.field5460 = 3.0F;
        } else if (arg0 == 50) {
            class382.field5460 = 4.0F;
        } else if (arg0 == 75) {
            class382.field5460 = 6.0F;
        } else if (arg0 == 100) {
            class382.field5460 = 8.0F;
        } else if (arg0 == 200) {
            class382.field5460 = 16.0F;
        }
        class94.field1501 = -1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[III)Z")
    public final boolean method1104(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field2420++;
        for (class440 var6 = (class440) this.field2406.method863(-1); var6 != null; var6 = (class440) this.field2406.method865(-1)) {
            if (var6.method2588(arg4, arg0, arg1, arg3 ^ 0xFFFFFB1F)) {
                var6.method2589(arg2, (byte) 115, arg1, arg4);
                return true;
            }
        }
        if (arg3 != -1190) {
            this.method1105(85, -92, 81);
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
    public final boolean method1105(int arg0, int arg1, int arg2) {
        field2418++;
        for (class440 var4 = (class440) this.field2406.method863(arg0 - 8367); var4 != null; var4 = (class440) this.field2406.method865(-1)) {
            if (var4.method2590(arg1, arg2, true)) {
                return true;
            }
        }
        if (arg0 != 8366) {
            this.method1105(-33, 85, 82);
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[II)Z")
    public final boolean method1106(int arg0, int arg1, int[] arg2, int arg3) {
        field2405++;
        if (arg1 != 50) {
            return false;
        }
        for (class440 var5 = (class440) this.field2406.method863(-1); var5 != null; var5 = (class440) this.field2406.method865(-1)) {
            if (var5.method2590(arg0, arg3, true)) {
                var5.method2589(arg2, (byte) 106, arg3, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIII)Z")
    public final boolean method1107(int[] arg0, int arg1, int arg2, int arg3) {
        field2413++;
        for (class440 var5 = (class440) this.field2406.method863(-1); var5 != null; var5 = (class440) this.field2406.method865(-1)) {
            if (var5.method2587((byte) -108, arg3, arg2)) {
                var5.method2586(arg0, arg3, -8, arg2);
                return true;
            }
        }
        if (arg1 != -5906) {
            this.field2412 = -90;
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final void method1108(int arg0) {
        this.field2408 = 12800;
        this.field2404 = arg0;
        this.field2412 = 0;
        field2415++;
        this.field2419 = 12800;
        for (class440 var2 = (class440) this.field2406.method863(~arg0); var2 != null; var2 = (class440) this.field2406.method865(-1)) {
            if (var2.field6267 > this.field2412) {
                this.field2412 = var2.field6267;
            }
            if (var2.field6261 > this.field2404) {
                this.field2404 = var2.field6261;
            }
            if (this.field2419 > var2.field6272) {
                this.field2419 = var2.field6272;
            }
            if (this.field2408 > var2.field6264) {
                this.field2408 = var2.field6264;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class158(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2416 = arg0;
        this.field2414 = arg5;
        this.field2411 = arg4;
        this.field2417 = arg1;
        this.field2421 = arg2;
        this.field2409 = arg3;
        this.field2407 = arg6;
        if (this.field2407 == 255) {
            this.field2407 = 0;
        }
        this.field2406 = new class118();
    }
}
