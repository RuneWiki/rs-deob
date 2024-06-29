import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class181 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "B")
    private byte field2660;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Z")
    public static boolean field2659 = false;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Ldn;")
    public static class357 field2670;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    public static int[] field2672;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lrc;")
    public static final class375 method1159(int arg0) {
        field2668++;
        class375 var1 = (class375) class227.field3233.method2452(arg0 - 11953);
        if (arg0 != 11849) {
            field2670 = null;
        }
        if (var1 == null) {
            return new class375();
        } else {
            class272.field3758--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
    public final int method1160(int arg0) {
        field2664++;
        int var2 = -100 % ((arg0 - 71) / 55);
        return (this.field2660 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(DI)V")
    public static final void method1161(double arg0, int arg1) {
        if (class493.field7198 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class10.field149[var3] = var4 <= 255 ? var4 : 255;
            }
            class493.field7198 = arg0;
        }
        field2669++;
        if (arg1 != 7) {
            field2659 = false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
    public final int method1162(int arg0) {
        if (arg0 != -20677) {
            field2670 = null;
        }
        field2662++;
        return this.field2660 & 0x7;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method1163(int arg0) {
        if (arg0 == 13) {
            field2672 = null;
            field2670 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class181() {
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1164(int arg0, long arg1) {
        class11.field168.setTime(new Date(arg1));
        field2673++;
        int var3 = class11.field168.get(7);
        int var4 = class11.field168.get(5);
        int var5 = class11.field168.get(2);
        int var6 = class11.field168.get(1);
        if (arg0 != -27288) {
            method1161(-1.2061812853452771D, -88);
        }
        int var7 = class11.field168.get(11);
        int var8 = class11.field168.get(12);
        int var9 = class11.field168.get(13);
        return class506.field7455[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class18.field236[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lsi;)V")
    public class181(class391 arg0) {
        this.field2660 = arg0.method2337(-1);
        this.field2661 = arg0.method2353((byte) 114);
        this.field2666 = arg0.method2361((byte) -56);
        this.field2667 = arg0.method2361((byte) -56);
        this.field2663 = arg0.method2361((byte) -56);
        this.field2665 = arg0.method2361((byte) -56);
    }

    static {
        new class466("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field2670 = new class357("LOCAL", 4);
        field2672 = new int[14];
    }
}
