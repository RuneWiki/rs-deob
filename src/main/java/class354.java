import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class354 extends class98 {

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public int field5641 = -1;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public int field5646 = 0;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field5639 = -1;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public int field5648 = 0;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Z")
    public boolean field5649 = true;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public int field5655 = 12800;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public int field5647 = 12800;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Ljava/lang/String;")
    public String field5651;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public int field5635;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Ljava/lang/String;")
    public String field5645;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Lor;")
    public class594 field5650;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Lhga;")
    public static class158 field5636 = new class158(23, 3);

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "Z")
    public static boolean field5656 = false;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lrl;")
    public static class672 field5657 = new class672(71, 0);

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lac;")
    public static class501 field5658 = new class501("WTQA", 2);

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[II)Z")
    public final boolean method2375(int arg0, int arg1, int[] arg2, int arg3) {
        field5642++;
        if (arg1 <= 106) {
            this.field5649 = true;
        }
        for (class584 var5 = (class584) this.field5650.method3465((byte) 111); var5 != null; var5 = (class584) this.field5650.method3469(0)) {
            if (var5.method3420(arg3, arg0, -80)) {
                var5.method3426(arg3, arg0, arg2, -79);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method2376(int arg0) {
        if (arg0 > -90) {
            return;
        }
        if (class257.field4073 != null) {
            for (int var1 = 0; var1 < class669.field9454; var1++) {
                class257.field4073[var1] = null;
            }
            class257.field4073 = null;
        }
        field5640++;
        if (class48.field647 != null) {
            for (int var2 = 0; var2 < class288.field4579; var2++) {
                class48.field647[var2] = null;
            }
            class48.field647 = null;
        }
        if (class678.field9535 != null) {
            for (int var3 = 0; var3 < class102.field1684; var3++) {
                class678.field9535[var3] = null;
            }
            class678.field9535 = null;
        }
        class331.field5131 = null;
        class570.field8156 = -1;
        class245.field3908 = -1;
        class239.field3788 = null;
        class97.field1577 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IIII)Z")
    public final boolean method2377(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field5643++;
        for (class584 var6 = (class584) this.field5650.method3465((byte) 124); var6 != null; var6 = (class584) this.field5650.method3469(0)) {
            if (var6.method3419(arg0, arg2, arg4, -26977)) {
                var6.method3423(arg2, arg3 ^ 0xFFFFCD8C, arg1, arg0);
                return true;
            }
        }
        if (arg3 != 12800) {
            this.field5648 = -24;
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    public final void method2378(byte arg0) {
        this.field5648 = 0;
        field5654++;
        int var2 = 88 / ((arg0 - 55) / 53);
        this.field5646 = 0;
        this.field5655 = 12800;
        this.field5647 = 12800;
        for (class584 var3 = (class584) this.field5650.method3465((byte) -58); var3 != null; var3 = (class584) this.field5650.method3469(0)) {
            if (var3.field8303 > this.field5648) {
                this.field5648 = var3.field8303;
            }
            if (this.field5655 > var3.field8307) {
                this.field5655 = var3.field8307;
            }
            if (var3.field8300 < this.field5647) {
                this.field5647 = var3.field8300;
            }
            if (var3.field8314 > this.field5646) {
                this.field5646 = var3.field8314;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2379(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method2378((byte) -87);
        }
        field5638++;
        for (class584 var4 = (class584) this.field5650.method3465((byte) 111); var4 != null; var4 = (class584) this.field5650.method3469(0)) {
            if (var4.method3421((byte) 57, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static final void method2380(int arg0) {
        field5652++;
        if (arg0 <= 33) {
            field5653 = 78;
        }
        class413 var1 = class674.method3852(15, 0, 127);
        var1.method2634(1065768928);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZII[I)Z")
    public final boolean method2381(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (!arg0) {
            return true;
        }
        field5637++;
        for (class584 var5 = (class584) this.field5650.method3465((byte) 107); var5 != null; var5 = (class584) this.field5650.method3469(0)) {
            if (var5.method3421((byte) 57, arg2, arg1)) {
                var5.method3423(arg1, -55, arg3, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V")
    public static void method2382(byte arg0) {
        field5658 = null;
        field5636 = null;
        field5657 = null;
        if (arg0 != -111) {
            field5653 = -29;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class354(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5639 = arg4;
        this.field5644 = arg3;
        this.field5641 = arg6;
        this.field5651 = arg1;
        this.field5649 = arg5;
        this.field5635 = arg0;
        this.field5645 = arg2;
        if (this.field5641 == 255) {
            this.field5641 = 0;
        }
        this.field5650 = new class594();
    }
}
