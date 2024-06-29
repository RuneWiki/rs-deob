import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class581 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field7953 = 0;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Leq;")
    public static class213 field7954 = new class213(4);

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Lej;")
    public static class124 field7960 = new class124(49, 6);

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field7961 = -1;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "Lej;")
    public static class124 field7963 = new class124(23, 8);

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lec;")
    public static class236 field7964 = new class236();

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method3330(int arg0, byte arg1) {
        class606.field8321 = -1;
        if (arg0 == 37) {
            class489.field6771 = 3.0F;
        } else if (arg0 == 50) {
            class489.field6771 = 4.0F;
        } else if (arg0 == 75) {
            class489.field6771 = 6.0F;
        } else if (arg0 == 100) {
            class489.field6771 = 8.0F;
        } else if (arg0 == 200) {
            class489.field6771 = 16.0F;
        }
        field7962++;
        class606.field8321 = -1;
        if (arg1 != 56) {
            field7959 = 32;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 70)
    public static final String method3331(long arg0, int arg1) {
        field7957++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            if (arg1 >= -82) {
                field7961 = -58;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class606.field8314[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V", line = 113)
    public static final void method3332(byte arg0, int arg1) {
        if (arg0 >= -31) {
            field7959 = -128;
        }
        class699.field9460 = arg1;
        class505.field7035 = 3;
        field7955++;
        class723.field9806 = 100;
        class443.field6305 = -1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLjava/lang/String;)I", line = 134)
    public static final int method3333(byte arg0, String arg1) {
        field7958++;
        int var2 = 0;
        if (arg0 <= 70) {
            return -84;
        }
        while (var2 < class233.field3385.length) {
            if (class233.field3385[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 169)
    public static void method3334(byte arg0) {
        field7954 = null;
        field7963 = null;
        field7964 = null;
        if (arg0 != -94) {
            method3331(98L, -24);
        }
        field7960 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 193)
    public static final void method3335(String arg0, int arg1, boolean arg2) {
        field7956++;
        if (arg0 == null) {
            return;
        }
        if (class324.field4501 >= 100) {
            class356.method2237(class497.field6930.method2936(class607.field8336, 544), false, 4);
            return;
        }
        String var3 = class115.method1015(2, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class324.field4501; var4++) {
            String var9 = class115.method1015(2, class99.field1767[var4]);
            if (var9 != null && var9.equals(var3)) {
                class356.method2237(arg0 + class497.field6931.method2936(class607.field8336, 544), false, 4);
                return;
            }
            if (class438.field6245[var4] != null) {
                String var10 = class115.method1015(2, class438.field6245[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class356.method2237(arg0 + class497.field6931.method2936(class607.field8336, 544), false, 4);
                    return;
                }
            }
        }
        if (arg1 < 90) {
            return;
        }
        for (int var5 = 0; var5 < class443.field6289; var5++) {
            String var7 = class115.method1015(2, class648.field8912[var5]);
            if (var7 != null && var7.equals(var3)) {
                class356.method2237(class497.field6936.method2936(class607.field8336, 544) + arg0 + class497.field6937.method2936(class607.field8336, 544), false, 4);
                return;
            }
            if (class128.field2162[var5] != null) {
                String var8 = class115.method1015(2, class128.field2162[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class356.method2237(class497.field6936.method2936(class607.field8336, 544) + arg0 + class497.field6937.method2936(class607.field8336, 544), false, 4);
                    return;
                }
            }
        }
        if (class115.method1015(2, class58.field1147.field8189).equals(var3)) {
            class356.method2237(class497.field6933.method2936(class607.field8336, 544), false, 4);
            return;
        }
        class600.field8221++;
        class564 var6 = class227.method1594(class634.field8707, class72.field1320, -94);
        var6.field7778.method1526(false, class621.method3541(arg0, -65) + 1);
        var6.field7778.method1481((byte) -5, arg0);
        var6.field7778.method1526(false, arg2 ? 1 : 0);
        class167.method1260(-116, var6);
    }
}
