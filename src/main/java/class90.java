import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class90 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljo;")
    private class382 field1399 = new class382(128);

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Ljo;")
    public class382 field1407 = new class382(64);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lok;")
    private class74 field1398;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lok;")
    public class74 field1404;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1408;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
    public static int[] field1411;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Luv;")
    public static class2 field1409;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)B")
    public static final byte method693(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1410 = 10;
        }
        field1397++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method694(boolean arg0) {
        field1405++;
        class382 var2 = this.field1399;
        synchronized (this.field1399) {
            this.field1399.method2287(102);
        }
        class382 var3 = this.field1407;
        synchronized (this.field1407) {
            this.field1407.method2287(94);
            if (arg0) {
                this.field1407 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLgk;)Ljava/lang/String;")
    public static final String method695(byte arg0, class468 arg1) {
        field1403++;
        if (arg0 <= 17) {
            field1411 = null;
        }
        return class105.method790(arg1, -1, 32767);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)S")
    public static final short method696(int arg0, int arg1) {
        field1396++;
        int var2 = (arg1 & 0xFECA) >> 10;
        int var3 = (arg1 & 0x382) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg0 != 1278910602) {
            return -77;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        if (arg0 != -18016) {
            this.field1407 = null;
        }
        class382 var2 = this.field1399;
        synchronized (this.field1399) {
            this.field1399.method2293(false);
        }
        field1401++;
        class382 var3 = this.field1407;
        synchronized (this.field1407) {
            this.field1407.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method698(int arg0) {
        if (arg0 > -41) {
            field1410 = 81;
        }
        field1400++;
        if (class4.field37 != null) {
            class4.field37.method1627(10348);
        }
        if (class72.field973 != null) {
            class72.field973.method1627(10348);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lb;")
    public final class473 method699(int arg0, int arg1) {
        field1395++;
        class382 var3 = this.field1399;
        class473 var4;
        synchronized (this.field1399) {
            var4 = (class473) this.field1399.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field1398;
        byte[] var6;
        synchronized (this.field1398) {
            var6 = this.field1398.method541(arg0, 36, (byte) -122);
            if (arg1 < 109) {
                this.method702(25, 61, -68);
            }
        }
        class473 var7 = new class473();
        var7.field6953 = this;
        var7.field6968 = arg0;
        if (var6 != null) {
            var7.method2809((byte) -119, new class468(var6));
        }
        var7.method2806(60);
        class382 var8 = this.field1399;
        synchronized (this.field1399) {
            this.field1399.method2290((long) arg0, var7, 123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
    public final void method700(byte arg0, int arg1) {
        class382 var3 = this.field1399;
        synchronized (this.field1399) {
            this.field1399.method2294(arg1, true);
        }
        field1402++;
        class382 var4 = this.field1407;
        synchronized (this.field1407) {
            this.field1407.method2294(arg1, true);
            if (arg0 != 97) {
                method701(-94);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method701(int arg0) {
        field1408 = null;
        field1409 = null;
        field1411 = null;
        int var1 = 84 / ((arg0 - 36) / 57);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
    public final void method702(int arg0, int arg1, int arg2) {
        field1406++;
        if (arg1 == -14845) {
            this.field1399 = new class382(arg0);
            this.field1407 = new class382(arg2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lkr;ILok;Lok;)V")
    public class90(class262 arg0, int arg1, class74 arg2, class74 arg3) {
        this.field1398 = arg2;
        this.field1404 = arg3;
        this.field1398.method536(false, 36);
    }

    static {
        new class347("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field1408 = new Color[] { new Color(16777215), new Color(16777215) };
        field1411 = new int[] { 1, -1, -1, 1 };
        field1410 = 0;
        field1409 = new class2(80, 12);
    }
}
