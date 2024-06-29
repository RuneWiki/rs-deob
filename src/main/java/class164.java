import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class164 extends class303 {

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    private int field2593;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "Lbn;")
    public static class378 field2599 = new class378(6, 4);

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    private int field2601;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[B")
    private byte[] field2596;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 8)
    public static final void method1184(int arg0, String arg1, boolean arg2) {
        field2597++;
        int var3 = class551.field8224;
        int[] var4 = class314.field4332;
        boolean var5 = arg2;
        for (int var6 = 0; var6 < var3; var6++) {
            class373 var7 = class293.field4036[var4[var6]];
            if (var7 != null && class541.field8119 != var7 && var7.field5138 != null && var7.field5138.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class402.method2367(class493.field7003, (byte) 119);
                    field2587++;
                    class112.field1589.method1008(false, var4[var6]);
                    class112.field1589.method1010(125, 0);
                } else if (arg0 == 4) {
                    class402.method2367(class56.field667, (byte) 113);
                    class148.field2193++;
                    class112.field1589.method1012(976668456, var4[var6]);
                    class112.field1589.method1010(125, 0);
                } else if (arg0 == 5) {
                    class287.field4006++;
                    class402.method2367(class512.field7290, (byte) 84);
                    class112.field1589.method1054(0, true);
                    class112.field1589.method1017(var4[var6], 428082024);
                } else if (arg0 == 6) {
                    class402.method2367(class541.field8115, (byte) 69);
                    class115.field1617++;
                    class112.field1589.method1036((byte) 112, 0);
                    class112.field1589.method1017(var4[var6], 428082024);
                } else if (arg0 == 7) {
                    class402.method2367(class148.field2187, (byte) 127);
                    class178.field2713++;
                    class112.field1589.method1036((byte) -56, 0);
                    class112.field1589.method1027(255, var4[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class568.method3389(-126, class536.field7980.method3408(123, class63.field795) + arg1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBZ)V", line = 86)
    public void method97(int arg0, byte arg1, boolean arg2) {
        if (!arg2) {
            this.field2596[arg0] = arg1;
            field2589++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIFFF)V", line = 103)
    public class164(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2592 = (int) (arg7 * 4096.0F);
        this.field2602 = (int) (arg6 * 4096.0F);
        this.field2593 = this.field2588 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 115)
    public final void method1185(int arg0, int arg1, int arg2) {
        if (arg1 >= -112) {
            this.method97(82, (byte) 98, true);
        }
        field2591++;
        if (arg0 == 0) {
            this.field2594 = this.field2602 - (arg2 < 0 ? -arg2 : arg2);
            this.field2603 = 4096;
            this.field2594 = this.field2594 * this.field2594 >> 12;
            this.field2601 = this.field2594;
            return;
        }
        this.field2603 = this.field2594 * this.field2592 >> 12;
        this.field2594 = this.field2602 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field2603 < 0) {
            this.field2603 = 0;
        } else if (this.field2603 > 4096) {
            this.field2603 = 4096;
        }
        this.field2594 = this.field2594 * this.field2594 >> 12;
        this.field2594 = this.field2603 * this.field2594 >> 12;
        this.field2601 += this.field2594 * this.field2593 >> 12;
        this.field2593 = this.field2593 * this.field2588 >> 12;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 150)
    public static void method1186(byte arg0) {
        field2599 = null;
        if (arg0 != -100) {
            field2599 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 162)
    public final void method1187(int arg0) {
        field2598++;
        if (arg0 != 32275) {
            this.field2592 = 49;
        }
        this.field2593 = this.field2588;
        this.field2601 >>= 0x4;
        if (this.field2601 < 0) {
            this.field2601 = 0;
        } else if (this.field2601 > 255) {
            this.field2601 = 255;
        }
        this.method97(this.field2590++, (byte) this.field2601, false);
        this.field2601 = 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 184)
    public final void method1188(byte arg0) {
        this.field2590 = 0;
        if (arg0 != -68) {
            this.field2601 = -93;
        }
        field2600++;
        this.field2601 = 0;
    }
}
