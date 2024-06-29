import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lwg;")
    public volatile class206[] field391 = new class206[2];

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    public volatile boolean field393 = false;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Z")
    public volatile boolean field388 = false;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lih;")
    public class81 field392;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
    public static final boolean method170(int arg0, int arg1) {
        field394++;
        if (arg1 == -25796) {
            return (arg0 >> 28 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "run", descriptor = "()V")
    public final void run() {
        this.field388 = true;
        field389++;
        try {
            while (!this.field393) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class206 var2 = this.field391[var1];
                    if (var2 != null) {
                        var2.method1329(16128);
                    }
                }
                class172.method1130(10L, (byte) -79);
                class89.method549(null, false, this.field392);
            }
        } catch (Exception var9) {
            class109.method700(var9, null, (byte) -110);
        } finally {
            Object var6 = null;
            this.field388 = false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILdh;I)V")
    public static final void method171(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        field390++;
        if (class145.field2767 == arg3 || class53.field946 >= 400) {
            return;
        }
        if (arg2 <= 31) {
            method170(96, -41);
        }
        class10 var5;
        if (arg3.field617 == 0) {
            var5 = class67.method440(0, new class10[] { arg3.field602, class200.method1292(class145.field2767.field594, (byte) 122, arg3.field594), class45.field735, class155.field3006, class119.method846(0, arg3.field594), class117.field2268 });
        } else {
            var5 = class67.method440(0, new class10[] { arg3.field602, class45.field735, class163.field3121, class119.method846(0, arg3.field617), class117.field2268 });
        }
        if (class135.field2539 == 1) {
            class135.field2535++;
            class107.method692(class67.method440(0, new class10[] { class141.field2660, class165.field3168, var5 }), 1, arg4, arg0, arg1, class34.field528, -126);
        } else if (!class32.field482) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class55.field985[var6] != null) {
                    class25.field380++;
                    short var7 = 0;
                    boolean var8 = false;
                    if (class55.field985[var6].method70((byte) 126, class180.field3446)) {
                        if (class145.field2767.field594 < arg3.field594) {
                            var7 = 2000;
                        }
                        if (class145.field2767.field599 != 0 && arg3.field599 != 0) {
                            if (class145.field2767.field599 == arg3.field599) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class140.field2642[var6]) {
                        var7 = 2000;
                    }
                    int var9 = class171.field3300[var6] + var7;
                    class107.method692(class67.method440(0, new class10[] { class74.field1265, var5 }), var9, arg4, arg0, arg1, class55.field985[var6], -126);
                }
            }
        } else if ((class49.field871 & 0x8) == 8) {
            class107.method692(class67.method440(0, new class10[] { class33.field501, class165.field3168, var5 }), 39, arg4, arg0, arg1, class3.field30, -121);
            class82.field1436++;
        }
        for (int var10 = 0; var10 < class53.field946; var10++) {
            if (class75.field1308[var10] == 35) {
                class148.field2845[var10] = class67.method440(0, new class10[] { class74.field1265, var5 });
                return;
            }
        }
    }
}
