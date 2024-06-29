import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lbc;")
    public static class10 field1356 = new class10(4096);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lwb;")
    public static class130 field1360 = class26.method212("Icons redrawn", -32376);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static volatile int field1358 = 0;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1364 = -1;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lwb;")
    public static class130 field1361 = class26.method212("k", -32376);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1366 = 0;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1367 = -1;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lge;")
    public static class41 field1362 = new class41(50);

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
    public static int[] field1370 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1368 = -1;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lwb;")
    public static class130 field1371 = class26.method212("chatback", -32376);

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lwb;")
    public static class130 field1372 = class26.method212("@yel@*V", -32376);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lqd;")
    public static class100 field1357;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lqd;")
    public static class100 field1369;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lda;")
    public static class20 field1365;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Lqd;")
    public static class100[] field1363;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method446(int arg0, byte arg1) {
        field1355++;
        if (class45.field1211[arg0]) {
            return true;
        } else if (class22.field645.method499(122, arg0)) {
            int var2 = class22.field645.method511(3, arg0);
            if (arg1 > -74) {
                field1356 = null;
            }
            if (var2 == 0) {
                class45.field1211[arg0] = true;
                return true;
            }
            if (class105.field2549[arg0] == null) {
                class105.field2549[arg0] = new class3[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class105.field2549[arg0][var3] == null) {
                    byte[] var4 = class22.field645.method508(var3, 0, arg0);
                    if (var4 != null) {
                        class105.field2549[arg0][var3] = new class3();
                        class105.field2549[arg0][var3].method17(-68, new class36(var4));
                    }
                }
            }
            class45.field1211[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 60)
    public static void method447(int arg0) {
        if (arg0 != 0) {
            field1362 = null;
        }
        field1361 = null;
        field1362 = null;
        field1356 = null;
        field1371 = null;
        field1363 = null;
        field1365 = null;
        field1357 = null;
        field1360 = null;
        field1369 = null;
        field1372 = null;
        field1370 = null;
    }
}
