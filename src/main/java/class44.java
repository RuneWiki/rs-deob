import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OPHZBIVR")
public class class44 {

    @OriginalMember(owner = "client!OPHZBIVR", name = "e", descriptor = "I")
    public int field1272 = -1;

    @OriginalMember(owner = "client!OPHZBIVR", name = "g", descriptor = "[I")
    public int[] field1274 = new int[6];

    @OriginalMember(owner = "client!OPHZBIVR", name = "h", descriptor = "[I")
    public int[] field1275 = new int[6];

    @OriginalMember(owner = "client!OPHZBIVR", name = "i", descriptor = "I")
    public int field1276 = 128;

    @OriginalMember(owner = "client!OPHZBIVR", name = "j", descriptor = "I")
    public int field1277 = 128;

    @OriginalMember(owner = "client!OPHZBIVR", name = "n", descriptor = "LNVDACYAH;")
    public static class40 field1281 = new class40(false, 30);

    @OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!OPHZBIVR", name = "c", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!OPHZBIVR", name = "d", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!OPHZBIVR", name = "k", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!OPHZBIVR", name = "l", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!OPHZBIVR", name = "m", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!OPHZBIVR", name = "f", descriptor = "LQBINVEVU;")
    public class47 field1273;

    @OriginalMember(owner = "client!OPHZBIVR", name = "b", descriptor = "[LOPHZBIVR;")
    public static class44[] field1269;

    @OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method433(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("spotanim.dat", null), -670);
        if (arg1 != 24570) {
            return;
        }
        field1268 = var2.method388();
        if (field1269 == null) {
            field1269 = new class44[field1268];
        }
        for (int var3 = 0; var3 < field1268; var3++) {
            if (field1269[var3] == null) {
                field1269[var3] = new class44();
            }
            field1269[var3].field1270 = var3;
            field1269[var3].method434(var2, 0);
        }
    }

    @OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public void method434(class37 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method386();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1271 = arg0.method388();
                } else if (var3 == 2) {
                    this.field1272 = arg0.method388();
                    if (class47.field1336 != null) {
                        this.field1273 = class47.field1336[this.field1272];
                    }
                } else if (var3 == 4) {
                    this.field1276 = arg0.method388();
                } else if (var3 == 5) {
                    this.field1277 = arg0.method388();
                } else if (var3 == 6) {
                    this.field1278 = arg0.method388();
                } else if (var3 == 7) {
                    this.field1279 = arg0.method386();
                } else if (var3 == 8) {
                    this.field1280 = arg0.method386();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1274[var3 - 40] = arg0.method388();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1275[var3 - 50] = arg0.method388();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "()LIRLTEWJP;")
    public class26 method435() {
        class26 var1 = (class26) field1281.method427((long) this.field1270);
        if (var1 != null) {
            return var1;
        }
        class26 var2 = class26.method281(this.field1271);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1274[0] != 0) {
                var2.method295(this.field1274[var3], this.field1275[var3]);
            }
        }
        field1281.method428((long) this.field1270, (byte) 81, var2);
        return var2;
    }
}
