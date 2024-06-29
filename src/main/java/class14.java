import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 implements class476 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lfe;")
    private class384 field210 = new class384(128);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[I")
    private int[] field206 = new int[class503.field7685.field2643];

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[I")
    public int[] field209 = new int[class503.field7685.field2643];

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[J")
    public static long[] field213;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Lwt;")
    public static class194 field214;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[I")
    public static int[] field219;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)I")
    public final int method101(int arg0, boolean arg1) {
        field208++;
        int var3 = 4 / ((-arg0 - 22) / 40);
        long var4 = class109.method653(false);
        for (class20 var6 = arg1 ? (class20) this.field210.method2316(4999) : (class20) this.field210.method2308((byte) 125); var6 != null; var6 = (class20) this.field210.method2308((byte) 120)) {
            if (var4 > (var6.field282 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field282 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field1177;
                    this.field209[var7] = this.field206[var7];
                    var6.method536(false);
                    return var7;
                }
                var6.method536(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
    public final void method102(byte arg0, int arg1, int arg2) {
        if (arg0 != -32) {
            return;
        }
        this.field209[arg2] = arg1;
        field212++;
        class20 var4 = (class20) this.field210.method2310((byte) -69, (long) arg2);
        if (var4 == null) {
            class20 var5 = new class20(class109.method653(false) + 500L);
            this.field210.method2317(-1, (long) arg2, var5);
        } else {
            var4.field282 = class109.method653(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static final void method103(byte arg0) {
        field217++;
        int[] var1 = new int[class405.field5947.field2619];
        if (arg0 > -38) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class405.field5947.field2619; var3++) {
            class361 var5 = class405.field5947.method1162(var3, 0);
            if (var5.field5393 >= 0 || var5.field5356 >= 0) {
                var1[var2++] = var3;
            }
        }
        class308.field4470 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class308.field4470[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field214 = null;
        field219 = null;
        if (arg0 != 109) {
            field219 = null;
        }
        field213 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        field218++;
        class470 var4 = class78.field1102.method440((byte) -92, arg1);
        int var5 = var4.field6794;
        if (arg0 >= -19) {
            return;
        }
        int var6 = var4.field6791;
        int var7 = var4.field6795;
        int var8 = class163.field2126[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method110(var5, var9 & arg2 << var6 | ~var9 & this.field206[var5], true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public final void method106(int arg0) {
        for (int var2 = 0; var2 < class503.field7685.field2643; var2++) {
            class36 var4 = class503.field7685.method1168(-5814, var2);
            if (var4 != null && var4.field567 == 0) {
                this.field206[var2] = 0;
                this.field209[var2] = 0;
            }
        }
        int var3 = 66 % ((-arg0 - 16) / 34);
        field211++;
        this.field210 = new class384(128);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V")
    public final void method107(int arg0, int arg1, int arg2) {
        field216++;
        class470 var4 = class78.field1102.method440((byte) -121, arg1);
        int var5 = var4.field6794;
        int var6 = var4.field6791;
        if (arg0 != -26935) {
            return;
        }
        int var7 = var4.field6795;
        int var8 = class163.field2126[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method102((byte) -32, var9 & arg2 << var6 | ~var9 & this.field209[var5], var5);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
    public final int method108(int arg0, byte arg1) {
        field215++;
        int var3 = -31 / ((-arg1 - 15) / 53);
        return this.field209[arg0];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
    public final int method109(int arg0, int arg1) {
        field207++;
        class470 var3 = class78.field1102.method440((byte) -85, arg0);
        int var4 = var3.field6794;
        int var5 = var3.field6791;
        int var6 = var3.field6795;
        int var7 = class163.field2126[var6 - var5];
        return arg1 == 5687 ? var7 & this.field209[var4] >> var5 : 101;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
    public final void method110(int arg0, int arg1, boolean arg2) {
        this.field206[arg0] = arg1;
        field205++;
        class20 var4 = (class20) this.field210.method2310((byte) -97, (long) arg0);
        if (!arg2) {
            this.field209 = null;
        }
        if (var4 == null) {
            class20 var5 = new class20(4611686018427387905L);
            this.field210.method2317(-1, (long) arg0, var5);
        } else if (var4.field282 != 4611686018427387905L) {
            var4.field282 = class109.method653(false) + 500L | 0x4000000000000000L;
        }
    }

    static {
        new class194("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field213 = new long[32];
        field214 = new class194("wave2:", "welle2:", "ondulation2:", "onda2:");
    }
}
