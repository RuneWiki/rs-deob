import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class244 implements class95 {

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[F")
    private float[] field4163 = new float[4];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lmh;")
    public static class62 field4141 = class201.method1405(true, "Spieler");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[Lmh;")
    public static class62[] field4151 = new class62[500];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public static int[] field4142 = new int[32];

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[S")
    public static short[] field4158 = new short[256];

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lmh;")
    public static class62 field4148 = class201.method1405(true, ")1 ");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lmh;")
    public static class62 field4153 = class201.method1405(true, ":assistreq:");

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lmh;")
    public static class62 field4157 = class201.method1405(true, "unzap");

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "S")
    public static short field4154 = 205;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public static boolean field4149 = true;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lmh;")
    public static class62 field4155 = class201.method1405(true, "<col=ffb000>");

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static volatile int field4150 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[[B")
    public static byte[][] field4140;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 8)
    private final void method1708(boolean arg0) {
        field4144++;
        GL var2 = class154.field2479;
        this.field4162 = var2.glGenLists(2);
        var2.glNewList(this.field4162, 4864);
        var2.glActiveTexture(33985);
        if (class40.field616) {
            var2.glBindTexture(32879, class40.field614);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        if (!arg0) {
            method1709(38);
        }
        var2.glEndList();
        var2.glNewList(this.field4162 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class40.field616) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V", line = 71)
    public final void method387() {
        field4152++;
        GL var1 = class154.field2479;
        var1.glCallList(this.field4162);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1709(int arg0) {
        class91.field1460 = class304.field5240;
        class233.field4029 = class113.field1875;
        class182.field2914 = class240.field4092;
        class122.field2024 = class151.field2381;
        class215.field3650 = class174.field2805;
        class153.field2420 = class207.field3521;
        class52.field737 = class183.field2933;
        class200.field3383 = class81.field1360;
        class110.field1789 = class29.field387;
        class177.field2832 = class230.field3997;
        class293.field4984 = class215.field3659;
        class271.field4610 = class203.field3427;
        class197.field3330 = class44.field668;
        class74.field1190 = class96.field1558;
        class17.field164 = class4.field45;
        class251.field4258 = class283.field4830;
        class152.field2407 = class265.field4487;
        class37.field503 = class42.field643;
        class100.field1645 = class43.field655;
        class155.field2503 = class54.field794;
        class38.field596 = class85.field1384;
        class271.field4602 = class203.field3427;
        class44.field666 = class191.field3089;
        class92.field1511 = class118.field1981;
        class153.field2438 = class256.field4331;
        class216.field3693 = class209.field3540;
        class133.field2168 = class50.field732;
        class176.field2814 = class127.field2107;
        class112.field1853 = class267.field4515;
        class62.field890 = class276.field4747;
        class143.field2289 = class26.field310;
        class57.field837 = class185.field2962;
        class177.field2833 = class158.field2553;
        class176.field2820 = class233.field4016;
        class78.field1319 = class107.field1731;
        class38.field578 = class173.field2797;
        class245.field4174 = class274.field4641;
        class207.field3516 = class5.field51;
        class103.field1700 = class170.field2776;
        class290.field4934 = class187.field2982;
        class110.field1786 = class70.field1077;
        class102.field1679 = class250.field4243;
        class156.field2515 = class125.field2098;
        class240.field4097 = class266.field4494;
        class101.field1665 = class102.field1677;
        class298.field5081 = class27.field343;
        class70.field1069 = class131.field2138;
        class192.field3232 = class55.field809;
        class68.field1052 = class184.field2942;
        class119.field1994 = class31.field425;
        class50.field723 = class306.field5259;
        class153.field2440 = class256.field4331;
        class248.field4222 = class222.field3857;
        field4143++;
        class63.field954 = class14.field117;
        class136.field2216 = class227.field3957;
        class247.field4211 = class190.field3017;
        class240.field4091 = class122.field2025;
        class156.field2513 = class200.field3376;
        class87.field1398 = class278.field4769;
        class230.field4001 = class200.field3386;
        class278.field4768 = class60.field872;
        class77.field1288 = class290.field4933;
        class73.field1113 = class102.field1685;
        class159.field2565 = class36.field477;
        class200.field3385 = class209.field3538;
        class102.field1678 = class62.field884;
        class21.field226 = class38.field585;
        class156.field2520 = class153.field2454;
        class241.field4112 = class275.field4680;
        class43.field656 = class26.field303;
        class149.field2355 = class227.field3952;
        class183.field2936 = class218.field3757;
        class284.field4857 = class26.field314;
        class129.field2114 = class36.field495;
        class98.field1614 = class30.field416;
        class263.field4432 = class122.field2033;
        class44.field664 = class264.field4449;
        if (arg0 != 2) {
            field4141 = (class62) null;
        }
        class64.field975 = class293.field4989;
        class308.field5283 = class141.field2273;
        class17.field159 = class203.field3433;
        class12.field103 = class133.field2159;
        class278.field4782 = class300.field5147;
        class294.field5018 = class119.field1988;
        class53.field775 = class20.field205;
        class104.field1709 = class170.field2763;
        class90.field1424 = class98.field1604;
        class240.field4087 = class266.field4494;
        class267.field4520 = class64.field967;
        class74.field1139 = class200.field3378;
        class113.field1872 = class109.field1769;
        class301.field5185 = class171.field2778;
        class227.field3958 = class226.field3928;
        class134.field2181 = class183.field2928;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I", line = 437)
    public static final int method1710(int arg0) {
        field4156++;
        if (arg0 != -28075) {
            return 3;
        } else if (class249.field4231) {
            return 0;
        } else if (class149.method1073((byte) -127)) {
            return class113.field1877 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V", line = 456)
    public static final void method1711(byte arg0, int arg1) {
        if (arg0 != -45) {
            field4140 = (byte[][]) ((byte[][]) null);
        }
        class236.field4051.method1390(arg1, arg0 ^ 0x6A);
        field4161++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 467)
    public final void method384() {
        field4147++;
        GL var1 = class154.field2479;
        var1.glCallList(this.field4162 + 1);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I", line = 477)
    public final int method383() {
        field4139++;
        return 0;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 507)
    public static void method1712(int arg0) {
        field4140 = (byte[][]) null;
        field4142 = null;
        field4141 = null;
        field4148 = null;
        field4158 = null;
        field4153 = null;
        if (arg0 > -59) {
            method1711((byte) -60, -81);
        }
        field4155 = null;
        field4157 = null;
        field4151 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 534)
    public final void method385(int arg0) {
        field4159++;
        GL var2 = class154.field2479;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field4163[2] = 0.0F;
            this.field4163[1] = 0.0F;
            this.field4163[0] = var5;
            this.field4163[3] = 0.0F;
        } else {
            this.field4163[0] = 0.0F;
            this.field4163[2] = var5;
            this.field4163[3] = 0.0F;
            this.field4163[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class173.field2794 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class113.field1882 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class100.field1643), (float) (-class107.field1737), (float) (-class49.field710));
        var2.glTexGenfv(8192, 9474, this.field4163, 0);
        this.field4163[2] = 0.0F;
        this.field4163[3] = (float) class154.field2455 * var3;
        this.field4163[0] = 0.0F;
        this.field4163[1] = var5;
        var2.glTexGenfv(8193, 9474, this.field4163, 0);
        var2.glPopMatrix();
        if (class40.field616) {
            this.field4163[3] = (float) class154.field2455 * var4;
            this.field4163[0] = 0.0F;
            this.field4163[1] = 0.0F;
            this.field4163[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4163, 0);
        } else {
            int var7 = (int) ((float) class154.field2455 * var4 * 64.0F);
            var2.glBindTexture(3553, class40.field618[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 603)
    public class244() {
        this.method1708(true);
    }
}
