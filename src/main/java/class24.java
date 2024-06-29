import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Ld;")
    public static class7 field231 = class37.method242("Farming shop", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Ld;")
    public static class7 field227 = class37.method242("???", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Ld;")
    public static class7 field234 = class37.method242("Switch to ", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Ld;")
    public static class7 field228 = class37.method242("u_pass", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Ld;")
    public static class7 field233 = class37.method242("Fur Trader", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Ld;")
    public static class7 field229 = class37.method242("overlay)3dat", 1333943984);

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "[Lb;")
    public static class3[] field230;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method153(byte arg0) {
        class31 var1 = class8.field94;
        synchronized (class8.field94) {
            if (class37.field507 == class21.field212) {
                return false;
            }
            class29.field429 = class36.field498[class21.field212];
            mapview.field326 = class16.field171[class21.field212];
            if (arg0 < 115) {
                return false;
            } else {
                class21.field212 = class21.field212 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(B)V", line = 34)
    public static void method154(byte arg0) {
        field231 = null;
        field227 = null;
        field230 = null;
        int var1 = -5 % ((41 - arg0) / 42);
        field233 = null;
        field234 = null;
        field228 = null;
        field229 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 68)
    public static final void method155(Component arg0, int arg1) {
        arg0.addMouseListener(class36.field494);
        arg0.addMouseMotionListener(class36.field494);
        arg0.addFocusListener(class36.field494);
        if (arg1 != -27731) {
            field227 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(B)[Lj;", line = 99)
    public static final class18[] method156(byte arg0) {
        int var1 = -76 / ((arg0 + 41) / 54);
        class18[] var2 = new class18[class36.field502];
        for (int var3 = 0; var3 < class36.field502; var3++) {
            class18 var4 = var2[var3] = new class18();
            var4.field185 = class11.field117[var3];
            var4.field183 = class7.field81[var3];
            var4.field184 = class32.field467[var3];
            var4.field187 = class14.field139[var3];
            int var5 = var4.field187 * var4.field184;
            byte[] var6 = class4.field56[var3];
            var4.field186 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field186[var7] = class25.field242[class21.method148(var6[var7], 255)];
            }
        }
        class31.method216(30);
        return var2;
    }

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(B)J", line = 145)
    public static final synchronized long method157(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -117) {
            field229 = null;
        }
        if (class29.field433 > var1) {
            class3.field31 += class29.field433 - var1;
        }
        class29.field433 = var1;
        return class3.field31 + var1;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lda;", line = 180)
    public static final class8 method158(Throwable arg0, String arg1) {
        class8 var2;
        if (arg0 instanceof class8) {
            var2 = (class8) arg0;
            var2.field92 = var2.field92 + ' ' + arg1;
        } else {
            var2 = new class8(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ZLjava/lang/String;)Ld;", line = 197)
    public static final class7 method159(boolean arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class7 var4 = new class7();
        var4.field79 = var2;
        var4.field90 = 0;
        if (!arg0) {
            field233 = null;
        }
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field90++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(Ljava/awt/Component;I)V", line = 236)
    public static final void method160(Component arg0, int arg1) {
        arg0.removeMouseListener(class36.field494);
        if (arg1 != 0) {
            field228 = null;
        }
        arg0.removeMouseMotionListener(class36.field494);
        arg0.removeFocusListener(class36.field494);
    }
}
