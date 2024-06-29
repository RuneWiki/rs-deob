import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class497 extends class520 {

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    private int field6923 = 0;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lkg;")
    private class57 field6921 = new class57();

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ltt;")
    public static class312 field6922 = null;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[I")
    public static int[] field6929 = new int[14];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[[[Lrg;")
    public static class563[][][] field6933;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method2787(int arg0) {
        field6933 = null;
        field6929 = null;
        if (arg0 > -62) {
            method2787(-21);
        }
        field6922 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLrg;)V")
    public final void method756(byte arg0, class563 arg1) {
        super.field7241[super.field7249] = 21;
        ++field6926;
        super.field7239[super.field7249] = arg1;
        if (arg0 != 61) {
            field6929 = null;
        }
        ++super.field7249;
        if (~super.field7249 <= -5001) {
            super.field7249 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    public final void method760(int arg0, int arg1) {
        ++field6924;
        if (arg1 != 0) {
            field6922 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method757(int arg0, byte arg1) {
        super.field7241[super.field7249] = (byte) arg0;
        ++field6925;
        ++super.field7249;
        if (arg1 != 11) {
            this.method767((class563) null, (byte) -23);
        }
        if (~super.field7249 <= -5001) {
            super.field7249 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILrg;)V")
    public final void method758(int arg0, class563 arg1) {
        ++field6919;
        --super.field7237;
        if (~super.field7237 > -1) {
            super.field7237 = 4999;
        }
        super.field7241[super.field7237] = 21;
        super.field7239[super.field7237] = arg1;
        if (arg0 != 0) {
            field6929 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lrg;B)V")
    public final void method767(class563 arg0, byte arg1) {
        super.field7241[super.field7249] = 20;
        ++field6935;
        super.field7239[super.field7249] = arg0;
        ++super.field7249;
        if (super.field7249 >= 5000) {
            super.field7249 = 0;
        }
        int var3 = 47 % ((arg1 - 63) / 51);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static final void method2788(int arg0) {
        if (arg0 != -450) {
            field6933 = null;
        }
        ++field6934;
        class597.method3438((byte) 124, 10);
        class269.method1645(false);
        System.gc();
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    private final void method2789(boolean arg0) {
        ++field6920;
        if (arg0) {
            field6933 = null;
        }
        int var2 = super.field7237++;
        if (~super.field7237 <= -5001) {
            super.field7237 = 0;
        }
        this.field6923 = super.field7241[var2];
        Object var3 = super.field7239[var2];
        super.field7239[var2] = null;
        if (~this.field6923 == -22) {
            class98.method540(this.field6921, (class563) var3);
        } else if (~this.field6923 != -21) {
            if (~this.field6923 <= -31 && this.field6923 <= 33) {
                ((class544) var3).method1045(class155.field2012, class151.field1995, class257.field3199, class634.field9230, this.field6923 - 30 == 0);
            } else if (this.field6923 >= 40 && this.field6923 <= 43) {
                ((class544) var3).method1045(class155.field2012, class151.field1995, class257.field3199, class144.field1879, ~(this.field6923 + -40) == -1);
            } else if (~this.field6923 == -23) {
                class583.field8427.method905(-1, 1583160, 40, 127);
            } else {
                if (~this.field6923 != -24) {
                    if (this.field6923 == 24) {
                        class583.field8427.method972(0, (class592[]) null);
                        return;
                    }
                } else {
                    class583.field8427.method933();
                }
            }
        } else {
            class563 var4 = (class563) var3;
            if (var4.field7896 != null) {
                var4.field7896.method66(class583.field8427, 0);
            }
            if (var4.field7884 != null) {
                var4.field7884.method66(class583.field8427, 0);
            }
            if (var4.field7885 != null) {
                var4.field7885.method66(class583.field8427, 0);
            }
            if (var4.field7889 != null) {
                var4.field7889.method66(class583.field8427, 0);
            }
            if (var4.field7891 != null) {
                var4.field7891.method66(class583.field8427, 0);
            }
            for (class15 var5 = var4.field7894; var5 != null; var5 = var5.field158) {
                var5.field161.method66(class583.field8427, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIILsa;)V")
    public final void method763(boolean arg0, int arg1, int arg2, class544 arg3) {
        ++field6928;
        super.field7241[super.field7249] = (byte) (!arg0 ? arg1 + 30 : arg1 + 40);
        super.field7239[super.field7249] = arg3;
        ++super.field7249;
        if (arg2 != 13518) {
            method2790(-2);
        }
        if (~super.field7249 <= -5001) {
            super.field7249 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
    public static final int method2790(int arg0) {
        if (arg0 != 16) {
            field6922 = null;
        }
        ++field6930;
        return 16;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public final void method768(boolean arg0) {
        if (arg0) {
            ++field6927;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public final void method755(byte arg0) {
        while (~super.field7249 != ~super.field7237) {
            this.method2789(false);
        }
        if (arg0 >= -86) {
            this.method758(112, (class563) null);
        }
        ++field6932;
    }

    static {
        new class344("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
