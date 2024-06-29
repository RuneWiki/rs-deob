import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class645 {

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public int field9363;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Loca;")
    public static class221 field9366 = new class221(14, 0, 4, 1);

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field9369 = -2;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field9370 = new String[100];

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Lej;")
    public static class104 field9368 = new class104("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "Lbea;")
    public static class188 field9372;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Lan;")
    public static class21 field9371;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
    public static void method3716(boolean arg0) {
        if (arg0) {
            method3716(false);
        }
        field9370 = null;
        field9366 = null;
        field9371 = null;
        field9372 = null;
        field9368 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static final void method3717(int arg0) {
        if (arg0 >= -11) {
            method3719((byte) 87, null);
        }
        field9361++;
        class116 var1 = null;
        try {
            class382 var2 = class500.field6968.method1840("3", false, (byte) 102);
            while (var2.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (var2.field5134 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class116) var2.field5132;
            byte[] var3 = new byte[(int) var1.method817(-2826)];
            if (var3.length == 0) {
                class394.field5558 = "";
                class395.field5620 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method819(var3, 118, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class11 var6 = new class11(var3);
                int var7 = var6.method110((byte) 71);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field165 = var7 + 1;
                if (!var6.method105(-21)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field165 = 1;
                int var8 = var6.method110((byte) 38);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class394.field5558 = var6.method79(0);
                class395.field5620 = var6.method79(0);
                if (var8 >= 1) {
                    class507.field7090 = var6.method93((byte) 84);
                } else {
                    class507.field7090 = class517.field7259;
                }
            }
        } catch (Exception var10) {
            class395.field5620 = "";
            class394.field5558 = "";
        }
        try {
            if (var1 != null) {
                var1.method821(17981);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I")
    public final int method3718(byte arg0) {
        int var2 = 47 / ((20 - arg0) / 49);
        field9362++;
        return this.field9363;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3719(byte arg0, String arg1) {
        field9364++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var9 = arg1.charAt(var4);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        int var5 = -70 % ((arg0 - 34) / 32);
        StringBuffer var6 = new StringBuffer(var2 + var3);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var6.append("<lt>");
            } else if (var8 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var8);
            }
        }
        return var6.toString();
    }

    @OriginalMember(owner = "client!rw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9367++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class645(String arg0, int arg1) {
        this.field9363 = arg1;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z")
    public static final boolean method3720(byte arg0, int arg1, int arg2) {
        field9365++;
        if (arg0 != -73) {
            field9369 = -45;
        }
        return (arg2 & 0x22) != 0;
    }
}
