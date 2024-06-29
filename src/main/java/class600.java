import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class600 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8685;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3411(byte arg0) {
        if (arg0 <= 125) {
            field8685 = null;
        }
        field8684++;
        class568 var1 = null;
        try {
            class254 var2 = class61.field978.method1416(false, 104, "3");
            while (var2.field3311 == 0) {
                class687.method3846(1L, 106);
            }
            if (var2.field3311 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class568) var2.field3307;
            byte[] var3 = new byte[(int) var1.method3272(false)];
            if (var3.length == 0) {
                class205.field2788 = "";
                class204.field2784 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3269(var3.length - var4, var3, (byte) 121, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class540 var6 = new class540(var3);
                int var7 = var6.method3115(29871);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field7956 = var7 + 1;
                if (!var6.method3133(true)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field7956 = 1;
                int var8 = var6.method3115(29871);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class204.field2784 = var6.method3122(-1);
                class205.field2788 = var6.method3122(-1);
                if (var8 < 1) {
                    class446.field6482 = class122.field1815;
                } else {
                    class446.field6482 = var6.method3169(26488);
                }
                if (var8 < 2) {
                    class175.field2456 = class224.field2970;
                } else {
                    class175.field2456 = var6.method3165(41);
                }
                if (var8 < 3) {
                    class581.field8454 = class222.field2944;
                } else if (var6.method3115(29871) == 1) {
                    class581.field8454 = var6.method3122(-1);
                } else {
                    class581.field8454 = null;
                }
            }
        } catch (Exception var10) {
            class204.field2784 = "";
            class205.field2788 = "";
        }
        try {
            if (var1 != null) {
                var1.method3271((byte) -119);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 104)
    public static void method3412(int arg0) {
        if (arg0 < 15) {
            method3412(124);
        }
        field8685 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 116)
    public static final void method3413(String arg0, boolean arg1, byte arg2) {
        field8687++;
        if (arg0 == null) {
            return;
        }
        if (class564.field8248 >= 100) {
            class36.method213(0, 4, class279.field3664.method1654(-80, class262.field3401));
            return;
        }
        String var3 = class247.method1506(arg0, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class564.field8248; var4++) {
            String var9 = class247.method1506(class115.field1722[var4], false);
            if (var9 != null && var9.equals(var3)) {
                class36.method213(0, 4, arg0 + class279.field3665.method1654(-122, class262.field3401));
                return;
            }
            if (class203.field2774[var4] != null) {
                String var10 = class247.method1506(class203.field2774[var4], false);
                if (var10 != null && var10.equals(var3)) {
                    class36.method213(arg2 + 10, 4, arg0 + class279.field3665.method1654(115, class262.field3401));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class356.field5266; var5++) {
            String var7 = class247.method1506(class205.field2796[var5], false);
            if (var7 != null && var7.equals(var3)) {
                class36.method213(0, 4, class279.field3670.method1654(arg2 ^ 0x56, class262.field3401) + arg0 + class279.field3671.method1654(111, class262.field3401));
                return;
            }
            if (class645.field9294[var5] != null) {
                String var8 = class247.method1506(class645.field9294[var5], false);
                if (var8 != null && var8.equals(var3)) {
                    class36.method213(0, 4, class279.field3670.method1654(arg2 ^ 0xFFFFFF9C, class262.field3401) + arg0 + class279.field3671.method1654(-53, class262.field3401));
                    return;
                }
            }
        }
        if (class247.method1506(class321.field4681.field1094, false).equals(var3)) {
            class36.method213(arg2 + 10, 4, class279.field3667.method1654(115, class262.field3401));
            return;
        }
        class451.field6512++;
        if (arg2 != -10) {
            method3414(null, false, false);
        }
        class654 var6 = class631.method3628(class40.field596, (byte) -51, class357.field5280);
        var6.field9358.method3110(class420.method2543(arg2 ^ 0xFFFFFFF7, arg0) + 1, 100);
        var6.field9358.method3132(arg0, 3);
        var6.field9358.method3110(arg1 ? 1 : 0, 37);
        class444.method2623(arg2 + 126, var6);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([BZZ)Ljava/lang/Object;", line = 220)
    public static final Object method3414(byte[] arg0, boolean arg1, boolean arg2) {
        field8690++;
        if (!arg2) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class557.field8183) {
                try {
                    class299 var3 = (class299) Class.forName("qm").getDeclaredConstructor().newInstance();
                    var3.method1866(arg0, 0);
                    return var3;
                } catch (Throwable var4) {
                    class557.field8183 = true;
                }
            }
            return arg1 ? class283.method1676(0, arg0) : arg0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 254)
    public static final void method3415(String arg0, boolean arg1) {
        if (!arg1) {
            method3416(90, 65, -41, -98);
        }
        field8691++;
        if (class69.field1078 == null) {
            class433.method2578((byte) -70);
        }
        class288.field4175.setTime(new Date(class60.method371(false)));
        int var2 = class288.field4175.get(11);
        int var3 = class288.field4175.get(12);
        int var4 = class288.field4175.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class509.method2891(arg0, '\n', -90);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class477.field6836; var8 > 0; var8--) {
                class69.field1078[var8] = class69.field1078[var8 - 1];
            }
            class69.field1078[0] = var5 + ": " + var6[var7];
            if (field8685 != null) {
                try {
                    field8685.write(class344.method2140(class69.field1078[0] + "\n", (byte) -92));
                } catch (IOException var9) {
                }
            }
            if (class477.field6836 < (class69.field1078.length - 1)) {
                if (class217.field2899 > 0) {
                    class217.field2899++;
                }
                class477.field6836++;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V", line = 317)
    public static final void method3416(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 5951) {
            method3412(-127);
        }
        field8688++;
        class317.field4622 = new byte[arg1][arg3][arg0];
    }
}
