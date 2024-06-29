import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class387 implements class186 {

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field5499 = 0;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "Lwf;")
    public static class79 field5501;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Lkr;")
    public static class486 field5504;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
    public boolean field5494;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILb;II)Lqb;")
    public static final class135 method2330(int arg0, class201 arg1, int arg2, int arg3) {
        field5500++;
        if (arg0 == 2) {
            byte[] var4 = arg1.method1257(arg2, arg3, 24558);
            return var4 == null ? null : new class135(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
    public static final void method2331(boolean arg0, int arg1) {
        field5497++;
        if (arg1 != -364066936) {
            return;
        }
        class157.field2332++;
        class15.method110(class58.field781, -125);
        for (class465 var2 = (class465) class146.field2146.method2769((byte) -94); var2 != null; var2 = (class465) class146.field2146.method2768((byte) -88)) {
            if (!var2.method1512((byte) -39)) {
                var2 = (class465) class146.field2146.method2769((byte) -124);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6500 == 0) {
                class207.method1354(var2, arg0, -127, true);
            }
        }
        if (class207.field3166 != null) {
            class22.method148((byte) -78, class207.field3166);
            class207.field3166 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static void method2332(byte arg0) {
        if (arg0 != 16) {
            method2332((byte) -62);
        }
        field5501 = null;
        field5504 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lwt;I)Z")
    public final boolean method1150(class186 arg0, int arg1) {
        field5492++;
        if (!(arg0 instanceof class387)) {
            return false;
        }
        if (arg1 != 31597) {
            this.field5494 = false;
        }
        class387 var3 = (class387) arg0;
        if (this.field5496 != var3.field5496) {
            return false;
        } else if (this.field5495 != var3.field5495) {
            return false;
        } else if (this.field5503 != var3.field5503) {
            return false;
        } else if (this.field5489 != var3.field5489) {
            return false;
        } else if (this.field5491 != var3.field5491) {
            return false;
        } else if (this.field5490 == var3.field5490) {
            return this.field5494 == var3.field5494;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)J")
    public final long method1149(byte arg0) {
        field5498++;
        long[] var2 = class427.field5983;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field5496 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field5495 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field5495) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field5503 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field5503 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field5503 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field5503) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field5489) & 0xFFL)];
        if (arg0 != -36) {
            field5501 = null;
        }
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5491 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field5491 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field5491 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field5491 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5490 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field5494 ? 1 : 0)) & 0xFFL)];
    }

    static {
        new class326("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field5501 = new class79(81, 2);
        field5502 = -1;
        field5504 = new class486();
    }
}
