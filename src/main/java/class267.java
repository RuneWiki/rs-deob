import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class267 {

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[B")
    public byte[] field4521 = new byte[18002];

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[[I")
    public int[][] field4522 = new int[6][258];

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[[B")
    public byte[][] field4509 = new byte[6][258];

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[Z")
    public boolean[] field4517 = new boolean[16];

    @OriginalMember(owner = "client!v", name = "E", descriptor = "[[I")
    public int[][] field4528 = new int[6][258];

    @OriginalMember(owner = "client!v", name = "B", descriptor = "[B")
    public byte[] field4525 = new byte[256];

    @OriginalMember(owner = "client!v", name = "J", descriptor = "[B")
    public byte[] field4533 = new byte[18002];

    @OriginalMember(owner = "client!v", name = "I", descriptor = "[Z")
    public boolean[] field4532 = new boolean[256];

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[I")
    public int[] field4535 = new int[6];

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public int field4540 = 0;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "[B")
    public byte[] field4538 = new byte[4096];

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
    public int[] field4514 = new int[256];

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[[I")
    public int[][] field4539 = new int[6][258];

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
    public int[] field4530 = new int[16];

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public int field4537 = 0;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "[I")
    public int[] field4527 = new int[257];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lmh;")
    public static class62 field4505 = class201.method1405(true, "");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lmh;")
    private static class62 field4502 = class201.method1405(true, " is already on your ignore list)3");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lmh;")
    public static class62 field4498 = class201.method1405(true, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lmh;")
    public static class62 field4520 = field4502;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lmh;")
    public static class62 field4515 = class201.method1405(true, "Abbrechen");

    @OriginalMember(owner = "client!v", name = "m", descriptor = "B")
    public byte field4510;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[B")
    public byte[] field4501;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[B")
    public byte[] field4534;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 7)
    public static void method1835(byte arg0) {
        field4520 = null;
        field4498 = null;
        field4505 = null;
        field4502 = null;
        if (arg0 < -97) {
            field4515 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V", line = 38)
    public static final void method1836(byte arg0, int arg1, int arg2) {
        class154.method1127();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class212.field3569 = class301.method2065(arg1, 0, class193.field3246, -103, 0, arg2);
        if (arg0 >= 0) {
            method1840(-5, 114, -56, 86, -7);
        }
        field4526++;
        if (class212.field3569 == null) {
            class57.method376(-28268);
            return;
        }
        class124.field2055 = arg1;
        class54.field795 = arg2;
        class12.method47((byte) -115, class193.field3246);
        class197.method1378(false, 0);
        class108.method833(-52);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Lfd;Lhi;[Lfd;I[Lfd;[Lkb;[Lfd;)V", line = 128)
    public static final void method1837(class61[] arg0, class26 arg1, class61[] arg2, int arg3, class61[] arg4, class82[] arg5, class61[] arg6) {
        class78.field1311 = arg4;
        class91.field1434 = arg5;
        class110.field1788 = arg0;
        class203.field3423 = arg6;
        class229.field3988 = arg1;
        field4507++;
        class113.field1881 = arg2;
        class204.field3440.method328(false);
        int var7 = class229.field3988.method153((byte) 110, class22.field231);
        if (arg3 == 16174) {
            int[] var8 = class229.field3988.method142(-17, var7);
            for (int var9 = 0; var9 < var8.length; var9++) {
                class204.field3440.method330(class254.method1771(-100, new class92(class229.field3988.method157(var8[var9], var7, (byte) 19))), 66);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)I", line = 159)
    public static final int method1838(byte arg0, int arg1) {
        field4523++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else if (arg0 <= 65) {
            return -91;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 193)
    public static final void method1839(byte arg0) {
        class42.field636.method1395((byte) -43);
        class165.field2677.method1395((byte) -43);
        field4500++;
        class294.field5004.method1395((byte) -43);
        int var1 = -38 / ((arg0 - 31) / 32);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V", line = 229)
    public static final void method1840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4503++;
        for (int var5 = arg3; var5 < class221.field3805; var5++) {
            if (class166.field2725[var5] + class161.field2604[var5] > arg0 && class166.field2725[var5] < arg0 + arg4 && arg2 < class199.field3362[var5] + class183.field2935[var5] && (arg1 + arg2) > class199.field3362[var5]) {
                class220.field3784[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V", line = 256)
    public static final void method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class27 var7 = new class27();
        var7.field349 = arg1 / 128;
        var7.field348 = arg2 / 128;
        var7.field344 = arg3 / 128;
        var7.field336 = arg4 / 128;
        var7.field341 = arg0;
        var7.field330 = arg1;
        var7.field334 = arg2;
        var7.field346 = arg3;
        var7.field342 = arg4;
        var7.field350 = arg5;
        var7.field338 = arg6;
        class226.field3939[class152.field2404++] = var7;
    }
}
