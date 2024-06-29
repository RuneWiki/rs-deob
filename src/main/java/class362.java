import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class362 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field5738;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field5737;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Ljl;")
    public static class332 field5740 = new class332(30);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Z")
    public static boolean[] field5745 = new boolean[100];

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I", line = 9)
    public static final int method2536(boolean arg0, String arg1, String arg2, int arg3) {
        int var4 = arg1.length();
        if (!arg0) {
            method2536(true, (String) null, (String) null, 111);
        }
        field5746++;
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var7 - var8 || var5 > (var6 - var9)) {
            if ((var7 - var8) >= var4) {
                return -1;
            }
            if (var6 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var7++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class71.method609((byte) 62, var22);
            var9 = class71.method609((byte) 109, var24);
            char var26 = class254.method1963(var22, arg3, 73);
            char var27 = class254.method1963(var24, arg3, 81);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class277.method2055(arg3, -26, var28) - class277.method2055(arg3, 121, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var5 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class277.method2055(arg3, -101, var16) - class277.method2055(arg3, 114, var17);
                }
            }
        }
        int var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg2.charAt(var19);
            if (var20 != var21) {
                return class277.method2055(arg3, -6, var20) - class277.method2055(arg3, -12, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 136)
    public static void method2537(int arg0) {
        if (arg0 == 0) {
            field5745 = null;
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BLjava/lang/String;IIII)I", line = 148)
    public static final int method2538(byte[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field5742++;
        int var6 = arg2 - arg5;
        int var7 = -60 / ((arg3 + 10) / 43);
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg1.charAt(arg5 + var8);
            if (var9 > '\u0000' && var9 < '\u0080' || var9 >= ' ' && var9 <= 'ÿ') {
                arg0[arg4 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg0[arg4 + var8] = -128;
            } else if (var9 == '‚') {
                arg0[arg4 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg0[arg4 + var8] = -125;
            } else if (var9 == '„') {
                arg0[arg4 + var8] = -124;
            } else if (var9 == '…') {
                arg0[arg4 + var8] = -123;
            } else if (var9 == '†') {
                arg0[arg4 + var8] = -122;
            } else if (var9 == '‡') {
                arg0[arg4 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg0[arg4 + var8] = -120;
            } else if (var9 == '‰') {
                arg0[arg4 + var8] = -119;
            } else if (var9 == 'Š') {
                arg0[arg4 + var8] = -118;
            } else if (var9 == '‹') {
                arg0[arg4 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg0[arg4 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg0[arg4 + var8] = -114;
            } else if (var9 == '‘') {
                arg0[arg4 + var8] = -111;
            } else if (var9 == '’') {
                arg0[arg4 + var8] = -110;
            } else if (var9 == '“') {
                arg0[arg4 + var8] = -109;
            } else if (var9 == '”') {
                arg0[arg4 + var8] = -108;
            } else if (var9 == '•') {
                arg0[arg4 + var8] = -107;
            } else if (var9 == '–') {
                arg0[arg4 + var8] = -106;
            } else if (var9 == '—') {
                arg0[arg4 + var8] = -105;
            } else if (var9 == '˜') {
                arg0[arg4 + var8] = -104;
            } else if (var9 == '™') {
                arg0[arg4 + var8] = -103;
            } else if (var9 == 'š') {
                arg0[arg4 + var8] = -102;
            } else if (var9 == '›') {
                arg0[arg4 + var8] = -101;
            } else if (var9 == 'œ') {
                arg0[arg4 + var8] = -100;
            } else if (var9 == 'ž') {
                arg0[arg4 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg0[arg4 + var8] = -97;
            } else {
                arg0[arg4 + var8] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 286)
    public static final void method2539(int arg0) {
        field5743++;
        if (arg0 != 710) {
            method2536(true, (String) null, (String) null, 62);
        }
        if (class124.field2122) {
            return;
        }
        class124.field2122 = true;
        if (class336.field5314) {
            class261.field4396 = (float) ((int) class261.field4396 - 65 & 0xFFFFFF80);
        } else {
            class259.field4357 += (-class259.field4357 - 24.0F) / 2.0F;
        }
        class175.field2807 = true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lth;IB)Lml;", line = 317)
    public static final class17 method2540(class57 arg0, int arg1, byte arg2) {
        field5741++;
        if (arg2 != -104) {
            field5745 = (boolean[]) null;
        }
        return class45.method333((byte) 72, arg0, arg1) ? class14.method78((byte) 47) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 331)
    public static final void method2541(int arg0, int arg1) {
        field5739++;
        if (arg1 != 14429) {
            method2537(-118);
        }
        class166.field2625.method2334(4, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V", line = 345)
    public class362(int arg0, int arg1, int arg2) {
        this.field5738 = arg0;
        this.field5737 = arg2;
        this.field5744 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)V")
    public abstract void method644(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
    public abstract void method643(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
    public abstract void method642(byte arg0, int arg1, int arg2);
}
