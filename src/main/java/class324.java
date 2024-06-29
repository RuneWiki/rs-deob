import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class324 extends class13 {

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "J")
    public long field4502;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Z")
    public boolean field4507;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
    public boolean field4494;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Ljava/lang/String;")
    public String field4498;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Z")
    public boolean field4508;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Ljava/lang/String;")
    public String field4490;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "J")
    public long field4497;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Leq;")
    public static class213 field4500 = new class213(16);

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
    public static int[] field4509 = new int[8];

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Ljava/lang/String;")
    public String field4492;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 4)
    public static void method2071(int arg0) {
        field4509 = null;
        int var1 = 29 / ((31 - arg0) / 43);
        field4500 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I", line = 18)
    public static final int method2072(int arg0) {
        field4493++;
        if (class699.field9455 == null) {
            if (arg0 >= -59) {
                field4501 = 79;
            }
            return class216.field3132 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I[II)V", line = 32)
    public static final void method2073(int[] arg0, int[] arg1, int arg2) {
        field4503++;
        if (arg0 == null || arg1 == null) {
            class525.field7270 = null;
            class387.field5621 = null;
            class275.field3869 = null;
            return;
        }
        class275.field3869 = arg0;
        class387.field5621 = new int[arg0.length];
        class525.field7270 = new byte[arg0.length][][];
        for (int var3 = arg2; var3 < class275.field3869.length; var3++) {
            class525.field7270[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 72)
    public static final void method2074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -123) {
            method2072(14);
        }
        class640.field8803 = arg3;
        class343.field4814 = arg2;
        class547.field7541 = arg1;
        class641.field8817 = arg4;
        field4495++;
        class276.field3874 = arg0;
        if (class640.field8803 >= 100) {
            int var6 = class547.field7541 * 512 + 256;
            int var7 = class276.field3874 * 512 + 256;
            int var8 = class197.method1403(var6, class382.field5551, 11219, var7) - class343.field4814;
            int var9 = var6 - class108.field1896;
            int var10 = var8 - class458.field6444;
            int var11 = var7 - class275.field3870;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class634.field8721 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class600.field8231 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class634.field8721 < 1024) {
                class634.field8721 = 1024;
            }
            class546.field7523 = 0;
            if (class634.field8721 > 3072) {
                class634.field8721 = 3072;
            }
        }
        class438.field6252 = 2;
        class705.field9558 = -1;
        class44.field978 = -1;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 127)
    public class324(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field4504 = arg7;
        this.field4505 = arg3;
        this.field4496 = arg4;
        this.field4502 = arg5;
        this.field4507 = arg8;
        this.field4494 = arg9;
        this.field4498 = arg1;
        this.field4508 = arg11;
        this.field4490 = arg0;
        this.field4506 = arg2;
        this.field4497 = arg10;
        this.field4499 = arg6;
    }
}
