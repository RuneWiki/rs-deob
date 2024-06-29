import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class535 extends class424 {

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field6968 = 503;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "B")
    public static byte field6973;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public int field6959;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
    public int field6960;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
    public int field6961;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public int field6962;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
    public int field6964;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public int field6965;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public int field6966;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public int field6967;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
    public int field6970;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    public int field6974;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "Lts;")
    public static class35 field6958;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ip", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field6977;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILoa;)Lba;")
    public final class107 method2847(boolean arg0, int arg1, class43 arg2) {
        field6972++;
        int var4 = class367.field4731[this.field6964];
        class107 var5 = null;
        if (var4 == 0) {
            class17 var6 = class549.method2909(this.field6966, this.field6963, this.field6974);
            if (var6 instanceof class13) {
                class13 var7 = (class13) var6;
                if (var7.field128 != null) {
                    var5 = ((class620) var7.field128).method63(arg2, arg1, 25871);
                }
            }
        } else if (var4 == 1) {
            class237 var8 = class186.method1237(this.field6966, this.field6963, this.field6974);
            if (var8 instanceof class550) {
                class550 var9 = (class550) var8;
                if (var9.field7141 != null) {
                    var5 = ((class620) var9.field7141).method63(arg2, arg1, 25871);
                }
            }
        } else if (var4 == 2) {
            class34 var12 = class47.method432(this.field6966, this.field6963, this.field6974, field6977 == null ? (field6977 = method2851("ut")) : field6977);
            if (var12 instanceof class166) {
                class166 var13 = (class166) var12;
                if (var13.field2075 != null) {
                    var5 = ((class620) var13.field2075).method63(arg2, arg1, 25871);
                }
            }
        } else if (var4 == 3) {
            class152 var10 = class377.method2155(this.field6966, this.field6963, this.field6974);
            if (var10 instanceof class469) {
                class469 var11 = (class469) var10;
                if (var11.field6121 != null) {
                    var5 = ((class620) var11.field6121).method63(arg2, arg1, 25871);
                }
            }
        }
        if (var5 == null) {
            if (!arg0) {
                field6973 = 77;
            }
            return null;
        } else {
            return var5.method479((byte) 0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method2848(byte arg0) {
        field6958 = null;
        int var1 = -100 / ((56 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)V")
    public static final void method2849(int arg0, int arg1, byte arg2) {
        if (arg2 > 82) {
            field6975++;
            class367 var3 = class573.method3057(5, arg1, 2);
            var3.method2115(1);
            var3.field4735 = arg0;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(JJ)J")
    public static long method2850(long arg0, long arg1) {
        return arg0 & arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2851(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
