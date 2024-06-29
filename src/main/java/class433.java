import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class433 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lkn;")
    public static class442 field6188 = new class442();

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field6191 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lpm;")
    public static class349 field6192 = new class349("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[Z")
    public static boolean[] field6194;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)B")
    public static final byte method2703(int arg0, int arg1, boolean arg2) {
        field6186++;
        if (arg1 == 9) {
            if (!arg2) {
                field6194 = null;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method2704(int arg0) {
        if (arg0 >= -105) {
            method2705(-92, 85, (byte[]) null, -76);
        }
        field6194 = null;
        field6188 = null;
        field6192 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method2705(int arg0, int arg1, byte[] arg2, int arg3) {
        field6187++;
        boolean var4 = true;
        class130 var5 = new class130(arg2);
        int var6 = arg0;
        label70: while (true) {
            int var7 = var5.method813(-1);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class282 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method854(3944);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var5.method837(true);
                                    }
                                    int var10 = var5.method854(3944);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFED) >> 6;
                                    var13 = var5.method837(true) >> 2;
                                    var14 = arg1 + var12;
                                    var15 = arg3 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= (class80.field1034 - 1));
                    } while ((class381.field5414 - 1) <= var15);
                    var16 = class398.method2496(-126, var6);
                } while (var13 == 22 && !class247.field3703 && var16.field4036 == 0 && var16.field4079 != 1 && !var16.field4104);
                if (!var16.method1943(-15555)) {
                    class275.field3968++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
    public static final int method2706(byte arg0) {
        field6190++;
        return arg0 == 88 ? 6 : 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIILni;IILvq;II)Lni;")
    public static final class305 method2707(int arg0, int arg1, int arg2, int arg3, int arg4, class305 arg5, int arg6, int arg7, class269 arg8, int arg9, int arg10) {
        field6189++;
        long var11 = (long) arg6;
        class305 var13 = (class305) class243.field3604.method99(true, var11);
        short var14 = 1031;
        if (var13 == null) {
            class406 var15 = class294.method1986(0, -105, arg6, class287.field4167);
            if (var15 == null) {
                return null;
            }
            var13 = arg8.method905(var15, var14, class439.field6263, 64, 768);
            class243.field3604.method90(var13, var11, 0);
        }
        class305 var16 = var13.method200((byte) 2, var14, true);
        if (arg4 != -22737) {
            field6192 = null;
        }
        if (arg9 != 0) {
            var16.method198(arg9);
        }
        if (arg0 != 0) {
            var16.method207(arg0);
        }
        if (arg10 != 0) {
            var16.method197(arg10);
        }
        if (arg7 != 0) {
            var16.method201(0, arg7, 0);
        }
        return var16;
    }

    static {
        new class349("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field6195 = 0;
    }
}
