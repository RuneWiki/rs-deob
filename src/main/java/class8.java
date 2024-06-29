import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 {

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lea;")
    public static class10 field63 = class3.method8("Requesting", -74);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "La;")
    public static class1 field61 = new class1();

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lea;")
    public static class10 field65 = class3.method8("Estate Agent", -95);

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Lea;")
    public static class10 field69 = class3.method8("Spinning Wheel", -100);

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Lea;")
    public static class10 field67 = class3.method8("Suchen", 109);

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Lba;")
    public static class4 field68;

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field62;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 13)
    public static final Object method35(boolean arg0, byte[] arg1, byte arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class40.field521) {
            try {
                class20 var3 = (class20) Class.forName("ha").getDeclaredConstructor().newInstance();
                var3.method138((byte) -111, arg1);
                return var3;
            } catch (Throwable var5) {
                class40.field521 = true;
            }
        }
        if (arg2 != -19) {
            method38((byte) -98);
        }
        return arg0 ? class38.method245(-21128, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 45)
    public static final void method36(int arg0) {
        class1 var1 = field61;
        synchronized (field61) {
            class16.field181 = class21.field224;
            if (mapview.field371 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class16.field171[var2] = false;
                }
                mapview.field371 = class19.field203;
            } else {
                while (mapview.field371 != class19.field203) {
                    int var3 = class35.field482[class19.field203];
                    class19.field203 = class19.field203 + 1 & 0x7F;
                    if (var3 < 0) {
                        class16.field171[~var3] = false;
                    } else {
                        class16.field171[var3] = true;
                    }
                }
            }
            int var4 = 42 % ((-arg0 - 36) / 33);
            class21.field224 = class13.field147;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "()V", line = 108)
    public class8() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z[BLf;)V", line = 113)
    public final void method37(boolean arg0, byte[] arg1, class11 arg2) {
        if (arg2.field89[arg2.field86] != 31 || arg2.field89[arg2.field86 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        } else if (arg0) {
            if (this.field62 == null) {
                this.field62 = new Inflater(true);
            }
            try {
                this.field62.setInput(arg2.field89, arg2.field86 + 10, arg2.field89.length + -18 + -arg2.field86);
                this.field62.inflate(arg1);
            } catch (Exception var5) {
                this.field62.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            this.field62.reset();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)I", line = 138)
    public static final int method38(byte arg0) {
        if (arg0 >= -53) {
            return 125;
        } else if (class25.field389 == null) {
            return 0;
        } else if (class25.field389.field449 == null) {
            return class10.field75[class25.field389.field447 & 0xFF];
        } else {
            return class10.field75[class25.field389.field449[class22.field238] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V", line = 158)
    public static void method39(int arg0) {
        field68 = null;
        field65 = null;
        field61 = null;
        field67 = null;
        if (arg0 <= 99) {
            method35(true, null, (byte) 97);
        }
        field63 = null;
        field69 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(III)V", line = 177)
    private class8(int arg0, int arg1, int arg2) {
    }
}
