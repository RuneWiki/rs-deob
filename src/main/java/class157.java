import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class157 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lbk;")
    private class90 field2184 = new class90();

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[B")
    public static byte[] field2186 = new byte[32896];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lsh;")
    public static class472 field2188;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lje;")
    public static class178 field2192;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lo;")
    public static class332 field2191;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    public static int[] field2194;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lbk;")
    private class90 field2187;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[[[I")
    public static int[][][] field2193;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2186[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field2188 = new class472(100, -2);
        field2190 = 0;
        field2192 = null;
        field2189 = 1400;
        field2191 = new class332("Discard", "Ablegen", "Jeter", "Descartar");
        field2194 = new int[14];
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1068(byte arg0) {
        field2177++;
        if (class394.field5805.length() == 0) {
            return;
        }
        class360.method2214("--> " + class394.field5805, -15036);
        class380.method2324(false, class394.field5805, false);
        if (arg0 == 21) {
            class402.field5872 = 0;
            class122.field1687 = 0;
            class394.field5805 = "";
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)Lbk;", line = 26)
    public final class90 method1069(byte arg0) {
        if (arg0 != 89) {
            field2194 = null;
        }
        field2180++;
        class90 var2 = this.field2184.field1253;
        if (this.field2184 == var2) {
            return null;
        } else {
            var2.method701(arg0 - 98);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Lbk;", line = 48)
    public final class90 method1070(byte arg0) {
        field2178++;
        class90 var2 = this.field2184.field1253;
        if (this.field2184 == var2) {
            this.field2187 = null;
            return null;
        } else if (arg0 >= -32) {
            return null;
        } else {
            this.field2187 = var2.field1253;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 69)
    public final void method1071(int arg0) {
        if (arg0 != 27536) {
            this.method1073(106);
        }
        while (true) {
            class90 var2 = this.field2184.field1253;
            if (this.field2184 == var2) {
                field2182++;
                this.field2187 = null;
                return;
            }
            var2.method701(-124);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)I", line = 93)
    public final int method1072(byte arg0) {
        field2179++;
        int var2 = 0;
        class90 var3 = this.field2184.field1253;
        while (this.field2184 != var3) {
            var3 = var3.field1253;
            var2++;
        }
        if (arg0 != 87) {
            this.method1071(-96);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lbk;", line = 119)
    public final class90 method1073(int arg0) {
        field2183++;
        int var2 = -73 / ((62 - arg0) / 51);
        class90 var3 = this.field2187;
        if (this.field2184 == var3) {
            this.field2187 = null;
            return null;
        } else {
            this.field2187 = var3.field1253;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILmp;Lmp;)V", line = 144)
    public static final void method1074(int arg0, int arg1, int arg2, class100 arg3, class100 arg4) {
        class337 var5 = class15.method139(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5044 = arg3;
            var5.field5047 = arg4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLbk;)V", line = 154)
    public final void method1075(byte arg0, class90 arg1) {
        if (arg1.field1252 != null) {
            arg1.method701(-28);
        }
        field2181++;
        arg1.field1252 = this.field2184.field1252;
        if (arg0 <= -16) {
            arg1.field1253 = this.field2184;
            arg1.field1252.field1253 = arg1;
            arg1.field1253.field1252 = arg1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V", line = 173)
    public static void method1076(byte arg0) {
        field2191 = null;
        field2186 = null;
        field2194 = null;
        if (arg0 != -1) {
            method1068((byte) -29);
        }
        field2193 = null;
        field2188 = null;
        field2192 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 213)
    public class157() {
        this.field2184.field1253 = this.field2184;
        this.field2184.field1252 = this.field2184;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)V", line = 226)
    public static final void method1077(byte arg0) {
        field2185++;
        if (class116.field1627 != null) {
            if (class116.field1627.field5822 == 1) {
                class116.field1627 = null;
                return;
            }
            if (class116.field1627.field5822 == 2) {
                class140.method970(class5.field92, class255.field3783, (byte) 102, 2);
                class116.field1627 = null;
                return;
            }
        }
        if (arg0 >= -118) {
            method1077((byte) 104);
        }
    }
}
