import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class137 extends class172 {

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "[Lof;")
    public class266[] field2511;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field2508 = 20;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
    public static int[] field2513 = new int[5];

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "[I")
    public static int[] field2510;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIB[Laj;Z)V")
    public static final void method956(int arg0, int arg1, int arg2, byte arg3, class47[] arg4, boolean arg5) {
        field2507++;
        if (arg3 != 100) {
            method958((byte) -112);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class47 var7 = arg4[var6];
            if (var7 != null && var7.field707 == arg2) {
                class213.method1447(var7, arg0, arg5, arg1, 2);
                class24.method140(var7, (byte) -116, arg0, arg1);
                if (var7.field861 - var7.field722 < var7.field805) {
                    var7.field805 = var7.field861 - var7.field722;
                }
                if (var7.field824 > (var7.field755 - var7.field727)) {
                    var7.field824 = var7.field755 - var7.field727;
                }
                if (var7.field824 < 0) {
                    var7.field824 = 0;
                }
                if (var7.field805 < 0) {
                    var7.field805 = 0;
                }
                if (var7.field760 == 0) {
                    class258.method1777(arg5, var7, 68);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lal;Lal;ILal;)V")
    public static final void method957(class230 arg0, class230 arg1, int arg2, class230 arg3) {
        field2514++;
        int var4 = 127 % ((arg2 + 67) / 38);
        class98.field1736 = arg1;
        class214.field3798 = arg3;
        class184.field3324 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method958(byte arg0) {
        if (arg0 >= -84) {
            field2513 = null;
        }
        field2510 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
    public final boolean method959(int arg0, int arg1) {
        if (arg0 != 1) {
            field2508 = -45;
        }
        field2512++;
        return this.field2511[arg1].field4749;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)V")
    public static final void method960(byte arg0, int arg1, int arg2) {
        class216 var3 = class139.method972(arg2, false, 12);
        var3.method1459(true);
        var3.field3809 = arg1;
        int var4 = 127 / ((-arg0 - 14) / 63);
        field2509++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Z")
    public final boolean method961(byte arg0, int arg1) {
        field2516++;
        int var3 = -96 / ((arg0 - 45) / 34);
        return this.field2511[arg1].field4742;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lal;Lal;IZ)V")
    public class137(class230 arg0, class230 arg1, int arg2, boolean arg3) {
        class157 var5 = new class157();
        int var6 = arg0.method1559(arg2, -100);
        this.field2511 = new class266[var6];
        int[] var7 = arg0.method1555(arg2, (byte) 77);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1562(-809612665, var7[var8], arg2);
            class40 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class40 var12 = (class40) var5.method1140(0); var12 != null; var12 = (class40) var5.method1127(0)) {
                if (var12.field631 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1560(0, var11, (byte) -39);
                } else {
                    var13 = arg1.method1560(var11, 0, (byte) 101);
                }
                var10 = new class40(var11, var13);
                var5.method1131(var10, false);
            }
            this.field2511[var7[var8]] = new class266(var9, var10);
        }
    }
}
