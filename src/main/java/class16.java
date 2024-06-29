import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class16 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    private int field350 = 0;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    private int field349 = -1;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLia;)I")
    public static final int method160(byte arg0, class257 arg1) {
        field351++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 <= 118) {
            method166(93, (class152) null);
        }
        for (int var2 = 0; var2 < class138.field2462; var2++) {
            if (arg1.method1681((byte) 46, class185.field3218[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILk;I)V")
    private final void method161(int arg0, int arg1, class152 arg2, int arg3) {
        field356++;
        if (arg0 != 255) {
            this.field359 = -76;
        }
        if (arg3 == 1) {
            this.field350 = arg2.method1064((byte) -122);
            this.method163(-15330, this.field350);
        } else if (arg3 == 2) {
            this.field349 = arg2.method1063(-17162);
            if (this.field349 != 65535) {
                return;
            }
            this.field349 = -1;
        } else if (arg3 == 3) {
            arg2.method1063(-17162);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method162(int arg0) {
        try {
            if (arg0 > -58) {
                field344 = 106;
            }
            if (class186.field3230 == null) {
                class186.field3230 = new class182(class72.field1404, class233.method1528(new class257[] { class205.method1378((byte) -28), class258.field4488 }, 0).method1707(true));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class186.field3230 = null;
        }
        field354++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    private final void method163(int arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFFE4C4) >> 16) / 256.0D;
        field348++;
        double var5 = (double) ((arg1 & 0xFFBB) >> 8) / 256.0D;
        if (arg0 != -15330) {
            this.field359 = 82;
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (var3 > var5) {
            var15 = var5;
        }
        if (var15 > var7) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var3 == var9) {
                var11 = (var5 - var7) / (var9 - var15);
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var9 - var15) + 2.0D;
            } else if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var15) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        this.field359 = (int) (var17 * 256.0D);
        this.field353 = (int) (var13 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field355 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field355 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field359 < 0) {
            this.field359 = 0;
        } else if (this.field359 > 255) {
            this.field359 = 255;
        }
        if (this.field355 < 1) {
            this.field355 = 1;
        }
        if (this.field353 < 0) {
            this.field353 = 0;
        } else if (this.field353 > 255) {
            this.field353 = 255;
        }
        double var19 = var11 / 6.0D;
        this.field345 = (int) ((double) this.field355 * var19);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method164(int arg0) {
        class17 var1 = class152.field2635;
        synchronized (class152.field2635) {
            class54.field1161++;
            int var2 = -126 / ((10 - arg0) / 51);
            class94.field1780 = class24.field470;
            class245.field4253 = class201.field3441;
            class102.field1904 = class152.field2617;
            class102.field1902 = class203.field3497;
            class105.field1952 = class228.field3829;
            class74.field1430 = class195.field3309;
            class233.field4013 = class1.field11;
            class203.field3497 = 0;
        }
        field352++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLk;)V")
    public final void method165(int arg0, byte arg1, class152 arg2) {
        while (true) {
            int var4 = arg2.method1051((byte) -39);
            if (var4 == 0) {
                if (arg1 != -42) {
                    method166(100, (class152) null);
                }
                field347++;
                return;
            }
            this.method161(arg1 ^ 0xFFFFFF29, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILk;)V")
    public static final void method166(int arg0, class152 arg1) {
        field357++;
        if (class103.field1910 != null) {
            try {
                class103.field1910.method895(0, 0L);
                class103.field1910.method884((byte) 119, arg1.field2638, arg1.field2677, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field2677 += arg0;
    }
}
