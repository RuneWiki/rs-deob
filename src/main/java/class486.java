import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class486 {

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Ls;")
    public static class186 field7156 = new class186(106, 12);

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Lwm;")
    public static class399 field7162 = new class399(8);

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "Lbj;")
    public static class162 field7166 = new class162(50, 7);

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "[Z")
    public static boolean[] field7167 = new boolean[100];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "B")
    public byte field7139;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "B")
    public byte field7141;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "B")
    public byte field7144;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "B")
    public byte field7146;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "B")
    public byte field7147;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "B")
    public byte field7150;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "B")
    public byte field7163;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field7151;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public int field7160;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "S")
    public short field7152;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Z")
    public boolean field7142;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Z")
    public boolean field7143;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
    public boolean field7145;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Z")
    public boolean field7148;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Z")
    public boolean field7149;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "Z")
    public boolean field7157;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "Z")
    public boolean field7159;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
    public boolean field7161;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "Z")
    public boolean field7164;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "[[Z")
    public static boolean[][] field7158;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "[[[I")
    public static int[][][] field7165;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2911(byte arg0) {
        class506.field7382 = 0;
        field7155++;
        int var1 = class219.field3446.method1876((byte) -117);
        int var2 = class219.field3446.method1859(255);
        int var3 = class219.field3446.method1841((byte) -123);
        boolean var4 = class219.field3446.method1858(-3256) == 1;
        class427.method2584((byte) -107);
        class496.method2995(var2, false);
        int var5 = (class234.field3606 - class219.field3446.field4399) / 16;
        class321.field4905 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class321.field4905[var6][var10] = class219.field3446.method1815((byte) -121);
            }
        }
        class383.field5600 = new int[var5];
        class87.field1782 = null;
        if (arg0 >= -71) {
            field7167 = null;
        }
        class236.field3639 = new int[var5];
        class204.field3272 = new int[var5];
        class299.field4526 = new byte[var5][];
        class58.field1227 = new int[var5];
        class386.field5634 = new byte[var5][];
        class96.field1883 = new byte[var5][];
        class533.field7730 = new byte[var5][];
        class110.field2006 = null;
        class77.field1551 = new int[var5];
        int var7 = 0;
        for (int var8 = (var1 - (class339.field5099 >> 4)) / 8; var8 <= ((var1 + (class339.field5099 >> 4)) / 8); var8++) {
            for (int var9 = (var3 - (class484.field7129 >> 4)) / 8; var9 <= (((class484.field7129 >> 4) + var3) / 8); var9++) {
                class58.field1227[var7] = (var8 << 8) + var9;
                class77.field1551[var7] = class361.field5290.method2735("m" + var8 + "_" + var9, 110);
                class236.field3639[var7] = class361.field5290.method2735("l" + var8 + "_" + var9, -32);
                class204.field3272[var7] = class361.field5290.method2735("um" + var8 + "_" + var9, -45);
                class383.field5600[var7] = class361.field5290.method2735("ul" + var8 + "_" + var9, 124);
                var7++;
            }
        }
        class379.method2333(var4, 10, 1, var3, var1);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 91)
    public static void method2912(int arg0) {
        field7158 = null;
        field7165 = null;
        field7162 = null;
        field7167 = null;
        if (arg0 == 10030) {
            field7166 = null;
            field7156 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 115)
    public static final void method2913(String arg0, Throwable arg1, byte arg2) {
        field7153++;
        try {
            if (arg2 >= -101) {
                field7156 = null;
            }
            String var3 = "";
            if (arg1 != null) {
                var3 = class189.method1290(arg1, 25499);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class42.method256(var3, -29677);
            String var4 = class526.method3108(-1, var3, ":", "%3a");
            String var5 = class526.method3108(-1, var4, "@", "%40");
            String var6 = class526.method3108(-1, var5, "&", "%26");
            String var7 = class526.method3108(-1, var6, "#", "%23");
            if (class378.field5540.field7072 != null) {
                class121 var8 = class378.field5540.method2887((byte) 125, new URL(class378.field5540.field7072.getCodeBase(), "clienterror.ws?c=" + class154.field2509 + "&u=" + class377.field5512 + "&v1=" + class480.field7074 + "&v2=" + class480.field7089 + "&e=" + var7));
                while (var8.field2119 == 0) {
                    class50.method470(1L, -5);
                }
                if (var8.field2119 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2115;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 169)
    public static final void method2914(byte arg0) {
        if (class262.field4006.method360()) {
            class262.field4006.method347(class262.field4007);
            class387.method2370((byte) -82);
            class262.field4006.method418(class262.field4007);
            class262.field4006.method311(class262.field4007);
        } else {
            class304.method1944(false, class133.field2236);
        }
        field7154++;
        if (arg0 <= 67) {
            method2915(122, null);
        }
        class102.method895(0);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILph;)V", line = 196)
    public static final void method2915(int arg0, class459 arg1) {
        class145.field2442 = 0;
        field7140++;
        class329.field4997 = arg0;
        class63.field1296 = new class60();
        class491.field7196 = new class240[1024];
        class250.method1625(arg1, 704);
        class526.method3109(arg1, 255);
    }
}
