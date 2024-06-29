import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class130 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1990 = 0;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public int field1993 = 0;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lkh;")
    private class13 field1989 = new class13(64);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lom;")
    private class254 field1997 = null;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lul;")
    private class406 field1996;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lul;")
    private class406 field1987;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lob;")
    public static class521 field1998;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lcu;")
    public static class149 field1992;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[Luq;Z)V")
    public static final void method960(int arg0, class114[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class114 var4 = arg1[var3];
            if (var4 != null && var4.field1700 == arg0 && !client.method1389(var4)) {
                if (var4.field1585 == 0) {
                    method960(var4.field1644, arg1, false);
                    if (var4.field1660 != null) {
                        method960(var4.field1644, var4.field1660, false);
                    }
                    class293 var5 = (class293) class70.field993.method2585((byte) 114, (long) var4.field1644);
                    if (var5 != null) {
                        class6.method34(var5.field4454, 31673);
                    }
                }
                if (var4.field1585 == 6 && var4.field1661 != -1) {
                    class189 var6 = class242.field3846.method2238(var4.field1661, (byte) 78);
                    if (var6 != null) {
                        var4.field1695 += class295.field4496;
                        while (var6.field3204[var4.field1699] < var4.field1695) {
                            var4.field1695 -= var6.field3204[var4.field1699];
                            var4.field1699++;
                            if (var4.field1699 >= var6.field3181.length) {
                                var4.field1699 -= var6.field3202;
                                if (var4.field1699 < 0 || var4.field1699 >= var6.field3181.length) {
                                    var4.field1699 = 0;
                                }
                            }
                            var4.field1693 = var4.field1699 + 1;
                            if (var4.field1693 >= var6.field3181.length) {
                                var4.field1693 -= var6.field3202;
                                if (var4.field1693 < 0 || var6.field3181.length <= var4.field1693) {
                                    var4.field1693 = -1;
                                }
                            }
                            class262.method1747(20556, var4);
                        }
                    }
                }
            }
        }
        if (arg2) {
            field1992 = null;
        }
        field1995++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method961(boolean arg0) {
        field1992 = null;
        field1998 = null;
        if (!arg0) {
            method961(true);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILqu;[IJ)Ljava/lang/String;")
    public final String method962(int arg0, class65 arg1, int[] arg2, long arg3) {
        field1991++;
        if (this.field1997 != null) {
            String var6 = this.field1997.method1697(arg2, (byte) -106, arg1, arg3);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg0 >= -28) {
            method964((byte) -57, false, true);
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Ltb;")
    public final class276 method963(int arg0, byte arg1) {
        field1994++;
        class276 var3 = (class276) this.field1989.method87((long) arg0, -2062335807);
        if (arg1 != 87) {
            this.field1996 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field1987.method2536(1, arg1 - 87, arg0);
        } else {
            var4 = this.field1996.method2536(1, 0, arg0 & 0x7FFF);
        }
        class276 var5 = new class276();
        var5.field4217 = this;
        if (var4 != null) {
            var5.method1812((byte) 124, new class217(var4));
        }
        if (arg0 >= 32768) {
            var5.method1815(true);
        }
        this.field1989.method84((long) arg0, var5, (byte) 27);
        return var5;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BZZ)V")
    public static final void method964(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -126) {
            method964((byte) -53, true, false);
        }
        field1988++;
        if (arg1) {
            class479.field6897--;
            if (class479.field6897 == 0) {
                class312.field4694 = null;
            }
        }
        if (!arg2) {
            return;
        }
        class76.field1106--;
        if (class76.field1106 == 0) {
            class390.field5846 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(ILul;Lul;Lom;)V")
    public class130(int arg0, class406 arg1, class406 arg2, class254 arg3) {
        this.field1997 = arg3;
        this.field1996 = arg2;
        this.field1987 = arg1;
        if (this.field1987 != null) {
            this.field1990 = this.field1987.method2551(1, -26070);
        }
        if (this.field1996 != null) {
            this.field1993 = this.field1996.method2551(1, -26070);
        }
    }

    static {
        new class234("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class234("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1998 = new class521(13, 8);
    }
}
