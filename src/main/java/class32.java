import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class32 extends class43 {

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "S")
    public short field363;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method210(byte arg0, int arg1, int arg2) {
        if (class138.field1579 != arg1) {
            class277.field3585 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class277.field3585[var3] = (var3 << 12) / arg1;
            }
            class138.field1579 = arg1;
            class12.field154 = arg1 * 32;
            class442.field6113 = arg1 - 1;
        }
        field360++;
        if (class250.field3286 != arg2) {
            if (class138.field1579 == arg2) {
                class249.field3283 = class277.field3585;
            } else {
                class249.field3283 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class249.field3283[var4] = (var4 << 12) / arg2;
                }
            }
            class210.field2551 = arg2 - 1;
            class250.field3286 = arg2;
        }
        if (arg0 == 62) {
            ;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lwo;B)V", line = 52)
    public static final void method211(class285 arg0, byte arg1) {
        class402.field5560 = arg0;
        if (arg1 == 39) {
            field364++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class264 var7 = new class264();
        var7.field3397 = arg1 >> 7;
        var7.field3382 = arg2 >> 7;
        var7.field3394 = arg3 >> 7;
        var7.field3396 = arg4 >> 7;
        var7.field3399 = arg0;
        var7.field3405 = arg1;
        var7.field3393 = arg2;
        var7.field3391 = arg3;
        var7.field3392 = arg4;
        var7.field3387 = arg5;
        var7.field3388 = arg6;
        class127.field1426[class264.field3402++] = var7;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 87)
    public static final void method213(int arg0) {
        if (arg0 != 24277) {
            return;
        }
        field362++;
        for (class186 var1 = (class186) class432.field5895.method1690((byte) -114); var1 != null; var1 = (class186) class432.field5895.method1699((byte) 29)) {
            if (var1.field2152 == -1) {
                var1.field2148 = 0;
                class212.method1295(0, var1);
            } else {
                var1.method263(false);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 111)
    public class32() {
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V", line = 115)
    public static final void method214(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field359++;
        long var6 = (long) (arg3 | (arg0 ? Integer.MIN_VALUE : 0));
        class391 var8 = (class391) class219.field2697.method2218(1, var6);
        if (var8 == null) {
            var8 = new class391();
            class219.field2697.method2227(var8, -8218, var6);
        }
        if (var8.field5330.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field5330.length; var11++) {
                var9[var11] = var8.field5330[var11];
                var10[var11] = var8.field5332[var11];
            }
            for (int var12 = var8.field5330.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5330 = var9;
            var8.field5332 = var10;
        }
        if (arg2 == -397439700) {
            var8.field5330[arg4] = arg1;
            var8.field5332[arg4] = arg5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(S)V", line = 167)
    public class32(short arg0) {
        this.field363 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZB)V", line = 175)
    public static final void method215(int arg0, Color arg1, Color arg2, Color arg3, String arg4, boolean arg5, byte arg6) {
        try {
            Graphics var7 = class357.field4845.getGraphics();
            if (class94.field1108 == null) {
                class94.field1108 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class39.field457, class28.field315);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class181.field2112 == null) {
                    class181.field2112 = class357.field4845.createImage(304, 34);
                }
                Graphics var8 = class181.field2112.getGraphics();
                var8.setColor(arg1);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var8.setFont(class94.field1108);
                if (arg6 <= 66) {
                    method213(118);
                }
                var8.setColor(arg3);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class181.field2112, class39.field457 / 2 - 152, class28.field315 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class39.field457 / 2 - 152;
                int var10 = class28.field315 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 - -2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg0 * 3 + (var9 + 2), var10 + 2, 300 - arg0 * 3, 30);
                var7.setFont(class94.field1108);
                var7.setColor(arg3);
                var7.drawString(arg4, (304 - (arg4.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class18.field199 != null) {
                var7.setFont(class94.field1108);
                var7.setColor(arg3);
                var7.drawString(class18.field199, class39.field457 / 2 - class18.field199.length() * 6 / 2, class28.field315 / 2 + -26);
            }
        } catch (Exception var12) {
            class357.field4845.repaint();
        }
        field361++;
    }
}
