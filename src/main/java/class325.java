import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class325 extends class108 {

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field4460 = -1;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Lim;")
    public static class353 field4467 = new class353(47, 6);

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lju;")
    public class213 field4464;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lti;")
    public class300 field4468;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lmj;")
    public class315 field4462;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lub;")
    public class369 field4455;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method2010(int arg0) {
        this.field4464 = null;
        if (arg0 != 47) {
            this.method2010(-11);
        }
        this.field4455 = null;
        this.field4462 = null;
        this.field4468 = null;
        field4461++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method2011(int arg0) {
        if (arg0 == 23029) {
            field4467 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2012(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class642.field9327++;
        class310.field3972 = 0;
        for (int var6 = class555.field7766; var6 < class183.field2341; var6++) {
            class563[][] var15 = class199.field2605[var6];
            for (int var16 = class389.field5401; var16 < class145.field1893; var16++) {
                for (int var17 = class445.field6164; var17 < class244.field3085; var17++) {
                    class563 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class634.field9230[var16 + class257.field3199 - class155.field2012][var17 + class257.field3199 - class151.field1995] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field7890 = true;
                            var18.field7897 = true;
                            if (var18.field7894 == null) {
                                var18.field7902 = false;
                            } else {
                                var18.field7902 = true;
                            }
                            class310.field3972++;
                        } else {
                            var18.field7890 = false;
                            var18.field7897 = false;
                            var18.field7888 = 0;
                            if (var16 >= class155.field2012 - 16 && var16 <= class155.field2012 + 16 && var17 >= class151.field1995 - 16 && var17 <= class151.field1995 + 16 && (var18.field7896 != null || var18.field7884 != null || var18.field7885 != null || var18.field7889 != null || var18.field7891 != null || var18.field7894 != null)) {
                                class171.field2196.method767(var18, (byte) 118);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class555.field7766; var7 < class183.field2341; var7++) {
            if (class583.field8427.method195() && var7 >= arg2 && arg1 != null) {
                int var8 = class634.field9230.length;
                if (class634.field9230.length + class389.field5401 > class260.field3211) {
                    var8 -= class634.field9230.length + class389.field5401 - class260.field3211;
                }
                int var9 = class634.field9230[0].length;
                if (class634.field9230[0].length + class445.field6164 > class541.field7566) {
                    var9 -= class634.field9230[0].length + class445.field6164 - class541.field7566;
                }
                int var10 = class601.field8700;
                while (true) {
                    if (var10 >= var8) {
                        class171.field2196.method763(true, var7, 13518, class501.field6947[var7]);
                        break;
                    }
                    int var11 = class389.field5401 + var10 - class601.field8700;
                    for (int var12 = class415.field5709; var12 < var9; var12++) {
                        class144.field1879[var10][var12] = false;
                        if (class634.field9230[var10][var12]) {
                            int var13 = class445.field6164 + var12 - class415.field5709;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class199.field2605[var14][var11][var13] != null && class199.field2605[var14][var11][var13].field7886 == var7) {
                                    class144.field1879[var10][var12] = class199.field2605[var14][var11][var13].field7890;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class171.field2196.method763(false, var7, 13518, class501.field6947[var7]);
            }
            class171.field2196.method755((byte) -115);
        }
        if (!class438.method2550(true)) {
            class438.method2550(false);
        }
    }
}
