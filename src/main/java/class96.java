import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class96 extends class312 implements class66 {

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "Lta;")
    private class116 field1155 = new class116();

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "Lpg;")
    private class435 field1166 = new class327();

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    public int field1171 = 3;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public int field1172 = 8;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    private int field1174 = -1;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "[Lhh;")
    private class66[] field1170 = new class66[4];

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "Z")
    private boolean field1175 = false;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "Lbd;")
    private class37 field1169 = new class37();

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "Lbd;")
    private class37 field1180 = new class37();

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "Lbd;")
    private class37 field1181 = new class37();

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "Lbd;")
    private class37 field1182 = new class37();

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "Lbd;")
    private class37 field1183 = new class37();

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "Lbd;")
    private class37 field1184 = new class37();

    @OriginalMember(owner = "client!sq", name = "ab", descriptor = "Lbd;")
    private class37 field1185 = new class37();

    @OriginalMember(owner = "client!sq", name = "kb", descriptor = "F")
    public float field1195 = 3584.0F;

    @OriginalMember(owner = "client!sq", name = "qb", descriptor = "I")
    public int field1201 = 512;

    @OriginalMember(owner = "client!sq", name = "yb", descriptor = "I")
    public int field1209 = -1;

    @OriginalMember(owner = "client!sq", name = "Nb", descriptor = "I")
    public int field1224 = 50;

    @OriginalMember(owner = "client!sq", name = "ob", descriptor = "I")
    public int field1199 = -1;

    @OriginalMember(owner = "client!sq", name = "Eb", descriptor = "[F")
    private float[] field1215 = new float[16];

    @OriginalMember(owner = "client!sq", name = "Rb", descriptor = "I")
    private int field1228 = 8448;

    @OriginalMember(owner = "client!sq", name = "Bb", descriptor = "[F")
    private float[] field1212 = new float[4];

    @OriginalMember(owner = "client!sq", name = "ib", descriptor = "I")
    private int field1193 = 0;

    @OriginalMember(owner = "client!sq", name = "gb", descriptor = "I")
    private int field1191 = 0;

    @OriginalMember(owner = "client!sq", name = "fb", descriptor = "I")
    private int field1190 = 0;

    @OriginalMember(owner = "client!sq", name = "Yb", descriptor = "[F")
    public float[] field1235 = new float[4];

    @OriginalMember(owner = "client!sq", name = "hc", descriptor = "I")
    private int field1244 = -1;

    @OriginalMember(owner = "client!sq", name = "Dc", descriptor = "I")
    public int field1266 = 0;

    @OriginalMember(owner = "client!sq", name = "uc", descriptor = "I")
    public int field1257 = 3584;

    @OriginalMember(owner = "client!sq", name = "hb", descriptor = "I")
    private int field1192 = -1;

    @OriginalMember(owner = "client!sq", name = "ac", descriptor = "I")
    private int field1237 = 8448;

    @OriginalMember(owner = "client!sq", name = "kc", descriptor = "F")
    public float field1247 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "Ob", descriptor = "F")
    public float field1225 = -1.0F;

    @OriginalMember(owner = "client!sq", name = "pc", descriptor = "[F")
    private float[] field1252 = new float[4];

    @OriginalMember(owner = "client!sq", name = "Xb", descriptor = "F")
    public float field1234 = -1.0F;

    @OriginalMember(owner = "client!sq", name = "nb", descriptor = "I")
    private int field1198 = 0;

    @OriginalMember(owner = "client!sq", name = "Db", descriptor = "I")
    public int field1214 = 0;

    @OriginalMember(owner = "client!sq", name = "Hc", descriptor = "F")
    private float field1270 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "Gc", descriptor = "I")
    private int field1269 = 0;

    @OriginalMember(owner = "client!sq", name = "Ic", descriptor = "F")
    public float field1271 = 3584.0F;

    @OriginalMember(owner = "client!sq", name = "mc", descriptor = "I")
    public int field1249 = -1;

    @OriginalMember(owner = "client!sq", name = "qc", descriptor = "F")
    private float field1253 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "Lc", descriptor = "[F")
    private float[] field1274 = new float[4];

    @OriginalMember(owner = "client!sq", name = "Qb", descriptor = "F")
    public float field1227 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "Zb", descriptor = "Z")
    private boolean field1236 = true;

    @OriginalMember(owner = "client!sq", name = "Sc", descriptor = "I")
    public int field1281 = 512;

    @OriginalMember(owner = "client!sq", name = "Vc", descriptor = "F")
    private float field1284 = 0.0F;

    @OriginalMember(owner = "client!sq", name = "gc", descriptor = "I")
    private int field1243 = 0;

    @OriginalMember(owner = "client!sq", name = "Fc", descriptor = "F")
    public float field1268 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "Uc", descriptor = "I")
    private int field1283 = 0;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1153;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "Lah;")
    public class215 field1161;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "Ljaggl/context;")
    private context field1158;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "Ljaggl/opengl;")
    public opengl field1156;

    @OriginalMember(owner = "client!sq", name = "Rc", descriptor = "Z")
    public boolean field1280;

    @OriginalMember(owner = "client!sq", name = "tc", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!sq", name = "cc", descriptor = "Ljava/lang/String;")
    private String field1239;

    @OriginalMember(owner = "client!sq", name = "Ec", descriptor = "Ljava/lang/String;")
    private String field1267;

    @OriginalMember(owner = "client!sq", name = "Ac", descriptor = "Z")
    private boolean field1263;

    @OriginalMember(owner = "client!sq", name = "eb", descriptor = "Z")
    public boolean field1189;

    @OriginalMember(owner = "client!sq", name = "Lb", descriptor = "Z")
    public boolean field1222;

    @OriginalMember(owner = "client!sq", name = "Ub", descriptor = "Z")
    public boolean field1231;

    @OriginalMember(owner = "client!sq", name = "Vb", descriptor = "Z")
    private boolean field1232;

    @OriginalMember(owner = "client!sq", name = "lb", descriptor = "Z")
    public boolean field1196;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "Lnb;")
    public class164 field1164;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "Lt;")
    private class398 field1163;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lrq;")
    private class194 field1157;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "Lao;")
    private class157 field1165;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "[F")
    private static float[] field1154 = new float[4];

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "[I")
    private static int[] field1160 = new int[1000];

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "[F")
    private static float[] field1159 = new float[4];

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1162 = Boolean.FALSE;

    @OriginalMember(owner = "client!sq", name = "bb", descriptor = "F")
    public float field1186;

    @OriginalMember(owner = "client!sq", name = "jb", descriptor = "F")
    public float field1194;

    @OriginalMember(owner = "client!sq", name = "ub", descriptor = "F")
    public float field1205;

    @OriginalMember(owner = "client!sq", name = "vb", descriptor = "F")
    private float field1206;

    @OriginalMember(owner = "client!sq", name = "wb", descriptor = "F")
    public float field1207;

    @OriginalMember(owner = "client!sq", name = "Jb", descriptor = "F")
    private float field1220;

    @OriginalMember(owner = "client!sq", name = "Tb", descriptor = "F")
    private float field1230;

    @OriginalMember(owner = "client!sq", name = "jc", descriptor = "F")
    public float field1246;

    @OriginalMember(owner = "client!sq", name = "Jc", descriptor = "F")
    public float field1272;

    @OriginalMember(owner = "client!sq", name = "Qc", descriptor = "F")
    public float field1279;

    @OriginalMember(owner = "client!sq", name = "Tc", descriptor = "F")
    public float field1282;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!sq", name = "db", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!sq", name = "pb", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!sq", name = "rb", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!sq", name = "Ab", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!sq", name = "Kb", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!sq", name = "bc", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!sq", name = "dc", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!sq", name = "oc", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!sq", name = "rc", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!sq", name = "Bc", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!sq", name = "Oc", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!sq", name = "Pc", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!sq", name = "Zc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!sq", name = "ad", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client!sq", name = "tb", descriptor = "J")
    private long field1204;

    @OriginalMember(owner = "client!sq", name = "Fb", descriptor = "Ll;")
    private class14 field1216;

    @OriginalMember(owner = "client!sq", name = "lc", descriptor = "Lmq;")
    private class295 field1248;

    @OriginalMember(owner = "client!sq", name = "xb", descriptor = "Ldp;")
    public class2 field1208;

    @OriginalMember(owner = "client!sq", name = "Hb", descriptor = "Ldp;")
    public class2 field1218;

    @OriginalMember(owner = "client!sq", name = "nc", descriptor = "Ldp;")
    public class2 field1250;

    @OriginalMember(owner = "client!sq", name = "sc", descriptor = "Ldp;")
    public class2 field1255;

    @OriginalMember(owner = "client!sq", name = "yc", descriptor = "Ldp;")
    public class2 field1261;

    @OriginalMember(owner = "client!sq", name = "Mc", descriptor = "Ldp;")
    public class2 field1275;

    @OriginalMember(owner = "client!sq", name = "Cb", descriptor = "Llq;")
    public class327 field1213;

    @OriginalMember(owner = "client!sq", name = "ic", descriptor = "Llq;")
    public class327 field1245;

    @OriginalMember(owner = "client!sq", name = "Wb", descriptor = "Lai;")
    public class355 field1233;

    @OriginalMember(owner = "client!sq", name = "fc", descriptor = "Lai;")
    public class355 field1242;

    @OriginalMember(owner = "client!sq", name = "Nc", descriptor = "Lai;")
    public class355 field1276;

    @OriginalMember(owner = "client!sq", name = "wc", descriptor = "Leb;")
    private class371 field1259;

    @OriginalMember(owner = "client!sq", name = "zb", descriptor = "Lrg;")
    private class383 field1210;

    @OriginalMember(owner = "client!sq", name = "Mb", descriptor = "Lql;")
    public class437 field1223;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "Lhh;")
    private class66 field1176;

    @OriginalMember(owner = "client!sq", name = "cb", descriptor = "Z")
    private boolean field1187;

    @OriginalMember(owner = "client!sq", name = "mb", descriptor = "Z")
    private boolean field1197;

    @OriginalMember(owner = "client!sq", name = "sb", descriptor = "Z")
    public boolean field1203;

    @OriginalMember(owner = "client!sq", name = "Gb", descriptor = "Z")
    private boolean field1217;

    @OriginalMember(owner = "client!sq", name = "Ib", descriptor = "Z")
    private boolean field1219;

    @OriginalMember(owner = "client!sq", name = "Pb", descriptor = "Z")
    private boolean field1226;

    @OriginalMember(owner = "client!sq", name = "Sb", descriptor = "Z")
    public boolean field1229;

    @OriginalMember(owner = "client!sq", name = "ec", descriptor = "Z")
    private boolean field1241;

    @OriginalMember(owner = "client!sq", name = "vc", descriptor = "Z")
    private boolean field1258;

    @OriginalMember(owner = "client!sq", name = "xc", descriptor = "Z")
    private boolean field1260;

    @OriginalMember(owner = "client!sq", name = "zc", descriptor = "Z")
    private boolean field1262;

    @OriginalMember(owner = "client!sq", name = "Cc", descriptor = "Z")
    private boolean field1265;

    @OriginalMember(owner = "client!sq", name = "Wc", descriptor = "Z")
    public boolean field1285;

    @OriginalMember(owner = "client!sq", name = "Xc", descriptor = "Z")
    public boolean field1286;

    @OriginalMember(owner = "client!sq", name = "Yc", descriptor = "Z")
    public boolean field1287;

    @OriginalMember(owner = "client!sq", name = "Kc", descriptor = "[Lod;")
    private class293[] field1273;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "()V", line = 8)
    public final void method558() {
        this.method592(true);
        this.field1156.glClear(256);
    }

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "()V", line = 13)
    private final void method559() {
        this.field1282 = (float) (this.field1198 - this.field1214);
        this.field1272 = (float) (this.field1190 - this.field1214);
        this.field1194 = (float) (this.field1243 - this.field1266);
        this.field1186 = (float) (this.field1191 - this.field1266);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V", line = 22)
    public final void method560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method670();
        this.method699(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1156.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1156.glBegin(1);
        this.field1156.glVertex2f(var6, var7);
        this.field1156.glVertex2f(var6, (float) arg2 + var7);
        this.field1156.glEnd();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lid;Ljp;Lpg;Lcd;I)V", line = 35)
    public final void method561(class348 arg0, class198 arg1, class435 arg2, class170 arg3, int arg4) {
        arg0.method26(arg2, arg3, arg4);
        this.method624(arg1);
    }

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "()V", line = 39)
    public final void method562() {
        this.field1156.glPopMatrix();
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIIIII)V", line = 47)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method670();
        this.method699(arg5);
        this.field1156.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1260) {
            this.field1156.glDisable(32925);
        }
        this.field1156.glBegin(7);
        this.field1156.glVertex2f(var7, var8);
        this.field1156.glVertex2f(var7, var10);
        this.field1156.glVertex2f(var9, var10);
        this.field1156.glVertex2f(var9, var8);
        this.field1156.glEnd();
        if (this.field1260) {
            this.field1156.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Leb;", line = 71)
    public final class371 method564(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class371) (this.field1263 && !arg2 || this.field1232 ? new class177(this, arg0, arg1, arg2) : new class6(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "()Z", line = 80)
    public final boolean method565() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "()V", line = 86)
    public final void method566() {
        this.field1168 = this.field1153.getWidth();
        this.field1177 = this.field1153.getHeight();
        this.field1156.glViewport(this.field1193, this.field1283, this.field1168, this.field1177);
        this.method716();
        this.method609();
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 97)
    public final synchronized void method567(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1180.method246((byte) 75)) {
            class160 var4 = (class160) this.field1180.method248(-24951);
            field1160[var2++] = (int) var4.field2539;
            this.field1178 -= var4.field2527;
            if (var2 == 1000) {
                this.field1156.glDeleteBuffersARB(var2, field1160, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1156.glDeleteBuffersARB(var2, field1160, 0);
            var2 = 0;
        }
        while (!this.field1181.method246((byte) 75)) {
            class160 var5 = (class160) this.field1181.method248(-24951);
            field1160[var2++] = (int) var5.field2539;
            this.field1167 -= var5.field2527;
            if (var2 == 1000) {
                this.field1156.glDeleteTextures(var2, field1160, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1156.glDeleteTextures(var2, field1160, 0);
            var2 = 0;
        }
        while (!this.field1182.method246((byte) 75)) {
            class160 var6 = (class160) this.field1182.method248(-24951);
            field1160[var2++] = var6.field2527;
            if (var2 == 1000) {
                this.field1156.glDeleteFramebuffersEXT(var2, field1160, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1156.glDeleteFramebuffersEXT(var2, field1160, 0);
            var2 = 0;
        }
        while (!this.field1183.method246((byte) 75)) {
            class160 var7 = (class160) this.field1183.method248(-24951);
            field1160[var2++] = (int) var7.field2539;
            this.field1179 -= var7.field2527;
            if (var2 == 1000) {
                this.field1156.glDeleteRenderbuffersEXT(var2, field1160, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1156.glDeleteRenderbuffersEXT(var2, field1160, 0);
            var2 = 0;
        }
        while (!this.field1184.method246((byte) 75)) {
            class160 var8 = (class160) this.field1184.method248(-24951);
            field1160[var2++] = (int) var8.field2539;
            if (var2 == 1000) {
                this.field1156.glDeleteProgramsARB(var2, field1160, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1156.glDeleteProgramsARB(var2, field1160, 0);
            boolean var9 = false;
        }
        while (!this.field1169.method246((byte) 75)) {
            class160 var10 = (class160) this.field1169.method248(-24951);
            this.field1156.glDeleteLists((int) var10.field2539, var10.field2527);
        }
        while (!this.field1185.method246((byte) 75)) {
            class160 var11 = (class160) this.field1185.method248(-24951);
            this.field1156.glDeleteObjectARB(var11.field2527);
        }
        while (!this.field1169.method246((byte) 75)) {
            class160 var12 = (class160) this.field1169.method248(-24951);
            this.field1156.glDeleteLists((int) var12.field2539, var12.field2527);
        }
        if (this.method625() > 100663296 && class46.method297(27104) > this.field1204 + 60000L) {
            System.gc();
            this.field1204 = class46.method297(27104);
        }
        this.field1173 = var3;
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "()Z", line = 263)
    public final boolean method568() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "()V", line = 266)
    public final void method569() {
        if (this.field1240 == 16) {
            return;
        }
        this.method672();
        this.method722(true);
        this.method656(true);
        this.method592(true);
        this.method699(1);
        this.method691(1);
        this.field1240 = 16;
    }

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "()V", line = 279)
    public final void method570() {
        if (this.field1240 == 2) {
            return;
        }
        this.method645();
        this.method722(false);
        this.method667(false);
        this.method656(false);
        this.method592(false);
        this.method633(-2);
        this.field1240 = 2;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(Z)V", line = 295)
    public final void method571(boolean arg0) {
        this.field1236 = arg0;
        this.method717();
    }

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "()V", line = 299)
    private final void method572() {
        this.method633(-2);
        for (int var1 = this.field1200 - 1; var1 >= 0; var1--) {
            this.method628(var1);
            this.method688((class293) null);
            this.field1156.glTexEnvi(8960, 8704, 34160);
        }
        this.method680(8448, 8448);
        this.method712(2, 34168, 770);
        this.method719();
        this.field1264 = 1;
        this.field1156.glEnable(3042);
        this.field1156.glBlendFunc(770, 771);
        this.field1188 = 1;
        this.field1156.glEnable(3008);
        this.field1156.glAlphaFunc(516, 0.0F);
        this.field1197 = true;
        this.field1156.glColorMask(true, true, true, true);
        this.field1187 = true;
        this.method722(true);
        this.method667(true);
        this.method656(true);
        this.method592(true);
        this.method716();
        this.field1156.setSwapInterval(0);
        this.field1156.glShadeModel(7425);
        this.field1156.glClearDepth(1.0F);
        this.field1156.glDepthFunc(515);
        this.field1156.glPolygonMode(1028, 6914);
        this.field1156.glEnable(2884);
        this.field1156.glCullFace(1029);
        this.field1156.glMatrixMode(5888);
        this.field1156.glLoadIdentity();
        this.field1156.glColorMaterial(1028, 5634);
        this.field1156.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field1156.glLightfv(var4, 4608, var2, 0);
            this.field1156.glLightf(var4, 4615, 0.0F);
            this.field1156.glLightf(var4, 4616, 0.0F);
        }
        this.field1156.glEnable(16384);
        this.field1156.glEnable(16385);
        this.field1156.glFogf(2914, 0.95F);
        this.field1156.glFogi(2917, 9729);
        this.field1156.glHint(3156, 4353);
        this.field1192 = this.field1199 = -1;
        this.method609();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I)V", line = 364)
    public final void method573(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field1213.field5134 + (float) arg0 * this.field1213.field5125 + (float) arg1 * this.field1213.field5128 + this.field1213.field5127;
        if ((var5 < (float) this.field1224) || (var5 > (float) this.field1257)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field1213.field5124 + (float) arg0 * this.field1213.field5130 + (float) arg1 * this.field1213.field5129 + this.field1213.field5132) * (float) this.field1281 / var5);
        int var7 = (int) (((float) arg2 * this.field1213.field5136 + (float) arg0 * this.field1213.field5133 + (float) arg1 * this.field1213.field5126 + this.field1213.field5131) * (float) this.field1201 / var5);
        if ((float) var6 >= this.field1282 && (float) var6 <= this.field1272 && (float) var7 >= this.field1194 && (float) var7 <= this.field1186) {
            arg3[0] = (int) ((float) var6 - this.field1282);
            arg3[1] = (int) ((float) var7 - this.field1194);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "()V", line = 388)
    private final void method574() {
        if (this.field1241 && this.field1286 | this.field1209 >= 0) {
            this.field1156.glEnable(2912);
        } else {
            this.field1156.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V", line = 398)
    public final void method575(int arg0, int arg1, int arg2) {
        this.field1286 = true;
        this.field1244 = arg1;
        this.field1249 = arg2;
        this.method695();
        this.method574();
        this.field1163.method2500(false, 3, false, -1);
        this.field1163.method2499(arg0, -3710, true);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(III)V", line = 409)
    public final void method576(int arg0, int arg1, int arg2) {
        this.field1156.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)I", line = 414)
    public final int method577(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lka;)V", line = 448)
    public final void method578(class275 arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)I", line = 451)
    public final int method579(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(II)V", line = 456)
    public final synchronized void method580(int arg0, int arg1) {
        class160 var3 = new class160(arg1);
        var3.field2539 = (long) arg0;
        this.field1182.method245(500, var3);
    }

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "()Z", line = 462)
    public final boolean method581() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V", line = 469)
    public final void method582(int arg0, int arg1) {
        if (this.field1224 == arg0 && this.field1257 == arg1) {
            return;
        }
        this.field1224 = arg0;
        this.field1257 = arg1;
        this.method664();
        this.method695();
        if (this.field1254 == 3) {
            this.method681();
        } else if (this.field1254 == 2) {
            this.method707();
        }
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "()F", line = 486)
    public final float method583() {
        return this.field1205;
    }

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "()V", line = 489)
    private final void method584() {
        if (this.field1198 <= this.field1190 && this.field1243 <= this.field1191) {
            this.field1156.glScissor(this.field1198 + this.field1193, this.field1283 + this.field1177 - this.field1191, this.field1190 - this.field1198, this.field1191 - this.field1243);
        } else {
            this.field1156.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 496)
    public final void method585(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "()V", line = 499)
    private final void method586() {
        field1159[0] = this.field1227 * this.field1225;
        field1159[1] = this.field1247 * this.field1225;
        field1159[2] = this.field1268 * this.field1225;
        field1159[3] = 1.0F;
        this.field1156.glLightfv(16384, 4609, field1159, 0);
        field1159[0] = -this.field1234 * this.field1227;
        field1159[1] = -this.field1234 * this.field1247;
        field1159[2] = -this.field1234 * this.field1268;
        field1159[3] = 1.0F;
        this.field1156.glLightfv(16385, 4609, field1159, 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZZ)V", line = 512)
    public final void method587(int arg0, boolean arg1, boolean arg2) {
        if (this.field1251 != arg0) {
            if (arg0 < 0) {
                this.method719();
                this.method688((class293) null);
                if (!this.field1286) {
                    this.field1163.method2500(arg2, 0, arg1, -1);
                }
            } else {
                class355 var4 = this.field1164.method1158(arg0, -1);
                class266 var5 = this.field1161.method989(arg0, (byte) 75);
                if (var5.field4268 == 0 && var5.field4283 == 0) {
                    this.method719();
                } else {
                    int var6 = var5.field4282 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method709((float) (this.field1173 % var7 * var5.field4268) / (float) var7, (float) (this.field1173 % var7 * var5.field4283) / (float) var7, 0.0F);
                }
                if (this.field1286) {
                    this.field1163.method2500(arg2, 3, arg1, -1);
                    this.method688(var4);
                } else {
                    this.field1163.method2500(arg2, var5.field4279, arg1, -1);
                    this.field1163.method2499(var5.field4270, -3710, false);
                    if (!this.field1163.method2501(var4, (byte) 99)) {
                        this.method688(var4);
                    }
                }
            }
            this.field1251 = arg0;
        }
        this.field1240 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "()V", line = 563)
    private final void method588() {
        if (this.field1265 && !this.field1219) {
            this.field1156.glEnable(2896);
        } else {
            this.field1156.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(IIII)V", line = 574)
    public final void method589(int arg0, int arg1, int arg2, int arg3) {
        this.field1214 = arg0;
        this.field1266 = arg1;
        this.field1281 = arg2;
        this.field1201 = arg3;
        this.method664();
        this.method559();
        if (this.field1254 == 3) {
            this.method681();
        } else if (this.field1254 == 2) {
            this.method707();
        }
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "()V", line = 591)
    public final void method590() {
        if (this.field1165.method78((byte) 46)) {
            this.field1157.method1363(this.field1165);
            this.field1164.method1157(0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "()V", line = 604)
    public final void method591() {
        try {
            this.field1158.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(Z)V", line = 615)
    public final void method592(boolean arg0) {
        if (this.field1217 != arg0) {
            this.field1217 = arg0;
            this.method717();
            this.field1240 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFFF)V", line = 626)
    public final void method593(float arg0, float arg1, float arg2, float arg3) {
        field1159[0] = arg0;
        field1159[1] = arg1;
        field1159[2] = arg2;
        field1159[3] = arg3;
        this.field1156.glTexEnvfv(8960, 8705, field1159, 0);
    }

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "()Z", line = 633)
    public final boolean method594() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "(I)V", line = 638)
    public final synchronized void method595(int arg0) {
        class160 var2 = new class160(arg0);
        this.field1182.method245(500, var2);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V", line = 642)
    public final void method596(boolean arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I)Lq;", line = 644)
    public final class245 method597(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class438.method2698(arg2, arg1, this, arg0, -3073, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(FF)V", line = 647)
    public final void method598(float arg0, float arg1) {
        this.field1253 = arg0;
        this.field1284 = arg1;
        if (!this.field1286) {
            this.method695();
        }
    }

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "(I)V", line = 654)
    public final void method599(int arg0) {
        field1159[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field1159[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field1159[2] = (float) (arg0 & 0xFF) / 255.0F;
        field1159[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field1156.glTexEnvfv(8960, 8705, field1159, 0);
    }

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "()V", line = 664)
    private final void method600() {
        if (this.field1207 == 0.0F) {
            this.field1215[10] = this.field1206;
            this.field1215[14] = this.field1230;
        } else {
            float var1 = this.field1205 / (this.field1207 + this.field1205);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field1230 * (1.0F - var1) / this.field1207;
            this.field1215[10] = this.field1206 + var3;
            this.field1215[14] = this.field1230 * var2;
        }
        this.field1195 = (this.field1215[14] - (float) this.field1257) / this.field1215[10];
        this.field1271 = (float) this.field1257 - this.field1207;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIIII)Lma;", line = 689)
    public final class8 method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field1285 ? new class176(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIILq;II)V", line = 695)
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class245 arg6, int arg7, int arg8) {
        class438 var10 = (class438) arg6;
        class14 var11 = var10.field6430;
        this.method570();
        this.method688(var10.field6430);
        this.method699(arg5);
        this.method680(7681, 8448);
        this.method712(0, 34167, 768);
        float var12 = var11.field195 / (float) var11.field196;
        float var13 = var11.field198 / (float) var11.field199;
        this.field1156.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1156.glBegin(1);
        this.field1156.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field1156.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1156.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field1156.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1156.glEnd();
        this.method712(0, 5890, 768);
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(Z)V", line = 717)
    public final void method603(boolean arg0) {
        if (this.field1219 != arg0) {
            this.field1219 = arg0;
            this.method588();
        }
    }

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "()V", line = 727)
    private final void method604() {
        try {
            this.field1158.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(F)V", line = 735)
    public final void method605(float arg0) {
        if (this.field1270 != arg0) {
            this.field1270 = arg0;
            if (this.field1254 == 3) {
                this.method681();
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "()I", line = 746)
    public final int method606() {
        return 4;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lqd;Lqd;Lqd;Lqd;)V", line = 749)
    public final void method607(class259 arg0, class259 arg1, class259 arg2, class259 arg3) {
        if (arg0 == null) {
            this.field1156.glDisableClientState(32884);
        } else {
            this.field1156.glEnableClientState(32884);
            arg0.method1788(3187);
        }
        if (arg1 == null) {
            this.field1156.glDisableClientState(32885);
        } else {
            this.field1156.glEnableClientState(32885);
            arg1.method1790(-30208);
        }
        if (arg2 == null) {
            this.field1156.glDisableClientState(32886);
        } else {
            this.field1156.glEnableClientState(32886);
            arg2.method1789(-18430);
        }
        if (arg3 == null) {
            this.field1156.glDisableClientState(32888);
        } else {
            this.field1156.glEnableClientState(32888);
            arg3.method1791(11864);
        }
    }

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "()V", line = 783)
    private final void method608() {
        field1159[0] = this.field1246 * this.field1227;
        field1159[1] = this.field1247 * this.field1246;
        field1159[2] = this.field1268 * this.field1246;
        field1159[3] = 1.0F;
        this.field1156.glLightModelfv(2899, field1159, 0);
    }

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "()V", line = 792)
    public final void method609() {
        this.field1198 = 0;
        this.field1243 = 0;
        this.field1190 = this.field1168;
        this.field1191 = this.field1177;
        this.field1156.glDisable(3089);
        this.method559();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V", line = 800)
    public final void method610(int arg0, boolean arg1) {
        this.method587(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "()Lhh;", line = 803)
    public final class66 method611() {
        return this.field1176;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lgh;[Lvp;Z)Lmp;", line = 807)
    public final class452 method612(class325 arg0, class100[] arg1, boolean arg2) {
        return new class20(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lej;)V", line = 815)
    public final void method613(int arg0, class62[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class62 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field1154[0] = (float) var4.field812;
            field1154[1] = (float) var4.field805;
            field1154[2] = (float) var4.field809;
            field1154[3] = 1.0F;
            this.field1156.glLightfv(var5, 4611, field1154, 0);
            int var6 = var4.field808;
            float var7 = var4.field806 / 255.0F;
            field1154[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field1154[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field1154[2] = (float) (var6 & 0xFF) * var7;
            this.field1156.glLightfv(var5, 4609, field1154, 0);
            this.field1156.glLightf(var5, 4617, 1.0F / (float) (var4.field810 * var4.field810));
            this.field1156.glEnable(var5);
        }
        while (var3 < this.field1269) {
            this.field1156.glDisable(var3 + 16386);
            var3++;
        }
        this.field1269 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(II)V", line = 852)
    public final void method614(int arg0, int arg1) {
        this.field1193 = arg0;
        this.field1283 = arg1;
        this.field1156.glViewport(arg0, arg1, this.field1168, this.field1177);
        this.method584();
    }

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "()Z", line = 858)
    public final boolean method615() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "()Z", line = 861)
    public final boolean method616() {
        return this.field1260;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V", line = 864)
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "()I", line = 867)
    public final int method618() {
        int var1 = this.field1288;
        this.field1288 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FF)V", line = 874)
    public final void method619(float arg0, float arg1) {
        if (this.field1205 == arg0 && this.field1207 == arg1) {
            return;
        }
        this.field1205 = arg0;
        this.field1207 = arg1;
        this.method600();
        if (this.field1254 == 3) {
            this.method681();
        } else if (this.field1254 == 2) {
            this.method707();
        }
    }

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "()V", line = 890)
    private final void method620() {
        this.field1156.glLoadIdentity();
        this.field1156.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field1156.glMultMatrixf(this.field1213.method2173(-59), 0);
        this.method640();
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "()Z", line = 896)
    public final boolean method621() {
        return !this.field1262;
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(II)V", line = 900)
    public final synchronized void method622(int arg0, int arg1) {
        class160 var3 = new class160(arg1);
        var3.field2539 = (long) arg0;
        this.field1181.method245(500, var3);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[[I[[IIII)Llf;", line = 905)
    public final class129 method623(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class147(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljp;)V", line = 909)
    public final void method624(class198 arg0) {
        this.field1155.method847(this, arg0);
    }

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "()I", line = 913)
    public final int method625() {
        return this.field1178 + this.field1167 + this.field1179;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "()V", line = 916)
    public final void method626() {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Leb;)V", line = 918)
    public final void method627(class371 arg0) {
        if (this.field1259 != arg0 && this.field1263) {
            this.field1156.glBindBufferARB(34962, arg0.method85());
            this.field1259 = arg0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "(I)V", line = 927)
    public final void method628(int arg0) {
        if (this.field1211 != arg0) {
            this.field1156.glActiveTexture(arg0 + 33984);
            this.field1211 = arg0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "()F", line = 935)
    public final float method629() {
        return this.field1207;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V", line = 940)
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1156.glLineWidth((float) arg5);
        this.method651(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field1156.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIIII)V", line = 948)
    public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILq;II)V", line = 953)
    public final void method632(int arg0, class245 arg1, int arg2, int arg3) {
        class438 var5 = (class438) arg1;
        class14 var6 = var5.field6430;
        this.method570();
        this.method688(var5.field6430);
        this.method699(1);
        this.method680(7681, 8448);
        this.method712(0, 34167, 768);
        float var7 = var6.field195 / (float) var6.field196;
        float var8 = var6.field198 / (float) var6.field199;
        this.field1156.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field1156.glBegin(7);
        this.field1156.glTexCoord2f((float) (this.field1198 - arg2) * var7, (float) (this.field1243 - arg3) * var8);
        this.field1156.glVertex2i(this.field1198, this.field1243);
        this.field1156.glTexCoord2f((float) (this.field1198 - arg2) * var7, (float) (this.field1191 - arg3) * var8);
        this.field1156.glVertex2i(this.field1198, this.field1191);
        this.field1156.glTexCoord2f((float) (this.field1190 - arg2) * var7, (float) (this.field1191 - arg3) * var8);
        this.field1156.glVertex2i(this.field1190, this.field1191);
        this.field1156.glTexCoord2f((float) (this.field1190 - arg2) * var7, (float) (this.field1243 - arg3) * var8);
        this.field1156.glVertex2i(this.field1190, this.field1243);
        this.field1156.glEnd();
        this.method712(0, 5890, 768);
    }

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "(I)V", line = 986)
    public final void method633(int arg0) {
        this.method610(arg0, true);
    }

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "()Z", line = 989)
    public final boolean method634() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 999)
    public final void method635(int arg0) {
        this.method699(0);
        this.field1156.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field1156.glClear(16384);
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)V", line = 1005)
    public final void method636(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "()I", line = 1010)
    public final int method422() {
        return this.field1177;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V", line = 1013)
    public final void method637(int arg0) {
        this.method604();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lmq;)V", line = 1016)
    public final void method638(class295 arg0) {
        if (this.field1248 != arg0 && this.field1263) {
            this.field1156.glBindBufferARB(34963, arg0.method85());
            this.field1248 = arg0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lg;IIII)Lid;", line = 1024)
    public final class348 method639(class86 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class2(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "ab", descriptor = "()V", line = 1027)
    public final void method640() {
        this.field1156.glLightfv(16384, 4611, this.field1235, 0);
        this.field1156.glLightfv(16385, 4611, this.field1252, 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lvp;Z)Lgl;", line = 1036)
    public final class356 method641(class100 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field1401 * arg0.field1399];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1404 == null) {
            for (int var8 = 0; var8 < arg0.field1399; var8++) {
                for (int var9 = 0; var9 < arg0.field1401; var9++) {
                    int var10 = arg0.field1396[arg0.field1400[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field1399; var6++) {
                for (int var7 = 0; var7 < arg0.field1401; var7++) {
                    var3[var5++] = arg0.field1404[var4] << 24 | arg0.field1396[arg0.field1400[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class356 var11 = this.method703(var3, 0, arg0.field1401, arg0.field1401, arg0.field1399);
        var11.method2321(arg0.field1398, arg0.field1402, arg0.field1403, arg0.field1397);
        return var11;
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(IIII)V", line = 1093)
    public final void method642(int arg0, int arg1, int arg2, int arg3) {
        this.field1157.method1358(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "()I", line = 1097)
    public final int method643() {
        int var1 = this.field1289;
        this.field1289 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "()V", line = 1102)
    public final void method424() {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[BIZ)Leb;", line = 1105)
    public final class371 method644(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class371) (this.field1263 && !arg3 || this.field1232 ? new class177(this, arg0, arg1, arg2, arg3) : new class6(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!sq", name = "bb", descriptor = "()V", line = 1113)
    private final void method645() {
        if (this.field1254 == 1) {
            return;
        }
        this.field1156.glMatrixMode(5889);
        this.field1156.glLoadIdentity();
        if (this.field1168 > 0 && this.field1177 > 0) {
            this.field1156.glOrtho(0.0D, (double) this.field1168, (double) this.field1177, 0.0D, -1.0D, 1.0D);
        }
        this.field1156.glMatrixMode(5888);
        this.field1156.glLoadIdentity();
        this.field1254 = 1;
        this.field1240 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lmq;III)V", line = 1129)
    public final void method646(class295 arg0, int arg1, int arg2, int arg3) {
        this.method638(arg0);
        arg0.method1695(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(IIIIII)V", line = 1138)
    public final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method670();
        this.method699(arg5);
        this.field1156.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1260) {
            this.field1156.glDisable(32925);
        }
        this.field1156.glBegin(2);
        this.field1156.glVertex2f(var7, var8);
        this.field1156.glVertex2f(var7, var10);
        this.field1156.glVertex2f(var9, var10);
        this.field1156.glVertex2f(var9, var8);
        this.field1156.glEnd();
        if (this.field1260) {
            this.field1156.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "()Z", line = 1164)
    public final boolean method648() {
        if (!this.field1165.method78((byte) 46)) {
            if (!this.field1157.method1362(this.field1165)) {
                return false;
            }
            this.field1164.method1157(0);
        }
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "(I)I", line = 1176)
    public final int method649(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "(I)I", line = 1188)
    public final int method650(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(IIIIII)V", line = 1204)
    public final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method670();
        this.method699(arg5);
        this.field1156.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1156.glBegin(2);
        this.field1156.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1156.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1156.glEnd();
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V", line = 1216)
    public final void method652(boolean arg0) {
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I[BIZ)Lmq;", line = 1218)
    public final class295 method653(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class295) (this.field1263 && !arg3 || this.field1232 ? new class240(this, arg0, arg1, arg2, arg3) : new class274(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([I)V", line = 1226)
    public final void method654(int[] arg0) {
        arg0[0] = this.field1198;
        arg0[1] = this.field1243;
        arg0[2] = this.field1190;
        arg0[3] = this.field1191;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(FFF)V", line = 1234)
    public final void method655(float arg0, float arg1, float arg2) {
        class157.field2475 = arg0;
        class157.field2482 = arg1;
        class157.field2484 = arg2;
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(Z)V", line = 1240)
    public final void method656(boolean arg0) {
        if (this.field1226 == arg0) {
            return;
        }
        if (arg0) {
            this.field1156.glEnable(2929);
        } else {
            this.field1156.glDisable(2929);
        }
        this.field1226 = arg0;
        this.field1240 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "()Z", line = 1253)
    public final boolean method657() {
        return this.field1165.method78((byte) 46);
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(III)V", line = 1257)
    public final void method658(int arg0, int arg1, int arg2) {
        this.field1156.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field1156.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(III)V", line = 1261)
    public final void method659(int arg0, int arg1, int arg2) {
        if (!this.field1286) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field1244 = arg1;
        this.field1249 = arg2;
        this.method695();
        this.field1163.method2499(arg0, -3710, true);
    }

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "()Z", line = 1272)
    public final boolean method660() {
        return this.field1163.method2502(0, 3);
    }

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "()V", line = 1278)
    public final void method661() {
        if (this.field1168 <= 0 && this.field1177 <= 0) {
            return;
        }
        int var1 = this.field1198;
        int var2 = this.field1190;
        int var3 = this.field1243;
        int var4 = this.field1191;
        this.method609();
        this.field1156.glReadBuffer(1028);
        this.field1156.glDrawBuffer(1029);
        this.method716();
        this.method722(false);
        this.method667(false);
        this.method656(false);
        this.method592(false);
        this.method688((class293) null);
        this.method633(-2);
        this.method691(0);
        this.method699(0);
        this.field1156.glMatrixMode(5889);
        this.field1156.glLoadIdentity();
        this.field1156.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field1156.glMatrixMode(5888);
        this.field1156.glLoadIdentity();
        this.field1156.glRasterPos2i(0, 0);
        this.field1156.glCopyPixels(0, 0, this.field1168, this.field1177, 6144);
        this.field1156.glFlush();
        this.field1156.glReadBuffer(1029);
        this.field1156.glDrawBuffer(1029);
        this.method671(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(II)V", line = 1316)
    public final synchronized void method662(int arg0, int arg1) {
        class160 var3 = new class160(arg1);
        var3.field2539 = (long) arg0;
        this.field1180.method245(500, var3);
    }

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "(I)V", line = 1322)
    public final synchronized void method663(int arg0) {
        class160 var2 = new class160(arg0);
        this.field1185.method245(500, var2);
    }

    @OriginalMember(owner = "client!sq", name = "cb", descriptor = "()V", line = 1327)
    private final void method664() {
        float[] var1 = this.field1215;
        float var2 = (float) (-this.field1214 * this.field1224) / (float) this.field1281;
        float var3 = (float) ((this.field1168 - this.field1214) * this.field1224) / (float) this.field1281;
        float var4 = (float) (this.field1266 * this.field1224) / (float) this.field1201;
        float var5 = (float) ((this.field1266 - this.field1177) * this.field1224) / (float) this.field1201;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field1224 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field1206 = (float) (-(this.field1257 + this.field1224)) / (float) (this.field1257 - this.field1224);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field1230 = -((float) this.field1257 * var6) / (float) (this.field1257 - this.field1224);
            var1[15] = 0.0F;
        }
        this.method600();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1380)
    public final void method665(Rectangle[] arg0, int arg1) {
        this.method591();
    }

    @OriginalMember(owner = "client!sq", name = "db", descriptor = "()V", line = 1387)
    public final void method666() {
        if (this.field1240 == 4) {
            return;
        }
        this.method645();
        this.method722(false);
        this.method667(false);
        this.method656(false);
        this.method592(false);
        this.method633(-2);
        this.method699(1);
        this.method691(1);
        this.field1240 = 4;
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(Z)V", line = 1402)
    public final void method667(boolean arg0) {
        if (this.field1265 != arg0) {
            this.field1265 = arg0;
            this.method588();
            this.field1240 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lid;Lpg;[Lcd;I)V", line = 1413)
    public final void method668(class348[] arg0, class435 arg1, class170[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method26(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "eb", descriptor = "()V", line = 1424)
    public final void method669() {
        if (this.field1240 == 8) {
            return;
        }
        this.method677();
        this.method722(true);
        this.method656(true);
        this.method592(true);
        this.method699(1);
        this.method691(1);
        this.field1240 = 8;
    }

    @OriginalMember(owner = "client!sq", name = "fb", descriptor = "()V", line = 1439)
    private final void method670() {
        if (this.field1240 == 1) {
            return;
        }
        this.method645();
        this.method722(false);
        this.method667(false);
        this.method656(false);
        this.method592(false);
        this.method688((class293) null);
        this.method633(-2);
        this.method691(0);
        this.field1240 = 1;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "()V", line = 1456)
    public final void method423() {
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(IIII)V", line = 1460)
    public final void method671(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field1168) {
            arg2 = this.field1168;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field1177) {
            arg3 = this.field1177;
        }
        this.field1198 = arg0;
        this.field1243 = arg1;
        this.field1190 = arg2;
        this.field1191 = arg3;
        this.field1156.glEnable(3089);
        this.method559();
        this.method584();
    }

    @OriginalMember(owner = "client!sq", name = "gb", descriptor = "()V", line = 1481)
    private final void method672() {
        if (this.field1254 != 3) {
            this.field1254 = 3;
            this.method681();
            this.method620();
            this.field1240 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "()V", line = 1495)
    public final void method673() {
        this.field1163.method2500(false, 0, false, -1);
        this.field1286 = false;
        this.method695();
        this.method574();
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V", line = 1501)
    public final void method674(int arg0) {
        this.method721();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)[I", line = 1508)
    public final int[] method675(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field1156.glReadPixels(arg0, this.field1177 - arg1 - var6, arg2, 1, 32993, this.field1256, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "()Z", line = 1521)
    public final boolean method676() {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "hb", descriptor = "()V", line = 1524)
    public final void method677() {
        if (this.field1254 != 2) {
            this.field1254 = 2;
            this.method707();
            this.method620();
            this.field1240 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!sq", name = "ib", descriptor = "()Lrj;", line = 1534)
    public final class352 method678() {
        return this.field1210 == null ? null : this.field1210.method900(16057);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lhh;)V", line = 1537)
    public final void method679(class66 arg0) {
        if (this.field1174 >= 3) {
            throw new RuntimeException();
        }
        if (this.field1174 >= 0) {
            this.field1170[this.field1174].method424();
        }
        this.field1176 = this.field1170[++this.field1174] = arg0;
        this.field1176.method423();
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "(II)V", line = 1548)
    public final void method680(int arg0, int arg1) {
        if (this.field1211 != 0) {
            this.field1156.glTexEnvi(8960, 34161, arg0);
            this.field1156.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field1228 != arg0) {
            this.field1156.glTexEnvi(8960, 34161, arg0);
            this.field1228 = arg0;
            var3 = true;
        }
        if (this.field1237 != arg1) {
            this.field1156.glTexEnvi(8960, 34162, arg1);
            this.field1237 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field1240 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "jb", descriptor = "()V", line = 1585)
    private final void method681() {
        float var1 = (float) (-this.field1214) * this.field1270 / (float) this.field1281;
        float var2 = (float) (-this.field1266) * this.field1270 / (float) this.field1201;
        float var3 = (float) (this.field1168 - this.field1214) * this.field1270 / (float) this.field1281;
        float var4 = (float) (this.field1177 - this.field1266) * this.field1270 / (float) this.field1201;
        this.field1156.glMatrixMode(5889);
        this.field1156.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field1156.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field1224 - this.field1207), (double) ((float) this.field1257 - this.field1207));
        }
        this.field1156.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)V", line = 1605)
    public final void method682(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1198 < arg0) {
            this.field1198 = arg0;
        }
        if (this.field1190 > arg2) {
            this.field1190 = arg2;
        }
        if (this.field1243 < arg1) {
            this.field1243 = arg1;
        }
        if (this.field1191 > arg3) {
            this.field1191 = arg3;
        }
        this.field1156.glEnable(3089);
        this.method559();
        this.method584();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IFFFFF)V", line = 1625)
    public final void method683(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field1192 != arg0;
        if (var7 || this.field1225 != arg1 || this.field1234 != arg2) {
            this.field1192 = arg0;
            this.field1225 = arg1;
            this.field1234 = arg2;
            if (var7) {
                this.field1227 = (float) (this.field1192 & 0xFF0000) / 1.671168E7F;
                this.field1247 = (float) (this.field1192 & 0xFFFF) / 65535.0F;
                this.field1268 = (float) (this.field1192 & 0xFF) / 255.0F;
                this.method608();
            }
            this.method586();
        }
        if (this.field1212[0] == arg3 && this.field1212[1] == arg4 && this.field1212[2] == arg5) {
            return;
        }
        this.field1212[0] = arg3;
        this.field1212[1] = arg4;
        this.field1212[2] = arg5;
        this.field1274[0] = -arg3;
        this.field1274[1] = -arg4;
        this.field1274[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field1235[0] = arg3 * var8;
        this.field1235[1] = arg4 * var8;
        this.field1235[2] = arg5 * var8;
        this.field1252[0] = -this.field1235[0];
        this.field1252[1] = -this.field1235[1];
        this.field1252[2] = -this.field1235[2];
        this.method640();
        this.field1277 = (int) (arg3 * 256.0F / arg4);
        this.field1221 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIIII)V", line = 1673)
    public final void method684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method670();
        this.method699(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1156.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1156.glBegin(1);
        this.field1156.glVertex2f(var6, var7);
        this.field1156.glVertex2f((float) arg2 + var6, var7);
        this.field1156.glEnd();
    }

    @OriginalMember(owner = "client!sq", name = "kb", descriptor = "()V", line = 1686)
    private final void method685() {
        this.field1213 = new class327();
        this.field1245 = new class327();
        this.field1273 = new class293[this.field1200];
        this.field1276 = new class355(this, 3553, 6408, 1, 1);
        this.field1242 = new class355(this, 3553, 6408, 1, 1);
        this.field1233 = new class355(this, 3553, 6408, 1, 1);
        this.field1261 = new class2(this);
        this.field1275 = new class2(this);
        this.field1255 = new class2(this);
        this.field1218 = new class2(this);
        this.field1208 = new class2(this);
        this.field1250 = new class2(this);
        if (this.field1196) {
            this.field1223 = new class437(this);
        }
        this.field1155.method849(this);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ)Lgl;", line = 1706)
    public final class356 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class387(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lid;Ljp;Lpg;[Lcd;I)V", line = 1709)
    public final void method687(class348[] arg0, class198 arg1, class435 arg2, class170[] arg3, int arg4) {
        this.method668(arg0, arg2, arg3, arg4);
        this.method624(arg1);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lod;)V", line = 1719)
    public final void method688(class293 arg0) {
        class293 var2 = this.field1273[this.field1211];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field1156.glDisable(var2.field4695);
            } else {
                if (var2 == null) {
                    this.field1156.glEnable(arg0.field4695);
                } else if (arg0.field4695 != var2.field4695) {
                    this.field1156.glDisable(var2.field4695);
                    this.field1156.glEnable(arg0.field4695);
                }
                this.field1156.glBindTexture(arg0.field4695, arg0.method1976());
            }
            this.field1273[this.field1211] = arg0;
        }
        this.field1240 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lma;Lma;FLma;)Lma;", line = 1747)
    public final class8 method689(class8 arg0, class8 arg1, float arg2, class8 arg3) {
        if (arg0 != null && arg1 != null && this.field1285 && this.field1196) {
            class123 var5 = null;
            class383 var6 = (class383) arg0;
            class383 var7 = (class383) arg1;
            class352 var8 = var6.method900(16057);
            class352 var9 = var7.method900(16057);
            if (var8 != null && var9 != null) {
                int var10 = var8.field5430 > var9.field5430 ? var8.field5430 : var9.field5430;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class123) {
                    class123 var11 = (class123) arg3;
                    if (var11.method899((byte) 113) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class123(this, var10);
                }
                var5.method901(var9, var8, arg2, 1);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "()I", line = 1786)
    public final int method690() {
        return this.field1224;
    }

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "(I)V", line = 1789)
    public final void method691(int arg0) {
        if (arg0 == 0) {
            this.method680(7681, 7681);
        } else if (arg0 == 1) {
            this.method680(8448, 8448);
        } else if (arg0 == 2) {
            this.method680(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V", line = 1804)
    public final void method692(int arg0, int arg1) {
        if (this.field1199 == arg0 && this.field1209 == arg1) {
            return;
        }
        this.field1199 = arg0;
        this.field1209 = arg1;
        if (!this.field1286) {
            this.method695();
            this.method574();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lpg;)V", line = 1820)
    public final void method693(class435 arg0) {
        this.field1213 = (class327) arg0;
        this.field1245.method2175(this.field1213, 2708);
        if (this.field1254 != 1) {
            this.method620();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lma;)V", line = 1827)
    public final void method694(class8 arg0) {
        this.field1210 = (class383) arg0;
    }

    @OriginalMember(owner = "client!sq", name = "lb", descriptor = "()V", line = 1835)
    private final void method695() {
        int var1;
        if (this.field1286) {
            this.field1156.glFogf(2915, 0.0F);
            this.field1156.glFogf(2916, 1.0F);
            var1 = this.field1244;
        } else {
            this.field1220 = (float) (this.field1257 - 256) - this.field1284;
            this.field1279 = this.field1220 - (float) this.field1209 * this.field1253;
            if (this.field1279 < (float) this.field1224) {
                this.field1279 = (float) this.field1224;
            }
            this.field1156.glFogf(2915, this.field1279);
            this.field1156.glFogf(2916, this.field1220);
            var1 = this.field1199;
        }
        field1159[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field1159[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field1159[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field1156.glFogfv(2918, field1159, 0);
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Lka;", line = 1860)
    public final class275 method696(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Llq;)V", line = 1864)
    public final void method697(class327 arg0) {
        this.field1156.glPushMatrix();
        this.field1156.glMultMatrixf(arg0.method2173(-19), 0);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Lhh;)V", line = 1869)
    public final void method698(class66 arg0) {
        if (this.field1174 < 0 || this.field1170[this.field1174] != arg0) {
            throw new RuntimeException();
        }
        this.field1170[this.field1174--] = null;
        arg0.method424();
        if (this.field1174 >= 0) {
            this.field1176 = this.field1170[this.field1174];
            this.field1176.method423();
        }
    }

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "(I)V", line = 1882)
    public final void method699(int arg0) {
        if (this.field1264 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field1187 != var3) {
            this.field1156.glColorMask(var3, var3, var3, true);
            this.field1187 = var3;
        }
        if (this.field1197 != var4) {
            if (var4) {
                this.field1156.glEnable(3008);
            } else {
                this.field1156.glDisable(3008);
            }
            this.field1197 = var4;
        }
        if (this.field1188 != var2) {
            if (var2 == 1) {
                this.field1156.glEnable(3042);
                this.field1156.glBlendEquation(32774);
                this.field1156.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field1156.glEnable(3042);
                this.field1156.glBlendEquation(32774);
                this.field1156.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field1156.glEnable(3042);
                this.field1156.glBlendEquation(32778);
                this.field1156.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field1156.glEnable(3042);
                this.field1156.glBlendEquation(32774);
                this.field1156.glBlendFunc(774, 1);
            } else {
                this.field1156.glDisable(3042);
            }
            this.field1188 = var2;
        }
        this.field1264 = arg0;
        this.field1240 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "(I)V", line = 1993)
    public final synchronized void method700(int arg0) {
        class160 var2 = new class160(arg0);
        this.field1184.method245(500, var2);
    }

    @OriginalMember(owner = "client!sq", name = "mb", descriptor = "()I", line = 1999)
    private final int method701() {
        int var1 = 0;
        this.field1239 = this.field1156.glGetString(7936);
        this.field1267 = this.field1156.glGetString(7937);
        String var2 = this.field1239.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field1156.glGetString(7938);
        String[] var4 = class63.method410(var3.replace('.', ' '), ' ', -1);
        if (var4.length >= 2) {
            try {
                int var5 = class162.method1128(var4[0], 104);
                int var6 = class162.method1128(var4[1], 110);
                this.field1238 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field1238 < 12) {
            var1 |= 0x2;
        }
        if (!this.field1156.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field1156.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field1156.glGetIntegerv(34018, var8, 0);
        this.field1200 = var8[0];
        this.field1156.glGetIntegerv(34929, var8, 0);
        this.field1278 = var8[0];
        this.field1156.glGetIntegerv(34930, var8, 0);
        this.field1202 = var8[0];
        if (this.field1200 < 2 || this.field1278 < 2 || this.field1202 < 2) {
            var1 |= 0x10;
        }
        this.field1262 = class279.field4459 != null && class279.field4459.startsWith("mac");
        this.field1280 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field1263 = this.field1156.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field1260 = this.field1156.isExtensionAvailable("GL_ARB_multisample");
        this.field1203 = this.field1156.isExtensionAvailable("GL_ARB_vertex_program");
        this.field1156.isExtensionAvailable("GL_ARB_fragment_program");
        this.field1156.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field1287 = this.field1156.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field1189 = this.field1156.isExtensionAvailable("GL_EXT_texture3D");
        this.field1231 = this.field1156.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field1285 = this.field1156.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field1222 = this.field1156.isExtensionAvailable("GL_ARB_texture_float");
        this.field1229 = false;
        this.field1196 = this.field1156.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "()I", line = 2073)
    public final int method702() {
        return this.field1257;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIIII)Lgl;", line = 2077)
    public final class356 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class387(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "()Lpg;", line = 2082)
    public final class435 method704() {
        return new class327();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[BII)V", line = 2089)
    public final void method705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field1216 == null || this.field1216.field5455 < arg2 || this.field1216.field5456 < arg3) {
            this.field1216 = class14.method124(this, arg6, 3553, arg2, 6406, 6406, arg3, false);
            this.field1216.method2309(false, false);
            var10 = this.field1216.field198;
            var11 = this.field1216.field195;
        } else {
            this.field1216.method2312(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field1216.field198 / (float) this.field1216.field5456;
            var11 = (float) arg2 * this.field1216.field195 / (float) this.field1216.field5455;
        }
        this.method570();
        this.method688(this.field1216);
        this.method699(arg8);
        this.field1156.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method599(arg5);
        this.method680(34165, 34165);
        this.method712(0, 34166, 768);
        this.method712(2, 5890, 770);
        this.method658(0, 34166, 770);
        this.method658(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field1156.glBegin(7);
        this.field1156.glTexCoord2f(0.0F, 0.0F);
        this.field1156.glVertex2f(var12, var13);
        this.field1156.glTexCoord2f(0.0F, var11);
        this.field1156.glVertex2f(var12, var15);
        this.field1156.glTexCoord2f(var10, var11);
        this.field1156.glVertex2f(var14, var15);
        this.field1156.glTexCoord2f(var10, 0.0F);
        this.field1156.glVertex2f(var14, var13);
        this.field1156.glEnd();
        this.method712(0, 5890, 768);
        this.method712(2, 34166, 770);
        this.method658(0, 5890, 770);
        this.method658(2, 34166, 770);
    }

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "()Z", line = 2137)
    public final boolean method706() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "nb", descriptor = "()V", line = 2143)
    private final void method707() {
        this.field1156.glMatrixMode(5889);
        this.field1156.glLoadMatrixf(this.field1215, 0);
        this.field1156.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(IIIIII)Z", line = 2149)
    public final boolean method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field1213.field5134 + (float) arg0 * this.field1213.field5125 + (float) arg1 * this.field1213.field5128 + this.field1213.field5127;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field1213.field5134 + (float) arg3 * this.field1213.field5125 + (float) arg4 * this.field1213.field5128 + this.field1213.field5127;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field1224) || !(var8 < (float) this.field1224)) || !(!(var7 > (float) this.field1257) || !(var8 > (float) this.field1257))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field1213.field5124 + (float) arg0 * this.field1213.field5130 + (float) arg1 * this.field1213.field5129 + this.field1213.field5132) * (float) this.field1281 / var7);
        int var10 = (int) (((float) arg5 * this.field1213.field5124 + (float) arg3 * this.field1213.field5130 + (float) arg4 * this.field1213.field5129 + this.field1213.field5132) * (float) this.field1281 / var8);
        if ((float) var9 < this.field1282 && (float) var10 < this.field1282 || (float) var9 > this.field1272 && (float) var10 > this.field1272) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field1213.field5136 + (float) arg0 * this.field1213.field5133 + (float) arg1 * this.field1213.field5126 + this.field1213.field5131) * (float) this.field1201 / var7);
            int var12 = (int) (((float) arg5 * this.field1213.field5136 + (float) arg3 * this.field1213.field5133 + (float) arg4 * this.field1213.field5126 + this.field1213.field5131) * (float) this.field1201 / var8);
            return (!((float) var11 < this.field1194) || !((float) var12 < this.field1194)) && (!((float) var11 > this.field1186) || !((float) var12 > this.field1186));
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(FFF)V", line = 2180)
    private final void method709(float arg0, float arg1, float arg2) {
        this.field1156.glMatrixMode(5890);
        if (this.field1258) {
            this.field1156.glLoadIdentity();
        }
        this.field1156.glTranslatef(arg0, arg1, arg2);
        this.field1156.glMatrixMode(5888);
        this.field1258 = true;
    }

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "()Z", line = 2190)
    public final boolean method710() {
        return this.field1165.method1107();
    }

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "()Z", line = 2193)
    public final boolean method711() {
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(III)V", line = 2199)
    public final void method712(int arg0, int arg1, int arg2) {
        this.field1156.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field1156.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "()Lpg;", line = 2206)
    public final class435 method713() {
        return this.field1166;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(F)V", line = 2213)
    public final void method714(float arg0) {
        if (this.field1246 != arg0) {
            this.field1246 = arg0;
            this.method608();
        }
    }

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "()V", line = 2221)
    public final void method715() {
        if (this.field1156 != null) {
            try {
                this.field1157.method1361();
            } catch (Throwable var4) {
            }
            this.field1156 = null;
        }
        if (this.field1158 != null) {
            this.method604();
            try {
                this.field1158.destroy();
            } catch (Throwable var3) {
            }
            this.field1158 = null;
        }
        if (this.field1175) {
            class436.method2683(true, true, false);
            this.field1175 = false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "ob", descriptor = "()V", line = 2252)
    public final void method716() {
        if (this.field1254 != 0) {
            this.field1254 = 0;
            this.field1240 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "pb", descriptor = "()V", line = 2262)
    private final void method717() {
        this.field1156.glDepthMask(this.field1217 && this.field1236);
    }

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "()V", line = 2268)
    public final void method718() {
        this.field1157.method1365();
    }

    @OriginalMember(owner = "client!sq", name = "qb", descriptor = "()V", line = 2271)
    private final void method719() {
        if (this.field1258) {
            this.field1156.glMatrixMode(5890);
            this.field1156.glLoadIdentity();
            this.field1156.glMatrixMode(5888);
            this.field1258 = false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I", line = 2282)
    public final int method720(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sq", name = "rb", descriptor = "()V", line = 2290)
    private final void method721() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field1158.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class84.method517((byte) 124, 1000L);
        }
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "(Z)V", line = 2312)
    public final void method722(boolean arg0) {
        if (this.field1241 != arg0) {
            this.field1241 = arg0;
            this.method574();
            this.field1240 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lah;IILap;)V", line = 2602)
    public class96(Canvas arg0, class215 arg1, int arg2, int arg3, class279 arg4) {
        this.field1153 = arg0;
        this.field1161 = arg1;
        this.field4911 = arg2;
        int var6 = 0;
        while (!this.field1153.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class84.method517((byte) -111, 1000L);
        }
        this.field1153.setIgnoreRepaint(true);
        try {
            if (field1162 == null || !field1162) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field1162 = Boolean.TRUE;
                } else {
                    class26 var7 = arg4.method1884(0, this.getClass());
                    while (var7.field304 == 0) {
                        class84.method517((byte) 119, 100L);
                    }
                    if (var7.field304 == 1) {
                        field1162 = Boolean.TRUE;
                    }
                }
            }
            if (field1162 == null || !field1162) {
                throw new RuntimeException("");
            }
            this.field1158 = new context();
            if (!this.field1158.choosePixelFormat(this.field1153, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field1158.createContext()) {
                this.method721();
                this.field1156 = this.field1158.getGL();
                int var8 = this.method701();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field1256 = this.field1280 ? 33639 : 5121;
                String var9 = this.field1239.toLowerCase();
                String var10 = this.field1267.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class63.method410(var10.replace('/', ' '), ' ', -1);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class9.method99(10, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class9.method99(10, var16.substring(0, 4))) {
                                        var11 = class162.method1128(var16.substring(0, 4), 118);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field1263 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field1189 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field1222 = false;
                    }
                    this.field1231 &= this.field1156.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field1232 = this.field1263;
                }
                if (var9.contains("intel")) {
                    this.field1196 = false;
                }
                if (this.field1263) {
                    try {
                        int[] var18 = new int[1];
                        this.field1156.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method679(this);
                this.method566();
                this.method685();
                new class319(this);
                this.field1164 = new class164(this, this.field1161);
                class213.method1498(0, true, true);
                this.field1175 = true;
                this.field1163 = new class398(this);
                this.field1157 = new class194(this);
                this.field1165 = new class157(this);
                this.method572();
                this.field1156.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field1158.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class84.method517((byte) -47, 100L);
                    }
                }
                this.field1156.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method715();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
