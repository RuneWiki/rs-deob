import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class138 extends class280 {

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field2353;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Loh;")
    public static class258 field2357 = class153.method1046("scrollen:", 106);

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Loh;")
    public static class258 field2360 = class153.method1046(" zuerst von Ihrer Ignorieren)2Liste(Q", 108);

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field2355 = 0;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Loh;")
    private static class258 field2363 = class153.method1046("shake:", 97);

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Loh;")
    public static class258 field2359 = field2363;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Loh;")
    public static class258 field2352 = field2363;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lkk;")
    public static class112 field2354;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 14)
    public static final void method957(int arg0) {
        field2358++;
        if (class123.field2183 != null || class206.field3558 != null) {
            return;
        }
        int var1 = class123.field2184;
        if (class252.field4342) {
            if (var1 != 1) {
                int var2 = class194.field3423;
                int var3 = class226.field3882;
                if (var2 < class218.field3766 - 10 || class218.field3766 + class84.field1414 + 10 < var2 || (class201.field3490 - 10) > var3 || class201.field3490 + class224.field3845 + 10 < var3) {
                    class252.field4342 = false;
                    class93.method691(-128, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
                }
            }
            if (var1 == 1) {
                int var4 = class218.field3766;
                int var5 = class201.field3490;
                int var6 = class84.field1414;
                int var7 = class219.field3791;
                int var8 = class173.field3103;
                int var9 = -1;
                for (int var10 = 0; var10 < class69.field1195; var10++) {
                    int var11 = (class69.field1195 - var10 - 1) * 15 + (var5 + 31);
                    if (var4 < var7 && var7 < var4 + var6 && (var11 - 13) < var8 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class272.method1924(var9, 1);
                }
                class252.field4342 = false;
                class93.method691(-128, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
            }
        } else {
            if (var1 == 1 && class69.field1195 > 0) {
                short var12 = class227.field3910[class69.field1195 - 1];
                if (var12 == 11 || var12 == 29 || var12 == 57 || var12 == 12 || var12 == 50 || var12 == 30 || var12 == 25 || var12 == 49 || var12 == 8 || var12 == 44 || var12 == 31 || var12 == 1006) {
                    int var13 = class225.field3863[class69.field1195 - 1];
                    int var14 = class70.field1219[class69.field1195 - 1];
                    class171 var15 = class263.method1844(var14, (byte) -70);
                    if (class213.method1439((byte) -123, client.method354(var15)) || class146.method1011(123, client.method354(var15))) {
                        class215.field3736 = 0;
                        class272.field4737 = false;
                        if (class123.field2183 != null) {
                            class165.method1099((byte) 125, class123.field2183);
                        }
                        class123.field2183 = class263.method1844(var14, (byte) -70);
                        class206.field3560 = class173.field3103;
                        class197.field3451 = class219.field3791;
                        class14.field184 = var13;
                        class165.method1099((byte) 127, class123.field2183);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class122.field2159 == 1 && class69.field1195 > 2 || class164.method1097(class69.field1195 - 1, arg0 ^ 0x348E))) {
                var1 = 2;
            }
            if (var1 == 2 && class69.field1195 > 0 || class147.field2501 == 1) {
                class11.method74(0);
            }
            if (var1 == 1 && class69.field1195 > 0 || class147.field2501 == 2) {
                class251.method1699(9361);
            }
        }
        if (arg0 != 13509) {
            method959(false);
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 145)
    public final Object method958(byte arg0) {
        field2351++;
        int var2 = -83 / ((28 - arg0) / 63);
        return this.field2353;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 159)
    public class138(Object arg0) {
        this.field2353 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)V", line = 168)
    public static final void method959(boolean arg0) {
        field2361++;
        if (class170.field2901 != -1) {
            class84.method609(class170.field2901, (byte) 102);
        }
        for (int var1 = 0; var1 < class312.field5298; var1++) {
            if (class238.field4151[var1]) {
                class74.field1292[var1] = true;
            }
            class201.field3479[var1] = class238.field4151[var1];
            class238.field4151[var1] = false;
        }
        if (!arg0) {
            return;
        }
        class224.field3843 = null;
        class207.field3568 = class202.field3498;
        class55.field866 = -1;
        class8.field105 = -1;
        if (class257.field4390) {
            class217.field3746 = true;
        }
        if (class170.field2901 != -1) {
            class312.field5298 = 0;
            class75.method550(-1, class42.field577, false, class218.field3773, class170.field2901, 0, 0, 0, 0);
        }
        if (class257.field4390) {
            class296.method2088();
        } else {
            class211.method1415();
        }
        class251.field4329 = 0;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(B)Z", line = 239)
    public final boolean method960(byte arg0) {
        field2362++;
        return arg0 <= 75 ? false : false;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 250)
    public static void method961(int arg0) {
        if (arg0 != -4317) {
            field2363 = (class258) null;
        }
        field2357 = null;
        field2359 = null;
        field2352 = null;
        field2360 = null;
        field2354 = null;
        field2363 = null;
    }
}
