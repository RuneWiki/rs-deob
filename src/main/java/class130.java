import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class130 extends class110 {

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    private int field2009 = 585;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lam;")
    public static class276 field2011 = null;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field2016 = 0;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Z")
    public static boolean field2017 = false;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Z")
    public static boolean field2019 = true;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 8)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I", line = 13)
    public static final int method965(byte arg0) {
        field2015++;
        if (class269.field4120) {
            return 0;
        } else if (class80.method540(13)) {
            if (arg0 != 120) {
                field2017 = true;
            }
            return client.field1945 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILre;I)V", line = 36)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 >= -37) {
            method965((byte) 100);
        }
        if (arg0 == 0) {
            this.field2009 = arg1.method1830((byte) -77);
        }
        field2014++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(CLjava/lang/String;B)I", line = 63)
    public static final int method966(char arg0, String arg1, byte arg2) {
        int var3 = 0;
        field2012++;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        if (arg2 != -22) {
            method966('\u000e', (String) null, (byte) 114);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V", line = 90)
    public static void method967(int arg0) {
        field2011 = null;
        if (arg0 != 1328) {
            field2011 = (class276) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lgl;BLjava/awt/Frame;)V", line = 118)
    public static final void method968(class262 arg0, byte arg1, Frame arg2) {
        field2010++;
        while (true) {
            class227 var3 = arg0.method1783((byte) 114, arg2);
            while (var3.field3456 == 0) {
                class93.method662(-553, 10L);
            }
            if (var3.field3456 == 1) {
                if (arg1 <= 86) {
                    method966((char) 65477, (String) null, (byte) 87);
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class93.method662(-553, 100L);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I", line = 143)
    public final int[] method46(int arg0, int arg1) {
        field2013++;
        if (arg0 != 1) {
            method966('+', (String) null, (byte) -5);
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1];
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                int var6 = class249.field3714[var5];
                if (this.field2009 < var6 && var6 < 4096 - this.field2009 && var4 > 2048 - this.field2009 && var4 < (this.field2009 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2009);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field2009) && this.field2009 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2009;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2009);
                } else if (this.field2009 > var4 || (4096 - this.field2009) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2009;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2009);
                } else if (var6 >= this.field2009 && var6 <= 4096 - this.field2009) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2009);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
