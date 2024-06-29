import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class82 extends class739 {

    @OriginalMember(owner = "client!haa", name = "M", descriptor = "I")
    private int field1119 = 0;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
    private int field1118 = 20;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    private int field1116 = 1365;

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "I")
    private int field1123 = 0;

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
    public static int field1124 = -1;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "Lfh;")
    public static class653 field1120 = new class653();

    @OriginalMember(owner = "client!haa", name = "T", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "I")
    public static int field1125;

    // $FF: synthetic field
    @OriginalMember(owner = "client!haa", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1127;

    // $FF: synthetic method
    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method689(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 3)
    public static final void method684(byte arg0) {
        ++field1121;
        class534 var1 = class28.field500;
        synchronized (class28.field500) {
            class28.field500.method3064(false);
        }
        class534 var2 = class344.field4348;
        synchronized (class344.field4348) {
            class344.field4348.method3064(false);
        }
        if (arg0 >= -42) {
            field1124 = -1;
        }
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V", line = 20)
    public static final void method685(int arg0) {
        ++field1114;
        if (arg0 <= 9) {
            field1126 = -51;
        }
        if (!class162.field2227.field6235) {
            try {
                Method var1 = (field1127 != null ? field1127 : (field1127 = method689("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        client.field3992 = 1 + (int) (var3 / 1048576L);
                        return;
                    } catch (Throwable var4) {
                        return;
                    }
                }
            } catch (Exception var5) {
                return;
            }
        } else {
            client.field3992 = 96;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method215(int arg0, int arg1) {
        ++field1115;
        if (arg0 != -23347) {
            return null;
        } else {
            int[] var3 = super.field10311.method2116(arg1, (byte) 56);
            if (super.field10311.field4728) {
                for (int var4 = 0; ~class29.field523 < ~var4; ++var4) {
                    int var5 = (class634.field8751[var4] << 12) / this.field1116 - -this.field1123;
                    int var6 = (class287.field3604[arg1] << 12) / this.field1116 + this.field1119;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && this.field1118 > var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 - var12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field1118 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field1118;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lsl;II)V", line = 116)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1119 = arg0.method2566(arg2 ^ 3);
                    }
                } else {
                    this.field1123 = arg0.method2566(arg2 ^ 3);
                }
            } else {
                this.field1118 = arg0.method2566(-2);
            }
        } else {
            this.field1116 = arg0.method2566(-2);
        }
        if (arg2 != -3) {
            method688(true, (byte) 116);
        }
        ++field1125;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V", line = 248)
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V", line = 173)
    public static void method686(byte arg0) {
        field1120 = null;
        int var1 = -19 / ((arg0 - -85) / 35);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 186)
    public static final void method687(Object[] arg0, int[] arg1, int arg2) {
        ++field1122;
        class617.method3446(arg1.length - 1, 14247, arg0, arg1, 0);
        if (arg2 >= -87) {
            field1124 = -102;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)I", line = 197)
    public static final int method688(boolean arg0, byte arg1) {
        ++field1117;
        if (arg1 <= 125) {
            field1120 = null;
        }
        int var2 = class259.field3281;
        if (~var2 != -1) {
            if (~var2 != -2) {
                return ~var2 == -3 ? 0 : 0;
            } else {
                return class89.field1237;
            }
        } else {
            return !arg0 ? class89.field1237 : 0;
        }
    }
}
