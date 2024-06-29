import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class83 extends class100 {

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "B")
    private byte field1163 = 0;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field1177 = 0;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public int field1180 = 0;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "B")
    private byte field1192 = 0;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Z")
    public boolean field1178 = false;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    private int field1190 = 0;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "[I")
    private int[] field1160;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "[I")
    public int[] field1191;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "[I")
    public int[] field1168;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "[I")
    private int[] field1174;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[S")
    private short[] field1161;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "[S")
    private short[] field1167;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[S")
    private short[] field1182;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "[S")
    private short[] field1181;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[S")
    private short[] field1164;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "[F")
    private float[] field1175;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "[F")
    private float[] field1197;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "[S")
    private short[] field1199;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "[B")
    private byte[] field1170;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "[S")
    private short[] field1195;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "[S")
    private short[] field1171;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[S")
    private short[] field1166;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[S")
    private short[] field1159;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "[B")
    private byte[] field1188;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[S")
    private short[] field1169;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Lnl;")
    public class238 field1162;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lul;")
    public class250 field1184;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Lul;")
    private class250 field1187;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "Lul;")
    private class250 field1189;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Lul;")
    private class250 field1196;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Lul;")
    private class250 field1176;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "S")
    private short field1198;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "S")
    private short field1194;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "[S")
    private short[] field1179;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "[I")
    private int[] field1173;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "Lre;")
    private static class263 field1186 = new class263(10000);

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "Lik;")
    private static class83 field1202 = new class83();

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "Lik;")
    private static class83 field1203 = new class83();

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "Lik;")
    private static class83 field1204 = new class83();

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "Lik;")
    private static class83 field1205 = new class83();

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "Lik;")
    private static class83 field1206 = new class83();

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "Lik;")
    private static class83 field1207 = new class83();

    @OriginalMember(owner = "client!ik", name = "ib", descriptor = "[I")
    private static int[] field1208 = new int[1];

    @OriginalMember(owner = "client!ik", name = "sb", descriptor = "Z")
    private static boolean field1218 = false;

    @OriginalMember(owner = "client!ik", name = "rb", descriptor = "[I")
    private static int[] field1217 = new int[1];

    @OriginalMember(owner = "client!ik", name = "jb", descriptor = "F")
    private static float field1209;

    @OriginalMember(owner = "client!ik", name = "kb", descriptor = "F")
    private static float field1210;

    @OriginalMember(owner = "client!ik", name = "mb", descriptor = "F")
    private static float field1212;

    @OriginalMember(owner = "client!ik", name = "nb", descriptor = "F")
    private static float field1213;

    @OriginalMember(owner = "client!ik", name = "qb", descriptor = "F")
    private static float field1216;

    @OriginalMember(owner = "client!ik", name = "tb", descriptor = "F")
    private static float field1219;

    @OriginalMember(owner = "client!ik", name = "lb", descriptor = "I")
    private static int field1211;

    @OriginalMember(owner = "client!ik", name = "ob", descriptor = "I")
    private static int field1214;

    @OriginalMember(owner = "client!ik", name = "pb", descriptor = "I")
    private static int field1215;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Lke;")
    private class260 field1172;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "Lmc;")
    private class52 field1193;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1201;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "[J")
    private static long[] field1200;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "[[I")
    private int[][] field1183;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "[[I")
    private int[][] field1185;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "()V", line = 5)
    public static final void method548() {
        field1202 = new class83();
        field1203 = new class83();
        field1204 = new class83();
        field1205 = new class83();
        field1206 = new class83();
        field1207 = new class83();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZZ)Lnj;", line = 15)
    public final class100 method491(boolean arg0, boolean arg1, boolean arg2) {
        return this.method577(arg0, arg1, arg2, field1203, field1202);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZZZZ)V", line = 20)
    private final void method549(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1184.field3724 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1187.field3724 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1189.field3724 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1196.field3724 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1186.field3986.length < this.field1177 * var6) {
            field1186 = new class263((this.field1177 + 100) * var6);
        } else {
            field1186.field4025 = 0;
        }
        if (arg1) {
            if (class117.field1811) {
                for (int var7 = 0; var7 < this.field1180; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1191[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1165[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1168[var7]);
                    int var11 = this.field1160[var7];
                    int var12 = this.field1160[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1179[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1186.field4025 = var6 * var14;
                        field1186.method1815(89, var8);
                        field1186.method1815(73, var9);
                        field1186.method1815(85, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1180; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1191[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1165[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1168[var15]);
                    int var19 = this.field1160[var15];
                    int var20 = this.field1160[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1179[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1186.field4025 = var6 * var22;
                        field1186.method1829(var16, 3);
                        field1186.method1829(var17, 3);
                        field1186.method1829(var18, 3);
                    }
                }
            }
        }
        if (arg2) {
            if (class292.field4447) {
                for (int var42 = 0; var42 < this.field1190; var42++) {
                    int var43 = method555(this.field1199[var42], this.field1159[var42], this.field1198, this.field1170[var42]);
                    field1186.field4025 = this.field1195[var42] * var6 + this.field1187.field3724;
                    field1186.method1815(111, var43);
                    field1186.field4025 = this.field1171[var42] * var6 + this.field1187.field3724;
                    field1186.method1815(73, var43);
                    field1186.field4025 = this.field1166[var42] * var6 + this.field1187.field3724;
                    field1186.method1815(121, var43);
                }
            } else {
                int var23 = (int) class280.field4251[0];
                int var24 = (int) class280.field4251[1];
                int var25 = (int) class280.field4251[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1198 * 1.3F);
                int var28 = this.field1194 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1190; var29++) {
                    short var30 = this.field1195[var29];
                    short var31 = this.field1164[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1181[var30] * var25 + this.field1182[var30] * var24 + this.field1167[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1181[var30] * var25 + this.field1182[var30] * var24 + this.field1167[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1164[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1171[var29];
                    short var34 = this.field1164[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1181[var33] * var25 + this.field1182[var33] * var24 + this.field1167[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1181[var33] * var25 + this.field1182[var33] * var24 + this.field1167[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1164[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1166[var29];
                    short var37 = this.field1164[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1181[var36] * var25 + this.field1182[var36] * var24 + this.field1167[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1181[var36] * var25 + this.field1182[var36] * var24 + this.field1167[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1164[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method555(this.field1199[var29], this.field1159[var29], var32, this.field1170[var29]);
                    int var40 = method555(this.field1199[var29], this.field1159[var29], var35, this.field1170[var29]);
                    int var41 = method555(this.field1199[var29], this.field1159[var29], var38, this.field1170[var29]);
                    field1186.field4025 = var6 * var30 + this.field1187.field3724;
                    field1186.method1815(79, var39);
                    field1186.field4025 = var6 * var33 + this.field1187.field3724;
                    field1186.method1815(82, var40);
                    field1186.field4025 = var6 * var36 + this.field1187.field3724;
                    field1186.method1815(87, var41);
                }
                this.field1167 = null;
                this.field1182 = null;
                this.field1181 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1194;
            float var45 = 3.0F / (float) (this.field1194 / 2 + this.field1194);
            field1186.field4025 = this.field1189.field3724;
            if (class117.field1811) {
                for (int var46 = 0; var46 < this.field1177; var46++) {
                    short var47 = this.field1164[var46];
                    if (var47 == 0) {
                        field1186.method1811((float) this.field1167[var46] * var45, false);
                        field1186.method1811((float) this.field1182[var46] * var45, false);
                        field1186.method1811((float) this.field1181[var46] * var45, false);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1186.method1811((float) this.field1167[var46] * var48, false);
                        field1186.method1811((float) this.field1182[var46] * var48, false);
                        field1186.method1811((float) this.field1181[var46] * var48, false);
                    }
                    field1186.field4025 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1177; var49++) {
                    short var50 = this.field1164[var49];
                    if (var50 == 0) {
                        field1186.method1821((float) this.field1167[var49] * var45, -125);
                        field1186.method1821((float) this.field1182[var49] * var45, -126);
                        field1186.method1821((float) this.field1181[var49] * var45, -96);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1186.method1821((float) this.field1167[var49] * var51, -106);
                        field1186.method1821((float) this.field1182[var49] * var51, -127);
                        field1186.method1821((float) this.field1181[var49] * var51, -103);
                    }
                    field1186.field4025 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1186.field4025 = this.field1196.field3724;
            if (class117.field1811) {
                for (int var52 = 0; var52 < this.field1177; var52++) {
                    field1186.method1811(this.field1175[var52], false);
                    field1186.method1811(this.field1197[var52], false);
                    field1186.field4025 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1177; var53++) {
                    field1186.method1821(this.field1175[var53], -122);
                    field1186.method1821(this.field1197[var53], -106);
                    field1186.field4025 += var6 - 8;
                }
            }
        }
        field1186.field4025 = this.field1177 * var6;
        if (arg0) {
            if (class117.field1805) {
                ByteBuffer var54 = ByteBuffer.wrap(field1186.field3986, 0, field1186.field4025);
                if (this.field1193 == null) {
                    this.field1193 = new class52(true);
                    this.field1193.method348(var54);
                } else {
                    this.field1193.method349(var54);
                }
                if (arg1) {
                    this.field1184.field3720 = true;
                    this.field1184.field3723 = null;
                    this.field1184.field3735 = this.field1193;
                    this.field1184.field3725 = var6;
                }
                if (arg2) {
                    this.field1187.field3720 = true;
                    this.field1187.field3723 = null;
                    this.field1187.field3735 = this.field1193;
                    this.field1187.field3725 = var6;
                }
                if (arg3) {
                    this.field1189.field3720 = true;
                    this.field1189.field3723 = null;
                    this.field1189.field3735 = this.field1193;
                    this.field1189.field3725 = var6;
                }
                if (arg4) {
                    this.field1196.field3720 = true;
                    this.field1196.field3723 = null;
                    this.field1196.field3735 = this.field1193;
                    this.field1196.field3725 = var6;
                }
            } else {
                if (field1201 == null || field1201.capacity() < field1186.field4025) {
                    field1201 = ByteBuffer.allocateDirect(var6 * 100 + field1186.field4025);
                } else {
                    field1201.clear();
                }
                field1201.put(field1186.field3986, 0, field1186.field4025);
                field1201.flip();
                if (arg1) {
                    this.field1184.field3720 = true;
                    this.field1184.field3723 = field1201;
                    this.field1184.field3735 = null;
                    this.field1184.field3725 = var6;
                }
                if (arg2) {
                    this.field1187.field3720 = true;
                    this.field1187.field3723 = field1201;
                    this.field1184.field3735 = null;
                    this.field1187.field3725 = var6;
                }
                if (arg3) {
                    this.field1189.field3720 = true;
                    this.field1189.field3723 = field1201;
                    this.field1189.field3735 = null;
                    this.field1189.field3725 = var6;
                }
                if (arg4) {
                    this.field1196.field3720 = true;
                    this.field1196.field3723 = field1201;
                    this.field1196.field3735 = null;
                    this.field1196.field3725 = var6;
                }
            }
        } else if (class117.field1802) {
            class52 var55 = new class52();
            ByteBuffer var56 = ByteBuffer.wrap(field1186.field3986, 0, field1186.field4025);
            var55.method348(var56);
            if (arg1) {
                this.field1184.field3720 = true;
                this.field1184.field3723 = null;
                this.field1184.field3735 = var55;
                this.field1184.field3725 = var6;
            }
            if (arg2) {
                this.field1187.field3720 = true;
                this.field1187.field3723 = null;
                this.field1187.field3735 = var55;
                this.field1187.field3725 = var6;
            }
            if (arg3) {
                this.field1189.field3720 = true;
                this.field1189.field3723 = null;
                this.field1189.field3735 = var55;
                this.field1189.field3725 = var6;
            }
            if (arg4) {
                this.field1196.field3720 = true;
                this.field1196.field3723 = null;
                this.field1196.field3735 = var55;
                this.field1196.field3725 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1186.field4025);
            var57.put(field1186.field3986, 0, field1186.field4025);
            var57.flip();
            if (arg1) {
                this.field1184.field3720 = true;
                this.field1184.field3723 = var57;
                this.field1184.field3735 = null;
                this.field1184.field3725 = var6;
            }
            if (arg2) {
                this.field1187.field3720 = true;
                this.field1187.field3723 = var57;
                this.field1184.field3735 = null;
                this.field1187.field3725 = var6;
            }
            if (arg3) {
                this.field1189.field3720 = true;
                this.field1189.field3723 = var57;
                this.field1189.field3735 = null;
                this.field1189.field3725 = var6;
            }
            if (arg4) {
                this.field1196.field3720 = true;
                this.field1196.field3723 = var57;
                this.field1196.field3735 = null;
                this.field1196.field3725 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()I", line = 548)
    public final int method502() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3562;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(III)V", line = 556)
    public final void method507(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1180; var4++) {
            this.field1191[var4] = this.field1191[var4] * arg0 >> 7;
            this.field1165[var4] = this.field1165[var4] * arg1 >> 7;
            this.field1168[var4] = this.field1168[var4] * arg2 >> 7;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 570)
    public final void method503(int arg0) {
        int var2 = class148.field2239[arg0];
        int var3 = class148.field2229[arg0];
        for (int var4 = 0; var4 < this.field1180; var4++) {
            int var5 = this.field1191[var4] * var3 + this.field1165[var4] * var2 >> 16;
            this.field1165[var4] = this.field1165[var4] * var3 - this.field1191[var4] * var2 >> 16;
            this.field1191[var4] = var5;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "()V", line = 590)
    private final void method550() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1180; var9++) {
            int var10 = this.field1191[var9];
            int var11 = this.field1165[var9];
            int var12 = this.field1168[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field1162.field3566 = (short) var1;
        this.field1162.field3563 = (short) var4;
        this.field1162.field3565 = (short) var2;
        this.field1162.field3560 = (short) var5;
        this.field1162.field3562 = (short) var3;
        this.field1162.field3564 = (short) var6;
        this.field1162.field3561 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1162.field3559 = true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 661)
    public final void method489(int arg0) {
        int var2 = class148.field2239[arg0];
        int var3 = class148.field2229[arg0];
        for (int var4 = 0; var4 < this.field1180; var4++) {
            int var5 = this.field1165[var4] * var3 - this.field1168[var4] * var2 >> 16;
            this.field1168[var4] = this.field1168[var4] * var3 + this.field1165[var4] * var2 >> 16;
            this.field1165[var4] = var5;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIJ)V", line = 681)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1177 == 0) {
            return;
        }
        GL var10 = class117.field1801;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method566();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Lmd;", line = 705)
    public final class233 method551(int arg0, int arg1, int arg2) {
        this.field1178 = false;
        if (this.field1172 != null) {
            this.field1167 = this.field1172.field3947;
            this.field1182 = this.field1172.field3948;
            this.field1181 = this.field1172.field3945;
            this.field1164 = this.field1172.field3946;
            this.field1172 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "()V", line = 719)
    public final void method552() {
        if (this.field1167 == null) {
            this.method496();
            return;
        }
        for (int var1 = 0; var1 < this.field1180; var1++) {
            int var2 = this.field1191[var1];
            this.field1191[var1] = this.field1168[var1];
            this.field1168[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1177; var3++) {
            short var4 = this.field1167[var3];
            this.field1167[var3] = this.field1181[var3];
            this.field1181[var3] = (short) (-var4);
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "()V", line = 759)
    public final void method553() {
        if (this.field1167 == null) {
            this.method516();
            return;
        }
        for (int var1 = 0; var1 < this.field1180; var1++) {
            this.field1191[var1] = -this.field1191[var1];
            this.field1168[var1] = -this.field1168[var1];
        }
        for (int var2 = 0; var2 < this.field1177; var2++) {
            this.field1167[var2] = (short) (-this.field1167[var2]);
            this.field1181[var2] = (short) (-this.field1181[var2]);
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZZZZZZZZZZ)Lik;", line = 793)
    public final class83 method554(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class83 var12 = new class83();
        var12.field1180 = this.field1180;
        var12.field1177 = this.field1177;
        var12.field1190 = this.field1190;
        if (arg0) {
            var12.field1191 = this.field1191;
            var12.field1168 = this.field1168;
        } else {
            var12.field1191 = class63.method417((byte) -67, this.field1191);
            var12.field1168 = class63.method417((byte) -63, this.field1168);
        }
        if (arg1) {
            var12.field1165 = this.field1165;
        } else {
            var12.field1165 = class63.method417((byte) 117, this.field1165);
        }
        if (arg0 && arg1) {
            var12.field1184 = this.field1184;
            var12.field1162 = this.field1162;
        } else {
            var12.field1184 = new class250();
            var12.field1162 = new class238();
        }
        if (arg2) {
            var12.field1199 = this.field1199;
        } else {
            var12.field1199 = class243.method1646(7, this.field1199);
        }
        if (arg3) {
            var12.field1170 = this.field1170;
        } else {
            var12.field1170 = class164.method1158(this.field1170, false);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class292.field4447) {
            var12.field1187 = new class250();
        } else {
            var12.field1187 = this.field1187;
        }
        if (arg5) {
            var12.field1167 = this.field1167;
            var12.field1182 = this.field1182;
            var12.field1181 = this.field1181;
            var12.field1164 = this.field1164;
        } else {
            var12.field1167 = class243.method1646(7, this.field1167);
            var12.field1182 = class243.method1646(7, this.field1182);
            var12.field1181 = class243.method1646(7, this.field1181);
            var12.field1164 = class243.method1646(7, this.field1164);
        }
        if (!class292.field4447) {
            var12.field1189 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1189 = this.field1189;
        } else {
            var12.field1189 = new class250();
        }
        if (arg8) {
            var12.field1175 = this.field1175;
            var12.field1197 = this.field1197;
            var12.field1196 = this.field1196;
        } else {
            var12.field1175 = class197.method1355(this.field1175, (byte) 19);
            var12.field1197 = class197.method1355(this.field1197, (byte) 127);
            var12.field1196 = new class250();
        }
        if (arg9) {
            var12.field1195 = this.field1195;
            var12.field1171 = this.field1171;
            var12.field1166 = this.field1166;
            var12.field1176 = this.field1176;
        } else {
            var12.field1195 = class243.method1646(7, this.field1195);
            var12.field1171 = class243.method1646(7, this.field1171);
            var12.field1166 = class243.method1646(7, this.field1166);
            var12.field1176 = new class250();
        }
        if (arg10) {
            var12.field1159 = this.field1159;
        } else {
            var12.field1159 = class243.method1646(7, this.field1159);
        }
        var12.field1174 = this.field1174;
        var12.field1183 = this.field1183;
        var12.field1188 = this.field1188;
        var12.field1185 = this.field1185;
        var12.field1173 = this.field1173;
        var12.field1179 = this.field1179;
        var12.field1160 = this.field1160;
        var12.field1198 = this.field1198;
        var12.field1194 = this.field1194;
        var12.field1161 = this.field1161;
        var12.field1169 = this.field1169;
        return var12;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ISIB)I", line = 931)
    private static final int method555(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class148.field2222[class77.method493(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class148.field2233.method740(arg1 & 0xFFFF, (byte) -99);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class148.field2233.method735((byte) -10, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 4522)
    private class83() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lkd;IIZ)V", line = 4524)
    public class83(class119 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1839];
        this.field1160 = new int[arg0.field1861 + 1];
        for (int var6 = 0; var6 < arg0.field1839; var6++) {
            if ((arg0.field1848 == null || arg0.field1848[var6] != 2) && (arg0.field1838 == null || arg0.field1838[var6] == -1 || !class148.field2233.method741(arg0.field1838[var6] & 0xFFFF, false))) {
                var5[this.field1190++] = var6;
                this.field1160[arg0.field1874[var6]]++;
                this.field1160[arg0.field1860[var6]]++;
                this.field1160[arg0.field1834[var6]]++;
            }
        }
        long[] var7 = new long[this.field1190];
        for (int var8 = 0; var8 < this.field1190; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1838 != null) {
                var14 = arg0.field1838[var9];
                if (var14 != -1) {
                    var12 = class148.field2233.method744(255, var14 & 0xFFFF);
                    var13 = class148.field2233.method743(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field1833 != null && arg0.field1833[var9] != 0 || var14 != -1 && !class148.field2233.method745(false, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field1851 != null) {
                var10 += arg0.field1851[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class101.method713(var7, var5, (byte) -46);
        this.field1180 = arg0.field1861;
        this.field1191 = arg0.field1869;
        this.field1165 = arg0.field1858;
        this.field1168 = arg0.field1868;
        this.field1174 = arg0.field1850;
        this.field1161 = arg0.field1836;
        int var20 = this.field1190 * 3;
        this.field1167 = new short[var20];
        this.field1182 = new short[var20];
        this.field1181 = new short[var20];
        this.field1164 = new short[var20];
        this.field1175 = new float[var20];
        this.field1197 = new float[var20];
        this.field1199 = new short[this.field1190];
        this.field1170 = new byte[this.field1190];
        this.field1195 = new short[this.field1190];
        this.field1171 = new short[this.field1190];
        this.field1166 = new short[this.field1190];
        this.field1159 = new short[this.field1190];
        if (arg0.field1841 != null) {
            this.field1188 = new byte[this.field1190];
        }
        if (arg0.field1828 != null) {
            this.field1169 = new short[this.field1190];
        }
        this.field1162 = new class238();
        this.field1184 = new class250();
        this.field1187 = new class250();
        if (class292.field4447) {
            this.field1189 = new class250();
        }
        this.field1196 = new class250();
        this.field1176 = new class250();
        this.field1198 = (short) arg1;
        this.field1194 = (short) arg2;
        this.field1179 = new short[var20];
        field1200 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field1861; var22++) {
            int var23 = this.field1160[var22];
            this.field1160[var22] = var21;
            var21 += var23;
        }
        this.field1160[arg0.field1861] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1829 != null) {
            int var28 = arg0.field1837;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field1190; var36++) {
                int var37 = var5[var36];
                if (arg0.field1829[var37] != -1) {
                    int var38 = arg0.field1829[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1874[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1860[var37];
                        } else {
                            var40 = arg0.field1834[var37];
                        }
                        int var41 = arg0.field1869[var40];
                        int var42 = arg0.field1858[var40];
                        int var43 = arg0.field1868[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field1875[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1845[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field1857[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1845[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1857[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1842[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1845[var44] / 1024.0F;
                        var49 = (float) arg0.field1857[var44] / 1024.0F;
                        var48 = (float) arg0.field1842[var44] / 1024.0F;
                    }
                    var27[var44] = method563(arg0.field1852[var44], arg0.field1872[var44], arg0.field1859[var44], arg0.field1830[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1190; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1847[var51] & 0xFFFF;
            short var53;
            if (arg0.field1838 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1838[var51];
            }
            int var54;
            if (arg0.field1829 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1829[var51];
            }
            int var55;
            if (arg0.field1833 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1833[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field1875[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1874[var51];
                        int var67 = arg0.field1860[var51];
                        int var68 = arg0.field1834[var51];
                        short var69 = arg0.field1852[var54];
                        short var70 = arg0.field1872[var54];
                        short var71 = arg0.field1859[var54];
                        float var72 = (float) arg0.field1869[var69];
                        float var73 = (float) arg0.field1858[var69];
                        float var74 = (float) arg0.field1868[var69];
                        float var75 = (float) arg0.field1869[var70] - var72;
                        float var76 = (float) arg0.field1858[var70] - var73;
                        float var77 = (float) arg0.field1868[var70] - var74;
                        float var78 = (float) arg0.field1869[var71] - var72;
                        float var79 = (float) arg0.field1858[var71] - var73;
                        float var80 = (float) arg0.field1868[var71] - var74;
                        float var81 = (float) arg0.field1869[var66] - var72;
                        float var82 = (float) arg0.field1858[var66] - var73;
                        float var83 = (float) arg0.field1868[var66] - var74;
                        float var84 = (float) arg0.field1869[var67] - var72;
                        float var85 = (float) arg0.field1858[var67] - var73;
                        float var86 = (float) arg0.field1868[var67] - var74;
                        float var87 = (float) arg0.field1869[var68] - var72;
                        float var88 = (float) arg0.field1858[var68] - var73;
                        float var89 = (float) arg0.field1868[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field1874[var51];
                        int var102 = arg0.field1860[var51];
                        int var103 = arg0.field1834[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1854[var54];
                        float var109 = (float) arg0.field1831[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1842[var54] & 0xFFFF) / 1024.0F;
                            method560(arg0.field1869[var101], arg0.field1858[var101], arg0.field1868[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1209;
                            var57 = field1219;
                            method560(arg0.field1869[var102], arg0.field1858[var102], arg0.field1868[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1209;
                            var59 = field1219;
                            method560(arg0.field1869[var103], arg0.field1858[var103], arg0.field1868[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1209;
                            var61 = field1219;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field1870[var54] / 256.0F;
                            float var113 = (float) arg0.field1876[var54] / 256.0F;
                            int var114 = arg0.field1869[var102] - arg0.field1869[var101];
                            int var115 = arg0.field1858[var102] - arg0.field1858[var101];
                            int var116 = arg0.field1868[var102] - arg0.field1868[var101];
                            int var117 = arg0.field1869[var103] - arg0.field1869[var101];
                            int var118 = arg0.field1858[var103] - arg0.field1858[var101];
                            int var119 = arg0.field1868[var103] - arg0.field1868[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1845[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1857[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1842[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method556(var126, var127, var128);
                            method569(arg0.field1869[var101], arg0.field1858[var101], arg0.field1868[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1216;
                            var57 = field1213;
                            method569(arg0.field1869[var102], arg0.field1858[var102], arg0.field1868[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1216;
                            var59 = field1213;
                            method569(arg0.field1869[var103], arg0.field1858[var103], arg0.field1868[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1216;
                            var61 = field1213;
                        } else if (var65 == 3) {
                            method581(arg0.field1869[var101], arg0.field1858[var101], arg0.field1868[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1212;
                            var57 = field1210;
                            method581(arg0.field1869[var102], arg0.field1858[var102], arg0.field1868[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1212;
                            var59 = field1210;
                            method581(arg0.field1869[var103], arg0.field1858[var103], arg0.field1868[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1212;
                            var61 = field1210;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method861();
            byte var129;
            if (arg0.field1848 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1848[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1874[var51];
                class72 var133 = arg0.field1873[var132];
                this.field1195[var50] = this.method557(arg0, var132, var130, var133.field941, var133.field931, var133.field938, var133.field943, var56, var57);
                int var134 = arg0.field1860[var51];
                class72 var135 = arg0.field1873[var134];
                this.field1171[var50] = this.method557(arg0, var134, (long) var62 + var130, var135.field941, var135.field931, var135.field938, var135.field943, var58, var59);
                int var136 = arg0.field1834[var51];
                class72 var137 = arg0.field1873[var136];
                this.field1166[var50] = this.method557(arg0, var136, (long) var63 + var130, var137.field941, var137.field931, var137.field938, var137.field943, var60, var61);
            } else if (var129 == 1) {
                class162 var138 = arg0.field1843[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2443 > 0 ? 1024 : 2048) + (var138.field2441 + 256 << 12) + (var138.field2432 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1195[var50] = this.method557(arg0, arg0.field1874[var51], var139, var138.field2443, var138.field2441, var138.field2432, 0, var56, var57);
                this.field1171[var50] = this.method557(arg0, arg0.field1860[var51], (long) var62 + var139, var138.field2443, var138.field2441, var138.field2432, 0, var58, var59);
                this.field1166[var50] = this.method557(arg0, arg0.field1834[var51], (long) var63 + var139, var138.field2443, var138.field2441, var138.field2432, 0, var60, var61);
            }
            if (arg0.field1838 == null) {
                this.field1159[var50] = -1;
            } else {
                this.field1159[var50] = arg0.field1838[var51];
            }
            if (this.field1188 != null) {
                this.field1188[var50] = (byte) arg0.field1841[var51];
            }
            this.field1199[var50] = arg0.field1847[var51];
            if (arg0.field1833 != null) {
                this.field1170[var50] = arg0.field1833[var51];
            }
            if (arg0.field1828 != null) {
                this.field1169[var50] = arg0.field1828[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1190; var143++) {
            short var144 = this.field1159[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1173 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1190; var147++) {
            short var148 = this.field1159[var147];
            if (var146 != var148) {
                this.field1173[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1173[var145] = this.field1190;
        field1200 = null;
        this.field1167 = method562(this.field1167, this.field1177);
        this.field1182 = method562(this.field1182, this.field1177);
        this.field1181 = method562(this.field1181, this.field1177);
        this.field1164 = method562(this.field1164, this.field1177);
        this.field1175 = method575(this.field1175, this.field1177);
        this.field1197 = method575(this.field1197, this.field1177);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFF)I", line = 994)
    private static final int method556(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V", line = 1033)
    public final void method498(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1215 = 0;
            field1211 = 0;
            field1214 = 0;
            for (int var6 = 0; var6 < this.field1180; var6++) {
                field1215 += this.field1191[var6];
                field1211 += this.field1165[var6];
                field1214 += this.field1168[var6];
                var5++;
            }
            if (var5 > 0) {
                field1215 = field1215 / var5 + arg1;
                field1211 = field1211 / var5 + arg2;
                field1214 = field1214 / var5 + arg3;
            } else {
                field1215 = arg1;
                field1211 = arg2;
                field1214 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1180; var7++) {
                this.field1191[var7] += arg1;
                this.field1165[var7] += arg2;
                this.field1168[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1180; var8++) {
                this.field1191[var8] -= field1215;
                this.field1165[var8] -= field1211;
                this.field1168[var8] -= field1214;
                if (arg3 != 0) {
                    int var9 = class148.field2239[arg3];
                    int var10 = class148.field2229[arg3];
                    int var11 = this.field1191[var8] * var10 + this.field1165[var8] * var9 + 32767 >> 16;
                    this.field1165[var8] = this.field1165[var8] * var10 + 32767 - this.field1191[var8] * var9 >> 16;
                    this.field1191[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class148.field2239[arg1];
                    int var13 = class148.field2229[arg1];
                    int var14 = this.field1165[var8] * var13 + 32767 - this.field1168[var8] * var12 >> 16;
                    this.field1168[var8] = this.field1168[var8] * var13 + this.field1165[var8] * var12 + 32767 >> 16;
                    this.field1165[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class148.field2239[arg2];
                    int var16 = class148.field2229[arg2];
                    int var17 = this.field1191[var8] * var16 + this.field1168[var8] * var15 + 32767 >> 16;
                    this.field1168[var8] = this.field1168[var8] * var16 + 32767 - this.field1191[var8] * var15 >> 16;
                    this.field1191[var8] = var17;
                }
                this.field1191[var8] += field1215;
                this.field1165[var8] += field1211;
                this.field1168[var8] += field1214;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1180; var18++) {
                this.field1191[var18] -= field1215;
                this.field1165[var18] -= field1211;
                this.field1168[var18] -= field1214;
                this.field1191[var18] = this.field1191[var18] * arg1 / 128;
                this.field1165[var18] = this.field1165[var18] * arg2 / 128;
                this.field1168[var18] = this.field1168[var18] * arg3 / 128;
                this.field1191[var18] += field1215;
                this.field1165[var18] += field1211;
                this.field1168[var18] += field1214;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1190; var19++) {
                int var20 = (this.field1170[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1170[var19] = (byte) var20;
            }
            this.field1187.field3720 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field1190; var21++) {
                int var22 = this.field1199[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field1199[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field1187.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()I", line = 1229)
    public final int method497() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3566;
    }

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "()V", line = 1237)
    public final void method496() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            int var2 = this.field1191[var1];
            this.field1191[var1] = this.field1168[var1];
            this.field1168[var1] = -var2;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lkd;IJIIIIFF)S", line = 1253)
    private final short method557(class119 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1160[arg1];
        int var12 = this.field1160[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1179[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1200[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1179[var13] = (short) (this.field1177 + 1);
        field1200[var13] = arg2;
        this.field1167[this.field1177] = (short) arg3;
        this.field1182[this.field1177] = (short) arg4;
        this.field1181[this.field1177] = (short) arg5;
        this.field1164[this.field1177] = (short) arg6;
        this.field1175[this.field1177] = arg7;
        this.field1197[this.field1177] = arg8;
        return (short) (this.field1177++);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lmd;IIIZ)V", line = 1291)
    public final void method558(class233 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class83 var6 = (class83) arg0;
        if (this.field1190 == 0 || var6.field1190 == 0) {
            return;
        }
        int var7 = var6.field1180;
        int[] var8 = var6.field1191;
        int[] var9 = var6.field1165;
        int[] var10 = var6.field1168;
        short[] var11 = var6.field1167;
        short[] var12 = var6.field1182;
        short[] var13 = var6.field1181;
        short[] var14 = var6.field1164;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1172 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1172.field3947;
            var16 = this.field1172.field3948;
            var17 = this.field1172.field3945;
            var18 = this.field1172.field3946;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1172 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1172.field3947;
            var20 = var6.field1172.field3948;
            var21 = var6.field1172.field3945;
            var22 = var6.field1172.field3946;
        }
        int[] var23 = var6.field1160;
        short[] var24 = var6.field1179;
        if (!var6.field1162.field3559) {
            var6.method550();
        }
        short var25 = var6.field1162.field3565;
        short var26 = var6.field1162.field3560;
        short var27 = var6.field1162.field3566;
        short var28 = var6.field1162.field3563;
        short var29 = var6.field1162.field3562;
        short var30 = var6.field1162.field3564;
        for (int var31 = 0; var31 < this.field1180; var31++) {
            int var32 = this.field1165[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1191[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1168[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1160[var31];
                        int var37 = this.field1160[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1179[var38] - 1;
                            if (var35 == -1 || this.field1164[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field1172 = new class260();
                                            var15 = this.field1172.field3947 = class243.method1646(7, this.field1167);
                                            var16 = this.field1172.field3948 = class243.method1646(7, this.field1182);
                                            var17 = this.field1172.field3945 = class243.method1646(7, this.field1181);
                                            var18 = this.field1172.field3946 = class243.method1646(7, this.field1164);
                                        }
                                        if (var19 == null) {
                                            class260 var44 = var6.field1172 = new class260();
                                            var19 = var44.field3947 = class243.method1646(7, var11);
                                            var20 = var44.field3948 = class243.method1646(7, var12);
                                            var21 = var44.field3945 = class243.method1646(7, var13);
                                            var22 = var44.field3946 = class243.method1646(7, var14);
                                        }
                                        short var45 = this.field1167[var35];
                                        short var46 = this.field1182[var35];
                                        short var47 = this.field1181[var35];
                                        short var48 = this.field1164[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field1160[var31];
                                        int var58 = this.field1160[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1179[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()Z", line = 1529)
    public final boolean method500() {
        if (this.field1183 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1180; var1++) {
            this.field1191[var1] <<= 0x4;
            this.field1165[var1] <<= 0x4;
            this.field1168[var1] <<= 0x4;
        }
        field1215 = 0;
        field1211 = 0;
        field1214 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()I", line = 1549)
    public final int method494() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3563;
    }

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "()V", line = 1556)
    public static void method559() {
        field1200 = null;
        field1186 = null;
        field1201 = null;
        field1202 = null;
        field1203 = null;
        field1204 = null;
        field1205 = null;
        field1206 = null;
        field1207 = null;
        field1217 = null;
        field1208 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1569)
    private static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1209 = var16;
        field1219 = var17;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 1613)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        if (this.field1177 == 0) {
            return;
        }
        if (!this.field1162.field3559) {
            this.method550();
        }
        short var13 = this.field1162.field3561;
        short var14 = this.field1162.field3565;
        short var15 = this.field1162.field3560;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class161.field2418) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class300.field4591) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class169.field2532) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class104.field1646) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class148.field2239[arg0];
            var27 = class148.field2229[arg0];
        }
        if (arg8 > 0L && class131.field2026 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class49.field627 >= var28 && class49.field627 <= var29 && class318.field4785 >= var30 && class318.field4785 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field1162.field3566;
                short var37 = this.field1162.field3563;
                short var38 = this.field1162.field3562;
                short var39 = this.field1162.field3564;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class49.field627 >= var32 && class49.field627 <= var33 && class318.field4785 >= var34 && class318.field4785 <= var35) {
                    if (this.field1592) {
                        class135.field2061[class21.field256++] = arg8;
                    } else {
                        if (field1217.length < this.field1177) {
                            field1217 = new int[this.field1177];
                            field1208 = new int[this.field1177];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field1180) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field1190) {
                                        break label118;
                                    }
                                    short var80 = this.field1195[var79];
                                    short var81 = this.field1171[var79];
                                    short var82 = this.field1166[var79];
                                    if (this.method568(class49.field627, class318.field4785, field1208[var80], field1208[var81], field1208[var82], field1217[var80], field1217[var81], field1217[var82])) {
                                        class135.field2061[class21.field256++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field1191[var59];
                            int var61 = this.field1165[var59];
                            int var62 = this.field1168[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field1160[var59];
                            int var76 = this.field1160[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field1179[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1217[var78] = var73;
                                field1208[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class117.field1801;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method566();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "()I", line = 1888)
    public final int method561() {
        return this.field1198;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([SI)[S", line = 1894)
    private static final short[] method562(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class85.method591(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIFFF)[F", line = 1900)
    private static final float[] method563(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z", line = 1973)
    public final boolean method564() {
        return this.field1178 && this.field1191 != null && this.field1167 != null;
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "()I", line = 1976)
    public final int method506() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3561;
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "()V", line = 1985)
    public final void method504() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            int var2 = this.field1168[var1];
            this.field1168[var1] = this.field1191[var1];
            this.field1191[var1] = -var2;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "()V", line = 2000)
    public final void method565() {
        int var10002;
        if (this.field1174 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1180; var3++) {
                int var4 = this.field1174[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1183 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1183[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1180) {
                int var7 = this.field1174[var6] & 0xFF;
                this.field1183[var7][var1[var7]++] = var6++;
            }
            this.field1174 = null;
        }
        if (this.field1188 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1190; var10++) {
            int var11 = this.field1188[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1185 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1185[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1190) {
            int var14 = this.field1188[var13] & 0xFF;
            this.field1185[var14][var8[var14]++] = var13++;
        }
        this.field1188 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[IIIIZ)V", line = 2096)
    public final void method521(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1215 = 0;
            field1211 = 0;
            field1214 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1183.length) {
                    int[] var14 = this.field1183[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1215 += this.field1191[var16];
                        field1211 += this.field1165[var16];
                        field1214 += this.field1168[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1215 = field1215 / var11 + var8;
                field1211 = field1211 / var11 + var9;
                field1214 = field1214 / var11 + var10;
            } else {
                field1215 = var8;
                field1211 = var9;
                field1214 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1183.length) {
                    int[] var22 = this.field1183[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1191[var24] += var17;
                        this.field1165[var24] += var18;
                        this.field1168[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1183.length) {
                    int[] var27 = this.field1183[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1191[var29] -= field1215;
                        this.field1165[var29] -= field1211;
                        this.field1168[var29] -= field1214;
                        if (arg4 != 0) {
                            int var30 = class148.field2239[arg4];
                            int var31 = class148.field2229[arg4];
                            int var32 = this.field1191[var29] * var31 + this.field1165[var29] * var30 + 32767 >> 16;
                            this.field1165[var29] = this.field1165[var29] * var31 + 32767 - this.field1191[var29] * var30 >> 16;
                            this.field1191[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class148.field2239[arg2];
                            int var34 = class148.field2229[arg2];
                            int var35 = this.field1165[var29] * var34 + 32767 - this.field1168[var29] * var33 >> 16;
                            this.field1168[var29] = this.field1168[var29] * var34 + this.field1165[var29] * var33 + 32767 >> 16;
                            this.field1165[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class148.field2239[arg3];
                            int var37 = class148.field2229[arg3];
                            int var38 = this.field1191[var29] * var37 + this.field1168[var29] * var36 + 32767 >> 16;
                            this.field1168[var29] = this.field1168[var29] * var37 + 32767 - this.field1191[var29] * var36 >> 16;
                            this.field1191[var29] = var38;
                        }
                        this.field1191[var29] += field1215;
                        this.field1165[var29] += field1211;
                        this.field1168[var29] += field1214;
                    }
                }
            }
            if (arg5 && this.field1167 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1183.length) {
                        int[] var41 = this.field1183[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1160[var43];
                            int var45 = this.field1160[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1179[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class148.field2239[arg4];
                                    int var49 = class148.field2229[arg4];
                                    int var50 = this.field1182[var47] * var48 + this.field1167[var47] * var49 + 32767 >> 16;
                                    this.field1182[var47] = (short) (this.field1182[var47] * var49 + 32767 - this.field1167[var47] * var48 >> 16);
                                    this.field1167[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class148.field2239[arg2];
                                    int var52 = class148.field2229[arg2];
                                    int var53 = this.field1182[var47] * var52 + 32767 - this.field1181[var47] * var51 >> 16;
                                    this.field1181[var47] = (short) (this.field1182[var47] * var51 + this.field1181[var47] * var52 + 32767 >> 16);
                                    this.field1182[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class148.field2239[arg3];
                                    int var55 = class148.field2229[arg3];
                                    int var56 = this.field1181[var47] * var54 + this.field1167[var47] * var55 + 32767 >> 16;
                                    this.field1181[var47] = (short) (this.field1181[var47] * var55 + 32767 - this.field1167[var47] * var54 >> 16);
                                    this.field1167[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1189 != null) {
                    this.field1189.field3720 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1183.length) {
                    int[] var59 = this.field1183[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1191[var61] -= field1215;
                        this.field1165[var61] -= field1211;
                        this.field1168[var61] -= field1214;
                        this.field1191[var61] = this.field1191[var61] * arg2 >> 7;
                        this.field1165[var61] = this.field1165[var61] * arg3 >> 7;
                        this.field1168[var61] = this.field1168[var61] * arg4 >> 7;
                        this.field1191[var61] += field1215;
                        this.field1165[var61] += field1211;
                        this.field1168[var61] += field1214;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1185 != null && this.field1170 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field1185.length) {
                        int[] var64 = this.field1185[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field1170[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field1170[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field1187.field3720 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1185 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field1185.length) {
                    int[] var70 = this.field1185[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field1199[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field1199[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field1187.field3720 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "()V", line = 2505)
    private final void method566() {
        GL var1 = class117.field1801;
        if (this.field1190 == 0) {
            return;
        }
        if (this.field1192 != 0) {
            this.method549(true, !this.field1184.field3720 && (this.field1192 & 0x1) != 0, !this.field1187.field3720 && (this.field1192 & 0x2) != 0, this.field1189 != null && !this.field1189.field3720 && (this.field1192 & 0x4) != 0, false);
        }
        this.method549(false, !this.field1184.field3720, !this.field1187.field3720, this.field1189 != null && !this.field1189.field3720, !this.field1196.field3720);
        if (!this.field1176.field3720) {
            this.method582();
        }
        if (this.field1163 != 0) {
            if ((this.field1163 & 0x1) != 0) {
                this.field1191 = null;
                this.field1165 = null;
                this.field1168 = null;
                this.field1179 = null;
                this.field1160 = null;
            }
            if ((this.field1163 & 0x2) != 0) {
                this.field1199 = null;
                this.field1170 = null;
            }
            if ((this.field1163 & 0x4) != 0) {
                this.field1167 = null;
                this.field1182 = null;
                this.field1181 = null;
                this.field1164 = null;
            }
            if ((this.field1163 & 0x8) != 0) {
                this.field1175 = null;
                this.field1197 = null;
            }
            if ((this.field1163 & 0x10) != 0) {
                this.field1195 = null;
                this.field1171 = null;
                this.field1166 = null;
            }
            this.field1163 = 0;
        }
        class52 var2 = null;
        if (this.field1184.field3735 != null) {
            this.field1184.field3735.method345();
            var2 = this.field1184.field3735;
            var1.glVertexPointer(3, 5126, this.field1184.field3725, (long) this.field1184.field3724);
        }
        if (this.field1187.field3735 != null) {
            if (this.field1187.field3735 != var2) {
                this.field1187.field3735.method345();
                var2 = this.field1187.field3735;
            }
            var1.glColorPointer(4, 5121, this.field1187.field3725, (long) this.field1187.field3724);
        }
        if (class292.field4447 && this.field1189.field3735 != null) {
            if (this.field1189.field3735 != var2) {
                this.field1189.field3735.method345();
                var2 = this.field1189.field3735;
            }
            var1.glNormalPointer(5126, this.field1189.field3725, (long) this.field1189.field3724);
        }
        if (this.field1196.field3735 != null) {
            if (this.field1196.field3735 != var2) {
                this.field1196.field3735.method345();
                class52 var3 = this.field1196.field3735;
            }
            var1.glTexCoordPointer(2, 5126, this.field1196.field3725, (long) this.field1196.field3724);
        }
        if (this.field1176.field3735 != null) {
            this.field1176.field3735.method346();
        }
        if (this.field1184.field3735 == null || this.field1187.field3735 == null || class292.field4447 && this.field1189.field3735 == null || this.field1196.field3735 == null) {
            if (class117.field1802) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1184.field3735 == null) {
                this.field1184.field3723.position(this.field1184.field3724);
                var1.glVertexPointer(3, 5126, this.field1184.field3725, this.field1184.field3723);
            }
            if (this.field1187.field3735 == null) {
                this.field1187.field3723.position(this.field1187.field3724);
                var1.glColorPointer(4, 5121, this.field1187.field3725, this.field1187.field3723);
            }
            if (class292.field4447 && this.field1189.field3735 == null) {
                this.field1189.field3723.position(this.field1189.field3724);
                var1.glNormalPointer(5126, this.field1189.field3725, this.field1189.field3723);
            }
            if (this.field1196.field3735 == null) {
                this.field1196.field3723.position(this.field1196.field3724);
                var1.glTexCoordPointer(2, 5126, this.field1196.field3725, this.field1196.field3723);
            }
        }
        if (this.field1176.field3735 == null && class117.field1802) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1173.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1173[var5];
            int var7 = this.field1173[var5 + 1];
            short var8 = this.field1159[var6];
            if (var8 == -1) {
                class117.method814(-1);
                class204.method1397(-67, 0, 0);
            } else {
                class148.field2233.method737(var8 & 0xFFFF, -4090);
            }
            if (this.field1176.field3735 == null) {
                this.field1176.field3723.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1176.field3723);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZZZ)Lnj;", line = 2678)
    public final class100 method510(boolean arg0, boolean arg1, boolean arg2) {
        return this.method577(arg0, arg1, arg2, field1205, field1204);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V", line = 2681)
    public final void method567(int arg0) {
        if (this.field1167 == null) {
            this.method512(arg0);
            return;
        }
        int var2 = class148.field2239[arg0];
        int var3 = class148.field2229[arg0];
        for (int var4 = 0; var4 < this.field1180; var4++) {
            int var5 = this.field1191[var4] * var3 + this.field1168[var4] * var2 >> 16;
            this.field1168[var4] = this.field1168[var4] * var3 - this.field1191[var4] * var2 >> 16;
            this.field1191[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1177; var6++) {
            int var7 = this.field1181[var6] * var2 + this.field1167[var6] * var3 >> 16;
            this.field1181[var6] = (short) (this.field1181[var6] * var3 - this.field1167[var6] * var2 >> 16);
            this.field1167[var6] = (short) var7;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIII)Z", line = 2728)
    private final boolean method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2743)
    private static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field1216 = var18;
        field1213 = var19;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(SS)V", line = 2823)
    public final void method570(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1190; var3++) {
            if (this.field1159[var3] == arg0) {
                this.field1159[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class148.field2233.method740(arg0 & 0xFFFF, (byte) -99);
            var5 = class148.field2233.method735((byte) -19, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class148.field2233.method740(arg1 & 0xFFFF, (byte) -99);
            var7 = class148.field2233.method735((byte) -117, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1187.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "()V", line = 2858)
    public final void method571() {
        if (this.field1167 == null) {
            this.method504();
            return;
        }
        for (int var1 = 0; var1 < this.field1180; var1++) {
            int var2 = this.field1168[var1];
            this.field1168[var1] = this.field1191[var1];
            this.field1191[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1177; var3++) {
            short var4 = this.field1181[var3];
            this.field1181[var3] = this.field1167[var3];
            this.field1167[var3] = (short) (-var4);
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 2897)
    public final void method501() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            this.field1191[var1] = this.field1191[var1] + 7 >> 4;
            this.field1165[var1] = this.field1165[var1] + 7 >> 4;
            this.field1168[var1] = this.field1168[var1] + 7 >> 4;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "()V", line = 2913)
    public final void method572() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            this.field1168[var1] = -this.field1168[var1];
        }
        if (this.field1181 != null) {
            for (int var2 = 0; var2 < this.field1177; var2++) {
                this.field1181[var2] = (short) (-this.field1181[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1190; var3++) {
            short var4 = this.field1195[var3];
            this.field1195[var3] = this.field1166[var3];
            this.field1166[var3] = var4;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
        this.field1176.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(SS)V", line = 2953)
    public final void method573(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1190; var3++) {
            if (this.field1199[var3] == arg0) {
                this.field1199[var3] = arg1;
            }
        }
        this.field1187.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 2968)
    public final int method115() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3565;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZZZZZZ)V", line = 2974)
    public final void method574(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1192 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1177 != 0) {
            if (arg6) {
                boolean var8 = !this.field1187.field3720 && (arg1 || arg2 && !class292.field4447);
                this.method549(false, !this.field1184.field3720 && arg0, var8, this.field1189 != null && !this.field1189.field3720 && arg2, !this.field1196.field3720 && arg3);
                if (!this.field1176.field3720 && arg4 && arg1) {
                    this.method582();
                }
            }
            if (arg0) {
                if (this.field1184.field3720) {
                    if (!this.field1162.field3559) {
                        this.method550();
                    }
                    this.field1191 = null;
                    this.field1165 = null;
                    this.field1168 = null;
                    this.field1179 = null;
                    this.field1160 = null;
                } else {
                    this.field1163 = (byte) (this.field1163 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1187.field3720) {
                    this.field1199 = null;
                    this.field1170 = null;
                } else {
                    this.field1163 = (byte) (this.field1163 | 0x2);
                }
            }
            if (arg2 && class292.field4447) {
                if (this.field1189.field3720) {
                    this.field1167 = null;
                    this.field1182 = null;
                    this.field1181 = null;
                    this.field1164 = null;
                } else {
                    this.field1163 = (byte) (this.field1163 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1196.field3720) {
                    this.field1175 = null;
                    this.field1197 = null;
                } else {
                    this.field1163 = (byte) (this.field1163 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1176.field3720 && this.field1187.field3720) {
                    this.field1195 = null;
                    this.field1171 = null;
                    this.field1166 = null;
                } else {
                    this.field1163 = (byte) (this.field1163 | 0x10);
                }
            }
            if (arg5) {
                this.field1174 = null;
                this.field1188 = null;
                this.field1183 = (int[][]) null;
                this.field1185 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([FI)[F", line = 3070)
    private static final float[] method575(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class85.method590(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lpj;)Lpj;", line = 3077)
    public final class59 method576(class59 arg0) {
        if (this.field1177 == 0) {
            return null;
        }
        if (!this.field1162.field3559) {
            this.method550();
        }
        int var2;
        int var3;
        if (class280.field4250 > 0) {
            var2 = this.field1162.field3566 - (class280.field4250 * this.field1162.field3560 >> 8) >> 3;
            var3 = this.field1162.field3563 - (class280.field4250 * this.field1162.field3565 >> 8) >> 3;
        } else {
            var2 = this.field1162.field3566 - (class280.field4250 * this.field1162.field3565 >> 8) >> 3;
            var3 = this.field1162.field3563 - (class280.field4250 * this.field1162.field3560 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class280.field4253 > 0) {
            var4 = this.field1162.field3562 - (class280.field4253 * this.field1162.field3560 >> 8) >> 3;
            var5 = this.field1162.field3564 - (class280.field4253 * this.field1162.field3565 >> 8) >> 3;
        } else {
            var4 = this.field1162.field3562 - (class280.field4253 * this.field1162.field3565 >> 8) >> 3;
            var5 = this.field1162.field3564 - (class280.field4253 * this.field1162.field3560 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class59 var8;
        if (arg0 == null || arg0.field789.length < var6 * var7) {
            var8 = new class59(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field2361 = arg0.field2350 = var6;
            arg0.field2360 = arg0.field2358 = var7;
            arg0.method401();
        }
        var8.field2362 = var2;
        var8.field2354 = var4;
        if (field1217.length < this.field1177) {
            field1217 = new int[this.field1177];
            field1208 = new int[this.field1177];
        }
        for (int var9 = 0; var9 < this.field1180; var9++) {
            int var10 = (this.field1191[var9] - (this.field1165[var9] * class280.field4250 >> 8) >> 3) - var2;
            int var11 = (this.field1168[var9] - (this.field1165[var9] * class280.field4253 >> 8) >> 3) - var4;
            int var12 = this.field1160[var9];
            int var13 = this.field1160[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1179[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1217[var15] = var10;
                field1208[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1190; var16++) {
            if (this.field1170[var16] <= 128) {
                short var17 = this.field1195[var16];
                short var18 = this.field1171[var16];
                short var19 = this.field1166[var16];
                int var20 = field1217[var17];
                int var21 = field1217[var18];
                int var22 = field1217[var19];
                int var23 = field1208[var17];
                int var24 = field1208[var18];
                int var25 = field1208[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class148.method1062(var8.field789, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "()V", line = 3203)
    public final void method516() {
        for (int var1 = 0; var1 < this.field1180; var1++) {
            this.field1191[var1] = -this.field1191[var1];
            this.field1168[var1] = -this.field1168[var1];
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZZLik;Lik;)Lnj;", line = 3215)
    private final class100 method577(boolean arg0, boolean arg1, boolean arg2, class83 arg3, class83 arg4) {
        arg3.field1180 = this.field1180;
        arg3.field1177 = this.field1177;
        arg3.field1190 = this.field1190;
        arg3.field1198 = this.field1198;
        arg3.field1194 = this.field1194;
        arg3.field1192 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field1191 == null || arg3.field1191.length < this.field1180) {
            arg3.field1191 = new int[this.field1180 + 100];
            arg3.field1165 = new int[this.field1180 + 100];
            arg3.field1168 = new int[this.field1180 + 100];
        }
        for (int var6 = 0; var6 < this.field1180; var6++) {
            arg3.field1191[var6] = this.field1191[var6];
            arg3.field1165[var6] = this.field1165[var6];
            arg3.field1168[var6] = this.field1168[var6];
        }
        if (arg3.field1184 == null) {
            arg3.field1184 = new class250();
        }
        arg3.field1184.field3720 = false;
        if (arg3.field1162 == null) {
            arg3.field1162 = new class238();
        }
        arg3.field1162.field3559 = false;
        if (arg0) {
            arg3.field1170 = this.field1170;
        } else {
            if (arg4.field1170 == null || arg4.field1170.length < this.field1190) {
                arg4.field1170 = new byte[this.field1190 + 100];
            }
            arg3.field1170 = arg4.field1170;
            for (int var7 = 0; var7 < this.field1190; var7++) {
                arg3.field1170[var7] = this.field1170[var7];
            }
        }
        if (arg1) {
            arg3.field1199 = this.field1199;
        } else {
            if (arg4.field1199 == null || arg4.field1199.length < this.field1190) {
                arg4.field1199 = new short[this.field1190 + 100];
            }
            arg3.field1199 = arg4.field1199;
            for (int var8 = 0; var8 < this.field1190; var8++) {
                arg3.field1199[var8] = this.field1199[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field1187 = this.field1187;
        } else {
            if (arg4.field1187 == null) {
                arg4.field1187 = new class250();
            }
            arg3.field1187 = arg4.field1187;
            arg3.field1187.field3720 = false;
        }
        if (arg2 || this.field1167 == null) {
            arg3.field1167 = this.field1167;
            arg3.field1182 = this.field1182;
            arg3.field1181 = this.field1181;
            arg3.field1164 = this.field1164;
            arg3.field1189 = this.field1189;
        } else {
            if (arg4.field1167 == null || arg4.field1167.length < this.field1177) {
                arg4.field1167 = new short[this.field1177 + 100];
                arg4.field1182 = new short[this.field1177 + 100];
                arg4.field1181 = new short[this.field1177 + 100];
                arg4.field1164 = new short[this.field1177 + 100];
            }
            arg3.field1167 = arg4.field1167;
            arg3.field1182 = arg4.field1182;
            arg3.field1181 = arg4.field1181;
            arg3.field1164 = arg4.field1164;
            for (int var9 = 0; var9 < this.field1177; var9++) {
                arg3.field1167[var9] = this.field1167[var9];
                arg3.field1182[var9] = this.field1182[var9];
                arg3.field1181[var9] = this.field1181[var9];
                arg3.field1164[var9] = this.field1164[var9];
            }
            if (class292.field4447) {
                if (arg4.field1189 == null) {
                    arg4.field1189 = new class250();
                }
                arg3.field1189 = arg4.field1189;
                arg3.field1189.field3720 = false;
            } else {
                arg3.field1189 = null;
            }
        }
        arg3.field1175 = this.field1175;
        arg3.field1197 = this.field1197;
        arg3.field1174 = this.field1174;
        arg3.field1183 = this.field1183;
        arg3.field1195 = this.field1195;
        arg3.field1171 = this.field1171;
        arg3.field1166 = this.field1166;
        arg3.field1159 = this.field1159;
        arg3.field1188 = this.field1188;
        arg3.field1185 = this.field1185;
        arg3.field1196 = this.field1196;
        arg3.field1176 = this.field1176;
        arg3.field1173 = this.field1173;
        arg3.field1179 = this.field1179;
        arg3.field1160 = this.field1160;
        arg3.field1592 = this.field1592;
        arg3.field1161 = this.field1161;
        arg3.field1169 = this.field1169;
        return arg3;
    }

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "()I", line = 3371)
    public final int method578() {
        return this.field1194;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(ZZZ)Lnj;", line = 3378)
    public final class100 method524(boolean arg0, boolean arg1, boolean arg2) {
        return this.method577(arg0, arg1, arg2, field1207, field1206);
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V", line = 3381)
    public final void method579(int arg0) {
        this.field1198 = (short) arg0;
        this.field1187.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V", line = 3385)
    public final void method580(int arg0) {
        this.field1194 = (short) arg0;
        if (this.field1189 != null) {
            this.field1189.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)V", line = 3393)
    public final void method508(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1180; var4++) {
            this.field1191[var4] += arg0;
            this.field1165[var4] += arg1;
            this.field1168[var4] += arg2;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 3407)
    public final void method512(int arg0) {
        int var2 = class148.field2239[arg0];
        int var3 = class148.field2229[arg0];
        for (int var4 = 0; var4 < this.field1180; var4++) {
            int var5 = this.field1191[var4] * var3 + this.field1168[var4] * var2 >> 16;
            this.field1168[var4] = this.field1168[var4] * var3 - this.field1191[var4] * var2 >> 16;
            this.field1191[var4] = var5;
        }
        this.field1162.field3559 = false;
        this.field1184.field3720 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII[FIF)V", line = 3426)
    private static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1212 = var16;
        field1210 = var17;
    }

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "()V", line = 3469)
    private final void method582() {
        if (field1186.field3986.length < this.field1177 * 12) {
            field1186 = new class263((this.field1177 + 100) * 12);
        } else {
            field1186.field4025 = 0;
        }
        if (class117.field1811) {
            for (int var1 = 0; var1 < this.field1190; var1++) {
                field1186.method1815(118, this.field1195[var1]);
                field1186.method1815(103, this.field1171[var1]);
                field1186.method1815(118, this.field1166[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field1190; var2++) {
                field1186.method1829(this.field1195[var2], 3);
                field1186.method1829(this.field1171[var2], 3);
                field1186.method1829(this.field1166[var2], 3);
            }
        }
        if (!class117.field1802) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1186.field4025);
            var5.put(field1186.field3986, 0, field1186.field4025);
            var5.flip();
            this.field1176.field3720 = true;
            this.field1176.field3723 = var5;
            this.field1176.field3735 = null;
            return;
        }
        class52 var3 = new class52();
        ByteBuffer var4 = ByteBuffer.wrap(field1186.field3986, 0, field1186.field4025);
        var3.method348(var4);
        this.field1176.field3720 = true;
        this.field1176.field3723 = null;
        this.field1176.field3735 = var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILik;[[I[[IIII)V", line = 3529)
    public final void method583(int arg0, int arg1, class83 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1162.field3559) {
            arg2.method550();
        }
        int var9 = arg2.field1162.field3566 + arg5;
        int var10 = arg2.field1162.field3563 + arg5;
        int var11 = arg2.field1162.field3562 + arg7;
        int var12 = arg2.field1162.field3564 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field1180; var17++) {
                int var18 = this.field1191[var17] + arg5;
                int var19 = this.field1168[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1165[var17] = this.field1165[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1162.field3565;
            for (int var28 = 0; var28 < this.field1180; var28++) {
                int var29 = (this.field1165[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1191[var28] + arg5;
                    int var31 = this.field1168[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1165[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method710(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1162.field3560 - arg2.field1162.field3565;
            for (int var42 = 0; var42 < this.field1180; var42++) {
                int var43 = this.field1191[var42] + arg5;
                int var44 = this.field1168[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1165[var42] = var51 + this.field1165[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1162.field3560 - arg2.field1162.field3565;
            for (int var53 = 0; var53 < this.field1180; var53++) {
                int var54 = this.field1191[var53] + arg5;
                int var55 = this.field1168[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field1165[var53] = ((this.field1165[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1184.field3720 = false;
        this.field1162.field3559 = false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3727)
    public final void method522(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field1215 = 0;
            field1211 = 0;
            field1214 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1183.length) {
                    int[] var16 = this.field1183[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1161 == null || (arg6 & this.field1161[var18]) != 0) {
                            field1215 += this.field1191[var18];
                            field1211 += this.field1165[var18];
                            field1214 += this.field1168[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field1215 = field1215 / var13 + var10;
                field1211 = field1211 / var13 + var11;
                field1214 = field1214 / var13 + var12;
                field1218 = true;
            } else {
                field1215 = var10;
                field1211 = var11;
                field1214 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1183.length) {
                    int[] var27 = this.field1183[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1161 == null || (arg6 & this.field1161[var29]) != 0) {
                            this.field1191[var29] += var22;
                            this.field1165[var29] += var23;
                            this.field1168[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field1183.length) {
                        int[] var92 = this.field1183[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field1161 == null || (arg6 & this.field1161[var94]) != 0) {
                                this.field1191[var94] -= field1215;
                                this.field1165[var94] -= field1211;
                                this.field1168[var94] -= field1214;
                                if (arg4 != 0) {
                                    int var95 = class148.field2239[arg4];
                                    int var96 = class148.field2229[arg4];
                                    int var97 = this.field1191[var94] * var96 + this.field1165[var94] * var95 + 32767 >> 16;
                                    this.field1165[var94] = this.field1165[var94] * var96 + 32767 - this.field1191[var94] * var95 >> 16;
                                    this.field1191[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class148.field2239[arg2];
                                    int var99 = class148.field2229[arg2];
                                    int var100 = this.field1165[var94] * var99 + 32767 - this.field1168[var94] * var98 >> 16;
                                    this.field1168[var94] = this.field1168[var94] * var99 + this.field1165[var94] * var98 + 32767 >> 16;
                                    this.field1165[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class148.field2239[arg3];
                                    int var102 = class148.field2229[arg3];
                                    int var103 = this.field1191[var94] * var102 + this.field1168[var94] * var101 + 32767 >> 16;
                                    this.field1168[var94] = this.field1168[var94] * var102 + 32767 - this.field1191[var94] * var101 >> 16;
                                    this.field1191[var94] = var103;
                                }
                                this.field1191[var94] += field1215;
                                this.field1165[var94] += field1211;
                                this.field1168[var94] += field1214;
                            }
                        }
                    }
                }
                if (arg5 && this.field1167 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field1183.length) {
                            int[] var106 = this.field1183[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field1161 == null || (arg6 & this.field1161[var108]) != 0) {
                                    int var109 = this.field1160[var108];
                                    int var110 = this.field1160[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field1179[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class148.field2239[arg4];
                                            int var114 = class148.field2229[arg4];
                                            int var115 = this.field1182[var112] * var113 + this.field1167[var112] * var114 + 32767 >> 16;
                                            this.field1182[var112] = (short) (this.field1182[var112] * var114 + 32767 - this.field1167[var112] * var113 >> 16);
                                            this.field1167[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class148.field2239[arg2];
                                            int var117 = class148.field2229[arg2];
                                            int var118 = this.field1182[var112] * var117 + 32767 - this.field1181[var112] * var116 >> 16;
                                            this.field1181[var112] = (short) (this.field1182[var112] * var116 + this.field1181[var112] * var117 + 32767 >> 16);
                                            this.field1182[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class148.field2239[arg3];
                                            int var120 = class148.field2229[arg3];
                                            int var121 = this.field1181[var112] * var119 + this.field1167[var112] * var120 + 32767 >> 16;
                                            this.field1181[var112] = (short) (this.field1181[var112] * var120 + 32767 - this.field1167[var112] * var119 >> 16);
                                            this.field1167[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1189 != null) {
                        this.field1189.field3720 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field1218) {
                    int var36 = arg7[6] * field1214 + arg7[0] * field1215 + arg7[3] * field1211 + 16384 >> 15;
                    int var37 = arg7[7] * field1214 + arg7[1] * field1215 + arg7[4] * field1211 + 16384 >> 15;
                    int var38 = arg7[8] * field1214 + arg7[2] * field1215 + arg7[5] * field1211 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field1215 = var39;
                    field1211 = var40;
                    field1214 = var41;
                    field1218 = false;
                }
                int[] var42 = new int[9];
                int var43 = class148.field2229[arg2] >> 1;
                int var44 = class148.field2239[arg2] >> 1;
                int var45 = class148.field2229[arg3] >> 1;
                int var46 = class148.field2239[arg3] >> 1;
                int var47 = class148.field2229[arg4] >> 1;
                int var48 = class148.field2239[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field1214 + var42[0] * -field1215 + var42[1] * -field1211 + 16384 >> 15;
                int var52 = var42[5] * -field1214 + var42[3] * -field1215 + var42[4] * -field1211 + 16384 >> 15;
                int var53 = var42[8] * -field1214 + var42[6] * -field1215 + var42[7] * -field1211 + 16384 >> 15;
                int var54 = field1215 + var51;
                int var55 = field1211 + var52;
                int var56 = field1214 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field1183.length) {
                        int[] var81 = this.field1183[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field1161 == null || (arg6 & this.field1161[var83]) != 0) {
                                int var84 = this.field1168[var83] * var68[2] + this.field1191[var83] * var68[0] + this.field1165[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field1168[var83] * var68[5] + this.field1191[var83] * var68[3] + this.field1165[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field1168[var83] * var68[8] + this.field1191[var83] * var68[6] + this.field1165[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field1191[var83] = var87;
                                this.field1165[var83] = var88;
                                this.field1168[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1183.length) {
                        int[] var174 = this.field1183[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1161 == null || (arg6 & this.field1161[var176]) != 0) {
                                this.field1191[var176] -= field1215;
                                this.field1165[var176] -= field1211;
                                this.field1168[var176] -= field1214;
                                this.field1191[var176] = this.field1191[var176] * arg2 >> 7;
                                this.field1165[var176] = this.field1165[var176] * arg3 >> 7;
                                this.field1168[var176] = this.field1168[var176] * arg4 >> 7;
                                this.field1191[var176] += field1215;
                                this.field1165[var176] += field1211;
                                this.field1168[var176] += field1214;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field1218) {
                    int var128 = arg7[6] * field1214 + arg7[0] * field1215 + arg7[3] * field1211 + 16384 >> 15;
                    int var129 = arg7[7] * field1214 + arg7[1] * field1215 + arg7[4] * field1211 + 16384 >> 15;
                    int var130 = arg7[8] * field1214 + arg7[2] * field1215 + arg7[5] * field1211 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field1215 = var131;
                    field1211 = var132;
                    field1214 = var133;
                    field1218 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field1215 * var134 + 16384 >> 15;
                int var138 = -field1211 * var135 + 16384 >> 15;
                int var139 = -field1214 * var136 + 16384 >> 15;
                int var140 = field1215 + var137;
                int var141 = field1211 + var138;
                int var142 = field1214 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field1183.length) {
                        int[] var163 = this.field1183[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field1161 == null || (arg6 & this.field1161[var165]) != 0) {
                                int var166 = this.field1168[var165] * var150[2] + this.field1191[var165] * var150[0] + this.field1165[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field1168[var165] * var150[5] + this.field1191[var165] * var150[3] + this.field1165[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field1168[var165] * var150[8] + this.field1191[var165] * var150[6] + this.field1165[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field1191[var165] = var169;
                                this.field1165[var165] = var170;
                                this.field1168[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1185 != null && this.field1170 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field1185.length) {
                        int[] var179 = this.field1185[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field1169 == null || (arg6 & this.field1169[var181]) != 0) {
                                int var182 = (this.field1170[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field1170[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field1187.field3720 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1185 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field1185.length) {
                    int[] var185 = this.field1185[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field1169 == null || (arg6 & this.field1169[var187]) != 0) {
                            int var188 = this.field1199[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field1199[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field1187.field3720 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "()I", line = 4517)
    public final int method515() {
        if (!this.field1162.field3559) {
            this.method550();
        }
        return this.field1162.field3564;
    }
}
