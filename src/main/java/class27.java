import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class27 {

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Led;")
    private class187 field309 = new class187();

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Z")
    public boolean field321 = false;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[Lwa;")
    private class265[] field305;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[[[I")
    private int[][][] field307;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field313 = 0;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
    public static int[] field316 = new int[32];

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field311 = new CRC32();

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field318;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBI)V")
    public static final void method191(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 71) {
            method192((byte) 110);
        }
        if (class171.field2757 != 0 && arg0 != 0 && class133.field2191 < 50 && arg2 != -1) {
            class32.field403[class133.field2191] = arg2;
            class209.field3357[class133.field2191] = arg0;
            class39.field554[class133.field2191] = arg4;
            class83.field1202[class133.field2191] = null;
            class234.field3752[class133.field2191] = 0;
            class291.field4611[class133.field2191] = arg1;
            class133.field2191++;
        }
        field306++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public static final int method192(byte arg0) {
        field315++;
        if (arg0 <= 53) {
            field311 = null;
        }
        return class293.field4650;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        field310++;
        int var3 = 113 / ((arg0 + 87) / 37);
        if (this.field319 == this.field317) {
            this.field321 = this.field305[arg1] == null;
            this.field305[arg1] = class118.field1693;
            return this.field307[arg1];
        } else if (this.field319 == 1) {
            this.field321 = this.field320 != arg1;
            this.field320 = arg1;
            return this.field307[0];
        } else {
            class265 var4 = this.field305[arg1];
            if (var4 == null) {
                this.field321 = true;
                if (this.field319 > this.field314) {
                    var4 = new class265(arg1, this.field314);
                    this.field314++;
                } else {
                    class265 var5 = (class265) this.field309.method1390((byte) -118);
                    var4 = new class265(arg1, var5.field4293);
                    this.field305[var5.field4296] = null;
                    var5.method1922(-1);
                }
                this.field305[arg1] = var4;
            } else {
                this.field321 = false;
            }
            this.field309.method1391(2, var4);
            return this.field307[var4.field4293];
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public final void method194(byte arg0) {
        field304++;
        if (arg0 < 84) {
            this.method195(123);
        }
        for (int var2 = 0; var2 < this.field319; var2++) {
            this.field307[var2][0] = null;
            this.field307[var2][1] = null;
            this.field307[var2][2] = null;
            this.field307[var2] = null;
        }
        this.field305 = null;
        this.field307 = null;
        this.field309.method1382(0);
        this.field309 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method195(int arg0) {
        field308++;
        if (this.field319 != this.field317) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field319; var2++) {
            this.field305[var2] = class118.field1693;
        }
        if (arg0 != -11010) {
            this.field309 = null;
        }
        return this.field307;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method196(int arg0) {
        field311 = null;
        field316 = null;
        field318 = null;
        if (arg0 <= 89) {
            method191(2, -103, -19, (byte) -98, 27);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
    public class27(int arg0, int arg1, int arg2) {
        this.field319 = arg0;
        this.field317 = arg1;
        this.field305 = new class265[this.field317];
        this.field307 = new int[this.field319][3][arg2];
    }
}
