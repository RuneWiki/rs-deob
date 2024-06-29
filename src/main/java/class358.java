import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class358 extends class179 {

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Lbo;")
    public class354 field5115;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Lrs;")
    public class238 field5109;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5111 = "Loading textures - ";

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field5107 = 0;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field5117 = 0;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field5103;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field5106;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[I")
    public static int[] field5114;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 7)
    public static final void method2294(boolean arg0, int arg1, String arg2) {
        field5113++;
        if (arg2 == null) {
            return;
        }
        if (class119.field1866 >= 100) {
            class373.method2380(19380, class320.field4622);
            return;
        }
        String var3 = class126.method1065(false, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class119.field1866; var4++) {
            String var8 = class126.method1065(false, class443.field6438[var4]);
            if (var8 != null && var8.equals(var3)) {
                class373.method2380(19380, arg2 + class39.field612);
                return;
            }
            if (class205.field3010[var4] != null) {
                String var9 = class126.method1065(false, class205.field3010[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class373.method2380(19380, arg2 + class39.field612);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class284.field4255; var5++) {
            String var6 = class126.method1065(false, class164.field2473[var5]);
            if (var6 != null && var6.equals(var3)) {
                class373.method2380(19380, class193.field2847 + arg2 + class270.field4058);
                return;
            }
            if (class307.field4484[var5] != null) {
                String var7 = class126.method1065(false, class307.field4484[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class373.method2380(19380, class193.field2847 + arg2 + class270.field4058);
                    return;
                }
            }
        }
        if (arg1 > -2) {
            method2301(-19, 108);
        }
        if (class126.method1065(false, class86.field1394.field2066).equals(var3)) {
            class373.method2380(19380, class362.field5163);
            return;
        }
        class13.field216.method2781(false, 141);
        class341.field4843++;
        class13.field216.method267(class429.method2677(arg2, 1) + 1, false);
        class13.field216.method265((byte) -58, arg2);
        class13.field216.method267(arg0 ? 1 : 0, false);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 111)
    public static final void method2295(int arg0) {
        class18 var1 = class63.field1013;
        synchronized (class63.field1013) {
            class63.field1013.method112(0);
        }
        if (arg0 != 19396) {
            field5111 = null;
        }
        field5116++;
        class18 var2 = class197.field2875;
        synchronized (class197.field2875) {
            class197.field2875.method112(0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 129)
    public static void method2296(boolean arg0) {
        field5111 = null;
        if (!arg0) {
            field5111 = null;
        }
        field5114 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V", line = 140)
    public static final void method2297(boolean arg0) {
        class18 var1 = class168.field2483;
        synchronized (class168.field2483) {
            class168.field2483.method106((byte) -118);
        }
        field5105++;
        class18 var2 = class58.field923;
        synchronized (class58.field923) {
            class58.field923.method106((byte) -117);
        }
        class78 var3 = class417.field6046;
        synchronized (class417.field6046) {
            if (arg0) {
                method2301(-84, -69);
            }
            class417.field6046.method615(114);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 164)
    public static final String method2298(long arg0, boolean arg1) {
        field5100++;
        class69.field1127.setTime(new Date(arg0));
        int var3 = class69.field1127.get(7);
        int var4 = class69.field1127.get(5);
        if (!arg1) {
            field5107 = -3;
        }
        int var5 = class69.field1127.get(2);
        int var6 = class69.field1127.get(1);
        int var7 = class69.field1127.get(11);
        int var8 = class69.field1127.get(12);
        int var9 = class69.field1127.get(13);
        return class326.field4693[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class428.field6197[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 192)
    public final void method2299(int arg0) {
        this.field5099 = this.field5115.field5038;
        field5108++;
        this.field5106 = this.field5115.field5030;
        this.field5102 = this.field5115.field5043;
        if (this.field5115.field5042 != null) {
            this.field5115.field5042.method1535(this.field5109.field3440, this.field5109.field3433, this.field5109.field3434, class413.field6002);
        }
        this.field5104 = class413.field6002[2];
        if (arg0 != 29764) {
            method2300(48);
        }
        this.field5103 = class413.field6002[0];
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V", line = 219)
    public static final void method2300(int arg0) {
        field5112++;
        for (int var1 = 0; var1 < 5; var1++) {
            class1.field6[var1] = false;
        }
        class273.field4106 = 0;
        class242.field3533 = class265.field3985;
        class331.field4760 = class437.field6364;
        class174.field2591 = class267.field4002;
        class377.field5369 = 0;
        class376.field5330 = -1;
        class406.field5903 = class286.field4288;
        class77.field1307 = class291.field4330;
        class98.field1547 = arg0;
        class322.field4643 = 5;
        class100.field1565 = class40.field623;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I", line = 250)
    public static final int method2301(int arg0, int arg1) {
        if (arg1 != 1751284680) {
            method2298(-86L, true);
        }
        field5101++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbo;Lbl;)V", line = 265)
    public class358(class354 arg0, class54 arg1) {
        this.field5115 = arg0;
        this.field5109 = class402.method2552((byte) -128, arg0.field5035);
        this.method2299(29764);
    }
}
