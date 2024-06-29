import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class217 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field2738 = new int[5];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
    public static boolean field2736;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ldfa;I)V", line = 3)
    public static final void method1311(class757 arg0, int arg1) {
        arg0.method1112(class562.field7865.method3833((byte) 124), -123);
        field2735++;
        arg0.method1112(class459.field6436.method3833((byte) -92), -126);
        arg0.method1112(class565.field7911.method3833((byte) 75), -122);
        arg0.method1112(class570.field7946.method3833((byte) -82), -116);
        arg0.method1112(class1.field2.method3833((byte) 117), -117);
        arg0.method1112(class541.field7613.method3833((byte) 99), -126);
        arg0.method1112(class456.field6388.method3833((byte) 122), -116);
        arg0.method1112(class426.field6058.method3833((byte) 98), -126);
        arg0.method1112(class645.field8897.method3833((byte) 111), -125);
        arg0.method1112(class399.field5523.method3833((byte) 81), -120);
        arg0.method1112(class548.field7731.method3833((byte) 91), -119);
        if (arg1 >= -93) {
            return;
        }
        arg0.method1112(class487.field6937.method3833((byte) 99), -128);
        arg0.method1112(class27.field446.method3833((byte) 118), -116);
        arg0.method1112(class378.field5293.method3833((byte) -72), -116);
        arg0.method1112(class107.field1327.method3833((byte) -96), -116);
        arg0.method1112(class250.field3179.method3833((byte) -84), -124);
        arg0.method1112(class274.field3470.method3833((byte) -69), -116);
        arg0.method1112(class37.field544.method3833((byte) -67), -116);
        arg0.method1112(class687.field9729.method3833((byte) -122), -124);
        arg0.method1112(class438.field6162.method3833((byte) 75), -124);
        arg0.method1112(class530.field7471.method3833((byte) -123), -116);
        arg0.method1112(class394.field5493.method3833((byte) 106), -118);
        arg0.method1112(class102.field1255.method3833((byte) 111), -122);
        arg0.method1112(class250.field3180.method3833((byte) 98), -127);
        arg0.method1112(class494.field6985.method3833((byte) 78), -128);
        arg0.method1112(class505.field7136.method3833((byte) -121), -121);
        arg0.method1112(class224.field2954.method3833((byte) -66), -126);
        arg0.method1112(class322.field4109.method3833((byte) 92), -116);
        arg0.method1112(class395.field5502.method3833((byte) 86), -123);
        arg0.method1112(class603.field8364.method3833((byte) -84), -123);
        arg0.method1112(class663.field9080.method3833((byte) 107), -125);
        arg0.method1112(class447.field6293.method3833((byte) -110), -124);
        arg0.method1112(class145.method897(-64), -126);
        arg0.method1112(class20.method219(85), -124);
        arg0.method1112(class583.field8102.method3833((byte) 120), -119);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 48)
    public static final void method1312(int arg0, int arg1, int arg2) {
        field2734++;
        class548 var3 = class696.method3872(arg1, arg0, -1633381944);
        var3.method3130(73);
        var3.field7725 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 59)
    public static void method1313(boolean arg0) {
        if (arg0) {
            field2738 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/lang/String;I[BI)I", line = 79)
    public static final int method1314(int arg0, int arg1, String arg2, int arg3, byte[] arg4, int arg5) {
        field2737++;
        int var6 = arg0 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg1 + var7] = -97;
            } else {
                arg4[arg1 + var7] = 63;
            }
        }
        if (arg3 != -8250) {
            method1311(null, -51);
        }
        return var6;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 215)
    public static final void method1315(byte arg0) {
        if (class458.field6407.method176()) {
            class458.field6407.method140(class68.field939);
            class120.method792(-17747);
            if (class107.field1323) {
                class380.method2297(class68.field939, (byte) 54);
            } else {
                Dimension var1 = class68.field939.getSize();
                class458.field6407.method98(class68.field939, var1.width, var1.height);
            }
            class458.field6407.method95(class68.field939);
        } else {
            class462.method2730(1, false, class223.field2944.field633.method4191((byte) -121));
        }
        if (arg0 != -101) {
            method1313(true);
        }
        field2739++;
        class728.method4033(-120);
        class571.field7967 = true;
    }
}
