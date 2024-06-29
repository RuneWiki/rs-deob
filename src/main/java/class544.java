import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class544 {

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "[Lmca;")
    public static class29[] field7971 = new class29[0];

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "Lvj;")
    public static class373 field7966 = new class373(16, -2);

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
    public static int[] field7973 = new int[13];

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lvj;")
    public static class373 field7972 = new class373(52, -2);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "J")
    public long field7967;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Lwda;")
    public class544 field7964;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Lwda;")
    public class544 field7965;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7969;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)V")
    public static final void method3183(int arg0, int arg1) {
        field7968++;
        if (arg0 != 1) {
            method3186(-111, 62, -76);
        }
        if (!class640.method3678(false, arg1)) {
            return;
        }
        class509[] var2 = class459.field6326[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class509 var4 = var2[var3];
            if (var4 != null) {
                var4.field7084 = 0;
                var4.field7063 = 1;
                var4.field7047 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)[Lbv;")
    public static final class255[] method3184(byte arg0) {
        field7970++;
        if (arg0 <= 94) {
            method3184((byte) -5);
        }
        return new class255[] { class368.field4837, class368.field4842, class368.field4844, class368.field4845, class368.field4846, class368.field4847, class368.field4848, class368.field4849, class368.field4850, class368.field4851, class368.field4852, class368.field4853, class368.field4854, class368.field4855 };
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method3185(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class341.field4394++;
        class595.field8631 = 0;
        for (int var6 = class76.field881; var6 < client.field3216; var6++) {
            class349[][] var17 = class383.field5070[var6];
            for (int var18 = class391.field5184; var18 < class341.field4393; var18++) {
                for (int var19 = class325.field4157; var19 < class163.field1995; var19++) {
                    class349 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class201.field2419[var18 + class244.field3140 - class144.field1735][var19 + class244.field3140 - class222.field2728] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4505 = true;
                            var20.field4500 = true;
                            if (var20.field4499 == null) {
                                var20.field4491 = false;
                            } else {
                                var20.field4491 = true;
                            }
                            class595.field8631++;
                        } else {
                            var20.field4505 = false;
                            var20.field4500 = false;
                            var20.field4502 = 0;
                            if (var18 >= class144.field1735 - 16 && var18 <= class144.field1735 + 16 && var19 >= class222.field2728 - 16 && var19 <= class222.field2728 + 16 && (var20.field4496 != null || var20.field4497 != null || var20.field4507 != null || var20.field4498 != null || var20.field4506 != null || var20.field4499 != null)) {
                                class367.field4820.method1331(var20, (byte) -63);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class370.field4884 == class128.field1574;
        for (int var8 = class76.field881; var8 < client.field3216; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class638.field9190.method271() && var8 >= arg2 && arg1 != null) {
                int var10 = class201.field2419.length;
                if (class201.field2419.length + class391.field5184 > class238.field2985) {
                    var10 -= class201.field2419.length + class391.field5184 - class238.field2985;
                }
                int var11 = class201.field2419[0].length;
                if (class201.field2419[0].length + class325.field4157 > class548.field8061) {
                    var11 -= class201.field2419[0].length + class325.field4157 - class548.field8061;
                }
                int var12 = class191.field2304;
                while (true) {
                    if (var12 >= var10) {
                        class367.field4820.method1330(class128.field1574[var8], var8, 15547, true, var9);
                        break;
                    }
                    int var13 = class391.field5184 + var12 - class191.field2304;
                    for (int var14 = class110.field1356; var14 < var11; var14++) {
                        class78.field918[var12][var14] = false;
                        if (class201.field2419[var12][var14]) {
                            int var15 = class325.field4157 + var14 - class110.field1356;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class383.field5070[var16][var13][var15] != null && class383.field5070[var16][var13][var15].field4495 == var8) {
                                    class78.field918[var12][var14] = class383.field5070[var16][var13][var15].field4505;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class367.field4820.method1330(class128.field1574[var8], var8, 15547, false, var9);
            }
            class367.field4820.method1323((byte) 113);
        }
        if (!class476.method2778(true)) {
            class476.method2778(false);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)Z")
    public static final boolean method3186(int arg0, int arg1, int arg2) {
        int var3 = class297.field3815[arg0][arg1][arg2];
        if (-class341.field4394 == var3) {
            return false;
        } else if (class341.field4394 == var3) {
            return true;
        } else {
            int var4 = arg1 << class362.field4756;
            int var5 = arg2 << class362.field4756;
            if (class497.method2868(var4 + 1, class128.field1574[arg0].method855(arg1, arg2), var5 + 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1 + 1, arg2), var5 + 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1 + 1, arg2 + 1), class79.field929 + var5 - 1) && class497.method2868(var4 + 1, class128.field1574[arg0].method855(arg1, arg2 + 1), class79.field929 + var5 - 1) && class497.method2868(class410.field5342 + var4, class128.field1574[arg0].method855(arg1, arg2), var5 + 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1 + 1, arg2), class410.field5342 + var5) && class497.method2868(class410.field5342 + var4, class128.field1574[arg0].method855(arg1, arg2 + 1), class79.field929 + var5 - 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1, arg2), class410.field5342 + var5) && class497.method2868(class410.field5342 + var4, class128.field1574[arg0].method855(arg1, arg2), class410.field5342 + var5)) {
                class297.field3815[arg0][arg1][arg2] = class341.field4394;
                return true;
            } else {
                class297.field3815[arg0][arg1][arg2] = -class341.field4394;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V")
    public final void method3187(boolean arg0) {
        field7974++;
        if (this.field7965 == null) {
            return;
        }
        this.field7965.field7964 = this.field7964;
        this.field7964.field7965 = this.field7965;
        this.field7964 = null;
        this.field7965 = null;
        if (!arg0) {
            field7971 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)V")
    public static void method3188(int arg0) {
        field7973 = null;
        field7971 = null;
        field7972 = null;
        field7966 = null;
        if (arg0 == -29311) {
            field7969 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)Z")
    public final boolean method3189(int arg0) {
        field7963++;
        if (arg0 != -9613) {
            this.method3189(-77);
        }
        return this.field7965 != null;
    }
}
