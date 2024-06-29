import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class219 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lqk;")
    public static class207 field3859 = class24.method212(255, "<img=1>");

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lqk;")
    public static class207 field3862 = class24.method212(255, "details");

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lqk;")
    private static class207 field3864 = class24.method212(255, "slide:");

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lqk;")
    public static class207 field3860 = field3864;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3865 = -1;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lqk;")
    public static class207 field3866 = field3864;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lqk;")
    public static class207 field3871 = class24.method212(255, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3868;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class219() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BLv;I)V")
    public final void method1552(byte[] arg0, class149 arg1, int arg2) {
        field3869++;
        if (arg2 != 1) {
            method1556((class235) null, -29, -40, -97);
        }
        if (arg1.field2568[arg1.field2593] != 31 || arg1.field2568[arg1.field2593 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3868 == null) {
            this.field3868 = new Inflater(true);
        }
        try {
            this.field3868.setInput(arg1.field2568, arg1.field2593 + 10, -arg1.field2593 + -10 + -8 + arg1.field2568.length);
            this.field3868.inflate(arg0);
        } catch (Exception var4) {
            this.field3868.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3868.reset();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method1553(int arg0) {
        field3858++;
        if (!class4.field71) {
            return;
        }
        class220 var1 = class108.method782((byte) 112, class231.field4236, class13.field176);
        if (var1 != null && var1.field3880 != null) {
            class206 var2 = new class206();
            var2.field3616 = var1.field3880;
            var2.field3614 = var1;
            class69.method501(76, var2);
        }
        class4.field71 = false;
        int var3 = 6 % ((arg0 + 46) / 49);
        class175.field3166 = -1;
        class82.method614((byte) 114, var1);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method1554(int arg0) {
        if (arg0 != -4) {
            method1556((class235) null, 37, 39, 125);
        }
        field3866 = null;
        field3864 = null;
        field3859 = null;
        field3871 = null;
        field3862 = null;
        field3860 = null;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static final void method1555(int arg0) {
        if (arg0 > -18) {
            field3860 = null;
        }
        class86.field1566.method1382(31346);
        field3870++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldc;III)V")
    public static final void method1556(class235 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class225.field4104) {
            class174 var4 = class82.field1498[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3152 != null && var4.field3152.field4465.method1506()) {
                arg0.method1489(var4.field3152.field4465, 128, 0, 0, true);
            }
        }
        if (arg3 < class225.field4104) {
            class174 var5 = class82.field1498[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3152 != null && var5.field3152.field4465.method1506()) {
                arg0.method1489(var5.field3152.field4465, 0, 0, 128, true);
            }
        }
        if (arg2 < class225.field4104 && arg3 < class279.field4908) {
            class174 var6 = class82.field1498[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3152 != null && var6.field3152.field4465.method1506()) {
                arg0.method1489(var6.field3152.field4465, 128, 0, 128, true);
            }
        }
        if (arg2 < class225.field4104 && arg3 > 0) {
            class174 var7 = class82.field1498[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3152 != null && var7.field3152.field4465.method1506()) {
                arg0.method1489(var7.field3152.field4465, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
    private class219(int arg0, int arg1, int arg2) {
    }
}
