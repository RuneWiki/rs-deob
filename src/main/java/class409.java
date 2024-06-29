import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class409 {

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "B")
    public byte field6193 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "S")
    public short field6185;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "B")
    public byte field6182;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "B")
    public byte field6174;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "S")
    public short field6194;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field6199 = 1401;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lbi;")
    public static class104 field6202;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "Z")
    public static boolean field6204;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Llm;")
    public static class31 field6203;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "B")
    public byte field6177;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "B")
    public byte field6184;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "B")
    public byte field6190;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "B")
    public byte field6197;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lds;")
    public class12 field6176;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Lbb;")
    public static class149 field6200;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lpc;")
    public class192 field6175;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lor;")
    public class304 field6189;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lor;")
    public class304 field6192;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lce;")
    public class409 field6195;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lfv;")
    public class477 field6180;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lfv;")
    public class477 field6188;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ldm;")
    public class519 field6181;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lej;")
    public class528 field6186;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "S")
    public short field6179;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Z")
    public boolean field6187;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
    public boolean field6191;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Z")
    public boolean field6198;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lmn;I)V")
    public static final void method2610(class162 arg0, int arg1) {
        class471.field7197 = arg0;
        if (arg1 != 8288) {
            field6203 = null;
        }
        field6173++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lfv;")
    public static final class477 method2611(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6180;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method2612(byte arg0) {
        field6178++;
        while (this.field6175 != null) {
            class192 var2 = this.field6175.field2841;
            this.field6175.method1202(-26392);
            this.field6175 = var2;
        }
        this.field6193 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
    public class409(int arg0, int arg1, int arg2) {
        this.field6185 = (short) arg1;
        this.field6174 = this.field6182 = (byte) arg0;
        this.field6194 = (short) arg2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        if (arg0 != 9) {
            field6199 = 125;
        }
        field6203 = null;
        field6202 = null;
        field6200 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
    public static final boolean method2614(int arg0, int arg1) {
        field6183++;
        int var2 = -75 / ((arg1 - 66) / 51);
        return arg0 == 0 || arg0 == 1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6196++;
        int var7 = arg4 + arg1;
        int var8 = arg2 - arg1;
        for (int var9 = arg4; var9 < var7; var9++) {
            class280.method1888(arg6, arg5, (byte) 82, class103.field1521[var9], arg0);
        }
        int var10 = arg5 - arg1;
        int var11 = arg1 + arg6;
        for (int var12 = arg2; var12 > var8; var12--) {
            class280.method1888(arg6, arg5, (byte) 82, class103.field1521[var12], arg0);
        }
        int var13 = var7;
        if (arg3 <= 24) {
            method2610(null, 97);
        }
        while (var8 >= var13) {
            int[] var14 = class103.field1521[var13];
            class280.method1888(arg6, var11, (byte) 82, var14, arg0);
            class280.method1888(var10, arg5, (byte) 82, var14, arg0);
            var13++;
        }
    }

    static {
        new class213("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6201 = 0;
        field6202 = new class104(2, 10);
        field6204 = false;
        field6203 = new class31(9, -1);
    }
}
