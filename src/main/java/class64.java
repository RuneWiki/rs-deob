import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class64 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field1062 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lai;")
    public static class10 field1061 = null;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lai;")
    public static class10 field1067 = class44.method278(" zuerst von Ihrer Freunde)2Liste(Q", -84);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    public static int[] field1069 = new int[4000];

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lai;")
    public static class10 field1068 = class44.method278("(U", 93);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lai;")
    public static class10 field1072 = class44.method278(":assist:", 104);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lai;")
    private static class10 field1071 = class44.method278("Error connecting to server)3", -52);

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lai;")
    public static class10 field1074 = class44.method278("mn", 97);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lai;")
    public static class10 field1070 = field1071;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lc;")
    public static class21 field1064;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[Lbf;")
    public static class17[] field1065;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lk;BZ)V")
    public static final void method419(class91 arg0, byte arg1, boolean arg2) {
        if (arg1 != 54) {
            field1062 = null;
        }
        field1060++;
        if (class20.field297 != null) {
            try {
                class20.field297.method552(-5034);
            } catch (Exception var8) {
            }
            class20.field297 = null;
        }
        class20.field297 = arg0;
        class102.method674(arg2, (byte) 126);
        class100.field1872 = null;
        class30.field468.field2170 = 0;
        class68.field1194 = 0;
        class154.field2983 = null;
        while (true) {
            class194 var3 = (class194) class170.field3287.method212((byte) 57);
            if (var3 == null) {
                while (true) {
                    class194 var4 = (class194) class97.field1792.method212((byte) 110);
                    if (var4 == null) {
                        if (class124.field2374 != 0) {
                            try {
                                class114 var5 = new class114(4);
                                var5.method781(arg1 ^ 0x36, 4);
                                var5.method781(0, class124.field2374);
                                var5.method793(109, 0);
                                class20.field297.method557(4, var5.field2160, 0, 122);
                            } catch (IOException var7) {
                                try {
                                    class20.field297.method552(-5034);
                                } catch (Exception var6) {
                                }
                                class20.field297 = null;
                                field1066++;
                            }
                        }
                        class116.field2234 = 0;
                        class99.field1820 = class80.method491(2);
                        return;
                    }
                    class42.field697.method904(arg1 - 7, var4);
                    class98.field1803.method214(var4, (byte) 117, var4.field2291);
                    class188.field3588--;
                    class101.field1900++;
                }
            }
            class176.field3374.method214(var3, (byte) 117, var3.field2291);
            class89.field1570++;
            class182.field3471--;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIBII)V")
    public static final void method420(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1076++;
        int var5 = 19 % ((arg2 + 64) / 58);
        if (class126.field2400 == 1) {
            class93.field1672[class83.field1451 / 100].method105(class21.field323 - 8, class95.field1754 - 8);
        }
        if (class126.field2400 == 2) {
            class93.field1672[class83.field1451 / 100 + 4].method105(class21.field323 - 8, class95.field1754 - 8);
        }
        class11.method75(-118);
        if (!class123.field2358) {
            return;
        }
        int var6 = arg1 + 512 - 5;
        int var7 = 16776960;
        int var8 = arg4 + 20;
        class133.field2496.method1265(class67.method440(0, new class10[] { class11.field204, class119.method846(0, class142.field2677) }), var6, var8, 16776960, -1);
        Runtime var9 = Runtime.getRuntime();
        int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
        int var11 = var8 + 15;
        if (var10 > 32768 && class126.field2406) {
            var7 = 16711680;
        }
        if (var10 > 65536 && !class126.field2406) {
            var7 = 16711680;
        }
        class133.field2496.method1265(class67.method440(0, new class10[] { class154.field2990, class119.method846(0, var10), class44.field715 }), var6, var11, var7, -1);
        var8 = var11 + 15;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method421(boolean arg0) {
        field1067 = null;
        field1071 = null;
        field1074 = null;
        field1069 = null;
        field1065 = null;
        field1062 = null;
        field1072 = null;
        field1061 = null;
        field1070 = null;
        if (arg0) {
            field1068 = null;
            field1064 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZLih;Ljava/awt/Component;)Lwg;")
    public static final class206 method422(int arg0, int arg1, boolean arg2, class81 arg3, Component arg4) {
        field1073++;
        if (class57.field1003 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (!arg2) {
                method419(null, (byte) 78, false);
            }
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class206 var5 = (class206) Class.forName("jf").getDeclaredConstructor().newInstance();
                var5.field4007 = new int[(class29.field437 ? 2 : 1) * 256];
                var5.field4031 = arg1;
                var5.method543(arg4);
                var5.field4017 = (-1024 & arg1) + 1024;
                if (var5.field4017 > 16384) {
                    var5.field4017 = 16384;
                }
                var5.method539(var5.field4017);
                if (class71.field1225 > 0 && class21.field322 == null) {
                    class21.field322 = new class26();
                    class21.field322.field392 = arg3;
                    arg3.method494(class71.field1225, class21.field322, 119);
                }
                if (class21.field322 != null) {
                    if (class21.field322.field391[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class21.field322.field391[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class105 var6 = new class105(arg3, arg0);
                    var6.field4031 = arg1;
                    var6.field4007 = new int[(class29.field437 ? 2 : 1) * 256];
                    var6.method543(arg4);
                    var6.field4017 = 16384;
                    var6.method539(var6.field4017);
                    if (class71.field1225 > 0 && class21.field322 == null) {
                        class21.field322 = new class26();
                        class21.field322.field392 = arg3;
                        arg3.method494(class71.field1225, class21.field322, 125);
                    }
                    if (class21.field322 != null) {
                        if (class21.field322.field391[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class21.field322.field391[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class206();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lc;Lph;BLc;Lc;)Z")
    public static final boolean method423(class21 arg0, class144 arg1, byte arg2, class21 arg3, class21 arg4) {
        class107.field1989 = arg0;
        if (arg2 >= -3) {
            return false;
        }
        class35.field553 = arg3;
        class101.field1887 = arg1;
        field1063++;
        class186.field3554 = arg4;
        return true;
    }
}
