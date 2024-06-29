import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class211 {

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lku;")
    private class232 field3204 = new class232(128);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lb;")
    private class201 field3196;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[[S")
    public static short[][] field3200 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lo;")
    public static class24 field3203 = new class24("LOCAL", 4);

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3205 = 205;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Ldk;")
    public static class326 field3206 = new class326(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field3200 = null;
        field3206 = null;
        field3203 = null;
        if (arg0 != -24) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    public static final void method1368(byte arg0, int arg1) {
        field3199++;
        if (class363.field5227 == arg1) {
            return;
        }
        if (class363.field5227 == 0) {
            class75.method441(-122);
        }
        if (arg1 == 40) {
            class462.method2704(-93);
        }
        if (arg1 != 40 && class317.field4601 != null) {
            class317.field4601.method2118(1);
            class317.field4601 = null;
        }
        if (class363.field5227 == 25 || class363.field5227 == 28) {
            class66.field842.field2925 = 2;
            class306.field4359.field2925 = 2;
            class360.field5187.field2925 = 2;
            class227.field3434.field2925 = 2;
            class359.field5162.field2925 = 2;
            class184.field2717.field2925 = 2;
            class410.field5758.field2925 = 2;
        }
        if (arg0 >= -23) {
            field3206 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class132.field1745 = 0;
            class39.field516 = 0;
            class125.field1636 = 0;
            class222.field3378 = 1;
            class64.field833 = 1;
            class363.method2247((byte) 68, true);
            class66.field842.field2925 = 1;
            class306.field4359.field2925 = 1;
            class360.field5187.field2925 = 1;
            class227.field3434.field2925 = 1;
            class359.field5162.field2925 = 1;
            class184.field2717.field2925 = 1;
            class410.field5758.field2925 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class114.method723((byte) 113);
        }
        if (arg1 == 5) {
            class66.method403((byte) -38, class407.field5716, class141.field1878);
        } else {
            class304.method1884(-16357);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class363.field5227 == 5 || class363.field5227 == 10 || class363.field5227 == 28;
        if (var2 != var3) {
            if (var2) {
                class268.field3923 = class326.field4699;
                if (class314.field4438.field5794 == 0) {
                    class482.method2819(2, 0);
                } else {
                    class490.method2869(class326.field4699, 2, class360.field5189, false, 0, (byte) 80, class314.field4438.field5794);
                }
                class289.field4210.method353(false, (byte) 127);
            } else {
                class482.method2819(2, 0);
                class289.field4210.method353(true, (byte) 122);
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class141.field1878.method681();
        }
        class363.field5227 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public final void method1369(int arg0, int arg1) {
        if (arg1 != -21821) {
            this.method1372(-80);
        }
        field3202++;
        class232 var3 = this.field3204;
        synchronized (this.field3204) {
            this.field3204.method1486(438127120, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public final void method1370(byte arg0) {
        field3195++;
        class232 var2 = this.field3204;
        synchronized (this.field3204) {
            if (arg0 >= -28) {
                this.field3196 = null;
            }
            this.field3204.method1478((byte) -111);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)Llk;")
    public final class382 method1371(int arg0, int arg1) {
        field3201++;
        if (arg1 <= 16) {
            field3205 = -9;
        }
        class232 var3 = this.field3204;
        class382 var4;
        synchronized (this.field3204) {
            var4 = (class382) this.field3204.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3196.method1257(arg0, 1, 24558);
        class382 var6 = new class382();
        if (var5 != null) {
            var6.method2303(new class276(var5), 2828);
        }
        class232 var7 = this.field3204;
        synchronized (this.field3204) {
            this.field3204.method1473(var6, (long) arg0, 126);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public final void method1372(int arg0) {
        class232 var2 = this.field3204;
        synchronized (this.field3204) {
            this.field3204.method1475(0);
        }
        if (arg0 >= 62) {
            field3198++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1373(boolean arg0, char arg1) {
        field3197++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class410.method2426(48, arg1)) {
            return true;
        } else {
            char[] var2 = class345.field5018;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class74.field912;
            int var5 = 0;
            if (arg0) {
                return false;
            }
            while (var5 < var4.length) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
                var5++;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class211(class353 arg0, int arg1, class201 arg2) {
        this.field3196 = arg2;
        this.field3196.method1235(0, 1);
    }
}
