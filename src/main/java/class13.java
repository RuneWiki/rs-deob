import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class13 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ltl;")
    private class400 field182 = new class400(64);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Ltl;")
    public class400 field192 = new class400(2);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lui;")
    private class451 field187;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lui;")
    public class451 field184;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lsh;")
    public static class472 field189;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lsh;")
    public static class472 field193;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lct;")
    public static class285 field194;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lgp;")
    public static class430 field195;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
    public final void method125(byte arg0, int arg1) {
        class400 var3 = this.field182;
        synchronized (this.field182) {
            int var4 = -18 % ((arg0 - 53) / 58);
            this.field182.method2389(false, arg1);
        }
        field188++;
        class400 var5 = this.field192;
        synchronized (this.field192) {
            this.field192.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)Lkb;")
    public final class130 method126(byte arg0, int arg1) {
        field185++;
        class400 var3 = this.field182;
        class130 var4;
        synchronized (this.field182) {
            var4 = (class130) this.field182.method2393(-117, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field187.method2691(arg1, 33, 0);
        class130 var6 = new class130();
        var6.field1813 = this;
        if (var5 != null) {
            var6.method902(new class446(var5), (byte) -92);
        }
        class400 var7 = this.field182;
        synchronized (this.field182) {
            if (arg0 != 14) {
                method132(48);
            }
            this.field182.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public static final void method127(int arg0, int arg1, int arg2) {
        boolean var3 = class170.field2427[0][arg1][arg2] != null && class170.field2427[0][arg1][arg2].field5062 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class170.field2427[var4][arg1][arg2] == null) {
                class337 var5 = class170.field2427[var4][arg1][arg2] = new class337(var4, arg1, arg2);
                if (var3) {
                    var5.field5051++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lfc;")
    public static final class239 method128(int arg0, byte arg1) {
        field186++;
        if (arg1 < 9) {
            field193 = null;
        }
        if (arg0 == 0) {
            if ((double) class189.field2890 == 3.0D) {
                return class95.field1362;
            }
            if ((double) class189.field2890 == 4.0D) {
                return class441.field6231;
            }
            if ((double) class189.field2890 == 6.0D) {
                return class5.field88;
            }
            if ((double) class189.field2890 >= 8.0D) {
                return class99.field1406;
            }
        } else if (arg0 == 1) {
            if ((double) class189.field2890 == 3.0D) {
                return class5.field88;
            }
            if ((double) class189.field2890 == 4.0D) {
                return class99.field1406;
            }
            if ((double) class189.field2890 == 6.0D) {
                return class337.field5042;
            }
            if ((double) class189.field2890 >= 8.0D) {
                return class128.field1785;
            }
        } else if (arg0 == 2) {
            if ((double) class189.field2890 == 3.0D) {
                return class337.field5042;
            }
            if ((double) class189.field2890 == 4.0D) {
                return class128.field1785;
            }
            if ((double) class189.field2890 == 6.0D) {
                return class71.field959;
            }
            if ((double) class189.field2890 >= 8.0D) {
                return class301.field4487;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 <= 54) {
            field195 = null;
        }
        field190++;
        class400 var2 = this.field182;
        synchronized (this.field182) {
            this.field182.method2401((byte) -56);
        }
        class400 var3 = this.field192;
        synchronized (this.field192) {
            this.field192.method2401((byte) -48);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method130(byte arg0) {
        field183++;
        class400 var2 = this.field182;
        synchronized (this.field182) {
            this.field182.method2388(-56);
        }
        if (arg0 < -119) {
            class400 var3 = this.field192;
            synchronized (this.field192) {
                this.field192.method2388(120);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method131(int arg0) {
        field193 = null;
        field194 = null;
        field195 = null;
        if (arg0 == 0) {
            field189 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method132(int arg0) {
        field191++;
        class301.field4488 = 0;
        int var1 = (class472.field6622.field4543 >> 7) + class68.field922;
        int var2 = (class472.field6622.field4538 >> 7) + class468.field6588;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class301.field4488 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class301.field4488 = 1;
        }
        if (arg0 == 1 && class301.field4488 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class301.field4488 = 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lgp;ILui;Lui;)V")
    public class13(class430 arg0, int arg1, class451 arg2, class451 arg3) {
        this.field187 = arg2;
        this.field184 = arg3;
        this.field187.method2662(33, (byte) -7);
    }

    static {
        new class332(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field189 = new class472(28, -2);
        field193 = new class472(70, -1);
        field194 = new class285(62, 7);
        field195 = new class430("runescape", 0);
    }
}
