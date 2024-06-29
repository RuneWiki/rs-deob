import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class193 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field2887 = -1;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[I")
    public static int[] field2893 = new int[500];

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1332(byte arg0) {
        field2891++;
        class121.field1895 = 0;
        int var1 = (class114.field1750.field1566 >> 7) + class217.field3309;
        if (arg0 <= 45) {
            method1335(false);
        }
        int var2 = (class114.field1750.field1505 >> 7) + class189.field2807;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class121.field1895 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class121.field1895 = 1;
        }
        if (class121.field1895 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class121.field1895 = 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLf;)Lf;", line = 32)
    public static final class329 method1333(byte arg0, class329 arg1) {
        field2889++;
        if (arg1.field5091 != -1) {
            return class80.method541((byte) 96, arg1.field5091);
        }
        int var2 = arg1.field5086 >>> 16;
        class310 var3 = new class310(class295.field4522);
        class167 var4 = (class167) var3.method2149(arg0 ^ 0x1F4A);
        if (arg0 != -35) {
            return (class329) null;
        }
        while (var4 != null) {
            if (var4.field2505 == var2) {
                return class80.method541((byte) 96, (int) var4.field1603);
            }
            var4 = (class167) var3.method2142(arg0 ^ 0xFFFFFFDC);
        }
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 62)
    public static final void method1334(boolean arg0) {
        field2894++;
        class177.field2626.method2182(arg0);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)Z", line = 75)
    public static final boolean method1335(boolean arg0) {
        field2895++;
        if (arg0) {
            method1333((byte) -4, (class329) null);
        }
        if (class49.field624) {
            try {
                return !(Boolean) class25.method168("showingVideoAd", class274.field4200.field3963, 110);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 114)
    public static void method1336(int arg0) {
        if (arg0 >= 124) {
            field2893 = null;
        }
    }
}
