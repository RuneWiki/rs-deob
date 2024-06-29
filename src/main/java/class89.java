import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class89 extends class343 {

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1352 = null;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "[[S")
    public static short[][] field1347 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!vr", name = "R", descriptor = "Z")
    public static boolean field1364 = false;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!vr", name = "P", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!vr", name = "S", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!vr", name = "T", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "Lwr;")
    private class316 field1355;

    @OriginalMember(owner = "client!vr", name = "Q", descriptor = "Lwr;")
    private class316 field1363;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "Leu;")
    private class333 field1346;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "Leu;")
    private class333 field1351;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "Leu;")
    private class333 field1354;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "Leu;")
    private class333 field1361;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "Lqh;")
    private class48 field1350;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "Lqh;")
    private class48 field1360;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "[Lwr;")
    private class316[] field1359;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)I")
    public final int method643(boolean arg0) {
        ++field1362;
        if (!arg0) {
            field1364 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)V")
    public static void method644(byte arg0) {
        if (arg0 == 96) {
            field1352 = null;
            field1347 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z")
    public final boolean method645(int arg0) {
        if (arg0 != -29012) {
            this.field1343 = 39;
        }
        ++field1365;
        return this.field1350 != null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILwr;Lwr;I)V")
    public final void method646(int arg0, class316 arg1, class316 arg2, int arg3) {
        OpenGL.glPushAttrib(2048);
        ++field1345;
        OpenGL.glMatrixMode(5889);
        OpenGL.glPushMatrix();
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (this.field1359 == null) {
            super.field4532.method2980(arg2, 110);
            super.field4532.method2938(this.field1350, 10);
            this.field1350.method349(0, -119);
            OpenGL.glViewport(0, 0, 256, 256);
            long var5 = this.field1346.field4375;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "params"), class49.field762, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f((float) this.field1349, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f((float) this.field1349, (float) this.field1353);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, (float) this.field1353);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        } else {
            super.field4532.method2938(this.field1360, 10);
            int var7 = class415.method2408(this.field1349, (byte) -88);
            int var8 = class415.method2408(this.field1353, (byte) -66);
            int var9 = 0;
            while (~var7 < -257 || var8 > 256) {
                OpenGL.glViewport(0, 0, var7, var8);
                this.field1360.method363(true, 0, this.field1359[var9]);
                if (var9 != 0) {
                    super.field4532.method2980(this.field1359[var9 + -1], 120);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                } else {
                    super.field4532.method2980(arg2, 108);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f((float) this.field1349, 0.0F);
                    OpenGL.glVertex2i(1, 0);
                    OpenGL.glTexCoord2f((float) this.field1349, (float) this.field1353);
                    OpenGL.glVertex2i(1, 1);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1353);
                    OpenGL.glVertex2i(0, 1);
                    OpenGL.glEnd();
                }
                if (var7 > 256) {
                    var7 >>= 1;
                }
                if (~var8 < -257) {
                    var8 >>= 1;
                }
                ++var9;
            }
            super.field4532.method2942(2, this.field1360);
            super.field4532.method2980(this.field1359[var9 + -1], 118);
            super.field4532.method2938(this.field1350, 10);
            this.field1350.method349(0, -92);
            OpenGL.glViewport(0, 0, 256, 256);
            long var10 = this.field1351.field4375;
            OpenGL.glUseProgramObjectARB(var10);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class49.field762, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
        }
        this.field1350.method349(1, -104);
        int var12 = 114 / ((arg3 - -58) / 43);
        super.field4532.method2980(this.field1355, 125);
        long var13 = this.field1354.field4375;
        OpenGL.glUseProgramObjectARB(var13);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var13, "baseTex"), 0);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.00390625F, 0.0F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        this.field1350.method349(0, -93);
        super.field4532.method2980(this.field1363, 110);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, "step"), 0.0F, 0.00390625F, 0.0F);
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(0, 0);
        OpenGL.glTexCoord2f(1.0F, 0.0F);
        OpenGL.glVertex2i(1, 0);
        OpenGL.glTexCoord2f(1.0F, 1.0F);
        OpenGL.glVertex2i(1, 1);
        OpenGL.glTexCoord2f(0.0F, 1.0F);
        OpenGL.glVertex2i(0, 1);
        OpenGL.glEnd();
        OpenGL.glPopAttrib();
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        super.field4532.method2942(2, this.field1350);
        long var15 = this.field1361.field4375;
        OpenGL.glUseProgramObjectARB(var15);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "sceneTex"), 0);
        OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, "bloomTex"), 1);
        OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, "params"), class289.field3783, class401.field5376, 0.0F);
        super.field4532.method3003(1, 80);
        super.field4532.method2980(this.field1355, 126);
        super.field4532.method3003(0, 93);
        super.field4532.method2980(arg2, 119);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI)V")
    public final void method647(int arg0, byte arg1, int arg2) {
        this.field1353 = arg0;
        this.field1349 = arg2;
        ++field1348;
        int var4 = class415.method2408(this.field1349, (byte) -65);
        int var5 = class415.method2408(this.field1353, (byte) -95);
        int var6 = -71 % ((arg1 - 40) / 53);
        if (this.field1343 != var4 || ~this.field1366 != ~var5) {
            if (this.field1359 != null) {
                for (int var7 = 0; ~var7 > ~this.field1359.length; ++var7) {
                    this.field1359[var7].method2861(false);
                }
                this.field1359 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field1360 = null;
            } else {
                int var8 = var4;
                int var9 = var5;
                int var10 = 0;
                if (this.field1360 == null) {
                    this.field1360 = new class48(super.field4532);
                }
                label56: while (true) {
                    if (var8 <= 256 && var9 <= 256) {
                        int var11 = var4;
                        int var12 = var5;
                        this.field1359 = new class316[var10];
                        int var13 = 0;
                        while (true) {
                            if (var11 <= 256 && var12 <= 256) {
                                break label56;
                            }
                            this.field1359[var13++] = new class316(super.field4532, 3553, 34842, var11, var12);
                            if (var11 > 256) {
                                var11 >>= 1;
                            }
                            if (var12 > 256) {
                                var12 >>= 1;
                            }
                        }
                    }
                    if (~var9 < -257) {
                        var9 >>= 1;
                    }
                    if (~var8 < -257) {
                        var8 >>= 1;
                    }
                    ++var10;
                }
            }
            this.field1366 = var5;
            this.field1343 = var4;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
    public final void method648(int arg0, int arg1) {
        ++field1357;
        OpenGL.glUseProgramObjectARB(0L);
        super.field4532.method3003(1, 98);
        if (arg1 != -31244) {
            this.field1363 = null;
        }
        super.field4532.method2980((class501) null, arg1 + 31371);
        super.field4532.method3003(0, 103);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)Z")
    public final boolean method649(byte arg0) {
        int var2 = -7 / ((-60 - arg0) / 48);
        ++field1356;
        if (super.field4532.field7510 && super.field4532.field7429 && super.field4532.field7528) {
            this.field1350 = new class48(super.field4532);
            this.field1355 = new class316(super.field4532, 3553, 34842, 256, 256);
            this.field1355.method1831(true, false, false);
            this.field1363 = new class316(super.field4532, 3553, 34842, 256, 256);
            this.field1363.method1831(true, false, false);
            super.field4532.method2938(this.field1350, 10);
            this.field1350.method363(true, 0, this.field1355);
            this.field1350.method363(true, 1, this.field1363);
            this.field1350.method349(0, -110);
            if (!this.field1350.method366((byte) 23)) {
                super.field4532.method2942(2, this.field1350);
                return false;
            } else {
                super.field4532.method2942(2, this.field1350);
                this.field1346 = class47.method335(super.field4532, new class191[] { class258.method1561("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35716, super.field4532, 35632) }, true);
                this.field1351 = class47.method335(super.field4532, new class191[] { class258.method1561("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35716, super.field4532, 35632) }, true);
                this.field1361 = class47.method335(super.field4532, new class191[] { class258.method1561("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35716, super.field4532, 35632) }, true);
                this.field1354 = class47.method335(super.field4532, new class191[] { class258.method1561("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35716, super.field4532, 35632) }, true);
                return this.field1351 != null && this.field1346 != null && this.field1361 != null && this.field1354 != null;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lbo;)V")
    public class89(class511 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)Z")
    public final boolean method650(int arg0) {
        if (arg0 > -89) {
            return true;
        } else {
            ++field1344;
            return super.field4532.field7510 && super.field4532.field7429 && super.field4532.field7528;
        }
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public final void method651(int arg0) {
        this.field1355 = null;
        if (arg0 != -5254) {
            method644((byte) -25);
        }
        this.field1351 = null;
        this.field1354 = null;
        this.field1346 = null;
        this.field1350 = null;
        this.field1361 = null;
        this.field1360 = null;
        this.field1363 = null;
        this.field1359 = null;
        ++field1358;
    }

    static {
        new class304("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
