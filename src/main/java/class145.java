import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class145 implements class396 {

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "S")
    public static short field2092;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Z")
    public boolean field2088;

    static {
        new class206("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field2091 = 0;
        field2092 = 32767;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLiq;)Z", line = 6)
    public final boolean method865(byte arg0, class396 arg1) {
        field2082++;
        if (!(arg1 instanceof class145)) {
            return false;
        }
        class145 var3 = (class145) arg1;
        if (this.field2083 != var3.field2083) {
            return false;
        } else if (this.field2089 == var3.field2089) {
            if (arg0 < 84) {
                field2092 = -111;
            }
            if (this.field2090 != var3.field2090) {
                return false;
            } else if (this.field2086 != var3.field2086) {
                return false;
            } else if (this.field2084 != var3.field2084) {
                return false;
            } else if (this.field2085 == var3.field2085) {
                return var3.field2088 == this.field2088;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)J", line = 50)
    public final long method866(int arg0) {
        field2087++;
        long[] var2 = class268.field3579;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field2083) & 0xFFL)];
        if (arg0 != 19470) {
            this.method866(113);
        }
        long var7 = var2[(int) (((long) (this.field2089 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field2089 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field2090 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field2090 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field2090 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field2090 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field2086 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field2084 >> 24) ^ var19) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field2084 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field2084 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field2084) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field2085 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field2088 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }
}
