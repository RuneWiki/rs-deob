import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class55 extends class179 {

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Ljava/lang/Object;")
    private Object field958;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field956 = 0;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static volatile int field949 = 0;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lw;")
    public static class107 field953;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[[Z")
    public static boolean[][] field946;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lw;")
    public static final class107 method408(int arg0, int arg1) {
        if (arg1 != 251234864) {
            field956 = 20;
        }
        field955++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class100.field1704[var3] == null || class100.field1704[var3][var2] == null) {
            boolean var4 = class225.method1534(-1, var3);
            if (!var4) {
                return null;
            }
        }
        return class100.field1704[var3][var2];
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public static final void method409(int arg0) {
        class53.method403(-106, class90.field1494);
        class252.field4361++;
        field952++;
        if (class20.field322 && class269.field4695) {
            int var1 = class214.field3684;
            int var2 = class17.field244;
            int var3 = var2 - class187.field3256;
            if (var3 < class269.field4693) {
                var3 = class269.field4693;
            }
            int var4 = var1 - class57.field1011;
            if (class90.field1494.field1856 + var3 > class269.field4693 + class194.field3347.field1856) {
                var3 = class194.field3347.field1856 + class269.field4693 - class90.field1494.field1856;
            }
            if (class21.field355 > var4) {
                var4 = class21.field355;
            }
            int var5 = class90.field1494.field1921;
            if ((class90.field1494.field1919 + var4) > (class21.field355 + class194.field3347.field1919)) {
                var4 = class21.field355 + class194.field3347.field1919 - class90.field1494.field1919;
            }
            int var6 = var3 - class243.field4213;
            int var7 = var3 + class194.field3347.field1937 - class269.field4693;
            int var8 = var4 - class170.field2987;
            int var9 = var4 + class194.field3347.field1934 - class21.field355;
            if (class252.field4361 > class90.field1494.field1955 && (var6 > var5 || var6 < (-var5) || var5 < var8 || (-var5) > var8)) {
                class46.field787 = true;
            }
            if (class90.field1494.field1874 != null && class46.field787) {
                class116 var10 = new class116();
                var10.field2167 = var9;
                var10.field2158 = class90.field1494;
                var10.field2155 = class90.field1494.field1874;
                var10.field2152 = var7;
                class141.method1044(var10, (byte) 76);
            }
            if (~class40.field692 == arg0) {
                if (class46.field787) {
                    if (class90.field1494.field1849 != null) {
                        class116 var11 = new class116();
                        var11.field2158 = class90.field1494;
                        var11.field2152 = var7;
                        var11.field2167 = var9;
                        var11.field2159 = class239.field4161;
                        var11.field2155 = class90.field1494.field1849;
                        class141.method1044(var11, (byte) 76);
                    }
                    if (class239.field4161 != null && client.method821(class90.field1494) != null) {
                        class270.field4705++;
                        class140.field2505.method1012((byte) 58, 41);
                        class140.field2505.method1625((byte) -125, class239.field4161.field1896);
                        class140.field2505.method1629(32767, class90.field1494.field1974);
                        class140.field2505.method1632(true, class239.field4161.field1974);
                        class140.field2505.method1625((byte) -120, class90.field1494.field1896);
                    }
                } else if ((class244.field4239 == 1 || class246.method1727(class73.field1254 - 1, false)) && class73.field1254 > 2) {
                    class73.method529((byte) 109);
                } else if (class73.field1254 > 0) {
                    class180.method1275(91);
                }
                class90.field1494 = null;
            }
        } else if (class252.field4361 > 1) {
            class90.field1494 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILff;)V")
    public static final void method410(int arg0, class3 arg1) {
        if (arg0 == 1) {
            class141.field2524 = arg1.method41(class226.field3840, false);
            field954++;
            class19.field312 = arg1.method41(class76.field1308, false);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Z")
    public final boolean method411(byte arg0) {
        if (arg0 == 23) {
            field951++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
    public static void method412(int arg0) {
        field946 = null;
        if (arg0 != 1) {
            method408(99, -84);
        }
        field953 = null;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method413(byte arg0) {
        if (arg0 > -21) {
            method414(-78);
        }
        field957++;
        return this.field958;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class55(Object arg0) {
        this.field958 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static final void method414(int arg0) {
        if (arg0 != 251234864) {
            field953 = null;
        }
        client.field1997.method1088(arg0 ^ 0xF10675F1);
        field948++;
        class224.field3815.method1386(arg0 - 251234812);
        class216.field3707.method1386(61);
    }
}
