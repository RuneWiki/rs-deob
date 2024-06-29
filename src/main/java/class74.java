import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class74 {

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Lhga;")
    private class158 field1515;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Z")
    public static boolean field1513 = false;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Lje;")
    public static class371 field1516 = new class371();

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Liga;")
    private class425 field1508;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "Z")
    public static boolean field1518;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)Liga;")
    public final class425 method795(byte arg0) {
        int var2 = -111 % ((arg0 + 32) / 44);
        field1519++;
        class425 var3 = this.field1515.field2700.field6134;
        if (this.field1515.field2700 == var3) {
            this.field1508 = null;
            return null;
        } else {
            this.field1508 = var3.field6134;
            return var3;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III[BIII[BI)V")
    public static final void method796(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (arg1 != -5504) {
            field1516 = null;
        }
        field1511++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg7[var10001] = (byte) (arg7[var10001] - arg3[arg4++]);
                int var14 = arg8++;
                arg7[var14] = (byte) (arg7[var14] - arg3[arg4++]);
                int var15 = arg8++;
                arg7[var15] = (byte) (arg7[var15] - arg3[arg4++]);
                int var16 = arg8++;
                arg7[var16] = (byte) (arg7[var16] - arg3[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg7[var10001] = (byte) (arg7[var10001] - arg3[arg4++]);
            }
            arg4 += arg0;
            arg8 += arg6;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Liga;")
    public final class425 method797(int arg0) {
        field1510++;
        class425 var2 = this.field1508;
        if (this.field1515.field2700 == var2) {
            this.field1508 = null;
            return null;
        } else if (arg0 == 303) {
            this.field1508 = var2.field6134;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILhga;)V")
    public final void method798(int arg0, class158 arg1) {
        field1509++;
        if (arg0 != -31950) {
            this.method797(-47);
        }
        this.field1515 = arg1;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
    public static final void method799(byte arg0, int arg1, Color arg2, Color arg3, Color arg4, String arg5) {
        field1514++;
        try {
            Graphics var6 = class699.field9853.getGraphics();
            if (class361.field5363 == null) {
                class361.field5363 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                int var7 = 103 / ((38 - arg0) / 63);
                if (class394.field5759 == null) {
                    class394.field5759 = class699.field9853.createImage(class506.field7173, class310.field4626);
                }
                Graphics var8 = class394.field5759.getGraphics();
                var8.setColor(Color.black);
                var8.fillRect(0, 0, class506.field7173, class310.field4626);
                int var9 = class506.field7173 / 2 - 152;
                int var10 = class310.field4626 / 2 - 18;
                var8.setColor(arg4);
                var8.drawRect(var9, var10, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(var9 + 2, var10 + 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(var9 + 1, var10 + 1, 301, 31);
                var8.fillRect(var9 + (arg1 * 3) + 2, var10 + 2, 300 - (arg1 * 3), 30);
                var8.setFont(class361.field5363);
                var8.setColor(arg2);
                var8.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var9, var10 + 22);
                if (class568.field8277 != null) {
                    var8.setFont(class361.field5363);
                    var8.setColor(arg2);
                    var8.drawString(class568.field8277, class506.field7173 / 2 - (class568.field8277.length() * 6 / 2), class310.field4626 / 2 - 26);
                }
                var6.drawImage(class394.field5759, 0, 0, null);
            } catch (Exception var13) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class506.field7173, class310.field4626);
                int var11 = class506.field7173 / 2 - 152;
                int var12 = class310.field4626 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var11, var12, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var11 + 2, var12 - -2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var11 + 1, var12 + 1, 301, 31);
                var6.fillRect(arg1 * 3 + var11 + 2, var12 - -2, 300 - (arg1 * 3), 30);
                var6.setFont(class361.field5363);
                var6.setColor(arg2);
                if (class568.field8277 != null) {
                    var6.setFont(class361.field5363);
                    var6.setColor(arg2);
                    var6.drawString(class568.field8277, class506.field7173 / 2 - class568.field8277.length() * 6 / 2, class310.field4626 / 2 + -26);
                }
                var6.drawString(arg5, var11 + ((304 - (arg5.length() * 6)) / 2), var12 + 22);
            }
        } catch (Exception var14) {
            class699.field9853.repaint();
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)V")
    public static final void method800(byte arg0, int arg1) {
        if (class486.field6950 == null || arg1 > class486.field6950.length) {
            class486.field6950 = new int[arg1];
        }
        int var2 = 6 % ((-arg0 - 44) / 61);
        field1512++;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
    public class74() {
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lhga;)V")
    public class74(class158 arg0) {
        this.field1515 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V")
    public static void method801(byte arg0) {
        int var1 = -65 % ((-arg0 - 8) / 40);
        field1516 = null;
    }
}
