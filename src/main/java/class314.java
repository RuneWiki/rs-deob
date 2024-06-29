import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class314 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "J")
    public long field4680;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lbt;")
    private class33 field4681;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lbd;")
    public static class44 field4683 = new class44("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Lqt;")
    public static class459 field4686;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field4685;

    static {
        new class44("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field4686 = new class459(7, -1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([[[Lmm;I)V", line = 5)
    public static final void method1991(class188[][][] arg0, int arg1) {
        field4678++;
        int var2 = 0;
        if (arg1 != 22034) {
            method1993(87, -42, -105);
        }
        while (arg0.length > var2) {
            class188[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class188 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2756 instanceof class534) {
                            ((class534) var6.field2756).method548(-72);
                        }
                        if (var6.field2755 instanceof class534) {
                            ((class534) var6.field2755).method548(-84);
                        }
                        if (var6.field2774 instanceof class534) {
                            ((class534) var6.field2774).method548(-100);
                        }
                        if (var6.field2764 instanceof class534) {
                            ((class534) var6.field2764).method548(31);
                        }
                        if (var6.field2751 instanceof class534) {
                            ((class534) var6.field2751).method548(5);
                        }
                        for (class317 var7 = var6.field2773; var7 != null; var7 = var7.field4709) {
                            class478 var8 = var7.field4711;
                            if (var8 instanceof class534) {
                                ((class534) var8).method548(35);
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 82)
    public static void method1992(byte arg0) {
        field4683 = null;
        field4686 = null;
        if (arg0 <= 51) {
            method1991(null, -86);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lbt;JI)V", line = 94)
    public class314(class33 arg0, long arg1, int arg2) {
        this.field4680 = arg1;
        this.field4681 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        field4685++;
        this.field4681.method248((byte) -3, this.field4680);
        super.finalize();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V", line = 124)
    public static final void method1993(int arg0, int arg1, int arg2) {
        field4684++;
        class275 var3 = class213.method1433((byte) 122, arg1, arg2);
        var3.method1778(0);
        var3.field4113 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 137)
    public static final void method1994(byte arg0) {
        if (arg0 != 104) {
            method1993(-83, 81, -84);
        }
        class126.field1984.method2990((byte) -77);
        field4682++;
    }
}
