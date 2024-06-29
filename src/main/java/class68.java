import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class68 extends class152 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lng;")
    public static class190 field1058 = new class190(5);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[[[B")
    public static byte[][][] field1065;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBII)V")
    public static final void method461(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class442.field6400.field5273 = 0;
        field1060++;
        class442.field6400.method2396(20, 12450);
        class442.field6400.method2396(arg1, 12450);
        class442.field6400.method2396(arg0, 12450);
        class442.field6400.method2416(22064, arg3);
        class442.field6400.method2416(22064, arg4);
        class221.field2961 = 0;
        class76.field1194 = 0;
        class282.field3867 = 1;
        class165.field2352 = -3;
        if (arg2 >= -67) {
            field1058 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLqj;)V")
    public static final void method462(boolean arg0, class296 arg1) {
        field1063++;
        class318.field4371 = arg1;
        if (!arg0) {
            method463((String) null, -100);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method463(String arg0, int arg1) {
        if (arg1 > 21) {
            field1061++;
            System.out.println("Error: " + class97.method686("%0a", -18715, arg0, "\n"));
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static final void method464(byte arg0) {
        field1064++;
        class1 var1 = class371.field5260;
        synchronized (class371.field5260) {
            class409.field5938 = class414.field6013;
            class14.field171++;
            class349.field4883 = class165.field2351;
            class162.field2269 = class408.field5927;
            class383.field5452 = class373.field5327;
            class349.field4879 = class426.field6117;
            class361.field5073 = class170.field2418;
            int var2 = -126 / ((arg0 + 26) / 39);
            class300.field4146 = class216.field2870;
            class373.field5327 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZ)V")
    public static final void method465(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field1059++;
            class221.field2910 = new byte[arg1][arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLeb;)V")
    public static final void method466(byte arg0, class371 arg1) {
        field1062++;
        byte[] var2 = new byte[24];
        if (class245.field3396 != null) {
            try {
                class245.field3396.method2666(0L, 0);
                class245.field3396.method2670(var2, arg0 - 19);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2434(var2, 713288968, 0, 24);
        if (arg0 != 19) {
            field1065 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lfe;")
    public static final class339 method467(int arg0, int arg1) {
        field1057++;
        class339 var2 = (class339) class71.field1101.method1246((byte) -52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 24) {
            method461(82, -103, (byte) -86, 39, -87);
        }
        byte[] var3 = class383.field5440.method1920(arg1, false, 26);
        class339 var4 = new class339();
        if (var3 != null) {
            var4.method2174(new class371(var3), arg0 - 25);
        }
        class71.field1101.method1247((long) arg1, (byte) 105, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1065 = null;
        if (arg0 != 20) {
            field1065 = null;
        }
        field1058 = null;
    }
}
