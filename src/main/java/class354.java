import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class354 extends class29 {

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lbn;")
    public static class160 field5161 = new class160(34, 6);

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Z")
    public static boolean field5166 = false;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field5165 = 1403;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Ljn;")
    public static class409 field5164 = new class409("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lvq;")
    public static class24 field5168 = new class24(29, 8);

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lct;")
    public static class104 field5167;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ldq;")
    private class90 field5157;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2262(byte arg0) {
        field5160++;
        int var1 = 0;
        if (class307.field4535) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class148.method1023(var1, (byte) -114);
        class318.method2094(-106, var1);
        class157.field2119.method184((byte) 41, var1);
        if (arg0 < 102) {
            method2263(69);
        }
        class388.method2451(0, var1);
        class332.method2173(var1, (byte) 115);
        class387.method2446(18234, var1);
        class387.method2444(var1, -109);
        class308.method2053((byte) 119, var1);
        class364.method2315(var1, (byte) 82);
        if (class120.field1610 == 10) {
            client.method1796(28, 82);
        } else if (class120.field1610 == 30) {
            client.method1796(25, 68);
            return;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V", line = 44)
    public static final void method2263(int arg0) {
        field5158++;
        class363 var1 = class42.field555;
        synchronized (class42.field555) {
            class42.field555.method2307(-82);
        }
        class363 var2 = class83.field1019;
        synchronized (class83.field1019) {
            class83.field1019.method2307(-95);
            if (arg0 >= 0) {
                method2268((byte) -84);
            }
        }
        class363 var3 = class18.field293;
        synchronized (class18.field293) {
            class18.field293.method2307(-95);
        }
        class363 var4 = class329.field4898;
        synchronized (class329.field4898) {
            class329.field4898.method2307(76);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Luk;IIIII)V", line = 66)
    public static final void method2264(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2081 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field2083[var6] != null) {
                arg0.field2081++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2081; var7++) {
            long var8 = class455.field6730[arg1][arg2][arg3];
            while (var8 != 0L) {
                class157 var14 = class120.field1613[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field2083[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class455.field6730[arg1][arg4][arg5];
            while (var10 != 0L) {
                class157 var13 = class120.field1613[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field2083[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2081 - 1; var12++) {
                arg0.field2083[var12] = arg0.field2083[var12 + 1];
            }
            arg0.field2081--;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILfp;)V", line = 122)
    public static final void method2265(int arg0, class9 arg1) {
        field5156++;
        if (class286.field4210) {
            class159.method1070(true, arg1);
        } else {
            class249.method1652(109, arg1);
        }
        if (arg0 != -32461) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)I", line = 137)
    public final int method2266(int arg0, int arg1, boolean arg2) {
        field5155++;
        if (this.field5157 == null) {
            return arg1;
        }
        class13 var4 = (class13) this.field5157.method609((long) arg0, 54);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2) {
                this.method2269(false, (class256) null);
            }
            return var4.field214;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLat;)V", line = 166)
    private final void method2267(int arg0, byte arg1, class256 arg2) {
        if (arg1 != -62) {
            return;
        }
        if (arg0 == 249) {
            int var4 = arg2.method1738((byte) -67);
            if (this.field5157 == null) {
                int var5 = class289.method1938((byte) 68, var4);
                this.field5157 = new class90(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1738((byte) -121) == 1;
                int var8 = arg2.method1725((byte) 0);
                class264 var9;
                if (var7) {
                    var9 = new class82(arg2.method1715(true));
                } else {
                    var9 = new class13(arg2.method1746(20972));
                }
                this.field5157.method606(arg1 ^ 0xFFFFFFC3, var9, (long) var8);
            }
        }
        field5159++;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 216)
    public static void method2268(byte arg0) {
        field5167 = null;
        field5168 = null;
        field5161 = null;
        int var1 = 70 / ((29 - arg0) / 62);
        field5164 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLat;)V", line = 229)
    public final void method2269(boolean arg0, class256 arg1) {
        field5162++;
        while (true) {
            int var3 = arg1.method1738((byte) -35);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    field5166 = true;
                    return;
                }
            }
            this.method2267(var3, (byte) -62, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 250)
    public final String method2270(int arg0, String arg1, int arg2) {
        field5163++;
        if (this.field5157 == null) {
            return arg1;
        }
        if (arg0 != 4) {
            field5168 = null;
        }
        class82 var4 = (class82) this.field5157.method609((long) arg2, arg0 ^ 0x47);
        return var4 == null ? arg1 : var4.field1011;
    }
}
