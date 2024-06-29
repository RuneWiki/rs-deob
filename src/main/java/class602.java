import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class602 {

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lhp;")
    private class277 field8790 = new class277(64);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lkea;")
    private class203 field8788;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field8781 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    public static int[] field8783 = new int[32];

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lkp;")
    public static class421 field8784 = new class421(3);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public final void method3490(int arg0) {
        class277 var2 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method1810(false);
        }
        field8786++;
        if (arg0 != 3) {
            field8784 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)I")
    public static final int method3491(int arg0, int arg1, byte arg2) {
        field8780++;
        if (arg1 == 1 || arg1 == 3) {
            return class630.field9091[arg0 & 0x3];
        } else {
            if (arg2 >= -34) {
                field8783 = null;
            }
            return class547.field7830[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
    public final void method3492(byte arg0, int arg1) {
        field8782++;
        class277 var3 = this.field8790;
        synchronized (this.field8790) {
            if (arg0 > -31) {
                field8783 = null;
            }
            this.field8790.method1811((byte) 119, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)V")
    public static final void method3493(byte arg0, int arg1) {
        if (class399.field6056 == null) {
            class399.field6056 = new byte[4][class90.field1032][class30.field349];
        }
        field8789++;
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class90.field1032; var3++) {
                for (int var4 = 0; var4 < class30.field349; var4++) {
                    class399.field6056[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static final void method3494(boolean arg0) {
        class468.field6960.method1223(true, class327.field4710.method1296((byte) 111));
        field8787++;
        class468.field6960.method1223(true, class581.field8364.method1296((byte) 105));
        class468.field6960.method1223(true, class195.field2652.method1296((byte) 98));
        class468.field6960.method1223(true, class330.field4747.method1296((byte) 124));
        class468.field6960.method1223(true, class573.field8275.method1296((byte) 111));
        class468.field6960.method1223(true, class647.field9367.method1296((byte) 98));
        class468.field6960.method1223(true, class150.field1846.method1296((byte) 97));
        class468.field6960.method1223(true, class30.field345.method1296((byte) 104));
        class468.field6960.method1223(true, class319.field4621.method1296((byte) 112));
        class468.field6960.method1223(true, class224.field3163.method1296((byte) 106));
        class468.field6960.method1223(true, class97.field1140.method1296((byte) 114));
        class468.field6960.method1223(true, class498.field7254.method1296((byte) 110));
        class468.field6960.method1223(true, class656.field9485.method1296((byte) 122));
        class468.field6960.method1223(true, class227.field3191.method1296((byte) 97));
        class468.field6960.method1223(true, class110.field1356.method1296((byte) 109));
        class468.field6960.method1223(true, class585.field8407.method1296((byte) 106));
        class468.field6960.method1223(true, class434.field6438.method1296((byte) 113));
        class468.field6960.method1223(true, class459.field6852.method1296((byte) 123));
        class468.field6960.method1223(true, class359.field5094.method1296((byte) 111));
        class468.field6960.method1223(true, class345.field4942.method1296((byte) 106));
        if (arg0) {
            method3496((byte) 118);
        }
        class468.field6960.method1223(true, class290.field4010.method1296((byte) 108));
        class468.field6960.method1223(true, class345.field4945.method1296((byte) 103));
        class468.field6960.method1223(true, class39.field427.method1296((byte) 97));
        class468.field6960.method1223(true, class144.field1770.method1296((byte) 123));
        class468.field6960.method1223(true, class557.field7928.method1296((byte) 113));
        class468.field6960.method1223(true, class626.field9049.method1296((byte) 126));
        class468.field6960.method1223(true, class310.field4565.method1296((byte) 117));
        class468.field6960.method1223(true, class449.field6713.method1296((byte) 127));
        class468.field6960.method1223(true, class456.field6834.method1296((byte) 110));
        class468.field6960.method1223(true, class289.field4007.method1296((byte) 121));
        class468.field6960.method1223(true, class142.field1753.method1296((byte) 127));
        class468.field6960.method1223(true, class73.field780.method1296((byte) 123));
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lqe;")
    public final class403 method3495(int arg0, int arg1) {
        field8785++;
        class277 var3 = this.field8790;
        class403 var4;
        synchronized (this.field8790) {
            var4 = (class403) this.field8790.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 3) {
            class203 var5 = this.field8788;
            byte[] var6;
            synchronized (this.field8788) {
                var6 = this.field8788.method1286(arg1, 11, (byte) -49);
            }
            class403 var7 = new class403();
            if (var6 != null) {
                var7.method2565(new class194(var6), 68);
            }
            class277 var8 = this.field8790;
            synchronized (this.field8790) {
                this.field8790.method1808((long) arg1, var7, (byte) -7);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method3496(byte arg0) {
        field8783 = null;
        field8784 = null;
        if (arg0 < 80) {
            method3496((byte) 7);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public final void method3497(byte arg0) {
        class277 var2 = this.field8790;
        synchronized (this.field8790) {
            this.field8790.method1805(57);
            if (arg0 >= -108) {
                field8784 = null;
            }
        }
        field8791++;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class602(class149 arg0, int arg1, class203 arg2) {
        this.field8788 = arg2;
        if (this.field8788 != null) {
            this.field8788.method1309(1675886592, 11);
        }
    }

    static {
        new class474("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }
}
