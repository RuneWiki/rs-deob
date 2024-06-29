import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class468 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljr;")
    private class112 field6561 = new class112(128);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lin;")
    private class91 field6564;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public static int[] field6569 = new int[14];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Ltm;")
    public static class391 field6565;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lga;)V", line = 4)
    public static final void method2749(class404 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class404 var2 = null;
            for (class404 var3 = class362.field5206[var1]; var3 != null; var3 = var3.field5924) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class362.field5206[var1] = var3.field5924;
                    } else {
                        var2.field5924 = var3.field5924;
                    }
                    class30.field778 = true;
                    return;
                }
                var2 = var3;
            }
            class404 var4 = null;
            for (class404 var5 = class391.field5762[var1]; var5 != null; var5 = var5.field5924) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class391.field5762[var1] = var5.field5924;
                    } else {
                        var4.field5924 = var5.field5924;
                    }
                    class30.field778 = true;
                    return;
                }
                var4 = var5;
            }
            class404 var6 = null;
            for (class404 var7 = class375.field5310[var1]; var7 != null; var7 = var7.field5924) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class375.field5310[var1] = var7.field5924;
                    } else {
                        var6.field5924 = var7.field5924;
                    }
                    class30.field778 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 82)
    public final void method2750(int arg0) {
        field6560++;
        if (arg0 != 2) {
            method2749(null);
        }
        class112 var2 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method996(-125);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 95)
    public static void method2751(int arg0) {
        field6565 = null;
        field6569 = null;
        if (arg0 != 14) {
            method2755(99, -102);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z", line = 106)
    public static final boolean method2752(int arg0, int arg1, int arg2) {
        field6562++;
        return arg0 == 4 ? class21.method166(arg2, arg1, (byte) 126) & class85.method819(arg1, 46, arg2) : true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Lhk;", line = 125)
    public final class103 method2753(boolean arg0, int arg1) {
        field6563++;
        if (!arg0) {
            return null;
        }
        class112 var3 = this.field6561;
        class103 var4;
        synchronized (this.field6561) {
            var4 = (class103) this.field6561.method992((long) arg1, 77);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field6564;
        byte[] var6;
        synchronized (this.field6564) {
            var6 = this.field6564.method863(-1860, 1, arg1);
        }
        class103 var7 = new class103();
        if (var6 != null) {
            var7.method945(new class215(var6), -1);
        }
        class112 var8 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method991(var7, (long) arg1, (byte) -124);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 154)
    public final void method2754(boolean arg0) {
        class112 var2 = this.field6561;
        synchronized (this.field6561) {
            if (!arg0) {
                method2755(-96, 76);
            }
            this.field6561.method999(0);
        }
        field6568++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 170)
    public static final int method2755(int arg0, int arg1) {
        field6566++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 != -6409) {
                field6569 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V", line = 205)
    public final void method2756(int arg0, int arg1) {
        field6570++;
        class112 var3 = this.field6561;
        synchronized (this.field6561) {
            this.field6561.method987(2, arg1);
        }
        if (arg0 != 32841) {
            field6567 = 86;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 220)
    public class468(class460 arg0, int arg1, class91 arg2) {
        this.field6564 = arg2;
        this.field6564.method860(0, 1);
    }
}
