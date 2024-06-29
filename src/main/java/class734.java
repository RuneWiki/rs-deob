import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class734 implements class107 {

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "[C")
    public static char[] field10272 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Ljia;")
    public static class336 field10265 = new class336();

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "Lqk;")
    public static class148 field10278 = new class148(53, 8);

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field10279 = 0;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public int field10268;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public int field10269;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public int field10270;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public int field10273;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public int field10274;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public int field10276;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "Z")
    public boolean field10277;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lwf;I)Z", line = 4)
    public final boolean method728(class107 arg0, int arg1) {
        field10271++;
        if (!(arg0 instanceof class734)) {
            return false;
        }
        class734 var3 = (class734) arg0;
        if (this.field10269 != var3.field10269) {
            return false;
        } else if (this.field10276 != var3.field10276) {
            return false;
        } else if (this.field10273 == var3.field10273) {
            if (arg1 > -14) {
                this.field10268 = 84;
            }
            if (this.field10274 != var3.field10274) {
                return false;
            } else if (this.field10270 != var3.field10270) {
                return false;
            } else if (this.field10268 == var3.field10268) {
                return this.field10277 == var3.field10277;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)J", line = 47)
    public final long method727(int arg0) {
        field10275++;
        long[] var2 = class696.field9710;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field10269 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field10276 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field10276) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field10273 >> 24)) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field10273 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field10273 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field10273) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field10274) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field10270 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        if (arg0 != 27857) {
            method4076((byte) -109);
        }
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field10270 >> 16)) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field10270 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field10270 ^ var25) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field10268 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field10277 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/net/Socket;I)Lge;", line = 78)
    public static final class405 method4075(boolean arg0, Socket arg1, int arg2) throws IOException {
        if (!arg0) {
            method4077('\u0018', -63);
        }
        field10266++;
        return new class698(arg1, arg2);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 91)
    public static void method4076(byte arg0) {
        field10278 = null;
        field10272 = null;
        if (arg0 != 2) {
            method4077((char) 65476, -3);
        }
        field10265 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(CI)C", line = 106)
    public static final char method4077(char arg0, int arg1) {
        field10267++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg1 != 210) {
            return (char) 65515;
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }
}
