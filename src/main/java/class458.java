import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class458 extends class487 implements class397 {

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lko;")
    private class185 field6331 = new class185();

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Ldr;")
    private class250 field6334 = new class218();

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public int field6336 = 3;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "[Lmm;")
    private class397[] field6337 = new class397[4];

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Z")
    private boolean field6345 = false;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    private int field6339 = -1;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public int field6347 = 8;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "Lsm;")
    private class249 field6338 = new class249();

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "Lsm;")
    private class249 field6348 = new class249();

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "Lsm;")
    private class249 field6349 = new class249();

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "Lsm;")
    private class249 field6350 = new class249();

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "Lsm;")
    private class249 field6351 = new class249();

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "Lsm;")
    private class249 field6352 = new class249();

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "Lsm;")
    private class249 field6353 = new class249();

    @OriginalMember(owner = "client!qi", name = "jb", descriptor = "I")
    private int field6366 = -1;

    @OriginalMember(owner = "client!qi", name = "eb", descriptor = "I")
    public int field6361 = 0;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    public int field6354 = 512;

    @OriginalMember(owner = "client!qi", name = "qb", descriptor = "F")
    public float field6373 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "fb", descriptor = "[F")
    private float[] field6362 = new float[16];

    @OriginalMember(owner = "client!qi", name = "Ob", descriptor = "F")
    private float field6397 = 0.0F;

    @OriginalMember(owner = "client!qi", name = "hc", descriptor = "[F")
    public float[] field6416 = new float[4];

    @OriginalMember(owner = "client!qi", name = "cc", descriptor = "F")
    public float field6411 = 3584.0F;

    @OriginalMember(owner = "client!qi", name = "Db", descriptor = "I")
    public int field6386 = 0;

    @OriginalMember(owner = "client!qi", name = "kb", descriptor = "I")
    public int field6367 = 3584;

    @OriginalMember(owner = "client!qi", name = "yb", descriptor = "F")
    public float field6381 = -1.0F;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "[F")
    private float[] field6356 = new float[4];

    @OriginalMember(owner = "client!qi", name = "kc", descriptor = "I")
    public int field6419 = 512;

    @OriginalMember(owner = "client!qi", name = "Sb", descriptor = "I")
    private int field6401 = 0;

    @OriginalMember(owner = "client!qi", name = "Cb", descriptor = "I")
    private int field6385 = 8448;

    @OriginalMember(owner = "client!qi", name = "wc", descriptor = "F")
    public float field6431 = 3584.0F;

    @OriginalMember(owner = "client!qi", name = "lb", descriptor = "[F")
    private float[] field6368 = new float[4];

    @OriginalMember(owner = "client!qi", name = "Cc", descriptor = "I")
    private int field6437 = 0;

    @OriginalMember(owner = "client!qi", name = "Zb", descriptor = "F")
    public float field6408 = -1.0F;

    @OriginalMember(owner = "client!qi", name = "uc", descriptor = "I")
    private int field6429 = -1;

    @OriginalMember(owner = "client!qi", name = "Ec", descriptor = "I")
    private int field6439 = 0;

    @OriginalMember(owner = "client!qi", name = "Jb", descriptor = "[F")
    private float[] field6392 = new float[4];

    @OriginalMember(owner = "client!qi", name = "Mc", descriptor = "I")
    public int field6447 = 0;

    @OriginalMember(owner = "client!qi", name = "Dc", descriptor = "F")
    private float field6438 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "bc", descriptor = "I")
    public int field6410 = -1;

    @OriginalMember(owner = "client!qi", name = "vc", descriptor = "I")
    private int field6430 = 0;

    @OriginalMember(owner = "client!qi", name = "Tc", descriptor = "I")
    public int field6454 = 50;

    @OriginalMember(owner = "client!qi", name = "mc", descriptor = "Z")
    private boolean field6421 = true;

    @OriginalMember(owner = "client!qi", name = "Uc", descriptor = "I")
    private int field6455 = 0;

    @OriginalMember(owner = "client!qi", name = "Oc", descriptor = "I")
    public int field6449 = -1;

    @OriginalMember(owner = "client!qi", name = "Ic", descriptor = "I")
    private int field6443 = 0;

    @OriginalMember(owner = "client!qi", name = "Rc", descriptor = "F")
    public float field6452 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "pc", descriptor = "I")
    private int field6424 = 8448;

    @OriginalMember(owner = "client!qi", name = "Yc", descriptor = "F")
    public float field6459 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "Zc", descriptor = "I")
    public int field6460 = -1;

    @OriginalMember(owner = "client!qi", name = "pb", descriptor = "F")
    private float field6372 = 1.0F;

    @OriginalMember(owner = "client!qi", name = "Vc", descriptor = "I")
    private int field6456 = 0;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6328;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Ljaggl/context;")
    private context field6329;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Ljaggl/opengl;")
    public opengl field6330;

    @OriginalMember(owner = "client!qi", name = "Rb", descriptor = "Z")
    public boolean field6400;

    @OriginalMember(owner = "client!qi", name = "gb", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!qi", name = "ec", descriptor = "Ljava/lang/String;")
    private String field6413;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "Ljava/lang/String;")
    private String field6358;

    @OriginalMember(owner = "client!qi", name = "Mb", descriptor = "Z")
    private boolean field6395;

    @OriginalMember(owner = "client!qi", name = "Pb", descriptor = "Z")
    public boolean field6398;

    @OriginalMember(owner = "client!qi", name = "Ub", descriptor = "Z")
    public boolean field6403;

    @OriginalMember(owner = "client!qi", name = "Tb", descriptor = "Z")
    public boolean field6402;

    @OriginalMember(owner = "client!qi", name = "Lc", descriptor = "Z")
    private boolean field6446;

    @OriginalMember(owner = "client!qi", name = "Wb", descriptor = "Z")
    public boolean field6405;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Lti;")
    public class339 field6325;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lvg;")
    private class404 field6327;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lur;")
    private class359 field6322;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "Lnt;")
    private class398 field6333;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
    private static int[] field6323 = new int[1000];

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[F")
    private static float[] field6326 = new float[4];

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6324 = Boolean.FALSE;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "[F")
    private static float[] field6332 = new float[4];

    @OriginalMember(owner = "client!qi", name = "nb", descriptor = "F")
    private float field6370;

    @OriginalMember(owner = "client!qi", name = "Yb", descriptor = "F")
    public float field6407;

    @OriginalMember(owner = "client!qi", name = "jc", descriptor = "F")
    private float field6418;

    @OriginalMember(owner = "client!qi", name = "lc", descriptor = "F")
    public float field6420;

    @OriginalMember(owner = "client!qi", name = "nc", descriptor = "F")
    public float field6422;

    @OriginalMember(owner = "client!qi", name = "rc", descriptor = "F")
    private float field6426;

    @OriginalMember(owner = "client!qi", name = "sc", descriptor = "F")
    public float field6427;

    @OriginalMember(owner = "client!qi", name = "Ac", descriptor = "F")
    public float field6435;

    @OriginalMember(owner = "client!qi", name = "Jc", descriptor = "F")
    public float field6444;

    @OriginalMember(owner = "client!qi", name = "Kc", descriptor = "F")
    public float field6445;

    @OriginalMember(owner = "client!qi", name = "Nc", descriptor = "F")
    public float field6448;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public int field6341;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    private int field6343;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
    private int field6359;

    @OriginalMember(owner = "client!qi", name = "tb", descriptor = "I")
    private int field6376;

    @OriginalMember(owner = "client!qi", name = "ub", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!qi", name = "Gb", descriptor = "I")
    private int field6389;

    @OriginalMember(owner = "client!qi", name = "Nb", descriptor = "I")
    private int field6396;

    @OriginalMember(owner = "client!qi", name = "Qb", descriptor = "I")
    private int field6399;

    @OriginalMember(owner = "client!qi", name = "ic", descriptor = "I")
    private int field6417;

    @OriginalMember(owner = "client!qi", name = "tc", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!qi", name = "Bc", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!qi", name = "Hc", descriptor = "I")
    public int field6442;

    @OriginalMember(owner = "client!qi", name = "Qc", descriptor = "I")
    private int field6451;

    @OriginalMember(owner = "client!qi", name = "Wc", descriptor = "I")
    public int field6457;

    @OriginalMember(owner = "client!qi", name = "Xc", descriptor = "I")
    private int field6458;

    @OriginalMember(owner = "client!qi", name = "ac", descriptor = "J")
    private long field6409;

    @OriginalMember(owner = "client!qi", name = "wb", descriptor = "Lai;")
    public class201 field6379;

    @OriginalMember(owner = "client!qi", name = "Xb", descriptor = "Lai;")
    public class201 field6406;

    @OriginalMember(owner = "client!qi", name = "qc", descriptor = "Lai;")
    public class201 field6425;

    @OriginalMember(owner = "client!qi", name = "ib", descriptor = "Lrh;")
    public class218 field6365;

    @OriginalMember(owner = "client!qi", name = "vb", descriptor = "Lrh;")
    public class218 field6378;

    @OriginalMember(owner = "client!qi", name = "Pc", descriptor = "Lla;")
    private class220 field6450;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "Lct;")
    public class273 field6355;

    @OriginalMember(owner = "client!qi", name = "Gc", descriptor = "Lhm;")
    private class28 field6441;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "Lmm;")
    private class397 field6340;

    @OriginalMember(owner = "client!qi", name = "Vb", descriptor = "Lr;")
    private class414 field6404;

    @OriginalMember(owner = "client!qi", name = "Ab", descriptor = "Llo;")
    public class4 field6383;

    @OriginalMember(owner = "client!qi", name = "Bb", descriptor = "Llo;")
    public class4 field6384;

    @OriginalMember(owner = "client!qi", name = "Fb", descriptor = "Llo;")
    public class4 field6388;

    @OriginalMember(owner = "client!qi", name = "Hb", descriptor = "Llo;")
    public class4 field6390;

    @OriginalMember(owner = "client!qi", name = "Ib", descriptor = "Llo;")
    public class4 field6391;

    @OriginalMember(owner = "client!qi", name = "Kb", descriptor = "Llo;")
    public class4 field6393;

    @OriginalMember(owner = "client!qi", name = "Lb", descriptor = "Llo;")
    public class4 field6394;

    @OriginalMember(owner = "client!qi", name = "dc", descriptor = "Llo;")
    public class4 field6412;

    @OriginalMember(owner = "client!qi", name = "Fc", descriptor = "Lwf;")
    private class95 field6440;

    @OriginalMember(owner = "client!qi", name = "db", descriptor = "Z")
    private boolean field6360;

    @OriginalMember(owner = "client!qi", name = "hb", descriptor = "Z")
    private boolean field6364;

    @OriginalMember(owner = "client!qi", name = "mb", descriptor = "Z")
    private boolean field6369;

    @OriginalMember(owner = "client!qi", name = "ob", descriptor = "Z")
    public boolean field6371;

    @OriginalMember(owner = "client!qi", name = "rb", descriptor = "Z")
    private boolean field6374;

    @OriginalMember(owner = "client!qi", name = "sb", descriptor = "Z")
    public boolean field6375;

    @OriginalMember(owner = "client!qi", name = "xb", descriptor = "Z")
    public boolean field6380;

    @OriginalMember(owner = "client!qi", name = "zb", descriptor = "Z")
    private boolean field6382;

    @OriginalMember(owner = "client!qi", name = "Eb", descriptor = "Z")
    private boolean field6387;

    @OriginalMember(owner = "client!qi", name = "fc", descriptor = "Z")
    public boolean field6414;

    @OriginalMember(owner = "client!qi", name = "gc", descriptor = "Z")
    private boolean field6415;

    @OriginalMember(owner = "client!qi", name = "xc", descriptor = "Z")
    private boolean field6432;

    @OriginalMember(owner = "client!qi", name = "yc", descriptor = "Z")
    private boolean field6433;

    @OriginalMember(owner = "client!qi", name = "zc", descriptor = "Z")
    public boolean field6434;

    @OriginalMember(owner = "client!qi", name = "Sc", descriptor = "Z")
    private boolean field6453;

    @OriginalMember(owner = "client!qi", name = "oc", descriptor = "[Let;")
    private class179[] field6423;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIILvb;II)V", line = 10)
    public final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, int arg7, int arg8) {
        class470 var10 = (class470) arg6;
        class414 var11 = var10.field6580;
        this.method2704();
        this.method2692(var10.field6580);
        this.method2653(arg5);
        this.method2702(7681, 8448);
        this.method2670(0, 34167, 768);
        float var12 = var11.field5718 / (float) var11.field5719;
        float var13 = var11.field5720 / (float) var11.field5721;
        this.field6330.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field6330.glBegin(1);
        this.field6330.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field6330.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field6330.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field6330.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field6330.glEnd();
        this.method2670(0, 5890, 768);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lop;)V", line = 32)
    public final void method1064(class63 arg0) {
        this.field6440 = (class95) arg0;
    }

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "()V", line = 35)
    public final void method2639() {
        if (this.field6357 != 2) {
            this.field6357 = 2;
            this.method2705();
            this.method2686();
            this.field6451 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "()I", line = 46)
    public final int method1084() {
        int var1 = this.field6376;
        this.field6376 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "()V", line = 51)
    public final void method2640() {
        this.field6330.glLightfv(16384, 4611, this.field6416, 0);
        this.field6330.glLightfv(16385, 4611, this.field6392, 0);
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(II)V", line = 56)
    public final synchronized void method2641(int arg0, int arg1) {
        class128 var3 = new class128(arg1);
        var3.field2608 = (long) arg0;
        this.field6350.method1553((byte) -120, var3);
    }

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "()V", line = 61)
    public final void method1055() {
    }

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "()V", line = 64)
    public final void method2642() {
        if (this.field6451 == 8) {
            return;
        }
        this.method2639();
        this.method2694(true);
        this.method2663(true);
        this.method2651(true);
        this.method2653(1);
        this.method2696(1);
        this.field6451 = 8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[Lrc;)V", line = 83)
    public final void method1083(int arg0, class488[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class488 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field6326[0] = (float) var4.field6883;
            field6326[1] = (float) var4.field6877;
            field6326[2] = (float) var4.field6879;
            field6326[3] = 1.0F;
            this.field6330.glLightfv(var5, 4611, field6326, 0);
            int var6 = var4.field6886;
            float var7 = var4.field6880 / 255.0F;
            field6326[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field6326[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field6326[2] = (float) (var6 & 0xFF) * var7;
            this.field6330.glLightfv(var5, 4609, field6326, 0);
            this.field6330.glLightf(var5, 4617, 1.0F / (float) (var4.field6878 * var4.field6878));
            this.field6330.glEnable(var5);
        }
        while (var3 < this.field6439) {
            this.field6330.glDisable(var3 + 16386);
            var3++;
        }
        this.field6439 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "()F", line = 121)
    public final float method1097() {
        return this.field6427;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([I)V", line = 125)
    public final void method1077(int[] arg0) {
        arg0[0] = this.field6437;
        arg0[1] = this.field6401;
        arg0[2] = this.field6455;
        arg0[3] = this.field6443;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(IIIIII)Lop;", line = 131)
    public final class63 method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field6434 ? new class412(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "()I", line = 135)
    public final int method1134() {
        return this.field6454;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 141)
    public final void method1060(int arg0) {
        this.method2653(0);
        this.field6330.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field6330.glClear(16384);
    }

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "()V", line = 146)
    private final void method2643() {
        if (this.field6369 && this.field6380 | this.field6449 >= 0) {
            this.field6330.glEnable(2912);
        } else {
            this.field6330.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "()V", line = 157)
    public final void method1137() {
        this.field6437 = 0;
        this.field6401 = 0;
        this.field6455 = this.field6335;
        this.field6443 = this.field6346;
        this.field6330.glDisable(3089);
        this.method2699();
    }

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "()V", line = 165)
    private final void method2644() {
        if (this.field6387) {
            this.field6330.glMatrixMode(5890);
            this.field6330.glLoadIdentity();
            this.field6330.glMatrixMode(5888);
            this.field6387 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[BIZ)Lhm;", line = 176)
    public final class28 method2645(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class28) (this.field6395 && !arg3 || this.field6446 ? new class364(this, arg0, arg1, arg2, arg3) : new class57(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "()V", line = 185)
    public final void method1710() {
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lsa;)V", line = 188)
    public final void method1052(class168 arg0) {
    }

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "()Z", line = 190)
    public final boolean method1078() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "()Z", line = 194)
    public final boolean method1126() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 197)
    public final void method1054(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "()V", line = 201)
    private final void method2646() {
        int var1;
        if (this.field6380) {
            this.field6330.glFogf(2915, 0.0F);
            this.field6330.glFogf(2916, 1.0F);
            var1 = this.field6429;
        } else {
            this.field6426 = (float) (this.field6367 - 256) - this.field6397;
            this.field6407 = this.field6426 - (float) this.field6449 * this.field6438;
            if (this.field6407 < (float) this.field6454) {
                this.field6407 = (float) this.field6454;
            }
            this.field6330.glFogf(2915, this.field6407);
            this.field6330.glFogf(2916, this.field6426);
            var1 = this.field6460;
        }
        field6332[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field6332[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field6332[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field6330.glFogfv(2918, field6332, 0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(FF)V", line = 229)
    public final void method1144(float arg0, float arg1) {
        if (this.field6448 == arg0 && this.field6427 == arg1) {
            return;
        }
        this.field6448 = arg0;
        this.field6427 = arg1;
        this.method2672();
        if (this.field6357 == 3) {
            this.method2706();
        } else if (this.field6357 == 2) {
            this.method2705();
        }
    }

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "()Z", line = 247)
    public final boolean method1136() {
        if (!this.field6333.method332(true)) {
            if (!this.field6322.method2151(this.field6333)) {
                return false;
            }
            this.field6325.method2011(34842);
        }
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)V", line = 259)
    public final void method2647(int arg0) {
        this.method2654(arg0, true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(F)V", line = 264)
    public final void method1154(float arg0) {
        if (this.field6422 != arg0) {
            this.field6422 = arg0;
            this.method2690();
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IIII)V", line = 275)
    public final void method1094(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field6335) {
            arg2 = this.field6335;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field6346) {
            arg3 = this.field6346;
        }
        this.field6437 = arg0;
        this.field6401 = arg1;
        this.field6455 = arg2;
        this.field6443 = arg3;
        this.field6330.glEnable(3089);
        this.method2699();
        this.method2662();
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)Lsa;", line = 297)
    public final class168 method1081(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "()V", line = 301)
    public final void method1129() {
        if (this.field6330 != null) {
            try {
                this.field6322.method2147();
            } catch (Throwable var4) {
            }
            this.field6330 = null;
        }
        if (this.field6329 != null) {
            this.method2708();
            try {
                this.field6329.destroy();
            } catch (Throwable var3) {
            }
            this.field6329 = null;
        }
        if (this.field6345) {
            class417.method2432(true, true, true);
            this.field6345 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I", line = 332)
    public final int method1067(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIII)Laq;", line = 336)
    public final class385 method1073(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class91(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "()V", line = 339)
    private final void method2648() {
        if (this.field6357 != 3) {
            this.field6357 = 3;
            this.method2706();
            this.method2686();
            this.field6451 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(II)V", line = 355)
    public final void method1106(int arg0, int arg1) {
        if (this.field6454 == arg0 && this.field6367 == arg1) {
            return;
        }
        this.field6454 = arg0;
        this.field6367 = arg1;
        this.method2661();
        this.method2646();
        if (this.field6357 == 3) {
            this.method2706();
        } else if (this.field6357 == 2) {
            this.method2705();
        }
    }

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)V", line = 373)
    public final void method2649(int arg0) {
        field6332[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field6332[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field6332[2] = (float) (arg0 & 0xFF) / 255.0F;
        field6332[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field6330.glTexEnvfv(8960, 8705, field6332, 0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 382)
    public final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2682();
        this.method2653(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field6330.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field6330.glBegin(1);
        this.field6330.glVertex2f(var6, var7);
        this.field6330.glVertex2f((float) arg2 + var6, var7);
        this.field6330.glEnd();
    }

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "()Z", line = 397)
    public final boolean method1085() {
        return !this.field6360;
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(II)V", line = 400)
    public final void method2650(int arg0, int arg1) {
        this.field6456 = arg0;
        this.field6430 = arg1;
        this.field6330.glViewport(arg0, arg1, this.field6335, this.field6346);
        this.method2662();
    }

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "()F", line = 406)
    public final float method1140() {
        return this.field6448;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(Z)V", line = 409)
    public final void method2651(boolean arg0) {
        if (this.field6374 != arg0) {
            this.field6374 = arg0;
            this.method2707();
            this.field6451 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lgr;IIII)Lab;", line = 418)
    public final class232 method1088(class85 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class4(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(Z)V", line = 423)
    public final void method2652(boolean arg0) {
        if (this.field6415 != arg0) {
            this.field6415 = arg0;
            this.method2711();
            this.field6451 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "(I)V", line = 432)
    public final void method2653(int arg0) {
        if (this.field6399 == arg0) {
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
        if (this.field6453 != var3) {
            this.field6330.glColorMask(var3, var3, var3, true);
            this.field6453 = var3;
        }
        if (this.field6382 != var4) {
            if (var4) {
                this.field6330.glEnable(3008);
            } else {
                this.field6330.glDisable(3008);
            }
            this.field6382 = var4;
        }
        if (this.field6436 != var2) {
            if (var2 == 1) {
                this.field6330.glEnable(3042);
                this.field6330.glBlendEquation(32774);
                this.field6330.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field6330.glEnable(3042);
                this.field6330.glBlendEquation(32774);
                this.field6330.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field6330.glEnable(3042);
                this.field6330.glBlendEquation(32778);
                this.field6330.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field6330.glEnable(3042);
                this.field6330.glBlendEquation(32774);
                this.field6330.glBlendFunc(774, 1);
            } else {
                this.field6330.glDisable(3042);
            }
            this.field6436 = var2;
        }
        this.field6399 = arg0;
        this.field6451 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V", line = 544)
    public final void method2654(int arg0, boolean arg1) {
        this.method2684(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "(I)I", line = 547)
    public final int method2655(int arg0) {
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

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V", line = 584)
    public final void method1127(int arg0, int arg1, int arg2, int arg3) {
        this.field6322.method2153(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "()Z", line = 587)
    public final boolean method1098() {
        return this.field6327.method2378((byte) -111, 3);
    }

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "(I)I", line = 590)
    public final int method2656(int arg0) {
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

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lmm;)V", line = 602)
    public final void method2657(class397 arg0) {
        if (this.field6339 < 0 || this.field6337[this.field6339] != arg0) {
            throw new RuntimeException();
        }
        this.field6337[this.field6339--] = null;
        arg0.method1710();
        if (this.field6339 >= 0) {
            this.field6340 = this.field6337[this.field6339];
            this.field6340.method1711();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII[BII)V", line = 619)
    public final void method1152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field6404 == null || this.field6404.field2882 < arg2 || this.field6404.field2881 < arg3) {
            this.field6404 = class414.method2416(-125, arg3, this, arg6, arg2, false, 6406, 6406);
            this.field6404.method1279(false, false);
            var10 = this.field6404.field5720;
            var11 = this.field6404.field5718;
        } else {
            this.field6404.method1277(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field6404.field5720 / (float) this.field6404.field2881;
            var11 = (float) arg2 * this.field6404.field5718 / (float) this.field6404.field2882;
        }
        this.method2704();
        this.method2692(this.field6404);
        this.method2653(arg8);
        this.field6330.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2649(arg5);
        this.method2702(34165, 34165);
        this.method2670(0, 34166, 768);
        this.method2670(2, 5890, 770);
        this.method2709(0, 34166, 770);
        this.method2709(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field6330.glBegin(7);
        this.field6330.glTexCoord2f(0.0F, 0.0F);
        this.field6330.glVertex2f(var12, var13);
        this.field6330.glTexCoord2f(0.0F, var11);
        this.field6330.glVertex2f(var12, var15);
        this.field6330.glTexCoord2f(var10, var11);
        this.field6330.glVertex2f(var14, var15);
        this.field6330.glTexCoord2f(var10, 0.0F);
        this.field6330.glVertex2f(var14, var13);
        this.field6330.glEnd();
        this.method2670(0, 5890, 768);
        this.method2670(2, 34166, 770);
        this.method2709(0, 5890, 770);
        this.method2709(2, 34166, 770);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Luk;Luk;Luk;Luk;)V", line = 669)
    public final void method2658(class143 arg0, class143 arg1, class143 arg2, class143 arg3) {
        if (arg0 == null) {
            this.field6330.glDisableClientState(32884);
        } else {
            this.field6330.glEnableClientState(32884);
            arg0.method883(-11350);
        }
        if (arg1 == null) {
            this.field6330.glDisableClientState(32885);
        } else {
            this.field6330.glEnableClientState(32885);
            arg1.method880((byte) 49);
        }
        if (arg2 == null) {
            this.field6330.glDisableClientState(32886);
        } else {
            this.field6330.glEnableClientState(32886);
            arg2.method881(14753);
        }
        if (arg3 == null) {
            this.field6330.glDisableClientState(32888);
        } else {
            this.field6330.glEnableClientState(32888);
            arg3.method882(124);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lhm;)V", line = 710)
    public final void method2659(class28 arg0) {
        if (this.field6441 != arg0 && this.field6395) {
            this.field6330.glBindBufferARB(34963, arg0.method234());
            this.field6441 = arg0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILvb;II)V", line = 723)
    public final void method1110(int arg0, class90 arg1, int arg2, int arg3) {
        class470 var5 = (class470) arg1;
        class414 var6 = var5.field6580;
        this.method2704();
        this.method2692(var5.field6580);
        this.method2653(1);
        this.method2702(7681, 8448);
        this.method2670(0, 34167, 768);
        float var7 = var6.field5718 / (float) var6.field5719;
        float var8 = var6.field5720 / (float) var6.field5721;
        this.field6330.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field6330.glBegin(7);
        this.field6330.glTexCoord2f((float) (this.field6437 - arg2) * var7, (float) (this.field6401 - arg3) * var8);
        this.field6330.glVertex2i(this.field6437, this.field6401);
        this.field6330.glTexCoord2f((float) (this.field6437 - arg2) * var7, (float) (this.field6443 - arg3) * var8);
        this.field6330.glVertex2i(this.field6437, this.field6443);
        this.field6330.glTexCoord2f((float) (this.field6455 - arg2) * var7, (float) (this.field6443 - arg3) * var8);
        this.field6330.glVertex2i(this.field6455, this.field6443);
        this.field6330.glTexCoord2f((float) (this.field6455 - arg2) * var7, (float) (this.field6401 - arg3) * var8);
        this.field6330.glVertex2i(this.field6455, this.field6401);
        this.field6330.glEnd();
        this.method2670(0, 5890, 768);
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "()V", line = 752)
    public final void method1122() {
        try {
            this.field6329.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 761)
    public final void method1065(boolean arg0) {
    }

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "(I)V", line = 763)
    public final void method2660(int arg0) {
        if (this.field6396 != arg0) {
            this.field6330.glActiveTexture(arg0 + 33984);
            this.field6396 = arg0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "()V", line = 775)
    private final void method2661() {
        float[] var1 = this.field6362;
        float var2 = (float) (-this.field6447 * this.field6454) / (float) this.field6354;
        float var3 = (float) ((this.field6335 - this.field6447) * this.field6454) / (float) this.field6354;
        float var4 = (float) (this.field6454 * this.field6361) / (float) this.field6419;
        float var5 = (float) ((this.field6361 - this.field6346) * this.field6454) / (float) this.field6419;
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
            float var6 = (float) this.field6454 * 2.0F;
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
            var1[10] = this.field6418 = (float) (-(this.field6454 + this.field6367)) / (float) (this.field6367 - this.field6454);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field6370 = -((float) this.field6367 * var6) / (float) (this.field6367 - this.field6454);
            var1[15] = 0.0F;
        }
        this.method2672();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[[I[[IIII)Ldh;", line = 829)
    public final class269 method1143(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class223(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "()I", line = 832)
    public final int method1051() {
        return 4;
    }

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "()Z", line = 836)
    public final boolean method1086() {
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V", line = 842)
    public final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2682();
        this.method2653(arg5);
        this.field6330.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6364) {
            this.field6330.glDisable(32925);
        }
        this.field6330.glBegin(7);
        this.field6330.glVertex2f(var7, var8);
        this.field6330.glVertex2f(var7, var10);
        this.field6330.glVertex2f(var9, var10);
        this.field6330.glVertex2f(var9, var8);
        this.field6330.glEnd();
        if (this.field6364) {
            this.field6330.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIIII)V", line = 868)
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 871)
    public final void method1711() {
    }

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "()V", line = 873)
    private final void method2662() {
        if (this.field6437 <= this.field6455 && this.field6401 <= this.field6443) {
            this.field6330.glScissor(this.field6456 + this.field6437, this.field6430 + this.field6346 - this.field6443, this.field6455 - this.field6437, this.field6443 - this.field6401);
        } else {
            this.field6330.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 880)
    public final void method1087(int arg0) {
        this.method2691();
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(Z)V", line = 884)
    public final void method2663(boolean arg0) {
        if (this.field6433 == arg0) {
            return;
        }
        if (arg0) {
            this.field6330.glEnable(2929);
        } else {
            this.field6330.glDisable(2929);
        }
        this.field6433 = arg0;
        this.field6451 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "()Z", line = 898)
    public final boolean method1142() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lla;)V", line = 901)
    public final void method2664(class220 arg0) {
        if (this.field6450 != arg0 && this.field6395) {
            this.field6330.glBindBufferARB(34962, arg0.method234());
            this.field6450 = arg0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(II)V", line = 910)
    public final synchronized void method2665(int arg0, int arg1) {
        class128 var3 = new class128(arg1);
        var3.field2608 = (long) arg0;
        this.field6349.method1553((byte) -97, var3);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V", line = 917)
    public final void method1138(int arg0, int arg1) {
        if (this.field6460 == arg0 && this.field6449 == arg1) {
            return;
        }
        this.field6460 = arg0;
        this.field6449 = arg1;
        if (!this.field6380) {
            this.method2646();
            this.method2643();
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 933)
    public final void method1100(boolean arg0) {
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(FF)V", line = 935)
    public final void method2666(float arg0, float arg1) {
        this.field6438 = arg0;
        this.field6397 = arg1;
        if (!this.field6380) {
            this.method2646();
        }
    }

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "(I)V", line = 943)
    public final synchronized void method2667(int arg0) {
        class128 var2 = new class128(arg0);
        this.field6352.method1553((byte) -128, var2);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIIIII)Z", line = 948)
    public final boolean method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field6378.field3081 + (float) arg0 * this.field6378.field3085 + (float) arg1 * this.field6378.field3088 + this.field6378.field3089;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6378.field3081 + (float) arg3 * this.field6378.field3085 + (float) arg4 * this.field6378.field3088 + this.field6378.field3089;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field6454) || !(var8 < (float) this.field6454)) || !(!(var7 > (float) this.field6367) || !(var8 > (float) this.field6367))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field6378.field3090 + (float) arg0 * this.field6378.field3091 + (float) arg1 * this.field6378.field3084 + this.field6378.field3086) * (float) this.field6354 / var7);
        int var10 = (int) (((float) arg5 * this.field6378.field3090 + (float) arg3 * this.field6378.field3091 + (float) arg4 * this.field6378.field3084 + this.field6378.field3086) * (float) this.field6354 / var8);
        if ((float) var9 < this.field6445 && (float) var10 < this.field6445 || (float) var9 > this.field6444 && (float) var10 > this.field6444) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field6378.field3082 + (float) arg0 * this.field6378.field3087 + (float) arg1 * this.field6378.field3083 + this.field6378.field3092) * (float) this.field6419 / var7);
            int var12 = (int) (((float) arg5 * this.field6378.field3082 + (float) arg3 * this.field6378.field3087 + (float) arg4 * this.field6378.field3083 + this.field6378.field3092) * (float) this.field6419 / var8);
            return (!((float) var11 < this.field6435) || !((float) var12 < this.field6435)) && (!((float) var11 > this.field6420) || !((float) var12 > this.field6420));
        }
    }

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "()Z", line = 978)
    public final boolean method1145() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "()V", line = 981)
    public final void method2668() {
        if (this.field6357 != 0) {
            this.field6357 = 0;
            this.field6451 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(FFFF)V", line = 990)
    public final void method2669(float arg0, float arg1, float arg2, float arg3) {
        field6332[0] = arg0;
        field6332[1] = arg1;
        field6332[2] = arg2;
        field6332[3] = arg3;
        this.field6330.glTexEnvfv(8960, 8705, field6332, 0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 997)
    public final void method2670(int arg0, int arg1, int arg2) {
        this.field6330.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field6330.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "()V", line = 1001)
    private final void method2671() {
        field6332[0] = this.field6408 * this.field6373;
        field6332[1] = this.field6459 * this.field6408;
        field6332[2] = this.field6452 * this.field6408;
        field6332[3] = 1.0F;
        this.field6330.glLightfv(16384, 4609, field6332, 0);
        field6332[0] = -this.field6381 * this.field6373;
        field6332[1] = -this.field6381 * this.field6459;
        field6332[2] = -this.field6381 * this.field6452;
        field6332[3] = 1.0F;
        this.field6330.glLightfv(16385, 4609, field6332, 0);
    }

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "()V", line = 1013)
    private final void method2672() {
        if (this.field6427 == 0.0F) {
            this.field6362[10] = this.field6418;
            this.field6362[14] = this.field6370;
        } else {
            float var1 = this.field6448 / (this.field6448 + this.field6427);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field6370 * (1.0F - var1) / this.field6427;
            this.field6362[10] = this.field6418 + var3;
            this.field6362[14] = this.field6370 * var2;
        }
        this.field6431 = (this.field6362[14] - (float) this.field6367) / this.field6362[10];
        this.field6411 = (float) this.field6367 - this.field6427;
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "()V", line = 1040)
    public final void method1066() {
        if (this.field6335 <= 0 && this.field6346 <= 0) {
            return;
        }
        int var1 = this.field6437;
        int var2 = this.field6455;
        int var3 = this.field6401;
        int var4 = this.field6443;
        this.method1137();
        this.field6330.glReadBuffer(1028);
        this.field6330.glDrawBuffer(1029);
        this.method2668();
        this.method2694(false);
        this.method2652(false);
        this.method2663(false);
        this.method2651(false);
        this.method2692((class179) null);
        this.method2647(-2);
        this.method2696(0);
        this.method2653(0);
        this.field6330.glMatrixMode(5889);
        this.field6330.glLoadIdentity();
        this.field6330.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field6330.glMatrixMode(5888);
        this.field6330.glLoadIdentity();
        this.field6330.glRasterPos2i(0, 0);
        this.field6330.glCopyPixels(0, 0, this.field6335, this.field6346, 6144);
        this.field6330.glFlush();
        this.field6330.glReadBuffer(1029);
        this.field6330.glDrawBuffer(1029);
        this.method1094(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "()V", line = 1078)
    public final void method1101() {
        this.field6335 = this.field6328.getWidth();
        this.field6346 = this.field6328.getHeight();
        this.field6330.glViewport(this.field6456, this.field6430, this.field6335, this.field6346);
        this.method2668();
        this.method1137();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lop;Lop;FLop;)Lop;", line = 1085)
    public final class63 method1103(class63 arg0, class63 arg1, float arg2, class63 arg3) {
        if (arg0 != null && arg1 != null && this.field6434 && this.field6405) {
            class100 var5 = null;
            class95 var6 = (class95) arg0;
            class95 var7 = (class95) arg1;
            class452 var8 = var6.method618((byte) 105);
            class452 var9 = var7.method618((byte) 117);
            if (var8 != null && var9 != null) {
                int var10 = var8.field6250 > var9.field6250 ? var8.field6250 : var9.field6250;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class100) {
                    class100 var11 = (class100) arg3;
                    if (var11.method634(-8114) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class100(this, var10);
                }
                var5.method635(var9, arg2, 110, var8);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "()V", line = 1126)
    public final void method1119() {
        if (this.field6333.method332(true)) {
            this.field6322.method2148(this.field6333);
            this.field6325.method2011(34842);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lhm;III)V", line = 1134)
    public final void method2673(class28 arg0, int arg1, int arg2, int arg3) {
        this.method2659(arg0);
        arg0.method232(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V", line = 1141)
    public final void method1141(int arg0) {
        this.method2708();
    }

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "()Lqh;", line = 1144)
    public final class452 method2674() {
        return this.field6440 == null ? null : this.field6440.method618((byte) 98);
    }

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "()V", line = 1149)
    private final void method2675() {
        this.method2647(-2);
        for (int var1 = this.field6457 - 1; var1 >= 0; var1--) {
            this.method2660(var1);
            this.method2692((class179) null);
            this.field6330.glTexEnvi(8960, 8704, 34160);
        }
        this.method2702(8448, 8448);
        this.method2670(2, 34168, 770);
        this.method2644();
        this.field6399 = 1;
        this.field6330.glEnable(3042);
        this.field6330.glBlendFunc(770, 771);
        this.field6436 = 1;
        this.field6330.glEnable(3008);
        this.field6330.glAlphaFunc(516, 0.0F);
        this.field6382 = true;
        this.field6330.glColorMask(true, true, true, true);
        this.field6453 = true;
        this.method2694(true);
        this.method2652(true);
        this.method2663(true);
        this.method2651(true);
        this.method2668();
        this.field6330.setSwapInterval(0);
        this.field6330.glShadeModel(7425);
        this.field6330.glClearDepth(1.0F);
        this.field6330.glDepthFunc(515);
        this.field6330.glPolygonMode(1028, 6914);
        this.field6330.glEnable(2884);
        this.field6330.glCullFace(1029);
        this.field6330.glMatrixMode(5888);
        this.field6330.glLoadIdentity();
        this.field6330.glColorMaterial(1028, 5634);
        this.field6330.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field6330.glLightfv(var4, 4608, var2, 0);
            this.field6330.glLightf(var4, 4615, 0.0F);
            this.field6330.glLightf(var4, 4616, 0.0F);
        }
        this.field6330.glEnable(16384);
        this.field6330.glEnable(16385);
        this.field6330.glFogf(2914, 0.95F);
        this.field6330.glFogi(2917, 9729);
        this.field6330.glHint(3156, 4353);
        this.field6366 = this.field6460 = -1;
        this.method1137();
    }

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "()V", line = 1219)
    private final void method2676() {
        this.field6378 = new class218();
        this.field6365 = new class218();
        this.field6423 = new class179[this.field6457];
        this.field6379 = new class201(this, 3553, 6408, 1, 1);
        this.field6425 = new class201(this, 3553, 6408, 1, 1);
        this.field6406 = new class201(this, 3553, 6408, 1, 1);
        this.field6391 = new class4(this);
        this.field6390 = new class4(this);
        this.field6383 = new class4(this);
        this.field6384 = new class4(this);
        this.field6388 = new class4(this);
        this.field6412 = new class4(this);
        this.field6393 = new class4(this);
        this.field6394 = new class4(this);
        if (this.field6405) {
            this.field6355 = new class273(this);
        }
        this.field6331.method1213(this);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lss;[Lua;Z)Loj;", line = 1244)
    public final class485 method1061(class76 arg0, class140[] arg1, boolean arg2) {
        return new class34(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lbc;IILdq;)V", line = 1247)
    public class458(Canvas arg0, class187 arg1, int arg2, int arg3, class14 arg4) {
        super(arg2, arg1);
        this.field6328 = arg0;
        int var6 = 0;
        while (!this.field6328.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class258.method1603(-649, 1000L);
        }
        this.field6328.setIgnoreRepaint(true);
        try {
            if (field6324 == null || !field6324) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field6324 = Boolean.TRUE;
                } else {
                    class420 var7 = arg4.method128(this.getClass(), 0);
                    while (var7.field5789 == 0) {
                        class258.method1603(-649, 100L);
                    }
                    if (var7.field5789 == 1) {
                        field6324 = Boolean.TRUE;
                    }
                }
            }
            if (field6324 == null || !field6324) {
                throw new RuntimeException("");
            }
            this.field6329 = new context();
            if (!this.field6329.choosePixelFormat(this.field6328, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field6329.createContext()) {
                this.method2691();
                this.field6330 = this.field6329.getGL();
                int var8 = this.method2687();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field6363 = this.field6400 ? 33639 : 5121;
                String var9 = this.field6413.toLowerCase();
                String var10 = this.field6358.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class326.method1958((byte) 126, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class363.method2207(var16.substring(1, 3), -72)) {
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
                                    if (var16.length() >= 4 && class363.method2207(var16.substring(0, 4), -71)) {
                                        var11 = class168.method1039(var16.substring(0, 4), false);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field6395 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field6398 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field6403 = false;
                    }
                    this.field6402 &= this.field6330.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field6446 = this.field6395;
                }
                if (var9.contains("intel")) {
                    this.field6405 = false;
                }
                if (this.field6395) {
                    try {
                        int[] var18 = new int[1];
                        this.field6330.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2680(this);
                this.method1101();
                this.method2676();
                new class298(this);
                this.field6325 = new class339(this, this.field6863);
                class476.method2799(22226, true, true);
                this.field6345 = true;
                this.field6327 = new class404(this);
                this.field6322 = new class359(this);
                this.field6333 = new class398(this);
                this.method2675();
                this.field6330.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field6329.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class258.method1603(-649, 100L);
                    }
                }
                this.field6330.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method1129();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "()Z", line = 1430)
    public final boolean method1096() {
        return this.field6333.method332(true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lab;Ldr;[Lbm;I)V", line = 1435)
    public final void method1147(class232[] arg0, class250 arg1, class219[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method41(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(FFF)V", line = 1448)
    private final void method2677(float arg0, float arg1, float arg2) {
        this.field6330.glMatrixMode(5890);
        if (this.field6387) {
            this.field6330.glLoadIdentity();
        }
        this.field6330.glTranslatef(arg0, arg1, arg2);
        this.field6330.glMatrixMode(5888);
        this.field6387 = true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lab;Lnd;Ldr;[Lbm;I)V", line = 1458)
    public final void method1093(class232[] arg0, class473 arg1, class250 arg2, class219[] arg3, int arg4) {
        this.method1147(arg0, arg2, arg3, arg4);
        this.method1115(arg1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1462)
    public final void method1072(Rectangle[] arg0, int arg1) {
        this.method1122();
    }

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "()V", line = 1465)
    public final void method2678() {
        this.field6330.glPopMatrix();
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "()Z", line = 1468)
    public final boolean method1074() {
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lla;", line = 1473)
    public final class220 method2679(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class220) (this.field6395 && !arg2 || this.field6446 ? new class142(this, arg0, arg1, arg2) : new class369(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Lmm;)V", line = 1481)
    public final void method2680(class397 arg0) {
        if (this.field6339 >= 3) {
            throw new RuntimeException();
        }
        if (this.field6339 >= 0) {
            this.field6337[this.field6339].method1710();
        }
        this.field6340 = this.field6337[++this.field6339] = arg0;
        this.field6340.method1711();
    }

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "()V", line = 1491)
    public final void method2681() {
        if (this.field6451 == 4) {
            return;
        }
        this.method2700();
        this.method2694(false);
        this.method2652(false);
        this.method2663(false);
        this.method2651(false);
        this.method2647(-2);
        this.method2653(1);
        this.method2696(1);
        this.field6451 = 4;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "()V", line = 1508)
    public final void method1111() {
        this.method2651(true);
        this.field6330.glClear(256);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIII)V", line = 1515)
    public final void method1079(int arg0, int arg1, int arg2, int arg3) {
        this.field6447 = arg0;
        this.field6361 = arg1;
        this.field6354 = arg2;
        this.field6419 = arg3;
        this.method2661();
        this.method2699();
        if (this.field6357 == 3) {
            this.method2706();
        } else if (this.field6357 == 2) {
            this.method2705();
        }
    }

    @OriginalMember(owner = "client!qi", name = "db", descriptor = "()V", line = 1530)
    private final void method2682() {
        if (this.field6451 == 1) {
            return;
        }
        this.method2700();
        this.method2694(false);
        this.method2652(false);
        this.method2663(false);
        this.method2651(false);
        this.method2692((class179) null);
        this.method2647(-2);
        this.method2696(0);
        this.field6451 = 1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(F)V", line = 1545)
    public final void method2683(float arg0) {
        if (this.field6372 != arg0) {
            this.field6372 = arg0;
            if (this.field6357 == 3) {
                this.method2706();
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "()Z", line = 1556)
    public final boolean method1092() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZZ)V", line = 1564)
    public final void method2684(int arg0, boolean arg1, boolean arg2) {
        if (this.field6458 != arg0) {
            if (arg0 < 0) {
                this.method2644();
                this.method2692((class179) null);
                if (!this.field6380) {
                    this.field6327.method2379(0, (byte) 113, arg1, arg2);
                }
            } else {
                class201 var4 = this.field6325.method2012(6408, arg0);
                class192 var5 = this.field6863.method1218(arg0, false);
                if (var5.field2747 == 0 && var5.field2741 == 0) {
                    this.method2644();
                } else {
                    int var6 = var5.field2730 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2677((float) (this.field6342 % var7 * var5.field2747) / (float) var7, (float) (this.field6342 % var7 * var5.field2741) / (float) var7, 0.0F);
                }
                if (this.field6380) {
                    this.field6327.method2379(3, (byte) 113, arg1, arg2);
                    this.method2692(var4);
                } else {
                    this.field6327.method2379(var5.field2729, (byte) 113, arg1, arg2);
                    this.field6327.method2381(var5.field2731, false, 4716);
                    if (!this.field6327.method2380((byte) -22, var4)) {
                        this.method2692(var4);
                    }
                }
            }
            this.field6458 = arg0;
        }
        this.field6451 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!qi", name = "eb", descriptor = "()Lmm;", line = 1615)
    public final class397 method2685() {
        return this.field6340;
    }

    @OriginalMember(owner = "client!qi", name = "fb", descriptor = "()V", line = 1619)
    private final void method2686() {
        this.field6330.glLoadIdentity();
        this.field6330.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field6330.glMultMatrixf(this.field6378.method1387((byte) -36), 0);
        this.method2640();
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIIII)V", line = 1629)
    public final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2682();
        this.method2653(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field6330.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field6330.glBegin(1);
        this.field6330.glVertex2f(var6, var7);
        this.field6330.glVertex2f(var6, (float) arg2 + var7);
        this.field6330.glEnd();
    }

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "()V", line = 1646)
    public final void method1058() {
        this.field6322.method2149();
    }

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "()Ldr;", line = 1650)
    public final class250 method1124() {
        return new class218();
    }

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "()I", line = 1653)
    public final int method1112() {
        return this.field6344 + this.field6341 + this.field6343;
    }

    @OriginalMember(owner = "client!qi", name = "gb", descriptor = "()I", line = 1657)
    private final int method2687() {
        int var1 = 0;
        this.field6413 = this.field6330.glGetString(7936);
        this.field6358 = this.field6330.glGetString(7937);
        String var2 = this.field6413.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field6330.glGetString(7938);
        String[] var4 = class326.method1958((byte) 126, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class168.method1039(var4[0], false);
                int var6 = class168.method1039(var4[1], false);
                this.field6377 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field6377 < 12) {
            var1 |= 0x2;
        }
        if (!this.field6330.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field6330.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field6330.glGetIntegerv(34018, var8, 0);
        this.field6457 = var8[0];
        this.field6330.glGetIntegerv(34929, var8, 0);
        this.field6417 = var8[0];
        this.field6330.glGetIntegerv(34930, var8, 0);
        this.field6359 = var8[0];
        if (this.field6457 < 2 || this.field6417 < 2 || this.field6359 < 2) {
            var1 |= 0x10;
        }
        this.field6360 = class14.field231 != null && class14.field231.startsWith("mac");
        this.field6400 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field6395 = this.field6330.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field6364 = this.field6330.isExtensionAvailable("GL_ARB_multisample");
        this.field6414 = this.field6330.isExtensionAvailable("GL_ARB_vertex_program");
        this.field6330.isExtensionAvailable("GL_ARB_fragment_program");
        this.field6330.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field6375 = this.field6330.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field6398 = this.field6330.isExtensionAvailable("GL_EXT_texture3D");
        this.field6402 = this.field6330.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field6434 = this.field6330.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field6403 = this.field6330.isExtensionAvailable("GL_ARB_texture_float");
        this.field6371 = false;
        this.field6405 = this.field6330.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I[BIZ)Lla;", line = 1729)
    public final class220 method2688(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class220) (this.field6395 && !arg3 || this.field6446 ? new class142(this, arg0, arg1, arg2, arg3) : new class369(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "()Z", line = 1737)
    public final boolean method1082() {
        return this.field6333.method2369();
    }

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "()V", line = 1743)
    public final void method1091() {
        this.field6327.method2379(0, (byte) 113, false, false);
        this.field6380 = false;
        this.method2646();
        this.method2643();
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(IIII)V", line = 1751)
    public final void method1117(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6437 < arg0) {
            this.field6437 = arg0;
        }
        if (this.field6455 > arg2) {
            this.field6455 = arg2;
        }
        if (this.field6401 < arg1) {
            this.field6401 = arg1;
        }
        if (this.field6443 > arg3) {
            this.field6443 = arg3;
        }
        this.field6330.glEnable(3089);
        this.method2699();
        this.method2662();
    }

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "()Z", line = 1769)
    public final boolean method1132() {
        return this.field6364;
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(II)V", line = 1773)
    public final synchronized void method2689(int arg0, int arg1) {
        class128 var3 = new class128(arg1);
        var3.field2608 = (long) arg0;
        this.field6348.method1553((byte) -117, var3);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[I[I)Lvb;", line = 1778)
    public final class90 method1148(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class470.method2756((byte) 59, arg1, arg0, this, arg2, arg3);
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V", line = 1787)
    public final synchronized void method1099(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field6348.method1549(2)) {
            class128 var4 = (class128) this.field6348.method1548(8779);
            field6323[var2++] = (int) var4.field2608;
            this.field6341 -= var4.field1815;
            if (var2 == 1000) {
                this.field6330.glDeleteBuffersARB(var2, field6323, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field6330.glDeleteBuffersARB(var2, field6323, 0);
            var2 = 0;
        }
        while (!this.field6349.method1549(2)) {
            class128 var5 = (class128) this.field6349.method1548(8779);
            field6323[var2++] = (int) var5.field2608;
            this.field6344 -= var5.field1815;
            if (var2 == 1000) {
                this.field6330.glDeleteTextures(var2, field6323, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field6330.glDeleteTextures(var2, field6323, 0);
            var2 = 0;
        }
        while (!this.field6350.method1549(2)) {
            class128 var6 = (class128) this.field6350.method1548(8779);
            field6323[var2++] = var6.field1815;
            if (var2 == 1000) {
                this.field6330.glDeleteFramebuffersEXT(var2, field6323, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field6330.glDeleteFramebuffersEXT(var2, field6323, 0);
            var2 = 0;
        }
        while (!this.field6351.method1549(2)) {
            class128 var7 = (class128) this.field6351.method1548(8779);
            field6323[var2++] = (int) var7.field2608;
            this.field6343 -= var7.field1815;
            if (var2 == 1000) {
                this.field6330.glDeleteRenderbuffersEXT(var2, field6323, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field6330.glDeleteRenderbuffersEXT(var2, field6323, 0);
            var2 = 0;
        }
        while (!this.field6352.method1549(2)) {
            class128 var8 = (class128) this.field6352.method1548(8779);
            field6323[var2++] = (int) var8.field2608;
            if (var2 == 1000) {
                this.field6330.glDeleteProgramsARB(var2, field6323, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field6330.glDeleteProgramsARB(var2, field6323, 0);
            boolean var9 = false;
        }
        while (!this.field6338.method1549(2)) {
            class128 var10 = (class128) this.field6338.method1548(8779);
            this.field6330.glDeleteLists((int) var10.field2608, var10.field1815);
        }
        while (!this.field6353.method1549(2)) {
            class128 var11 = (class128) this.field6353.method1548(8779);
            this.field6330.glDeleteObjectARB(var11.field1815);
        }
        while (!this.field6338.method1549(2)) {
            class128 var12 = (class128) this.field6338.method1548(8779);
            this.field6330.glDeleteLists((int) var12.field2608, var12.field1815);
        }
        if (this.method1112() > 100663296 && class193.method1237(-9581) > this.field6409 + 60000L) {
            System.gc();
            this.field6409 = class193.method1237(-9581);
        }
        this.field6342 = var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lua;Z)Laq;", line = 1955)
    public final class385 method1139(class140 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field1993 * arg0.field1989];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1994 == null) {
            for (int var8 = 0; var8 < arg0.field1989; var8++) {
                for (int var9 = 0; var9 < arg0.field1993; var9++) {
                    int var10 = arg0.field1991[arg0.field1995[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field1989; var6++) {
                for (int var7 = 0; var7 < arg0.field1993; var7++) {
                    var3[var5++] = arg0.field1994[var4] << 24 | arg0.field1991[arg0.field1995[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class385 var11 = this.method1073(var3, 0, arg0.field1993, arg0.field1993, arg0.field1989);
        var11.method392(arg0.field1992, arg0.field1988, arg0.field1990, arg0.field1996);
        return var11;
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(IIIIII)V", line = 2016)
    public final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2682();
        this.method2653(arg5);
        this.field6330.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6364) {
            this.field6330.glDisable(32925);
        }
        this.field6330.glBegin(2);
        this.field6330.glVertex2f(var7, var8);
        this.field6330.glVertex2f(var7, var10);
        this.field6330.glVertex2f(var9, var10);
        this.field6330.glVertex2f(var9, var8);
        this.field6330.glEnd();
        if (this.field6364) {
            this.field6330.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "()Z", line = 2040)
    public final boolean method1123() {
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "hb", descriptor = "()V", line = 2045)
    private final void method2690() {
        field6332[0] = this.field6422 * this.field6373;
        field6332[1] = this.field6459 * this.field6422;
        field6332[2] = this.field6452 * this.field6422;
        field6332[3] = 1.0F;
        this.field6330.glLightModelfv(2899, field6332, 0);
    }

    @OriginalMember(owner = "client!qi", name = "ib", descriptor = "()V", line = 2058)
    private final void method2691() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field6329.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class258.method1603(-649, 1000L);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Let;)V", line = 2082)
    public final void method2692(class179 arg0) {
        class179 var2 = this.field6423[this.field6396];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field6330.glDisable(var2.field2598);
            } else {
                if (var2 == null) {
                    this.field6330.glEnable(arg0.field2598);
                } else if (arg0.field2598 != var2.field2598) {
                    this.field6330.glDisable(var2.field2598);
                    this.field6330.glEnable(arg0.field2598);
                }
                this.field6330.glBindTexture(arg0.field2598, arg0.method1175());
            }
            this.field6423[this.field6396] = arg0;
        }
        this.field6451 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(FFF)V", line = 2112)
    public final void method1069(float arg0, float arg1, float arg2) {
        class398.field5569 = arg0;
        class398.field5567 = arg1;
        class398.field5570 = arg2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ldr;)V", line = 2124)
    public final void method1071(class250 arg0) {
        this.field6378 = (class218) arg0;
        this.field6365.method1377(this.field6378, (byte) 27);
        if (this.field6357 != 1) {
            this.method2686();
        }
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(Z)V", line = 2133)
    public final void method2693(boolean arg0) {
        if (this.field6432 != arg0) {
            this.field6432 = arg0;
            this.method2711();
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIIIII)V", line = 2143)
    public final void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2682();
        this.method2653(arg5);
        this.field6330.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field6330.glBegin(2);
        this.field6330.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field6330.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field6330.glEnd();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III[I)V", line = 2153)
    public final void method1095(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field6378.field3081 + (float) arg0 * this.field6378.field3085 + (float) arg1 * this.field6378.field3088 + this.field6378.field3089;
        if ((var5 < (float) this.field6454) || (var5 > (float) this.field6367)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field6378.field3090 + (float) arg0 * this.field6378.field3091 + (float) arg1 * this.field6378.field3084 + this.field6378.field3086) * (float) this.field6354 / var5);
        int var7 = (int) (((float) arg2 * this.field6378.field3082 + (float) arg0 * this.field6378.field3087 + (float) arg1 * this.field6378.field3083 + this.field6378.field3092) * (float) this.field6419 / var5);
        if ((float) var6 >= this.field6445 && (float) var6 <= this.field6444 && (float) var7 >= this.field6435 && (float) var7 <= this.field6420) {
            arg3[0] = (int) ((float) var6 - this.field6445);
            arg3[1] = (int) ((float) var7 - this.field6435);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(Z)V", line = 2177)
    public final void method2694(boolean arg0) {
        if (this.field6369 != arg0) {
            this.field6369 = arg0;
            this.method2643();
            this.field6451 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "(I)V", line = 2187)
    public final synchronized void method2695(int arg0) {
        class128 var2 = new class128(arg0);
        this.field6350.method1553((byte) -82, var2);
    }

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "(I)V", line = 2191)
    public final void method2696(int arg0) {
        if (arg0 == 0) {
            this.method2702(7681, 7681);
        } else if (arg0 == 1) {
            this.method2702(8448, 8448);
        } else if (arg0 == 2) {
            this.method2702(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lrh;)V", line = 2204)
    public final void method2697(class218 arg0) {
        this.field6330.glPushMatrix();
        this.field6330.glMultMatrixf(arg0.method1387((byte) -36), 0);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)V", line = 2209)
    public final void method2698(int arg0, int arg1, int arg2) {
        this.field6330.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "()I", line = 2215)
    public final int method1056() {
        return this.field6367;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lab;Lnd;Ldr;Lbm;I)V", line = 2218)
    public final void method1063(class232 arg0, class473 arg1, class250 arg2, class219 arg3, int arg4) {
        arg0.method41(arg2, arg3, arg4);
        this.method1115(arg1);
    }

    @OriginalMember(owner = "client!qi", name = "jb", descriptor = "()V", line = 2224)
    private final void method2699() {
        this.field6445 = (float) (this.field6437 - this.field6447);
        this.field6444 = (float) (this.field6455 - this.field6447);
        this.field6435 = (float) (this.field6401 - this.field6361);
        this.field6420 = (float) (this.field6443 - this.field6361);
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(IIII)V", line = 2232)
    public final void method1116(int arg0, int arg1, int arg2, int arg3) {
        this.field6380 = true;
        this.field6429 = arg1;
        this.field6410 = arg2;
        this.field6386 = arg3;
        this.method2646();
        this.method2643();
        this.field6327.method2379(3, (byte) 113, false, false);
        this.field6327.method2381(arg0, true, 4716);
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIII)[I", line = 2247)
    public final int[] method1149(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field6330.glReadPixels(arg0, this.field6346 - arg1 - var6, arg2, 1, 32993, this.field6363, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnd;)V", line = 2260)
    public final void method1115(class473 arg0) {
        this.field6331.method1214(this, arg0);
    }

    @OriginalMember(owner = "client!qi", name = "kb", descriptor = "()V", line = 2263)
    private final void method2700() {
        if (this.field6357 == 1) {
            return;
        }
        this.field6330.glMatrixMode(5889);
        this.field6330.glLoadIdentity();
        if (this.field6335 > 0 && this.field6346 > 0) {
            this.field6330.glOrtho(0.0D, (double) this.field6335, (double) this.field6346, 0.0D, -1.0D, 1.0D);
        }
        this.field6330.glMatrixMode(5888);
        this.field6330.glLoadIdentity();
        this.field6357 = 1;
        this.field6451 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V", line = 2279)
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "(I)I", line = 2281)
    public final int method2701(int arg0) {
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

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIZ)Laq;", line = 2295)
    public final class385 method1133(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class91(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "(II)V", line = 2298)
    public final void method2702(int arg0, int arg1) {
        if (this.field6396 != 0) {
            this.field6330.glTexEnvi(8960, 34161, arg0);
            this.field6330.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field6424 != arg0) {
            this.field6330.glTexEnvi(8960, 34161, arg0);
            this.field6424 = arg0;
            var3 = true;
        }
        if (this.field6385 != arg1) {
            this.field6330.glTexEnvi(8960, 34162, arg1);
            this.field6385 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field6451 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "()I", line = 2334)
    public final int method1128() {
        int var1 = this.field6389;
        this.field6389 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I", line = 2340)
    public final int method1102(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "()Z", line = 2344)
    public final boolean method1121() {
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "(I)V", line = 2348)
    public final synchronized void method2703(int arg0) {
        class128 var2 = new class128(arg0);
        this.field6353.method1553((byte) -90, var2);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFFFFF)V", line = 2355)
    public final void method1153(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field6366 != arg0;
        if (var7 || this.field6408 != arg1 || this.field6381 != arg2) {
            this.field6366 = arg0;
            this.field6408 = arg1;
            this.field6381 = arg2;
            if (var7) {
                this.field6373 = (float) (this.field6366 & 0xFF0000) / 1.671168E7F;
                this.field6459 = (float) (this.field6366 & 0xFFFF) / 65535.0F;
                this.field6452 = (float) (this.field6366 & 0xFF) / 255.0F;
                this.method2690();
            }
            this.method2671();
        }
        if (this.field6368[0] == arg3 && this.field6368[1] == arg4 && this.field6368[2] == arg5) {
            return;
        }
        this.field6368[0] = arg3;
        this.field6368[1] = arg4;
        this.field6368[2] = arg5;
        this.field6356[0] = -arg3;
        this.field6356[1] = -arg4;
        this.field6356[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field6416[0] = arg3 * var8;
        this.field6416[1] = arg4 * var8;
        this.field6416[2] = arg5 * var8;
        this.field6392[0] = -this.field6416[0];
        this.field6392[1] = -this.field6416[1];
        this.field6392[2] = -this.field6416[2];
        this.method2640();
        this.field6442 = (int) (arg3 * 256.0F / arg4);
        this.field6428 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(IIII)V", line = 2397)
    public final void method1075(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field6380) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field6429 = arg1;
        this.field6410 = arg2;
        this.field6386 = arg3;
        this.method2646();
        this.field6327.method2381(arg0, true, 4716);
    }

    @OriginalMember(owner = "client!qi", name = "lb", descriptor = "()V", line = 2409)
    public final void method2704() {
        if (this.field6451 == 2) {
            return;
        }
        this.method2700();
        this.method2694(false);
        this.method2652(false);
        this.method2663(false);
        this.method2651(false);
        this.method2647(-2);
        this.field6451 = 2;
    }

    @OriginalMember(owner = "client!qi", name = "mb", descriptor = "()V", line = 2422)
    private final void method2705() {
        this.field6330.glMatrixMode(5889);
        this.field6330.glLoadMatrixf(this.field6362, 0);
        this.field6330.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qi", name = "nb", descriptor = "()V", line = 2432)
    private final void method2706() {
        float var1 = (float) (-this.field6447) * this.field6372 / (float) this.field6354;
        float var2 = (float) (-this.field6361) * this.field6372 / (float) this.field6419;
        float var3 = (float) (this.field6335 - this.field6447) * this.field6372 / (float) this.field6354;
        float var4 = (float) (this.field6346 - this.field6361) * this.field6372 / (float) this.field6419;
        this.field6330.glMatrixMode(5889);
        this.field6330.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field6330.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field6454 - this.field6427), (double) ((float) this.field6367 - this.field6427));
        }
        this.field6330.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "()Ldr;", line = 2447)
    public final class250 method1105() {
        return this.field6334;
    }

    @OriginalMember(owner = "client!qi", name = "ob", descriptor = "()V", line = 2450)
    private final void method2707() {
        this.field6330.glDepthMask(this.field6374 && this.field6421);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)V", line = 2455)
    public final void method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6330.glLineWidth((float) arg5);
        this.method1120(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field6330.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)V", line = 2462)
    public final void method1108(boolean arg0) {
        this.field6421 = arg0;
        this.method2707();
    }

    @OriginalMember(owner = "client!qi", name = "pb", descriptor = "()V", line = 2468)
    private final void method2708() {
        try {
            this.field6329.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V", line = 2475)
    public final void method1104(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)V", line = 2480)
    public final void method2709(int arg0, int arg1, int arg2) {
        this.field6330.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field6330.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "qb", descriptor = "()V", line = 2484)
    public final void method2710() {
        if (this.field6451 == 16) {
            return;
        }
        this.method2648();
        this.method2694(true);
        this.method2663(true);
        this.method2651(true);
        this.method2653(1);
        this.method2696(1);
        this.field6451 = 16;
    }

    @OriginalMember(owner = "client!qi", name = "rb", descriptor = "()V", line = 2497)
    private final void method2711() {
        if (this.field6415 && !this.field6432) {
            this.field6330.glEnable(2896);
        } else {
            this.field6330.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()I", line = 2504)
    public final int method1713() {
        return this.field6346;
    }
}
