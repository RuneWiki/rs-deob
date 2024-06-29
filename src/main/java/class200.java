import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class200 {

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lkv;")
    public class200 field2999;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Lm;")
    public class105 field2989;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field2996 = 0;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "[I")
    public static int[] field3004 = new int[2];

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3001 = 500;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "Lfo;")
    public static class22 field2995 = new class22(3, 7);

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public static void method1294(int arg0) {
        field3004 = null;
        if (arg0 < -1) {
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)Lto;")
    public final class216 method1295(int arg0) {
        if (arg0 == 17) {
            field3003++;
            return class482.method2924(this.field3005, arg0 ^ 0xFFFFA2EF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILcd;)V")
    public static final void method1296(int arg0, int arg1, class86 arg2) {
        field2990++;
        if (arg1 > -56) {
            field3001 = 118;
        }
        int var3 = -1;
        int var4 = 0;
        if (arg2.field1045 > class576.field8505) {
            class626.method3650(arg2, 64);
        } else if (class576.field8505 > arg2.field1004) {
            class155.method902(arg2, false, (byte) -1);
            var4 = class486.field7374;
            var3 = class343.field5015;
        } else {
            class106.method626(arg2, (byte) -100);
        }
        if (arg2.field3464 < 128 || arg2.field3463 < 128 || arg2.field3464 >= (class35.field399 - 1) * 128 || class382.field5586 * 128 - 128 <= arg2.field3463) {
            var3 = -1;
            arg2.field1035 = -1;
            arg2.field1024 = -1;
            arg2.field1082 = -1;
            arg2.field1045 = 0;
            arg2.field1004 = 0;
            var4 = 0;
            arg2.field3464 = arg2.field1090[0] * 128 + (arg2.method514(0) * 64);
            arg2.field3463 = arg2.field1089[0] * 128 + (arg2.method514(0) * 64);
            arg2.method510(0);
        }
        if (class239.field3493 == arg2 && (arg2.field3464 < 1536 || arg2.field3463 < 1536 || arg2.field3464 >= class35.field399 * 128 - 1536 || arg2.field3463 >= (class382.field5586 * 128 - 1536))) {
            arg2.field1082 = -1;
            arg2.field1024 = -1;
            arg2.field1045 = 0;
            arg2.field1035 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field1004 = 0;
            arg2.field3464 = arg2.field1090[0] * 128 + (arg2.method514(0) * 64);
            arg2.field3463 = arg2.field1089[0] * 128 + (arg2.method514(0) * 64);
            arg2.method510(0);
        }
        int var5 = class465.method2757(arg2, (byte) 5);
        class488.method2958(var4, var5, 0, var3, arg2);
        class436.method2678(arg2, 119);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1297(int arg0, int arg1, byte arg2) {
        field2998++;
        if (arg2 == -27) {
            return (arg1 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lkv;")
    public final class200 method1298(int arg0, int arg1) {
        if (arg1 < 3) {
            field3004 = null;
        }
        field2992++;
        return new class200(this.field3005, arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lhca;I)V")
    public static final void method1299(class179 arg0, int arg1) {
        field2997++;
        class434 var2 = (class434) class426.field6077.method1333((long) arg0.field1053, false);
        if (var2 == null) {
            class118.method727(arg0.field1089[0], arg0, (byte) 67, 0, null, arg0.field3457, arg0.field1090[0], null);
        } else {
            var2.method2648(-7869);
        }
        if (arg1 != 128) {
            field3001 = -75;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZLjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;)V")
    public static final void method1300(int arg0, boolean arg1, String arg2, Color arg3, int arg4, Color arg5, Color arg6) {
        try {
            Graphics var7 = class110.field1401.getGraphics();
            if (class326.field4829 == null) {
                class326.field4829 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class522.field7735, class337.field4944);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(255, 255, 255);
            }
            try {
                if (class225.field3320 == null) {
                    class225.field3320 = class110.field1401.createImage(304, 34);
                }
                Graphics var8 = class225.field3320.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, arg0, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg4 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
                var8.setFont(class326.field4829);
                var8.setColor(arg6);
                var8.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
                var7.drawImage(class225.field3320, class522.field7735 / 2 - 152, class337.field4944 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class522.field7735 / 2 - 152;
                int var10 = class337.field4944 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var9 + 2, var10 + 2, 300 - arg4 * 3, 30);
                var7.setFont(class326.field4829);
                var7.setColor(arg6);
                var7.drawString(arg2, var9 + (304 - (arg2.length() * 6)) / 2, var10 + 22);
            }
            if (class496.field7472 != null) {
                var7.setFont(class326.field4829);
                var7.setColor(arg6);
                var7.drawString(class496.field7472, class522.field7735 / 2 - class496.field7472.length() * 6 / 2, class337.field4944 / 2 + -26);
            }
        } catch (Exception var12) {
            class110.field1401.repaint();
        }
        field2993++;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(II)V")
    public class200(int arg0, int arg1) {
        this.field3005 = arg0;
        this.field2991 = arg1;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lkv;I)V")
    public class200(class200 arg0, int arg1) {
        this.field2999 = arg0;
        this.field2991 = this.field2999.field2991 + arg1;
        this.field2989 = this.field2999.field2989;
        this.field3005 = this.field2999.field3005;
    }
}
