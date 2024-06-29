import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class710 extends InputStream {

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9945 = 503;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!ufa", name = "read", descriptor = "()I")
    public final int read() {
        class438.method2636(true, 30000L);
        field9946++;
        return -1;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
    public static final int method3974(byte arg0) {
        if (arg0 != 60) {
            method3974((byte) 82);
        }
        field9948++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class730.field10124.field984 && !class730.field10124.field977) {
            var1 = true;
            if (class693.field9717.field550 < 512 && class693.field9717.field550 != 0) {
                var1 = false;
            }
            if (class70.field976.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class73.field1074) {
            var3 = false;
        }
        if (class355.field5207) {
            var1 = false;
        }
        if (class24.field381) {
            var2 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class156.method1154((byte) -123);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class186.method1290(1000, (byte) 28, 2);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class186.method1290(1000, (byte) 28, 3);
                if (class712.field9959.field1270.method4293(13) == 3) {
                    class45 var7 = class379.field5542.method558();
                    long var8 = var7.field683 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field677;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class186.method1290(1000, (byte) 28, 1);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class156.method1154((byte) -123);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var4 > var11) {
            return class705.method3950(var4, false);
        } else if (var11 >= var12) {
            return class740.method4095(1, (byte) -128, var11);
        } else {
            return class740.method4095(3, (byte) -128, var12);
        }
    }
}
