import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class25 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
    public boolean field366 = false;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ljo;")
    private class382 field364 = new class382(64);

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Ljo;")
    public class382 field376 = new class382(500);

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Ljo;")
    public class382 field378 = new class382(30);

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Ljo;")
    public class382 field379 = new class382(50);

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lok;")
    private class74 field369;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Z")
    public boolean field367;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lok;")
    public class74 field361;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
    public static int[] field373 = new int[50];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lec;")
    public static class109 field375;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lmb;")
    public static class225 field372;

    static {
        new class347("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 5)
    public final void method246(int arg0, int arg1) {
        this.field380 = arg1;
        field377++;
        class382 var3 = this.field376;
        synchronized (this.field376) {
            if (arg0 != 50) {
                return;
            }
            this.field376.method2293(false);
        }
        class382 var4 = this.field378;
        synchronized (this.field378) {
            this.field378.method2293(false);
        }
        class382 var5 = this.field379;
        synchronized (this.field379) {
            this.field379.method2293(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V", line = 29)
    public final void method247(int arg0, int arg1) {
        class382 var3 = this.field364;
        synchronized (this.field364) {
            this.field364.method2294(arg1, true);
        }
        field365++;
        class382 var4 = this.field376;
        synchronized (this.field376) {
            this.field376.method2294(arg1, true);
            if (arg0 > -39) {
                this.method251(11);
            }
        }
        class382 var5 = this.field378;
        synchronized (this.field378) {
            this.field378.method2294(arg1, true);
        }
        class382 var6 = this.field379;
        synchronized (this.field379) {
            this.field379.method2294(arg1, true);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)Lpf;", line = 51)
    public final class486 method248(int arg0, int arg1) {
        field362++;
        class382 var3 = this.field364;
        class486 var4;
        synchronized (this.field364) {
            var4 = (class486) this.field364.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 30) {
            this.method246(45, -124);
        }
        class74 var5 = this.field369;
        byte[] var6;
        synchronized (this.field369) {
            var6 = this.field369.method541(class316.method1980(arg0, 0), class18.method206(arg0, true), (byte) -122);
        }
        class486 var7 = new class486();
        var7.field7207 = arg0;
        var7.field7154 = this;
        if (var6 != null) {
            var7.method2898(new class468(var6), (byte) 34);
        }
        var7.method2892((byte) -77);
        if (var7.field7166) {
            var7.field7234 = 0;
            var7.field7192 = false;
        }
        if (!this.field367 && var7.field7243) {
            var7.field7151 = null;
            var7.field7227 = null;
        }
        class382 var8 = this.field364;
        synchronized (this.field364) {
            this.field364.method2290((long) arg0, var7, 109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 98)
    public final void method249(int arg0) {
        field368++;
        class382 var2 = this.field364;
        synchronized (this.field364) {
            this.field364.method2287(81);
        }
        class382 var3 = this.field376;
        synchronized (this.field376) {
            this.field376.method2287(112);
        }
        class382 var4 = this.field378;
        synchronized (this.field378) {
            this.field378.method2287(100);
            if (arg0 != 50) {
                this.field378 = null;
            }
        }
        class382 var5 = this.field379;
        synchronized (this.field379) {
            this.field379.method2287(70);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V", line = 122)
    public final void method250(int arg0, boolean arg1) {
        field371++;
        if (arg1 == this.field366) {
            return;
        }
        this.field366 = arg1;
        if (arg0 != -1151) {
            this.field361 = null;
        }
        this.method251(-28708);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 138)
    public final void method251(int arg0) {
        field374++;
        if (arg0 != -28708) {
            this.field366 = true;
        }
        class382 var2 = this.field364;
        synchronized (this.field364) {
            this.field364.method2293(false);
        }
        class382 var3 = this.field376;
        synchronized (this.field376) {
            this.field376.method2293(false);
        }
        class382 var4 = this.field378;
        synchronized (this.field378) {
            this.field378.method2293(false);
        }
        class382 var5 = this.field379;
        synchronized (this.field379) {
            this.field379.method2293(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)V", line = 164)
    public final void method252(int arg0, int arg1) {
        this.field364 = new class382(arg1);
        if (arg0 != 23062) {
            this.method254(-26, false);
        }
        field363++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 175)
    public static void method253(byte arg0) {
        if (arg0 == 54) {
            field375 = null;
            field372 = null;
            field373 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lkr;IZLok;Lok;)V", line = 235)
    public class25(class262 arg0, int arg1, boolean arg2, class74 arg3, class74 arg4) {
        this.field369 = arg3;
        this.field367 = arg2;
        this.field361 = arg4;
        if (this.field369 != null) {
            int var6 = this.field369.method535((byte) 117) - 1;
            this.field369.method536(false, var6);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IZ)V", line = 192)
    public final void method254(int arg0, boolean arg1) {
        field370++;
        if (this.field367 != arg1 && arg0 == 50) {
            this.field367 = arg1;
            this.method251(-28708);
        }
    }
}
