import java.awt.Component;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class127 extends InputStream {

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "[Lwh;")
    public static class146[] field1925 = new class146[100];

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Leq;")
    public static class209 field1923;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILhn;I)V")
    public static final void method984(int arg0, class718 arg1, int arg2) {
        field1921++;
        if (class570.field8115 >= 50 || arg1 == null || arg1.field10070 == null || arg2 >= arg1.field10070.length || arg1.field10070[arg2] == null) {
            return;
        }
        int var3 = arg1.field10070[arg2][0];
        int var4 = var3 >> 8;
        if (arg1.field10070[arg2].length > 1) {
            int var5 = (int) ((double) arg1.field10070[arg2].length * Math.random());
            if (var5 > 0) {
                var4 = arg1.field10070[arg2][var5];
            }
        }
        int var6 = var3 >> 5 & 0x7;
        if (arg0 != -3991) {
            return;
        }
        int var7 = 256;
        if (arg1.field10052 != null && arg1.field10067 != null) {
            var7 = class612.method3522(91, arg1.field10067[arg2], arg1.field10052[arg2]);
        }
        if (arg1.field10059) {
            class335.method2140(-26, var7, var4, 255, var6, false, 0);
        } else {
            class247.method1652(var7, var6, true, 255, var4, 0);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method985(int arg0) {
        field1925 = null;
        field1923 = null;
        if (arg0 != -1) {
            method988(64);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method986(byte arg0, int arg1, int arg2) {
        field1924++;
        if (arg0 < 117) {
            field1923 = null;
        }
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z")
    public static final boolean method987(int arg0, int arg1, int arg2) {
        field1922++;
        if (arg0 != 4182) {
            method986((byte) 74, -18, -3);
        }
        return class560.method3283(arg2, arg1, -8225) | (arg2 & 0x60000) != 0 || class634.method3644(arg2, arg1, arg0 ^ 0xFFFFEFC8);
    }

    @OriginalMember(owner = "client!qea", name = "read", descriptor = "()I")
    public final int read() {
        field1926++;
        class246.method1639(30000L, (byte) -105);
        return -1;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public static final void method988(int arg0) {
        class471.field6781.method2826(1, (byte) 95, class471.field6781.field6719);
        field1920++;
        class471.field6781.method2826(1, (byte) 112, class471.field6781.field6704);
        class471.field6781.method2826(2, (byte) 101, class471.field6781.field6678);
        class471.field6781.method2826(2, (byte) 126, class471.field6781.field6668);
        class471.field6781.method2826(1, (byte) 123, class471.field6781.field6665);
        class471.field6781.method2826(1, (byte) 105, class471.field6781.field6674);
        class471.field6781.method2826(1, (byte) 122, class471.field6781.field6693);
        class471.field6781.method2826(1, (byte) 117, class471.field6781.field6698);
        class471.field6781.method2826(1, (byte) 124, class471.field6781.field6713);
        class471.field6781.method2826(2, (byte) 79, class471.field6781.field6689);
        class471.field6781.method2826(1, (byte) 100, class471.field6781.field6696);
        class471.field6781.method2826(1, (byte) 87, class471.field6781.field6688);
        class471.field6781.method2826(2, (byte) 85, class471.field6781.field6714);
        class471.field6781.method2826(1, (byte) 118, class471.field6781.field6673);
        class471.field6781.method2826(0, (byte) 101, class471.field6781.field6675);
        class471.field6781.method2826(0, (byte) 127, class471.field6781.field6697);
        class471.field6781.method2826(arg0, (byte) 127, class471.field6781.field6687);
        class471.field6781.method2826(0, (byte) 119, class471.field6781.field6677);
        class471.field6781.method2826(0, (byte) 97, class471.field6781.field6676);
        class56.method514(true);
        class471.field6781.method2826(0, (byte) 98, class471.field6781.field6705);
        class471.field6781.method2826(4, (byte) 97, class471.field6781.field6712);
        class685.method3857(true);
        class246.method1631(false);
        class291.field4095 = true;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILvk;Ljava/awt/Component;II)Lvo;")
    public static final class41 method989(int arg0, class367 arg1, Component arg2, int arg3, int arg4) {
        field1919++;
        if (arg4 != 5) {
            field1923 = null;
        }
        if (class215.field3077 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class41 var5 = (class41) Class.forName("bm").getDeclaredConstructor().newInstance();
                var5.field609 = new int[(class390.field5446 ? 2 : 1) * 256];
                var5.field619 = arg0;
                var5.method367(arg2);
                var5.field623 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field623 > 16384) {
                    var5.field623 = 16384;
                }
                var5.method372(var5.field623);
                if (class595.field8698 > 0 && class638.field9102 == null) {
                    class638.field9102 = new class170();
                    class638.field9102.field2489 = arg1;
                    arg1.method2295(class595.field8698, (byte) 99, class638.field9102);
                }
                if (class638.field9102 != null) {
                    if (class638.field9102.field2491[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class638.field9102.field2491[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class648 var6 = new class648(arg1, arg3);
                    var6.field619 = arg0;
                    var6.field609 = new int[(class390.field5446 ? 2 : 1) * 256];
                    var6.method367(arg2);
                    var6.field623 = 16384;
                    var6.method372(var6.field623);
                    if (class595.field8698 > 0 && class638.field9102 == null) {
                        class638.field9102 = new class170();
                        class638.field9102.field2489 = arg1;
                        arg1.method2295(class595.field8698, (byte) 109, class638.field9102);
                    }
                    if (class638.field9102 != null) {
                        if (class638.field9102.field2491[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class638.field9102.field2491[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class41();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
