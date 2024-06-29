import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class748 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public int field10374;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Ldw;")
    public static class748 field10378 = new class748(1);

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Ldw;")
    public static class748 field10380 = new class748(2);

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "Ldw;")
    public static class748 field10382 = new class748(4);

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "Ldw;")
    public static class748 field10384 = new class748(1);

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Ldw;")
    public static class748 field10385 = new class748(2);

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "Ldw;")
    public static class748 field10386 = new class748(4);

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Ldw;")
    public static class748 field10387 = new class748(2);

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "Ldw;")
    public static class748 field10388 = new class748(4);

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "Lhj;")
    public static class596 field10389 = new class596(28, 5);

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "Lqh;")
    public static class75 field10391;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method4175(int arg0) {
        field10386 = null;
        field10389 = null;
        field10388 = null;
        field10378 = null;
        field10391 = null;
        field10387 = null;
        field10385 = null;
        field10384 = null;
        field10382 = null;
        if (arg0 <= 112) {
            field10389 = null;
        }
        field10380 = null;
    }

    @OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10383++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
    public static final void method4176(byte arg0, int arg1) {
        int var2 = -87 / ((arg0 + 19) / 58);
        field10376++;
        class714 var3 = class350.method2072((long) arg1, 5, (byte) 127);
        var3.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILbt;I)Lso;")
    public static final class496 method4177(int arg0, int arg1, class48 arg2, int arg3) {
        if (arg3 != 4) {
            method4175(-10);
        }
        field10379++;
        byte[] var4 = arg2.method437(arg0, (byte) 115, arg1);
        return var4 == null ? null : new class496(var4);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILes;)Ldn;")
    public static final class543 method4178(int arg0, class403 arg1) {
        if (arg0 > -32) {
            method4175(67);
        }
        field10377++;
        return new class543(arg1.method2365(true), arg1.method2365(true), arg1.method2365(true), arg1.method2365(true), arg1.method2358(117), arg1.method2396((byte) 11));
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method4179(byte arg0, long arg1) {
        field10381++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class133.field1655[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            if (arg0 != -65) {
                method4179((byte) -110, 98L);
            }
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[B)Ltf;")
    public static final class312 method4180(int arg0, byte[] arg1) {
        field10375++;
        if (arg0 != 0) {
            method4176((byte) -9, -41);
        }
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class90.field1195);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class90.field1195);
                int var5 = var2.getHeight(class90.field1195);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class363.field4526.method623(var6, var5, 1, var4, var4, 0);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
    private class748(int arg0) {
        this.field10374 = arg0;
    }
}
