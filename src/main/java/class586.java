import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class586 {

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "Lwg;")
    private class58 field8495 = new class58(64);

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Lwg;")
    public class58 field8499 = new class58(50);

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "Ljk;")
    public class170 field8503 = new class170(250);

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "Ljh;")
    private class555 field8504 = new class555();

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public int field8483;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lkr;")
    public class329 field8486;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Lkr;")
    private class329 field8494;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
    private boolean field8497;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "Lwt;")
    private class24 field8506;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public int field8493;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field8508;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field8505;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "[B")
    public static byte[] field8490 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field8501 = 765;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Z")
    public static boolean field8498 = false;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lim;")
    public static class353 field8485 = new class353(60, -1);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public int field8507;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;ZIIILnl;ILra;Lqa;ZIB)Lha;")
    public final class116 method3382(class167 arg0, boolean arg1, int arg2, int arg3, int arg4, class534 arg5, int arg6, class262 arg7, class167 arg8, boolean arg9, int arg10, byte arg11) {
        field8502++;
        class116 var13 = this.method3387(arg0, arg10, arg6, arg2, arg5, arg4, -1751, arg3);
        if (var13 != null) {
            return var13;
        } else if (arg11 == 1) {
            class456 var14 = this.method3391(arg11 - 1, arg10);
            if (arg4 > 1 && var14.field6507 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg4 >= var14.field6493[var16] && var14.field6493[var16] != 0) {
                        var15 = var14.field6507[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method3391(0, var15);
                }
            }
            int[] var17 = var14.method2656(arg0, arg7, arg8, 119, arg2, arg3, arg5, arg4, arg6, arg9);
            if (var17 == null) {
                return null;
            }
            class116 var18;
            if (arg1) {
                var18 = arg8.method976(var17, 0, 36, 36, 32);
            } else {
                var18 = arg0.method976(var17, 0, 36, 36, 32);
            }
            if (!arg1) {
                class555 var19 = new class555();
                var19.field7764 = arg3;
                var19.field7760 = arg0.field2115;
                var19.field7761 = arg2;
                var19.field7763 = arg10;
                var19.field7767 = arg5 != null;
                var19.field7769 = arg6;
                var19.field7759 = arg4;
                this.field8503.method1030(var19, -16335, var18);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
    public final void method3383(int arg0, int arg1) {
        field8491++;
        class58 var3 = this.field8495;
        synchronized (this.field8495) {
            this.field8495.method320(arg0, arg1 - 306674913);
        }
        class58 var4 = this.field8499;
        synchronized (this.field8499) {
            if (arg1 != 1) {
                this.field8506 = null;
            }
            this.field8499.method320(arg0, -306674912);
        }
        class170 var5 = this.field8503;
        synchronized (this.field8503) {
            this.field8503.method1024(arg0, arg1 + 7);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
    public final void method3384(int arg0, int arg1) {
        field8487++;
        this.field8507 = arg0;
        class58 var3 = this.field8499;
        synchronized (this.field8499) {
            if (arg1 == 0) {
                this.field8499.method315(1);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method3385(int arg0) {
        field8490 = null;
        if (arg0 == 0) {
            field8485 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public final void method3386(int arg0) {
        field8500++;
        class58 var2 = this.field8499;
        synchronized (this.field8499) {
            this.field8499.method315(1);
            if (arg0 != 0) {
                this.field8495 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lqa;IIILnl;III)Lha;")
    public final class116 method3387(class167 arg0, int arg1, int arg2, int arg3, class534 arg4, int arg5, int arg6, int arg7) {
        field8489++;
        this.field8504.field7759 = arg5;
        this.field8504.field7763 = arg1;
        this.field8504.field7760 = arg0.field2115;
        this.field8504.field7767 = arg4 != null;
        this.field8504.field7761 = arg3;
        this.field8504.field7769 = arg2;
        this.field8504.field7764 = arg7;
        if (arg6 != -1751) {
            field8501 = 114;
        }
        return (class116) this.field8503.method1021(105, this.field8504);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public final void method3388(boolean arg0) {
        class170 var2 = this.field8503;
        synchronized (this.field8503) {
            this.field8503.method1023(arg0);
        }
        field8496++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZZ)V")
    public final void method3389(boolean arg0, boolean arg1) {
        field8484++;
        if (!arg1) {
            this.method3386(-112);
        }
        if (this.field8497 != arg0) {
            this.field8497 = arg0;
            this.method3392(36);
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public final void method3390(int arg0) {
        class58 var2 = this.field8495;
        synchronized (this.field8495) {
            int var3 = 30 % ((arg0 + 70) / 52);
            this.field8495.method317((byte) 21);
        }
        field8488++;
        class58 var4 = this.field8499;
        synchronized (this.field8499) {
            this.field8499.method317((byte) 21);
        }
        class170 var5 = this.field8503;
        synchronized (this.field8503) {
            this.field8503.method1026(0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(II)Liba;")
    public final class456 method3391(int arg0, int arg1) {
        field8482++;
        class58 var3 = this.field8495;
        class456 var4;
        synchronized (this.field8495) {
            var4 = (class456) this.field8495.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field8494;
        byte[] var6;
        synchronized (this.field8494) {
            var6 = this.field8494.method2054(true, class520.method2896(13945, arg1), class556.method3115(arg1, (byte) 109));
        }
        class456 var7 = new class456();
        var7.field6480 = arg1;
        var7.field6503 = this;
        var7.field6522 = new String[] { null, null, class362.field5079.method2157(this.field8483, 4074), null, null };
        var7.field6461 = new String[] { null, null, null, null, class443.field6127.method2157(this.field8483, arg0 + 4074) };
        if (var6 != null) {
            var7.method2649(new class551(var6), true);
        }
        var7.method2639(arg0 - 12874);
        if (var7.field6484 != -1) {
            var7.method2648(this.method3391(0, var7.field6484), this.method3391(0, var7.field6481), arg0 + 1);
        }
        if (~var7.field6514 != arg0) {
            var7.method2641(this.method3391(arg0, var7.field6514), this.method3391(arg0, var7.field6479), (byte) -89);
        }
        if (!this.field8497 && var7.field6447) {
            var7.field6471 = class355.field4963.method2157(this.field8483, 4074);
            var7.field6461 = this.field8505;
            var7.field6504 = false;
            var7.field6491 = null;
            var7.field6473 = 0;
            var7.field6522 = this.field8508;
            if (var7.field6524 != null) {
                boolean var8 = false;
                for (class108 var9 = var7.field6524.method3473(-27089); var9 != null; var9 = var7.field6524.method3478((byte) 5)) {
                    class360 var10 = this.field8506.method151((int) var9.field1401, -111);
                    if (var10.field5021) {
                        var9.method589(arg0 ^ 0xFFFFDD50);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field6524 = null;
                }
            }
        }
        class58 var11 = this.field8495;
        synchronized (this.field8495) {
            this.field8495.method316((long) arg1, (byte) -126, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
    public final void method3392(int arg0) {
        field8492++;
        class58 var2 = this.field8495;
        synchronized (this.field8495) {
            this.field8495.method315(1);
        }
        class58 var3 = this.field8499;
        synchronized (this.field8499) {
            if (arg0 != 36) {
                this.method3391(35, -91);
            }
            this.field8499.method315(1);
        }
        class170 var4 = this.field8503;
        synchronized (this.field8503) {
            this.field8503.method1023(false);
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lg;IZLwt;Lkr;Lkr;)V")
    public class586(class513 arg0, int arg1, boolean arg2, class24 arg3, class329 arg4, class329 arg5) {
        this.field8483 = arg1;
        this.field8486 = arg5;
        this.field8494 = arg4;
        this.field8497 = arg2;
        this.field8506 = arg3;
        if (this.field8494 == null) {
            this.field8493 = 0;
        } else {
            int var7 = this.field8494.method2046((byte) 64) - 1;
            this.field8493 = this.field8494.method2064(0, var7) + var7 * 256;
        }
        this.field8508 = new String[] { null, null, class362.field5079.method2157(this.field8483, 4074), null, null };
        this.field8505 = new String[] { null, null, null, null, class443.field6127.method2157(this.field8483, 4074) };
    }
}
