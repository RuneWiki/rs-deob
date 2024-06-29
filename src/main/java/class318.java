import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class318 {

    @OriginalMember(owner = "client!is", name = "h", descriptor = "Lhu;")
    private class76 field4194 = new class76(128);

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Lr;")
    private class110 field4192;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4195 = 0;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lgd;")
    public static class206 field4198;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "J")
    public static long field4199;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "Loj;")
    public static class235 field4196;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)Lds;")
    public final class12 method1741(int arg0, byte arg1) {
        field4193++;
        class76 var3 = this.field4194;
        class12 var4;
        synchronized (this.field4194) {
            var4 = (class12) this.field4194.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4192.method702((byte) 31, class377.method2315(true, arg0), class398.method2418(arg0, 704756328));
        class12 var6 = new class12();
        if (var5 != null) {
            var6.method78(-128, new class32(var5));
        }
        int var7 = 7 % ((-arg1 - 15) / 56);
        class76 var8 = this.field4194;
        synchronized (this.field4194) {
            this.field4194.method505((long) arg0, var6, 63);
            return var6;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lkb;III[Z)V")
    public static final void method1742(class449 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class312.field4112 == class221.field2945) {
            return;
        }
        int var5 = class289.field3896[arg1].method368(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class177 var7 = class289.field3896[var6];
                if (var7 != null) {
                    var7.method379(arg0, arg2, var5 - var7.method368(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Loe;B)V")
    public static final void method1743(class121 arg0, byte arg1) {
        field4191++;
        if (arg1 > -117) {
            method1745(13, -24);
        }
        for (class279 var2 = (class279) class94.field1395.method652((byte) 37); var2 != null; var2 = (class279) class94.field1395.method653(119)) {
            if (var2.field3698 == arg0) {
                if (var2.field3706 != null) {
                    class181.field2494.method2204(var2.field3706);
                    var2.field3706 = null;
                }
                var2.method2614((byte) -97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 != 0) {
            method1745(-6, 27);
        }
        field4196 = null;
        field4198 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        field4189++;
        class317.field4183 = arg0;
        class76 var2 = class480.field6631;
        synchronized (class480.field6631) {
            if (arg1 != 0) {
                field4196 = null;
            }
            class480.field6631.method495(-79);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZZ)I")
    public static final int method1746(int arg0, boolean arg1, boolean arg2) {
        field4188++;
        if (arg1) {
            return 0;
        }
        class257 var3 = class80.method525(arg1, -7967, arg0);
        if (var3 == null) {
            return class152.field2141.method27(arg0, 127).field4546;
        } else if (arg2) {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3418.length; var5++) {
                if (var3.field3418[var5] == -1) {
                    var4++;
                }
            }
            return var4 + class152.field2141.method27(arg0, 122).field4546 - var3.field3418.length;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([I[I[IILnh;)V")
    public static final void method1747(int[] arg0, int[] arg1, int[] arg2, int arg3, class487 arg4) {
        int var5 = 0;
        if (arg3 != 1) {
            return;
        }
        while (arg0.length > var5) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field1127.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1127[var9] = null;
                    } else {
                        class181 var10 = class395.field5477.method266(16107, var6);
                        int var11 = var10.field2470;
                        class298 var12 = arg4.field1127[var9];
                        if (var12 != null) {
                            if (var12.field3987 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1127[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3991 = 0;
                                    var12.field3992 = var8;
                                    var12.field3988 = 0;
                                    var12.field3990 = 1;
                                    var12.field3989 = 0;
                                    class402.method2437(var10, class233.field3103 == arg4, arg4.field6502, -119, arg4.field6501, arg4.field6507, 0);
                                } else if (var11 == 2) {
                                    var12.field3989 = 0;
                                }
                            } else if (var10.field2471 >= class395.field5477.method266(16107, var12.field3987).field2471) {
                                var12 = arg4.field1127[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class298 var13 = arg4.field1127[var9] = new class298();
                            var13.field3990 = 1;
                            var13.field3987 = var6;
                            var13.field3991 = 0;
                            var13.field3989 = 0;
                            var13.field3988 = 0;
                            var13.field3992 = var8;
                            class402.method2437(var10, class233.field3103 == arg4, arg4.field6502, -119, arg4.field6501, arg4.field6507, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field4187++;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class318(class329 arg0, int arg1, class110 arg2) {
        this.field4192 = arg2;
        if (this.field4192 != null) {
            int var4 = this.field4192.method705((byte) -111) - 1;
            this.field4192.method694(var4, (byte) 119);
        }
    }

    static {
        new class206("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field4197 = 0;
        field4198 = new class206("cyan:", "blaugrün:", "cyan:", "cyan:");
        field4199 = 0L;
    }
}
