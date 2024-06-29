import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class123 {

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field198 = -1;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "Lvc;")
    public static class137 field200 = class45.method325("Bitte versuchen Sie es in ", -46);

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Lvc;")
    private static class137 field202 = class45.method325("level)2", -46);

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lvc;")
    public static class137 field199 = field202;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lvc;")
    public static class137 field215 = class45.method325("Anmelde)2Limit -Uberschritten)3", -46);

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
    public static int[] field216 = new int[256];

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "Lvc;")
    private static class137 field212 = class45.method325("No matching objects found)1 please shorten search", -46);

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Lvc;")
    public static class137 field205 = field212;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field218 = 255;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Lwe;")
    public static class145 field206;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "Ll;")
    public static class74 field220;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Loa;")
    public static class93 field208;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lqe;B)V")
    public final void method62(class109 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method838(255);
            if (var3 == 0) {
                if (arg1 != -22) {
                    this.field209 = -93;
                }
                field204++;
                return;
            }
            this.method63(arg0, (byte) -104, var3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lqe;BI)V")
    private final void method63(class109 arg0, byte arg1, int arg2) {
        field213++;
        if (arg2 == 1) {
            this.field219 = arg0.method835(2);
            this.field214 = arg0.method838(255);
            this.field209 = arg0.method838(arg1 ^ 0xFFFFFF67);
        }
        if (arg1 != -104) {
            method66(-36, null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lme;I)Z")
    public static final boolean method64(class85 arg0, int arg1) {
        field210++;
        if (arg0.field1986 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < arg0.field1986.length; var2++) {
            int var3 = class134.method993(var2, -12, arg0);
            int var4 = arg0.field1972[var2];
            if (arg0.field1986[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1986[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1986[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static void method65(boolean arg0) {
        field206 = null;
        field200 = null;
        field220 = null;
        field199 = null;
        if (arg0) {
            field208 = null;
        }
        field216 = null;
        field215 = null;
        field208 = null;
        field205 = null;
        field202 = null;
        field212 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method66(int arg0, byte[] arg1) {
        field197++;
        if (arg0 != 1) {
            return null;
        }
        class109 var2 = new class109(arg1);
        int var3 = var2.method838(arg0 + 254);
        int var4 = var2.method832(arg0 ^ 0x3983);
        if (var4 < 0 || class116.field2767 != 0 && class116.field2767 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method807(0, var5, var4, 3);
            return var5;
        } else {
            int var6 = var2.method832(arg0 + 14721);
            if (var6 < 0 || class116.field2767 != 0 && class116.field2767 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class113.method879(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Laa;")
    public static final class2 method67(int arg0) {
        field203++;
        if (arg0 != 2006) {
            field218 = 59;
        }
        try {
            return (class2) Class.forName("nd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field216[var0] = var1;
        }
        field221 = -1;
    }
}
