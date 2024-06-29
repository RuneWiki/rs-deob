import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class117 extends class97 {

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[Lgb;")
    public class38[] field2927;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field2926 = 0;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Lke;")
    public static class65 field2929 = class1.method17("Spiel)2Engine wird gestartet)3)3)3", -111);

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Lke;")
    public static class65 field2931 = class1.method17("Versteckt", -118);

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field2939 = -1;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lke;")
    public static class65 field2935 = class1.method17("@cya@", -128);

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lke;")
    private static class65 field2932 = class1.method17(" is already on your ignore list", -121);

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lke;")
    public static class65 field2933 = class1.method17("blinken2:", -124);

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "Z")
    public static boolean field2938 = false;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lke;")
    public static class65 field2936 = class1.method17("Wir vermuten ihr Spielkonto wurde gestohlen", -114);

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Z")
    public static boolean field2928 = true;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "Lke;")
    public static class65 field2944 = field2932;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lta;")
    public static class112 field2934;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Ljd;")
    public static class58 field2930;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)I", line = 6)
    public static int method950(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method951(byte arg0, int arg1) {
        class99.method830(false, null, arg1, arg0 - 42, 0);
        field2943++;
        if (arg0 != -61) {
            method951((byte) -67, 21);
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z", line = 59)
    public static final boolean method952(int arg0) {
        field2940++;
        class101 var1 = class52.field1327;
        synchronized (class52.field1327) {
            if (class83.field2177 == class79.field2101) {
                return false;
            } else {
                class128.field3102 = class78.field2093[class83.field2177];
                class66.field1755 = class5.field100[class83.field2177];
                class83.field2177 = class83.field2177 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V", line = 121)
    public static void method953(byte arg0) {
        field2935 = null;
        field2933 = null;
        if (arg0 != 122) {
            return;
        }
        field2934 = null;
        field2944 = null;
        field2936 = null;
        field2930 = null;
        field2932 = null;
        field2931 = null;
        field2929 = null;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 140)
    public static final void method954(int arg0) {
        Object var1 = class46.field1218;
        synchronized (class46.field1218) {
            if (arg0 != 31) {
                method953((byte) 110);
            }
            if (class39.field1045 != 0) {
                class39.field1045 = 1;
                try {
                    class46.field1218.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field2942++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lke;ILjava/awt/Color;I)V", line = 161)
    public static final void method955(class65 arg0, int arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class10.field210.getGraphics();
            if (class88.field2346 == null) {
                class88.field2346 = new Font("Helvetica", 1, 13);
                class126.field3056 = class10.field210.getFontMetrics(class88.field2346);
            }
            if (class5.field90) {
                class5.field90 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class23.field566, class31.field818);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class80.field2125 == null) {
                    class80.field2125 = class10.field210.createImage(304, 34);
                }
                Graphics var5 = class80.field2125.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                if (arg1 < 8) {
                    method952(49);
                }
                var5.setFont(class88.field2346);
                var5.setColor(Color.white);
                arg0.method538((304 - arg0.method541((byte) 35, class126.field3056)) / 2, 82, 22, var5);
                var4.drawImage(class80.field2125, class23.field566 / 2 - 152, class31.field818 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class23.field566 / 2 - 152;
                int var7 = class31.field818 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class88.field2346);
                var4.setColor(Color.white);
                arg0.method538((304 - arg0.method541((byte) 35, class126.field3056)) / 2 + var6, -97, var7 + 22, var4);
            }
        } catch (Exception var9) {
            class10.field210.repaint();
        }
        field2941++;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)Z", line = 226)
    public final boolean method956(int arg0, int arg1) {
        if (arg1 != 303) {
            this.method956(-93, 60);
        }
        field2925++;
        return this.field2927[arg0].field964;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljd;Ljd;IZ)V", line = 256)
    public class117(class58 arg0, class58 arg1, int arg2, boolean arg3) {
        class53 var5 = new class53();
        int var6 = arg0.method479((byte) 74, arg2);
        this.field2927 = new class38[var6];
        int[] var7 = arg0.method478(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class7 var9 = null;
            byte[] var10 = arg0.method477(arg2, (byte) 127, var7[var8]);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class7 var12 = (class7) var5.method421(1); var12 != null; var12 = (class7) var5.method428(22743)) {
                if (var12.field142 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method483(0, var11, (byte) 46);
                } else {
                    var13 = arg1.method483(var11, 0, (byte) 46);
                }
                var9 = new class7(var11, var13);
                var5.method425(var9, 16);
            }
            this.field2927[var7[var8]] = new class38(var10, var9);
        }
    }
}
