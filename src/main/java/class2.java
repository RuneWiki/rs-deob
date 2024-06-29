import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class2 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lid;")
    private static class149 field25 = class60.method382("Connected to update server", (byte) 11);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lid;")
    public static class149 field27 = class60.method382("Attaquer", (byte) 31);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lid;")
    public static class149 field30 = field25;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lid;")
    public static class149 field36 = class60.method382("<col=ffffff>", (byte) 83);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lid;")
    public static class149 field33 = class60.method382("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", (byte) 121);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lca;")
    public static class263 field23;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field24++;
        for (int var1 = 0; var1 < 5; var1++) {
            class201.field3650[var1] = false;
        }
        class284.field5016 = 0;
        class194.field3468 = 1;
        class151.field2751 = -1;
        class196.field3512 = 0;
        class10.field148 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[B")
    public abstract byte[] method7(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
    public abstract void method8(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Ldb;")
    public abstract class17 method9(int arg0);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I")
    public abstract int method10(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static void method11(int arg0) {
        field27 = null;
        if (arg0 != 1) {
            field33 = null;
        }
        field23 = null;
        field33 = null;
        field30 = null;
        field25 = null;
        field36 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lvc;")
    public static final class190 method12(byte arg0) {
        field34++;
        int var1 = class55.field991[0] * class283.field5005[0];
        byte[] var2 = class73.field1276[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class108.field1865[class136.method953(255, var2[var4])];
        }
        if (arg0 != 57) {
            method12((byte) 106);
        }
        class46 var5 = new class46(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], class55.field991[0], var3);
        class103.method731(false);
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLob;)V")
    public static final void method13(byte arg0, class131 arg1) {
        field28++;
        arg1.field2313 = false;
        if (arg1.field2334 != -1) {
            class164 var2 = class69.method436(arg1.field2334, -32);
            if (var2 == null || var2.field3035 == null) {
                arg1.field2334 = -1;
            } else {
                arg1.field2331++;
                if (arg1.field2372 < var2.field3035.length && arg1.field2331 > var2.field3060[arg1.field2372]) {
                    arg1.field2372++;
                    arg1.field2331 = 1;
                    arg1.field2336++;
                    class94.method686(var2, arg1.field2340, -115, arg1.field2347, class77.field1449 == arg1, arg1.field2372);
                }
                if (var2.field3035.length <= arg1.field2372) {
                    arg1.field2372 = 0;
                    arg1.field2331 = 0;
                    class94.method686(var2, arg1.field2340, -109, arg1.field2347, class77.field1449 == arg1, arg1.field2372);
                }
                arg1.field2336 = arg1.field2372 + 1;
                if (arg1.field2336 >= var2.field3035.length) {
                    arg1.field2336 = 0;
                }
            }
        }
        if (arg1.field2353 != -1 && class118.field2022 >= arg1.field2315) {
            int var3 = class200.method1374(-17177, arg1.field2353).field5130;
            if (var3 == -1) {
                arg1.field2353 = -1;
            } else {
                class164 var4 = class69.method436(var3, arg0 ^ 0xFFFFFF9C);
                if (var4 == null || var4.field3035 == null) {
                    arg1.field2353 = -1;
                } else {
                    if (arg1.field2359 < 0) {
                        arg1.field2359 = 0;
                        class94.method686(var4, arg1.field2340, -126, arg1.field2347, class77.field1449 == arg1, 0);
                    }
                    arg1.field2326++;
                    if (arg1.field2359 < var4.field3035.length && arg1.field2326 > var4.field3060[arg1.field2359]) {
                        arg1.field2326 = 1;
                        arg1.field2359++;
                        class94.method686(var4, arg1.field2340, -126, arg1.field2347, class77.field1449 == arg1, arg1.field2359);
                    }
                    if (var4.field3035.length <= arg1.field2359) {
                        arg1.field2353 = -1;
                    }
                    arg1.field2394 = arg1.field2359 + 1;
                    if (arg1.field2394 >= var4.field3035.length) {
                        arg1.field2394 = -1;
                    }
                }
            }
        }
        if (arg1.field2349 != -1 && arg1.field2406 <= 1) {
            class164 var5 = class69.method436(arg1.field2349, -32);
            if (var5.field3043 == 1 && arg1.field2341 > 0 && class118.field2022 >= arg1.field2328 && arg1.field2348 < class118.field2022) {
                arg1.field2406 = 1;
                return;
            }
        }
        if (arg1.field2349 != -1 && arg1.field2406 == 0) {
            class164 var6 = class69.method436(arg1.field2349, -32);
            if (var6 == null || var6.field3035 == null) {
                arg1.field2349 = -1;
            } else {
                arg1.field2355++;
                if (var6.field3035.length > arg1.field2397 && var6.field3060[arg1.field2397] < arg1.field2355) {
                    arg1.field2355 = 1;
                    arg1.field2397++;
                    class94.method686(var6, arg1.field2340, -122, arg1.field2347, class77.field1449 == arg1, arg1.field2397);
                }
                if (arg1.field2397 >= var6.field3035.length) {
                    arg1.field2397 -= var6.field3061;
                    arg1.field2405++;
                    if (var6.field3029 <= arg1.field2405) {
                        arg1.field2349 = -1;
                    } else if (arg1.field2397 >= 0 && arg1.field2397 < var6.field3035.length) {
                        class94.method686(var6, arg1.field2340, -114, arg1.field2347, class77.field1449 == arg1, arg1.field2397);
                    } else {
                        arg1.field2349 = -1;
                    }
                }
                arg1.field2318 = arg1.field2397 + 1;
                if (var6.field3035.length <= arg1.field2318) {
                    arg1.field2318 -= var6.field3061;
                    if (var6.field3029 <= arg1.field2405 + 1) {
                        arg1.field2318 = -1;
                    } else if (arg1.field2318 < 0 || arg1.field2318 >= var6.field3035.length) {
                        arg1.field2318 = -1;
                    }
                }
                arg1.field2313 = var6.field3059;
            }
        }
        if (arg1.field2406 > 0) {
            arg1.field2406--;
        }
        for (int var7 = 0; var7 < arg1.field2363.length; var7++) {
            class242 var8 = arg1.field2363[var7];
            if (var8 != null) {
                if (var8.field4255 > 0) {
                    var8.field4255--;
                } else {
                    class164 var9 = class69.method436(var8.field4254, -32);
                    if (var9 == null || var9.field3035 == null) {
                        arg1.field2363[var7] = null;
                    } else {
                        var8.field4253++;
                        if (var8.field4263 < var9.field3035.length && var9.field3060[var8.field4263] < var8.field4253) {
                            var8.field4253 = 1;
                            var8.field4263++;
                            class94.method686(var9, arg1.field2340, arg0 - 243, arg1.field2347, class77.field1449 == arg1, var8.field4263);
                        }
                        if (var9.field3035.length <= var8.field4263) {
                            var8.field4263 -= var9.field3061;
                            var8.field4259++;
                            if (var8.field4259 >= var9.field3029) {
                                arg1.field2363[var7] = null;
                            } else if (var8.field4263 >= 0 && var8.field4263 < var9.field3035.length) {
                                class94.method686(var9, arg1.field2340, arg0 ^ 0xFFFFFFFD, arg1.field2347, class77.field1449 == arg1, var8.field4263);
                            } else {
                                arg1.field2363[var7] = null;
                            }
                        }
                        var8.field4250 = var8.field4263 + 1;
                        if (var9.field3035.length <= var8.field4250) {
                            var8.field4250 -= var9.field3061;
                            if (var9.field3029 <= (var8.field4259 + 1)) {
                                var8.field4250 = -1;
                            } else if (var8.field4250 < 0 || var8.field4250 >= var9.field3035.length) {
                                var8.field4250 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 124) {
            method13((byte) 67, (class131) null);
        }
    }
}
