import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class421 {

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lqc;")
    private class325 field6039 = new class325(64);

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Ldda;")
    private class597 field6041;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field6036;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lnj;")
    public static class487 field6040 = new class487("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)Lfda;", line = 5)
    public final class499 method2502(int arg0, boolean arg1) {
        field6042++;
        class325 var3 = this.field6039;
        class499 var4;
        synchronized (this.field6039) {
            var4 = (class499) this.field6039.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            this.field6039 = null;
        }
        class597 var5 = this.field6041;
        byte[] var6;
        synchronized (this.field6041) {
            var6 = this.field6041.method3486((byte) -55, arg0, 19);
        }
        class499 var7 = new class499();
        if (var6 != null) {
            var7.method3006((byte) 125, new class428(var6));
        }
        class325 var8 = this.field6039;
        synchronized (this.field6039) {
            this.field6039.method2029(!arg1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lno;II)Z", line = 38)
    public static final boolean method2503(class483 arg0, int arg1, int arg2) {
        field6038++;
        int var3 = arg0.method2937(-19811, 2);
        if (var3 == 0) {
            if (arg0.method2937(arg2 ^ 0xFFFFB29D, 1) != 0) {
                method2503(arg0, arg1, arg2);
            }
            int var4 = arg0.method2937(arg2 - 19811, 6);
            int var5 = arg0.method2937(-19811, 6);
            boolean var6 = arg0.method2937(-19811, 1) == 1;
            if (var6) {
                class215.field3180[class202.field3016++] = arg1;
            }
            if (class383.field5604[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class351 var7 = class442.field6468[arg1];
            class179 var8 = class383.field5604[arg1] = new class179();
            var8.field1053 = arg1;
            if (class156.field1996[arg1] != null) {
                var8.method1190(arg2 ^ 0xFFFFFF83, class156.field1996[arg1]);
            }
            var8.method502(var7.field5108, true, false);
            var8.field1037 = var7.field5106;
            int var9 = var7.field5112;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field2744 = var7.field5110;
            var8.field1093[0] = class139.field1830[arg1];
            var8.field3457 = (byte) var10;
            var8.method1197((var11 << 6) + var4 - class584.field8677, true, (var12 << 6) + var5 - class424.field6061);
            var8.field2756 = false;
            class442.field6468[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method2937(-19811, 2);
            int var14 = class442.field6468[arg1].field5112;
            class442.field6468[arg1].field5112 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method2937(-19811, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class442.field6468[arg1].field5112;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class442.field6468[arg1].field5112 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method2937(-19811, 18);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class442.field6468[arg1].field5112;
            int var27 = (var26 >> 28) + var23 & 0x3;
            if (arg2 != 0) {
                field6040 = null;
            }
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class442.field6468[arg1].field5112 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILsa;)V", line = 202)
    public static final void method2504(int arg0, class543 arg1) {
        class235.field3455[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 208)
    public static final void method2505(boolean arg0) {
        field6037++;
        if (class304.field4433 == 0) {
            return;
        }
        try {
            if (++class567.field8413 > 2000) {
                if (class513.field7606 != null) {
                    class513.field7606.method1247((byte) 62);
                    class513.field7606 = null;
                }
                if (class172.field2331 >= 1) {
                    class427.field6090 = -5;
                    class304.field4433 = 0;
                    return;
                }
                class304.field4433 = 1;
                class567.field8413 = 0;
                class277.field4060.field6634 = !class277.field4060.field6634;
                class172.field2331++;
            }
            if (class304.field4433 == 1) {
                class264.field3905 = class328.field4850.method2164(class277.field4060.field6630, (byte) -96, class277.field4060.method2731(-3386));
                class304.field4433 = 2;
            }
            if (class304.field4433 == 2) {
                if (class264.field3905.field4208 == 2) {
                    throw new IOException();
                }
                if (class264.field3905.field4208 != 1) {
                    return;
                }
                class513.field7606 = class395.method2375(-12523, (Socket) class264.field3905.field4213, 5000);
                class264.field3905 = null;
                class513.field7606.method1243(class221.field3268.field6162, class221.field3268.field6221, 0, -27985);
                class304.field4433 = 4;
            }
            if (class304.field4433 == 4) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 92, 1);
                int var1 = class271.field4010.field6162[0] & 0xFF;
                if (var1 != 21) {
                    class427.field6090 = var1;
                    class304.field4433 = 0;
                    class513.field7606.method1247((byte) 119);
                    class513.field7606 = null;
                    return;
                }
                class304.field4433 = 5;
            }
            if (class304.field4433 == 5) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 90, 1);
                class52.field629 = new String[class271.field4010.field6162[0] & 0xFF];
                class304.field4433 = 6;
            }
            if (!arg0) {
                method2506(-19);
            }
            if (class304.field4433 == 6 && class513.field7606.method1246(class52.field629.length * 8, -25354)) {
                class271.field4010.field6221 = 0;
                class513.field7606.method1248(0, class271.field4010.field6162, 98, class52.field629.length * 8);
                for (int var2 = 0; var2 < class52.field629.length; var2++) {
                    class52.field629[var2] = class368.method2245(class271.field4010.method2609((byte) -103), 20296);
                }
                class304.field4433 = 0;
                class427.field6090 = 21;
                class513.field7606.method1247((byte) 98);
                class513.field7606 = null;
            }
        } catch (IOException var3) {
            if (class513.field7606 != null) {
                class513.field7606.method1247((byte) 51);
                class513.field7606 = null;
            }
            if (class172.field2331 >= 1) {
                class304.field4433 = 0;
                class427.field6090 = -4;
            } else {
                class277.field4060.field6634 = !class277.field4060.field6634;
                class304.field4433 = 1;
                class567.field8413 = 0;
                class172.field2331++;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 358)
    public class421(class559 arg0, int arg1, class597 arg2) {
        this.field6041 = arg2;
        this.field6036 = this.field6041.method3462(19, -53);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 375)
    public static void method2506(int arg0) {
        field6040 = null;
        if (arg0 != 3) {
            field6040 = null;
        }
    }
}
