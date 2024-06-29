import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class94 extends OutputStream {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Liq;")
    public static class362 field1130 = new class362("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Liq;")
    public static class362 field1133 = new class362(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
    public static int[] field1135 = new int[250];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
    public static boolean field1134 = true;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!gg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1128++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZIIIIIZIILdg;)V")
    public static final void method521(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, class236 arg11) {
        field1129++;
        if (arg5 == 1) {
            arg6 = 1;
        } else if (arg5 == 2) {
            arg6 = 1;
            arg1 = 1;
        } else if (arg5 == 3) {
            arg1 = 1;
        }
        if (arg4 >= -97) {
            return;
        }
        if (arg3 < 0 || class176.field2403 <= arg3 || arg10 < 0 || class383.field5395 <= arg10) {
            while (true) {
                int var14 = arg11.method1574(-122);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg11.method1574(-3);
                    return;
                }
                if (var14 <= 49) {
                    arg11.method1574(-71);
                }
            }
        }
        if (!arg2 && !arg8) {
            class399.field5699[arg9][arg3][arg10] = 0;
        }
        while (true) {
            int var12 = arg11.method1574(-51);
            if (var12 == 0) {
                if (arg2) {
                    class419.field5994[0][arg1 + arg3][arg6 + arg10] = class98.field1191[0].method328(arg1 + arg3, arg10 - -arg6);
                    return;
                } else if (arg9 == 0) {
                    class419.field5994[0][arg1 + arg3][arg10 + arg6] = -class42.method256((byte) -115, arg0 + 556238, arg7 + 932731) * 8;
                    return;
                } else {
                    class419.field5994[arg9][arg1 + arg3][arg6 + arg10] = class419.field5994[arg9 - 1][arg1 + arg3][arg6 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg11.method1574(-8);
                if (!arg2) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg9 != 0) {
                        class419.field5994[arg9][arg1 + arg3][arg10 + arg6] = class419.field5994[arg9 - 1][arg1 + arg3][arg10 + arg6] - var13 * 8;
                        return;
                    }
                    class419.field5994[0][arg1 + arg3][arg6 + arg10] = -var13 * 8;
                    return;
                }
                class419.field5994[0][arg3 + arg1][arg6 + arg10] = var13 * 8 + class98.field1191[0].method328(arg1 + arg3, arg6 + arg10);
                return;
            }
            if (var12 <= 49) {
                if (arg8) {
                    arg11.method1574(-83);
                } else {
                    class190.field2743[arg9][arg3][arg10] = arg11.method1589(false);
                    class369.field5213[arg9][arg3][arg10] = (byte) ((var12 - 2) / 4);
                    class421.field6018[arg9][arg3][arg10] = (byte) class33.method210(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg2 && !arg8) {
                    class399.field5699[arg9][arg3][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg8) {
                class141.field1747[arg9][arg3][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 < 67) {
            field1130 = null;
        }
        field1130 = null;
        field1133 = null;
        field1135 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILqm;I)V")
    public static final void method523(byte arg0, int arg1, class77 arg2, int arg3) {
        if (arg0 != -27) {
            field1134 = true;
        }
        if (arg2.field5612 == arg3 && arg3 != -1) {
            class412 var4 = class189.method1288(arg0 - 8165, arg3);
            int var5 = var4.field5910;
            if (var5 == 1) {
                arg2.field5591 = 0;
                arg2.field5634 = 0;
                arg2.field5642 = 0;
                arg2.field5638 = arg1;
                arg2.field5630 = 1;
                class148.method896(false, var4, (byte) 106, arg2.field3284, arg2.field5591, arg2.field3269);
            }
            if (var5 == 2) {
                arg2.field5642 = 0;
            }
        } else if (arg3 == -1 || arg2.field5612 == -1 || class189.method1288(-8192, arg3).field5931 >= class189.method1288(arg0 - 8165, arg2.field5612).field5931) {
            arg2.field5630 = 1;
            arg2.field5667 = arg2.field5674;
            arg2.field5591 = 0;
            arg2.field5638 = arg1;
            arg2.field5612 = arg3;
            arg2.field5642 = 0;
            arg2.field5634 = 0;
            if (arg2.field5612 != -1) {
                class148.method896(false, class189.method1288(-8192, arg2.field5612), (byte) 101, arg2.field3284, arg2.field5591, arg2.field3269);
            }
        }
        field1136++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public static final void method524(int arg0, int arg1, int arg2) {
        field1131++;
        if (class98.method545(arg2, (byte) 11)) {
            class81.method456(-122, arg0, class98.field1194[arg2]);
            if (arg1 != 0) {
                method524(-98, 83, 100);
            }
        }
    }
}
