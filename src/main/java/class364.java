import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class364 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lfaa;")
    public class424 field4702 = new class424();

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field4697 = -1;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field4701 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lfaa;")
    private class424 field4710;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[Lmc;")
    public static class318[] field4700;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lfaa;")
    public final class424 method2081(int arg0) {
        field4706++;
        class424 var2 = this.field4702.field5497;
        if (this.field4702 == var2) {
            this.field4710 = null;
            return null;
        } else {
            this.field4710 = var2.field5497;
            int var3 = -14 / ((arg0 + 77) / 44);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLfaa;)V")
    public final void method2082(byte arg0, class424 arg1) {
        field4699++;
        if (arg1.field5497 != null) {
            arg1.method2438((byte) -64);
        }
        arg1.field5500 = this.field4702.field5500;
        arg1.field5497 = this.field4702;
        arg1.field5497.field5500 = arg1;
        arg1.field5500.field5497 = arg1;
        if (arg0 > -104) {
            field4697 = -112;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
    public static final void method2083(Color arg0, int arg1, Color arg2, Color arg3, int arg4, String arg5) {
        try {
            Graphics var6 = class524.field6827.getGraphics();
            if (class660.field9200 == null) {
                class660.field9200 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class415.field5335 == null) {
                    class415.field5335 = class524.field6827.createImage(class519.field6796, class461.field6047);
                }
                Graphics var7 = class415.field5335.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class519.field6796, class461.field6047);
                int var8 = class519.field6796 / 2 - 152;
                int var9 = class461.field6047 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var8 + 2, arg1 + var9, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 - -2, 300 - (arg4 * 3), 30);
                var7.setFont(class660.field9200);
                var7.setColor(arg2);
                var7.drawString(arg5, var8 + (304 - (arg5.length() * 6)) / 2, var9 + 22);
                if (class302.field3922 != null) {
                    var7.setFont(class660.field9200);
                    var7.setColor(arg2);
                    var7.drawString(class302.field3922, class519.field6796 / 2 - (class302.field3922.length() * 6 / 2), class461.field6047 / 2 + -26);
                }
                var6.drawImage(class415.field5335, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class519.field6796, class461.field6047);
                int var10 = class519.field6796 / 2 - 152;
                int var11 = class461.field6047 / 2 - 18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg4 * 3 + var10 + 2, var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class660.field9200);
                var6.setColor(arg2);
                if (class302.field3922 != null) {
                    var6.setFont(class660.field9200);
                    var6.setColor(arg2);
                    var6.drawString(class302.field3922, class519.field6796 / 2 - (class302.field3922.length() * 6 / 2), class461.field6047 / 2 + -26);
                }
                var6.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class524.field6827.repaint();
        }
        field4698++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILki;)V")
    public final void method2084(int arg0, class364 arg1) {
        this.method2091(this.field4702.field5500, 3741, arg1);
        field4703++;
        if (arg0 != 28957) {
            this.method2091(null, -86, null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        while (true) {
            class424 var2 = this.field4702.field5500;
            if (this.field4702 == var2) {
                if (arg0 != 9) {
                    return;
                }
                field4707++;
                this.field4710 = null;
                return;
            }
            var2.method2438((byte) -79);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)Lfaa;")
    public final class424 method2086(byte arg0) {
        field4709++;
        class424 var2 = this.field4710;
        if (this.field4702 == var2) {
            this.field4710 = null;
            return null;
        } else {
            this.field4710 = var2.field5497;
            return arg0 == 106 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfaa;I)V")
    public final void method2087(class424 arg0, int arg1) {
        if (arg0.field5497 != null) {
            arg0.method2438((byte) -100);
        }
        field4705++;
        arg0.field5500 = this.field4702;
        arg0.field5497 = this.field4702.field5497;
        arg0.field5497.field5500 = arg0;
        int var3 = 27 / ((arg1 + 51) / 52);
        arg0.field5500.field5497 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lfaa;")
    public final class424 method2088(int arg0) {
        field4693++;
        class424 var2 = this.field4710;
        if (arg0 != -152) {
            return null;
        } else if (this.field4702 == var2) {
            this.field4710 = null;
            return null;
        } else {
            this.field4710 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static void method2089(byte arg0) {
        field4700 = null;
        if (arg0 <= 41) {
            field4697 = -9;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Lfaa;")
    public final class424 method2090(boolean arg0) {
        field4704++;
        if (!arg0) {
            this.method2088(55);
        }
        class424 var2 = this.field4702.field5500;
        if (this.field4702 == var2) {
            this.field4710 = null;
            return null;
        } else {
            this.field4710 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfaa;ILki;)V")
    private final void method2091(class424 arg0, int arg1, class364 arg2) {
        field4695++;
        class424 var4 = this.field4702.field5497;
        if (arg1 != 3741) {
            field4700 = null;
        }
        this.field4702.field5497 = arg0.field5497;
        arg0.field5497.field5500 = this.field4702;
        if (this.field4702 != arg0) {
            arg0.field5497 = arg2.field4702.field5497;
            arg0.field5497.field5500 = arg0;
            arg2.field4702.field5497 = var4;
            var4.field5500 = arg2.field4702;
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)Lfaa;")
    public final class424 method2092(byte arg0) {
        field4708++;
        if (arg0 != 92) {
            return null;
        }
        class424 var2 = this.field4702.field5500;
        if (this.field4702 == var2) {
            return null;
        } else {
            var2.method2438((byte) -114);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
    public final boolean method2093(int arg0) {
        field4696++;
        if (arg0 == -2) {
            return this.field4702.field5500 == this.field4702;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)I")
    public final int method2094(byte arg0) {
        if (arg0 >= -18) {
            return -122;
        }
        field4694++;
        int var2 = 0;
        for (class424 var3 = this.field4702.field5500; var3 != this.field4702; var3 = var3.field5500) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class364() {
        this.field4702.field5500 = this.field4702;
        this.field4702.field5497 = this.field4702;
    }
}
