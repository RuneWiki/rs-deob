import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class422 extends class223 {

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    private int field6236;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    private int field6228;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    private int field6231;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    private int field6232;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field6226 = 0;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/lang/String;")
    public static String field6234 = "Drop";

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field6241 = 0;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field6233 = 0;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field6247 = -1;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    private int field6229;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "Lmo;")
    public static class447 field6242;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "[B")
    private byte[] field6230;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BJ)V")
    public static final void method2623(byte arg0, long arg1) {
        field6240++;
        int var3 = 126 / ((13 - arg0) / 61);
        int var4 = class221.field3674 + class261.field4201.field724;
        int var5 = class119.field1636 + class261.field4201.field722;
        if (class217.field3555 - var4 < -500 || class217.field3555 - var4 > 500 || class163.field2551 - var5 < -500 || (class163.field2551 - var5) > 500) {
            class163.field2551 = var5;
            class217.field3555 = var4;
        }
        if (class217.field3555 != var4) {
            int var6 = var4 - class217.field3555;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var6 < var7) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            class217.field3555 += var7;
        }
        if (!class301.field4772) {
            class316.field4958 += (float) arg1 * class137.field2144 / 6.0F;
            class329.field5153 += (float) arg1 * class424.field6260 / 6.0F;
        }
        if (class163.field2551 != var5) {
            int var8 = var5 - class163.field2551;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var9 < var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var9 > var8) {
                var9 = var8;
            }
            class163.field2551 += var9;
        }
        class372.method2376(80);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public final void method1210(boolean arg0) {
        field6243++;
        this.field6232 = this.field6231;
        this.field6223 >>= 0x4;
        if (this.field6223 < 0) {
            this.field6223 = 0;
        } else if (this.field6223 > 255) {
            this.field6223 = 255;
        }
        this.method133(this.field6229++, (byte) this.field6223);
        if (!arg0) {
            this.method1212(56, -12, (byte) 45);
        }
        this.field6223 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIILjava/lang/String;II)I")
    public static final int method2624(byte[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        int var6 = 118 % ((arg2 - 89) / 33);
        field6245++;
        int var7 = arg1 - arg4;
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(arg4 + var8);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg0[arg5 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg0[arg5 + var8] = -128;
            } else if (var9 == '‚') {
                arg0[arg5 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg0[arg5 + var8] = -125;
            } else if (var9 == '„') {
                arg0[arg5 + var8] = -124;
            } else if (var9 == '…') {
                arg0[arg5 + var8] = -123;
            } else if (var9 == '†') {
                arg0[arg5 + var8] = -122;
            } else if (var9 == '‡') {
                arg0[arg5 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg0[arg5 + var8] = -120;
            } else if (var9 == '‰') {
                arg0[arg5 + var8] = -119;
            } else if (var9 == 'Š') {
                arg0[arg5 + var8] = -118;
            } else if (var9 == '‹') {
                arg0[arg5 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg0[arg5 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg0[arg5 + var8] = -114;
            } else if (var9 == '‘') {
                arg0[arg5 + var8] = -111;
            } else if (var9 == '’') {
                arg0[arg5 + var8] = -110;
            } else if (var9 == '“') {
                arg0[arg5 + var8] = -109;
            } else if (var9 == '”') {
                arg0[arg5 + var8] = -108;
            } else if (var9 == '•') {
                arg0[arg5 + var8] = -107;
            } else if (var9 == '–') {
                arg0[arg5 + var8] = -106;
            } else if (var9 == '—') {
                arg0[arg5 + var8] = -105;
            } else if (var9 == '˜') {
                arg0[arg5 + var8] = -104;
            } else if (var9 == '™') {
                arg0[arg5 + var8] = -103;
            } else if (var9 == 'š') {
                arg0[arg5 + var8] = -102;
            } else if (var9 == '›') {
                arg0[arg5 + var8] = -101;
            } else if (var9 == 'œ') {
                arg0[arg5 + var8] = -100;
            } else if (var9 == 'ž') {
                arg0[arg5 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg0[arg5 + var8] = -97;
            } else {
                arg0[arg5 + var8] = 63;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public final void method1209(int arg0) {
        this.field6223 = 0;
        if (arg0 >= 18) {
            field6224++;
            this.field6229 = 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6236 = (int) (arg6 * 4096.0F);
        this.field6228 = (int) (arg7 * 4096.0F);
        this.field6232 = this.field6231 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Object;ILap;)V")
    public static final void method2625(Object arg0, int arg1, class279 arg2) {
        int var3 = -110 / ((-arg1 - 13) / 57);
        field6238++;
        if (arg2.field4468 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg2.field4468.peekEvent() != null; var4++) {
            class84.method517((byte) -70, 1L);
        }
        if (arg0 != null) {
            arg2.field4468.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
    public void method133(int arg0, byte arg1) {
        field6246++;
        this.field6230[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)V")
    public final void method1212(int arg0, int arg1, byte arg2) {
        int var4 = 65 / ((-arg2 - 51) / 51);
        if (arg0 == 0) {
            this.field6237 = this.field6236 - (arg1 >= 0 ? arg1 : -arg1);
            this.field6225 = 4096;
            this.field6237 = this.field6237 * this.field6237 >> 12;
            this.field6223 = this.field6237;
        } else {
            this.field6225 = this.field6237 * this.field6228 >> 12;
            if (this.field6225 < 0) {
                this.field6225 = 0;
            } else if (this.field6225 > 4096) {
                this.field6225 = 4096;
            }
            this.field6237 = this.field6236 - (arg1 < 0 ? -arg1 : arg1);
            this.field6237 = this.field6237 * this.field6237 >> 12;
            this.field6237 = this.field6237 * this.field6225 >> 12;
            this.field6223 += this.field6237 * this.field6232 >> 12;
            this.field6232 = this.field6232 * this.field6231 >> 12;
        }
        field6239++;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(Z)V")
    public static void method2626(boolean arg0) {
        field6234 = null;
        field6242 = null;
        if (!arg0) {
            method2626(true);
        }
    }
}
