import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class41 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field407;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[[Z")
    public static boolean[][] field408;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method213(int arg0) {
        int var2 = -93 % ((-arg0 - 50) / 54);
        field405++;
        return class300.field3732 == this | class536.field7501 == this;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)V", line = 16)
    public static final void method214(int arg0, byte arg1) {
        field411++;
        class19 var2 = class139.field1538;
        synchronized (class139.field1538) {
            class139.field1538.method83((byte) -2, arg0);
            if (arg1 > -93) {
                field407 = null;
            }
        }
        class19 var3 = class256.field3203;
        synchronized (class256.field3203) {
            class256.field3203.method83((byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILnp;)V", line = 36)
    public static final void method215(int arg0, int arg1, class115 arg2) {
        if (arg0 != 0) {
            method214(5, (byte) 67);
        }
        if (class551.field7878 != null) {
            try {
                class551.field7878.method3776((byte) 106, 0L);
                class551.field7878.method3773(arg1, arg2.field1269, 24, 123);
            } catch (Exception var3) {
            }
        }
        field406++;
    }

    @OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field410++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 66)
    public static final void method216(int arg0) {
        field409++;
        int var1 = class314.field3909.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class314.field3909[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class215.field2603; var4++) {
                    if (class83.field857[var4] == class306.field3784[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class83.field857[class215.field2603] = class306.field3784[var2];
                    var3 = class215.field2603++;
                }
                class115 var5 = new class115(class314.field3909[var2]);
                int var6 = 0;
                while (class314.field3909[var2].length > var5.field1218 && var6 < 511 && class651.field9144 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method643((byte) -77);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class306.field3784[var2] >> 8) * 64 + (var10 - class26.field245);
                    int var13 = (class306.field3784[var2] & 0xFF) * 64 + var11 - class231.field2860;
                    class210 var14 = class369.field5055.method342(-14190, var5.method643((byte) -77));
                    class214 var15 = (class214) class274.field3433.method3669((long) var7, arg0 ^ 0xFFFFFFC0);
                    if (var15 == null && (var14.field2508 & 0x1) > 0 && class652.field9150 == var9 && var12 >= 0 && class142.field1574 > (var14.field2524 + var12) && var13 >= 0 && class140.field1550 > (var14.field2524 + var13)) {
                        class600 var16 = new class600();
                        var16.field9434 = var7;
                        class214 var17 = new class214(var16);
                        class274.field3433.method3671(false, var17, (long) var7);
                        class653.field9160[class53.field533++] = var17;
                        class398.field5375[class651.field9144++] = var7;
                        var16.field9452 = class678.field9539;
                        var16.method3368((byte) -121, var14);
                        var16.method3736(var16.field8461.field2524, arg0 ^ 0x3F);
                        var16.field9469 = var16.field8461.field2502 << 3;
                        var16.method3733(var16.field8461.field2530 + 4 << 11 & 0x39BA, true, (byte) -103);
                        var16.method3358(true, var9, var12, var13, var16.method1414(-31789), (byte) -118);
                    }
                }
            }
        }
        if (arg0 != 63) {
            method214(81, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 169)
    public static void method217(int arg0) {
        field408 = null;
        field407 = null;
        if (arg0 <= 9) {
            method215(-121, -45, null);
        }
    }
}
