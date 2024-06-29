import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class141 {

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[J")
    private long[] field439 = new long[10];

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field451 = 0;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    private int field440 = 256;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field460 = 1;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "J")
    private long field443 = class39.method307(8);

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field445 = 1;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lid;")
    public static class60 field442 = class11.method72("Sprites geladen)3", (byte) -52);

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lid;")
    public static class60 field441 = class11.method72("headicons_prayer", (byte) -118);

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lid;")
    public static class60 field454 = class11.method72("::rect_debug", (byte) -40);

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Lid;")
    public static class60 field448 = class11.method72("Willkommen auf RuneScape", (byte) -47);

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lh;")
    public static class49 field447;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[I")
    public static int[] field459;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "[[[B")
    public static byte[][][] field458;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIZ)I")
    public static final int method145(boolean arg0, int arg1, boolean arg2) {
        int var3 = 0;
        if (arg1 != 1) {
            field445 = -62;
        }
        if (arg0) {
            var3 += class34.field798 + class13.field232;
        }
        field449++;
        if (arg2) {
            var3 += class157.field3588 + class128.field2933;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I")
    public final int method146(int arg0, int arg1, int arg2) {
        field456++;
        int var4 = this.field440;
        this.field440 = 300;
        int var5 = this.field460;
        this.field460 = 1;
        this.field443 = class39.method307(8);
        if (this.field439[this.field455] == 0L) {
            this.field440 = var4;
            this.field460 = var5;
        } else if (this.field443 > this.field439[this.field455]) {
            this.field440 = (int) ((long) (arg0 * 2560) / (this.field443 - this.field439[this.field455]));
        }
        if (this.field440 < 25) {
            this.field440 = 25;
        }
        if (this.field440 > 256) {
            this.field440 = 256;
            this.field460 = (int) ((long) arg0 - (this.field443 - this.field439[this.field455]) / 10L);
        }
        if (this.field460 > arg0) {
            this.field460 = arg0;
        }
        this.field439[this.field455] = this.field443;
        this.field455 = (this.field455 + 1) % 10;
        if (this.field460 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field439[var6] != 0L) {
                    this.field439[var6] += this.field460;
                }
            }
        }
        if (arg2 != -1) {
            this.field439 = null;
        }
        int var7 = 0;
        if (arg1 > this.field460) {
            this.field460 = arg1;
        }
        class128.method1007((byte) 126, (long) this.field460);
        while (this.field451 < 256) {
            this.field451 += this.field440;
            var7++;
        }
        this.field451 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static final void method147(byte arg0) {
        field446++;
        if (!class75.field1811) {
            return;
        }
        if (arg0 <= 90) {
            field448 = null;
        }
        class41.field1100 = null;
        class54.field1357 = null;
        class38.field910 = null;
        class48.field1263 = null;
        class38.field923 = null;
        class94.field2312 = null;
        class86.field2140 = null;
        class22.field551 = null;
        class24.field581 = null;
        class87.field2188 = null;
        class148.field3308 = null;
        class124.field2868 = null;
        class52.field1335 = null;
        class64.field1606 = null;
        class66.field1634 = null;
        client.field509 = null;
        class146.field3288 = null;
        class15.field347 = null;
        class106.field2624 = null;
        class105.field2583 = null;
        class78.method632(2, 19339);
        class90.method733(true, (byte) -89);
        class75.field1811 = false;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public final void method148(byte arg0) {
        field438++;
        int var2 = 0;
        if (arg0 != -10) {
            this.method146(-122, 82, 110);
        }
        while (var2 < 10) {
            this.field439[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)Lid;")
    public static final class60 method149(int arg0, int arg1, int arg2) {
        field453++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class64.field1598;
        } else if (var3 < -6) {
            return class158.field3625;
        } else if (var3 < -3) {
            return class77.field1886;
        } else if (arg1 != -17976) {
            return null;
        } else if (var3 < 0) {
            return class103.field2507;
        } else if (var3 > 9) {
            return class33.field781;
        } else if (var3 > 6) {
            return class60.field1485;
        } else if (var3 > 3) {
            return class137.field3104;
        } else if (var3 > 0) {
            return class157.field3584;
        } else {
            return class34.field790;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lt;")
    public static final class132 method150(int arg0, int arg1) {
        field452++;
        class132 var2 = (class132) class105.field2585.method918(-23, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1648.method473((byte) 116, 1, arg1);
        int var4 = -13 % ((-arg0 - 46) / 45);
        class132 var5 = new class132();
        if (var3 != null) {
            var5.method1042(new class103(var3), arg1, -109);
        }
        var5.method1047(false);
        class105.field2585.method914(var5, (long) arg1, (byte) 100);
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public static final void method151(byte arg0) {
        field444++;
        class81.method684(16777215);
        class153.method1168(108);
        class32.method240(-99);
        class2.method8((byte) 25);
        class101.method791((byte) -73);
        class69.method516(false);
        class50.method382(0);
        class148.method1130(-85);
        class78.method636(-119);
        class21.method165((byte) 14);
        class66.method501(0);
        class113.method908(61);
        ((class139) class127.field2914).method1081((byte) -63);
        int var1 = 66 % ((arg0 - 48) / 50);
        class133.field3032.method920((byte) 14);
        class121.field2777.method481((byte) -91);
        class11.field185.method481((byte) 51);
        class125.field2879.method481((byte) -85);
        class158.field3617.method481((byte) 115);
        class12.field210.method481((byte) 100);
        class35.field883.method481((byte) -82);
        class85.field2131.method481((byte) 77);
        class56.field1407.method481((byte) 62);
        class12.field226.method481((byte) -110);
        class153.field3428.method481((byte) 57);
        class93.field2297.method481((byte) -86);
        class94.field2313.method481((byte) -120);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public static final void method152(int arg0, int arg1, int arg2) {
        field450++;
        if (~class9.field156 != arg2 && arg0 != -1) {
            class100.method786(arg0, (byte) -119, false, 0, class93.field2297, class9.field156);
            class72.field1733 = true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static void method153(byte arg0) {
        field441 = null;
        field448 = null;
        field458 = null;
        if (arg0 == -17) {
            field454 = null;
            field459 = null;
            field447 = null;
            field442 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class18() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field439[var1] = this.field443;
        }
    }
}
