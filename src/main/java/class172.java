import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class172 extends class142 {

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field2891;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "Le;")
    public static class191 field2887 = class54.method368("welle:", 2047);

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "Le;")
    public static class191 field2893 = class54.method368("", 2047);

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "Le;")
    private static class191 field2890 = class54.method368("Loading interfaces )2 ", 2047);

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "Le;")
    public static class191 field2888 = class54.method368("unzap", 2047);

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "Le;")
    public static class191 field2897 = field2890;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method1155(boolean arg0) {
        if (arg0) {
            return;
        }
        try {
            if (class28.field404 == null) {
                class28.field404 = new class19(class167.field2820, class228.method1629(new class191[] { class146.method982(-1), class253.field4482 }, (byte) -66).method1328(-7598));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class28.field404 = null;
        }
        field2892++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1156(Random arg0, int arg1, int arg2) {
        field2899++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (client.method671(arg1 + 2147483582, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = arg1 - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class161.method1089(var4, arg2, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
    public static final void method1157(byte arg0) {
        if (arg0 <= 106) {
            return;
        }
        if (class23.field324 == 2) {
            if (class268.field4731 == class134.field2258 && class183.field3161 == class132.field2221) {
                class23.field324 = 0;
                class106.method681((byte) -38, class167.field2824 - 1);
            }
        } else if (class134.field2258 == class104.field1709 && class50.field897 == class183.field3161) {
            class23.field324 = 0;
            class106.method681((byte) -4, class167.field2824 - 1);
        } else {
            class268.field4731 = class104.field1709;
            class132.field2221 = class50.field897;
            class23.field324 = 2;
        }
        field2895++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class172(Object arg0) {
        this.field2891 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        field2898++;
        class159 var1 = class229.field4119;
        synchronized (class229.field4119) {
            class201.field3605 = class267.field4718;
            class45.field808++;
            if (class196.field3504 >= 0) {
                while (class31.field438 != class196.field3504) {
                    int var3 = class93.field1517[class31.field438];
                    class31.field438 = class31.field438 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class88.field1438[var3] = true;
                    } else {
                        class88.field1438[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class88.field1438[var2] = false;
                }
                class196.field3504 = class31.field438;
            }
            class267.field4718 = class112.field1877;
        }
        if (arg0 != 1) {
            field2893 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Z")
    public static final boolean method1159(byte arg0) {
        field2894++;
        class159 var1 = class229.field4119;
        synchronized (class229.field4119) {
            if (class267.field4718 == class201.field3605) {
                return false;
            }
            class180.field3091 = class95.field1549[class201.field3605];
            class201.field3600 = class220.field3854[class201.field3605];
            if (arg0 > 0) {
                field2893 = null;
            }
            class201.field3605 = class201.field3605 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public static final void method1160(boolean arg0) {
        class163.field2756.method992(-31);
        if (arg0) {
            method1157((byte) -18);
        }
        field2901++;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        field2897 = null;
        if (arg0 == -23) {
            field2893 = null;
            field2888 = null;
            field2890 = null;
            field2887 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)Z")
    public final boolean method936(int arg0) {
        if (arg0 < 122) {
            return true;
        } else {
            field2886++;
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method937(int arg0) {
        if (arg0 >= -60) {
            this.method937(51);
        }
        field2896++;
        return this.field2891;
    }
}
