import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class431 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    public int[] field6553 = new int[4096];

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    public boolean field6556 = false;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
    public boolean field6558 = true;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    public boolean field6551 = false;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Z")
    private boolean field6560 = false;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
    public boolean field6564 = false;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Z")
    private boolean field6567 = false;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
    private boolean field6565 = false;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public int field6568 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lwk;")
    private class128 field6555;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lmf;")
    private class384 field6562;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    private int field6554;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
    private int[] field6552;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "[I")
    private int[] field6559;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field6563;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
    private final void method2721(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        int var19 = arg7 - arg6;
        int var20 = this.field6568;
        int var21 = 256 - this.field6568;
        int var10000;
        if (!this.field6560) {
            int var128 = arg6 - this.field6557;
            float var129 = arg15 / 8.0F * (float) var128 + arg12;
            float var130 = arg16 / 8.0F * (float) var128 + arg13;
            float var131 = arg17 / 8.0F * (float) var128 + arg14;
            int var132;
            int var133;
            if (var131 == 0.0F) {
                var132 = 0;
                var133 = 0;
            } else {
                var132 = (int) (var129 * 16384.0F / var131);
                var133 = (int) (var130 * 16384.0F / var131);
            }
            float var134 = arg15 + var129;
            float var135 = arg16 + var130;
            float var136 = arg17 + var131;
            int var137;
            int var138;
            if (var136 == 0.0F) {
                var137 = 0;
                var138 = 0;
            } else {
                var137 = (int) (var134 * 16384.0F / var136);
                var138 = (int) (var135 * 16384.0F / var136);
            }
            int var139 = (var132 << 18) + var133;
            int var140 = (var137 - var132 >> 3 << 18) + (var138 - var133 >> 3);
            int var141 = var19 >> 3;
            int var142 = arg11 << 3;
            int var143 = arg10 >> 8;
            if (this.field6567) {
                if (var141 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var144 = arg2[(var139 >>> 25) + (var139 & 0x3F80)];
                            int var145 = arg0[arg5];
                            int var146 = ((var144 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var144 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var145 & 0xFF00FF) * var20 + (var146 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var145 & 0xFF00) * var20 + (var146 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        int var147 = arg8 + arg9;
                        arg5++;
                        int var148 = var139 + var140;
                        if (var147 < arg1[arg5]) {
                            int var149 = arg2[(var148 >>> 25) + (var148 & 0x3F80)];
                            int var150 = arg0[arg5];
                            int var151 = ((var149 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var149 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var150 & 0xFF00FF) * var20 + (var151 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var150 & 0xFF00) * var20 + (var151 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var147;
                        }
                        int var152 = arg9 + var147;
                        arg5++;
                        int var153 = var140 + var148;
                        if (var152 < arg1[arg5]) {
                            int var154 = arg2[(var153 >>> 25) + (var153 & 0x3F80)];
                            int var155 = arg0[arg5];
                            int var156 = ((var154 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var154 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var155 & 0xFF00FF) * var20 + (var156 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var155 & 0xFF00) * var20 + (var156 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var152;
                        }
                        int var157 = arg9 + var152;
                        arg5++;
                        int var158 = var140 + var153;
                        if (var157 < arg1[arg5]) {
                            int var159 = arg2[(var158 >>> 25) + (var158 & 0x3F80)];
                            int var160 = arg0[arg5];
                            int var161 = ((var159 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var159 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var160 & 0xFF00FF) * var20 + (var161 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var160 & 0xFF00) * var20 + (var161 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var157;
                        }
                        int var162 = arg9 + var157;
                        arg5++;
                        int var163 = var140 + var158;
                        if (var162 < arg1[arg5]) {
                            int var164 = arg2[(var163 >>> 25) + (var163 & 0x3F80)];
                            int var165 = arg0[arg5];
                            int var166 = ((var164 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var164 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var165 & 0xFF00FF) * var20 + (var166 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var165 & 0xFF00) * var20 + (var166 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var162;
                        }
                        int var167 = arg9 + var162;
                        arg5++;
                        int var168 = var140 + var163;
                        if (var167 < arg1[arg5]) {
                            int var169 = arg2[(var168 >>> 25) + (var168 & 0x3F80)];
                            int var170 = arg0[arg5];
                            int var171 = ((var169 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var169 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var170 & 0xFF00FF) * var20 + (var171 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var170 & 0xFF00) * var20 + (var171 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var167;
                        }
                        int var172 = arg9 + var167;
                        arg5++;
                        int var173 = var140 + var168;
                        if (var172 < arg1[arg5]) {
                            int var174 = arg2[(var173 >>> 25) + (var173 & 0x3F80)];
                            int var175 = arg0[arg5];
                            int var176 = ((var174 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var174 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var175 & 0xFF00FF) * var20 + (var176 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var175 & 0xFF00) * var20 + (var176 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var172;
                        }
                        int var177 = arg9 + var172;
                        arg5++;
                        int var178 = var140 + var173;
                        if (var177 < arg1[arg5]) {
                            int var179 = arg2[(var178 >>> 25) + (var178 & 0x3F80)];
                            int var180 = arg0[arg5];
                            int var181 = ((var179 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var179 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var180 & 0xFF00FF) * var20 + (var181 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var180 & 0xFF00) * var20 + (var181 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var177;
                        }
                        arg8 = arg9 + var177;
                        arg5++;
                        var10000 = var140 + var178;
                        int var183 = var137;
                        int var184 = var138;
                        var134 += arg15;
                        var135 += arg16;
                        var136 += arg17;
                        if (var136 == 0.0F) {
                            var137 = 0;
                            var138 = 0;
                        } else {
                            var137 = (int) (var134 * 16384.0F / var136);
                            var138 = (int) (var135 * 16384.0F / var136);
                        }
                        var139 = (var183 << 18) + var184;
                        var140 = (var137 - var183 >> 3 << 18) + (var138 - var184 >> 3);
                        arg10 += var142;
                        var143 = arg10 >> 8;
                        var141--;
                    } while (var141 > 0);
                }
                int var185 = arg7 - arg6 & 0x7;
                if (var185 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var186 = arg2[(var139 >>> 25) + (var139 & 0x3F80)];
                            int var187 = arg0[arg5];
                            int var188 = ((var186 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var186 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var187 & 0xFF00FF) * var20 + (var188 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var187 & 0xFF00) * var20 + (var188 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        arg8 += arg9;
                        arg5++;
                        var139 += var140;
                        var185--;
                    } while (var185 > 0);
                    return;
                }
            } else {
                if (var141 > 0) {
                    do {
                        int var189;
                        if (arg8 < arg1[arg5] && (var189 = arg2[(var139 >>> 25) + (var139 & 0x3F80)]) != 0) {
                            int var190 = arg0[arg5];
                            int var191 = ((var189 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var189 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var190 & 0xFF00FF) * var20 + (var191 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var190 & 0xFF00) * var20 + (var191 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        int var192 = arg8 + arg9;
                        arg5++;
                        int var193 = var139 + var140;
                        int var194;
                        if (var192 < arg1[arg5] && (var194 = arg2[(var193 >>> 25) + (var193 & 0x3F80)]) != 0) {
                            int var195 = arg0[arg5];
                            int var196 = ((var194 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var194 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var195 & 0xFF00FF) * var20 + (var196 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var195 & 0xFF00) * var20 + (var196 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var192;
                        }
                        int var197 = arg9 + var192;
                        arg5++;
                        int var198 = var140 + var193;
                        int var199;
                        if (var197 < arg1[arg5] && (var199 = arg2[(var198 >>> 25) + (var198 & 0x3F80)]) != 0) {
                            int var200 = arg0[arg5];
                            int var201 = ((var199 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var199 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var200 & 0xFF00FF) * var20 + (var201 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var200 & 0xFF00) * var20 + (var201 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var197;
                        }
                        int var202 = arg9 + var197;
                        arg5++;
                        int var203 = var140 + var198;
                        int var204;
                        if (var202 < arg1[arg5] && (var204 = arg2[(var203 >>> 25) + (var203 & 0x3F80)]) != 0) {
                            int var205 = arg0[arg5];
                            int var206 = ((var204 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var204 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var205 & 0xFF00FF) * var20 + (var206 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var205 & 0xFF00) * var20 + (var206 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var202;
                        }
                        int var207 = arg9 + var202;
                        arg5++;
                        int var208 = var140 + var203;
                        int var209;
                        if (var207 < arg1[arg5] && (var209 = arg2[(var208 >>> 25) + (var208 & 0x3F80)]) != 0) {
                            int var210 = arg0[arg5];
                            int var211 = ((var209 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var209 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var210 & 0xFF00FF) * var20 + (var211 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var210 & 0xFF00) * var20 + (var211 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var207;
                        }
                        int var212 = arg9 + var207;
                        arg5++;
                        int var213 = var140 + var208;
                        int var214;
                        if (var212 < arg1[arg5] && (var214 = arg2[(var213 >>> 25) + (var213 & 0x3F80)]) != 0) {
                            int var215 = arg0[arg5];
                            int var216 = ((var214 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var214 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var215 & 0xFF00FF) * var20 + (var216 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var215 & 0xFF00) * var20 + (var216 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var212;
                        }
                        int var217 = arg9 + var212;
                        arg5++;
                        int var218 = var140 + var213;
                        int var219;
                        if (var217 < arg1[arg5] && (var219 = arg2[(var218 >>> 25) + (var218 & 0x3F80)]) != 0) {
                            int var220 = arg0[arg5];
                            int var221 = ((var219 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var219 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var220 & 0xFF00FF) * var20 + (var221 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var220 & 0xFF00) * var20 + (var221 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var217;
                        }
                        int var222 = arg9 + var217;
                        arg5++;
                        int var223 = var140 + var218;
                        int var224;
                        if (var222 < arg1[arg5] && (var224 = arg2[(var223 >>> 25) + (var223 & 0x3F80)]) != 0) {
                            int var225 = arg0[arg5];
                            int var226 = ((var224 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var224 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var225 & 0xFF00FF) * var20 + (var226 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var225 & 0xFF00) * var20 + (var226 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = var222;
                        }
                        arg8 = arg9 + var222;
                        arg5++;
                        var10000 = var140 + var223;
                        int var228 = var137;
                        int var229 = var138;
                        var134 += arg15;
                        var135 += arg16;
                        var136 += arg17;
                        if (var136 == 0.0F) {
                            var137 = 0;
                            var138 = 0;
                        } else {
                            var137 = (int) (var134 * 16384.0F / var136);
                            var138 = (int) (var135 * 16384.0F / var136);
                        }
                        var139 = (var228 << 18) + var229;
                        var140 = (var137 - var228 >> 3 << 18) + (var138 - var229 >> 3);
                        arg10 += var142;
                        var143 = arg10 >> 8;
                        var141--;
                    } while (var141 > 0);
                }
                int var230 = arg7 - arg6 & 0x7;
                if (var230 > 0) {
                    do {
                        int var231;
                        if (arg8 < arg1[arg5] && (var231 = arg2[(var139 >>> 25) + (var139 & 0x3F80)]) != 0) {
                            int var232 = arg0[arg5];
                            int var233 = ((var231 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var231 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var232 & 0xFF00FF) * var20 + (var233 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var232 & 0xFF00) * var20 + (var233 & 0xFF00) * var21 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        arg8 += arg9;
                        arg5++;
                        var139 += var140;
                        var230--;
                    } while (var230 > 0);
                }
            }
            return;
        }
        int var22 = arg6 - this.field6557;
        float var23 = arg15 / 8.0F * (float) var22 + arg12;
        float var24 = arg16 / 8.0F * (float) var22 + arg13;
        float var25 = arg17 / 8.0F * (float) var22 + arg14;
        int var26;
        int var27;
        if (var25 == 0.0F) {
            var26 = 0;
            var27 = 0;
        } else {
            var26 = (int) (var23 * 4096.0F / var25);
            var27 = (int) (var24 * 4096.0F / var25);
        }
        float var28 = arg15 + var23;
        float var29 = arg16 + var24;
        float var30 = arg17 + var25;
        int var31;
        int var32;
        if (var30 == 0.0F) {
            var31 = 0;
            var32 = 0;
        } else {
            var31 = (int) (var28 * 4096.0F / var30);
            var32 = (int) (var29 * 4096.0F / var30);
        }
        int var33 = (var26 << 20) + var27;
        int var34 = (var31 - var26 >> 3 << 20) + (var32 - var27 >> 3);
        int var35 = var19 >> 3;
        int var36 = arg11 << 3;
        int var37 = arg10 >> 8;
        if (this.field6567) {
            if (var35 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var38 = arg0[arg5];
                        int var39 = arg2[(var33 >>> 26) + (var33 & 0xFC0)];
                        int var40 = ((var39 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var39 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var38 & 0xFF00FF) * var20 + (var40 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var38 & 0xFF00) * var20 + (var40 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = arg8;
                    }
                    int var41 = arg8 + arg9;
                    int var42 = var33 + var34;
                    arg5++;
                    if (var41 < arg1[arg5]) {
                        int var43 = arg0[arg5];
                        int var44 = arg2[(var42 >>> 26) + (var42 & 0xFC0)];
                        int var45 = ((var44 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var44 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var43 & 0xFF00FF) * var20 + (var45 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var43 & 0xFF00) * var20 + (var45 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var41;
                    }
                    int var46 = arg9 + var41;
                    int var47 = var34 + var42;
                    arg5++;
                    if (var46 < arg1[arg5]) {
                        int var48 = arg0[arg5];
                        int var49 = arg2[(var47 >>> 26) + (var47 & 0xFC0)];
                        int var50 = ((var49 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var49 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var48 & 0xFF00FF) * var20 + (var50 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var48 & 0xFF00) * var20 + (var50 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var46;
                    }
                    int var51 = arg9 + var46;
                    int var52 = var34 + var47;
                    arg5++;
                    if (var51 < arg1[arg5]) {
                        int var53 = arg0[arg5];
                        int var54 = arg2[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var55 = ((var54 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var54 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var53 & 0xFF00FF) * var20 + (var55 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var53 & 0xFF00) * var20 + (var55 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var51;
                    }
                    int var56 = arg9 + var51;
                    int var57 = var34 + var52;
                    arg5++;
                    if (var56 < arg1[arg5]) {
                        int var58 = arg0[arg5];
                        int var59 = arg2[(var57 >>> 26) + (var57 & 0xFC0)];
                        int var60 = ((var59 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var59 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var58 & 0xFF00FF) * var20 + (var60 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var58 & 0xFF00) * var20 + (var60 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var56;
                    }
                    int var61 = arg9 + var56;
                    int var62 = var34 + var57;
                    arg5++;
                    if (var61 < arg1[arg5]) {
                        int var63 = arg0[arg5];
                        int var64 = arg2[(var62 >>> 26) + (var62 & 0xFC0)];
                        int var65 = ((var64 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var64 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var63 & 0xFF00FF) * var20 + (var65 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var63 & 0xFF00) * var20 + (var65 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var61;
                    }
                    int var66 = arg9 + var61;
                    int var67 = var34 + var62;
                    arg5++;
                    if (var66 < arg1[arg5]) {
                        int var68 = arg0[arg5];
                        int var69 = arg2[(var67 >>> 26) + (var67 & 0xFC0)];
                        int var70 = ((var69 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var69 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var68 & 0xFF00FF) * var20 + (var70 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var68 & 0xFF00) * var20 + (var70 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var66;
                    }
                    int var71 = arg9 + var66;
                    int var72 = var34 + var67;
                    arg5++;
                    if (var71 < arg1[arg5]) {
                        int var73 = arg0[arg5];
                        int var74 = arg2[(var72 >>> 26) + (var72 & 0xFC0)];
                        int var75 = ((var74 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var74 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var73 & 0xFF00FF) * var20 + (var75 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var73 & 0xFF00) * var20 + (var75 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = var71;
                    }
                    arg8 = arg9 + var71;
                    var10000 = var34 + var72;
                    arg5++;
                    int var77 = var31;
                    int var78 = var32;
                    var28 += arg15;
                    var29 += arg16;
                    var30 += arg17;
                    if (var30 == 0.0F) {
                        var31 = 0;
                        var32 = 0;
                    } else {
                        var31 = (int) (var28 * 4096.0F / var30);
                        var32 = (int) (var29 * 4096.0F / var30);
                    }
                    var33 = (var77 << 20) + var78;
                    var34 = (var31 - var77 >> 3 << 20) + (var32 - var78 >> 3);
                    arg10 += var36;
                    var37 = arg10 >> 8;
                    var35--;
                } while (var35 > 0);
            }
            int var79 = arg7 - arg6 & 0x7;
            if (var79 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var80 = arg0[arg5];
                        int var81 = arg2[(var33 >>> 26) + (var33 & 0xFC0)];
                        int var82 = ((var81 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var81 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var80 & 0xFF00FF) * var20 + (var82 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var80 & 0xFF00) * var20 + (var82 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        arg1[arg5] = arg8;
                    }
                    arg8 += arg9;
                    var33 += var34;
                    arg5++;
                    var79--;
                } while (var79 > 0);
                return;
            }
            return;
        }
        if (var35 > 0) {
            do {
                int var83;
                if (arg8 < arg1[arg5] && (var83 = arg2[(var33 >>> 26) + (var33 & 0xFC0)]) != 0) {
                    int var84 = arg0[arg5];
                    int var85 = ((var83 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var83 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var84 & 0xFF00FF) * var20 + (var85 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var84 & 0xFF00) * var20 + (var85 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = arg8;
                }
                int var86 = arg8 + arg9;
                arg5++;
                int var87 = var33 + var34;
                int var88;
                if (var86 < arg1[arg5] && (var88 = arg2[(var87 >>> 26) + (var87 & 0xFC0)]) != 0) {
                    int var89 = arg0[arg5];
                    int var90 = ((var88 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var88 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var89 & 0xFF00FF) * var20 + (var90 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var89 & 0xFF00) * var20 + (var90 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var86;
                }
                int var91 = arg9 + var86;
                arg5++;
                int var92 = var34 + var87;
                int var93;
                if (var91 < arg1[arg5] && (var93 = arg2[(var92 >>> 26) + (var92 & 0xFC0)]) != 0) {
                    int var94 = arg0[arg5];
                    int var95 = ((var93 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var93 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var94 & 0xFF00FF) * var20 + (var95 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var94 & 0xFF00) * var20 + (var95 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var91;
                }
                int var96 = arg9 + var91;
                arg5++;
                int var97 = var34 + var92;
                int var98;
                if (var96 < arg1[arg5] && (var98 = arg2[(var97 >>> 26) + (var97 & 0xFC0)]) != 0) {
                    int var99 = arg0[arg5];
                    int var100 = ((var98 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var98 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var99 & 0xFF00FF) * var20 + (var100 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var99 & 0xFF00) * var20 + (var100 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var96;
                }
                int var101 = arg9 + var96;
                arg5++;
                int var102 = var34 + var97;
                int var103;
                if (var101 < arg1[arg5] && (var103 = arg2[(var102 >>> 26) + (var102 & 0xFC0)]) != 0) {
                    int var104 = arg0[arg5];
                    int var105 = ((var103 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var103 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var104 & 0xFF00FF) * var20 + (var105 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var104 & 0xFF00) * var20 + (var105 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var101;
                }
                int var106 = arg9 + var101;
                arg5++;
                int var107 = var34 + var102;
                int var108;
                if (var106 < arg1[arg5] && (var108 = arg2[(var107 >>> 26) + (var107 & 0xFC0)]) != 0) {
                    int var109 = arg0[arg5];
                    int var110 = ((var108 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var108 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var109 & 0xFF00FF) * var20 + (var110 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var109 & 0xFF00) * var20 + (var110 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var106;
                }
                int var111 = arg9 + var106;
                arg5++;
                int var112 = var34 + var107;
                int var113;
                if (var111 < arg1[arg5] && (var113 = arg2[(var112 >>> 26) + (var112 & 0xFC0)]) != 0) {
                    int var114 = arg0[arg5];
                    int var115 = ((var113 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var113 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var114 & 0xFF00FF) * var20 + (var115 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var114 & 0xFF00) * var20 + (var115 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var111;
                }
                int var116 = arg9 + var111;
                arg5++;
                int var117 = var34 + var112;
                int var118;
                if (var116 < arg1[arg5] && (var118 = arg2[(var117 >>> 26) + (var117 & 0xFC0)]) != 0) {
                    int var119 = arg0[arg5];
                    int var120 = ((var118 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var118 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var119 & 0xFF00FF) * var20 + (var120 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var119 & 0xFF00) * var20 + (var120 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    arg1[arg5] = var116;
                }
                arg8 = arg9 + var116;
                arg5++;
                var10000 = var34 + var117;
                int var122 = var31;
                int var123 = var32;
                var28 += arg15;
                var29 += arg16;
                var30 += arg17;
                if (var30 == 0.0F) {
                    var31 = 0;
                    var32 = 0;
                } else {
                    var31 = (int) (var28 * 4096.0F / var30);
                    var32 = (int) (var29 * 4096.0F / var30);
                }
                var33 = (var122 << 20) + var123;
                var34 = (var31 - var122 >> 3 << 20) + (var32 - var123 >> 3);
                arg10 += var36;
                var37 = arg10 >> 8;
                var35--;
            } while (var35 > 0);
        }
        int var124 = arg7 - arg6 & 0x7;
        if (var124 <= 0) {
            return;
        }
        do {
            int var125;
            if (arg8 < arg1[arg5] && (var125 = arg2[(var33 >>> 26) + (var33 & 0xFC0)]) != 0) {
                int var126 = arg0[arg5];
                int var127 = ((var125 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var125 & 0xFF00) * var37 & 0xFF0000) >> 8;
                arg0[arg5] = ((var126 & 0xFF00FF) * var20 + (var127 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var126 & 0xFF00) * var20 + (var127 & 0xFF00) * var21 & 0xFF0000) >> 8;
                arg1[arg5] = arg8;
            }
            arg8 += arg9;
            arg5++;
            var33 += var34;
            var124--;
        } while (var124 > 0);
        return;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method2722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6565) {
            this.field6555.method1354(arg9, arg0, arg1, 98, arg3, arg4);
            this.field6555.method1354(arg9, arg1, arg2, -115, arg4, arg5);
            this.field6555.method1354(arg9, arg2, arg0, -124, arg5, arg3);
            return;
        }
        int var11 = arg4 - arg3;
        int var12 = arg1 - arg0;
        int var13 = arg5 - arg3;
        int var14 = arg2 - arg0;
        int var15 = arg7 - arg6;
        int var16 = arg8 - arg6;
        int var17 = 0;
        if (arg0 != arg1) {
            var17 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var18 = 0;
        if (arg1 != arg2) {
            var18 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var19 = 0;
        if (arg0 != arg2) {
            var19 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var20 = var11 * var14 - var12 * var13;
        if (var20 == 0) {
            return;
        }
        int var21 = (var14 * var15 - var12 * var16 << 8) / var20;
        int var22 = (var11 * var16 - var13 * var15 << 8) / var20;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field6561) {
                if (arg1 > this.field6561) {
                    arg1 = this.field6561;
                }
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                int var23 = (arg6 << 8) + var21 - arg3 * var21;
                if (arg1 < arg2) {
                    int var24;
                    int var25 = var24 = arg3 << 16;
                    if (arg0 < 0) {
                        var25 -= arg0 * var19;
                        var24 -= arg0 * var17;
                        var23 -= arg0 * var22;
                        arg0 = 0;
                    }
                    int var26 = arg4 << 16;
                    if (arg1 < 0) {
                        var26 -= arg1 * var18;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var19 < var17 || arg0 == arg1 && var19 > var18) {
                        int var27 = arg2 - arg1;
                        int var28 = arg1 - arg0;
                        int var29 = this.field6553[arg0];
                        while (true) {
                            var28--;
                            if (var28 < 0) {
                                while (true) {
                                    var27--;
                                    if (var27 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var29, arg9, 0, var25 >> 16, var26 >> 16, var23, var21);
                                    var25 += var19;
                                    var26 += var18;
                                    var23 += var22;
                                    var29 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var29, arg9, 0, var25 >> 16, var24 >> 16, var23, var21);
                            var25 += var19;
                            var24 += var17;
                            var23 += var22;
                            var29 += this.field6554;
                        }
                    } else {
                        int var30 = arg2 - arg1;
                        int var31 = arg1 - arg0;
                        int var32 = this.field6553[arg0];
                        while (true) {
                            var31--;
                            if (var31 < 0) {
                                while (true) {
                                    var30--;
                                    if (var30 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var32, arg9, 0, var26 >> 16, var25 >> 16, var23, var21);
                                    var25 += var19;
                                    var26 += var18;
                                    var23 += var22;
                                    var32 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var32, arg9, 0, var24 >> 16, var25 >> 16, var23, var21);
                            var25 += var19;
                            var24 += var17;
                            var23 += var22;
                            var32 += this.field6554;
                        }
                    }
                } else {
                    int var33;
                    int var34 = var33 = arg3 << 16;
                    if (arg0 < 0) {
                        var34 -= arg0 * var19;
                        var33 -= arg0 * var17;
                        var23 -= arg0 * var22;
                        arg0 = 0;
                    }
                    int var35 = arg5 << 16;
                    if (arg2 < 0) {
                        var35 -= arg2 * var18;
                        arg2 = 0;
                    }
                    if ((arg0 == arg2 || var19 >= var17) && (arg0 != arg2 || var18 <= var17)) {
                        int var39 = arg1 - arg2;
                        int var40 = arg2 - arg0;
                        int var41 = this.field6553[arg0];
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var41, arg9, 0, var33 >> 16, var35 >> 16, var23, var21);
                                    var35 += var18;
                                    var33 += var17;
                                    var23 += var22;
                                    var41 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var41, arg9, 0, var33 >> 16, var34 >> 16, var23, var21);
                            var34 += var19;
                            var33 += var17;
                            var23 += var22;
                            var41 += this.field6554;
                        }
                    } else {
                        int var36 = arg1 - arg2;
                        int var37 = arg2 - arg0;
                        int var38 = this.field6553[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var38, arg9, 0, var35 >> 16, var33 >> 16, var23, var21);
                                    var35 += var18;
                                    var33 += var17;
                                    var23 += var22;
                                    var38 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var38, arg9, 0, var34 >> 16, var33 >> 16, var23, var21);
                            var34 += var19;
                            var33 += var17;
                            var23 += var22;
                            var38 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field6561) {
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                if (arg0 > this.field6561) {
                    arg0 = this.field6561;
                }
                int var42 = (arg7 << 8) + var21 - arg4 * var21;
                if (arg2 < arg0) {
                    int var43;
                    int var44 = var43 = arg4 << 16;
                    if (arg1 < 0) {
                        var44 -= arg1 * var17;
                        var43 -= arg1 * var18;
                        var42 -= arg1 * var22;
                        arg1 = 0;
                    }
                    int var45 = arg5 << 16;
                    if (arg2 < 0) {
                        var45 -= arg2 * var19;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var17 < var18 || arg1 == arg2 && var17 > var19) {
                        int var46 = arg0 - arg2;
                        int var47 = arg2 - arg1;
                        int var48 = this.field6553[arg1];
                        while (true) {
                            var47--;
                            if (var47 < 0) {
                                while (true) {
                                    var46--;
                                    if (var46 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var48, arg9, 0, var44 >> 16, var45 >> 16, var42, var21);
                                    var44 += var17;
                                    var45 += var19;
                                    var42 += var22;
                                    var48 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var48, arg9, 0, var44 >> 16, var43 >> 16, var42, var21);
                            var44 += var17;
                            var43 += var18;
                            var42 += var22;
                            var48 += this.field6554;
                        }
                    } else {
                        int var49 = arg0 - arg2;
                        int var50 = arg2 - arg1;
                        int var51 = this.field6553[arg1];
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var51, arg9, 0, var45 >> 16, var44 >> 16, var42, var21);
                                    var44 += var17;
                                    var45 += var19;
                                    var42 += var22;
                                    var51 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var51, arg9, 0, var43 >> 16, var44 >> 16, var42, var21);
                            var44 += var17;
                            var43 += var18;
                            var42 += var22;
                            var51 += this.field6554;
                        }
                    }
                } else {
                    int var52;
                    int var53 = var52 = arg4 << 16;
                    if (arg1 < 0) {
                        var53 -= arg1 * var17;
                        var52 -= arg1 * var18;
                        var42 -= arg1 * var22;
                        arg1 = 0;
                    }
                    int var54 = arg3 << 16;
                    if (arg0 < 0) {
                        var54 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var17 < var18) {
                        int var55 = arg2 - arg0;
                        int var56 = arg0 - arg1;
                        int var57 = this.field6553[arg1];
                        while (true) {
                            var56--;
                            if (var56 < 0) {
                                while (true) {
                                    var55--;
                                    if (var55 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var57, arg9, 0, var54 >> 16, var52 >> 16, var42, var21);
                                    var54 += var19;
                                    var52 += var18;
                                    var42 += var22;
                                    var57 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var57, arg9, 0, var53 >> 16, var52 >> 16, var42, var21);
                            var53 += var17;
                            var52 += var18;
                            var42 += var22;
                            var57 += this.field6554;
                        }
                    } else {
                        int var58 = arg2 - arg0;
                        int var59 = arg0 - arg1;
                        int var60 = this.field6553[arg1];
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                while (true) {
                                    var58--;
                                    if (var58 < 0) {
                                        return;
                                    }
                                    this.method2724(this.field6552, this.field6559, var60, arg9, 0, var52 >> 16, var54 >> 16, var42, var21);
                                    var54 += var19;
                                    var52 += var18;
                                    var42 += var22;
                                    var60 += this.field6554;
                                }
                            }
                            this.method2724(this.field6552, this.field6559, var60, arg9, 0, var52 >> 16, var53 >> 16, var42, var21);
                            var53 += var17;
                            var52 += var18;
                            var42 += var22;
                            var60 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg2 < this.field6561) {
            if (arg0 > this.field6561) {
                arg0 = this.field6561;
            }
            if (arg1 > this.field6561) {
                arg1 = this.field6561;
            }
            int var61 = (arg8 << 8) + var21 - arg5 * var21;
            if (arg0 < arg1) {
                int var62;
                int var63 = var62 = arg5 << 16;
                if (arg2 < 0) {
                    var63 -= arg2 * var18;
                    var62 -= arg2 * var19;
                    var61 -= arg2 * var22;
                    arg2 = 0;
                }
                int var64 = arg3 << 16;
                if (arg0 < 0) {
                    var64 -= arg0 * var17;
                    arg0 = 0;
                }
                if (var18 < var19) {
                    int var65 = arg1 - arg0;
                    int var66 = arg0 - arg2;
                    int var67 = this.field6553[arg2];
                    while (true) {
                        var66--;
                        if (var66 < 0) {
                            while (true) {
                                var65--;
                                if (var65 < 0) {
                                    return;
                                }
                                this.method2724(this.field6552, this.field6559, var67, arg9, 0, var63 >> 16, var64 >> 16, var61, var21);
                                var63 += var18;
                                var64 += var17;
                                var61 += var22;
                                var67 += this.field6554;
                            }
                        }
                        this.method2724(this.field6552, this.field6559, var67, arg9, 0, var63 >> 16, var62 >> 16, var61, var21);
                        var63 += var18;
                        var62 += var19;
                        var61 += var22;
                        var67 += this.field6554;
                    }
                } else {
                    int var68 = arg1 - arg0;
                    int var69 = arg0 - arg2;
                    int var70 = this.field6553[arg2];
                    while (true) {
                        var69--;
                        if (var69 < 0) {
                            while (true) {
                                var68--;
                                if (var68 < 0) {
                                    return;
                                }
                                this.method2724(this.field6552, this.field6559, var70, arg9, 0, var64 >> 16, var63 >> 16, var61, var21);
                                var63 += var18;
                                var64 += var17;
                                var61 += var22;
                                var70 += this.field6554;
                            }
                        }
                        this.method2724(this.field6552, this.field6559, var70, arg9, 0, var62 >> 16, var63 >> 16, var61, var21);
                        var63 += var18;
                        var62 += var19;
                        var61 += var22;
                        var70 += this.field6554;
                    }
                }
            } else {
                int var71;
                int var72 = var71 = arg5 << 16;
                if (arg2 < 0) {
                    var72 -= arg2 * var18;
                    var71 -= arg2 * var19;
                    var61 -= arg2 * var22;
                    arg2 = 0;
                }
                int var73 = arg4 << 16;
                if (arg1 < 0) {
                    var73 -= arg1 * var17;
                    arg1 = 0;
                }
                if (var18 < var19) {
                    int var74 = arg0 - arg1;
                    int var75 = arg1 - arg2;
                    int var76 = this.field6553[arg2];
                    while (true) {
                        var75--;
                        if (var75 < 0) {
                            while (true) {
                                var74--;
                                if (var74 < 0) {
                                    return;
                                }
                                this.method2724(this.field6552, this.field6559, var76, arg9, 0, var73 >> 16, var71 >> 16, var61, var21);
                                var73 += var17;
                                var71 += var19;
                                var61 += var22;
                                var76 += this.field6554;
                            }
                        }
                        this.method2724(this.field6552, this.field6559, var76, arg9, 0, var72 >> 16, var71 >> 16, var61, var21);
                        var72 += var18;
                        var71 += var19;
                        var61 += var22;
                        var76 += this.field6554;
                    }
                } else {
                    int var77 = arg0 - arg1;
                    int var78 = arg1 - arg2;
                    int var79 = this.field6553[arg2];
                    while (true) {
                        var78--;
                        if (var78 < 0) {
                            while (true) {
                                var77--;
                                if (var77 < 0) {
                                    return;
                                }
                                this.method2724(this.field6552, this.field6559, var79, arg9, 0, var71 >> 16, var73 >> 16, var61, var21);
                                var73 += var17;
                                var71 += var19;
                                var61 += var22;
                                var79 += this.field6554;
                            }
                        }
                        this.method2724(this.field6552, this.field6559, var79, arg9, 0, var71 >> 16, var72 >> 16, var61, var21);
                        var72 += var18;
                        var71 += var19;
                        var61 += var22;
                        var79 += this.field6554;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
    private final void method2723(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var21 = arg4 + arg5;
        int var22 = arg5 * arg10 + arg9;
        int var23 = arg5 * arg13 + arg12;
        int var24 = arg5 * arg8 + arg7;
        int var25 = arg6 - arg5;
        int var26 = arg10 << 3;
        int var27 = var22 >> 16;
        int var28 = 255 - var27;
        int var29 = ((arg11 & 0xFF00FF) * var27 & 0xFF00FF00 | (arg11 & 0xFF00) * var27 & 0xFF0000) >>> 8;
        int var30 = this.field6568;
        int var31 = 256 - this.field6568;
        int var10000;
        if (!this.field6560) {
            int var158 = arg5 - this.field6557;
            float var159 = arg17 / 8.0F * (float) var158 + arg14;
            float var160 = arg18 / 8.0F * (float) var158 + arg15;
            float var161 = arg19 / 8.0F * (float) var158 + arg16;
            int var162;
            int var163;
            if (var161 == 0.0F) {
                var162 = 0;
                var163 = 0;
            } else {
                var162 = (int) (var159 * 16384.0F / var161);
                var163 = (int) (var160 * 16384.0F / var161);
            }
            float var164 = arg17 + var159;
            float var165 = arg18 + var160;
            float var166 = arg19 + var161;
            int var167;
            int var168;
            if (var166 == 0.0F) {
                var167 = 0;
                var168 = 0;
            } else {
                var167 = (int) (var164 * 16384.0F / var166);
                var168 = (int) (var165 * 16384.0F / var166);
            }
            int var169 = (var162 << 18) + var163;
            int var170 = (var167 - var162 >> 3 << 18) + (var168 - var163 >> 3);
            int var171 = var25 >> 3;
            int var172 = arg13 << 3;
            int var173 = var23 >> 8;
            if (this.field6567) {
                if (var171 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var174 = arg1[(var169 >>> 25) + (var169 & 0x3F80)];
                            int var175 = arg0[var21];
                            int var176 = ((var174 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var174 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var177 = ((var175 & 0xFF00FF) * var30 + (var176 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var175 & 0xFF00) * var30 + (var176 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var177 & 0xFF00FF) * var28 & 0xFF00FF00 | (var177 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var178 = var169 + var170;
                        var21++;
                        int var179 = arg8 + var24;
                        if (var179 < this.field6559[var21]) {
                            int var180 = arg1[(var178 >>> 25) + (var178 & 0x3F80)];
                            int var181 = arg0[var21];
                            int var182 = ((var180 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var180 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var183 = ((var181 & 0xFF00FF) * var30 + (var182 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var181 & 0xFF00) * var30 + (var182 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var183 & 0xFF00FF) * var28 & 0xFF00FF00 | (var183 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var184 = var170 + var178;
                        var21++;
                        int var185 = arg8 + var179;
                        if (var185 < this.field6559[var21]) {
                            int var186 = arg1[(var184 >>> 25) + (var184 & 0x3F80)];
                            int var187 = arg0[var21];
                            int var188 = ((var186 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var186 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var189 = ((var187 & 0xFF00FF) * var30 + (var188 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var187 & 0xFF00) * var30 + (var188 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var189 & 0xFF00FF) * var28 & 0xFF00FF00 | (var189 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var190 = var170 + var184;
                        var21++;
                        int var191 = arg8 + var185;
                        if (var191 < this.field6559[var21]) {
                            int var192 = arg1[(var190 >>> 25) + (var190 & 0x3F80)];
                            int var193 = arg0[var21];
                            int var194 = ((var192 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var192 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var195 = ((var193 & 0xFF00FF) * var30 + (var194 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var193 & 0xFF00) * var30 + (var194 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var195 & 0xFF00FF) * var28 & 0xFF00FF00 | (var195 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var196 = var170 + var190;
                        var21++;
                        int var197 = arg8 + var191;
                        if (var197 < this.field6559[var21]) {
                            int var198 = arg1[(var196 >>> 25) + (var196 & 0x3F80)];
                            int var199 = arg0[var21];
                            int var200 = ((var198 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var198 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var201 = ((var199 & 0xFF00FF) * var30 + (var200 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var199 & 0xFF00) * var30 + (var200 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var201 & 0xFF00FF) * var28 & 0xFF00FF00 | (var201 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var202 = var170 + var196;
                        var21++;
                        int var203 = arg8 + var197;
                        if (var203 < this.field6559[var21]) {
                            int var204 = arg1[(var202 >>> 25) + (var202 & 0x3F80)];
                            int var205 = arg0[var21];
                            int var206 = ((var204 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var204 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var207 = ((var205 & 0xFF00FF) * var30 + (var206 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var205 & 0xFF00) * var30 + (var206 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var207 & 0xFF00FF) * var28 & 0xFF00FF00 | (var207 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var208 = var170 + var202;
                        var21++;
                        int var209 = arg8 + var203;
                        if (var209 < this.field6559[var21]) {
                            int var210 = arg1[(var208 >>> 25) + (var208 & 0x3F80)];
                            int var211 = arg0[var21];
                            int var212 = ((var210 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var210 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var213 = ((var211 & 0xFF00FF) * var30 + (var212 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var211 & 0xFF00) * var30 + (var212 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var213 & 0xFF00FF) * var28 & 0xFF00FF00 | (var213 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var214 = var170 + var208;
                        var21++;
                        int var215 = arg8 + var209;
                        if (var215 < this.field6559[var21]) {
                            int var216 = arg1[(var214 >>> 25) + (var214 & 0x3F80)];
                            int var217 = arg0[var21];
                            int var218 = ((var216 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var216 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var219 = ((var217 & 0xFF00FF) * var30 + (var218 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var217 & 0xFF00) * var30 + (var218 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var219 & 0xFF00FF) * var28 & 0xFF00FF00 | (var219 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var10000 = var170 + var214;
                        var21++;
                        var24 = arg8 + var215;
                        int var221 = var167;
                        int var222 = var168;
                        var164 += arg17;
                        var165 += arg18;
                        var166 += arg19;
                        if (var166 == 0.0F) {
                            var167 = 0;
                            var168 = 0;
                        } else {
                            var167 = (int) (var164 * 16384.0F / var166);
                            var168 = (int) (var165 * 16384.0F / var166);
                        }
                        var169 = (var221 << 18) + var222;
                        var170 = (var167 - var221 >> 3 << 18) + (var168 - var222 >> 3);
                        var23 += var172;
                        var173 = var23 >> 8;
                        var22 += var26;
                        int var223 = var22 >> 16;
                        var28 = 255 - var223;
                        var29 = ((arg11 & 0xFF00FF) * var223 & 0xFF00FF00 | (arg11 & 0xFF00) * var223 & 0xFF0000) >>> 8;
                        var171--;
                    } while (var171 > 0);
                }
                int var224 = arg6 - arg5 & 0x7;
                if (var224 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var225 = arg1[(var169 >>> 25) + (var169 & 0x3F80)];
                            int var226 = arg0[var21];
                            int var227 = ((var225 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var225 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var228 = ((var226 & 0xFF00FF) * var30 + (var227 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var226 & 0xFF00) * var30 + (var227 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var228 & 0xFF00FF) * var28 & 0xFF00FF00 | (var228 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var169 += var170;
                        var21++;
                        var24 += arg8;
                        var224--;
                    } while (var224 > 0);
                    return;
                }
            } else {
                if (var171 > 0) {
                    do {
                        int var229;
                        if (var24 < this.field6559[var21] && (var229 = arg1[(var169 >>> 25) + (var169 & 0x3F80)]) != 0) {
                            int var230 = arg0[var21];
                            int var231 = ((var229 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var229 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var232 = ((var230 & 0xFF00FF) * var30 + (var231 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var230 & 0xFF00) * var30 + (var231 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var232 & 0xFF00FF) * var28 & 0xFF00FF00 | (var232 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var233 = var169 + var170;
                        int var234 = arg8 + var24;
                        int var235;
                        if (var234 < this.field6559[var21] && (var235 = arg1[(var233 >>> 25) + (var233 & 0x3F80)]) != 0) {
                            int var236 = arg0[var21];
                            int var237 = ((var235 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var235 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var238 = ((var236 & 0xFF00FF) * var30 + (var237 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var236 & 0xFF00) * var30 + (var237 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var238 & 0xFF00FF) * var28 & 0xFF00FF00 | (var238 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var239 = var170 + var233;
                        int var240 = arg8 + var234;
                        int var241;
                        if (var240 < this.field6559[var21] && (var241 = arg1[(var239 >>> 25) + (var239 & 0x3F80)]) != 0) {
                            int var242 = arg0[var21];
                            int var243 = ((var241 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var241 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var244 = ((var242 & 0xFF00FF) * var30 + (var243 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var242 & 0xFF00) * var30 + (var243 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var244 & 0xFF00FF) * var28 & 0xFF00FF00 | (var244 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var245 = var170 + var239;
                        int var246 = arg8 + var240;
                        int var247;
                        if (var246 < this.field6559[var21] && (var247 = arg1[(var245 >>> 25) + (var245 & 0x3F80)]) != 0) {
                            int var248 = arg0[var21];
                            int var249 = ((var247 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var247 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var250 = ((var248 & 0xFF00FF) * var30 + (var249 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var248 & 0xFF00) * var30 + (var249 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var250 & 0xFF00FF) * var28 & 0xFF00FF00 | (var250 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var251 = var170 + var245;
                        int var252 = arg8 + var246;
                        int var253;
                        if (var252 < this.field6559[var21] && (var253 = arg1[(var251 >>> 25) + (var251 & 0x3F80)]) != 0) {
                            int var254 = arg0[var21];
                            int var255 = ((var253 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var253 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var256 = ((var254 & 0xFF00FF) * var30 + (var255 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var254 & 0xFF00) * var30 + (var255 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var256 & 0xFF00FF) * var28 & 0xFF00FF00 | (var256 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var257 = var170 + var251;
                        int var258 = arg8 + var252;
                        int var259;
                        if (var258 < this.field6559[var21] && (var259 = arg1[(var257 >>> 25) + (var257 & 0x3F80)]) != 0) {
                            int var260 = arg0[var21];
                            int var261 = ((var259 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var259 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var262 = ((var260 & 0xFF00FF) * var30 + (var261 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var260 & 0xFF00) * var30 + (var261 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var262 & 0xFF00FF) * var28 & 0xFF00FF00 | (var262 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var263 = var170 + var257;
                        int var264 = arg8 + var258;
                        int var265;
                        if (var264 < this.field6559[var21] && (var265 = arg1[(var263 >>> 25) + (var263 & 0x3F80)]) != 0) {
                            int var266 = arg0[var21];
                            int var267 = ((var265 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var265 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var268 = ((var266 & 0xFF00FF) * var30 + (var267 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var266 & 0xFF00) * var30 + (var267 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var268 & 0xFF00FF) * var28 & 0xFF00FF00 | (var268 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var269 = var170 + var263;
                        int var270 = arg8 + var264;
                        int var271;
                        if (var270 < this.field6559[var21] && (var271 = arg1[(var269 >>> 25) + (var269 & 0x3F80)]) != 0) {
                            int var272 = arg0[var21];
                            int var273 = ((var271 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var271 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var274 = ((var272 & 0xFF00FF) * var30 + (var273 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var272 & 0xFF00) * var30 + (var273 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var274 & 0xFF00FF) * var28 & 0xFF00FF00 | (var274 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        var10000 = var170 + var269;
                        var24 = arg8 + var270;
                        int var276 = var167;
                        int var277 = var168;
                        var164 += arg17;
                        var165 += arg18;
                        var166 += arg19;
                        if (var166 == 0.0F) {
                            var167 = 0;
                            var168 = 0;
                        } else {
                            var167 = (int) (var164 * 16384.0F / var166);
                            var168 = (int) (var165 * 16384.0F / var166);
                        }
                        var169 = (var276 << 18) + var277;
                        var170 = (var167 - var276 >> 3 << 18) + (var168 - var277 >> 3);
                        var23 += var172;
                        var173 = var23 >> 8;
                        var22 += var26;
                        int var278 = var22 >> 16;
                        var28 = 255 - var278;
                        var29 = ((arg11 & 0xFF00FF) * var278 & 0xFF00FF00 | (arg11 & 0xFF00) * var278 & 0xFF0000) >>> 8;
                        var171--;
                    } while (var171 > 0);
                }
                int var279 = arg6 - arg5 & 0x7;
                if (var279 > 0) {
                    do {
                        int var280;
                        if (var24 < this.field6559[var21] && (var280 = arg1[(var169 >>> 25) + (var169 & 0x3F80)]) != 0) {
                            int var281 = arg0[var21];
                            int var282 = ((var280 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var280 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var283 = ((var281 & 0xFF00FF) * var30 + (var282 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var281 & 0xFF00) * var30 + (var282 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var283 & 0xFF00FF) * var28 & 0xFF00FF00 | (var283 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        var169 += var170;
                        var24 += arg8;
                        var279--;
                    } while (var279 > 0);
                }
            }
            return;
        }
        int var32 = arg5 - this.field6557;
        float var33 = arg17 / 8.0F * (float) var32 + arg14;
        float var34 = arg18 / 8.0F * (float) var32 + arg15;
        float var35 = arg19 / 8.0F * (float) var32 + arg16;
        int var36;
        int var37;
        if (var35 == 0.0F) {
            var36 = 0;
            var37 = 0;
        } else {
            var36 = (int) (var33 * 4096.0F / var35);
            var37 = (int) (var34 * 4096.0F / var35);
        }
        float var38 = arg17 + var33;
        float var39 = arg18 + var34;
        float var40 = arg19 + var35;
        int var41;
        int var42;
        if (var40 == 0.0F) {
            var41 = 0;
            var42 = 0;
        } else {
            var41 = (int) (var38 * 4096.0F / var40);
            var42 = (int) (var39 * 4096.0F / var40);
        }
        int var43 = (var36 << 20) + var37;
        int var44 = (var41 - var36 >> 3 << 20) + (var42 - var37 >> 3);
        int var45 = var25 >> 3;
        int var46 = arg13 << 3;
        int var47 = var23 >> 8;
        if (this.field6567) {
            if (var45 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var48 = arg0[var21];
                        int var49 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                        int var50 = ((var49 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var49 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var51 = ((var48 & 0xFF00FF) * var30 + (var50 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var48 & 0xFF00) * var30 + (var50 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var51 & 0xFF00FF) * var28 & 0xFF00FF00 | (var51 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var52 = var43 + var44;
                    var21++;
                    int var53 = arg8 + var24;
                    if (var53 < this.field6559[var21]) {
                        int var54 = arg0[var21];
                        int var55 = arg1[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var56 = ((var55 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var55 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var57 = ((var54 & 0xFF00FF) * var30 + (var56 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var54 & 0xFF00) * var30 + (var56 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var57 & 0xFF00FF) * var28 & 0xFF00FF00 | (var57 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var58 = var44 + var52;
                    var21++;
                    int var59 = arg8 + var53;
                    if (var59 < this.field6559[var21]) {
                        int var60 = arg0[var21];
                        int var61 = arg1[(var58 >>> 26) + (var58 & 0xFC0)];
                        int var62 = ((var61 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var61 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var63 = ((var60 & 0xFF00FF) * var30 + (var62 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var60 & 0xFF00) * var30 + (var62 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var63 & 0xFF00FF) * var28 & 0xFF00FF00 | (var63 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var64 = var44 + var58;
                    var21++;
                    int var65 = arg8 + var59;
                    if (var65 < this.field6559[var21]) {
                        int var66 = arg0[var21];
                        int var67 = arg1[(var64 >>> 26) + (var64 & 0xFC0)];
                        int var68 = ((var67 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var67 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var69 = ((var66 & 0xFF00FF) * var30 + (var68 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var66 & 0xFF00) * var30 + (var68 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var69 & 0xFF00FF) * var28 & 0xFF00FF00 | (var69 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var70 = var44 + var64;
                    var21++;
                    int var71 = arg8 + var65;
                    if (var71 < this.field6559[var21]) {
                        int var72 = arg0[var21];
                        int var73 = arg1[(var70 >>> 26) + (var70 & 0xFC0)];
                        int var74 = ((var73 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var73 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var75 = ((var72 & 0xFF00FF) * var30 + (var74 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var72 & 0xFF00) * var30 + (var74 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var75 & 0xFF00FF) * var28 & 0xFF00FF00 | (var75 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var76 = var44 + var70;
                    var21++;
                    int var77 = arg8 + var71;
                    if (var77 < this.field6559[var21]) {
                        int var78 = arg0[var21];
                        int var79 = arg1[(var76 >>> 26) + (var76 & 0xFC0)];
                        int var80 = ((var79 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var79 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var81 = ((var78 & 0xFF00FF) * var30 + (var80 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var78 & 0xFF00) * var30 + (var80 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var81 & 0xFF00FF) * var28 & 0xFF00FF00 | (var81 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var82 = var44 + var76;
                    var21++;
                    int var83 = arg8 + var77;
                    if (var83 < this.field6559[var21]) {
                        int var84 = arg0[var21];
                        int var85 = arg1[(var82 >>> 26) + (var82 & 0xFC0)];
                        int var86 = ((var85 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var85 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var87 = ((var84 & 0xFF00FF) * var30 + (var86 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var84 & 0xFF00) * var30 + (var86 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var87 & 0xFF00FF) * var28 & 0xFF00FF00 | (var87 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var88 = var44 + var82;
                    var21++;
                    int var89 = arg8 + var83;
                    if (var89 < this.field6559[var21]) {
                        int var90 = arg0[var21];
                        int var91 = arg1[(var88 >>> 26) + (var88 & 0xFC0)];
                        int var92 = ((var91 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var91 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var93 = ((var90 & 0xFF00FF) * var30 + (var92 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var90 & 0xFF00) * var30 + (var92 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var93 & 0xFF00FF) * var28 & 0xFF00FF00 | (var93 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var10000 = var44 + var88;
                    var21++;
                    var24 = arg8 + var89;
                    int var95 = var41;
                    int var96 = var42;
                    var38 += arg17;
                    var39 += arg18;
                    var40 += arg19;
                    if (var40 == 0.0F) {
                        var41 = 0;
                        var42 = 0;
                    } else {
                        var41 = (int) (var38 * 4096.0F / var40);
                        var42 = (int) (var39 * 4096.0F / var40);
                    }
                    var43 = (var95 << 20) + var96;
                    var44 = (var41 - var95 >> 3 << 20) + (var42 - var96 >> 3);
                    var23 += var46;
                    var47 = var23 >> 8;
                    var22 += var26;
                    int var97 = var22 >> 16;
                    var28 = 255 - var97;
                    var29 = ((arg11 & 0xFF00FF) * var97 & 0xFF00FF00 | (arg11 & 0xFF00) * var97 & 0xFF0000) >>> 8;
                    var45--;
                } while (var45 > 0);
            }
            int var98 = arg6 - arg5 & 0x7;
            if (var98 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var99 = arg0[var21];
                        int var100 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                        int var101 = ((var100 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var100 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var102 = ((var99 & 0xFF00FF) * var30 + (var101 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var99 & 0xFF00) * var30 + (var101 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var102 & 0xFF00FF) * var28 & 0xFF00FF00 | (var102 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var43 += var44;
                    var21++;
                    var24 += arg8;
                    var98--;
                } while (var98 > 0);
                return;
            }
        } else {
            if (var45 > 0) {
                do {
                    int var103;
                    if (var24 < this.field6559[var21] && (var103 = arg1[(var43 >>> 26) + (var43 & 0xFC0)]) != 0) {
                        int var104 = arg0[var21];
                        int var105 = ((var103 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var103 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var106 = ((var104 & 0xFF00FF) * var30 + (var105 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var104 & 0xFF00) * var30 + (var105 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var106 & 0xFF00FF) * var28 & 0xFF00FF00 | (var106 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var107 = var43 + var44;
                    int var108 = arg8 + var24;
                    int var109;
                    if (var108 < this.field6559[var21] && (var109 = arg1[(var107 >>> 26) + (var107 & 0xFC0)]) != 0) {
                        int var110 = arg0[var21];
                        int var111 = ((var109 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var109 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var112 = ((var110 & 0xFF00FF) * var30 + (var111 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var110 & 0xFF00) * var30 + (var111 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var112 & 0xFF00FF) * var28 & 0xFF00FF00 | (var112 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var113 = var44 + var107;
                    int var114 = arg8 + var108;
                    int var115;
                    if (var114 < this.field6559[var21] && (var115 = arg1[(var113 >>> 26) + (var113 & 0xFC0)]) != 0) {
                        int var116 = arg0[var21];
                        int var117 = ((var115 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var115 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var118 = ((var116 & 0xFF00FF) * var30 + (var117 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var116 & 0xFF00) * var30 + (var117 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var118 & 0xFF00FF) * var28 & 0xFF00FF00 | (var118 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var119 = var44 + var113;
                    int var120 = arg8 + var114;
                    int var121;
                    if (var120 < this.field6559[var21] && (var121 = arg1[(var119 >>> 26) + (var119 & 0xFC0)]) != 0) {
                        int var122 = arg0[var21];
                        int var123 = ((var121 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var121 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var124 = ((var122 & 0xFF00FF) * var30 + (var123 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var122 & 0xFF00) * var30 + (var123 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var124 & 0xFF00FF) * var28 & 0xFF00FF00 | (var124 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var125 = var44 + var119;
                    int var126 = arg8 + var120;
                    int var127;
                    if (var126 < this.field6559[var21] && (var127 = arg1[(var125 >>> 26) + (var125 & 0xFC0)]) != 0) {
                        int var128 = arg0[var21];
                        int var129 = ((var127 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var127 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var130 = ((var128 & 0xFF00FF) * var30 + (var129 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var128 & 0xFF00) * var30 + (var129 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var130 & 0xFF00FF) * var28 & 0xFF00FF00 | (var130 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var131 = var44 + var125;
                    int var132 = arg8 + var126;
                    int var133;
                    if (var132 < this.field6559[var21] && (var133 = arg1[(var131 >>> 26) + (var131 & 0xFC0)]) != 0) {
                        int var134 = arg0[var21];
                        int var135 = ((var133 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var133 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var136 = ((var134 & 0xFF00FF) * var30 + (var135 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var134 & 0xFF00) * var30 + (var135 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var136 & 0xFF00FF) * var28 & 0xFF00FF00 | (var136 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var137 = var44 + var131;
                    int var138 = arg8 + var132;
                    int var139;
                    if (var138 < this.field6559[var21] && (var139 = arg1[(var137 >>> 26) + (var137 & 0xFC0)]) != 0) {
                        int var140 = arg0[var21];
                        int var141 = ((var139 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var139 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var142 = ((var140 & 0xFF00FF) * var30 + (var141 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var140 & 0xFF00) * var30 + (var141 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var142 & 0xFF00FF) * var28 & 0xFF00FF00 | (var142 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var143 = var44 + var137;
                    int var144 = arg8 + var138;
                    int var145;
                    if (var144 < this.field6559[var21] && (var145 = arg1[(var143 >>> 26) + (var143 & 0xFC0)]) != 0) {
                        int var146 = arg0[var21];
                        int var147 = ((var145 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var145 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var148 = ((var146 & 0xFF00FF) * var30 + (var147 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var146 & 0xFF00) * var30 + (var147 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var148 & 0xFF00FF) * var28 & 0xFF00FF00 | (var148 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    var10000 = var44 + var143;
                    var24 = arg8 + var144;
                    int var150 = var41;
                    int var151 = var42;
                    var38 += arg17;
                    var39 += arg18;
                    var40 += arg19;
                    if (var40 == 0.0F) {
                        var41 = 0;
                        var42 = 0;
                    } else {
                        var41 = (int) (var38 * 4096.0F / var40);
                        var42 = (int) (var39 * 4096.0F / var40);
                    }
                    var43 = (var150 << 20) + var151;
                    var44 = (var41 - var150 >> 3 << 20) + (var42 - var151 >> 3);
                    var23 += var46;
                    var47 = var23 >> 8;
                    var22 += var26;
                    int var152 = var22 >> 16;
                    var28 = 255 - var152;
                    var29 = ((arg11 & 0xFF00FF) * var152 & 0xFF00FF00 | (arg11 & 0xFF00) * var152 & 0xFF0000) >>> 8;
                    var45--;
                } while (var45 > 0);
            }
            int var153 = arg6 - arg5 & 0x7;
            if (var153 <= 0) {
                return;
            }
            do {
                int var154;
                if (var24 < this.field6559[var21] && (var154 = arg1[(var43 >>> 26) + (var43 & 0xFC0)]) != 0) {
                    int var155 = arg0[var21];
                    int var156 = ((var154 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var154 & 0xFF00) * var47 & 0xFF0000) >> 8;
                    int var157 = ((var155 & 0xFF00FF) * var30 + (var156 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var155 & 0xFF00) * var30 + (var156 & 0xFF00) * var31 & 0xFF0000) >> 8;
                    arg0[var21] = (((var157 & 0xFF00FF) * var28 & 0xFF00FF00 | (var157 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                }
                var21++;
                var43 += var44;
                var24 += arg8;
                var153--;
            } while (var153 > 0);
        }
        return;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([I[IIIIIIII)V")
    private final void method2724(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var10 = arg5 + arg2 - 1;
        int var11 = arg6 - arg5 >> 2;
        int var12 = arg5 * arg8 + arg7;
        if (this.field6562.field5936) {
            if (this.field6568 == 0) {
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var13 = arg6 - arg5 & 0x3;
                        while (true) {
                            var13--;
                            if (var13 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                arg0[var10] = arg3;
                                arg1[var10] = var12;
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var12;
                    }
                    int var14 = arg8 + var12;
                    var10++;
                    if (var14 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var14;
                    }
                    int var15 = arg8 + var14;
                    var10++;
                    if (var15 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var15;
                    }
                    int var16 = arg8 + var15;
                    var10++;
                    if (var16 < arg1[var10]) {
                        arg0[var10] = arg3;
                        arg1[var10] = var16;
                    }
                    var12 = arg8 + var16;
                }
            } else if (this.field6568 != 254) {
                int var21 = this.field6568;
                int var22 = 256 - this.field6568;
                int var23 = ((arg3 & 0xFF00FF) * var22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var22 >> 8 & 0xFF00);
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var24 = arg6 - arg5 & 0x3;
                        while (true) {
                            var24--;
                            if (var24 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                int var25 = arg0[var10];
                                arg0[var10] = ((var25 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var25 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                                arg1[var10] = var12;
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        int var26 = arg0[var10];
                        arg0[var10] = ((var26 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var12;
                    }
                    int var27 = arg8 + var12;
                    var10++;
                    if (var27 < arg1[var10]) {
                        int var28 = arg0[var10];
                        arg0[var10] = ((var28 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var28 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var27;
                    }
                    int var29 = arg8 + var27;
                    var10++;
                    if (var29 < arg1[var10]) {
                        int var30 = arg0[var10];
                        arg0[var10] = ((var30 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var30 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var29;
                    }
                    int var31 = arg8 + var29;
                    var10++;
                    if (var31 < arg1[var10]) {
                        int var32 = arg0[var10];
                        arg0[var10] = ((var32 & 0xFF00) * var21 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + var23;
                        arg1[var10] = var31;
                    }
                    var12 = arg8 + var31;
                }
            } else if (arg5 != 0 && arg6 <= this.field6566 - 1) {
                while (true) {
                    var11--;
                    if (var11 < 0) {
                        int var17 = arg6 - arg5 & 0x3;
                        while (true) {
                            var17--;
                            if (var17 < 0) {
                                return;
                            }
                            var10++;
                            if (var12 < arg1[var10]) {
                                arg0[var10 - 1] = arg0[var10];
                            }
                            var12 += arg8;
                        }
                    }
                    var10++;
                    if (var12 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    int var18 = arg8 + var12;
                    var10++;
                    if (var18 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    int var19 = arg8 + var18;
                    var10++;
                    if (var19 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    int var20 = arg8 + var19;
                    var10++;
                    if (var20 < arg1[var10]) {
                        arg0[var10 - 1] = arg0[var10];
                    }
                    var12 = arg8 + var20;
                }
            }
        } else if (this.field6568 == 0) {
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var33 = arg6 - arg5 & 0x3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            arg0[var10] = arg3;
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                int var34 = arg8 + var12;
                var10++;
                if (var34 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                int var35 = arg8 + var34;
                var10++;
                if (var35 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                int var36 = arg8 + var35;
                var10++;
                if (var36 < arg1[var10]) {
                    arg0[var10] = arg3;
                }
                var12 = arg8 + var36;
            }
        } else if (this.field6568 != 254) {
            int var41 = this.field6568;
            int var42 = 256 - this.field6568;
            int var43 = ((arg3 & 0xFF00FF) * var42 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var42 >> 8 & 0xFF00);
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var44 = arg6 - arg5 & 0x3;
                    while (true) {
                        var44--;
                        if (var44 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            int var45 = arg0[var10];
                            arg0[var10] = ((var45 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var45 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    int var46 = arg0[var10];
                    arg0[var10] = ((var46 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var46 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                int var47 = arg8 + var12;
                var10++;
                if (var47 < arg1[var10]) {
                    int var48 = arg0[var10];
                    arg0[var10] = ((var48 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var48 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                int var49 = arg8 + var47;
                var10++;
                if (var49 < arg1[var10]) {
                    int var50 = arg0[var10];
                    arg0[var10] = ((var50 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var50 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                int var51 = arg8 + var49;
                var10++;
                if (var51 < arg1[var10]) {
                    int var52 = arg0[var10];
                    arg0[var10] = ((var52 & 0xFF00) * var41 >> 8 & 0xFF00) + ((var52 & 0xFF00FF) * var41 >> 8 & 0xFF00FF) + var43;
                }
                var12 = arg8 + var51;
            }
        } else if (arg5 != 0 && arg6 <= this.field6566 - 1) {
            while (true) {
                var11--;
                if (var11 < 0) {
                    int var37 = arg6 - arg5 & 0x3;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            return;
                        }
                        var10++;
                        if (var12 < arg1[var10]) {
                            arg0[var10 - 1] = arg0[var10];
                        }
                        var12 += arg8;
                    }
                }
                var10++;
                if (var12 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                int var38 = arg8 + var12;
                var10++;
                if (var38 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                int var39 = arg8 + var38;
                var10++;
                if (var39 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                int var40 = arg8 + var39;
                var10++;
                if (var40 < arg1[var10]) {
                    arg0[var10 - 1] = arg0[var10];
                }
                var12 = arg8 + var40;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIIIIIII)V")
    public final void method2725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25) {
        int[] var27 = this.field6555.method1117(arg25);
        if (var27 == null) {
            int var28 = this.field6555.method1120(arg25);
            this.method2741(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, class561.method3334(255, arg9 | arg10 << 24, var28), class561.method3334(255, arg9 | arg11 << 24, var28), class561.method3334(255, arg9 | arg12 << 24, var28));
            return;
        }
        this.field6560 = this.field6555.method1113(arg25);
        this.field6567 = this.field6555.method1121(arg25);
        int var29 = arg4 - arg3;
        int var30 = arg1 - arg0;
        int var31 = arg5 - arg3;
        int var32 = arg2 - arg0;
        int var33 = arg7 - arg6;
        int var34 = arg8 - arg6;
        int var35 = 0;
        if (arg0 != arg1) {
            var35 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var36 = 0;
        if (arg1 != arg2) {
            var36 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var37 = 0;
        if (arg0 != arg2) {
            var37 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var38 = var29 * var32 - var30 * var31;
        if (var38 == 0) {
            return;
        }
        int var39 = arg11 - arg10;
        int var40 = arg12 - arg10;
        int var41 = (var32 * var39 - var30 * var40 << 16) / var38;
        int var42 = (var29 * var40 - var31 * var39 << 16) / var38;
        int var43 = arg14 - arg13;
        int var44 = arg15 - arg13;
        int var45 = (var32 * var43 - var30 * var44 << 9) / var38;
        int var46 = (var29 * var44 - var31 * var43 << 9) / var38;
        int var47 = (var32 * var33 - var30 * var34 << 8) / var38;
        int var48 = (var29 * var34 - var31 * var33 << 8) / var38;
        float var49 = 8.0F / (float) this.field6555.field2086;
        float var50 = (float) this.field6555.field2083;
        int var51 = arg16 - arg17;
        int var52 = arg19 - arg20;
        int var53 = arg22 - arg23;
        int var54 = arg18 - arg16;
        int var55 = arg21 - arg19;
        int var56 = arg24 - arg22;
        float var57 = (float) (arg19 * var54 - arg16 * var55);
        float var58 = (float) (arg22 * var55 - arg19 * var56) * var49;
        float var59 = (float) (arg16 * var56 - arg22 * var54) / var50;
        float var60 = (float) (arg19 * var51 - arg16 * var52);
        float var61 = (float) (arg22 * var52 - arg19 * var53) * var49;
        float var62 = (float) (arg16 * var53 - arg22 * var51) / var50;
        float var63 = (float) (var52 * var54 - var51 * var55);
        float var64 = (float) (var53 * var55 - var52 * var56) * var49;
        float var65 = (float) (var51 * var56 - var53 * var54) / var50;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field6561) {
                if (arg1 > this.field6561) {
                    arg1 = this.field6561;
                }
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                int var66 = (arg10 << 16) + var41 - arg3 * var41;
                int var67 = (arg13 << 9) + var45 - arg3 * var45;
                int var68 = (arg6 << 8) + var47 - arg3 * var47;
                if (arg1 < arg2) {
                    int var69;
                    int var70 = var69 = arg3 << 16;
                    if (arg0 < 0) {
                        var70 -= arg0 * var37;
                        var69 -= arg0 * var35;
                        var66 -= arg0 * var42;
                        var67 -= arg0 * var46;
                        var68 -= arg0 * var48;
                        arg0 = 0;
                    }
                    int var71 = arg4 << 16;
                    if (arg1 < 0) {
                        var71 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var72 = arg0 - this.field6563;
                    float var73 = (float) var72 * var59 + var57;
                    float var74 = (float) var72 * var62 + var60;
                    float var75 = (float) var72 * var65 + var63;
                    if (arg0 != arg1 && var37 < var35 || arg0 == arg1 && var37 > var36) {
                        int var76 = arg2 - arg1;
                        int var77 = arg1 - arg0;
                        int var78 = this.field6553[arg0];
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var78, var70 >> 16, var71 >> 16, var68, var47, var66, var41, arg9, var67, var45, var73, var74, var75, var58, var61, var64);
                                    var70 += var37;
                                    var71 += var36;
                                    var66 += var42;
                                    var67 += var46;
                                    var68 += var48;
                                    var78 += this.field6554;
                                    var73 += var59;
                                    var74 += var62;
                                    var75 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var78, var70 >> 16, var69 >> 16, var68, var47, var66, var41, arg9, var67, var45, var73, var74, var75, var58, var61, var64);
                            var70 += var37;
                            var69 += var35;
                            var66 += var42;
                            var67 += var46;
                            var68 += var48;
                            var78 += this.field6554;
                            var73 += var59;
                            var74 += var62;
                            var75 += var65;
                        }
                    } else {
                        int var79 = arg2 - arg1;
                        int var80 = arg1 - arg0;
                        int var81 = this.field6553[arg0];
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var81, var71 >> 16, var70 >> 16, var68, var47, var66, var41, arg9, var67, var45, var73, var74, var75, var58, var61, var64);
                                    var70 += var37;
                                    var71 += var36;
                                    var66 += var42;
                                    var67 += var46;
                                    var68 += var48;
                                    var81 += this.field6554;
                                    var73 += var59;
                                    var74 += var62;
                                    var75 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var81, var69 >> 16, var70 >> 16, var68, var47, var66, var41, arg9, var67, var45, var73, var74, var75, var58, var61, var64);
                            var70 += var37;
                            var69 += var35;
                            var66 += var42;
                            var67 += var46;
                            var68 += var48;
                            var81 += this.field6554;
                            var73 += var59;
                            var74 += var62;
                            var75 += var65;
                        }
                    }
                } else {
                    int var82;
                    int var83 = var82 = arg3 << 16;
                    if (arg0 < 0) {
                        var83 -= arg0 * var37;
                        var82 -= arg0 * var35;
                        var66 -= arg0 * var42;
                        var67 -= arg0 * var46;
                        var68 -= arg0 * var48;
                        arg0 = 0;
                    }
                    int var84 = arg5 << 16;
                    if (arg2 < 0) {
                        var84 -= arg2 * var36;
                        arg2 = 0;
                    }
                    int var85 = arg0 - this.field6563;
                    float var86 = (float) var85 * var59 + var57;
                    float var87 = (float) var85 * var62 + var60;
                    float var88 = (float) var85 * var65 + var63;
                    if ((arg0 == arg2 || var37 >= var35) && (arg0 != arg2 || var36 <= var35)) {
                        int var92 = arg1 - arg2;
                        int var93 = arg2 - arg0;
                        int var94 = this.field6553[arg0];
                        while (true) {
                            var93--;
                            if (var93 < 0) {
                                while (true) {
                                    var92--;
                                    if (var92 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var94, var82 >> 16, var84 >> 16, var68, var47, var66, var41, arg9, var67, var45, var86, var87, var88, var58, var61, var64);
                                    var84 += var36;
                                    var82 += var35;
                                    var66 += var42;
                                    var67 += var46;
                                    var68 += var48;
                                    var94 += this.field6554;
                                    var86 += var59;
                                    var87 += var62;
                                    var88 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var94, var82 >> 16, var83 >> 16, var68, var47, var66, var41, arg9, var67, var45, var86, var87, var88, var58, var61, var64);
                            var83 += var37;
                            var82 += var35;
                            var66 += var42;
                            var67 += var46;
                            var68 += var48;
                            var94 += this.field6554;
                            var86 += var59;
                            var87 += var62;
                            var88 += var65;
                        }
                    } else {
                        int var89 = arg1 - arg2;
                        int var90 = arg2 - arg0;
                        int var91 = this.field6553[arg0];
                        while (true) {
                            var90--;
                            if (var90 < 0) {
                                while (true) {
                                    var89--;
                                    if (var89 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var91, var84 >> 16, var82 >> 16, var68, var47, var66, var41, arg9, var67, var45, var86, var87, var88, var58, var61, var64);
                                    var84 += var36;
                                    var82 += var35;
                                    var66 += var42;
                                    var67 += var46;
                                    var68 += var48;
                                    var91 += this.field6554;
                                    var86 += var59;
                                    var87 += var62;
                                    var88 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var91, var83 >> 16, var82 >> 16, var68, var47, var66, var41, arg9, var67, var45, var86, var87, var88, var58, var61, var64);
                            var83 += var37;
                            var82 += var35;
                            var66 += var42;
                            var67 += var46;
                            var68 += var48;
                            var91 += this.field6554;
                            var86 += var59;
                            var87 += var62;
                            var88 += var65;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field6561) {
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                if (arg0 > this.field6561) {
                    arg0 = this.field6561;
                }
                int var95 = (arg11 << 16) + var41 - arg4 * var41;
                int var96 = (arg14 << 9) + var45 - arg4 * var45;
                int var97 = (arg7 << 8) + var47 - arg4 * var47;
                if (arg2 < arg0) {
                    int var98;
                    int var99 = var98 = arg4 << 16;
                    if (arg1 < 0) {
                        var99 -= arg1 * var35;
                        var98 -= arg1 * var36;
                        var95 -= arg1 * var42;
                        var96 -= arg1 * var46;
                        var97 -= arg1 * var48;
                        arg1 = 0;
                    }
                    int var100 = arg5 << 16;
                    if (arg2 < 0) {
                        var100 -= arg2 * var37;
                        arg2 = 0;
                    }
                    int var101 = arg1 - this.field6563;
                    float var102 = (float) var101 * var59 + var57;
                    float var103 = (float) var101 * var62 + var60;
                    float var104 = (float) var101 * var65 + var63;
                    if (arg1 != arg2 && var35 < var36 || arg1 == arg2 && var35 > var37) {
                        int var105 = arg0 - arg2;
                        int var106 = arg2 - arg1;
                        int var107 = this.field6553[arg1];
                        while (true) {
                            var106--;
                            if (var106 < 0) {
                                while (true) {
                                    var105--;
                                    if (var105 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var107, var99 >> 16, var100 >> 16, var97, var47, var95, var41, arg9, var96, var45, var102, var103, var104, var58, var61, var64);
                                    var99 += var35;
                                    var100 += var37;
                                    var95 += var42;
                                    var96 += var46;
                                    var97 += var48;
                                    var107 += this.field6554;
                                    var102 += var59;
                                    var103 += var62;
                                    var104 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var107, var99 >> 16, var98 >> 16, var97, var47, var95, var41, arg9, var96, var45, var102, var103, var104, var58, var61, var64);
                            var99 += var35;
                            var98 += var36;
                            var95 += var42;
                            var96 += var46;
                            var97 += var48;
                            var107 += this.field6554;
                            var102 += var59;
                            var103 += var62;
                            var104 += var65;
                        }
                    } else {
                        int var108 = arg0 - arg2;
                        int var109 = arg2 - arg1;
                        int var110 = this.field6553[arg1];
                        while (true) {
                            var109--;
                            if (var109 < 0) {
                                while (true) {
                                    var108--;
                                    if (var108 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var110, var100 >> 16, var99 >> 16, var97, var47, var95, var41, arg9, var96, var45, var102, var103, var104, var58, var61, var64);
                                    var99 += var35;
                                    var100 += var37;
                                    var95 += var42;
                                    var96 += var46;
                                    var97 += var48;
                                    var110 += this.field6554;
                                    var102 += var59;
                                    var103 += var62;
                                    var104 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var110, var98 >> 16, var99 >> 16, var97, var47, var95, var41, arg9, var96, var45, var102, var103, var104, var58, var61, var64);
                            var99 += var35;
                            var98 += var36;
                            var95 += var42;
                            var96 += var46;
                            var97 += var48;
                            var110 += this.field6554;
                            var102 += var59;
                            var103 += var62;
                            var104 += var65;
                        }
                    }
                } else {
                    int var111;
                    int var112 = var111 = arg4 << 16;
                    if (arg1 < 0) {
                        var112 -= arg1 * var35;
                        var111 -= arg1 * var36;
                        var95 -= arg1 * var42;
                        var96 -= arg1 * var46;
                        var97 -= arg1 * var48;
                        arg1 = 0;
                    }
                    int var113 = arg3 << 16;
                    if (arg0 < 0) {
                        var113 -= arg0 * var37;
                        arg0 = 0;
                    }
                    int var114 = arg1 - this.field6563;
                    float var115 = (float) var114 * var59 + var57;
                    float var116 = (float) var114 * var62 + var60;
                    float var117 = (float) var114 * var65 + var63;
                    if (var35 < var36) {
                        int var118 = arg2 - arg0;
                        int var119 = arg0 - arg1;
                        int var120 = this.field6553[arg1];
                        while (true) {
                            var119--;
                            if (var119 < 0) {
                                while (true) {
                                    var118--;
                                    if (var118 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var120, var113 >> 16, var111 >> 16, var97, var47, var95, var41, arg9, var96, var45, var115, var116, var117, var58, var61, var64);
                                    var113 += var37;
                                    var111 += var36;
                                    var95 += var42;
                                    var96 += var46;
                                    var97 += var48;
                                    var120 += this.field6554;
                                    var115 += var59;
                                    var116 += var62;
                                    var117 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var120, var112 >> 16, var111 >> 16, var97, var47, var95, var41, arg9, var96, var45, var115, var116, var117, var58, var61, var64);
                            var112 += var35;
                            var111 += var36;
                            var95 += var42;
                            var96 += var46;
                            var97 += var48;
                            var120 += this.field6554;
                            var115 += var59;
                            var116 += var62;
                            var117 += var65;
                        }
                    } else {
                        int var121 = arg2 - arg0;
                        int var122 = arg0 - arg1;
                        int var123 = this.field6553[arg1];
                        while (true) {
                            var122--;
                            if (var122 < 0) {
                                while (true) {
                                    var121--;
                                    if (var121 < 0) {
                                        return;
                                    }
                                    this.method2739(this.field6552, var27, 0, 0, var123, var111 >> 16, var113 >> 16, var97, var47, var95, var41, arg9, var96, var45, var115, var116, var117, var58, var61, var64);
                                    var113 += var37;
                                    var111 += var36;
                                    var95 += var42;
                                    var96 += var46;
                                    var97 += var48;
                                    var123 += this.field6554;
                                    var115 += var59;
                                    var116 += var62;
                                    var117 += var65;
                                }
                            }
                            this.method2739(this.field6552, var27, 0, 0, var123, var111 >> 16, var112 >> 16, var97, var47, var95, var41, arg9, var96, var45, var115, var116, var117, var58, var61, var64);
                            var112 += var35;
                            var111 += var36;
                            var95 += var42;
                            var96 += var46;
                            var97 += var48;
                            var123 += this.field6554;
                            var115 += var59;
                            var116 += var62;
                            var117 += var65;
                        }
                    }
                }
            }
        } else if (arg2 < this.field6561) {
            if (arg0 > this.field6561) {
                arg0 = this.field6561;
            }
            if (arg1 > this.field6561) {
                arg1 = this.field6561;
            }
            int var124 = (arg12 << 16) + var41 - arg5 * var41;
            int var125 = (arg15 << 9) + var45 - arg5 * var45;
            int var126 = (arg8 << 8) + var47 - arg5 * var47;
            if (arg0 < arg1) {
                int var127;
                int var128 = var127 = arg5 << 16;
                if (arg2 < 0) {
                    var128 -= arg2 * var36;
                    var127 -= arg2 * var37;
                    var124 -= arg2 * var42;
                    var125 -= arg2 * var46;
                    var126 -= arg2 * var48;
                    arg2 = 0;
                }
                int var129 = arg3 << 16;
                if (arg0 < 0) {
                    var129 -= arg0 * var35;
                    arg0 = 0;
                }
                int var130 = arg2 - this.field6563;
                float var131 = (float) var130 * var59 + var57;
                float var132 = (float) var130 * var62 + var60;
                float var133 = (float) var130 * var65 + var63;
                if (var36 < var37) {
                    int var134 = arg1 - arg0;
                    int var135 = arg0 - arg2;
                    int var136 = this.field6553[arg2];
                    while (true) {
                        var135--;
                        if (var135 < 0) {
                            while (true) {
                                var134--;
                                if (var134 < 0) {
                                    return;
                                }
                                this.method2739(this.field6552, var27, 0, 0, var136, var128 >> 16, var129 >> 16, var126, var47, var124, var41, arg9, var125, var45, var131, var132, var133, var58, var61, var64);
                                var128 += var36;
                                var129 += var35;
                                var124 += var42;
                                var125 += var46;
                                var126 += var48;
                                var136 += this.field6554;
                                var131 += var59;
                                var132 += var62;
                                var133 += var65;
                            }
                        }
                        this.method2739(this.field6552, var27, 0, 0, var136, var128 >> 16, var127 >> 16, var126, var47, var124, var41, arg9, var125, var45, var131, var132, var133, var58, var61, var64);
                        var128 += var36;
                        var127 += var37;
                        var124 += var42;
                        var125 += var46;
                        var126 += var48;
                        var136 += this.field6554;
                        var131 += var59;
                        var132 += var62;
                        var133 += var65;
                    }
                } else {
                    int var137 = arg1 - arg0;
                    int var138 = arg0 - arg2;
                    int var139 = this.field6553[arg2];
                    while (true) {
                        var138--;
                        if (var138 < 0) {
                            while (true) {
                                var137--;
                                if (var137 < 0) {
                                    return;
                                }
                                this.method2739(this.field6552, var27, 0, 0, var139, var129 >> 16, var128 >> 16, var126, var47, var124, var41, arg9, var125, var45, var131, var132, var133, var58, var61, var64);
                                var128 += var36;
                                var129 += var35;
                                var124 += var42;
                                var125 += var46;
                                var126 += var48;
                                var139 += this.field6554;
                                var131 += var59;
                                var132 += var62;
                                var133 += var65;
                            }
                        }
                        this.method2739(this.field6552, var27, 0, 0, var139, var127 >> 16, var128 >> 16, var126, var47, var124, var41, arg9, var125, var45, var131, var132, var133, var58, var61, var64);
                        var128 += var36;
                        var127 += var37;
                        var124 += var42;
                        var125 += var46;
                        var126 += var48;
                        var139 += this.field6554;
                        var131 += var59;
                        var132 += var62;
                        var133 += var65;
                    }
                }
            } else {
                int var140;
                int var141 = var140 = arg5 << 16;
                if (arg2 < 0) {
                    var141 -= arg2 * var36;
                    var140 -= arg2 * var37;
                    var124 -= arg2 * var42;
                    var125 -= arg2 * var46;
                    var126 -= arg2 * var48;
                    arg2 = 0;
                }
                int var142 = arg4 << 16;
                if (arg1 < 0) {
                    var142 -= arg1 * var35;
                    arg1 = 0;
                }
                int var143 = arg2 - this.field6563;
                float var144 = (float) var143 * var59 + var57;
                float var145 = (float) var143 * var62 + var60;
                float var146 = (float) var143 * var65 + var63;
                if (var36 < var37) {
                    int var147 = arg0 - arg1;
                    int var148 = arg1 - arg2;
                    int var149 = this.field6553[arg2];
                    while (true) {
                        var148--;
                        if (var148 < 0) {
                            while (true) {
                                var147--;
                                if (var147 < 0) {
                                    return;
                                }
                                this.method2739(this.field6552, var27, 0, 0, var149, var142 >> 16, var140 >> 16, var126, var47, var124, var41, arg9, var125, var45, var144, var145, var146, var58, var61, var64);
                                var142 += var35;
                                var140 += var37;
                                var124 += var42;
                                var125 += var46;
                                var126 += var48;
                                var149 += this.field6554;
                                var144 += var59;
                                var145 += var62;
                                var146 += var65;
                            }
                        }
                        this.method2739(this.field6552, var27, 0, 0, var149, var141 >> 16, var140 >> 16, var126, var47, var124, var41, arg9, var125, var45, var144, var145, var146, var58, var61, var64);
                        var141 += var36;
                        var140 += var37;
                        var124 += var42;
                        var125 += var46;
                        var126 += var48;
                        var149 += this.field6554;
                        var144 += var59;
                        var145 += var62;
                        var146 += var65;
                    }
                } else {
                    int var150 = arg0 - arg1;
                    int var151 = arg1 - arg2;
                    int var152 = this.field6553[arg2];
                    while (true) {
                        var151--;
                        if (var151 < 0) {
                            while (true) {
                                var150--;
                                if (var150 < 0) {
                                    return;
                                }
                                this.method2739(this.field6552, var27, 0, 0, var152, var140 >> 16, var142 >> 16, var126, var47, var124, var41, arg9, var125, var45, var144, var145, var146, var58, var61, var64);
                                var142 += var35;
                                var140 += var37;
                                var124 += var42;
                                var125 += var46;
                                var126 += var48;
                                var152 += this.field6554;
                                var144 += var59;
                                var145 += var62;
                                var146 += var65;
                            }
                        }
                        this.method2739(this.field6552, var27, 0, 0, var152, var140 >> 16, var141 >> 16, var126, var47, var124, var41, arg9, var125, var45, var144, var145, var146, var58, var61, var64);
                        var141 += var36;
                        var140 += var37;
                        var124 += var42;
                        var125 += var46;
                        var126 += var48;
                        var152 += this.field6554;
                        var144 += var59;
                        var145 += var62;
                        var146 += var65;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([I[IIIIIIIIII)V")
    private final void method2726(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var12 = arg5 + arg2 - 1;
        int var13 = arg5 * arg8 + arg7;
        int var14 = arg5 * arg10 + arg9;
        if (this.field6562.field5936) {
            if (this.field6558) {
                int var15 = arg6 - arg5 >> 2;
                int var16 = arg8 << 2;
                if (this.field6568 == 0) {
                    if (var15 > 0) {
                        do {
                            int var17 = class444.field6749[var13 >> 8];
                            var13 += var16;
                            var12++;
                            if (var14 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var14;
                            }
                            int var18 = arg10 + var14;
                            var12++;
                            if (var18 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var18;
                            }
                            int var19 = arg10 + var18;
                            var12++;
                            if (var19 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var19;
                            }
                            int var20 = arg10 + var19;
                            var12++;
                            if (var20 < arg1[var12]) {
                                arg0[var12] = var17;
                                arg1[var12] = var20;
                            }
                            var14 = arg10 + var20;
                            var15--;
                        } while (var15 > 0);
                    }
                    int var21 = arg6 - arg5 & 0x3;
                    if (var21 > 0) {
                        int var22 = class444.field6749[var13 >> 8];
                        do {
                            var12++;
                            if (var14 < arg1[var12]) {
                                arg0[var12] = var22;
                                arg1[var12] = var14;
                            }
                            var14 += arg10;
                            var21--;
                        } while (var21 > 0);
                        return;
                    }
                } else {
                    int var23 = this.field6568;
                    int var24 = 256 - this.field6568;
                    if (var15 > 0) {
                        do {
                            int var25 = class444.field6749[var13 >> 8];
                            var13 += var16;
                            int var26 = ((var25 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var25 & 0xFF00) * var24 >> 8 & 0xFF00);
                            var12++;
                            if (var14 < arg1[var12]) {
                                int var27 = arg0[var12];
                                arg0[var12] = ((var27 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var27 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var14;
                            }
                            int var28 = arg10 + var14;
                            var12++;
                            if (var28 < arg1[var12]) {
                                int var29 = arg0[var12];
                                arg0[var12] = ((var29 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var29 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var28;
                            }
                            int var30 = arg10 + var28;
                            var12++;
                            if (var30 < arg1[var12]) {
                                int var31 = arg0[var12];
                                arg0[var12] = ((var31 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var30;
                            }
                            int var32 = arg10 + var30;
                            var12++;
                            if (var32 < arg1[var12]) {
                                int var33 = arg0[var12];
                                arg0[var12] = ((var33 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var26;
                                arg1[var12] = var32;
                            }
                            var14 = arg10 + var32;
                            var15--;
                        } while (var15 > 0);
                    }
                    int var34 = arg6 - arg5 & 0x3;
                    if (var34 <= 0) {
                        return;
                    }
                    int var35 = class444.field6749[var13 >> 8];
                    int var36 = ((var35 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var24 >> 8 & 0xFF00);
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var37 = arg0[var12];
                            arg0[var12] = ((var37 & 0xFF00) * var23 >> 8 & 0xFF00) + ((var37 & 0xFF00FF) * var23 >> 8 & 0xFF00FF) + var36;
                            arg1[var12] = var14;
                        }
                        var14 += arg10;
                        var34--;
                    } while (var34 > 0);
                }
            } else {
                int var38 = arg6 - arg5;
                if (this.field6568 == 0) {
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = class444.field6749[var13 >> 8];
                            arg1[var12] = var14;
                        }
                        var14 += arg10;
                        var13 += arg8;
                        var38--;
                    } while (var38 > 0);
                } else {
                    int var39 = this.field6568;
                    int var40 = 256 - this.field6568;
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var41 = class444.field6749[var13 >> 8];
                            int var42 = ((var41 & 0xFF00FF) * var40 >> 8 & 0xFF00FF) + ((var41 & 0xFF00) * var40 >> 8 & 0xFF00);
                            int var43 = arg0[var12];
                            arg0[var12] = ((var43 & 0xFF00) * var39 >> 8 & 0xFF00) + ((var43 & 0xFF00FF) * var39 >> 8 & 0xFF00FF) + var42;
                            arg1[var12] = var14;
                        }
                        var13 += arg8;
                        var14 += arg10;
                        var38--;
                    } while (var38 > 0);
                }
            }
        } else if (this.field6558) {
            int var44 = arg6 - arg5 >> 2;
            int var45 = arg8 << 2;
            if (this.field6568 == 0) {
                if (var44 > 0) {
                    do {
                        int var46 = class444.field6749[var13 >> 8];
                        var13 += var45;
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        int var47 = arg10 + var14;
                        var12++;
                        if (var47 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        int var48 = arg10 + var47;
                        var12++;
                        if (var48 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        int var49 = arg10 + var48;
                        var12++;
                        if (var49 < arg1[var12]) {
                            arg0[var12] = var46;
                        }
                        var14 = arg10 + var49;
                        var44--;
                    } while (var44 > 0);
                }
                int var50 = arg6 - arg5 & 0x3;
                if (var50 > 0) {
                    int var51 = class444.field6749[var13 >> 8];
                    do {
                        var12++;
                        if (var14 < arg1[var12]) {
                            arg0[var12] = var51;
                        }
                        var14 += arg10;
                        var50--;
                    } while (var50 > 0);
                    return;
                }
            } else {
                int var52 = this.field6568;
                int var53 = 256 - this.field6568;
                if (var44 > 0) {
                    do {
                        int var54 = class444.field6749[var13 >> 8];
                        var13 += var45;
                        int var55 = ((var54 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + ((var54 & 0xFF00) * var53 >> 8 & 0xFF00);
                        var12++;
                        if (var14 < arg1[var12]) {
                            int var56 = arg0[var12];
                            arg0[var12] = ((var56 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var56 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        int var57 = arg10 + var14;
                        var12++;
                        if (var57 < arg1[var12]) {
                            int var58 = arg0[var12];
                            arg0[var12] = ((var58 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var58 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        int var59 = arg10 + var57;
                        var12++;
                        if (var59 < arg1[var12]) {
                            int var60 = arg0[var12];
                            arg0[var12] = ((var60 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var60 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        int var61 = arg10 + var59;
                        var12++;
                        if (var61 < arg1[var12]) {
                            int var62 = arg0[var12];
                            arg0[var12] = ((var62 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var62 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var55;
                        }
                        var14 = arg10 + var61;
                        var44--;
                    } while (var44 > 0);
                }
                int var63 = arg6 - arg5 & 0x3;
                if (var63 <= 0) {
                    return;
                }
                int var64 = class444.field6749[var13 >> 8];
                int var65 = ((var64 & 0xFF00FF) * var53 >> 8 & 0xFF00FF) + ((var64 & 0xFF00) * var53 >> 8 & 0xFF00);
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        int var66 = arg0[var12];
                        arg0[var12] = ((var66 & 0xFF00) * var52 >> 8 & 0xFF00) + ((var66 & 0xFF00FF) * var52 >> 8 & 0xFF00FF) + var65;
                    }
                    var14 += arg10;
                    var63--;
                } while (var63 > 0);
            }
        } else {
            int var67 = arg6 - arg5;
            if (this.field6568 == 0) {
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        arg0[var12] = class444.field6749[var13 >> 8];
                    }
                    var14 += arg10;
                    var13 += arg8;
                    var67--;
                } while (var67 > 0);
            } else {
                int var68 = this.field6568;
                int var69 = 256 - this.field6568;
                do {
                    var12++;
                    if (var14 < arg1[var12]) {
                        int var70 = class444.field6749[var13 >> 8];
                        int var71 = ((var70 & 0xFF00FF) * var69 >> 8 & 0xFF00FF) + ((var70 & 0xFF00) * var69 >> 8 & 0xFF00);
                        int var72 = arg0[var12];
                        arg0[var12] = ((var72 & 0xFF00) * var68 >> 8 & 0xFF00) + ((var72 & 0xFF00FF) * var68 >> 8 & 0xFF00FF) + var71;
                    }
                    var13 += arg8;
                    var14 += arg10;
                    var67--;
                } while (var67 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
    private final void method2727(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        int var19 = arg7 - arg6;
        int var20 = this.field6568;
        int var21 = 256 - this.field6568;
        int var10000;
        if (!this.field6560) {
            int var128 = arg6 - this.field6557;
            float var129 = arg15 / 8.0F * (float) var128 + arg12;
            float var130 = arg16 / 8.0F * (float) var128 + arg13;
            float var131 = arg17 / 8.0F * (float) var128 + arg14;
            int var132;
            int var133;
            if (var131 == 0.0F) {
                var132 = 0;
                var133 = 0;
            } else {
                var132 = (int) (var129 * 16384.0F / var131);
                var133 = (int) (var130 * 16384.0F / var131);
            }
            float var134 = arg15 + var129;
            float var135 = arg16 + var130;
            float var136 = arg17 + var131;
            int var137;
            int var138;
            if (var136 == 0.0F) {
                var137 = 0;
                var138 = 0;
            } else {
                var137 = (int) (var134 * 16384.0F / var136);
                var138 = (int) (var135 * 16384.0F / var136);
            }
            int var139 = (var132 << 18) + var133;
            int var140 = (var137 - var132 >> 3 << 18) + (var138 - var133 >> 3);
            int var141 = var19 >> 3;
            int var142 = arg11 << 3;
            int var143 = arg10 >> 8;
            if (this.field6567) {
                if (var141 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var144 = arg2[(var139 >>> 25) + (var139 & 0x3F80)];
                            int var145 = arg0[arg5];
                            int var146 = ((var144 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var144 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var145 & 0xFF00FF) * var20 + (var146 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var145 & 0xFF00) * var20 + (var146 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var147 = arg8 + arg9;
                        arg5++;
                        int var148 = var139 + var140;
                        if (var147 < arg1[arg5]) {
                            int var149 = arg2[(var148 >>> 25) + (var148 & 0x3F80)];
                            int var150 = arg0[arg5];
                            int var151 = ((var149 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var149 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var150 & 0xFF00FF) * var20 + (var151 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var150 & 0xFF00) * var20 + (var151 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var152 = arg9 + var147;
                        arg5++;
                        int var153 = var140 + var148;
                        if (var152 < arg1[arg5]) {
                            int var154 = arg2[(var153 >>> 25) + (var153 & 0x3F80)];
                            int var155 = arg0[arg5];
                            int var156 = ((var154 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var154 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var155 & 0xFF00FF) * var20 + (var156 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var155 & 0xFF00) * var20 + (var156 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var157 = arg9 + var152;
                        arg5++;
                        int var158 = var140 + var153;
                        if (var157 < arg1[arg5]) {
                            int var159 = arg2[(var158 >>> 25) + (var158 & 0x3F80)];
                            int var160 = arg0[arg5];
                            int var161 = ((var159 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var159 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var160 & 0xFF00FF) * var20 + (var161 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var160 & 0xFF00) * var20 + (var161 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var162 = arg9 + var157;
                        arg5++;
                        int var163 = var140 + var158;
                        if (var162 < arg1[arg5]) {
                            int var164 = arg2[(var163 >>> 25) + (var163 & 0x3F80)];
                            int var165 = arg0[arg5];
                            int var166 = ((var164 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var164 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var165 & 0xFF00FF) * var20 + (var166 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var165 & 0xFF00) * var20 + (var166 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var167 = arg9 + var162;
                        arg5++;
                        int var168 = var140 + var163;
                        if (var167 < arg1[arg5]) {
                            int var169 = arg2[(var168 >>> 25) + (var168 & 0x3F80)];
                            int var170 = arg0[arg5];
                            int var171 = ((var169 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var169 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var170 & 0xFF00FF) * var20 + (var171 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var170 & 0xFF00) * var20 + (var171 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var172 = arg9 + var167;
                        arg5++;
                        int var173 = var140 + var168;
                        if (var172 < arg1[arg5]) {
                            int var174 = arg2[(var173 >>> 25) + (var173 & 0x3F80)];
                            int var175 = arg0[arg5];
                            int var176 = ((var174 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var174 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var175 & 0xFF00FF) * var20 + (var176 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var175 & 0xFF00) * var20 + (var176 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var177 = arg9 + var172;
                        arg5++;
                        int var178 = var140 + var173;
                        if (var177 < arg1[arg5]) {
                            int var179 = arg2[(var178 >>> 25) + (var178 & 0x3F80)];
                            int var180 = arg0[arg5];
                            int var181 = ((var179 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var179 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var180 & 0xFF00FF) * var20 + (var181 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var180 & 0xFF00) * var20 + (var181 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        arg8 = arg9 + var177;
                        arg5++;
                        var10000 = var140 + var178;
                        int var183 = var137;
                        int var184 = var138;
                        var134 += arg15;
                        var135 += arg16;
                        var136 += arg17;
                        if (var136 == 0.0F) {
                            var137 = 0;
                            var138 = 0;
                        } else {
                            var137 = (int) (var134 * 16384.0F / var136);
                            var138 = (int) (var135 * 16384.0F / var136);
                        }
                        var139 = (var183 << 18) + var184;
                        var140 = (var137 - var183 >> 3 << 18) + (var138 - var184 >> 3);
                        arg10 += var142;
                        var143 = arg10 >> 8;
                        var141--;
                    } while (var141 > 0);
                }
                int var185 = arg7 - arg6 & 0x7;
                if (var185 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var186 = arg2[(var139 >>> 25) + (var139 & 0x3F80)];
                            int var187 = arg0[arg5];
                            int var188 = ((var186 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var186 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var187 & 0xFF00FF) * var20 + (var188 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var187 & 0xFF00) * var20 + (var188 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        arg8 += arg9;
                        arg5++;
                        var139 += var140;
                        var185--;
                    } while (var185 > 0);
                    return;
                }
            } else {
                if (var141 > 0) {
                    do {
                        int var189;
                        if (arg8 < arg1[arg5] && (var189 = arg2[(var139 >>> 25) + (var139 & 0x3F80)]) != 0) {
                            int var190 = arg0[arg5];
                            int var191 = ((var189 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var189 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var190 & 0xFF00FF) * var20 + (var191 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var190 & 0xFF00) * var20 + (var191 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var192 = arg8 + arg9;
                        arg5++;
                        int var193 = var139 + var140;
                        int var194;
                        if (var192 < arg1[arg5] && (var194 = arg2[(var193 >>> 25) + (var193 & 0x3F80)]) != 0) {
                            int var195 = arg0[arg5];
                            int var196 = ((var194 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var194 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var195 & 0xFF00FF) * var20 + (var196 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var195 & 0xFF00) * var20 + (var196 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var197 = arg9 + var192;
                        arg5++;
                        int var198 = var140 + var193;
                        int var199;
                        if (var197 < arg1[arg5] && (var199 = arg2[(var198 >>> 25) + (var198 & 0x3F80)]) != 0) {
                            int var200 = arg0[arg5];
                            int var201 = ((var199 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var199 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var200 & 0xFF00FF) * var20 + (var201 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var200 & 0xFF00) * var20 + (var201 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var202 = arg9 + var197;
                        arg5++;
                        int var203 = var140 + var198;
                        int var204;
                        if (var202 < arg1[arg5] && (var204 = arg2[(var203 >>> 25) + (var203 & 0x3F80)]) != 0) {
                            int var205 = arg0[arg5];
                            int var206 = ((var204 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var204 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var205 & 0xFF00FF) * var20 + (var206 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var205 & 0xFF00) * var20 + (var206 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var207 = arg9 + var202;
                        arg5++;
                        int var208 = var140 + var203;
                        int var209;
                        if (var207 < arg1[arg5] && (var209 = arg2[(var208 >>> 25) + (var208 & 0x3F80)]) != 0) {
                            int var210 = arg0[arg5];
                            int var211 = ((var209 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var209 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var210 & 0xFF00FF) * var20 + (var211 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var210 & 0xFF00) * var20 + (var211 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var212 = arg9 + var207;
                        arg5++;
                        int var213 = var140 + var208;
                        int var214;
                        if (var212 < arg1[arg5] && (var214 = arg2[(var213 >>> 25) + (var213 & 0x3F80)]) != 0) {
                            int var215 = arg0[arg5];
                            int var216 = ((var214 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var214 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var215 & 0xFF00FF) * var20 + (var216 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var215 & 0xFF00) * var20 + (var216 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var217 = arg9 + var212;
                        arg5++;
                        int var218 = var140 + var213;
                        int var219;
                        if (var217 < arg1[arg5] && (var219 = arg2[(var218 >>> 25) + (var218 & 0x3F80)]) != 0) {
                            int var220 = arg0[arg5];
                            int var221 = ((var219 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var219 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var220 & 0xFF00FF) * var20 + (var221 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var220 & 0xFF00) * var20 + (var221 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        int var222 = arg9 + var217;
                        arg5++;
                        int var223 = var140 + var218;
                        int var224;
                        if (var222 < arg1[arg5] && (var224 = arg2[(var223 >>> 25) + (var223 & 0x3F80)]) != 0) {
                            int var225 = arg0[arg5];
                            int var226 = ((var224 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var224 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var225 & 0xFF00FF) * var20 + (var226 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var225 & 0xFF00) * var20 + (var226 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        arg8 = arg9 + var222;
                        arg5++;
                        var10000 = var140 + var223;
                        int var228 = var137;
                        int var229 = var138;
                        var134 += arg15;
                        var135 += arg16;
                        var136 += arg17;
                        if (var136 == 0.0F) {
                            var137 = 0;
                            var138 = 0;
                        } else {
                            var137 = (int) (var134 * 16384.0F / var136);
                            var138 = (int) (var135 * 16384.0F / var136);
                        }
                        var139 = (var228 << 18) + var229;
                        var140 = (var137 - var228 >> 3 << 18) + (var138 - var229 >> 3);
                        arg10 += var142;
                        var143 = arg10 >> 8;
                        var141--;
                    } while (var141 > 0);
                }
                int var230 = arg7 - arg6 & 0x7;
                if (var230 > 0) {
                    do {
                        int var231;
                        if (arg8 < arg1[arg5] && (var231 = arg2[(var139 >>> 25) + (var139 & 0x3F80)]) != 0) {
                            int var232 = arg0[arg5];
                            int var233 = ((var231 & 0xFF00FF) * var143 & 0xFF00FF00) + ((var231 & 0xFF00) * var143 & 0xFF0000) >> 8;
                            arg0[arg5] = ((var232 & 0xFF00FF) * var20 + (var233 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var232 & 0xFF00) * var20 + (var233 & 0xFF00) * var21 & 0xFF0000) >> 8;
                        }
                        arg8 += arg9;
                        arg5++;
                        var139 += var140;
                        var230--;
                    } while (var230 > 0);
                }
            }
            return;
        }
        int var22 = arg6 - this.field6557;
        float var23 = arg15 / 8.0F * (float) var22 + arg12;
        float var24 = arg16 / 8.0F * (float) var22 + arg13;
        float var25 = arg17 / 8.0F * (float) var22 + arg14;
        int var26;
        int var27;
        if (var25 == 0.0F) {
            var26 = 0;
            var27 = 0;
        } else {
            var26 = (int) (var23 * 4096.0F / var25);
            var27 = (int) (var24 * 4096.0F / var25);
        }
        float var28 = arg15 + var23;
        float var29 = arg16 + var24;
        float var30 = arg17 + var25;
        int var31;
        int var32;
        if (var30 == 0.0F) {
            var31 = 0;
            var32 = 0;
        } else {
            var31 = (int) (var28 * 4096.0F / var30);
            var32 = (int) (var29 * 4096.0F / var30);
        }
        int var33 = (var26 << 20) + var27;
        int var34 = (var31 - var26 >> 3 << 20) + (var32 - var27 >> 3);
        int var35 = var19 >> 3;
        int var36 = arg11 << 3;
        int var37 = arg10 >> 8;
        if (this.field6567) {
            if (var35 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var38 = arg0[arg5];
                        int var39 = arg2[(var33 >>> 26) + (var33 & 0xFC0)];
                        int var40 = ((var39 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var39 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var38 & 0xFF00FF) * var20 + (var40 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var38 & 0xFF00) * var20 + (var40 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var41 = arg8 + arg9;
                    int var42 = var33 + var34;
                    arg5++;
                    if (var41 < arg1[arg5]) {
                        int var43 = arg0[arg5];
                        int var44 = arg2[(var42 >>> 26) + (var42 & 0xFC0)];
                        int var45 = ((var44 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var44 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var43 & 0xFF00FF) * var20 + (var45 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var43 & 0xFF00) * var20 + (var45 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var46 = arg9 + var41;
                    int var47 = var34 + var42;
                    arg5++;
                    if (var46 < arg1[arg5]) {
                        int var48 = arg0[arg5];
                        int var49 = arg2[(var47 >>> 26) + (var47 & 0xFC0)];
                        int var50 = ((var49 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var49 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var48 & 0xFF00FF) * var20 + (var50 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var48 & 0xFF00) * var20 + (var50 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var51 = arg9 + var46;
                    int var52 = var34 + var47;
                    arg5++;
                    if (var51 < arg1[arg5]) {
                        int var53 = arg0[arg5];
                        int var54 = arg2[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var55 = ((var54 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var54 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var53 & 0xFF00FF) * var20 + (var55 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var53 & 0xFF00) * var20 + (var55 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var56 = arg9 + var51;
                    int var57 = var34 + var52;
                    arg5++;
                    if (var56 < arg1[arg5]) {
                        int var58 = arg0[arg5];
                        int var59 = arg2[(var57 >>> 26) + (var57 & 0xFC0)];
                        int var60 = ((var59 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var59 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var58 & 0xFF00FF) * var20 + (var60 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var58 & 0xFF00) * var20 + (var60 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var61 = arg9 + var56;
                    int var62 = var34 + var57;
                    arg5++;
                    if (var61 < arg1[arg5]) {
                        int var63 = arg0[arg5];
                        int var64 = arg2[(var62 >>> 26) + (var62 & 0xFC0)];
                        int var65 = ((var64 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var64 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var63 & 0xFF00FF) * var20 + (var65 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var63 & 0xFF00) * var20 + (var65 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var66 = arg9 + var61;
                    int var67 = var34 + var62;
                    arg5++;
                    if (var66 < arg1[arg5]) {
                        int var68 = arg0[arg5];
                        int var69 = arg2[(var67 >>> 26) + (var67 & 0xFC0)];
                        int var70 = ((var69 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var69 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var68 & 0xFF00FF) * var20 + (var70 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var68 & 0xFF00) * var20 + (var70 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    int var71 = arg9 + var66;
                    int var72 = var34 + var67;
                    arg5++;
                    if (var71 < arg1[arg5]) {
                        int var73 = arg0[arg5];
                        int var74 = arg2[(var72 >>> 26) + (var72 & 0xFC0)];
                        int var75 = ((var74 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var74 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var73 & 0xFF00FF) * var20 + (var75 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var73 & 0xFF00) * var20 + (var75 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    arg8 = arg9 + var71;
                    var10000 = var34 + var72;
                    arg5++;
                    int var77 = var31;
                    int var78 = var32;
                    var28 += arg15;
                    var29 += arg16;
                    var30 += arg17;
                    if (var30 == 0.0F) {
                        var31 = 0;
                        var32 = 0;
                    } else {
                        var31 = (int) (var28 * 4096.0F / var30);
                        var32 = (int) (var29 * 4096.0F / var30);
                    }
                    var33 = (var77 << 20) + var78;
                    var34 = (var31 - var77 >> 3 << 20) + (var32 - var78 >> 3);
                    arg10 += var36;
                    var37 = arg10 >> 8;
                    var35--;
                } while (var35 > 0);
            }
            int var79 = arg7 - arg6 & 0x7;
            if (var79 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var80 = arg0[arg5];
                        int var81 = arg2[(var33 >>> 26) + (var33 & 0xFC0)];
                        int var82 = ((var81 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var81 & 0xFF00) * var37 & 0xFF0000) >> 8;
                        arg0[arg5] = ((var80 & 0xFF00FF) * var20 + (var82 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var80 & 0xFF00) * var20 + (var82 & 0xFF00) * var21 & 0xFF0000) >> 8;
                    }
                    arg8 += arg9;
                    var33 += var34;
                    arg5++;
                    var79--;
                } while (var79 > 0);
                return;
            }
            return;
        }
        if (var35 > 0) {
            do {
                int var83;
                if (arg8 < arg1[arg5] && (var83 = arg2[(var33 >>> 26) + (var33 & 0xFC0)]) != 0) {
                    int var84 = arg0[arg5];
                    int var85 = ((var83 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var83 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var84 & 0xFF00FF) * var20 + (var85 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var84 & 0xFF00) * var20 + (var85 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var86 = arg8 + arg9;
                arg5++;
                int var87 = var33 + var34;
                int var88;
                if (var86 < arg1[arg5] && (var88 = arg2[(var87 >>> 26) + (var87 & 0xFC0)]) != 0) {
                    int var89 = arg0[arg5];
                    int var90 = ((var88 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var88 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var89 & 0xFF00FF) * var20 + (var90 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var89 & 0xFF00) * var20 + (var90 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var91 = arg9 + var86;
                arg5++;
                int var92 = var34 + var87;
                int var93;
                if (var91 < arg1[arg5] && (var93 = arg2[(var92 >>> 26) + (var92 & 0xFC0)]) != 0) {
                    int var94 = arg0[arg5];
                    int var95 = ((var93 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var93 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var94 & 0xFF00FF) * var20 + (var95 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var94 & 0xFF00) * var20 + (var95 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var96 = arg9 + var91;
                arg5++;
                int var97 = var34 + var92;
                int var98;
                if (var96 < arg1[arg5] && (var98 = arg2[(var97 >>> 26) + (var97 & 0xFC0)]) != 0) {
                    int var99 = arg0[arg5];
                    int var100 = ((var98 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var98 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var99 & 0xFF00FF) * var20 + (var100 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var99 & 0xFF00) * var20 + (var100 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var101 = arg9 + var96;
                arg5++;
                int var102 = var34 + var97;
                int var103;
                if (var101 < arg1[arg5] && (var103 = arg2[(var102 >>> 26) + (var102 & 0xFC0)]) != 0) {
                    int var104 = arg0[arg5];
                    int var105 = ((var103 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var103 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var104 & 0xFF00FF) * var20 + (var105 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var104 & 0xFF00) * var20 + (var105 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var106 = arg9 + var101;
                arg5++;
                int var107 = var34 + var102;
                int var108;
                if (var106 < arg1[arg5] && (var108 = arg2[(var107 >>> 26) + (var107 & 0xFC0)]) != 0) {
                    int var109 = arg0[arg5];
                    int var110 = ((var108 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var108 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var109 & 0xFF00FF) * var20 + (var110 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var109 & 0xFF00) * var20 + (var110 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var111 = arg9 + var106;
                arg5++;
                int var112 = var34 + var107;
                int var113;
                if (var111 < arg1[arg5] && (var113 = arg2[(var112 >>> 26) + (var112 & 0xFC0)]) != 0) {
                    int var114 = arg0[arg5];
                    int var115 = ((var113 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var113 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var114 & 0xFF00FF) * var20 + (var115 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var114 & 0xFF00) * var20 + (var115 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                int var116 = arg9 + var111;
                arg5++;
                int var117 = var34 + var112;
                int var118;
                if (var116 < arg1[arg5] && (var118 = arg2[(var117 >>> 26) + (var117 & 0xFC0)]) != 0) {
                    int var119 = arg0[arg5];
                    int var120 = ((var118 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var118 & 0xFF00) * var37 & 0xFF0000) >> 8;
                    arg0[arg5] = ((var119 & 0xFF00FF) * var20 + (var120 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var119 & 0xFF00) * var20 + (var120 & 0xFF00) * var21 & 0xFF0000) >> 8;
                }
                arg8 = arg9 + var116;
                arg5++;
                var10000 = var34 + var117;
                int var122 = var31;
                int var123 = var32;
                var28 += arg15;
                var29 += arg16;
                var30 += arg17;
                if (var30 == 0.0F) {
                    var31 = 0;
                    var32 = 0;
                } else {
                    var31 = (int) (var28 * 4096.0F / var30);
                    var32 = (int) (var29 * 4096.0F / var30);
                }
                var33 = (var122 << 20) + var123;
                var34 = (var31 - var122 >> 3 << 20) + (var32 - var123 >> 3);
                arg10 += var36;
                var37 = arg10 >> 8;
                var35--;
            } while (var35 > 0);
        }
        int var124 = arg7 - arg6 & 0x7;
        if (var124 <= 0) {
            return;
        }
        do {
            int var125;
            if (arg8 < arg1[arg5] && (var125 = arg2[(var33 >>> 26) + (var33 & 0xFC0)]) != 0) {
                int var126 = arg0[arg5];
                int var127 = ((var125 & 0xFF00FF) * var37 & 0xFF00FF00) + ((var125 & 0xFF00) * var37 & 0xFF0000) >> 8;
                arg0[arg5] = ((var126 & 0xFF00FF) * var20 + (var127 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var126 & 0xFF00) * var20 + (var127 & 0xFF00) * var21 & 0xFF0000) >> 8;
            }
            arg8 += arg9;
            arg5++;
            var33 += var34;
            var124--;
        } while (var124 > 0);
        return;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
    private final void method2728(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        if (this.field6556) {
            if (arg7 > this.field6566) {
                arg7 = this.field6566;
            }
            if (arg6 < 0) {
                arg6 = 0;
            }
        }
        if (arg6 >= arg7) {
            return;
        }
        int var19 = arg5 + arg6;
        int var20 = arg6 * arg11 + arg10;
        int var21 = arg6 * arg9 + arg8;
        if (this.field6568 == 0) {
            if (this.field6562.field5936) {
                this.method2740(arg0, arg1, arg2, arg3, arg4, var19, arg6, arg7, var21, arg9, var20, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
            } else {
                this.method2731(arg0, arg1, arg2, arg3, arg4, var19, arg6, arg7, var21, arg9, var20, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
            }
        } else if (this.field6562.field5936) {
            this.method2721(arg0, arg1, arg2, arg3, arg4, var19, arg6, arg7, var21, arg9, var20, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
        } else {
            this.method2727(arg0, arg1, arg2, arg3, arg4, var19, arg6, arg7, var21, arg9, var20, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public final void method2729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (this.field6565) {
            this.field6555.method1354(class444.field6749[arg9], arg0, arg1, -54, arg3, arg4);
            this.field6555.method1354(class444.field6749[arg9], arg1, arg2, -123, arg4, arg5);
            this.field6555.method1354(class444.field6749[arg9], arg2, arg0, 120, arg5, arg3);
            return;
        }
        int var13 = arg4 - arg3;
        int var14 = arg1 - arg0;
        int var15 = arg5 - arg3;
        int var16 = arg2 - arg0;
        int var17 = arg10 - arg9;
        int var18 = arg11 - arg9;
        int var19 = arg7 - arg6;
        int var20 = arg8 - arg6;
        int var21;
        if (arg1 == arg2) {
            var21 = 0;
        } else {
            var21 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var22;
        if (arg0 == arg1) {
            var22 = 0;
        } else {
            var22 = (var13 << 16) / var14;
        }
        int var23;
        if (arg0 == arg2) {
            var23 = 0;
        } else {
            var23 = (var15 << 16) / var16;
        }
        int var24 = var13 * var16 - var14 * var15;
        if (var24 == 0) {
            return;
        }
        int var25 = (var16 * var17 - var14 * var18 << 8) / var24;
        int var26 = (var13 * var18 - var15 * var17 << 8) / var24;
        int var27 = (var16 * var19 - var14 * var20 << 8) / var24;
        int var28 = (var13 * var20 - var15 * var19 << 8) / var24;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field6561) {
                if (arg1 > this.field6561) {
                    arg1 = this.field6561;
                }
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                int var29 = (arg9 << 8) + var25 - arg3 * var25;
                int var30 = (arg6 << 8) + var27 - arg3 * var27;
                if (arg1 < arg2) {
                    int var31;
                    int var32 = var31 = arg3 << 16;
                    if (arg0 < 0) {
                        var32 -= arg0 * var23;
                        var31 -= arg0 * var22;
                        var29 -= arg0 * var26;
                        var30 -= arg0 * var28;
                        arg0 = 0;
                    }
                    int var33 = arg4 << 16;
                    if (arg1 < 0) {
                        var33 -= arg1 * var21;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var23 < var22 || arg0 == arg1 && var23 > var21) {
                        int var34 = arg2 - arg1;
                        int var35 = arg1 - arg0;
                        int var36 = this.field6553[arg0];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var36, 0, 0, var32 >> 16, var33 >> 16, var29, var25, var30, var27);
                                    var32 += var23;
                                    var33 += var21;
                                    var29 += var26;
                                    var30 += var28;
                                    var36 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var36, 0, 0, var32 >> 16, var31 >> 16, var29, var25, var30, var27);
                            var32 += var23;
                            var31 += var22;
                            var29 += var26;
                            var30 += var28;
                            var36 += this.field6554;
                        }
                    } else {
                        int var37 = arg2 - arg1;
                        int var38 = arg1 - arg0;
                        int var39 = this.field6553[arg0];
                        while (true) {
                            var38--;
                            if (var38 < 0) {
                                while (true) {
                                    var37--;
                                    if (var37 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var39, 0, 0, var33 >> 16, var32 >> 16, var29, var25, var30, var27);
                                    var32 += var23;
                                    var33 += var21;
                                    var29 += var26;
                                    var30 += var28;
                                    var39 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var39, 0, 0, var31 >> 16, var32 >> 16, var29, var25, var30, var27);
                            var32 += var23;
                            var31 += var22;
                            var29 += var26;
                            var30 += var28;
                            var39 += this.field6554;
                        }
                    }
                } else {
                    int var40;
                    int var41 = var40 = arg3 << 16;
                    if (arg0 < 0) {
                        var41 -= arg0 * var23;
                        var40 -= arg0 * var22;
                        var29 -= arg0 * var26;
                        var30 -= arg0 * var28;
                        arg0 = 0;
                    }
                    int var42 = arg5 << 16;
                    if (arg2 < 0) {
                        var42 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var23 < var22 || arg0 == arg2 && var21 > var22) {
                        int var43 = arg1 - arg2;
                        int var44 = arg2 - arg0;
                        int var45 = this.field6553[arg0];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var45, 0, 0, var42 >> 16, var40 >> 16, var29, var25, var30, var27);
                                    var42 += var21;
                                    var40 += var22;
                                    var29 += var26;
                                    var30 += var28;
                                    var45 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var45, 0, 0, var41 >> 16, var40 >> 16, var29, var25, var30, var27);
                            var41 += var23;
                            var40 += var22;
                            var29 += var26;
                            var30 += var28;
                            var45 += this.field6554;
                        }
                    } else {
                        int var46 = arg1 - arg2;
                        int var47 = arg2 - arg0;
                        int var48 = this.field6553[arg0];
                        while (true) {
                            var47--;
                            if (var47 < 0) {
                                while (true) {
                                    var46--;
                                    if (var46 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var48, 0, 0, var40 >> 16, var42 >> 16, var29, var25, var30, var27);
                                    var42 += var21;
                                    var40 += var22;
                                    var29 += var26;
                                    var30 += var28;
                                    var48 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var48, 0, 0, var40 >> 16, var41 >> 16, var29, var25, var30, var27);
                            var41 += var23;
                            var40 += var22;
                            var29 += var26;
                            var30 += var28;
                            var48 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field6561) {
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                if (arg0 > this.field6561) {
                    arg0 = this.field6561;
                }
                int var49 = (arg10 << 8) + var25 - arg4 * var25;
                int var50 = (arg7 << 8) + var27 - arg4 * var27;
                if (arg2 < arg0) {
                    int var51;
                    int var52 = var51 = arg4 << 16;
                    if (arg1 < 0) {
                        var52 -= arg1 * var22;
                        var51 -= arg1 * var21;
                        var49 -= arg1 * var26;
                        var50 -= arg1 * var28;
                        arg1 = 0;
                    }
                    int var53 = arg5 << 16;
                    if (arg2 < 0) {
                        var53 -= arg2 * var23;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var22 < var21 || arg1 == arg2 && var22 > var23) {
                        int var54 = arg0 - arg2;
                        int var55 = arg2 - arg1;
                        int var56 = this.field6553[arg1];
                        while (true) {
                            var55--;
                            if (var55 < 0) {
                                while (true) {
                                    var54--;
                                    if (var54 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var56, 0, 0, var52 >> 16, var53 >> 16, var49, var25, var50, var27);
                                    var52 += var22;
                                    var53 += var23;
                                    var49 += var26;
                                    var50 += var28;
                                    var56 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var56, 0, 0, var52 >> 16, var51 >> 16, var49, var25, var50, var27);
                            var52 += var22;
                            var51 += var21;
                            var49 += var26;
                            var50 += var28;
                            var56 += this.field6554;
                        }
                    } else {
                        int var57 = arg0 - arg2;
                        int var58 = arg2 - arg1;
                        int var59 = this.field6553[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var59, 0, 0, var53 >> 16, var52 >> 16, var49, var25, var50, var27);
                                    var52 += var22;
                                    var53 += var23;
                                    var49 += var26;
                                    var50 += var28;
                                    var59 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var59, 0, 0, var51 >> 16, var52 >> 16, var49, var25, var50, var27);
                            var52 += var22;
                            var51 += var21;
                            var49 += var26;
                            var50 += var28;
                            var59 += this.field6554;
                        }
                    }
                } else {
                    int var60;
                    int var61 = var60 = arg4 << 16;
                    if (arg1 < 0) {
                        var61 -= arg1 * var22;
                        var60 -= arg1 * var21;
                        var49 -= arg1 * var26;
                        var50 -= arg1 * var28;
                        arg1 = 0;
                    }
                    int var62 = arg3 << 16;
                    if (arg0 < 0) {
                        var62 -= arg0 * var23;
                        arg0 = 0;
                    }
                    if (var22 < var21) {
                        int var63 = arg2 - arg0;
                        int var64 = arg0 - arg1;
                        int var65 = this.field6553[arg1];
                        while (true) {
                            var64--;
                            if (var64 < 0) {
                                while (true) {
                                    var63--;
                                    if (var63 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var65, 0, 0, var62 >> 16, var60 >> 16, var49, var25, var50, var27);
                                    var62 += var23;
                                    var60 += var21;
                                    var49 += var26;
                                    var50 += var28;
                                    var65 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var65, 0, 0, var61 >> 16, var60 >> 16, var49, var25, var50, var27);
                            var61 += var22;
                            var60 += var21;
                            var49 += var26;
                            var50 += var28;
                            var65 += this.field6554;
                        }
                    } else {
                        int var66 = arg2 - arg0;
                        int var67 = arg0 - arg1;
                        int var68 = this.field6553[arg1];
                        while (true) {
                            var67--;
                            if (var67 < 0) {
                                while (true) {
                                    var66--;
                                    if (var66 < 0) {
                                        return;
                                    }
                                    this.method2726(this.field6552, this.field6559, var68, 0, 0, var60 >> 16, var62 >> 16, var49, var25, var50, var27);
                                    var62 += var23;
                                    var60 += var21;
                                    var49 += var26;
                                    var50 += var28;
                                    var68 += this.field6554;
                                }
                            }
                            this.method2726(this.field6552, this.field6559, var68, 0, 0, var60 >> 16, var61 >> 16, var49, var25, var50, var27);
                            var61 += var22;
                            var60 += var21;
                            var49 += var26;
                            var50 += var28;
                            var68 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg2 < this.field6561) {
            if (arg0 > this.field6561) {
                arg0 = this.field6561;
            }
            if (arg1 > this.field6561) {
                arg1 = this.field6561;
            }
            int var69 = (arg11 << 8) + var25 - arg5 * var25;
            int var70 = (arg8 << 8) + var27 - arg5 * var27;
            if (arg0 < arg1) {
                int var71;
                int var72 = var71 = arg5 << 16;
                if (arg2 < 0) {
                    var72 -= arg2 * var21;
                    var71 -= arg2 * var23;
                    var69 -= arg2 * var26;
                    var70 -= arg2 * var28;
                    arg2 = 0;
                }
                int var73 = arg3 << 16;
                if (arg0 < 0) {
                    var73 -= arg0 * var22;
                    arg0 = 0;
                }
                if (var21 < var23) {
                    int var74 = arg1 - arg0;
                    int var75 = arg0 - arg2;
                    int var76 = this.field6553[arg2];
                    while (true) {
                        var75--;
                        if (var75 < 0) {
                            while (true) {
                                var74--;
                                if (var74 < 0) {
                                    return;
                                }
                                this.method2726(this.field6552, this.field6559, var76, 0, 0, var72 >> 16, var73 >> 16, var69, var25, var70, var27);
                                var72 += var21;
                                var73 += var22;
                                var69 += var26;
                                var70 += var28;
                                var76 += this.field6554;
                            }
                        }
                        this.method2726(this.field6552, this.field6559, var76, 0, 0, var72 >> 16, var71 >> 16, var69, var25, var70, var27);
                        var72 += var21;
                        var71 += var23;
                        var69 += var26;
                        var70 += var28;
                        var76 += this.field6554;
                    }
                } else {
                    int var77 = arg1 - arg0;
                    int var78 = arg0 - arg2;
                    int var79 = this.field6553[arg2];
                    while (true) {
                        var78--;
                        if (var78 < 0) {
                            while (true) {
                                var77--;
                                if (var77 < 0) {
                                    return;
                                }
                                this.method2726(this.field6552, this.field6559, var79, 0, 0, var73 >> 16, var72 >> 16, var69, var25, var70, var27);
                                var72 += var21;
                                var73 += var22;
                                var69 += var26;
                                var70 += var28;
                                var79 += this.field6554;
                            }
                        }
                        this.method2726(this.field6552, this.field6559, var79, 0, 0, var71 >> 16, var72 >> 16, var69, var25, var70, var27);
                        var72 += var21;
                        var71 += var23;
                        var69 += var26;
                        var70 += var28;
                        var79 += this.field6554;
                    }
                }
            } else {
                int var80;
                int var81 = var80 = arg5 << 16;
                if (arg2 < 0) {
                    var81 -= arg2 * var21;
                    var80 -= arg2 * var23;
                    var69 -= arg2 * var26;
                    var70 -= arg2 * var28;
                    arg2 = 0;
                }
                int var82 = arg4 << 16;
                if (arg1 < 0) {
                    var82 -= arg1 * var22;
                    arg1 = 0;
                }
                if (var21 < var23) {
                    int var83 = arg0 - arg1;
                    int var84 = arg1 - arg2;
                    int var85 = this.field6553[arg2];
                    while (true) {
                        var84--;
                        if (var84 < 0) {
                            while (true) {
                                var83--;
                                if (var83 < 0) {
                                    return;
                                }
                                this.method2726(this.field6552, this.field6559, var85, 0, 0, var82 >> 16, var80 >> 16, var69, var25, var70, var27);
                                var82 += var22;
                                var80 += var23;
                                var69 += var26;
                                var70 += var28;
                                var85 += this.field6554;
                            }
                        }
                        this.method2726(this.field6552, this.field6559, var85, 0, 0, var81 >> 16, var80 >> 16, var69, var25, var70, var27);
                        var81 += var21;
                        var80 += var23;
                        var69 += var26;
                        var70 += var28;
                        var85 += this.field6554;
                    }
                } else {
                    int var86 = arg0 - arg1;
                    int var87 = arg1 - arg2;
                    int var88 = this.field6553[arg2];
                    while (true) {
                        var87--;
                        if (var87 < 0) {
                            while (true) {
                                var86--;
                                if (var86 < 0) {
                                    return;
                                }
                                this.method2726(this.field6552, this.field6559, var88, 0, 0, var80 >> 16, var82 >> 16, var69, var25, var70, var27);
                                var82 += var22;
                                var80 += var23;
                                var69 += var26;
                                var70 += var28;
                                var88 += this.field6554;
                            }
                        }
                        this.method2726(this.field6552, this.field6559, var88, 0, 0, var80 >> 16, var81 >> 16, var69, var25, var70, var27);
                        var81 += var21;
                        var80 += var23;
                        var69 += var26;
                        var70 += var28;
                        var88 += this.field6554;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
    private final void method2730(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var21 = arg4 + arg5;
        int var22 = arg5 * arg10 + arg9;
        int var23 = arg5 * arg13 + arg12;
        int var24 = arg5 * arg8 + arg7;
        int var25 = arg6 - arg5;
        int var26 = arg10 << 3;
        int var27 = var22 >> 16;
        int var28 = 255 - var27;
        int var29 = ((arg11 & 0xFF00FF) * var27 & 0xFF00FF00 | (arg11 & 0xFF00) * var27 & 0xFF0000) >>> 8;
        int var30 = this.field6568;
        int var31 = 256 - this.field6568;
        int var10000;
        if (!this.field6560) {
            int var158 = arg5 - this.field6557;
            float var159 = arg17 / 8.0F * (float) var158 + arg14;
            float var160 = arg18 / 8.0F * (float) var158 + arg15;
            float var161 = arg19 / 8.0F * (float) var158 + arg16;
            int var162;
            int var163;
            if (var161 == 0.0F) {
                var162 = 0;
                var163 = 0;
            } else {
                var162 = (int) (var159 * 16384.0F / var161);
                var163 = (int) (var160 * 16384.0F / var161);
            }
            float var164 = arg17 + var159;
            float var165 = arg18 + var160;
            float var166 = arg19 + var161;
            int var167;
            int var168;
            if (var166 == 0.0F) {
                var167 = 0;
                var168 = 0;
            } else {
                var167 = (int) (var164 * 16384.0F / var166);
                var168 = (int) (var165 * 16384.0F / var166);
            }
            int var169 = (var162 << 18) + var163;
            int var170 = (var167 - var162 >> 3 << 18) + (var168 - var163 >> 3);
            int var171 = var25 >> 3;
            int var172 = arg13 << 3;
            int var173 = var23 >> 8;
            if (this.field6567) {
                if (var171 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var174 = arg1[(var169 >>> 25) + (var169 & 0x3F80)];
                            int var175 = arg0[var21];
                            int var176 = ((var174 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var174 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var177 = ((var175 & 0xFF00FF) * var30 + (var176 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var175 & 0xFF00) * var30 + (var176 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var177 & 0xFF00FF) * var28 & 0xFF00FF00 | (var177 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        int var178 = var169 + var170;
                        var21++;
                        int var179 = arg8 + var24;
                        if (var179 < this.field6559[var21]) {
                            int var180 = arg1[(var178 >>> 25) + (var178 & 0x3F80)];
                            int var181 = arg0[var21];
                            int var182 = ((var180 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var180 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var183 = ((var181 & 0xFF00FF) * var30 + (var182 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var181 & 0xFF00) * var30 + (var182 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var183 & 0xFF00FF) * var28 & 0xFF00FF00 | (var183 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var179;
                        }
                        int var184 = var170 + var178;
                        var21++;
                        int var185 = arg8 + var179;
                        if (var185 < this.field6559[var21]) {
                            int var186 = arg1[(var184 >>> 25) + (var184 & 0x3F80)];
                            int var187 = arg0[var21];
                            int var188 = ((var186 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var186 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var189 = ((var187 & 0xFF00FF) * var30 + (var188 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var187 & 0xFF00) * var30 + (var188 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var189 & 0xFF00FF) * var28 & 0xFF00FF00 | (var189 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var185;
                        }
                        int var190 = var170 + var184;
                        var21++;
                        int var191 = arg8 + var185;
                        if (var191 < this.field6559[var21]) {
                            int var192 = arg1[(var190 >>> 25) + (var190 & 0x3F80)];
                            int var193 = arg0[var21];
                            int var194 = ((var192 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var192 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var195 = ((var193 & 0xFF00FF) * var30 + (var194 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var193 & 0xFF00) * var30 + (var194 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var195 & 0xFF00FF) * var28 & 0xFF00FF00 | (var195 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var191;
                        }
                        int var196 = var170 + var190;
                        var21++;
                        int var197 = arg8 + var191;
                        if (var197 < this.field6559[var21]) {
                            int var198 = arg1[(var196 >>> 25) + (var196 & 0x3F80)];
                            int var199 = arg0[var21];
                            int var200 = ((var198 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var198 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var201 = ((var199 & 0xFF00FF) * var30 + (var200 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var199 & 0xFF00) * var30 + (var200 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var201 & 0xFF00FF) * var28 & 0xFF00FF00 | (var201 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var197;
                        }
                        int var202 = var170 + var196;
                        var21++;
                        int var203 = arg8 + var197;
                        if (var203 < this.field6559[var21]) {
                            int var204 = arg1[(var202 >>> 25) + (var202 & 0x3F80)];
                            int var205 = arg0[var21];
                            int var206 = ((var204 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var204 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var207 = ((var205 & 0xFF00FF) * var30 + (var206 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var205 & 0xFF00) * var30 + (var206 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var207 & 0xFF00FF) * var28 & 0xFF00FF00 | (var207 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var203;
                        }
                        int var208 = var170 + var202;
                        var21++;
                        int var209 = arg8 + var203;
                        if (var209 < this.field6559[var21]) {
                            int var210 = arg1[(var208 >>> 25) + (var208 & 0x3F80)];
                            int var211 = arg0[var21];
                            int var212 = ((var210 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var210 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var213 = ((var211 & 0xFF00FF) * var30 + (var212 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var211 & 0xFF00) * var30 + (var212 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var213 & 0xFF00FF) * var28 & 0xFF00FF00 | (var213 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var209;
                        }
                        int var214 = var170 + var208;
                        var21++;
                        int var215 = arg8 + var209;
                        if (var215 < this.field6559[var21]) {
                            int var216 = arg1[(var214 >>> 25) + (var214 & 0x3F80)];
                            int var217 = arg0[var21];
                            int var218 = ((var216 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var216 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var219 = ((var217 & 0xFF00FF) * var30 + (var218 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var217 & 0xFF00) * var30 + (var218 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var219 & 0xFF00FF) * var28 & 0xFF00FF00 | (var219 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var215;
                        }
                        var10000 = var170 + var214;
                        var21++;
                        var24 = arg8 + var215;
                        int var221 = var167;
                        int var222 = var168;
                        var164 += arg17;
                        var165 += arg18;
                        var166 += arg19;
                        if (var166 == 0.0F) {
                            var167 = 0;
                            var168 = 0;
                        } else {
                            var167 = (int) (var164 * 16384.0F / var166);
                            var168 = (int) (var165 * 16384.0F / var166);
                        }
                        var169 = (var221 << 18) + var222;
                        var170 = (var167 - var221 >> 3 << 18) + (var168 - var222 >> 3);
                        var23 += var172;
                        var173 = var23 >> 8;
                        var22 += var26;
                        int var223 = var22 >> 16;
                        var28 = 255 - var223;
                        var29 = ((arg11 & 0xFF00FF) * var223 & 0xFF00FF00 | (arg11 & 0xFF00) * var223 & 0xFF0000) >>> 8;
                        var171--;
                    } while (var171 > 0);
                }
                int var224 = arg6 - arg5 & 0x7;
                if (var224 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var225 = arg1[(var169 >>> 25) + (var169 & 0x3F80)];
                            int var226 = arg0[var21];
                            int var227 = ((var225 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var225 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var228 = ((var226 & 0xFF00FF) * var30 + (var227 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var226 & 0xFF00) * var30 + (var227 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var228 & 0xFF00FF) * var28 & 0xFF00FF00 | (var228 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var169 += var170;
                        var21++;
                        var24 += arg8;
                        var224--;
                    } while (var224 > 0);
                    return;
                }
            } else {
                if (var171 > 0) {
                    do {
                        int var229;
                        if (var24 < this.field6559[var21] && (var229 = arg1[(var169 >>> 25) + (var169 & 0x3F80)]) != 0) {
                            int var230 = arg0[var21];
                            int var231 = ((var229 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var229 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var232 = ((var230 & 0xFF00FF) * var30 + (var231 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var230 & 0xFF00) * var30 + (var231 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var232 & 0xFF00FF) * var28 & 0xFF00FF00 | (var232 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var21++;
                        int var233 = var169 + var170;
                        int var234 = arg8 + var24;
                        int var235;
                        if (var234 < this.field6559[var21] && (var235 = arg1[(var233 >>> 25) + (var233 & 0x3F80)]) != 0) {
                            int var236 = arg0[var21];
                            int var237 = ((var235 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var235 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var238 = ((var236 & 0xFF00FF) * var30 + (var237 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var236 & 0xFF00) * var30 + (var237 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var238 & 0xFF00FF) * var28 & 0xFF00FF00 | (var238 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var234;
                        }
                        var21++;
                        int var239 = var170 + var233;
                        int var240 = arg8 + var234;
                        int var241;
                        if (var240 < this.field6559[var21] && (var241 = arg1[(var239 >>> 25) + (var239 & 0x3F80)]) != 0) {
                            int var242 = arg0[var21];
                            int var243 = ((var241 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var241 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var244 = ((var242 & 0xFF00FF) * var30 + (var243 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var242 & 0xFF00) * var30 + (var243 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var244 & 0xFF00FF) * var28 & 0xFF00FF00 | (var244 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var240;
                        }
                        var21++;
                        int var245 = var170 + var239;
                        int var246 = arg8 + var240;
                        int var247;
                        if (var246 < this.field6559[var21] && (var247 = arg1[(var245 >>> 25) + (var245 & 0x3F80)]) != 0) {
                            int var248 = arg0[var21];
                            int var249 = ((var247 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var247 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var250 = ((var248 & 0xFF00FF) * var30 + (var249 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var248 & 0xFF00) * var30 + (var249 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var250 & 0xFF00FF) * var28 & 0xFF00FF00 | (var250 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var246;
                        }
                        var21++;
                        int var251 = var170 + var245;
                        int var252 = arg8 + var246;
                        int var253;
                        if (var252 < this.field6559[var21] && (var253 = arg1[(var251 >>> 25) + (var251 & 0x3F80)]) != 0) {
                            int var254 = arg0[var21];
                            int var255 = ((var253 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var253 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var256 = ((var254 & 0xFF00FF) * var30 + (var255 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var254 & 0xFF00) * var30 + (var255 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var256 & 0xFF00FF) * var28 & 0xFF00FF00 | (var256 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var252;
                        }
                        var21++;
                        int var257 = var170 + var251;
                        int var258 = arg8 + var252;
                        int var259;
                        if (var258 < this.field6559[var21] && (var259 = arg1[(var257 >>> 25) + (var257 & 0x3F80)]) != 0) {
                            int var260 = arg0[var21];
                            int var261 = ((var259 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var259 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var262 = ((var260 & 0xFF00FF) * var30 + (var261 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var260 & 0xFF00) * var30 + (var261 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var262 & 0xFF00FF) * var28 & 0xFF00FF00 | (var262 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var258;
                        }
                        var21++;
                        int var263 = var170 + var257;
                        int var264 = arg8 + var258;
                        int var265;
                        if (var264 < this.field6559[var21] && (var265 = arg1[(var263 >>> 25) + (var263 & 0x3F80)]) != 0) {
                            int var266 = arg0[var21];
                            int var267 = ((var265 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var265 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var268 = ((var266 & 0xFF00FF) * var30 + (var267 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var266 & 0xFF00) * var30 + (var267 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var268 & 0xFF00FF) * var28 & 0xFF00FF00 | (var268 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var264;
                        }
                        var21++;
                        int var269 = var170 + var263;
                        int var270 = arg8 + var264;
                        int var271;
                        if (var270 < this.field6559[var21] && (var271 = arg1[(var269 >>> 25) + (var269 & 0x3F80)]) != 0) {
                            int var272 = arg0[var21];
                            int var273 = ((var271 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var271 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var274 = ((var272 & 0xFF00FF) * var30 + (var273 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var272 & 0xFF00) * var30 + (var273 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var274 & 0xFF00FF) * var28 & 0xFF00FF00 | (var274 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var270;
                        }
                        var21++;
                        var10000 = var170 + var269;
                        var24 = arg8 + var270;
                        int var276 = var167;
                        int var277 = var168;
                        var164 += arg17;
                        var165 += arg18;
                        var166 += arg19;
                        if (var166 == 0.0F) {
                            var167 = 0;
                            var168 = 0;
                        } else {
                            var167 = (int) (var164 * 16384.0F / var166);
                            var168 = (int) (var165 * 16384.0F / var166);
                        }
                        var169 = (var276 << 18) + var277;
                        var170 = (var167 - var276 >> 3 << 18) + (var168 - var277 >> 3);
                        var23 += var172;
                        var173 = var23 >> 8;
                        var22 += var26;
                        int var278 = var22 >> 16;
                        var28 = 255 - var278;
                        var29 = ((arg11 & 0xFF00FF) * var278 & 0xFF00FF00 | (arg11 & 0xFF00) * var278 & 0xFF0000) >>> 8;
                        var171--;
                    } while (var171 > 0);
                }
                int var279 = arg6 - arg5 & 0x7;
                if (var279 > 0) {
                    do {
                        int var280;
                        if (var24 < this.field6559[var21] && (var280 = arg1[(var169 >>> 25) + (var169 & 0x3F80)]) != 0) {
                            int var281 = arg0[var21];
                            int var282 = ((var280 & 0xFF00FF) * var173 & 0xFF00FF00) + ((var280 & 0xFF00) * var173 & 0xFF0000) >> 8;
                            int var283 = ((var281 & 0xFF00FF) * var30 + (var282 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var281 & 0xFF00) * var30 + (var282 & 0xFF00) * var31 & 0xFF0000) >> 8;
                            arg0[var21] = (((var283 & 0xFF00FF) * var28 & 0xFF00FF00 | (var283 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var21++;
                        var169 += var170;
                        var24 += arg8;
                        var279--;
                    } while (var279 > 0);
                }
            }
            return;
        }
        int var32 = arg5 - this.field6557;
        float var33 = arg17 / 8.0F * (float) var32 + arg14;
        float var34 = arg18 / 8.0F * (float) var32 + arg15;
        float var35 = arg19 / 8.0F * (float) var32 + arg16;
        int var36;
        int var37;
        if (var35 == 0.0F) {
            var36 = 0;
            var37 = 0;
        } else {
            var36 = (int) (var33 * 4096.0F / var35);
            var37 = (int) (var34 * 4096.0F / var35);
        }
        float var38 = arg17 + var33;
        float var39 = arg18 + var34;
        float var40 = arg19 + var35;
        int var41;
        int var42;
        if (var40 == 0.0F) {
            var41 = 0;
            var42 = 0;
        } else {
            var41 = (int) (var38 * 4096.0F / var40);
            var42 = (int) (var39 * 4096.0F / var40);
        }
        int var43 = (var36 << 20) + var37;
        int var44 = (var41 - var36 >> 3 << 20) + (var42 - var37 >> 3);
        int var45 = var25 >> 3;
        int var46 = arg13 << 3;
        int var47 = var23 >> 8;
        if (this.field6567) {
            if (var45 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var48 = arg0[var21];
                        int var49 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                        int var50 = ((var49 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var49 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var51 = ((var48 & 0xFF00FF) * var30 + (var50 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var48 & 0xFF00) * var30 + (var50 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var51 & 0xFF00FF) * var28 & 0xFF00FF00 | (var51 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    int var52 = var43 + var44;
                    var21++;
                    int var53 = arg8 + var24;
                    if (var53 < this.field6559[var21]) {
                        int var54 = arg0[var21];
                        int var55 = arg1[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var56 = ((var55 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var55 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var57 = ((var54 & 0xFF00FF) * var30 + (var56 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var54 & 0xFF00) * var30 + (var56 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var57 & 0xFF00FF) * var28 & 0xFF00FF00 | (var57 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var53;
                    }
                    int var58 = var44 + var52;
                    var21++;
                    int var59 = arg8 + var53;
                    if (var59 < this.field6559[var21]) {
                        int var60 = arg0[var21];
                        int var61 = arg1[(var58 >>> 26) + (var58 & 0xFC0)];
                        int var62 = ((var61 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var61 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var63 = ((var60 & 0xFF00FF) * var30 + (var62 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var60 & 0xFF00) * var30 + (var62 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var63 & 0xFF00FF) * var28 & 0xFF00FF00 | (var63 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var59;
                    }
                    int var64 = var44 + var58;
                    var21++;
                    int var65 = arg8 + var59;
                    if (var65 < this.field6559[var21]) {
                        int var66 = arg0[var21];
                        int var67 = arg1[(var64 >>> 26) + (var64 & 0xFC0)];
                        int var68 = ((var67 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var67 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var69 = ((var66 & 0xFF00FF) * var30 + (var68 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var66 & 0xFF00) * var30 + (var68 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var69 & 0xFF00FF) * var28 & 0xFF00FF00 | (var69 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var65;
                    }
                    int var70 = var44 + var64;
                    var21++;
                    int var71 = arg8 + var65;
                    if (var71 < this.field6559[var21]) {
                        int var72 = arg0[var21];
                        int var73 = arg1[(var70 >>> 26) + (var70 & 0xFC0)];
                        int var74 = ((var73 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var73 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var75 = ((var72 & 0xFF00FF) * var30 + (var74 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var72 & 0xFF00) * var30 + (var74 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var75 & 0xFF00FF) * var28 & 0xFF00FF00 | (var75 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var71;
                    }
                    int var76 = var44 + var70;
                    var21++;
                    int var77 = arg8 + var71;
                    if (var77 < this.field6559[var21]) {
                        int var78 = arg0[var21];
                        int var79 = arg1[(var76 >>> 26) + (var76 & 0xFC0)];
                        int var80 = ((var79 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var79 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var81 = ((var78 & 0xFF00FF) * var30 + (var80 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var78 & 0xFF00) * var30 + (var80 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var81 & 0xFF00FF) * var28 & 0xFF00FF00 | (var81 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var77;
                    }
                    int var82 = var44 + var76;
                    var21++;
                    int var83 = arg8 + var77;
                    if (var83 < this.field6559[var21]) {
                        int var84 = arg0[var21];
                        int var85 = arg1[(var82 >>> 26) + (var82 & 0xFC0)];
                        int var86 = ((var85 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var85 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var87 = ((var84 & 0xFF00FF) * var30 + (var86 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var84 & 0xFF00) * var30 + (var86 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var87 & 0xFF00FF) * var28 & 0xFF00FF00 | (var87 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var83;
                    }
                    int var88 = var44 + var82;
                    var21++;
                    int var89 = arg8 + var83;
                    if (var89 < this.field6559[var21]) {
                        int var90 = arg0[var21];
                        int var91 = arg1[(var88 >>> 26) + (var88 & 0xFC0)];
                        int var92 = ((var91 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var91 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var93 = ((var90 & 0xFF00FF) * var30 + (var92 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var90 & 0xFF00) * var30 + (var92 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var93 & 0xFF00FF) * var28 & 0xFF00FF00 | (var93 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var89;
                    }
                    var10000 = var44 + var88;
                    var21++;
                    var24 = arg8 + var89;
                    int var95 = var41;
                    int var96 = var42;
                    var38 += arg17;
                    var39 += arg18;
                    var40 += arg19;
                    if (var40 == 0.0F) {
                        var41 = 0;
                        var42 = 0;
                    } else {
                        var41 = (int) (var38 * 4096.0F / var40);
                        var42 = (int) (var39 * 4096.0F / var40);
                    }
                    var43 = (var95 << 20) + var96;
                    var44 = (var41 - var95 >> 3 << 20) + (var42 - var96 >> 3);
                    var23 += var46;
                    var47 = var23 >> 8;
                    var22 += var26;
                    int var97 = var22 >> 16;
                    var28 = 255 - var97;
                    var29 = ((arg11 & 0xFF00FF) * var97 & 0xFF00FF00 | (arg11 & 0xFF00) * var97 & 0xFF0000) >>> 8;
                    var45--;
                } while (var45 > 0);
            }
            int var98 = arg6 - arg5 & 0x7;
            if (var98 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var99 = arg0[var21];
                        int var100 = arg1[(var43 >>> 26) + (var43 & 0xFC0)];
                        int var101 = ((var100 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var100 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var102 = ((var99 & 0xFF00FF) * var30 + (var101 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var99 & 0xFF00) * var30 + (var101 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var102 & 0xFF00FF) * var28 & 0xFF00FF00 | (var102 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    var43 += var44;
                    var21++;
                    var24 += arg8;
                    var98--;
                } while (var98 > 0);
                return;
            }
        } else {
            if (var45 > 0) {
                do {
                    int var103;
                    if (var24 < this.field6559[var21] && (var103 = arg1[(var43 >>> 26) + (var43 & 0xFC0)]) != 0) {
                        int var104 = arg0[var21];
                        int var105 = ((var103 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var103 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var106 = ((var104 & 0xFF00FF) * var30 + (var105 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var104 & 0xFF00) * var30 + (var105 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var106 & 0xFF00FF) * var28 & 0xFF00FF00 | (var106 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    var21++;
                    int var107 = var43 + var44;
                    int var108 = arg8 + var24;
                    int var109;
                    if (var108 < this.field6559[var21] && (var109 = arg1[(var107 >>> 26) + (var107 & 0xFC0)]) != 0) {
                        int var110 = arg0[var21];
                        int var111 = ((var109 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var109 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var112 = ((var110 & 0xFF00FF) * var30 + (var111 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var110 & 0xFF00) * var30 + (var111 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var112 & 0xFF00FF) * var28 & 0xFF00FF00 | (var112 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var108;
                    }
                    var21++;
                    int var113 = var44 + var107;
                    int var114 = arg8 + var108;
                    int var115;
                    if (var114 < this.field6559[var21] && (var115 = arg1[(var113 >>> 26) + (var113 & 0xFC0)]) != 0) {
                        int var116 = arg0[var21];
                        int var117 = ((var115 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var115 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var118 = ((var116 & 0xFF00FF) * var30 + (var117 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var116 & 0xFF00) * var30 + (var117 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var118 & 0xFF00FF) * var28 & 0xFF00FF00 | (var118 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var114;
                    }
                    var21++;
                    int var119 = var44 + var113;
                    int var120 = arg8 + var114;
                    int var121;
                    if (var120 < this.field6559[var21] && (var121 = arg1[(var119 >>> 26) + (var119 & 0xFC0)]) != 0) {
                        int var122 = arg0[var21];
                        int var123 = ((var121 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var121 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var124 = ((var122 & 0xFF00FF) * var30 + (var123 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var122 & 0xFF00) * var30 + (var123 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var124 & 0xFF00FF) * var28 & 0xFF00FF00 | (var124 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var120;
                    }
                    var21++;
                    int var125 = var44 + var119;
                    int var126 = arg8 + var120;
                    int var127;
                    if (var126 < this.field6559[var21] && (var127 = arg1[(var125 >>> 26) + (var125 & 0xFC0)]) != 0) {
                        int var128 = arg0[var21];
                        int var129 = ((var127 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var127 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var130 = ((var128 & 0xFF00FF) * var30 + (var129 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var128 & 0xFF00) * var30 + (var129 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var130 & 0xFF00FF) * var28 & 0xFF00FF00 | (var130 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var126;
                    }
                    var21++;
                    int var131 = var44 + var125;
                    int var132 = arg8 + var126;
                    int var133;
                    if (var132 < this.field6559[var21] && (var133 = arg1[(var131 >>> 26) + (var131 & 0xFC0)]) != 0) {
                        int var134 = arg0[var21];
                        int var135 = ((var133 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var133 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var136 = ((var134 & 0xFF00FF) * var30 + (var135 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var134 & 0xFF00) * var30 + (var135 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var136 & 0xFF00FF) * var28 & 0xFF00FF00 | (var136 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var132;
                    }
                    var21++;
                    int var137 = var44 + var131;
                    int var138 = arg8 + var132;
                    int var139;
                    if (var138 < this.field6559[var21] && (var139 = arg1[(var137 >>> 26) + (var137 & 0xFC0)]) != 0) {
                        int var140 = arg0[var21];
                        int var141 = ((var139 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var139 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var142 = ((var140 & 0xFF00FF) * var30 + (var141 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var140 & 0xFF00) * var30 + (var141 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var142 & 0xFF00FF) * var28 & 0xFF00FF00 | (var142 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var138;
                    }
                    var21++;
                    int var143 = var44 + var137;
                    int var144 = arg8 + var138;
                    int var145;
                    if (var144 < this.field6559[var21] && (var145 = arg1[(var143 >>> 26) + (var143 & 0xFC0)]) != 0) {
                        int var146 = arg0[var21];
                        int var147 = ((var145 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var145 & 0xFF00) * var47 & 0xFF0000) >> 8;
                        int var148 = ((var146 & 0xFF00FF) * var30 + (var147 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var146 & 0xFF00) * var30 + (var147 & 0xFF00) * var31 & 0xFF0000) >> 8;
                        arg0[var21] = (((var148 & 0xFF00FF) * var28 & 0xFF00FF00 | (var148 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var144;
                    }
                    var21++;
                    var10000 = var44 + var143;
                    var24 = arg8 + var144;
                    int var150 = var41;
                    int var151 = var42;
                    var38 += arg17;
                    var39 += arg18;
                    var40 += arg19;
                    if (var40 == 0.0F) {
                        var41 = 0;
                        var42 = 0;
                    } else {
                        var41 = (int) (var38 * 4096.0F / var40);
                        var42 = (int) (var39 * 4096.0F / var40);
                    }
                    var43 = (var150 << 20) + var151;
                    var44 = (var41 - var150 >> 3 << 20) + (var42 - var151 >> 3);
                    var23 += var46;
                    var47 = var23 >> 8;
                    var22 += var26;
                    int var152 = var22 >> 16;
                    var28 = 255 - var152;
                    var29 = ((arg11 & 0xFF00FF) * var152 & 0xFF00FF00 | (arg11 & 0xFF00) * var152 & 0xFF0000) >>> 8;
                    var45--;
                } while (var45 > 0);
            }
            int var153 = arg6 - arg5 & 0x7;
            if (var153 <= 0) {
                return;
            }
            do {
                int var154;
                if (var24 < this.field6559[var21] && (var154 = arg1[(var43 >>> 26) + (var43 & 0xFC0)]) != 0) {
                    int var155 = arg0[var21];
                    int var156 = ((var154 & 0xFF00FF) * var47 & 0xFF00FF00) + ((var154 & 0xFF00) * var47 & 0xFF0000) >> 8;
                    int var157 = ((var155 & 0xFF00FF) * var30 + (var156 & 0xFF00FF) * var31 & 0xFF00FF00) + ((var155 & 0xFF00) * var30 + (var156 & 0xFF00) * var31 & 0xFF0000) >> 8;
                    arg0[var21] = (((var157 & 0xFF00FF) * var28 & 0xFF00FF00 | (var157 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    this.field6559[var21] = var24;
                }
                var21++;
                var43 += var44;
                var24 += arg8;
                var153--;
            } while (var153 > 0);
        }
        return;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
    private final void method2731(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        int var19 = arg7 - arg6;
        int var10000;
        if (!this.field6560) {
            int var90 = arg6 - this.field6557;
            float var91 = arg15 / 8.0F * (float) var90 + arg12;
            float var92 = arg16 / 8.0F * (float) var90 + arg13;
            float var93 = arg17 / 8.0F * (float) var90 + arg14;
            int var94;
            int var95;
            if (var93 == 0.0F) {
                var94 = 0;
                var95 = 0;
            } else {
                var94 = (int) (var91 * 16384.0F / var93);
                var95 = (int) (var92 * 16384.0F / var93);
            }
            float var96 = arg15 + var91;
            float var97 = arg16 + var92;
            float var98 = arg17 + var93;
            int var99;
            int var100;
            if (var98 == 0.0F) {
                var99 = 0;
                var100 = 0;
            } else {
                var99 = (int) (var96 * 16384.0F / var98);
                var100 = (int) (var97 * 16384.0F / var98);
            }
            int var101 = (var94 << 18) + var95;
            int var102 = (var99 - var94 >> 3 << 18) + (var100 - var95 >> 3);
            int var103 = var19 >> 3;
            int var104 = arg11 << 3;
            int var105 = arg10 >> 8;
            if (this.field6567) {
                if (var103 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var106 = arg2[(var101 >>> 25) + (var101 & 0x3F80)];
                            arg0[arg5] = ((var106 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var106 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var107 = arg8 + arg9;
                        int var108 = var101 + var102;
                        arg5++;
                        if (var107 < arg1[arg5]) {
                            int var109 = arg2[(var108 >>> 25) + (var108 & 0x3F80)];
                            arg0[arg5] = ((var109 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var109 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var110 = arg9 + var107;
                        int var111 = var102 + var108;
                        arg5++;
                        if (var110 < arg1[arg5]) {
                            int var112 = arg2[(var111 >>> 25) + (var111 & 0x3F80)];
                            arg0[arg5] = ((var112 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var112 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var113 = arg9 + var110;
                        int var114 = var102 + var111;
                        arg5++;
                        if (var113 < arg1[arg5]) {
                            int var115 = arg2[(var114 >>> 25) + (var114 & 0x3F80)];
                            arg0[arg5] = ((var115 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var115 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var116 = arg9 + var113;
                        int var117 = var102 + var114;
                        arg5++;
                        if (var116 < arg1[arg5]) {
                            int var118 = arg2[(var117 >>> 25) + (var117 & 0x3F80)];
                            arg0[arg5] = ((var118 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var118 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var119 = arg9 + var116;
                        int var120 = var102 + var117;
                        arg5++;
                        if (var119 < arg1[arg5]) {
                            int var121 = arg2[(var120 >>> 25) + (var120 & 0x3F80)];
                            arg0[arg5] = ((var121 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var121 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var122 = arg9 + var119;
                        int var123 = var102 + var120;
                        arg5++;
                        if (var122 < arg1[arg5]) {
                            int var124 = arg2[(var123 >>> 25) + (var123 & 0x3F80)];
                            arg0[arg5] = ((var124 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var124 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var125 = arg9 + var122;
                        int var126 = var102 + var123;
                        arg5++;
                        if (var125 < arg1[arg5]) {
                            int var127 = arg2[(var126 >>> 25) + (var126 & 0x3F80)];
                            arg0[arg5] = ((var127 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var127 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        arg8 = arg9 + var125;
                        var10000 = var102 + var126;
                        arg5++;
                        int var129 = var99;
                        int var130 = var100;
                        var96 += arg15;
                        var97 += arg16;
                        var98 += arg17;
                        if (var98 == 0.0F) {
                            var99 = 0;
                            var100 = 0;
                        } else {
                            var99 = (int) (var96 * 16384.0F / var98);
                            var100 = (int) (var97 * 16384.0F / var98);
                        }
                        var101 = (var129 << 18) + var130;
                        var102 = (var99 - var129 >> 3 << 18) + (var100 - var130 >> 3);
                        arg10 += var104;
                        var105 = arg10 >> 8;
                        var103--;
                    } while (var103 > 0);
                }
                int var131 = arg7 - arg6 & 0x7;
                if (var131 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var132 = arg2[(var101 >>> 25) + (var101 & 0x3F80)];
                            arg0[arg5] = ((var132 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var132 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        arg8 += arg9;
                        var101 += var102;
                        arg5++;
                        var131--;
                    } while (var131 > 0);
                    return;
                }
            } else {
                if (var103 > 0) {
                    do {
                        int var133;
                        if (arg8 < arg1[arg5] && (var133 = arg2[(var101 >>> 25) + (var101 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var133 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var133 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var134 = arg8 + arg9;
                        int var135 = var101 + var102;
                        arg5++;
                        int var136;
                        if (var134 < arg1[arg5] && (var136 = arg2[(var135 >>> 25) + (var135 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var136 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var136 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var137 = arg9 + var134;
                        int var138 = var102 + var135;
                        arg5++;
                        int var139;
                        if (var137 < arg1[arg5] && (var139 = arg2[(var138 >>> 25) + (var138 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var139 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var139 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var140 = arg9 + var137;
                        int var141 = var102 + var138;
                        arg5++;
                        int var142;
                        if (var140 < arg1[arg5] && (var142 = arg2[(var141 >>> 25) + (var141 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var142 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var142 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var143 = arg9 + var140;
                        int var144 = var102 + var141;
                        arg5++;
                        int var145;
                        if (var143 < arg1[arg5] && (var145 = arg2[(var144 >>> 25) + (var144 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var145 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var145 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var146 = arg9 + var143;
                        int var147 = var102 + var144;
                        arg5++;
                        int var148;
                        if (var146 < arg1[arg5] && (var148 = arg2[(var147 >>> 25) + (var147 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var148 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var148 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var149 = arg9 + var146;
                        int var150 = var102 + var147;
                        arg5++;
                        int var151;
                        if (var149 < arg1[arg5] && (var151 = arg2[(var150 >>> 25) + (var150 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var151 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var151 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        int var152 = arg9 + var149;
                        int var153 = var102 + var150;
                        arg5++;
                        int var154;
                        if (var152 < arg1[arg5] && (var154 = arg2[(var153 >>> 25) + (var153 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var154 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var154 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        arg8 = arg9 + var152;
                        var10000 = var102 + var153;
                        arg5++;
                        int var156 = var99;
                        int var157 = var100;
                        var96 += arg15;
                        var97 += arg16;
                        var98 += arg17;
                        if (var98 == 0.0F) {
                            var99 = 0;
                            var100 = 0;
                        } else {
                            var99 = (int) (var96 / var98 * 16384.0F);
                            var100 = (int) (var97 / var98 * 16384.0F);
                        }
                        var101 = (var156 << 18) + var157;
                        var102 = (var99 - var156 >> 3 << 18) + (var100 - var157 >> 3);
                        arg10 += var104;
                        var105 = arg10 >> 8;
                        var103--;
                    } while (var103 > 0);
                }
                int var158 = arg7 - arg6 & 0x7;
                if (var158 > 0) {
                    do {
                        int var159;
                        if (arg8 < arg1[arg5] && (var159 = arg2[(var101 >>> 25) + (var101 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var159 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var159 & 0xFF00) * var105 & 0xFF0000) >> 8;
                        }
                        arg8 += arg9;
                        var101 += var102;
                        arg5++;
                        var158--;
                    } while (var158 > 0);
                }
            }
            return;
        }
        int var20 = arg6 - this.field6557;
        float var21 = arg15 / 8.0F * (float) var20 + arg12;
        float var22 = arg16 / 8.0F * (float) var20 + arg13;
        float var23 = arg17 / 8.0F * (float) var20 + arg14;
        int var24;
        int var25;
        if (var23 == 0.0F) {
            var24 = 0;
            var25 = 0;
        } else {
            var24 = (int) (var21 * 4096.0F / var23);
            var25 = (int) (var22 * 4096.0F / var23);
        }
        float var26 = arg15 + var21;
        float var27 = arg16 + var22;
        float var28 = arg17 + var23;
        int var29;
        int var30;
        if (var28 == 0.0F) {
            var29 = 0;
            var30 = 0;
        } else {
            var29 = (int) (var26 * 4096.0F / var28);
            var30 = (int) (var27 * 4096.0F / var28);
        }
        int var31 = (var24 << 20) + var25;
        int var32 = (var29 - var24 >> 3 << 20) + (var30 - var25 >> 3);
        int var33 = var19 >> 3;
        int var34 = arg11 << 3;
        int var35 = arg10 >> 8;
        if (this.field6567) {
            if (var33 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var36 = arg2[(var31 >>> 26) + (var31 & 0xFC0)];
                        arg0[arg5] = ((var36 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var36 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var37 = arg8 + arg9;
                    int var38 = var31 + var32;
                    arg5++;
                    if (var37 < arg1[arg5]) {
                        int var39 = arg2[(var38 >>> 26) + (var38 & 0xFC0)];
                        arg0[arg5] = ((var39 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var39 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var40 = arg9 + var37;
                    int var41 = var32 + var38;
                    arg5++;
                    if (var40 < arg1[arg5]) {
                        int var42 = arg2[(var41 >>> 26) + (var41 & 0xFC0)];
                        arg0[arg5] = ((var42 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var42 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var43 = arg9 + var40;
                    int var44 = var32 + var41;
                    arg5++;
                    if (var43 < arg1[arg5]) {
                        int var45 = arg2[(var44 >>> 26) + (var44 & 0xFC0)];
                        arg0[arg5] = ((var45 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var45 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var46 = arg9 + var43;
                    int var47 = var32 + var44;
                    arg5++;
                    if (var46 < arg1[arg5]) {
                        int var48 = arg2[(var47 >>> 26) + (var47 & 0xFC0)];
                        arg0[arg5] = ((var48 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var48 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var49 = arg9 + var46;
                    int var50 = var32 + var47;
                    arg5++;
                    if (var49 < arg1[arg5]) {
                        int var51 = arg2[(var50 >>> 26) + (var50 & 0xFC0)];
                        arg0[arg5] = ((var51 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var51 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var52 = arg9 + var49;
                    int var53 = var32 + var50;
                    arg5++;
                    if (var52 < arg1[arg5]) {
                        int var54 = arg2[(var53 >>> 26) + (var53 & 0xFC0)];
                        arg0[arg5] = ((var54 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var54 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    int var55 = arg9 + var52;
                    int var56 = var32 + var53;
                    arg5++;
                    if (var55 < arg1[arg5]) {
                        int var57 = arg2[(var56 >>> 26) + (var56 & 0xFC0)];
                        arg0[arg5] = ((var57 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var57 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    arg8 = arg9 + var55;
                    var10000 = var32 + var56;
                    arg5++;
                    int var59 = var29;
                    int var60 = var30;
                    var26 += arg15;
                    var27 += arg16;
                    var28 += arg17;
                    if (var28 == 0.0F) {
                        var29 = 0;
                        var30 = 0;
                    } else {
                        var29 = (int) (var26 * 4096.0F / var28);
                        var30 = (int) (var27 * 4096.0F / var28);
                    }
                    var31 = (var59 << 20) + var60;
                    var32 = (var29 - var59 >> 3 << 20) + (var30 - var60 >> 3);
                    arg10 += var34;
                    var35 = arg10 >> 8;
                    var33--;
                } while (var33 > 0);
            }
            int var61 = arg7 - arg6 & 0x7;
            if (var61 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var62 = arg2[(var31 >>> 26) + (var31 & 0xFC0)];
                        arg0[arg5] = ((var62 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var62 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    }
                    arg8 += arg9;
                    var31 += var32;
                    arg5++;
                    var61--;
                } while (var61 > 0);
                return;
            }
            return;
        }
        if (var33 > 0) {
            do {
                int var63;
                if (arg8 < arg1[arg5] && (var63 = arg2[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var63 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var63 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var64 = arg8 + arg9;
                int var65 = var31 + var32;
                arg5++;
                int var66;
                if (var64 < arg1[arg5] && (var66 = arg2[(var65 >>> 26) + (var65 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var66 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var66 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var67 = arg9 + var64;
                int var68 = var32 + var65;
                arg5++;
                int var69;
                if (var67 < arg1[arg5] && (var69 = arg2[(var68 >>> 26) + (var68 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var69 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var69 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var70 = arg9 + var67;
                int var71 = var32 + var68;
                arg5++;
                int var72;
                if (var70 < arg1[arg5] && (var72 = arg2[(var71 >>> 26) + (var71 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var72 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var72 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var73 = arg9 + var70;
                int var74 = var32 + var71;
                arg5++;
                int var75;
                if (var73 < arg1[arg5] && (var75 = arg2[(var74 >>> 26) + (var74 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var75 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var75 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var76 = arg9 + var73;
                int var77 = var32 + var74;
                arg5++;
                int var78;
                if (var76 < arg1[arg5] && (var78 = arg2[(var77 >>> 26) + (var77 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var78 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var78 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var79 = arg9 + var76;
                int var80 = var32 + var77;
                arg5++;
                int var81;
                if (var79 < arg1[arg5] && (var81 = arg2[(var80 >>> 26) + (var80 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var81 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var81 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                int var82 = arg9 + var79;
                int var83 = var32 + var80;
                arg5++;
                int var84;
                if (var82 < arg1[arg5] && (var84 = arg2[(var83 >>> 26) + (var83 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var84 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var84 & 0xFF00) * var35 & 0xFF0000) >> 8;
                }
                arg8 = arg9 + var82;
                var10000 = var32 + var83;
                arg5++;
                int var86 = var29;
                int var87 = var30;
                var26 += arg15;
                var27 += arg16;
                var28 += arg17;
                if (var28 == 0.0F) {
                    var29 = 0;
                    var30 = 0;
                } else {
                    var29 = (int) (var26 * 4096.0F / var28);
                    var30 = (int) (var27 * 4096.0F / var28);
                }
                var31 = (var86 << 20) + var87;
                var32 = (var29 - var86 >> 3 << 20) + (var30 - var87 >> 3);
                arg10 += var34;
                var35 = arg10 >> 8;
                var33--;
            } while (var33 > 0);
        }
        int var88 = arg7 - arg6 & 0x7;
        if (var88 <= 0) {
            return;
        }
        do {
            int var89;
            if (arg8 < arg1[arg5] && (var89 = arg2[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                arg0[arg5] = ((var89 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var89 & 0xFF00) * var35 & 0xFF0000) >> 8;
            }
            arg8 += arg9;
            var31 += var32;
            arg5++;
            var88--;
        } while (var88 > 0);
        return;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
    private final void method2732(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        if (this.field6564) {
            int var16 = arg2 + arg5;
            int var17 = arg5 * arg10 + arg9;
            int var18 = arg5 * arg12 + arg11;
            int var19 = arg5 * arg14 + arg13;
            if (this.field6558) {
                int var20 = arg6 - arg5 >> 2;
                int var21 = arg10 << 2;
                int var22 = arg12 << 2;
                int var23 = arg14 << 2;
                if (this.field6568 == 0) {
                    if (var20 > 0) {
                        do {
                            int var24 = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            arg0[var16++] = var24;
                            var20--;
                        } while (var20 > 0);
                    }
                    int var25 = arg6 - arg5 & 0x3;
                    if (var25 > 0) {
                        int var26 = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        do {
                            arg0[var16++] = var26;
                            var25--;
                        } while (var25 > 0);
                        return;
                    }
                } else if (this.field6551) {
                    if (var20 > 0) {
                        do {
                            int var39 = var17 & 0xFF00 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            int var41 = var16++;
                            int var43 = arg0[var41];
                            int var44 = var39 + var43;
                            int var45 = (var39 & 0xFF00FF) + (var43 & 0xFF00FF);
                            int var46 = (var44 - var45 & 0x10000) + (var45 & 0x1000100);
                            arg0[var41] = var44 - var46 | 0xFF000000 | var46 - (var46 >>> 8);
                            int var48 = var16++;
                            int var50 = arg0[var48];
                            int var51 = var39 + var50;
                            int var52 = (var39 & 0xFF00FF) + (var50 & 0xFF00FF);
                            int var53 = (var51 - var52 & 0x10000) + (var52 & 0x1000100);
                            arg0[var48] = var51 - var53 | 0xFF000000 | var53 - (var53 >>> 8);
                            int var55 = var16++;
                            int var57 = arg0[var55];
                            int var58 = var39 + var57;
                            int var59 = (var39 & 0xFF00FF) + (var57 & 0xFF00FF);
                            int var60 = (var58 - var59 & 0x10000) + (var59 & 0x1000100);
                            arg0[var55] = var58 - var60 | 0xFF000000 | var60 - (var60 >>> 8);
                            int var62 = var16++;
                            int var64 = arg0[var62];
                            int var65 = var39 + var64;
                            int var66 = (var39 & 0xFF00FF) + (var64 & 0xFF00FF);
                            int var67 = (var65 - var66 & 0x10000) + (var66 & 0x1000100);
                            arg0[var62] = var65 - var67 | 0xFF000000 | var67 - (var67 >>> 8);
                            var20--;
                        } while (var20 > 0);
                    }
                    int var68 = arg6 - arg5 & 0x3;
                    if (var68 > 0) {
                        int var69 = var17 & 0xFF00 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        do {
                            int var71 = var16++;
                            int var73 = arg0[var71];
                            int var74 = var69 + var73;
                            int var75 = (var69 & 0xFF00FF) + (var73 & 0xFF00FF);
                            int var76 = (var74 - var75 & 0x10000) + (var75 & 0x1000100);
                            arg0[var71] = var74 - var76 | 0xFF000000 | var76 - (var76 >>> 8);
                            var68--;
                        } while (var68 > 0);
                    }
                } else {
                    int var27 = this.field6568;
                    int var28 = 256 - this.field6568;
                    if (var20 > 0) {
                        do {
                            int var29 = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                            var17 += var21;
                            var18 += var22;
                            var19 += var23;
                            int var30 = ((var29 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var28 >> 8 & 0xFF00);
                            int var31 = arg0[var16];
                            arg0[var16++] = ((var31 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var32 = arg0[var16];
                            arg0[var16++] = ((var32 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var32 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var33 = arg0[var16];
                            arg0[var16++] = ((var33 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var33 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            int var34 = arg0[var16];
                            arg0[var16++] = ((var34 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var30;
                            var20--;
                        } while (var20 > 0);
                    }
                    int var35 = arg6 - arg5 & 0x3;
                    if (var35 > 0) {
                        int var36 = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        int var37 = ((var36 & 0xFF00FF) * var28 >> 8 & 0xFF00FF) + ((var36 & 0xFF00) * var28 >> 8 & 0xFF00);
                        do {
                            int var38 = arg0[var16];
                            arg0[var16++] = ((var38 & 0xFF00) * var27 >> 8 & 0xFF00) + ((var38 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + var37;
                            var35--;
                        } while (var35 > 0);
                        return;
                    }
                }
            } else {
                int var77 = arg6 - arg5;
                if (this.field6568 == 0) {
                    do {
                        arg0[var16++] = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        var77--;
                    } while (var77 > 0);
                } else if (this.field6551) {
                    do {
                        int var84 = var16++;
                        int var85 = var17 & 0xFF00 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        int var86 = arg0[var84];
                        int var87 = var85 + var86;
                        int var88 = (var85 & 0xFF00FF) + (var86 & 0xFF00FF);
                        int var89 = (var87 - var88 & 0x10000) + (var88 & 0x1000100);
                        arg0[var84] = var87 - var89 | 0xFF000000 | var89 - (var89 >>> 8);
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        var77--;
                    } while (var77 > 0);
                } else {
                    int var78 = this.field6568;
                    int var79 = 256 - this.field6568;
                    do {
                        int var80 = var17 & 0xFF00 | 0xFF0000 << 8 | var18 & 0xFF00 | var19 >> 8 & 0xFF;
                        var17 += arg10;
                        var18 += arg12;
                        var19 += arg14;
                        int var81 = ((var80 & 0xFF00FF) * var79 >> 8 & 0xFF00FF) + ((var80 & 0xFF00) * var79 >> 8 & 0xFF00);
                        int var82 = arg0[var16];
                        arg0[var16++] = ((var82 & 0xFF00) * var78 >> 8 & 0xFF00) + ((var82 & 0xFF00FF) * var78 >> 8 & 0xFF00FF) + var81;
                        var77--;
                    } while (var77 > 0);
                }
            }
            return;
        }
        int var90 = arg5 + arg2 - 1;
        int var91 = arg5 * arg8 + arg7;
        int var92 = arg5 * arg10 + arg9;
        int var93 = arg5 * arg12 + arg11;
        int var94 = arg5 * arg14 + arg13;
        if (this.field6562.field5936) {
            if (this.field6558) {
                int var95 = arg6 - arg5 >> 2;
                int var96 = arg10 << 2;
                int var97 = arg12 << 2;
                int var98 = arg14 << 2;
                if (this.field6568 == 0) {
                    if (var95 > 0) {
                        do {
                            int var99 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            var90++;
                            if (var91 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var91;
                            }
                            int var100 = arg8 + var91;
                            var90++;
                            if (var100 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var100;
                            }
                            int var101 = arg8 + var100;
                            var90++;
                            if (var101 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var101;
                            }
                            int var102 = arg8 + var101;
                            var90++;
                            if (var102 < arg1[var90]) {
                                arg0[var90] = var99;
                                arg1[var90] = var102;
                            }
                            var91 = arg8 + var102;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var103 = arg6 - arg5 & 0x3;
                    if (var103 > 0) {
                        int var104 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                arg0[var90] = var104;
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var103--;
                        } while (var103 > 0);
                        return;
                    }
                } else if (this.field6551) {
                    if (var95 > 0) {
                        do {
                            int var120 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var124 = arg0[var90];
                                int var125 = var120 + var124;
                                int var126 = (var120 & 0xFF00FF) + (var124 & 0xFF00FF);
                                int var127 = (var125 - var126 & 0x10000) + (var126 & 0x1000100);
                                arg0[var90] = var125 - var127 | 0xFF000000 | var127 - (var127 >>> 8);
                                arg1[var90] = var91;
                            }
                            int var128 = arg8 + var91;
                            var90++;
                            if (var128 < arg1[var90]) {
                                int var132 = arg0[var90];
                                int var133 = var120 + var132;
                                int var134 = (var120 & 0xFF00FF) + (var132 & 0xFF00FF);
                                int var135 = (var133 - var134 & 0x10000) + (var134 & 0x1000100);
                                arg0[var90] = var133 - var135 | 0xFF000000 | var135 - (var135 >>> 8);
                                arg1[var90] = var128;
                            }
                            int var136 = arg8 + var128;
                            var90++;
                            if (var136 < arg1[var90]) {
                                int var140 = arg0[var90];
                                int var141 = var120 + var140;
                                int var142 = (var120 & 0xFF00FF) + (var140 & 0xFF00FF);
                                int var143 = (var141 - var142 & 0x10000) + (var142 & 0x1000100);
                                arg0[var90] = var141 - var143 | 0xFF000000 | var143 - (var143 >>> 8);
                                arg1[var90] = var136;
                            }
                            int var144 = arg8 + var136;
                            var90++;
                            if (var144 < arg1[var90]) {
                                int var148 = arg0[var90];
                                int var149 = var120 + var148;
                                int var150 = (var120 & 0xFF00FF) + (var148 & 0xFF00FF);
                                int var151 = (var149 - var150 & 0x10000) + (var150 & 0x1000100);
                                arg0[var90] = var149 - var151 | 0xFF000000 | var151 - (var151 >>> 8);
                                arg1[var90] = var144;
                            }
                            var91 = arg8 + var144;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var152 = arg6 - arg5 & 0x3;
                    if (var152 > 0) {
                        int var153 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var157 = arg0[var90];
                                int var158 = var153 + var157;
                                int var159 = (var153 & 0xFF00FF) + (var157 & 0xFF00FF);
                                int var160 = (var158 - var159 & 0x10000) + (var159 & 0x1000100);
                                arg0[var90] = var158 - var160 | 0xFF000000 | var160 - (var160 >>> 8);
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var152--;
                        } while (var152 > 0);
                    }
                } else {
                    int var105 = this.field6568;
                    int var106 = 256 - this.field6568;
                    if (var95 > 0) {
                        do {
                            int var107 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            var92 += var96;
                            var93 += var97;
                            var94 += var98;
                            int var108 = ((var107 & 0xFF00FF) * var106 >> 8 & 0xFF00FF) + ((var107 & 0xFF00) * var106 >> 8 & 0xFF00);
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var109 = arg0[var90];
                                arg0[var90] = ((var109 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var109 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var91;
                            }
                            int var110 = arg8 + var91;
                            var90++;
                            if (var110 < arg1[var90]) {
                                int var111 = arg0[var90];
                                arg0[var90] = ((var111 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var111 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var110;
                            }
                            int var112 = arg8 + var110;
                            var90++;
                            if (var112 < arg1[var90]) {
                                int var113 = arg0[var90];
                                arg0[var90] = ((var113 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var113 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var112;
                            }
                            int var114 = arg8 + var112;
                            var90++;
                            if (var114 < arg1[var90]) {
                                int var115 = arg0[var90];
                                arg0[var90] = ((var115 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var115 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var108;
                                arg1[var90] = var114;
                            }
                            var91 = arg8 + var114;
                            var95--;
                        } while (var95 > 0);
                    }
                    int var116 = arg6 - arg5 & 0x3;
                    if (var116 > 0) {
                        int var117 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        int var118 = ((var117 & 0xFF00FF) * var106 >> 8 & 0xFF00FF) + ((var117 & 0xFF00) * var106 >> 8 & 0xFF00);
                        do {
                            var90++;
                            if (var91 < arg1[var90]) {
                                int var119 = arg0[var90];
                                arg0[var90] = ((var119 & 0xFF00) * var105 >> 8 & 0xFF00) + ((var119 & 0xFF00FF) * var105 >> 8 & 0xFF00FF) + var118;
                                arg1[var90] = var91;
                            }
                            var91 += arg8;
                            var116--;
                        } while (var116 > 0);
                        return;
                    }
                }
            } else {
                int var161 = arg6 - arg5;
                if (this.field6568 == 0) {
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                } else if (this.field6551) {
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var169 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            int var170 = arg0[var90];
                            int var171 = var169 + var170;
                            int var172 = (var169 & 0xFF00FF) + (var170 & 0xFF00FF);
                            int var173 = (var171 - var172 & 0x10000) + (var172 & 0x1000100);
                            arg0[var90] = var171 - var173 | 0xFF000000 | var173 - (var173 >>> 8);
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                } else {
                    int var162 = this.field6568;
                    int var163 = 256 - this.field6568;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var164 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                            int var165 = ((var164 & 0xFF00FF) * var163 >> 8 & 0xFF00FF) + ((var164 & 0xFF00) * var163 >> 8 & 0xFF00);
                            int var166 = arg0[var90];
                            arg0[var90] = ((var166 & 0xFF00) * var162 >> 8 & 0xFF00) + ((var166 & 0xFF00FF) * var162 >> 8 & 0xFF00FF) + var165;
                            arg1[var90] = var91;
                        }
                        var91 += arg8;
                        var92 += arg10;
                        var93 += arg12;
                        var94 += arg14;
                        var161--;
                    } while (var161 > 0);
                }
            }
        } else if (this.field6558) {
            int var174 = arg6 - arg5 >> 2;
            int var175 = arg10 << 2;
            int var176 = arg12 << 2;
            int var177 = arg14 << 2;
            if (this.field6568 == 0) {
                if (var174 > 0) {
                    do {
                        int var178 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        int var179 = arg8 + var91;
                        var90++;
                        if (var179 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        int var180 = arg8 + var179;
                        var90++;
                        if (var180 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        int var181 = arg8 + var180;
                        var90++;
                        if (var181 < arg1[var90]) {
                            arg0[var90] = var178;
                        }
                        var91 = arg8 + var181;
                        var174--;
                    } while (var174 > 0);
                }
                int var182 = arg6 - arg5 & 0x3;
                if (var182 > 0) {
                    int var183 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            arg0[var90] = var183;
                        }
                        var91 += arg8;
                        var182--;
                    } while (var182 > 0);
                    return;
                }
            } else if (this.field6551) {
                if (var174 > 0) {
                    do {
                        int var199 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var203 = arg0[var90];
                            int var204 = var199 + var203;
                            int var205 = (var199 & 0xFF00FF) + (var203 & 0xFF00FF);
                            int var206 = (var204 - var205 & 0x10000) + (var205 & 0x1000100);
                            arg0[var90] = var204 - var206 | 0xFF000000 | var206 - (var206 >>> 8);
                        }
                        int var207 = arg8 + var91;
                        var90++;
                        if (var207 < arg1[var90]) {
                            int var211 = arg0[var90];
                            int var212 = var199 + var211;
                            int var213 = (var199 & 0xFF00FF) + (var211 & 0xFF00FF);
                            int var214 = (var212 - var213 & 0x10000) + (var213 & 0x1000100);
                            arg0[var90] = var212 - var214 | 0xFF000000 | var214 - (var214 >>> 8);
                        }
                        int var215 = arg8 + var207;
                        var90++;
                        if (var215 < arg1[var90]) {
                            int var219 = arg0[var90];
                            int var220 = var199 + var219;
                            int var221 = (var199 & 0xFF00FF) + (var219 & 0xFF00FF);
                            int var222 = (var220 - var221 & 0x10000) + (var221 & 0x1000100);
                            arg0[var90] = var220 - var222 | 0xFF000000 | var222 - (var222 >>> 8);
                        }
                        int var223 = arg8 + var215;
                        var90++;
                        if (var223 < arg1[var90]) {
                            int var227 = arg0[var90];
                            int var228 = var199 + var227;
                            int var229 = (var199 & 0xFF00FF) + (var227 & 0xFF00FF);
                            int var230 = (var228 - var229 & 0x10000) + (var229 & 0x1000100);
                            arg0[var90] = var228 - var230 | 0xFF000000 | var230 - (var230 >>> 8);
                        }
                        var91 = arg8 + var223;
                        var174--;
                    } while (var174 > 0);
                }
                int var231 = arg6 - arg5 & 0x3;
                if (var231 > 0) {
                    int var232 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var236 = arg0[var90];
                            int var237 = var232 + var236;
                            int var238 = (var232 & 0xFF00FF) + (var236 & 0xFF00FF);
                            int var239 = (var237 - var238 & 0x10000) + (var238 & 0x1000100);
                            arg0[var90] = var237 - var239 | 0xFF000000 | var239 - (var239 >>> 8);
                        }
                        var91 += arg8;
                        var231--;
                    } while (var231 > 0);
                }
            } else {
                int var184 = this.field6568;
                int var185 = 256 - this.field6568;
                if (var174 > 0) {
                    do {
                        int var186 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        var92 += var175;
                        var93 += var176;
                        var94 += var177;
                        int var187 = ((var186 & 0xFF00FF) * var185 >> 8 & 0xFF00FF) + ((var186 & 0xFF00) * var185 >> 8 & 0xFF00);
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var188 = arg0[var90];
                            arg0[var90] = ((var188 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var188 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        int var189 = arg8 + var91;
                        var90++;
                        if (var189 < arg1[var90]) {
                            int var190 = arg0[var90];
                            arg0[var90] = ((var190 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var190 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        int var191 = arg8 + var189;
                        var90++;
                        if (var191 < arg1[var90]) {
                            int var192 = arg0[var90];
                            arg0[var90] = ((var192 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var192 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        int var193 = arg8 + var191;
                        var90++;
                        if (var193 < arg1[var90]) {
                            int var194 = arg0[var90];
                            arg0[var90] = ((var194 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var194 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var187;
                        }
                        var91 = arg8 + var193;
                        var174--;
                    } while (var174 > 0);
                }
                int var195 = arg6 - arg5 & 0x3;
                if (var195 > 0) {
                    int var196 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                    int var197 = ((var196 & 0xFF00FF) * var185 >> 8 & 0xFF00FF) + ((var196 & 0xFF00) * var185 >> 8 & 0xFF00);
                    do {
                        var90++;
                        if (var91 < arg1[var90]) {
                            int var198 = arg0[var90];
                            arg0[var90] = ((var198 & 0xFF00) * var184 >> 8 & 0xFF00) + ((var198 & 0xFF00FF) * var184 >> 8 & 0xFF00FF) + var197;
                        }
                        var91 += arg8;
                        var195--;
                    } while (var195 > 0);
                    return;
                }
            }
        } else {
            int var240 = arg6 - arg5;
            if (this.field6568 == 0) {
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        arg0[var90] = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            } else if (this.field6551) {
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        int var248 = var92 & 0xFF00 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        int var249 = arg0[var90];
                        int var250 = var248 + var249;
                        int var251 = (var248 & 0xFF00FF) + (var249 & 0xFF00FF);
                        int var252 = (var250 - var251 & 0x10000) + (var251 & 0x1000100);
                        arg0[var90] = var250 - var252 | 0xFF000000 | var252 - (var252 >>> 8);
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            } else {
                int var241 = this.field6568;
                int var242 = 256 - this.field6568;
                do {
                    var90++;
                    if (var91 < arg1[var90]) {
                        int var243 = var92 & 0xFF00 | 0xFF0000 << 8 | var93 & 0xFF00 | var94 >> 8 & 0xFF;
                        int var244 = ((var243 & 0xFF00FF) * var242 >> 8 & 0xFF00FF) + ((var243 & 0xFF00) * var242 >> 8 & 0xFF00);
                        int var245 = arg0[var90];
                        arg0[var90] = ((var245 & 0xFF00) * var241 >> 8 & 0xFF00) + ((var245 & 0xFF00FF) * var241 >> 8 & 0xFF00FF) + var244;
                    }
                    var91 += arg8;
                    var92 += arg10;
                    var93 += arg12;
                    var94 += arg14;
                    var240--;
                } while (var240 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I")
    public final int method2733() {
        return this.field6553[0] / this.field6554;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
    private final void method2734(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var21 = arg4 + arg5;
        int var22 = arg5 * arg10 + arg9;
        int var23 = arg5 * arg13 + arg12;
        int var24 = arg5 * arg8 + arg7;
        int var25 = arg6 - arg5;
        int var26 = arg10 << 3;
        int var27 = var22 >> 16;
        int var28 = 255 - var27;
        int var29 = ((arg11 & 0xFF00FF) * var27 & 0xFF00FF00 | (arg11 & 0xFF00) * var27 & 0xFF0000) >>> 8;
        int var10000;
        if (!this.field6560) {
            int var120 = arg5 - this.field6557;
            float var121 = arg17 / 8.0F * (float) var120 + arg14;
            float var122 = arg18 / 8.0F * (float) var120 + arg15;
            float var123 = arg19 / 8.0F * (float) var120 + arg16;
            int var124;
            int var125;
            if (var123 == 0.0F) {
                var124 = 0;
                var125 = 0;
            } else {
                var124 = (int) (var121 * 16384.0F / var123);
                var125 = (int) (var122 * 16384.0F / var123);
            }
            float var126 = arg17 + var121;
            float var127 = arg18 + var122;
            float var128 = arg19 + var123;
            int var129;
            int var130;
            if (var128 == 0.0F) {
                var129 = 0;
                var130 = 0;
            } else {
                var129 = (int) (var126 * 16384.0F / var128);
                var130 = (int) (var127 * 16384.0F / var128);
            }
            int var131 = (var124 << 18) + var125;
            int var132 = (var129 - var124 >> 3 << 18) + (var130 - var125 >> 3);
            int var133 = var25 >> 3;
            int var134 = arg13 << 3;
            int var135 = var23 >> 8;
            if (this.field6567) {
                if (var133 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var136 = arg1[(var131 >>> 25) + (var131 & 0x3F80)];
                            int var137 = ((var136 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var136 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var137 & 0xFF00FF) * var28 & 0xFF00FF00 | (var137 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        int var138 = var131 + var132;
                        var21++;
                        int var139 = arg8 + var24;
                        if (var139 < this.field6559[var21]) {
                            int var140 = arg1[(var138 >>> 25) + (var138 & 0x3F80)];
                            int var141 = ((var140 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var140 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var141 & 0xFF00FF) * var28 & 0xFF00FF00 | (var141 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var139;
                        }
                        int var142 = var132 + var138;
                        var21++;
                        int var143 = arg8 + var139;
                        if (var143 < this.field6559[var21]) {
                            int var144 = arg1[(var142 >>> 25) + (var142 & 0x3F80)];
                            int var145 = ((var144 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var144 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var145 & 0xFF00FF) * var28 & 0xFF00FF00 | (var145 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var143;
                        }
                        int var146 = var132 + var142;
                        var21++;
                        int var147 = arg8 + var143;
                        if (var147 < this.field6559[var21]) {
                            int var148 = arg1[(var146 >>> 25) + (var146 & 0x3F80)];
                            int var149 = ((var148 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var148 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var149 & 0xFF00FF) * var28 & 0xFF00FF00 | (var149 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var147;
                        }
                        int var150 = var132 + var146;
                        var21++;
                        int var151 = arg8 + var147;
                        if (var151 < this.field6559[var21]) {
                            int var152 = arg1[(var150 >>> 25) + (var150 & 0x3F80)];
                            int var153 = ((var152 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var152 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var153 & 0xFF00FF) * var28 & 0xFF00FF00 | (var153 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var151;
                        }
                        int var154 = var132 + var150;
                        var21++;
                        int var155 = arg8 + var151;
                        if (var155 < this.field6559[var21]) {
                            int var156 = arg1[(var154 >>> 25) + (var154 & 0x3F80)];
                            int var157 = ((var156 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var156 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var157 & 0xFF00FF) * var28 & 0xFF00FF00 | (var157 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var155;
                        }
                        int var158 = var132 + var154;
                        var21++;
                        int var159 = arg8 + var155;
                        if (var159 < this.field6559[var21]) {
                            int var160 = arg1[(var158 >>> 25) + (var158 & 0x3F80)];
                            int var161 = ((var160 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var160 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var161 & 0xFF00FF) * var28 & 0xFF00FF00 | (var161 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var159;
                        }
                        int var162 = var132 + var158;
                        var21++;
                        int var163 = arg8 + var159;
                        if (var163 < this.field6559[var21]) {
                            int var164 = arg1[(var162 >>> 25) + (var162 & 0x3F80)];
                            int var165 = ((var164 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var164 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var165 & 0xFF00FF) * var28 & 0xFF00FF00 | (var165 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var163;
                        }
                        var10000 = var132 + var162;
                        var21++;
                        var24 = arg8 + var163;
                        int var167 = var129;
                        int var168 = var130;
                        var126 += arg17;
                        var127 += arg18;
                        var128 += arg19;
                        if (var128 == 0.0F) {
                            var129 = 0;
                            var130 = 0;
                        } else {
                            var129 = (int) (var126 * 16384.0F / var128);
                            var130 = (int) (var127 * 16384.0F / var128);
                        }
                        var131 = (var167 << 18) + var168;
                        var132 = (var129 - var167 >> 3 << 18) + (var130 - var168 >> 3);
                        var23 += var134;
                        var135 = var23 >> 8;
                        var22 += var26;
                        int var169 = var22 >> 16;
                        var28 = 255 - var169;
                        var29 = ((arg11 & 0xFF00FF) * var169 & 0xFF00FF00 | (arg11 & 0xFF00) * var169 & 0xFF0000) >>> 8;
                        var133--;
                    } while (var133 > 0);
                }
                int var170 = arg6 - arg5 & 0x7;
                if (var170 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var171 = arg1[(var131 >>> 25) + (var131 & 0x3F80)];
                            int var172 = ((var171 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var171 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var172 & 0xFF00FF) * var28 & 0xFF00FF00 | (var172 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var131 += var132;
                        var21++;
                        var24 += arg8;
                        var170--;
                    } while (var170 > 0);
                    return;
                }
            } else {
                if (var133 > 0) {
                    do {
                        int var173;
                        if (var24 < this.field6559[var21] && (var173 = arg1[(var131 >>> 25) + (var131 & 0x3F80)]) != 0) {
                            int var174 = ((var173 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var173 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var174 & 0xFF00FF) * var28 & 0xFF00FF00 | (var174 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var21++;
                        int var175 = var131 + var132;
                        int var176 = arg8 + var24;
                        int var177;
                        if (var176 < this.field6559[var21] && (var177 = arg1[(var175 >>> 25) + (var175 & 0x3F80)]) != 0) {
                            int var178 = ((var177 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var177 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var178 & 0xFF00FF) * var28 & 0xFF00FF00 | (var178 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var176;
                        }
                        var21++;
                        int var179 = var132 + var175;
                        int var180 = arg8 + var176;
                        int var181;
                        if (var180 < this.field6559[var21] && (var181 = arg1[(var179 >>> 25) + (var179 & 0x3F80)]) != 0) {
                            int var182 = ((var181 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var181 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var182 & 0xFF00FF) * var28 & 0xFF00FF00 | (var182 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var180;
                        }
                        var21++;
                        int var183 = var132 + var179;
                        int var184 = arg8 + var180;
                        int var185;
                        if (var184 < this.field6559[var21] && (var185 = arg1[(var183 >>> 25) + (var183 & 0x3F80)]) != 0) {
                            int var186 = ((var185 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var185 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var186 & 0xFF00FF) * var28 & 0xFF00FF00 | (var186 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var184;
                        }
                        var21++;
                        int var187 = var132 + var183;
                        int var188 = arg8 + var184;
                        int var189;
                        if (var188 < this.field6559[var21] && (var189 = arg1[(var187 >>> 25) + (var187 & 0x3F80)]) != 0) {
                            int var190 = ((var189 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var189 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var190 & 0xFF00FF) * var28 & 0xFF00FF00 | (var190 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var188;
                        }
                        var21++;
                        int var191 = var132 + var187;
                        int var192 = arg8 + var188;
                        int var193;
                        if (var192 < this.field6559[var21] && (var193 = arg1[(var191 >>> 25) + (var191 & 0x3F80)]) != 0) {
                            int var194 = ((var193 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var193 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var194 & 0xFF00FF) * var28 & 0xFF00FF00 | (var194 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var192;
                        }
                        var21++;
                        int var195 = var132 + var191;
                        int var196 = arg8 + var192;
                        int var197;
                        if (var196 < this.field6559[var21] && (var197 = arg1[(var195 >>> 25) + (var195 & 0x3F80)]) != 0) {
                            int var198 = ((var197 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var197 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var198 & 0xFF00FF) * var28 & 0xFF00FF00 | (var198 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var196;
                        }
                        var21++;
                        int var199 = var132 + var195;
                        int var200 = arg8 + var196;
                        int var201;
                        if (var200 < this.field6559[var21] && (var201 = arg1[(var199 >>> 25) + (var199 & 0x3F80)]) != 0) {
                            int var202 = ((var201 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var201 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var202 & 0xFF00FF) * var28 & 0xFF00FF00 | (var202 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var200;
                        }
                        var21++;
                        var10000 = var132 + var199;
                        var24 = arg8 + var200;
                        int var204 = var129;
                        int var205 = var130;
                        var126 += arg17;
                        var127 += arg18;
                        var128 += arg19;
                        if (var128 == 0.0F) {
                            var129 = 0;
                            var130 = 0;
                        } else {
                            var129 = (int) (var126 / var128 * 16384.0F);
                            var130 = (int) (var127 / var128 * 16384.0F);
                        }
                        var131 = (var204 << 18) + var205;
                        var132 = (var129 - var204 >> 3 << 18) + (var130 - var205 >> 3);
                        var23 += var134;
                        var135 = var23 >> 8;
                        var22 += var26;
                        int var206 = var22 >> 16;
                        var28 = 255 - var206;
                        var29 = ((arg11 & 0xFF00FF) * var206 & 0xFF00FF00 | (arg11 & 0xFF00) * var206 & 0xFF0000) >>> 8;
                        var133--;
                    } while (var133 > 0);
                }
                int var207 = arg6 - arg5 & 0x7;
                if (var207 > 0) {
                    do {
                        int var208;
                        if (var24 < this.field6559[var21] && (var208 = arg1[(var131 >>> 25) + (var131 & 0x3F80)]) != 0) {
                            int var209 = ((var208 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var208 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var209 & 0xFF00FF) * var28 & 0xFF00FF00 | (var209 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                            this.field6559[var21] = var24;
                        }
                        var21++;
                        var131 += var132;
                        var24 += arg8;
                        var207--;
                    } while (var207 > 0);
                }
            }
            return;
        }
        int var30 = arg5 - this.field6557;
        float var31 = arg17 / 8.0F * (float) var30 + arg14;
        float var32 = arg18 / 8.0F * (float) var30 + arg15;
        float var33 = arg19 / 8.0F * (float) var30 + arg16;
        int var34;
        int var35;
        if (var33 == 0.0F) {
            var34 = 0;
            var35 = 0;
        } else {
            var34 = (int) (var31 * 4096.0F / var33);
            var35 = (int) (var32 * 4096.0F / var33);
        }
        float var36 = arg17 + var31;
        float var37 = arg18 + var32;
        float var38 = arg19 + var33;
        int var39;
        int var40;
        if (var38 == 0.0F) {
            var39 = 0;
            var40 = 0;
        } else {
            var39 = (int) (var36 * 4096.0F / var38);
            var40 = (int) (var37 * 4096.0F / var38);
        }
        int var41 = (var34 << 20) + var35;
        int var42 = (var39 - var34 >> 3 << 20) + (var40 - var35 >> 3);
        int var43 = var25 >> 3;
        int var44 = arg13 << 3;
        int var45 = var23 >> 8;
        if (this.field6567) {
            if (var43 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var46 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                        int var47 = ((var46 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var46 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var47 & 0xFF00FF) * var28 & 0xFF00FF00 | (var47 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    int var48 = var41 + var42;
                    int var49 = arg8 + var24;
                    var21++;
                    if (var49 < this.field6559[var21]) {
                        int var50 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                        int var51 = ((var50 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var50 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var51 & 0xFF00FF) * var28 & 0xFF00FF00 | (var51 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var49;
                    }
                    int var52 = var42 + var48;
                    int var53 = arg8 + var49;
                    var21++;
                    if (var53 < this.field6559[var21]) {
                        int var54 = arg1[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var55 = ((var54 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var54 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var55 & 0xFF00FF) * var28 & 0xFF00FF00 | (var55 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var53;
                    }
                    int var56 = var42 + var52;
                    int var57 = arg8 + var53;
                    var21++;
                    if (var57 < this.field6559[var21]) {
                        int var58 = arg1[(var56 >>> 26) + (var56 & 0xFC0)];
                        int var59 = ((var58 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var58 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var59 & 0xFF00FF) * var28 & 0xFF00FF00 | (var59 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var57;
                    }
                    int var60 = var42 + var56;
                    int var61 = arg8 + var57;
                    var21++;
                    if (var61 < this.field6559[var21]) {
                        int var62 = arg1[(var60 >>> 26) + (var60 & 0xFC0)];
                        int var63 = ((var62 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var62 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var63 & 0xFF00FF) * var28 & 0xFF00FF00 | (var63 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var61;
                    }
                    int var64 = var42 + var60;
                    int var65 = arg8 + var61;
                    var21++;
                    if (var65 < this.field6559[var21]) {
                        int var66 = arg1[(var64 >>> 26) + (var64 & 0xFC0)];
                        int var67 = ((var66 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var66 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var67 & 0xFF00FF) * var28 & 0xFF00FF00 | (var67 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var65;
                    }
                    int var68 = var42 + var64;
                    int var69 = arg8 + var65;
                    var21++;
                    if (var69 < this.field6559[var21]) {
                        int var70 = arg1[(var68 >>> 26) + (var68 & 0xFC0)];
                        int var71 = ((var70 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var70 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var71 & 0xFF00FF) * var28 & 0xFF00FF00 | (var71 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var69;
                    }
                    int var72 = var42 + var68;
                    int var73 = arg8 + var69;
                    var21++;
                    if (var73 < this.field6559[var21]) {
                        int var74 = arg1[(var72 >>> 26) + (var72 & 0xFC0)];
                        int var75 = ((var74 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var74 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var75 & 0xFF00FF) * var28 & 0xFF00FF00 | (var75 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var73;
                    }
                    var10000 = var42 + var72;
                    var24 = arg8 + var73;
                    var21++;
                    int var77 = var39;
                    int var78 = var40;
                    var36 += arg17;
                    var37 += arg18;
                    var38 += arg19;
                    if (var38 == 0.0F) {
                        var39 = 0;
                        var40 = 0;
                    } else {
                        var39 = (int) (var36 * 4096.0F / var38);
                        var40 = (int) (var37 * 4096.0F / var38);
                    }
                    var41 = (var77 << 20) + var78;
                    var42 = (var39 - var77 >> 3 << 20) + (var40 - var78 >> 3);
                    var23 += var44;
                    var45 = var23 >> 8;
                    var22 += var26;
                    int var79 = var22 >> 16;
                    var28 = 255 - var79;
                    var29 = ((arg11 & 0xFF00FF) * var79 & 0xFF00FF00 | (arg11 & 0xFF00) * var79 & 0xFF0000) >>> 8;
                    var43--;
                } while (var43 > 0);
            }
            int var80 = arg6 - arg5 & 0x7;
            if (var80 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var81 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                        int var82 = ((var81 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var81 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var82 & 0xFF00FF) * var28 & 0xFF00FF00 | (var82 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    var41 += var42;
                    var24 += arg8;
                    var21++;
                    var80--;
                } while (var80 > 0);
                return;
            }
        } else {
            if (var43 > 0) {
                do {
                    int var83;
                    if (var24 < this.field6559[var21] && (var83 = arg1[(var41 >>> 26) + (var41 & 0xFC0)]) != 0) {
                        int var84 = ((var83 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var83 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var84 & 0xFF00FF) * var28 & 0xFF00FF00 | (var84 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var24;
                    }
                    var21++;
                    int var85 = var41 + var42;
                    int var86 = arg8 + var24;
                    int var87;
                    if (var86 < this.field6559[var21] && (var87 = arg1[(var85 >>> 26) + (var85 & 0xFC0)]) != 0) {
                        int var88 = ((var87 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var87 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var88 & 0xFF00FF) * var28 & 0xFF00FF00 | (var88 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var86;
                    }
                    var21++;
                    int var89 = var42 + var85;
                    int var90 = arg8 + var86;
                    int var91;
                    if (var90 < this.field6559[var21] && (var91 = arg1[(var89 >>> 26) + (var89 & 0xFC0)]) != 0) {
                        int var92 = ((var91 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var91 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var92 & 0xFF00FF) * var28 & 0xFF00FF00 | (var92 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var90;
                    }
                    var21++;
                    int var93 = var42 + var89;
                    int var94 = arg8 + var90;
                    int var95;
                    if (var94 < this.field6559[var21] && (var95 = arg1[(var93 >>> 26) + (var93 & 0xFC0)]) != 0) {
                        int var96 = ((var95 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var95 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var96 & 0xFF00FF) * var28 & 0xFF00FF00 | (var96 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var94;
                    }
                    var21++;
                    int var97 = var42 + var93;
                    int var98 = arg8 + var94;
                    int var99;
                    if (var98 < this.field6559[var21] && (var99 = arg1[(var97 >>> 26) + (var97 & 0xFC0)]) != 0) {
                        int var100 = ((var99 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var99 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var100 & 0xFF00FF) * var28 & 0xFF00FF00 | (var100 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var98;
                    }
                    var21++;
                    int var101 = var42 + var97;
                    int var102 = arg8 + var98;
                    int var103;
                    if (var102 < this.field6559[var21] && (var103 = arg1[(var101 >>> 26) + (var101 & 0xFC0)]) != 0) {
                        int var104 = ((var103 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var103 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var104 & 0xFF00FF) * var28 & 0xFF00FF00 | (var104 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var102;
                    }
                    var21++;
                    int var105 = var42 + var101;
                    int var106 = arg8 + var102;
                    int var107;
                    if (var106 < this.field6559[var21] && (var107 = arg1[(var105 >>> 26) + (var105 & 0xFC0)]) != 0) {
                        int var108 = ((var107 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var107 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var108 & 0xFF00FF) * var28 & 0xFF00FF00 | (var108 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var106;
                    }
                    var21++;
                    int var109 = var42 + var105;
                    int var110 = arg8 + var106;
                    int var111;
                    if (var110 < this.field6559[var21] && (var111 = arg1[(var109 >>> 26) + (var109 & 0xFC0)]) != 0) {
                        int var112 = ((var111 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var111 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var112 & 0xFF00FF) * var28 & 0xFF00FF00 | (var112 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        this.field6559[var21] = var110;
                    }
                    var21++;
                    var10000 = var42 + var109;
                    var24 = arg8 + var110;
                    int var114 = var39;
                    int var115 = var40;
                    var36 += arg17;
                    var37 += arg18;
                    var38 += arg19;
                    if (var38 == 0.0F) {
                        var39 = 0;
                        var40 = 0;
                    } else {
                        var39 = (int) (var36 * 4096.0F / var38);
                        var40 = (int) (var37 * 4096.0F / var38);
                    }
                    var41 = (var114 << 20) + var115;
                    var42 = (var39 - var114 >> 3 << 20) + (var40 - var115 >> 3);
                    var23 += var44;
                    var45 = var23 >> 8;
                    var22 += var26;
                    int var116 = var22 >> 16;
                    var28 = 255 - var116;
                    var29 = ((arg11 & 0xFF00FF) * var116 & 0xFF00FF00 | (arg11 & 0xFF00) * var116 & 0xFF0000) >>> 8;
                    var43--;
                } while (var43 > 0);
            }
            int var117 = arg6 - arg5 & 0x7;
            if (var117 <= 0) {
                return;
            }
            do {
                int var118;
                if (var24 < this.field6559[var21] && (var118 = arg1[(var41 >>> 26) + (var41 & 0xFC0)]) != 0) {
                    int var119 = ((var118 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var118 & 0xFF00) * var45 & 0xFF0000) >> 8;
                    arg0[var21] = (((var119 & 0xFF00FF) * var28 & 0xFF00FF00 | (var119 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    this.field6559[var21] = var24;
                }
                var21++;
                var41 += var42;
                var24 += arg8;
                var117--;
            } while (var117 > 0);
        }
        return;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
    public final int method2735() {
        return this.field6553[0] % this.field6554;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIII)V")
    public final void method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int[] var23 = this.field6555.method1117(arg21);
        if (var23 == null) {
            int var24 = this.field6555.method1120(arg21);
            this.method2729(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method2737(var24, arg9), method2737(var24, arg10), method2737(var24, arg11));
            return;
        }
        this.field6560 = this.field6555.method1113(arg21);
        this.field6567 = this.field6555.method1121(arg21);
        int var25 = arg4 - arg3;
        int var26 = arg1 - arg0;
        int var27 = arg5 - arg3;
        int var28 = arg2 - arg0;
        int var29 = arg10 - arg9;
        int var30 = arg11 - arg9;
        int var31 = arg7 - arg6;
        int var32 = arg8 - arg6;
        int var33 = 0;
        if (arg0 != arg1) {
            var33 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var34 = 0;
        if (arg1 != arg2) {
            var34 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var35 = 0;
        if (arg0 != arg2) {
            var35 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        int var36 = var25 * var28 - var26 * var27;
        if (var36 == 0) {
            return;
        }
        int var37 = (var28 * var29 - var26 * var30 << 9) / var36;
        int var38 = (var25 * var30 - var27 * var29 << 9) / var36;
        int var39 = (var28 * var31 - var26 * var32 << 8) / var36;
        int var40 = (var25 * var32 - var27 * var31 << 8) / var36;
        float var41 = 8.0F / (float) this.field6555.field2086;
        float var42 = (float) this.field6555.field2083;
        int var43 = arg12 - arg13;
        int var44 = arg15 - arg16;
        int var45 = arg18 - arg19;
        int var46 = arg14 - arg12;
        int var47 = arg17 - arg15;
        int var48 = arg20 - arg18;
        float var49 = (float) (arg15 * var46 - arg12 * var47);
        float var50 = (float) (arg18 * var47 - arg15 * var48) * var41;
        float var51 = (float) (arg12 * var48 - arg18 * var46) / var42;
        float var52 = (float) (arg15 * var43 - arg12 * var44);
        float var53 = (float) (arg18 * var44 - arg15 * var45) * var41;
        float var54 = (float) (arg12 * var45 - arg18 * var43) / var42;
        float var55 = (float) (var44 * var46 - var43 * var47);
        float var56 = (float) (var45 * var47 - var44 * var48) * var41;
        float var57 = (float) (var43 * var48 - var45 * var46) / var42;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field6561) {
                if (arg1 > this.field6561) {
                    arg1 = this.field6561;
                }
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                int var58 = (arg9 << 9) + var37 - arg3 * var37;
                int var59 = (arg6 << 8) + var39 - arg3 * var39;
                if (arg1 < arg2) {
                    int var60;
                    int var61 = var60 = arg3 << 16;
                    if (arg0 < 0) {
                        var61 -= arg0 * var35;
                        var60 -= arg0 * var33;
                        var58 -= arg0 * var38;
                        var59 -= arg0 * var40;
                        arg0 = 0;
                    }
                    int var62 = arg4 << 16;
                    if (arg1 < 0) {
                        var62 -= arg1 * var34;
                        arg1 = 0;
                    }
                    int var63 = arg0 - this.field6563;
                    float var64 = (float) var63 * var51 + var49;
                    float var65 = (float) var63 * var54 + var52;
                    float var66 = (float) var63 * var57 + var55;
                    if (arg0 != arg1 && var35 < var33 || arg0 == arg1 && var35 > var34) {
                        int var67 = arg2 - arg1;
                        int var68 = arg1 - arg0;
                        int var69 = this.field6553[arg0];
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var69, var61 >> 16, var62 >> 16, var59, var39, var58, var37, var64, var65, var66, var50, var53, var56);
                                    var61 += var35;
                                    var62 += var34;
                                    var58 += var38;
                                    var59 += var40;
                                    var69 += this.field6554;
                                    var64 += var51;
                                    var65 += var54;
                                    var66 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var69, var61 >> 16, var60 >> 16, var59, var39, var58, var37, var64, var65, var66, var50, var53, var56);
                            var61 += var35;
                            var60 += var33;
                            var58 += var38;
                            var59 += var40;
                            var69 += this.field6554;
                            var64 += var51;
                            var65 += var54;
                            var66 += var57;
                        }
                    } else {
                        int var70 = arg2 - arg1;
                        int var71 = arg1 - arg0;
                        int var72 = this.field6553[arg0];
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var72, var62 >> 16, var61 >> 16, var59, var39, var58, var37, var64, var65, var66, var50, var53, var56);
                                    var61 += var35;
                                    var62 += var34;
                                    var58 += var38;
                                    var59 += var40;
                                    var72 += this.field6554;
                                    var64 += var51;
                                    var65 += var54;
                                    var66 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var72, var60 >> 16, var61 >> 16, var59, var39, var58, var37, var64, var65, var66, var50, var53, var56);
                            var61 += var35;
                            var60 += var33;
                            var58 += var38;
                            var59 += var40;
                            var72 += this.field6554;
                            var64 += var51;
                            var65 += var54;
                            var66 += var57;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg3 << 16;
                    if (arg0 < 0) {
                        var74 -= arg0 * var35;
                        var73 -= arg0 * var33;
                        var58 -= arg0 * var38;
                        var59 -= arg0 * var40;
                        arg0 = 0;
                    }
                    int var75 = arg5 << 16;
                    if (arg2 < 0) {
                        var75 -= arg2 * var34;
                        arg2 = 0;
                    }
                    int var76 = arg0 - this.field6563;
                    float var77 = (float) var76 * var51 + var49;
                    float var78 = (float) var76 * var54 + var52;
                    float var79 = (float) var76 * var57 + var55;
                    if ((arg0 == arg2 || var35 >= var33) && (arg0 != arg2 || var34 <= var33)) {
                        int var83 = arg1 - arg2;
                        int var84 = arg2 - arg0;
                        int var85 = this.field6553[arg0];
                        while (true) {
                            var84--;
                            if (var84 < 0) {
                                while (true) {
                                    var83--;
                                    if (var83 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var85, var73 >> 16, var75 >> 16, var59, var39, var58, var37, var77, var78, var79, var50, var53, var56);
                                    var75 += var34;
                                    var73 += var33;
                                    var58 += var38;
                                    var59 += var40;
                                    var85 += this.field6554;
                                    var77 += var51;
                                    var78 += var54;
                                    var79 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var85, var73 >> 16, var74 >> 16, var59, var39, var58, var37, var77, var78, var79, var50, var53, var56);
                            var74 += var35;
                            var73 += var33;
                            var58 += var38;
                            var59 += var40;
                            var85 += this.field6554;
                            var77 += var51;
                            var78 += var54;
                            var79 += var57;
                        }
                    } else {
                        int var80 = arg1 - arg2;
                        int var81 = arg2 - arg0;
                        int var82 = this.field6553[arg0];
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var82, var75 >> 16, var73 >> 16, var59, var39, var58, var37, var77, var78, var79, var50, var53, var56);
                                    var75 += var34;
                                    var73 += var33;
                                    var58 += var38;
                                    var59 += var40;
                                    var82 += this.field6554;
                                    var77 += var51;
                                    var78 += var54;
                                    var79 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var82, var74 >> 16, var73 >> 16, var59, var39, var58, var37, var77, var78, var79, var50, var53, var56);
                            var74 += var35;
                            var73 += var33;
                            var58 += var38;
                            var59 += var40;
                            var82 += this.field6554;
                            var77 += var51;
                            var78 += var54;
                            var79 += var57;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field6561) {
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                if (arg0 > this.field6561) {
                    arg0 = this.field6561;
                }
                int var86 = (arg10 << 9) + var37 - arg4 * var37;
                int var87 = (arg7 << 8) + var39 - arg4 * var39;
                if (arg2 < arg0) {
                    int var88;
                    int var89 = var88 = arg4 << 16;
                    if (arg1 < 0) {
                        var89 -= arg1 * var33;
                        var88 -= arg1 * var34;
                        var86 -= arg1 * var38;
                        var87 -= arg1 * var40;
                        arg1 = 0;
                    }
                    int var90 = arg5 << 16;
                    if (arg2 < 0) {
                        var90 -= arg2 * var35;
                        arg2 = 0;
                    }
                    int var91 = arg1 - this.field6563;
                    float var92 = (float) var91 * var51 + var49;
                    float var93 = (float) var91 * var54 + var52;
                    float var94 = (float) var91 * var57 + var55;
                    if (arg1 != arg2 && var33 < var34 || arg1 == arg2 && var33 > var35) {
                        int var95 = arg0 - arg2;
                        int var96 = arg2 - arg1;
                        int var97 = this.field6553[arg1];
                        while (true) {
                            var96--;
                            if (var96 < 0) {
                                while (true) {
                                    var95--;
                                    if (var95 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var97, var89 >> 16, var90 >> 16, var87, var39, var86, var37, var92, var93, var94, var50, var53, var56);
                                    var89 += var33;
                                    var90 += var35;
                                    var86 += var38;
                                    var87 += var40;
                                    var97 += this.field6554;
                                    var92 += var51;
                                    var93 += var54;
                                    var94 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var97, var89 >> 16, var88 >> 16, var87, var39, var86, var37, var92, var93, var94, var50, var53, var56);
                            var89 += var33;
                            var88 += var34;
                            var86 += var38;
                            var87 += var40;
                            var97 += this.field6554;
                            var92 += var51;
                            var93 += var54;
                            var94 += var57;
                        }
                    } else {
                        int var98 = arg0 - arg2;
                        int var99 = arg2 - arg1;
                        int var100 = this.field6553[arg1];
                        while (true) {
                            var99--;
                            if (var99 < 0) {
                                while (true) {
                                    var98--;
                                    if (var98 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var100, var90 >> 16, var89 >> 16, var87, var39, var86, var37, var92, var93, var94, var50, var53, var56);
                                    var89 += var33;
                                    var90 += var35;
                                    var86 += var38;
                                    var87 += var40;
                                    var100 += this.field6554;
                                    var92 += var51;
                                    var93 += var54;
                                    var94 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var100, var88 >> 16, var89 >> 16, var87, var39, var86, var37, var92, var93, var94, var50, var53, var56);
                            var89 += var33;
                            var88 += var34;
                            var86 += var38;
                            var87 += var40;
                            var100 += this.field6554;
                            var92 += var51;
                            var93 += var54;
                            var94 += var57;
                        }
                    }
                } else {
                    int var101;
                    int var102 = var101 = arg4 << 16;
                    if (arg1 < 0) {
                        var102 -= arg1 * var33;
                        var101 -= arg1 * var34;
                        var86 -= arg1 * var38;
                        var87 -= arg1 * var40;
                        arg1 = 0;
                    }
                    int var103 = arg3 << 16;
                    if (arg0 < 0) {
                        var103 -= arg0 * var35;
                        arg0 = 0;
                    }
                    int var104 = arg1 - this.field6563;
                    float var105 = (float) var104 * var51 + var49;
                    float var106 = (float) var104 * var54 + var52;
                    float var107 = (float) var104 * var57 + var55;
                    if (var33 < var34) {
                        int var108 = arg2 - arg0;
                        int var109 = arg0 - arg1;
                        int var110 = this.field6553[arg1];
                        while (true) {
                            var109--;
                            if (var109 < 0) {
                                while (true) {
                                    var108--;
                                    if (var108 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var110, var103 >> 16, var101 >> 16, var87, var39, var86, var37, var105, var106, var107, var50, var53, var56);
                                    var103 += var35;
                                    var101 += var34;
                                    var86 += var38;
                                    var87 += var40;
                                    var110 += this.field6554;
                                    var105 += var51;
                                    var106 += var54;
                                    var107 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var110, var102 >> 16, var101 >> 16, var87, var39, var86, var37, var105, var106, var107, var50, var53, var56);
                            var102 += var33;
                            var101 += var34;
                            var86 += var38;
                            var87 += var40;
                            var110 += this.field6554;
                            var105 += var51;
                            var106 += var54;
                            var107 += var57;
                        }
                    } else {
                        int var111 = arg2 - arg0;
                        int var112 = arg0 - arg1;
                        int var113 = this.field6553[arg1];
                        while (true) {
                            var112--;
                            if (var112 < 0) {
                                while (true) {
                                    var111--;
                                    if (var111 < 0) {
                                        return;
                                    }
                                    this.method2728(this.field6552, this.field6559, var23, 0, 0, var113, var101 >> 16, var103 >> 16, var87, var39, var86, var37, var105, var106, var107, var50, var53, var56);
                                    var103 += var35;
                                    var101 += var34;
                                    var86 += var38;
                                    var87 += var40;
                                    var113 += this.field6554;
                                    var105 += var51;
                                    var106 += var54;
                                    var107 += var57;
                                }
                            }
                            this.method2728(this.field6552, this.field6559, var23, 0, 0, var113, var101 >> 16, var102 >> 16, var87, var39, var86, var37, var105, var106, var107, var50, var53, var56);
                            var102 += var33;
                            var101 += var34;
                            var86 += var38;
                            var87 += var40;
                            var113 += this.field6554;
                            var105 += var51;
                            var106 += var54;
                            var107 += var57;
                        }
                    }
                }
            }
        } else if (arg2 < this.field6561) {
            if (arg0 > this.field6561) {
                arg0 = this.field6561;
            }
            if (arg1 > this.field6561) {
                arg1 = this.field6561;
            }
            int var114 = (arg11 << 9) + var37 - arg5 * var37;
            int var115 = (arg8 << 8) + var39 - arg5 * var39;
            if (arg0 < arg1) {
                int var116;
                int var117 = var116 = arg5 << 16;
                if (arg2 < 0) {
                    var117 -= arg2 * var34;
                    var116 -= arg2 * var35;
                    var114 -= arg2 * var38;
                    var115 -= arg2 * var40;
                    arg2 = 0;
                }
                int var118 = arg3 << 16;
                if (arg0 < 0) {
                    var118 -= arg0 * var33;
                    arg0 = 0;
                }
                int var119 = arg2 - this.field6563;
                float var120 = (float) var119 * var51 + var49;
                float var121 = (float) var119 * var54 + var52;
                float var122 = (float) var119 * var57 + var55;
                if (var34 < var35) {
                    int var123 = arg1 - arg0;
                    int var124 = arg0 - arg2;
                    int var125 = this.field6553[arg2];
                    while (true) {
                        var124--;
                        if (var124 < 0) {
                            while (true) {
                                var123--;
                                if (var123 < 0) {
                                    return;
                                }
                                this.method2728(this.field6552, this.field6559, var23, 0, 0, var125, var117 >> 16, var118 >> 16, var115, var39, var114, var37, var120, var121, var122, var50, var53, var56);
                                var117 += var34;
                                var118 += var33;
                                var114 += var38;
                                var115 += var40;
                                var125 += this.field6554;
                                var120 += var51;
                                var121 += var54;
                                var122 += var57;
                            }
                        }
                        this.method2728(this.field6552, this.field6559, var23, 0, 0, var125, var117 >> 16, var116 >> 16, var115, var39, var114, var37, var120, var121, var122, var50, var53, var56);
                        var117 += var34;
                        var116 += var35;
                        var114 += var38;
                        var115 += var40;
                        var125 += this.field6554;
                        var120 += var51;
                        var121 += var54;
                        var122 += var57;
                    }
                } else {
                    int var126 = arg1 - arg0;
                    int var127 = arg0 - arg2;
                    int var128 = this.field6553[arg2];
                    while (true) {
                        var127--;
                        if (var127 < 0) {
                            while (true) {
                                var126--;
                                if (var126 < 0) {
                                    return;
                                }
                                this.method2728(this.field6552, this.field6559, var23, 0, 0, var128, var118 >> 16, var117 >> 16, var115, var39, var114, var37, var120, var121, var122, var50, var53, var56);
                                var117 += var34;
                                var118 += var33;
                                var114 += var38;
                                var115 += var40;
                                var128 += this.field6554;
                                var120 += var51;
                                var121 += var54;
                                var122 += var57;
                            }
                        }
                        this.method2728(this.field6552, this.field6559, var23, 0, 0, var128, var116 >> 16, var117 >> 16, var115, var39, var114, var37, var120, var121, var122, var50, var53, var56);
                        var117 += var34;
                        var116 += var35;
                        var114 += var38;
                        var115 += var40;
                        var128 += this.field6554;
                        var120 += var51;
                        var121 += var54;
                        var122 += var57;
                    }
                }
            } else {
                int var129;
                int var130 = var129 = arg5 << 16;
                if (arg2 < 0) {
                    var130 -= arg2 * var34;
                    var129 -= arg2 * var35;
                    var114 -= arg2 * var38;
                    var115 -= arg2 * var40;
                    arg2 = 0;
                }
                int var131 = arg4 << 16;
                if (arg1 < 0) {
                    var131 -= arg1 * var33;
                    arg1 = 0;
                }
                int var132 = arg2 - this.field6563;
                float var133 = (float) var132 * var51 + var49;
                float var134 = (float) var132 * var54 + var52;
                float var135 = (float) var132 * var57 + var55;
                if (var34 < var35) {
                    int var136 = arg0 - arg1;
                    int var137 = arg1 - arg2;
                    int var138 = this.field6553[arg2];
                    while (true) {
                        var137--;
                        if (var137 < 0) {
                            while (true) {
                                var136--;
                                if (var136 < 0) {
                                    return;
                                }
                                this.method2728(this.field6552, this.field6559, var23, 0, 0, var138, var131 >> 16, var129 >> 16, var115, var39, var114, var37, var133, var134, var135, var50, var53, var56);
                                var131 += var33;
                                var129 += var35;
                                var114 += var38;
                                var115 += var40;
                                var138 += this.field6554;
                                var133 += var51;
                                var134 += var54;
                                var135 += var57;
                            }
                        }
                        this.method2728(this.field6552, this.field6559, var23, 0, 0, var138, var130 >> 16, var129 >> 16, var115, var39, var114, var37, var133, var134, var135, var50, var53, var56);
                        var130 += var34;
                        var129 += var35;
                        var114 += var38;
                        var115 += var40;
                        var138 += this.field6554;
                        var133 += var51;
                        var134 += var54;
                        var135 += var57;
                    }
                } else {
                    int var139 = arg0 - arg1;
                    int var140 = arg1 - arg2;
                    int var141 = this.field6553[arg2];
                    while (true) {
                        var140--;
                        if (var140 < 0) {
                            while (true) {
                                var139--;
                                if (var139 < 0) {
                                    return;
                                }
                                this.method2728(this.field6552, this.field6559, var23, 0, 0, var141, var129 >> 16, var131 >> 16, var115, var39, var114, var37, var133, var134, var135, var50, var53, var56);
                                var131 += var33;
                                var129 += var35;
                                var114 += var38;
                                var115 += var40;
                                var141 += this.field6554;
                                var133 += var51;
                                var134 += var54;
                                var135 += var57;
                            }
                        }
                        this.method2728(this.field6552, this.field6559, var23, 0, 0, var141, var129 >> 16, var130 >> 16, var115, var39, var114, var37, var133, var134, var135, var50, var53, var56);
                        var130 += var34;
                        var129 += var35;
                        var114 += var38;
                        var115 += var40;
                        var141 += this.field6554;
                        var133 += var51;
                        var134 += var54;
                        var135 += var57;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
    private static final int method2737(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public final void method2738(boolean arg0) {
        this.field6565 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
    private final void method2739(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19) {
        if (this.field6568 == 0) {
            if (this.field6562.field5936) {
                this.method2734(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            } else {
                this.method2742(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            }
        } else if (this.field6562.field5936) {
            this.method2730(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
        } else {
            this.method2723(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
    private final void method2740(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17) {
        int var19 = arg7 - arg6;
        int var10000;
        if (!this.field6560) {
            int var90 = arg6 - this.field6557;
            float var91 = arg15 / 8.0F * (float) var90 + arg12;
            float var92 = arg16 / 8.0F * (float) var90 + arg13;
            float var93 = arg17 / 8.0F * (float) var90 + arg14;
            int var94;
            int var95;
            if (var93 == 0.0F) {
                var94 = 0;
                var95 = 0;
            } else {
                var94 = (int) (var91 * 16384.0F / var93);
                var95 = (int) (var92 * 16384.0F / var93);
            }
            float var96 = arg15 + var91;
            float var97 = arg16 + var92;
            float var98 = arg17 + var93;
            int var99;
            int var100;
            if (var98 == 0.0F) {
                var99 = 0;
                var100 = 0;
            } else {
                var99 = (int) (var96 * 16384.0F / var98);
                var100 = (int) (var97 * 16384.0F / var98);
            }
            int var101 = (var94 << 18) + var95;
            int var102 = (var99 - var94 >> 3 << 18) + (var100 - var95 >> 3);
            int var103 = var19 >> 3;
            int var104 = arg11 << 3;
            int var105 = arg10 >> 8;
            if (this.field6567) {
                if (var103 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var106 = arg2[(var101 >>> 25) + (var101 & 0x3F80)];
                            arg0[arg5] = ((var106 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var106 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        int var107 = arg8 + arg9;
                        int var108 = var101 + var102;
                        arg5++;
                        if (var107 < arg1[arg5]) {
                            int var109 = arg2[(var108 >>> 25) + (var108 & 0x3F80)];
                            arg0[arg5] = ((var109 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var109 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var107;
                        }
                        int var110 = arg9 + var107;
                        int var111 = var102 + var108;
                        arg5++;
                        if (var110 < arg1[arg5]) {
                            int var112 = arg2[(var111 >>> 25) + (var111 & 0x3F80)];
                            arg0[arg5] = ((var112 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var112 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var110;
                        }
                        int var113 = arg9 + var110;
                        int var114 = var102 + var111;
                        arg5++;
                        if (var113 < arg1[arg5]) {
                            int var115 = arg2[(var114 >>> 25) + (var114 & 0x3F80)];
                            arg0[arg5] = ((var115 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var115 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var113;
                        }
                        int var116 = arg9 + var113;
                        int var117 = var102 + var114;
                        arg5++;
                        if (var116 < arg1[arg5]) {
                            int var118 = arg2[(var117 >>> 25) + (var117 & 0x3F80)];
                            arg0[arg5] = ((var118 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var118 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var116;
                        }
                        int var119 = arg9 + var116;
                        int var120 = var102 + var117;
                        arg5++;
                        if (var119 < arg1[arg5]) {
                            int var121 = arg2[(var120 >>> 25) + (var120 & 0x3F80)];
                            arg0[arg5] = ((var121 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var121 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var119;
                        }
                        int var122 = arg9 + var119;
                        int var123 = var102 + var120;
                        arg5++;
                        if (var122 < arg1[arg5]) {
                            int var124 = arg2[(var123 >>> 25) + (var123 & 0x3F80)];
                            arg0[arg5] = ((var124 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var124 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var122;
                        }
                        int var125 = arg9 + var122;
                        int var126 = var102 + var123;
                        arg5++;
                        if (var125 < arg1[arg5]) {
                            int var127 = arg2[(var126 >>> 25) + (var126 & 0x3F80)];
                            arg0[arg5] = ((var127 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var127 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var125;
                        }
                        arg8 = arg9 + var125;
                        var10000 = var102 + var126;
                        arg5++;
                        int var129 = var99;
                        int var130 = var100;
                        var96 += arg15;
                        var97 += arg16;
                        var98 += arg17;
                        if (var98 == 0.0F) {
                            var99 = 0;
                            var100 = 0;
                        } else {
                            var99 = (int) (var96 * 16384.0F / var98);
                            var100 = (int) (var97 * 16384.0F / var98);
                        }
                        var101 = (var129 << 18) + var130;
                        var102 = (var99 - var129 >> 3 << 18) + (var100 - var130 >> 3);
                        arg10 += var104;
                        var105 = arg10 >> 8;
                        var103--;
                    } while (var103 > 0);
                }
                int var131 = arg7 - arg6 & 0x7;
                if (var131 > 0) {
                    do {
                        if (arg8 < arg1[arg5]) {
                            int var132 = arg2[(var101 >>> 25) + (var101 & 0x3F80)];
                            arg0[arg5] = ((var132 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var132 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        arg8 += arg9;
                        var101 += var102;
                        arg5++;
                        var131--;
                    } while (var131 > 0);
                    return;
                }
            } else {
                if (var103 > 0) {
                    do {
                        int var133;
                        if (arg8 < arg1[arg5] && (var133 = arg2[(var101 >>> 25) + (var101 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var133 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var133 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        int var134 = arg8 + arg9;
                        int var135 = var101 + var102;
                        arg5++;
                        int var136;
                        if (var134 < arg1[arg5] && (var136 = arg2[(var135 >>> 25) + (var135 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var136 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var136 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var134;
                        }
                        int var137 = arg9 + var134;
                        int var138 = var102 + var135;
                        arg5++;
                        int var139;
                        if (var137 < arg1[arg5] && (var139 = arg2[(var138 >>> 25) + (var138 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var139 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var139 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var137;
                        }
                        int var140 = arg9 + var137;
                        int var141 = var102 + var138;
                        arg5++;
                        int var142;
                        if (var140 < arg1[arg5] && (var142 = arg2[(var141 >>> 25) + (var141 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var142 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var142 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var140;
                        }
                        int var143 = arg9 + var140;
                        int var144 = var102 + var141;
                        arg5++;
                        int var145;
                        if (var143 < arg1[arg5] && (var145 = arg2[(var144 >>> 25) + (var144 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var145 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var145 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var143;
                        }
                        int var146 = arg9 + var143;
                        int var147 = var102 + var144;
                        arg5++;
                        int var148;
                        if (var146 < arg1[arg5] && (var148 = arg2[(var147 >>> 25) + (var147 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var148 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var148 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var146;
                        }
                        int var149 = arg9 + var146;
                        int var150 = var102 + var147;
                        arg5++;
                        int var151;
                        if (var149 < arg1[arg5] && (var151 = arg2[(var150 >>> 25) + (var150 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var151 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var151 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var149;
                        }
                        int var152 = arg9 + var149;
                        int var153 = var102 + var150;
                        arg5++;
                        int var154;
                        if (var152 < arg1[arg5] && (var154 = arg2[(var153 >>> 25) + (var153 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var154 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var154 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = var152;
                        }
                        arg8 = arg9 + var152;
                        var10000 = var102 + var153;
                        arg5++;
                        int var156 = var99;
                        int var157 = var100;
                        var96 += arg15;
                        var97 += arg16;
                        var98 += arg17;
                        if (var98 == 0.0F) {
                            var99 = 0;
                            var100 = 0;
                        } else {
                            var99 = (int) (var96 / var98 * 16384.0F);
                            var100 = (int) (var97 / var98 * 16384.0F);
                        }
                        var101 = (var156 << 18) + var157;
                        var102 = (var99 - var156 >> 3 << 18) + (var100 - var157 >> 3);
                        arg10 += var104;
                        var105 = arg10 >> 8;
                        var103--;
                    } while (var103 > 0);
                }
                int var158 = arg7 - arg6 & 0x7;
                if (var158 > 0) {
                    do {
                        int var159;
                        if (arg8 < arg1[arg5] && (var159 = arg2[(var101 >>> 25) + (var101 & 0x3F80)]) != 0) {
                            arg0[arg5] = ((var159 & 0xFF00FF) * var105 & 0xFF00FF00) + ((var159 & 0xFF00) * var105 & 0xFF0000) >> 8;
                            arg1[arg5] = arg8;
                        }
                        arg8 += arg9;
                        var101 += var102;
                        arg5++;
                        var158--;
                    } while (var158 > 0);
                }
            }
            return;
        }
        int var20 = arg6 - this.field6557;
        float var21 = arg15 / 8.0F * (float) var20 + arg12;
        float var22 = arg16 / 8.0F * (float) var20 + arg13;
        float var23 = arg17 / 8.0F * (float) var20 + arg14;
        int var24;
        int var25;
        if (var23 == 0.0F) {
            var24 = 0;
            var25 = 0;
        } else {
            var24 = (int) (var21 * 4096.0F / var23);
            var25 = (int) (var22 * 4096.0F / var23);
        }
        float var26 = arg15 + var21;
        float var27 = arg16 + var22;
        float var28 = arg17 + var23;
        int var29;
        int var30;
        if (var28 == 0.0F) {
            var29 = 0;
            var30 = 0;
        } else {
            var29 = (int) (var26 * 4096.0F / var28);
            var30 = (int) (var27 * 4096.0F / var28);
        }
        int var31 = (var24 << 20) + var25;
        int var32 = (var29 - var24 >> 3 << 20) + (var30 - var25 >> 3);
        int var33 = var19 >> 3;
        int var34 = arg11 << 3;
        int var35 = arg10 >> 8;
        if (this.field6567) {
            if (var33 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var36 = arg2[(var31 >>> 26) + (var31 & 0xFC0)];
                        arg0[arg5] = ((var36 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var36 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = arg8;
                    }
                    int var37 = arg8 + arg9;
                    int var38 = var31 + var32;
                    arg5++;
                    if (var37 < arg1[arg5]) {
                        int var39 = arg2[(var38 >>> 26) + (var38 & 0xFC0)];
                        arg0[arg5] = ((var39 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var39 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var37;
                    }
                    int var40 = arg9 + var37;
                    int var41 = var32 + var38;
                    arg5++;
                    if (var40 < arg1[arg5]) {
                        int var42 = arg2[(var41 >>> 26) + (var41 & 0xFC0)];
                        arg0[arg5] = ((var42 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var42 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var40;
                    }
                    int var43 = arg9 + var40;
                    int var44 = var32 + var41;
                    arg5++;
                    if (var43 < arg1[arg5]) {
                        int var45 = arg2[(var44 >>> 26) + (var44 & 0xFC0)];
                        arg0[arg5] = ((var45 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var45 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var43;
                    }
                    int var46 = arg9 + var43;
                    int var47 = var32 + var44;
                    arg5++;
                    if (var46 < arg1[arg5]) {
                        int var48 = arg2[(var47 >>> 26) + (var47 & 0xFC0)];
                        arg0[arg5] = ((var48 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var48 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var46;
                    }
                    int var49 = arg9 + var46;
                    int var50 = var32 + var47;
                    arg5++;
                    if (var49 < arg1[arg5]) {
                        int var51 = arg2[(var50 >>> 26) + (var50 & 0xFC0)];
                        arg0[arg5] = ((var51 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var51 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var49;
                    }
                    int var52 = arg9 + var49;
                    int var53 = var32 + var50;
                    arg5++;
                    if (var52 < arg1[arg5]) {
                        int var54 = arg2[(var53 >>> 26) + (var53 & 0xFC0)];
                        arg0[arg5] = ((var54 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var54 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var52;
                    }
                    int var55 = arg9 + var52;
                    int var56 = var32 + var53;
                    arg5++;
                    if (var55 < arg1[arg5]) {
                        int var57 = arg2[(var56 >>> 26) + (var56 & 0xFC0)];
                        arg0[arg5] = ((var57 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var57 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = var55;
                    }
                    arg8 = arg9 + var55;
                    var10000 = var32 + var56;
                    arg5++;
                    int var59 = var29;
                    int var60 = var30;
                    var26 += arg15;
                    var27 += arg16;
                    var28 += arg17;
                    if (var28 == 0.0F) {
                        var29 = 0;
                        var30 = 0;
                    } else {
                        var29 = (int) (var26 * 4096.0F / var28);
                        var30 = (int) (var27 * 4096.0F / var28);
                    }
                    var31 = (var59 << 20) + var60;
                    var32 = (var29 - var59 >> 3 << 20) + (var30 - var60 >> 3);
                    arg10 += var34;
                    var35 = arg10 >> 8;
                    var33--;
                } while (var33 > 0);
            }
            int var61 = arg7 - arg6 & 0x7;
            if (var61 > 0) {
                do {
                    if (arg8 < arg1[arg5]) {
                        int var62 = arg2[(var31 >>> 26) + (var31 & 0xFC0)];
                        arg0[arg5] = ((var62 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var62 & 0xFF00) * var35 & 0xFF0000) >> 8;
                        arg1[arg5] = arg8;
                    }
                    arg8 += arg9;
                    var31 += var32;
                    arg5++;
                    var61--;
                } while (var61 > 0);
                return;
            }
            return;
        }
        if (var33 > 0) {
            do {
                int var63;
                if (arg8 < arg1[arg5] && (var63 = arg2[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var63 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var63 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = arg8;
                }
                int var64 = arg8 + arg9;
                int var65 = var31 + var32;
                arg5++;
                int var66;
                if (var64 < arg1[arg5] && (var66 = arg2[(var65 >>> 26) + (var65 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var66 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var66 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var64;
                }
                int var67 = arg9 + var64;
                int var68 = var32 + var65;
                arg5++;
                int var69;
                if (var67 < arg1[arg5] && (var69 = arg2[(var68 >>> 26) + (var68 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var69 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var69 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var67;
                }
                int var70 = arg9 + var67;
                int var71 = var32 + var68;
                arg5++;
                int var72;
                if (var70 < arg1[arg5] && (var72 = arg2[(var71 >>> 26) + (var71 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var72 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var72 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var70;
                }
                int var73 = arg9 + var70;
                int var74 = var32 + var71;
                arg5++;
                int var75;
                if (var73 < arg1[arg5] && (var75 = arg2[(var74 >>> 26) + (var74 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var75 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var75 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var73;
                }
                int var76 = arg9 + var73;
                int var77 = var32 + var74;
                arg5++;
                int var78;
                if (var76 < arg1[arg5] && (var78 = arg2[(var77 >>> 26) + (var77 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var78 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var78 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var76;
                }
                int var79 = arg9 + var76;
                int var80 = var32 + var77;
                arg5++;
                int var81;
                if (var79 < arg1[arg5] && (var81 = arg2[(var80 >>> 26) + (var80 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var81 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var81 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var79;
                }
                int var82 = arg9 + var79;
                int var83 = var32 + var80;
                arg5++;
                int var84;
                if (var82 < arg1[arg5] && (var84 = arg2[(var83 >>> 26) + (var83 & 0xFC0)]) != 0) {
                    arg0[arg5] = ((var84 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var84 & 0xFF00) * var35 & 0xFF0000) >> 8;
                    arg1[arg5] = var82;
                }
                arg8 = arg9 + var82;
                var10000 = var32 + var83;
                arg5++;
                int var86 = var29;
                int var87 = var30;
                var26 += arg15;
                var27 += arg16;
                var28 += arg17;
                if (var28 == 0.0F) {
                    var29 = 0;
                    var30 = 0;
                } else {
                    var29 = (int) (var26 * 4096.0F / var28);
                    var30 = (int) (var27 * 4096.0F / var28);
                }
                var31 = (var86 << 20) + var87;
                var32 = (var29 - var86 >> 3 << 20) + (var30 - var87 >> 3);
                arg10 += var34;
                var35 = arg10 >> 8;
                var33--;
            } while (var33 > 0);
        }
        int var88 = arg7 - arg6 & 0x7;
        if (var88 <= 0) {
            return;
        }
        do {
            int var89;
            if (arg8 < arg1[arg5] && (var89 = arg2[(var31 >>> 26) + (var31 & 0xFC0)]) != 0) {
                arg0[arg5] = ((var89 & 0xFF00FF) * var35 & 0xFF00FF00) + ((var89 & 0xFF00) * var35 & 0xFF0000) >> 8;
                arg1[arg5] = arg8;
            }
            arg8 += arg9;
            var31 += var32;
            arg5++;
            var88--;
        } while (var88 > 0);
        return;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIIIIIIIIIII)V")
    public final void method2741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (this.field6565) {
            this.field6555.method1354(arg9 | 0xFF000000, arg0, arg1, 124, arg3, arg4);
            this.field6555.method1354(arg9 | 0xFF000000, arg1, arg2, -111, arg4, arg5);
            this.field6555.method1354(arg9 | 0xFF000000, arg2, arg0, 62, arg5, arg3);
            return;
        }
        int var13 = arg4 - arg3;
        int var14 = arg1 - arg0;
        int var15 = arg5 - arg3;
        int var16 = arg2 - arg0;
        int var17 = arg7 - arg6;
        int var18 = arg8 - arg6;
        int var19 = (arg10 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
        int var20 = (arg11 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
        int var21 = (arg10 & 0xFF00) - (arg9 & 0xFF00);
        int var22 = (arg11 & 0xFF00) - (arg9 & 0xFF00);
        int var23 = (arg10 & 0xFF) - (arg9 & 0xFF);
        int var24 = (arg11 & 0xFF) - (arg9 & 0xFF);
        int var25;
        if (arg1 == arg2) {
            var25 = 0;
        } else {
            var25 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var26;
        if (arg0 == arg1) {
            var26 = 0;
        } else {
            var26 = (var13 << 16) / var14;
        }
        int var27;
        if (arg0 == arg2) {
            var27 = 0;
        } else {
            var27 = (var15 << 16) / var16;
        }
        int var28 = var13 * var16 - var14 * var15;
        if (var28 == 0) {
            return;
        }
        int var29 = (var16 * var17 - var14 * var18 << 8) / var28;
        int var30 = (var13 * var18 - var15 * var17 << 8) / var28;
        int var31 = (var16 * var19 - var14 * var20) / var28;
        int var32 = (var13 * var20 - var15 * var19) / var28;
        int var33 = (var16 * var21 - var14 * var22) / var28;
        int var34 = (var13 * var22 - var15 * var21) / var28;
        int var35 = (var16 * var23 - var14 * var24 << 8) / var28;
        int var36 = (var13 * var24 - var15 * var23 << 8) / var28;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < this.field6561) {
                if (arg1 > this.field6561) {
                    arg1 = this.field6561;
                }
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                int var37 = (arg6 << 8) + var29 - arg3 * var29;
                int var38 = ((arg9 & 0xFF0000) >> 8) + var31 - arg3 * var31;
                int var39 = (arg9 & 0xFF00) + var33 - arg3 * var33;
                int var40 = ((arg9 & 0xFF) << 8) + var35 - arg3 * var35;
                if (arg1 < arg2) {
                    int var41;
                    int var42 = var41 = arg3 << 16;
                    if (arg0 < 0) {
                        var42 -= arg0 * var27;
                        var41 -= arg0 * var26;
                        var37 -= arg0 * var30;
                        var38 -= arg0 * var32;
                        var39 -= arg0 * var34;
                        var40 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var43 = arg4 << 16;
                    if (arg1 < 0) {
                        var43 -= arg1 * var25;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var27 < var26 || arg0 == arg1 && var27 > var25) {
                        int var44 = arg2 - arg1;
                        int var45 = arg1 - arg0;
                        int var46 = this.field6553[arg0];
                        while (true) {
                            var45--;
                            if (var45 < 0) {
                                while (true) {
                                    var44--;
                                    if (var44 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var46, 0, 0, var42 >> 16, var43 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                                    var42 += var27;
                                    var43 += var25;
                                    var37 += var30;
                                    var38 += var32;
                                    var39 += var34;
                                    var40 += var36;
                                    var46 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var46, 0, 0, var42 >> 16, var41 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                            var42 += var27;
                            var41 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var46 += this.field6554;
                        }
                    } else {
                        int var47 = arg2 - arg1;
                        int var48 = arg1 - arg0;
                        int var49 = this.field6553[arg0];
                        while (true) {
                            var48--;
                            if (var48 < 0) {
                                while (true) {
                                    var47--;
                                    if (var47 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var49, 0, 0, var43 >> 16, var42 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                                    var42 += var27;
                                    var43 += var25;
                                    var37 += var30;
                                    var38 += var32;
                                    var39 += var34;
                                    var40 += var36;
                                    var49 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var49, 0, 0, var41 >> 16, var42 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                            var42 += var27;
                            var41 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var49 += this.field6554;
                        }
                    }
                } else {
                    int var50;
                    int var51 = var50 = arg3 << 16;
                    if (arg0 < 0) {
                        var51 -= arg0 * var27;
                        var50 -= arg0 * var26;
                        var37 -= arg0 * var30;
                        var38 -= arg0 * var32;
                        var39 -= arg0 * var34;
                        var40 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var52 = arg5 << 16;
                    if (arg2 < 0) {
                        var52 -= arg2 * var25;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var27 < var26 || arg0 == arg2 && var25 > var26) {
                        int var53 = arg1 - arg2;
                        int var54 = arg2 - arg0;
                        int var55 = this.field6553[arg0];
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                while (true) {
                                    var53--;
                                    if (var53 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var55, 0, 0, var52 >> 16, var50 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                                    var52 += var25;
                                    var50 += var26;
                                    var37 += var30;
                                    var38 += var32;
                                    var39 += var34;
                                    var40 += var36;
                                    var55 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var55, 0, 0, var51 >> 16, var50 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                            var51 += var27;
                            var50 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var55 += this.field6554;
                        }
                    } else {
                        int var56 = arg1 - arg2;
                        int var57 = arg2 - arg0;
                        int var58 = this.field6553[arg0];
                        while (true) {
                            var57--;
                            if (var57 < 0) {
                                while (true) {
                                    var56--;
                                    if (var56 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var58, 0, 0, var50 >> 16, var52 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                                    var52 += var25;
                                    var50 += var26;
                                    var37 += var30;
                                    var38 += var32;
                                    var39 += var34;
                                    var40 += var36;
                                    var58 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var58, 0, 0, var50 >> 16, var51 >> 16, var37, var29, var38, var31, var39, var33, var40, var35);
                            var51 += var27;
                            var50 += var26;
                            var37 += var30;
                            var38 += var32;
                            var39 += var34;
                            var40 += var36;
                            var58 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < this.field6561) {
                if (arg2 > this.field6561) {
                    arg2 = this.field6561;
                }
                if (arg0 > this.field6561) {
                    arg0 = this.field6561;
                }
                int var59 = (arg7 << 8) + var29 - arg4 * var29;
                int var60 = ((arg10 & 0xFF0000) >> 8) + var31 - arg4 * var31;
                int var61 = (arg10 & 0xFF00) + var33 - arg4 * var33;
                int var62 = ((arg10 & 0xFF) << 8) + var35 - arg4 * var35;
                if (arg2 < arg0) {
                    int var63;
                    int var64 = var63 = arg4 << 16;
                    if (arg1 < 0) {
                        var64 -= arg1 * var26;
                        var63 -= arg1 * var25;
                        var59 -= arg1 * var30;
                        var60 -= arg1 * var32;
                        var61 -= arg1 * var34;
                        var62 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var65 = arg5 << 16;
                    if (arg2 < 0) {
                        var65 -= arg2 * var27;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var26 < var25 || arg1 == arg2 && var26 > var27) {
                        int var66 = arg0 - arg2;
                        int var67 = arg2 - arg1;
                        int var68 = this.field6553[arg1];
                        while (true) {
                            var67--;
                            if (var67 < 0) {
                                while (true) {
                                    var66--;
                                    if (var66 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var68, 0, 0, var64 >> 16, var65 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                                    var64 += var26;
                                    var65 += var27;
                                    var59 += var30;
                                    var60 += var32;
                                    var61 += var34;
                                    var62 += var36;
                                    var68 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var68, 0, 0, var64 >> 16, var63 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                            var64 += var26;
                            var63 += var25;
                            var59 += var30;
                            var60 += var32;
                            var61 += var34;
                            var62 += var36;
                            var68 += this.field6554;
                        }
                    } else {
                        int var69 = arg0 - arg2;
                        int var70 = arg2 - arg1;
                        int var71 = this.field6553[arg1];
                        while (true) {
                            var70--;
                            if (var70 < 0) {
                                while (true) {
                                    var69--;
                                    if (var69 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var71, 0, 0, var65 >> 16, var64 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                                    var64 += var26;
                                    var65 += var27;
                                    var59 += var30;
                                    var60 += var32;
                                    var61 += var34;
                                    var62 += var36;
                                    var71 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var71, 0, 0, var63 >> 16, var64 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                            var64 += var26;
                            var63 += var25;
                            var59 += var30;
                            var60 += var32;
                            var61 += var34;
                            var62 += var36;
                            var71 += this.field6554;
                        }
                    }
                } else {
                    int var72;
                    int var73 = var72 = arg4 << 16;
                    if (arg1 < 0) {
                        var73 -= arg1 * var26;
                        var72 -= arg1 * var25;
                        var59 -= arg1 * var30;
                        var60 -= arg1 * var32;
                        var61 -= arg1 * var34;
                        var62 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var74 = arg3 << 16;
                    if (arg0 < 0) {
                        var74 -= arg0 * var27;
                        arg0 = 0;
                    }
                    if (var26 < var25) {
                        int var75 = arg2 - arg0;
                        int var76 = arg0 - arg1;
                        int var77 = this.field6553[arg1];
                        while (true) {
                            var76--;
                            if (var76 < 0) {
                                while (true) {
                                    var75--;
                                    if (var75 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var77, 0, 0, var74 >> 16, var72 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                                    var74 += var27;
                                    var72 += var25;
                                    var59 += var30;
                                    var60 += var32;
                                    var61 += var34;
                                    var62 += var36;
                                    var77 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var77, 0, 0, var73 >> 16, var72 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                            var73 += var26;
                            var72 += var25;
                            var59 += var30;
                            var60 += var32;
                            var61 += var34;
                            var62 += var36;
                            var77 += this.field6554;
                        }
                    } else {
                        int var78 = arg2 - arg0;
                        int var79 = arg0 - arg1;
                        int var80 = this.field6553[arg1];
                        while (true) {
                            var79--;
                            if (var79 < 0) {
                                while (true) {
                                    var78--;
                                    if (var78 < 0) {
                                        return;
                                    }
                                    this.method2732(this.field6552, this.field6559, var80, 0, 0, var72 >> 16, var74 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                                    var74 += var27;
                                    var72 += var25;
                                    var59 += var30;
                                    var60 += var32;
                                    var61 += var34;
                                    var62 += var36;
                                    var80 += this.field6554;
                                }
                            }
                            this.method2732(this.field6552, this.field6559, var80, 0, 0, var72 >> 16, var73 >> 16, var59, var29, var60, var31, var61, var33, var62, var35);
                            var73 += var26;
                            var72 += var25;
                            var59 += var30;
                            var60 += var32;
                            var61 += var34;
                            var62 += var36;
                            var80 += this.field6554;
                        }
                    }
                }
            }
        } else if (arg2 < this.field6561) {
            if (arg0 > this.field6561) {
                arg0 = this.field6561;
            }
            if (arg1 > this.field6561) {
                arg1 = this.field6561;
            }
            int var81 = (arg8 << 8) + var29 - arg5 * var29;
            int var82 = ((arg11 & 0xFF0000) >> 8) + var31 - arg5 * var31;
            int var83 = (arg11 & 0xFF00) + var33 - arg5 * var33;
            int var84 = ((arg11 & 0xFF) << 8) + var35 - arg5 * var35;
            if (arg0 < arg1) {
                int var85;
                int var86 = var85 = arg5 << 16;
                if (arg2 < 0) {
                    var86 -= arg2 * var25;
                    var85 -= arg2 * var27;
                    var81 -= arg2 * var30;
                    var82 -= arg2 * var32;
                    var83 -= arg2 * var34;
                    var84 -= arg2 * var36;
                    arg2 = 0;
                }
                int var87 = arg3 << 16;
                if (arg0 < 0) {
                    var87 -= arg0 * var26;
                    arg0 = 0;
                }
                if (var25 < var27) {
                    int var88 = arg1 - arg0;
                    int var89 = arg0 - arg2;
                    int var90 = this.field6553[arg2];
                    while (true) {
                        var89--;
                        if (var89 < 0) {
                            while (true) {
                                var88--;
                                if (var88 < 0) {
                                    return;
                                }
                                this.method2732(this.field6552, this.field6559, var90, 0, 0, var86 >> 16, var87 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                                var86 += var25;
                                var87 += var26;
                                var81 += var30;
                                var82 += var32;
                                var83 += var34;
                                var84 += var36;
                                var90 += this.field6554;
                            }
                        }
                        this.method2732(this.field6552, this.field6559, var90, 0, 0, var86 >> 16, var85 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                        var86 += var25;
                        var85 += var27;
                        var81 += var30;
                        var82 += var32;
                        var83 += var34;
                        var84 += var36;
                        var90 += this.field6554;
                    }
                } else {
                    int var91 = arg1 - arg0;
                    int var92 = arg0 - arg2;
                    int var93 = this.field6553[arg2];
                    while (true) {
                        var92--;
                        if (var92 < 0) {
                            while (true) {
                                var91--;
                                if (var91 < 0) {
                                    return;
                                }
                                this.method2732(this.field6552, this.field6559, var93, 0, 0, var87 >> 16, var86 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                                var86 += var25;
                                var87 += var26;
                                var81 += var30;
                                var82 += var32;
                                var83 += var34;
                                var84 += var36;
                                var93 += this.field6554;
                            }
                        }
                        this.method2732(this.field6552, this.field6559, var93, 0, 0, var85 >> 16, var86 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                        var86 += var25;
                        var85 += var27;
                        var81 += var30;
                        var82 += var32;
                        var83 += var34;
                        var84 += var36;
                        var93 += this.field6554;
                    }
                }
            } else {
                int var94;
                int var95 = var94 = arg5 << 16;
                if (arg2 < 0) {
                    var95 -= arg2 * var25;
                    var94 -= arg2 * var27;
                    var81 -= arg2 * var30;
                    var82 -= arg2 * var32;
                    var83 -= arg2 * var34;
                    var84 -= arg2 * var36;
                    arg2 = 0;
                }
                int var96 = arg4 << 16;
                if (arg1 < 0) {
                    var96 -= arg1 * var26;
                    arg1 = 0;
                }
                if (var25 < var27) {
                    int var97 = arg0 - arg1;
                    int var98 = arg1 - arg2;
                    int var99 = this.field6553[arg2];
                    while (true) {
                        var98--;
                        if (var98 < 0) {
                            while (true) {
                                var97--;
                                if (var97 < 0) {
                                    return;
                                }
                                this.method2732(this.field6552, this.field6559, var99, 0, 0, var96 >> 16, var94 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                                var96 += var26;
                                var94 += var27;
                                var81 += var30;
                                var82 += var32;
                                var83 += var34;
                                var84 += var36;
                                var99 += this.field6554;
                            }
                        }
                        this.method2732(this.field6552, this.field6559, var99, 0, 0, var95 >> 16, var94 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                        var95 += var25;
                        var94 += var27;
                        var81 += var30;
                        var82 += var32;
                        var83 += var34;
                        var84 += var36;
                        var99 += this.field6554;
                    }
                } else {
                    int var100 = arg0 - arg1;
                    int var101 = arg1 - arg2;
                    int var102 = this.field6553[arg2];
                    while (true) {
                        var101--;
                        if (var101 < 0) {
                            while (true) {
                                var100--;
                                if (var100 < 0) {
                                    return;
                                }
                                this.method2732(this.field6552, this.field6559, var102, 0, 0, var94 >> 16, var96 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                                var96 += var26;
                                var94 += var27;
                                var81 += var30;
                                var82 += var32;
                                var83 += var34;
                                var84 += var36;
                                var102 += this.field6554;
                            }
                        }
                        this.method2732(this.field6552, this.field6559, var102, 0, 0, var94 >> 16, var95 >> 16, var81, var29, var82, var31, var83, var33, var84, var35);
                        var95 += var25;
                        var94 += var27;
                        var81 += var30;
                        var82 += var32;
                        var83 += var34;
                        var84 += var36;
                        var102 += this.field6554;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
    private final void method2742(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19) {
        if (this.field6556) {
            if (arg6 > this.field6566) {
                arg6 = this.field6566;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var21 = arg4 + arg5;
        int var22 = arg5 * arg10 + arg9;
        int var23 = arg5 * arg13 + arg12;
        int var24 = arg5 * arg8 + arg7;
        int var25 = arg6 - arg5;
        int var26 = arg10 << 3;
        int var27 = var22 >> 16;
        int var28 = 255 - var27;
        int var29 = ((arg11 & 0xFF00FF) * var27 & 0xFF00FF00 | (arg11 & 0xFF00) * var27 & 0xFF0000) >>> 8;
        int var10000;
        if (!this.field6560) {
            int var120 = arg5 - this.field6557;
            float var121 = arg17 / 8.0F * (float) var120 + arg14;
            float var122 = arg18 / 8.0F * (float) var120 + arg15;
            float var123 = arg19 / 8.0F * (float) var120 + arg16;
            int var124;
            int var125;
            if (var123 == 0.0F) {
                var124 = 0;
                var125 = 0;
            } else {
                var124 = (int) (var121 * 16384.0F / var123);
                var125 = (int) (var122 * 16384.0F / var123);
            }
            float var126 = arg17 + var121;
            float var127 = arg18 + var122;
            float var128 = arg19 + var123;
            int var129;
            int var130;
            if (var128 == 0.0F) {
                var129 = 0;
                var130 = 0;
            } else {
                var129 = (int) (var126 * 16384.0F / var128);
                var130 = (int) (var127 * 16384.0F / var128);
            }
            int var131 = (var124 << 18) + var125;
            int var132 = (var129 - var124 >> 3 << 18) + (var130 - var125 >> 3);
            int var133 = var25 >> 3;
            int var134 = arg13 << 3;
            int var135 = var23 >> 8;
            if (this.field6567) {
                if (var133 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var136 = arg1[(var131 >>> 25) + (var131 & 0x3F80)];
                            int var137 = ((var136 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var136 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var137 & 0xFF00FF) * var28 & 0xFF00FF00 | (var137 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var138 = var131 + var132;
                        var21++;
                        int var139 = arg8 + var24;
                        if (var139 < this.field6559[var21]) {
                            int var140 = arg1[(var138 >>> 25) + (var138 & 0x3F80)];
                            int var141 = ((var140 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var140 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var141 & 0xFF00FF) * var28 & 0xFF00FF00 | (var141 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var142 = var132 + var138;
                        var21++;
                        int var143 = arg8 + var139;
                        if (var143 < this.field6559[var21]) {
                            int var144 = arg1[(var142 >>> 25) + (var142 & 0x3F80)];
                            int var145 = ((var144 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var144 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var145 & 0xFF00FF) * var28 & 0xFF00FF00 | (var145 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var146 = var132 + var142;
                        var21++;
                        int var147 = arg8 + var143;
                        if (var147 < this.field6559[var21]) {
                            int var148 = arg1[(var146 >>> 25) + (var146 & 0x3F80)];
                            int var149 = ((var148 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var148 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var149 & 0xFF00FF) * var28 & 0xFF00FF00 | (var149 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var150 = var132 + var146;
                        var21++;
                        int var151 = arg8 + var147;
                        if (var151 < this.field6559[var21]) {
                            int var152 = arg1[(var150 >>> 25) + (var150 & 0x3F80)];
                            int var153 = ((var152 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var152 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var153 & 0xFF00FF) * var28 & 0xFF00FF00 | (var153 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var154 = var132 + var150;
                        var21++;
                        int var155 = arg8 + var151;
                        if (var155 < this.field6559[var21]) {
                            int var156 = arg1[(var154 >>> 25) + (var154 & 0x3F80)];
                            int var157 = ((var156 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var156 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var157 & 0xFF00FF) * var28 & 0xFF00FF00 | (var157 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var158 = var132 + var154;
                        var21++;
                        int var159 = arg8 + var155;
                        if (var159 < this.field6559[var21]) {
                            int var160 = arg1[(var158 >>> 25) + (var158 & 0x3F80)];
                            int var161 = ((var160 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var160 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var161 & 0xFF00FF) * var28 & 0xFF00FF00 | (var161 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        int var162 = var132 + var158;
                        var21++;
                        int var163 = arg8 + var159;
                        if (var163 < this.field6559[var21]) {
                            int var164 = arg1[(var162 >>> 25) + (var162 & 0x3F80)];
                            int var165 = ((var164 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var164 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var165 & 0xFF00FF) * var28 & 0xFF00FF00 | (var165 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var10000 = var132 + var162;
                        var21++;
                        var24 = arg8 + var163;
                        int var167 = var129;
                        int var168 = var130;
                        var126 += arg17;
                        var127 += arg18;
                        var128 += arg19;
                        if (var128 == 0.0F) {
                            var129 = 0;
                            var130 = 0;
                        } else {
                            var129 = (int) (var126 * 16384.0F / var128);
                            var130 = (int) (var127 * 16384.0F / var128);
                        }
                        var131 = (var167 << 18) + var168;
                        var132 = (var129 - var167 >> 3 << 18) + (var130 - var168 >> 3);
                        var23 += var134;
                        var135 = var23 >> 8;
                        var22 += var26;
                        int var169 = var22 >> 16;
                        var28 = 255 - var169;
                        var29 = ((arg11 & 0xFF00FF) * var169 & 0xFF00FF00 | (arg11 & 0xFF00) * var169 & 0xFF0000) >>> 8;
                        var133--;
                    } while (var133 > 0);
                }
                int var170 = arg6 - arg5 & 0x7;
                if (var170 > 0) {
                    do {
                        if (var24 < this.field6559[var21]) {
                            int var171 = arg1[(var131 >>> 25) + (var131 & 0x3F80)];
                            int var172 = ((var171 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var171 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var172 & 0xFF00FF) * var28 & 0xFF00FF00 | (var172 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var131 += var132;
                        var21++;
                        var24 += arg8;
                        var170--;
                    } while (var170 > 0);
                    return;
                }
            } else {
                if (var133 > 0) {
                    do {
                        int var173;
                        if (var24 < this.field6559[var21] && (var173 = arg1[(var131 >>> 25) + (var131 & 0x3F80)]) != 0) {
                            int var174 = ((var173 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var173 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var174 & 0xFF00FF) * var28 & 0xFF00FF00 | (var174 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var175 = var131 + var132;
                        int var176 = arg8 + var24;
                        int var177;
                        if (var176 < this.field6559[var21] && (var177 = arg1[(var175 >>> 25) + (var175 & 0x3F80)]) != 0) {
                            int var178 = ((var177 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var177 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var178 & 0xFF00FF) * var28 & 0xFF00FF00 | (var178 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var179 = var132 + var175;
                        int var180 = arg8 + var176;
                        int var181;
                        if (var180 < this.field6559[var21] && (var181 = arg1[(var179 >>> 25) + (var179 & 0x3F80)]) != 0) {
                            int var182 = ((var181 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var181 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var182 & 0xFF00FF) * var28 & 0xFF00FF00 | (var182 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var183 = var132 + var179;
                        int var184 = arg8 + var180;
                        int var185;
                        if (var184 < this.field6559[var21] && (var185 = arg1[(var183 >>> 25) + (var183 & 0x3F80)]) != 0) {
                            int var186 = ((var185 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var185 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var186 & 0xFF00FF) * var28 & 0xFF00FF00 | (var186 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var187 = var132 + var183;
                        int var188 = arg8 + var184;
                        int var189;
                        if (var188 < this.field6559[var21] && (var189 = arg1[(var187 >>> 25) + (var187 & 0x3F80)]) != 0) {
                            int var190 = ((var189 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var189 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var190 & 0xFF00FF) * var28 & 0xFF00FF00 | (var190 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var191 = var132 + var187;
                        int var192 = arg8 + var188;
                        int var193;
                        if (var192 < this.field6559[var21] && (var193 = arg1[(var191 >>> 25) + (var191 & 0x3F80)]) != 0) {
                            int var194 = ((var193 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var193 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var194 & 0xFF00FF) * var28 & 0xFF00FF00 | (var194 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var195 = var132 + var191;
                        int var196 = arg8 + var192;
                        int var197;
                        if (var196 < this.field6559[var21] && (var197 = arg1[(var195 >>> 25) + (var195 & 0x3F80)]) != 0) {
                            int var198 = ((var197 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var197 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var198 & 0xFF00FF) * var28 & 0xFF00FF00 | (var198 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        int var199 = var132 + var195;
                        int var200 = arg8 + var196;
                        int var201;
                        if (var200 < this.field6559[var21] && (var201 = arg1[(var199 >>> 25) + (var199 & 0x3F80)]) != 0) {
                            int var202 = ((var201 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var201 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var202 & 0xFF00FF) * var28 & 0xFF00FF00 | (var202 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        var10000 = var132 + var199;
                        var24 = arg8 + var200;
                        int var204 = var129;
                        int var205 = var130;
                        var126 += arg17;
                        var127 += arg18;
                        var128 += arg19;
                        if (var128 == 0.0F) {
                            var129 = 0;
                            var130 = 0;
                        } else {
                            var129 = (int) (var126 / var128 * 16384.0F);
                            var130 = (int) (var127 / var128 * 16384.0F);
                        }
                        var131 = (var204 << 18) + var205;
                        var132 = (var129 - var204 >> 3 << 18) + (var130 - var205 >> 3);
                        var23 += var134;
                        var135 = var23 >> 8;
                        var22 += var26;
                        int var206 = var22 >> 16;
                        var28 = 255 - var206;
                        var29 = ((arg11 & 0xFF00FF) * var206 & 0xFF00FF00 | (arg11 & 0xFF00) * var206 & 0xFF0000) >>> 8;
                        var133--;
                    } while (var133 > 0);
                }
                int var207 = arg6 - arg5 & 0x7;
                if (var207 > 0) {
                    do {
                        int var208;
                        if (var24 < this.field6559[var21] && (var208 = arg1[(var131 >>> 25) + (var131 & 0x3F80)]) != 0) {
                            int var209 = ((var208 & 0xFF00FF) * var135 & 0xFF00FF00) + ((var208 & 0xFF00) * var135 & 0xFF0000) >> 8;
                            arg0[var21] = (((var209 & 0xFF00FF) * var28 & 0xFF00FF00 | (var209 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                        }
                        var21++;
                        var131 += var132;
                        var24 += arg8;
                        var207--;
                    } while (var207 > 0);
                }
            }
            return;
        }
        int var30 = arg5 - this.field6557;
        float var31 = arg17 / 8.0F * (float) var30 + arg14;
        float var32 = arg18 / 8.0F * (float) var30 + arg15;
        float var33 = arg19 / 8.0F * (float) var30 + arg16;
        int var34;
        int var35;
        if (var33 == 0.0F) {
            var34 = 0;
            var35 = 0;
        } else {
            var34 = (int) (var31 * 4096.0F / var33);
            var35 = (int) (var32 * 4096.0F / var33);
        }
        float var36 = arg17 + var31;
        float var37 = arg18 + var32;
        float var38 = arg19 + var33;
        int var39;
        int var40;
        if (var38 == 0.0F) {
            var39 = 0;
            var40 = 0;
        } else {
            var39 = (int) (var36 * 4096.0F / var38);
            var40 = (int) (var37 * 4096.0F / var38);
        }
        int var41 = (var34 << 20) + var35;
        int var42 = (var39 - var34 >> 3 << 20) + (var40 - var35 >> 3);
        int var43 = var25 >> 3;
        int var44 = arg13 << 3;
        int var45 = var23 >> 8;
        if (this.field6567) {
            if (var43 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var46 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                        int var47 = ((var46 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var46 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var47 & 0xFF00FF) * var28 & 0xFF00FF00 | (var47 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var48 = var41 + var42;
                    int var49 = arg8 + var24;
                    var21++;
                    if (var49 < this.field6559[var21]) {
                        int var50 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                        int var51 = ((var50 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var50 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var51 & 0xFF00FF) * var28 & 0xFF00FF00 | (var51 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var52 = var42 + var48;
                    int var53 = arg8 + var49;
                    var21++;
                    if (var53 < this.field6559[var21]) {
                        int var54 = arg1[(var52 >>> 26) + (var52 & 0xFC0)];
                        int var55 = ((var54 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var54 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var55 & 0xFF00FF) * var28 & 0xFF00FF00 | (var55 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var56 = var42 + var52;
                    int var57 = arg8 + var53;
                    var21++;
                    if (var57 < this.field6559[var21]) {
                        int var58 = arg1[(var56 >>> 26) + (var56 & 0xFC0)];
                        int var59 = ((var58 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var58 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var59 & 0xFF00FF) * var28 & 0xFF00FF00 | (var59 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var60 = var42 + var56;
                    int var61 = arg8 + var57;
                    var21++;
                    if (var61 < this.field6559[var21]) {
                        int var62 = arg1[(var60 >>> 26) + (var60 & 0xFC0)];
                        int var63 = ((var62 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var62 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var63 & 0xFF00FF) * var28 & 0xFF00FF00 | (var63 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var64 = var42 + var60;
                    int var65 = arg8 + var61;
                    var21++;
                    if (var65 < this.field6559[var21]) {
                        int var66 = arg1[(var64 >>> 26) + (var64 & 0xFC0)];
                        int var67 = ((var66 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var66 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var67 & 0xFF00FF) * var28 & 0xFF00FF00 | (var67 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var68 = var42 + var64;
                    int var69 = arg8 + var65;
                    var21++;
                    if (var69 < this.field6559[var21]) {
                        int var70 = arg1[(var68 >>> 26) + (var68 & 0xFC0)];
                        int var71 = ((var70 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var70 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var71 & 0xFF00FF) * var28 & 0xFF00FF00 | (var71 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    int var72 = var42 + var68;
                    int var73 = arg8 + var69;
                    var21++;
                    if (var73 < this.field6559[var21]) {
                        int var74 = arg1[(var72 >>> 26) + (var72 & 0xFC0)];
                        int var75 = ((var74 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var74 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var75 & 0xFF00FF) * var28 & 0xFF00FF00 | (var75 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var10000 = var42 + var72;
                    var24 = arg8 + var73;
                    var21++;
                    int var77 = var39;
                    int var78 = var40;
                    var36 += arg17;
                    var37 += arg18;
                    var38 += arg19;
                    if (var38 == 0.0F) {
                        var39 = 0;
                        var40 = 0;
                    } else {
                        var39 = (int) (var36 * 4096.0F / var38);
                        var40 = (int) (var37 * 4096.0F / var38);
                    }
                    var41 = (var77 << 20) + var78;
                    var42 = (var39 - var77 >> 3 << 20) + (var40 - var78 >> 3);
                    var23 += var44;
                    var45 = var23 >> 8;
                    var22 += var26;
                    int var79 = var22 >> 16;
                    var28 = 255 - var79;
                    var29 = ((arg11 & 0xFF00FF) * var79 & 0xFF00FF00 | (arg11 & 0xFF00) * var79 & 0xFF0000) >>> 8;
                    var43--;
                } while (var43 > 0);
            }
            int var80 = arg6 - arg5 & 0x7;
            if (var80 > 0) {
                do {
                    if (var24 < this.field6559[var21]) {
                        int var81 = arg1[(var41 >>> 26) + (var41 & 0xFC0)];
                        int var82 = ((var81 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var81 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var82 & 0xFF00FF) * var28 & 0xFF00FF00 | (var82 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var41 += var42;
                    var24 += arg8;
                    var21++;
                    var80--;
                } while (var80 > 0);
                return;
            }
        } else {
            if (var43 > 0) {
                do {
                    int var83;
                    if (var24 < this.field6559[var21] && (var83 = arg1[(var41 >>> 26) + (var41 & 0xFC0)]) != 0) {
                        int var84 = ((var83 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var83 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var84 & 0xFF00FF) * var28 & 0xFF00FF00 | (var84 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var85 = var41 + var42;
                    int var86 = arg8 + var24;
                    int var87;
                    if (var86 < this.field6559[var21] && (var87 = arg1[(var85 >>> 26) + (var85 & 0xFC0)]) != 0) {
                        int var88 = ((var87 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var87 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var88 & 0xFF00FF) * var28 & 0xFF00FF00 | (var88 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var89 = var42 + var85;
                    int var90 = arg8 + var86;
                    int var91;
                    if (var90 < this.field6559[var21] && (var91 = arg1[(var89 >>> 26) + (var89 & 0xFC0)]) != 0) {
                        int var92 = ((var91 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var91 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var92 & 0xFF00FF) * var28 & 0xFF00FF00 | (var92 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var93 = var42 + var89;
                    int var94 = arg8 + var90;
                    int var95;
                    if (var94 < this.field6559[var21] && (var95 = arg1[(var93 >>> 26) + (var93 & 0xFC0)]) != 0) {
                        int var96 = ((var95 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var95 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var96 & 0xFF00FF) * var28 & 0xFF00FF00 | (var96 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var97 = var42 + var93;
                    int var98 = arg8 + var94;
                    int var99;
                    if (var98 < this.field6559[var21] && (var99 = arg1[(var97 >>> 26) + (var97 & 0xFC0)]) != 0) {
                        int var100 = ((var99 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var99 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var100 & 0xFF00FF) * var28 & 0xFF00FF00 | (var100 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var101 = var42 + var97;
                    int var102 = arg8 + var98;
                    int var103;
                    if (var102 < this.field6559[var21] && (var103 = arg1[(var101 >>> 26) + (var101 & 0xFC0)]) != 0) {
                        int var104 = ((var103 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var103 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var104 & 0xFF00FF) * var28 & 0xFF00FF00 | (var104 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var105 = var42 + var101;
                    int var106 = arg8 + var102;
                    int var107;
                    if (var106 < this.field6559[var21] && (var107 = arg1[(var105 >>> 26) + (var105 & 0xFC0)]) != 0) {
                        int var108 = ((var107 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var107 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var108 & 0xFF00FF) * var28 & 0xFF00FF00 | (var108 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    int var109 = var42 + var105;
                    int var110 = arg8 + var106;
                    int var111;
                    if (var110 < this.field6559[var21] && (var111 = arg1[(var109 >>> 26) + (var109 & 0xFC0)]) != 0) {
                        int var112 = ((var111 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var111 & 0xFF00) * var45 & 0xFF0000) >> 8;
                        arg0[var21] = (((var112 & 0xFF00FF) * var28 & 0xFF00FF00 | (var112 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                    }
                    var21++;
                    var10000 = var42 + var109;
                    var24 = arg8 + var110;
                    int var114 = var39;
                    int var115 = var40;
                    var36 += arg17;
                    var37 += arg18;
                    var38 += arg19;
                    if (var38 == 0.0F) {
                        var39 = 0;
                        var40 = 0;
                    } else {
                        var39 = (int) (var36 * 4096.0F / var38);
                        var40 = (int) (var37 * 4096.0F / var38);
                    }
                    var41 = (var114 << 20) + var115;
                    var42 = (var39 - var114 >> 3 << 20) + (var40 - var115 >> 3);
                    var23 += var44;
                    var45 = var23 >> 8;
                    var22 += var26;
                    int var116 = var22 >> 16;
                    var28 = 255 - var116;
                    var29 = ((arg11 & 0xFF00FF) * var116 & 0xFF00FF00 | (arg11 & 0xFF00) * var116 & 0xFF0000) >>> 8;
                    var43--;
                } while (var43 > 0);
            }
            int var117 = arg6 - arg5 & 0x7;
            if (var117 <= 0) {
                return;
            }
            do {
                int var118;
                if (var24 < this.field6559[var21] && (var118 = arg1[(var41 >>> 26) + (var41 & 0xFC0)]) != 0) {
                    int var119 = ((var118 & 0xFF00FF) * var45 & 0xFF00FF00) + ((var118 & 0xFF00) * var45 & 0xFF0000) >> 8;
                    arg0[var21] = (((var119 & 0xFF00FF) * var28 & 0xFF00FF00 | (var119 & 0xFF00) * var28 & 0xFF0000) >>> 8) + var29;
                }
                var21++;
                var41 += var42;
                var24 += arg8;
                var117--;
            } while (var117 > 0);
        }
        return;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lwk;Lmf;)V")
    public class431(class128 arg0, class384 arg1) {
        this.field6555 = arg0;
        this.field6562 = arg1;
        this.field6554 = this.field6555.field2092;
        this.field6552 = this.field6555.field2091;
        this.field6559 = this.field6555.field2109;
    }
}
