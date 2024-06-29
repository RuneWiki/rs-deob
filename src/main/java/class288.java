import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class288 {

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[Lwa;")
    private class366[] field4190;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lpm;")
    public static class349 field4195 = new class349("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lcl;")
    public static class145 field4198 = new class145();

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "J")
    private long field4193;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lwa;")
    private class366 field4200;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lt;")
    public static class400 field4199;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I")
    public static final int method1963(byte arg0, int arg1) {
        field4194++;
        if (arg0 != -23) {
            field4199 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1964(int arg0) {
        field4199 = null;
        if (arg0 != 24311) {
            method1963((byte) 7, -120);
        }
        field4198 = null;
        field4195 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJLwa;)V")
    public final void method1965(int arg0, long arg1, class366 arg2) {
        field4192++;
        if (arg2.field5237 != null) {
            arg2.method2365(true);
        }
        class366 var5 = this.field4190[(int) (arg1 & (long) (this.field4196 - 1))];
        arg2.field5237 = var5.field5237;
        if (arg0 != 25199) {
            this.method1967(-88, 101L);
        }
        arg2.field5229 = var5;
        arg2.field5237.field5229 = arg2;
        arg2.field5232 = arg1;
        arg2.field5229.field5237 = arg2;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lwa;")
    public final class366 method1966(int arg0) {
        field4197++;
        if (this.field4200 == null) {
            return null;
        }
        class366 var2 = this.field4190[(int) (this.field4193 & (long) (this.field4196 - arg0))];
        while (this.field4200 != var2) {
            if (this.field4200.field5232 == this.field4193) {
                class366 var3 = this.field4200;
                this.field4200 = this.field4200.field5229;
                return var3;
            }
            this.field4200 = this.field4200.field5229;
        }
        this.field4200 = null;
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Lwa;")
    public final class366 method1967(int arg0, long arg1) {
        this.field4193 = arg1;
        field4191++;
        if (arg0 >= -39) {
            field4198 = null;
        }
        class366 var4 = this.field4190[(int) ((long) (this.field4196 - 1) & arg1)];
        for (this.field4200 = var4.field5229; this.field4200 != var4; this.field4200 = this.field4200.field5229) {
            if (this.field4200.field5232 == arg1) {
                class366 var5 = this.field4200;
                this.field4200 = this.field4200.field5229;
                return var5;
            }
        }
        this.field4200 = null;
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
    public class288(int arg0) {
        this.field4196 = arg0;
        this.field4190 = new class366[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class366 var3 = this.field4190[var2] = new class366();
            var3.field5237 = var3;
            var3.field5229 = var3;
        }
    }

    static {
        new class349((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }
}
