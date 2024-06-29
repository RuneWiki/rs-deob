import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class116 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    private int field2189 = 0;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    private int field2192 = -1;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Laa;")
    private class39 field2185 = new class39();

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Z")
    public boolean field2200 = false;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "[Ljg;")
    private class147[] field2197;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    private int field2186;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[[I")
    private int[][] field2181;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lha;")
    public static class46 field2194 = class271.method1828(":duelfriend:", -46);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lha;")
    private static class46 field2182 = class271.method1828(" from your friend list first)3", -46);

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lha;")
    public static class46 field2196 = field2182;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lha;")
    public static class46 field2187 = class271.method1828("ul", -46);

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lha;")
    public static class46 field2195 = class271.method1828(" GMT", -46);

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lha;")
    public static class46 field2188 = class271.method1828("headicons_pk", -46);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lpi;")
    public static class181 field2184;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lrc;B)V")
    public static final void method933(class9 arg0, byte arg1) {
        class65.field1111 = 3;
        class66.method457(true, 128);
        class250.field4416 = true;
        class138.field2484 = 0;
        class264.field4596 = true;
        class65.field1102 = true;
        class205.field3685 = 255;
        class24.field396 = 0;
        class42.field715 = true;
        class112.field2119 = 0;
        class135.field2452 = 127;
        class268.field4631 = true;
        class170.field3030 = 0;
        class140.field2504 = 0;
        field2191++;
        class149.field2672 = false;
        class111.field2103 = true;
        class38.field668 = 127;
        class217.field3840 = true;
        class46.field809 = true;
        class68.field1177 = true;
        class159 var2 = null;
        class31.field588 = true;
        class186.field3326 = 2;
        class70.field1206 = true;
        if (arg1 != 0) {
            method937((byte) -111);
        }
        try {
            class165 var3 = arg0.method41("runescape", (byte) 111);
            while (var3.field2925 == 0) {
                class187.method1360((byte) -124, 1L);
            }
            if (var3.field2925 == 1) {
                var2 = (class159) var3.field2921;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1166(arg1 ^ 0x33)];
                while (var5.length > var4) {
                    int var6 = var2.method1167(-30019, var5, var4, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class212.method1497(110, new class75(var5));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1163(false);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)[[I")
    public final int[][] method934(int arg0) {
        field2190++;
        if (this.field2193 != this.field2186) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 26428) {
            for (int var2 = 0; var2 < this.field2186; var2++) {
                this.field2197[var2] = class225.field3934;
            }
            return this.field2181;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public final void method935(byte arg0) {
        field2179++;
        for (int var2 = 0; var2 < this.field2186; var2++) {
            this.field2181[var2] = null;
        }
        this.field2197 = null;
        this.field2181 = null;
        if (arg0 <= 90) {
            this.field2193 = -46;
        }
        this.field2185.method266(5);
        this.field2185 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[I")
    public final int[] method936(int arg0, int arg1) {
        field2198++;
        if (arg0 != 1) {
            return null;
        } else if (this.field2193 == this.field2186) {
            this.field2200 = this.field2197[arg1] == null;
            this.field2197[arg1] = class225.field3934;
            return this.field2181[arg1];
        } else if (this.field2186 == 1) {
            this.field2200 = this.field2192 != arg1;
            this.field2192 = arg1;
            return this.field2181[0];
        } else {
            class147 var3 = this.field2197[arg1];
            if (var3 == null) {
                this.field2200 = true;
                if (this.field2189 < this.field2186) {
                    var3 = new class147(arg1, this.field2189);
                    this.field2189++;
                } else {
                    class147 var4 = (class147) this.field2185.method262((byte) 118);
                    var3 = new class147(arg1, var4.field2646);
                    this.field2197[var4.field2653] = null;
                    var4.method501(0);
                }
                this.field2197[arg1] = var3;
            } else {
                this.field2200 = false;
            }
            this.field2185.method268((byte) -68, var3);
            return this.field2181[var3.field2646];
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2187 = null;
        field2188 = null;
        field2196 = null;
        field2184 = null;
        field2194 = null;
        if (arg0 != 96) {
            field2195 = null;
        }
        field2182 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(III)V")
    public class116(int arg0, int arg1, int arg2) {
        this.field2193 = arg1;
        this.field2197 = new class147[this.field2193];
        this.field2186 = arg0;
        this.field2181 = new int[this.field2186][arg2];
    }
}
