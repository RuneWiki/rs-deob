import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class486 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public int field6831;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "[I")
    public int[] field6827;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "[I")
    public int[] field6830;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Z")
    public static boolean field6828 = false;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6829 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lo;")
    public static class332 field6832 = new class332("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field6833 = 0;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lsh;")
    public static class472 field6834 = new class472(39, 6);

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field6837 = -1;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2843(byte arg0) {
        if (arg0 < 101) {
            method2846(-125, -70L);
        }
        field6825++;
        if (!class228.method1484((byte) 65)) {
            return;
        }
        if (class362.field5480 == null) {
            class237.method1540((byte) -28);
        }
        class64.field885 = true;
        class321.field4796 = 0;
        class35.field441 = new int[100];
        class450.field6362 = new boolean[100];
        class285.field4359 = new int[100];
        class245.field3502 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class245.field3502[var1] = (int) ((double) class342.field5115 * Math.random());
            class285.field4359[var1] = (int) (Math.random() * 350.0D);
            class35.field441[var1] = (int) (Math.random() * 102.0D);
            class450.field6362[var1] = Math.random() < 0.5D;
        }
        try {
            class373.field5603 = class312.field4712.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method2844(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6826++;
        class186 var5 = class275.method1789(arg2, (byte) 123, arg3);
        var5.method1285(arg3 - 10);
        var5.field2829 = arg1;
        var5.field2819 = arg0;
        var5.field2813 = arg4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIII)V", line = 60)
    public static final void method2845(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -28 / ((arg0 + 60) / 55);
        field6823++;
        class186 var6 = class275.method1789(arg1, (byte) 123, 8);
        var6.method1285(0);
        var6.field2819 = arg3;
        var6.field2813 = arg4;
        var6.field2829 = arg2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IJ)V", line = 77)
    public static final void method2846(int arg0, long arg1) {
        class230.field3390.field6315 = 0;
        int var3 = 25 / ((arg0 - 53) / 58);
        field6824++;
        class230.field3390.method2619((byte) 126, class109.field1543.field2407);
        class230.field3390.method2581(-1973283408, arg1);
        class6.field95 = 0;
        class78.field1095 = 1;
        class412.field5947 = 0;
        class309.field4619 = -3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 94)
    public static void method2847(int arg0) {
        int var1 = -7 % ((-arg0 - 75) / 35);
        field6834 = null;
        field6829 = null;
        field6832 = null;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V", line = 122)
    public class486(int arg0) {
        this.field6831 = arg0;
        this.field6827 = new int[this.field6831];
        this.field6830 = new int[this.field6831];
    }
}
