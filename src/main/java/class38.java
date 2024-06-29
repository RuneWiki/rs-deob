import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "Lga;")
    public class279 field524;

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "Lqd;")
    public static class315 field514 = new class315("", 16);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "Lel;")
    public static class386 field525;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "Lpc;")
    public static class477 field512;

    static {
        new class234("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field525 = new class386(0, -1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V", line = 19)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field516++;
        this.method293(arg1, arg4, arg3, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V", line = 27)
    public final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -33 % ((arg2 + 58) / 38);
        field526++;
        this.method369(arg3, arg0, arg1, arg4, 1);
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIZ)V", line = 37)
    public final void method278(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field512 = null;
        }
        this.method304(arg0, arg3, arg1, arg2, 1);
        field515++;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 56)
    public static final String method286(String arg0, boolean arg1) {
        field519++;
        if (!arg1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (var2 < var3 && class110.method840(arg0.charAt(var2), arg1)) {
                var2++;
            }
            while (var3 > var2 && class110.method840(arg0.charAt(var3 - 1), true)) {
                var3--;
            }
            int var4 = var3 - var2;
            if (var4 < 1 || var4 > 12) {
                return null;
            }
            StringBuffer var5 = new StringBuffer(var4);
            for (int var6 = var2; var6 < var3; var6++) {
                char var7 = arg0.charAt(var6);
                if (class487.method2908(var7, true)) {
                    char var8 = class178.method1194(var7, -113);
                    if (var8 != '\u0000') {
                        var5.append(var8);
                    }
                }
            }
            if (var5.length() == 0) {
                return null;
            } else {
                return var5.toString();
            }
        }
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V", line = 114)
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method336(arg0, arg2, arg3, arg4, 1);
        int var6 = -3 % ((arg1 - 67) / 53);
        field521++;
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 131)
    protected void finalize() {
        field517++;
        this.method305(-26760);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lga;ILod;Ljava/awt/Canvas;BI)Lya;", line = 151)
    public static final synchronized class38 method303(class279 arg0, int arg1, class352 arg2, Canvas arg3, byte arg4, int arg5) {
        field513++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class417.field6215[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        if (arg4 <= 22) {
            method332((byte) -43);
        }
        class38 var9;
        if (arg1 == 0) {
            var9 = class497.method2949(var6, -51, arg3, arg0);
        } else if (arg1 == 1) {
            var9 = class37.method261(arg5, var6, arg3, -1068698993, arg0, arg2);
        } else if (arg1 == 2) {
            var9 = class75.method646(arg2, 0, arg3, arg0, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class417.field6215[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V", line = 197)
    public final void method305(int arg0) {
        field523++;
        class417.field6215[this.field510] = false;
        if (arg0 == -26760) {
            this.method349();
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)[B", line = 218)
    public static final byte[] method312(int arg0, int arg1) {
        field511++;
        int var2 = 16 % ((53 - arg0) / 38);
        class204 var3 = (class204) class69.field943.method232(false, (long) arg1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class477.method2873(var5, -127, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class204(var4);
            class69.field943.method231(var3, (long) arg1, -100);
        }
        return var3.field3376;
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V", line = 269)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 10823) {
            field512 = null;
        }
        field518++;
        this.method352(arg2, arg1, arg5, arg3, arg4, 1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V", line = 304)
    public static final void method332(byte arg0) {
        field520++;
        if (arg0 >= -37) {
            method312(21, -27);
        }
        if (class66.field861 != null) {
            class66.field861.method305(-26760);
            class66.field861 = null;
            class216.field3509 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "(I)V", line = 367)
    public static void method363(int arg0) {
        field512 = null;
        if (arg0 == 1) {
            field514 = null;
            field525 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "(IIIIII)V", line = 379)
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field522++;
        this.method284(arg4, arg0, arg3, arg5, arg2, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILga;)V", line = 389)
    public class38(int arg0, class279 arg1) {
        this.field510 = arg0;
        this.field524 = arg1;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method264(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILma;II)V")
    public abstract void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
    public abstract void method267();

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
    public abstract void method268(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Ll;")
    public abstract class16 method269(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILma;II)V")
    public abstract void method270(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
    public abstract void method271(float arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method272(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lc;[Lju;I)V")
    public abstract void method273(class475[] arg0, class125 arg1, class83[] arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method274(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
    public abstract float method275();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lkp;Lc;[Lju;I)V")
    public abstract void method279(class475[] arg0, class341 arg1, class125 arg2, class83[] arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
    public abstract int[] method280(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lu;)V")
    public abstract void method281(class54 arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
    public abstract void method282(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "()Z")
    public abstract boolean method283();

    @OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
    public abstract void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
    public abstract void method287(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
    public abstract void method289(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "()Lc;")
    public abstract class125 method291();

    @OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
    public abstract void method292(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
    public abstract void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method294(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
    public abstract boolean method295();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lc;")
    public abstract class125 method296();

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "()V")
    public abstract void method297();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)Lpc;")
    public abstract class477 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
    public abstract int method299();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method300(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "()I")
    public abstract int method301();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
    public abstract void method302(int arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
    public abstract void method304(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "()V")
    public abstract void method306();

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
    public abstract boolean method307();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
    public abstract int method308();

    @OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
    public abstract boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lt;Lkp;Lc;Lju;I)V")
    public abstract void method311(class475 arg0, class341 arg1, class125 arg2, class83 arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
    public abstract int method314(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
    public abstract int method315();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(II)I")
    public abstract int method317(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
    public abstract void method318(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
    public abstract void method320();

    @OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
    public abstract void method321(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lqp;")
    public abstract class470 method322(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
    public abstract boolean method323();

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
    public abstract void method324(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lma;")
    public abstract class10 method325(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "()Z")
    public abstract boolean method327();

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
    public abstract boolean method328();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
    public abstract void method329(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ltp;IIII)Lt;")
    public abstract class475 method330(class374 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
    public abstract void method331();

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
    public abstract boolean method333();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)V")
    public abstract void method334(int arg0);

    @OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
    public abstract float method335();

    @OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
    public abstract void method336(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)Lu;")
    public abstract class54 method337(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lpc;Lpc;FLpc;)Lpc;")
    public abstract class477 method338(class477 arg0, class477 arg1, float arg2, class477 arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
    public abstract void method339(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
    public abstract boolean method340();

    @OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
    public abstract int method341();

    @OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
    public abstract void method342(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public abstract void method343();

    @OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
    public abstract void method344(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ldi;Z)Ll;")
    public abstract class16 method345(class84 arg0, boolean arg1);

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
    public abstract boolean method346();

    @OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
    public abstract boolean method347();

    @OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
    public abstract boolean method348();

    @OriginalMember(owner = "client!ya", name = "v", descriptor = "()V")
    public abstract void method349();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Ll;")
    public abstract class16 method350(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
    public abstract void method351(int[] arg0);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(IIIIII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
    public abstract int method353();

    @OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
    public abstract boolean method354();

    @OriginalMember(owner = "client!ya", name = "y", descriptor = "()Z")
    public abstract boolean method355();

    @OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
    public abstract void method356(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "z", descriptor = "()V")
    public abstract void method357();

    @OriginalMember(owner = "client!ya", name = "A", descriptor = "()Z")
    public abstract boolean method358();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lqp;)V")
    public abstract void method359(int arg0, class470[] arg1);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public abstract class145 method361(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lc;)V")
    public abstract void method362(class125 arg0);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
    public abstract void method365(float arg0, float arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Llm;[Ldi;Z)Lla;")
    public abstract class317 method366(class348 arg0, class84[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "()V")
    public abstract void method367();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lkp;)V")
    public abstract void method368(class341 arg0);

    @OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
    public abstract void method369(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lpc;)V")
    public abstract void method370(class477 arg0);

    @OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
    public abstract void method371(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
    public abstract boolean method372();
}
