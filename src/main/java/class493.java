import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class493 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Ljp;")
    private class236 field6848 = new class236(64);

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lpc;")
    private class473 field6851;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lnf;")
    public final class405 method2833(int arg0, int arg1) {
        field6854++;
        class236 var3 = this.field6848;
        class405 var4;
        synchronized (this.field6848) {
            var4 = (class405) this.field6848.method1456((long) arg1, arg0 ^ 0xFFFFD28F);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -11521) {
            this.method2834(-24);
        }
        byte[] var5 = this.field6851.method2708(31, arg1, (byte) 54);
        class405 var6 = new class405();
        if (var5 != null) {
            var6.method2358(new class379(var5), 32456);
        }
        class236 var7 = this.field6848;
        synchronized (this.field6848) {
            this.field6848.method1462(var6, (long) arg1, -100);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public final void method2834(int arg0) {
        field6850++;
        class236 var2 = this.field6848;
        synchronized (this.field6848) {
            this.field6848.method1459(arg0 ^ 0x18D7);
            if (arg0 != 21063) {
                this.field6851 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public final void method2835(int arg0) {
        field6852++;
        class236 var2 = this.field6848;
        synchronized (this.field6848) {
            this.field6848.method1458((byte) 60);
        }
        if (arg0 != 20495) {
            method2837(85);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lmk;B)Ljava/lang/String;")
    public static final String method2836(class39 arg0, byte arg1) {
        field6855++;
        if (arg1 >= -82) {
            return null;
        } else if (arg0.field594 == null || arg0.field594.length() <= 0) {
            return arg0.field589;
        } else {
            return arg0.field589 + class207.field2852.method1764(class489.field6789, false) + arg0.field594;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
    public static final void method2837(int arg0) {
        if (class454.field6161 == 10 || class454.field6161 == 28) {
            class147.method1010(class430.field5888 >> 10, 5000, class168.field2438 >> 10, 30756);
        } else {
            int var1 = class385.field5232.field6261[0] >> 3;
            int var2 = class385.field5232.field6266[0] >> 3;
            if (var1 >= 0 && var1 < class12.field251 >> 3 && var2 >= 0 && var2 < (class289.field3782 >> 3)) {
                class147.method1010(var1, 5000, var2, 30756);
            } else {
                class147.method1010(class12.field251 >> 4, 0, class289.field3782 >> 4, arg0 ^ 0x89F90787);
            }
        }
        field6853++;
        class206.method1320(false);
        if (arg0 != -1980137565) {
            method2837(45);
        }
        class461.method2627(0);
        class206.method1319(85);
        class232.method1446(0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)V")
    public final void method2838(int arg0, byte arg1) {
        field6849++;
        class236 var3 = this.field6848;
        synchronized (this.field6848) {
            if (arg1 < 12) {
                this.method2833(-72, 100);
            }
            this.field6848.method1461(-5, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class493(class234 arg0, int arg1, class473 arg2) {
        this.field6851 = arg2;
        this.field6851.method2710(31, (byte) -128);
    }

    static {
        new class304("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
