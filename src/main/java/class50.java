import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class50 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "J")
    public static volatile long field1024 = 0L;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lud;")
    public static class279 field1032 = class130.method1024(" )2> ", 255);

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lud;")
    private static class279 field1038 = class130.method1024("Loaded wordpack", 255);

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Lud;")
    public static class279 field1040 = field1038;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lud;")
    private static class279 field1031 = class130.method1024("Untersuchen", 255);

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Loj;")
    public static class322 field1039 = new class322(0, 0);

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lud;")
    public static class279 field1043 = class130.method1024("(U", 255);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[[[B")
    public static byte[][][] field1042;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 8)
    public static final void method422() {
        GL var0 = class97.field1801;
        var0.glDisableClientState(32886);
        class97.method818(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class97.method831();
        for (int var1 = 0; var1 < class215.field3786[0].length; var1++) {
            class168 var2 = class215.field3786[0][var1];
            if (var2.field3031 >= 0 && class27.field656.method322(255, var2.field3031) == 4) {
                var0.glColor4fv(class251.method1803(var2.field3042, -16325), 0);
                float var3 = 201.5F - (var2.field3048 ? 1.0F : 0.5F);
                var2.method1313(class24.field619, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class97.method808();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class97.method824();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgf;ZI)V", line = 62)
    public static final void method424(class8 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field168 == 0 ? arg0.field220 : arg0.field168;
        field1037++;
        int var4 = arg0.field267 == 0 ? arg0.field297 : arg0.field267;
        class214.method1572(class18.field545[arg0.field299 >> 16], 0, arg1, var3, var4, arg0.field299);
        if (arg0.field159 != null) {
            class214.method1572(arg0.field159, ~arg2, arg1, var3, var4, arg0.field299);
        }
        class176 var5 = (class176) class226.field3977.method610((long) arg0.field299, arg2);
        if (var5 != null) {
            class23.method208(var5.field3165, var3, (byte) 66, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgf;Z)V", line = 82)
    public static final void method426(class8 arg0, boolean arg1) {
        field1030++;
        if (class11.field372 == arg0.field269) {
            class71.field1398[arg0.field154] = true;
        }
        if (arg1) {
            method422();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 103)
    public static void method427(int arg0) {
        field1038 = null;
        field1042 = (byte[][][]) null;
        field1043 = null;
        field1040 = null;
        field1032 = null;
        field1031 = null;
        if (arg0 == 20454) {
            field1039 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 142)
    public static final void method428(int arg0) {
        class12.field390 = class37.field828;
        class83.field1588 = class271.field4833;
        class207.field3672 = class62.field1279;
        class218.field3847 = class108.field2005;
        class54.field1192 = class294.field5247;
        class138.field2498 = class163.field2942;
        class119.field2151 = class133.field2431;
        class323.field5637 = class251.field4490;
        class105.field1979 = class86.field1640;
        class68.field1339 = class195.field3505;
        class121.field2175 = class143.field2599;
        class68.field1343 = class195.field3505;
        class60.field1258 = class217.field3837;
        class163.field2937 = class283.field5061;
        class324.field5659 = class278.field4916;
        class143.field2600 = field1031;
        class33.field738 = class124.field2246;
        class223.field3949 = class17.field540;
        class13.field412 = class64.field1321;
        class31.field716 = class248.field4415;
        class75.field1475 = class53.field1123;
        class321.field5613 = class138.field2499;
        class199.field3564 = class83.field1586;
        field1040 = class243.field4324;
        class71.field1388 = class301.field5362;
        class64.field1318 = class232.field4064;
        class232.field4066 = class67.field1325;
        class7.field140 = class185.field3392;
        class144.field2610 = class326.field5671;
        class110.field2026 = class117.field2128;
        class109.field2007 = class18.field548;
        class284.field5068 = class105.field1976;
        class192.field3468 = class273.field4861;
        class24.field616 = class150.field2743;
        class283.field5067 = class287.field5125;
        class162.field2926 = class286.field5097;
        class318.field5579 = class100.field1883;
        class213.field3753 = class103.field1935;
        class163.field2933 = client.field4476;
        class102.field1913 = class218.field3850;
        class200.field3575 = class223.field3942;
        class67.field1327 = class233.field4076;
        class102.field1904 = class204.field3636;
        class238.field4183 = class212.field3729;
        class254.field4541 = class265.field4771;
        class135.field2457 = class201.field3585;
        class8.field334 = class32.field724;
        class243.field4327 = class321.field5611;
        class252.field4502 = class236.field4110;
        class304.field5397 = class194.field3499;
        class74.field1457 = class180.field3285;
        class43.field893 = class170.field3072;
        class231.field4050 = class71.field1397;
        class98.field1842 = class238.field4177;
        class272.field4856 = class222.field3930;
        class304.field5390 = class20.field578;
        class52.field1095 = class39.field854;
        class211.field3704 = class185.field3397;
        class301.field5364 = class233.field4084;
        class131.field2400 = class109.field2009;
        field1026++;
        class140.field2551 = class322.field5617;
        class201.field3587 = class172.field3100;
        class304.field5399 = class14.field422;
        class71.field1399 = class125.field2329;
        class79.field1507 = class131.field2392;
        class307.field5466 = class164.field2947;
        class310.field5494 = class11.field365;
        class141.field2565 = class255.field4549;
        class166.field3004 = class133.field2420;
        class31.field719 = class126.field2339;
        class117.field2125 = class247.field4399;
        class102.field1907 = class194.field3484;
        class111.field2052 = class99.field1847;
        class253.field4530 = class28.field667;
        class253.field4511 = class205.field3650;
        class195.field3519 = class178.field3217;
        class109.field2017 = class166.field3006;
        class79.field1519 = class131.field2392;
        class5.field113 = class92.field1734;
        class191.field3431 = class232.field4073;
        class43.field905 = class170.field3072;
        class7.field145 = class103.field1945;
        if (arg0 != 0) {
            method424((class8) null, true, -26);
        }
        class261.field4637 = class180.field3275;
        class54.field1175 = class32.field728;
        class304.field5389 = class243.field4312;
        class24.field612 = class295.field5262;
        class15.field501 = class58.field1231;
        class265.field4782 = class33.field747;
        class104.field1954 = class92.field1745;
        class90.field1697 = class88.field1679;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lnh;ZLnh;)V", line = 478)
    public static final void method429(class115 arg0, boolean arg1, class115 arg2) {
        field1035++;
        if (arg2.field2094 != null) {
            arg2.method926((byte) -8);
        }
        arg2.field2105 = arg0.field2105;
        if (arg1) {
            arg2.field2094 = arg0;
            arg2.field2094.field2105 = arg2;
            arg2.field2105.field2094 = arg2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public abstract void method423(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public abstract void method425(int arg0, int arg1, int arg2);
}
