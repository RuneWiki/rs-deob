import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class92 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private int field1804 = -1;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    private int field1807 = 0;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lsc;")
    private class165 field1800 = new class165();

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Z")
    public boolean field1816 = false;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[Lfb;")
    private class49[] field1809;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[[I")
    private int[][] field1798;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lsd;")
    private static class166 field1801 = class135.method935("as it was used to break our rules)3", 0);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lsd;")
    public static class166 field1803 = class135.method935("RuneScape wurde aktualisiert(Q", 0);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lsd;")
    public static class166 field1797 = class135.method935("Unerwartete Antwort vom Anmelde)2Server", 0);

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lsd;")
    public static class166 field1810 = class135.method935(")1", 0);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lsd;")
    public static class166 field1806 = field1801;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lsd;")
    public static class166 field1814 = class135.method935("Spieler", 0);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lhb;")
    public static class66 field1805;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field1796;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
    public static int[] field1808;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "[I")
    public static int[] field1812;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method717(int arg0) {
        if (arg0 != 4096) {
            return;
        }
        for (int var2 = 0; var2 < this.field1815; var2++) {
            this.field1798[var2] = null;
        }
        this.field1809 = null;
        this.field1798 = null;
        this.field1800.method1104(23);
        field1794++;
        this.field1800 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static final void method718(boolean arg0) {
        if (class63.field1316 == null || field1808 == null) {
            field1808 = new int[256];
            class63.field1316 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class63.field1316[var1] = (int) (Math.sin(var2) * 4096.0D);
                field1808[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1795++;
        if (!arg0) {
            field1797 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method719(byte arg0) {
        int var1 = -104 / ((arg0 - 45) / 51);
        class204.field4023.method71(500);
        field1802++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1808 = null;
        field1810 = null;
        field1796 = null;
        field1812 = null;
        if (arg0 != 4096) {
            return;
        }
        field1797 = null;
        field1806 = null;
        field1801 = null;
        field1803 = null;
        field1814 = null;
        field1805 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
    public final int[] method721(int arg0, int arg1) {
        field1813++;
        if (arg1 > -122) {
            this.field1809 = null;
        }
        if (this.field1815 == this.field1811) {
            this.field1816 = this.field1809[arg0] == null;
            this.field1809[arg0] = class74.field1504;
            return this.field1798[arg0];
        } else if (this.field1815 == 1) {
            this.field1816 = this.field1804 != arg0;
            this.field1804 = arg0;
            return this.field1798[0];
        } else {
            class49 var3 = this.field1809[arg0];
            if (this.field1816 = var3 == null) {
                if (this.field1815 > this.field1807) {
                    var3 = new class49(arg0, this.field1807);
                    this.field1807++;
                } else {
                    class49 var4 = (class49) this.field1800.method1111(-122);
                    var3 = new class49(arg0, var4.field904);
                    this.field1809[var4.field903] = null;
                    var4.method915(0);
                }
                this.field1809[arg0] = var3;
            }
            this.field1800.method1105(1208005, var3);
            return this.field1798[var3.field904];
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)[[I")
    public final int[][] method722(int arg0) {
        field1799++;
        if (arg0 < 93) {
            this.method721(-58, 16);
        }
        if (this.field1815 != this.field1811) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1815; var2++) {
            this.field1809[var2] = class74.field1504;
        }
        return this.field1798;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V")
    public class92(int arg0, int arg1, int arg2) {
        this.field1815 = arg0;
        this.field1809 = new class49[arg1];
        this.field1811 = arg1;
        this.field1798 = new int[arg0][arg2];
    }
}
