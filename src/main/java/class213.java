import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class213 extends class42 {

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
    public static int[] field3205 = new int[4096];

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3219 = 0;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
    public static int[] field3222 = new int[13];

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3224 = 1337;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public int field3223;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field3225;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
    public static int[] field3209;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;II)Lka;")
    public final class336 method1431(class167 arg0, int arg1, int arg2) {
        field3208++;
        int var4 = class71.field1155[this.field3203];
        if (arg2 == var4) {
            class468 var11 = class500.method2921(this.field3216, this.field3204, this.field3210);
            if (var11 instanceof class72) {
                class72 var12 = (class72) var11;
                if (var12.field1179 != null) {
                    return ((class534) var12.field1179).method550(arg2 - 14322, arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            class469 var9 = class415.method2475(this.field3216, this.field3204, this.field3210);
            if (var9 instanceof class533) {
                class533 var10 = (class533) var9;
                if (var10.field7863 != null) {
                    return ((class534) var10.field7863).method550(-14322, arg0, arg1);
                }
            }
        } else if (var4 == 2) {
            class478 var5 = class413.method2470(this.field3216, this.field3204, this.field3210, field3225 == null ? (field3225 = method1434("wo")) : field3225);
            if (var5 instanceof class446) {
                class446 var6 = (class446) var5;
                if (var6.field6367 != null) {
                    return ((class534) var6.field6367).method550(-14322, arg0, arg1);
                }
            }
        } else if (var4 == 3) {
            class108 var7 = class388.method2347(this.field3216, this.field3204, this.field3210);
            if (var7 instanceof class397) {
                class397 var8 = (class397) var7;
                if (var8.field5635 != null) {
                    return ((class534) var8.field5635).method550(-14322, arg0, arg1);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1432(boolean arg0) {
        field3205 = null;
        if (arg0) {
            method1433((byte) 25, -112, -10);
        }
        field3209 = null;
        field3222 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)Lbr;")
    public static final class275 method1433(byte arg0, int arg1, int arg2) {
        field3212++;
        if (arg0 <= 47) {
            method1432(false);
        }
        class275 var3 = (class275) class142.field2196.method2284(true, (long) arg1 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class275(arg1, arg2);
            class142.field2196.method2292(var3.field863, var3, (byte) -127);
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1434(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
