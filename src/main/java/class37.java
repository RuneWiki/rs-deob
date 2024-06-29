import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 extends class147 {

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    private int field375 = 0;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Lii;")
    private class390 field374 = new class390();

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Ljc;")
    public static class305 field378 = new class305("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Lao;")
    public static class191 field385 = new class191(111, 8);

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "Lho;")
    public static class103 field386 = new class103(15, 8);

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 5)
    public final void method196(int arg0, int arg1) {
        ++field383;
        if (arg1 != 48) {
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 16)
    public final void method197(int arg0) {
        if (arg0 == 5000) {
            ++field379;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 33)
    public static void method198(boolean arg0) {
        field386 = null;
        field378 = null;
        if (!arg0) {
            field378 = null;
        }
        field385 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lya;FZII)V", line = 47)
    public final void method199(class38 arg0, float arg1, boolean arg2, int arg3, int arg4) {
        ++field380;
        super.field1942[super.field1943] = (byte) (!arg2 ? arg3 + 30 : arg3 + 40);
        super.field1939[super.field1943] = arg0;
        super.field1940[super.field1943] = arg1;
        ++super.field1943;
        if (~super.field1943 <= -5001) {
            super.field1943 = 0;
        }
        if (arg4 != 0) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLno;)V", line = 65)
    public final void method200(byte arg0, class498 arg1) {
        ++field382;
        if (arg0 < 114) {
            this.method200((byte) -70, (class498) null);
        }
        super.field1942[super.field1943] = 20;
        super.field1939[super.field1943] = arg1;
        ++super.field1943;
        if (~super.field1943 <= -5001) {
            super.field1943 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V", line = 82)
    public final void method201(int arg0, int arg1) {
        super.field1942[super.field1943] = (byte) arg1;
        ++field377;
        if (arg0 != 1) {
            method198(false);
        }
        ++super.field1943;
        if (~super.field1943 <= -5001) {
            super.field1943 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(BLno;)V", line = 103)
    public final void method202(byte arg0, class498 arg1) {
        --super.field1941;
        ++field373;
        if (super.field1941 < 0) {
            super.field1941 = 4999;
        }
        if (arg0 < 31) {
            field385 = null;
        }
        super.field1942[super.field1941] = 21;
        super.field1939[super.field1941] = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 120)
    private final void method203(byte arg0) {
        if (arg0 != -107) {
            this.method196(22, 59);
        }
        ++field376;
        int var2 = super.field1941++;
        if (~super.field1941 <= -5001) {
            super.field1941 = 0;
        }
        this.field375 = super.field1942[var2];
        Object var3 = super.field1939[var2];
        super.field1939[var2] = null;
        if (this.field375 == 21) {
            class354.method2079(this.field374, (class498) var3);
        } else if (~this.field375 != -21) {
            if (~this.field375 <= -31 && this.field375 <= 33) {
                class492.field7216.method1140(3000.0F, super.field1940[var2] * 1.5F);
                ((class38) var3).method208(class151.field1977, class122.field1577, class349.field4645, class487.field7157, ~(this.field375 + -30) == -1);
            } else if (this.field375 >= 40 && this.field375 <= 43) {
                class492.field7216.method1140(3000.0F, super.field1940[var2] * 1.5F);
                ((class38) var3).method208(class151.field1977, class122.field1577, class349.field4645, class32.field327, this.field375 - 40 == 0);
            } else {
                if (~this.field375 != -23) {
                    if (this.field375 == 23) {
                        class492.field7216.method1232();
                        return;
                    }
                    if (this.field375 == 24) {
                        class492.field7216.method1146(0, (class309[]) null);
                        return;
                    }
                } else {
                    class492.field7216.method1180(-1, 1583160, 40, 127);
                }
            }
        } else {
            class498 var4 = (class498) var3;
            if (var4.field7264 != null) {
                var4.field7264.method36((byte) -122, class492.field7216);
            }
            if (var4.field7257 != null) {
                var4.field7257.method36((byte) -126, class492.field7216);
            }
            if (var4.field7259 != null) {
                var4.field7259.method36((byte) -127, class492.field7216);
            }
            if (var4.field7271 != null) {
                var4.field7271.method36((byte) -125, class492.field7216);
            }
            if (var4.field7268 != null) {
                var4.field7268.method36((byte) -124, class492.field7216);
            }
            for (class192 var5 = var4.field7263; var5 != null; var5 = var5.field2469) {
                var5.field2466.method36((byte) -124, class492.field7216);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lno;B)V", line = 219)
    public final void method204(class498 arg0, byte arg1) {
        ++field384;
        super.field1942[super.field1943] = 21;
        super.field1939[super.field1943] = arg0;
        ++super.field1943;
        if (super.field1943 >= 5000) {
            super.field1943 = 0;
        }
        if (arg1 != 30) {
            this.field375 = 11;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 237)
    public final void method205(int arg0) {
        while (~super.field1943 != ~super.field1941) {
            this.method203((byte) -107);
        }
        ++field381;
        if (arg0 != 0) {
            field386 = null;
        }
    }
}
