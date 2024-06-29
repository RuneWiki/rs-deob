import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class169 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lia;")
    public static class257 field2910 = class28.method234(-84, "blinken3:");

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lia;")
    public static class257 field2912 = class28.method234(-49, "<col=00ff80>");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2908 = 1;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
    public static boolean field2918 = true;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lvb;")
    public static class226 field2914;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2919;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLmb;Lmb;)V")
    public static final void method1158(boolean arg0, class178 arg1, class178 arg2) {
        if (!arg0) {
            class1.field13 = arg2;
            field2915++;
            class138.field2467 = arg1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1159(int arg0) {
        if (class32.field628 > class15.field332) {
            class15.field332 += class15.field332 / 30.0D;
            if (class15.field332 > class32.field628) {
                class15.field332 = class32.field628;
            }
            class228.method1488((byte) 121);
        } else if (class15.field332 > class32.field628) {
            class15.field332 -= class15.field332 / 30.0D;
            if (class15.field332 < class32.field628) {
                class15.field332 = class32.field628;
            }
            class228.method1488((byte) -51);
        }
        int var1 = 72 / ((62 - arg0) / 56);
        if (class26.field510 != -1 && class143.field2516 != -1) {
            int var2 = class26.field510 - class181.field3146;
            int var3 = class143.field2516 - class233.field3997;
            if (var3 < 2 || var3 > 2) {
                var3 >>= 0x4;
            }
            class233.field3997 += var3;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class181.field3146 += var2;
            if (var2 == 0 && var3 == 0) {
                class143.field2516 = -1;
                class26.field510 = -1;
            }
            class228.method1488((byte) 77);
        }
        field2911++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method1160(byte arg0) {
        if (arg0 == -97) {
            field2912 = null;
            field2910 = null;
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static final void method1161(byte arg0) {
        field2916++;
        for (class42 var1 = (class42) class28.field543.method288(26111); var1 != null; var1 = (class42) class28.field543.method277(1)) {
            class40 var3 = var1.field848;
            if (class189.field3261 != var3.field817 || var3.field805 < class7.field153) {
                var1.method254(1);
            } else if (class7.field153 >= var3.field815) {
                if (var3.field802 > 0) {
                    class197 var4 = class92.field1758[var3.field802 - 1];
                    if (var4 != null && var4.field4177 >= 0 && var4.field4177 < 13312 && var4.field4143 >= 0 && var4.field4143 < 13312) {
                        var3.method325(class109.method803(var3.field817, var4.field4143, (byte) 108, var4.field4177) - var3.field806, class7.field153, var4.field4177, var4.field4143, (byte) -60);
                    }
                }
                if (var3.field802 < 0) {
                    int var5 = -var3.field802 - 1;
                    class180 var6;
                    if (class173.field2958 == var5) {
                        var6 = class137.field2441;
                    } else {
                        var6 = class55.field1180[var5];
                    }
                    if (var6 != null && var6.field4177 >= 0 && var6.field4177 < 13312 && var6.field4143 >= 0 && var6.field4143 < 13312) {
                        var3.method325(class109.method803(var3.field817, var6.field4143, (byte) -51, var6.field4177) - var3.field806, class7.field153, var6.field4177, var6.field4143, (byte) -60);
                    }
                }
                var3.method329(class171.field2935, 16124);
                class246.method1614(class189.field3261, (int) var3.field825, (int) var3.field811, (int) var3.field822, 60, var3, var3.field814, -1L, false);
            }
        }
        int var2 = 117 / ((40 - arg0) / 43);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class169() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lk;I[B)V")
    public final void method1162(class152 arg0, int arg1, byte[] arg2) {
        field2917++;
        if (arg0.field2638[arg0.field2677] != 31 || arg0.field2638[arg0.field2677 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2919 == null) {
            this.field2919 = new Inflater(true);
        }
        try {
            this.field2919.setInput(arg0.field2638, arg0.field2677 + 10, -10 - arg0.field2677 - 8 + arg0.field2638.length);
            this.field2919.inflate(arg2);
        } catch (Exception var4) {
            this.field2919.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2919.reset();
        if (arg1 != 30661) {
            field2920 = -116;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lr;B)V")
    public static final void method1163(class127 arg0, byte arg1) {
        arg0.field2267 = false;
        if (arg0.field2270 != null) {
            arg0.field2270.field3760 = 0;
        }
        if (arg1 >= -90) {
            field2918 = true;
        }
        for (class127 var2 = arg0.method27(); var2 != null; var2 = arg0.method24()) {
            method1163(var2, (byte) -100);
        }
        field2909++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
    private class169(int arg0, int arg1, int arg2) {
    }
}
