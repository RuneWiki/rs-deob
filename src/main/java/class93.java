import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class93 extends class492 {

    @OriginalMember(owner = "client!sb", name = "ph", descriptor = "Lfha;")
    private class522 field1273 = new class522();

    @OriginalMember(owner = "client!sb", name = "zi", descriptor = "Lfha;")
    private class522 field1335 = new class522();

    @OriginalMember(owner = "client!sb", name = "Bi", descriptor = "Lfha;")
    private class522 field1337 = new class522();

    @OriginalMember(owner = "client!sb", name = "Fi", descriptor = "Lfha;")
    private class522 field1341 = new class522();

    @OriginalMember(owner = "client!sb", name = "Ji", descriptor = "Lfha;")
    private class522 field1345 = new class522();

    @OriginalMember(owner = "client!sb", name = "Ki", descriptor = "Lfha;")
    private class522 field1346 = new class522();

    @OriginalMember(owner = "client!sb", name = "Li", descriptor = "Lfha;")
    private class522 field1347 = new class522();

    @OriginalMember(owner = "client!sb", name = "Ui", descriptor = "[Ljw;")
    private class281[] field1356 = new class281[16];

    @OriginalMember(owner = "client!sb", name = "Si", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field1354 = new MapBuffer();

    @OriginalMember(owner = "client!sb", name = "Vi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field1357 = new MapBuffer();

    @OriginalMember(owner = "client!sb", name = "gj", descriptor = "I")
    private int field1368 = 0;

    @OriginalMember(owner = "client!sb", name = "ci", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1312;

    @OriginalMember(owner = "client!sb", name = "cj", descriptor = "Ljava/lang/String;")
    private String field1364;

    @OriginalMember(owner = "client!sb", name = "Zi", descriptor = "Ljava/lang/String;")
    private String field1361;

    @OriginalMember(owner = "client!sb", name = "ej", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!sb", name = "Xi", descriptor = "Z")
    public boolean field1359;

    @OriginalMember(owner = "client!sb", name = "hj", descriptor = "Z")
    private boolean field1369;

    @OriginalMember(owner = "client!sb", name = "bj", descriptor = "Z")
    private boolean field1363;

    @OriginalMember(owner = "client!sb", name = "Wi", descriptor = "Z")
    public boolean field1358;

    @OriginalMember(owner = "client!sb", name = "Yi", descriptor = "Z")
    public boolean field1360;

    @OriginalMember(owner = "client!sb", name = "fj", descriptor = "Z")
    public boolean field1367;

    @OriginalMember(owner = "client!sb", name = "dj", descriptor = "[I")
    public int[] field1365;

    @OriginalMember(owner = "client!sb", name = "aj", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!sb", name = "ih", descriptor = "Z")
    public static boolean field1266 = false;

    @OriginalMember(owner = "client!sb", name = "Ph", descriptor = "Z")
    public static boolean field1299 = true;

    @OriginalMember(owner = "client!sb", name = "ui", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!sb", name = "ti", descriptor = "I")
    public static int field1329 = -1;

    @OriginalMember(owner = "client!sb", name = "zh", descriptor = "I")
    public static int field1283 = 16777215;

    @OriginalMember(owner = "client!sb", name = "Og", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!sb", name = "Pg", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!sb", name = "Qg", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!sb", name = "Rg", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!sb", name = "Sg", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!sb", name = "Tg", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!sb", name = "Ug", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!sb", name = "Vg", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!sb", name = "Wg", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!sb", name = "Xg", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!sb", name = "Yg", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!sb", name = "Zg", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!sb", name = "ah", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!sb", name = "bh", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!sb", name = "ch", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!sb", name = "dh", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!sb", name = "eh", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!sb", name = "gh", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!sb", name = "hh", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!sb", name = "jh", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!sb", name = "kh", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!sb", name = "lh", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!sb", name = "mh", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!sb", name = "nh", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!sb", name = "oh", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!sb", name = "qh", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!sb", name = "rh", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!sb", name = "sh", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!sb", name = "th", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!sb", name = "uh", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!sb", name = "vh", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!sb", name = "wh", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!sb", name = "xh", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!sb", name = "yh", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!sb", name = "Ah", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!sb", name = "Bh", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!sb", name = "Ch", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!sb", name = "Dh", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!sb", name = "Eh", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!sb", name = "Fh", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!sb", name = "Gh", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!sb", name = "Hh", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!sb", name = "Ih", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!sb", name = "Jh", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!sb", name = "Kh", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!sb", name = "Lh", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!sb", name = "Mh", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!sb", name = "Nh", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!sb", name = "Oh", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!sb", name = "Qh", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!sb", name = "Rh", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!sb", name = "Sh", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!sb", name = "Th", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!sb", name = "Uh", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!sb", name = "Vh", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!sb", name = "Wh", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!sb", name = "Xh", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!sb", name = "Yh", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!sb", name = "Zh", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!sb", name = "ai", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!sb", name = "bi", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!sb", name = "di", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!sb", name = "ei", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!sb", name = "fi", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!sb", name = "gi", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!sb", name = "hi", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!sb", name = "ii", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!sb", name = "ji", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!sb", name = "ki", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!sb", name = "li", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!sb", name = "mi", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!sb", name = "ni", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!sb", name = "oi", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!sb", name = "pi", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!sb", name = "qi", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!sb", name = "ri", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!sb", name = "si", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!sb", name = "vi", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!sb", name = "wi", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!sb", name = "xi", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!sb", name = "yi", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!sb", name = "Ai", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!sb", name = "Ci", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!sb", name = "Di", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!sb", name = "Ei", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!sb", name = "Gi", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!sb", name = "Hi", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!sb", name = "Ii", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!sb", name = "Oi", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!sb", name = "Ni", descriptor = "J")
    private long field1349;

    @OriginalMember(owner = "client!sb", name = "fh", descriptor = "Ltfa;")
    public static class284 field1263;

    @OriginalMember(owner = "client!sb", name = "Mi", descriptor = "Z")
    private boolean field1348;

    @OriginalMember(owner = "client!sb", name = "Pi", descriptor = "Z")
    private boolean field1351;

    @OriginalMember(owner = "client!sb", name = "Qi", descriptor = "Z")
    private boolean field1352;

    @OriginalMember(owner = "client!sb", name = "Ri", descriptor = "Z")
    private boolean field1353;

    @OriginalMember(owner = "client!sb", name = "Ti", descriptor = "Z")
    private boolean field1355;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "()V")
    public final void method556() {
        ++field1278;
        if (super.field6732 > 0 || super.field6730 > 0) {
            int var1 = super.field6860;
            int var2 = super.field6849;
            int var3 = super.field6903;
            int var4 = super.field6842;
            this.method2198();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2919(-32);
            this.method2903((byte) 40, false);
            this.method2910(false, (byte) -66);
            this.method2869(13, false);
            this.method2885(false, 121);
            this.method2933((byte) -106, (class117) null);
            this.method2951(true, false, false, -2);
            this.method2881(1, -1);
            this.method2945(0, 22630);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field6732, super.field6730, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2097(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "(II)V")
    public final synchronized void method557(int arg0, int arg1) {
        ++field1306;
        if (arg0 != -20828) {
            field1299 = true;
        }
        class513 var3 = new class513();
        var3.field7166 = (long) arg1;
        this.field1346.method3116(29066, var3);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method558(Object arg0, Canvas arg1, int arg2) {
        ++field1284;
        Long var4 = (Long) arg0;
        int var5 = 4 / ((6 - arg2) / 39);
        this.field1312.releaseSurface(arg1, var4);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public final void method559(boolean arg0) {
        ++field1246;
    }

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "(I)V")
    public final void method560(int arg0) {
        ++field1326;
        if (arg0 == -12) {
            OpenGL.glTexEnvi(8960, 34161, class111.method750((byte) 115, super.field6899[super.field6838]));
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;IILjava/awt/Color;Ljava/awt/Color;)V")
    public static final void method561(Color arg0, String arg1, int arg2, int arg3, Color arg4, Color arg5) {
        try {
            Graphics var6 = class438.field6016.getGraphics();
            if (class430.field5927 == null) {
                class430.field5927 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class216.field3067 == null) {
                    class216.field3067 = class438.field6016.createImage(class58.field807, class582.field8281);
                }
                Graphics var7 = class216.field3067.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class58.field807, class582.field8281);
                int var8 = class58.field807 / 2 + -152;
                int var9 = class582.field8281 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(2 - -(arg2 * 3) + var8, var9 - arg3, 300 - arg2 * 3, 30);
                var7.setFont(class430.field5927);
                var7.setColor(arg4);
                var7.drawString(arg1, (-(arg1.length() * 6) + 304) / 2 + var8, var9 - -22);
                if (class629.field8977 != null) {
                    var7.setFont(class430.field5927);
                    var7.setColor(arg4);
                    var7.drawString(class629.field8977, class58.field807 / 2 - class629.field8977.length() * 6 / 2, class582.field8281 / 2 + -26);
                }
                var6.drawImage(class216.field3067, 0, 0, (ImageObserver) null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class58.field807, class582.field8281);
                int var10 = class58.field807 / 2 + -152;
                int var11 = class582.field8281 / 2 + -18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var10 + 2, var11 + 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 - -1, var11 + 1, 301, 31);
                var6.fillRect(arg2 * 3 + (var10 - -2), var11 + 2, -(arg2 * 3) + 300, 30);
                var6.setFont(class430.field5927);
                var6.setColor(arg4);
                if (class629.field8977 != null) {
                    var6.setFont(class430.field5927);
                    var6.setColor(arg4);
                    var6.drawString(class629.field8977, class58.field807 / 2 + -(6 * class629.field8977.length() / 2), class582.field8281 / 2 + -26);
                }
                var6.drawString(arg1, var10 - -((-(6 * arg1.length()) + 304) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class438.field6016.repaint();
        }
        ++field1334;
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "(B)V")
    public final void method562(byte arg0) {
        class704.field9789[2] = super.field6881 * super.field6850;
        class704.field9789[1] = super.field6850 * super.field6810;
        class704.field9789[3] = 1.0F;
        if (arg0 != -77) {
            this.field1337 = null;
        }
        class704.field9789[0] = super.field6893 * super.field6850;
        ++field1331;
        OpenGL.glLightModelfv(2899, class704.field9789, 0);
    }

    @OriginalMember(owner = "client!sb", name = "GA", descriptor = "(I)V")
    public final void method563(int arg0) {
        ++field1327;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILlk;Z)V")
    public final void method564(int arg0, class251 arg1, boolean arg2) {
        if (arg2) {
            this.field1367 = false;
        }
        ++field1249;
        this.field1356[arg0] = (class281) arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLdha;)V")
    public final void method565(boolean arg0, class732 arg1) {
        ++field1285;
        class378[] var3 = ((class665) arg1).field9378;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = arg0;
        for (int var8 = 0; ~var3.length < ~var8; ++var8) {
            class378 var11 = var3[var8];
            class281 var12 = this.field1356[var8];
            int var13 = 0;
            int var14 = var12.method1682((byte) -75);
            long var15 = var12.method3839(-103);
            var12.method3840((byte) 124);
            for (int var17 = 0; var17 < var11.method2285(!arg0); ++var17) {
                class91 var18 = var11.method2287(-22176, var17);
                if (class91.field1226 == var18) {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                } else if (class91.field1229 != var18) {
                    if (class91.field1230 != var18) {
                        if (class91.field1231 != var18) {
                            if (class91.field1232 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                            } else if (class91.field1233 == var18) {
                                OpenGL.glClientActiveTexture(var4++ + 33984);
                                OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                            } else if (class91.field1234 == var18) {
                                OpenGL.glClientActiveTexture(33984 + var4++);
                                OpenGL.glTexCoordPointer(4, 5126, var14, var15 - -((long) var13));
                            }
                        } else {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(1, 5126, var14, var15 - -((long) var13));
                        }
                    } else {
                        var5 = true;
                        OpenGL.glColorPointer(4, 5121, var14, var15 - -((long) var13));
                    }
                } else {
                    OpenGL.glNormalPointer(5126, var14, var15 - -((long) var13));
                    var6 = true;
                }
                var13 += var18.field1227;
            }
        }
        if (!this.field1352 == var7) {
            if (!var7) {
                OpenGL.glDisableClientState(32884);
            } else {
                OpenGL.glEnableClientState(32884);
            }
            this.field1352 = var7;
        }
        if (this.field1348 == !var6) {
            if (!var6) {
                OpenGL.glDisableClientState(32885);
            } else {
                OpenGL.glEnableClientState(32885);
            }
            this.field1348 = var6;
        }
        if (!var5 == this.field1355) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field1355 = var5;
        }
        if (var4 > this.field1350) {
            for (int var9 = this.field1350; var9 < var4; ++var9) {
                OpenGL.glClientActiveTexture(33984 - -var9);
                OpenGL.glEnableClientState(32888);
            }
            this.field1350 = var4;
        } else if (var4 < this.field1350) {
            for (int var10 = var4; ~this.field1350 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glDisableClientState(32888);
            }
            this.field1350 = var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "(I)V")
    public final void method566(int arg0) {
        for (int var2 = super.field6863 + -1; var2 >= 0; --var2) {
            OpenGL.glActiveTexture(33984 - -var2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        if (arg0 <= 16) {
            this.method602(false);
        }
        ++field1294;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field1312.setSwapInterval(0);
        super.method566(21);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method567(Object arg0, Canvas arg1, int arg2) {
        ++field1323;
        Long var4 = (Long) arg0;
        if (!this.field1312.setSurface(var4)) {
            throw new RuntimeException();
        } else if (arg2 != 2) {
            this.field1354 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "()Lgba;")
    public final class702 method568() {
        ++field1254;
        int var1 = -1;
        if (this.field1364.indexOf("nvidia") == -1) {
            if (~this.field1364.indexOf("intel") == 0) {
                if (this.field1364.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class702(var1, "OpenGL", this.field1366, this.field1361, 0L);
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "()Z")
    public final boolean method569() {
        ++field1269;
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(FFF)V")
    public final void method570(float arg0, float arg1, float arg2) {
        ++field1336;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public final void method571(byte arg0, Canvas arg1, Object arg2) {
        ++field1281;
        Long var4 = (Long) arg2;
        if (arg0 == 3) {
            this.field1312.surfaceResized(var4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "(II)V")
    public final void method572(int arg0, int arg1) {
        ++field1292;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lot;)Ldha;")
    public final class732 method573(int arg0, class378[] arg1) {
        if (arg0 != 0) {
            this.method607((byte) -33, false);
        }
        ++field1276;
        return new class665(arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
        ++field1252;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(Z)V")
    public final void method575(boolean arg0) {
        ++field1247;
        if (!arg0) {
            OpenGL.glDepthMask(super.field6876 && super.field6841);
        }
    }

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "(I)V")
    public final void method576(int arg0) {
        if (arg0 > -66) {
            this.method623((byte) 72);
        }
        ++field1300;
        int var2 = this.field1365[super.field6838];
        if (~var2 != -1) {
            this.field1365[super.field6838] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "(I)V")
    public final void method577(int arg0) {
        if (arg0 == 0) {
            ++field1255;
            if (super.field6859) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "(I)V")
    private final void method578(int arg0) {
        ++field1332;
        if (arg0 != 6793) {
            this.method582(52, (byte) 26, true, (class605) null, false);
        }
        if (this.field1351) {
            OpenGL.glPopMatrix();
        }
        if (super.field6883.method2981(-112)) {
            if (!this.field1353) {
                OpenGL.glLoadMatrixf(super.field6807.method1079((byte) 104, class666.field9386), 0);
                this.field1353 = true;
                this.method620((byte) 47);
                this.method599(arg0 ^ 6794);
            }
            if (super.field6798) {
                this.field1351 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field6794.method1079((byte) 104, class666.field9386), 0);
                this.field1351 = true;
            }
        } else if (super.field6798) {
            OpenGL.glLoadIdentity();
            this.field1351 = false;
        } else {
            OpenGL.glLoadMatrixf(super.field6794.method1079((byte) 104, class666.field9386), 0);
            this.field1351 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "(I)V")
    public final void method579(int arg0) {
        if (!super.field6933) {
            OpenGL.glDisable(3089);
        } else {
            OpenGL.glEnable(3089);
        }
        ++field1275;
        if (arg0 != 16) {
            this.method617();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILbfa;)V")
    public final void method580(int arg0, int arg1, int arg2, class574 arg3) {
        int var5 = 40 % ((10 - arg2) / 33);
        ++field1340;
        byte var6;
        int var7;
        if (class209.field2975 == arg3) {
            var6 = 1;
            var7 = arg1 * 2;
        } else if (class86.field1191 != arg3) {
            if (class756.field10497 != arg3) {
                if (class54.field758 != arg3) {
                    if (class507.field7091 != arg3) {
                        var6 = 0;
                        var7 = arg1;
                    } else {
                        var6 = 5;
                        var7 = arg1 - -2;
                    }
                } else {
                    var6 = 6;
                    var7 = arg1 + 2;
                }
            } else {
                var6 = 4;
                var7 = arg1 * 3;
            }
        } else {
            var7 = arg1 - -1;
            var6 = 3;
        }
        OpenGL.glDrawArrays(var6, arg0, var7);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[FIZILkea;I)Loia;")
    public final class51 method581(int arg0, int arg1, float[] arg2, int arg3, boolean arg4, int arg5, class77 arg6, int arg7) {
        ++field1286;
        if (arg1 > -21) {
            field1268 = -23;
        }
        if (!this.field1363 && (!class447.method2664(0, arg5) || !class447.method2664(0, arg7))) {
            if (this.field1369) {
                return new class514(this, arg6, arg5, arg7, arg2, arg3, arg0);
            } else {
                class335 var9 = new class335(this, arg6, class720.field10168, class670.method3834(arg5, 23538), class670.method3834(arg7, 23538));
                var9.method1943(true, arg7, arg6, arg3, arg2, arg0, 0, 0, arg5);
                return var9;
            }
        } else {
            return new class335(this, arg6, arg5, arg7, arg4, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBZLqs;Z)V")
    public final void method582(int arg0, byte arg1, boolean arg2, class605 arg3, boolean arg4) {
        OpenGL.glTexEnvi(8960, 34176 - -arg0, class691.method3932(34168, arg3));
        ++field1319;
        int var6 = -58 / ((-55 - arg1) / 54);
        if (!arg2) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, !arg4 ? 768 : 769);
        } else {
            OpenGL.glTexEnvi(8960, 34192 - -arg0, !arg4 ? 770 : 771);
        }
    }

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "(I)V")
    public final void method583(int arg0) {
        ++field1324;
        if (super.field6814 && super.field6844 && super.field6889 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != -12) {
            this.method639(67);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhs;Lmp;)Lcha;")
    public final class279 method584(class358 arg0, class315 arg1) {
        ++field1314;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
    public final synchronized void method585(int arg0, int arg1, int arg2) {
        if (arg1 != 772) {
            this.method617();
        }
        ++field1317;
        class285 var4 = new class285(arg2);
        var4.field7166 = (long) arg0;
        this.field1335.method3116(29066, var4);
    }

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "(I)F")
    public final float method586(int arg0) {
        ++field1280;
        if (arg0 != 1) {
            field1283 = 30;
        }
        return 0.0F;
    }

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "()V")
    public final void method587() {
        ++field1265;
        super.method587();
        if (this.field1312 != null) {
            this.field1312.method3383();
            this.field1312.release();
            this.field1312 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "(I)V")
    public final void method588(int arg0) {
        if (arg0 != 1) {
            this.method581(-106, -85, (float[]) null, -23, true, -81, (class77) null, 127);
        }
        if (super.field6846) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field1251;
    }

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "()V")
    public final void method589() {
        ++field1342;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!sb", name = "na", descriptor = "(IIII)[I")
    public final int[] method590(int arg0, int arg1, int arg2, int arg3) {
        ++field1270;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field6730 - var6 + -arg1 + -1, arg2, 1, 32993, this.field1362, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkf;Lkea;I)Z")
    public final boolean method591(class720 arg0, class77 arg1, int arg2) {
        if (arg2 >= -114) {
            return true;
        } else {
            ++field1253;
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lpf;B)V")
    public final void method592(class728 arg0, byte arg1) {
        int var3 = 108 / ((arg1 - 68) / 57);
        if (class313.field4010 != arg0) {
            int var4 = class181.method1206((byte) -120, arg0);
            OpenGL.glTexGeni(8192, 9472, var4);
            OpenGL.glEnable(3168);
            OpenGL.glTexGeni(8193, 9472, var4);
            OpenGL.glEnable(3169);
            OpenGL.glTexGeni(8194, 9472, var4);
            OpenGL.glEnable(3170);
        } else {
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
        }
        ++field1309;
    }

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "()I")
    public final int method593() {
        ++field1344;
        return this.field1368;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Lni;")
    public final class512 method594(int arg0, byte arg1) {
        if (arg1 > -81) {
            return null;
        } else {
            ++field1258;
            if (~arg0 != -4) {
                if (~arg0 != -5) {
                    return ~arg0 == -9 ? new class629(this, super.field6744, super.field6749) : super.method594(arg0, (byte) -99);
                } else {
                    return new class579(this, super.field6744, super.field6749);
                }
            } else {
                return new class550(this, super.field6744);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lcha;)V")
    public final void method595(class279 arg0) {
        ++field1302;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method596(int arg0, Canvas arg1) {
        if (arg0 <= 40) {
            this.field1357 = null;
        }
        ++field1322;
        long var3 = this.field1312.prepareSurface(arg1);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "(B)V")
    public final void method597(byte arg0) {
        if (arg0 < -82) {
            ++field1271;
            if (super.field6895) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)V")
    public final synchronized void method598(int arg0, int arg1, int arg2) {
        ++field1318;
        if (arg2 != 0) {
            this.method609((byte) 51);
        }
        class285 var4 = new class285(arg0);
        var4.field7166 = (long) arg1;
        this.field1337.method3116(arg2 ^ 29066, var4);
    }

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "(I)V")
    public final void method599(int arg0) {
        this.method2886(arg0 + 357957305);
        ++field1328;
        int var2;
        for (var2 = 0; ~super.field6888 < ~var2; ++var2) {
            class757 var3 = super.field6825[var2];
            int var4 = var3.method4209((byte) -66);
            int var5 = var2 + 16386;
            float var6 = var3.method4211((byte) 101) / 255.0F;
            class704.field9789[0] = (float) var3.method4203(20918);
            class704.field9789[1] = (float) var3.method4212(-54);
            class704.field9789[2] = (float) var3.method4205((byte) 8);
            class704.field9789[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class704.field9789, 0);
            class704.field9789[1] = var6 * (float) (class136.method878(var4, 65525) >> 8);
            class704.field9789[3] = 1.0F;
            class704.field9789[2] = (float) class136.method878(255, var4) * var6;
            class704.field9789[0] = var6 * (float) (class136.method878(16732386, var4) >> 16);
            OpenGL.glLightfv(var5, 4609, class704.field9789, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method4206((byte) 28) * var3.method4206((byte) 121)));
            OpenGL.glEnable(var5);
        }
        while (var2 < super.field6879) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method599(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lhs;")
    public final class358 method600(int arg0, int arg1) {
        ++field1287;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIZ[I)Loia;")
    public final class51 method601(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6) {
        ++field1333;
        if (arg2 != -24364) {
            field1283 = -40;
        }
        if (!this.field1363 && (!class447.method2664(0, arg1) || !class447.method2664(0, arg4))) {
            if (this.field1369) {
                return new class514(this, arg1, arg4, arg6, arg0, arg3);
            } else {
                class335 var8 = new class335(this, class4.field10, class720.field10164, class670.method3834(arg1, arg2 ^ -1242), class670.method3834(arg4, arg2 + 47902));
                var8.method347(0, arg3, 0, arg2 ^ 21824, arg0, arg1, arg6, arg4);
                return var8;
            }
        } else {
            return new class335(this, arg1, arg4, arg5, arg6, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(Z)V")
    public final void method602(boolean arg0) {
        class704.field9789[2] = (float) class136.method878(super.field6813, 255) / 255.0F;
        ++field1279;
        class704.field9789[3] = (float) (super.field6813 >>> 24) / 255.0F;
        class704.field9789[1] = (float) class136.method878(super.field6813, 65280) / 65280.0F;
        class704.field9789[0] = (float) class136.method878(16711680, super.field6813) / 1.671168E7F;
        if (!arg0) {
            OpenGL.glTexEnvfv(8960, 8705, class704.field9789, 0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "(B)V")
    public final void method603(byte arg0) {
        ++field1293;
        if (arg0 == 71) {
            if (class430.field5925 == super.field6887) {
                OpenGL.glBlendFunc(770, 771);
            } else if (class97.field1413 == super.field6887) {
                OpenGL.glBlendFunc(1, 1);
            } else if (class471.field6466 == super.field6887) {
                OpenGL.glBlendFunc(774, 1);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "(I)V")
    public final void method604(int arg0) {
        if (arg0 != 0) {
            this.method637(-22);
        }
        ++field1305;
        OpenGL.glActiveTexture(super.field6838 + 33984);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
    public final synchronized void method605(long arg0, int arg1) {
        ++field1298;
        class513 var4 = new class513();
        if (arg1 <= 87) {
            this.method611(true, (byte[]) null, 45, (class77) null, 109, 57);
        }
        var4.field7166 = arg0;
        this.field1347.method3116(29066, var4);
    }

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "(I)V")
    public final void method606(int arg0) {
        OpenGL.glViewport(super.field6820, super.field6824, super.field6732, super.field6730);
        ++field1250;
        if (arg0 != 1) {
            this.method631((class22) null, (class22) null, 0.7026864F, (class22) null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(BZ)V")
    public final void method607(byte arg0, boolean arg1) {
        if (arg1) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        if (arg0 != 67) {
            this.field1341 = null;
        }
        ++field1308;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "()Z")
    public final boolean method608() {
        ++field1262;
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(B)V")
    public final void method609(byte arg0) {
        if (arg0 != -60) {
            this.method580(-10, -20, 78, (class574) null);
        }
        if (super.field6856) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
        ++field1325;
    }

    @OriginalMember(owner = "client!sb", name = "ya", descriptor = "()V")
    public final void method610() {
        this.method2885(true, 89);
        ++field1295;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z[BILkea;II)Lco;")
    public final class722 method611(boolean arg0, byte[] arg1, int arg2, class77 arg3, int arg4, int arg5) {
        if (!arg0) {
            field1266 = true;
        }
        ++field1338;
        return new class461(this, arg3, arg2, arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lbfa;IIZILho;I)V")
    public final void method612(class574 arg0, int arg1, int arg2, boolean arg3, int arg4, class212 arg5, int arg6) {
        ++field1303;
        int var8;
        byte var9;
        if (class209.field2975 != arg0) {
            if (class86.field1191 == arg0) {
                var8 = arg6 + 1;
                var9 = 3;
            } else if (class756.field10497 != arg0) {
                if (class54.field758 == arg0) {
                    var9 = 6;
                    var8 = arg6 + 2;
                } else if (class507.field7091 != arg0) {
                    var8 = arg6;
                    var9 = 0;
                } else {
                    var9 = 5;
                    var8 = arg6 + 2;
                }
            } else {
                var8 = arg6 * 3;
                var9 = 4;
            }
        } else {
            var8 = arg6 * 2;
            var9 = 1;
        }
        class720 var10 = arg5.method1402(-89);
        class604 var11 = (class604) arg5;
        var11.method3840((byte) 127);
        OpenGL.glDrawElements(var9, var8, class615.method3614(var10, 5121), var11.method3839(-81) + (long) (var10.field10158 * arg1));
        if (!arg3) {
            this.field1358 = true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1263 = null;
        if (arg0 != 14648) {
            method561((Color) null, (String) null, 111, -93, (Color) null, (Color) null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIID)V")
    public final void method614(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field1304;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lwu;I)V")
    public class93(OpenGL arg0, Canvas arg1, long arg2, class268 arg3, class557 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field1312 = arg0;
            this.field1312.method3381();
            this.field1364 = OpenGL.glGetString(7936).toLowerCase();
            this.field1361 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field1364.indexOf("microsoft") == 0 && ~this.field1364.indexOf("brian paul") == 0 && ~this.field1364.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class498.method2984(var8.replace('.', ' '), ' ', -97);
                if (var9.length >= 2) {
                    try {
                        int var10 = class665.method3815(var9[0], -124);
                        int var11 = class665.method3815(var9[1], -126);
                        this.field1366 = var10 * 10 - -var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field1366 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field1312.method3382("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field1312.method3382("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field6863 = var12[0];
                        if (super.field6863 < 2) {
                            throw new RuntimeException("");
                        } else {
                            super.field6877 = 8;
                            this.field1359 = this.field1312.method3382("GL_ARB_vertex_buffer_object");
                            super.field6834 = this.field1312.method3382("GL_ARB_multisample");
                            this.field1369 = this.field1312.method3382("GL_ARB_texture_rectangle");
                            super.field6896 = this.field1312.method3382("GL_ARB_texture_cube_map");
                            this.field1363 = this.field1312.method3382("GL_ARB_texture_non_power_of_two");
                            super.field6865 = this.field1312.method3382("GL_EXT_texture3D");
                            this.field1358 = this.field1312.method3382("GL_ARB_vertex_shader");
                            this.field1360 = this.field1312.method3382("GL_ARB_vertex_program");
                            this.field1367 = this.field1312.method3382("GL_ARB_fragment_shader");
                            this.field1312.method3382("GL_ARB_fragment_program");
                            this.field1365 = new int[super.field6863];
                            this.field1362 = !Stream.method2541() ? 5121 : 33639;
                            if (~this.field1361.indexOf("radeon") != 0) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class498.method2984(this.field1361.replace('/', ' '), ' ', -97);
                                for (int var17 = 0; var17 < var16.length; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (~var18.length() < -1) {
                                            if (var18.charAt(0) == 'x' && var18.length() >= 3 && class264.method1628(var18.substring(1, 3), 0)) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var18 = var18.substring(2);
                                                    var14 = true;
                                                }
                                                if (~var18.length() <= -5 && class264.method1628(var18.substring(0, 4), 0)) {
                                                    var13 = class665.method3815(var18.substring(0, 4), -124);
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && var13 <= 9250) {
                                        super.field6865 = false;
                                    }
                                    if (var13 >= 7000 && ~var13 >= -8000) {
                                        this.field1359 = false;
                                    }
                                }
                                this.field1369 &= this.field1312.method3382("GL_ARB_half_float_pixel");
                            }
                            this.field1364.indexOf("intel");
                            if (this.field1359) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method587();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public final void method615(byte arg0) {
        super.field6864 = (float) (-super.field6852 + super.field6875);
        ++field1261;
        super.field6832 = (float) (-super.field6889) + super.field6864;
        if ((float) super.field6878 > super.field6832) {
            super.field6832 = (float) super.field6878;
        }
        OpenGL.glFogf(2915, super.field6832);
        OpenGL.glFogf(2916, super.field6864);
        if (arg0 >= -124) {
            this.field1273 = null;
        }
        class704.field9789[2] = (float) class136.method878(255, super.field6830) / 255.0F;
        class704.field9789[0] = (float) class136.method878(16711680, super.field6830) / 1.671168E7F;
        class704.field9789[1] = (float) class136.method878(super.field6830, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class704.field9789, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkea;Lkf;B)Z")
    public final boolean method616(class77 arg0, class720 arg1, byte arg2) {
        ++field1267;
        int var4 = 122 % ((arg2 - -40) / 61);
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "()V")
    public final void method617() {
        ++field1260;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ[BLkea;IZII)Loia;")
    public final class51 method618(int arg0, boolean arg1, byte[] arg2, class77 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg1) {
            this.field1352 = false;
        }
        ++field1264;
        if (!this.field1363 && (!class447.method2664(0, arg7) || !class447.method2664(0, arg6))) {
            if (!this.field1369) {
                class335 var9 = new class335(this, arg3, class720.field10164, class670.method3834(arg7, 23538), class670.method3834(arg6, 23538));
                var9.method352(arg2, 0, arg3, 0, arg0, arg4, arg7, 16288, arg6);
                return var9;
            } else {
                return new class514(this, arg3, arg7, arg6, arg2, arg0, arg4);
            }
        } else {
            return new class335(this, arg3, arg7, arg6, arg5, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "(I)V")
    public final void method619(int arg0) {
        ++field1313;
        OpenGL.glMatrixMode(5890);
        if (arg0 == 24) {
            if (super.field6857[super.field6838] == class116.field1624) {
                OpenGL.glLoadIdentity();
            } else {
                OpenGL.glLoadMatrixf(super.field6869[super.field6838].method1079((byte) 104, class666.field9386), 0);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "(B)V")
    public final void method620(byte arg0) {
        if (arg0 == 47) {
            OpenGL.glLightfv(16384, 4611, super.field6861, 0);
            ++field1274;
            OpenGL.glLightfv(16385, 4611, super.field6847, 0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "(B)V")
    public final void method621(byte arg0) {
        this.field1353 = false;
        ++field1339;
        this.method578(6793);
        if (arg0 != -111) {
            this.method607((byte) 105, false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425 {
        ++field1321;
        this.method632(arg2, arg3);
    }

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "(B)V")
    public final void method623(byte arg0) {
        if (arg0 < -75) {
            ++field1257;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLqs;ZI)V")
    public final void method624(byte arg0, class605 arg1, boolean arg2, int arg3) {
        ++field1301;
        OpenGL.glTexEnvi(8960, arg3 + 34184, class691.method3932(34168, arg1));
        if (arg0 != -83) {
            this.field1354 = null;
        }
        OpenGL.glTexEnvi(8960, arg3 + 34200, !arg2 ? 770 : 771);
    }

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "()V")
    public final void method625() {
        ++field1311;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[[IIZ)Luia;")
    public final class273 method626(int arg0, int[][] arg1, int arg2, boolean arg3) {
        ++field1291;
        return arg2 != 0 ? null : new class533(this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "(I)V")
    public final void method627(int arg0) {
        OpenGL.glScissor(super.field6820 - -super.field6860, super.field6824 + super.field6730 + -super.field6842, -super.field6860 + super.field6849, -super.field6903 + super.field6842);
        int var2 = -52 % ((59 - arg0) / 56);
        ++field1316;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lmp;")
    public final class315 method628(int arg0, int arg1) {
        ++field1282;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "(I)V")
    public final void method629(int arg0) {
        ++field1277;
        if (super.field6890 && !super.field6900) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = 36 % ((-13 - arg0) / 60);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
    public final void method630(byte arg0, int arg1) {
        if (arg0 > 7) {
            ++field1290;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;")
    public final class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3) {
        ++field1320;
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)V")
    public final void method632(int arg0, int arg1) throws class425 {
        ++field1307;
        this.field1312.swapBuffers();
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(B)V")
    public final void method633(byte arg0) {
        if (arg0 != 56) {
            this.field1365 = null;
        }
        ++field1288;
        OpenGL.glTexEnvi(8960, 34162, class111.method750((byte) 115, super.field6880[super.field6838]));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZ)Lho;")
    public final class212 method634(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method598(-22, -63, -62);
        }
        ++field1297;
        return new class604(this, class720.field10165, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "()V")
    public final void method635() {
        ++field1289;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILkf;Lkea;I)Loia;")
    public final class51 method636(int arg0, int arg1, class720 arg2, class77 arg3, int arg4) {
        if (arg4 <= 21) {
            this.method590(9, -53, 123, -12);
        }
        ++field1310;
        if (!this.field1363 && (!class447.method2664(0, arg0) || !class447.method2664(0, arg1))) {
            return !this.field1369 ? new class335(this, arg3, arg2, class670.method3834(arg0, 23538), class670.method3834(arg1, 23538)) : new class514(this, arg3, arg2, arg0, arg1);
        } else {
            return new class335(this, arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "(I)V")
    public final void method637(int arg0) {
        if (arg0 == 14) {
            OpenGL.glMatrixMode(5889);
            ++field1296;
            OpenGL.glLoadMatrixf(super.field6836, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(BZ)Llk;")
    public final class251 method638(byte arg0, boolean arg1) {
        if (arg0 > -74) {
            this.field1349 = 80L;
        }
        ++field1256;
        return new class281(this, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public final synchronized void method639(int arg0) {
        ++field1315;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1335.method3121((byte) 55)) {
            class285 var12 = (class285) this.field1335.method3115(true);
            class36.field515[var2++] = (int) var12.field7166;
            super.field6796 -= var12.field3770;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class36.field515, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class36.field515, 0);
            var2 = 0;
        }
        while (!this.field1337.method3121((byte) 67)) {
            class285 var11 = (class285) this.field1337.method3115(true);
            class36.field515[var2++] = (int) var11.field7166;
            super.field6795 -= var11.field3770;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class36.field515, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class36.field515, 0);
            var2 = 0;
        }
        while (!this.field1341.method3121((byte) -124)) {
            class285 var10 = (class285) this.field1341.method3115(true);
            class36.field515[var2++] = var10.field3770;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class36.field515, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class36.field515, 0);
            var2 = 0;
        }
        while (!this.field1345.method3121((byte) -114)) {
            class285 var9 = (class285) this.field1345.method3115(true);
            class36.field515[var2++] = (int) var9.field7166;
            super.field6797 -= var9.field3770;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class36.field515, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class36.field515, 0);
            boolean var4 = false;
        }
        while (!this.field1273.method3121((byte) 85)) {
            class285 var8 = (class285) this.field1273.method3115(true);
            OpenGL.glDeleteLists((int) var8.field7166, var8.field3770);
        }
        while (!this.field1346.method3121((byte) 90)) {
            class513 var7 = this.field1346.method3115(true);
            OpenGL.glDeleteProgramARB((int) var7.field7166);
        }
        while (!this.field1347.method3121((byte) 56)) {
            class513 var6 = this.field1347.method3115(true);
            OpenGL.glDeleteObjectARB(var6.field7166);
        }
        while (!this.field1273.method3121((byte) -123)) {
            class285 var5 = (class285) this.field1273.method3115(true);
            OpenGL.glDeleteLists((int) var5.field7166, var5.field3770);
        }
        if (~this.method2179() < -100663297 && ~class224.method1457((byte) -62) < ~(this.field1349 + 60000L)) {
            System.gc();
            this.field1349 = class224.method1457((byte) -62);
        }
        super.method639(var3);
    }

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "(I)V")
    public final void method640(int arg0) {
        class704.field9789[2] = super.field6881 * super.field6826;
        ++field1259;
        class704.field9789[3] = 1.0F;
        class704.field9789[0] = super.field6893 * super.field6826;
        class704.field9789[1] = super.field6826 * super.field6810;
        OpenGL.glLightfv(16384, 4609, class704.field9789, 0);
        class704.field9789[0] = -super.field6910 * super.field6893;
        class704.field9789[arg0] = -super.field6910 * super.field6810;
        class704.field9789[2] = -super.field6910 * super.field6881;
        class704.field9789[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class704.field9789, 0);
    }

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "(I)V")
    public final void method641(int arg0) {
        if (arg0 != 12) {
            this.method610();
        }
        this.method578(6793);
        ++field1272;
    }
}
