import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public abstract class class14 {

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lt;")
    public static class36 field173 = class3.method8(13631, "Loading");

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lt;")
    public static class36 field170 = class3.method8(13631, "Hair Dressers");

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lda;")
    public static class7 field174;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "[I")
    public static int[] field171;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B[Lt;II)Lt;", line = 13)
    public static final class36 method78(byte arg0, class36[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = mapview.field357;
            }
            var4 += arg1[arg3 + var5].field492;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 0;
        if (arg0 != 100) {
            field172 = -55;
        }
        while (arg2 > var8) {
            class36 var9 = arg1[arg3 + var8];
            class16.method89(var9.field491, 0, var6, var7, var9.field492);
            var7 += var9.field492;
            var8++;
        }
        class36 var10 = new class36();
        var10.field492 = var4;
        var10.field491 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 64)
    public static void method79(int arg0) {
        field174 = null;
        field173 = null;
        field171 = null;
        field170 = null;
        if (arg0 != -1) {
            method79(-106);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 84)
    public static final void method81(byte arg0) {
        if (class6.field63 != null) {
            class29 var1 = class6.field63;
            synchronized (class6.field63) {
                class6.field63 = null;
            }
        }
        if (arg0 != -65) {
            field173 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 117)
    public static final int method82(int arg0, KeyEvent arg1) {
        if (arg0 != 0) {
            return -69;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lba;", line = 135)
    public static final class4 method83(Throwable arg0, String arg1) {
        class4 var2;
        if (arg0 instanceof class4) {
            var2 = (class4) arg0;
            var2.field34 = var2.field34 + ' ' + arg1;
        } else {
            var2 = new class4(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(Z)Ls;", line = 154)
    public static final class34 method84(boolean arg0) {
        if (arg0) {
            method78((byte) 112, null, -27, -105);
        }
        try {
            return (class34) Class.forName("ca").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class32();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method80(boolean arg0);

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[B)V")
    public abstract void method85(int arg0, byte[] arg1);
}
