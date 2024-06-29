import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class196 extends class82 {

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lwg;")
    public static class177 field2979 = new class177(5000);

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field2988 = 127;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "B")
    public byte field2987;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lpf;")
    public static class294 field2983;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Ljava/lang/String;")
    public String field2981;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/lang/String;")
    public String field2982;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2986++;
        if (class294.method1943((byte) 116, arg3)) {
            class62.method416(arg2, class234.field3532[arg3], arg7, -22614, arg5, arg6, arg8, arg0, -1, arg1);
            if (arg4 > -21) {
                field2988 = 103;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class7.field105[var9] = true;
            }
        } else {
            class7.field105[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lpf;BLpf;Z)V")
    public static final void method1223(class294 arg0, byte arg1, class294 arg2, boolean arg3) {
        class215.field3217 = arg3;
        class283.field4243 = arg0;
        class189.field2893 = arg2;
        field2985++;
        if (arg1 > -53) {
            field2988 = -75;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
    public static void method1224(byte arg0) {
        field2983 = null;
        field2979 = null;
        if (arg0 > -101) {
            method1223((class294) null, (byte) -111, (class294) null, true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(CI)Z")
    public static final boolean method1225(char arg0, int arg1) {
        if (arg1 != -30394) {
            field2988 = -25;
        }
        field2984++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class166.field2544;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILvb;II)V")
    public static final void method1226(int arg0, class61 arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            method1226(94, (class61) null, -80, 78);
        }
        field2978++;
        if (arg1.field2260 == arg2 && arg2 != -1) {
            class215 var4 = class276.method1829(arg2, arg3 + 29224);
            int var5 = var4.field3220;
            if (var5 == 1) {
                arg1.field2207 = 0;
                arg1.field2237 = 0;
                arg1.field2204 = arg0;
                arg1.field2215 = 1;
                arg1.field2270 = 0;
                client.method966((byte) 52, arg1.field2207, false, arg1.field2234, var4, arg1.field2251);
            }
            if (var5 == 2) {
                arg1.field2270 = 0;
            }
        } else if (arg2 == -1 || arg1.field2260 == -1 || class276.method1829(arg2, 29223).field3227 >= class276.method1829(arg1.field2260, arg3 + 29224).field3227) {
            arg1.field2246 = arg1.field2277;
            arg1.field2260 = arg2;
            arg1.field2215 = 1;
            arg1.field2270 = 0;
            arg1.field2204 = arg0;
            arg1.field2237 = 0;
            arg1.field2207 = 0;
            if (arg1.field2260 == -1) {
                return;
            }
            client.method966((byte) 52, arg1.field2207, false, arg1.field2234, class276.method1829(arg1.field2260, 29223), arg1.field2251);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[BILjava/lang/String;I)I")
    public static final int method1227(int arg0, int arg1, byte[] arg2, int arg3, String arg4, int arg5) {
        if (arg3 != 710) {
            method1225((char) 65481, -66);
        }
        field2980++;
        int var6 = arg1 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg5 + var7] = -97;
            } else {
                arg2[arg5 + var7] = 63;
            }
        }
        return var6;
    }
}
