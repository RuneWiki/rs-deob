import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class476 {

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Lh;")
    private class571 field6703 = new class571(64);

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lan;")
    private class21 field6698;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
    public static int[] field6701 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[Laca;")
    public static class620[] field6697 = new class620[75];

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Lej;")
    public static class104 field6704 = new class104("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Ldv;")
    public static class566 field6707 = new class566(45, 8);

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lej;")
    public static class104 field6708 = new class104("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "[I")
    public static int[] field6709 = new int[5];

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "[Z")
    public static boolean[] field6710 = new boolean[8];

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "J")
    public static long field6711;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public final void method2771(byte arg0) {
        field6700++;
        class571 var2 = this.field6703;
        synchronized (this.field6703) {
            this.field6703.method3246(false);
        }
        int var3 = -91 % ((-arg0 - 3) / 60);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static void method2772(boolean arg0) {
        if (arg0) {
            field6708 = null;
        }
        field6710 = null;
        field6704 = null;
        field6701 = null;
        field6709 = null;
        field6707 = null;
        field6708 = null;
        field6697 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method2773(int arg0) {
        class571 var2 = this.field6703;
        synchronized (this.field6703) {
            this.field6703.method3248(0);
        }
        field6705++;
        if (arg0 != 8) {
            method2772(true);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lqu;")
    public final class81 method2774(int arg0, int arg1) {
        field6702++;
        class571 var3 = this.field6703;
        class81 var4;
        synchronized (this.field6703) {
            var4 = (class81) this.field6703.method3252((long) arg0, (byte) 37);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field6698;
        byte[] var6;
        synchronized (this.field6698) {
            var6 = this.field6698.method240(35, arg0, (byte) -124);
        }
        class81 var7 = new class81();
        if (var6 != null) {
            var7.method626(new class11(var6), (byte) 127);
        }
        var7.method627(-14814);
        class571 var8 = this.field6703;
        synchronized (this.field6703) {
            this.field6703.method3243(var7, (long) arg0, -93);
            int var9 = 120 / ((64 - arg1) / 51);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V")
    public final void method2775(int arg0, int arg1) {
        class571 var3 = this.field6703;
        synchronized (this.field6703) {
            this.field6703.method3253(arg1, -121);
        }
        if (arg0 == 5) {
            field6699++;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Lfq;")
    public static final class171 method2776(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class171 var4 = var3.field8974;
            var3.field8974 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class476(class111 arg0, int arg1, class21 arg2) {
        this.field6698 = arg2;
        if (this.field6698 != null) {
            this.field6698.method231(35, -117);
        }
    }
}
