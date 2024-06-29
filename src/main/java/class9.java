import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class356 {

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Ls;")
    public static class186 field132 = new class186(26, 7);

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Llb;")
    public static class383 field137;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "J")
    public long field126;

    static {
        new class309("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field136 = 0;
        field137 = new class383("LIVE", 0);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I", line = 3)
    public final int method50(int arg0) {
        if (arg0 != 8) {
            method56(25);
        }
        field128++;
        return this.field133;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V", line = 14)
    public static void method51(int arg0) {
        if (arg0 != 7) {
            method51(19);
        }
        field137 = null;
        field132 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I", line = 28)
    public final int method52(int arg0) {
        if (arg0 > -57) {
            return -91;
        } else {
            field127++;
            return this.field130;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)J", line = 39)
    public final long method53(int arg0) {
        field131++;
        if (arg0 != 877163852) {
            field132 = null;
        }
        return this.field126;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I", line = 54)
    public final int method54(boolean arg0) {
        field134++;
        if (arg0) {
            field136 = -81;
        }
        return this.field125;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lph;BLph;Lph;Lph;)V", line = 65)
    public static final void method55(class459 arg0, byte arg1, class459 arg2, class459 arg3, class459 arg4) {
        if (arg1 >= -17) {
            method51(106);
        }
        class293.field4484 = arg0;
        class326.field4945 = arg3;
        field135++;
        class458.field6783 = arg2;
        class270.field4100 = arg4;
        class419.field6326 = new class388[class458.field6783.method2759(16460)][];
        class182.field2935 = new boolean[class458.field6783.method2759(16460)];
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 100)
    public static final void method56(int arg0) {
        field129++;
        class371 var1 = null;
        try {
            class121 var2 = class497.field7305.method2878("2", true, arg0);
            while (var2.field2119 == 0) {
                class50.method470(1L, -5);
            }
            if (var2.field2119 == 1) {
                var1 = (class371) var2.field2115;
                byte[] var3 = new byte[(int) var1.method2278(false)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2279(var4, var3, -1, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class373.method2288(0, new class289(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2276(-2771);
            }
        } catch (Exception var6) {
        }
    }
}
